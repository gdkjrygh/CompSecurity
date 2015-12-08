// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;


// Referenced classes of package c:
//            ac, ae, f

public abstract class m
    implements ac
{

    private final ac _flddelegate;

    public m(ac ac1)
    {
        if (ac1 == null)
        {
            throw new IllegalArgumentException("delegate == null");
        } else
        {
            _flddelegate = ac1;
            return;
        }
    }

    public void close()
    {
        _flddelegate.close();
    }

    public final ac _mthdelegate()
    {
        return _flddelegate;
    }

    public void flush()
    {
        _flddelegate.flush();
    }

    public ae timeout()
    {
        return _flddelegate.timeout();
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("(").append(_flddelegate.toString()).append(")").toString();
    }

    public void write(f f, long l)
    {
        _flddelegate.write(f, l);
    }
}
