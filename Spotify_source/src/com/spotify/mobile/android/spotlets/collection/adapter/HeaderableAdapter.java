// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.adapter;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.viewuri.Verified;
import dhu;
import dhv;
import dmz;
import env;
import epf;
import epj;
import epk;
import gae;
import gfp;
import gji;
import gjj;
import java.io.IOException;
import java.util.ArrayList;

public abstract class HeaderableAdapter extends BaseAdapter
{

    private static final int h = Type.values().length;
    public final Context a;
    public final Verified b;
    public final Flags c;
    public String d;
    public String e;
    public final epf f;
    public gji g;
    private epj i;

    public HeaderableAdapter(Context context, epf epf1, Verified verified, Flags flags)
    {
        a = context;
        b = verified;
        c = flags;
        f = epf1;
        i = new epj(new epk() {

            private HeaderableAdapter a;

            public final void a()
            {
                a.notifyDataSetChanged();
            }

            
            {
                a = HeaderableAdapter.this;
                super();
            }
        }, f);
        dmz.a(gjj);
        g = gjj.a(context);
    }

    public final env a(int j)
    {
        return (env)i.a(j);
    }

    public final void a()
    {
        epj epj1 = i;
        if (!epj1.f)
        {
            epj1.f = true;
            boolean flag;
            if (epj1.e != 0x80000000 && epj1.b != 0x80000000 && epj1.e >= epj1.b && epj1.e < epj1.b + epj1.k.size())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                epj1.l.a();
            } else
            {
                epj1.h = true;
            }
            epj1.b();
        }
    }

    public final void a(Bundle bundle)
    {
        int j = 0;
        epj epj1;
        int k;
        try
        {
            epj1 = i;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        epj1.b = bundle.getInt("range_loader_first_item", 0x80000000);
        epj1.c = bundle.getInt("range_loader_first_non_dirty_item", 0x80000000);
        epj1.d = bundle.getInt("range_loader_last_non_dirty_item");
        k = bundle.getInt("range_loader_saved_items", 0);
        if (epj1.b == 0x80000000) goto _L2; else goto _L1
_L1:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        epj1.k.add(epj1.m.c(bundle.getByteArray((new StringBuilder("range_loader_item")).append(j).toString())));
        j++;
        if (true) goto _L1; else goto _L2
_L2:
        epj1.a = bundle.getInt("range_loader_num_total_items", 0);
        epj1.e = bundle.getInt("range_loader_last_wanted_item", 0);
    }

    public abstract void a(env env1, dhu dhu1, int j);

    public final void a(gfp gfp)
    {
        f.a(gfp);
        a(true);
    }

    public final void a(String s)
    {
        if (TextUtils.equals(s, d))
        {
            return;
        } else
        {
            d = s;
            a(false);
            return;
        }
    }

    public final void a(boolean flag)
    {
        epj epj1 = i;
        if (epj1.f)
        {
            if (flag)
            {
                epj1.g = true;
                epj1.b();
            } else
            if (!epj1.h || !epj1.i)
            {
                epj1.l.a();
                return;
            }
        }
    }

    public final void b(Bundle bundle)
    {
        epj epj1;
        int j;
        j = 0;
        epj1 = i;
        if (epj1.b == 0x80000000) goto _L2; else goto _L1
_L1:
        if (epj1.e >= epj1.b && epj1.e < epj1.b + epj1.k.size()) goto _L4; else goto _L3
_L3:
        epj1.a();
_L2:
        bundle.putInt("range_loader_first_item", epj1.b);
        bundle.putInt("range_loader_first_non_dirty_item", epj1.c);
        bundle.putInt("range_loader_last_non_dirty_item", epj1.d);
        bundle.putInt("range_loader_saved_items", epj1.k.size());
        if (epj1.b != 0x80000000)
        {
            for (int k = epj1.k.size(); j < k; j++)
            {
                bundle.putByteArray((new StringBuilder("range_loader_item")).append(j).toString(), epj1.m.a(epj1.k.get(j)));
            }

        }
        break; /* Loop/switch isn't completed */
_L4:
        int l = Math.max(epj1.e - 8, 0);
        if (epj1.k.size() > (l + 16) - epj1.b)
        {
            epj1.c((epj1.k.size() - 16 - l) + epj1.b);
        }
        if (l > epj1.b)
        {
            epj1.b(l - epj1.b);
            epj1.b = l;
        }
        if (true) goto _L2; else goto _L5
_L5:
        bundle.putInt("range_loader_num_total_items", epj1.a);
        bundle.putInt("range_loader_last_wanted_item", epj1.e);
        return;
    }

    public final void b(String s)
    {
        if (TextUtils.equals(s, e))
        {
            return;
        } else
        {
            e = s;
            a(false);
            return;
        }
    }

    public final void b(boolean flag)
    {
        f.a(false, flag, false);
        a(true);
    }

    public final void c(String s)
    {
        f.b(s);
        a(true);
    }

    public int getCount()
    {
        return i.a;
    }

    public Object getItem(int j)
    {
        return a(j);
    }

    public long getItemId(int j)
    {
        return (long)j;
    }

    public int getItemViewType(int j)
    {
        env env1 = (env)i.a(j);
        if (env1 == null)
        {
            return Type.c.ordinal();
        }
        if (env1.isHeader())
        {
            return Type.b.ordinal();
        } else
        {
            return Type.a.ordinal();
        }
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        Type type = Type.values()[getItemViewType(j)];
        final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[Type.values().length];
                try
                {
                    a[Type.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Type.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Type.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (view == null)
        {
            if (type == Type.c)
            {
                view = dhv.a(a, viewgroup).v();
            } else
            if (type == Type.a)
            {
                view = dhv.e(a, viewgroup);
                view.a(gae.b(a));
                view = view.v();
            } else
            {
                view = new SectionHeaderView(a);
            }
        }
        viewgroup = (env)i.a(j);
        _cls2.a[type.ordinal()];
        JVM INSTR tableswitch 1 3: default 84
    //                   1 105
    //                   2 158
    //                   3 170;
           goto _L1 _L2 _L3 _L4
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        Assertion.a((new StringBuilder("Unknown type ")).append(type).toString());
_L6:
        return view;
_L3:
        a(viewgroup, dhu.b(view), j);
        return view;
_L4:
        SectionHeaderView sectionheaderview = (SectionHeaderView)view;
        sectionheaderview.a();
        if (viewgroup != null)
        {
            sectionheaderview.a(viewgroup.getHeader());
            return view;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int getViewTypeCount()
    {
        return h;
    }

    public boolean isEnabled(int j)
    {
        env env1 = (env)i.a(j);
        return env1 == null || !env1.isHeader();
    }


    private class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        public static final Type c;
        private static final Type d[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/spotify/mobile/android/spotlets/collection/adapter/HeaderableAdapter$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])d.clone();
        }

        static 
        {
            a = new Type("ITEM", 0);
            b = new Type("HEADER", 1);
            c = new Type("UNKNOWN", 2);
            d = (new Type[] {
                a, b, c
            });
        }

        private Type(String s, int j)
        {
            super(s, j);
        }
    }

}
