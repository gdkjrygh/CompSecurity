// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;


public class Capture
{

    private Object value;

    public Capture()
    {
    }

    public Capture(Object obj)
    {
        value = obj;
    }

    public Object get()
    {
        return value;
    }

    public void set(Object obj)
    {
        value = obj;
    }
}
