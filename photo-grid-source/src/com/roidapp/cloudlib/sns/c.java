// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import com.bumptech.glide.load.b.b.s;
import com.roidapp.baselib.d.a;
import java.io.File;

public final class c
{

    private static s a = null;

    public static File a(String s1)
    {
        if (s1 != null)
        {
            File file = new File(com.roidapp.baselib.d.a.c(), "images");
            if (file.isDirectory())
            {
                if (a == null)
                {
                    a = new s();
                }
                return new File(file, (new StringBuilder()).append(a.a(new com.bumptech.glide.h.c(s1))).append(".0").toString());
            }
        }
        return null;
    }

}
