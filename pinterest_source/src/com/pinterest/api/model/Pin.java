// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import com.pinterest.activity.commerce.util.CommerceHelper;
import com.pinterest.api.model.metadata.article.Article;
import com.pinterest.api.model.metadata.movie.Movie;
import com.pinterest.api.model.metadata.product.Product;
import com.pinterest.api.model.metadata.recipe.Recipe;
import com.pinterest.base.Constants;
import com.pinterest.base.GooglePlayServices;
import com.pinterest.fantasio.thrift.ReasonToChoose;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.ImageUtils;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.schemas.feedback.RecommendationComplaintReason;
import com.pinterest.ui.feedback.PinFeedbackState;
import com.pinterest.ui.text.AtMentionSpan;
import com.pinterest.ui.text.HashTag;
import com.pinterest.ui.text.HashTagUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api.model:
//            Model, Domain, PinMetadataFactory, BuyableProduct, 
//            Place, Interest, Board, User, 
//            AggregatedPinData, MyUser, ModelHelper, DynamicStory, 
//            PinFeed, BoostablePinMetadata, PinMetadata

public class Pin extends Model
{

    private static final String ADD_BOLD_TAG = "<b>%s</b>";
    public static final Map LAUNCHED_RICH_PIN_TYPES = new _cls1();
    public static final int PIN_HIDDEN_STATE_COMPLETE_HIDDEN = 2;
    public static final int PIN_HIDDEN_STATE_NOT_HIDDEN = 0;
    public static final int PIN_HIDDEN_STATE_PARTIAL_HIDDEN = 1;
    public static final int PIN_HIDDEN_STATE_TRANSITION = 3;
    public static final String STR_FOLLOWED_INTEREST = "FOLLOWED_INTEREST";
    public static final String STR_PROMOTED = Resources.string(0x7f07046e);
    public static final String STR_REALTIME_P2B = "REALTIME_P2B";
    public static final String STR_RECOMMENDED_INTEREST = "RECOMMENDED_INTEREST";
    public static final String STR_RECOMMENDED_LOCAL_PIN = "RECOMMENDED_LOCAL_PIN";
    protected static final String STR_RELATED = Resources.string(0x7f070491);
    public static final String TYPE = "pin";
    public static final String TYPE_CSR = "csr";
    private static final String bannedDescriptions[] = {
        ".", ","
    };
    private String _cinematicCoverSrc;
    private PinFeedbackState _feedbackState;
    public List _galleryItems;
    private boolean _isDynamicallyInserted;
    private Pin _relatedParentPin;
    private ArrayList _spanWords;
    private SpannableString _spannable;
    private SpannableString _spannableShort;
    private String additionalHideReasons;
    public Set addtionalReasonSet;
    private AggregatedPinData aggregatedPinData;
    private String aggregatedPinDataUid;
    private String attrAuthorName;
    private String attrAuthorUrl;
    private String attrProviderIconUrl;
    private String attrProviderName;
    private String attrProviderUrl;
    private String attrTitle;
    private Board board;
    private String boardUid;
    private BuyableProduct buyableProduct;
    private String buyableProductJson;
    private Date cacheExpirationDate;
    private String cacheableId;
    private String canonicalMerchantDomain;
    private Integer cinematicPinHeight;
    private Integer cinematicPinWidth;
    private String cinematicSrc;
    private String cleanDescription;
    private Integer commentCount;
    private Date createdAt;
    private String description;
    private String domain;
    private Domain domainObj;
    private String domainUid;
    private String dominantColor;
    public Set editedFieldSet;
    private String editedFields;
    private Integer embedHeight;
    private String embedType;
    private String embedUrl;
    private Integer embedWidth;
    private Integer feedbackType;
    private String gallery;
    private Boolean hasPlace;
    private Integer hiddenState;
    private Long id;
    private Integer imageLargeHeight;
    private String imageLargeUrl;
    private Integer imageLargeWidth;
    private Integer imageMediumHeight;
    private String imageMediumUrl;
    private Integer imageMediumWidth;
    private String imageSignature;
    private Integer imageSquareHeight;
    private String imageSquareUrl;
    private Integer imageSquareWidth;
    private String insertionId;
    private Interest interest;
    private String interestUid;
    private Boolean isCinematic;
    private Boolean isDownstreamPromotion;
    private Boolean isPromoted;
    private Integer likeCount;
    private Boolean liked;
    private String link;
    private PinMetadata metadata;
    private String metadataJson;
    private String mobileLink;
    private Board pinnedToBoard;
    private String pinnedToBoardUid;
    private Place place;
    private String placeUid;
    private String promoterUid;
    private User promoterUser;
    private String recommendationBlob;
    private Board recommendationBoard;
    private String recommendationBoardUid;
    private Interest recommendationInterest;
    private String recommendationInterestUid;
    private Pin recommendationPin;
    private String recommendationPinUid;
    private String recommendationReason;
    private Integer repinCount;
    private Boolean repinned;
    private String richIcon;
    private String richSiteName;
    private String richTitle;
    private String richTypeName;
    private String seoDescription;
    private String source;
    private String type;
    private String uid;
    private User user;
    private String userUid;
    private User viaUser;
    private String viaUserUid;
    private Boolean video;
    private String viewTags;

    public Pin()
    {
    }

    public Pin(Long long1)
    {
        id = long1;
    }

    public Pin(Long long1, String s, Date date, String s1, String s2, String s3, Boolean boolean1, 
            String s4, String s5, String s6, String s7, Date date1, String s8, String s9, 
            String s10, String s11, String s12, String s13, String s14, String s15, String s16, 
            String s17, String s18, String s19, String s20, String s21, String s22, String s23, 
            String s24, String s25, String s26, String s27, String s28, Integer integer, Integer integer1, 
            Integer integer2, Integer integer3, Integer integer4, Integer integer5, Integer integer6, Integer integer7, Integer integer8, 
            Integer integer9, Integer integer10, Boolean boolean2, Boolean boolean3, Boolean boolean4, String s29, String s30, 
            String s31, String s32, String s33, String s34, String s35, Boolean boolean5, String s36, 
            String s37, String s38, String s39, String s40, String s41, String s42, Integer integer11, 
            Integer integer12, String s43, String s44, Boolean boolean6, String s45, Boolean boolean7, Integer integer13, 
            Integer integer14, String s46, String s47, String s48, String s49)
    {
        id = long1;
        uid = s;
        cacheExpirationDate = date;
        insertionId = s1;
        userUid = s2;
        promoterUid = s3;
        isDownstreamPromotion = boolean1;
        boardUid = s4;
        interestUid = s5;
        pinnedToBoardUid = s6;
        aggregatedPinDataUid = s7;
        createdAt = date1;
        domain = s8;
        domainUid = s9;
        description = s10;
        seoDescription = s11;
        cleanDescription = s12;
        link = s13;
        mobileLink = s14;
        source = s15;
        viaUserUid = s16;
        attrTitle = s17;
        attrProviderName = s18;
        attrProviderUrl = s19;
        attrAuthorName = s20;
        attrAuthorUrl = s21;
        attrProviderIconUrl = s22;
        imageSquareUrl = s23;
        imageMediumUrl = s24;
        imageLargeUrl = s25;
        type = s26;
        embedUrl = s27;
        embedType = s28;
        imageSquareWidth = integer;
        imageSquareHeight = integer1;
        imageMediumWidth = integer2;
        imageMediumHeight = integer3;
        imageLargeWidth = integer4;
        imageLargeHeight = integer5;
        embedWidth = integer6;
        embedHeight = integer7;
        repinCount = integer8;
        likeCount = integer9;
        commentCount = integer10;
        repinned = boolean2;
        liked = boolean3;
        video = boolean4;
        dominantColor = s29;
        richTitle = s30;
        richSiteName = s31;
        richTypeName = s32;
        richIcon = s33;
        metadataJson = s34;
        placeUid = s35;
        hasPlace = boolean5;
        recommendationBlob = s36;
        recommendationReason = s37;
        recommendationBoardUid = s38;
        recommendationPinUid = s39;
        recommendationInterestUid = s40;
        additionalHideReasons = s41;
        editedFields = s42;
        hiddenState = integer11;
        feedbackType = integer12;
        viewTags = s43;
        cacheableId = s44;
        isCinematic = boolean6;
        cinematicSrc = s45;
        isPromoted = boolean7;
        cinematicPinWidth = integer13;
        cinematicPinHeight = integer14;
        gallery = s46;
        imageSignature = s47;
        buyableProductJson = s48;
        canonicalMerchantDomain = s49;
    }

    private static void cachePin(final PinArtifact artifact)
    {
        (new _cls2()).execute();
    }

    public static final String cleanDescription(String s)
    {
        String s1;
        if (s != null)
        {
            s = s.replaceAll("\\s", "");
            String as[] = bannedDescriptions;
            int j = as.length;
            int i = 0;
            do
            {
                s1 = s;
                if (i >= j)
                {
                    break;
                }
                s = s.replace(as[i], "");
                i++;
            } while (true);
        } else
        {
            s1 = "";
        }
        return s1;
    }

    public static ReasonToChoose getRecommendationEnum(String s)
    {
        try
        {
            s = ReasonToChoose.valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return ReasonToChoose.a;
        }
        return s;
    }

    public static int getRecommendationUid(String s)
    {
        return getRecommendationEnum(s).getValue();
    }

    public static PinArtifact make(PinterestJsonObject pinterestjsonobject, boolean flag)
    {
        return make(pinterestjsonobject, flag, true);
    }

    public static PinArtifact make(PinterestJsonObject pinterestjsonobject, boolean flag, boolean flag1)
    {
        PinArtifact pinartifact = new PinArtifact();
        Object obj = pinterestjsonobject.c("data");
        if (obj != null)
        {
            pinterestjsonobject = ((PinterestJsonObject) (obj));
        }
        PinterestJsonObject pinterestjsonobject5 = pinterestjsonobject.c("rich_metadata");
        Object obj1 = pinterestjsonobject.c("place");
        Object obj2 = pinterestjsonobject.c("place_summary");
        PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.c("pinner");
        Object obj3 = pinterestjsonobject.c("promoter");
        Object obj8 = pinterestjsonobject.c("via_pinner");
        PinterestJsonObject pinterestjsonobject3 = pinterestjsonobject.c("board");
        PinterestJsonObject pinterestjsonobject2 = pinterestjsonobject.c("pinned_to_board");
        obj = pinterestjsonobject.c("attribution");
        PinterestJsonObject pinterestjsonobject6 = pinterestjsonobject.c("rich_summary");
        PinterestJsonObject pinterestjsonobject7 = pinterestjsonobject.c("images");
        PinterestJsonObject pinterestjsonobject8 = pinterestjsonobject.c("embed");
        PinterestJsonObject pinterestjsonobject4 = pinterestjsonobject.c("recommendation_reason");
        Object obj5 = pinterestjsonobject.c("source_interest");
        PinterestJsonArray pinterestjsonarray = pinterestjsonobject.e("view_tags");
        PinterestJsonObject pinterestjsonobject9 = pinterestjsonobject.c("link_domain");
        PinterestJsonArray pinterestjsonarray3 = pinterestjsonobject.e("gallery");
        Object obj4 = pinterestjsonobject.c("buyable_product");
        PinterestJsonArray pinterestjsonarray2 = pinterestjsonobject.e("additional_hide_reasons");
        PinterestJsonArray pinterestjsonarray1 = pinterestjsonobject.e("edited_fields");
        Object obj6 = pinterestjsonobject.c("aggregated_pin_data");
        Object obj7 = pinterestjsonobject.c("pin_join");
        Pin pin = (Pin)pinterestjsonobject.a(com/pinterest/api/model/Pin);
        pin.setCleanDescription(cleanDescription(pin.getDescription()));
        pin.makeSpannable();
        String s = pin.getDominantColor();
        if (s != null)
        {
            pin.setDominantColor(s.replace("null", "").replace("[", "").replace("]", ""));
        }
        if (pin.getLink() == null)
        {
            pin.setLink(pinterestjsonobject.a("link", null));
        }
        pin.setMobileLink(pinterestjsonobject.a("mobile_link", null));
        if (pinterestjsonobject.f("cinematic_data"))
        {
            pin.setCinematicSrc(pinterestjsonobject.c("cinematic_data").a("src", null));
            pin.setCinematicPinHeight(Integer.valueOf(pinterestjsonobject.c("cinematic_data").a("height", 0)));
            pin.setCinematicPinWidth(Integer.valueOf(pinterestjsonobject.c("cinematic_data").a("width", 0)));
            pinterestjsonobject = pinterestjsonobject.c("cinematic_data").c("images");
            if (pinterestjsonobject != null)
            {
                pinterestjsonobject = pinterestjsonobject.c("1200x");
                if (pinterestjsonobject != null)
                {
                    pin.setCinematicCoverSrc(pinterestjsonobject.a("url", ""));
                }
            }
        }
        if (obj != null)
        {
            pin.setAttrAuthorName(((PinterestJsonObject) (obj)).a("author_name", null));
            pin.setAttrAuthorUrl(((PinterestJsonObject) (obj)).a("author_url", null));
            pin.setAttrProviderIconUrl(((PinterestJsonObject) (obj)).a("provider_icon_url", null));
            pin.setAttrProviderName(((PinterestJsonObject) (obj)).a("provider_name", null));
            pin.setAttrProviderUrl(((PinterestJsonObject) (obj)).a("url", null));
            pin.setAttrTitle(((PinterestJsonObject) (obj)).a("title", null));
        }
        obj = null;
        if (pinterestjsonobject9 != null)
        {
            pinterestjsonobject = Domain.make(pinterestjsonobject9, false);
            obj = pinterestjsonobject;
            if (pinterestjsonobject != null)
            {
                pin.setDomainUid(pinterestjsonobject.getUid());
                pin.cacheDomainObj(pinterestjsonobject);
                obj = pinterestjsonobject;
            }
        }
        if (pinterestjsonobject8 != null)
        {
            pin.setEmbedType(pinterestjsonobject8.a("type", ""));
            pin.setEmbedUrl(pinterestjsonobject8.a("src", ""));
            pin.setEmbedWidth(Integer.valueOf(pinterestjsonobject8.a("width", 0)));
            pin.setEmbedHeight(Integer.valueOf(pinterestjsonobject8.a("height", 0)));
        }
        if (pinterestjsonobject7 != null)
        {
            pinterestjsonobject = pinterestjsonobject7.c("90x90");
            if (pinterestjsonobject != null)
            {
                pin.setImageSquareUrl(pinterestjsonobject.a("url", ""));
                pin.setImageSquareWidth(Integer.valueOf(pinterestjsonobject.a("width", 0)));
                pin.setImageSquareHeight(Integer.valueOf(pinterestjsonobject.a("height", 0)));
            }
            pinterestjsonobject = pinterestjsonobject7.c("136x136");
            if (pinterestjsonobject != null)
            {
                pin.setImageSquareUrl(pinterestjsonobject.a("url", ""));
                pin.setImageSquareWidth(Integer.valueOf(pinterestjsonobject.a("width", 0)));
                pin.setImageSquareHeight(Integer.valueOf(pinterestjsonobject.a("height", 0)));
            }
            pinterestjsonobject = pinterestjsonobject7.c("200x");
            if (pinterestjsonobject != null)
            {
                pin.setImageMediumUrl(pinterestjsonobject.a("url", ""));
                pin.setImageMediumWidth(Integer.valueOf(pinterestjsonobject.a("width", 0)));
                pin.setImageMediumHeight(Integer.valueOf(pinterestjsonobject.a("height", 0)));
            }
            pinterestjsonobject = pinterestjsonobject7.c("236x");
            if (pinterestjsonobject != null)
            {
                pin.setImageMediumUrl(pinterestjsonobject.a("url", ""));
                pin.setImageMediumWidth(Integer.valueOf(pinterestjsonobject.a("width", 0)));
                pin.setImageMediumHeight(Integer.valueOf(pinterestjsonobject.a("height", 0)));
            }
            pinterestjsonobject = pinterestjsonobject7.c("474x");
            if (pinterestjsonobject != null)
            {
                pin.setImageMediumUrl(pinterestjsonobject.a("url", ""));
                pin.setImageMediumWidth(Integer.valueOf(pinterestjsonobject.a("width", 0)));
                pin.setImageMediumHeight(Integer.valueOf(pinterestjsonobject.a("height", 0)));
            }
            pinterestjsonobject = pinterestjsonobject7.c("550x");
            if (pinterestjsonobject != null)
            {
                pin.setImageLargeUrl(pinterestjsonobject.a("url", ""));
                pin.setImageLargeWidth(Integer.valueOf(pinterestjsonobject.a("width", 0)));
                pin.setImageLargeHeight(Integer.valueOf(pinterestjsonobject.a("height", 0)));
            }
            pinterestjsonobject = pinterestjsonobject7.c("736x");
            if (pinterestjsonobject != null)
            {
                pin.setImageLargeUrl(pinterestjsonobject.a("url", ""));
                pin.setImageLargeWidth(Integer.valueOf(pinterestjsonobject.a("width", 0)));
                pin.setImageLargeHeight(Integer.valueOf(pinterestjsonobject.a("height", 0)));
            }
            if (pin.isCSR())
            {
                pinterestjsonobject = pinterestjsonobject7.c("orig");
                if (pinterestjsonobject != null)
                {
                    pin.setImageLargeUrl(pinterestjsonobject.a("url", ""));
                    pin.setImageLargeWidth(Integer.valueOf(pinterestjsonobject.a("width", 0)));
                    pin.setImageLargeHeight(Integer.valueOf(pinterestjsonobject.a("height", 0)));
                }
            }
        }
        if (pinterestjsonobject6 != null)
        {
            pin.setRichTitle(pinterestjsonobject6.a("display_name", null));
            pin.setRichSiteName(pinterestjsonobject6.a("site_name", null));
            pin.setRichTypeName(pinterestjsonobject6.a("type_name", null));
            int i;
            int l;
            if (pinterestjsonobject6.f("favicon_link"))
            {
                pin.setRichIcon(pinterestjsonobject6.a("favicon_link", null));
            } else
            {
                pin.setRichIcon(pinterestjsonobject6.a("apple_touch_icon_link", null));
            }
        }
        if (pinterestjsonobject5 != null)
        {
            pin.setMetadataJson(pinterestjsonobject5.toString());
            pin.cacheMetadata(PinMetadataFactory.make(pin, pinterestjsonobject5));
        }
        if (obj4 != null)
        {
            pinterestjsonobject = BuyableProduct.make(((PinterestJsonObject) (obj4)));
            pin.setBuyableProductJson(((PinterestJsonObject) (obj4)).toString());
            pin.cacheBuyableProduct(pinterestjsonobject);
        }
        if (obj1 != null || obj2 != null)
        {
            if (obj1 != null)
            {
                pinterestjsonobject = ((PinterestJsonObject) (obj1));
            } else
            {
                pinterestjsonobject = ((PinterestJsonObject) (obj2));
            }
            obj4 = Place.make(pinterestjsonobject);
            pin.setPlaceUid(((Place) (obj4)).getUid());
            pin.setHasPlace(Boolean.valueOf(true));
            pin.cachePlace(((Place) (obj4)));
        } else
        {
            pin.setHasPlace(Boolean.valueOf(false));
            obj4 = null;
        }
        pin.setGallery(pinterestjsonarray3.toString());
        pin._galleryItems = null;
        setRecommendations(pin, pinartifact, pinterestjsonobject4, flag1);
        pinterestjsonobject = new StringBuilder();
        for (i = 0; i < pinterestjsonarray2.a(); i++)
        {
            l = pinterestjsonarray2.b(i);
            pinterestjsonobject.append(String.valueOf(l));
            if (pin.addtionalReasonSet == null)
            {
                pin.addtionalReasonSet = new HashSet();
            }
            pin.addtionalReasonSet.add(Integer.valueOf(l));
            pinterestjsonobject.append(",");
        }

        if (pinterestjsonobject.length() > 0)
        {
            pinterestjsonobject.setLength(pinterestjsonobject.length() - 1);
            pin.setAdditionalHideReasons(pinterestjsonobject.toString());
        }
        new StringBuilder();
        for (int j = 0; j < pinterestjsonarray1.a(); j++)
        {
            pinterestjsonobject = pinterestjsonarray1.a(j);
            if (pin.editedFieldSet == null)
            {
                pin.editedFieldSet = new HashSet();
            }
            pin.editedFieldSet.add(pinterestjsonobject);
        }

        pin.setEditedFields(StringUtils.join(pin.editedFieldSet, ","));
        if (obj5 != null)
        {
            obj5 = Interest.make(((PinterestJsonObject) (obj5)), false);
            pin.setInterestUid(((Interest) (obj5)).getUid());
            pin.cacheInterest(((Interest) (obj5)));
        } else
        {
            obj5 = null;
        }
        obj1 = null;
        if (pinterestjsonobject3 != null)
        {
            obj1 = Board.make(pinterestjsonobject3, false, flag1).getBoard();
            pin.setBoardUid(((Board) (obj1)).getUid());
            pin.cacheBoard(((Board) (obj1)));
        }
        if (pinterestjsonobject2 != null)
        {
            pinterestjsonobject = Board.make(pinterestjsonobject2, false, flag1).getBoard();
            pin.setPinnedToBoardUid(pinterestjsonobject.getUid());
            pin.cachePinnedToBoard(pinterestjsonobject);
        }
        pinterestjsonobject = null;
        if (pinterestjsonobject1 != null)
        {
            pinterestjsonobject = User.make(pinterestjsonobject1, false, flag1);
            pin.setUserUid(pinterestjsonobject.getUid());
            pin.cacheUser(pinterestjsonobject);
        }
        obj2 = null;
        if (obj3 != null)
        {
            obj3 = User.make(((PinterestJsonObject) (obj3)), false, flag1);
            obj2 = obj3;
            if (((User) (obj3)).getFullName() == null)
            {
                obj2 = obj3;
                if (pinterestjsonobject != null)
                {
                    obj2 = pinterestjsonobject;
                }
            }
            pin.setPromoterUid(((User) (obj2)).getUid());
            pin.cachePromoterUser(((User) (obj2)));
        }
        obj3 = null;
        if (obj8 != null)
        {
            obj3 = User.make(((PinterestJsonObject) (obj8)), false, flag1);
            pin.setViaUserUid(((User) (obj3)).getUid());
            pin.cacheViaUser(((User) (obj3)));
        }
        if (obj6 != null)
        {
            obj6 = AggregatedPinData.make(((PinterestJsonObject) (obj6)));
            if (obj6 != null)
            {
                pin.setAggregatedPinDataUid(((AggregatedPinData) (obj6)).getUid());
                pin.cacheAggregatedPinData(((AggregatedPinData) (obj6)));
            }
        } else
        {
            obj6 = null;
        }
        if (obj7 != null)
        {
            obj7 = ((PinterestJsonObject) (obj7)).a("seo_description", null);
            if (StringUtils.isNotEmpty(((CharSequence) (obj7))))
            {
                pin.setSeoDescription(((String) (obj7)));
            }
        }
        if (MyUser.isUserMe(pin.getUserUid()))
        {
            pin.setCacheExpirationDate(ModelHelper.extendedCacheExpirationDate());
        }
        if (flag1)
        {
            obj8 = merge(pin);
            obj1 = Board.merge(((Board) (obj1)));
            pinterestjsonobject = User.merge(pinterestjsonobject);
            obj7 = User.merge(((User) (obj2)));
            obj2 = User.merge(((User) (obj3)));
            obj = Domain.merge(((Domain) (obj)));
            obj3 = obj7;
            obj7 = obj;
            obj = obj8;
        } else
        {
            obj7 = obj2;
            Object obj9 = obj;
            obj = pin;
            obj2 = obj3;
            obj3 = obj7;
            obj7 = obj9;
        }
        obj8 = new StringBuilder();
        for (int k = 0; k < pinterestjsonarray.a(); k++)
        {
            ((StringBuilder) (obj8)).append(pinterestjsonarray.c(k).a("id", ""));
            ((StringBuilder) (obj8)).append(",");
            ((StringBuilder) (obj8)).append(pinterestjsonarray.c(k).a("url", ""));
            ((StringBuilder) (obj8)).append(",,");
        }

        if (((StringBuilder) (obj8)).length() > 0)
        {
            ((StringBuilder) (obj8)).setLength(((StringBuilder) (obj8)).length() - 1);
            ((Pin) (obj)).setViewTags(((StringBuilder) (obj8)).toString());
        }
        pinartifact.setPin(((Pin) (obj)));
        pinartifact.setBoard(((Board) (obj1)));
        pinartifact.setUser(pinterestjsonobject);
        pinartifact.setPromoterUser(((User) (obj3)));
        pinartifact.setViaUser(((User) (obj2)));
        pinartifact.setPlace(((Place) (obj4)));
        pinartifact.setSourceInterest(((Interest) (obj5)));
        pinartifact.setDomainObj(((Domain) (obj7)));
        pinartifact.setAggregatedPinData(((AggregatedPinData) (obj6)));
        if (flag)
        {
            cachePin(pinartifact);
        }
        return pinartifact;
    }

    public static Pin make(PinterestJsonObject pinterestjsonobject)
    {
        return make(pinterestjsonobject, true).getPin();
    }

    public static List makeAll(PinterestJsonArray pinterestjsonarray)
    {
        return makeAll(pinterestjsonarray, null);
    }

    public static List makeAll(PinterestJsonArray pinterestjsonarray, ArrayList arraylist)
    {
        ArrayList arraylist7 = new ArrayList();
        Object obj3 = new ArrayList();
        Object obj2 = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        Object obj1 = new ArrayList();
        Object obj = new ArrayList();
        ArrayList arraylist3 = new ArrayList();
        ArrayList arraylist4 = new ArrayList();
        ArrayList arraylist5 = new ArrayList();
        ArrayList arraylist6 = new ArrayList();
        int i = 0;
        int j = pinterestjsonarray.a();
        while (i < j) 
        {
            Object obj4 = pinterestjsonarray.d(i);
            if ("story".equals(((PinterestJsonObject) (obj4)).a("type", "")))
            {
                if (arraylist != null)
                {
                    PLog.info((new StringBuilder("get story: ")).append(((PinterestJsonObject) (obj4)).a("story_type", "")).toString(), new Object[0]);
                    obj4 = DynamicStory.make(((PinterestJsonObject) (obj4)), false);
                    if (obj4 != null)
                    {
                        ((DynamicStory) (obj4)).setPosition(Integer.valueOf(i));
                        arraylist.add(obj4);
                    }
                }
            } else
            {
                PinArtifact pinartifact = make(pinterestjsonarray.d(i), false, false);
                arraylist1.add(pinartifact.getPin());
                arraylist7.add(pinartifact.getPin().getUid());
                if (pinartifact.getBoard() != null)
                {
                    ((List) (obj1)).add(pinartifact.getBoard());
                    ((List) (obj3)).add(pinartifact.getBoard().getUid());
                }
                if (pinartifact.getRecommendationBoard() != null)
                {
                    ((List) (obj1)).add(pinartifact.getRecommendationBoard());
                    ((List) (obj3)).add(pinartifact.getRecommendationBoard().getUid());
                }
                if (pinartifact.getRecommendationPin() != null)
                {
                    arraylist2.add(pinartifact.getRecommendationPin());
                }
                if (pinartifact.getRecommendationInterest() != null)
                {
                    arraylist5.add(pinartifact.getRecommendationInterest());
                }
                if (pinartifact.getUser() != null)
                {
                    ((List) (obj)).add(pinartifact.getUser());
                    ((List) (obj2)).add(pinartifact.getUser().getUid());
                    if (pinartifact.getUser().getPartner() != null)
                    {
                        arraylist3.add(pinartifact.getUser().getPartner());
                    }
                }
                if (pinartifact.getPromoterUser() != null)
                {
                    ((List) (obj)).add(pinartifact.getPromoterUser());
                    ((List) (obj2)).add(pinartifact.getPromoterUser().getUid());
                    if (pinartifact.getPromoterUser().getPartner() != null)
                    {
                        arraylist3.add(pinartifact.getPromoterUser().getPartner());
                    }
                }
                if (pinartifact.getViaUser() != null)
                {
                    ((List) (obj)).add(pinartifact.getViaUser());
                    ((List) (obj2)).add(pinartifact.getViaUser().getUid());
                    if (pinartifact.getViaUser().getPartner() != null)
                    {
                        arraylist3.add(pinartifact.getViaUser().getPartner());
                    }
                }
                if (pinartifact.getPlace() != null)
                {
                    arraylist4.add(pinartifact.getPlace());
                }
                if (pinartifact.getSourceInterest() != null)
                {
                    arraylist5.add(pinartifact.getSourceInterest());
                }
                if (pinartifact.getDomainObj() != null)
                {
                    arraylist6.add(pinartifact.getDomainObj());
                    if (pinartifact.getDomainObj() != null)
                    {
                        ((List) (obj)).add(pinartifact.getDomainObj().getOfficialUser());
                    }
                }
            }
            i++;
        }
        pinterestjsonarray = mergeAll(arraylist1, ModelHelper.getPins(arraylist7));
        obj3 = ModelHelper.getBoards(((List) (obj3)));
        obj2 = ModelHelper.getUsers(((List) (obj2)));
        obj1 = Board.mergeAll(((List) (obj1)), ((List) (obj3)));
        obj = User.mergeAll(((List) (obj)), ((List) (obj2)));
        ModelHelper.setPins(pinterestjsonarray);
        ModelHelper.setPins(arraylist2);
        ModelHelper.setBoards(((List) (obj1)));
        ModelHelper.setPartners(arraylist3);
        ModelHelper.setUsers(((List) (obj)));
        ModelHelper.setPlaces(arraylist4);
        ModelHelper.setInterests(arraylist5);
        ModelHelper.setDomains(arraylist6);
        ModelHelper.setDynamicStories(arraylist);
        return arraylist1;
    }

    private void makeSpannable()
    {
        if (PinFeed.renderHashtag && !StringUtils.isEmpty(cleanDescription))
        {
            String s = description;
            ArrayList arraylist = HashTagUtils.getSpans(s, '#');
            ArrayList arraylist1 = HashTagUtils.getSpans(s, '@');
            if (arraylist.size() > 0 || arraylist1.size() > 0)
            {
                SpannableString spannablestring = new SpannableString(s);
                HashTagUtils.setSpans(spannablestring, arraylist, com/pinterest/ui/text/HashTag);
                HashTagUtils.setSpans(spannablestring, arraylist1, com/pinterest/ui/text/AtMentionSpan);
                if (_spanWords == null)
                {
                    _spanWords = new ArrayList();
                } else
                {
                    _spanWords.clear();
                }
                if (arraylist.size() > 0)
                {
                    _spanWords.addAll(HashTagUtils.getSpanWords(s, arraylist));
                }
                if (arraylist1.size() > 0)
                {
                    _spanWords.addAll(HashTagUtils.getSpanWords(s, arraylist1));
                }
                _spannable = spannablestring;
                return;
            }
        }
    }

    public static Pin merge(Pin pin)
    {
        if (pin == null)
        {
            return null;
        } else
        {
            return merge(pin, ModelHelper.getPin(pin.getUid()));
        }
    }

    public static Pin merge(Pin pin, Pin pin1)
    {
        Pin pin2;
        if (pin == null)
        {
            pin2 = null;
        } else
        {
            pin2 = pin;
            if (pin1 != null)
            {
                if (pin.cacheExpirationDate != null)
                {
                    pin1.cacheExpirationDate = pin.cacheExpirationDate;
                }
                if (pin.insertionId != null)
                {
                    pin1.insertionId = pin.insertionId;
                }
                if (pin.userUid != null)
                {
                    pin1.userUid = pin.userUid;
                    if (pin.user != null)
                    {
                        pin1.cacheUser(pin.user);
                    }
                }
                if (pin.boardUid != null)
                {
                    pin1.boardUid = pin.boardUid;
                    if (pin.board != null)
                    {
                        pin1.cacheBoard(pin.board);
                    }
                }
                if (pin.interestUid != null)
                {
                    pin1.interestUid = pin.interestUid;
                    if (pin.interest != null)
                    {
                        pin1.cacheInterest(pin.interest);
                    }
                }
                if (pin.promoterUid != null)
                {
                    pin1.promoterUid = pin.promoterUid;
                    if (pin.promoterUser != null)
                    {
                        pin1.cachePromoterUser(pin.promoterUser);
                    }
                }
                if (pin.pinnedToBoardUid != null)
                {
                    pin1.pinnedToBoardUid = pin.pinnedToBoardUid;
                    if (pin.pinnedToBoard != null)
                    {
                        pin1.cachePinnedToBoard(pin.pinnedToBoard);
                    }
                }
                if (pin.createdAt != null)
                {
                    pin1.createdAt = pin.createdAt;
                }
                if (pin.domain != null)
                {
                    pin1.domain = pin.domain;
                }
                if (pin.domainUid != null)
                {
                    pin1.domainUid = pin.domainUid;
                    if (pin.domainObj != null)
                    {
                        pin1.cacheDomainObj(pin.domainObj);
                    }
                }
                if (pin.description != null)
                {
                    pin1.description = pin.description;
                }
                if (pin.seoDescription != null)
                {
                    pin1.seoDescription = pin.seoDescription;
                }
                if (pin.cleanDescription != null)
                {
                    pin1.cleanDescription = pin.cleanDescription;
                }
                if (pin.link != null)
                {
                    pin1.link = pin.link;
                }
                if (pin.mobileLink != null)
                {
                    pin1.mobileLink = pin.mobileLink;
                }
                if (pin.isCinematic != null)
                {
                    pin1.isCinematic = pin.isCinematic;
                }
                if (pin.cinematicSrc != null)
                {
                    pin1.cinematicSrc = pin.cinematicSrc;
                }
                if (pin._cinematicCoverSrc != null)
                {
                    pin1._cinematicCoverSrc = pin._cinematicCoverSrc;
                }
                if (pin.isPromoted != null)
                {
                    pin1.isPromoted = pin.isPromoted;
                }
                if (pin.isDownstreamPromotion != null)
                {
                    pin1.isDownstreamPromotion = pin.isDownstreamPromotion;
                }
                if (pin.recommendationBoardUid != null)
                {
                    pin1.recommendationBoardUid = pin.recommendationBoardUid;
                    if (pin.recommendationBoard != null)
                    {
                        pin1.cacheRecommendationBoard(pin.recommendationBoard);
                    }
                }
                if (pin.recommendationPinUid != null)
                {
                    pin1.recommendationPinUid = pin.recommendationPinUid;
                    if (pin.recommendationPin != null)
                    {
                        pin1.cacheRecommendationPin(pin.recommendationPin);
                    }
                }
                if (pin.recommendationInterestUid != null)
                {
                    pin1.recommendationInterestUid = pin.recommendationInterestUid;
                    if (pin.recommendationInterest != null)
                    {
                        pin1.cacheRecommendationInterest(pin.recommendationInterest);
                    }
                }
                if (pin.recommendationBlob != null)
                {
                    pin1.recommendationBlob = pin.recommendationBlob;
                }
                if (pin.recommendationReason != null)
                {
                    pin1.recommendationReason = pin.recommendationReason;
                }
                if (pin.source != null)
                {
                    pin1.source = pin.source;
                }
                if (pin.viaUserUid != null)
                {
                    pin1.viaUserUid = pin.viaUserUid;
                    if (pin.viaUser != null)
                    {
                        pin1.cacheViaUser(pin.viaUser);
                    }
                }
                if (pin.attrTitle != null)
                {
                    pin1.attrTitle = pin.attrTitle;
                }
                if (pin.attrProviderName != null)
                {
                    pin1.attrProviderName = pin.attrProviderName;
                }
                if (pin.attrProviderUrl != null)
                {
                    pin1.attrProviderUrl = pin.attrProviderUrl;
                }
                if (pin.attrAuthorName != null)
                {
                    pin1.attrAuthorName = pin.attrAuthorName;
                }
                if (pin.attrAuthorUrl != null)
                {
                    pin1.attrAuthorUrl = pin.attrAuthorUrl;
                }
                if (pin.attrProviderIconUrl != null)
                {
                    pin1.attrProviderIconUrl = pin.attrProviderIconUrl;
                }
                if (pin.imageSquareUrl != null)
                {
                    pin1.imageSquareUrl = pin.imageSquareUrl;
                }
                if (pin.imageMediumUrl != null)
                {
                    pin1.imageMediumUrl = pin.imageMediumUrl;
                }
                if (pin.imageLargeUrl != null)
                {
                    pin1.imageLargeUrl = pin.imageLargeUrl;
                }
                if (pin.embedType != null)
                {
                    pin1.embedType = pin.embedType;
                }
                if (pin.embedUrl != null)
                {
                    pin1.embedUrl = pin.embedUrl;
                }
                if (pin.imageSquareWidth != null)
                {
                    pin1.imageSquareWidth = pin.imageSquareWidth;
                }
                if (pin.imageSquareHeight != null)
                {
                    pin1.imageSquareHeight = pin.imageSquareHeight;
                }
                if (pin.imageMediumWidth != null)
                {
                    pin1.imageMediumWidth = pin.imageMediumWidth;
                }
                if (pin.imageMediumHeight != null)
                {
                    pin1.imageMediumHeight = pin.imageMediumHeight;
                }
                if (pin.imageLargeWidth != null)
                {
                    pin1.imageLargeWidth = pin.imageLargeWidth;
                }
                if (pin.imageLargeHeight != null)
                {
                    pin1.imageLargeHeight = pin.imageLargeHeight;
                }
                if (pin.cinematicPinHeight != null)
                {
                    pin1.cinematicPinHeight = pin.cinematicPinHeight;
                }
                if (pin.cinematicPinWidth != null)
                {
                    pin1.cinematicPinWidth = pin.cinematicPinWidth;
                }
                if (pin.embedWidth != null)
                {
                    pin1.embedWidth = pin.embedWidth;
                }
                if (pin.embedHeight != null)
                {
                    pin1.embedHeight = pin.embedHeight;
                }
                if (pin.repinCount != null)
                {
                    pin1.repinCount = pin.repinCount;
                }
                if (pin.likeCount != null)
                {
                    pin1.likeCount = pin.likeCount;
                }
                if (pin.commentCount != null)
                {
                    pin1.commentCount = pin.commentCount;
                }
                if (pin.repinned != null)
                {
                    pin1.repinned = pin.repinned;
                }
                if (pin.liked != null)
                {
                    pin1.liked = pin.liked;
                }
                if (pin.video != null)
                {
                    pin1.video = pin.video;
                }
                if (pin.dominantColor != null)
                {
                    pin1.dominantColor = pin.dominantColor;
                }
                if (pin.type != null)
                {
                    pin1.type = pin.type;
                }
                if (pin.richTitle != null)
                {
                    pin1.richTitle = pin.richTitle;
                }
                if (pin.richSiteName != null)
                {
                    pin1.richSiteName = pin.richSiteName;
                }
                if (pin.richTypeName != null)
                {
                    pin1.richTypeName = pin.richTypeName;
                }
                if (pin.richIcon != null)
                {
                    pin1.richIcon = pin.richIcon;
                }
                if (pin.canonicalMerchantDomain != null)
                {
                    pin1.canonicalMerchantDomain = pin.canonicalMerchantDomain;
                }
                if (pin.metadataJson != null)
                {
                    pin1.metadataJson = pin.metadataJson;
                    if (pin.metadata != null)
                    {
                        pin1.cacheMetadata(pin.metadata);
                    }
                }
                if (pin.buyableProductJson != null)
                {
                    pin1.buyableProductJson = pin.buyableProductJson;
                    if (pin.buyableProduct != null)
                    {
                        pin1.cacheBuyableProduct(pin.buyableProduct);
                    }
                }
                if (pin.hasPlace != null)
                {
                    pin1.placeUid = pin.placeUid;
                    pin1.hasPlace = pin.hasPlace;
                    if (pin.place != null)
                    {
                        pin1.cachePlace(pin.place);
                    }
                }
                if (pin.hiddenState != null)
                {
                    pin1.hiddenState = pin.hiddenState;
                }
                if (pin.feedbackType != null)
                {
                    pin1.feedbackType = pin.feedbackType;
                }
                if (pin.additionalHideReasons != null)
                {
                    pin1.additionalHideReasons = pin.additionalHideReasons;
                }
                if (pin.viewTags != null)
                {
                    pin1.viewTags = pin.viewTags;
                }
                if (pin.cacheableId != null)
                {
                    pin1.cacheableId = pin.cacheableId;
                }
                if (pin.gallery != null)
                {
                    pin1.gallery = pin.gallery;
                    if (pin._galleryItems != null)
                    {
                        pin1._galleryItems = pin._galleryItems;
                    }
                }
                if (pin.imageSignature != null)
                {
                    pin1.imageSignature = pin.imageSignature;
                }
                if (pin.aggregatedPinDataUid != null)
                {
                    pin1.aggregatedPinDataUid = pin.aggregatedPinDataUid;
                    if (pin.aggregatedPinData != null)
                    {
                        pin1.cacheAggregatedPinData(pin.aggregatedPinData);
                    }
                }
                if (pin.editedFields != null)
                {
                    pin1.editedFields = pin.editedFields;
                }
                if (pin.editedFieldSet != null)
                {
                    pin1.editedFieldSet = pin.editedFieldSet;
                }
                return pin1;
            }
        }
        return pin2;
    }

    public static List mergeAll(List list, List list1)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            Pin pin = (Pin)iterator.next();
            int i = list1.indexOf(pin);
            if (i != -1)
            {
                list = (Pin)list1.get(i);
            } else
            {
                list = null;
            }
            arraylist.add(merge(pin, list));
        }
        return arraylist;
    }

    private static void setRecommendations(Pin pin, PinArtifact pinartifact, PinterestJsonObject pinterestjsonobject, boolean flag)
    {
        if (pinterestjsonobject != null)
        {
            pin.setRecommendationBlob(pinterestjsonobject.toString());
            pin.setRecommendationReason(pinterestjsonobject.a("reason", ""));
            if (!ModelHelper.isValid(pin.getRecommendationReason()))
            {
                pin.setRecommendationReason(null);
            }
            Object obj = pinterestjsonobject.c("board");
            if (obj != null)
            {
                obj = Board.make(((PinterestJsonObject) (obj)), false, flag).getBoard();
                pin.setRecommendationBoardUid(((Board) (obj)).getUid());
                pin.cacheRecommendationBoard(((Board) (obj)));
                pinartifact.setRecommendationBoard(((Board) (obj)));
            }
            obj = pinterestjsonobject.c("pin");
            if (obj != null)
            {
                obj = make(((PinterestJsonObject) (obj)), false, flag).getPin();
                pin.setRecommendationPinUid(((Pin) (obj)).getUid());
                pin.cacheRecommendationPin(((Pin) (obj)));
                pinartifact.setRecommendationPin(((Pin) (obj)));
            }
            pinterestjsonobject = pinterestjsonobject.c("interest");
            if (pinterestjsonobject != null)
            {
                pinterestjsonobject = Interest.make(pinterestjsonobject, false);
                pin.setRecommendationInterestUid(pinterestjsonobject.getUid());
                pin.cacheRecommendationInterest(pinterestjsonobject);
                pinartifact.setRecommendationInterest(pinterestjsonobject);
            }
        }
    }

    public void cacheAggregatedPinData(AggregatedPinData aggregatedpindata)
    {
        aggregatedPinData = aggregatedpindata;
    }

    public void cacheBoard(Board board1)
    {
        board = board1;
    }

    public void cacheBuyableProduct(BuyableProduct buyableproduct)
    {
        buyableProduct = buyableproduct;
    }

    public void cacheDomainObj(Domain domain1)
    {
        domainObj = domain1;
    }

    public void cacheInterest(Interest interest1)
    {
        interest = interest1;
    }

    public void cacheMetadata(PinMetadata pinmetadata)
    {
        metadata = pinmetadata;
    }

    public void cachePinnedToBoard(Board board1)
    {
        pinnedToBoard = board1;
    }

    public void cachePlace(Place place1)
    {
        place = place1;
    }

    public void cachePromoterUser(User user1)
    {
        promoterUser = user1;
    }

    public void cacheRecommendationBoard(Board board1)
    {
        recommendationBoard = board1;
    }

    public void cacheRecommendationInterest(Interest interest1)
    {
        recommendationInterest = interest1;
    }

    public void cacheRecommendationPin(Pin pin)
    {
        recommendationPin = pin;
    }

    public void cacheUser(User user1)
    {
        user = user1;
    }

    public void cacheViaUser(User user1)
    {
        viaUser = user1;
    }

    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof Pin))
        {
            return false;
        }
        return ((Pin)obj).getUid().equals(getUid()) || ((Pin)obj).getCacheableId() != null && ((Pin)obj).getCacheableId().equals(getCacheableId());
    }

    public String getAdditionalHideReasons()
    {
        return additionalHideReasons;
    }

    public AggregatedPinData getAggregatedPinData()
    {
        if (aggregatedPinData == null)
        {
            aggregatedPinData = ModelHelper.getAggregatedPinData(getAggregatedPinDataUid());
        }
        return aggregatedPinData;
    }

    public String getAggregatedPinDataUid()
    {
        return aggregatedPinDataUid;
    }

    public String getAttrAuthorName()
    {
        return attrAuthorName;
    }

    public String getAttrAuthorUrl()
    {
        return attrAuthorUrl;
    }

    public String getAttrProviderIconUrl()
    {
        return attrProviderIconUrl;
    }

    public String getAttrProviderName()
    {
        return attrProviderName;
    }

    public String getAttrProviderUrl()
    {
        return attrProviderUrl;
    }

    public String getAttrTitle()
    {
        return attrTitle;
    }

    public String getAttrUrl()
    {
        if (ModelHelper.isValid(attrAuthorUrl))
        {
            return attrAuthorUrl;
        } else
        {
            return attrProviderUrl;
        }
    }

    public String getAttribution()
    {
        return getAttributionHtml().toString();
    }

    public Spanned getAttributionHtml()
    {
        if (hasAttribution())
        {
            if (ModelHelper.isValid(getAttrAuthorName()))
            {
                return Html.fromHtml(String.format(Resources.string(0x7f070402, new Object[] {
                    "<b>%s</b>", "<b>%s</b>"
                }), new Object[] {
                    getAttrAuthorName(), getAttrProviderName()
                }));
            } else
            {
                return Html.fromHtml(String.format(Resources.string(0x7f070403, new Object[] {
                    "<b>%s</b>"
                }), new Object[] {
                    getAttrProviderName()
                }));
            }
        } else
        {
            return Html.fromHtml("");
        }
    }

    public Board getBoard()
    {
        if (board == null || !board.getUid().equals(getBoardUid()))
        {
            board = ModelHelper.getBoard(getBoardUid());
        }
        return board;
    }

    public String getBoardUid()
    {
        return boardUid;
    }

    public BuyableProduct getBuyableProduct()
    {
        if (buyableProduct == null && ModelHelper.isValid(getBuyableProductJson()))
        {
            buyableProduct = BuyableProduct.make(new PinterestJsonObject(getBuyableProductJson()));
        }
        return buyableProduct;
    }

    public String getBuyableProductJson()
    {
        return buyableProductJson;
    }

    public Date getCacheExpirationDate()
    {
        return cacheExpirationDate;
    }

    public String getCacheableId()
    {
        return cacheableId;
    }

    public String getCanonicalMerchantDomain()
    {
        return canonicalMerchantDomain;
    }

    public String getCinematicCoverSrc()
    {
        return _cinematicCoverSrc;
    }

    public Integer getCinematicPinHeight()
    {
        return cinematicPinHeight;
    }

    public Integer getCinematicPinWidth()
    {
        return cinematicPinWidth;
    }

    public String getCinematicSrc()
    {
        return cinematicSrc;
    }

    public String getCleanDescription()
    {
        return cleanDescription;
    }

    public String getClickThroughUrl()
    {
        if (!StringUtils.isBlank(getMobileLink()))
        {
            return getMobileLink();
        }
        if (!StringUtils.isBlank(getLink()))
        {
            return getLink();
        }
        if (!StringUtils.isBlank(getImageLargeUrl()))
        {
            return getImageLargeUrl();
        } else
        {
            return getImageMediumUrl();
        }
    }

    public int getCloseUpImageHeight()
    {
        if (getImageLargeHeight().intValue() > 2048)
        {
            return getImageMediumHeight().intValue();
        } else
        {
            return getImageLargeHeight().intValue();
        }
    }

    public String getCloseUpImageUrl()
    {
        if (getImageLargeHeight().intValue() > 2048)
        {
            return getImageMediumUrl();
        } else
        {
            return getImageLargeUrl();
        }
    }

    public int getCloseUpImageWidth()
    {
        if (getImageLargeHeight().intValue() > 2048)
        {
            return getImageMediumWidth().intValue();
        } else
        {
            return getImageLargeWidth().intValue();
        }
    }

    public Integer getCommentCount()
    {
        return commentCount;
    }

    public int getCommentCountDisplay()
    {
        if (commentCount == null || commentCount.intValue() <= 0)
        {
            return 0;
        } else
        {
            return commentCount.intValue();
        }
    }

    public List getComments()
    {
        return ModelHelper.getPinComments(id);
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public String getDescription()
    {
        return description;
    }

    public String getDomain()
    {
        return domain;
    }

    public Domain getDomainObj()
    {
        if (domainObj == null || !domainObj.getUid().equals(getDomainUid()))
        {
            domainObj = ModelHelper.getDomain(getDomainUid());
        }
        return domainObj;
    }

    public String getDomainUid()
    {
        return domainUid;
    }

    public String getDominantColor()
    {
        return dominantColor;
    }

    public String getEditedFields()
    {
        return editedFields;
    }

    public Integer getEmbedHeight()
    {
        return embedHeight;
    }

    public String getEmbedType()
    {
        return embedType;
    }

    public String getEmbedUrl()
    {
        return embedUrl;
    }

    public Integer getEmbedWidth()
    {
        return embedWidth;
    }

    public PinFeedbackState getFeedbackState()
    {
        return _feedbackState;
    }

    public Integer getFeedbackType()
    {
        return feedbackType;
    }

    public String getGallery()
    {
        return gallery;
    }

    public List getGalleryItems()
    {
        ArrayList arraylist;
        boolean flag;
        arraylist = new ArrayList();
        GalleryItem galleryitem = new GalleryItem();
        galleryitem.setPin(this);
        galleryitem.setImageSignature(getImageSignature());
        galleryitem.setLargeImage(getImageLargeUrl(), getImageLargeWidth(), getImageLargeHeight());
        galleryitem.setMediumImage(getImageMediumUrl(), getImageMediumWidth(), getImageMediumHeight());
        arraylist.add(galleryitem);
        flag = ImageUtils.isBigImage(getImageLargeWidth(), getImageLargeHeight());
        if (_galleryItems != null || flag) goto _L2; else goto _L1
_L1:
        if (!CommerceHelper.isCommerceEnabled()) goto _L4; else goto _L3
_L3:
        Object obj1 = getBuyableProduct();
        if (obj1 != null && ((BuyableProduct) (obj1)).getVariants() != null && !((BuyableProduct) (obj1)).getVariants().isEmpty())
        {
            Object obj = new ArrayList();
            for (obj1 = ((BuyableProduct) (obj1)).getVariants().iterator(); ((Iterator) (obj1)).hasNext();)
            {
                Iterator iterator = ((BuyableProduct.Variant)((Iterator) (obj1)).next()).getImages().iterator();
                while (iterator.hasNext()) 
                {
                    GalleryItem galleryitem3 = (GalleryItem)iterator.next();
                    if (!galleryitem3.getImageSignature().equals(getImageSignature()) && !((List) (obj)).contains(galleryitem3))
                    {
                        ((List) (obj)).add(galleryitem3);
                    }
                }
            }

            _galleryItems = new ArrayList();
            GalleryItem galleryitem1;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); _galleryItems.add(galleryitem1))
            {
                galleryitem1 = (GalleryItem)((Iterator) (obj)).next();
                galleryitem1.setPin(this);
            }

        }
          goto _L2
_L4:
        if (getGallery() == null) goto _L2; else goto _L5
_L5:
        PinterestJsonArray pinterestjsonarray = new PinterestJsonArray(getGallery());
        if (pinterestjsonarray.a() <= 0) goto _L2; else goto _L6
_L6:
        int i;
        _galleryItems = new ArrayList();
        i = 0;
_L11:
        if (i >= pinterestjsonarray.a()) goto _L2; else goto _L7
_L7:
        GalleryItem galleryitem2;
        galleryitem2 = GalleryItem.make(pinterestjsonarray.c(i));
        galleryitem2.setPin(this);
        if (!ImageUtils.isBigImage(galleryitem2.getLargeWidth(), galleryitem2.getLargeHeight())) goto _L9; else goto _L8
_L8:
        _galleryItems.clear();
_L2:
        if (_galleryItems != null && !_galleryItems.isEmpty())
        {
            arraylist.addAll(_galleryItems);
        }
        return arraylist;
_L9:
        _galleryItems.add(galleryitem2);
        i++;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public Boolean getHasPlace()
    {
        return hasPlace;
    }

    public Integer getHiddenState()
    {
        return hiddenState;
    }

    public Long getId()
    {
        return id;
    }

    public Integer getImageLargeHeight()
    {
        return imageLargeHeight;
    }

    public String getImageLargeUrl()
    {
        return imageLargeUrl;
    }

    public Integer getImageLargeWidth()
    {
        return imageLargeWidth;
    }

    public Integer getImageMediumHeight()
    {
        return imageMediumHeight;
    }

    public String getImageMediumUrl()
    {
        return imageMediumUrl;
    }

    public Integer getImageMediumWidth()
    {
        return imageMediumWidth;
    }

    public String getImagePreferredUrl()
    {
        if (ImageUtils.isBigImage(getImageLargeWidth(), getImageLargeHeight()))
        {
            return getImageMediumUrl();
        } else
        {
            return getImageLargeUrl();
        }
    }

    public String getImageSignature()
    {
        return imageSignature;
    }

    public Integer getImageSquareHeight()
    {
        return imageSquareHeight;
    }

    public String getImageSquareUrl()
    {
        return imageSquareUrl;
    }

    public Integer getImageSquareWidth()
    {
        return imageSquareWidth;
    }

    public String getInsertionId()
    {
        return insertionId;
    }

    public Interest getInterest()
    {
        if (interest == null || !interest.getUid().equals(getInterestUid()))
        {
            interest = ModelHelper.getInterest(getInterestUid());
        }
        return interest;
    }

    public String getInterestUid()
    {
        return interestUid;
    }

    public Boolean getIsCinematic()
    {
        return isCinematic;
    }

    public Boolean getIsDownstreamPromotion()
    {
        return isDownstreamPromotion;
    }

    public boolean getIsDynamicallyInserted()
    {
        return _isDynamicallyInserted;
    }

    public Boolean getIsPromoted()
    {
        return isPromoted;
    }

    public Integer getLikeCount()
    {
        return likeCount;
    }

    public int getLikeCountDisplay()
    {
        if (likeCount == null || likeCount.intValue() <= 0)
        {
            return 0;
        } else
        {
            return likeCount.intValue();
        }
    }

    public Boolean getLiked()
    {
        return liked;
    }

    public String getLink()
    {
        return link;
    }

    public HashMap getLoggingAuxData()
    {
        return getLoggingAuxData(-1);
    }

    public HashMap getLoggingAuxData(int i)
    {
        HashMap hashmap1 = new HashMap(2);
        if (ModelHelper.isValid(getInterestUid()))
        {
            hashmap1.put("interest_id", getInterestUid());
        }
        if (i >= 0)
        {
            hashmap1.put("grid_index", String.valueOf(i));
        }
        HashMap hashmap = hashmap1;
        if (hashmap1.isEmpty())
        {
            hashmap = null;
        }
        return hashmap;
    }

    public PinMetadata getMetadata()
    {
        if (metadata == null && metadataJson != null)
        {
            metadata = PinMetadataFactory.make(this, new PinterestJsonObject(metadataJson));
        }
        return metadata;
    }

    public String getMetadataJson()
    {
        return metadataJson;
    }

    public String getMobileLink()
    {
        return mobileLink;
    }

    public Board getPinnedToBoard()
    {
        if (pinnedToBoard == null && ModelHelper.isValid(getPinnedToBoardUid()))
        {
            pinnedToBoard = ModelHelper.getBoard(getPinnedToBoardUid());
        }
        return pinnedToBoard;
    }

    public String getPinnedToBoardUid()
    {
        return pinnedToBoardUid;
    }

    public String getPinterestLink()
    {
        return String.format("https://pinterest.com/pin/%s/?source_app=android", new Object[] {
            getUid()
        });
    }

    public Place getPlace()
    {
        if (hasPlace == Boolean.TRUE && place == null)
        {
            place = ModelHelper.getPlace(getPlaceUid());
        }
        return place;
    }

    public String getPlaceUid()
    {
        return placeUid;
    }

    public String getPromoterUid()
    {
        return promoterUid;
    }

    public User getPromoterUser()
    {
        if (promoterUser == null)
        {
            promoterUser = ModelHelper.getUser(getPromoterUid());
        }
        return promoterUser;
    }

    public String getRecommendationBlob()
    {
        return recommendationBlob;
    }

    public Board getRecommendationBoard()
    {
        if (recommendationBoard == null || !recommendationBoard.getUid().equals(getRecommendationBoardUid()))
        {
            recommendationBoard = ModelHelper.getBoard(getRecommendationBoardUid());
        }
        return recommendationBoard;
    }

    public String getRecommendationBoardUid()
    {
        return recommendationBoardUid;
    }

    public Interest getRecommendationInterest()
    {
        if (recommendationInterest == null || !recommendationInterest.getUid().equals(getRecommendationInterestUid()))
        {
            recommendationInterest = ModelHelper.getInterest(getRecommendationInterestUid());
        }
        return recommendationInterest;
    }

    public String getRecommendationInterestUid()
    {
        return recommendationInterestUid;
    }

    public String getRecommendationMessage()
    {
        if (promoterUid != null)
        {
            return STR_PROMOTED;
        }
        if (recommendationReason == null || isFollowedInterestOrLocalPin())
        {
            return null;
        } else
        {
            return STR_RELATED;
        }
    }

    public Pin getRecommendationPin()
    {
        if (recommendationPin == null || !recommendationPin.getUid().equals(getRecommendationPinUid()))
        {
            recommendationPin = ModelHelper.getPin(getRecommendationPinUid());
        }
        return recommendationPin;
    }

    public String getRecommendationPinUid()
    {
        return recommendationPinUid;
    }

    public String getRecommendationReason()
    {
        return recommendationReason;
    }

    public Pin getRelatedParentPin()
    {
        return _relatedParentPin;
    }

    public Integer getRepinCount()
    {
        return repinCount;
    }

    public int getRepinCountDisplay()
    {
        if (repinCount == null || repinCount.intValue() <= 0)
        {
            return 0;
        } else
        {
            return repinCount.intValue();
        }
    }

    public Boolean getRepinned()
    {
        return repinned;
    }

    public String getRichIcon()
    {
        return richIcon;
    }

    public String getRichSiteName()
    {
        return richSiteName;
    }

    public String getRichTitle()
    {
        return richTitle;
    }

    public String getRichTypeName()
    {
        return richTypeName;
    }

    public String getSeoDescription()
    {
        return seoDescription;
    }

    public String getSource()
    {
        return source;
    }

    public ArrayList getSpanWords()
    {
        return _spanWords;
    }

    public SpannableString getSpannable()
    {
        return _spannable;
    }

    public SpannableString getSpannableShort()
    {
        return _spannableShort;
    }

    public String getType()
    {
        return type;
    }

    public String getUid()
    {
        return uid;
    }

    public User getUser()
    {
        if (user == null)
        {
            user = ModelHelper.getUser(getUserUid());
        }
        return user;
    }

    public String getUserUid()
    {
        return userUid;
    }

    public User getViaUser()
    {
        if (viaUser == null)
        {
            viaUser = ModelHelper.getUser(getViaUserUid());
        }
        return viaUser;
    }

    public String getViaUserUid()
    {
        return viaUserUid;
    }

    public Boolean getVideo()
    {
        return video;
    }

    public String getViewTags()
    {
        return viewTags;
    }

    public boolean hasArticleMetadata()
    {
        return getMetadata() != null && (getMetadata() instanceof Article);
    }

    public boolean hasAttribution()
    {
        return getAttrTitle() != null || getAttrAuthorName() != null || getAttrAuthorUrl() != null || getAttrProviderName() != null || getAttrProviderUrl() != null;
    }

    public boolean hasHashtag()
    {
        return _spannable != null;
    }

    public boolean hasMetadata()
    {
        return hasMovieMetadata() || hasProductMetadata() || hasRecipeMetadata() || hasArticleMetadata();
    }

    public boolean hasMovieMetadata()
    {
        return getMetadata() != null && (getMetadata() instanceof Movie);
    }

    public boolean hasPlaceGridData()
    {
        Place place1 = getPlace();
        return place1 != null && ModelHelper.isValid(place1.getSourceName());
    }

    public boolean hasProductMetadata()
    {
        return getMetadata() != null && (getMetadata() instanceof Product);
    }

    public boolean hasRecipeMetadata()
    {
        return getMetadata() != null && (getMetadata() instanceof Recipe);
    }

    public boolean hasRichPinGridData()
    {
        if ((metadata instanceof BoostablePinMetadata) && ((BoostablePinMetadata)metadata).isFromAggregatedData().booleanValue())
        {
            return false;
        }
        return StringUtils.isNotEmpty(getRichTypeName()) && LAUNCHED_RICH_PIN_TYPES.containsKey(getRichTypeName()) && ModelHelper.isValid(getRichIcon()) && ModelHelper.isValid(getRichSiteName());
    }

    public boolean isAdditionalReason(int i)
    {
        if (StringUtils.isEmpty(additionalHideReasons))
        {
            return false;
        }
        if (addtionalReasonSet != null)
        {
            addtionalReasonSet = new HashSet();
            String as[] = additionalHideReasons.split(",");
            int k = as.length;
            int j = 0;
            while (j < k) 
            {
                String s = as[j];
                try
                {
                    addtionalReasonSet.add(Integer.valueOf(s));
                }
                catch (Exception exception)
                {
                    CrashReporting.a(exception);
                }
                j++;
            }
        }
        return addtionalReasonSet.contains(Integer.valueOf(i));
    }

    public boolean isAlcoholAds()
    {
        return isAdditionalReason(RecommendationComplaintReason.DO_NOT_WANT_ALCOHOL_ADS.getValue());
    }

    public boolean isCSR()
    {
        return StringUtils.equals(type, "csr");
    }

    public boolean isDuplicated()
    {
        return getUserUid().equals(MyUser.getUid()) || getPinnedToBoard() != null;
    }

    public boolean isFollowedInterestOrLocalPin()
    {
        return "FOLLOWED_INTEREST".equals(recommendationReason) || "RECOMMENDED_LOCAL_PIN".equals(recommendationReason);
    }

    public boolean isGif()
    {
        return getEmbedType() != null && getEmbedType().equals("gif");
    }

    public boolean isSecret()
    {
        if (getBoard() != null)
        {
            return Constants.isTrue(getBoard().getSecret());
        } else
        {
            return false;
        }
    }

    public boolean isValidRecommendation()
    {
        return ModelHelper.isValid(getRecommendationBoardUid()) || ModelHelper.isValid(getRecommendationPinUid()) || ModelHelper.isValid(getRecommendationInterestUid());
    }

    public void setAdditionalHideReasons(String s)
    {
        additionalHideReasons = s;
    }

    public void setAggregatedPinDataUid(String s)
    {
        aggregatedPinDataUid = s;
    }

    public void setAttrAuthorName(String s)
    {
        attrAuthorName = s;
    }

    public void setAttrAuthorUrl(String s)
    {
        attrAuthorUrl = s;
    }

    public void setAttrProviderIconUrl(String s)
    {
        attrProviderIconUrl = s;
    }

    public void setAttrProviderName(String s)
    {
        attrProviderName = s;
    }

    public void setAttrProviderUrl(String s)
    {
        attrProviderUrl = s;
    }

    public void setAttrTitle(String s)
    {
        attrTitle = s;
    }

    public void setBoardUid(String s)
    {
        boardUid = s;
    }

    public void setBuyableProductJson(String s)
    {
        buyableProductJson = s;
    }

    public void setCacheExpirationDate(Date date)
    {
        cacheExpirationDate = date;
    }

    public void setCacheableId(String s)
    {
        cacheableId = s;
    }

    public void setCanonicalMerchantDomain(String s)
    {
        canonicalMerchantDomain = s;
    }

    public void setCinematicCoverSrc(String s)
    {
        _cinematicCoverSrc = s;
    }

    public void setCinematicPinHeight(Integer integer)
    {
        cinematicPinHeight = integer;
    }

    public void setCinematicPinWidth(Integer integer)
    {
        cinematicPinWidth = integer;
    }

    public void setCinematicSrc(String s)
    {
        cinematicSrc = s;
    }

    public void setCleanDescription(String s)
    {
        cleanDescription = s;
    }

    public void setCommentCount(Integer integer)
    {
        commentCount = integer;
    }

    public void setCreatedAt(Date date)
    {
        createdAt = date;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setDomain(String s)
    {
        domain = s;
    }

    public void setDomainUid(String s)
    {
        domainUid = s;
    }

    public void setDominantColor(String s)
    {
        dominantColor = s;
    }

    public void setEditedFields(String s)
    {
        editedFields = s;
    }

    public void setEmbedHeight(Integer integer)
    {
        embedHeight = integer;
    }

    public void setEmbedType(String s)
    {
        embedType = s;
    }

    public void setEmbedUrl(String s)
    {
        embedUrl = s;
    }

    public void setEmbedWidth(Integer integer)
    {
        embedWidth = integer;
    }

    public void setFeedbackState(PinFeedbackState pinfeedbackstate)
    {
        _feedbackState = pinfeedbackstate;
    }

    public void setFeedbackType(Integer integer)
    {
        feedbackType = integer;
    }

    public void setGallery(String s)
    {
        gallery = s;
    }

    public void setHasPlace(Boolean boolean1)
    {
        hasPlace = boolean1;
    }

    public void setHiddenState(Integer integer)
    {
        hiddenState = integer;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setImageLargeHeight(Integer integer)
    {
        imageLargeHeight = integer;
    }

    public void setImageLargeUrl(String s)
    {
        imageLargeUrl = s;
    }

    public void setImageLargeWidth(Integer integer)
    {
        imageLargeWidth = integer;
    }

    public void setImageMediumHeight(Integer integer)
    {
        imageMediumHeight = integer;
    }

    public void setImageMediumUrl(String s)
    {
        imageMediumUrl = s;
    }

    public void setImageMediumWidth(Integer integer)
    {
        imageMediumWidth = integer;
    }

    public void setImageSignature(String s)
    {
        imageSignature = s;
    }

    public void setImageSquareHeight(Integer integer)
    {
        imageSquareHeight = integer;
    }

    public void setImageSquareUrl(String s)
    {
        imageSquareUrl = s;
    }

    public void setImageSquareWidth(Integer integer)
    {
        imageSquareWidth = integer;
    }

    public void setInsertionId(String s)
    {
        insertionId = s;
    }

    public void setInterestUid(String s)
    {
        interestUid = s;
    }

    public void setIsCinematic(Boolean boolean1)
    {
        isCinematic = boolean1;
    }

    public void setIsDownstreamPromotion(Boolean boolean1)
    {
        isDownstreamPromotion = boolean1;
    }

    public void setIsDynamicallyInserted(boolean flag)
    {
        _isDynamicallyInserted = flag;
    }

    public void setIsPromoted(Boolean boolean1)
    {
        isPromoted = boolean1;
    }

    public void setLikeCount(Integer integer)
    {
        likeCount = integer;
    }

    public void setLiked(Boolean boolean1)
    {
        liked = boolean1;
    }

    public void setLink(String s)
    {
        link = s;
    }

    public void setMetadataJson(String s)
    {
        metadataJson = s;
    }

    public void setMobileLink(String s)
    {
        mobileLink = s;
    }

    public void setPinnedToBoardUid(String s)
    {
        pinnedToBoardUid = s;
    }

    public void setPlaceUid(String s)
    {
        placeUid = s;
    }

    public void setPromoterUid(String s)
    {
        promoterUid = s;
    }

    public void setRecommendationBlob(String s)
    {
        recommendationBlob = s;
    }

    public void setRecommendationBoardUid(String s)
    {
        recommendationBoardUid = s;
    }

    public void setRecommendationInterestUid(String s)
    {
        recommendationInterestUid = s;
    }

    public void setRecommendationPinUid(String s)
    {
        recommendationPinUid = s;
    }

    public void setRecommendationReason(String s)
    {
        recommendationReason = s;
    }

    public void setRelatedParentPin(Pin pin)
    {
        _relatedParentPin = pin;
    }

    public void setRepinCount(Integer integer)
    {
        repinCount = integer;
    }

    public void setRepinned(Boolean boolean1)
    {
        repinned = boolean1;
    }

    public void setRichIcon(String s)
    {
        richIcon = s;
    }

    public void setRichSiteName(String s)
    {
        richSiteName = s;
    }

    public void setRichTitle(String s)
    {
        richTitle = s;
    }

    public void setRichTypeName(String s)
    {
        richTypeName = s;
    }

    public void setSeoDescription(String s)
    {
        seoDescription = s;
    }

    public void setSource(String s)
    {
        source = s;
    }

    public void setSpannableShort(SpannableString spannablestring)
    {
        _spannableShort = spannablestring;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setUid(String s)
    {
        uid = s;
    }

    public void setUserUid(String s)
    {
        userUid = s;
    }

    public void setViaUserUid(String s)
    {
        viaUserUid = s;
    }

    public void setVideo(Boolean boolean1)
    {
        video = boolean1;
    }

    public void setViewTags(String s)
    {
        viewTags = s;
    }

    public boolean shouldShowPromoterInCloseup()
    {
        return promoterUid != null;
    }

    public boolean shouldShowPromoterInGrid()
    {
        return promoterUid != null && !Constants.isTrue(isDownstreamPromotion);
    }

    public Boolean showMap()
    {
        boolean flag;
        if (hasPlace != null && hasPlace.booleanValue() && GooglePlayServices.isAvailable())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }


    private class _cls2 extends BackgroundTask
    {

        final PinArtifact val$artifact;

        public final void run()
        {
            if (artifact.getPin() != null)
            {
                ModelHelper.setPin(artifact.getPin());
            }
            if (artifact.getBoard() != null)
            {
                ModelHelper.setBoard(artifact.getBoard());
            }
            if (artifact.getRecommendationBoard() != null)
            {
                ModelHelper.setBoard(artifact.getRecommendationBoard());
            }
            if (artifact.getRecommendationPin() != null)
            {
                ModelHelper.setPin(artifact.getRecommendationPin());
            }
            if (artifact.getRecommendationInterest() != null)
            {
                ModelHelper.setInterest(artifact.getRecommendationInterest());
            }
            if (artifact.getUser() != null)
            {
                ModelHelper.setUser(artifact.getUser());
                if (artifact.getUser().getPartner() != null)
                {
                    ModelHelper.setPartner(artifact.getUser().getPartner());
                }
            }
            if (artifact.getPromoterUser() != null)
            {
                ModelHelper.setUser(artifact.getPromoterUser());
                if (artifact.getPromoterUser().getPartner() != null)
                {
                    ModelHelper.setPartner(artifact.getPromoterUser().getPartner());
                }
            }
            if (artifact.getViaUser() != null)
            {
                ModelHelper.setUser(artifact.getViaUser());
                if (artifact.getViaUser().getPartner() != null)
                {
                    ModelHelper.setPartner(artifact.getViaUser().getPartner());
                }
            }
            if (artifact.getPlace() != null)
            {
                ModelHelper.setPlace(artifact.getPlace());
            }
            if (artifact.getDomainObj() != null)
            {
                ModelHelper.setDomain(artifact.getDomainObj());
                if (artifact.getDomainObj() != null)
                {
                    ModelHelper.setUser(artifact.getDomainObj().getOfficialUser());
                }
            }
            if (artifact.getAggregatedPinData() != null)
            {
                ModelHelper.setAggregatedPinData(artifact.getAggregatedPinData());
            }
        }

        _cls2()
        {
            artifact = pinartifact;
            super();
        }
    }


    private class PinArtifact
    {

        private Domain _domainObj;
        private AggregatedPinData aggregatedPinData;
        private Board board;
        private Pin pin;
        private Place place;
        private User promoterUser;
        private Board recommendationBoard;
        private Interest recommendationInterest;
        private Pin recommendationPin;
        private Interest sourceInterest;
        private User user;
        private User viaUser;

        public final AggregatedPinData getAggregatedPinData()
        {
            return aggregatedPinData;
        }

        public final Board getBoard()
        {
            return board;
        }

        public final Domain getDomainObj()
        {
            return _domainObj;
        }

        public final Pin getPin()
        {
            return pin;
        }

        public final Place getPlace()
        {
            return place;
        }

        public final User getPromoterUser()
        {
            return promoterUser;
        }

        public final Board getRecommendationBoard()
        {
            return recommendationBoard;
        }

        public final Interest getRecommendationInterest()
        {
            return recommendationInterest;
        }

        public final Pin getRecommendationPin()
        {
            return recommendationPin;
        }

        public final Interest getSourceInterest()
        {
            return sourceInterest;
        }

        public final User getUser()
        {
            return user;
        }

        public final User getViaUser()
        {
            return viaUser;
        }

        public final void setAggregatedPinData(AggregatedPinData aggregatedpindata)
        {
            aggregatedPinData = aggregatedpindata;
        }

        public final void setBoard(Board board1)
        {
            board = board1;
        }

        public final void setDomainObj(Domain domain1)
        {
            _domainObj = domain1;
        }

        public final void setPin(Pin pin1)
        {
            pin = pin1;
        }

        public final void setPlace(Place place1)
        {
            place = place1;
        }

        public final void setPromoterUser(User user1)
        {
            promoterUser = user1;
        }

        public final void setRecommendationBoard(Board board1)
        {
            recommendationBoard = board1;
        }

        public final void setRecommendationInterest(Interest interest1)
        {
            recommendationInterest = interest1;
        }

        public final void setRecommendationPin(Pin pin1)
        {
            recommendationPin = pin1;
        }

        public final void setSourceInterest(Interest interest1)
        {
            sourceInterest = interest1;
        }

        public final void setUser(User user1)
        {
            user = user1;
        }

        public final void setViaUser(User user1)
        {
            viaUser = user1;
        }

        public PinArtifact()
        {
        }
    }


    private class GalleryItem
    {

        private String _imageSignature;
        private Integer _largeHeight;
        private String _largeUrl;
        private Integer _largeWidth;
        private Integer _mediumHeight;
        private String _mediumUrl;
        private Integer _mediumWidth;
        private Pin _pin;

        public static GalleryItem make(PinterestJsonObject pinterestjsonobject)
        {
            GalleryItem galleryitem = new GalleryItem();
            galleryitem.setImageSignature(pinterestjsonobject.a("image_signature", null));
            PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.c("canonical_images");
            if (Device.shouldLoadBigImages())
            {
                pinterestjsonobject = "736x";
            } else
            {
                pinterestjsonobject = "550x";
            }
            pinterestjsonobject = pinterestjsonobject1.c(pinterestjsonobject);
            galleryitem.setLargeImage(pinterestjsonobject.a("url", ""), Integer.valueOf(pinterestjsonobject.a("width", 0)), Integer.valueOf(pinterestjsonobject.a("height", 0)));
            if (Device.shouldLoadBigImages())
            {
                pinterestjsonobject = "236x";
            } else
            {
                pinterestjsonobject = "200x";
            }
            pinterestjsonobject = pinterestjsonobject1.c(pinterestjsonobject);
            galleryitem.setMediumImage(pinterestjsonobject.a("url", ""), Integer.valueOf(pinterestjsonobject.a("width", 0)), Integer.valueOf(pinterestjsonobject.a("height", 0)));
            return galleryitem;
        }

        public boolean equals(Object obj)
        {
            if (this == obj)
            {
                return true;
            }
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            } else
            {
                obj = (GalleryItem)obj;
                return StringUtils.equals(_imageSignature, ((GalleryItem) (obj))._imageSignature);
            }
        }

        public String getEmbedUrl()
        {
            return getPin().getEmbedUrl();
        }

        public String getImageSignature()
        {
            return _imageSignature;
        }

        public Integer getLargeHeight()
        {
            return _largeHeight;
        }

        public String getLargeUrl()
        {
            return _largeUrl;
        }

        public Integer getLargeWidth()
        {
            return _largeWidth;
        }

        public Integer getMediumHeight()
        {
            return _mediumHeight;
        }

        public String getMediumUrl()
        {
            return _mediumUrl;
        }

        public Integer getMediumWidth()
        {
            return _mediumWidth;
        }

        public Pin getPin()
        {
            if (_pin == null)
            {
                throw new IllegalStateException("Pin needs to be set on a GalleryItem before it is used in the Gallery");
            } else
            {
                return _pin;
            }
        }

        public int hashCode()
        {
            return _imageSignature.hashCode();
        }

        public boolean isGif()
        {
            return getPin().isGif();
        }

        public boolean isVideo()
        {
            return getPin().getVideo() == Boolean.TRUE;
        }

        public void setImageSignature(String s)
        {
            _imageSignature = s;
        }

        public void setLargeImage(String s, Integer integer, Integer integer1)
        {
            _largeUrl = s;
            _largeWidth = integer;
            _largeHeight = integer1;
        }

        public void setMediumImage(String s, Integer integer, Integer integer1)
        {
            _mediumUrl = s;
            _mediumWidth = integer;
            _mediumHeight = integer1;
        }

        public void setPin(Pin pin)
        {
            _pin = pin;
        }

        public GalleryItem()
        {
        }
    }


    private class _cls1 extends HashMap
    {

        _cls1()
        {
            put("article", "");
            put("recipe", "");
            put("product", "");
            put("movie", "");
        }
    }

}
