// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;

public final class bvk
{

    public final cqf a;
    public final bvb b;
    public final int c;
    public final File d;
    public final File e;
    public final File f;
    public final String g;
    public final boolean h;

    public bvk(cqf cqf1, bvb bvb1, int i, File file, File file1, File file2, String s, 
            boolean flag)
    {
        a = (cqf)b.a(cqf1, "storyboard", null);
        b = (bvb)b.a(bvb1, "resolution", null);
        c = i;
        d = (File)b.a(file, "outputFile", null);
        e = file1;
        f = file2;
        g = s;
        h = flag;
    }
}
