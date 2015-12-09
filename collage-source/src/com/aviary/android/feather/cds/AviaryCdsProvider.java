// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MergeCursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.utils.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.aviary.android.feather.cds:
//            g, h

public final class AviaryCdsProvider extends ContentProvider
{

    private static UriMatcher a;
    private static g b;
    private static final com.aviary.android.feather.common.a.a.c c;

    public AviaryCdsProvider()
    {
    }

    private void a(Context context)
    {
        context = f.e(context);
        a = new UriMatcher(-1);
        a.addURI(context, "pack/identifier/*", 6);
        a.addURI(context, "pack/id/#", 5);
        a.addURI(context, "pack/list", 7);
        a.addURI(context, "pack/id/#/update", 204);
        a.addURI(context, "pack/id/#/remove", 303);
        a.addURI(context, "pack/content/list", 43);
        a.addURI(context, "pack/id/#/content/id/#/update", 203);
        a.addURI(context, "pack/id/#/content/id/#/updatePurchasedStatus/#", 207);
        a.addURI(context, "pack/id/#/requestDownload/#", 208);
        a.addURI(context, "pack/id/#/content", 8);
        a.addURI(context, "pack/identifier/*/content", 9);
        a.addURI(context, "pack/type/*/content/available/list", 11);
        a.addURI(context, "pack/type/*/content/hidden/list", 19);
        a.addURI(context, "pack/type/*/content/availableAndPurchasable/list", 20);
        a.addURI(context, "pack/type/*/content/restore/list", 15);
        a.addURI(context, "pack/type/*/content/installed/list", 17);
        a.addURI(context, "pack/content/installed/list", 18);
        a.addURI(context, "pack/#/item/list", 10);
        a.addURI(context, "pack/content/item/#", 12);
        a.addURI(context, "pack/*/item/*", 21);
        a.addURI(context, "subscription/purchased/type/*", 65);
        a.addURI(context, "subscription/update/id/#/updatePurchasedStatus/#", 210);
        a.addURI(context, "subscription/identifier/*", 66);
        a.addURI(context, "subscription/content/identifier/*", 68);
        a.addURI(context, "subscription/content/list", 69);
        a.addURI(context, "subscription/list", 67);
        a.addURI(context, "subscription/id/#/update", 211);
        a.addURI(context, "subscription/id/#/content/id/#/update", 212);
        a.addURI(context, "bulk/insertPackContentAndItems", 401);
        a.addURI(context, "bulk/insertMessageAndContent", 402);
        a.addURI(context, "bulk/insertSubscriptionAndContent", 403);
        a.addURI(context, "packTray/#/#/#/*", 54);
        a.addURI(context, "storeFeatured/#/#", 56);
        a.addURI(context, "manifestVersion", 1);
        a.addURI(context, "manifestVersion/insert", 101);
        a.addURI(context, "permissions/list", 55);
        a.addURI(context, "permissions/replace", 104);
        a.addURI(context, "message/list", 2);
        a.addURI(context, "message/active/*", 13);
        a.addURI(context, "message/next/*", 14);
        a.addURI(context, "message/identifier/*", 3);
        a.addURI(context, "message/id/#/content", 4);
        a.addURI(context, "message/id/#/remove", 301);
        a.addURI(context, "message/id/#/update", 201);
        a.addURI(context, "message/id/#/content/id/#/update", 202);
        a.addURI(context, "message/content/id/#/markasread/#", 209);
        a.addURI(context, "packDownloadStatus/#", 47);
        a.addURI(context, "insertPacksDownloadTable", 103);
        a.addURI(context, "downloadPackId/#", 48);
        a.addURI(context, "download/id/#/updateStatus/#", 206);
        a.addURI(context, "pack/#/delete_download_entry", 302);
    }

    public ContentProviderResult[] applyBatch(ArrayList arraylist)
    {
        SQLiteDatabase sqlitedatabase;
        ContentProviderResult acontentproviderresult[];
        acontentproviderresult = new ContentProviderResult[arraylist.size()];
        sqlitedatabase = b.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        arraylist = arraylist.iterator();
        int i = 0;
_L2:
        ContentProviderOperation contentprovideroperation;
        if (!arraylist.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        contentprovideroperation = (ContentProviderOperation)arraylist.next();
        int j = i + 1;
        acontentproviderresult[i] = contentprovideroperation.apply(this, acontentproviderresult, j);
        i = j;
        if (true) goto _L2; else goto _L1
_L1:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return acontentproviderresult;
        arraylist;
        c.e("batch failed: %s", new Object[] {
            arraylist.getMessage()
        });
        sqlitedatabase.endTransaction();
        return acontentproviderresult;
        arraylist;
        sqlitedatabase.endTransaction();
        throw arraylist;
    }

    public int bulkInsert(Uri uri, ContentValues acontentvalues[])
    {
        SQLiteDatabase sqlitedatabase;
        int i;
        i = 1;
        sqlitedatabase = com.aviary.android.feather.cds.g.a(getContext()).getWritableDatabase();
        sqlitedatabase.beginTransaction();
        a.match(uri);
        JVM INSTR tableswitch 401 403: default 432
    //                   401 89
    //                   402 247
    //                   403 333;
           goto _L1 _L2 _L3 _L4
_L1:
        c.d("invalid uri");
        int j;
        j = 0;
        i = 0;
_L11:
        if (j == 0) goto _L6; else goto _L5
_L5:
        sqlitedatabase.setTransactionSuccessful();
_L6:
        sqlitedatabase.endTransaction();
        long l;
        long l1;
        if (j == 0)
        {
            i = 0;
        }
        return i;
_L2:
        if (acontentvalues.length >= 3) goto _L8; else goto _L7
_L7:
        c.d("invalid size");
        sqlitedatabase.endTransaction();
        return 0;
_L8:
        l = com.aviary.android.feather.cds.g.a("packs_table", acontentvalues[0], sqlitedatabase);
        if (l < 0L)
        {
            sqlitedatabase.endTransaction();
            return 0;
        }
        uri = acontentvalues[1];
        uri.put("content_packId", Long.valueOf(l));
        l1 = com.aviary.android.feather.cds.g.a("content_table", uri, sqlitedatabase);
        if (l1 < 0L)
        {
            sqlitedatabase.endTransaction();
            return 0;
        }
        j = 2;
        i = 0;
_L10:
        if (j >= acontentvalues.length)
        {
            break; /* Loop/switch isn't completed */
        }
        uri = acontentvalues[j];
        uri.put("item_packId", Long.valueOf(l));
        l1 = com.aviary.android.feather.cds.g.a("items_table", uri, sqlitedatabase);
        if (l1 < 0L)
        {
            sqlitedatabase.endTransaction();
            return 0;
        }
        j++;
        i++;
        if (true) goto _L10; else goto _L9
_L9:
        j = 1;
          goto _L11
_L3:
        j = acontentvalues.length;
        if (j != 2)
        {
            sqlitedatabase.endTransaction();
            return 0;
        }
        l = com.aviary.android.feather.cds.g.a("messages_table", acontentvalues[0], sqlitedatabase);
        if (l < 0L)
        {
            sqlitedatabase.endTransaction();
            return 0;
        }
        uri = acontentvalues[1];
        uri.put("msgcnt_messageId", Long.valueOf(l));
        l = com.aviary.android.feather.cds.g.a("messages_content_table", uri, sqlitedatabase);
        if (l < 0L)
        {
            sqlitedatabase.endTransaction();
            return 0;
        }
        j = 1;
          goto _L11
_L4:
        j = acontentvalues.length;
        if (j != 2)
        {
            sqlitedatabase.endTransaction();
            return 0;
        }
        l = com.aviary.android.feather.cds.g.a("subscription_table", acontentvalues[0], sqlitedatabase);
        if (l < 0L)
        {
            sqlitedatabase.endTransaction();
            return 0;
        }
        uri = acontentvalues[1];
        uri.put("subscriptions_subscription_id", Long.valueOf(l));
        l = com.aviary.android.feather.cds.g.a("subscriptions_content_table", uri, sqlitedatabase);
        if (l < 0L)
        {
            sqlitedatabase.endTransaction();
            return 0;
        }
        j = 1;
          goto _L11
        uri;
        sqlitedatabase.endTransaction();
        throw uri;
    }

    public int delete(Uri uri, String s, String as[])
    {
        a.match(uri);
        JVM INSTR lookupswitch 4: default 48
    //                   5: 164
    //                   301: 127
    //                   302: 87
    //                   303: 50;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return 0;
_L5:
        long l = Long.parseLong((String)uri.getPathSegments().get(uri.getPathSegments().size() - 2));
        return b.b(l);
_L4:
        long l1 = Long.parseLong((String)uri.getPathSegments().get(uri.getPathSegments().size() - 2));
        b.a(l1);
          goto _L1
_L3:
        long l2 = Long.parseLong((String)uri.getPathSegments().get(uri.getPathSegments().size() - 2));
        return b.c(l2);
_L2:
        long l3 = Long.parseLong(uri.getLastPathSegment());
        return b.a(l3);
    }

    public String getType(Uri uri)
    {
        return "vnd.android.cursor.item";
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        a.match(uri);
        JVM INSTR tableswitch 101 104: default 36
    //                   101 48
    //                   102 36
    //                   103 128
    //                   104 175;
           goto _L1 _L2 _L1 _L3 _L4
_L1:
        c.d("invalid uri");
_L6:
        return null;
_L2:
        long l;
        if (!contentvalues.containsKey("version_versionKey") || !contentvalues.containsKey("version_assetsBaseURL"))
        {
            c.d("missing version or asset url from values!");
            return null;
        }
        l = b.a("version_table", contentvalues);
        if (l <= -1L) goto _L6; else goto _L5
_L5:
        return h.b(getContext(), (new StringBuilder()).append("manifestVersion/").append(l).toString());
_L3:
        l = b.a("packs_download_table", contentvalues);
        if (l <= -1L) goto _L6; else goto _L7
_L7:
        return h.b(getContext(), (new StringBuilder()).append("downloadEntry/").append(l).toString());
_L4:
        long l1 = b.a(contentvalues);
        if (l1 > 0L)
        {
            return h.b(getContext(), (new StringBuilder()).append("permissions/").append(l1).toString());
        }
        if (true) goto _L1; else goto _L8
_L8:
    }

    public boolean onCreate()
    {
        c.b("onCreate");
        b = com.aviary.android.feather.cds.g.a(getContext());
        a(getContext());
        return true;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        boolean flag = true;
        switch (a.match(uri))
        {
        case 16: // '\020'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
        case 27: // '\033'
        case 28: // '\034'
        case 29: // '\035'
        case 30: // '\036'
        case 31: // '\037'
        case 32: // ' '
        case 33: // '!'
        case 34: // '"'
        case 35: // '#'
        case 36: // '$'
        case 37: // '%'
        case 38: // '&'
        case 39: // '\''
        case 40: // '('
        case 41: // ')'
        case 42: // '*'
        case 44: // ','
        case 45: // '-'
        case 46: // '.'
        case 49: // '1'
        case 50: // '2'
        case 51: // '3'
        case 52: // '4'
        case 53: // '5'
        case 57: // '9'
        case 58: // ':'
        case 59: // ';'
        case 60: // '<'
        case 61: // '='
        case 62: // '>'
        case 63: // '?'
        case 64: // '@'
        default:
            c.d((new StringBuilder()).append("Unrecognized query: ").append(uri).toString());
            return null;

        case 43: // '+'
            return b.a(as, s, as1);

        case 7: // '\007'
            return b.b(as, s, as1);

        case 9: // '\t'
            uri = (String)uri.getPathSegments().get(uri.getPathSegments().size() - 2);
            return b.c(uri, as);

        case 8: // '\b'
            int i = Integer.parseInt((String)uri.getPathSegments().get(uri.getPathSegments().size() - 2));
            return b.a(i, as);

        case 10: // '\n'
            int j = Integer.parseInt((String)uri.getPathSegments().get(uri.getPathSegments().size() - 3));
            return b.b(j, as);

        case 12: // '\f'
            int k = Integer.parseInt(uri.getLastPathSegment());
            return b.a(k, as);

        case 21: // '\025'
            s1 = (String)uri.getPathSegments().get(uri.getPathSegments().size() - 3);
            uri = uri.getLastPathSegment();
            return b.a(s1, uri, as, s, as1);

        case 1: // '\001'
            return b.a(as);

        case 6: // '\006'
            uri = uri.getLastPathSegment();
            return b.d(uri, as);

        case 5: // '\005'
            long l2 = Long.parseLong(uri.getLastPathSegment());
            return b.b(l2, as);

        case 47: // '/'
            uri = uri.getLastPathSegment();
            return b.a(uri, as);

        case 48: // '0'
            uri = uri.getLastPathSegment();
            return b.b(uri, as);

        case 11: // '\013'
            uri = (String)uri.getPathSegments().get(uri.getPathSegments().size() - 4);
            return b.a(uri, as, s, as1, s1);

        case 19: // '\023'
            uri = (String)uri.getPathSegments().get(uri.getPathSegments().size() - 4);
            return b.b(uri, as, s, as1, s1);

        case 20: // '\024'
            uri = (String)uri.getPathSegments().get(uri.getPathSegments().size() - 4);
            return new MergeCursor(new Cursor[] {
                b.a(uri, as, s, as1, s1), b.b(uri, as, s, as1, s1)
            });

        case 17: // '\021'
            uri = (String)uri.getPathSegments().get(uri.getPathSegments().size() - 4);
            return b.b(uri, as, s1);

        case 18: // '\022'
            return b.a(as, s1);

        case 15: // '\017'
            uri = (String)uri.getPathSegments().get(uri.getPathSegments().size() - 4);
            return b.a(uri, as, s1);

        case 3: // '\003'
            uri = uri.getLastPathSegment();
            return b.e(uri, as);

        case 2: // '\002'
            return b.c(as, s, as1);

        case 13: // '\r'
            return b.f(uri.getLastPathSegment(), as);

        case 14: // '\016'
            return b.g(uri.getLastPathSegment(), as);

        case 4: // '\004'
            long l3 = Long.parseLong((String)uri.getPathSegments().get(uri.getPathSegments().size() - 2));
            return b.c(l3, as);

        case 54: // '6'
            as = uri.getLastPathSegment();
            int l = Integer.parseInt((String)uri.getPathSegments().get(uri.getPathSegments().size() - 4));
            int j1 = Integer.parseInt((String)uri.getPathSegments().get(uri.getPathSegments().size() - 3));
            int l1 = Integer.parseInt((String)uri.getPathSegments().get(uri.getPathSegments().size() - 2));
            uri = b;
            boolean flag1;
            if (j1 != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (l1 != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            return uri.a(as, l, flag, flag1);

        case 56: // '8'
            int i1 = Integer.parseInt(uri.getLastPathSegment());
            int k1 = Integer.parseInt((String)uri.getPathSegments().get(uri.getPathSegments().size() - 2));
            uri = b;
            if (k1 <= 0)
            {
                flag = false;
            }
            return uri.a(flag, i1);

        case 55: // '7'
            return b.b(as);

        case 65: // 'A'
            uri = uri.getLastPathSegment();
            return b.b(uri);

        case 66: // 'B'
            uri = uri.getLastPathSegment();
            return b.a(uri);

        case 67: // 'C'
            return b.a(as, s, as1, s1);

        case 68: // 'D'
            uri = uri.getLastPathSegment();
            return b.h(uri, as);

        case 69: // 'E'
            return b.b(as, s, as1, s1);
        }
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        switch (a.match(uri))
        {
        case 205: 
        default:
            c.d("invalid uri");
            return 0;

        case 206: 
            long l1 = Long.parseLong((String)uri.getPathSegments().get(uri.getPathSegments().size() - 3));
            int i = Integer.parseInt(uri.getLastPathSegment());
            return b.a(l1, i);

        case 204: 
            long l2 = Long.parseLong((String)uri.getPathSegments().get(uri.getPathSegments().size() - 2));
            return b.a(l2, contentvalues);

        case 203: 
            long l3 = Long.parseLong((String)uri.getPathSegments().get(uri.getPathSegments().size() - 2));
            long l11 = Long.parseLong((String)uri.getPathSegments().get(uri.getPathSegments().size() - 5));
            return b.a(l11, l3, contentvalues);

        case 201: 
            long l4 = Long.parseLong((String)uri.getPathSegments().get(uri.getPathSegments().size() - 2));
            return b.b(l4, contentvalues);

        case 202: 
            long l5 = Long.parseLong((String)uri.getPathSegments().get(uri.getPathSegments().size() - 5));
            long l12 = Long.parseLong((String)uri.getPathSegments().get(uri.getPathSegments().size() - 2));
            return b.b(l5, l12, contentvalues);

        case 209: 
            long l6 = Long.parseLong((String)uri.getPathSegments().get(uri.getPathSegments().size() - 3));
            int j = Integer.parseInt(uri.getLastPathSegment());
            return b.c(l6, j);

        case 207: 
            long l7 = Long.parseLong((String)uri.getPathSegments().get(uri.getPathSegments().size() - 3));
            long l13 = Long.parseLong((String)uri.getPathSegments().get(uri.getPathSegments().size() - 6));
            int k = Integer.parseInt(uri.getLastPathSegment());
            uri = null;
            if (contentvalues != null)
            {
                uri = contentvalues.getAsString("content_contentPath");
            }
            return b.a(l13, l7, k, uri);

        case 208: 
            long l8 = Long.parseLong((String)uri.getPathSegments().get(uri.getPathSegments().size() - 3));
            int l = Integer.parseInt(uri.getLastPathSegment());
            return b.b(l8, l);

        case 210: 
            int i1 = Integer.parseInt((String)uri.getPathSegments().get(uri.getPathSegments().size() - 3));
            int j1 = Integer.parseInt(uri.getLastPathSegment());
            return b.a(i1, j1);

        case 211: 
            long l9 = Long.parseLong((String)uri.getPathSegments().get(uri.getPathSegments().size() - 2));
            return b.c(l9, contentvalues);

        case 212: 
            long l10 = Long.parseLong((String)uri.getPathSegments().get(uri.getPathSegments().size() - 2));
            long l14 = Long.parseLong((String)uri.getPathSegments().get(uri.getPathSegments().size() - 5));
            return b.c(l14, l10, contentvalues);
        }
    }

    static 
    {
        c = com.aviary.android.feather.common.a.a.a(com/aviary/android/feather/cds/AviaryCdsProvider.getSimpleName(), com.aviary.android.feather.common.a.a.d.a);
    }
}
