// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;
import java.io.IOException;

final class WZ
{

    static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
        Xb.a(closeable);
        return;
        IncompatibleClassChangeError incompatibleclasschangeerror;
        incompatibleclasschangeerror;
        throw new RuntimeException((new StringBuilder("Caused by attempting to close ")).append(closeable.getClass().getName()).toString(), incompatibleclasschangeerror);
    }
}
