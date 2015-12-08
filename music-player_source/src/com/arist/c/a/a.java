// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.c.a;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import com.a.a.b.d;
import com.a.a.b.e;
import com.a.a.b.f;
import com.a.a.b.h;
import com.arist.b.b;
import com.arist.model.skin.ColorImageView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.arist.c.a:
//            d, c, b

public final class a
{

    private static final Uri a = Uri.parse("content://media/external/audio/albumart");
    private static final d b;

    private static Bitmap a(Context context, long l, long l1)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        if (l1 >= 0L) goto _L2; else goto _L1
_L1:
        if (l < 0L) goto _L4; else goto _L3
_L3:
        obj1 = b(context, l, -1L);
        if (obj1 == null) goto _L4; else goto _L5
_L5:
        return ((Bitmap) (obj1));
_L4:
        return null;
_L2:
        Object obj2;
        Object obj3;
        obj2 = context.getContentResolver();
        obj3 = ContentUris.withAppendedId(a, l1);
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_251;
        }
        obj2 = ((ContentResolver) (obj2)).openInputStream(((Uri) (obj3)));
        obj = obj2;
        obj1 = obj2;
        obj3 = new android.graphics.BitmapFactory.Options();
        obj = obj2;
        obj1 = obj2;
        obj3.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        obj = obj2;
        obj1 = obj2;
        obj3.inPurgeable = true;
        obj = obj2;
        obj1 = obj2;
        obj3.inInputShareable = true;
        obj = obj2;
        obj1 = obj2;
        obj3 = BitmapFactory.decodeStream(((InputStream) (obj2)), null, ((android.graphics.BitmapFactory.Options) (obj3)));
        context = ((Context) (obj3));
        obj1 = context;
        if (obj2 != null)
        {
            try
            {
                ((InputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return context;
            }
            return context;
        }
          goto _L5
        obj1;
        obj1 = obj;
        obj2 = b(context, l, l1);
        context = ((Context) (obj2));
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        context = ((Context) (obj2));
        obj1 = obj;
        if (((Bitmap) (obj2)).getConfig() != null)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        obj1 = obj;
        context = ((Bitmap) (obj2)).copy(android.graphics.Bitmap.Config.RGB_565, false);
        obj1 = context;
        if (obj == null) goto _L5; else goto _L6
_L6:
        try
        {
            ((InputStream) (obj)).close();
        }
        catch (IOException ioexception)
        {
            return context;
        }
        return context;
        context;
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            catch (IOException ioexception1) { }
        }
        throw context;
        return null;
    }

    public static Bitmap a(Context context, b b1)
    {
        Bitmap bitmap = a(context, b1.c(), b1.i());
        b1 = bitmap;
        if (bitmap == null)
        {
            b1 = d.a(context);
        }
        return b1;
    }

    public static void a(Context context)
    {
        context = (new h(context)).a().a(android.graphics.Bitmap.CompressFormat.PNG).b().c().a(com.a.a.b.a.h.b).d().a(new com.a.a.a.b.a.b(0x200000)).e().a(new com.a.a.a.a.b.b()).a(new com.a.a.b.d.a(context)).f();
        com.a.a.c.e.a();
        f.a().a(context);
    }

    public static void a(b b1, ImageView imageview)
    {
        d d1 = (new e()).a(0x7f020038).b(0x7f020038).c(0x7f020038).a().b().c().a(android.graphics.Bitmap.Config.ARGB_8888).d();
        f.a().a((new StringBuilder("content://media/external/audio/albumart/")).append(b1.i()).toString(), imageview, d1, new c(imageview));
    }

    public static void a(b b1, ColorImageView colorimageview)
    {
        f.a().a((new StringBuilder("content://media/external/audio/albumart/")).append(b1.i()).toString(), colorimageview, b, new com.arist.c.a.b(colorimageview));
    }

    private static Bitmap b(Context context, long l, long l1)
    {
        if (l1 < 0L && l < 0L)
        {
            throw new IllegalArgumentException("Must specify an album or a song id");
        }
        android.graphics.BitmapFactory.Options options;
        options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        options.inPurgeable = true;
        options.inInputShareable = true;
        if (l1 >= 0L)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        Uri uri = Uri.parse((new StringBuilder("content://media/external/audio/media/")).append(l).append("/albumart").toString());
        context = context.getContentResolver().openFileDescriptor(uri, "r");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        return BitmapFactory.decodeFileDescriptor(context.getFileDescriptor(), null, options);
        Uri uri1 = ContentUris.withAppendedId(a, l1);
        context = context.getContentResolver().openFileDescriptor(uri1, "r");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        context = BitmapFactory.decodeFileDescriptor(context.getFileDescriptor(), null, options);
        return context;
        context;
        return null;
    }

    static 
    {
        b = (new e()).a(0x7f020036).b(0x7f020036).c(0x7f020036).a().b().c().a(android.graphics.Bitmap.Config.RGB_565).d();
    }
}
