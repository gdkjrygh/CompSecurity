// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.app.DownloadManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.d;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.LogParams;
import com.google.android.libraries.translate.logging.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            c

public final class b
{

    private static b c = null;
    final SharedPreferences a;
    final com.google.android.libraries.translate.b.b b;
    private final Map d;
    private final DownloadManager e;
    private final List f;
    private long g;

    private b(Context context)
    {
        this(context, (DownloadManager)context.getSystemService("download"));
    }

    private b(Context context, DownloadManager downloadmanager)
    {
        int i = 0;
        super();
        d = new HashMap();
        e = downloadmanager;
        a = context.getSharedPreferences("dm_queue", 0);
        f = new ArrayList();
        downloadmanager = a.getString("queue", "").split(",");
        for (int j = downloadmanager.length; i < j; i++)
        {
            CharSequence charsequence = downloadmanager[i];
            if (!TextUtils.isEmpty(charsequence))
            {
                f.add(Long.valueOf(Long.parseLong(charsequence)));
            }
        }

        g = a.getLong("count", 0L);
        b = new com.google.android.libraries.translate.b.b(context, "dm_idmap");
    }

    private static android.app.DownloadManager.Request a(c c1, boolean flag)
    {
        Uri uri = Uri.parse(c1.b);
        android.app.DownloadManager.Request request;
        int i;
        try
        {
            request = new android.app.DownloadManager.Request(uri);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            request = new android.app.DownloadManager.Request(uri.buildUpon().scheme("http").build());
            Singleton.b().a(-515, LogParams.create(illegalargumentexception.getMessage()).addParam("url", c1.b));
        }
        request.setDestinationUri(Uri.parse(c1.c));
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        request.setAllowedNetworkTypes(i | 2);
        request.setAllowedOverRoaming(flag);
        request.setTitle(c1.d);
        return request;
    }

    private static android.content.SharedPreferences.Editor a(long l, android.content.SharedPreferences.Editor editor)
    {
        String s = String.valueOf("local_path_");
        editor = editor.remove((new StringBuilder(String.valueOf(s).length() + 20)).append(s).append(l).toString());
        s = String.valueOf("remote_path_");
        editor = editor.remove((new StringBuilder(String.valueOf(s).length() + 20)).append(s).append(l).toString());
        s = String.valueOf("download_title_");
        return editor.remove((new StringBuilder(String.valueOf(s).length() + 20)).append(s).append(l).toString());
    }

    public static b a(Context context)
    {
        com/google/android/libraries/translate/offline/b;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = new b(context);
        }
        context = c;
        com/google/android/libraries/translate/offline/b;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private static android.content.SharedPreferences.Editor b(long l, android.content.SharedPreferences.Editor editor)
    {
        String s = String.valueOf("use_mobile_data_");
        return editor.remove((new StringBuilder(String.valueOf(s).length() + 20)).append(s).append(l).toString());
    }

    private c d(long l)
    {
        c c1 = (c)d.get(Long.valueOf(l));
        Object obj = c1;
        if (c1 == null)
        {
            obj = a;
            String s = String.valueOf("remote_path_");
            s = ((SharedPreferences) (obj)).getString((new StringBuilder(String.valueOf(s).length() + 20)).append(s).append(l).toString(), "");
            obj = a;
            String s1 = String.valueOf("local_path_");
            s1 = ((SharedPreferences) (obj)).getString((new StringBuilder(String.valueOf(s1).length() + 20)).append(s1).append(l).toString(), "");
            obj = a;
            String s2 = String.valueOf("download_title_");
            s2 = ((SharedPreferences) (obj)).getString((new StringBuilder(String.valueOf(s2).length() + 20)).append(s2).append(l).toString(), "");
            obj = c1;
            if (!TextUtils.isEmpty(s1))
            {
                obj = c1;
                if (!TextUtils.isEmpty(s))
                {
                    obj = c1;
                    if (!TextUtils.isEmpty(s2))
                    {
                        obj = new c(l, s, s1, s2, 1, 0, -1L, 0L);
                        d.put(Long.valueOf(l), obj);
                    }
                }
            }
        }
        return ((c) (obj));
    }

    private void e()
    {
        Cursor cursor = e.query((new android.app.DownloadManager.Query()).setFilterByStatus(7));
        if (cursor != null)
        {
            if (cursor.getCount() == 0)
            {
                android.content.SharedPreferences.Editor editor = a.edit();
                boolean flag = false;
                long l = -1L;
                c c1 = null;
                do
                {
                    if (flag || f.size() <= 0)
                    {
                        break;
                    }
                    long l1 = ((Long)f.remove(0)).longValue();
                    c1 = d(l1);
                    if (c1 != null)
                    {
                        (new File(Uri.parse(c1.c).getPath())).delete();
                        Object obj = a;
                        Object obj1 = String.valueOf("use_mobile_data_");
                        boolean flag1 = ((SharedPreferences) (obj)).getBoolean((new StringBuilder(String.valueOf(obj1).length() + 20)).append(((String) (obj1))).append(l1).toString(), false);
                        obj = a(c1, flag1);
                        ((android.app.DownloadManager.Request) (obj)).addRequestHeader("User-Agent", com.google.android.libraries.translate.e.d.c());
                        l = e.enqueue(((android.app.DownloadManager.Request) (obj)));
                        obj = b;
                        obj1 = Long.valueOf(l1);
                        Long long1 = Long.valueOf(l);
                        ((com.google.android.libraries.translate.b.b) (obj)).c.edit().putLong(com.google.android.libraries.translate.b.b.c(((Long) (obj1))), long1.longValue()).putLong(com.google.android.libraries.translate.b.b.d(long1), ((Long) (obj1)).longValue()).commit();
                        ((com.google.android.libraries.translate.b.b) (obj)).a.put(obj1, long1);
                        ((com.google.android.libraries.translate.b.b) (obj)).b.put(long1, obj1);
                        a(l1, editor);
                        editor.putBoolean("last_use_mobile_data", flag1);
                        flag = true;
                    }
                } while (true);
                long l3 = a.getLong("active_download_id", -1L);
                long l2 = a.getLong("active_download_start_time", -1L);
                if (l3 >= 0L)
                {
                    int ai[] = c(l3);
                    String s = a.getString("active_download_uri", "");
                    l3 = b.b(Long.valueOf(l3));
                    if (l3 != 0x8000000000000000L)
                    {
                        b(l3, editor);
                    }
                    if (ai[0] == 8)
                    {
                        Singleton.b().a(Event.OFFLINE_FILE_DOWNLOAD_COMPLETE, l2, null, null, LogParams.create(s).addParam("uri", s), f.size());
                    } else
                    if (ai[0] == 16)
                    {
                        Singleton.b().a(Event.OFFLINE_FILE_DOWNLOAD_FAILED, l2, null, null, LogParams.create(s).addParam("code", Integer.valueOf(ai[1])), f.size());
                    }
                }
                if (flag)
                {
                    editor.putLong("active_download_id", l).putLong("active_download_start_time", System.currentTimeMillis()).putString("active_download_uri", c1.b);
                } else
                {
                    editor.remove("active_download_id").remove("active_download_start_time").remove("active_download_uri");
                }
                editor.commit();
                f();
            }
            cursor.close();
            return;
        } else
        {
            Singleton.b().a(-510, (new LogParams()).addParam("cause", "mayBeStartNextDownload"));
            return;
        }
    }

    private void f()
    {
        a.edit().putString("queue", TextUtils.join(",", f)).commit();
    }

    public final long a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        l = b.b(Long.valueOf(l));
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public final long a(Uri uri, Uri uri1, String s, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        g = g + 1L;
        a.edit().putLong("count", g).commit();
        l = g;
        f.add(Long.valueOf(l));
        f();
        Object obj = a.edit();
        String s1 = String.valueOf("remote_path_");
        uri = ((android.content.SharedPreferences.Editor) (obj)).putString((new StringBuilder(String.valueOf(s1).length() + 20)).append(s1).append(l).toString(), uri.toString());
        obj = String.valueOf("local_path_");
        uri = uri.putString((new StringBuilder(String.valueOf(obj).length() + 20)).append(((String) (obj))).append(l).toString(), uri1.toString());
        uri1 = String.valueOf("download_title_");
        uri = uri.putString((new StringBuilder(String.valueOf(uri1).length() + 20)).append(uri1).append(l).toString(), s);
        uri1 = String.valueOf("use_mobile_data_");
        uri.putBoolean((new StringBuilder(String.valueOf(uri1).length() + 20)).append(uri1).append(l).toString(), flag).commit();
        e();
        this;
        JVM INSTR monitorexit ;
        return l;
        uri;
        throw uri;
    }

    public final boolean a()
    {
        return a.getBoolean("last_use_mobile_data", false);
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        e();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(long l)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = b.a(Long.valueOf(l));
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        e.remove(new long[] {
            l1
        });
        Object obj = a.edit();
        a(l, ((android.content.SharedPreferences.Editor) (obj)));
        b(l, ((android.content.SharedPreferences.Editor) (obj)));
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        obj = b;
        Long long1 = Long.valueOf(l);
        ((com.google.android.libraries.translate.b.b) (obj)).c.edit().remove(com.google.android.libraries.translate.b.b.c(long1)).remove(com.google.android.libraries.translate.b.b.d(long1)).commit();
        long1 = (Long)((com.google.android.libraries.translate.b.b) (obj)).a.remove(long1);
        ((com.google.android.libraries.translate.b.b) (obj)).b.remove(long1);
        if (f.remove(Long.valueOf(l)))
        {
            f();
        }
        d.remove(Long.valueOf(l));
        e();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = a.edit();
        long l;
        for (Iterator iterator = f.iterator(); iterator.hasNext(); b(l, ((android.content.SharedPreferences.Editor) (obj))))
        {
            l = ((Long)iterator.next()).longValue();
            a(l, ((android.content.SharedPreferences.Editor) (obj)));
        }

        break MISSING_BLOCK_LABEL_67;
        obj;
        throw obj;
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        f.clear();
        f();
        obj = e.query((new android.app.DownloadManager.Query()).setFilterByStatus(7));
        if (obj != null) goto _L2; else goto _L1
_L1:
        Singleton.b().a(-510, (new LogParams()).addParam("cause", "removeAllActiveDownloads"));
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int i = ((Cursor) (obj)).getCount();
_L4:
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        if (((Cursor) (obj)).moveToNext())
        {
            e.remove(new long[] {
                ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndex("_id"))
            });
        }
        break MISSING_BLOCK_LABEL_200;
        ((Cursor) (obj)).close();
          goto _L3
        i--;
          goto _L4
    }

    final int[] c(long l)
    {
        Cursor cursor = null;
        Cursor cursor1 = e.query((new android.app.DownloadManager.Query()).setFilterById(new long[] {
            l
        }));
        if (cursor1 == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        cursor = cursor1;
        if (cursor1.getCount() != 1)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        cursor = cursor1;
        if (!cursor1.moveToNext())
        {
            break MISSING_BLOCK_LABEL_130;
        }
        cursor = cursor1;
        int i = cursor1.getInt(cursor1.getColumnIndex("status"));
        cursor = cursor1;
        int j = cursor1.getInt(cursor1.getColumnIndex("reason"));
        if (cursor1 != null)
        {
            cursor1.close();
        }
        return (new int[] {
            i, j
        });
        if (cursor1 != null)
        {
            cursor1.close();
        }
        return (new int[] {
            0, 0
        });
        Exception exception;
        exception;
        if (cursor != null)
        {
            cursor.close();
        }
        throw exception;
    }

    public final Collection d()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Cursor cursor;
        cursor = e.query((new android.app.DownloadManager.Query()).setFilterByStatus(31));
        obj = new HashMap();
        if (cursor == null) goto _L2; else goto _L1
_L1:
        int i = cursor.getCount();
_L9:
        if (i <= 0) goto _L4; else goto _L3
_L3:
        if (cursor.moveToNext())
        {
            Long long1 = Long.valueOf(b.b(Long.valueOf(cursor.getLong(cursor.getColumnIndex("_id")))));
            if (long1.longValue() >= 0L)
            {
                ((Map) (obj)).put(long1, new c(long1.longValue(), cursor.getString(cursor.getColumnIndex("uri")), cursor.getString(cursor.getColumnIndex("local_uri")), cursor.getString(cursor.getColumnIndex("title")), cursor.getInt(cursor.getColumnIndex("status")), cursor.getInt(cursor.getColumnIndex("reason")), cursor.getLong(cursor.getColumnIndex("total_size")), cursor.getLong(cursor.getColumnIndex("bytes_so_far"))));
            }
        }
          goto _L5
_L4:
        cursor.close();
_L7:
        Iterator iterator = f.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            long l = ((Long)iterator.next()).longValue();
            if (!((Map) (obj)).containsKey(Long.valueOf(l)))
            {
                ((Map) (obj)).put(Long.valueOf(l), d(l));
            }
        } while (true);
          goto _L6
        obj;
        throw obj;
_L2:
        Singleton.b().a(-510, (new LogParams()).addParam("cause", "queryAll"));
          goto _L7
_L6:
        obj = ((Map) (obj)).values();
        this;
        JVM INSTR monitorexit ;
        return ((Collection) (obj));
_L5:
        i--;
        if (true) goto _L9; else goto _L8
_L8:
    }

}
