// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.spi;

import fs.ch.qos.logback.core.joran.event.BodyEvent;
import fs.ch.qos.logback.core.joran.event.EndEvent;
import fs.ch.qos.logback.core.joran.event.SaxEvent;
import fs.ch.qos.logback.core.joran.event.StartEvent;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package fs.ch.qos.logback.core.joran.spi:
//            Interpreter, InterpretationContext

public class EventPlayer
{

    int currentIndex;
    List eventList;
    final Interpreter interpreter;

    public EventPlayer(Interpreter interpreter1)
    {
        interpreter = interpreter1;
    }

    public void addEventsDynamically(List list, int i)
    {
        eventList.addAll(currentIndex + i, list);
    }

    public List getCopyOfPlayerEventList()
    {
        return new ArrayList(eventList);
    }

    public void play(List list)
    {
        eventList = list;
        for (currentIndex = 0; currentIndex < eventList.size(); currentIndex = currentIndex + 1)
        {
            list = (SaxEvent)eventList.get(currentIndex);
            if (list instanceof StartEvent)
            {
                interpreter.startElement((StartEvent)list);
                interpreter.getInterpretationContext().fireInPlay(list);
            }
            if (list instanceof BodyEvent)
            {
                interpreter.getInterpretationContext().fireInPlay(list);
                interpreter.characters((BodyEvent)list);
            }
            if (list instanceof EndEvent)
            {
                interpreter.getInterpretationContext().fireInPlay(list);
                interpreter.endElement((EndEvent)list);
            }
        }

    }
}
