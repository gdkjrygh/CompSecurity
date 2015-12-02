// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.b;


// Referenced classes of package android.support.v4.b:
//            e, b, c

public class a
{

    public a()
    {
    }

    public static android.os.Parcelable.Creator a(c c)
    {
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            e.a(c);
        }
        return new b(c);
    }
}
