// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.content.j;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.widget.popupmenu.f;
import com.pandora.android.PandoraService;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.a;
import com.pandora.android.personalization.StationPersonalizationActivity;
import com.pandora.android.personalization.view.c;
import com.pandora.android.provider.b;
import com.pandora.android.util.aa;
import com.pandora.android.util.ab;
import com.pandora.android.util.p;
import com.pandora.android.util.s;
import com.pandora.radio.data.PromotedStation;
import com.pandora.radio.data.StationRecommendation;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.i;
import com.pandora.radio.provider.k;
import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import p.l.d;
import p.l.g;

// Referenced classes of package p.ca:
//            ap

public class ao extends CursorAdapter
    implements com.android.widget.popupmenu.f.b
{
    private static class a
    {

        public int a;

        public a(int l)
        {
            a = l;
        }
    }


    private Activity a;
    private final android.view.View.OnClickListener b;
    private final ap c;
    private LayoutInflater d;
    private aa e;
    private y f;
    private y g;
    private StationRecommendation h;
    private int i;
    private int j;

    public ao(ap ap1, Cursor cursor, android.view.View.OnClickListener onclicklistener, aa aa1)
    {
        super(ap1.getActivity(), cursor, false);
        c = ap1;
        a = ap1.getActivity();
        b = onclicklistener;
        e = aa1;
        d = (LayoutInflater)a.getSystemService("layout_inflater");
    }

    private f a(View view, y y1, boolean flag, boolean flag1, boolean flag2)
    {
        f f1;
        View view1;
        boolean flag3;
        if (flag || flag2)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        view1 = view.findViewById(0x7f1002b6);
        f1 = new f(a, view1);
        f1.a(this);
        f1.a().clear();
        f1.a(true);
        if (!flag1) goto _L2; else goto _L1
_L1:
        if (flag2)
        {
            f1.a(0x7f12001f);
        } else
        {
            f1.a(0x7f120020);
        }
_L4:
        if (flag3)
        {
            f1.a(new com.android.widget.popupmenu.f.a(view, y1, view1) {

                final View a;
                final y b;
                final View c;
                final ao d;

                public void a(f f2)
                {
                    boolean flag6 = false;
                    a.setPressed(false);
                    boolean flag5 = flag6;
                    if (p.ca.ao.a(d) != null)
                    {
                        flag5 = flag6;
                        if (p.ca.ao.a(d).equals(b))
                        {
                            flag5 = true;
                        }
                    }
                    if (!flag5)
                    {
                        c.setVisibility(8);
                    }
                    p.ca.ao.a(d, null);
                    p.ca.ao.a(d, null);
                }

            
            {
                d = ao.this;
                a = view;
                b = y1;
                c = view1;
                super();
            }
            });
        }
        return f1;
_L2:
        flag = y1.j();
        flag1 = y1.k();
        flag2 = y1.l();
        boolean flag4 = y1.m();
        if (flag)
        {
            if (flag1)
            {
                f1.a(0x7f120022);
            } else
            {
                f1.a(0x7f120024);
            }
        } else
        {
            MenuItem menuitem;
            if (!flag2)
            {
                if (flag4)
                {
                    f1.a(0x7f12001e);
                } else
                {
                    f1.a(0x7f120023);
                }
            } else
            {
                f1.a(0x7f120021);
            }
            menuitem = f1.a().findItem(0x7f10031f);
            if (menuitem != null)
            {
                menuitem.setIcon(com.pandora.android.personalization.view.c.a(a, 0x7f0d009d).b());
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static f a(ao ao1, View view, y y1, boolean flag, boolean flag1, boolean flag2)
    {
        return ao1.a(view, y1, flag, flag1, flag2);
    }

    static StationRecommendation a(ao ao1, StationRecommendation stationrecommendation)
    {
        ao1.h = stationrecommendation;
        return stationrecommendation;
    }

    static y a(ao ao1)
    {
        return ao1.f;
    }

    static y a(ao ao1, y y1)
    {
        ao1.g = y1;
        return y1;
    }

    private static String a(y y1, Context context)
    {
        long l;
        if (y1.v())
        {
            if ((l = y1.x()) - System.currentTimeMillis() <= y1.z())
            {
                GregorianCalendar gregoriancalendar = new GregorianCalendar();
                gregoriancalendar.set(11, 0);
                gregoriancalendar.roll(6, true);
                long l1 = gregoriancalendar.getTimeInMillis();
                if (l1 - 0x5265c00L < l && l <= l1)
                {
                    return context.getString(0x7f0800b7);
                }
                if (l1 < l && l <= l1 + 0x5265c00L)
                {
                    return context.getString(0x7f0800b9);
                } else
                {
                    return String.format(context.getString(0x7f0800b8), new Object[] {
                        y1.y()
                    });
                }
            }
        }
        return null;
    }

    private static void a(Activity activity, y y1)
    {
        if (s.u())
        {
            b.a.C().a((new PandoraIntent("show_page")).putExtra("intent_page_name", p.H).putExtra("intent_station_data", y1).putExtra("intent_force_refresh", true));
            return;
        } else
        {
            StationPersonalizationActivity.a(activity, y1, null, p/ca/ap);
            return;
        }
    }

    private void a(Context context, String s1, ImageView imageview, p.s.b b1)
    {
        p.l.g.b(context).a(s1).a(b1).a(0x7f0200e9).a(imageview);
    }

    private void a(View view, Context context, Cursor cursor)
    {
        Object obj = (com.pandora.radio.provider.g)cursor;
        cursor = (TextView)view.findViewById(0x7f10011b);
        View view1 = view.findViewById(0x7f1002b4);
        TextView textview = (TextView)view.findViewById(0x7f1002b5);
        PromotedStation promotedstation = (PromotedStation)((com.pandora.radio.provider.g) (obj)).c();
        cursor.setText(promotedstation.b());
        obj = promotedstation.d();
        cursor = ((Cursor) (obj));
        if (s.a(((String) (obj))))
        {
            cursor = context.getString(0x7f08021e);
        }
        textview.setText(cursor);
        view1.setVisibility(0);
        cursor = (ImageView)view.findViewById(0x7f1000b5);
        a(context, promotedstation.m(), ((ImageView) (cursor)), p.s.b.d);
        view.setVisibility(0);
    }

    private void a(View view, boolean flag)
    {
        view.findViewById(0x7f100119).setSelected(flag);
        Object obj = (TextView)view.findViewById(0x7f10011b);
        int l;
        if (flag)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        ((TextView) (obj)).setTypeface(null, l);
        view.findViewById(0x7f100119).setBackgroundResource(0x7f0201fd);
        ((TextView) (obj)).setTextColor(a.getResources().getColorStateList(0x7f0b00e4));
        view = (TextView)view.findViewById(0x7f10011c);
        obj = a.getResources();
        if (flag)
        {
            l = 0x7f0b00bf;
        } else
        {
            l = 0x7f0b00ca;
        }
        view.setTextColor(((Resources) (obj)).getColor(l));
    }

    private void a(View view, boolean flag, boolean flag1, boolean flag2)
    {
        view = view.findViewById(0x7f1002b6);
        if (flag)
        {
            view.setVisibility(0);
            view.setOnClickListener(new android.view.View.OnClickListener(flag1, flag2) {

                final boolean a;
                final boolean b;
                final ao c;

                public void onClick(View view1)
                {
                    p.ca.ao.a(c, (View)view1.getParent(), p.ca.ao.a(c), false, a, b).c();
                }

            
            {
                c = ao.this;
                a = flag;
                b = flag1;
                super();
            }
            });
            return;
        } else
        {
            view.setVisibility(8);
            view.setOnClickListener(null);
            return;
        }
    }

    private static void a(y y1)
    {
        y1 = y1.c();
        b.a.C().a((new PandoraIntent("show_page")).putExtra("intent_page_name", p.e).putExtra("intent_station_token", y1).putExtra("intent_show_force_screen", true));
    }

    private void a(y y1, int l)
    {
        if (!s.v())
        {
            if (l == i || b(y1, 0))
            {
                b.a.b().d().a(false, "going to delete the station");
            }
            PandoraService.b(y1.c());
            return;
        }
        com.pandora.android.view.f f1 = c.k();
        if (l == i || b(y1, f1.b()))
        {
            b.a.b().d().a(false, "going to delete the station");
        }
        p.bv.d.a(c.m_(), true);
        int i1 = a().c(l);
        Bundle bundle = new Bundle();
        bundle.putInt("origStationPosition", l);
        bundle.putInt("deletedPosition", i1);
        bundle.putString("stationToken", y1.c());
        boolean flag;
        if (!y1.A())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.putBoolean("isNonAdvertiserStation", flag);
        if (!y1.A() && a(f1.b()))
        {
            a().c(0);
            bundle.putBoolean("isShuffleDeleted", true);
        }
        notifyDataSetChanged();
        l = f1.a() + 1;
        f1.a(false, a.getResources().getQuantityString(0x7f110000, l, new Object[] {
            Integer.valueOf(l)
        }), bundle);
    }

    private boolean a(int l)
    {
        return b.a.b().y().a() - l == 2;
    }

    private void b(View view, Context context, Cursor cursor)
    {
        cursor = ((com.pandora.radio.provider.g)cursor).a(cursor.getPosition());
        e.a(cursor);
        boolean flag = b.a.b().a(p.dj.b.a.f);
        TextView textview = (TextView)view.findViewById(0x7f10011b);
        int l;
        if (flag)
        {
            l = 0x7f08013a;
        } else
        {
            l = 0x7f080222;
        }
        textview.setText(l);
        ab.a(context, cursor.m(), view);
        view = (TextView)view.findViewById(0x7f10011d);
        if (!TextUtils.isEmpty(cursor.o()))
        {
            view.setText(cursor.o());
            view.setVisibility(0);
        }
    }

    private boolean b(y y1, int l)
    {
        return a(l) && f != null && f.s() && !y1.A();
    }

    private void c(View view, Context context, Cursor cursor)
    {
        cursor = ((com.pandora.radio.provider.g)cursor).a(cursor.getPosition());
        e.a(cursor);
        ((TextView)view.findViewById(0x7f10011b)).setText(cursor.b());
        a(view, false, true, false);
        view = (ImageView)view.findViewById(0x7f1000b5);
        a(context, cursor.m(), view, p.s.b.d);
    }

    private void d(View view, Context context, Cursor cursor)
    {
        y y1 = new y(cursor);
        boolean flag1 = y1.c().equals(c.h());
        String s1 = y1.o();
        ((TextView)view.findViewById(0x7f10011b)).setText(y1.d());
        Object obj;
        p.s.b b1;
        p.s.b b2;
        boolean flag;
        if (f != null && f.j())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b2 = p.s.b.d;
        b1 = b2;
        obj = s1;
        if (flag1)
        {
            b1 = b2;
            obj = s1;
            if (!flag)
            {
                b1 = b2;
                obj = s1;
                if (!s.u())
                {
                    com.pandora.radio.data.aa aa1 = b.a.b().d().s();
                    b1 = b2;
                    obj = s1;
                    if (aa1 != null)
                    {
                        b1 = b2;
                        obj = s1;
                        if (!aa1.M())
                        {
                            obj = aa1.v();
                            b1 = p.s.b.c;
                        }
                    }
                }
            }
        }
        a(context, ((String) (obj)), (ImageView)view.findViewById(0x7f1000b5), b1);
        obj = (ImageView)view.findViewById(0x7f100289);
        if (y1.A())
        {
            ((ImageView) (obj)).setVisibility(0);
            ((ImageView) (obj)).setImageResource(0x7f0200db);
        } else
        if (y1.k())
        {
            ((ImageView) (obj)).setVisibility(0);
            ((ImageView) (obj)).setImageResource(0x7f020257);
        } else
        {
            ((ImageView) (obj)).setVisibility(8);
        }
        obj = (TextView)view.findViewById(0x7f10011c);
        context = a(y1, context);
        if (!s.a(context))
        {
            ((TextView) (obj)).setText(context);
            ((TextView) (obj)).setVisibility(0);
        } else
        {
            ((TextView) (obj)).setVisibility(8);
        }
        if (flag1)
        {
            f = y1;
            i = cursor.getPosition();
            a(view, true);
            a(view, true, false, false);
            return;
        } else
        {
            a(view, false);
            a(view, false, false, false);
            return;
        }
    }

    public f a(View view, y y1, StationRecommendation stationrecommendation, int l)
    {
        g = y1;
        h = stationrecommendation;
        j = l;
        boolean flag;
        boolean flag1;
        if (y1 == null && stationrecommendation != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = stationrecommendation instanceof PromotedStation;
        if (flag1)
        {
            stationrecommendation = ((PromotedStation)stationrecommendation).e();
            g = stationrecommendation;
            y1 = stationrecommendation;
            if (stationrecommendation == null)
            {
                return null;
            }
        }
        y1 = a(view, y1, true, flag, flag1);
        a(view, true, flag, flag1);
        y1.c();
        view.post(new Runnable(view) {

            final View a;
            final ao b;

            public void run()
            {
                a.setPressed(true);
            }

            
            {
                b = ao.this;
                a = view;
                super();
            }
        });
        return y1;
    }

    public com.pandora.radio.provider.g a()
    {
        return (com.pandora.radio.provider.g)super.getCursor();
    }

    public void a(Activity activity)
    {
        a = activity;
    }

    public boolean areAllItemsEnabled()
    {
        return true;
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
        int l = getItemViewType(cursor.getPosition());
        if (!s.p())
        {
            a a1 = (a)view.getTag();
            if (a1 == null)
            {
                throw new InvalidParameterException("viewHolder == null!!!");
            }
            if (l != a1.a)
            {
                throw new InvalidParameterException((new StringBuilder()).append("View types don't match. itemViewType = ").append(l).append(", viewHolder.itemViewType = ").append(a1.a).append(", position = ").append(cursor.getPosition()).toString());
            }
        }
        switch (l)
        {
        default:
            throw new UnsupportedOperationException((new StringBuilder()).append("Unknown view type: ").append(l).toString());

        case 0: // '\0'
            d(view, context, cursor);
            // fall through

        case 2: // '\002'
        case 3: // '\003'
            return;

        case 1: // '\001'
            c(view, context, cursor);
            return;

        case 4: // '\004'
            a(view, context, cursor);
            return;

        case 5: // '\005'
            b(view, context, cursor);
            break;
        }
    }

    public Cursor getCursor()
    {
        return a();
    }

    public int getItemViewType(int l)
    {
        if (l < 0 || l >= getCount())
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("size: ").append(getCount()).append(", index: ").append(l).toString());
        }
        Object obj = a();
        if (((com.pandora.radio.provider.g) (obj)).b(l))
        {
            return 0;
        }
        obj = ((com.pandora.radio.provider.g) (obj)).a(l);
        if (obj instanceof PromotedStation)
        {
            return 4;
        }
        if (((StationRecommendation) (obj)).j() == com.pandora.radio.data.StationRecommendations.b.g)
        {
            return 5;
        }
        if (obj == k.b)
        {
            return 2;
        }
        return obj != k.c ? 1 : 3;
    }

    public int getViewTypeCount()
    {
        return 6;
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public boolean isEnabled(int l)
    {
        return getItemViewType(l) != 2;
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        int l = getItemViewType(cursor.getPosition());
        l;
        JVM INSTR tableswitch 0 5: default 52
    //                   0 81
    //                   1 81
    //                   2 141
    //                   3 173
    //                   4 125
    //                   5 109;
           goto _L1 _L2 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new InvalidParameterException((new StringBuilder()).append("Unknown itemViewType: ").append(l).toString());
_L2:
        context = d.inflate(0x7f0400a8, viewgroup, false);
_L8:
        context.setTag(new a(l));
        return context;
_L6:
        context = d.inflate(0x7f040042, viewgroup, false);
        continue; /* Loop/switch isn't completed */
_L5:
        context = d.inflate(0x7f040089, viewgroup, false);
        continue; /* Loop/switch isn't completed */
_L3:
        context = d.inflate(0x7f0400a4, viewgroup, false);
        ((TextView)context.findViewById(0x7f10011b)).setText(0x7f080260);
        continue; /* Loop/switch isn't completed */
_L4:
        context = d.inflate(0x7f0400a2, viewgroup, false);
        ((TextView)context.findViewById(0x7f1002ac)).setText(0x7f080261);
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        y y1;
        int l;
        if (g == null)
        {
            y1 = f;
            l = i;
        } else
        {
            y1 = g;
            l = j;
        }
        menuitem.getItemId();
        JVM INSTR lookupswitch 6: default 80
    //                   2131755033: 95
    //                   2131755806: 109
    //                   2131755807: 152
    //                   2131755808: 116
    //                   2131755809: 138
    //                   2131755810: 125;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return false;
_L2:
        com.pandora.android.activity.a.a(a, 1, y1, null, null);
        continue; /* Loop/switch isn't completed */
_L3:
        a(y1);
        continue; /* Loop/switch isn't completed */
_L5:
        a(y1, l);
        continue; /* Loop/switch isn't completed */
_L7:
        b.onClick(null);
        continue; /* Loop/switch isn't completed */
_L6:
        c.a(h);
        continue; /* Loop/switch isn't completed */
_L4:
        a(c.getActivity(), y1);
        if (true) goto _L1; else goto _L8
_L8:
    }
}
