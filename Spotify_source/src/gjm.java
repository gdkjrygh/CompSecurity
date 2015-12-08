// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class gjm
{

    private final Pattern a;

    public gjm(String s)
    {
        a = Pattern.compile(s);
    }

    public final Verified a(String s)
    {
        if (!a.matcher(s).matches())
        {
            Assertion.a((new StringBuilder("Uri ")).append(s).append(" did not match pattern ").append(a.pattern()).toString());
        }
        return new Verified(s);
    }

    public final boolean b(String s)
    {
        return a.matcher(s).matches();
    }

    public final String toString()
    {
        return a.pattern();
    }
}
