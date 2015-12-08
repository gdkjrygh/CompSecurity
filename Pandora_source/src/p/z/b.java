// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.z;

import android.content.Context;
import p.r.c;
import p.x.j;
import p.x.k;

// Referenced classes of package p.z:
//            d

public class b
    implements d
{
    public static class a
        implements k
    {

        public j a(Context context, p.x.c c)
        {
            return new b();
        }

        public void a()
        {
        }

        public a()
        {
        }
    }


    private final String a;

    public b()
    {
        this("");
    }

    public b(String s)
    {
        a = s;
    }

    public volatile c a(Object obj, int i, int j)
    {
        return a((byte[])obj, i, j);
    }

    public c a(byte abyte0[], int i, int j)
    {
        return new p.r.b(abyte0, a);
    }
}
