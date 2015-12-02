// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.e;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android_src.a.a.a;
import android_src.c.e;
import android_src.c.f;
import android_src.c.g;
import android_src.c.i;
import android_src.c.k;
import android_src.c.m;
import android_src.mms.d;
import android_src.mms.g.j;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package android_src.mms.e:
//            e, q, s, f, 
//            g, j, h, d, 
//            v, x, z, a, 
//            i, w

public class t
{

    private static t a;
    private static final j b = android_src.mms.g.j.b();
    private static final int c[] = {
        129, 130, 137, 151
    };
    private static final String d[] = {
        "_id", "msg_box", "thread_id", "retr_txt", "sub", "ct_l", "ct_t", "m_cls", "m_id", "resp_txt", 
        "tr_id", "ct_cls", "d_rpt", "m_type", "v", "pri", "rr", "read_status", "rpt_a", "retr_st", 
        "st", "date", "d_tm", "exp", "m_size", "sub_cs", "retr_txt_cs"
    };
    private static final String e[] = {
        "_id", "chset", "cd", "cid", "cl", "ct", "fn", "name", "text"
    };
    private static final HashMap f;
    private static final HashMap g;
    private static final HashMap h;
    private static final HashMap i;
    private static final HashMap j;
    private static final HashMap k;
    private static final HashMap l;
    private static final HashMap m;
    private static final HashMap n;
    private static final HashMap o;
    private static final HashMap p;
    private final Context q;
    private final ContentResolver r;

    private t(Context context)
    {
        q = context;
        r = context.getContentResolver();
    }

    public static t a(Context context)
    {
        if (a == null || !context.equals(a.q))
        {
            a = new t(context);
        }
        return a;
    }

    private Integer a(Cursor cursor, int i1)
    {
        if (!cursor.isNull(i1))
        {
            return Integer.valueOf(cursor.getInt(i1));
        } else
        {
            return null;
        }
    }

    public static String a(byte abyte0[])
    {
        try
        {
            abyte0 = new String(abyte0, "iso-8859-1");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            com.facebook.debug.log.b.d("PduPersister", "ISO_8859_1 must be supported!", abyte0);
            return "";
        }
        return abyte0;
    }

    private void a(long l1, int i1, android_src.mms.e.e ae[])
    {
        ContentValues contentvalues = new ContentValues(3);
        int k1 = ae.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            Object obj = ae[j1];
            contentvalues.clear();
            contentvalues.put("address", a(((android_src.mms.e.e) (obj)).b()));
            contentvalues.put("charset", Integer.valueOf(((android_src.mms.e.e) (obj)).a()));
            contentvalues.put("type", Integer.valueOf(i1));
            obj = Uri.parse((new StringBuilder()).append("content://mms/").append(l1).append("/addr").toString());
            android_src.a.a.a.a(q, r, ((Uri) (obj)), contentvalues);
        }

    }

    private void a(long l1, q q1)
    {
        Cursor cursor;
        cursor = android_src.a.a.a.a(q, r, Uri.parse((new StringBuilder()).append("content://mms/").append(l1).append("/addr").toString()), new String[] {
            "address", "charset", "type"
        }, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_256;
        }
_L5:
        String s1;
        int i1;
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = cursor.getString(0);
        if (TextUtils.isEmpty(s1))
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = cursor.getInt(2);
        i1;
        JVM INSTR lookupswitch 4: default 257
    //                   129: 220
    //                   130: 220
    //                   137: 191
    //                   151: 220;
           goto _L1 _L2 _L2 _L3 _L2
        while (true) 
        {
            while (true) 
            {
                if (false)
                {
                }
                break; /* Loop/switch isn't completed */
            }
        }
_L1:
        com.facebook.debug.log.b.e("PduPersister", (new StringBuilder()).append("Unknown address type: ").append(i1).toString());
        break; /* Loop/switch isn't completed */
        q1;
        cursor.close();
        throw q1;
_L3:
        q1.a(new android_src.mms.e.e(cursor.getInt(1), a(s1)), i1);
        break; /* Loop/switch isn't completed */
_L2:
        q1.b(new android_src.mms.e.e(cursor.getInt(1), a(s1)), i1);
        if (true) goto _L5; else goto _L4
_L4:
        cursor.close();
    }

    private void a(Cursor cursor, int i1, q q1, int j1)
    {
        String s1 = cursor.getString(i1);
        if (s1 != null && s1.length() > 0)
        {
            q1.a(new android_src.mms.e.e(cursor.getInt(((Integer)g.get(Integer.valueOf(j1))).intValue()), a(s1)), j1);
        }
    }

    private void a(s s1, Uri uri, String s2)
    {
        String s3;
        s s5;
        s s6;
        byte abyte0[];
        Object obj;
        Object obj1;
        Object obj2;
        obj1 = null;
        s3 = null;
        abyte0 = null;
        obj = null;
        s6 = null;
        obj2 = null;
        s5 = null;
        byte abyte1[] = s1.a();
        if (!"text/plain".equals(s2) && !"application/smil".equals(s2) && !"text/html".equals(s2)) goto _L2; else goto _L1
_L1:
        s1 = new ContentValues();
        s1.put("text", (new android_src.mms.e.e(abyte1)).c());
        if (r.update(uri, s1, null, null) != 1)
        {
            throw new d((new StringBuilder()).append("unable to update ").append(uri.toString()).toString());
        }
          goto _L3
        s1;
        s3 = null;
_L11:
        String s4;
        s2 = s5;
        s4 = s3;
        com.facebook.debug.log.b.d("PduPersister", "Failed to open Input/Output stream.", s1);
        s2 = s5;
        s4 = s3;
        throw new d(s1);
        s1;
_L8:
        int i1;
        if (s4 != null)
        {
            try
            {
                s4.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                com.facebook.debug.log.b.d("PduPersister", (new StringBuilder()).append("IOException while closing: ").append(s4).toString(), uri);
            }
        }
        if (s2 != null)
        {
            try
            {
                s2.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                com.facebook.debug.log.b.d("PduPersister", (new StringBuilder()).append("IOException while closing: ").append(s2).toString(), uri);
            }
        }
        throw s1;
_L3:
        uri = null;
        s2 = abyte0;
_L6:
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (s s1)
            {
                com.facebook.debug.log.b.d("PduPersister", (new StringBuilder()).append("IOException while closing: ").append(uri).toString(), s1);
            }
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        s2.close();
_L4:
        return;
_L2:
        s2 = r.openOutputStream(uri);
        s3 = s2;
        if (abyte1 != null)
        {
            break MISSING_BLOCK_LABEL_457;
        }
        s2 = obj1;
        s4 = s3;
        s6 = obj;
        s5 = obj2;
        s1 = s1.b();
        if (s1 != null && s1 != uri)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        s2 = obj1;
        s4 = s3;
        s6 = obj;
        s5 = obj2;
        com.facebook.debug.log.b.d("PduPersister", "Can't find data for this part.");
        if (s3 != null)
        {
            try
            {
                s3.close();
            }
            // Misplaced declaration of an exception variable
            catch (s s1)
            {
                com.facebook.debug.log.b.d("PduPersister", (new StringBuilder()).append("IOException while closing: ").append(s3).toString(), s1);
            }
        }
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (s s1)
            {
                com.facebook.debug.log.b.d("PduPersister", (new StringBuilder()).append("IOException while closing: ").append(null).toString(), s1);
            }
            return;
        }
          goto _L4
        s2 = obj1;
        s4 = s3;
        s6 = obj;
        s5 = obj2;
        s1 = r.openInputStream(s1);
        s2 = s1;
        s4 = s3;
        s6 = s1;
        s5 = s1;
        abyte0 = new byte[256];
_L7:
        s2 = s1;
        s4 = s3;
        s6 = s1;
        s5 = s1;
        i1 = s1.read(abyte0);
        s2 = s1;
        uri = s3;
        if (i1 == -1) goto _L6; else goto _L5
_L5:
        s2 = s1;
        s4 = s3;
        s6 = s1;
        s5 = s1;
        s3.write(abyte0, 0, i1);
          goto _L7
        s2 = obj1;
        s4 = s3;
        s6 = obj;
        s5 = obj2;
        s3.write(abyte1);
        s2 = abyte0;
        uri = s3;
          goto _L6
        s1;
_L9:
        s2 = s6;
        s4 = s3;
        com.facebook.debug.log.b.d("PduPersister", "Failed to read/write data.", s1);
        s2 = s6;
        s4 = s3;
        throw new d(s1);
        s1;
        com.facebook.debug.log.b.d("PduPersister", (new StringBuilder()).append("IOException while closing: ").append(s2).toString(), s1);
        return;
        s1;
        s4 = null;
        s2 = s3;
          goto _L8
        s1;
        s3 = null;
          goto _L9
        s1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public static byte[] a(String s1)
    {
        try
        {
            s1 = s1.getBytes("iso-8859-1");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.facebook.debug.log.b.d("PduPersister", "ISO_8859_1 must be supported!", s1);
            return new byte[0];
        }
        return s1;
    }

    private void b(Cursor cursor, int i1, q q1, int j1)
    {
        cursor = cursor.getString(i1);
        if (cursor != null)
        {
            q1.a(a(cursor), j1);
        }
    }

    private byte[] b(Cursor cursor, int i1)
    {
        if (!cursor.isNull(i1))
        {
            return a(cursor.getString(i1));
        } else
        {
            return null;
        }
    }

    private s[] b(long l1)
    {
        Object obj2;
        Object obj3;
        Cursor cursor;
        obj3 = null;
        obj2 = null;
        cursor = android_src.a.a.a.a(q, r, Uri.parse((new StringBuilder()).append("content://mms/").append(l1).append("/part").toString()), e, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        int i1 = cursor.getCount();
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        if (cursor != null)
        {
            cursor.close();
        }
        return null;
        s as[] = new s[cursor.getCount()];
        i1 = 0;
_L17:
        if (!cursor.moveToNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        s s1;
        s1 = new s();
        obj = a(cursor, 1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        s1.a(((Integer) (obj)).intValue());
        byte abyte0[] = b(cursor, 2);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        s1.d(abyte0);
        abyte0 = b(cursor, 3);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        s1.b(abyte0);
        abyte0 = b(cursor, 4);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        s1.c(abyte0);
        abyte0 = b(cursor, 5);
        if (abyte0 == null) goto _L4; else goto _L3
_L3:
        byte abyte1[];
        s1.e(abyte0);
        abyte1 = b(cursor, 6);
        if (abyte1 == null)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        s1.h(abyte1);
        abyte1 = b(cursor, 7);
        if (abyte1 == null)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        s1.g(abyte1);
        Object obj1;
        ByteArrayOutputStream bytearrayoutputstream;
        l1 = cursor.getLong(0);
        obj1 = Uri.parse((new StringBuilder()).append("content://mms/part/").append(l1).toString());
        s1.a(((Uri) (obj1)));
        abyte0 = a(abyte0);
        if (android_src.mms.a.b(abyte0) || android_src.mms.a.c(abyte0) || android_src.mms.a.d(abyte0))
        {
            break MISSING_BLOCK_LABEL_626;
        }
        bytearrayoutputstream = new ByteArrayOutputStream();
        if (!"text/plain".equals(abyte0) && !"application/smil".equals(abyte0) && !"text/html".equals(abyte0)) goto _L6; else goto _L5
_L5:
        abyte0 = cursor.getString(8);
        if (abyte0 == null)
        {
            abyte0 = "";
        }
        abyte0 = (new android_src.mms.e.e(abyte0)).b();
        bytearrayoutputstream.write(abyte0, 0, abyte0.length);
_L10:
        s1.a(bytearrayoutputstream.toByteArray());
        break MISSING_BLOCK_LABEL_626;
_L4:
        throw new d("Content-Type must be set.");
_L6:
        abyte0 = obj3;
        obj1 = r.openInputStream(((Uri) (obj1)));
        int j1;
        abyte0 = new byte[256];
        j1 = ((InputStream) (obj1)).read(abyte0);
_L8:
        if (j1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        bytearrayoutputstream.write(abyte0, 0, j1);
        j1 = ((InputStream) (obj1)).read(abyte0);
        if (true) goto _L8; else goto _L7
_L7:
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            ((InputStream) (obj1)).close();
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        finally
        {
            if (cursor != null)
            {
                cursor.close();
            }
            throw abyte0;
        }
        com.facebook.debug.log.b.d("PduPersister", "Failed to close stream", abyte0);
        if (true) goto _L10; else goto _L9
_L9:
        abyte0;
        obj1 = obj2;
        obj2 = abyte0;
_L15:
        abyte0 = ((byte []) (obj1));
        com.facebook.debug.log.b.d("PduPersister", "Failed to load part data", ((Throwable) (obj2)));
        abyte0 = ((byte []) (obj1));
        cursor.close();
        abyte0 = ((byte []) (obj1));
        throw new d(((Throwable) (obj2)));
        Exception exception;
        exception;
        obj1 = abyte0;
        abyte0 = exception;
_L13:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_585;
        }
        ((InputStream) (obj1)).close();
_L11:
        throw abyte0;
        IOException ioexception;
        ioexception;
        com.facebook.debug.log.b.d("PduPersister", "Failed to close stream", ioexception);
          goto _L11
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
        return as;
        abyte0;
        if (true) goto _L13; else goto _L12
_L12:
        exception;
        if (true) goto _L15; else goto _L14
_L14:
        as[i1] = s1;
        i1++;
        if (true) goto _L17; else goto _L16
_L16:
    }

    private void c(Cursor cursor, int i1, q q1, int j1)
    {
        if (!cursor.isNull(i1))
        {
            q1.a(cursor.getInt(i1), j1);
        }
    }

    private void d(Cursor cursor, int i1, q q1, int j1)
    {
        if (!cursor.isNull(i1))
        {
            q1.a(cursor.getLong(i1), j1);
        }
    }

    public Cursor a(long l1)
    {
        android.net.Uri.Builder builder = k.a.buildUpon();
        builder.appendQueryParameter("protocol", "mms");
        return android_src.a.a.a.a(q, r, builder.build(), null, "err_type < ? AND due_time <= ?", new String[] {
            String.valueOf(10), String.valueOf(l1)
        }, "due_time");
    }

    public Uri a(Uri uri, Uri uri1)
    {
        long l1 = ContentUris.parseId(uri);
        if (l1 == -1L)
        {
            throw new d("Error! ID of the message: -1.");
        }
        Integer integer = (Integer)f.get(uri1);
        if (integer == null)
        {
            throw new d("Bad destination, must be one of content://mms/inbox, content://mms/sent, content://mms/drafts, content://mms/outbox, content://mms/temp.");
        } else
        {
            ContentValues contentvalues = new ContentValues(1);
            contentvalues.put("msg_box", integer);
            android_src.a.a.a.a(q, r, uri, contentvalues, null, null);
            return ContentUris.withAppendedId(uri1, l1);
        }
    }

    public Uri a(android_src.mms.e.f f1, Uri uri)
    {
        Object obj;
        ContentValues contentvalues;
        HashMap hashmap;
        Object obj1;
        int k1;
        long l5;
        if (uri == null)
        {
            throw new d("Uri may not be null.");
        }
        if ((Integer)f.get(uri) == null)
        {
            throw new d("Bad destination, must be one of content://mms/inbox, content://mms/sent, content://mms/drafts, content://mms/outbox, content://mms/temp.");
        }
        b.a(uri);
        obj1 = f1.e();
        contentvalues = new ContentValues();
        obj = m.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            int i1 = ((Integer)entry.getKey()).intValue();
            android_src.mms.e.e e1 = ((q) (obj1)).c(i1);
            if (e1 != null)
            {
                String s1 = (String)l.get(Integer.valueOf(i1));
                contentvalues.put((String)entry.getValue(), a(e1.b()));
                contentvalues.put(s1, Integer.valueOf(e1.a()));
            }
        } while (true);
        obj = n.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            byte abyte0[] = ((q) (obj1)).b(((Integer)entry1.getKey()).intValue());
            if (abyte0 != null)
            {
                contentvalues.put((String)entry1.getValue(), a(abyte0));
            }
        } while (true);
        obj = o.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry2 = (java.util.Map.Entry)((Iterator) (obj)).next();
            int j1 = ((q) (obj1)).a(((Integer)entry2.getKey()).intValue());
            if (j1 != 0)
            {
                contentvalues.put((String)entry2.getValue(), Integer.valueOf(j1));
            }
        } while (true);
        obj = p.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry3 = (java.util.Map.Entry)((Iterator) (obj)).next();
            long l4 = ((q) (obj1)).e(((Integer)entry3.getKey()).intValue());
            if (l4 != -1L)
            {
                contentvalues.put((String)entry3.getValue(), Long.valueOf(l4));
            }
        } while (true);
        hashmap = new HashMap(c.length);
        int ai[] = c;
        int l2 = ai.length;
        k1 = 0;
        while (k1 < l2) 
        {
            int i4 = ai[k1];
            android_src.mms.e.e ae[] = null;
            if (i4 == 137)
            {
                android_src.mms.e.e e3 = ((q) (obj1)).c(i4);
                if (e3 != null)
                {
                    ae = new android_src.mms.e.e[1];
                    ae[0] = e3;
                }
            } else
            {
                ae = ((q) (obj1)).d(i4);
            }
            hashmap.put(Integer.valueOf(i4), ae);
            k1++;
        }
        obj1 = new HashSet();
        l5 = 0x7fffffffffffffffL;
        k1 = f1.f();
        if (k1 != 130 && k1 != 132 && k1 != 128)
        {
            break MISSING_BLOCK_LABEL_805;
        }
        ae = android_src.mms.f.a.a(q);
        k1;
        JVM INSTR tableswitch 128 132: default 620
    //                   128 776
    //                   129 620
    //                   130 758
    //                   131 620
    //                   132 671;
           goto _L1 _L2 _L1 _L3 _L1 _L4
_L1:
        ae = null;
_L6:
        if (ae != null)
        {
            int i3 = ae.length;
            for (int l1 = 0; l1 < i3; l1++)
            {
                android_src.mms.e.e e2 = ae[l1];
                if (e2 != null)
                {
                    ((HashSet) (obj1)).add(e2.c());
                }
            }

        }
        break; /* Loop/switch isn't completed */
_L4:
        if (!com.facebook.common.w.n.a(ae))
        {
            ae = (android_src.mms.e.e[])hashmap.get(Integer.valueOf(151));
            if (ae != null)
            {
                int j3 = ae.length;
                for (int i2 = 0; i2 < j3; i2++)
                {
                    Object obj2 = ae[i2];
                    if (obj2 == null)
                    {
                        continue;
                    }
                    obj2 = ((android_src.mms.e.e) (obj2)).c();
                    if (!android_src.mms.f.a.a(q, ((String) (obj2))))
                    {
                        ((HashSet) (obj1)).add(obj2);
                    }
                }

            }
        }
_L3:
        ae = (android_src.mms.e.e[])hashmap.get(Integer.valueOf(137));
        continue; /* Loop/switch isn't completed */
_L2:
        ae = (android_src.mms.e.e[])hashmap.get(Integer.valueOf(151));
        if (true) goto _L6; else goto _L5
_L5:
        l5 = android_src.c.m.a(q, ((Set) (obj1)));
        contentvalues.put("thread_id", Long.valueOf(l5));
        contentvalues.put("seen", Integer.valueOf(1));
        contentvalues.put("read", Integer.valueOf(1));
        l5 = System.currentTimeMillis();
        if (f1 instanceof android_src.mms.e.g)
        {
            f1 = ((android_src.mms.e.g)f1).a();
            if (f1 != null)
            {
                int k3 = f1.b();
                for (int j2 = 0; j2 < k3; j2++)
                {
                    a(f1.a(j2), l5);
                }

            }
        }
        f1 = android_src.a.a.a.a(q, r, uri, contentvalues);
        if (f1 == null)
        {
            throw new d("persist() failed: return null.");
        }
        long l6 = ContentUris.parseId(f1);
        f1 = new ContentValues(1);
        f1.put("mid", Long.valueOf(l6));
        android_src.a.a.a.a(q, r, Uri.parse((new StringBuilder()).append("content://mms/").append(l5).append("/part").toString()), f1, null, null);
        f1 = Uri.parse((new StringBuilder()).append(uri).append("/").append(l6).toString());
        uri = c;
        int l3 = uri.length;
        for (int k2 = 0; k2 < l3; k2++)
        {
            int j4 = uri[k2];
            android_src.mms.e.e ae1[] = (android_src.mms.e.e[])hashmap.get(Integer.valueOf(j4));
            if (ae1 != null)
            {
                a(l6, j4, ae1);
            }
        }

        return f1;
    }

    public Uri a(s s1, long l1)
    {
        Uri uri = Uri.parse((new StringBuilder()).append("content://mms/").append(l1).append("/part").toString());
        ContentValues contentvalues = new ContentValues(8);
        int i1 = s1.d();
        if (i1 != 0)
        {
            contentvalues.put("chset", Integer.valueOf(i1));
        }
        if (s1.g() != null)
        {
            String s2 = a(s1.g());
            if ("image/jpg".equals(s2))
            {
                s2 = "image/jpeg";
            }
            contentvalues.put("ct", s2);
            if ("application/smil".equals(s2))
            {
                contentvalues.put("seq", Integer.valueOf(-1));
            }
            if (s1.j() != null)
            {
                contentvalues.put("fn", new String(s1.j()));
            }
            if (s1.i() != null)
            {
                contentvalues.put("name", new String(s1.i()));
            }
            if (s1.f() != null)
            {
                contentvalues.put("cd", (String)a(s1.f()));
            }
            if (s1.c() != null)
            {
                contentvalues.put("cid", (String)a(s1.c()));
            }
            if (s1.e() != null)
            {
                contentvalues.put("cl", (String)a(s1.e()));
            }
            uri = android_src.a.a.a.a(q, r, uri, contentvalues);
            if (uri == null)
            {
                throw new d("Failed to persist part, return null.");
            } else
            {
                a(s1, uri, s2);
                s1.a(uri);
                return uri;
            }
        } else
        {
            throw new d("MIME type of the part must be set.");
        }
    }

    public android_src.mms.e.f a(Uri uri)
    {
        Object obj;
        Object obj1;
        long l2;
        obj = (android_src.mms.g.k)b.a(uri);
        if (obj != null)
        {
            return ((android_src.mms.g.k) (obj)).a();
        }
        obj1 = android_src.a.a.a.a(q, r, uri, d, null, null, null);
        obj = new q();
        l2 = ContentUris.parseId(uri);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        if (((Cursor) (obj1)).getCount() == 1 && ((Cursor) (obj1)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_117;
        }
        throw new d((new StringBuilder()).append("Bad uri: ").append(uri).toString());
        uri;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw uri;
        int j1;
        long l3;
        j1 = ((Cursor) (obj1)).getInt(1);
        l3 = ((Cursor) (obj1)).getLong(2);
        java.util.Map.Entry entry;
        for (Iterator iterator = h.entrySet().iterator(); iterator.hasNext(); a(((Cursor) (obj1)), ((Integer)entry.getValue()).intValue(), ((q) (obj)), ((Integer)entry.getKey()).intValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        java.util.Map.Entry entry1;
        for (Iterator iterator1 = i.entrySet().iterator(); iterator1.hasNext(); b(((Cursor) (obj1)), ((Integer)entry1.getValue()).intValue(), ((q) (obj)), ((Integer)entry1.getKey()).intValue()))
        {
            entry1 = (java.util.Map.Entry)iterator1.next();
        }

        java.util.Map.Entry entry2;
        for (Iterator iterator2 = j.entrySet().iterator(); iterator2.hasNext(); c(((Cursor) (obj1)), ((Integer)entry2.getValue()).intValue(), ((q) (obj)), ((Integer)entry2.getKey()).intValue()))
        {
            entry2 = (java.util.Map.Entry)iterator2.next();
        }

        java.util.Map.Entry entry3;
        for (Iterator iterator3 = k.entrySet().iterator(); iterator3.hasNext(); d(((Cursor) (obj1)), ((Integer)entry3.getValue()).intValue(), ((q) (obj)), ((Integer)entry3.getKey()).intValue()))
        {
            entry3 = (java.util.Map.Entry)iterator3.next();
        }

        int k1;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        if (l2 == -1L)
        {
            throw new d("Error! ID of the message: -1.");
        }
        a(l2, ((q) (obj)));
        k1 = ((q) (obj)).a(140);
        obj1 = new android_src.mms.e.j();
        if (k1 == 132 || k1 == 128)
        {
            s as[] = b(l2);
            if (as != null)
            {
                int l1 = as.length;
                for (int i1 = 0; i1 < l1; i1++)
                {
                    ((android_src.mms.e.j) (obj1)).a(as[i1]);
                }

            }
        }
        k1;
        JVM INSTR tableswitch 128 151: default 644
    //                   128 746
    //                   129 795
    //                   130 676
    //                   131 771
    //                   132 733
    //                   133 759
    //                   134 709
    //                   135 783
    //                   136 721
    //                   137 795
    //                   138 795
    //                   139 795
    //                   140 795
    //                   141 795
    //                   142 795
    //                   143 795
    //                   144 795
    //                   145 795
    //                   146 795
    //                   147 795
    //                   148 795
    //                   149 795
    //                   150 795
    //                   151 795;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3
_L1:
        throw new d((new StringBuilder()).append("Unrecognized PDU type: ").append(Integer.toHexString(k1)).toString());
_L4:
        obj = new h(((q) (obj)));
_L11:
        obj1 = new android_src.mms.g.k(((android_src.mms.e.f) (obj)), j1, l3);
        b.a(uri, ((android_src.mms.g.k) (obj1)));
        return ((android_src.mms.e.f) (obj));
_L8:
        obj = new android_src.mms.e.d(((q) (obj)));
        continue; /* Loop/switch isn't completed */
_L10:
        obj = new v(((q) (obj)));
        continue; /* Loop/switch isn't completed */
_L6:
        obj = new x(((q) (obj)), ((android_src.mms.e.j) (obj1)));
        continue; /* Loop/switch isn't completed */
_L2:
        obj = new z(((q) (obj)), ((android_src.mms.e.j) (obj1)));
        continue; /* Loop/switch isn't completed */
_L7:
        obj = new android_src.mms.e.a(((q) (obj)));
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new android_src.mms.e.i(((q) (obj)));
        continue; /* Loop/switch isn't completed */
_L9:
        obj = new w(((q) (obj)));
        if (true) goto _L11; else goto _L3
_L3:
        throw new d((new StringBuilder()).append("Unsupported PDU type: ").append(Integer.toHexString(k1)).toString());
    }

    static 
    {
        f = new HashMap();
        f.put(f.a, Integer.valueOf(1));
        f.put(i.a, Integer.valueOf(2));
        f.put(e.a, Integer.valueOf(3));
        f.put(g.a, Integer.valueOf(4));
        g = new HashMap();
        g.put(Integer.valueOf(150), Integer.valueOf(25));
        g.put(Integer.valueOf(154), Integer.valueOf(26));
        l = new HashMap();
        l.put(Integer.valueOf(150), "sub_cs");
        l.put(Integer.valueOf(154), "retr_txt_cs");
        h = new HashMap();
        h.put(Integer.valueOf(154), Integer.valueOf(3));
        h.put(Integer.valueOf(150), Integer.valueOf(4));
        m = new HashMap();
        m.put(Integer.valueOf(154), "retr_txt");
        m.put(Integer.valueOf(150), "sub");
        i = new HashMap();
        i.put(Integer.valueOf(131), Integer.valueOf(5));
        i.put(Integer.valueOf(132), Integer.valueOf(6));
        i.put(Integer.valueOf(138), Integer.valueOf(7));
        i.put(Integer.valueOf(139), Integer.valueOf(8));
        i.put(Integer.valueOf(147), Integer.valueOf(9));
        i.put(Integer.valueOf(152), Integer.valueOf(10));
        n = new HashMap();
        n.put(Integer.valueOf(131), "ct_l");
        n.put(Integer.valueOf(132), "ct_t");
        n.put(Integer.valueOf(138), "m_cls");
        n.put(Integer.valueOf(139), "m_id");
        n.put(Integer.valueOf(147), "resp_txt");
        n.put(Integer.valueOf(152), "tr_id");
        j = new HashMap();
        j.put(Integer.valueOf(186), Integer.valueOf(11));
        j.put(Integer.valueOf(134), Integer.valueOf(12));
        j.put(Integer.valueOf(140), Integer.valueOf(13));
        j.put(Integer.valueOf(141), Integer.valueOf(14));
        j.put(Integer.valueOf(143), Integer.valueOf(15));
        j.put(Integer.valueOf(144), Integer.valueOf(16));
        j.put(Integer.valueOf(155), Integer.valueOf(17));
        j.put(Integer.valueOf(145), Integer.valueOf(18));
        j.put(Integer.valueOf(153), Integer.valueOf(19));
        j.put(Integer.valueOf(149), Integer.valueOf(20));
        o = new HashMap();
        o.put(Integer.valueOf(186), "ct_cls");
        o.put(Integer.valueOf(134), "d_rpt");
        o.put(Integer.valueOf(140), "m_type");
        o.put(Integer.valueOf(141), "v");
        o.put(Integer.valueOf(143), "pri");
        o.put(Integer.valueOf(144), "rr");
        o.put(Integer.valueOf(155), "read_status");
        o.put(Integer.valueOf(145), "rpt_a");
        o.put(Integer.valueOf(153), "retr_st");
        o.put(Integer.valueOf(149), "st");
        k = new HashMap();
        k.put(Integer.valueOf(133), Integer.valueOf(21));
        k.put(Integer.valueOf(135), Integer.valueOf(22));
        k.put(Integer.valueOf(136), Integer.valueOf(23));
        k.put(Integer.valueOf(142), Integer.valueOf(24));
        p = new HashMap();
        p.put(Integer.valueOf(133), "date");
        p.put(Integer.valueOf(135), "d_tm");
        p.put(Integer.valueOf(136), "exp");
        p.put(Integer.valueOf(142), "m_size");
    }
}
