// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import android.net.Uri;
import android.text.TextUtils;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.view.g;
import com.cardinalblue.android.piccollage.view.o;
import java.io.File;

// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            a

public static class 
{

    public static a a(g g1)
    {
        if (g1 == null)
        {
            throw new IllegalArgumentException("image scrap == null");
        }
        Object obj = g1.i();
        if (g1 instanceof o)
        {
            o o1 = (o)g1;
            obj = o1.aj();
            if (TextUtils.isEmpty(((CharSequence) (obj))) && !TextUtils.isEmpty(o1.ag()))
            {
                obj = (new StringBuilder()).append("https://i.ytimg.com/vi/").append(Uri.parse(o1.ag()).getLastPathSegment()).append("/hqdefault.jpg").toString();
            }
        }
        try
        {
            obj = a(((String) (obj)));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            File file = g1.k();
            g1 = file;
            if (file == null)
            {
                g1 = new File("");
                f.a(new RuntimeException("image scrap has unexpected resource file path"));
            }
            return new <init>(g1.getAbsolutePath());
        }
        return ((a) (obj));
    }

    public static a a(String s)
        throws IllegalArgumentException
    {
        switch (a[a(s).ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("uri is not valid: ").append(s).toString());

        case 1: // '\001'
        case 2: // '\002'
            return new <init>(s);

        case 3: // '\003'
            return new <init>(s);

        case 4: // '\004'
            return new <init>(s);

        case 5: // '\005'
            return new <init>(s);

        case 6: // '\006'
            return new <init>(s);

        case 7: // '\007'
            return new <init>(s);

        case 8: // '\b'
            return new <init>(s);
        }
    }

    public ()
    {
    }
}
