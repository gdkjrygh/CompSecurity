// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.apps.moviemaker.ui.StoryboardVideoPosterView;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public final class byv
    implements dau
{

    final byh a;

    public byv(byh byh1)
    {
        a = byh1;
        super();
    }

    public final void a(int i, View view, cnz cnz1, cnq cnq1)
    {
        StoryboardVideoPosterView storyboardvideoposterview;
        int j;
        int k;
        c.a(cnq1.e, "clip.mediaIdentifier", cnz1.a(), "clip's media ID must match the displayable");
        storyboardvideoposterview = (StoryboardVideoPosterView)view.findViewById(b.hn);
        storyboardvideoposterview.c = byh.l(a);
        storyboardvideoposterview.a = (crx)b.a(byh.m(a), "posterStore", null);
        storyboardvideoposterview.d = cnq1.b;
        Object obj = cnz1.b();
        Context context;
        DateFormat dateformat;
        int l;
        if (((coi) (obj)).e == coj.b)
        {
            j = c.ab;
        } else
        {
            j = c.ac;
        }
        if (((coi) (obj)).a % 180 == 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (((coi) (obj)).d > ((coi) (obj)).c)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (k ^ l)
        {
            k = c.Z;
        } else
        {
            k = c.aa;
        }
        context = storyboardvideoposterview.getContext();
        l = c.Y;
        obj = new Date(((coi) (obj)).b / 1000L);
        dateformat = SimpleDateFormat.getDateTimeInstance();
        dateformat.setTimeZone(TimeZone.getDefault());
        obj = context.getString(l, new Object[] {
            dateformat.format(((Date) (obj)))
        });
        storyboardvideoposterview.setContentDescription(String.format("%1$s, %2$s, %3$s", new Object[] {
            context.getString(j), context.getString(k), obj
        }));
        if (b.f() && byh.n(a) != null)
        {
            byh.n(a).a(storyboardvideoposterview, Integer.toString(((dbq) (storyboardvideoposterview)).d));
        }
        if (byh.d(a).b())
        {
            j = 0;
        } else
        {
            j = byh.d(a).getLayoutParams().width;
        }
        if (byh.d(a).b())
        {
            k = byh.d(a).getLayoutParams().height;
        } else
        {
            k = 0;
        }
        byl.a[cnz1.b().e.ordinal()];
        JVM INSTR tableswitch 1 2: default 364
    //                   1 422
    //                   2 755;
           goto _L1 _L2 _L3
_L1:
        throw c.a("posters can only be shown for PHOTO/VIDEO clips");
_L2:
        String s = b.a(cnq1.f.a(), byh.i(a).getResources());
        long l1;
        if (cnq1.d == cnt.e)
        {
            l1 = (cnq1.f.b + cnq1.f.c) / 2L;
        } else
        {
            l1 = cnq1.f.b;
        }
        if (!storyboardvideoposterview.a(byh.o(a), new coa((cqk)cnz1, l1), j, k))
        {
            byh.g(a).b(j, k);
        }
        storyboardvideoposterview.e = b.a(s, "durationString");
        storyboardvideoposterview.f = 1;
        storyboardvideoposterview.invalidate();
_L5:
        storyboardvideoposterview.setOnClickListener(new byw(this, storyboardvideoposterview, view));
        storyboardvideoposterview.setOnLongClickListener(new byx(this, view));
        storyboardvideoposterview.a(false);
        if (byh.p(a) != null && cnq1.b == byh.p(a).b)
        {
            storyboardvideoposterview.a(byh.q(a), 500, 750);
            cnz1 = (dcg)byh.d(a).a(dcg);
            cnq1 = byh.r(a);
            cnz1.d = b.a(500, "startDelayMs", null);
            cnz1.e = b.a(750, "durationMs", null);
            cnz1.f = b.a(i, "keyPosition", null);
            cnz1.c = (Rect)b.a(cnq1, "startRect", null);
            cnz1.b = 1;
            ((dcg) (cnz1)).a.c();
            byh.s(a);
        }
        byh.a(view, true);
        return;
_L3:
        storyboardvideoposterview.a(byh.o(a), new coa((coo)cnz1), j, k);
        storyboardvideoposterview.e = "";
        storyboardvideoposterview.f = 2;
        storyboardvideoposterview.invalidate();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(dar dar1)
    {
        if (dar1.b != 1)
        {
            dar1.b = 1;
            dar1.removeAllViews();
            dar.inflate(dar1.getContext(), c.S, dar1);
            dar1.a = dar1.findViewById(b.fG);
        }
        dar1.setOnClickListener(new byy(this));
        byh.a(dar1, true);
    }

    public final void b(dar dar1)
    {
        if (dar1.b != 2)
        {
            dar1.b = 2;
            dar1.removeAllViews();
            ((TextView)dar.inflate(dar1.getContext(), c.T, dar1).findViewById(b.gg)).setText(dar1.getResources().getQuantityString(b.hJ, 1, new Object[] {
                Integer.valueOf(1)
            }));
            dar1.a = dar1.findViewById(b.fG);
        }
        dar1.setOnClickListener(new byz(this));
        byh.a(dar1, true);
    }

    public final void c(dar dar1)
    {
        if (dar1.b != 3)
        {
            dar1.b = 3;
            dar1.removeAllViews();
            Object obj = ((WindowManager)dar1.getContext().getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            ((Display) (obj)).getSize(point);
            int i = point.x / 2;
            dar.inflate(dar1.getContext(), c.L, dar1);
            obj = (android.widget.RelativeLayout.LayoutParams)dar1.findViewById(b.gP).getLayoutParams();
            obj.width = i;
            dar1.findViewById(b.gP).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            dar1.a = null;
        }
        byh.a(dar1, false);
    }
}
