// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import By;
import IB;
import OE;
import PG;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.util.AlertDialogUtils;
import java.util.Iterator;
import java.util.List;
import ox;
import yp;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            LeftSwipeSettingFragment

public class ClearConversationsFragment extends LeftSwipeSettingFragment
    implements ox.a
{

    private IB a;
    private BaseAdapter b;
    private TextView c;
    private ProgressBar d;
    private TextView e;

    public ClearConversationsFragment()
    {
    }

    static TextView a(ClearConversationsFragment clearconversationsfragment)
    {
        return clearconversationsfragment.c;
    }

    static ProgressBar b(ClearConversationsFragment clearconversationsfragment)
    {
        return clearconversationsfragment.d;
    }

    private void b(boolean flag)
    {
        IB ib = a;
        ib;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            ((ChatConversation)iterator.next()).mBeingCleared = flag;
        }

        break MISSING_BLOCK_LABEL_45;
        Exception exception;
        exception;
        ib;
        JVM INSTR monitorexit ;
        throw exception;
        ib;
        JVM INSTR monitorexit ;
    }

    static void c(ClearConversationsFragment clearconversationsfragment)
    {
        clearconversationsfragment.b(true);
    }

    static BaseAdapter d(ClearConversationsFragment clearconversationsfragment)
    {
        return clearconversationsfragment.b;
    }

    static IB e(ClearConversationsFragment clearconversationsfragment)
    {
        return clearconversationsfragment.a;
    }

    public final void Q_()
    {
        b(false);
        if (isAdded())
        {
            PG.a(new Runnable() {

                private ClearConversationsFragment a;

                public final void run()
                {
                    ClearConversationsFragment.a(a).setEnabled(true);
                    ClearConversationsFragment.b(a).setVisibility(8);
                    AlertDialogUtils.a(a.getString(0x7f080260), a.getActivity());
                }

            
            {
                a = ClearConversationsFragment.this;
                super();
            }
            });
        }
    }

    public final void a()
    {
        Object obj = By.c();
        List list = ((By) (obj)).mConversations;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = ((By) (obj)).mConversations.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ChatConversation chatconversation = (ChatConversation)iterator.next();
            if (chatconversation.mBeingCleared)
            {
                chatconversation.z();
                iterator.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_68;
        obj;
        list;
        JVM INSTR monitorexit ;
        throw obj;
        obj.mIterToken = null;
        ((By) (obj)).e();
        list;
        JVM INSTR monitorexit ;
        ((By) (obj)).h();
        if (isAdded())
        {
            PG.a(new Runnable() {

                private ClearConversationsFragment a;

                public final void run()
                {
                    synchronized (ClearConversationsFragment.e(a))
                    {
                        ClearConversationsFragment.b(a).setVisibility(8);
                    }
                    return;
                    exception;
                    ib;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                a = ClearConversationsFragment.this;
                super();
            }
            });
        }
        return;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040047, viewgroup, false);
        a = By.c().mConversationsForListView;
        b = yp.a(getActivity(), a);
        ((ListView)d(0x7f0d01c4)).setAdapter(b);
        d(0x7f0d01c1).setOnClickListener(new android.view.View.OnClickListener() {

            private ClearConversationsFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = ClearConversationsFragment.this;
                super();
            }
        });
        d = (ProgressBar)d(0x7f0d01c3);
        e = (TextView)d(0x7f0d01c5);
        c = (TextView)d(0x7f0d01c2);
        c.setOnClickListener(new android.view.View.OnClickListener() {

            final ClearConversationsFragment a;

            public final void onClick(View view)
            {
                view = new android.app.AlertDialog.Builder(a.getActivity());
                view.setTitle(a.getString(0x7f08025b)).setMessage(a.getString(0x7f08025c)).setPositiveButton(a.getString(0x7f0801bc), new android.content.DialogInterface.OnClickListener(this) {

                    private _cls2 a;

                    public final void onClick(DialogInterface dialoginterface, int i)
                    {
                        AlertDialogUtils.a(a.a.getString(0x7f080262), a.a.getActivity());
                        ClearConversationsFragment.a(a.a).setVisibility(8);
                        ClearConversationsFragment.b(a.a).setVisibility(0);
                        AnalyticsEvents.m();
                        AnalyticsEvents.n();
                        ClearConversationsFragment.c(a.a);
                        (new ox(a.a)).execute();
                        ClearConversationsFragment.d(a.a).notifyDataSetChanged();
                    }

            
            {
                a = _pcls2;
                super();
            }
                }).setNegativeButton(a.getString(0x7f08007f), null);
                view.create().show();
            }

            
            {
                a = ClearConversationsFragment.this;
                super();
            }
        });
        synchronized (a)
        {
            if (a.isEmpty())
            {
                c.setVisibility(8);
                e.setVisibility(0);
            }
        }
        return mFragmentLayout;
        viewgroup;
        layoutinflater;
        JVM INSTR monitorexit ;
        throw viewgroup;
    }

    public void onUpdateFeedEvent(OE oe)
    {
        oe = a;
        oe;
        JVM INSTR monitorenter ;
        synchronized (a)
        {
            a.clear();
            a.addAll(By.c().f());
        }
        b.notifyDataSetChanged();
        if (!a.isEmpty())
        {
            break MISSING_BLOCK_LABEL_84;
        }
        c.setVisibility(8);
        e.setVisibility(0);
_L1:
        oe;
        JVM INSTR monitorexit ;
        return;
        exception1;
        ib;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        oe;
        JVM INSTR monitorexit ;
        throw exception;
        c.setVisibility(0);
        e.setVisibility(8);
          goto _L1
    }
}
