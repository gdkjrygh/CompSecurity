// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;

import java.io.File;

class <init>
{

    private final String a;
    private final String b;
    private final String c;

    static File a(<init> <init>1, File file)
    {
        return <init>1.a(file);
    }

    private File a(File file)
    {
        return new File(file, (new StringBuilder("program-")).append(b).append(".dex.jar").toString());
    }

    static String a(b b1)
    {
        return b1.b;
    }

    static String b(b b1)
    {
        return b1.a;
    }

    static String c(a a1)
    {
        return a1.c;
    }

    private (String s, String s1, String s2)
    {
        a = s;
        b = s1;
        c = s2;
    }

    c(String s, String s1, String s2, byte byte0)
    {
        this(s, s1, s2);
    }
}
