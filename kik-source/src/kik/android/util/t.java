// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.Intent;
import android.net.Uri;
import com.kik.view.adapters.h;
import com.kik.view.adapters.m;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import kik.a.d.a.a;

public final class t
{

    private static final Set a;

    public static Intent a(File file)
    {
        Intent intent = new Intent("android.intent.action.PICK", android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        intent.setType("image/*");
        intent.putExtra("output", Uri.fromFile(file));
        return intent;
    }

    public static kik.a.d.a.a.b a(a a1)
    {
        if (a1 != null) goto _L2; else goto _L1
_L1:
        kik.a.d.a.a.b b1 = kik.a.d.a.a.b.a;
_L4:
        return b1;
_L2:
        kik.a.d.a.a.b b2 = a1.t();
        b1 = b2;
        if (b2 == kik.a.d.a.a.b.a)
        {
            if (a(a1.u()))
            {
                b1 = kik.a.d.a.a.b.b;
            } else
            {
                b1 = kik.a.d.a.a.b.c;
            }
        }
        b2 = b1;
        if (b1 == kik.a.d.a.a.b.c)
        {
            if (h.b(a1))
            {
                b2 = kik.a.d.a.a.b.b;
            } else
            {
                b2 = b1;
                if (m.a(a1))
                {
                    b2 = kik.a.d.a.a.b.f;
                }
            }
        }
        b1 = b2;
        if (b2 != kik.a.d.a.a.b.b) goto _L4; else goto _L3
_L3:
        if ("com.kik.ext.camera".equals(a1.u()))
        {
            break; /* Loop/switch isn't completed */
        }
        b1 = b2;
        if (!"com.kik.ext.gallery".equals(a1.u())) goto _L4; else goto _L5
_L5:
        return kik.a.d.a.a.b.d;
    }

    public static boolean a(String s)
    {
        return a.contains(s);
    }

    public static Intent b(File file)
    {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE", null);
        intent.putExtra("output", Uri.fromFile(file));
        return intent;
    }

    static 
    {
        int i = 0;
        HashSet hashset = new HashSet();
        for (; i < 5; i++)
        {
            hashset.add((new String[] {
                "com.kik.ext.camera", "com.kik.ext.gallery", "com.kik.ext.video-camera", "com.kik.ext.video-gallery", "com.kik.ext.gif"
            })[i]);
        }

        a = hashset;
    }
}
