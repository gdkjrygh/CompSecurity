// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.support.v4.app.ac;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;

// Referenced classes of package com.jcp.fragments:
//            u

class v
    implements android.view.View.OnKeyListener
{

    final u a;

    v(u u1)
    {
        a = u1;
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
            keyevent = view.copyBackForwardList();
            if (keyevent.getItemAtIndex(keyevent.getCurrentIndex() - 1).getUrl().contains("launchCheckout.jsp"))
            {
                a.i().finish();
                return true;
            } else
            {
                view.goBack();
                return true;
            }
        } else
        {
            u.a(a);
            a.i().finish();
            return true;
        }
    }
}
