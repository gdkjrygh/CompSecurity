// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.view.ViewTreeObserver;
import android.widget.ExpandableListView;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            ProcessClearActivity

class a
    implements android.view.youtListener
{

    final a a;

    public void onGlobalLayout()
    {
        a(a.a);
        ProcessClearActivity.m(a.a.a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$3

/* anonymous class */
    class ProcessClearActivity.a._cls3
        implements Runnable
    {

        final ProcessClearActivity.a a;

        public void run()
        {
            if (ProcessClearActivity.a(a.a).b())
            {
                ProcessClearActivity.a._cls3._cls1 _lcls1 = new ProcessClearActivity.a._cls3._cls1(this);
                ProcessClearActivity.m(a.a).getViewTreeObserver().addOnGlobalLayoutListener(_lcls1);
                return;
            } else
            {
                ProcessClearActivity.a.b(a);
                return;
            }
        }

            
            {
                a = a1;
                super();
            }
    }

}
