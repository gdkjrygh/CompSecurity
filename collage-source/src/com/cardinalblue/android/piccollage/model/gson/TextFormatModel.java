// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalblue.android.piccollage.a.e;
import com.cardinalblue.android.piccollage.model.o;
import com.cardinalblue.android.piccollage.view.n;
import com.google.b.h;
import com.google.b.j;
import com.google.b.l;
import com.google.b.r;
import java.lang.reflect.Type;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            IGsonable, ColorModel, FontModel

public class TextFormatModel
    implements Parcelable, IGsonable, h
{
    public static class Creator
        implements android.os.Parcelable.Creator
    {

        public TextFormatModel createFromParcel(Parcel parcel)
        {
            return new TextFormatModel(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public TextFormatModel[] newArray(int i)
        {
            return new TextFormatModel[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public Creator()
        {
        }
    }

    public static class TextFormatModelReaderWriter extends o
    {

        protected TextFormatModel fromA2(l l1, Type type, j j1)
        {
            return fromA3(l1, type, j1);
        }

        protected volatile Object fromA2(l l1, Type type, j j1)
        {
            return fromA2(l1, type, j1);
        }

        protected TextFormatModel fromA3(l l1, Type type, j j1)
        {
            int i = 0;
            if (!l1.j())
            {
                return null;
            }
            Object obj = l1.m();
            l1 = e.b(((com.google.b.o) (obj)), "font");
            if (l1 == null)
            {
                throw new IllegalStateException("TextFormat must have font config");
            }
            l1 = (FontModel)j1.a(l1, com/cardinalblue/android/piccollage/model/gson/FontModel);
            type = (Boolean)j1.a(e.b(((com.google.b.o) (obj)), "shadow"), java/lang/Boolean);
            String s = (String)j1.a(e.b(((com.google.b.o) (obj)), "text_alignment"), java/lang/String);
            ColorModel colormodel = (ColorModel)j1.a(e.b(((com.google.b.o) (obj)), "text_color"), com/cardinalblue/android/piccollage/model/gson/ColorModel);
            ColorModel colormodel1 = (ColorModel)j1.a(e.b(((com.google.b.o) (obj)), "text_background_color"), com/cardinalblue/android/piccollage/model/gson/ColorModel);
            Boolean boolean1 = (Boolean)j1.a(e.b(((com.google.b.o) (obj)), "text_border"), java/lang/Boolean);
            j1 = (ColorModel)j1.a(e.b(((com.google.b.o) (obj)), "text_border_color"), com/cardinalblue/android/piccollage/model/gson/ColorModel);
            obj = new TextFormatModel();
            ((TextFormatModel) (obj)).setFont(l1);
            ((TextFormatModel) (obj)).setShadow(type.booleanValue());
            ((TextFormatModel) (obj)).setTextAlignment(s);
            if (colormodel != null)
            {
                ((TextFormatModel) (obj)).setTextColor(colormodel);
            }
            if (colormodel1 != null)
            {
                ((TextFormatModel) (obj)).setBackgroundColor(colormodel1);
            }
            boolean flag;
            if (boolean1 == null)
            {
                flag = false;
            } else
            {
                flag = boolean1.booleanValue();
            }
            ((TextFormatModel) (obj)).setTextBorder(flag);
            if (j1 != null)
            {
                ((TextFormatModel) (obj)).setBorderColor(j1);
            } else
            {
                if (((TextFormatModel) (obj)).hasTextBorder())
                {
                    i = 0xff000000;
                }
                ((TextFormatModel) (obj)).setBorderColor(i);
            }
            return ((TextFormatModel) (obj));
        }

        protected volatile Object fromA3(l l1, Type type, j j1)
        {
            return fromA3(l1, type, j1);
        }

        protected TextFormatModel fromV5(l l1, Type type, j j1)
        {
            int i = 0;
            if (!l1.j())
            {
                return null;
            }
            Object obj = l1.m();
            l1 = e.b(((com.google.b.o) (obj)), "font");
            if (l1 == null)
            {
                throw new IllegalStateException("TextFormat must have font config");
            }
            l1 = (FontModel)j1.a(l1, com/cardinalblue/android/piccollage/model/gson/FontModel);
            type = (Boolean)j1.a(e.b(((com.google.b.o) (obj)), "shadow"), java/lang/Boolean);
            String s = (String)j1.a(e.b(((com.google.b.o) (obj)), "alignment"), java/lang/String);
            ColorModel colormodel = (ColorModel)j1.a(e.b(((com.google.b.o) (obj)), "color"), com/cardinalblue/android/piccollage/model/gson/ColorModel);
            ColorModel colormodel1 = (ColorModel)j1.a(e.b(((com.google.b.o) (obj)), "background_color"), com/cardinalblue/android/piccollage/model/gson/ColorModel);
            Boolean boolean1 = (Boolean)j1.a(e.b(((com.google.b.o) (obj)), "border"), java/lang/Boolean);
            j1 = (ColorModel)j1.a(e.b(((com.google.b.o) (obj)), "border_color"), com/cardinalblue/android/piccollage/model/gson/ColorModel);
            obj = new TextFormatModel();
            ((TextFormatModel) (obj)).setFont(l1);
            ((TextFormatModel) (obj)).setShadow(type.booleanValue());
            ((TextFormatModel) (obj)).setTextAlignment(s);
            if (colormodel != null)
            {
                ((TextFormatModel) (obj)).setTextColor(colormodel);
            }
            if (colormodel1 != null)
            {
                ((TextFormatModel) (obj)).setBackgroundColor(colormodel1);
            }
            boolean flag;
            if (boolean1 == null)
            {
                flag = false;
            } else
            {
                flag = boolean1.booleanValue();
            }
            ((TextFormatModel) (obj)).setTextBorder(flag);
            if (j1 != null)
            {
                ((TextFormatModel) (obj)).setBorderColor(j1);
            } else
            {
                if (((TextFormatModel) (obj)).hasTextBorder())
                {
                    i = 0xff000000;
                }
                ((TextFormatModel) (obj)).setBorderColor(i);
            }
            return ((TextFormatModel) (obj));
        }

        protected volatile Object fromV5(l l1, Type type, j j1)
        {
            return fromV5(l1, type, j1);
        }

        protected l toA3(TextFormatModel textformatmodel, Type type, r r1)
        {
            type = new com.google.b.o();
            type.a("font", r1.a(textformatmodel.getFont(), com/cardinalblue/android/piccollage/model/gson/FontModel));
            type.a("shadow", r1.a(Boolean.valueOf(textformatmodel.hasShadow()), java/lang/Boolean));
            type.a("text_alignment", r1.a(textformatmodel.getTextAlignment(), java/lang/String));
            type.a("text_color", r1.a(textformatmodel.getTextColorModel(), com/cardinalblue/android/piccollage/model/gson/ColorModel));
            type.a("text_background_color", r1.a(textformatmodel.getTextBackgroundColorModel(), com/cardinalblue/android/piccollage/model/gson/ColorModel));
            type.a("text_border", r1.a(Boolean.valueOf(textformatmodel.hasTextBorder()), java/lang/Boolean));
            type.a("text_border_color", r1.a(textformatmodel.getBorderColorModel(), com/cardinalblue/android/piccollage/model/gson/ColorModel));
            return type;
        }

        protected volatile l toA3(Object obj, Type type, r r1)
        {
            return toA3((TextFormatModel)obj, type, r1);
        }

        protected l toV5(TextFormatModel textformatmodel, Type type, r r1)
        {
            type = new com.google.b.o();
            type.a("font", r1.a(textformatmodel.getFont(), com/cardinalblue/android/piccollage/model/gson/FontModel));
            type.a("shadow", r1.a(Boolean.valueOf(textformatmodel.hasShadow()), java/lang/Boolean));
            type.a("alignment", r1.a(textformatmodel.getTextAlignment(), java/lang/String));
            type.a("color", r1.a(textformatmodel.getTextColorModel(), com/cardinalblue/android/piccollage/model/gson/ColorModel));
            type.a("background_color", r1.a(textformatmodel.getTextBackgroundColorModel(), com/cardinalblue/android/piccollage/model/gson/ColorModel));
            type.a("border", r1.a(Boolean.valueOf(textformatmodel.hasTextBorder()), java/lang/Boolean));
            type.a("border_color", r1.a(textformatmodel.getBorderColorModel(), com/cardinalblue/android/piccollage/model/gson/ColorModel));
            return type;
        }

        protected volatile l toV5(Object obj, Type type, r r1)
        {
            return toV5((TextFormatModel)obj, type, r1);
        }

        public TextFormatModelReaderWriter(CollageRoot.VersionEnum versionenum)
        {
            super(versionenum);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new Creator();
    public static final String JSON_TAG_ALIGNMENT = "alignment";
    public static final String JSON_TAG_BACKGROUND_COLOR = "background_color";
    public static final String JSON_TAG_BORDER = "border";
    public static final String JSON_TAG_BORDER_COLOR = "border_color";
    public static final String JSON_TAG_COLOR = "color";
    public static final String JSON_TAG_FONT = "font";
    public static final String JSON_TAG_SHADOW = "shadow";
    public static final String JSON_TAG_TEXT_ALIGNMENT = "text_alignment";
    public static final String JSON_TAG_TEXT_BACKGROUND_COLOR = "text_background_color";
    public static final String JSON_TAG_TEXT_BORDER = "text_border";
    public static final String JSON_TAG_TEXT_BORDER_COLOR = "text_border_color";
    public static final String JSON_TAG_TEXT_COLOR = "text_color";
    private FontModel mFont;
    private boolean mShadow;
    private String mTextAlignment;
    private ColorModel mTextBackgroundColor;
    private boolean mTextBorder;
    private ColorModel mTextBorderColor;
    private ColorModel mTextColor;

    TextFormatModel()
    {
        mTextColor = new ColorModel(0xff000000);
        mTextBackgroundColor = new ColorModel(0xff000000);
        mTextBorderColor = new ColorModel(0xff000000);
    }

    TextFormatModel(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        mTextColor = new ColorModel(0xff000000);
        mTextBackgroundColor = new ColorModel(0xff000000);
        mTextBorderColor = new ColorModel(0xff000000);
        mFont = (FontModel)parcel.readParcelable(FontModel.CREATOR.getClass().getClassLoader());
        setTextColor((ColorModel)parcel.readParcelable(ColorModel.CREATOR.getClass().getClassLoader()));
        setBackgroundColor((ColorModel)parcel.readParcelable(ColorModel.CREATOR.getClass().getClassLoader()));
        setBorderColor((ColorModel)parcel.readParcelable(ColorModel.CREATOR.getClass().getClassLoader()));
        setTextAlignment(parcel.readString());
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setTextBorder(flag);
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        setShadow(flag);
    }

    TextFormatModel(n n1)
    {
        mTextColor = new ColorModel(0xff000000);
        mTextBackgroundColor = new ColorModel(0xff000000);
        mTextBorderColor = new ColorModel(0xff000000);
        mFont = new FontModel(n1.d(), 40);
        setTextColor(n1.e());
        setBackgroundColor(n1.g());
        setTextAlignment("center");
        setTextBorder(n1.i());
        setBorderColor(n1.h());
        setShadow(false);
    }

    public TextFormatModel createInstance(Type type)
    {
        return new TextFormatModel();
    }

    public volatile Object createInstance(Type type)
    {
        return createInstance(type);
    }

    public int describeContents()
    {
        return 0;
    }

    public ColorModel getBorderColorModel()
    {
        return mTextBorderColor;
    }

    public FontModel getFont()
    {
        return mFont;
    }

    public String getTextAlignment()
    {
        return mTextAlignment;
    }

    public int getTextBackgroundColor()
    {
        return mTextBackgroundColor.getColor();
    }

    public ColorModel getTextBackgroundColorModel()
    {
        return mTextBackgroundColor;
    }

    public int getTextBorderColor()
    {
        return mTextBorderColor.getColor();
    }

    public int getTextColor()
    {
        return mTextColor.getColor();
    }

    public ColorModel getTextColorModel()
    {
        return mTextColor;
    }

    public boolean hasShadow()
    {
        return mShadow;
    }

    public boolean hasTextBorder()
    {
        return mTextBorder;
    }

    public void setBackgroundColor(int i)
    {
        mTextBackgroundColor.setColor(i);
    }

    public void setBackgroundColor(ColorModel colormodel)
    {
        if (colormodel == null)
        {
            throw new IllegalArgumentException("Text background color can't be null");
        } else
        {
            mTextBackgroundColor = colormodel;
            return;
        }
    }

    public void setBorderColor(int i)
    {
        mTextBorderColor.setColor(i);
    }

    public void setBorderColor(ColorModel colormodel)
    {
        if (colormodel == null)
        {
            throw new IllegalArgumentException("Border color can't be null");
        } else
        {
            mTextBorderColor = colormodel;
            return;
        }
    }

    public void setFont(FontModel fontmodel)
    {
        mFont = fontmodel;
    }

    public void setShadow(boolean flag)
    {
        mShadow = flag;
    }

    public void setTextAlignment(String s)
    {
        mTextAlignment = s;
    }

    public void setTextBorder(boolean flag)
    {
        mTextBorder = flag;
    }

    public void setTextColor(int i)
    {
        mTextColor.setColor(i);
    }

    public void setTextColor(ColorModel colormodel)
    {
        if (colormodel == null)
        {
            throw new IllegalArgumentException("Text color can't be null");
        } else
        {
            mTextColor = colormodel;
            return;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeParcelable(mFont, i);
        parcel.writeParcelable(mTextColor, i);
        parcel.writeParcelable(mTextBackgroundColor, i);
        parcel.writeParcelable(mTextBorderColor, i);
        parcel.writeString(mTextAlignment);
        if (mTextBorder)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (mShadow)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
