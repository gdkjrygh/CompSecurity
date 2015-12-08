// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.provider;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Pair;
import android.util.SparseArray;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import com.pandora.radio.data.d;
import com.pandora.radio.data.g;
import com.pandora.radio.data.w;
import com.pandora.radio.data.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import p.cw.b;
import p.cw.c;
import p.df.a;

// Referenced classes of package com.pandora.radio.provider:
//            StationProvider, h, e

public class i
{

    private final c a;

    public i(c c1)
    {
        a = c1;
    }

    private int a(Uri uri, String s)
    {
        Context context = a.s();
        uri = context.getContentResolver().query(uri, null, s, null, null);
        if (uri != null) goto _L2; else goto _L1
_L1:
        int j;
        boolean flag = false;
        j = ((flag) ? 1 : 0);
        if (uri != null)
        {
            uri.close();
            j = ((flag) ? 1 : 0);
        }
_L4:
        return j;
_L2:
        long l;
        uri.moveToFirst();
        l = uri.getLong(uri.getColumnIndex("count"));
        int k;
        k = (int)l;
        j = k;
        if (uri == null) goto _L4; else goto _L3
_L3:
        uri.close();
        return k;
        s;
        uri = null;
_L6:
        if (uri != null)
        {
            uri.close();
        }
        throw s;
        s;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private ContentProviderOperation a(w w1)
    {
        return ContentProviderOperation.newInsert(StationProvider.k).withValues(w1.d()).build();
    }

    public static Cursor a(long l, Context context)
    {
        Uri uri = ContentUris.withAppendedId(StationProvider.i, l);
        context = context.getContentResolver().query(uri, h.o, null, null, null);
        if (context == null || context.getCount() == 0)
        {
            return null;
        } else
        {
            return context;
        }
    }

    private void a(g g1, List list)
    {
        list.add(ContentProviderOperation.newDelete(StationProvider.l).withSelection("stationToken= ?", new String[] {
            g1.e()
        }).build());
        list.add(ContentProviderOperation.newInsert(StationProvider.l).withValues(g1.a()).build());
    }

    private boolean a(Context context, Cursor cursor, aa aaa[], int j)
    {
        Cursor cursor1;
        Cursor cursor2;
        Object obj;
        obj = null;
        cursor1 = null;
        cursor2 = obj;
        long l = cursor.getLong(2);
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        cursor2 = obj;
        cursor1 = b(l, context);
        if (cursor1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        cursor2 = cursor1;
        cursor1.moveToNext();
        cursor2 = cursor1;
        aaa[j] = new d(cursor, cursor1);
        if (cursor1 != null)
        {
            cursor1.close();
        }
        return true;
        if (cursor1 != null)
        {
            cursor1.close();
        }
        return false;
        context;
        if (cursor2 != null)
        {
            cursor2.close();
        }
        throw context;
    }

    private ContentProviderResult[] a(Context context, ArrayList arraylist)
        throws RemoteException, OperationApplicationException
    {
        if (arraylist.size() > 0)
        {
            return context.getContentResolver().applyBatch(com.pandora.radio.provider.StationProvider.a(), arraylist);
        } else
        {
            return new ContentProviderResult[0];
        }
    }

    private aa[] a(long l, boolean flag)
    {
        Object obj;
        Object obj1;
        b("getTracks", flag);
        obj1 = a.s();
        obj = new aa[0];
        Cursor cursor = ((Context) (obj1)).getContentResolver().query(com.pandora.radio.provider.StationProvider.g, h.m, "station_id = ?", new String[] {
            String.valueOf(l)
        }, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        int j = cursor.getCount();
        if (j != 0) goto _L3; else goto _L2
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
        obj1 = obj;
_L6:
        return ((aa []) (obj1));
_L3:
        aa aaa[] = new aa[cursor.getCount()];
        j = 0;
_L9:
        if (!cursor.moveToNext()) goto _L5; else goto _L4
_L4:
        if (a(((Context) (obj1)), cursor, aaa, j))
        {
            break MISSING_BLOCK_LABEL_247;
        }
        Exception exception;
        try
        {
            if (!b(((Context) (obj1)), cursor, aaa, j))
            {
                aaa[j] = new aa(cursor);
            }
            break MISSING_BLOCK_LABEL_247;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = aaa;
        }
        finally { }
_L8:
        obj1 = obj;
        if (cursor != null)
        {
            cursor.close();
            return ((aa []) (obj));
        }
          goto _L6
_L5:
        obj1 = aaa;
        if (cursor == null) goto _L6; else goto _L7
_L7:
        cursor.close();
        return aaa;
        exception;
        cursor = null;
        if (cursor != null)
        {
            cursor.close();
        }
        throw exception;
        Exception exception1;
        exception1;
        exception1 = null;
          goto _L8
        Exception exception2;
        exception2;
          goto _L8
        j++;
          goto _L9
    }

    private static Cursor b(long l, Context context)
    {
        Uri uri = ContentUris.withAppendedId(StationProvider.h, l);
        context = context.getContentResolver().query(uri, h.n, null, null, null);
        if (context == null || context.getCount() == 0)
        {
            return null;
        } else
        {
            return context;
        }
    }

    private boolean b(Context context, Cursor cursor, aa aaa[], int j)
    {
        Cursor cursor1;
        Cursor cursor2;
        Object obj;
        obj = null;
        cursor1 = null;
        cursor2 = obj;
        long l = cursor.getLong(39);
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        cursor2 = obj;
        cursor1 = a(l, context);
        if (cursor1 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        cursor2 = cursor1;
        cursor1.moveToNext();
        cursor2 = cursor1;
        aaa[j] = new com.pandora.radio.data.c(cursor, cursor1);
        if (cursor1 != null)
        {
            cursor1.close();
        }
        return true;
        if (cursor1 != null)
        {
            cursor1.close();
        }
        return false;
        context;
        if (cursor2 != null)
        {
            cursor2.close();
        }
        throw context;
    }

    public int a()
    {
        c();
        return (int)StationProvider.o;
    }

    public int a(String s)
    {
        b("deleteStation", true);
        Context context = a.s();
        String s1 = (new StringBuilder()).append(com.pandora.radio.provider.e.a).append("=?").toString();
        return context.getContentResolver().delete(StationProvider.f, s1, new String[] {
            s
        });
    }

    public y a(Context context, long l)
    {
        Object obj = null;
        if (l > 0L) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        return context;
_L2:
        Object obj1;
        b("getStation", true);
        obj1 = Long.toString(l);
        String s = (new StringBuilder()).append(com.pandora.radio.provider.e.b).append(" = ?").toString();
        obj1 = context.getContentResolver().query(StationProvider.f, new String[] {
            String.format("%s.%s", new Object[] {
                "stations", "stationToken"
            })
        }, s, new String[] {
            obj1
        }, null);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        int j = ((Cursor) (obj1)).getCount();
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return null;
        ((Cursor) (obj1)).moveToFirst();
        obj = a(context, ((Cursor) (obj1)).getString(0));
        context = ((Context) (obj));
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        ((Cursor) (obj1)).close();
        return ((y) (obj));
        context;
_L6:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw context;
        context;
        obj = obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public y a(Context context, y y1)
        throws RemoteException, OperationApplicationException
    {
        Object obj = y1.a();
        obj = context.getContentResolver().insert(StationProvider.f, ((ContentValues) (obj)));
        if (obj != null)
        {
            y1.a(ContentUris.parseId(((Uri) (obj))));
            obj = new ArrayList();
            if (y1.B() != null)
            {
                for (Iterator iterator = y1.B().iterator(); iterator.hasNext(); ((ArrayList) (obj)).add(a((w)iterator.next()))) { }
                a(context, ((ArrayList) (obj)));
            }
            return y1;
        } else
        {
            p.df.a.b("StationProviderHelper", (new StringBuilder()).append("Yikes! Inserting [").append(y1.d()).append("] station to DB returned a null uri").toString());
            return null;
        }
    }

    public y a(Context context, String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        y y1 = null;
_L4:
        return y1;
_L2:
        y y2;
        y2 = a.d().t();
        if (y2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        y1 = y2;
        if (s.equals(y2.c())) goto _L4; else goto _L3
_L3:
        return b(context, s);
    }

    public y a(Context context, String s, w w1)
    {
        Object obj;
        String s1;
        if (w1 == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        obj = String.format("%1$s == ? AND %2$s == ?", new Object[] {
            "stationToken", "seedId"
        });
        s1 = w1.a();
        obj = context.getContentResolver().query(StationProvider.k, h.q, ((String) (obj)), new String[] {
            s, s1
        }, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        if (((Cursor) (obj)).getCount() != 0)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        w1 = w1.d();
        context.getContentResolver().insert(StationProvider.k, w1);
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return a(context, s);
        context;
        obj = null;
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw context;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public y a(Context context, String s, String s1)
    {
        context = a.s();
        String s2 = String.format("%1$s == ? AND %2$s == ?", new Object[] {
            "stationToken", "seedId"
        });
        context.getContentResolver().delete(StationProvider.k, s2, new String[] {
            s, s1
        });
        return b(context, s);
    }

    public List a(String s, boolean flag)
    {
        Object obj;
        Context context;
        String as[];
        ArrayList arraylist;
        obj = null;
        b("getStations", false);
        f();
        context = a.s();
        as = new String[1];
        as[0] = null;
        arraylist = new ArrayList();
        Cursor cursor = context.getContentResolver().query(StationProvider.f, h.l, h.h, null, s);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        int j = cursor.getCount();
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        if (cursor != null)
        {
            cursor.close();
        }
        return arraylist;
        cursor.moveToFirst();
        as[0] = cursor.getString(1);
        s = context.getContentResolver().query(StationProvider.k, h.q, "stationToken = ?", as, h.p);
        obj = new y(cursor, s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        s.close();
        if (cursor.getCount() != 1) goto _L2; else goto _L1
_L1:
        boolean flag1 = ((y) (obj)).j();
        if (flag1 && !flag)
        {
            if (cursor != null)
            {
                cursor.close();
            }
            return arraylist;
        }
          goto _L2
        obj;
        s = null;
_L8:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        s.close();
        throw obj;
        s;
        obj = cursor;
_L6:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s;
_L2:
        arraylist.add(obj);
_L5:
        if (!cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        as[0] = cursor.getString(1);
        obj = context.getContentResolver().query(StationProvider.k, h.q, "stationToken = ?", as, h.p);
        s = ((String) (obj));
        obj = new y(cursor, s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        s.close();
        arraylist.add(obj);
          goto _L5
_L7:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_333;
        }
        s.close();
        throw obj;
_L4:
        if (cursor != null)
        {
            cursor.close();
        }
        return arraylist;
        s;
          goto _L6
        obj;
          goto _L7
        obj;
          goto _L8
        obj;
          goto _L7
    }

    public void a(SparseArray sparsearray)
        throws JSONException, RemoteException, OperationApplicationException
    {
        b("updateStationEnableArtistMessages", false);
        if (sparsearray != null)
        {
            ArrayList arraylist = new ArrayList();
            int j = 0;
            while (j < sparsearray.size()) 
            {
                Pair pair = (Pair)sparsearray.valueAt(j);
                if (pair != null)
                {
                    ContentValues contentvalues = new ContentValues();
                    int k;
                    if (((Boolean)pair.second).booleanValue())
                    {
                        k = 1;
                    } else
                    {
                        k = 0;
                    }
                    contentvalues.put("enableArtistAudioMessages", Integer.valueOf(k));
                    arraylist.add(ContentProviderOperation.newUpdate(StationProvider.f).withValues(contentvalues).withSelection("stationToken= ? ", new String[] {
                        (String)pair.first
                    }).build());
                }
                j++;
            }
            if (arraylist.size() > 0)
            {
                a.s().getContentResolver().applyBatch("com.pandora.radio.provider", arraylist);
                return;
            }
        }
    }

    public void a(y y1)
        throws JSONException, RemoteException, OperationApplicationException
    {
        b("updateStation", true);
        a.s().getContentResolver().update(StationProvider.f, y1.a(), (new StringBuilder()).append(com.pandora.radio.provider.e.a).append("=?").toString(), new String[] {
            y1.c()
        });
        ArrayList arraylist = new ArrayList();
        arraylist.add(ContentProviderOperation.newDelete(StationProvider.k).withSelection("stationToken= ? ", new String[] {
            y1.c()
        }).build());
        if (y1.B() != null)
        {
            for (Iterator iterator = y1.B().iterator(); iterator.hasNext(); arraylist.add(a((w)iterator.next()))) { }
        }
        a(y1.E(), ((List) (arraylist)));
        if (arraylist.size() > 0)
        {
            a.s().getContentResolver().applyBatch("com.pandora.radio.provider", arraylist);
        }
    }

    public void a(List list)
        throws RemoteException, OperationApplicationException
    {
        b("updateStationList", true);
        Object obj = a(((String) (null)), true);
        list = b(list);
        obj = b(((List) (obj)));
        ArrayList arraylist = new ArrayList();
        Iterator iterator = list.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = (String)iterator.next();
            if (((Map) (obj)).containsKey(obj1))
            {
                y y1 = (y)((Map) (obj)).remove(obj1);
                obj1 = (y)list.get(obj1);
                ((y) (obj1)).a(y1.b());
                arraylist.add(obj1);
                iterator.remove();
            }
        } while (true);
        a(((Map) (obj)).values(), list.values(), ((Collection) (arraylist)));
    }

    public void a(boolean flag)
        throws JSONException, RemoteException, OperationApplicationException
    {
        b("bulkUpdateStationEnableArtistAudioMessages", false);
        if (d())
        {
            ArrayList arraylist = new ArrayList();
            ContentValues contentvalues = new ContentValues();
            String s;
            if (flag)
            {
                s = "1";
            } else
            {
                s = "0";
            }
            contentvalues.put("enableArtistAudioMessages", s);
            arraylist.add(ContentProviderOperation.newUpdate(StationProvider.f).withValues(contentvalues).withSelection("supportsArtistAudioMessages= 1 ", null).build());
            if (arraylist.size() > 0)
            {
                a.s().getContentResolver().applyBatch("com.pandora.radio.provider", arraylist);
                return;
            }
        }
    }

    protected ContentProviderResult[] a(Collection collection, Collection collection1, Collection collection2)
        throws RemoteException, OperationApplicationException
    {
        ArrayList arraylist = new ArrayList();
        if (collection != null)
        {
            y y1;
            for (collection = collection.iterator(); collection.hasNext(); arraylist.add(ContentProviderOperation.newDelete(ContentUris.withAppendedId(StationProvider.f, y1.b())).build()))
            {
                y1 = (y)collection.next();
            }

            arraylist.add(ContentProviderOperation.newDelete(StationProvider.k).build());
        }
        if (collection1 != null)
        {
            collection = collection1.iterator();
            do
            {
                if (!collection.hasNext())
                {
                    break;
                }
                collection1 = (y)collection.next();
                arraylist.add(ContentProviderOperation.newInsert(StationProvider.f).withValues(collection1.a()).build());
                if (collection1.B() != null)
                {
                    collection1 = collection1.B().iterator();
                    while (collection1.hasNext()) 
                    {
                        arraylist.add(a((w)collection1.next()));
                    }
                }
            } while (true);
        }
        if (collection2 != null)
        {
            collection = collection2.iterator();
            do
            {
                if (!collection.hasNext())
                {
                    break;
                }
                collection1 = (y)collection.next();
                arraylist.add(ContentProviderOperation.newUpdate(ContentUris.withAppendedId(StationProvider.f, collection1.b())).withValues(collection1.a()).build());
                if (collection1.B() != null)
                {
                    collection1 = collection1.B().iterator();
                    while (collection1.hasNext()) 
                    {
                        arraylist.add(a((w)collection1.next()));
                    }
                }
            } while (true);
        }
        return a(a.s(), arraylist);
    }

    public aa[] a(long l)
    {
        return a(l, true);
    }

    public int b()
    {
        c();
        return (int)StationProvider.p;
    }

    public int b(long l)
    {
        b("deleteTracks", true);
        Context context = a.s();
        String s = null;
        if (l >= 0L)
        {
            s = "station_id=?";
        }
        return context.getContentResolver().delete(com.pandora.radio.provider.StationProvider.g, s, new String[] {
            String.valueOf(l)
        });
    }

    public y b(Context context, String s)
    {
        Object obj;
        y y1;
        String as[];
        y1 = null;
        obj = null;
        b("getStation", false);
        as = new String[1];
        as[0] = s;
        Object obj1;
        s = (new StringBuilder()).append(com.pandora.radio.provider.e.a).append(" = ?").toString();
        obj1 = context.getContentResolver().query(StationProvider.f, h.l, s, as, null);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        s = y1;
        int j = ((Cursor) (obj1)).getCount();
        if (j != 0) goto _L3; else goto _L2
_L2:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        if (false)
        {
            throw new NullPointerException();
        }
        context = null;
_L5:
        return context;
_L3:
        s = y1;
        obj = context.getContentResolver().query(StationProvider.k, h.q, "stationToken = ?", as, h.p);
        s = ((String) (obj));
        ((Cursor) (obj1)).moveToFirst();
        s = ((String) (obj));
        y1 = new y(((Cursor) (obj1)), ((Cursor) (obj)));
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        context = y1;
        if (obj == null) goto _L5; else goto _L4
_L4:
        ((Cursor) (obj)).close();
        return y1;
        obj1;
        context = null;
        s = ((String) (obj));
        obj = obj1;
_L7:
        if (context != null)
        {
            context.close();
        }
        if (s != null)
        {
            s.close();
        }
        throw obj;
        obj;
        context = ((Context) (obj1));
        if (true) goto _L7; else goto _L6
_L6:
    }

    HashMap b(List list)
    {
        HashMap hashmap = new HashMap(list.size());
        y y1;
        for (list = list.iterator(); list.hasNext(); hashmap.put(y1.c(), y1))
        {
            y1 = (y)list.next();
            if (hashmap.containsKey(y1.c()))
            {
                p.df.a.c("StationProviderHelper", "Yikes! Station List has duplicate station tokens. Last one wins!");
            }
        }

        return hashmap;
    }

    public List b(String s)
    {
        return a(s, false);
    }

    public void b(y y1)
        throws JSONException, RemoteException, OperationApplicationException
    {
        b("updateExtendedStationData", false);
        ArrayList arraylist = new ArrayList();
        a(y1.E(), arraylist);
        if (arraylist.size() > 0)
        {
            a.s().getContentResolver().applyBatch("com.pandora.radio.provider", arraylist);
        }
    }

    protected void b(String s, boolean flag)
        throws IllegalStateException
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            s = (new StringBuilder()).append(s).append(" should probably not be called on UI Thread (warning only, not a bug).").toString();
            IllegalStateException illegalstateexception = new IllegalStateException(s);
            if (flag)
            {
                throw illegalstateexception;
            }
            if (!com.pandora.radio.util.i.e())
            {
                p.df.a.e("StationProviderHelper", s, illegalstateexception);
            }
        }
    }

    public void c()
    {
        if (StationProvider.n < 0L || StationProvider.o < 0L || StationProvider.q < 0L)
        {
            b("StationProvider.initStationCounts()", true);
            StationProvider.n = a(StationProvider.m, ((String) (null)));
            StationProvider.o = a(Uri.withAppendedPath(StationProvider.m, "excludeCCStations"), ((String) (null)));
            StationProvider.p = a(Uri.withAppendedPath(StationProvider.m, "excludeShuffleStation"), ((String) (null)));
            StationProvider.q = a(Uri.withAppendedPath(StationProvider.m, "excludeArtistMessagesNotEnabled"), ((String) (null)));
        }
    }

    public void c(List list)
    {
        Context context;
        ContentValues acontentvalues[];
        int j;
        b("insertTracks", false);
        context = a.s();
        acontentvalues = new ContentValues[list.size()];
        list = list.iterator();
        j = 0;
_L2:
        aa aa1;
        if (!list.hasNext())
        {
            break MISSING_BLOCK_LABEL_168;
        }
        aa1 = (aa)list.next();
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ac.values().length];
                try
                {
                    a[ac.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ac.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.radio.provider._cls1.a[aa1.l().ordinal()])
        {
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break;
        }
        break MISSING_BLOCK_LABEL_139;
_L3:
        acontentvalues[j] = aa1.p();
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        aa1.b(ContentUris.parseId(context.getContentResolver().insert(StationProvider.i, ((com.pandora.radio.data.c)aa1).a())));
          goto _L3
        aa1.a(ContentUris.parseId(context.getContentResolver().insert(StationProvider.h, ((d)aa1).a())));
          goto _L3
        if (j > 0)
        {
            p.df.b.a("StationProvider.insertTracks(): inserting into content resolver");
            context.getContentResolver().bulkInsert(com.pandora.radio.provider.StationProvider.g, acontentvalues);
            p.df.b.a("StationProvider.insertTracks(): done");
        }
        return;
    }

    public boolean c(String s)
    {
        if (!com.pandora.radio.provider.StationProvider.b())
        {
            com.pandora.radio.provider.StationProvider.a(a);
        }
        return a(a.s(), s) != null;
    }

    public boolean d()
    {
        return b() > 0;
    }

    public d.b e()
    {
        return new StationProvider.a();
    }

    public void f()
    {
        b("purgeExpiredCcStations", false);
        Context context = a.s();
        String s = String.format("%1$s == 1 AND %2$s < ?", new Object[] {
            "onePlaylist", "expireTimeMillis"
        });
        int j = context.getContentResolver().delete(StationProvider.f, s, new String[] {
            (new StringBuilder()).append(System.currentTimeMillis()).append("").toString()
        });
        if (j > 0)
        {
            p.df.a.a("StationProviderHelper", "StationProvider: removed %s expired custom-content stations from local db", new Object[] {
                String.valueOf(j)
            });
        }
    }

    public int g()
    {
        c();
        return (int)StationProvider.n;
    }

    public int h()
    {
        c();
        return (int)StationProvider.q;
    }
}
