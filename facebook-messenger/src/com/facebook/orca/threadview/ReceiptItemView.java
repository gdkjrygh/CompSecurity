// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.facebook.common.executors.a;
import com.facebook.common.w.n;
import com.facebook.h;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.location.c;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.o;
import com.facebook.orca.common.ui.widgets.text.RowReceiptTextView;
import com.facebook.orca.common.ui.widgets.text.e;
import com.facebook.orca.k.b;
import com.facebook.orca.threads.s;
import com.facebook.widget.f;
import java.util.List;

// Referenced classes of package com.facebook.orca.threadview:
//            ae, RowReceiptParticipant, aa, ab, 
//            af

public class ReceiptItemView extends f
{

    private static final Class a = com/facebook/orca/threadview/ReceiptItemView;
    private RowReceiptTextView b;
    private ImageView c;
    private s d;
    private com.facebook.orca.threads.n e;
    private a f;
    private b g;
    private com.google.common.d.a.s h;
    private com.facebook.orca.common.ui.a.b i;
    private c j;

    public ReceiptItemView(Context context)
    {
        super(context);
        a(context);
    }

    public ReceiptItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    public ReceiptItemView(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        a(context);
    }

    static com.facebook.orca.common.ui.a.b a(ReceiptItemView receiptitemview)
    {
        return receiptitemview.i;
    }

    static com.google.common.d.a.s a(ReceiptItemView receiptitemview, com.google.common.d.a.s s1)
    {
        receiptitemview.h = s1;
        return s1;
    }

    private void a()
    {
        setTextAndHideImage(o.message_sending_receipt);
    }

    private void a(int l, String s1)
    {
        if (n.a(new CharSequence[] {
    s1
}))
        {
            b.setText(getResources().getString(l));
        } else
        {
            b.setText(getResources().getString(l, new Object[] {
                s1
            }));
        }
        c.setVisibility(8);
        b.setVisibility(0);
    }

    private void a(Context context)
    {
        setContentView(k.orca_receipt_message_item);
        context = getInjector();
        d = (s)context.a(com/facebook/orca/threads/s);
        f = (a)context.a(com/facebook/common/executors/a);
        e = (com.facebook.orca.threads.n)context.a(com/facebook/orca/threads/n);
        g = (b)context.a(com/facebook/orca/k/b);
        i = (com.facebook.orca.common.ui.a.b)context.a(com/facebook/orca/common/ui/a/b);
        j = (c)context.a(com/facebook/location/c);
        c = (ImageView)getView(i.receipt_icon);
        b = (RowReceiptTextView)getView(i.receipt_text);
    }

    static RowReceiptTextView b(ReceiptItemView receiptitemview)
    {
        return receiptitemview.b;
    }

    private void b()
    {
        setTextAndHideImage(o.send_failed_error);
    }

    static c c(ReceiptItemView receiptitemview)
    {
        return receiptitemview.j;
    }

    private void setDeliveredReceipt(ae ae1)
    {
        c.setVisibility(0);
        b.setData(new e(getContext().getString(o.message_delivered_receipt)));
        if (!n.a(ae1.d()))
        {
            c.setImageResource(d.a(ae1.d()));
            return;
        } else
        {
            c.setImageDrawable(null);
            return;
        }
    }

    private void setGroupReadReceipt(ae ae1)
    {
        c.setVisibility(0);
        c.setImageResource(h.orca_receipt_checkmark_icon);
        int i1 = ae1.c().size();
        int l = i1;
        if (!ae1.j())
        {
            l = i1 + 1;
        }
        if (ae1.k() - 1 == l && ae1.k() == 3 && ae1.c().size() == 1)
        {
            ae1 = (RowReceiptParticipant)ae1.c().get(0);
            StringBuilder stringbuilder = new StringBuilder(30);
            stringbuilder.append(ae1.a().d());
            long l1 = ae1.b();
            if (l1 != -1L)
            {
                stringbuilder.append(" ").append(e.c(l1));
            }
            b.setData(new e(getContext().getString(o.message_seen_receipt_group_single, new Object[] {
                stringbuilder.toString()
            })));
            return;
        }
        if (ae1.k() - 1 == l)
        {
            b.setData(new e(getContext().getString(o.message_seen_receipt_group_everyone)));
            return;
        } else
        {
            b.setData(new e(ae1.c()));
            return;
        }
    }

    private void setReadReceipt(ae ae1)
    {
        c.setVisibility(0);
        c.setImageResource(h.orca_receipt_checkmark_icon);
        long l = ae1.h();
        ae1 = "";
        if (l != -1L)
        {
            ae1 = e.c(l);
        }
        b.setData(new e(getContext().getString(o.message_seen_receipt, new Object[] {
            ae1
        })));
    }

    private void setSentReceipt(ae ae1)
    {
        com.facebook.location.Coordinates coordinates = ae1.i();
        c.setVisibility(8);
        if (n.a(ae1.d()))
        {
            b.setData(new e(d.b("chat")));
        } else
        {
            String s1 = null;
            if (coordinates != null)
            {
                s1 = j.c(coordinates);
            }
            String s2 = s1;
            if (n.a(s1))
            {
                s2 = d.b(ae1.d());
            }
            b.setData(new e(s2));
        }
        if (coordinates == null)
        {
            return;
        } else
        {
            h = g.a(coordinates);
            f.a(h, new aa(this, coordinates));
            return;
        }
    }

    private void setSentToServerReceipt(ae ae1)
    {
        long l = ae1.g();
        ae1 = "";
        if (l != -1L)
        {
            ae1 = e.c(l);
        }
        a(o.message_sent_receipt, ae1);
    }

    private void setTextAndHideImage(int l)
    {
        a(l, ((String) (null)));
    }

    public void setRowReceiptItem(ae ae1)
    {
        if (h != null)
        {
            h.cancel(false);
            h = null;
        }
        switch (com.facebook.orca.threadview.ab.a[ae1.b().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            setSentReceipt(ae1);
            return;

        case 2: // '\002'
            setReadReceipt(ae1);
            return;

        case 3: // '\003'
            setDeliveredReceipt(ae1);
            return;

        case 4: // '\004'
            setGroupReadReceipt(ae1);
            return;

        case 5: // '\005'
            a();
            return;

        case 6: // '\006'
            setSentToServerReceipt(ae1);
            return;

        case 7: // '\007'
            b();
            break;
        }
    }

}
