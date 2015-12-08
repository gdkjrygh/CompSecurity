// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package kik.android.chat.fragment:
//            rl

final class rm
    implements android.view.View.OnClickListener
{

    final View a;
    final TextView b;
    final rl c;

    rm(rl rl1, View view, TextView textview)
    {
        c = rl1;
        a = view;
        b = textview;
        super();
    }

    public final void onClick(View view)
    {
        ObjectAnimator.ofPropertyValuesHolder(a.getBackground(), new PropertyValuesHolder[] {
            PropertyValuesHolder.ofInt("alpha", new int[] {
                153, 255
            })
        }).start();
        rl.a(c).a(b.getText().toString(), view);
    }
}
