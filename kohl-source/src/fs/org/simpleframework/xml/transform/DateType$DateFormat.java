// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;

import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package fs.org.simpleframework.xml.transform:
//            DateType

private static class format
{

    private SimpleDateFormat format;

    public Date getDate(String s)
        throws Exception
    {
        this;
        JVM INSTR monitorenter ;
        s = format.parse(s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public String getText(Date date)
        throws Exception
    {
        this;
        JVM INSTR monitorenter ;
        date = format.format(date);
        this;
        JVM INSTR monitorexit ;
        return date;
        date;
        throw date;
    }

    public (String s)
    {
        format = new SimpleDateFormat(s);
    }
}
