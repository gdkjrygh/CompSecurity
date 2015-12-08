// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.os.Parcel;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.soundcloud.android.creators.record:
//            PlaybackStream, AudioReader, PlaybackFilter

final class 
    implements android.os.r
{

    public final PlaybackStream createFromParcel(Parcel parcel)
    {
        Object obj;
        boolean flag;
        flag = true;
        obj = new File(parcel.readString());
        obj = new PlaybackStream(AudioReader.guess(((File) (obj))));
        PlaybackStream.access$002(((PlaybackStream) (obj)), parcel.readLong());
        PlaybackStream.access$102(((PlaybackStream) (obj)), parcel.readLong());
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        PlaybackStream.access$202(((PlaybackStream) (obj)), flag);
        PlaybackStream.access$302(((PlaybackStream) (obj)), (PlaybackFilter)parcel.readParcelable(getClass().getClassLoader()));
        ((PlaybackStream) (obj)).refreshTrimWindow();
        return ((PlaybackStream) (obj));
        parcel;
        throw new RuntimeException(parcel);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final PlaybackStream[] newArray(int i)
    {
        return new PlaybackStream[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
