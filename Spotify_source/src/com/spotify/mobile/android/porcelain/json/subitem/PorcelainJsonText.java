// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.subitem;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.porcelain.subitem.PorcelainText;
import ctz;
import dsc;

public class PorcelainJsonText
    implements Parcelable, JacksonModel, PorcelainText
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new PorcelainJsonText((PorcelainJsonLine[])parcel.createTypedArray(PorcelainJsonLine.CREATOR));
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonText[i];
        }


        private class PorcelainJsonLine
            implements Parcelable, JacksonModel, dsc
        {

            public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                public final Object createFromParcel(Parcel parcel)
                {
                    String s = parcel.readString();
                    com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font font = com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.values()[parcel.readInt()];
                    return new PorcelainJsonLine(s, com.spotify.mobile.android.porcelain.subitem.PorcelainText.Format.values()[parcel.readInt()], font);
                }

                public final volatile Object[] newArray(int i)
                {
                    return new PorcelainJsonLine[i];
                }

            };
            private static final gdf FORMAT_PARSER = gdf.a(com/spotify/mobile/android/porcelain/subitem/PorcelainText$Format);
            private static final String KEY_FONT = "font";
            private static final String KEY_FORMAT = "format";
            private static final String KEY_TEXT = "text";
            private static final gdf STYLE_PARSER = gdf.a(com/spotify/mobile/android/porcelain/subitem/PorcelainText$Font);
            private CharSequence mAsHtml;
            private final com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font mFont;
            private final com.spotify.mobile.android.porcelain.subitem.PorcelainText.Format mFormat;
            private final String mText;

            public CharSequence asHtml()
            {
                if (mAsHtml == null)
                {
                    boolean flag;
                    if (mFormat == com.spotify.mobile.android.porcelain.subitem.PorcelainText.Format.b)
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

            public com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font getFont()
            {
                return mFont;
            }

            public com.spotify.mobile.android.porcelain.subitem.PorcelainText.Format getFormat()
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
                parcel.writeInt(mFont.ordinal());
                parcel.writeInt(mFormat.ordinal());
            }


            public PorcelainJsonLine(String s, com.spotify.mobile.android.porcelain.subitem.PorcelainText.Format format, com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font font)
            {
                mText = (String)ctz.a(s);
                mFont = (com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font)ctz.a(font);
                mFormat = (com.spotify.mobile.android.porcelain.subitem.PorcelainText.Format)ctz.a(format);
            }

            PorcelainJsonLine(String s, String s1, String s2)
            {
                this(s, (com.spotify.mobile.android.porcelain.subitem.PorcelainText.Format)FORMAT_PARSER.a(s1).a(com.spotify.mobile.android.porcelain.subitem.PorcelainText.Format.c), (com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font)STYLE_PARSER.a(s2).a(com.spotify.mobile.android.porcelain.subitem.PorcelainText.Font.a));
            }
        }

    };
    private static final String KEY_ITEMS = "items";
    private final PorcelainJsonLine mLines[];

    public PorcelainJsonText(PorcelainJsonLine aporcelainjsonline[])
    {
        mLines = (PorcelainJsonLine[])ctz.a(aporcelainjsonline);
        aporcelainjsonline = mLines;
        int j = aporcelainjsonline.length;
        for (int i = 0; i < j; i++)
        {
            ctz.a(aporcelainjsonline[i]);
        }

    }

    public int describeContents()
    {
        return 0;
    }

    public PorcelainJsonLine getLine(int i)
    {
        return mLines[i];
    }

    public volatile dsc getLine(int i)
    {
        return getLine(i);
    }

    public int getLineCount()
    {
        return mLines.length;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeTypedArray(mLines, i);
    }

}
