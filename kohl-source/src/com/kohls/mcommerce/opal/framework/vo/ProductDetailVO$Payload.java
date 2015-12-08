// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.vo;

import com.kohls.mcommerce.opal.framework.view.fragment.productdetails.iface.QuantityViewState;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.vo:
//            ProductDetailVO

public static class Product.altImages
{
    public static class Product
        implements QuantityViewState
    {

        private List SKUS;
        private List altImages;
        private String avgRating;
        private String brand;
        private List collection;
        private Description description;
        private Documents documents;
        private ProductDetailVO.Error error;
        private Exclusions exclusions;
        private List images;
        private boolean isBopusEligible;
        private int mSelectedQty;
        private Price price;
        private List productOffers;
        private String productStatus;
        private String productTitle;
        private String productURL;
        private int ratingCount;
        private Rebate rebate;
        private StyleGuide styleGuide;
        private List surcharges;
        private List swatchImages;
        private List valueAddedIcons;
        private List videos;
        private String webID;

        private void setOfferSKUS(List list)
        {
            ArrayList arraylist = new ArrayList();
            for (int i = 0; i < list.size(); i++)
            {
                setProductSkus(arraylist, list, i);
            }

            setSKUS(arraylist);
        }

        private void setOfferSkuImage(SKU sku, List list)
        {
            for (int i = 0; i < list.size(); i++)
            {
                ArrayList arraylist = new ArrayList();
        /* block-local class not found */
        class Image {}

                Image image = new Image();
                image.setHeight(((OffersVO.Payload.Product.ProductOffer.OfferProduct.Image)list.get(i)).getHeight());
                image.setWidth(((OffersVO.Payload.Product.ProductOffer.OfferProduct.Image)list.get(i)).getWidth());
                image.setURL(((OffersVO.Payload.Product.ProductOffer.OfferProduct.Image)list.get(i)).getURL());
                arraylist.add(image);
        /* block-local class not found */
        class SKU {}

                sku.setImage(arraylist);
            }

        }

        private void setOfferSkuPrice(SKU sku, OffersVO.Payload.Product.ProductOffer.OfferProduct.Sku.Price_ price_)
        {
        /* block-local class not found */
        class SKU.Price {}

            SKU.Price price1 = new SKU.Price();
            if (price_.getClearancePrice() != null)
            {
                price1.setClearancePrice(price_.getClearancePrice());
            }
            if (price_.getRegularPrice() != null)
            {
                price1.setRegularPrice(price_.getRegularPrice());
            }
            if (price_.getRegularPriceType() != null)
            {
                price1.setRegularPriceType(price_.getRegularPriceType());
            }
            if (price_.getSalePrice() != null)
            {
                price1.setSalePrice(price_.getSalePrice());
            }
            sku.setPrice(price1);
        }

        private void setProductDescription(OffersVO.Payload.Product.ProductOffer.OfferProduct.Description description1)
        {
        /* block-local class not found */
        class Description {}

            Description description2 = new Description();
            if (description1.getAvgRating() != null)
            {
                description2.setAvgRating(description1.getAvgRating());
            }
            if (description1.getLongDescription() != null)
            {
                description2.setLongDescription(description1.getLongDescription());
            }
            if (description1.getShortDescription() != null)
            {
                description2.setShortDescription(description1.getShortDescription());
            }
            setDescription(description2);
        }

        private void setProductImages(List list)
        {
            for (int i = 0; i < list.size(); i++)
            {
                ArrayList arraylist = new ArrayList();
                Image image = new Image();
                if (((OffersVO.Payload.Product.ProductOffer.OfferProduct.Image)list.get(i)).getHeight() != null)
                {
                    image.setHeight(((OffersVO.Payload.Product.ProductOffer.OfferProduct.Image)list.get(i)).getHeight());
                }
                if (((OffersVO.Payload.Product.ProductOffer.OfferProduct.Image)list.get(i)).getWidth() != null)
                {
                    image.setWidth(((OffersVO.Payload.Product.ProductOffer.OfferProduct.Image)list.get(i)).getWidth());
                }
                if (((OffersVO.Payload.Product.ProductOffer.OfferProduct.Image)list.get(i)).getURL() != null)
                {
                    image.setURL(((OffersVO.Payload.Product.ProductOffer.OfferProduct.Image)list.get(i)).getURL());
                }
                arraylist.add(image);
                setImages(arraylist);
            }

        }

        private void setProductPrice(OffersVO.Payload.Product.ProductOffer.OfferProduct.Price price1)
        {
        /* block-local class not found */
        class Price {}

            Price price2 = new Price();
            price2.setClearancePrice(price1.getClearancePrice());
            price2.setRegularPrice(price1.getRegularPrice());
            price2.setRegularPriceType(price1.getRegularPriceType());
            price2.setSalePrice(price1.getSalePrice());
            setPrice(price2);
        }

        private void setProductSkus(List list, List list1, int i)
        {
            SKU sku = new SKU();
            if (((OffersVO.Payload.Product.ProductOffer.OfferProduct.Sku)list1.get(i)).getAvailability() != null)
            {
                sku.setAvailability(((OffersVO.Payload.Product.ProductOffer.OfferProduct.Sku)list1.get(i)).getAvailability());
            }
            if (((OffersVO.Payload.Product.ProductOffer.OfferProduct.Sku)list1.get(i)).getColor() != null)
            {
                sku.setColor(((OffersVO.Payload.Product.ProductOffer.OfferProduct.Sku)list1.get(i)).getColor());
            }
            if (((OffersVO.Payload.Product.ProductOffer.OfferProduct.Sku)list1.get(i)).getImages() != null)
            {
                setOfferSkuImage(sku, ((OffersVO.Payload.Product.ProductOffer.OfferProduct.Sku)list1.get(i)).getImages());
            }
            if (((OffersVO.Payload.Product.ProductOffer.OfferProduct.Sku)list1.get(i)).getPrice() != null)
            {
                setOfferSkuPrice(sku, ((OffersVO.Payload.Product.ProductOffer.OfferProduct.Sku)list1.get(i)).getPrice());
            }
            if (((OffersVO.Payload.Product.ProductOffer.OfferProduct.Sku)list1.get(i)).getSize() != null)
            {
                sku.setSize(((OffersVO.Payload.Product.ProductOffer.OfferProduct.Sku)list1.get(i)).getSize());
            }
            if (((OffersVO.Payload.Product.ProductOffer.OfferProduct.Sku)list1.get(i)).getSkuCode() != null)
            {
                sku.setSkuCode(((OffersVO.Payload.Product.ProductOffer.OfferProduct.Sku)list1.get(i)).getSkuCode());
            }
            list.add(sku);
        }

        public List getAltImages()
        {
            return altImages;
        }

        public String getAvgRating()
        {
            return avgRating;
        }

        public String getBrand()
        {
            return brand;
        }

        public List getCollection()
        {
            return collection;
        }

        public Description getDescription()
        {
            return description;
        }

        public Documents getDocuments()
        {
            return documents;
        }

        public ProductDetailVO.Error getError()
        {
            return error;
        }

        public Exclusions getExclusions()
        {
            return exclusions;
        }

        public List getImages()
        {
            return images;
        }

        public boolean getIsBopusEligible()
        {
            return isBopusEligible;
        }

        public Price getPrice()
        {
            return price;
        }

        public List getProductOffers()
        {
            return productOffers;
        }

        public int getProductQty()
        {
            if (mSelectedQty < 1)
            {
                mSelectedQty = 1;
            }
            return mSelectedQty;
        }

        public String getProductStatus()
        {
            return productStatus;
        }

        public String getProductTitle()
        {
            return productTitle;
        }

        public String getProductURL()
        {
            return productURL;
        }

        public int getRatingCount()
        {
            return ratingCount;
        }

        public Rebate getRebate()
        {
            return rebate;
        }

        public List getSKUS()
        {
            return SKUS;
        }

        public StyleGuide getStyleGuide()
        {
            return styleGuide;
        }

        public List getSurcharges()
        {
            return surcharges;
        }

        public List getSwatchImages()
        {
            return swatchImages;
        }

        public List getValueAddedIcons()
        {
            return valueAddedIcons;
        }

        public List getVideos()
        {
            return videos;
        }

        public String getWebID()
        {
            return webID;
        }

        public void init(OffersVO.Payload.Product.ProductOffer.OfferProduct offerproduct)
        {
            if (offerproduct.getId() != null)
            {
                setWebID(offerproduct.getId());
            }
            if (offerproduct.getProductTitle() != null)
            {
                setProductTitle(offerproduct.getProductTitle());
            }
            if (offerproduct.getDescription() != null)
            {
                setProductDescription(offerproduct.getDescription());
            }
            if (offerproduct.getErrors() != null)
            {
                offerproduct.getErrors();
            }
            if (offerproduct.getImages() != null)
            {
                setProductImages(offerproduct.getImages());
            }
            if (offerproduct.getLinks() != null)
            {
                offerproduct.getLinks();
            }
            if (offerproduct.getPrice() != null)
            {
                setProductPrice(offerproduct.getPrice());
            }
            if (offerproduct.getProductURL() != null)
            {
                setProductURL(offerproduct.getProductURL());
            }
            if (offerproduct.getSwatchImages() != null)
            {
                setSwatchImages(offerproduct.getSwatchImages());
            }
            if (offerproduct.getSkus() != null)
            {
                setOfferSKUS(offerproduct.getSkus());
            }
        }

        public void setAltImages(List list)
        {
            altImages = list;
        }

        public void setAvgRating(String s)
        {
            avgRating = s;
        }

        public void setBrand(String s)
        {
            brand = s;
        }

        public void setCollection(List list)
        {
            collection = list;
        }

        public void setDescription(Description description1)
        {
            description = description1;
        }

        public void setDocuments(Documents documents1)
        {
            documents = documents1;
        }

        public void setError(ProductDetailVO.Error error1)
        {
            error = error1;
        }

        public void setError(StyleGuide styleguide)
        {
            styleGuide = styleguide;
        }

        public void setExclusions(Exclusions exclusions1)
        {
            exclusions = exclusions1;
        }

        public void setImages(List list)
        {
            images = list;
        }

        public void setIsBopusEligible(boolean flag)
        {
            isBopusEligible = flag;
        }

        public void setPrice(Price price1)
        {
            price = price1;
        }

        public void setProductOffers(List list)
        {
            productOffers = list;
        }

        public void setProductQty(int i)
        {
            if (i < 1)
            {
                mSelectedQty = 1;
                return;
            } else
            {
                mSelectedQty = i;
                return;
            }
        }

        public void setProductStatus(String s)
        {
            productStatus = s;
        }

        public void setProductTitle(String s)
        {
            productTitle = s;
        }

        public void setProductURL(String s)
        {
            productURL = s;
        }

        public void setRatingCount(int i)
        {
            ratingCount = i;
        }

        public void setRebate(Rebate rebate1)
        {
            rebate = rebate1;
        }

        public void setSKUS(List list)
        {
            SKUS = list;
        }

        public void setSurcharges(List list)
        {
            surcharges = list;
        }

        public void setSwatchImages(List list)
        {
            swatchImages = list;
        }

        public void setValueAddedIcons(List list)
        {
            valueAddedIcons = list;
        }

        public void setVideos(List list)
        {
            videos = list;
        }

        public void setWebID(String s)
        {
            webID = s;
        }

        public Product()
        {
            altImages = new ArrayList();
        }
    }


    private List products;

    public List getproducts()
    {
        return products;
    }

    public void setproducts(List list)
    {
        products = list;
    }

    public Product.altImages()
    {
    }

    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProductDetailVO$Payload$Product$Documents
    /* block-local class not found */
    class Product.Documents {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProductDetailVO$Payload$Product$Exclusions
    /* block-local class not found */
    class Product.Exclusions {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProductDetailVO$Payload$Product$ProductOffer
    /* block-local class not found */
    class Product.ProductOffer {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProductDetailVO$Payload$Product$Rebate
    /* block-local class not found */
    class Product.Rebate {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProductDetailVO$Payload$Product$StyleGuide
    /* block-local class not found */
    class Product.StyleGuide {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProductDetailVO$Payload$Product$Surcharge
    /* block-local class not found */
    class Product.Surcharge {}


    // Unreferenced inner class com/kohls/mcommerce/opal/framework/vo/ProductDetailVO$Payload$Product$Video
    /* block-local class not found */
    class Product.Video {}

}
