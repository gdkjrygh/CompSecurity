// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public final class JM extends BitmapDrawable
{
    public static final class a
    {

        public a()
        {
        }
    }


    public final JL mLoaderTask;

    public JM(Resources resources, Bitmap bitmap, JL jl)
    {
        super(resources, bitmap);
        mLoaderTask = jl;
    }
}
