// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;

public interface Cache
{

    public static final Cache NONE = new Cache() {

        public void clear()
        {
        }

        public void clearKeyUri(String s)
        {
        }

        public Bitmap get(String s)
        {
            return null;
        }

        public int maxSize()
        {
            return 0;
        }

        public void set(String s, Bitmap bitmap)
        {
        }

        public int size()
        {
            return 0;
        }

    };

    public abstract void clear();

    public abstract void clearKeyUri(String s);

    public abstract Bitmap get(String s);

    public abstract int maxSize();

    public abstract void set(String s, Bitmap bitmap);

    public abstract int size();

}
