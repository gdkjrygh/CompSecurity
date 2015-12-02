// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.net.NetworkInfo;
import com.facebook.common.hardware.k;
import com.facebook.common.time.a;
import com.facebook.common.w.m;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.google.common.a.ik;
import com.google.common.base.Strings;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.analytics:
//            av, cb

public class cn
{

    private static final Class b = com/facebook/analytics/cn;
    protected final av a;
    private final a c;
    private final javax.inject.a d;
    private final k e;

    public cn(av av1, a a1, javax.inject.a a2, k k1)
    {
        a = av1;
        c = a1;
        d = a2;
        e = k1;
    }

    private String a()
    {
        return Long.toString(c.a());
    }

    private void b(String s, String s1, Map map, String s2, String s3)
    {
        s = c(s, s1, map, s2, s3);
        a.b(s);
    }

    private cb c(String s, String s1, Map map, String s2, String s3)
    {
        cb cb1 = new cb(m.a(s));
        if (s1 != null)
        {
            cb1.b("status", m.a(s1));
        }
        if (s3 != null)
        {
            cb1.g(s3);
        }
        if (s2 != null)
        {
            cb1.f(s2);
        }
        if (map != null)
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); cb1.b((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
        com.facebook.debug.log.b.b(b, "Reliability event. Category: %s, Status %s, Object Type %s, Object ID %s, Map:\n %s", new Object[] {
            s, s1, s2, s3, map
        });
        return cb1;
    }

    protected transient Map a(String as[])
    {
        if (as.length % 2 != 0)
        {
            throw new IllegalArgumentException("Map must have an even (or zero) number of parameters");
        }
        java.util.HashMap hashmap = ik.a();
        for (int i = 0; i < as.length; i += 2)
        {
            if (as[i] == null || as[i + 1] == null)
            {
                com.facebook.debug.log.b.e(b, "Reliability Logging parameter %d or %d is null", new Object[] {
                    Integer.valueOf(i), Integer.valueOf(i + 1)
                });
            }
            hashmap.put(Strings.nullToEmpty(as[i]), Strings.nullToEmpty(as[i + 1]));
        }

        return hashmap;
    }

    public void a(String s, long l, int i, int j, int i1, boolean flag)
    {
        s = a(new String[] {
            "offline_threading_id", s, "total_attachment_size", Long.toString(l), "photo_attachment_count", Integer.toString(i), "audio_attachment_count", Integer.toString(j), "fbid_attachment_count", Integer.toString(i1), 
            "are_photo_attachments_pre_uploaded", Boolean.toString(flag), "current_time", a()
        });
        a(((Map) (s)));
        a("msg_send_attempted", ((String) (null)), ((Map) (s)), ((String) (null)), ((String) (null)));
    }

    public void a(String s, long l, long l1, long l2, 
            Throwable throwable)
    {
        Object obj = throwable.getCause();
        String s1 = Long.toString(l);
        String s2 = Long.toString(l1);
        String s3 = throwable.getClass().getName();
        String s4 = throwable.getMessage();
        if (obj == null)
        {
            throwable = "";
        } else
        {
            throwable = obj.getClass().getName();
        }
        if (obj == null)
        {
            obj = "";
        } else
        {
            obj = ((Throwable) (obj)).getMessage();
        }
        b("create_thread", "failed", a(new String[] {
            "offline_threading_id", s, "sent_timestamp_ms", s1, "send_time_delta", s2, "error_type", s3, "error_message", s4, 
            "error_type_internal", throwable, "error_message_internal", obj, "total_attachment_size", Long.toString(l2), "current_time", a()
        }), null, null);
    }

    public void a(String s, String s1)
    {
        a("msg_error_displayed", ((String) (null)), a(new String[] {
            "offline_threading_id", s, "send_error", s1
        }), ((String) (null)), ((String) (null)));
    }

    public void a(String s, String s1, int i)
    {
        a("msg_cant_send_via_mqtt", ((String) (null)), a(new String[] {
            "offline_threading_id", s, "reason", s1, "attempt_number", Integer.toString(i)
        }), ((String) (null)), ((String) (null)));
    }

    public void a(String s, String s1, long l, long l1, long l2)
    {
        a("create_thread", "success", a(new String[] {
            "thread_id", s, "offline_threading_id", s1, "sent_timestamp_ms", Long.toString(l), "send_time_delta", Long.toString(l1), "total_attachment_size", Long.toString(l2), 
            "current_time", a()
        }), ((String) (null)), ((String) (null)));
    }

    public void a(String s, String s1, long l, long l1, long l2, String s2, int i)
    {
        a((new StringBuilder()).append("messaging_send_").append(s2).toString(), "success", a(new String[] {
            "thread_id", s, "offline_threading_id", s1, "sent_timestamp_ms", Long.toString(l), "send_time_delta", Long.toString(l1), "total_attachment_size", Long.toString(l2), 
            "current_time", a(), "attempt_number", Integer.toString(i)
        }), ((String) (null)), ((String) (null)));
    }

    public void a(String s, String s1, long l, long l1, long l2, String s2, int i, String s3, int j)
    {
        b("messaging_send_via_mqtt", "failed", a(new String[] {
            "thread_id", s, "offline_threading_id", s1, "sent_timestamp_ms", Long.toString(l), "send_time_delta", Long.toString(l1), "error_message", s2, 
            "error_number", Integer.toString(i), "mqtt_push_state", s3, "total_attachment_size", Long.toString(l2), "current_time", a(), "attempt_number", Integer.toString(j)
        }), null, null);
    }

    public void a(String s, String s1, long l, long l1, long l2, Throwable throwable, String s2, int i)
    {
        String s3 = (new StringBuilder()).append("messaging_send_").append(s2).toString();
        s2 = throwable.getCause();
        String s4 = Long.toString(l);
        String s5 = Long.toString(l1);
        String s6 = throwable.getClass().getName();
        String s7 = throwable.getMessage();
        if (s2 == null)
        {
            throwable = "";
        } else
        {
            throwable = s2.getClass().getName();
        }
        if (s2 == null)
        {
            s2 = "";
        } else
        {
            s2 = s2.getMessage();
        }
        b(s3, "failed", a(new String[] {
            "thread_id", s, "offline_threading_id", s1, "sent_timestamp_ms", s4, "send_time_delta", s5, "error_type", s6, 
            "error_message", s7, "error_type_internal", throwable, "error_message_internal", s2, "total_attachment_size", Long.toString(l2), "current_time", a(), 
            "attempt_number", Integer.toString(i)
        }), null, null);
    }

    public void a(String s, String s1, String s2, String s3)
    {
        a((new StringBuilder()).append("messaging_push_notif_").append(s2).toString(), s3, a(new String[] {
            "thread_id", s1
        }), "message_id", s);
    }

    public void a(String s, String s1, Map map, String s2, String s3)
    {
        if (((Boolean)d.b()).booleanValue())
        {
            b(s, s1, map, s2, s3);
            return;
        } else
        {
            s = c(s, s1, map, s2, s3);
            a.a(s);
            return;
        }
    }

    protected void a(Map map)
    {
        String s = null;
        Object obj = e.c();
        String s1;
        String s2;
        if (obj != null)
        {
            s1 = ((NetworkInfo) (obj)).getTypeName();
            s = ((NetworkInfo) (obj)).getSubtypeName();
            obj = ((NetworkInfo) (obj)).getExtraInfo();
        } else
        {
            obj = null;
            s1 = null;
        }
        s1 = n.a(s1);
        obj = n.a(((String) (obj)));
        s = n.a(s);
        s2 = Integer.toString(e.d());
        map.put("network_is_connected", Boolean.toString(e.b()));
        map.put("network_type", s1);
        map.put("network_subtype", obj);
        map.put("network_extra_info", s);
        map.put("network_wifi_rssi", s2);
    }

    public void b(String s, long l, int i, int j, int i1, boolean flag)
    {
        s = a(new String[] {
            "offline_threading_id", s, "total_attachment_size", Long.toString(l), "photo_attachment_count", Integer.toString(i), "audio_attachment_count", Integer.toString(j), "fbid_attachment_count", Integer.toString(i1), 
            "are_photo_attachments_pre_uploaded", Boolean.toString(flag), "current_time", a()
        });
        a(s);
        a("msg_create_thread_attempted", ((String) (null)), s, ((String) (null)), ((String) (null)));
    }

    public void b(String s, String s1)
    {
        a("msg_error_retry_selected", ((String) (null)), a(new String[] {
            "offline_threading_id", s, "send_error", s1
        }), ((String) (null)), ((String) (null)));
    }

    public void b(String s, String s1, int i)
    {
        a((new StringBuilder()).append("messaging_push_notif_").append(s).toString(), s1, a(new String[] {
            "total_deleted", Integer.toString(i)
        }), ((String) (null)), ((String) (null)));
    }

    public void b(String s, String s1, long l, long l1, long l2, String s2, int i)
    {
        b((new StringBuilder()).append("messaging_send_").append(s2).toString(), "skipped", a(new String[] {
            "thread_id", s, "offline_threading_id", s1, "sent_timestamp_ms", Long.toString(l), "send_time_delta", Long.toString(l1), "total_attachment_size", Long.toString(l2), 
            "current_time", a(), "attempt_number", Integer.toString(i)
        }), null, null);
    }

}
