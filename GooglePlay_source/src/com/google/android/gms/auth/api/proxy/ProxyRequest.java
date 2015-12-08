// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            ProxyRequestCreator

public class ProxyRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ProxyRequestCreator();
    public static final int HTTP_METHOD_DELETE = 3;
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_HEAD = 4;
    public static final int HTTP_METHOD_OPTIONS = 5;
    public static final int HTTP_METHOD_PATCH = 7;
    public static final int HTTP_METHOD_POST = 1;
    public static final int HTTP_METHOD_PUT = 2;
    public static final int HTTP_METHOD_TRACE = 6;
    public static final int LAST_CODE = 7;
    public final byte body[];
    Bundle headers;
    public final int httpMethod;
    public final long timeoutMillis;
    public final String url;
    final int versionCode;

    ProxyRequest(int i, String s, int j, long l, byte abyte0[], Bundle bundle)
    {
        versionCode = i;
        url = s;
        httpMethod = j;
        timeoutMillis = l;
        body = abyte0;
        headers = bundle;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder("ProxyRequest[ url: ")).append(url).append(", method: ").append(httpMethod).append(" ]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ProxyRequestCreator.writeToParcel$2c5dc67a(this, parcel);
    }

}
