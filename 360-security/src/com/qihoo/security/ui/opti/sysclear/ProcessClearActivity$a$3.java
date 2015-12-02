// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.view.ViewTreeObserver;
import android.widget.ExpandableListView;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            ProcessClearActivity

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        if (ProcessClearActivity.a(a.a).a())
        {
            android.view.LayoutListener layoutlistener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                final ProcessClearActivity.a._cls3 a;

                public void onGlobalLayout()
                {
                    ProcessClearActivity.a.b(a.a);
                    ProcessClearActivity.m(a.a.a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }

            
            {
                a = ProcessClearActivity.a._cls3.this;
                super();
            }
            };
            ProcessClearActivity.m(a.a).getViewTreeObserver().addOnGlobalLayoutListener(layoutlistener);
            return;
        } else
        {
            a(a);
            return;
        }
    }

    _cls1.a(_cls1.a a1)
    {
        a = a1;
        super();
    }
}
