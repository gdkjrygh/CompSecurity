// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.google.android.gms.ads.internal.formats.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.internal:
//            fh, iq

final class b
    implements b
{

    final boolean a;
    final String b;
    final fh c;

    private c b(InputStream inputstream)
    {
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            iq.a(inputstream, bytearrayoutputstream, true);
            inputstream = bytearrayoutputstream.toByteArray();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream = null;
        }
        if (inputstream == null)
        {
            c.a(2, a);
            return null;
        }
        inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
        if (inputstream == null)
        {
            c.a(2, a);
            return null;
        } else
        {
            return new c(new BitmapDrawable(Resources.getSystem(), inputstream), Uri.parse(b));
        }
    }

    public final Object a()
    {
        c.a(2, a);
        return null;
    }

    public final Object a(InputStream inputstream)
    {
        return b(inputstream);
    }

    ormats.c(fh fh1, boolean flag, String s)
    {
        c = fh1;
        a = flag;
        b = s;
        super();
    }
}
