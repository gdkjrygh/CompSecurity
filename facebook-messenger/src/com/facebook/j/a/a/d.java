// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.j.a.a;

import android.content.Context;
import com.facebook.a.a;
import com.facebook.a.c;
import com.facebook.nativejpeg.BitmapFactory;
import com.facebook.nativejpeg.b;
import java.io.File;

// Referenced classes of package com.facebook.j.a.a:
//            a, c, b

public class d
    implements com.facebook.j.a.a.a
{

    private final Context a;
    private final a b;

    public d(Context context, a a1)
    {
        a = context;
        b = a1;
    }

    public com.facebook.j.a.a.c a(String s, String s1, com.facebook.j.a.a.c c1)
    {
        File file = new File(s1);
        try
        {
            b.a(a, new File(s), file, c1.a, c1.b, c1.c);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new com.facebook.j.a.a.b("Couldn't resize image", s);
        }
        s = new b();
        s.inJustDecodeBounds = true;
        BitmapFactory.a(s1, s);
        return new com.facebook.j.a.a.c(((b) (s)).outWidth, ((b) (s)).outHeight, c1.c);
    }
}
