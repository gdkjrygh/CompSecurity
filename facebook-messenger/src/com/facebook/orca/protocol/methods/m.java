// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import android.net.Uri;
import com.facebook.common.w.e;
import com.facebook.debug.log.b;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.orca.server.FetchStickerPacksParams;
import com.facebook.orca.server.FetchStickerPacksResult;
import com.facebook.orca.server.v;
import com.facebook.orca.stickers.Sticker;
import com.facebook.orca.stickers.StickerPack;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.et;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class m
    implements f
{

    private static final Class a = com/facebook/orca/protocol/methods/m;

    public m()
    {
    }

    private Uri a(JsonNode jsonnode)
    {
        return Uri.parse(e.b(jsonnode.get("uri")));
    }

    private Uri b(JsonNode jsonnode)
    {
        if (jsonnode != null)
        {
            if ((jsonnode = e.b(jsonnode.get("uri"))) != null)
            {
                return Uri.parse(jsonnode);
            }
        }
        return null;
    }

    public n a(FetchStickerPacksParams fetchstickerpacksparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("q", com.facebook.common.w.m.b("viewer(){sticker_store{%s{nodes{id,name,description,thumbnail_image,is_featured,is_promoted,price,preview_image,tray_button{selected.scale(2)},stickers{nodes{id,image,animated_image.media_type(image/webp)}}}}}}", new Object[] {
            fetchstickerpacksparams.a().getFieldName()
        })));
        return new n("fetchUserStickerPacks", "GET", "graphql", arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((FetchStickerPacksParams)obj);
    }

    public FetchStickerPacksResult a(FetchStickerPacksParams fetchstickerpacksparams, r r1)
    {
        int i;
        fetchstickerpacksparams = r1.c().get("viewer").get("sticker_store").get(fetchstickerpacksparams.a().getFieldName()).get("nodes");
        r1 = new et();
        i = 0;
_L9:
        if (i >= fetchstickerpacksparams.size()) goto _L2; else goto _L1
_L1:
        JsonNode jsonnode = fetchstickerpacksparams.get(i);
        Object obj;
        String s;
        String s1;
        Uri uri;
        Uri uri1;
        Uri uri2;
        et et1;
        int k;
        boolean flag;
        boolean flag1;
        obj = e.b(jsonnode.get("id"));
        s = e.b(jsonnode.get("name"));
        s1 = e.b(jsonnode.get("description"));
        uri = a(jsonnode.get("thumbnail_image"));
        uri1 = a(jsonnode.get("preview_image"));
        uri2 = a(jsonnode.get("tray_button").get("selected"));
        k = jsonnode.get("price").asInt(0);
        flag = jsonnode.get("is_featured").asBoolean(false);
        flag1 = jsonnode.get("is_promoted").asBoolean(false);
        jsonnode = jsonnode.get("stickers").get("nodes");
        et1 = new et();
        int j = 0;
_L5:
        if (j >= jsonnode.size()) goto _L4; else goto _L3
_L3:
        JsonNode jsonnode1 = jsonnode.get(j);
        et1.b(new Sticker(e.b(jsonnode1.get("id")), b(jsonnode1.get("image")), b(jsonnode1.get("animated_image"))));
_L6:
        j++;
          goto _L5
        Exception exception;
        exception;
        com.facebook.debug.log.b.e(a, "Error parsing sticker node", exception);
          goto _L6
_L7:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        try
        {
            r1.b(new StickerPack(((String) (obj)), s, s1, uri, uri1, uri2, k, flag, flag1, et1.b()));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.facebook.debug.log.b.e(a, "Error parsing sticker pack node", ((Throwable) (obj)));
        }
        if (true) goto _L7; else goto _L2
_L2:
        return new FetchStickerPacksResult(com.facebook.fbservice.c.b.FROM_SERVER, r1.b(), System.currentTimeMillis());
        if (true) goto _L9; else goto _L8
_L8:
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((FetchStickerPacksParams)obj, r1);
    }

}
