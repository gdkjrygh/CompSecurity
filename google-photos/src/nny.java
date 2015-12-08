// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public final class nny
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new nnz();
    public final nnt a;
    public final Uri b;
    private noa c;

    nny(Parcel parcel)
    {
        a = (nnt)parcel.readParcelable(nnt.getClassLoader());
        b = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        c = noa.values()[parcel.readInt()];
    }

    private nny(nnt nnt1, Uri uri, noa noa1)
    {
        a = nnt1;
        b = uri;
        if (noa1 == null)
        {
            throw new NullPointerException("type cannot be null");
        } else
        {
            c = noa1;
            return;
        }
    }

    public static nny a(Uri uri, noa noa1)
    {
        if (uri == null)
        {
            throw new NullPointerException("contentUri cannot be null");
        } else
        {
            return new nny(null, uri, noa1);
        }
    }

    public static nny a(nnt nnt1, Uri uri, noa noa1)
    {
        p.b(nnt1, "cloudMediaId cannot be null");
        p.b(uri, "contentUri cannot be null");
        return new nny(nnt1, uri, noa1);
    }

    public static nny a(pxx pxx, Uri uri, int i)
    {
        nnt nnt1;
        p.b(pxx, "mediaId cannot be null");
        p.b(uri, "contentUri cannot be null");
        nnt1 = nnt.a(pxx);
        i;
        JVM INSTR lookupswitch 3: default 56
    //                   1: 105
    //                   3: 90
    //                   7: 105;
           goto _L1 _L2 _L3 _L2
_L1:
        throw new IllegalArgumentException((new StringBuilder(47)).append("cloudMediaType ").append(i).append(" is not supported yet").toString());
_L3:
        pxx = noa.a;
_L5:
        return new nny(nnt1, uri, pxx);
_L2:
        pxx = noa.b;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof nny))
            {
                return false;
            }
            obj = (nny)obj;
            if (c != ((nny) (obj)).c || !c.c(a, ((nny) (obj)).a) || !c.c(b, ((nny) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return c.a(a, c.a(b, c.a(c, 17)));
    }

    public final String toString()
    {
        return c.a("MediaIdentifier", new Object[] {
            a, b, c
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, 0);
        parcel.writeParcelable(b, 0);
        parcel.writeInt(c.ordinal());
    }

}
