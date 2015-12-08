// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.ui.activity.ConfirmDeletionActivity;

public final class ng.Object
    implements fxo
{

    private String a;
    private String b;
    private fuk c;

    public final void a(fxp fxp)
    {
        fuk.a(c, com.spotify.mobile.android.util.vent.Event.m);
        c.b.startActivity(ConfirmDeletionActivity.a(c.b, a, b));
    }

    public ng.String(fuk fuk1, String s, String s1)
    {
        c = fuk1;
        a = s;
        b = s1;
        super();
    }
}
