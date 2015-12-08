// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.eg;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            c

public class GoogleSignInAccount
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    public static ef a = eg.c();
    final int b;
    String c;
    String d;
    String e;
    String f;
    Uri g;
    String h;
    long i;

    GoogleSignInAccount(int j, String s, String s1, String s2, String s3, Uri uri, String s4, 
            long l)
    {
        b = j;
        c = u.a(s);
        d = s1;
        e = s2;
        f = s3;
        g = uri;
        h = s4;
        i = l;
    }

    private JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", c);
            if (d != null)
            {
                jsonobject.put("tokenId", d);
            }
            if (e != null)
            {
                jsonobject.put("email", e);
            }
            if (f != null)
            {
                jsonobject.put("displayName", f);
            }
            if (g != null)
            {
                jsonobject.put("photoUrl", g.toString());
            }
            if (h != null)
            {
                jsonobject.put("serverAuthCode", h);
            }
            jsonobject.put("expirationTime", i);
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

    public void writeToParcel(Parcel parcel, int j)
    {
        com.google.android.gms.auth.api.signin.c.a(this, parcel, j);
    }

}
