// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

public class eay
    implements dmx
{

    private final Uri a;

    public eay(Context context)
    {
        a = Uri.parse(context.getString(0x7f08064f));
    }

    public static Uri b(String s)
    {
        if (s == null)
        {
            return null;
        }
        if (TextUtils.isEmpty(s))
        {
            return Uri.EMPTY;
        } else
        {
            return dtt.b(s);
        }
    }

    public static Uri c(String s)
    {
        if (s == null)
        {
            return null;
        }
        if (TextUtils.isEmpty(s))
        {
            return Uri.EMPTY;
        } else
        {
            return dtg.b(s);
        }
    }

    public static Uri d(String s)
    {
        if (s == null)
        {
            return null;
        }
        if (TextUtils.isEmpty(s))
        {
            return Uri.EMPTY;
        } else
        {
            return dth.b(s);
        }
    }

    public static Uri e(String s)
    {
        if (s == null)
        {
            return null;
        }
        if (TextUtils.isEmpty(s))
        {
            return Uri.EMPTY;
        } else
        {
            return dti.b(s);
        }
    }

    private Uri j()
    {
        return a.buildUpon().appendPath("collection").build();
    }

    public final Uri a()
    {
        return j().buildUpon().appendPath("playlists").build();
    }

    public final Uri a(String s)
    {
        return h().buildUpon().appendPath("genre").appendPath(s).build();
    }

    public final Uri b()
    {
        return j().buildUpon().appendPath("artists").build();
    }

    public final Uri c()
    {
        return j().buildUpon().appendPath("albums").build();
    }

    public final Uri d()
    {
        return a.buildUpon().appendPath("radio").build();
    }

    public final Uri e()
    {
        return d().buildUpon().appendPath("your_stations").build();
    }

    public final Uri f()
    {
        return d().buildUpon().appendPath("recommended_stations").build();
    }

    public final Uri g()
    {
        return d().buildUpon().appendPath("genres").build();
    }

    public final Uri h()
    {
        return a.buildUpon().appendPath("browse").build();
    }

    public final Uri i()
    {
        return h().buildUpon().appendPath("new").build();
    }
}
