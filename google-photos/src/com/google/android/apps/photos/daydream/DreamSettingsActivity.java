// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.daydream;

import adi;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import b;
import eke;
import ekk;
import ekm;
import ekq;
import elj;
import emi;
import esm;
import ezb;
import ezc;
import eze;
import ezf;
import ezh;
import ezi;
import ezk;
import ezm;
import ezn;
import ezo;
import ezw;
import fux;
import hgz;
import hkj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import mmv;
import mmx;
import olm;
import omr;
import u;

// Referenced classes of package com.google.android.apps.photos.daydream:
//            PhotosDreamService

public class DreamSettingsActivity extends omr
{

    private static final ekk f = (new ekm()).a(elj).a();
    private static final ekk g = (new ekm()).a(elj).a(hkj).a();
    private hgz h;
    private emi i;
    private emi j;
    private mmv k;
    private Set l;
    private List m;
    private List n;

    public DreamSettingsActivity()
    {
        i = new emi(this, e, u.e, new ezm(this));
        j = new emi(this, e, u.f, new ezo(this));
    }

    public static Set a(DreamSettingsActivity dreamsettingsactivity)
    {
        return dreamsettingsactivity.l;
    }

    public static Set a(DreamSettingsActivity dreamsettingsactivity, Set set)
    {
        dreamsettingsactivity.l = set;
        return set;
    }

    public static void a(DreamSettingsActivity dreamsettingsactivity, int i1)
    {
        PhotosDreamService.a(dreamsettingsactivity, i1);
        (new ezw(dreamsettingsactivity, new ezn(dreamsettingsactivity))).execute(new Integer[] {
            Integer.valueOf(i1)
        });
        dreamsettingsactivity.a(dreamsettingsactivity.m, ((List) (null)));
        dreamsettingsactivity.j.a(b.a(PhotosDreamService.a(dreamsettingsactivity), new HashSet(Collections.singletonList(esm.b))), g);
    }

    public static void a(DreamSettingsActivity dreamsettingsactivity, List list, List list1)
    {
        dreamsettingsactivity.a(list, list1);
    }

    private void a(List list, List list1)
    {
        list = b(list, list1);
        h.a(list);
    }

    public static int b(DreamSettingsActivity dreamsettingsactivity)
    {
        return PhotosDreamService.a(dreamsettingsactivity);
    }

    private List b(List list, List list1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new ezi(getString(b.nE)));
        Iterator iterator = k.a(new String[] {
            "logged_in"
        }).iterator();
        while (iterator.hasNext()) 
        {
            int i1 = ((Integer)iterator.next()).intValue();
            mmx mmx1 = k.a(i1);
            boolean flag;
            if (PhotosDreamService.a(this) == i1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            arraylist.add(new ezb(mmx1.b("display_name"), flag, new ezc(this, i1)));
        }
        if (list != null)
        {
            m = list;
        }
        if (m == null || l == null)
        {
            arraylist.add(new ezi(getString(b.nF)));
            arraylist.add(new ezk());
        } else
        {
            if (!m.isEmpty())
            {
                arraylist.add(new ezi(getString(b.nF)));
            }
            list = m.iterator();
            while (list.hasNext()) 
            {
                ekq ekq1 = (ekq)list.next();
                arraylist.add(new eze(ekq1, l.contains(ekq1), new ezf(this, ekq1)));
            }
        }
        if (PhotosDreamService.a(this) == -1)
        {
            return arraylist;
        }
        arraylist.add(new ezi(getString(b.nG)));
        if (l != null)
        {
            try
            {
                list = b.a(PhotosDreamService.a(this), getApplicationContext(), f);
                arraylist.add(new eze(list, l.contains(list), new ezf(this, list)));
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                if (Log.isLoggable("DreamSettingsActivity", 6))
                {
                    Log.e("DreamSettingsActivity", "Failed to load features for all photos collection", list);
                }
            }
        }
        if (list1 != null)
        {
            n = list1;
        }
        if (n == null || l == null)
        {
            arraylist.add(new ezk());
        } else
        {
            list = n.iterator();
            while (list.hasNext()) 
            {
                list1 = (ekq)list.next();
                arraylist.add(new eze(list1, l.contains(list1), new ezf(this, list1)));
            }
        }
        return arraylist;
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        k = (mmv)d.a(mmv);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.ny);
        bundle = (RecyclerView)findViewById(u.h);
        bundle.a(new adi(getApplicationContext()));
        (new ezw(this, new ezn(this))).execute(new Integer[] {
            Integer.valueOf(PhotosDreamService.a(this))
        });
        h = new hgz(this, false, new ezh());
        bundle.a(h);
        i.a(fux.a(PhotosDreamService.a(this)), f);
        j.a(b.a(PhotosDreamService.a(this), new HashSet(Collections.singletonList(esm.b))), g);
    }

}
