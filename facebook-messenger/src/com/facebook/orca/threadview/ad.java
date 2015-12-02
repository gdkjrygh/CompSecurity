// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.messages.model.threads.Message;
import com.facebook.orca.attachments.AudioAttachmentData;
import com.facebook.orca.attachments.ImageAttachmentData;
import com.facebook.orca.attachments.f;
import com.google.common.a.es;
import com.google.common.base.Objects;
import java.util.List;

// Referenced classes of package com.facebook.orca.threadview:
//            ac, ae

public class ad extends ac
{

    private final Message a;
    private final ae b;
    private final List c;
    private final AudioAttachmentData d;
    private boolean e;
    private com.facebook.messages.model.threads.f f;

    public ad(Message message, com.facebook.messages.model.threads.f f1, List list, AudioAttachmentData audioattachmentdata)
    {
        this(message, f1, list, audioattachmentdata, null);
    }

    public ad(Message message, com.facebook.messages.model.threads.f f1, List list, AudioAttachmentData audioattachmentdata, ae ae1)
    {
        a = message;
        c = list;
        d = audioattachmentdata;
        b = ae1;
        f = f1;
    }

    private int e()
    {
        f f1 = ((ImageAttachmentData)c.get(0)).g();
        if (f1 == f.PORTRAIT || f1 == f.SQUARE || f1 == f.UNKNOWN)
        {
            return !f.b(a) ? 7 : 16;
        }
        return !f.b(a) ? 8 : 17;
    }

    public int a()
    {
        byte byte0 = 6;
        if (a.t())
        {
            byte0 = 0;
        } else
        {
            if (d != null)
            {
                return !f.b(a) ? 14 : 23;
            }
            if (c == null || c.isEmpty())
            {
                if (f.b(a))
                {
                    return 15;
                }
            } else
            {
                if (c.size() == 1)
                {
                    return e();
                }
                int i = Math.min(c.size(), 6) - 2;
                if (f.b(a))
                {
                    return i + 18;
                } else
                {
                    return i + 9;
                }
            }
        }
        return byte0;
    }

    public void a(boolean flag)
    {
        e = flag;
    }

    public Message b()
    {
        return a;
    }

    public boolean c()
    {
        return e;
    }

    public ae d()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        boolean flag3 = true;
        if (!(obj instanceof ad))
        {
            return false;
        }
        Message message = b();
        Message message1 = ((ad)obj).b();
        ae ae1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (message.d() != null && message1.d() != null && Objects.equal(message.d(), message1.d()))
        {
            flag2 = true;
        } else
        if (message.w() != null && message1.w() != null)
        {
            flag2 = Objects.equal(message.w(), message1.w());
        } else
        {
            flag2 = false;
        }
        ae1 = d();
        obj = ((ad)obj).d();
        if (ae1 == null && obj == null || ae1 != null && obj != null && ae1.equals(obj))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (message.p() == null && message1.p() == null || message.p() != null && message1.p() != null && message.p().size() == message1.p().size())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag2 && flag && flag1 && message.f() == message1.f() && message.h() == message1.h() && message.u() == message1.u() && message.A() == message1.A())
        {
            flag2 = flag3;
        } else
        {
            flag2 = false;
        }
        return flag2;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (b().d() != null)
        {
            i = b().d().hashCode();
        } else
        {
            i = 0;
        }
        if (b().w() != null)
        {
            j = b().w().hashCode();
        }
        return i * 31 + j;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("RowMessageItem{message=").append(a).append(", rowReceiptItem=");
        Object obj;
        if (b != null)
        {
            obj = b;
        } else
        {
            obj = "";
        }
        return stringbuilder.append(obj).append('}').toString();
    }
}
