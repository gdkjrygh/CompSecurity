// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import java.util.ArrayList;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            EventNode

abstract class EventElement extends ArrayList
    implements EventNode
{

    EventElement()
    {
    }

    public int getLine()
    {
        return -1;
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
        return true;
    }

    public boolean isText()
    {
        return false;
    }
}
