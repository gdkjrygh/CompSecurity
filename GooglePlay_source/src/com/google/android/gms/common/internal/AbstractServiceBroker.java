// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.permission.PermissionUtils;
import com.google.android.gms.common.util.ArraySet;
import com.google.android.gms.common.util.ScopeUtil;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            PermissionCheckPreProcessor, SidewinderPreProcessor, LoggingPostProcessor, GetServiceRequest, 
//            BinderWrapper, Preconditions, GetServicePreProcessor, GmsCallbacksWrapper, 
//            IGmsCallbacks, ValidateAccountRequest

public abstract class AbstractServiceBroker extends IGmsServiceBroker.Stub
{

    public final Context mContext;
    protected final List mPostProcessors = new LinkedList();
    protected final List mPreProcessors = new LinkedList();
    protected final Set mServiceIds = new ArraySet(1);

    public transient AbstractServiceBroker(Context context)
    {
        mContext = context;
        mServiceIds.add(Integer.valueOf(1));
        mPreProcessors.add(new PermissionCheckPreProcessor(mContext, getRequiredPermissionGroups()));
        mPreProcessors.add(new SidewinderPreProcessor(mContext));
        mPostProcessors.add(new LoggingPostProcessor(mContext));
    }

    private void getServiceWithAccount(int i, IGmsCallbacks igmscallbacks, int j, String s, Bundle bundle, String s1, String as[])
        throws RemoteException
    {
        GetServiceRequest getservicerequest;
        if (TextUtils.isEmpty(s1))
        {
            s1 = null;
        } else
        {
            s1 = new Account(s1, "com.google");
        }
        getservicerequest = new GetServiceRequest(i);
        getservicerequest.clientVersion = j;
        getservicerequest.callingPackage = s;
        getservicerequest.clientRequestedAccount = s1;
        s = bundle;
        if (bundle == null)
        {
            s = Bundle.EMPTY;
        }
        getservicerequest.extraArgs = s;
        if (as != null)
        {
            getservicerequest.setScopes(ScopeUtil.fromScopeString(as));
        }
        getService(igmscallbacks, getservicerequest);
    }

    private void getServiceWithCommonParams(int i, IGmsCallbacks igmscallbacks, int j, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithAccount(i, igmscallbacks, j, s, bundle, null, null);
    }

    public final void getAccountDataService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(9, igmscallbacks, i, s, bundle);
    }

    public final void getAdMobService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(8, igmscallbacks, i, s, bundle);
    }

    public final void getAddressService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        getServiceWithCommonParams(12, igmscallbacks, i, s, null);
    }

    public final void getAppDataSearchService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        getServiceWithCommonParams(21, igmscallbacks, i, s, null);
    }

    public final void getAppStateService(IGmsCallbacks igmscallbacks, int i, String s, String s1, String as[])
        throws RemoteException
    {
        getServiceWithAccount(7, igmscallbacks, i, s, null, s1, as);
    }

    public final void getAuthService_DEPRECATED()
        throws RemoteException
    {
        throw new IllegalArgumentException();
    }

    public final void getAutoBackupService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(31, igmscallbacks, i, s, bundle);
    }

    public final void getCarService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(13, igmscallbacks, i, s, bundle);
    }

    public final void getCastMirroringService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(27, igmscallbacks, i, s, bundle);
    }

    public final void getCastService(IGmsCallbacks igmscallbacks, int i, String s, IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        throw new IllegalArgumentException();
    }

    public final void getClearcutLoggerService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(40, igmscallbacks, i, s, bundle);
    }

    public final void getCloudSaveService(IGmsCallbacks igmscallbacks, int i, String s, String s1, String s2, String as[])
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        bundle.putString("workspace", s2);
        getServiceWithAccount(34, igmscallbacks, i, s, bundle, s1, as);
    }

    public final void getCommonService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        getServiceWithCommonParams(39, igmscallbacks, i, s, null);
    }

    public final void getDeviceConnectionService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        getServiceWithCommonParams(20, igmscallbacks, i, s, null);
    }

    public final void getDeviceManagerService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        getServiceWithCommonParams(37, igmscallbacks, i, s, null);
    }

    public final void getDriveService(IGmsCallbacks igmscallbacks, int i, String s, String as[], String s1, Bundle bundle)
        throws RemoteException
    {
        getServiceWithAccount(11, igmscallbacks, i, s, bundle, s1, as);
    }

    public final void getDroidGuardService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(25, igmscallbacks, i, s, bundle);
    }

    public final void getFeedbackService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(29, igmscallbacks, i, s, bundle);
    }

    public final void getFitnessService(IGmsCallbacks igmscallbacks, int i, String s, String s1, String as[], Bundle bundle)
        throws RemoteException
    {
        getServiceWithAccount(17, igmscallbacks, i, s, bundle, s1, as);
    }

    public final void getGamesService(IGmsCallbacks igmscallbacks, int i, String s, String s1, String as[], String s2, IBinder ibinder, 
            String s3, Bundle bundle)
        throws RemoteException
    {
        bundle.putString("com.google.android.gms.games.key.gamePackageName", s2);
        bundle.putString("com.google.android.gms.games.key.desiredLocale", s3);
        bundle.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(ibinder));
        getServiceWithAccount(1, igmscallbacks, i, s, bundle, s1, as);
    }

    public final void getGlobalSearchAdminService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        getServiceWithCommonParams(33, igmscallbacks, i, s, null);
    }

    public final void getGoogleLocationManagerService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(23, igmscallbacks, i, s, bundle);
    }

    public final void getIdentityService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(15, igmscallbacks, i, s, bundle);
    }

    public final void getKidsService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        getServiceWithCommonParams(42, igmscallbacks, i, s, null);
    }

    public final void getLightweightAppDataSearchService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        getServiceWithCommonParams(19, igmscallbacks, i, s, null);
    }

    public final void getLocationService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(6, igmscallbacks, i, s, bundle);
    }

    public final void getLockboxService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(26, igmscallbacks, i, s, bundle);
    }

    public final void getNetworkQualityService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(28, igmscallbacks, i, s, bundle);
    }

    public final void getPanoramaService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(3, igmscallbacks, i, s, bundle);
    }

    public final void getPeopleService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(5, igmscallbacks, i, s, bundle);
    }

    public final void getPlayLogService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(24, igmscallbacks, i, s, bundle);
    }

    public final void getPlusService(IGmsCallbacks igmscallbacks, int i, String s, String s1, String as[], String s2, Bundle bundle)
        throws RemoteException
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        bundle1.putString("auth_package", s1);
        getServiceWithAccount(2, igmscallbacks, i, s, bundle1, s2, as);
    }

    public final void getPseudonymousIdService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(38, igmscallbacks, i, s, bundle);
    }

    public final void getRemindersService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(18, igmscallbacks, i, s, bundle);
    }

    public final void getReportingService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(22, igmscallbacks, i, s, bundle);
    }

    public Set getRequiredPermissionGroups()
    {
        return PermissionUtils.getAllPermissionGroups();
    }

    public final void getSearchAdministrationService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        getServiceWithCommonParams(30, igmscallbacks, i, s, null);
    }

    public final void getSearchCorporaService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        getServiceWithCommonParams(36, igmscallbacks, i, s, null);
    }

    public final void getSearchQueriesService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        getServiceWithCommonParams(32, igmscallbacks, i, s, null);
    }

    public final void getService(IGmsCallbacks igmscallbacks, GetServiceRequest getservicerequest)
        throws RemoteException
    {
        Preconditions.checkArgument(mServiceIds.contains(Integer.valueOf(getservicerequest.serviceId)), (new StringBuilder("Unexpected service id: ")).append(getservicerequest.serviceId).toString());
        for (Iterator iterator = mPreProcessors.iterator(); iterator.hasNext();)
        {
            if (!((GetServicePreProcessor)iterator.next()).process(igmscallbacks, getservicerequest))
            {
                return;
            }
        }

        try
        {
            igmscallbacks = new GmsCallbacksWrapper(igmscallbacks, getservicerequest);
            List list = mPostProcessors;
            ((GmsCallbacksWrapper) (igmscallbacks)).postProcessorList.addAll(list);
            onGetService(igmscallbacks, getservicerequest);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IGmsCallbacks igmscallbacks)
        {
            Log.e("AbstractServiceBroker", "Getting service failed", igmscallbacks);
        }
        throw igmscallbacks;
    }

    public final void getUdcService(IGmsCallbacks igmscallbacks, int i, String s, String s1)
        throws RemoteException
    {
        getServiceWithAccount(35, igmscallbacks, i, s, null, s1, null);
    }

    public final void getUsageReportingService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        getServiceWithCommonParams(41, igmscallbacks, i, s, bundle);
    }

    public final void getWalletService(IGmsCallbacks igmscallbacks, int i)
        throws RemoteException
    {
        getWalletServiceWithPackage(igmscallbacks, i, null);
    }

    public final void getWalletServiceWithPackage(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        getServiceWithCommonParams(4, igmscallbacks, i, s, null);
    }

    public final void getWearableService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        getServiceWithCommonParams(14, igmscallbacks, i, s, null);
    }

    public abstract void onGetService(IGmsCallbacks igmscallbacks, GetServiceRequest getservicerequest)
        throws RemoteException;

    public final void validateAccount(IGmsCallbacks igmscallbacks, ValidateAccountRequest validateaccountrequest)
        throws RemoteException
    {
        try
        {
            igmscallbacks.onAccountValidationComplete(0, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IGmsCallbacks igmscallbacks)
        {
            Log.e("AbstractServiceBroker", "Validating account failed", igmscallbacks);
        }
        throw igmscallbacks;
    }
}
