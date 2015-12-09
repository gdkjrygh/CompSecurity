// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.ByteArrayOutputStream;

public final class eko
    implements gwi
{

    private static byte d[];
    public gft a;
    public Uri b;
    public boolean c;
    private ekg e;

    public eko(ekg ekg1, Uri uri)
    {
        b = uri;
        e = ekg1;
        a = (gft)dmz.a(gft);
    }

    public static byte[] a(Context context)
    {
        eko;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = a(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), 0x7f020257), 65, 51, false), 65, 51);
        }
        context = d;
        eko;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static byte[] a(Bitmap bitmap, int i, int j)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream((int)((double)(i * j * 3) * 0.5D));
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    public final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        if (!c)
        {
            loadedfrom = e;
            bitmap = a(bitmap, 320, 320);
            ((ekg) (loadedfrom)).a.d().a(true);
            ((ekg) (loadedfrom)).a.d().a(bitmap);
        }
    }

    public final void a(Drawable drawable)
    {
        String.valueOf(b);
    }

    public final void b(Drawable drawable)
    {
    }
}
