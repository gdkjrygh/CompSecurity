// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

final class asz
    implements asx
{

    asz()
    {
    }

    public final Class a()
    {
        return java/io/InputStream;
    }

    public final Object a(File file)
    {
        return new FileInputStream(file);
    }

    public final void a(Object obj)
    {
        ((InputStream)obj).close();
    }
}
