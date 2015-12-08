// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.ContentObserver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class fve
    implements ekr
{

    private final fvg a;
    private final eme b;
    private final noz c;

    public fve(Context context, fvg fvg1)
    {
        a = fvg1;
        fvg1 = new elp(context, fva);
        b = (new eme()).a(new fvc(context, fvg1));
        c = noz.a(context, 3, "LocalCollection", new String[] {
            "perf"
        });
    }

    public final ejy a(Class class1)
    {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final elb a(ekg ekg, ekk ekk)
    {
        ekg = (ekq)ekg;
        long l = noy.a();
        elb elb = b.a(ekg, ekk);
        if (c.a())
        {
            b.a(ekg);
            b.a(ekk);
            noy.a("duration", l);
        }
        return elb;
    }

    public final elb a(ekq ekq1, ekk ekk)
    {
        fvg fvg1;
        Object obj1;
        fvg1 = a;
        fvg.a(ekq1);
        obj1 = (fux)ekq1;
        ekq1 = new ArrayList();
        Object obj;
        int i;
        long l;
        if (((fux) (obj1)).a == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L2; else goto _L1
_L1:
        obj = fvg1.b;
        ekq1 = new fvf(fvg1.a, ((fux) (obj1)).d, ekk);
        ekk = new fuz(fvg1.a, ((fux) (obj1)).d, ekk);
        l = System.currentTimeMillis();
        obj1 = new HashSet();
        ((Set) (obj1)).addAll(((neq) (obj)).a(ekq1));
        ((Set) (obj1)).addAll(((neq) (obj)).a(ekk));
        ekk = new ArrayList(((java.util.Collection) (obj1)));
        ekq1 = ekk;
        if (((neq) (obj)).a.a())
        {
            ekq1 = String.valueOf("[getFoldersAndCollapseDcimFolder]  folderCount:");
            i = ((Set) (obj1)).size();
            obj = String.valueOf(b.c(l));
            (new StringBuilder(String.valueOf(ekq1).length() + 22 + String.valueOf(obj).length())).append(ekq1).append(i).append(", duration:").append(((String) (obj)));
            ekq1 = ekk;
        }
_L4:
        Collections.sort(ekq1, new fvi(fvg1));
        return b.b(ekq1);
_L2:
        if (((fux) (obj1)).b())
        {
            ekq1 = fvg1.b.a(new fuz(fvg1.a, ((fux) (obj1)).d, ekk));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.localmedia.core.LocalMediaCore";
    }

    public final void a(ekq ekq1, ContentObserver contentobserver)
    {
        fvg fvg1 = a;
        fvg.a(ekq1);
        fvg1.b.a(contentobserver);
    }

    public final void b(ekq ekq1, ContentObserver contentobserver)
    {
        fvg fvg1 = a;
        fvg.a(ekq1);
        fvg1.b.b(contentobserver);
    }
}
