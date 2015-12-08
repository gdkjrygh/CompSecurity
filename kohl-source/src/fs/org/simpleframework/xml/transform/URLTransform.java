// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;

import java.net.URL;

// Referenced classes of package fs.org.simpleframework.xml.transform:
//            Transform

class URLTransform
    implements Transform
{

    URLTransform()
    {
    }

    public volatile Object read(String s)
        throws Exception
    {
        return read(s);
    }

    public URL read(String s)
        throws Exception
    {
        return new URL(s);
    }

    public volatile String write(Object obj)
        throws Exception
    {
        return write((URL)obj);
    }

    public String write(URL url)
        throws Exception
    {
        return url.toString();
    }
}
