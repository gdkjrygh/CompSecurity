// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.videoplayer;

import android.os.Parcel;
import android.os.Parcelable;
import gen;

// Referenced classes of package com.spotify.mobile.android.spotlets.videoplayer:
//            VideoActivityActions, FullscreenVideoActivity

public final class VideoActivityConfig
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new VideoActivityConfig(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new VideoActivityConfig[i];
        }

    };
    public static final VideoActivityConfig e;
    final VideoActivityActions.OnRotateAction a;
    final VideoActivityActions.OnTapVideoAction b;
    final boolean c;
    final boolean d;
    private final VideoActivityActions.OnTapVideoAction f;

    public VideoActivityConfig(int i, int j, int k, boolean flag, boolean flag1)
    {
        a = VideoActivityActions.a(i);
        f = VideoActivityActions.b(j);
        b = VideoActivityActions.b(k);
        c = flag;
        d = flag1;
    }

    protected VideoActivityConfig(Parcel parcel)
    {
        a = VideoActivityActions.a(parcel.readInt());
        f = VideoActivityActions.b(parcel.readInt());
        b = VideoActivityActions.b(parcel.readInt());
        c = gen.a(parcel);
        d = gen.a(parcel);
    }

    public final void a(FullscreenVideoActivity fullscreenvideoactivity)
    {
        f.a(fullscreenvideoactivity);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a.ordinal());
        parcel.writeInt(f.ordinal());
        parcel.writeInt(b.ordinal());
        gen.a(parcel, c);
        gen.a(parcel, d);
    }

    static 
    {
        e = new VideoActivityConfig(VideoActivityActions.OnRotateAction.a.ordinal(), VideoActivityActions.OnTapVideoAction.a.ordinal(), VideoActivityActions.OnTapVideoAction.a.ordinal(), false, true);
    }
}
