// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class flb
{

    private final mmv a;
    private final fky b;
    private final fla c;
    private final List d;
    private final noz e;

    flb(Context context, fky fky1, fla fla1, mmv mmv1, List list)
    {
        b = fky1;
        a = mmv1;
        c = fla1;
        d = list;
        e = noz.a(context, 3, "FolderStatus", new String[] {
            "sync"
        });
    }

    private Set a()
    {
        Set set = b.a();
        if (set != null)
        {
            return set;
        } else
        {
            return Collections.emptySet();
        }
    }

    private mmz c(int i)
    {
        return a.b(i).h("com.google.android.apps.photos.FolderStatusManager");
    }

    private mmx d(int i)
    {
        return a.a(i).d("com.google.android.apps.photos.FolderStatusManager");
    }

    private fkz e(int i)
    {
        return new fkz(d(i).a("enabled_folders", new HashSet()));
    }

    public final fkz a(int i)
    {
        Object obj = c.a(i);
        if (!((fld) (obj)).a)
        {
            obj = b(i);
            if (e.a())
            {
                noy.a(i);
                noy.a("default", obj);
            }
            return ((fkz) (obj));
        }
        Object obj1 = ((fld) (obj)).b();
        obj = new HashSet(((fkz) (obj1)).a);
        ((Set) (obj)).addAll(a());
        obj = new fkz(((Set) (obj)));
        fkz fkz1 = e(i);
        if (((fkz) (obj)).equals(fkz1))
        {
            if (e.a())
            {
                noy.a(i);
                noy.a("old", fkz1);
                noy.a("new", obj1);
            }
            return ((fkz) (obj));
        }
        obj1 = ((fkz) (obj)).a;
        c(i).b("enabled_folders", ((Set) (obj1))).d();
        c(i).c("has_saved_state", true).d();
        obj1 = new HashSet();
        ((Set) (obj1)).addAll(((fkz) (obj)).a);
        ((Set) (obj1)).removeAll(fkz1.a);
        boolean flag = ((Set) (obj1)).isEmpty();
        if (e.a())
        {
            noy.a(i);
            noy.a("old", fkz1);
            noy.a("new", obj);
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            flh flh1 = (flh)iterator.next();
            if (flag)
            {
                flh1.b(i);
            } else
            {
                flh1.a(i);
            }
        }

        return ((fkz) (obj));
    }

    public final fkz b(int i)
    {
        if (d(i).a("has_saved_state", false))
        {
            return e(i);
        } else
        {
            return new fkz(a());
        }
    }
}
