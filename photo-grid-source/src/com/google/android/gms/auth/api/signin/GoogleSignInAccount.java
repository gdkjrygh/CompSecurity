// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.wg;
import com.google.android.gms.internal.wh;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            d

public class GoogleSignInAccount
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    public static wg a = wh.d();
    final int b;
    private String c;
    private String d;
    private String e;
    private String f;
    private Uri g;
    private String h;
    private long i;

    GoogleSignInAccount(int j, String s, String s1, String s2, String s3, Uri uri, String s4, 
            long l)
    {
        b = j;
        c = bl.a(s);
        d = s1;
        e = s2;
        f = s3;
        g = uri;
        h = s4;
        i = l;
    }

    private JSONObject h()
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

    public final String a()
    {
        return c;
    }

    public final String b()
    {
        return d;
    }

    public final String c()
    {
        return e;
    }

    public final String d()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public final Uri e()
    {
        return g;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof GoogleSignInAccount))
        {
            return false;
        } else
        {
            return ((GoogleSignInAccount)obj).h().toString().equals(h().toString());
        }
    }

    public final String f()
    {
        return h;
    }

    public final long g()
    {
        return i;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        com.google.android.gms.auth.api.signin.d.a(this, parcel, j);
    }

}
