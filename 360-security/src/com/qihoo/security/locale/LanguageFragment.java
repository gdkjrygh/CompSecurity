// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.g;
import com.qihoo.security.ui.fragment.BaseFragment;

public class LanguageFragment extends BaseFragment
{

    protected String a;
    public final Handler b = new Handler() {

        final LanguageFragment a;

        public void handleMessage(Message message)
        {
            super.handleMessage(message);
            a.a_(message);
        }

            
            {
                a = LanguageFragment.this;
                super();
            }
    };

    public LanguageFragment()
    {
        a = null;
    }

    protected void a_(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1002 1002: default 24
    //                   1002 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        g.a(d).a(new Intent("com.qihoo.security.REBOOT_MAIN_SCREEN"));
        if (e())
        {
            getActivity().finish();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public void onStart()
    {
        super.onStart();
    }

    public void onStop()
    {
        super.onStop();
    }
}
