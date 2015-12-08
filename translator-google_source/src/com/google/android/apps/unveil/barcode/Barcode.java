// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.barcode;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.unveil.env.af;
import com.google.zxing.a.a.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.google.android.apps.unveil.barcode:
//            a

public class Barcode
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.apps.unveil.barcode.a();
    private static final af a = new af();
    public static final long serialVersionUID = 0xf2b771c3514a07c5L;
    private Rect boundingBox;
    private String format;
    private String type;
    private String urlString;
    private String value;

    public Barcode(Parcel parcel)
    {
        type = parcel.readString();
        format = parcel.readString();
        value = parcel.readString();
        boundingBox = (Rect)parcel.readParcelable(android/graphics/Rect.getClassLoader());
    }

    public Barcode(a a1, com.google.zxing.a a2, String s, Rect rect)
    {
        type = a1.toString();
        format = a2.l;
        value = s;
        boundingBox = rect;
    }

    public static Barcode parseFrom(byte abyte0[])
    {
        try
        {
            abyte0 = (Barcode)(new ObjectInputStream(new ByteArrayInputStream(abyte0))).readObject();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            a.f("Could not deserialize a Barcode.", new Object[0]);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            a.f("Could not deserialize a Barcode.", new Object[0]);
            return null;
        }
        return abyte0;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        type = (String)objectinputstream.readObject();
        format = (String)objectinputstream.readObject();
        value = (String)objectinputstream.readObject();
        boundingBox = new Rect(objectinputstream.readInt(), objectinputstream.readInt(), objectinputstream.readInt(), objectinputstream.readInt());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.writeObject(type);
        objectoutputstream.writeObject(format);
        objectoutputstream.writeObject(value);
        objectoutputstream.writeInt(boundingBox.left);
        objectoutputstream.writeInt(boundingBox.top);
        objectoutputstream.writeInt(boundingBox.right);
        objectoutputstream.writeInt(boundingBox.bottom);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (Barcode)obj;
        if (value != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Barcode) (obj)).value == null) goto _L1; else goto _L3
_L3:
        return false;
        if (value.equals(((Barcode) (obj)).value)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public Rect getBoundingBox()
    {
        return boundingBox;
    }

    public String getFormat()
    {
        return format;
    }

    public String getType()
    {
        return type;
    }

    public String getUrl()
    {
        if (urlString != null) goto _L2; else goto _L1
_L1:
        URL url;
        String s;
        url = new URL(value);
        s = url.getProtocol();
        if (!"http".equals(s) && !"https".equals(s)) goto _L4; else goto _L3
_L3:
        urlString = url.toString();
_L2:
        return urlString;
_L4:
        try
        {
            urlString = "";
        }
        catch (MalformedURLException malformedurlexception)
        {
            urlString = "";
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public String getValue()
    {
        return value;
    }

    public int hashCode()
    {
        return value.hashCode();
    }

    public byte[] toByteArray()
    {
        byte abyte0[];
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            (new ObjectOutputStream(bytearrayoutputstream)).writeObject(this);
            abyte0 = bytearrayoutputstream.toByteArray();
        }
        catch (IOException ioexception)
        {
            a.f("Could not serialize %s", new Object[] {
                this
            });
            return null;
        }
        return abyte0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Barcode [type=").append(type).append(", format=").append(format).append(", value=").append(value).append(", boundingBox=").append(boundingBox).append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(type);
        parcel.writeString(format);
        parcel.writeString(value);
        parcel.writeParcelable(boundingBox, 0);
    }

}
