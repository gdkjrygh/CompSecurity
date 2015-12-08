// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Locale;

public final class obu
    implements mru
{

    public final boolean a = b.t();
    private final String b = null;

    public obu(String s)
    {
    }

    public final String a(Context context, mrw mrw1)
    {
        if (b != null)
        {
            return b;
        } else
        {
            return mrw1.a(context);
        }
    }

    public final void a(Context context)
    {
    }

    public final String toString()
    {
        return String.format(Locale.US, "CrashEvent isForegroundCrash=%b", new Object[] {
            Boolean.valueOf(a)
        });
    }
}
