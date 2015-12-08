// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bm;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bx.ai;
import com.google.android.m4b.maps.bx.o;
import java.nio.ByteBuffer;

public final class g
{

    private final ai a;

    public g(ai ai1)
    {
        a = ai1;
    }

    private void a(String s)
    {
        if (ab.a("NativeAllocator", 6))
        {
            Log.e("NativeAllocator", s);
        }
        o.b();
        a.b(true);
        System.gc();
        try
        {
            Thread.sleep(200L);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public final Bitmap a(int i, int j, android.graphics.Bitmap.Config config)
    {
        Bitmap bitmap;
        try
        {
            bitmap = Bitmap.createBitmap(i, j, config);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            a("OutOfMemory in createBitmap");
            return Bitmap.createBitmap(i, j, config);
        }
        return bitmap;
    }

    public final Bitmap a(byte abyte0[], android.graphics.BitmapFactory.Options options)
    {
        Bitmap bitmap;
        try
        {
            bitmap = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            a("OutOfMemory in decodeByteArray");
            return BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        }
        return bitmap;
    }

    public final ByteBuffer a(int i)
    {
        ByteBuffer bytebuffer;
        try
        {
            bytebuffer = ByteBuffer.allocateDirect(i);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            a("OutOfMemory in allocateDirectByteBuffer");
            return ByteBuffer.allocateDirect(i);
        }
        return bytebuffer;
    }
}
