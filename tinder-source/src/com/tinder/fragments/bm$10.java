// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.DialogInterface;
import android.view.KeyEvent;

// Referenced classes of package com.tinder.fragments:
//            bm

final class a
    implements android.content.Interface.OnKeyListener
{

    final bm a;

    public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4 && keyevent.getAction() == 1)
        {
            a.a(new Runnable() {

                final bm._cls10 a;

                public final void run()
                {
                    a.a.dismissAllowingStateLoss();
                }

            
            {
                a = bm._cls10.this;
                super();
            }
            });
            return true;
        } else
        {
            return false;
        }
    }

    _cls1.a(bm bm1)
    {
        a = bm1;
        super();
    }
}
