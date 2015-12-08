// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public final class djk
    implements dnf
{

    private static final Set a = Collections.singleton("collection_media_key");
    private final Context b;
    private final noz c;

    djk(Context context)
    {
        b = context;
        c = noz.a(context, "AlbumEnrichments", new String[0]);
    }

    private ekf a(int i, Cursor cursor)
    {
        Object obj;
        cursor = cursor.getString(cursor.getColumnIndexOrThrow("collection_media_key"));
        obj = new mvu(mvj.b(b, i));
        obj.a = "album_enrichments";
        obj.c = "collection_media_key = ?";
        obj.d = (new String[] {
            cursor
        });
        obj.f = "position";
        obj = ((mvu) (obj)).a();
        ArrayList arraylist = new ArrayList();
_L9:
        boolean flag = ((Cursor) (obj)).moveToNext();
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("enrichment_media_key"));
        double d = ((Cursor) (obj)).getDouble(((Cursor) (obj)).getColumnIndexOrThrow("position"));
        long l = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndexOrThrow("_id"));
        cursor = ((Cursor) (obj)).getBlob(((Cursor) (obj)).getColumnIndexOrThrow("protobuf"));
        obj1 = new hio(((String) (obj1)), d, l);
        cursor = (qkg)qlw.a(new qkg(), cursor);
        ((qkg) (cursor)).a;
        JVM INSTR tableswitch 1 3: default 711
    //                   1 258
    //                   2 331
    //                   3 439;
           goto _L3 _L4 _L5 _L6
_L3:
        i = ((qkg) (cursor)).a;
        throw new qlv((new StringBuilder(45)).append("Couldn't parse an enrichment type ").append(i).toString());
_L4:
        cursor = ((qkg) (cursor)).b;
        if (cursor != null) goto _L8; else goto _L7
_L7:
        Object obj3;
        try
        {
            throw new qlv("The narrative enrichment info is not present in the proto");
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor) { }
        finally
        {
            ((Cursor) (obj)).close();
        }
          goto _L9
        throw cursor;
_L8:
        if (TextUtils.isEmpty(((qku) (cursor)).a))
        {
            throw new qlv("The narrative enrichment doesn't have any text information");
        }
        cursor = new hiu(((hio) (obj1)), ((qku) (cursor)).a);
_L14:
        arraylist.add(cursor);
          goto _L9
_L5:
        cursor = ((qkg) (cursor)).c;
        if (cursor != null) goto _L11; else goto _L10
_L10:
        throw new qlv("The location enrichment info is not present in the proto");
_L11:
        if (((qko) (cursor)).a == null || ((qko) (cursor)).a.length == 0)
        {
            throw new qlv("The location enrichment proto doesn't have any place information");
        }
        cursor = ((qko) (cursor)).a[0];
        if (TextUtils.isEmpty(((qke) (cursor)).a)) goto _L13; else goto _L12
_L12:
        cursor = ((qke) (cursor)).a;
_L17:
        cursor = new hiq(((hio) (obj1)), cursor);
          goto _L14
_L13:
        if (TextUtils.isEmpty(((qke) (cursor)).b)) goto _L16; else goto _L15
_L15:
        cursor = ((qke) (cursor)).b;
          goto _L17
_L16:
        throw new qlv("The location enrichment place has neither name nor description");
_L6:
        obj3 = ((qkg) (cursor)).d;
        if (obj3 != null) goto _L19; else goto _L18
_L18:
        throw new qlv("The map enrichment info is not present in the proto");
_L19:
        if (b.a(((qkq) (obj3)).a))
        {
            throw new qlv("The map enrichment has no origins");
        }
        Object obj2 = ((qkq) (obj3)).a[0];
        cursor = ((qke) (obj2)).a;
        String s = ((qke) (obj2)).b;
        if (TextUtils.isEmpty(cursor))
        {
            throw new qlv("Missing origin.name");
        }
        if (((qke) (obj2)).c == null)
        {
            throw new qlv("Missing origin.point");
        }
        obj2 = ems.a(((qke) (obj2)).c.a.intValue(), ((qke) (obj2)).c.b.intValue());
        if (b.a(((qkq) (obj3)).b))
        {
            throw new qlv("The map enrichment has no destinations");
        }
        obj3 = ((qkq) (obj3)).b[0];
        String s1 = ((qke) (obj3)).a;
        String s2 = ((qke) (obj3)).b;
        if (TextUtils.isEmpty(s1))
        {
            throw new qlv("Missing destination.name");
        }
        if (((qke) (obj3)).c == null)
        {
            throw new qlv("Missing destination.point");
        }
        cursor = new his(((hio) (obj1)), ((ems) (obj2)), cursor, s, ems.a(((qke) (obj3)).c.a.intValue(), ((qke) (obj3)).c.b.intValue()), s1, s2);
          goto _L14
_L2:
        cursor = new him(arraylist);
        ((Cursor) (obj)).close();
        return cursor;
    }

    public final volatile ekf a(int i, Object obj)
    {
        return a(i, (Cursor)obj);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return him;
    }

}
