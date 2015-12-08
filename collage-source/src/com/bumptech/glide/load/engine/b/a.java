// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.b;

import com.bumptech.glide.load.c;
import java.io.File;

public interface com.bumptech.glide.load.engine.b.a
{
    public static interface a
    {

        public abstract com.bumptech.glide.load.engine.b.a a();
    }

    public static interface b
    {

        public abstract boolean a(File file);
    }


    public abstract File a(c c);

    public abstract void a(c c, b b1);

    public abstract void b(c c);
}
