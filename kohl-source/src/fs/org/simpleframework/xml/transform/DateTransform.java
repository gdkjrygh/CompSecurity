// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;

import java.util.Date;

// Referenced classes of package fs.org.simpleframework.xml.transform:
//            Transform, DateFactory, DateType

class DateTransform
    implements Transform
{

    private final DateFactory factory;

    public DateTransform(Class class1)
        throws Exception
    {
        factory = new DateFactory(class1);
    }

    public volatile Object read(String s)
        throws Exception
    {
        return read(s);
    }

    public Date read(String s)
        throws Exception
    {
        this;
        JVM INSTR monitorenter ;
        long l = DateType.getDate(s).getTime();
        s = factory.getInstance(new Object[] {
            Long.valueOf(l)
        });
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public volatile String write(Object obj)
        throws Exception
    {
        return write((Date)obj);
    }

    public String write(Date date)
        throws Exception
    {
        this;
        JVM INSTR monitorenter ;
        date = DateType.getText(date);
        this;
        JVM INSTR monitorexit ;
        return date;
        date;
        throw date;
    }
}
