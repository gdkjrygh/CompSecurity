// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.facebook.fbservice.c.b;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.s;
import com.facebook.http.protocol.i;
import com.facebook.orca.protocol.methods.m;
import com.facebook.orca.server.FetchStickerPacksParams;
import com.facebook.orca.server.FetchStickerPacksResult;
import com.facebook.orca.server.aq;
import com.facebook.orca.server.v;
import com.google.common.a.es;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.orca.stickers:
//            ak, e, c, StickerPack, 
//            Sticker

public class w
    implements e
{

    private static final Class a = com/facebook/orca/stickers/w;
    private final i b;
    private final m c;
    private final com.facebook.orca.protocol.methods.b d;
    private final c e;
    private final com.facebook.orca.stickers.e f;
    private final ak g;

    public w(i j, m m, com.facebook.orca.protocol.methods.b b1, c c1, com.facebook.orca.stickers.e e1, ak ak1)
    {
        b = j;
        c = m;
        d = b1;
        e = c1;
        f = e1;
        g = ak1;
    }

    private OperationResult b(ad ad1)
    {
        com.facebook.debug.d.e e1;
        v v1;
        FetchStickerPacksParams fetchstickerpacksparams;
        s s1;
        boolean flag;
        boolean flag1;
        boolean flag3;
        flag1 = true;
        flag = true;
        fetchstickerpacksparams = (FetchStickerPacksParams)ad1.b().getParcelable("fetchStickerPacksParams");
        v1 = fetchstickerpacksparams.a();
        flag3 = fetchstickerpacksparams.b();
        s1 = fetchstickerpacksparams.c();
        e1 = com.facebook.debug.d.e.a("StickerServiceHandler handleFetchStickerPacks");
        if (s1 != s.CHECK_SERVER_FOR_NEW_DATA) goto _L2; else goto _L1
_L1:
        ad1 = (FetchStickerPacksResult)b.a(c, fetchstickerpacksparams);
        Object obj;
        obj = null;
        boolean flag2 = true;
        flag1 = flag;
        flag = flag2;
_L13:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        Object obj1;
        obj1 = g.e();
        ((SQLiteDatabase) (obj1)).beginTransaction();
        f.a(v1, ad1);
        ((SQLiteDatabase) (obj1)).setTransactionSuccessful();
        ((SQLiteDatabase) (obj1)).endTransaction();
        if (!flag) goto _L4; else goto _L3
_L3:
        ad1 = e.a(v1, ad1);
          goto _L4
_L11:
        ad1 = OperationResult.a(new FetchStickerPacksResult(ad1.e(), ad1.a(), ((List) (obj)), ad1.f()));
        e1.a();
        return ad1;
_L2:
        obj1 = e.a(v1);
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_367;
        }
        obj = e.a();
_L9:
        if (((FetchStickerPacksResult) (obj1)).e() != b.NO_DATA) goto _L6; else goto _L5
_L5:
        obj1 = f.a(v1);
        if (((FetchStickerPacksResult) (obj1)).e() != b.NO_DATA)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ad1 = ((ad) (obj));
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_251;
        }
        ad1 = ((ad) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_251;
        }
        ad1 = f.a();
        if ((s1 != s.PREFER_CACHE_IF_UP_TO_DATE || ((FetchStickerPacksResult) (obj1)).e() != b.FROM_CACHE_STALE) && (s1 == s.DO_NOT_CHECK_SERVER || ((FetchStickerPacksResult) (obj1)).e() != b.NO_DATA))
        {
            break MISSING_BLOCK_LABEL_351;
        }
        obj1 = (FetchStickerPacksResult)b.a(c, fetchstickerpacksparams);
        if (((FetchStickerPacksResult) (obj1)).e() != b.NO_DATA)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((FetchStickerPacksResult) (obj1)).e() == b.NO_DATA)
        {
            flag1 = false;
        }
        break; /* Loop/switch isn't completed */
        ad1;
        ((SQLiteDatabase) (obj1)).endTransaction();
        throw ad1;
        ad1;
        e1.a();
        throw ad1;
        flag1 = false;
        obj = ad1;
        ad1 = ((ad) (obj1));
        continue; /* Loop/switch isn't completed */
_L6:
        flag = false;
        if (true) goto _L8; else goto _L7
_L8:
        break MISSING_BLOCK_LABEL_230;
_L7:
        break; /* Loop/switch isn't completed */
        obj = null;
          goto _L9
_L4:
        if (!flag3);
        if (true) goto _L11; else goto _L10
_L10:
        obj = ad1;
        ad1 = ((ad) (obj1));
        if (true) goto _L13; else goto _L12
_L12:
    }

    private OperationResult c(ad ad1)
    {
        Object obj;
        ad1 = (StickerPack)ad1.b().getParcelable("stickerPack");
        b.a(d, ad1);
        obj = new FetchStickerPacksParams(v.USER_PACKS, s.DO_NOT_CHECK_SERVER);
        Object obj1 = new Bundle();
        ((Bundle) (obj1)).putParcelable("fetchStickerPacksParams", ((android.os.Parcelable) (obj)));
        obj = (FetchStickerPacksResult)b(new ad(aq.I, ((Bundle) (obj1)))).h();
        if (((FetchStickerPacksResult) (obj)).e() == b.NO_DATA)
        {
            com.facebook.debug.log.b.e(a, "Couldn't find any cached data to update!");
            f.b();
            e.b();
            return OperationResult.b();
        }
        obj1 = new HashSet();
        ((Set) (obj1)).addAll(((FetchStickerPacksResult) (obj)).a());
        ((Set) (obj1)).add(ad1);
        obj = new FetchStickerPacksResult(b.FROM_CACHE_UP_TO_DATE, es.a(((java.util.Collection) (obj1))), ((FetchStickerPacksResult) (obj)).f());
        ad1 = g.e();
        ad1.beginTransaction();
        f.a(v.USER_PACKS, ((FetchStickerPacksResult) (obj)));
        ad1.setTransactionSuccessful();
        ad1.endTransaction();
        e.a(v.USER_PACKS, ((FetchStickerPacksResult) (obj)));
        return OperationResult.b();
        Exception exception;
        exception;
        ad1.endTransaction();
        throw exception;
    }

    private OperationResult d(ad ad1)
    {
        Sticker sticker = (Sticker)ad1.b().getParcelable("sticker");
        Object obj = e.a();
        ad1 = ((ad) (obj));
        if (obj == null)
        {
            ad1 = f.a();
        }
        obj = ad1;
        if (ad1 == null)
        {
            obj = new LinkedList();
        }
        if (((List) (obj)).contains(sticker))
        {
            ((List) (obj)).remove(sticker);
        }
        ((List) (obj)).add(0, sticker);
        for (; ((List) (obj)).size() > 16; ((List) (obj)).remove(((List) (obj)).size() - 1)) { }
        f.a(((List) (obj)));
        e.a(((List) (obj)));
        return OperationResult.b();
    }

    public OperationResult a(ad ad1)
    {
        OperationType operationtype = ad1.a();
        if (aq.I.equals(operationtype))
        {
            return b(ad1);
        }
        if (aq.J.equals(operationtype))
        {
            return c(ad1);
        }
        if (aq.K.equals(operationtype))
        {
            return d(ad1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown operation type: ").append(operationtype).toString());
        }
    }

}
