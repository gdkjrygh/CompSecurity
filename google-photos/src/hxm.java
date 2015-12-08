// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class hxm
    implements dis
{

    private final Context a;

    hxm(Context context)
    {
        a = context;
    }

    public final dir a(int i, byte abyte0[])
    {
        try
        {
            abyte0 = new hxl(a, (hyg)qlw.a(new hyg(), abyte0));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
        return abyte0;
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.search.suggestions.people-hiding-action";
    }

    public final byte[] a(dir dir)
    {
        return qlw.a(((hxl)dir).a);
    }
}
