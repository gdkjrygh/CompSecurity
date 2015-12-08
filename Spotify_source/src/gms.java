// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.music.MainActivity;

public final class gms
{

    public final Intent a;

    public gms(Context context, Intent intent)
    {
        a = (Intent)ctz.a(intent);
        a.setExtrasClassLoader(context.getClassLoader());
        a.setClass(context, com/spotify/music/MainActivity);
    }

    public static gms a(Context context)
    {
        return a((Context)ctz.a(context), "spotify:internal:startpage");
    }

    public static gms a(Context context, String s)
    {
        s = new Intent("android.intent.action.VIEW", Uri.parse((String)ctz.a(s)));
        s.setFlags(0x4000000);
        return new gms((Context)ctz.a(context), s);
    }

    public final gms a()
    {
        a.putExtra("extra_clear_backstack", true);
        return this;
    }

    public final gms a(Bundle bundle)
    {
        a.putExtras(bundle);
        return this;
    }

    public final gms a(String s)
    {
        a.putExtra("title", (String)ctz.a(s));
        return this;
    }
}
