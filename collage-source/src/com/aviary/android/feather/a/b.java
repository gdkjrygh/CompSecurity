// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.utils.d;
import com.aviary.android.feather.common.utils.l;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.aviary.android.feather.a:
//            d, a, c

public final class com.aviary.android.feather.a.b
{
    static final class a extends Handler
    {

        com.aviary.android.feather.common.a.a.c a;
        private Context b;
        private Handler c;

        private void a()
        {
            a.b("init");
            c = new c(b, com.aviary.android.feather.a.b.c.getLooper());
        }

        private void a(com.aviary.android.feather.a.a a1)
            throws JSONException
        {
            org.json.JSONObject jsonobject = a1.a(b);
            long l1 = com.aviary.android.feather.a.c.a(b).a(jsonobject, a1.d);
            a.b("added ticket with id: %d", new Object[] {
                Long.valueOf(l1)
            });
        }

        private void b()
        {
        }

        private void c()
        {
        }

        private void d()
        {
            a.b("upload");
            c.sendEmptyMessage(1);
        }

        public void handleMessage(Message message)
        {
            a.c("handleMessage: %d", new Object[] {
                Integer.valueOf(message.what)
            });
            l.b(b);
            message.what;
            JVM INSTR lookupswitch 5: default 165
        //                       1: 114
        //                       2: 138
        //                       3: 143
        //                       4: 148
        //                       100: 153;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            a.d("didn't handle message: %d", new Object[] {
                Integer.valueOf(message.what)
            });
            return;
_L2:
            try
            {
                a();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                message.printStackTrace();
            }
            a.d(message.getMessage());
            return;
_L3:
            b();
            return;
_L4:
            c();
            return;
_L5:
            d();
            return;
_L6:
            a((com.aviary.android.feather.a.a)message.obj);
            return;
        }

        a(Context context, Looper looper)
        {
            super(looper);
            a = com.aviary.android.feather.common.a.a.a(com/aviary/android/feather/a/b$a.getSimpleName(), com.aviary.android.feather.common.a.a.d.a);
            b = context;
        }
    }

    static class b
    {

        long a;
        int b;
        int c;

        public b(long l, int i, int j)
        {
            a = l;
            b = i;
            c = j;
        }
    }

    static final class c extends Handler
    {

        com.aviary.android.feather.common.a.a.c a;
        private Context b;

        private Collection a(Cursor cursor)
        {
            a.c("uploadReceipts: {cursor.size: %d}", new Object[] {
                Integer.valueOf(cursor.getCount())
            });
            ArrayList arraylist = new ArrayList();
            int i = 0;
            do
            {
                if (!cursor.moveToNext())
                {
                    break;
                }
                long l1 = cursor.getLong(cursor.getColumnIndex("r_id"));
                byte abyte0[] = cursor.getBlob(cursor.getColumnIndex("r_json"));
                int j = cursor.getInt(cursor.getColumnIndex("r_is_free"));
                int k = com.aviary.android.feather.a.d.a(cursor.getInt(cursor.getColumnIndex("u_fail_count")), 0, 255);
                int i1 = com.aviary.android.feather.a.d.a(cursor.getInt(cursor.getColumnIndex("u_response_status")), 0, 1000);
                String s1 = new String(abyte0, Charset.forName("UTF-8"));
                a.b("trying to upload ticket: %d {fails count: %d}", new Object[] {
                    Long.valueOf(l1), Integer.valueOf(k)
                });
                String s;
                if (j == 1)
                {
                    s = "http://receipts.aviary.com/v2/receipt/android/free";
                } else
                {
                    s = "http://receipts.aviary.com/v2/receipt/android/paid";
                }
                try
                {
                    j = com.aviary.android.feather.a.d.a(s, s1);
                }
                catch (IOException ioexception)
                {
                    ioexception.printStackTrace();
                    a.d(ioexception.getMessage());
                    j = 404;
                }
                a.b("status: %d", new Object[] {
                    Integer.valueOf(j)
                });
                if (i1 != j)
                {
                    a.a("ok, the error code is different. Let's reset the fail count to 1");
                    k = 0;
                } else
                {
                    a.a("error code is the same, increment the fail count");
                }
                arraylist.add(new b(l1, j, k));
                j = i + 1;
                i = j;
            } while (j < 2);
            return arraylist;
        }

        private void a()
        {
            a.b("upload");
            l.b(b);
            Object obj = com.aviary.android.feather.a.c.a(b);
            Cursor cursor = ((com.aviary.android.feather.a.c) (obj)).a();
            if (cursor != null)
            {
                Collection collection = a(cursor);
                com.aviary.android.feather.common.utils.d.a(cursor);
                a(collection, ((com.aviary.android.feather.a.c) (obj)));
            }
            cursor = ((com.aviary.android.feather.a.c) (obj)).b();
            if (cursor != null)
            {
                Collection collection1 = a(cursor);
                com.aviary.android.feather.common.utils.d.a(cursor);
                a(collection1, ((com.aviary.android.feather.a.c) (obj)));
            }
            if (com.aviary.android.feather.common.a.a.a)
            {
                Cursor cursor1 = ((com.aviary.android.feather.a.c) (obj)).a("receipts_table", null, null, null, null, null, null);
                if (cursor1 != null)
                {
                    a.b("receipts table has %d rows", new Object[] {
                        Integer.valueOf(cursor1.getCount())
                    });
                }
                com.aviary.android.feather.common.utils.d.a(cursor1);
                obj = ((com.aviary.android.feather.a.c) (obj)).a("uploads_table", null, null, null, null, null, null);
                if (obj != null)
                {
                    a.b("uploads table has %d rows", new Object[] {
                        Integer.valueOf(((Cursor) (obj)).getCount())
                    });
                }
                com.aviary.android.feather.common.utils.d.a(((Cursor) (obj)));
            }
        }

        private void a(Collection collection, com.aviary.android.feather.a.c c1)
        {
            a.b("handleResults");
            for (collection = collection.iterator(); collection.hasNext();)
            {
                Object obj = (b)collection.next();
                a.b("item {id: %d, status: %d, failCount: %d}", new Object[] {
                    Long.valueOf(((b) (obj)).a), Integer.valueOf(((b) (obj)).b), Integer.valueOf(((b) (obj)).c)
                });
                if (((b) (obj)).b == 200)
                {
                    try
                    {
                        int i = c1.a("receipts_table", "r_id=?", new String[] {
                            String.valueOf(((b) (obj)).a)
                        });
                        a.b("deleteCount: %d", new Object[] {
                            Integer.valueOf(i)
                        });
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        ((SQLiteException) (obj)).printStackTrace();
                        a.d(((SQLiteException) (obj)).getMessage());
                    }
                } else
                if (((b) (obj)).c < 10)
                {
                    ContentValues contentvalues = new ContentValues();
                    contentvalues.put("u_receipt_id", Long.valueOf(((b) (obj)).a));
                    contentvalues.put("u_response_status", Integer.valueOf(((b) (obj)).b));
                    contentvalues.put("u_fail_count", Integer.valueOf(((b) (obj)).c + 1));
                    try
                    {
                        long l1 = c1.a("uploads_table", null, contentvalues, 5);
                        a.b("added %d to the upload table", new Object[] {
                            Long.valueOf(l1)
                        });
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        ((SQLiteException) (obj)).printStackTrace();
                        a.d(((SQLiteException) (obj)).getMessage());
                    }
                } else
                {
                    a.d("we need to delete this item, too many fails (%d)!", new Object[] {
                        Integer.valueOf(((b) (obj)).c)
                    });
                    try
                    {
                        int j = c1.a("receipts_table", "r_id=?", new String[] {
                            String.valueOf(((b) (obj)).a)
                        });
                        a.b("delete count: %d", new Object[] {
                            Integer.valueOf(j)
                        });
                    }
                    catch (SQLiteException sqliteexception)
                    {
                        sqliteexception.printStackTrace();
                        a.d(sqliteexception.getMessage());
                    }
                }
            }

        }

        public void handleMessage(Message message)
        {
            a.c("handleMessage: %d", new Object[] {
                Integer.valueOf(message.what)
            });
            message.what;
            JVM INSTR tableswitch 1 1: default 85
        //                       1 61;
               goto _L1 _L2
_L1:
            a.c("not handled");
            return;
_L2:
            try
            {
                a();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                message.printStackTrace();
            }
            a.d(message.getMessage());
            return;
        }

        public c(Context context, Looper looper)
        {
            super(looper);
            a = com.aviary.android.feather.common.a.a.a("UploadHandler", com.aviary.android.feather.common.a.a.d.a);
            b = context;
        }
    }


    static final HandlerThread b = com.aviary.android.feather.a.d.a(com/aviary/android/feather/a/b$a.getSimpleName());
    static final HandlerThread c = com.aviary.android.feather.a.d.a(com/aviary/android/feather/a/b$c.getSimpleName());
    private static com.aviary.android.feather.a.b d;
    com.aviary.android.feather.common.a.a.c a;
    private final Context e;
    private final a f;

    private com.aviary.android.feather.a.b(Context context)
    {
        a = com.aviary.android.feather.common.a.a.a("ReceiptManager", com.aviary.android.feather.common.a.a.d.a);
        e = context;
        f = new a(e, b.getLooper());
        f.sendEmptyMessage(1);
    }

    public static com.aviary.android.feather.a.b a(Context context)
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        com/aviary/android/feather/a/b;
        JVM INSTR monitorenter ;
        if (d != null) goto _L4; else goto _L3
_L3:
        com/aviary/android/feather/a/b;
        JVM INSTR monitorenter ;
        d = new com.aviary.android.feather.a.b(context);
        com/aviary/android/feather/a/b;
        JVM INSTR monitorexit ;
_L4:
        com/aviary/android/feather/a/b;
        JVM INSTR monitorexit ;
_L2:
        return d;
        context;
        com/aviary/android/feather/a/b;
        JVM INSTR monitorexit ;
        throw context;
        context;
        com/aviary/android/feather/a/b;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void a()
    {
        f.sendEmptyMessage(2);
    }

    public void a(com.aviary.android.feather.a.a a1)
    {
        f.sendMessage(f.obtainMessage(100, a1));
    }

    public void b()
    {
        f.sendEmptyMessage(3);
    }

    public void c()
    {
        f.sendEmptyMessage(4);
    }

}
