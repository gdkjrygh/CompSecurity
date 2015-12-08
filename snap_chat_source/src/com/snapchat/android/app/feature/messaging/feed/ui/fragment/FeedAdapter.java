// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import GA;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import pT;
import pW;
import pX;
import pY;
import qa;

public class FeedAdapter extends android.support.v7.widget.RecyclerView.a
{
    public static final class FeedViewType extends Enum
    {

        private static final FeedViewType $VALUES[];
        public static final FeedViewType ADD_CONTACTS_FOOTER;
        public static final FeedViewType CONVERSATION;
        public static final FeedViewType LOADING;

        public static FeedViewType valueOf(String s)
        {
            return (FeedViewType)Enum.valueOf(com/snapchat/android/app/feature/messaging/feed/ui/fragment/FeedAdapter$FeedViewType, s);
        }

        public static FeedViewType[] values()
        {
            return (FeedViewType[])$VALUES.clone();
        }

        static 
        {
            CONVERSATION = new FeedViewType("CONVERSATION", 0);
            LOADING = new FeedViewType("LOADING", 1);
            ADD_CONTACTS_FOOTER = new FeedViewType("ADD_CONTACTS_FOOTER", 2);
            $VALUES = (new FeedViewType[] {
                CONVERSATION, LOADING, ADD_CONTACTS_FOOTER
            });
        }

        private FeedViewType(String s, int i)
        {
            super(s, i);
        }
    }


    public List c;
    public GA d;
    private boolean e;

    public FeedAdapter(List list)
    {
        c = list;
        S_();
    }

    public final int a(int i)
    {
        if (f(i) && e)
        {
            return FeedViewType.ADD_CONTACTS_FOOTER.ordinal();
        }
        FeedViewType feedviewtype = ((pT)c.get(i)).W_();
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[FeedViewType.values().length];
                try
                {
                    a[FeedViewType.CONVERSATION.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[FeedViewType.LOADING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[FeedViewType.ADD_CONTACTS_FOOTER.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[feedviewtype.ordinal()])
        {
        default:
            throw new RuntimeException((new StringBuilder("Unsupported view type: ")).append(feedviewtype).toString());

        case 1: // '\001'
            return FeedViewType.CONVERSATION.ordinal();

        case 2: // '\002'
            return FeedViewType.LOADING.ordinal();
        }
    }

    public final android.support.v7.widget.RecyclerView.v a(ViewGroup viewgroup, int i)
    {
        FeedViewType feedviewtype = FeedViewType.values()[i];
        switch (_cls1.a[feedviewtype.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return new pX(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f040076, viewgroup, false));

        case 2: // '\002'
            return new qa(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f040075, viewgroup, false));

        case 3: // '\003'
            return new pW(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f040001, viewgroup, false));
        }
    }

    public final void a(GA ga)
    {
        d = ga;
    }

    public final void a(android.support.v7.widget.RecyclerView.v v)
    {
        ((pY)v).t();
    }

    public volatile void a(android.support.v7.widget.RecyclerView.v v, int i)
    {
        a((pY)v, i);
    }

    public void a(pY py, int i)
    {
        py.c(false);
        if (!f(i))
        {
            py.a((pT)c.get(i));
            if (d != null)
            {
                d.a(py);
                return;
            }
        }
    }

    public final void a(boolean flag)
    {
        e = flag;
        super.a.b();
    }

    public final int b()
    {
        int j = c.size();
        int i;
        if (e)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + j;
    }

    public final long b(int i)
    {
        if (f(i) && e)
        {
            return (long)"ADD_CONTACTS_FOOTER_FEED_ITEM".hashCode();
        } else
        {
            return (long)((pT)c.get(i)).V_().hashCode();
        }
    }

    public final boolean f(int i)
    {
        return i == c.size();
    }
}
