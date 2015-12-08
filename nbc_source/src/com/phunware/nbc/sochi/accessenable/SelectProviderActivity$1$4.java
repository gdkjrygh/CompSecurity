// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.webkit.CookieManager;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.nbcsports.liveextra.library.tve.AuthDelegate;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.ui.tve.AuthenticationWebView;
import java.util.ArrayList;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            SelectProviderActivity, SelectProviderFragment

class val.errorCode
    implements Runnable
{

    final val.errorCode this$1;
    final String val$errorCode;
    final int val$status;

    public void run()
    {
        String s;
        byte byte0;
        byte0 = -1;
        if (val$status == 1)
        {
            setResult(-1, getIntent());
            finish();
            return;
        }
        if (pass.getSelectedMvpd() != null && SelectProviderActivity.access$100(_fld0))
        {
            pass.cancelAuthN();
            pass.getInstance().getAuthentication();
            return;
        }
        s = val$errorCode;
        s.hashCode();
        JVM INSTR lookupswitch 4: default 152
    //                   -1798052747: 253
    //                   -1082188897: 267
    //                   -560385085: 225
    //                   -330798807: 239;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        byte0;
        JVM INSTR tableswitch 0 2: default 180
    //                   0 281
    //                   1 281
    //                   2 335;
           goto _L6 _L7 _L7 _L8
_L6:
        pass.cancelAuthN();
        setResult(0, getIntent());
        finish();
        return;
_L4:
        if (s.equals("Internal Authentication Error"))
        {
            byte0 = 0;
        }
          goto _L1
_L5:
        if (s.equals("Generic Authentication Error"))
        {
            byte0 = 1;
        }
          goto _L1
_L2:
        if (s.equals("User Not Authenticated Error"))
        {
            byte0 = 2;
        }
          goto _L1
_L3:
        if (s.equals("Provider not Selected Error"))
        {
            byte0 = 3;
        }
          goto _L1
_L7:
        pass.cancelAuthN();
        CookieManager cookiemanager = CookieManager.getInstance();
        if (android.os.ce >= 21)
        {
            cookiemanager.removeAllCookies(null);
        } else
        {
            cookiemanager.removeAllCookie();
        }
        pass.getInstance().getAuthentication();
        return;
_L8:
        Toast.makeText(getBaseContext(), val$errorCode, 0).show();
          goto _L6
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$status = i;
        val$errorCode = String.this;
        super();
    }

    // Unreferenced inner class com/phunware/nbc/sochi/accessenable/SelectProviderActivity$1

/* anonymous class */
    class SelectProviderActivity._cls1 extends AuthDelegate
    {

        final SelectProviderActivity this$0;

        public void displayProviderDialog(ArrayList arraylist)
        {
            super.displayProviderDialog(arraylist);
            if (SelectProviderActivity.access$100(SelectProviderActivity.this))
            {
                runOnUiThread(new SelectProviderActivity._cls1._cls2());
                return;
            }
            if (getSupportFragmentManager().findFragmentById(0x7f0f006c) == null)
            {
                getSupportFragmentManager().beginTransaction().replace(0x7f0f006c, SelectProviderFragment.getInstance(arraylist)).commit();
            }
            runOnUiThread(new SelectProviderActivity._cls1._cls3());
        }

        public void navigateToUrl(final String url)
        {
            super.navigateToUrl(url);
            runOnUiThread(new SelectProviderActivity._cls1._cls1());
        }

        public void selectedProvider(Mvpd mvpd)
        {
            super.selectedProvider(mvpd);
        }

        public void setAuthenticationStatus(final int status, String s)
        {
            super.setAuthenticationStatus(status, s);
            runOnUiThread(s. new SelectProviderActivity._cls1._cls4());
        }

            
            {
                this$0 = SelectProviderActivity.this;
                super();
            }

        // Unreferenced inner class com/phunware/nbc/sochi/accessenable/SelectProviderActivity$1$1

/* anonymous class */
        class SelectProviderActivity._cls1._cls1
            implements Runnable
        {

            final SelectProviderActivity._cls1 this$1;
            final String val$url;

            public void run()
            {
                SelectProviderActivity.access$000(this$0).setVisibility(0);
                SelectProviderActivity.access$000(this$0).setCallback(new SelectProviderActivity._cls1._cls1._cls1());
                SelectProviderActivity.access$000(this$0).loadUrl(url);
            }

                    
                    {
                        this$1 = SelectProviderActivity._cls1.this;
                        url = s;
                        super();
                    }
        }


        // Unreferenced inner class com/phunware/nbc/sochi/accessenable/SelectProviderActivity$1$1$1

/* anonymous class */
        class SelectProviderActivity._cls1._cls1._cls1
            implements com.nbcsports.liveextra.ui.tve.AuthenticationWebView.Callback
        {

            final SelectProviderActivity._cls1._cls1 this$2;

            public void onComplete()
            {
                if (isFinishing())
                {
                    return;
                } else
                {
                    pass.getInstance().getAuthenticationToken();
                    return;
                }
            }

                    
                    {
                        this$2 = SelectProviderActivity._cls1._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/phunware/nbc/sochi/accessenable/SelectProviderActivity$1$2

/* anonymous class */
        class SelectProviderActivity._cls1._cls2
            implements Runnable
        {

            final SelectProviderActivity._cls1 this$1;

            public void run()
            {
                tryTempPass();
            }

                    
                    {
                        this$1 = SelectProviderActivity._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/phunware/nbc/sochi/accessenable/SelectProviderActivity$1$3

/* anonymous class */
        class SelectProviderActivity._cls1._cls3
            implements Runnable
        {

            final SelectProviderActivity._cls1 this$1;

            public void run()
            {
                SelectProviderActivity.access$200(this$0).setVisibility(8);
            }

                    
                    {
                        this$1 = SelectProviderActivity._cls1.this;
                        super();
                    }
        }

    }

}
