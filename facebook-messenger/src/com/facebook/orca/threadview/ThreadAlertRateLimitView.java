// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.inject.t;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.compose.ap;
import com.facebook.orca.f.k;
import com.facebook.orca.notify.as;
import com.facebook.orca.prefs.az;
import com.facebook.orca.prefs.n;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.f;
import com.facebook.widget.d;
import com.google.common.a.es;
import com.google.common.base.Objects;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.threadview:
//            ao, ap

public class ThreadAlertRateLimitView extends d
{

    private final com.facebook.prefs.shared.d a;
    private final as b;
    private final k c;
    private final az d;
    private final f e;
    private String f;
    private ae g;
    private MessagesCollection h;
    private ap i;

    public ThreadAlertRateLimitView(Context context)
    {
        this(context, null, 0);
    }

    public ThreadAlertRateLimitView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ThreadAlertRateLimitView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        i = ap.SHRUNK;
        context = getInjector();
        a = (com.facebook.prefs.shared.d)context.a(com/facebook/prefs/shared/d);
        b = (as)context.a(com/facebook/orca/notify/as);
        c = (k)context.a(com/facebook/orca/f/k);
        d = (az)context.a(com/facebook/orca/prefs/az);
        setContentView(com.facebook.k.orca_thread_alert_rate_limit_view);
        setOnClickListener(new ao(this));
        e = new com.facebook.orca.threadview.ap(this);
        a.a(e);
    }

    private void a()
    {
        d.c("thread_mute_rate_limit_dismissed");
        b();
    }

    static void a(ThreadAlertRateLimitView threadalertratelimitview)
    {
        threadalertratelimitview.a();
    }

    static void a(ThreadAlertRateLimitView threadalertratelimitview, ae ae1)
    {
        threadalertratelimitview.a(ae1);
    }

    private void a(ae ae1)
    {
        if (n.o.equals(ae1) || ae1.equals(g))
        {
            b();
        }
    }

    private void b()
    {
        int j;
        if (c())
        {
            j = 0;
        } else
        {
            j = 8;
        }
        setVisibility(j);
    }

    private boolean c()
    {
        long l;
        l = System.currentTimeMillis();
        break MISSING_BLOCK_LABEL_4;
        if (l - d.b("thread_mute_rate_limit_dismissed") >= 0x5265c00L && i != ap.EXPANDED)
        {
            com.facebook.orca.notify.NotificationSetting notificationsetting = b.a();
            com.facebook.orca.notify.NotificationSetting notificationsetting1 = b.a(f);
            if (b.a(notificationsetting) && b.a(notificationsetting1) && d.a("thread_mute") <= 5 && d.a("thread_mute", f) < 2 && l - d.b("thread_mute", f) >= 0x5265c00L && d())
            {
                return true;
            }
        }
        return false;
    }

    private boolean d()
    {
        if (h != null) goto _L2; else goto _L1
_L1:
        com.facebook.user.UserKey userkey;
        return false;
_L2:
        if ((userkey = c.b()) == null) goto _L1; else goto _L3
_L3:
        int l;
        long l1 = System.currentTimeMillis();
        Iterator iterator = h.b().iterator();
        int j = 0;
        do
        {
            l = j;
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            Message message = (Message)iterator.next();
            l = j;
            if (message.f() <= l1 - 0x2bf20L)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!Objects.equal(message.i().e(), userkey))
            {
                j++;
            }
        } while (j < 10);
        l = j;
        if (l < 10) goto _L1; else goto _L4
_L4:
        return true;
    }

    public void setComposeMode(ap ap1)
    {
        i = ap1;
        b();
    }

    void setMessages(MessagesCollection messagescollection)
    {
        h = messagescollection;
        b();
    }

    void setThread(ThreadViewSpec threadviewspec)
    {
        if (threadviewspec.a())
        {
            f = threadviewspec.d();
            g = n.a(f);
        } else
        {
            f = null;
            g = null;
        }
        b();
    }
}
