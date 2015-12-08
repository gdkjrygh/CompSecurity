// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import Jo;
import LY;
import Mf;
import Oi;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.TextView;
import com.emilsjolander.components.stickylistheaders.StickyListHeadersListView;
import com.snapchat.android.LandingPageActivity;
import com.snapchat.android.Timber;
import com.snapchat.android.fragments.MiniProfileFragment;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.util.emoji.Emoji;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.List;
import xA;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

public class ChatWithFragment extends SnapchatFragment
    implements xA.a
{

    private StickyListHeadersListView a;
    private xA b;
    private EditText c;
    private View d;
    private TextView e;
    private final FriendManager f;
    private final Bus g;
    private android.widget.AdapterView.OnItemClickListener h = new android.widget.AdapterView.OnItemClickListener() {

        private ChatWithFragment a;

        public final void onItemClick(AdapterView adapterview, View view, int l, long l1)
        {
            adapterview = ((xA.b)view.getTag()).b;
            Timber.c("ChatWithFragment", (new StringBuilder("onItemClick - friend ")).append(adapterview).toString(), new Object[0]);
            ChatFragment.a(adapterview.g());
            ((LandingPageActivity)a.getActivity()).a(0, false);
            a.getActivity().onBackPressed();
        }

            
            {
                a = ChatWithFragment.this;
                super();
            }
    };
    private android.widget.AdapterView.OnItemLongClickListener i = new android.widget.AdapterView.OnItemLongClickListener() {

        private ChatWithFragment a;

        public final boolean onItemLongClick(AdapterView adapterview, View view, int l, long l1)
        {
            adapterview = (Friend)ChatWithFragment.b(a).getItem(l);
            Timber.c("ChatWithFragment", (new StringBuilder("onItemLongClick - friend ")).append(adapterview).toString(), new Object[0]);
            if (adapterview == null)
            {
                return false;
            } else
            {
                adapterview = MiniProfileFragment.a(adapterview.g(), 1);
                ChatWithFragment.c(a).a(new Oi(adapterview, false));
                Jo.a(a.getActivity(), ChatWithFragment.d(a));
                return true;
            }
        }

            
            {
                a = ChatWithFragment.this;
                super();
            }
    };
    private android.widget.AbsListView.OnScrollListener j = new android.widget.AbsListView.OnScrollListener() {

        private ChatWithFragment a;

        public final void onScroll(AbsListView abslistview, int l, int i1, int j1)
        {
        }

        public final void onScrollStateChanged(AbsListView abslistview, int l)
        {
            if (l != 0)
            {
                Jo.a(a.getActivity(), ChatWithFragment.e(a));
            }
        }

            
            {
                a = ChatWithFragment.this;
                super();
            }
    };
    private TextWatcher k = new TextWatcher() {

        private ChatWithFragment a;

        public final void afterTextChanged(Editable editable)
        {
        }

        public final void beforeTextChanged(CharSequence charsequence, int l, int i1, int j1)
        {
        }

        public final void onTextChanged(CharSequence charsequence, int l, int i1, int j1)
        {
            ChatWithFragment.b(a).getFilter().filter(charsequence.toString());
            if (TextUtils.isEmpty(charsequence))
            {
                ChatWithFragment.f(a).setFastScrollAlwaysVisible(true);
                ChatWithFragment.f(a).setFastScrollEnabled(true);
                ChatWithFragment.g(a).setVisibility(4);
                return;
            } else
            {
                ChatWithFragment.f(a).setFastScrollAlwaysVisible(false);
                ChatWithFragment.f(a).setFastScrollEnabled(false);
                ChatWithFragment.g(a).setVisibility(0);
                return;
            }
        }

            
            {
                a = ChatWithFragment.this;
                super();
            }
    };

    public ChatWithFragment()
    {
        this(FriendManager.e(), Mf.a());
    }

    private ChatWithFragment(FriendManager friendmanager, Bus bus)
    {
        f = friendmanager;
        g = bus;
    }

    static EditText a(ChatWithFragment chatwithfragment)
    {
        return chatwithfragment.c;
    }

    static xA b(ChatWithFragment chatwithfragment)
    {
        return chatwithfragment.b;
    }

    static Bus c(ChatWithFragment chatwithfragment)
    {
        return chatwithfragment.g;
    }

    static View d(ChatWithFragment chatwithfragment)
    {
        return chatwithfragment.mFragmentLayout;
    }

    static View e(ChatWithFragment chatwithfragment)
    {
        return chatwithfragment.mFragmentLayout;
    }

    static StickyListHeadersListView f(ChatWithFragment chatwithfragment)
    {
        return chatwithfragment.a;
    }

    static View g(ChatWithFragment chatwithfragment)
    {
        return chatwithfragment.d;
    }

    public final void a(List list)
    {
        if (list == null || list.isEmpty())
        {
            e.setVisibility(0);
            return;
        } else
        {
            e.setVisibility(8);
            return;
        }
    }

    public final boolean f()
    {
        Jo.a(getActivity(), mFragmentLayout);
        return false;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040043, viewgroup, false);
        if (f.f())
        {
            viewgroup = f;
            layoutinflater = new ArrayList(((FriendManager) (viewgroup)).mBests);
            layoutinflater.addAll(viewgroup.k());
        } else
        {
            layoutinflater = new ArrayList();
        }
        viewgroup = getActivity();
        new com.snapchat.android.model.Friend.a();
        b = new xA(viewgroup, layoutinflater, this);
        a = (StickyListHeadersListView)d(0x7f0d01bb);
        a.setAdapter(b);
        a.setFastScrollAlwaysVisible(true);
        a.setTextFilterEnabled(true);
        a.setOnItemClickListener(h);
        a.setOnItemLongClickListener(i);
        a.setOnScrollListener(j);
        c = (EditText)d(0x7f0d01ba);
        c.addTextChangedListener(k);
        c.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            private ChatWithFragment a;

            public final void onFocusChange(View view, boolean flag)
            {
                if (flag)
                {
                    Jo.h(a.getActivity());
                }
            }

            
            {
                a = ChatWithFragment.this;
                super();
            }
        });
        d = d(0x7f0d003d);
        d.setOnClickListener(new android.view.View.OnClickListener() {

            private ChatWithFragment a;

            public final void onClick(View view)
            {
                ChatWithFragment.a(a).setText("");
            }

            
            {
                a = ChatWithFragment.this;
                super();
            }
        });
        e = (TextView)d(0x7f0d01bc);
        layoutinflater = getString(0x7f08019c, new Object[] {
            LY.a(Emoji.POOP)
        });
        e.setText(layoutinflater);
        d(0x7f0d01b8).setOnClickListener(new android.view.View.OnClickListener() {

            private ChatWithFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = ChatWithFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }

    public void onVisible()
    {
        super.onVisible();
        c.requestFocus();
    }
}
