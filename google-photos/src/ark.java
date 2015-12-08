// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;

public class ark
    implements are
{

    private final int a;
    private final arl b;

    public ark(arl arl1, int i)
    {
        a = i;
        b = arl1;
    }

    public final ard a()
    {
        File file;
        for (file = b.a(); file == null || !file.mkdirs() && (!file.exists() || !file.isDirectory());)
        {
            return null;
        }

        return arm.a(file, a);
    }
}
