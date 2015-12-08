// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;


// Referenced classes of package c:
//            ad, f, ae

public abstract class n
    implements ad
{

    private final ad _flddelegate;

    public n(ad ad1)
    {
        if (ad1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            _flddelegate = ad1;
            return;
        }
    }

    public void close()
    {
        _flddelegate.close();
    }

    public final ad _mthdelegate()
    {
        return _flddelegate;
    }

    public long read(f f, long l)
    {
        return _flddelegate.read(f, l);
    }

    public ae timeout()
    {
        return _flddelegate.timeout();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("(").append(_flddelegate.toString()).append(")").toString();
    }
}
