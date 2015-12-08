// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import javax.xml.stream.events.Characters;
import javax.xml.stream.events.XMLEvent;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            EventToken, StreamReader

private static class text extends EventToken
{

    private final Characters text;

    public String getValue()
    {
        return text.getData();
    }

    public boolean isText()
    {
        return true;
    }

    public _cls9(XMLEvent xmlevent)
    {
        text = xmlevent.asCharacters();
    }
}
