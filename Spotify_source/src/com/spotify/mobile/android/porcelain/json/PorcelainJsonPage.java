// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.porcelain.PorcelainPage;
import com.spotify.mobile.android.porcelain.json.collection.PorcelainJsonImmutableLinearCollection;
import ctz;
import cuq;
import dot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.porcelain.json:
//            PorcelainJsonSpace

public class PorcelainJsonPage
    implements Parcelable, JacksonModel, PorcelainPage
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            ArrayList arraylist = new ArrayList();
            parcel.readTypedList(arraylist, JsonTab.CREATOR);
            return new PorcelainJsonPage(arraylist, null, (PorcelainJsonPageHeader)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/PorcelainJsonPage$PorcelainJsonPageHeader.getClassLoader()), parcel.readString());
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonPage[i];
        }


        private class PorcelainJsonPageHeader
            implements Parcelable, JacksonModel, com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader
        {

            public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                public final Object createFromParcel(Parcel parcel)
                {
                    String s = parcel.readString();
                    String s1 = parcel.readString();
                    return new PorcelainJsonPageHeader(parcel.readString(), s, s1, (PorcelainJsonImage)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonImage.getClassLoader()), (PorcelainJsonButton)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/subitem/PorcelainJsonButton.getClassLoader()), com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader.Style.values()[parcel.readInt()]);
                }

                public final volatile Object[] newArray(int i)
                {
                    return new PorcelainJsonPageHeader[i];
                }

            };
            public static final String KEY_BACKGROUND = "background";
            public static final String KEY_BUTTON = "button";
            public static final String KEY_IMAGE = "image";
            public static final String KEY_STYLE = "style";
            public static final String KEY_SUBTITLE = "subtitle";
            public static final String KEY_TITLE = "title";
            private static final gdf STYLE_PARSER = gdf.a(com/spotify/mobile/android/porcelain/PorcelainPage$PorcelainPageHeader$Style);
            private final String mBackground;
            private final PorcelainJsonButton mButton;
            private final PorcelainJsonImage mImage;
            private final com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader.Style mStyle;
            private final String mSubtitle;
            private final String mTitle;

            public int describeContents()
            {
                return 0;
            }

            public String getBackground()
            {
                return mBackground;
            }

            public PorcelainJsonButton getButton()
            {
                return mButton;
            }

            public volatile drv getButton()
            {
                return getButton();
            }

            public PorcelainImage getImage()
            {
                return mImage;
            }

            public com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader.Style getStyle()
            {
                return mStyle;
            }

            public CharSequence getSubtitle()
            {
                return mSubtitle;
            }

            public CharSequence getTitle()
            {
                return mTitle;
            }

            public void writeToParcel(Parcel parcel, int i)
            {
                parcel.writeString(mTitle);
                parcel.writeString(mSubtitle);
                parcel.writeString(mBackground);
                parcel.writeParcelable(mImage, 0);
                parcel.writeParcelable(mButton, 0);
                parcel.writeInt(mStyle.ordinal());
            }


            PorcelainJsonPageHeader(String s, String s1, String s2, PorcelainJsonImage porcelainjsonimage, PorcelainJsonButton porcelainjsonbutton, com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader.Style style)
            {
                mTitle = s1;
                mSubtitle = s2;
                mBackground = s;
                mImage = porcelainjsonimage;
                mButton = porcelainjsonbutton;
                mStyle = (com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader.Style)ctz.a(style);
            }

            PorcelainJsonPageHeader(String s, String s1, String s2, PorcelainJsonImage porcelainjsonimage, PorcelainJsonButton porcelainjsonbutton, String s3)
            {
                this(s, s1, s2, porcelainjsonimage, porcelainjsonbutton, (com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader.Style)STYLE_PARSER.a(s3).a(com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader.Style.a));
            }
        }

    };
    private static final String KEY_HEADER = "header";
    private static final String KEY_SPACE = "space";
    private static final String KEY_SPACES = "spaces";
    private static final String KEY_TITLE = "title";
    private final PorcelainJsonPageHeader mHeader;
    private final List mSpaces;
    private final String mTitle;

    public PorcelainJsonPage(List list, PorcelainJsonSpace porcelainjsonspace, PorcelainJsonPageHeader porcelainjsonpageheader, String s)
    {
        if (porcelainjsonspace != null)
        {
            boolean flag;
            if (list == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ctz.a(flag, "Can't have both spaces and space set");
            mSpaces = ImmutableList.a(new JsonTab(porcelainjsonspace, "", null, null));
        } else
        {
            ctz.a(list);
            mSpaces = ImmutableList.a(list);
        }
        mTitle = (String)ctz.a(s);
        mHeader = porcelainjsonpageheader;
    }

    public volatile PorcelainPage append(PorcelainPage porcelainpage)
    {
        return append((PorcelainJsonPage)porcelainpage);
    }

    public PorcelainJsonPage append(PorcelainJsonPage porcelainjsonpage)
    {
        porcelainjsonpage = Maps.a(porcelainjsonpage.mSpaces, dot.a);
        cuq cuq1 = ImmutableList.h();
        for (Iterator iterator = mSpaces.iterator(); iterator.hasNext();)
        {
            JsonTab jsontab = (JsonTab)iterator.next();
            JsonTab jsontab1 = (JsonTab)porcelainjsonpage.get(jsontab.getId());
            if (jsontab1 != null)
            {
                cuq1.c(new JsonTab(new PorcelainJsonSpace(jsontab.getSpace().getViews().append(jsontab1.getSpace().getViews()), Boolean.valueOf(jsontab.getSpace().shouldAdjustCardGridRows()), Integer.valueOf(jsontab.getSpace().getDefaultCardGridMaxRows()), jsontab.getSpace().getExtraData()), jsontab.getTitle(), jsontab.getId(), jsontab1.getNextDataSet()));
            } else
            {
                cuq1.c(jsontab);
            }
        }

        return new PorcelainJsonPage(cuq1.a(), null, getHeader(), getTitle());
    }

    public int describeContents()
    {
        return 0;
    }

    public volatile com.spotify.mobile.android.porcelain.PorcelainPage.PorcelainPageHeader getHeader()
    {
        return getHeader();
    }

    public PorcelainJsonPageHeader getHeader()
    {
        return mHeader;
    }

    public List getSpaces()
    {
        return ImmutableList.a(mSpaces);
    }

    public String getTitle()
    {
        return mTitle;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeTypedList(mSpaces);
        parcel.writeParcelable(mHeader, 0);
        parcel.writeString(mTitle);
    }


    private class JsonTab
        implements Parcelable, JacksonModel, dot
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                String s = parcel.readString();
                return new JsonTab((PorcelainJsonSpace)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/PorcelainJsonSpace.getClassLoader()), s, parcel.readString(), parcel.readString());
            }

            public final volatile Object[] newArray(int i)
            {
                return new JsonTab[i];
            }

        };
        private static final String KEY_ID = "id";
        private static final String KEY_NEXT_DATASET = "nextDataset";
        private static final String KEY_SPACE = "space";
        private static final String KEY_TITLE = "title";
        String mId;
        String mNextDatSet;
        PorcelainJsonSpace mSpace;
        private String mTitle;

        public int describeContents()
        {
            return 0;
        }

        public String getId()
        {
            return mId;
        }

        public String getNextDataSet()
        {
            return mNextDatSet;
        }

        public PorcelainJsonSpace getSpace()
        {
            return mSpace;
        }

        public volatile doz getSpace()
        {
            return getSpace();
        }

        public volatile CharSequence getTitle()
        {
            return getTitle();
        }

        public String getTitle()
        {
            return mTitle;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(mTitle);
            parcel.writeParcelable(mSpace, 0);
            parcel.writeString(mId);
            parcel.writeString(mNextDatSet);
        }


        public JsonTab(PorcelainJsonSpace porcelainjsonspace, String s, String s1, String s2)
        {
            mSpace = (PorcelainJsonSpace)ctz.a(porcelainjsonspace);
            mTitle = (String)ctz.a(s);
            mId = s1;
            boolean flag;
            if (s2 == null || s1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ctz.a(flag, "Tabs with pagination must have an id");
            mNextDatSet = s2;
        }
    }

}
