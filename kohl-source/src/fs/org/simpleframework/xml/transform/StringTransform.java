// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;


// Referenced classes of package fs.org.simpleframework.xml.transform:
//            Transform

class StringTransform
    implements Transform
{

    StringTransform()
    {
    }

    public volatile Object read(String s)
        throws Exception
    {
        return read(s);
    }

    public String read(String s)
    {
        return s;
    }

    public volatile String write(Object obj)
        throws Exception
    {
        return write((String)obj);
    }

    public String write(String s)
    {
        return s;
    }
}
