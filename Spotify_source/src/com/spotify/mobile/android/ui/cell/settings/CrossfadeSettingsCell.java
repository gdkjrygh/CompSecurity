// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.cell.settings;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import com.spotify.mobile.android.util.Assertion;
import ctz;
import gcg;
import gcw;

// Referenced classes of package com.spotify.mobile.android.ui.cell.settings:
//            AbstractSettingsCell

public class CrossfadeSettingsCell extends AbstractSettingsCell
{

    protected boolean d;
    private SeekBar e;
    private int f;
    private PopupWindow g;
    private int h;
    private int i;
    private int j;
    private int k;
    private TextView l;
    private String m;
    private String n;

    public CrossfadeSettingsCell(Context context)
    {
        super(context);
        m = "";
        n = " s ";
    }

    public CrossfadeSettingsCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        m = "";
        n = " s ";
    }

    static int a(CrossfadeSettingsCell crossfadesettingscell, int i1)
    {
        crossfadesettingscell.h = i1;
        return i1;
    }

    static PopupWindow a(CrossfadeSettingsCell crossfadesettingscell)
    {
        return crossfadesettingscell.g;
    }

    public static CrossfadeSettingsCell a(Context context, ViewGroup viewgroup)
    {
        context = (CrossfadeSettingsCell)LayoutInflater.from(context).inflate(0x7f03012c, viewgroup, false);
        ((CrossfadeSettingsCell) (context)).e.setOnSeekBarChangeListener(context. new android.widget.SeekBar.OnSeekBarChangeListener() {

            private CrossfadeSettingsCell a;

            public final void onProgressChanged(SeekBar seekbar, int i1, boolean flag)
            {
                if (!flag)
                {
                    return;
                } else
                {
                    CrossfadeSettingsCell.c(a, i1);
                    Point point = CrossfadeSettingsCell.d(a, i1);
                    CrossfadeSettingsCell.a(a).update(seekbar, point.x, point.y, -1, -1);
                    return;
                }
            }

            public final void onStartTrackingTouch(SeekBar seekbar)
            {
                CrossfadeSettingsCell.a(a, ((seekbar.getWidth() - seekbar.getPaddingLeft() - seekbar.getPaddingRight()) + seekbar.getThumbOffset() * 2) - CrossfadeSettingsCell.b(a));
                CrossfadeSettingsCell.b(a, (seekbar.getPaddingLeft() - seekbar.getThumbOffset()) + CrossfadeSettingsCell.b(a) / 2);
                int i1 = seekbar.getProgress();
                CrossfadeSettingsCell.c(a, seekbar.getProgress());
                Point point = CrossfadeSettingsCell.d(a, i1);
                CrossfadeSettingsCell.a(a).showAsDropDown(seekbar, point.x, point.y);
                a.d = true;
            }

            public final void onStopTrackingTouch(SeekBar seekbar)
            {
                a.a();
                CrossfadeSettingsCell.a(a).dismiss();
                a.d = false;
            }

            
            {
                a = CrossfadeSettingsCell.this;
                super();
            }
        });
        return context;
    }

    static int b(CrossfadeSettingsCell crossfadesettingscell)
    {
        return crossfadesettingscell.j;
    }

    static int b(CrossfadeSettingsCell crossfadesettingscell, int i1)
    {
        crossfadesettingscell.i = i1;
        return i1;
    }

    static void c(CrossfadeSettingsCell crossfadesettingscell, int i1)
    {
label0:
        {
            if (crossfadesettingscell.g.isShowing())
            {
                ctz.a(crossfadesettingscell.l);
                ctz.a(crossfadesettingscell.m);
                ctz.a(crossfadesettingscell.n);
                if (i1 > 0)
                {
                    break label0;
                }
                crossfadesettingscell.l.setText(crossfadesettingscell.m);
            }
            return;
        }
        crossfadesettingscell.l.setText((new StringBuilder(" ")).append(i1).append(crossfadesettingscell.n).toString());
    }

    static Point d(CrossfadeSettingsCell crossfadesettingscell, int i1)
    {
        ctz.a(crossfadesettingscell.l);
        crossfadesettingscell.l.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        return new Point(((int)(((float)i1 / (float)crossfadesettingscell.e.getMax()) * (float)crossfadesettingscell.h) + crossfadesettingscell.i) - Math.round((float)crossfadesettingscell.l.getMeasuredWidth() / 2.0F), -(crossfadesettingscell.e.getHeight() / 2 + crossfadesettingscell.l.getMeasuredHeight() + crossfadesettingscell.k / 2));
    }

    protected final void a(ContentValues contentvalues)
    {
        int i1 = e.getProgress();
        if (i1 == f)
        {
            return;
        }
        boolean flag;
        if (i1 >= 0 && i1 <= 12)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertion.a(flag, "Out of range again! aaargh.");
        if (i1 == 0)
        {
            contentvalues.put("crossfade", Integer.valueOf(0));
            a(com.spotify.mobile.android.util.ClientEvent.SubEvent.bq, Integer.valueOf(0));
            return;
        } else
        {
            contentvalues.put("crossfade", Integer.valueOf(1));
            a(com.spotify.mobile.android.util.ClientEvent.SubEvent.bq, Integer.valueOf(1));
            contentvalues.put("crossfade_time_seconds", Integer.valueOf(i1));
            a(com.spotify.mobile.android.util.ClientEvent.SubEvent.bs, Integer.valueOf(i1));
            return;
        }
    }

    public final void a(Cursor cursor)
    {
        if (d)
        {
            return;
        }
        boolean flag = gcw.a(cursor, cursor.getColumnIndexOrThrow("crossfade"));
        int i1 = cursor.getInt(cursor.getColumnIndexOrThrow("crossfade_time_seconds"));
        if (i1 < 0 || i1 > 12)
        {
            Assertion.a((new StringBuilder("Out of range: ")).append(i1).toString());
        }
        if (!flag)
        {
            i1 = 0;
        }
        f = i1;
        e.setProgress(f);
    }

    public final void a(String s)
    {
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        e = (SeekBar)findViewById(0x7f1103d3);
        e.setMax(12);
        e.refreshDrawableState();
        l = new TextView(getContext());
        l.setGravity(17);
        l.setBackgroundResource(0x7f020076);
        l.setTextSize(1, 16F);
        l.setTextColor(gcg.b(getContext(), 0x7f0f0137));
        l.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        g = new PopupWindow(l);
        g.setFocusable(false);
        g.setTouchable(false);
        g.setClippingEnabled(false);
        g.setWidth(-2);
        g.setHeight(-2);
        j = gcg.a(getContext(), 0x7f02025a).getIntrinsicWidth();
        k = gcg.a(getContext(), 0x7f02025a).getIntrinsicHeight();
        m = (new StringBuilder(" ")).append(getResources().getString(0x7f08047a)).append(" ").toString();
        n = (new StringBuilder(" ")).append(getResources().getString(0x7f0804a3)).append(" ").toString();
        ((TextView)findViewById(0x7f1104bd)).setText(0x7f08047a);
        ((TextView)findViewById(0x7f1104be)).setText((new StringBuilder("12 ")).append(getResources().getString(0x7f0804a3)).toString());
    }
}
