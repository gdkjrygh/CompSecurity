// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Bj;
import Bt;
import Gc;
import LZ;
import NJ;
import Oy;
import SN;
import Vf;
import Vh;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.snapchat.android.Timber;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import yr;
import yt;
import yv;
import yw;
import yx;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            LeftSwipeSettingFragment, SettingsFragment

public class OfficialStoriesFragment extends LeftSwipeSettingFragment
{
    public static final class a
        implements Comparator
    {

        public static int a(SN sn, SN sn1)
        {
            return sn.b().compareTo(sn1.b());
        }

        public final int compare(Object obj, Object obj1)
        {
            return a((SN)obj, (SN)obj1);
        }

        public a()
        {
        }
    }


    public static final a a = new a();
    private final List b;
    private yx c;
    private final Bj d;
    private RecyclerView e;
    private TextView f;
    private LinearLayout g;

    public OfficialStoriesFragment()
    {
        this(Bj.a());
    }

    private OfficialStoriesFragment(Bj bj)
    {
        b = new ArrayList();
        d = bj;
    }

    private void a(String s)
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            yt yt1 = (yt)iterator.next();
            if (yt1.a() == 0)
            {
                if (TextUtils.equals(((yr)yt1).a.c(), s))
                {
                    iterator.remove();
                }
            } else
            if (yt1.a() == 1 && TextUtils.equals(((yv)yt1).c, s))
            {
                iterator.remove();
            }
        } while (true);
    }

    public void onAddCollaboratorFinishedEvent(LZ lz)
    {
        if (lz.mSucceeded)
        {
            SN sn = lz.mModifiedCollaborator;
            lz = lz.mVerifiedUserId;
            int i = 0;
            int k;
            do
            {
                k = i;
                if (i >= b.size())
                {
                    break;
                }
                Object obj = (yt)b.get(i);
                int j = i + 1;
                k = j;
                if (((yt) (obj)).a() == 2)
                {
                    break;
                }
                i = j;
                if (((yt) (obj)).a() != 1)
                {
                    continue;
                }
                obj = ((yv)obj).a;
                i = j;
                if (TextUtils.equals(((SN) (obj)).a(), lz))
                {
                    continue;
                }
                i = j;
                if (a.a(((SN) (obj)), sn) <= 0)
                {
                    continue;
                }
                k = j;
                break;
            } while (true);
            b.add(k - 1, new yv(sn, false, lz));
            ((android.support.v7.widget.RecyclerView.a) (c)).a.b();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f0400a9, viewgroup, false);
        d(0x7f0d037c).setOnClickListener(new android.view.View.OnClickListener() {

            private OfficialStoriesFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = OfficialStoriesFragment.this;
                super();
            }
        });
        e = (RecyclerView)d(0x7f0d037f);
        layoutinflater = e;
        getActivity().getApplicationContext();
        layoutinflater.setLayoutManager(new LinearLayoutManager(1));
        c = new yx(b, getActivity().getLayoutInflater());
        e.setAdapter(c);
        f = (TextView)d(0x7f0d037d);
        g = (LinearLayout)d(0x7f0d037e);
        return mFragmentLayout;
    }

    public void onRemoveCollaboratorFinishedEvent(NJ nj)
    {
        String s;
        String s1;
        int i;
        s = nj.mVerifiedUserId;
        s1 = nj.mModifiedCollaborator.b();
        i = 0;
_L3:
        if (i >= b.size()) goto _L2; else goto _L1
_L1:
        Object obj = (yt)b.get(i);
        if (((yt) (obj)).a() != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (yv)obj;
        if (!TextUtils.equals(((yv) (obj)).a.b(), s1) || !TextUtils.equals(((yv) (obj)).c, s))
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        if (i == -1)
        {
            Timber.e("OfficialStoriesFragment", (new StringBuilder("Tried to remove an non-existent collaborator: ")).append(nj.mModifiedCollaborator.b()).toString(), new Object[0]);
        } else
        {
label0:
            {
                yw yw1 = (yw)e.a(e.getChildAt(i));
                yw1.p.setVisibility(8);
                yw1.n.setVisibility(8);
                yw1.o.setVisibility(0);
                if (!nj.mSucceeded)
                {
                    break label0;
                }
                if (TextUtils.equals(nj.mVerifiedUserId, Bt.r()))
                {
                    b.remove(i);
                } else
                {
                    d.a(nj.mVerifiedUserId);
                    a(nj.mVerifiedUserId);
                }
                ((android.support.v7.widget.RecyclerView.a) (c)).a.b();
                if (!d.j())
                {
                    SettingsFragment.a(8);
                    getActivity().onBackPressed();
                    return;
                }
            }
        }
        return;
        i++;
          goto _L3
_L2:
        i = -1;
          goto _L4
        (new Gc(e.getContext())).a(0x7f0801b8).b(0x7f0801b7).a(0x7f0801bc, null).b();
        return;
          goto _L4
    }

    public void onResume()
    {
        super.onResume();
        b.clear();
        b.addAll(d.g());
    }

    public void onSyncCollaboratorsFinishedEvent(Oy oy)
    {
        g.setVisibility(8);
        if (oy.mSucceeded)
        {
            b.clear();
            f.setVisibility(8);
            b.addAll(d.g());
            ((android.support.v7.widget.RecyclerView.a) (c)).a.b();
        } else
        if (b.isEmpty())
        {
            if (oy.mErrCode == Vf.SERVER_LOST_CONTACT)
            {
                f.setText(0x7f0801b1);
            } else
            {
                f.setText(0x7f0801b2);
            }
            f.setVisibility(0);
            return;
        }
    }

    protected void onVisible()
    {
        super.onVisible();
        if (b.isEmpty())
        {
            g.setVisibility(0);
            f.setVisibility(4);
            return;
        } else
        {
            g.setVisibility(8);
            f.setVisibility(8);
            return;
        }
    }

}
