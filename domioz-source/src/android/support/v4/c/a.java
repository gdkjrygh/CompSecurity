// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.c;


// Referenced classes of package android.support.v4.c:
//            d, b, c

public final class a
{

    public static android.os.Parcelable.Creator a(c c)
    {
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            return new d(c);
        } else
        {
            return new b(c);
        }
    }
}
