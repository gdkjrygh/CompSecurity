// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.phoenixalbum.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import cty;
import java.util.Arrays;

public class AlbumModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new AlbumModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new AlbumModel[i];
        }

    };
    public final ReleaseWindow releaseWindow;

    private AlbumModel(Parcel parcel)
    {
        releaseWindow = (ReleaseWindow)parcel.readParcelable(com/spotify/mobile/android/spotlets/phoenixalbum/model/AlbumModel$ReleaseWindow.getClassLoader());
    }


    public AlbumModel(ReleaseWindow releasewindow)
    {
        releaseWindow = releasewindow;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof AlbumModel))
        {
            return false;
        } else
        {
            obj = (AlbumModel)obj;
            return cty.a(releaseWindow, ((AlbumModel) (obj)).releaseWindow);
        }
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            releaseWindow
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(releaseWindow, 0);
    }


    private class ReleaseWindow
        implements Parcelable, JacksonModel
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new ReleaseWindow(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new ReleaseWindow[i];
            }

        };
        public final boolean windowed;

        public int describeContents()
        {
            return 0;
        }

        public boolean equals(Object obj)
        {
            if (this == obj)
            {
                return true;
            }
            if (!(obj instanceof ReleaseWindow))
            {
                return false;
            } else
            {
                obj = (ReleaseWindow)obj;
                return cty.a(Boolean.valueOf(windowed), Boolean.valueOf(((ReleaseWindow) (obj)).windowed));
            }
        }

        public int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                Boolean.valueOf(windowed)
            });
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            gen.a(parcel, windowed);
        }


        private ReleaseWindow(Parcel parcel)
        {
            windowed = gen.a(parcel);
        }


        public ReleaseWindow(boolean flag)
        {
            windowed = flag;
        }
    }

}
