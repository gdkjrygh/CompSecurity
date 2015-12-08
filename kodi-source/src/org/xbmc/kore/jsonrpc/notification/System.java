// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.notification;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.xbmc.kore.jsonrpc.ApiNotification;

public class System
{
    public static class OnQuit extends ApiNotification
    {

        public OnQuit(ObjectNode objectnode)
        {
            super(objectnode);
        }
    }

    public static class OnRestart extends ApiNotification
    {

        public OnRestart(ObjectNode objectnode)
        {
            super(objectnode);
        }
    }

    public static class OnSleep extends ApiNotification
    {

        public OnSleep(ObjectNode objectnode)
        {
            super(objectnode);
        }
    }

}
