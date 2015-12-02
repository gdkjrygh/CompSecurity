// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.attachments;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.orca.attachments:
//            e, g, f

public class ImageAttachmentData
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    private static final String a = com/facebook/orca/attachments/ImageAttachmentData.getSimpleName();
    private final Uri b;
    private final Uri c;
    private final int d;
    private final int e;
    private final Uri f;
    private final String g;

    private ImageAttachmentData(Parcel parcel)
    {
        b = (Uri)parcel.readParcelable(null);
        c = (Uri)parcel.readParcelable(null);
        d = parcel.readInt();
        e = parcel.readInt();
        f = (Uri)parcel.readParcelable(null);
        g = parcel.readString();
    }

    ImageAttachmentData(Parcel parcel, e e1)
    {
        this(parcel);
    }

    public ImageAttachmentData(g g1)
    {
        b = g1.a();
        c = g1.b();
        d = g1.c();
        e = g1.d();
        f = g1.e();
        g = g1.f();
    }

    public Uri a()
    {
        return b;
    }

    public Uri b()
    {
        return c;
    }

    public boolean c()
    {
        return d > 0 && e > 0;
    }

    public int d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return e;
    }

    public String f()
    {
        if (g == null)
        {
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("No mime type for image ").append(c.toString()).toString());
            return "";
        } else
        {
            return MimeTypeMap.getSingleton().getExtensionFromMimeType(g);
        }
    }

    public f g()
    {
        if (!c())
        {
            return f.UNKNOWN;
        }
        if (d == e)
        {
            return f.SQUARE;
        }
        if (d < e)
        {
            return f.PORTRAIT;
        } else
        {
            return f.LANDSCAPE;
        }
    }

    public Uri h()
    {
        return f;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(b, i);
        parcel.writeParcelable(c, i);
        parcel.writeInt(d);
        parcel.writeInt(e);
        parcel.writeParcelable(f, i);
        parcel.writeString(g);
    }

}
