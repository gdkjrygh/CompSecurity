// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper

public class BuyableProduct
{

    private String activeMaxPrice;
    private String activeMinPrice;
    private Integer availability;
    private List cachedFilteredVariants;
    private String canonicalMerchantDomain;
    private String currency;
    private String description;
    private String displayActiveMaxPrice;
    private String displayActiveMinPrice;
    private String displayMaxPrice;
    private String displayMinPrice;
    private String displayPrice;
    private String displaySalePrice;
    private String faviconLink;
    private Boolean hasSwatches;
    private Boolean isAvailable;
    private Layout layout;
    private String link;
    private String maxPrice;
    private String merchantId;
    private String merchantItemGroupId;
    private String merchantName;
    private String minPrice;
    private String price;
    private String salePrice;
    private String shortDescription;
    private String title;
    private String uid;
    private List variants;
    private Map variations;

    public BuyableProduct()
    {
    }

    public static BuyableProduct make(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null)
        {
            pinterestjsonobject = null;
        } else
        {
            BuyableProduct buyableproduct = (BuyableProduct)pinterestjsonobject.a(com/pinterest/api/model/BuyableProduct);
            Object obj = pinterestjsonobject.c("variations");
            if (obj != null)
            {
                buyableproduct.variations = ((PinterestJsonObject) (obj)).a(new _cls1());
            }
            obj = pinterestjsonobject.e("items");
            int j = ((PinterestJsonArray) (obj)).a();
            ArrayList arraylist = new ArrayList(j);
            for (int i = 0; i < j; i++)
            {
                arraylist.add(Variant.make(((PinterestJsonArray) (obj)).c(i)));
            }

            buyableproduct.variants = arraylist;
            obj = pinterestjsonobject.c("layout");
            pinterestjsonobject = buyableproduct;
            if (obj != null)
            {
                buyableproduct.layout = Layout.make(((PinterestJsonObject) (obj)));
                return buyableproduct;
            }
        }
        return pinterestjsonobject;
    }

    public static BuyableProduct makeBuyableProductForTesting(List list, Map map)
    {
        BuyableProduct buyableproduct = new BuyableProduct();
        buyableproduct.variants = list;
        buyableproduct.variations = map;
        return buyableproduct;
    }

    public String getActiveMaxPrice()
    {
        return activeMaxPrice;
    }

    public String getActiveMinPrice()
    {
        return activeMinPrice;
    }

    public Integer getAvailability()
    {
        return availability;
    }

    public String getCanonicalMerchantDomain()
    {
        return canonicalMerchantDomain;
    }

    public String getCurrency()
    {
        return currency;
    }

    public String getDescription()
    {
        return description;
    }

    public String getDisplayActiveMaxPrice()
    {
        return displayActiveMaxPrice;
    }

    public String getDisplayActiveMinPrice()
    {
        return displayActiveMinPrice;
    }

    public String getDisplayMaxPrice()
    {
        return displayMaxPrice;
    }

    public String getDisplayMinPrice()
    {
        return displayMinPrice;
    }

    public String getDisplayPrice()
    {
        return displayPrice;
    }

    public String getDisplaySalePrice()
    {
        return displaySalePrice;
    }

    public String getFaviconLink()
    {
        return faviconLink;
    }

    public Boolean getHasSwatches()
    {
        return hasSwatches;
    }

    public Boolean getIsAvailable()
    {
        return isAvailable;
    }

    public Layout getLayout()
    {
        return layout;
    }

    public String getLink()
    {
        return link;
    }

    public String getMaxPrice()
    {
        return maxPrice;
    }

    public String getMerchantId()
    {
        return merchantId;
    }

    public String getMerchantItemGroupId()
    {
        return merchantItemGroupId;
    }

    public String getMerchantName()
    {
        return merchantName;
    }

    public String getMinPrice()
    {
        return minPrice;
    }

    public String getPrice()
    {
        return price;
    }

    public String getSalePrice()
    {
        return salePrice;
    }

    public String getShortDescription()
    {
        return shortDescription;
    }

    public String getTitle()
    {
        return title;
    }

    public String getUid()
    {
        return uid;
    }

    public List getVariants()
    {
        if (variants != null && variants.size() == 1 && (variations == null || variations.isEmpty()))
        {
            return variants;
        }
        if (cachedFilteredVariants != null && !cachedFilteredVariants.isEmpty() || variants == null || variants.isEmpty() || variations == null || variations.isEmpty()) goto _L2; else goto _L1
_L1:
        Set set;
        Iterator iterator;
        cachedFilteredVariants = new ArrayList(variants.size());
        set = variations.keySet();
        iterator = variants.iterator();
_L3:
        Variant variant;
        boolean flag;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        variant = (Variant)iterator.next();
        Iterator iterator1 = set.iterator();
        String s;
        do
        {
            if (!iterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_234;
            }
            s = (String)iterator1.next();
        } while (ModelHelper.isValid(variant.getVariant().get(s)));
        flag = false;
_L4:
        if (flag)
        {
            cachedFilteredVariants.add(variant);
        }
        if (true) goto _L3; else goto _L2
_L2:
        return cachedFilteredVariants;
        flag = true;
          goto _L4
    }

    public Map getVariations()
    {
        return variations;
    }

    public void setActiveMaxPrice(String s)
    {
        activeMaxPrice = s;
    }

    public void setActiveMinPrice(String s)
    {
        activeMinPrice = s;
    }

    public void setAvailability(Integer integer)
    {
        availability = integer;
    }

    public void setCanonicalMerchantDomain(String s)
    {
        canonicalMerchantDomain = s;
    }

    public void setCurrency(String s)
    {
        currency = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setDisplayActiveMaxPrice(String s)
    {
        displayActiveMaxPrice = s;
    }

    public void setDisplayActiveMinPrice(String s)
    {
        displayActiveMinPrice = s;
    }

    public void setDisplayMaxPrice(String s)
    {
        displayMaxPrice = s;
    }

    public void setDisplayMinPrice(String s)
    {
        displayMinPrice = s;
    }

    public void setDisplayPrice(String s)
    {
        displayPrice = s;
    }

    public void setDisplaySalePrice(String s)
    {
        displaySalePrice = s;
    }

    public void setFaviconLink(String s)
    {
        faviconLink = s;
    }

    public void setHasSwatches(Boolean boolean1)
    {
        hasSwatches = boolean1;
    }

    public void setIsAvailable(Boolean boolean1)
    {
        isAvailable = boolean1;
    }

    public void setLayout(Layout layout1)
    {
        layout = layout1;
    }

    public void setLink(String s)
    {
        link = s;
    }

    public void setMaxPrice(String s)
    {
        maxPrice = s;
    }

    public void setMerchantId(String s)
    {
        merchantId = s;
    }

    public void setMerchantItemGroupId(String s)
    {
        merchantItemGroupId = s;
    }

    public void setMerchantName(String s)
    {
        merchantName = s;
    }

    public void setMinPrice(String s)
    {
        minPrice = s;
    }

    public void setPrice(String s)
    {
        price = s;
    }

    public void setSalePrice(String s)
    {
        salePrice = s;
    }

    public void setShortDescription(String s)
    {
        shortDescription = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setUid(String s)
    {
        uid = s;
    }

    public void setVariants(List list)
    {
        variants = list;
    }

    public void setVariations(Map map)
    {
        variations = map;
    }

    private class _cls1
        implements Function
    {

        public final volatile Object apply(Object obj)
        {
            return apply((JsonElement)obj);
        }

        public final List apply(JsonElement jsonelement)
        {
            ArrayList arraylist = new ArrayList();
            for (jsonelement = jsonelement.getAsJsonArray().iterator(); jsonelement.hasNext(); arraylist.add(((JsonElement)jsonelement.next()).getAsString())) { }
            return arraylist;
        }

        _cls1()
        {
        }
    }


    private class Variant
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
        private Pin.GalleryItem swatchImage;
        private Map variant;

        private static Variant make(PinterestJsonObject pinterestjsonobject)
        {
            if (pinterestjsonobject == null)
            {
                pinterestjsonobject = null;
            } else
            {
                Variant variant1 = (Variant)pinterestjsonobject.a(com/pinterest/api/model/BuyableProduct$Variant);
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
                    variant1.variant = ((PinterestJsonObject) (obj)).a(new _cls1());
                }
                obj = pinterestjsonobject.e("images");
                int j = ((PinterestJsonArray) (obj)).a();
                ArrayList arraylist = new ArrayList(j);
                for (int i = 0; i < j; i++)
                {
                    PinterestJsonObject pinterestjsonobject1 = ((PinterestJsonArray) (obj)).c(i);
                    if (pinterestjsonobject1.c("canonical_images") != null)
                    {
                        arraylist.add(Pin.GalleryItem.make(pinterestjsonobject1));
                    }
                }

                variant1.images = arraylist;
                obj = pinterestjsonobject.c("swatch_image");
                pinterestjsonobject = variant1;
                if (obj != null)
                {
                    pinterestjsonobject = variant1;
                    if (((PinterestJsonObject) (obj)).c("canonical_images") != null)
                    {
                        variant1.swatchImage = Pin.GalleryItem.make(((PinterestJsonObject) (obj)));
                        return variant1;
                    }
                }
            }
            return pinterestjsonobject;
        }

        public static Variant makeVariantForTesting(Map map, boolean flag, float f)
        {
            Variant variant1 = new Variant();
            variant1.variant = map;
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
            variant1.availability = Integer.valueOf(i);
            variant1.activePrice = String.valueOf(f);
            variant1.displayActivePrice = (new StringBuilder("$")).append(variant1.activePrice).toString();
            return variant1;
        }

        public boolean equals(Object obj)
        {
            if (this != obj) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof Variant))
            {
                return false;
            }
            obj = (Variant)obj;
            if (activePrice == null ? ((Variant) (obj)).activePrice != null : !activePrice.equals(((Variant) (obj)).activePrice))
            {
                return false;
            }
            if (displayPrice == null ? ((Variant) (obj)).displayPrice != null : !displayPrice.equals(((Variant) (obj)).displayPrice))
            {
                return false;
            }
            if (maxQuantity == null ? ((Variant) (obj)).maxQuantity != null : !maxQuantity.equals(((Variant) (obj)).maxQuantity))
            {
                return false;
            }
            if (price == null ? ((Variant) (obj)).price != null : !price.equals(((Variant) (obj)).price))
            {
                return false;
            }
            if (currency == null ? ((Variant) (obj)).currency != null : !currency.equals(((Variant) (obj)).currency))
            {
                return false;
            }
            if (itemId == null ? ((Variant) (obj)).itemId != null : !itemId.equals(((Variant) (obj)).itemId))
            {
                return false;
            }
            if (salePrice == null ? ((Variant) (obj)).salePrice != null : !salePrice.equals(((Variant) (obj)).salePrice))
            {
                return false;
            }
            if (displayActivePrice == null ? ((Variant) (obj)).displayActivePrice != null : !displayActivePrice.equals(((Variant) (obj)).displayActivePrice))
            {
                return false;
            }
            if (displaySalePrice == null ? ((Variant) (obj)).displaySalePrice != null : !displaySalePrice.equals(((Variant) (obj)).displaySalePrice))
            {
                return false;
            }
            if (availability == null ? ((Variant) (obj)).availability != null : !availability.equals(((Variant) (obj)).availability))
            {
                return false;
            }
            if (variant == null ? ((Variant) (obj)).variant != null : !variant.equals(((Variant) (obj)).variant))
            {
                return false;
            }
            if (images == null ? ((Variant) (obj)).images != null : !images.equals(((Variant) (obj)).images))
            {
                return false;
            }
            if (swatchImage == null) goto _L4; else goto _L3
_L3:
            if (swatchImage.equals(((Variant) (obj)).swatchImage)) goto _L1; else goto _L5
_L5:
            return false;
_L4:
            if (((Variant) (obj)).swatchImage == null)
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

        public Pin.GalleryItem getSwatchImage()
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
                i3 = swatchImage.hashCode();
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

        public void setSwatchImage(Pin.GalleryItem galleryitem)
        {
            swatchImage = galleryitem;
        }

        public void setVariant(Map map)
        {
            variant = map;
        }


        public Variant()
        {
        }
    }


    private class Layout
    {

        private Boolean layoutColors;
        private Boolean layoutMaterial;
        private Boolean layoutPattern;
        private Boolean layoutSize;

        private static Layout make(PinterestJsonObject pinterestjsonobject)
        {
            if (pinterestjsonobject == null)
            {
                return null;
            } else
            {
                return (Layout)pinterestjsonobject.a(com/pinterest/api/model/BuyableProduct$Layout);
            }
        }

        public String getAttributeName()
        {
            if (layoutColors != null && layoutColors.booleanValue())
            {
                return "colors";
            }
            if (layoutSize != null && layoutSize.booleanValue())
            {
                return "size";
            }
            if (layoutPattern != null && layoutPattern.booleanValue())
            {
                return "pattern";
            }
            if (layoutMaterial != null && layoutMaterial.booleanValue())
            {
                return "material";
            } else
            {
                return null;
            }
        }

        public Boolean isLayoutColors()
        {
            return layoutColors;
        }

        public Boolean isLayoutMaterial()
        {
            return layoutMaterial;
        }

        public Boolean isLayoutPattern()
        {
            return layoutPattern;
        }

        public Boolean isLayoutSize()
        {
            return layoutSize;
        }

        public Boolean isValidLayout()
        {
            boolean flag;
            if (layoutColors != null || layoutMaterial != null || layoutPattern != null || layoutSize != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public void setLayoutColors(Boolean boolean1)
        {
            layoutColors = boolean1;
        }

        public void setLayoutMaterial(Boolean boolean1)
        {
            layoutMaterial = boolean1;
        }

        public void setLayoutPattern(Boolean boolean1)
        {
            layoutPattern = boolean1;
        }

        public void setLayoutSize(Boolean boolean1)
        {
            layoutSize = boolean1;
        }


        public Layout()
        {
        }
    }

}
