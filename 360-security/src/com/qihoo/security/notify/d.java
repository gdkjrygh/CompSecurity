// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.notify;

import android.app.Notification;
import android.content.Context;
import android.os.Message;
import android.widget.RemoteViews;
import com.qihoo.utils.notice.c;
import com.qihoo360.mobilesafe.b.i;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.notify:
//            b

public class d extends b
{

    public d(Context context)
    {
        super(context);
    }

    private CharSequence e()
    {
        int j;
label0:
        {
            String s1 = c.a(0x7f0c0177);
            long l = SharedPref.b(b, "malware_protect_days", 0L);
            long l1 = System.currentTimeMillis() - l;
            String s = s1;
            if (l != 0L)
            {
                s = s1;
                if (l1 > 0L)
                {
                    j = (int)Math.ceil((float)l1 / 8.64E+07F);
                    if (j > 1)
                    {
                        break label0;
                    }
                    s = c.a(0x7f0c01db, new Object[] {
                        Integer.valueOf(1)
                    });
                }
            }
            return s;
        }
        return c.a(0x7f0c01dc, new Object[] {
            Integer.valueOf(j)
        });
    }

    public void a(int j)
    {
    }

    protected void a(Message message)
    {
    }

    public void c()
    {
        if (i.a())
        {
            b();
        } else
        {
            if (com.qihoo.utils.notice.c.a(b))
            {
                b();
                return;
            }
            if (f)
            {
                a();
                e.contentView = new RemoteViews(b.getPackageName(), 0x7f03007f);
                e.contentView.setTextViewText(0x7f0b0197, c.a(0x7f0c01d2));
                e.contentView.setTextViewText(0x7f0b0198, e());
                a(277, e);
                return;
            }
        }
    }

    protected void d()
    {
    }
}
