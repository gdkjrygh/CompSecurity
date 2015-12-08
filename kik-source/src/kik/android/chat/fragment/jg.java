// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.kik.m.n;
import com.kik.view.adapters.ContactsCursorAdapter;
import com.kik.view.adapters.MultiselectContactsCursorAdapter;
import com.kik.view.adapters.a;
import com.kik.view.adapters.bd;
import com.kik.view.adapters.k;
import java.util.Map;
import kik.android.chat.KikApplication;
import kik.android.sdkutils.concurrent.c;
import kik.android.util.ck;
import kik.android.util.cq;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            KikContactsListFragment, jh

final class jg
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{

    final KikContactsListFragment a;
    private boolean b;
    private boolean c;

    jg(KikContactsListFragment kikcontactslistfragment)
    {
        a = kikcontactslistfragment;
        super();
        b = false;
        c = false;
    }

    public final Loader onCreateLoader(int i, Bundle bundle)
    {
        android.content.Context context1;
        Uri uri1;
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            android.content.Context context = a.c.getContext();
            Uri uri = Uri.withAppendedPath(a.f, KikContactsListFragment.e(a));
            if (a.j())
            {
                bundle = "filteredRecentContacts";
            } else
            {
                bundle = "recentcontacts";
            }
            return new CursorLoader(context, uri, null, bundle, null, null);

        case 1: // '\001'
            context1 = a.c.getContext();
            uri1 = Uri.withAppendedPath(a.f, KikContactsListFragment.e(a));
            break;
        }
        if (a.j())
        {
            bundle = "filteredContacts";
        } else
        {
            bundle = null;
        }
        return new CursorLoader(context1, uri1, null, bundle, null, null);
    }

    public final void onLoadFinished(Loader loader, Object obj)
    {
        obj = (Cursor)obj;
        loader.getId();
        JVM INSTR tableswitch 0 1: default 32
    //                   0 1040
    //                   1 33;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        b = true;
        a.E.put(a.h(), obj);
_L9:
        loader = a.getActivity();
        if (!b || !c && a.g()) goto _L1; else goto _L4
_L4:
        boolean flag;
        c = false;
        b = false;
        if (a.b.equals("") && a.n())
        {
            if (KikContactsListFragment.g(a) == null)
            {
                kik.android.chat.fragment.KikContactsListFragment.a(a, new a(loader, 3));
            }
            int i;
            if (KikContactsListFragment.h(a).a(a.R()) == null)
            {
                KikContactsListFragment.h(a).b(a.R(), KikContactsListFragment.g(a));
            } else
            {
                KikContactsListFragment.h(a).a(KikContactsListFragment.g(a));
            }
        } else
        if (KikContactsListFragment.h(a).a(a.R()) != null)
        {
            KikContactsListFragment.h(a).a(new a(loader, 0));
        }
        if (a.b.equals("") && a.o() && a.I.b(kik.android.util.ck.b.c))
        {
            if (KikContactsListFragment.i(a) == null)
            {
                kik.android.chat.fragment.KikContactsListFragment.a(a, new bd(loader, a.I.c(kik.android.util.ck.b.c), a.I.d(kik.android.util.ck.b.c), a.K, a.H, a.J));
            }
            if (KikContactsListFragment.h(a).a(KikApplication.f(0x7f0900ea)) == null)
            {
                KikContactsListFragment.h(a).a(KikApplication.f(0x7f0900ea), KikContactsListFragment.i(a));
            } else
            {
                KikContactsListFragment.h(a).b(KikContactsListFragment.i(a));
            }
        } else
        if (KikContactsListFragment.h(a).a(KikApplication.f(0x7f0900ea)) != null)
        {
            KikContactsListFragment.h(a).b(new bd(loader, a.K, a.H, a.J));
        }
        KikContactsListFragment.h(a).a(cq.c(a.b));
        if (a.x())
        {
            if (a.g() && ((Cursor)a.E.get(a.h())).getCount() >= 10)
            {
                if (a.D != null && KikContactsListFragment.h(a).a(KikContactsListFragment.f(a)) != null)
                {
                    a.D.swapCursor((Cursor)a.E.get(KikContactsListFragment.f(a)));
                } else
                {
                    obj = new MultiselectContactsCursorAdapter(loader, (Cursor)a.E.get(KikContactsListFragment.f(a)), a.k(), KikContactsListFragment.j(a), a, a.K, a.H, a.J);
                    ((MultiselectContactsCursorAdapter) (obj)).a(KikContactsListFragment.q(), KikContactsListFragment.r());
                    a.D = ((ContactsCursorAdapter) (obj));
                    KikContactsListFragment.h(a).a(KikContactsListFragment.f(a), a.D, a.Q());
                }
            } else
            if (a.D != null && KikContactsListFragment.h(a).a(KikContactsListFragment.f(a)) != null)
            {
                a.D.swapCursor((Cursor)a.E.get(KikContactsListFragment.f(a)));
            }
            if (kik.android.chat.fragment.KikContactsListFragment.k(a) != null && KikContactsListFragment.h(a).a(a.h()) != null)
            {
                kik.android.chat.fragment.KikContactsListFragment.k(a).swapCursor((Cursor)a.E.get(a.h()));
            } else
            {
                obj = new MultiselectContactsCursorAdapter(loader, (Cursor)a.E.get(a.h()), a.k(), KikContactsListFragment.j(a), a, a.K, a.H, a.J);
                ((MultiselectContactsCursorAdapter) (obj)).a(KikContactsListFragment.q(), KikContactsListFragment.r());
                kik.android.chat.fragment.KikContactsListFragment.a(a, ((ContactsCursorAdapter) (obj)));
                KikContactsListFragment.h(a).b(a.h(), kik.android.chat.fragment.KikContactsListFragment.k(a), a.m());
            }
        } else
        {
            if (a.g() && ((Cursor)a.E.get(a.h())).getCount() >= 10)
            {
                if (a.D != null && KikContactsListFragment.h(a).a(KikContactsListFragment.f(a)) != null)
                {
                    a.D.swapCursor((Cursor)a.E.get(KikContactsListFragment.f(a)));
                } else
                {
                    a.D = new ContactsCursorAdapter(loader, (Cursor)a.E.get(KikContactsListFragment.f(a)), a.k(), KikContactsListFragment.j(a), a.K, a.H, a.J);
                    KikContactsListFragment.h(a).a(KikContactsListFragment.f(a), a.D, a.Q());
                }
            } else
            if (a.D != null && KikContactsListFragment.h(a).a(KikContactsListFragment.f(a)) != null)
            {
                a.D.swapCursor((Cursor)a.E.get(KikContactsListFragment.f(a)));
            }
            if (kik.android.chat.fragment.KikContactsListFragment.k(a) != null && KikContactsListFragment.h(a).a(a.h()) != null)
            {
                kik.android.chat.fragment.KikContactsListFragment.k(a).swapCursor((Cursor)a.E.get(a.h()));
            } else
            {
                kik.android.chat.fragment.KikContactsListFragment.a(a, new ContactsCursorAdapter(loader, (Cursor)a.E.get(a.h()), a.k(), KikContactsListFragment.j(a), a.K, a.H, a.J));
                KikContactsListFragment.h(a).b(a.h(), kik.android.chat.fragment.KikContactsListFragment.k(a), a.m());
            }
        }
        KikContactsListFragment.h(a).notifyDataSetChanged();
        if (a.c.getAdapter() == null)
        {
            a.c.setAdapter(KikContactsListFragment.h(a));
            n.a(a.c);
        }
        i = KikContactsListFragment.h(a).a();
        if (!a.n() && (i == 0 && !a.i() || i == 0 && (a.b == null || a.b.equals(""))))
        {
            if (i == 0 && (KikContactsListFragment.l(a) == null || KikContactsListFragment.l(a).length() == 0))
            {
                a.p.setText(a.a());
            } else
            {
                a.p.setText(Html.fromHtml(String.format(a.c(), new Object[] {
                    KikContactsListFragment.l(a)
                })));
            }
            a.getActivity().getWindow().setSoftInputMode(48);
            a.e.setVisibility(0);
            a.c.setVisibility(8);
        } else
        {
            a.getActivity().getWindow().setSoftInputMode(16);
            a.c.setVisibility(0);
            a.e.setVisibility(8);
        }
        if (!a.b.equals("") && a.b.equals(KikContactsListFragment.m(a))) goto _L6; else goto _L5
_L5:
        obj = (Cursor)a.E.get(a.h());
        i = ((Cursor) (obj)).getColumnIndex("suggest_text_2");
        if (!((Cursor) (obj)).moveToFirst()) goto _L8; else goto _L7
_L7:
        if (!((Cursor)a.E.get(a.h())).getString(i).equalsIgnoreCase(KikContactsListFragment.d(a)))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
_L10:
        cv.e(new View[] {
            a.i, a.j, a.k, a.h
        });
        if (!a.i() || flag || KikContactsListFragment.d(a) == null || KikContactsListFragment.d(a).equals(""))
        {
            a.x.c();
            a.t();
            kik.android.chat.fragment.KikContactsListFragment.n(a);
        } else
        {
            a.n.setVisibility(0);
            kik.android.chat.fragment.KikContactsListFragment.a(a, KikContactsListFragment.d(a));
        }
_L6:
        a.b(KikContactsListFragment.o(a));
        if (loader.findViewById(0x7f0e005e) != null)
        {
            a.s();
            if (a.c.getHeight() != 0)
            {
                a.c.post(new jh(this));
                return;
            }
        }
          goto _L1
_L2:
        c = true;
        a.E.put(KikContactsListFragment.f(a), obj);
          goto _L9
        if (((Cursor) (obj)).moveToNext()) goto _L7; else goto _L8
_L8:
        flag = false;
          goto _L10
    }

    public final void onLoaderReset(Loader loader)
    {
        loader.getId();
        JVM INSTR tableswitch 0 1: default 28
    //                   0 29
    //                   1 52;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (a.D != null)
        {
            a.D.swapCursor(null);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (kik.android.chat.fragment.KikContactsListFragment.k(a) != null)
        {
            kik.android.chat.fragment.KikContactsListFragment.k(a).swapCursor(null);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
