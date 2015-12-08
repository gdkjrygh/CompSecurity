// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ax;


// Referenced classes of package p.ax:
//            b

public class a extends Exception
{

    protected Throwable a;
    private b b;

    public a(String s, Throwable throwable, b b1)
    {
        super((new StringBuilder()).append(s).append(" --- Check inner exception for diagnostic details").toString());
        a = null;
        b = null;
        a = throwable;
        b = b1;
    }

    public a(String s, b b1)
    {
        super(s);
        a = null;
        b = null;
        b = b1;
    }

    public a(Throwable throwable)
    {
        super(throwable.getMessage());
        a = null;
        b = null;
        a = throwable;
    }

    public b a()
    {
        return b;
    }

    public String toString()
    {
        String s = getClass().getName();
        String s1 = (new StringBuilder()).append(s).append(": ").append(getMessage()).toString();
        s = s1;
        if (a() != null)
        {
            s = (new StringBuilder()).append(s1).append("\nSyncExceptionCause: ").append(a().name()).toString();
        }
        s1 = s;
        if (a != null)
        {
            s1 = (new StringBuilder()).append(s).append("\nnested: ").append(a.toString()).toString();
            a.printStackTrace();
        }
        return s1;
    }
}
