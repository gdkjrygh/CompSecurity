// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.ui.activity.ShareActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class fpa
{

    public final Intent a;
    private final Intent b = new Intent("android.intent.action.SEND");

    public fpa(Context context, Flags flags)
    {
        b.setType("text/plain");
        b.addFlags(0x80000);
        a = new Intent(context, com/spotify/mobile/android/ui/activity/ShareActivity);
        a.addFlags(0x40000000);
        fyw.a(a, flags);
    }

    public final Intent a()
    {
        a.putExtra("intent", b);
        return a;
    }

    public final fpa a(String s)
    {
        a.putExtra("title", s);
        return this;
    }

    public final fpa a(boolean flag)
    {
        a.putExtra("include_share_to_spotify", flag);
        return this;
    }

    public final fpa b(String s)
    {
        b.putExtra("android.intent.extra.SUBJECT", s);
        return this;
    }

    public final fpa c(String s)
    {
        b.putExtra("android.intent.extra.TEXT", s);
        return this;
    }
}
