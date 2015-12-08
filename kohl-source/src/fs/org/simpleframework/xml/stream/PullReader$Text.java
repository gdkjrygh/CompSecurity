// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            EventToken, PullReader

private static class source extends EventToken
{

    private final XmlPullParser source;
    private final String text;

    public String getValue()
    {
        return text;
    }

    public boolean isText()
    {
        return true;
    }

    public (XmlPullParser xmlpullparser)
    {
        text = xmlpullparser.getText();
        source = xmlpullparser;
    }
}
