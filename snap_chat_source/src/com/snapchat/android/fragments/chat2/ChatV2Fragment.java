// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat2;

import By;
import FR;
import Hc;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snapchat.android.Timber;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.util.fragment.SnapchatFragment;
import java.util.Iterator;
import java.util.List;
import ll;
import qq;
import sJ;
import vN;
import xN;
import xO;
import xP;
import xQ;
import xR;
import xS;
import xT;
import xU;
import xV;
import xX;
import xY;
import xZ;
import ya;
import yb;
import yc;
import yd;
import ye;
import yf;
import yg;
import yh;
import zG;
import zL;
import zP;
import zQ;
import zS;
import zV;

public class ChatV2Fragment extends SnapchatFragment
{

    private final zG a;
    private xV b;
    private xT c;
    private xO d;
    private xY e;
    private yb f;
    private xP g;
    private xS h;
    private xZ i;
    private yd j;
    private yf k;
    private ya l;
    private xX m;
    private xQ n;
    private vN o;
    private By p;

    public ChatV2Fragment()
    {
        zG zg = new zG();
        By by = By.c();
        vN vn = new vN();
        FR.a();
        this(zg, by, vn);
    }

    private ChatV2Fragment(zG zg, By by, vN vn)
    {
        a = zg;
        p = by;
        o = vn;
    }

    static void a(ChatV2Fragment chatv2fragment, com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode statusbardrawmode)
    {
        chatv2fragment.a(statusbardrawmode);
    }

    public final void a(ChatConversation chatconversation)
    {
        if (chatconversation == null)
        {
            throw new IllegalArgumentException("Conversation cannot be null.");
        } else
        {
            Timber.f("ChatV2Fragment", "[Conversation] Chat conversation changed to %s.", new Object[] {
                chatconversation.mTheirUsername
            });
            a.a(chatconversation);
            return;
        }
    }

    protected final void e()
    {
        super.e();
        for (Iterator iterator = a.a(zP).iterator(); iterator.hasNext(); ((zP)iterator.next()).N_()) { }
    }

    public final void f(boolean flag)
    {
        for (Iterator iterator = a.a(zS).iterator(); iterator.hasNext(); ((zS)iterator.next()).a(flag)) { }
    }

    public final boolean f()
    {
        Iterator iterator = a.a(zL).iterator();
        boolean flag;
        for (flag = false; iterator.hasNext(); flag = ((zL)iterator.next()).c() | flag) { }
        return flag;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ll.e();
        mFragmentLayout = layoutinflater.inflate(0x7f040042, viewgroup, false);
        viewgroup = getActivity();
        if (viewgroup instanceof Hc)
        {
            layoutinflater = (Hc)viewgroup;
        } else
        {
            layoutinflater = null;
        }
        if (viewgroup instanceof qq)
        {
            viewgroup = (qq)viewgroup;
        } else
        {
            viewgroup = null;
        }
        b = new xV(this, a);
        d = new xO(this, a, mFragmentLayout);
        c = new xT(this, a);
        e = new xY(this, a);
        l = new ya(this, a, e);
        new yh(a);
        n = new xQ(this, a, mFragmentLayout);
        f = new yb(this, a);
        i = new xZ(this, a, mFragmentLayout, o);
        g = new xP(this, a, f, i, o);
        new ye(this, a);
        k = new yf(this, a, mFragmentLayout, layoutinflater, viewgroup);
        j = new yd(a);
        m = new xX(this, a);
        new yc(this, a);
        h = new xS(this, a, mFragmentLayout, new yg() {

            private ChatV2Fragment a;

            public final void a(com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode statusbardrawmode)
            {
                ChatV2Fragment.a(a, statusbardrawmode);
            }

            
            {
                a = ChatV2Fragment.this;
                super();
            }
        });
        new xU(this, a);
        c.a = (new xT.a[] {
            h, d
        });
        e.a = (new xY.b[] {
            h, b, l
        });
        i.a = (new xZ.a[] {
            h, b, e
        });
        k.a = (new sJ[] {
            k, g, h
        });
        g.a = (new xP.b[] {
            j, k, m
        });
        g.b = (new xP.c[] {
            n, e
        });
        h.a = (new xR[] {
            e, b, n
        });
        layoutinflater = getActivity().getIntent();
        if (layoutinflater == null) goto _L2; else goto _L1
_L1:
        if (!xN.a()) goto _L4; else goto _L3
_L3:
        xN.a(getActivity());
_L2:
        ll.f();
        return mFragmentLayout;
_L4:
        viewgroup = layoutinflater.getStringExtra("friendUsername");
        if (!TextUtils.isEmpty(viewgroup))
        {
            layoutinflater.removeExtra("friendUsername");
            a(p.a(viewgroup));
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void onPause()
    {
        super.onPause();
        for (Iterator iterator = a.a(zQ).iterator(); iterator.hasNext(); ((zQ)iterator.next()).e()) { }
    }

    protected void onVisible()
    {
        super.onVisible();
        for (Iterator iterator = a.a(zV).iterator(); iterator.hasNext(); ((zV)iterator.next()).M_()) { }
    }
}
