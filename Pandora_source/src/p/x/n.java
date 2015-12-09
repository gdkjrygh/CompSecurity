// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.x;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import p.r.c;

// Referenced classes of package p.x:
//            j

public class n
    implements j
{

    private final j a;

    public n(j j1)
    {
        a = j1;
    }

    private static Uri a(String s)
    {
        return Uri.fromFile(new File(s));
    }

    public volatile c a(Object obj, int i, int k)
    {
        return a((String)obj, i, k);
    }

    public c a(String s, int i, int k)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        if (!s.startsWith("/")) goto _L2; else goto _L1
_L1:
        Uri uri = a(s);
_L4:
        return a.a(uri, i, k);
_L2:
        Uri uri1 = Uri.parse(s);
        uri = uri1;
        if (uri1.getScheme() == null)
        {
            uri = a(s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
