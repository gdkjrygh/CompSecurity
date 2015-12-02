// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.orca.stickers.StickerPack;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class b
    implements f
{

    public b()
    {
    }

    public n a(StickerPack stickerpack)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("pack_id", stickerpack.a()));
        return new n("addStickerPack", "POST", "me/stickerpacks", arraylist, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((StickerPack)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((StickerPack)obj, r1);
    }

    public Void a(StickerPack stickerpack, r r1)
    {
        r1.f();
        return null;
    }
}
