// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class hla
    implements dis
{

    private final Context a;

    hla(Context context)
    {
        a = context;
    }

    public final dir a(int i, byte abyte0[])
    {
        try
        {
            abyte0 = new hkz(a, i, (hlh)qlw.a(new hlh(), abyte0));
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
        return "com.google.android.apps.photos.remotemedia.removefromalbum.RemoveFromCollectionOptimisticAction";
    }

    public final byte[] a(dir dir)
    {
        return qlw.a(((hkz)dir).a);
    }
}
