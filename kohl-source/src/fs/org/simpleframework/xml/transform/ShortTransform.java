// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;


// Referenced classes of package fs.org.simpleframework.xml.transform:
//            Transform

class ShortTransform
    implements Transform
{

    ShortTransform()
    {
    }

    public volatile Object read(String s)
        throws Exception
    {
        return read(s);
    }

    public Short read(String s)
    {
        return Short.valueOf(s);
    }

    public volatile String write(Object obj)
        throws Exception
    {
        return write((Short)obj);
    }

    public String write(Short short1)
    {
        return short1.toString();
    }
}
