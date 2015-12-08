// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.photos.share.copylink.CopyLinkActivity;

final class ifc
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ifd();
    String a;
    Intent b;
    Intent c;

    ifc(Parcel parcel)
    {
        a = parcel.readString();
        b = (Intent)parcel.readParcelable(android/content/Intent.getClassLoader());
        c = (Intent)parcel.readParcelable(android/content/Intent.getClassLoader());
    }

    public ifc(String s)
    {
        a = s;
    }

    public final boolean a()
    {
        return b != null;
    }

    public final boolean b()
    {
        return c != null;
    }

    public final boolean c()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a())
        {
            flag = flag1;
            if (!b())
            {
                Intent intent = b;
                flag = flag1;
                if (intent.getComponent() != null)
                {
                    flag = flag1;
                    if ("com.google.android.apps.photos".equals(intent.getComponent().getPackageName()))
                    {
                        flag = flag1;
                        if (com/google/android/apps/photos/share/copylink/CopyLinkActivity.getName().equals(intent.getComponent().getClassName()))
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeParcelable(b, i);
        parcel.writeParcelable(c, i);
    }

}
