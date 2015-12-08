// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.catalogue;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import ly.kite.address.Country;
import ly.kite.journey.UserJourneyType;

// Referenced classes of package ly.kite.catalogue:
//            IGroupOrProduct, UnitOfLength, MultipleCurrencyAmount, MultipleDestinationShippingCosts, 
//            Bleed, MultipleUnitSize, BorderF, SingleUnitSize, 
//            SingleCurrencyAmount, SingleDestinationShippingCost

public class Product
    implements Parcelable, IGroupOrProduct
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final float DEFAULT_IMAGE_ASPECT_RATIO = 1F;
    private static final String DESTINATION_CODE_EUROPE = "europe";
    private static final String DESTINATION_CODE_REST_OF_WORLD = "rest_of_world";
    private static final UnitOfLength FALLBACK_UNIT_1;
    private static final UnitOfLength FALLBACK_UNIT_2;
    private static final String LOG_TAG = "Product";
    public static final float MINIMUM_SENSIBLE_SIZE_CENTIMETERS = 0.5F;
    public static final float MINIMUM_SENSIBLE_SIZE_INCHES = 0.2F;
    public static final float MINIMUM_SENSIBLE_SIZE_PIXELS = 10F;
    private String mCode;
    private MultipleCurrencyAmount mCost;
    private String mDescription;
    private URL mHeroImageURL;
    private String mId;
    private float mImageAspectRatio;
    private BorderF mImageBorderF;
    private ArrayList mImageURLList;
    private int mLabelColour;
    private Bleed mMaskBleed;
    private URL mMaskURL;
    private String mName;
    private int mQuantityPerSheet;
    private MultipleDestinationShippingCosts mShippingCosts;
    private MultipleUnitSize mSize;
    private String mType;
    private UserJourneyType mUserJourneyType;

    private Product(Parcel parcel)
    {
        mId = parcel.readString();
        mCode = parcel.readString();
        mName = parcel.readString();
        mDescription = parcel.readString();
        mType = parcel.readString();
        Object obj = parcel.readString();
        int j;
        if (obj != null)
        {
            obj = UserJourneyType.valueOf(((String) (obj)));
        } else
        {
            obj = null;
        }
        mUserJourneyType = ((UserJourneyType) (obj));
        mQuantityPerSheet = parcel.readInt();
        mCost = (MultipleCurrencyAmount)parcel.readParcelable(ly/kite/catalogue/MultipleCurrencyAmount.getClassLoader());
        mShippingCosts = (MultipleDestinationShippingCosts)parcel.readParcelable(ly/kite/catalogue/MultipleDestinationShippingCosts.getClassLoader());
        mHeroImageURL = (URL)parcel.readSerializable();
        mLabelColour = parcel.readInt();
        j = parcel.readInt();
        mImageURLList = new ArrayList();
        for (int i = 0; i < j; i++)
        {
            mImageURLList.add((URL)parcel.readSerializable());
        }

        mMaskURL = (URL)parcel.readSerializable();
        mMaskBleed = (Bleed)parcel.readParcelable(ly/kite/catalogue/Bleed.getClassLoader());
        mSize = (MultipleUnitSize)parcel.readParcelable(ly/kite/catalogue/MultipleUnitSize.getClassLoader());
        mImageAspectRatio = parcel.readFloat();
        mImageBorderF = (BorderF)parcel.readParcelable(ly/kite/catalogue/BorderF.getClassLoader());
    }

    Product(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    Product(String s, String s1, String s2, String s3, int i, UserJourneyType userjourneytype, int j)
    {
        mId = s;
        mCode = s1;
        mName = s2;
        mType = s3;
        mLabelColour = i;
        mUserJourneyType = userjourneytype;
        mQuantityPerSheet = j;
    }

    public static boolean isSensibleSize(SingleUnitSize singleunitsize)
    {
        float f;
        UnitOfLength unitoflength;
        if (singleunitsize == null)
        {
            return false;
        }
        unitoflength = singleunitsize.getUnit();
        f = 1.0F;
    /* anonymous class not found */
    class _anm2 {}

        _cls2..SwitchMap.ly.kite.catalogue.UnitOfLength[unitoflength.ordinal()];
        JVM INSTR tableswitch 1 3: default 48
    //                   1 68
    //                   2 74
    //                   3 80;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_80;
_L5:
        return singleunitsize.getWidth() >= f && singleunitsize.getHeight() >= f;
_L2:
        f = 0.5F;
          goto _L5
_L3:
        f = 0.2F;
          goto _L5
        f = 10F;
          goto _L5
    }

    public boolean containsMultiplePrices()
    {
        return false;
    }

    public int describeContents()
    {
        return 0;
    }

    public BigDecimal getCost(String s)
    {
        SingleCurrencyAmount singlecurrencyamount = mCost.get(s);
        if (singlecurrencyamount == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No cost found for currency ").append(s).toString());
        } else
        {
            return singlecurrencyamount.getAmount();
        }
    }

    public MultipleCurrencyAmount getCost()
    {
        return mCost;
    }

    public SingleCurrencyAmount getCostWithFallback(String s)
    {
        return mCost.getAmountWithFallback(s);
    }

    public SingleCurrencyAmount getCostWithFallback(Locale locale)
    {
        return mCost.getAmountWithFallback(Currency.getInstance(locale));
    }

    public Set getCurrenciesSupported()
    {
        return mCost.getAllCurrencyCodes();
    }

    public String getDescription()
    {
        return mDescription;
    }

    public URL getDisplayImageURL()
    {
        return mHeroImageURL;
    }

    public String getDisplayLabel()
    {
        return mName;
    }

    public int getDisplayLabelColour()
    {
        return mLabelColour;
    }

    public String getDisplayPrice()
    {
        return mCost.getDefaultDisplayAmountWithFallback();
    }

    public String getId()
    {
        return mId;
    }

    public float getImageAspectRatio()
    {
        if (mImageAspectRatio >= 1E-04F)
        {
            return mImageAspectRatio;
        } else
        {
            return 1.0F;
        }
    }

    public BorderF getImageBorder()
    {
        if (mImageBorderF != null)
        {
            return mImageBorderF;
        } else
        {
            return new BorderF();
        }
    }

    public ArrayList getImageURLList()
    {
        return mImageURLList;
    }

    public Bleed getMaskBleed()
    {
        return mMaskBleed;
    }

    public URL getMaskURL()
    {
        return mMaskURL;
    }

    public String getName()
    {
        return mName;
    }

    public int getQuantityPerSheet()
    {
        return mQuantityPerSheet;
    }

    public MultipleCurrencyAmount getShippingCost(Country country)
    {
        country = mShippingCosts.getCost(country);
        if (country != null)
        {
            return country.getCost();
        } else
        {
            return null;
        }
    }

    public MultipleDestinationShippingCosts getShippingCosts()
    {
        return mShippingCosts;
    }

    public SingleUnitSize getSizeWithFallback(UnitOfLength unitoflength)
    {
        unitoflength = mSize.get(unitoflength);
        if (unitoflength == null)
        {
            SingleUnitSize singleunitsize = mSize.get(FALLBACK_UNIT_1);
            unitoflength = singleunitsize;
            if (singleunitsize == null)
            {
                SingleUnitSize singleunitsize1 = mSize.get(FALLBACK_UNIT_2);
                unitoflength = singleunitsize1;
                if (singleunitsize1 == null)
                {
                    SingleUnitSize singleunitsize2 = mSize.get(0);
                    unitoflength = singleunitsize2;
                    if (singleunitsize2 == null)
                    {
                        return null;
                    }
                }
            }
        }
        return unitoflength;
    }

    public List getSortedShippingCosts(Country country)
    {
        List list = mShippingCosts.asList();
    /* block-local class not found */
    class ShippingCostRelevanceComparator {}

        Collections.sort(list, new ShippingCostRelevanceComparator(country));
        return list;
    }

    public UserJourneyType getUserJourneyType()
    {
        return mUserJourneyType;
    }

    Product setCost(MultipleCurrencyAmount multiplecurrencyamount)
    {
        mCost = multiplecurrencyamount;
        return this;
    }

    Product setCreationImage(float f, BorderF borderf)
    {
        mImageAspectRatio = f;
        mImageBorderF = borderf;
        return this;
    }

    public Product setDescription(String s)
    {
        mDescription = s;
        return this;
    }

    Product setImageURLs(URL url, ArrayList arraylist)
    {
        mHeroImageURL = url;
        mImageURLList = arraylist;
        return this;
    }

    Product setLabelColour(int i)
    {
        mLabelColour = i;
        return this;
    }

    Product setMask(URL url, Bleed bleed)
    {
        mMaskURL = url;
        mMaskBleed = bleed;
        return this;
    }

    public void setQuantityPerSheet(int i)
    {
        mQuantityPerSheet = i;
    }

    Product setShippingCosts(MultipleDestinationShippingCosts multipledestinationshippingcosts)
    {
        mShippingCosts = multipledestinationshippingcosts;
        return this;
    }

    Product setSize(MultipleUnitSize multipleunitsize)
    {
        mSize = multipleunitsize;
        return this;
    }

    public String toLogString()
    {
        return toLogString(null);
    }

    public String toLogString(String s)
    {
        Object obj = null;
        StringBuilder stringbuilder = new StringBuilder();
        Object obj1 = stringbuilder.append("Group              : ");
        if (s == null)
        {
            s = "?";
        }
        ((StringBuilder) (obj1)).append(s).append("\n");
        stringbuilder.append("Id                 : ").append(mId).append("\n");
        stringbuilder.append("Code               : ").append(mCode).append("\n");
        stringbuilder.append("Name               : ").append(mName).append("\n");
        stringbuilder.append("Description        : ").append(mDescription).append("\n");
        stringbuilder.append("Type               : ").append(mType).append("\n");
        stringbuilder.append("User Journey Type  : ").append(mUserJourneyType.name()).append("\n");
        stringbuilder.append("Quantity Per Sheet : ").append(mQuantityPerSheet).append("\n");
        stringbuilder.append("Hero Image URL     : ").append(mHeroImageURL.toString()).append("\n");
        stringbuilder.append("  ...").append("\n");
        obj1 = stringbuilder.append("Mask URL           : ");
        if (mMaskURL != null)
        {
            s = mMaskURL.toString();
        } else
        {
            s = null;
        }
        ((StringBuilder) (obj1)).append(s).append("\n");
        obj1 = stringbuilder.append("Mask Bleed         : ");
        if (mMaskBleed != null)
        {
            s = mMaskBleed.toString();
        } else
        {
            s = null;
        }
        ((StringBuilder) (obj1)).append(s).append("\n");
        stringbuilder.append("  ...").append("\n");
        stringbuilder.append("Sizes:").append("\n");
        for (s = mSize.getAll().iterator(); s.hasNext(); stringbuilder.append("  ").append(((SingleUnitSize) (obj1)).getWidth()).append(" x ").append(((SingleUnitSize) (obj1)).getHeight()).append(" ").append(((SingleUnitSize) (obj1)).getUnit().name()).append("\n"))
        {
            obj1 = (SingleUnitSize)s.next();
        }

        obj1 = stringbuilder.append("Image Aspect Ratio : ");
        if (mImageAspectRatio >= 1E-04F)
        {
            s = Float.valueOf(mImageAspectRatio);
        } else
        {
            s = String.valueOf(mImageAspectRatio);
        }
        ((StringBuilder) (obj1)).append(s).append("\n");
        obj1 = stringbuilder.append("Image Border       : ");
        s = obj;
        if (mImageBorderF != null)
        {
            s = mImageBorderF.toString();
        }
        ((StringBuilder) (obj1)).append(s).append("\n");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mId);
        parcel.writeString(mCode);
        parcel.writeString(mName);
        parcel.writeString(mDescription);
        parcel.writeString(mType);
        Object obj;
        if (mUserJourneyType != null)
        {
            obj = mUserJourneyType.name();
        } else
        {
            obj = null;
        }
        parcel.writeString(((String) (obj)));
        parcel.writeInt(mQuantityPerSheet);
        parcel.writeParcelable(mCost, i);
        parcel.writeParcelable(mShippingCosts, i);
        parcel.writeSerializable(mHeroImageURL);
        parcel.writeInt(mLabelColour);
        if (mImageURLList != null)
        {
            parcel.writeInt(mImageURLList.size());
            for (obj = mImageURLList.iterator(); ((Iterator) (obj)).hasNext(); parcel.writeSerializable((URL)((Iterator) (obj)).next())) { }
        } else
        {
            parcel.writeInt(0);
        }
        parcel.writeSerializable(mMaskURL);
        parcel.writeParcelable(mMaskBleed, i);
        parcel.writeParcelable(mSize, i);
        parcel.writeFloat(mImageAspectRatio);
        parcel.writeParcelable(mImageBorderF, i);
    }

    static 
    {
        FALLBACK_UNIT_1 = UnitOfLength.CENTIMETERS;
        FALLBACK_UNIT_2 = UnitOfLength.INCHES;
    }

    /* member class not found */
    class _cls1 {}

}
