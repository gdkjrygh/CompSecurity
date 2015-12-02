// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.common.w.n;
import com.facebook.location.Coordinates;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.google.common.base.Objects;
import java.util.List;

// Referenced classes of package com.facebook.orca.threadview:
//            ac, af, RowReceiptParticipant

public class ae extends ac
{

    private final List a;
    private final ParticipantInfo b;
    private final String c;
    private final af d;
    private final String e;
    private final String f;
    private final long g;
    private final long h;
    private final long i;
    private final Coordinates j;
    private final boolean k;
    private final int l;

    private ae(ParticipantInfo participantinfo, af af1, Message message)
    {
        b = participantinfo;
        c = message.z();
        d = af1;
        a = null;
        e = message.d();
        f = message.w();
        g = message.f();
        h = message.h();
        i = -1L;
        j = message.n();
        k = false;
        l = 0;
    }

    private ae(List list, af af1, Message message, long l1)
    {
        this(list, af1, message, l1, false, 0);
    }

    private ae(List list, af af1, Message message, long l1, boolean flag, int i1)
    {
        a = list;
        d = af1;
        b = null;
        c = null;
        e = message.d();
        f = message.w();
        g = message.f();
        h = message.h();
        i = l1;
        j = message.n();
        k = flag;
        l = i1;
    }

    private ae(List list, af af1, Message message, boolean flag, int i1)
    {
        this(list, af1, message, -1L, flag, i1);
    }

    public static ae a(Message message)
    {
        return new ae(null, af.PENDING, message);
    }

    public static ae a(ParticipantInfo participantinfo, Message message)
    {
        return new ae(participantinfo, af.SENT_FROM_RECEIPT, message);
    }

    public static ae a(List list, Message message, long l1)
    {
        return new ae(list, af.READ, message, l1);
    }

    public static ae a(List list, Message message, boolean flag, int i1)
    {
        return new ae(list, af.GROUP_READ, message, flag, i1);
    }

    public static ae b(Message message)
    {
        return new ae(null, af.SENT_BY_ME_TO_SERVER, message);
    }

    public static ae b(ParticipantInfo participantinfo, Message message)
    {
        return new ae(participantinfo, af.DELIVERED, message);
    }

    public static ae c(Message message)
    {
        return new ae(null, af.FAILED_TO_SEND, message);
    }

    public int a()
    {
        return 4;
    }

    public boolean a(ParticipantInfo participantinfo, ParticipantInfo participantinfo1)
    {
        return Objects.equal(participantinfo.a(), participantinfo1.a()) && Objects.equal(participantinfo.e(), participantinfo1.e()) && Objects.equal(participantinfo.d(), participantinfo1.d());
    }

    public boolean a(ae ae1)
    {
        boolean flag1;
        flag1 = false;
        ae1 = ae1.c();
        if (c() != null || ae1 != null) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (c() != null)
        {
            flag = flag1;
            if (ae1 != null)
            {
                flag = flag1;
                if (c().size() == ae1.size())
                {
                    int i1 = 0;
label0:
                    do
                    {
label1:
                        {
                            if (i1 >= c().size())
                            {
                                break label1;
                            }
                            flag = flag1;
                            if (!a(((RowReceiptParticipant)c().get(i1)).a(), ((RowReceiptParticipant)ae1.get(i1)).a()))
                            {
                                break label0;
                            }
                            i1++;
                        }
                    } while (true);
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return true;
    }

    public af b()
    {
        return d;
    }

    public List c()
    {
        return a;
    }

    public String d()
    {
        return c;
    }

    public String e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (!(obj instanceof ae))
        {
            return false;
        }
        obj = (ae)obj;
        boolean flag;
        if (!n.a(e()) && !n.a(((ae) (obj)).e()) && Objects.equal(e(), ((ae) (obj)).e()))
        {
            flag = true;
        } else
        if (!n.a(f()) && !n.a(((ae) (obj)).f()))
        {
            flag = Objects.equal(f(), ((ae) (obj)).f());
        } else
        {
            flag = false;
        }
        if (flag && b().equals(((ae) (obj)).b()) && a(((ae) (obj))))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public String f()
    {
        return f;
    }

    public long g()
    {
        return g;
    }

    public long h()
    {
        return i;
    }

    public int hashCode()
    {
        int j1 = 0;
        int i1;
        if (e() != null)
        {
            i1 = e().hashCode();
        } else
        {
            i1 = 0;
        }
        if (f() != null)
        {
            j1 = f().hashCode();
        }
        return i1 * 31 + j1;
    }

    public Coordinates i()
    {
        return j;
    }

    public boolean j()
    {
        return k;
    }

    public int k()
    {
        return l;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("RowReceiptItem{, readers=");
        Object obj;
        if (a != null)
        {
            obj = a;
        } else
        {
            obj = "";
        }
        stringbuilder = stringbuilder.append(obj).append(", senderOrDeliveree=");
        if (b != null)
        {
            obj = b;
        } else
        {
            obj = "";
        }
        stringbuilder = stringbuilder.append(obj).append(", messageSource='");
        if (c != null)
        {
            obj = c;
        } else
        {
            obj = "";
        }
        stringbuilder = stringbuilder.append(((String) (obj))).append('\'').append(", type=").append(d).append(", messageId='");
        if (e != null)
        {
            obj = e;
        } else
        {
            obj = "";
        }
        stringbuilder = stringbuilder.append(((String) (obj))).append('\'').append(", offlineThreadingId='");
        if (f != null)
        {
            obj = f;
        } else
        {
            obj = "";
        }
        return stringbuilder.append(((String) (obj))).append('\'').append(", timestampMs=").append(g).append(", sentTimestampMs=").append(h).append(", receiptTimestampMs=").append(i).append('}').toString();
    }
}
