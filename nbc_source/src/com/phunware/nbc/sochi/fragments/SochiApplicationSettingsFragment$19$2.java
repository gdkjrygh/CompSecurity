// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.os.Handler;
import android.widget.Toast;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            SochiApplicationSettingsFragment

class val.response
    implements Runnable
{

    final val.response this$1;
    final Response val$response;

    public void run()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        String s;
        if (val$response.isSuccessful())
        {
            s = "SUCCESS";
        } else
        {
            s = "REQUEST FAILURE";
        }
        Toast.makeText(fragmentactivity, s, 0).show();
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$response = Response.this;
        super();
    }

    // Unreferenced inner class com/phunware/nbc/sochi/fragments/SochiApplicationSettingsFragment$19

/* anonymous class */
    class SochiApplicationSettingsFragment._cls19
        implements Callback
    {

        final SochiApplicationSettingsFragment this$0;

        public void onFailure(Request request, IOException ioexception)
        {
            SochiApplicationSettingsFragment.access$800(SochiApplicationSettingsFragment.this).post(new SochiApplicationSettingsFragment._cls19._cls1());
        }

        public void onResponse(Response response1)
            throws IOException
        {
            SochiApplicationSettingsFragment.access$800(SochiApplicationSettingsFragment.this).post(response1. new SochiApplicationSettingsFragment._cls19._cls2());
        }

            
            {
                this$0 = SochiApplicationSettingsFragment.this;
                super();
            }

        // Unreferenced inner class com/phunware/nbc/sochi/fragments/SochiApplicationSettingsFragment$19$1

/* anonymous class */
        class SochiApplicationSettingsFragment._cls19._cls1
            implements Runnable
        {

            final SochiApplicationSettingsFragment._cls19 this$1;

            public void run()
            {
                Toast.makeText(getActivity(), "NETWORK FAILURE", 0).show();
            }

                    
                    {
                        this$1 = SochiApplicationSettingsFragment._cls19.this;
                        super();
                    }
        }

    }

}
