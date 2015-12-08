// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.google.android.gms.ads.internal.formats.zzc;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.internal:
//            qv, wk, mv

final class na
    implements qv
{

    final boolean a;
    final double b;
    final String c;
    final mv d;

    na(mv mv1, boolean flag, double d1, String s)
    {
        d = mv1;
        a = flag;
        b = d1;
        c = s;
        super();
    }

    private zzc b(InputStream inputstream)
    {
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            wk.a(inputstream, bytearrayoutputstream);
            inputstream = bytearrayoutputstream.toByteArray();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream = null;
        }
        if (inputstream == null)
        {
            d.a(2, a);
            return null;
        }
        inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
        if (inputstream == null)
        {
            d.a(2, a);
            return null;
        } else
        {
            inputstream.setDensity((int)(160D * b));
            return new zzc(new BitmapDrawable(Resources.getSystem(), inputstream), Uri.parse(c), b);
        }
    }

    public final Object a()
    {
        d.a(2, a);
        return null;
    }

    public final Object a(InputStream inputstream)
    {
        return b(inputstream);
    }
}
