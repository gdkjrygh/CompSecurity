// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;

public interface Cache
{

    public static final Cache NONE = new Cache() {

        public final Bitmap get(String s)
        {
            return null;
        }

        public final int maxSize()
        {
            return 0;
        }

        public final void set(String s, Bitmap bitmap)
        {
        }

        public final int size()
        {
            return 0;
        }

    };

    public abstract Bitmap get(String s);

    public abstract int maxSize();

    public abstract void set(String s, Bitmap bitmap);

    public abstract int size();

}
