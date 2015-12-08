// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.customfriendmoji;

import Br;
import MK;
import OH;
import QJ;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.util.fragment.SnapchatFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import mj;
import yC;

public class FriendmojiLegendFragment extends SnapchatFragment
{

    private ListView a;
    private yC b;
    private final Provider c;

    public FriendmojiLegendFragment()
    {
        this(Br.UNSAFE_USER_PROVIDER);
    }

    private FriendmojiLegendFragment(Provider provider)
    {
        c = provider;
        (new EasyMetric("ENTERING_FRIEND_EMOJI_SETTINGS")).b(false);
    }

    private static List a(Map map)
    {
        ArrayList arraylist = new ArrayList();
        if (map != null)
        {
            arraylist.addAll(map.entrySet());
            Collections.sort(arraylist, new Comparator() {

                public final int compare(Object obj, Object obj1)
                {
                    obj = (java.util.Map.Entry)obj;
                    obj1 = (java.util.Map.Entry)obj1;
                    obj = (QJ)((java.util.Map.Entry) (obj)).getValue();
                    obj1 = (QJ)((java.util.Map.Entry) (obj1)).getValue();
                    if (obj != null && obj1 != null)
                    {
                        if (((QJ) (obj)).i().intValue() > ((QJ) (obj1)).i().intValue())
                        {
                            return 1;
                        }
                        if (((QJ) (obj)).i().intValue() < ((QJ) (obj1)).i().intValue())
                        {
                            return -1;
                        }
                    }
                    return 0;
                }

            });
        }
        return arraylist;
    }

    private void a(Br br)
    {
        if (br != null && br.mInitialized)
        {
            b.a(a(((Map) (br.k()))));
        }
    }

    static void a(FriendmojiLegendFragment friendmojilegendfragment)
    {
        friendmojilegendfragment = friendmojilegendfragment.getActivity();
        if (friendmojilegendfragment != null)
        {
            (new android.app.AlertDialog.Builder(friendmojilegendfragment)).setTitle(null).setMessage(0x7f080144).setPositiveButton(0x7f080323, new android.content.DialogInterface.OnClickListener() {

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    (new mj(QY.a.EMOJI_FOR_RESET)).execute();
                    (new EasyMetric("RESETTING_FRIEND_EMOJIS_TO_DEFAULT")).b(false);
                }

            }).setNegativeButton(0x7f08007f, null).show();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f04007f, viewgroup, false);
        d(0x7f0d02e1).setOnClickListener(new android.view.View.OnClickListener() {

            private FriendmojiLegendFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = FriendmojiLegendFragment.this;
                super();
            }
        });
        b = new yC(getActivity(), new ArrayList());
        a = (ListView)d(0x7f0d02e3);
        viewgroup = layoutinflater.inflate(0x7f040082, a, false);
        a.addHeaderView(viewgroup, null, false);
        layoutinflater = layoutinflater.inflate(0x7f040081, a, false);
        layoutinflater.setOnClickListener(new android.view.View.OnClickListener() {

            private FriendmojiLegendFragment a;

            public final void onClick(View view)
            {
                FriendmojiLegendFragment.a(a);
            }

            
            {
                a = FriendmojiLegendFragment.this;
                super();
            }
        });
        a.addFooterView(layoutinflater, null, true);
        a.setAdapter(b);
        a((Br)c.get());
        return mFragmentLayout;
    }

    public void onFriendmojiDictionayTaskUpdateEvent(MK mk)
    {
        mk = mk.editableFriendmojiDict;
        if (mk != null)
        {
            b.a(a(mk));
        }
    }

    public void onUserLoadedEvent(OH oh)
    {
        a(oh.user);
    }

    public void onVisible()
    {
        super.onVisible();
        a((Br)c.get());
    }
}
