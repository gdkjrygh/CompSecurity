// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.Log;
import com.google.android.apps.photos.stories.database.PruneOldStoriesService;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public final class iun
{

    public static final Uri a = Uri.parse("content://com.google.android.apps.photos.stories/stories");
    private static final byte b[] = {
        3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 
        5
    };
    private static final String c[] = {
        "data"
    };

    public static int a(Context context, int i)
    {
        context = mvj.b(context, i);
        if (context == null)
        {
            Log.w("StoryDatabase", "Cannot get story count; cannot get database");
            return 0;
        } else
        {
            return (int)DatabaseUtils.longForQuery(context, "SELECT COUNT(*) FROM stories", null);
        }
    }

    public static iuh a(Context context, int i, iuj iuj1)
    {
        Object obj;
        Object obj1;
        Cursor cursor;
        obj = null;
        obj1 = null;
        context = mvj.b(context, i);
        if (context == null)
        {
            Log.w("StoryDatabase", "Cannot get story; cannot get database");
            return null;
        }
        cursor = context.query("stories", c, "story_key=?", new String[] {
            iuj1.a()
        }, null, null, null);
        context = obj1;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_212;
        }
        context = obj1;
        if (cursor.isNull(0))
        {
            break MISSING_BLOCK_LABEL_212;
        }
        i = cursor.getColumnCount();
        context = cursor.getBlob(0);
        if (!Arrays.equals(context, b))
        {
            break MISSING_BLOCK_LABEL_129;
        }
        context = new iuh(null);
        context.f = true;
        cursor.close();
        return context;
        context = new iuh((pev)qlw.a(new pev(), context));
        if (i <= 1)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        if (!cursor.isNull(1))
        {
            context.c = cursor.getLong(1);
        }
        if (i <= 2)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        if (!cursor.isNull(2) && cursor.getInt(2) == 1)
        {
            context.d = true;
        }
        cursor.close();
        return context;
        context;
        iuj1 = obj;
_L2:
        Log.e("StoryDatabase", "Unable to deserialize Story", context);
        cursor.close();
        return iuj1;
        context;
        cursor.close();
        throw context;
        qlv qlv1;
        qlv1;
        iuj1 = context;
        context = qlv1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void a(Context context, int i, int j, int k)
    {
        context = mvj.a(context, i);
        if (context == null)
        {
            Log.w("StoryDatabase", "Cannot prune stories; cannot get database");
            return;
        } else
        {
            context.delete("stories", "end_timestamp<?", new String[] {
                String.valueOf(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(60L))
            });
            context.delete("stories", "_id NOT IN (SELECT _id FROM stories ORDER BY end_timestamp DESC LIMIT ?);", new String[] {
                "10"
            });
            return;
        }
    }

    public static void a(Context context, int i, pev pev1, boolean flag)
    {
        SQLiteDatabase sqlitedatabase;
        ContentValues contentvalues;
        int j;
        iuj iuj1;
        if (pev1 != null && pev1.a != null)
        {
            iuj1 = iuj.a(pev1.a);
        } else
        {
            iuj1 = null;
        }
        if (iuj1.a() == null)
        {
            throw new iuo("Cannot insert story with no id");
        }
        if (pev1.f != null && !b.a(pev1.f.a, false) && !b.a(pev1.f.b, false))
        {
            Object obj = a(context, i, iuj1);
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((iuh) (obj)).a;
            }
            if (obj != null && qlw.a(pev1.a, ((pev) (obj)).a) && ((pev) (obj)).f != null && (b.a(((pev) (obj)).f.a, false) || b.a(((pev) (obj)).f.b, false)))
            {
                pev1.f.b = ((pev) (obj)).f.b;
                pev1.f.a = ((pev) (obj)).f.a;
                pev1.e = ((pev) (obj)).e;
                pev1.h = ((pev) (obj)).h;
                if (pev1.j == null)
                {
                    pev1.j = ((pev) (obj)).j;
                }
            }
        }
        sqlitedatabase = mvj.a(context, i);
        if (sqlitedatabase == null)
        {
            throw new iuo("Cannot insert story; cannot get database");
        }
        contentvalues = new ContentValues();
        contentvalues.put("story_key", iuj1.a());
        byte abyte0[];
        if (a(pev1))
        {
            abyte0 = b;
        } else
        {
            abyte0 = qlw.a(pev1);
        }
        contentvalues.put("data", abyte0);
        contentvalues.put("refresh_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentvalues.put("end_timestamp", pev1.c.b.b.a);
        if (flag)
        {
            contentvalues.put("requested_freeze", Integer.valueOf(1));
        }
        sqlitedatabase.beginTransaction();
        j = sqlitedatabase.update("stories", contentvalues, "story_key=?", new String[] {
            iuj1.a()
        });
        if (j == 0 || j == 1)
        {
            break MISSING_BLOCK_LABEL_437;
        }
        throw new iuo((new StringBuilder(61)).append("Cannot insert story; update query failed (result=").append(j).append(")").toString());
        context;
        sqlitedatabase.endTransaction();
        throw context;
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_470;
        }
        if (sqlitedatabase.insert("stories", null, contentvalues) == -1L)
        {
            throw new iuo("Cannot insert story; insert query failed");
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        PruneOldStoriesService.a(context, i);
        context.getContentResolver().notifyChange(Uri.withAppendedPath(a, pev1.a.b), null);
        return;
    }

    public static boolean a(pev pev1)
    {
        return pev1.d() > 0x1ff000;
    }

    public static void b(Context context, int i, iuj iuj1)
    {
        SQLiteDatabase sqlitedatabase = mvj.a(context, i);
        if (sqlitedatabase == null)
        {
            Log.w("StoryDatabase", "Cannot delete story; cannot get database");
            return;
        } else
        {
            sqlitedatabase.delete("stories", "story_key=?", new String[] {
                iuj1.a()
            });
            context.getContentResolver().notifyChange(Uri.withAppendedPath(a, iuj1.a()), null);
            return;
        }
    }

}
