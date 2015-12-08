// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.chat;

import BG;
import FH;
import FJ;
import RM;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.snapchat.android.Timber;
import com.snapchat.android.ui.FixTouchConsumeTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.snapchat.android.ui.chat:
//            MediaCardView, MediaCardLinkView, ChatLinkUnderlineSpan

public class MediaCardListView extends LinearLayout
    implements FJ.a, MediaCardView.a
{

    public Context a;
    public final Map b;
    public final List c;
    public final List d;
    public MediaCardView e;
    public Spannable f;
    public FixTouchConsumeTextView g;
    private final FJ h;

    public MediaCardListView(Context context)
    {
        super(context);
        b = new HashMap();
        c = new ArrayList();
        d = new ArrayList();
        e = null;
        h = new FJ(this);
        a = context;
    }

    public MediaCardListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new HashMap();
        c = new ArrayList();
        d = new ArrayList();
        e = null;
        h = new FJ(this);
        a = context;
    }

    public MediaCardListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new HashMap();
        c = new ArrayList();
        d = new ArrayList();
        e = null;
        h = new FJ(this);
        a = context;
    }

    public final void a(BG bg)
    {
        if (b.isEmpty())
        {
            setVisibility(8);
            return;
        }
        if (!c.isEmpty())
        {
            Object obj = h;
            List list = c;
            boolean flag;
            if (bg.mLinkContent != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                list = bg.mLinkContent;
                ((FJ) (obj)).a.a(bg, list);
            } else
            {
                (new FH(bg, list, ((FH.a) (obj)))).execute();
            }
        }
        for (obj = b.values().iterator(); ((Iterator) (obj)).hasNext(); ((MediaCardView)((Iterator) (obj)).next()).a(bg)) { }
        setVisibility(0);
    }

    public final void a(BG bg, List list)
    {
        if (list != null && list.size() == d.size()) goto _L2; else goto _L1
_L1:
        MediaCardLinkView mediacardlinkview1;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); setLinkUnderline(f, bg, mediacardlinkview1.b(), ChatLinkUnderlineSpan.Type.Url, true))
        {
            mediacardlinkview1 = (MediaCardLinkView)iterator.next();
            mediacardlinkview1.setLinkContent(null);
        }

        if (list != null) goto _L4; else goto _L3
_L3:
        Timber.c("MediaCardListView", "[MediaCardListView] onLinkContentLoaded failed. ContentList is null", new Object[0]);
_L6:
        return;
_L4:
        Timber.c("MediaCardListView", "[MediaCardListView] onLinkContentLoaded failed. contentList size %d, mLinkViews size %d", new Object[] {
            Integer.valueOf(list.size()), Integer.valueOf(d.size())
        });
        return;
_L2:
        if (list.size() == d.size())
        {
            int i = 0;
            while (i < d.size()) 
            {
                MediaCardLinkView mediacardlinkview = (MediaCardLinkView)d.get(i);
                RM rm = (RM)list.get(i);
                if (rm.b())
                {
                    mediacardlinkview.setLinkContent(rm);
                    setLinkUnderline(f, bg, mediacardlinkview.b(), ChatLinkUnderlineSpan.Type.Underline, false);
                } else
                {
                    mediacardlinkview.setLinkContent(null);
                    setLinkUnderline(f, bg, mediacardlinkview.b(), ChatLinkUnderlineSpan.Type.Url, true);
                }
                i++;
            }
            if (a())
            {
                g.setVisibility(8);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(MediaCardView mediacardview)
    {
        e = mediacardview;
    }

    public final boolean a()
    {
        if (b.size() != 1 || f == null)
        {
            return false;
        }
        Object obj = (MediaCardView)b.values().iterator().next();
        if (((MediaCardView) (obj)).getVisibility() != 0)
        {
            return false;
        }
        obj = ((MediaCardView) (obj)).b();
        return ((If.a) (obj)).start == 0 && ((If.a) (obj)).end == f.length();
    }

    public void setLinkUnderline(Spannable spannable, BG bg, If.a a1, ChatLinkUnderlineSpan.Type type, boolean flag)
    {
        int i;
        int k;
        if (bg.R())
        {
            i = a.getResources().getColor(0x7f0c001c);
        } else
        {
            i = a.getResources().getColor(0x7f0c001b);
        }
        bg = (ClickableSpan[])spannable.getSpans(a1.start, a1.end, android/text/style/ClickableSpan);
        k = bg.length;
        for (int j = 0; j < k; j++)
        {
            spannable.removeSpan(bg[j]);
        }

        bg = new ChatLinkUnderlineSpan(a1, i, type, flag);
        i = Math.min(a1.end, spannable.length());
        spannable.setSpan(bg, a1.start, i, 33);
        Timber.c("MediaCardListView", "[MediaCardListView] set LinkUnderline type %s for %s from %d to %d, clickable  %b", new Object[] {
            type, spannable, Integer.valueOf(a1.start), Integer.valueOf(a1.end), Boolean.valueOf(flag)
        });
    }
}
