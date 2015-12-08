// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class neq
{

    public final noz a;
    public final Context b;
    private final net c;

    public neq(Context context, net net1)
    {
        b = context.getApplicationContext();
        c = net1;
        a = noz.a(context, 3, "LocalMedia", new String[0]);
    }

    public final Object a(long l, ner ner1, boolean flag)
    {
        nek anek[];
        int i;
        int j;
        anek = neh.a();
        j = anek.length;
        i = 0;
_L2:
        Cursor cursor;
        nek nek1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        nek1 = anek[i];
        cursor = nek1.a(b, l);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_76;
        }
        ner1 = ((ner) (ner1.a(nek1, cursor, flag)));
        cursor.close();
        return ner1;
        cursor.close();
        i++;
        if (true) goto _L2; else goto _L1
        ner1;
        cursor.close();
        throw ner1;
_L1:
        return null;
    }

    public final Object a(Object obj, ner ner1, boolean flag)
    {
        Cursor cursor;
        nek nek1;
        nek1 = c.b(obj);
        cursor = nek1.a(b, c.a(obj));
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        if (cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_105;
        }
        obj = String.valueOf(obj);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 31)).append("Unable to load media metadata: ").append(((String) (obj))).toString());
        obj;
        if (cursor != null)
        {
            cursor.close();
        }
        throw obj;
        obj = ner1.a(nek1, cursor, flag);
        if (cursor != null)
        {
            cursor.close();
        }
        return obj;
    }

    public final List a(List list, int i, int j, int k, ner ner1, Comparator comparator, boolean flag)
    {
        nek anek[];
        ArrayList arraylist;
        int l;
        int i1;
        long l1;
        l1 = System.currentTimeMillis();
        l = k;
        if (k >= 0)
        {
            l = k + j;
        }
        anek = neh.b(i);
        arraylist = new ArrayList(anek.length);
        i = 0;
        i1 = anek.length;
        k = 0;
_L7:
        if (k >= i1) goto _L2; else goto _L1
_L1:
        Object obj;
        nek nek1 = anek[k];
        Context context = b;
        if (list.isEmpty())
        {
            comparator = null;
        } else
        {
            if (nek1.a(context).containsAll(list))
            {
                comparator = "corrected_date_taken DESC,_id DESC";
            } else
            {
                comparator = "corrected_added_modified DESC, _id DESC";
            }
            obj = comparator;
            if (l >= 0)
            {
                comparator = String.valueOf(comparator);
                obj = (new StringBuilder(String.valueOf(comparator).length() + 18)).append(comparator).append(" LIMIT ").append(l).toString();
            }
            comparator = ((ejr)olm.a(context, ejr)).a(nek1.b, nek1.d.f, nek1.d.a(list), nej.b(list), ((String) (obj)));
        }
        if (comparator == null) goto _L4; else goto _L3
_L3:
        obj = new ArrayList(comparator.getCount());
        for (; comparator.moveToNext(); ((List) (obj)).add(ner1.a(nek1, comparator, flag))) { }
        break MISSING_BLOCK_LABEL_274;
        list;
        comparator.close();
        throw list;
        comparator.close();
        comparator = ((Comparator) (obj));
_L5:
        arraylist.add(comparator);
        i += comparator.size();
        k++;
        continue; /* Loop/switch isn't completed */
_L4:
        comparator = Collections.emptyList();
        if (true) goto _L5; else goto _L2
_L2:
        if (l >= 0)
        {
            i = Math.min(i, l);
        }
        list = (new nem(arraylist, null)).a(i);
        if (j > 0)
        {
            list = new ArrayList(list.subList(j, list.size()));
        }
        if (a.a())
        {
            i = list.size();
            ner1 = String.valueOf(b.c(l1));
            (new StringBuilder(String.valueOf(ner1).length() + 40)).append("[getMedia] count: ").append(i).append(", duration:").append(ner1);
        }
        return Collections.unmodifiableList(list);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public List a(ner ner1)
    {
        Object obj;
        nek anek[];
        int i;
        int k;
        long l;
        l = System.currentTimeMillis();
        obj = new HashSet();
        anek = neh.a();
        k = anek.length;
        i = 0;
_L3:
        if (i >= k) goto _L2; else goto _L1
_L1:
        Cursor cursor;
        nek nek1;
        nek1 = anek[i];
        cursor = ((ejr)olm.a(b, ejr)).a(nek1.b, nek1.d.e, nek1.d.d, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        for (; cursor.moveToNext(); ((Set) (obj)).add(ner1.a(nek1, cursor, false))) { }
        break MISSING_BLOCK_LABEL_127;
        ner1;
        if (cursor != null)
        {
            cursor.close();
        }
        throw ner1;
        if (cursor != null)
        {
            cursor.close();
        }
        i++;
          goto _L3
_L2:
        ner1 = new ArrayList(((java.util.Collection) (obj)));
        if (a.a())
        {
            String s = String.valueOf("[getNonCameraFolders]  folderCount:");
            int j = ((Set) (obj)).size();
            obj = String.valueOf(b.c(l));
            (new StringBuilder(String.valueOf(s).length() + 22 + String.valueOf(obj).length())).append(s).append(j).append(", duration:").append(((String) (obj)));
        }
        return ner1;
    }

    public final List a(nes nes1)
    {
        Object obj;
        ArrayList arraylist;
        ArrayList arraylist1;
        long l;
        l = System.currentTimeMillis();
        obj = new HashSet();
        arraylist1 = new ArrayList();
        arraylist = new ArrayList();
        nek anek[];
        int j;
        anek = neh.a();
        j = anek.length;
        int i = 0;
_L2:
        nek nek1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        nek1 = anek[i];
        Cursor cursor = ((ejr)olm.a(b, ejr)).a(nek1.b, nek1.d.e, nek1.d.c, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        arraylist.add(cursor);
        arraylist1.add(nek1);
        break MISSING_BLOCK_LABEL_313;
        if (arraylist.isEmpty())
        {
            break MISSING_BLOCK_LABEL_155;
        }
        nes1 = ((nes) (nes1.a(arraylist)));
        if (nes1 == null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        ((Set) (obj)).add(nes1);
        for (nes1 = arraylist.iterator(); nes1.hasNext(); ((Cursor)nes1.next()).close()) { }
        break MISSING_BLOCK_LABEL_224;
        nes1;
        for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); ((Cursor)((Iterator) (obj)).next()).close()) { }
        throw nes1;
        nes1 = new ArrayList(((java.util.Collection) (obj)));
        if (a.a())
        {
            String s = String.valueOf("[getCameraFolders]  folderCount:");
            i = ((Set) (obj)).size();
            obj = String.valueOf(b.c(l));
            (new StringBuilder(String.valueOf(s).length() + 22 + String.valueOf(obj).length())).append(s).append(i).append(", duration:").append(((String) (obj)));
        }
        return nes1;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(ContentObserver contentobserver)
    {
        nek anek[] = neh.a();
        int j = anek.length;
        for (int i = 0; i < j; i++)
        {
            nek nek1 = anek[i];
            b.getContentResolver().registerContentObserver(nek1.b, true, contentobserver);
        }

    }

    public final void b(ContentObserver contentobserver)
    {
        b.getContentResolver().unregisterContentObserver(contentobserver);
    }
}
