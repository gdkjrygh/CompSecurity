// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;

public final class gsl
{

    private final eto a;
    private final erz b;

    public gsl(Context context)
    {
        a = (eto)olm.a(context, eto);
        b = (erz)olm.a(context, erz);
    }

    public final void a(int i, List list, List list1)
    {
        Object obj;
        Object obj1;
        erb erb1;
        Object obj2;
        obj1 = a;
        obj2 = ((eto) (obj1)).a(i, list);
        obj = mvj.a(((eto) (obj1)).a, i);
        erb1 = new erb(((eto) (obj1)).a, i);
        ((SQLiteDatabase) (obj)).beginTransactionWithListenerNonExclusive(erb1);
        etx etx1;
        for (obj2 = ((List) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); ((eto) (obj1)).c.a(((SQLiteDatabase) (obj)), i, etx1, erb1))
        {
            etx1 = (etx)((Iterator) (obj2)).next();
        }

        break MISSING_BLOCK_LABEL_106;
        list;
        ((SQLiteDatabase) (obj)).endTransaction();
        throw list;
        ((SQLiteDatabase) (obj)).setTransactionSuccessful();
        ((SQLiteDatabase) (obj)).endTransaction();
        obj = a;
        obj1 = etn.a;
        list = (new etg(((eto) (obj)).a, i)).a(list, new etq(((eto) (obj)), ((etn) (obj1))));
        obj1 = ((mmv)olm.a(((eto) (obj)).a, mmv)).a(i).b("gaia_id");
        qfu qfu1 = new qfu();
        qfu1.b = ((String) (obj1));
        ((eto) (obj)).a(i, (qgg[])list.toArray(new qgg[list.size()]), new qgi[0], qfu1, true);
_L2:
        list = b;
        list.a(i, list1, new esc(list), "setVisible");
        list = b;
        list.a(i, list1, new esd(list, erx.a), "setCompositionState");
        return;
        list;
        if (((eto) (obj)).d.a())
        {
            noy.a(i);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
