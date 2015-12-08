// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.GoogleHelpApi;
import com.google.android.gms.googlehelp.Help;

// Referenced classes of package com.google.android.gms.googlehelp.internal.common:
//            GoogleHelpClientImpl, IGoogleHelpService, SimpleGoogleHelpCallbacks, TogglingData

public final class GoogleHelpApiImpl
    implements GoogleHelpApi
{
    static abstract class BaseGoogleHelpApiMethodImpl extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    {

        protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            client = (GoogleHelpClientImpl)client;
            android.content.Context context = ((GmsClient) (client)).mContext;
            doExecute$5d59a3cd((IGoogleHelpService)client.getService());
        }

        protected abstract void doExecute$5d59a3cd(IGoogleHelpService igooglehelpservice)
            throws RemoteException;

        public BaseGoogleHelpApiMethodImpl(GoogleApiClient googleapiclient)
        {
            super(Help.CLIENT_KEY, googleapiclient);
        }
    }

    static abstract class GoogleHelpImpl extends BaseGoogleHelpApiMethodImpl
    {

        protected final volatile Result createFailedResult(Status status)
        {
            return status;
        }

        public GoogleHelpImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    private static final Status RESULT_FAILURE = new Status(13);

    public GoogleHelpApiImpl()
    {
    }

    public final PendingResult startHelp(final GoogleApiClient final_googleapiclient, Activity activity, final Intent helpIntent)
    {
        return final_googleapiclient.enqueue(new GoogleHelpImpl(activity) {

            final GoogleHelpApiImpl this$0;
            final Activity val$callingActivity;
            final Intent val$helpIntent;
            final Bitmap val$pip = null;

            protected final void doExecute$5d59a3cd(IGoogleHelpService igooglehelpservice)
                throws RemoteException
            {
                try
                {
                    igooglehelpservice.processGoogleHelpAndPip((GoogleHelp)helpIntent.getParcelableExtra("EXTRA_GOOGLE_HELP"), pip, new SimpleGoogleHelpCallbacks() {

                        final _cls1 this$1;

                        public final void onGoogleHelpProcessed(GoogleHelp googlehelp)
                        {
                            if (googlehelp.mTogglingData == null) goto _L2; else goto _L1
_L1:
                            String s;
                            TogglingData togglingdata;
                            Object obj;
                            int i;
                            togglingdata = googlehelp.mTogglingData;
                            obj = callingActivity;
                            s = ((Activity) (obj)).getTitle().toString();
                            i = ((Activity) (obj)).getResources().getIdentifier("action_bar", "id", ((Activity) (obj)).getPackageName());
                            if (i == 0) goto _L4; else goto _L3
_L3:
                            obj = (ViewGroup)((Activity) (obj)).findViewById(i);
                            if (obj == null) goto _L4; else goto _L5
_L5:
                            i = 0;
_L10:
                            if (i >= ((ViewGroup) (obj)).getChildCount()) goto _L4; else goto _L6
_L6:
                            android.view.View view = ((ViewGroup) (obj)).getChildAt(i);
                            if (!(view instanceof TextView)) goto _L8; else goto _L7
_L7:
                            s = ((TextView)view).getText().toString();
_L4:
                            togglingdata.mPipTitle = s;
_L2:
                            helpIntent.putExtra("EXTRA_GOOGLE_HELP", googlehelp).putExtra("EXTRA_START_TICK", System.nanoTime());
                            callingActivity.startActivityForResult(helpIntent, 123);
                            setResult(Status.RESULT_SUCCESS);
                            return;
_L8:
                            i++;
                            if (true) goto _L10; else goto _L9
_L9:
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (IGoogleHelpService igooglehelpservice)
                {
                    Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", igooglehelpservice);
                }
                setFailedResult(GoogleHelpApiImpl.RESULT_FAILURE);
            }

            
            {
                this$0 = GoogleHelpApiImpl.this;
                helpIntent = intent;
                callingActivity = activity;
                super(final_googleapiclient);
            }
        });
    }


}
