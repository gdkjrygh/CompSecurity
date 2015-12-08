// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public final class ihh extends mtf
{

    private final int a;
    private final String b;

    public ihh(int i, String s)
    {
        super("DeleteCollectionTask");
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "must specify a valid accountId");
        p.b(s, "must specify a non-null mediaKey");
        a = i;
        b = s;
    }

    protected final mue a(Context context)
    {
        Object obj;
        String s;
        String as[];
        int i;
        obj = new ihg(context, a, b);
        ((ihg) (obj)).d();
        if (((ihg) (obj)).l())
        {
            return new mue(((nxx) (obj)).l, ((nxx) (obj)).n, null);
        }
        obj = (est)olm.a(context, est);
        i = a;
        s = b;
        context = mvj.a(((est) (obj)).b, i);
        as = new String[1];
        as[0] = s;
        context.beginTransactionNonExclusive();
        context.delete("shared_media", "collection_id = ?", as);
        context.delete("envelope_members", "envelope_media_key = ?", as);
        context.delete("envelopes", "media_key = ?", as);
        context.setTransactionSuccessful();
        context.endTransaction();
        ((est) (obj)).a(i, s, "removeEnvelopeContents");
        context = new mue(true);
        context.a().putString("mediaKey", b);
        return context;
        Exception exception;
        exception;
        context.endTransaction();
        throw exception;
    }
}
