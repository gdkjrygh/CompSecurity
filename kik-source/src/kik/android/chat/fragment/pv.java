// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.EditText;
import kik.android.util.cq;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            KikStartGroupFragment

final class pv
    implements android.view.View.OnFocusChangeListener
{

    final EditText a;
    final View b;
    final KikStartGroupFragment c;

    pv(KikStartGroupFragment kikstartgroupfragment, EditText edittext, View view)
    {
        c = kikstartgroupfragment;
        a = edittext;
        b = view;
        super();
    }

    public final void onFocusChange(View view, boolean flag)
    {
        if (flag && !cq.c(a.getText().toString()))
        {
            cv.b(new View[] {
                b
            });
            return;
        } else
        {
            cv.e(new View[] {
                b
            });
            return;
        }
    }
}
