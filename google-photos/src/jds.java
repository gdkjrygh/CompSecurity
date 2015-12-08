// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.File;

public final class jds
    implements jdr
{

    private final Context a;

    public jds(Context context)
    {
        a = context;
    }

    public final File a(String s)
    {
        return njt.a(a, s);
    }

    public final boolean b(String s)
    {
        return s != null && !njt.a(s);
    }
}
