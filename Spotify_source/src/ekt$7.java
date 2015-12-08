// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.view.View;

final class ang.Object
    implements android.view.nClickListener
{

    private Activity a;
    private String b;
    private ekt c;

    public final void onClick(View view)
    {
        ekt.d(c).a(a, -1, "new_releases", b);
    }

    (ekt ekt1, Activity activity, String s)
    {
        c = ekt1;
        a = activity;
        b = s;
        super();
    }
}
