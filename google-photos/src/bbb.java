// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class bbb extends qst
{

    public bbb(String s)
    {
        super(s);
    }

    public abstract long[] d();

    public String toString()
    {
        String s = String.valueOf(getClass().getSimpleName());
        int i = d().length;
        return (new StringBuilder(String.valueOf(s).length() + 24)).append(s).append("[entryCount=").append(i).append("]").toString();
    }
}
