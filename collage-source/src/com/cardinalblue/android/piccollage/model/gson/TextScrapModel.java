// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalblue.android.piccollage.view.n;
import com.google.b.h;
import java.lang.reflect.Type;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            BaseScrapModel, FrameModel, TextFormatModel, FontModel

public class TextScrapModel extends BaseScrapModel
    implements h
{
    public static class Creator
        implements android.os.Parcelable.Creator
    {

        public TextScrapModel createFromParcel(Parcel parcel)
        {
            return new TextScrapModel(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public TextScrapModel[] newArray(int i)
        {
            return new TextScrapModel[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public Creator()
        {
        }
    }

    public static class TextModel
        implements Parcelable, h
    {

        public static final android.os.Parcelable.Creator CREATOR = new Creator();
        private String mText;
        private TextFormatModel mTextFormat;

        public TextModel createInstance(Type type)
        {
            return new TextModel();
        }

        public volatile Object createInstance(Type type)
        {
            return createInstance(type);
        }

        public int describeContents()
        {
            return 0;
        }

        public String getText()
        {
            return mText;
        }

        public TextFormatModel getTextFormat()
        {
            return mTextFormat;
        }

        public void setText(String s)
        {
            mText = s;
        }

        public void setTextFormat(TextFormatModel textformatmodel)
        {
            mTextFormat = textformatmodel;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(getText());
            parcel.writeParcelable(getTextFormat(), i);
        }


        private TextModel()
        {
        }

        TextModel(Parcel parcel)
        {
            setText(parcel.readString());
            mTextFormat = (TextFormatModel)parcel.readParcelable(TextFormatModel.CREATOR.getClass().getClassLoader());
        }


        TextModel(n n1)
        {
            setText(n1.c());
            setTextFormat(new TextFormatModel(n1));
        }
    }

    public static class TextModel.Creator
        implements android.os.Parcelable.Creator
    {

        public TextModel createFromParcel(Parcel parcel)
        {
            return new TextModel(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public TextModel[] newArray(int i)
        {
            return new TextModel[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public TextModel.Creator()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new Creator();
    private static final int TEXT_DEFAULT_BACKGROUND_COLOR = 0;
    private static final int TEXT_DEFAULT_COLOR = 0xff000000;
    public static final String TEXT_DEFAULT_FONT = "font_Bebas_Neue.ttf";
    private static final int TEXT_DEFAULT_OUTLINE_COLOR = -1;
    private static final boolean TEXT_DEFAULT_OUTLINE_ENABLED = true;
    public static String TYPE_TEXT_SCRAP = "text";
    private TextModel mText;

    private TextScrapModel()
    {
    }

    TextScrapModel(Parcel parcel)
    {
        super(parcel);
        mText = (TextModel)parcel.readParcelable(TextModel.CREATOR.getClass().getClassLoader());
    }

    TextScrapModel(n n)
    {
        super(TYPE_TEXT_SCRAP, n);
        setText(new TextModel(n));
    }

    public static String getDefaultText(Context context)
    {
        return context.getResources().getString(0x7f0702a2);
    }

    public static TextScrapModel newEmptyTextModel(Context context)
    {
        TextScrapModel textscrapmodel = new TextScrapModel();
        textscrapmodel.setScrapType(TYPE_TEXT_SCRAP);
        textscrapmodel.setTransform(new BaseScrapModel.TransformModel(0.0F, 1.0F));
        textscrapmodel.setFrame(new FrameModel(0.0F, 0.0F, 0.0F, 0.0F));
        TextModel textmodel = new TextModel();
        textmodel.setText(context.getResources().getString(0x7f0702a2));
        TextFormatModel textformatmodel = new TextFormatModel();
        context = context.getSharedPreferences("cardinalblue_3", 0);
        int i = context.getInt("text_color", 0xff000000);
        int j = context.getInt("text_background_color", 0);
        String s = context.getString("text_font", "font_Bebas_Neue.ttf");
        int k = context.getInt("text_outline_color", -1);
        boolean flag = context.getBoolean("text_outline_enabled", true);
        textformatmodel.setBorderColor(k | 0xff000000);
        textformatmodel.setBackgroundColor(j);
        textformatmodel.setTextColor(i | 0xff000000);
        textformatmodel.setFont(new FontModel(s, 40));
        textformatmodel.setTextBorder(flag);
        textmodel.setTextFormat(textformatmodel);
        textscrapmodel.setText(textmodel);
        return textscrapmodel;
    }

    public static TextScrapModel newInstance(n n)
    {
        return new TextScrapModel(n);
    }

    public TextScrapModel createInstance(Type type)
    {
        return new TextScrapModel();
    }

    public volatile Object createInstance(Type type)
    {
        return createInstance(type);
    }

    public int describeContents()
    {
        return 0;
    }

    public TextModel getText()
    {
        return mText;
    }

    public void setText(TextModel textmodel)
    {
        mText = textmodel;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(getText(), i);
    }

}
