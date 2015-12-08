// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.spotify.mobile.android.service.media.image.ImageFormat;
import com.spotify.mobile.android.util.logging.Logger;
import com.squareup.picasso.Picasso;
import java.io.ByteArrayOutputStream;
import java.util.Set;

final class ang.Object
    implements Runnable
{

    final eby a;
    final Uri b;
    final ebz c;

    public final void run()
    {
        gwi gwi = new gwi() {

            private ebz._cls1 a;

            public final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
            {
                if (a.c.f) goto _L2; else goto _L1
_L1:
                eby eby1;
                Uri uri;
                ByteArrayOutputStream bytearrayoutputstream;
                eby1 = a.a;
                uri = a.b;
                loadedfrom = a.c;
                bytearrayoutputstream = new ByteArrayOutputStream((int)((double)(((ebz) (loadedfrom)).b * ((ebz) (loadedfrom)).c * 3) * 0.5D));
                ebz._cls2.a[((ebz) (loadedfrom)).a.ordinal()];
                JVM INSTR tableswitch 1 2: default 96
            //                           1 106
            //                           2 151;
                   goto _L3 _L4 _L5
_L3:
                throw new IllegalStateException("No valid image format");
_L4:
                loadedfrom = android.graphics.Bitmap.CompressFormat.PNG;
_L7:
                bitmap.compress(loadedfrom, 80, bytearrayoutputstream);
                eby1.a(uri, bytearrayoutputstream.toByteArray());
_L2:
                a.c.e.remove(this);
                return;
_L5:
                loadedfrom = android.graphics.Bitmap.CompressFormat.JPEG;
                if (true) goto _L7; else goto _L6
_L6:
            }

            public final void a(Drawable drawable)
            {
                Logger.c("Could not load bitmap %s", new Object[] {
                    String.valueOf(a.b)
                });
                a.a.a(a.b);
                a.c.e.remove(this);
            }

            public final void b(Drawable drawable)
            {
            }

            
            {
                a = ebz._cls1.this;
                super();
            }
        };
        c.e.add(gwi);
        c.d.a().a(b).b(c.b, c.c).b().a(gwi);
    }

    (ebz ebz1, eby eby, Uri uri)
    {
        c = ebz1;
        a = eby;
        b = uri;
        super();
    }
}
