// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.spotify.mobile.android.spotlets.player.notifications.PlayerNotificationType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fcs
{

    private final fct a = new fct(this);
    private final LayoutInflater b;
    private PopupWindow c;
    private final List d = new ArrayList();
    private final int e;
    private final int f;
    private final View g;
    private ViewGroup h;

    public fcs(Context context, View view)
    {
        b = LayoutInflater.from(context);
        h = (ViewGroup)b.inflate(0x7f030117, null);
        e = context.getResources().getDimensionPixelSize(0x7f0c0121);
        f = context.getResources().getDimensionPixelSize(0x7f0c0120);
        c = new PopupWindow(h, e, f);
        c.setOutsideTouchable(false);
        c.setFocusable(true);
        g = view;
    }

    private void b()
    {
        if (d.isEmpty())
        {
            a();
        } else
        {
            Object obj = (fcr)d.get(0);
            h.removeAllViews();
            b.inflate(((fcr) (obj)).b, h, true);
            if (((fcr) (obj)).c != 0x80000000)
            {
                fct fct1 = a;
                int i = ((fcr) (obj)).c;
                obj = ((fcr) (obj)).a;
                fct1.removeMessages(0x7f1100fc);
                fct1.sendMessageDelayed(fct1.obtainMessage(0x7f1100fc, obj), i);
                return;
            }
        }
    }

    public final void a()
    {
        a.removeMessages(0x7f1100fc);
        d.clear();
        h.removeAllViews();
        if (c.isShowing())
        {
            c.dismiss();
        }
    }

    public final void a(PlayerNotificationType playernotificationtype)
    {
        if (!d.isEmpty() && ((fcr)d.get(0)).a.equals(playernotificationtype))
        {
            d.remove(0);
            b();
        }
    }

    public final void a(Iterable iterable)
    {
        Iterator iterator;
        a();
        iterator = iterable.iterator();
_L2:
        List list;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_150;
        }
        iterable = (PlayerNotificationType)iterator.next();
        list = d;
        switch (fcr._cls1.a[iterable.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown overlay-type ")).append(iterable).toString());

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
            break MISSING_BLOCK_LABEL_134;

        case 1: // '\001'
            iterable = new fcr(iterable, 0x7f030114, 1500);
            break;
        }
_L3:
        list.add(iterable);
        if (true) goto _L2; else goto _L1
_L1:
        iterable = new fcr(iterable, 0x7f030116, 10000);
          goto _L3
        iterable = new fcr(iterable, 0x7f030115, 0x80000000);
          goto _L3
        iterable = g;
        int ai[] = new int[2];
        iterable.getLocationOnScreen(ai);
        Point point = new Point(ai[0], ai[1]);
        point.offset(iterable.getWidth() / 2, iterable.getHeight() / 2);
        point.offset(-(e / 2), -(f / 2));
        c.showAtLocation(g, 51, point.x, point.y);
        b();
        return;
    }
}
