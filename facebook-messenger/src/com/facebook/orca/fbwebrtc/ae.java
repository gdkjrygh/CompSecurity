// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.debug.log.b;
import com.facebook.webrtc.IWebrtcLoggingInterface;

public class ae
    implements IWebrtcLoggingInterface
{

    private static final Class a = com/facebook/orca/fbwebrtc/ae;
    private final av b;

    public ae(av av1)
    {
        b = av1;
    }

    private void a(cb cb1)
    {
        cb1.e("webrtc");
        b.b(cb1);
    }

    public void a(int i, long l)
    {
        cb cb1 = new cb("survey");
        cb1.a("rating5", i);
        cb1.a("call_id", l);
        a(cb1);
    }

    public void a(long l, long l1, long l2, String s, 
            boolean flag, boolean flag1, boolean flag2)
    {
        cb cb1 = new cb("received_offer");
        cb1.a("call_id", l);
        cb1.a("msg_id", l1);
        cb1.a("from", l2);
        cb1.b("source", s);
        cb1.a("duplicate", flag);
        cb1.a("mqtt", flag1);
        cb1.a("wifi", flag2);
        a(cb1);
    }

    public void a(boolean flag)
    {
        cb cb1 = new cb("client_event");
        if (flag)
        {
            cb1.b("content", "disclaimer_accepted");
        } else
        {
            cb1.b("content", "disclaimer_cancel");
        }
        a(cb1);
    }

    public void logCallAction(long l, long l1, String s, String s1)
    {
        cb cb1 = new cb("call_action");
        cb1.a("call_id", l);
        cb1.a("peer_id", l1);
        cb1.b("call_action", s);
        cb1.b("content", s1);
        a(cb1);
    }

    public void logConnectionStatus(boolean flag, String s, long l)
    {
        cb cb1 = new cb("connection_status");
        cb1.b("is_connected", Boolean.toString(flag));
        cb1.a("call_id", l);
        cb1.b("content", s);
        a(cb1);
    }

    public void logInternalError(String s, long l)
    {
        cb cb1 = new cb("internal_error");
        cb1.b("error", s);
        cb1.a("call_id", l);
        a(cb1);
        com.facebook.debug.log.b.e(a, "internal error: callid=%d: %s", new Object[] {
            Long.valueOf(l), s
        });
    }

    public void logMustFix(String s, long l)
    {
        cb cb1 = new cb("must_fix_error");
        cb1.b("error", s);
        cb1.a("call_id", l);
        a(cb1);
        com.facebook.debug.log.b.e(a, "mustfix error: callid=%d: %s", new Object[] {
            Long.valueOf(l), s
        });
    }

    public void logReceivedMessage(String s, long l, long l1, long l2, 
            long l3, String s1)
    {
        cb cb1 = new cb("received_message");
        cb1.b("type", s);
        cb1.a("msg_id", l);
        if (l1 != 0L)
        {
            cb1.a("ack_msg_id", l1);
        }
        cb1.a("call_id", l2);
        cb1.a("from", l3);
        cb1.b("content", s1);
        a(cb1);
    }

    public void logSentMessage(String s, long l, long l1, long l2, 
            long l3, String s1)
    {
        cb cb1 = new cb("sent_message");
        cb1.b("type", s);
        cb1.a("msg_id", l);
        if (l1 != 0L)
        {
            cb1.a("ack_msg_id", l1);
        }
        cb1.a("call_id", l2);
        cb1.a("to", l3);
        cb1.b("content", s1);
        a(cb1);
    }

    public void logSentMessageFailure(long l, int i, String s, String s1, long l1)
    {
        cb cb1 = new cb("send_failed");
        cb1.a("msg_id", l);
        cb1.b("error", s1);
        cb1.a("error_code", i);
        cb1.b("error_domain", s);
        cb1.a("call_id", l1);
        a(cb1);
    }

    public void logSentMessageSuccess(long l, long l1)
    {
        cb cb1 = new cb("send_succeeded");
        cb1.a("msg_id", l);
        cb1.a("call_id", l1);
        a(cb1);
    }

}
