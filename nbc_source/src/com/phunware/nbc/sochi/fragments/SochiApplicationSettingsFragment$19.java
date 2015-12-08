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

class this._cls0
    implements Callback
{

    final SochiApplicationSettingsFragment this$0;

    public void onFailure(Request request, IOException ioexception)
    {
        SochiApplicationSettingsFragment.access$800(SochiApplicationSettingsFragment.this).post(new Runnable() {

            final SochiApplicationSettingsFragment._cls19 this$1;

            public void run()
            {
                Toast.makeText(getActivity(), "NETWORK FAILURE", 0).show();
            }

            
            {
                this$1 = SochiApplicationSettingsFragment._cls19.this;
                super();
            }
        });
    }

    public void onResponse(final Response response)
        throws IOException
    {
        SochiApplicationSettingsFragment.access$800(SochiApplicationSettingsFragment.this).post(new Runnable() {

            final SochiApplicationSettingsFragment._cls19 this$1;
            final Response val$response;

            public void run()
            {
                android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
                String s;
                if (response.isSuccessful())
                {
                    s = "SUCCESS";
                } else
                {
                    s = "REQUEST FAILURE";
                }
                Toast.makeText(fragmentactivity, s, 0).show();
            }

            
            {
                this$1 = SochiApplicationSettingsFragment._cls19.this;
                response = response1;
                super();
            }
        });
    }

    _cls2.val.response()
    {
        this$0 = SochiApplicationSettingsFragment.this;
        super();
    }
}
