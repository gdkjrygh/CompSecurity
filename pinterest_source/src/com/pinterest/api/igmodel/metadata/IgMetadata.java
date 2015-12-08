// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata;

import com.pinterest.api.igmodel.IgModel;
import com.pinterest.api.model.PinMetadata;
import com.pinterest.network.json.PinterestJsonObject;

public abstract class IgMetadata
    implements IgModel
{

    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    public IgMetadata()
    {
    }

    public PinterestJsonObject a()
    {
        PinterestJsonObject pinterestjsonobject = new PinterestJsonObject();
        pinterestjsonobject.b("id", a);
        pinterestjsonobject.b("apple_touch_icon_link", b);
        pinterestjsonobject.b("favicon_link", c);
        pinterestjsonobject.b("locale", d);
        pinterestjsonobject.b("site_name", e);
        pinterestjsonobject.b("title", f);
        pinterestjsonobject.b("url", g);
        return pinterestjsonobject;
    }

    protected final void a(PinMetadata pinmetadata)
    {
        if (f != null)
        {
            pinmetadata.setTitle(f.replace("\\n", ""));
        }
        pinmetadata.setUrl(g);
        pinmetadata.setWebsiteName(e);
        pinmetadata.setImageSmallUrl(c);
        pinmetadata.setImageLargeUrl(b);
        pinmetadata.setLocale(d);
    }
}
