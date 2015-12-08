// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern;


public abstract class Converter
{

    Converter next;

    public Converter()
    {
    }

    public abstract String convert(Object obj);

    public final Converter getNext()
    {
        return next;
    }

    public final void setNext(Converter converter)
    {
        if (next != null)
        {
            throw new IllegalStateException("Next converter has been already set");
        } else
        {
            next = converter;
            return;
        }
    }

    public void write(StringBuilder stringbuilder, Object obj)
    {
        stringbuilder.append(convert(obj));
    }
}
