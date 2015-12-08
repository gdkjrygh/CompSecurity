// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.b;

import com.kik.l.ab;

// Referenced classes of package kik.android.gifs.b:
//            g, c

public final class d
{

    public static c a(String s, ab ab, kik.android.gifs.a.f.a a1, int i)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[kik.android.gifs.a.f.a.values().length];
                try
                {
                    a[kik.android.gifs.a.f.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[kik.android.gifs.a.f.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[kik.android.gifs.a.f.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[kik.android.gifs.a.f.a.i.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[kik.android.gifs.a.f.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[kik.android.gifs.a.f.a.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[a1.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("unsupported decoding type ")).append(a1.toString()).toString());

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return new g(s, i, ab);
        }
    }
}
