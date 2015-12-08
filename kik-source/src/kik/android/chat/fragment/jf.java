// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kik.android.a;
import com.kik.cache.ContactImageView;
import com.kik.g.r;
import java.util.LinkedHashSet;
import kik.a.d.k;
import kik.a.f.q;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            KikContactsListFragment

final class jf extends r
{

    final KikContactsListFragment a;

    jf(KikContactsListFragment kikcontactslistfragment)
    {
        a = kikcontactslistfragment;
        super();
    }

    public final void a(Object obj)
    {
        obj = (k)obj;
        KikContactsListFragment.b(a);
        if (((k) (obj)).e().equalsIgnoreCase(a.b))
        {
            Object obj1 = (ContactImageView)a.h.findViewById(0x7f0e0167);
            ImageView imageview = (ImageView)a.h.findViewById(0x7f0e0168);
            ((ContactImageView) (obj1)).a(((k) (obj)), a.K, false, a.H, a.J);
            int i;
            if (((k) (obj)).i())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            imageview.setVisibility(i);
            ((TextView)a.h.findViewById(0x7f0e016a)).setText(((k) (obj)).c());
            ((TextView)a.h.findViewById(0x7f0e016b)).setText(((k) (obj)).e());
            obj1 = a.h.findViewById(0x7f0e016c);
            if (obj1 != null)
            {
                obj1 = (ImageView)obj1;
                if (a.b())
                {
                    ((ImageView) (obj1)).setVisibility(0);
                    if (a.C.contains(((k) (obj)).b()))
                    {
                        i = kik.android.chat.fragment.KikContactsListFragment.q();
                    } else
                    {
                        i = kik.android.chat.fragment.KikContactsListFragment.r();
                    }
                    ((ImageView) (obj1)).setBackgroundResource(i);
                } else
                {
                    ((ImageView) (obj1)).setVisibility(8);
                }
            }
            a.h.setTag(obj);
            a.J.b("User Search Complete").a("Was Inline", true).b();
            if (!KikContactsListFragment.c(a))
            {
                a.h.setVisibility(0);
                a.g.setVisibility(8);
            }
            a.z();
            super.a(obj);
            a.J.b("Talk To Inline Search User Returned").a("User Found", true).a("Lookup Error", false).a("Query Length", a.b.length()).b();
            return;
        } else
        {
            b(new Throwable());
            return;
        }
    }

    public final void b(Throwable throwable)
    {
        KikContactsListFragment.b(a);
        com.kik.android.a.f f = a.J.b("User Search Error").a("Was Inline", true).a("Network Error", true);
        boolean flag;
        if (KikContactsListFragment.d(a).indexOf(' ') >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f.a("Contains Spaces", flag).b();
        if (!KikContactsListFragment.c(a) && (throwable instanceof q) && ((q)throwable).a() == 101)
        {
            super.b(throwable);
            cv.e(new View[] {
                a.g, a.h
            });
            cv.b(new View[] {
                a.k
            });
            a.z();
            a.J.b("Talk To Inline Search User Returned").a("User Found", false).a("Lookup Error", true).a("Query Length", a.b.length()).b();
        } else
        if (!KikContactsListFragment.c(a) && q.a(throwable) != 109)
        {
            cv.e(new View[] {
                a.g, a.h
            });
            cv.b(new View[] {
                a.i
            });
            a.z();
            a.J.b("Talk To Inline Search User Returned").a("User Found", false).a("Lookup Error", false).a("Query Length", a.b.length()).b();
            return;
        }
    }
}
