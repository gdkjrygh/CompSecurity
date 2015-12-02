// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.c;


// Referenced classes of package android_src.mms.c:
//            b

public class a
{

    private static a b;
    private b a;

    public static a a()
    {
        if (b == null)
        {
            throw new IllegalStateException("Uninitialized.");
        } else
        {
            return b;
        }
    }

    public b b()
    {
        return a;
    }
}
