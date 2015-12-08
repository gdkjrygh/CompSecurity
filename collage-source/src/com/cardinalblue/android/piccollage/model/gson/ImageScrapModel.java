// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalblue.android.piccollage.model.k;
import com.cardinalblue.android.piccollage.view.c;
import com.cardinalblue.android.piccollage.view.g;
import com.cardinalblue.android.piccollage.view.l;
import com.google.b.h;
import java.io.File;
import java.lang.reflect.Type;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            BaseScrapModel, ClippingPathModel, FrameModel, ColorModel, 
//            BundleUrlModel

public class ImageScrapModel extends BaseScrapModel
    implements h
{
    public static class BorderModel
        implements Parcelable, h
    {

        public static final android.os.Parcelable.Creator CREATOR = new Creator();
        private boolean hasShadow;
        private String mBorderType;
        private ColorModel mColor;

        private void setBorderType(String s)
        {
            mBorderType = s;
        }

        public BorderModel createInstance(Type type)
        {
            return new BorderModel();
        }

        public volatile Object createInstance(Type type)
        {
            return createInstance(type);
        }

        public int describeContents()
        {
            return 0;
        }

        public String getBorderType()
        {
            return mBorderType;
        }

        public int getColor()
        {
            return mColor.getColor();
        }

        public boolean isHasBorder()
        {
            return !"none".equals(mBorderType);
        }

        public boolean isHasShadow()
        {
            return hasShadow;
        }

        public void readFromParcel(Parcel parcel)
        {
            boolean flag = true;
            setBorderType(parcel.readString());
            setColor(parcel.readInt());
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            setHasShadow(flag);
        }

        public void setColor(int i)
        {
            mColor.setColor(i);
        }

        public void setHasShadow(boolean flag)
        {
            hasShadow = flag;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            boolean flag = true;
            if (isHasBorder())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            parcel.writeInt(getColor());
            if (isHasShadow())
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
        }


        private BorderModel()
        {
            mColor = new ColorModel(0);
        }

        BorderModel(int i, boolean flag)
        {
            if (i == 0)
            {
                i = 0;
            }
            this(new ColorModel(i), flag);
        }

        BorderModel(Parcel parcel)
        {
            mColor = new ColorModel(0);
            readFromParcel(parcel);
        }

        BorderModel(ColorModel colormodel, boolean flag)
        {
            boolean flag1 = false;
            super();
            mColor = new ColorModel(0);
            if (colormodel.getColor() != 0)
            {
                flag1 = true;
            }
            String s;
            if (flag1)
            {
                s = "solid";
            } else
            {
                s = "none";
            }
            mBorderType = s;
            hasShadow = flag;
            mColor = colormodel;
        }

    }

    public static class BorderModel.Creator
        implements android.os.Parcelable.Creator
    {

        public BorderModel createFromParcel(Parcel parcel)
        {
            return new BorderModel(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public BorderModel[] newArray(int i)
        {
            return new BorderModel[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public BorderModel.Creator()
        {
        }
    }

    public static class Creator
        implements android.os.Parcelable.Creator
    {

        public ImageScrapModel createFromParcel(Parcel parcel)
        {
            return new ImageScrapModel(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ImageScrapModel[] newArray(int i)
        {
            return new ImageScrapModel[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public Creator()
        {
        }
    }

    public static class ImageModel
        implements Parcelable, h
    {

        public static final android.os.Parcelable.Creator CREATOR = new Creator();
        private boolean mIsTile;
        private BundleUrlModel mSourceUrl;
        private String mThumbnailUrl;

        public ImageModel createInstance(Type type)
        {
            return new ImageModel();
        }

        public volatile Object createInstance(Type type)
        {
            return createInstance(type);
        }

        public int describeContents()
        {
            return 0;
        }

        public String getDecodedThumbnailUrl()
        {
            return k.d(mThumbnailUrl);
        }

        public String getSourceUrl()
        {
            if (mSourceUrl != null)
            {
                return mSourceUrl.getUrl();
            } else
            {
                return null;
            }
        }

        public String getThumbnailUrl()
        {
            return mThumbnailUrl;
        }

        public boolean isTile()
        {
            return mIsTile;
        }

        public void readFromParcel(Parcel parcel)
        {
            mSourceUrl = new BundleUrlModel(parcel);
            setThumbnailUrl(parcel.readString());
            boolean flag;
            if (parcel.readInt() == 0)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            setIsTile(Boolean.valueOf(flag));
        }

        public void setIsTile(Boolean boolean1)
        {
            mIsTile = boolean1.booleanValue();
        }

        public void setSourceUrl(String s)
        {
            mSourceUrl.setUrl(s);
        }

        public void setThumbnailFile(File file)
        {
            setThumbnailUrl(k.c(file));
        }

        public void setThumbnailUrl(String s)
        {
            mThumbnailUrl = s;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(getSourceUrl());
            parcel.writeString(getThumbnailUrl());
            if (isTile())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
        }


        private ImageModel()
        {
            mIsTile = false;
        }

        ImageModel(Parcel parcel)
        {
            mIsTile = false;
            readFromParcel(parcel);
        }

        ImageModel(String s, String s1, boolean flag)
        {
            mIsTile = false;
            mSourceUrl = new BundleUrlModel(s);
            mThumbnailUrl = s1;
            mIsTile = flag;
        }
    }

    public static class ImageModel.Creator
        implements android.os.Parcelable.Creator
    {

        public ImageModel createFromParcel(Parcel parcel)
        {
            return new ImageModel(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ImageModel[] newArray(int i)
        {
            return new ImageModel[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public ImageModel.Creator()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ImageScrapModel createFromParcel(Parcel parcel)
        {
            return new ImageScrapModel(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ImageScrapModel[] newArray(int i)
        {
            return new ImageScrapModel[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public static final String JSON_TAG_BORDER = "border";
    public static final String JSON_TAG_CLIPPING_PATH = "clipping_path";
    public static final String JSON_TAG_IMAGE = "image";
    public static final String JSON_TAG_IS_BACKGROUND = "is_background";
    public static final String JSON_TAG_IS_STICKER = "is_sticker";
    public static final String TYPE_IMAGE_SCRAP = "image";
    private boolean isBackground;
    private boolean isSticker;
    private BorderModel mBorder;
    private ClippingPathModel mClippingPath;
    private ImageModel mImage;

    protected ImageScrapModel()
    {
    }

    protected ImageScrapModel(Parcel parcel)
    {
        boolean flag = true;
        super(parcel);
        boolean flag1;
        if (parcel.readByte() != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        isBackground = flag1;
        if (parcel.readByte() != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        isSticker = flag1;
        mImage = (ImageModel)parcel.readParcelable(com/cardinalblue/android/piccollage/model/gson/ImageScrapModel$ImageModel.getClassLoader());
        mBorder = (BorderModel)parcel.readParcelable(com/cardinalblue/android/piccollage/model/gson/ImageScrapModel$BorderModel.getClassLoader());
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        if (flag)
        {
            mClippingPath = (ClippingPathModel)parcel.readParcelable(com/cardinalblue/android/piccollage/model/gson/ClippingPathModel.getClassLoader());
        }
    }

    ImageScrapModel(g g1)
    {
        super("image", g1);
        isBackground = g1 instanceof c;
        isSticker = g1 instanceof l;
        mImage = new ImageModel(g1.i(), g1.l(), g1.j());
        mBorder = new BorderModel(g1.d(), g1.c());
        mClippingPath = g1.r();
    }

    public static ImageScrapModel newBackgroundModel(String s)
    {
        ImageScrapModel imagescrapmodel = new ImageScrapModel();
        imagescrapmodel.setBackground(true);
        imagescrapmodel.setImage(new ImageModel(s, null, false));
        imagescrapmodel.setBorder(new BorderModel());
        imagescrapmodel.setFrame(new FrameModel(-1F, -1F, -1F, -1F));
        imagescrapmodel.setTransform(new BaseScrapModel.TransformModel(0.0F, 1.0F));
        return imagescrapmodel;
    }

    public static ImageScrapModel newInstance(g g1)
    {
        return new ImageScrapModel(g1);
    }

    public ImageScrapModel createInstance(Type type)
    {
        return new ImageScrapModel();
    }

    public volatile Object createInstance(Type type)
    {
        return createInstance(type);
    }

    public int describeContents()
    {
        return 0;
    }

    public BorderModel getBorder()
    {
        return mBorder;
    }

    public ClippingPathModel getClippingPath()
    {
        return mClippingPath;
    }

    public ImageModel getImage()
    {
        return mImage;
    }

    public boolean isBackground()
    {
        return isBackground;
    }

    public boolean isSticker()
    {
        return isSticker;
    }

    public void setBackground(boolean flag)
    {
        isBackground = flag;
    }

    public void setBorder(BorderModel bordermodel)
    {
        mBorder = bordermodel;
    }

    public void setImage(ImageModel imagemodel)
    {
        mImage = imagemodel;
    }

    public void setSticker(boolean flag)
    {
        isSticker = flag;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        int j = 1;
        super.writeToParcel(parcel, i);
        byte byte0;
        if (isBackground)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (isSticker)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        parcel.writeParcelable(mImage, i);
        parcel.writeParcelable(mBorder, i);
        if (mClippingPath == null)
        {
            j = 0;
        }
        parcel.writeInt(j);
        if (mClippingPath != null)
        {
            parcel.writeParcelable(mClippingPath, i);
        }
    }

}
