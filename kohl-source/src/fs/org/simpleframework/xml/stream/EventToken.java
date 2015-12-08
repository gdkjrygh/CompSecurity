// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import java.util.Iterator;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            EventNode

abstract class EventToken
    implements EventNode
{

    EventToken()
    {
    }

    public int getLine()
    {
        return -1;
    }

    public String getName()
    {
        return null;
    }

    public String getValue()
    {
        return null;
    }

    public boolean isEnd()
    {
        return false;
    }

    public boolean isStart()
    {
        return false;
    }

    public boolean isText()
    {
        return false;
    }

    public Iterator iterator()
    {
        return null;
    }
}
