// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.vungle.log.Logger;
import com.vungle.publisher.bg;
import com.vungle.publisher.bi;
import com.vungle.publisher.db.DatabaseHelper;
import java.util.List;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.db.model:
//            LocalArchive

public class ArchiveEntry extends bi
{
    public static class Factory extends com.vungle.publisher.bi.a
    {

        Provider a;

        final int a(Integer integer)
        {
            if (integer == null)
            {
                throw new IllegalArgumentException("null viewable_id");
            } else
            {
                int i = c.getWritableDatabase().delete("archive_entry", "viewable_id = ?", new String[] {
                    String.valueOf(integer)
                });
                Logger.d("VungleDatabase", (new StringBuilder("deleted ")).append(i).append(" archive_entry rows for viewable_id ").append(integer).toString());
                return i;
            }
        }

        public final volatile int a(List list)
        {
            return super.a(list);
        }

        protected final bi a(bi bi1, Cursor cursor)
        {
            bi1 = (ArchiveEntry)bi1;
            bi1.t = bg.d(cursor, "id");
            bi1.b = bg.f(cursor, "relative_path");
            bi1.c = bg.d(cursor, "size");
            return bi1;
        }

        final ArchiveEntry a()
        {
            return (ArchiveEntry)a.get();
        }

        final ArchiveEntry[] a(LocalArchive localarchive)
        {
            Object obj;
            if (localarchive == null)
            {
                throw new IllegalArgumentException("null archive");
            }
            obj = localarchive.D();
            if (obj == null)
            {
                throw new IllegalArgumentException("null viewable_id");
            }
            Logger.d("VungleDatabase", (new StringBuilder("fetching archive_entry records by viewable_id ")).append(obj).toString());
            obj = c.getReadableDatabase().query("archive_entry", null, "viewable_id = ?", new String[] {
                String.valueOf(obj)
            }, null, null, null);
            ArchiveEntry aarchiveentry[] = new ArchiveEntry[((Cursor) (obj)).getCount()];
            int i = 0;
_L2:
            ArchiveEntry archiveentry;
            if (!((Cursor) (obj)).moveToNext())
            {
                break; /* Loop/switch isn't completed */
            }
            archiveentry = a();
            b(archiveentry, ((Cursor) (obj)));
            archiveentry.a = localarchive;
            aarchiveentry[i] = archiveentry;
            Logger.v("VungleDatabase", (new StringBuilder("fetched ")).append(archiveentry).toString());
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            if (obj != null)
            {
                ((Cursor) (obj)).close();
            }
            return aarchiveentry;
            localarchive;
            obj = null;
_L4:
            if (obj != null)
            {
                ((Cursor) (obj)).close();
            }
            throw localarchive;
            localarchive;
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected final volatile Object[] b(int i)
        {
            return new Integer[i];
        }

        protected final volatile bi[] c(int i)
        {
            return new ArchiveEntry[i];
        }

        protected final bi c_()
        {
            return a();
        }

        public final volatile List d()
        {
            return super.d();
        }

        public final volatile List d(int i)
        {
            return super.d(i);
        }

        protected final String e_()
        {
            return "archive_entry";
        }

        public Factory()
        {
        }
    }


    LocalArchive a;
    String b;
    Integer c;
    Factory d;
    LocalArchive.Factory e;

    protected ArchiveEntry()
    {
    }

    private Integer c()
    {
        if (a == null)
        {
            return null;
        } else
        {
            return a.D();
        }
    }

    protected final ContentValues a(boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        if (t != null)
        {
            contentvalues.put("id", (Integer)t);
        }
        contentvalues.put("viewable_id", c());
        contentvalues.put("relative_path", b);
        contentvalues.put("size", c);
        return contentvalues;
    }

    protected final volatile com.vungle.publisher.bi.a a_()
    {
        return d;
    }

    protected final String b()
    {
        return "archive_entry";
    }

    public final int m()
    {
        if (t == null)
        {
            Integer integer = c();
            String s = b;
            Logger.d("VungleDatabase", (new StringBuilder("updating archive_entry by viewable_id ")).append(integer).append(", relative_path ").append(s).toString());
            int i = u.getWritableDatabase().updateWithOnConflict("archive_entry", a(false), "viewable_id = ? AND relative_path = ?", new String[] {
                String.valueOf(integer), s
            }, 3);
            w();
            return i;
        } else
        {
            return super.m();
        }
    }

    protected final StringBuilder p()
    {
        StringBuilder stringbuilder = super.p();
        bi.a(stringbuilder, "viewable_id", c(), false);
        bi.a(stringbuilder, "relative_path", b, false);
        bi.a(stringbuilder, "size", c, false);
        return stringbuilder;
    }
}
