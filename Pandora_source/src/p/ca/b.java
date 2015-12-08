// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import com.pandora.android.ads.h;

// Referenced classes of package p.ca:
//            k

public class b extends k
{

    private h a;

    public b()
    {
        setRetainInstance(true);
    }

    public static b a()
    {
        return a(null);
    }

    public static b a(h h)
    {
        b b1 = new b();
        b1.b(h);
        return b1;
    }

    public h b()
    {
        return a;
    }

    public void b(h h)
    {
        a = h;
    }
}
