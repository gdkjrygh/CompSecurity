// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import bog;
import btl;
import cnq;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bog();
    public final int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Uri f;
    public String g;
    public long h;

    public GoogleSignInAccount(int i, String s, String s1, String s2, String s3, Uri uri, String s4, 
            long l)
    {
        a = i;
        b = btl.a(s);
        c = s1;
        d = s2;
        e = s3;
        f = uri;
        g = s4;
        h = l;
    }

    private JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", b);
            if (c != null)
            {
                jsonobject.put("tokenId", c);
            }
            if (d != null)
            {
                jsonobject.put("email", d);
            }
            if (e != null)
            {
                jsonobject.put("displayName", e);
            }
            if (f != null)
            {
                jsonobject.put("photoUrl", f.toString());
            }
            if (g != null)
            {
                jsonobject.put("serverAuthCode", g);
            }
            jsonobject.put("expirationTime", h);
        }
        catch (JSONException jsonexception)
        {
            throw new RuntimeException(jsonexception);
        }
        return jsonobject;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof GoogleSignInAccount))
        {
            return false;
        } else
        {
            return ((GoogleSignInAccount)obj).a().toString().equals(a().toString());
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        bog.a(this, parcel, i);
    }

    static 
    {
        cnq.d();
    }
}
