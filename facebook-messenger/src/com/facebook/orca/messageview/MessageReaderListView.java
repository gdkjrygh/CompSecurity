// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.messageview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.o;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.n;
import com.facebook.orca.threadview.RowReceiptParticipant;
import com.facebook.widget.f;
import com.google.common.a.es;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.messageview:
//            a, ReadView

public class MessageReaderListView extends f
{

    private n a;
    private ReadView b;
    private LinearLayout c;
    private ReadView d;
    private a e;

    public MessageReaderListView(Context context)
    {
        super(context);
        a(context);
    }

    public MessageReaderListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    public MessageReaderListView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a(context);
    }

    private String a(RowReceiptParticipant rowreceiptparticipant)
    {
        StringBuilder stringbuilder = new StringBuilder(30);
        stringbuilder.append(rowreceiptparticipant.a().d());
        stringbuilder.append(" \267 ");
        stringbuilder.append(a.c(rowreceiptparticipant.b()));
        return stringbuilder.toString();
    }

    private void a()
    {
        int j;
        int l;
        if (e.a() != null)
        {
            j = e.a().size();
        } else
        {
            j = 0;
        }
        if (e.b() != null)
        {
            l = e.b().size();
        } else
        {
            l = 0;
        }
        b.setVisibility(0);
        if (e.c().j().size() - 1 == j + l && a(e.a()))
        {
            b.setText(getContext().getString(o.message_seen_receipt_group_everyone));
            b.setShowReadReceiptIcon(true);
        } else
        {
            if (b(e.a()))
            {
                b();
            }
            if (b(e.b()))
            {
                c();
                return;
            }
        }
    }

    private void a(Context context)
    {
        setContentView(k.orca_message_reader_list);
        a = (n)getInjector().a(com/facebook/orca/threads/n);
        b = (ReadView)getView(i.message_read_header);
        c = (LinearLayout)getView(i.message_read_timestamp);
        d = (ReadView)getView(i.message_read_without_timestamp);
    }

    private boolean a(List list)
    {
        return list == null || list.isEmpty();
    }

    private boolean a(List list, List list1)
    {
        return a(list) && list1.size() == 1;
    }

    private void b()
    {
        b.setText(getContext().getString(o.message_seen_receipt_group_header));
        b.setShowReadReceiptIcon(false);
        if (a(e.b(), e.a()))
        {
            b.setText(getContext().getString(o.message_seen_receipt_group_single, new Object[] {
                a((RowReceiptParticipant)e.a().get(0))
            }));
            b.setShowReadReceiptIcon(true);
            return;
        }
        ReadView readview;
        for (Iterator iterator = e.a().iterator(); iterator.hasNext(); c.addView(readview))
        {
            RowReceiptParticipant rowreceiptparticipant = (RowReceiptParticipant)iterator.next();
            readview = new ReadView(getContext());
            readview.setText(a(rowreceiptparticipant));
        }

        c.setVisibility(0);
    }

    private boolean b(List list)
    {
        return list != null && !list.isEmpty();
    }

    private void c()
    {
        if (d())
        {
            if (!b(e.a()))
            {
                b.setVisibility(8);
            }
            return;
        }
        if (a(e.a(), e.b()))
        {
            b.setText(getContext().getString(o.message_seen_receipt_group_single, new Object[] {
                ((ParticipantInfo)e.b().get(0)).d()
            }));
            b.setShowReadReceiptIcon(true);
            return;
        }
        StringBuilder stringbuilder = new StringBuilder(50);
        Iterator iterator = e.b().iterator();
        boolean flag = true;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ParticipantInfo participantinfo = (ParticipantInfo)iterator.next();
            if (!Objects.equal(participantinfo.e(), e.d().i().e()))
            {
                if (!flag)
                {
                    stringbuilder.append(", ");
                } else
                {
                    flag = false;
                }
                stringbuilder.append(participantinfo.d());
            }
        } while (true);
        if (b(e.a()))
        {
            b.setShowReadReceiptIcon(false);
            d.setText(stringbuilder.toString());
            d.setVisibility(0);
            return;
        } else
        {
            b.setText(getContext().getString(o.message_seen_receipt_group_multiple, new Object[] {
                stringbuilder.toString()
            }));
            b.setShowReadReceiptIcon(true);
            return;
        }
    }

    private boolean d()
    {
        return e.b().size() == 1 && Objects.equal(((ParticipantInfo)e.b().get(0)).e(), e.d().i().e());
    }

    public void setParameters(a a1)
    {
        Preconditions.checkNotNull("Message cannot be null", a1.d());
        Preconditions.checkNotNull("ThreadSummary cannot be null", a1.c());
        b.setVisibility(8);
        c.setVisibility(8);
        d.setVisibility(8);
        if (b(a1.a()) || b(a1.b()))
        {
            e = a1;
            a();
        }
    }
}
