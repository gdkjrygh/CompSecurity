// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.g;
import com.bumptech.glide.j;
import com.bumptech.glide.load.engine.b;
import com.cardinalblue.android.b.i;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.model.gson.PicUsersData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class r extends BaseAdapter
    implements com.cardinalblue.android.piccollage.controller.a.g.a
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(r r1, PicUser picuser);

        public abstract void b();
    }

    private static class b
    {

        public ImageView a;
        public TextView b;
        public TextView c;

        private b()
        {
        }

    }


    private final Context a;
    private final ArrayList b = new ArrayList();
    private final LinearLayout c;
    private final j d;
    private String e;
    private PicUsersData f;
    private com.cardinalblue.android.piccollage.controller.a.g g;
    private boolean h;
    private final a i;

    public r(Context context, String s, a a1)
    {
        f = new PicUsersData();
        h = false;
        e = s;
        a = context;
        c = (LinearLayout)LayoutInflater.from(context).inflate(0x7f0300dc, null);
        c.setGravity(17);
        i = a1;
        d = com.bumptech.glide.g.b(a);
    }

    static a a(r r1)
    {
        return r1.i;
    }

    private void a(PicUser picuser, TextView textview)
    {
        if (picuser.isFollowing().booleanValue())
        {
            textview.setText(0x7f0702bb);
            textview.setTextColor(0xff888888);
            textview.setBackgroundResource(0x7f020293);
            return;
        } else
        {
            textview.setText(0x7f0702ba);
            textview.setTextColor(-1);
            textview.setBackgroundResource(0x7f020294);
            return;
        }
    }

    static void a(r r1, PicUser picuser, TextView textview)
    {
        r1.a(picuser, textview);
    }

    private void a(List list)
    {
        ArrayList arraylist = b;
        arraylist;
        JVM INSTR monitorenter ;
        list = list.iterator();
_L1:
        PicUser picuser;
        int l;
        do
        {
            if (!list.hasNext())
            {
                break MISSING_BLOCK_LABEL_91;
            }
            picuser = (PicUser)list.next();
            if (!b.contains(picuser))
            {
                break MISSING_BLOCK_LABEL_79;
            }
            l = b.indexOf(picuser);
        } while (l == -1);
        b.set(l, picuser);
          goto _L1
        list;
        arraylist;
        JVM INSTR monitorexit ;
        throw list;
        b.add(picuser);
          goto _L1
        arraylist;
        JVM INSTR monitorexit ;
    }

    static String b(r r1)
    {
        return r1.e;
    }

    private void b(PicUsersData picusersdata)
    {
        if (picusersdata.getUsers().size() == 0)
        {
            return;
        }
        ArrayList arraylist = b;
        arraylist;
        JVM INSTR monitorenter ;
        if (f != null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        f = picusersdata;
_L1:
        a(picusersdata.getUsers());
        notifyDataSetChanged();
        return;
        picusersdata;
        arraylist;
        JVM INSTR monitorexit ;
        throw picusersdata;
        f.updateDataWith(picusersdata);
          goto _L1
    }

    private void g()
    {
        int l = a();
        if (!h && l < f.getTotal())
        {
            h = true;
            h();
            g = new com.cardinalblue.android.piccollage.controller.a.g(this, e, l);
            g.a(new String[0]);
        }
    }

    private void h()
    {
        if (g != null && g.getStatus() == android.os.AsyncTask.Status.RUNNING)
        {
            g.cancel(true);
        }
    }

    public int a()
    {
        if (b != null)
        {
            return b.size();
        } else
        {
            return 0;
        }
    }

    public PicUser a(int l)
    {
        if (l == b.size())
        {
            return null;
        } else
        {
            return (PicUser)b.get(l);
        }
    }

    public void a(PicUsersData picusersdata)
    {
        h = false;
        b(picusersdata);
        if (i != null)
        {
            i.a();
        }
    }

    public void a(Exception exception)
    {
        h = false;
        if (i != null)
        {
            i.b();
        }
    }

    public void a(String s)
    {
        ArrayList arraylist = b;
        arraylist;
        JVM INSTR monitorenter ;
        int l = 0;
_L2:
        if (l < getCount())
        {
            PicUser picuser = a(l);
            if (!picuser.getId().equals(s))
            {
                break MISSING_BLOCK_LABEL_56;
            }
            picuser.toggleFollowing();
            notifyDataSetChanged();
            return;
        }
        arraylist;
        JVM INSTR monitorexit ;
        return;
        s;
        arraylist;
        JVM INSTR monitorexit ;
        throw s;
        l++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public transient void a(String as[])
    {
        h = true;
        h();
        g = new com.cardinalblue.android.piccollage.controller.a.g(this, e, 0);
        g.a(as);
    }

    public boolean areAllItemsEnabled()
    {
        return false;
    }

    public transient Callable b(String as[])
    {
        return new Callable(as) {

            final String a[];
            final r b;

            public PicUsersData a()
                throws Exception
            {
                return com.cardinalblue.android.piccollage.controller.network.f.a(com.cardinalblue.android.piccollage.view.a.r.b(b), 0, com.cardinalblue.android.b.i.a(a));
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = r.this;
                a = as;
                super();
            }
        };
    }

    public void b()
    {
        d.e();
    }

    public void c()
    {
        d.d();
    }

    public void d()
    {
        d.f();
    }

    public void e()
    {
        h = true;
        h();
        g = new com.cardinalblue.android.piccollage.controller.a.g(this, e, 0);
        g.a(new String[0]);
    }

    public void f()
    {
        f = null;
        b.clear();
        notifyDataSetChanged();
    }

    public int getCount()
    {
        int i1 = a();
        int l = i1;
        if (f != null)
        {
            l = i1;
            if (i1 < f.getTotal())
            {
                l = i1 + 1;
            }
        }
        return l;
    }

    public Object getItem(int l)
    {
        return a(l);
    }

    public long getItemId(int l)
    {
        return (long)l;
    }

    public View getView(int l, View view, ViewGroup viewgroup)
    {
        if (l < b.size())
        {
            if (k.b(b.size(), l))
            {
                g();
            }
            PicUser picuser;
            String s;
            if (view == null || view == c)
            {
                view = LayoutInflater.from(a).inflate(0x7f0300ef, viewgroup, false);
                viewgroup = new b();
                viewgroup.a = (ImageView)view.findViewById(0x7f10022d);
                viewgroup.b = (TextView)view.findViewById(0x7f10022e);
                viewgroup.c = (TextView)view.findViewById(0x7f100230);
                view.setTag(viewgroup);
            } else
            {
                viewgroup = (b)view.getTag();
            }
            picuser = a(l);
            s = picuser.getProfileImageUrl();
            d.a(s).a(0x7f020224).a(com.bumptech.glide.load.engine.b.a).a(((b) (viewgroup)).a);
            if (picuser.isMe() || picuser.isPrivate())
            {
                ((b) (viewgroup)).c.setVisibility(8);
            } else
            {
                ((b) (viewgroup)).c.setVisibility(0);
            }
            ((b) (viewgroup)).b.setText(picuser.getDisplayName());
            a(picuser, ((b) (viewgroup)).c);
            view.findViewById(0x7f10022f).setOnClickListener(new android.view.View.OnClickListener(picuser, viewgroup) {

                final PicUser a;
                final b b;
                final r c;

                public void onClick(View view1)
                {
                    if (r.a(c) != null)
                    {
                        r.a(c).a(c, a);
                    }
                    view1 = a;
                    boolean flag;
                    if (!a.isFollowing().booleanValue())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    view1.setIsFollowing(flag);
                    r.a(c, a, b.c);
                }

            
            {
                c = r.this;
                a = picuser;
                b = b1;
                super();
            }
            });
            return view;
        } else
        {
            return c;
        }
    }

    public boolean isEnabled(int l)
    {
        if (l == b.size())
        {
            return false;
        } else
        {
            return super.isEnabled(l);
        }
    }
}
