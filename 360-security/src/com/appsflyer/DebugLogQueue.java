// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DebugLogQueue
{
    public static class Item
    {

        private String msg;
        private long timestamp;

        public String getMsg()
        {
            return msg;
        }

        public long getTimestamp()
        {
            return timestamp;
        }

        public Item(String s)
        {
            msg = s;
            timestamp = (new Date()).getTime();
        }
    }


    private static DebugLogQueue ourInstance = new DebugLogQueue();
    List queue;

    private DebugLogQueue()
    {
        queue = new ArrayList();
    }

    public static DebugLogQueue getInstance()
    {
        return ourInstance;
    }

    public Item pop()
    {
        if (queue.size() == 0)
        {
            return null;
        } else
        {
            Item item = (Item)queue.get(0);
            queue.remove(0);
            return item;
        }
    }

    public void push(String s)
    {
        queue.add(new Item(s));
    }

}
