// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.os.AsyncTask;
import com.tinder.b.g;
import com.tinder.b.h;
import com.tinder.b.j;
import com.tinder.b.l;
import com.tinder.b.m;
import com.tinder.events.match.EventMatchesLoaded;
import com.tinder.model.Match;
import com.tinder.model.Message;
import com.tinder.model.Person;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProfilePhoto;
import de.greenrobot.event.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

// Referenced classes of package com.tinder.managers:
//            i, ae

final class c extends AsyncTask
{

    final i a;
    private final List b;
    private final Date c;

    static List a(c c1)
    {
        return c1.b;
    }

    protected final Object doInBackground(Object aobj[])
    {
        new g();
        aobj = b;
        int j1 = ((List) (aobj)).size();
        int k1 = (int)Math.ceil((float)j1 / 50F);
        boolean flag2 = true;
        boolean flag3 = true;
        boolean flag1 = true;
        boolean flag = true;
        for (int k = 0; k < k1;)
        {
            Object obj = ((List) (aobj)).subList(k * 50, Math.min((k + 1) * 50, j1));
            ArrayList arraylist = new ArrayList(((List) (obj)).size());
            ArrayList arraylist1 = new ArrayList(((List) (obj)).size());
            ArrayList arraylist2 = new ArrayList(((List) (obj)).size());
            ArrayList arraylist3 = new ArrayList(((List) (obj)).size());
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj1 = (Match)((Iterator) (obj)).next();
                arraylist.add(g.a(((Match) (obj1))));
                if (((Match) (obj1)).hasMessages())
                {
                    for (Iterator iterator = ((Match) (obj1)).getMessages().iterator(); iterator.hasNext(); arraylist1.add(h.a((Message)iterator.next()))) { }
                }
                if (((Match) (obj1)).getPerson() != null)
                {
                    obj1 = ((Match) (obj1)).getPerson();
                    List list = ((Person) (obj1)).profilePhotos;
                    int i1 = 0;
                    while (i1 < list.size()) 
                    {
                        Object obj2 = (ProfilePhoto)list.get(i1);
                        arraylist2.add(m.a(((ProfilePhoto) (obj2)), ((Person) (obj1)).userId, i1));
                        for (obj2 = ((ProfilePhoto) (obj2)).processedPhotos.iterator(); ((Iterator) (obj2)).hasNext(); arraylist3.add(j.a((ProcessedPhoto)((Iterator) (obj2)).next()))) { }
                        i1++;
                    }
                }
            } while (true);
            flag3 &= l.a().a("matches", arraylist, "id");
            flag2 &= l.a().a("messages", arraylist1);
            flag1 &= l.a().a("photos", arraylist2);
            boolean flag4 = l.a().a("photos_processed", arraylist3);
            k++;
            flag &= flag4;
        }

        if (flag3 && flag2 && flag1 && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Collections.sort(b);
        if (flag && c != null)
        {
            (new StringBuilder("INSERTION SUCCESSFUL, last activity date: ")).append(c);
            i.i(a);
            ae.a(c.getTime());
            return Boolean.TRUE;
        } else
        {
            return Boolean.FALSE;
        }
    }

    public final void onPostExecute(Object obj)
    {
        if (((Boolean)obj).booleanValue())
        {
            a.a(b, new i.c() {

                final i.a a;

                public final void a()
                {
                    com.tinder.managers.i.g(a.a);
                    if (com.tinder.managers.i.l())
                    {
                        i.b(false);
                    }
                    com.tinder.managers.i.h(a.a).c(new EventMatchesLoaded(i.a.a(a)));
                }

            
            {
                a = i.a.this;
                super();
            }
            });
        }
    }

    public _cls1.a(i k, List list, Date date)
    {
        a = k;
        super();
        b = list;
        c = date;
    }
}
