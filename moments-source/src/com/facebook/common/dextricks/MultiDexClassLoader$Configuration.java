// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;

import dalvik.system.DexFile;
import java.io.File;
import java.util.ArrayList;

public final class b
{

    private ArrayList a;
    private ArrayList b;

    static ArrayList a(b b1)
    {
        return b1.a;
    }

    static ArrayList b(a a1)
    {
        return a1.b;
    }

    public final void a(File file, File file1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(file1.getAbsolutePath());
        stringbuilder.append('/');
        file1 = file.getName();
        int i = file1.lastIndexOf('.');
        if (i < 0)
        {
            stringbuilder.append(file1);
        } else
        {
            stringbuilder.append(file1, 0, i);
        }
        stringbuilder.append(".dex");
        a.add(DexFile.loadDex(file.getAbsolutePath(), stringbuilder.toString(), 0));
    }

    public final void a(String s)
    {
        b.add(s);
    }

    public ()
    {
        a = new ArrayList();
        b = new ArrayList();
    }
}
