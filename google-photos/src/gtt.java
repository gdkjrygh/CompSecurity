// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.List;

public final class gtt
{

    public final int a;
    public final long b;
    public final ejm c;

    gtt(int i, long l, ejm ejm1)
    {
        a = i;
        b = l;
        c = ejm1;
    }

    public static gtt a(Uri uri)
    {
        boolean flag = true;
        List list;
        int i;
        long l;
        if (b.c(uri))
        {
            flag = false;
        }
        p.a(flag, "Invalid URI");
        list = uri.getPathSegments();
        try
        {
            i = Integer.parseInt((String)list.get(0));
            l = Long.parseLong((String)list.get(1));
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw new IllegalArgumentException("Invalid URI");
        }
        uri = null;
        if (list.size() > 2)
        {
            uri = ejm.valueOf((String)list.get(2));
        }
        return new gtt(i, l, uri);
    }

    public final Uri a(String s)
    {
        s = (new android.net.Uri.Builder()).scheme("content").authority(s).appendPath(Integer.toString(a)).appendPath(Long.toString(b));
        if (c != null)
        {
            s.appendPath(c.name());
        }
        return s.build();
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof gtt)
        {
            obj = (gtt)obj;
            flag = flag1;
            if (a == ((gtt) (obj)).a)
            {
                flag = flag1;
                if (b == ((gtt) (obj)).b)
                {
                    flag = flag1;
                    if (c == ((gtt) (obj)).c)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return a + c.a(b, c.a(c, 17)) * 31;
    }
}
