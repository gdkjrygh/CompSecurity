// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;

public class hdu
{

    private final Context a;
    private final erj b;
    private final noz c;

    hdu(Context context, erj erj1)
    {
        a = context;
        b = erj1;
        c = noz.a(context, 3, "SingleItemSynchronizer", new String[0]);
    }

    private boolean a(int i, Uri uri)
    {
        SQLiteDatabase sqlitedatabase;
        hdk hdk1;
        boolean flag;
        boolean flag1 = false;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "must provide a valid accountId");
        p.a(oql.b(uri), "must provide a media store uri");
        sqlitedatabase = mvj.a(a, i);
        hdk1 = new hdk(a, true);
        hdk1.a(i, false);
        sqlitedatabase.beginTransactionWithListenerNonExclusive(hdk1.f_());
        flag = flag1;
        flag1 = a(hdk1, uri);
        flag = flag1;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        hdk1.a(flag1, null);
        return flag1;
        uri;
        sqlitedatabase.endTransaction();
        hdk1.a(flag, null);
        throw uri;
    }

    private boolean a(hdk hdk1, Uri uri)
    {
        Uri uri1 = b.d(uri);
        Object obj;
        obj = hdk1.a;
        String as[] = nlk.a(uri1);
        as = a.getContentResolver().query(uri, as, null, null, null);
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        boolean flag;
        if (!as.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_99;
        }
        flag = hdk1.a(a, as, uri1);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        if (c.a())
        {
            noy.a("mediaStoreUri", uri);
        }
        hdk1.a(false);
        if (as != null)
        {
            as.close();
        }
        return flag;
        if (as != null)
        {
            as.close();
        }
        return false;
        hdk1;
        as = null;
_L2:
        if (as != null)
        {
            as.close();
        }
        throw hdk1;
        hdk1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(int i, List list)
    {
        int j = 0;
        boolean flag;
        if (!list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "cannot sync empty uris");
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            if (a(i, (Uri)list.next()))
            {
                j++;
            }
        } while (true);
        if (j > 0)
        {
            b.a(i, "UriItemsSynchronizer", null);
        }
    }
}
