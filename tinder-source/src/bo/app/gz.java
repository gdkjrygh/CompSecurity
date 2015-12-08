// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            fi

final class gz extends fi
{

    final Object a[];
    final int b;

    gz(int i, int j, Object aobj[], int k)
    {
        a = aobj;
        b = k;
        super(i, j);
    }

    protected final Object a(int i)
    {
        return a[b + i];
    }
}
