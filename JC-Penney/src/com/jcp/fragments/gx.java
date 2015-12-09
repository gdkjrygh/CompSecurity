// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.support.v4.app.ac;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;

// Referenced classes of package com.jcp.fragments:
//            gw

class gx
    implements android.view.View.OnKeyListener
{

    final gw a;

    gx(gw gw1)
    {
        a = gw1;
        super();
    }

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (keyevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        view = (WebView)view;
        i;
        JVM INSTR tableswitch 4 4: default 32
    //                   4 34;
           goto _L2 _L3
_L2:
        return false;
_L3:
        if (view.canGoBack())
        {
            view.goBack();
            return true;
        } else
        {
            a.i().finish();
            return true;
        }
    }
}
