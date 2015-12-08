// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Availability
{

    private String activePrice;
    private Integer availability;
    private String currency;
    private String displayActivePrice;
    private String displayPrice;
    private String displaySalePrice;
    private List images;
    private String itemId;
    private Integer maxQuantity;
    private String price;
    private String salePrice;
    private variant swatchImage;
    private Map variant;

    private static Availability make(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null)
        {
            pinterestjsonobject = null;
        } else
        {
            _cls1 _lcls1 = (_cls1)pinterestjsonobject.a(com/pinterest/api/model/BuyableProduct$Variant);
            Object obj = pinterestjsonobject.c("variant");
            class _cls1
                implements Function
            {

                public final volatile Object apply(Object obj1)
                {
                    return apply((JsonElement)obj1);
                }

                public final String apply(JsonElement jsonelement)
                {
                    if (jsonelement == null || jsonelement.isJsonNull())
                    {
                        return null;
                    } else
                    {
                        return jsonelement.getAsString();
                    }
                }

            _cls1()
            {
            }
            }

            if (obj != null)
            {
                _lcls1.variant = ((PinterestJsonObject) (obj)).a(new _cls1());
            }
            obj = pinterestjsonobject.e("images");
            int j = ((PinterestJsonArray) (obj)).a();
            ArrayList arraylist = new ArrayList(j);
            for (int i = 0; i < j; i++)
            {
                PinterestJsonObject pinterestjsonobject1 = ((PinterestJsonArray) (obj)).c(i);
                if (pinterestjsonobject1.c("canonical_images") != null)
                {
                    arraylist.add(c(pinterestjsonobject1));
                }
            }

            _lcls1.images = arraylist;
            obj = pinterestjsonobject.c("swatch_image");
            pinterestjsonobject = _lcls1;
            if (obj != null)
            {
                pinterestjsonobject = _lcls1;
                if (((PinterestJsonObject) (obj)).c("canonical_images") != null)
                {
                    _lcls1.swatchImage = swatchImage(((PinterestJsonObject) (obj)));
                    return _lcls1;
                }
            }
        }
        return pinterestjsonobject;
    }

    public static swatchImage makeVariantForTesting(Map map, boolean flag, float f)
    {
        Availability availability1 = new <init>();
        availability1.variant = map;
        class Availability extends Enum
        {

            private static final Availability $VALUES[];
            public static final Availability IN_STOCK;
            public static final Availability OUT_OF_STOCK;
            public static final Availability PREORDER;
            public static final Availability UNAVAILABLE;
            public static final Availability UNKNOWN;

            public static Availability valueOf(String s)
            {
                return (Availability)Enum.valueOf(com/pinterest/api/model/BuyableProduct$Variant$Availability, s);
            }

            public static Availability[] values()
            {
                return (Availability[])$VALUES.clone();
            }

            static 
            {
                UNKNOWN = new Availability("UNKNOWN", 0);
                IN_STOCK = new Availability("IN_STOCK", 1);
                OUT_OF_STOCK = new Availability("OUT_OF_STOCK", 2);
                PREORDER = new Availability("PREORDER", 3);
                UNAVAILABLE = new Availability("UNAVAILABLE", 4);
                $VALUES = (new Availability[] {
                    UNKNOWN, IN_STOCK, OUT_OF_STOCK, PREORDER, UNAVAILABLE
                });
            }

            private Availability(String s, int i)
            {
                super(s, i);
            }
        }

        int i;
        if (flag)
        {
            i = Availability.IN_STOCK.ordinal();
        } else
        {
            i = Availability.OUT_OF_STOCK.ordinal();
        }
        availability1.availability = Integer.valueOf(i);
        availability1.activePrice = String.valueOf(f);
        availability1.displayActivePrice = (new StringBuilder("$")).append(availability1.activePrice).toString();
        return availability1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof activePrice))
        {
            return false;
        }
        obj = (activePrice)obj;
        if (activePrice == null ? ((activePrice) (obj)).activePrice != null : !activePrice.equals(((activePrice) (obj)).activePrice))
        {
            return false;
        }
        if (displayPrice == null ? ((displayPrice) (obj)).displayPrice != null : !displayPrice.equals(((displayPrice) (obj)).displayPrice))
        {
            return false;
        }
        if (maxQuantity == null ? ((maxQuantity) (obj)).maxQuantity != null : !maxQuantity.equals(((maxQuantity) (obj)).maxQuantity))
        {
            return false;
        }
        if (price == null ? ((price) (obj)).price != null : !price.equals(((price) (obj)).price))
        {
            return false;
        }
        if (currency == null ? ((currency) (obj)).currency != null : !currency.equals(((currency) (obj)).currency))
        {
            return false;
        }
        if (itemId == null ? ((itemId) (obj)).itemId != null : !itemId.equals(((itemId) (obj)).itemId))
        {
            return false;
        }
        if (salePrice == null ? ((salePrice) (obj)).salePrice != null : !salePrice.equals(((salePrice) (obj)).salePrice))
        {
            return false;
        }
        if (displayActivePrice == null ? ((displayActivePrice) (obj)).displayActivePrice != null : !displayActivePrice.equals(((displayActivePrice) (obj)).displayActivePrice))
        {
            return false;
        }
        if (displaySalePrice == null ? ((displaySalePrice) (obj)).displaySalePrice != null : !displaySalePrice.equals(((displaySalePrice) (obj)).displaySalePrice))
        {
            return false;
        }
        if (availability == null ? ((availability) (obj)).availability != null : !availability.equals(((availability) (obj)).availability))
        {
            return false;
        }
        if (variant == null ? ((variant) (obj)).variant != null : !variant.equals(((variant) (obj)).variant))
        {
            return false;
        }
        if (images == null ? ((images) (obj)).images != null : !images.equals(((images) (obj)).images))
        {
            return false;
        }
        if (swatchImage == null) goto _L4; else goto _L3
_L3:
        if (swatchImage.swatchImage(((swatchImage) (obj)).swatchImage)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((swatchImage) (obj)).swatchImage == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public String getActivePrice()
    {
        return activePrice;
    }

    public Availability getAvailability()
    {
        return Availability.values()[availability.intValue()];
    }

    public String getCurrency()
    {
        return currency;
    }

    public String getDisplayActivePrice()
    {
        return displayActivePrice;
    }

    public String getDisplayPrice()
    {
        return displayPrice;
    }

    public String getDisplaySalePrice()
    {
        return displaySalePrice;
    }

    public List getImages()
    {
        return images;
    }

    public String getItemId()
    {
        return itemId;
    }

    public Integer getMaxQuantity()
    {
        return maxQuantity;
    }

    public String getPrice()
    {
        return price;
    }

    public String getSalePrice()
    {
        return salePrice;
    }

    public salePrice getSwatchImage()
    {
        return swatchImage;
    }

    public Map getVariant()
    {
        return variant;
    }

    public int hashCode()
    {
        int i3 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        if (activePrice != null)
        {
            i = activePrice.hashCode();
        } else
        {
            i = 0;
        }
        if (displayPrice != null)
        {
            j = displayPrice.hashCode();
        } else
        {
            j = 0;
        }
        if (maxQuantity != null)
        {
            k = maxQuantity.hashCode();
        } else
        {
            k = 0;
        }
        if (price != null)
        {
            l = price.hashCode();
        } else
        {
            l = 0;
        }
        if (currency != null)
        {
            i1 = currency.hashCode();
        } else
        {
            i1 = 0;
        }
        if (itemId != null)
        {
            j1 = itemId.hashCode();
        } else
        {
            j1 = 0;
        }
        if (salePrice != null)
        {
            k1 = salePrice.hashCode();
        } else
        {
            k1 = 0;
        }
        if (displayActivePrice != null)
        {
            l1 = displayActivePrice.hashCode();
        } else
        {
            l1 = 0;
        }
        if (displaySalePrice != null)
        {
            i2 = displaySalePrice.hashCode();
        } else
        {
            i2 = 0;
        }
        if (availability != null)
        {
            j2 = availability.hashCode();
        } else
        {
            j2 = 0;
        }
        if (variant != null)
        {
            k2 = variant.hashCode();
        } else
        {
            k2 = 0;
        }
        if (images != null)
        {
            l2 = images.hashCode();
        } else
        {
            l2 = 0;
        }
        if (swatchImage != null)
        {
            i3 = swatchImage.e();
        }
        return (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i3;
    }

    public void setActivePrice(String s)
    {
        activePrice = s;
    }

    public void setAvailability(Integer integer)
    {
        availability = integer;
    }

    public void setCurrency(String s)
    {
        currency = s;
    }

    public void setDisplayActivePrice(String s)
    {
        displayActivePrice = s;
    }

    public void setDisplayPrice(String s)
    {
        displayPrice = s;
    }

    public void setDisplaySalePrice(String s)
    {
        displaySalePrice = s;
    }

    public void setImages(List list)
    {
        images = list;
    }

    public void setItemId(String s)
    {
        itemId = s;
    }

    public void setMaxQuantity(Integer integer)
    {
        maxQuantity = integer;
    }

    public void setPrice(String s)
    {
        price = s;
    }

    public void setSalePrice(String s)
    {
        salePrice = s;
    }

    public void setSwatchImage(salePrice saleprice)
    {
        swatchImage = saleprice;
    }

    public void setVariant(Map map)
    {
        variant = map;
    }


    public Availability()
    {
    }
}
