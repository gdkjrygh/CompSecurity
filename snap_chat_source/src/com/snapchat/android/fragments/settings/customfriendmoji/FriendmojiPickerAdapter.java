// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.customfriendmoji;

import Gi;
import Id;
import QJ;
import Zf;
import Zj;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.snapchat.android.analytics.framework.EasyMetric;
import eb;
import ep;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import yD;
import yE;

public final class FriendmojiPickerAdapter extends android.support.v7.widget.RecyclerView.a
{
    public static final class EmojiViewType extends Enum
    {

        private static final EmojiViewType $VALUES[];
        public static final EmojiViewType EMOJI;
        public static final EmojiViewType HEADER;
        public static final EmojiViewType SPACER;
        public static final EmojiViewType UNKNOWN;
        private static final Map b;
        private final int a;

        public static EmojiViewType fromValue(int k)
        {
            if (b.containsKey(Integer.valueOf(k)))
            {
                return (EmojiViewType)b.get(Integer.valueOf(k));
            } else
            {
                return UNKNOWN;
            }
        }

        public static EmojiViewType valueOf(String s)
        {
            return (EmojiViewType)Enum.valueOf(com/snapchat/android/fragments/settings/customfriendmoji/FriendmojiPickerAdapter$EmojiViewType, s);
        }

        public static EmojiViewType[] values()
        {
            return (EmojiViewType[])$VALUES.clone();
        }

        public final int getVal()
        {
            return a;
        }

        static 
        {
            int k = 0;
            UNKNOWN = new EmojiViewType("UNKNOWN", 0, -1);
            HEADER = new EmojiViewType("HEADER", 1, 0);
            EMOJI = new EmojiViewType("EMOJI", 2, 1);
            SPACER = new EmojiViewType("SPACER", 3, 2);
            $VALUES = (new EmojiViewType[] {
                UNKNOWN, HEADER, EMOJI, SPACER
            });
            eb.a a1 = eb.i();
            EmojiViewType aemojiviewtype[] = values();
            for (int l = aemojiviewtype.length; k < l; k++)
            {
                EmojiViewType emojiviewtype = aemojiviewtype[k];
                a1.a(Integer.valueOf(emojiviewtype.getVal()), emojiviewtype);
            }

            b = a1.a();
        }

        private EmojiViewType(String s, int k, int l)
        {
            super(s, k);
            a = l;
        }
    }

    public static interface a
    {

        public abstract void a(String s);
    }


    String c;
    List d;
    final String e;
    String f;
    a g;
    private LayoutInflater h;
    private final Zf i;
    private Map j;

    public FriendmojiPickerAdapter(Context context, String s, Zf zf, a a1)
    {
        d = new ArrayList();
        j = ep.a();
        h = LayoutInflater.from(context);
        e = s;
        i = zf;
        g = a1;
    }

    private boolean f(int k)
    {
        return k >= b() - 1;
    }

    public final int a(int k)
    {
        boolean flag;
        if (k <= 0 && k >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return EmojiViewType.HEADER.getVal();
        }
        if (f(k))
        {
            return EmojiViewType.SPACER.getVal();
        } else
        {
            return EmojiViewType.EMOJI.getVal();
        }
    }

    public final android.support.v7.widget.RecyclerView.v a(ViewGroup viewgroup, int k)
    {
        static final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[EmojiViewType.values().length];
                try
                {
                    a[EmojiViewType.HEADER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[EmojiViewType.SPACER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[EmojiViewType.EMOJI.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[EmojiViewType.fromValue(k).ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return new yD(h.inflate(0x7f040085, null));

        case 2: // '\002'
            viewgroup = new yE(h.inflate(0x7f040084, null));
            ((yE) (viewgroup)).l.setVisibility(4);
            return viewgroup;

        case 3: // '\003'
            viewgroup = new yE(h.inflate(0x7f040084, null));
            break;
        }
        ((yE) (viewgroup)).l.setOnClickListener(new android.view.View.OnClickListener(viewgroup) {

            private yE a;
            private FriendmojiPickerAdapter b;

            public final void onClick(View view)
            {
                int l = a.c();
                b.f = (String)b.d.get(l - 1);
                view = new EasyMetric("SELECTING_AN_ICON_FOR_A_FRIEND_EMOJI");
                view.a("emoji_picked", b.f);
                view.a("emoji_category", b.e);
                view.b(true);
                b.g.a(b.f);
                ((android.support.v7.widget.RecyclerView.a) (b)).a.b();
            }

            
            {
                b = FriendmojiPickerAdapter.this;
                a = ye;
                super();
            }
        });
        ((yE) (viewgroup)).l.setOnTouchListener(new Id(((yE) (viewgroup)).l));
        return viewgroup;
    }

    public final void a(android.support.v7.widget.RecyclerView.v v, int k)
    {
        if (!(v instanceof yE)) goto _L2; else goto _L1
_L1:
        v = (yE)v;
        k--;
        if (f(k)) goto _L4; else goto _L3
_L3:
        String s;
        s = (String)d.get(k);
        i.a(s).a(Gi.a).a(((yE) (v)).l, null);
        if (f == null)
        {
            QJ qj = (QJ)j.get(e);
            if (qj != null)
            {
                f = qj.c();
            }
        }
        if (!TextUtils.equals(s, f)) goto _L6; else goto _L5
_L5:
        ((yE) (v)).l.setSelected(true);
_L8:
        return;
_L6:
        ((yE) (v)).l.setSelected(false);
        return;
_L4:
        ((yE) (v)).l.setImageResource(0x7f020139);
        return;
_L2:
        if (v instanceof yD)
        {
            v = (yD)v;
            if (c != null)
            {
                ((yD) (v)).l.setText(c);
                return;
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(Map map)
    {
        j.clear();
        if (map != null)
        {
            j.putAll(map);
        }
    }

    public final int b()
    {
        return d.size() + 1;
    }
}
