// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.people.internal.agg.PeopleAggregator;
import com.google.android.gms.people.model.CircleBuffer;
import com.google.android.gms.people.model.OwnerBuffer;
import com.google.android.gms.people.model.PersonBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.people.internal:
//            PeopleClientFifeImageUrlDecompressor, IPeopleService, PeopleServiceLog, AbstractPeopleCallbacks

public final class PeopleClientImpl extends GmsClient
{
    private static final class CirclesLoadedResult
        implements com.google.android.gms.people.Graph.LoadCirclesResult
    {

        private final CircleBuffer mCircles;
        private final Status mStatus;

        public final CircleBuffer getCircles()
        {
            return mCircles;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        public final void release()
        {
            if (mCircles != null)
            {
                mCircles.release();
            }
        }

        public CirclesLoadedResult(Status status, CircleBuffer circlebuffer)
        {
            mStatus = status;
            mCircles = circlebuffer;
        }
    }

    private static final class DataChangedNotifier
        implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    {

        private final String mAccount;
        private final String mPageId;
        private final int mScopes;

        public final volatile void notifyListener(Object obj)
        {
        }

        public final void onNotifyListenerFailed()
        {
        }

        public DataChangedNotifier(String s, String s1, int i)
        {
            mAccount = s;
            mPageId = s1;
            mScopes = i;
        }
    }

    private static final class OnAddPeopleToCircleFinishedBinderCallback extends AbstractPeopleCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mListener;

        public final void onBundleLoaded(int i, Bundle bundle, Bundle bundle1)
        {
            Object obj = null;
            if (PeopleServiceLog.canLog(3))
            {
                PeopleServiceLog.d("PeopleClient", (new StringBuilder("Bundle callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nbundle=").append(bundle1).toString());
            }
            Status status = PeopleClientImpl.access$000$3fda7968(i, bundle);
            String s;
            if (bundle1 == null)
            {
                bundle = null;
            } else
            {
                bundle = bundle1.getString("circle_id");
            }
            if (bundle1 == null)
            {
                s = null;
            } else
            {
                s = bundle1.getString("circle_name");
            }
            if (bundle1 == null)
            {
                bundle1 = obj;
            } else
            {
                bundle1 = bundle1.getStringArray("added_people");
            }
            mListener.setResult(new OnAddPeopleToCircleFinishedResult(status, bundle, s, bundle1));
        }

        public OnAddPeopleToCircleFinishedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mListener = resultholder;
        }
    }

    private static final class OnAddPeopleToCircleFinishedResult
        implements com.google.android.gms.people.GraphUpdate.AddPeopleToCircleResult
    {

        private final String mAddedPeople[];
        private final String mCircleId;
        private final String mCircleName;
        private final Status mStatus;

        public final Status getStatus()
        {
            return mStatus;
        }

        public OnAddPeopleToCircleFinishedResult(Status status, String s, String s1, String as[])
        {
            mStatus = status;
            mCircleId = s;
            mCircleName = s1;
            mAddedPeople = as;
        }
    }

    private static final class OnCirclesLoadedBinderCallback extends AbstractPeopleCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mListener;

        public final void onDataHolderLoaded(int i, Bundle bundle, DataHolder dataholder)
        {
            if (PeopleServiceLog.canLog(3))
            {
                PeopleServiceLog.d("PeopleClient", (new StringBuilder("Circles callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nholder=").append(dataholder).toString());
            }
            Status status = PeopleClientImpl.access$000$3fda7968(i, bundle);
            if (dataholder == null)
            {
                bundle = null;
            } else
            {
                bundle = new CircleBuffer(dataholder);
            }
            mListener.setResult(new CirclesLoadedResult(status, bundle));
        }

        public OnCirclesLoadedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mListener = resultholder;
        }
    }

    private static final class OnDataChangedBinderCallback extends AbstractPeopleCallbacks
    {

        final ListenerHolder mHolder;

        public final void onBundleLoaded(int i, Bundle bundle, Bundle bundle1)
        {
            if (PeopleServiceLog.canLog(3))
            {
                PeopleServiceLog.d("PeopleClient", (new StringBuilder("Bundle callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nbundle=").append(bundle1).toString());
            }
            if (i != 0)
            {
                if (PeopleServiceLog.canLog(5))
                {
                    Log.w("PeopleClient", "Non-success data changed callback received.");
                }
                return;
            } else
            {
                mHolder.notifyListener(new DataChangedNotifier(bundle1.getString("account"), bundle1.getString("pagegaiaid"), bundle1.getInt("scope")));
                return;
            }
        }
    }

    private static final class OnOwnersLoadedBinderCallback extends AbstractPeopleCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mListener;

        public final void onDataHolderLoaded(int i, Bundle bundle, DataHolder dataholder)
        {
            if (PeopleServiceLog.canLog(3))
            {
                PeopleServiceLog.d("PeopleClient", (new StringBuilder("Owner callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nholder=").append(dataholder).toString());
            }
            Status status = PeopleClientImpl.access$000$3fda7968(i, bundle);
            if (dataholder == null)
            {
                bundle = null;
            } else
            {
                bundle = new OwnerBuffer(dataholder);
            }
            mListener.setResult(new OwnersLoadedResult(status, bundle));
        }

        public OnOwnersLoadedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mListener = resultholder;
        }
    }

    private static final class OnParcelFileDescriptorBinderCallback extends AbstractPeopleCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mListener;

        public final void onParcelFileDescriptorLoaded(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor, Bundle bundle1)
        {
            if (PeopleServiceLog.canLog(3))
            {
                PeopleServiceLog.d("PeopleClient", (new StringBuilder("Avatar callback: status=")).append(i).append(" resolution=").append(bundle).append(" pfd=").append(parcelfiledescriptor).toString());
            }
            bundle = PeopleClientImpl.access$000$3fda7968(i, bundle);
            boolean flag = false;
            i = 0;
            int j = 0;
            if (bundle1 != null)
            {
                flag = bundle1.getBoolean("rewindable");
                i = bundle1.getInt("width");
                j = bundle1.getInt("height");
            }
            mListener.setResult(new ParcelFileDescriptorLoadedResult(bundle, parcelfiledescriptor, flag, i, j));
        }

        public OnParcelFileDescriptorBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mListener = resultholder;
        }
    }

    private static final class OnPeopleLoadedBinderCallback extends AbstractPeopleCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mListener;

        public final void onDataHolderLoaded(int i, Bundle bundle, DataHolder dataholder)
        {
            if (PeopleServiceLog.canLog(3))
            {
                PeopleServiceLog.d("PeopleClient", (new StringBuilder("People callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nholder=").append(dataholder).toString());
            }
            bundle = PeopleClientImpl.access$000$3fda7968(i, bundle);
            dataholder = PeopleClientImpl.access$100(dataholder);
            mListener.setResult(new PeopleLoadedResult(bundle, dataholder));
        }

        public OnPeopleLoadedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mListener = resultholder;
        }
    }

    private static final class OnUpdatePersonCirclesFinishedBinderCallback extends AbstractPeopleCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mListener;

        public final void onBundleLoaded(int i, Bundle bundle, Bundle bundle1)
        {
            if (PeopleServiceLog.canLog(3))
            {
                PeopleServiceLog.d("PeopleClient", (new StringBuilder("Bundle callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nbundle=").append(bundle1).toString());
            }
            Status status = PeopleClientImpl.access$000$3fda7968(i, bundle);
            bundle = null;
            ArrayList arraylist = null;
            if (status.isSuccess())
            {
                bundle = bundle1.getStringArrayList("added_circles");
                arraylist = bundle1.getStringArrayList("removed_circles");
            }
            mListener.setResult(new OnUpdatePersonCirclesFinishedResult(status, bundle, arraylist));
        }

        public OnUpdatePersonCirclesFinishedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mListener = resultholder;
        }
    }

    private static final class OnUpdatePersonCirclesFinishedResult
        implements com.google.android.gms.people.GraphUpdate.UpdatePersonCircleResult
    {

        private final List mAddedCircles;
        private final List mRemovedCircles;
        private final Status mStatus;

        public final Status getStatus()
        {
            return mStatus;
        }

        public OnUpdatePersonCirclesFinishedResult(Status status, List list, List list1)
        {
            mStatus = status;
            mAddedCircles = list;
            mRemovedCircles = list1;
        }
    }

    private static final class OwnersLoadedResult
        implements com.google.android.gms.people.Graph.LoadOwnersResult
    {

        private final OwnerBuffer mOwners;
        private final Status mStatus;

        public final OwnerBuffer getOwners()
        {
            return mOwners;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        public final void release()
        {
            if (mOwners != null)
            {
                mOwners.release();
            }
        }

        public OwnersLoadedResult(Status status, OwnerBuffer ownerbuffer)
        {
            mStatus = status;
            mOwners = ownerbuffer;
        }
    }

    private static final class ParcelFileDescriptorLoadedResult
        implements com.google.android.gms.people.Images.LoadImageResult
    {

        private final int mHeight;
        private final ParcelFileDescriptor mPfd;
        private final boolean mRewindable;
        private final Status mStatus;
        private final int mWidth;

        public final int getHeight()
        {
            return mHeight;
        }

        public final ParcelFileDescriptor getParcelFileDescriptor()
        {
            return mPfd;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        public final int getWidth()
        {
            return mWidth;
        }

        public final void release()
        {
            if (mPfd != null)
            {
                IOUtils.closeQuietly(mPfd);
            }
        }

        public ParcelFileDescriptorLoadedResult(Status status, ParcelFileDescriptor parcelfiledescriptor, boolean flag, int i, int j)
        {
            mStatus = status;
            mPfd = parcelfiledescriptor;
            mRewindable = flag;
            mWidth = i;
            mHeight = j;
        }
    }

    private static final class PeopleLoadedResult
        implements com.google.android.gms.people.Graph.LoadPeopleResult
    {

        private final PersonBuffer mPeople;
        private final Status mStatus;

        public final PersonBuffer getPeople()
        {
            return mPeople;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        public final void release()
        {
            if (mPeople != null)
            {
                mPeople.release();
            }
        }

        public PeopleLoadedResult(Status status, PersonBuffer personbuffer)
        {
            mStatus = status;
            mPeople = personbuffer;
        }
    }


    private static volatile Bundle sEmailTypeMap;
    private static volatile Bundle sPhoneTypeMap;
    private Long mAutocompleteFeedbackAutoGeneratedSessionId;
    public final String mClientApplicationId;
    public final Context mContext;
    private final HashMap mDataChangedListeners = new HashMap();
    public final String mRealClientPackageName;

    public PeopleClientImpl(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, ClientSettings clientsettings)
    {
        super(context.getApplicationContext(), looper, 5, clientsettings, connectioncallbacks, onconnectionfailedlistener);
        mAutocompleteFeedbackAutoGeneratedSessionId = null;
        mContext = context;
        mClientApplicationId = s;
        mRealClientPackageName = clientsettings.mRealClientPackageName;
    }

    private void setConfiguration(Bundle bundle)
    {
        this;
        JVM INSTR monitorenter ;
        if (bundle != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        PeopleAggregator.setUseContactablesApi(bundle.getBoolean("use_contactables_api", true));
        PeopleClientFifeImageUrlDecompressor.INSTANCE.setPatterns(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
        sEmailTypeMap = bundle.getBundle("config.email_type_map");
        sPhoneTypeMap = bundle.getBundle("config.phone_type_map");
        if (true) goto _L1; else goto _L3
_L3:
        bundle;
        throw bundle;
    }

    public final void addPeopleToCircle(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, String s, String s1, String s2, List list)
    {
        super.checkConnected();
        resultholder = new OnAddPeopleToCircleFinishedBinderCallback(resultholder);
        try
        {
            ((IPeopleService)super.getService()).addPeopleToCircle(resultholder, s, s1, s2, list);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            resultholder.onBundleLoaded(8, null, null);
        }
    }

    protected final volatile IInterface createServiceInterface(IBinder ibinder)
    {
        return IPeopleService.Stub.asInterface(ibinder);
    }

    public final void disconnect()
    {
        HashMap hashmap = mDataChangedListeners;
        hashmap;
        JVM INSTR monitorenter ;
        Iterator iterator;
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_104;
        }
        iterator = mDataChangedListeners.values().iterator();
_L1:
        OnDataChangedBinderCallback ondatachangedbindercallback;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_104;
        }
        ondatachangedbindercallback = (OnDataChangedBinderCallback)iterator.next();
        ondatachangedbindercallback.mHolder.mListener = null;
        ((IPeopleService)super.getService()).registerDataChangedListener(ondatachangedbindercallback, false, null, null, 0);
          goto _L1
        Object obj;
        obj;
        PeopleServiceLog.w("PeopleClient", "Failed to unregister listener", ((Throwable) (obj)));
          goto _L1
        Exception exception;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        PeopleServiceLog.w("PeopleClient", "PeopleService is in unexpected state", ((Throwable) (obj)));
          goto _L1
        mDataChangedListeners.clear();
        hashmap;
        JVM INSTR monitorexit ;
        super.disconnect();
        return;
    }

    protected final Bundle getGetServiceRequestExtraArgs()
    {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", mClientApplicationId);
        bundle.putString("real_client_package_name", mRealClientPackageName);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    protected final String getServiceDescriptor()
    {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    protected final String getStartServiceAction()
    {
        return "com.google.android.gms.people.service.START";
    }

    public final void loadCircles(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, String s, String s1, String s2, int i, String s3, boolean flag)
    {
        super.checkConnected();
        resultholder = new OnCirclesLoadedBinderCallback(resultholder);
        try
        {
            ((IPeopleService)super.getService()).loadCircles(resultholder, s, s1, null, i, null, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            resultholder.onDataHolderLoaded(8, null, null);
        }
    }

    public final ICancelToken loadOwnerAvatar(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, String s, String s1, int i, int j)
    {
        resultholder = new OnParcelFileDescriptorBinderCallback(resultholder);
        try
        {
            s = ((IPeopleService)super.getService()).loadOwnerAvatar(resultholder, s, s1, i, j);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            resultholder.onParcelFileDescriptorLoaded(8, null, null, null);
            return null;
        }
        return s;
    }

    public final ICancelToken loadOwnerCoverPhoto$740bf995(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, String s, String s1)
    {
        resultholder = new OnParcelFileDescriptorBinderCallback(resultholder);
        try
        {
            s = ((IPeopleService)super.getService()).loadOwnerCoverPhoto(resultholder, s, s1, 0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            resultholder.onParcelFileDescriptorLoaded(8, null, null, null);
            return null;
        }
        return s;
    }

    public final void loadOwners$30345e6e(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, boolean flag, int i)
    {
        super.checkConnected();
        resultholder = new OnOwnersLoadedBinderCallback(resultholder);
        try
        {
            ((IPeopleService)super.getService()).loadOwners(resultholder, false, flag, null, null, 0);
            return;
        }
        catch (RemoteException remoteexception)
        {
            resultholder.onDataHolderLoaded(8, null, null);
        }
    }

    public final void loadPeople(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, String s, String s1, com.google.android.gms.people.Graph.LoadPeopleOptions loadpeopleoptions)
    {
        Collection collection;
        int i;
        int j;
        com.google.android.gms.people.Graph.LoadPeopleOptions loadpeopleoptions1 = loadpeopleoptions;
        if (loadpeopleoptions == null)
        {
            loadpeopleoptions1 = com.google.android.gms.people.Graph.LoadPeopleOptions.DEFAULT;
        }
        collection = loadpeopleoptions1.mQualifiedIds;
        i = loadpeopleoptions1.mProjection;
        j = loadpeopleoptions1.mSearchFields;
        super.checkConnected();
        loadpeopleoptions = new OnPeopleLoadedBinderCallback(resultholder);
        IPeopleService ipeopleservice = (IPeopleService)super.getService();
        if (collection != null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        resultholder = null;
_L1:
        try
        {
            ipeopleservice.loadPeople(loadpeopleoptions, s, s1, null, resultholder, i, false, 0L, null, j, 0, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            loadpeopleoptions.onDataHolderLoaded(8, null, null);
        }
        break MISSING_BLOCK_LABEL_111;
        resultholder = new ArrayList(collection);
          goto _L1
    }

    protected final void onPostInitHandler(int i, IBinder ibinder, Bundle bundle, int j)
    {
        if (i == 0 && bundle != null)
        {
            setConfiguration(bundle.getBundle("post_init_configuration"));
        }
        if (bundle == null)
        {
            bundle = null;
        } else
        {
            bundle = bundle.getBundle("post_init_resolution");
        }
        super.onPostInitHandler(i, ibinder, bundle, j);
    }

    public final void updatePersonCircles(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, String s, String s1, String s2, List list, List list1, FavaDiagnosticsEntity favadiagnosticsentity)
    {
        super.checkConnected();
        resultholder = new OnUpdatePersonCirclesFinishedBinderCallback(resultholder);
        try
        {
            ((IPeopleService)super.getService()).updatePersonCircles(resultholder, s, s1, s2, list, list1, favadiagnosticsentity);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            resultholder.onBundleLoaded(8, null, null);
        }
    }


/*
    static Status access$000$3fda7968(int i, Bundle bundle)
    {
        if (bundle == null)
        {
            bundle = null;
        } else
        {
            bundle = (PendingIntent)bundle.getParcelable("pendingIntent");
        }
        return new Status(i, null, bundle);
    }

*/


/*
    static PersonBuffer access$100(DataHolder dataholder)
    {
        if (dataholder == null)
        {
            return null;
        } else
        {
            return new PersonBuffer(dataholder, new com.google.android.gms.people.internal.agg.PhoneEmailDecoder.PhoneDecoder(sPhoneTypeMap), new com.google.android.gms.people.internal.agg.PhoneEmailDecoder.EmailDecoder(sEmailTypeMap));
        }
    }

*/
}
