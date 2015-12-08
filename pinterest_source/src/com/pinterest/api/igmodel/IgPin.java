// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.pinterest.api.igmodel.metadata.IgPinMetadata;
import com.pinterest.api.igmodel.metadata.article.IgArticle;
import com.pinterest.api.igmodel.metadata.movie.IgMovie;
import com.pinterest.api.igmodel.metadata.product.IgProduct;
import com.pinterest.api.igmodel.metadata.product.IgProductHistory;
import com.pinterest.api.igmodel.metadata.recipe.IgRecipe;
import com.pinterest.api.model.AggregatedPinData;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Domain;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.Place;
import com.pinterest.api.model.User;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgModel, PinCinematicData, PinCinematicDataImages, PinCinematicDataImages1200x, 
//            PinAttribution, PinJoin, IgAggregatedPinData, IgDomain, 
//            PinEmbed, PinImages, PinImageDetail, PinRichSummary, 
//            IgPlace, IgPinGalleryItem, IgPinCanonicalImage, PinRecommendationReason, 
//            IgBoard, IgInterest, IgBuyableProduct, IgProductLayout, 
//            IgProductVariant, IgProductVariantVariant, IgVariations, IgUser, 
//            PinViewTag

public class IgPin
    implements IgModel
{

    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public int H;
    public int I;
    public int J;
    public Boolean K;
    public Boolean L;
    public Boolean M;
    public String N;
    public String O;
    public Boolean P;
    public Boolean Q;
    public String R;
    public IgBuyableProduct S;
    public List T;
    public List U;
    public String a;
    public String b;
    public IgPinMetadata c;
    public IgPlace d;
    public IgPlace e;
    public IgUser f;
    public IgUser g;
    public Boolean h;
    public IgUser i;
    public IgBoard j;
    public IgBoard k;
    public PinAttribution l;
    public PinJoin m;
    public IgAggregatedPinData n;
    public PinRichSummary o;
    public PinImages p;
    public PinEmbed q;
    public PinRecommendationReason r;
    public IgInterest s;
    public List t;
    public IgDomain u;
    public List v;
    public PinCinematicData w;
    public String x;
    public String y;
    public String z;

    public IgPin()
    {
    }

    public final com.pinterest.api.model.Pin.PinArtifact a()
    {
        com.pinterest.api.model.Pin.PinArtifact pinartifact = new com.pinterest.api.model.Pin.PinArtifact();
        Pin pin = new Pin();
        pin.setUid(a);
        pin.setInsertionId(b);
        pin.setIsDownstreamPromotion(h);
        pin.setDescription(z);
        pin.setCleanDescription(Pin.cleanDescription(z));
        if (N != null)
        {
            pin.setDominantColor(N.replace("null", "").replace("[", "").replace("]", ""));
        }
        Object obj;
        Domain domain;
        if (B != null)
        {
            obj = B;
        } else
        {
            obj = A;
        }
        pin.setLink(((String) (obj)));
        pin.setMobileLink(C);
        pin.setImageSquareUrl(D);
        pin.setImageMediumUrl(E);
        pin.setImageLargeUrl(F);
        pin.setType(G);
        pin.setRepinCount(Integer.valueOf(H));
        pin.setLikeCount(Integer.valueOf(I));
        pin.setCommentCount(Integer.valueOf(J));
        pin.setLiked(L);
        pin.setCacheableId(O);
        pin.setIsCinematic(P);
        pin.setIsPromoted(Q);
        pin.setImageSignature(R);
        if (w != null)
        {
            pin.setCinematicSrc(w.a);
            pin.setCinematicPinHeight(Integer.valueOf(w.b));
            pin.setCinematicPinWidth(Integer.valueOf(w.c));
            pin.setCinematicCoverSrc(w.d.a.a);
        }
        if (l != null)
        {
            pin.setAttrAuthorName(l.a);
            pin.setAttrAuthorUrl(l.b);
            pin.setAttrProviderIconUrl(l.c);
            pin.setAttrProviderName(l.d);
            pin.setAttrProviderUrl(l.c);
            pin.setAttrTitle(l.f);
        }
        if (m != null)
        {
            pin.setSeoDescription(m.a);
        }
        if (n != null)
        {
            obj = n.a();
            pin.setAggregatedPinDataUid(((AggregatedPinData) (obj)).getUid());
            pin.cacheAggregatedPinData(((AggregatedPinData) (obj)));
        }
        User user;
        Place place;
        Interest interest;
        Board board;
        User user2;
        if (u != null)
        {
            domain = u.a();
            pin.setDomainUid(domain.getUid());
            pin.cacheDomainObj(domain);
        } else
        {
            domain = null;
        }
        if (q != null)
        {
            pin.setEmbedType(q.a);
            pin.setEmbedUrl(q.b);
            pin.setEmbedWidth(Integer.valueOf(q.c));
            pin.setEmbedHeight(Integer.valueOf(q.d));
        }
        if (p != null)
        {
            if (p.a != null)
            {
                pin.setImageSquareUrl(p.a.a);
                pin.setImageSquareWidth(Integer.valueOf(p.a.b));
                pin.setImageSquareHeight(Integer.valueOf(p.a.c));
            }
            if (p.b != null)
            {
                pin.setImageSquareUrl(p.b.a);
                pin.setImageSquareWidth(Integer.valueOf(p.b.b));
                pin.setImageSquareHeight(Integer.valueOf(p.b.c));
            }
            if (p.c != null)
            {
                pin.setImageMediumUrl(p.c.a);
                pin.setImageMediumWidth(Integer.valueOf(p.c.b));
                pin.setImageMediumHeight(Integer.valueOf(p.c.c));
            }
            if (p.d != null)
            {
                pin.setImageMediumUrl(p.d.a);
                pin.setImageMediumWidth(Integer.valueOf(p.d.b));
                pin.setImageMediumHeight(Integer.valueOf(p.d.c));
            }
            if (p.e != null)
            {
                pin.setImageMediumUrl(p.e.a);
                pin.setImageMediumWidth(Integer.valueOf(p.e.b));
                pin.setImageMediumHeight(Integer.valueOf(p.e.c));
            }
            if (p.f != null)
            {
                pin.setImageLargeUrl(p.f.a);
                pin.setImageLargeWidth(Integer.valueOf(p.f.b));
                pin.setImageLargeHeight(Integer.valueOf(p.f.c));
            }
            if (p.g != null)
            {
                pin.setImageLargeUrl(p.g.a);
                pin.setImageLargeWidth(Integer.valueOf(p.g.b));
                pin.setImageLargeHeight(Integer.valueOf(p.g.c));
            }
            if (pin.isCSR() && p.h != null)
            {
                pin.setImageLargeUrl(p.h.a);
                pin.setImageLargeWidth(Integer.valueOf(p.h.b));
                pin.setImageLargeHeight(Integer.valueOf(p.h.c));
            }
        }
        if (o != null)
        {
            pin.setRichTitle(o.a);
            pin.setRichSiteName(o.b);
            pin.setRichTypeName(o.c);
            Iterator iterator2;
            if (o.d != null)
            {
                pin.setRichIcon(o.d);
            } else
            {
                pin.setRichIcon(o.e);
            }
        }
        if (c != null)
        {
            obj = c;
            PinterestJsonObject pinterestjsonobject = new PinterestJsonObject();
            if (((IgPinMetadata) (obj)).a != null)
            {
                PinterestJsonArray pinterestjsonarray = new PinterestJsonArray();
                for (iterator2 = ((IgPinMetadata) (obj)).a.iterator(); iterator2.hasNext(); pinterestjsonarray.a(((IgProductHistory)iterator2.next()).b())) { }
                pinterestjsonobject.a("products_history", pinterestjsonarray);
            }
            if (((IgPinMetadata) (obj)).b != null)
            {
                PinterestJsonArray pinterestjsonarray1 = new PinterestJsonArray();
                for (Iterator iterator3 = ((IgPinMetadata) (obj)).b.iterator(); iterator3.hasNext(); pinterestjsonarray1.a(((IgProduct)iterator3.next()).a())) { }
                pinterestjsonobject.a("products", pinterestjsonarray1);
            }
            if (((IgPinMetadata) (obj)).c != null)
            {
                pinterestjsonobject.a("movie", ((IgPinMetadata) (obj)).c.a());
            }
            if (((IgPinMetadata) (obj)).d != null)
            {
                pinterestjsonobject.a("recipe", ((IgPinMetadata) (obj)).d.a());
            }
            if (((IgPinMetadata) (obj)).e != null)
            {
                pinterestjsonobject.a("article", ((IgPinMetadata) (obj)).e.a());
            }
            pin.setMetadataJson(pinterestjsonobject.toString());
            pin.cacheMetadata(c.a());
        }
        if (d != null || e != null)
        {
            Iterator iterator;
            IgPinGalleryItem igpingalleryitem;
            PinterestJsonObject pinterestjsonobject2;
            Object obj2;
            PinterestJsonObject pinterestjsonobject4;
            if (d != null)
            {
                obj = d.a();
            } else
            {
                obj = e.a();
            }
            pin.setPlaceUid(((Place) (obj)).getUid());
            pin.setHasPlace(Boolean.valueOf(true));
            pin.cachePlace(((Place) (obj)));
            place = ((Place) (obj));
        } else
        {
            pin.setHasPlace(Boolean.valueOf(false));
            place = null;
        }
        if (v != null)
        {
            obj = new PinterestJsonArray();
            for (iterator = v.iterator(); iterator.hasNext(); ((PinterestJsonArray) (obj)).a(pinterestjsonobject2))
            {
                igpingalleryitem = (IgPinGalleryItem)iterator.next();
                pinterestjsonobject2 = new PinterestJsonObject();
                obj2 = igpingalleryitem.a;
                pinterestjsonobject2.a.add("image_signature", (new JsonParser()).parse(((String) (obj2))).getAsJsonObject());
                if (igpingalleryitem.b == null)
                {
                    continue;
                }
                obj2 = new PinterestJsonObject();
                if (igpingalleryitem.b.a != null)
                {
                    pinterestjsonobject4 = new PinterestJsonObject();
                    pinterestjsonobject4.b("url", igpingalleryitem.b.a.a);
                    pinterestjsonobject4.a("width", Integer.valueOf(igpingalleryitem.b.a.b));
                    pinterestjsonobject4.a("height", Integer.valueOf(igpingalleryitem.b.a.c));
                    ((PinterestJsonObject) (obj2)).a("736x", pinterestjsonobject4);
                }
                if (igpingalleryitem.b.b != null)
                {
                    pinterestjsonobject4 = new PinterestJsonObject();
                    pinterestjsonobject4.b("url", igpingalleryitem.b.b.a);
                    pinterestjsonobject4.a("width", Integer.valueOf(igpingalleryitem.b.b.b));
                    pinterestjsonobject4.a("height", Integer.valueOf(igpingalleryitem.b.b.c));
                    ((PinterestJsonObject) (obj2)).a("550x", pinterestjsonobject4);
                }
                if (igpingalleryitem.b.c != null)
                {
                    pinterestjsonobject4 = new PinterestJsonObject();
                    pinterestjsonobject4.b("url", igpingalleryitem.b.c.a);
                    pinterestjsonobject4.a("width", Integer.valueOf(igpingalleryitem.b.c.b));
                    pinterestjsonobject4.a("height", Integer.valueOf(igpingalleryitem.b.c.c));
                    ((PinterestJsonObject) (obj2)).a("236x", pinterestjsonobject4);
                }
                if (igpingalleryitem.b.d != null)
                {
                    pinterestjsonobject4 = new PinterestJsonObject();
                    pinterestjsonobject4.b("url", igpingalleryitem.b.d.a);
                    pinterestjsonobject4.a("width", Integer.valueOf(igpingalleryitem.b.d.b));
                    pinterestjsonobject4.a("height", Integer.valueOf(igpingalleryitem.b.d.c));
                    ((PinterestJsonObject) (obj2)).a("220x", pinterestjsonobject4);
                }
                pinterestjsonobject2.a.add("canonical_images", ((PinterestJsonObject) (obj2)).a);
            }

            pin.setGallery(((PinterestJsonArray) (obj)).toString());
            pin._galleryItems = null;
        }
        if (r != null)
        {
            IgProductLayout igproductlayout;
            Object obj3;
            Iterator iterator5;
            if (ModelHelper.isValid(r.a))
            {
                obj = r.a;
            } else
            {
                obj = null;
            }
            pin.setRecommendationReason(((String) (obj)));
            if (r.b != null)
            {
                obj = r.b.a().getBoard();
                pin.setRecommendationBoardUid(((Board) (obj)).getUid());
                pin.cacheRecommendationBoard(((Board) (obj)));
                pinartifact.setRecommendationBoard(((Board) (obj)));
            }
            if (r.c != null)
            {
                obj = r.c.a().getPin();
                pin.setRecommendationPinUid(((Pin) (obj)).getUid());
                pin.cacheRecommendationPin(((Pin) (obj)));
                pinartifact.setRecommendationPin(((Pin) (obj)));
            }
            if (r.d != null)
            {
                obj = r.d.a();
                pin.setRecommendationInterestUid(((Interest) (obj)).getUid());
                pin.cacheRecommendationInterest(((Interest) (obj)));
                pinartifact.setRecommendationInterest(((Interest) (obj)));
            }
        }
        if (S != null)
        {
            obj = S.a();
            Object obj1 = S;
            PinterestJsonObject pinterestjsonobject1 = new PinterestJsonObject();
            pinterestjsonobject1.b("id", ((IgBuyableProduct) (obj1)).a);
            pinterestjsonobject1.b("display_active_min_price", ((IgBuyableProduct) (obj1)).b);
            pinterestjsonobject1.b("has_swatches", ((IgBuyableProduct) (obj1)).c);
            pinterestjsonobject1.b("currency", ((IgBuyableProduct) (obj1)).d);
            pinterestjsonobject1.b("favicon_link", ((IgBuyableProduct) (obj1)).e);
            pinterestjsonobject1.b("title", ((IgBuyableProduct) (obj1)).f);
            pinterestjsonobject1.a("availability", ((IgBuyableProduct) (obj1)).g);
            pinterestjsonobject1.b("min_price", ((IgBuyableProduct) (obj1)).h);
            pinterestjsonobject1.b("canonical_merchant_domain", ((IgBuyableProduct) (obj1)).i);
            pinterestjsonobject1.b("short_description", ((IgBuyableProduct) (obj1)).j);
            pinterestjsonobject1.b("sale_price", ((IgBuyableProduct) (obj1)).k);
            pinterestjsonobject1.b("merchant_name", ((IgBuyableProduct) (obj1)).l);
            pinterestjsonobject1.b("description", ((IgBuyableProduct) (obj1)).m);
            pinterestjsonobject1.b("display_price", ((IgBuyableProduct) (obj1)).n);
            pinterestjsonobject1.b("price", ((IgBuyableProduct) (obj1)).o);
            pinterestjsonobject1.b("is_available", ((IgBuyableProduct) (obj1)).p);
            pinterestjsonobject1.b("merchant_id", ((IgBuyableProduct) (obj1)).q);
            pinterestjsonobject1.b("display_sale_price", ((IgBuyableProduct) (obj1)).r);
            pinterestjsonobject1.b("display_max_price", ((IgBuyableProduct) (obj1)).s);
            pinterestjsonobject1.b("display_min_price", ((IgBuyableProduct) (obj1)).t);
            pinterestjsonobject1.b("active_min_price", ((IgBuyableProduct) (obj1)).u);
            pinterestjsonobject1.b("display_active_max_price", ((IgBuyableProduct) (obj1)).v);
            pinterestjsonobject1.b("active_max_price", ((IgBuyableProduct) (obj1)).w);
            pinterestjsonobject1.b("link", ((IgBuyableProduct) (obj1)).x);
            pinterestjsonobject1.b("max_price", ((IgBuyableProduct) (obj1)).y);
            pinterestjsonobject1.b("merchant_item_group_id", ((IgBuyableProduct) (obj1)).z);
            if (((IgBuyableProduct) (obj1)).A != null)
            {
                igproductlayout = ((IgBuyableProduct) (obj1)).A;
                obj3 = new PinterestJsonObject();
                ((PinterestJsonObject) (obj3)).b("layout_colors", igproductlayout.a);
                ((PinterestJsonObject) (obj3)).b("layout_material", igproductlayout.b);
                ((PinterestJsonObject) (obj3)).b("layout_pattern", igproductlayout.c);
                ((PinterestJsonObject) (obj3)).b("layout_size", igproductlayout.d);
                pinterestjsonobject1.a("layout", ((PinterestJsonObject) (obj3)));
            }
            if (((IgBuyableProduct) (obj1)).B != null)
            {
                PinterestJsonArray pinterestjsonarray2 = new PinterestJsonArray();
                for (obj3 = ((IgBuyableProduct) (obj1)).B.iterator(); ((Iterator) (obj3)).hasNext(); pinterestjsonobject1.a("items", pinterestjsonarray2))
                {
                    Object obj4 = (IgProductVariant)((Iterator) (obj3)).next();
                    PinterestJsonObject pinterestjsonobject5 = new PinterestJsonObject();
                    pinterestjsonobject5.b("active_price", ((IgProductVariant) (obj4)).a);
                    pinterestjsonobject5.b("display_price", ((IgProductVariant) (obj4)).b);
                    pinterestjsonobject5.a("max_quantity", ((IgProductVariant) (obj4)).c);
                    pinterestjsonobject5.b("price", ((IgProductVariant) (obj4)).d);
                    pinterestjsonobject5.b("currency", ((IgProductVariant) (obj4)).e);
                    pinterestjsonobject5.b("item_id", ((IgProductVariant) (obj4)).f);
                    pinterestjsonobject5.b("sale_price", ((IgProductVariant) (obj4)).g);
                    pinterestjsonobject5.b("display_active_price", ((IgProductVariant) (obj4)).h);
                    pinterestjsonobject5.b("display_sale_price", ((IgProductVariant) (obj4)).i);
                    pinterestjsonobject5.a("availability", ((IgProductVariant) (obj4)).j);
                    if (((IgProductVariant) (obj4)).k != null)
                    {
                        PinterestJsonArray pinterestjsonarray3 = new PinterestJsonArray();
                        for (iterator5 = ((IgProductVariant) (obj4)).k.iterator(); iterator5.hasNext(); pinterestjsonarray3.a(((IgPinGalleryItem)iterator5.next()).b())) { }
                        pinterestjsonobject5.a("images", pinterestjsonarray3);
                    }
                    if (((IgProductVariant) (obj4)).l != null)
                    {
                        pinterestjsonobject5.a("swatch_image", ((IgProductVariant) (obj4)).l.b());
                    }
                    if (((IgProductVariant) (obj4)).m != null)
                    {
                        obj4 = ((IgProductVariant) (obj4)).m;
                        PinterestJsonObject pinterestjsonobject6 = new PinterestJsonObject();
                        pinterestjsonobject6.b("pattern", ((IgProductVariantVariant) (obj4)).a);
                        pinterestjsonobject6.b("colors", ((IgProductVariantVariant) (obj4)).b);
                        pinterestjsonobject6.b("material", ((IgProductVariantVariant) (obj4)).c);
                        pinterestjsonobject6.b("size", ((IgProductVariantVariant) (obj4)).d);
                        pinterestjsonobject5.a("variant", pinterestjsonobject6);
                    }
                    pinterestjsonarray2.a(pinterestjsonobject5);
                }

            }
            if (((IgBuyableProduct) (obj1)).C != null)
            {
                obj1 = ((IgBuyableProduct) (obj1)).C;
                PinterestJsonObject pinterestjsonobject3 = new PinterestJsonObject();
                if (((IgVariations) (obj1)).a != null)
                {
                    pinterestjsonobject3.a("colors", new PinterestJsonArray(((IgVariations) (obj1)).a));
                }
                if (((IgVariations) (obj1)).b != null)
                {
                    pinterestjsonobject3.a("size", new PinterestJsonArray(((IgVariations) (obj1)).b));
                }
                pinterestjsonobject1.a("variations", pinterestjsonobject3);
            }
            pin.setBuyableProductJson(pinterestjsonobject1.toString());
            pin.cacheBuyableProduct(((com.pinterest.api.model.BuyableProduct) (obj)));
        }
        if (T != null)
        {
            obj = new StringBuilder();
            for (Iterator iterator1 = T.iterator(); iterator1.hasNext(); ((StringBuilder) (obj)).append(","))
            {
                Integer integer = (Integer)iterator1.next();
                ((StringBuilder) (obj)).append(String.valueOf(integer));
                if (pin.addtionalReasonSet == null)
                {
                    pin.addtionalReasonSet = new HashSet();
                }
                pin.addtionalReasonSet.add(integer);
            }

            if (((StringBuilder) (obj)).length() > 0)
            {
                ((StringBuilder) (obj)).setLength(((StringBuilder) (obj)).length() - 1);
                pin.setAdditionalHideReasons(((StringBuilder) (obj)).toString());
            }
        }
        if (U != null)
        {
            obj = StringUtils.join(U, ",");
            if (pin.editedFieldSet == null)
            {
                pin.editedFieldSet = new HashSet();
            }
            pin.setEditedFields(((String) (obj)));
            pin.editedFieldSet.addAll(U);
        }
        if (s != null)
        {
            interest = s.a();
            pin.setInterestUid(interest.getUid());
            pin.cacheInterest(interest);
        } else
        {
            interest = null;
        }
        if (j != null)
        {
            board = j.a().getBoard();
            pin.setBoardUid(board.getUid());
            pin.cacheBoard(board);
        } else
        {
            board = null;
        }
        if (k != null)
        {
            obj = k.a().getBoard();
            pin.setPinnedToBoardUid(((Board) (obj)).getUid());
            pin.cachePinnedToBoard(((Board) (obj)));
        }
        if (f != null)
        {
            obj = f.a();
            pin.setUserUid(((User) (obj)).getUid());
            pin.cacheUser(((User) (obj)));
        } else
        {
            obj = null;
        }
        if (g != null)
        {
            User user1 = g.a();
            user = user1;
            if (user1.getFullName() == null)
            {
                user = ((User) (obj));
            }
            pin.setPromoterUid(user.getUid());
            pin.cachePromoterUser(user);
        } else
        {
            user = null;
        }
        if (i != null)
        {
            user2 = i.a();
            pin.setViaUserUid(user2.getUid());
            pin.cacheViaUser(user2);
        } else
        {
            user2 = null;
        }
        if (MyUser.isUserMe(pin.getUserUid()))
        {
            pin.setCacheExpirationDate(ModelHelper.extendedCacheExpirationDate());
        }
        if (t != null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            for (Iterator iterator4 = t.iterator(); iterator4.hasNext(); stringbuilder.append(",,"))
            {
                PinViewTag pinviewtag = (PinViewTag)iterator4.next();
                stringbuilder.append(pinviewtag.a);
                stringbuilder.append(",");
                stringbuilder.append(pinviewtag.b);
            }

            if (stringbuilder.length() > 0)
            {
                stringbuilder.setLength(stringbuilder.length() - 1);
                pin.setViewTags(stringbuilder.toString());
            }
        }
        pinartifact.setPin(pin);
        pinartifact.setBoard(board);
        pinartifact.setUser(((User) (obj)));
        pinartifact.setPromoterUser(user);
        pinartifact.setViaUser(user2);
        pinartifact.setPlace(place);
        pinartifact.setSourceInterest(interest);
        pinartifact.setDomainObj(domain);
        return pinartifact;
    }

    public Object getModel()
    {
        return a();
    }
}
