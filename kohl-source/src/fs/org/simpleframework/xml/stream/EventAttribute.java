// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;


// Referenced classes of package fs.org.simpleframework.xml.stream:
//            Attribute

abstract class EventAttribute
    implements Attribute
{

    EventAttribute()
    {
    }

    public String getPrefix()
    {
        return null;
    }

    public String getReference()
    {
        return null;
    }

    public Object getSource()
    {
        return null;
    }

    public boolean isReserved()
    {
        return false;
    }
}
