// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.d;


// Referenced classes of package android.support.v4.d:
//            g, d, e

public class c
{

    public static android.os.Parcelable.Creator a(e e)
    {
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            return g.a(e);
        } else
        {
            return new d(e);
        }
    }
}
