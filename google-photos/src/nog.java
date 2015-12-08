// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class nog
{

    public final Intent a = new Intent();
    public final Context b;

    public nog(Context context)
    {
        b = context;
        a.setComponent(new ComponentName(context, "com.google.android.apps.moviemaker.MovieMakerActivity"));
    }

    private boolean c()
    {
        return "android.intent.action.SEND".equals(a.getAction()) && a.getStringExtra("aam_media_key") != null;
    }

    public final nog a()
    {
        a.setAction("android.intent.action.SEND");
        return this;
    }

    public final nog a(int i)
    {
        a.putExtra("source_id", i);
        return this;
    }

    public final nog a(Uri uri)
    {
        if (uri != null && !Uri.EMPTY.equals(uri))
        {
            a.putExtra("aam_preview_uri", uri);
        }
        return this;
    }

    public final nog a(String s)
    {
        a.putExtra("aam_media_key", s);
        return this;
    }

    public final Intent b()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (!c())
            {
                break label0;
            }
            flag = flag1;
            if (!a.getBooleanExtra("extra_generate_bytes", false))
            {
                break label0;
            }
            if (!a.getBooleanExtra("extra_bytes_quality_preview", false))
            {
                flag = flag1;
                if (!a.getBooleanExtra("extra_bytes_quality_full", false))
                {
                    break label0;
                }
            }
            flag = true;
        }
        if (!flag && !c() && !"android.intent.action.SEND_MULTIPLE".equals(a.getAction()))
        {
            String s = String.valueOf(a);
            throw new IllegalStateException((new StringBuilder(String.valueOf(s).length() + 43)).append("MovieMakerIntents missing some parameters: ").append(s).toString());
        } else
        {
            return a;
        }
    }

    public final nog b(int i)
    {
        a.putExtra("account_id", i);
        return this;
    }

    public final nog b(String s)
    {
        a.putExtra("source_name", s);
        return this;
    }
}
