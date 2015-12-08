// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.File;

public final class fej
    implements are
{

    private final Context a;
    private final long b;

    public fej(Context context, long l)
    {
        a = context;
        b = l;
    }

    public final ard a()
    {
        return new fei(a, new File(a.getCacheDir(), "glide_cache"), b);
    }
}
