// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class mzx
    implements Cloneable
{

    public boolean a;
    public android.graphics.Bitmap.Config b;
    public int c;

    mzx()
    {
    }

    public final mzx a()
    {
        mzx mzx1;
        try
        {
            mzx1 = (mzx)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError(clonenotsupportedexception);
        }
        return mzx1;
    }

    public final Object clone()
    {
        return a();
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof mzx)
        {
            if (a == ((mzx) (obj = (mzx)obj)).a && b == ((mzx) (obj)).b && c == ((mzx) (obj)).c)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        int i = b.hashCode() ^ c;
        if (a)
        {
            return i;
        } else
        {
            return -i;
        }
    }
}
