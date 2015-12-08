// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.customfriendmoji;

import Br;
import Gk;
import Go;
import MK;
import OH;
import QJ;
import QK;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.ui.EmojiTextView;
import com.snapchat.android.util.fragment.SnapchatFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import mj;
import yB;

// Referenced classes of package com.snapchat.android.fragments.settings.customfriendmoji:
//            FriendmojiPickerAdapter

public class FriendmojiPickerFragment extends SnapchatFragment
{

    private String a;
    private Provider b;
    private EmojiTextView c;
    private FriendmojiPickerAdapter d;
    private RecyclerView e;
    private FriendmojiPickerAdapter.a f = new FriendmojiPickerAdapter.a() {

        private FriendmojiPickerFragment a;

        public final void a(String s)
        {
            FriendmojiPickerFragment.a(a).setText(s);
        }

            
            {
                a = FriendmojiPickerFragment.this;
                super();
            }
    };

    public FriendmojiPickerFragment()
    {
        this(Br.UNSAFE_USER_PROVIDER);
    }

    private FriendmojiPickerFragment(Provider provider)
    {
        b = provider;
    }

    public static FriendmojiPickerFragment a(String s)
    {
        FriendmojiPickerFragment friendmojipickerfragment = new FriendmojiPickerFragment();
        Object obj = new Bundle(1);
        ((Bundle) (obj)).putSerializable("friendmoji_symbol", s);
        friendmojipickerfragment.setArguments(((Bundle) (obj)));
        obj = new EasyMetric("ENTERING_FRIEND_EMOJI_PICKER");
        ((EasyMetric) (obj)).a("emoji_category", s);
        ((EasyMetric) (obj)).b(false);
        return friendmojipickerfragment;
    }

    static EmojiTextView a(FriendmojiPickerFragment friendmojipickerfragment)
    {
        return friendmojipickerfragment.c;
    }

    private void a(Br br)
    {
        if (br != null && br.mInitialized)
        {
            br = br.j();
            Object obj = (QJ)br.get(a);
            if (obj != null)
            {
                c.setText(((QJ) (obj)).c());
                d.c = ((QJ) (obj)).f();
                Object obj1 = new ArrayList();
                String s;
                for (Iterator iterator = br.values().iterator(); iterator.hasNext(); ((List) (obj1)).add(s))
                {
                    Object obj2 = (QJ)iterator.next();
                    s = ((QJ) (obj2)).h();
                    obj2 = ((QJ) (obj2)).c();
                    if (!((String) (obj2)).equals(s) && !((String) (obj2)).equals(((QJ) (obj)).c()))
                    {
                        ((List) (obj1)).add(obj2);
                    }
                }

                obj1 = new yB(((List) (obj1)));
                obj = ((QJ) (obj)).h();
                ((yB) (obj1)).a.add(0, obj);
                obj = d;
                List list = ((yB) (obj1)).a;
                ((FriendmojiPickerAdapter) (obj)).d.clear();
                ((FriendmojiPickerAdapter) (obj)).d.addAll(list);
                d.a(br);
                if (getActivity() != null)
                {
                    a(((yB) (obj1)).a, Gk.a());
                }
                ((android.support.v7.widget.RecyclerView.a) (d)).a.b();
            }
        }
    }

    private static void a(List list, Gk gk)
    {
        Go go = new Go(0, 0);
        go.a(list);
        gk.a(go);
    }

    static FriendmojiPickerAdapter b(FriendmojiPickerFragment friendmojipickerfragment)
    {
        return friendmojipickerfragment.d;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            a = bundle.getString("friendmoji_symbol");
        }
        Timber.c("FriendmojiPickerFragment", (new StringBuilder("onCreate - mFriendmojiSymbol ")).append(a).toString(), new Object[0]);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040083, viewgroup, false);
        d(0x7f0d02e9).setOnClickListener(new android.view.View.OnClickListener() {

            private FriendmojiPickerFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = FriendmojiPickerFragment.this;
                super();
            }
        });
        c = (EmojiTextView)mFragmentLayout.findViewById(0x7f0d02ea);
        layoutinflater = Gk.a();
        d = new FriendmojiPickerAdapter(getActivity(), a, layoutinflater.b(), f);
        e = (RecyclerView)d(0x7f0d02eb);
        getActivity();
        layoutinflater = new GridLayoutManager(5);
        e.setLayoutManager(layoutinflater);
        e.setAdapter(d);
        layoutinflater.b = new android.support.v7.widget.GridLayoutManager.b(layoutinflater) {

            private GridLayoutManager b;
            private FriendmojiPickerFragment c;

            public final int a(int i)
            {
                if (FriendmojiPickerFragment.b(c).a(i) == FriendmojiPickerAdapter.EmojiViewType.HEADER.getVal())
                {
                    return b.a;
                } else
                {
                    return 1;
                }
            }

            
            {
                c = FriendmojiPickerFragment.this;
                b = gridlayoutmanager;
                super();
            }
        };
        a((Br)b.get());
        return mFragmentLayout;
    }

    public void onFriendmojiDictionayTaskUpdateEvent(MK mk)
    {
        mk = mk.editableFriendmojiDict;
        if (mk != null)
        {
            Object obj = (QJ)mk.get(a);
            if (obj != null)
            {
                obj = ((QJ) (obj)).c();
                c.setText(((CharSequence) (obj)));
                FriendmojiPickerAdapter friendmojipickeradapter = d;
                friendmojipickeradapter.a(mk);
                friendmojipickeradapter.f = ((String) (obj));
                ((android.support.v7.widget.RecyclerView.a) (friendmojipickeradapter)).a.b();
            }
        }
    }

    public void onPause()
    {
        super.onPause();
        (new mj(QY.a.FRIENDMOJI_UPDATE, a, QK.UNICODE, d.f)).execute();
    }

    public void onUserLoadedEvent(OH oh)
    {
        a(oh.user);
    }
}
