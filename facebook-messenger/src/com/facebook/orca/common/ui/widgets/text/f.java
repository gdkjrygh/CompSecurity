// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.widgets.text;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.facebook.messages.threads.ui.name.a;
import com.facebook.messages.threads.ui.name.c;
import com.facebook.o;
import com.facebook.orca.f.k;
import com.facebook.orca.threadview.RowReceiptParticipant;
import com.facebook.widget.text.l;
import com.google.common.a.hq;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.common.ui.widgets.text:
//            e

public class f
    implements l
{

    private static final Class a = com/facebook/orca/common/ui/widgets/text/f;
    private final Context b;
    private final k c;
    private final a d;

    public f(Context context, k k1, a a1)
    {
        b = context;
        c = k1;
        d = a1;
    }

    private Layout a(String s, android.text.Layout.Alignment alignment, int i, TextPaint textpaint)
    {
        return new StaticLayout(s, 0, s.length(), textpaint, 16384, alignment, 1.0F, 0.0F, false, android.text.TextUtils.TruncateAt.END, i);
    }

    private String a(String s, int i)
    {
        if (i > 0)
        {
            return b.getString(o.message_seen_receipt_group_multiple_more, new Object[] {
                s, Integer.valueOf(i)
            });
        } else
        {
            return b.getString(o.message_seen_receipt_group_multiple, new Object[] {
                s
            });
        }
    }

    private List a(List list)
    {
        java.util.ArrayList arraylist = hq.a();
        RowReceiptParticipant rowreceiptparticipant;
        for (list = list.iterator(); list.hasNext(); arraylist.add(c.b(rowreceiptparticipant.a())))
        {
            rowreceiptparticipant = (RowReceiptParticipant)list.next();
        }

        return arraylist;
    }

    private void a(e e1)
    {
        StringBuilder stringbuilder = new StringBuilder(200);
        stringbuilder.append("RowReceiptTextView.Data\n");
        if (!n.a(e1.a()))
        {
            stringbuilder.append("getSimpleText ").append(e1.a()).append('\n');
        }
        if (e1.b() != null)
        {
            stringbuilder.append("getRowReceiptParticipantList\n");
            for (e1 = e1.b().iterator(); e1.hasNext(); stringbuilder.append((RowReceiptParticipant)e1.next()).append('\n')) { }
        }
        com.facebook.debug.log.b.d(a, stringbuilder.toString());
    }

    public Layout a(e e1, List list, int i, android.text.Layout.Alignment alignment, int j, int i1)
    {
        boolean flag;
        if (list.size() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Since only one textPaint is picked, it should only include one");
        if (j == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Only one line is laid out by this logic.");
        if (e1 == null)
        {
            return a("", alignment, i, (TextPaint)list.get(0));
        }
        if (e1.b() == null && !n.a(e1.a()))
        {
            return a(e1.a(), alignment, i, (TextPaint)list.get(0));
        }
        if (e1.b() != null && !e1.b().isEmpty())
        {
            j = (int)((TextPaint)list.get(0)).measureText(b.getString(o.message_seen_receipt_group_multiple, new Object[] {
                ""
            }));
            int j1 = (int)((TextPaint)list.get(0)).measureText(b.getString(o.message_seen_receipt_group_multiple_more, new Object[] {
                "", Integer.valueOf(8)
            }));
            int k1 = (int)((TextPaint)list.get(0)).measureText(b.getString(o.message_seen_receipt_group_multiple_more, new Object[] {
                "", Integer.valueOf(88)
            }));
            c c1 = d.a(a(e1.b()), i - j, 1, i1, (TextPaint)list.get(0), new int[] {
                j1 - j, k1 - j
            });
            if (c1.a().isEmpty())
            {
                a(e1);
                return a(a("", 0), alignment, i, (TextPaint)list.get(0));
            } else
            {
                return a(a((String)c1.a().get(0), c1.b()), alignment, i, (TextPaint)list.get(0));
            }
        } else
        {
            a(e1);
            return a("", alignment, i, (TextPaint)list.get(0));
        }
    }

    public volatile Layout a(Object obj, List list, int i, android.text.Layout.Alignment alignment, int j, int i1)
    {
        return a((e)obj, list, i, alignment, j, i1);
    }

}
