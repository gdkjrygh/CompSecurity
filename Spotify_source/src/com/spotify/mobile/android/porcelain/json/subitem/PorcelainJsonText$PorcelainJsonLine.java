// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.subitem;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;
import dsc;
import gdf;

public class STYLE_PARSER
    implements Parcelable, JacksonModel, dsc
{

    public static final android.os.ne.mFormat CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            String s = parcel.readString();
            com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font font = com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.values()[parcel.readInt()];
            return new PorcelainJsonText.PorcelainJsonLine(s, com.spotify.mobile.android.porcelain.subitem.PorcelainText.Format.values()[parcel.readInt()], font);
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonText.PorcelainJsonLine[i];
        }

    };
    private static final gdf FORMAT_PARSER = gdf.a(com/spotify/mobile/android/porcelain/subitem/PorcelainText$Format);
    private static final String KEY_FONT = "font";
    private static final String KEY_FORMAT = "format";
    private static final String KEY_TEXT = "text";
    private static final gdf STYLE_PARSER = gdf.a(com/spotify/mobile/android/porcelain/subitem/PorcelainText$Font);
    private CharSequence mAsHtml;
    private final com.spotify.mobile.android.porcelain.subitem.Line mFont;
    private final com.spotify.mobile.android.porcelain.subitem.Line mFormat;
    private final String mText;

    public CharSequence asHtml()
    {
        if (mAsHtml == null)
        {
            boolean flag;
            if (mFormat == com.spotify.mobile.android.porcelain.subitem.Line.mFormat)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ctz.b(flag, "Format is not HTML!");
            mAsHtml = Html.fromHtml(getText());
        }
        return mAsHtml;
    }

    public int describeContents()
    {
        return 0;
    }

    public com.spotify.mobile.android.porcelain.subitem.Line getFont()
    {
        return mFont;
    }

    public com.spotify.mobile.android.porcelain.subitem.Line getFormat()
    {
        return mFormat;
    }

    public String getText()
    {
        return mText;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mText);
        parcel.writeInt(mFont.mFont());
        parcel.writeInt(mFormat.mFormat());
    }


    public _cls1(String s, com.spotify.mobile.android.porcelain.subitem.Line line, com.spotify.mobile.android.porcelain.subitem.Line line1)
    {
        mText = (String)ctz.a(s);
        mFont = (com.spotify.mobile.android.porcelain.subitem.Line.mFont)ctz.a(line1);
        mFormat = (com.spotify.mobile.android.porcelain.subitem.Line.mFormat)ctz.a(line);
    }

    mFormat(String s, String s1, String s2)
    {
        this(s, (com.spotify.mobile.android.porcelain.subitem.Line)FORMAT_PARSER.a(s1).a(com.spotify.mobile.android.porcelain.subitem.Line.FORMAT_PARSER), (com.spotify.mobile.android.porcelain.subitem.Line.FORMAT_PARSER)STYLE_PARSER.a(s2).a(com.spotify.mobile.android.porcelain.subitem.Line.STYLE_PARSER));
    }
}
