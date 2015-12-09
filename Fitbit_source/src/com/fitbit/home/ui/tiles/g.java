// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.content.Context;
import android.support.v4.util.LongSparseArray;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.Profile;
import com.fitbit.runtrack.Duration;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.runtrack.ui.l;
import com.fitbit.ui.FlipImageView;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            p, e

public class g extends p
{

    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;

    public g()
    {
    }

    protected boolean N_()
    {
        return false;
    }

    public void O_()
    {
        super.O_();
    }

    protected int P_()
    {
        return 0x7f040157;
    }

    protected void R_()
    {
label0:
        {
            Object obj;
label1:
            {
                if (u != null)
                {
                    obj = u.q;
                    if (((List) (obj)).isEmpty())
                    {
                        break label0;
                    }
                    obj = (ActivityLogEntry)((List) (obj)).get(((List) (obj)).size() - 1);
                    if (o.i(((ActivityLogEntry) (obj)).getTimeCreated()))
                    {
                        break label1;
                    }
                }
                return;
            }
            a.setVisibility(8);
            b.setVisibility(0);
            c.setVisibility(0);
            d.setVisibility(0);
            e.setVisibility(0);
            Object obj1 = u.c;
            Object obj2 = (e.b)u.r.get(((ActivityLogEntry) (obj)).getEntityId().longValue());
            if (obj2 != null && obj1 != null)
            {
                obj2 = ((e.b) (obj2)).b;
                l l1 = new l(((Profile) (obj1)));
                b.setText(l1.b(((ExerciseStat) (obj2)).a()));
                c.setText((new StringBuilder()).append(((Profile) (obj1)).t().getShortDisplayName()).append(" ").append(((ActivityLogEntry) (obj)).z()).toString());
                d.setVisibility(0);
                d.setText(i().getString(0x7f0805a5, new Object[] {
                    DateUtils.formatElapsedTime(((ExerciseStat) (obj2)).c().a(TimeUnit.SECONDS))
                }));
                e.setText(i().getString(0x7f0805ab, new Object[] {
                    l1.a(i(), ((ExerciseStat) (obj2)))
                }));
                return;
            }
            obj1 = new Duration(((ActivityLogEntry) (obj)).a(TimeUnit.MILLISECONDS));
            b.setText(DateUtils.formatElapsedTime(((Duration) (obj1)).a(TimeUnit.SECONDS)));
            c.setText(i().getString(0x7f0803d9, new Object[] {
                ((ActivityLogEntry) (obj)).z()
            }));
            d.setVisibility(8);
            int i;
            if (((ActivityLogEntry) (obj)).k() != -1)
            {
                i = ((ActivityLogEntry) (obj)).k();
            } else
            if (((ActivityLogEntry) (obj)).n() != -1)
            {
                i = ((ActivityLogEntry) (obj)).n();
            } else
            {
                i = ((ActivityLogEntry) (obj)).j();
            }
            e.setText(i().getString(0x7f0805a7, new Object[] {
                Integer.valueOf(i)
            }));
            return;
        }
        a.setVisibility(0);
        if (!o.i(u.b.getTime()))
        {
            a.setText(i().getString(0x7f080417));
        }
        b.setVisibility(8);
        c.setVisibility(8);
        d.setVisibility(8);
        e.setVisibility(8);
    }

    protected void a(View view)
    {
        super.a(view);
        x.setImageResource(0x7f02037b);
        a = (TextView)view.findViewById(0x7f1100ea);
        b = (TextView)view.findViewById(0x7f1103fb);
        c = (TextView)view.findViewById(0x7f110393);
        d = (TextView)view.findViewById(0x7f1102b5);
        e = (TextView)view.findViewById(0x7f1103fc);
    }

    protected String b()
    {
        return i().getString(0x7f080197);
    }

    protected int c()
    {
        return 0x7f02037b;
    }

    public CharSequence f()
    {
        return i().getText(0x7f080197);
    }
}
