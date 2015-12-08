// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.pinterest.base.Device;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgModel, IgPinCanonicalImage, PinImageDetail

class IgPinGalleryItem
    implements IgModel
{

    public String a;
    public IgPinCanonicalImage b;

    IgPinGalleryItem()
    {
    }

    public final com.pinterest.api.model.Pin.GalleryItem a()
    {
        com.pinterest.api.model.Pin.GalleryItem galleryitem = new com.pinterest.api.model.Pin.GalleryItem();
        galleryitem.setImageSignature(a);
        if (b != null)
        {
            PinImageDetail pinimagedetail;
            if (Device.shouldLoadBigImages())
            {
                pinimagedetail = b.a;
            } else
            {
                pinimagedetail = b.b;
            }
            galleryitem.setLargeImage(pinimagedetail.a, Integer.valueOf(pinimagedetail.b), Integer.valueOf(pinimagedetail.c));
            if (Device.shouldLoadBigImages())
            {
                pinimagedetail = b.c;
            } else
            {
                pinimagedetail = b.d;
            }
            galleryitem.setMediumImage(pinimagedetail.a, Integer.valueOf(pinimagedetail.b), Integer.valueOf(pinimagedetail.c));
        }
        return galleryitem;
    }

    public final PinterestJsonObject b()
    {
        PinterestJsonObject pinterestjsonobject = new PinterestJsonObject();
        pinterestjsonobject.b("image_signature", a);
        if (b != null)
        {
            IgPinCanonicalImage igpincanonicalimage = b;
            PinterestJsonObject pinterestjsonobject1 = new PinterestJsonObject();
            if (igpincanonicalimage.a != null)
            {
                pinterestjsonobject1.a("736x", igpincanonicalimage.a.a());
            }
            if (igpincanonicalimage.b != null)
            {
                pinterestjsonobject1.a("550x", igpincanonicalimage.b.a());
            }
            if (igpincanonicalimage.c != null)
            {
                pinterestjsonobject1.a("236x", igpincanonicalimage.c.a());
            }
            if (igpincanonicalimage.d != null)
            {
                pinterestjsonobject1.a("200x", igpincanonicalimage.d.a());
            }
            pinterestjsonobject.a("canonical_images", pinterestjsonobject1);
        }
        return pinterestjsonobject;
    }

    public Object getModel()
    {
        return a();
    }
}
