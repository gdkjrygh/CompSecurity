// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ejh
{

    public static eiz a(String s)
    {
        return new eiz(a(s, eiz.a));
    }

    private static String a(String s, Pattern pattern)
    {
        s = pattern.matcher(s);
        ctz.a(s.matches());
        return s.group(1);
    }

    public static eja b(String s)
    {
        if (eiz.a.matcher(s).matches())
        {
            return a(s);
        }
        if (ejb.a.matcher(s).matches())
        {
            return new ejb(a(s, ejb.a));
        }
        if (ejd.a.matcher(s).matches())
        {
            return new ejd(a(s, ejd.a));
        }
        if (ejc.a.matcher(s).matches())
        {
            return new ejc(a(s, ejc.a));
        }
        if (ejf.a.matcher(s).matches())
        {
            return new ejf(a(s, ejf.a));
        }
        if (ejg.a.matcher(s).matches())
        {
            s = ejg.a.matcher(s);
            ctz.a(s.matches());
            return new ejg(s.group(1), com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType.valueOf(s.group(2).toUpperCase(Locale.US)));
        }
        if (eje.a.matcher(s).matches())
        {
            return new eje(a(s, eje.a));
        } else
        {
            throw new RuntimeException((new StringBuilder("Unknown URI: ")).append(s).toString());
        }
    }
}
