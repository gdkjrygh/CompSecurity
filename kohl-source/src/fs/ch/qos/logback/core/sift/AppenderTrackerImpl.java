// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.sift;

import fs.ch.qos.logback.core.Appender;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Referenced classes of package fs.ch.qos.logback.core.sift:
//            AppenderTracker

public class AppenderTrackerImpl
    implements AppenderTracker
{
    private class Entry
    {

        String key;
        Entry next;
        Entry prev;
        final AppenderTrackerImpl this$0;
        long timestamp;
        Appender value;

        public boolean equals(Object obj)
        {
            if (this != obj) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Entry)obj;
            if (key == null)
            {
                if (((Entry) (obj)).key != null)
                {
                    return false;
                }
            } else
            if (!key.equals(((Entry) (obj)).key))
            {
                return false;
            }
            if (value != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((Entry) (obj)).value == null) goto _L1; else goto _L3
_L3:
            return false;
            if (value.equals(((Entry) (obj)).value)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public int hashCode()
        {
            int i;
            if (key == null)
            {
                i = 0;
            } else
            {
                i = key.hashCode();
            }
            return i + 31;
        }

        public void setTimestamp(long l)
        {
            timestamp = l;
        }

        public String toString()
        {
            return (new StringBuilder()).append("(").append(key).append(", ").append(value).append(")").toString();
        }

        Entry(String s, Appender appender, long l)
        {
            this$0 = AppenderTrackerImpl.this;
            super();
            key = s;
            value = appender;
            timestamp = l;
        }
    }


    Entry head;
    long lastCheck;
    Map map;
    Entry tail;

    AppenderTrackerImpl()
    {
        map = new HashMap();
        lastCheck = 0L;
        head = new Entry(null, null, 0L);
        tail = head;
    }

    private boolean isEntryStale(Entry entry, long l)
    {
        while (!entry.value.isStarted() || entry.timestamp + 0x1b7740L < l) 
        {
            return true;
        }
        return false;
    }

    private void moveToTail(Entry entry)
    {
        rearrangePreexistingLinks(entry);
        rearrangeTailLinks(entry);
    }

    private void rearrangePreexistingLinks(Entry entry)
    {
        if (entry.prev != null)
        {
            entry.prev.next = entry.next;
        }
        if (entry.next != null)
        {
            entry.next.prev = entry.prev;
        }
        if (head == entry)
        {
            head = entry.next;
        }
    }

    private void rearrangeTailLinks(Entry entry)
    {
        if (head == tail)
        {
            head = entry;
        }
        Entry entry1 = tail.prev;
        if (entry1 != null)
        {
            entry1.next = entry;
        }
        entry.prev = entry1;
        entry.next = tail;
        tail.prev = entry;
    }

    private void removeHead()
    {
        map.remove(head.key);
        head = head.next;
        head.prev = null;
    }

    public Appender get(String s, long l)
    {
        this;
        JVM INSTR monitorenter ;
        s = (Entry)map.get(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s.setTimestamp(l);
        moveToTail(s);
        s = ((Entry) (s)).value;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public void put(String s, Appender appender, long l)
    {
        this;
        JVM INSTR monitorenter ;
        Entry entry1 = (Entry)map.get(s);
        Entry entry;
        entry = entry1;
        if (entry1 != null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        entry = new Entry(s, appender, l);
        map.put(s, entry);
        moveToTail(entry);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void stopStaleAppenders(long l)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = lastCheck;
        if (l1 + 1000L <= l) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        lastCheck = l;
        while (head.value != null && isEntryStale(head, l)) 
        {
            head.value.stop();
            removeHead();
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public List valueList()
    {
        LinkedList linkedlist = new LinkedList();
        for (Entry entry = head; entry != tail; entry = entry.next)
        {
            linkedlist.add(entry.value);
        }

        return linkedlist;
    }
}
