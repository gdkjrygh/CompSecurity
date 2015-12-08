// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.res.Resources;
import android.preference.Preference;
import android.view.View;
import kik.android.util.av;

// Referenced classes of package kik.android.widget.preferences:
//            z

final class y
    implements Runnable
{

    final View a;
    final View b;
    final Preference c;

    y(View view, View view1, Preference preference)
    {
        a = view;
        b = view1;
        c = preference;
        super();
    }

    public final void run()
    {
        av.b(a, b.getResources().getColor(0x7f0c004c), new z(this));
    }
}
