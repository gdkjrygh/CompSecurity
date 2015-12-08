// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            GoogleSignInAccountCreator

public class GoogleSignInAccount
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new GoogleSignInAccountCreator();
    private static Comparator SCOPE_ORDER = new Comparator() {

        public final volatile int compare(Object obj, Object obj1)
        {
            obj = (Scope)obj;
            obj1 = (Scope)obj1;
            return ((Scope) (obj)).mScopeUri.compareTo(((Scope) (obj1)).mScopeUri);
        }

    };
    public static Clock sClock = DefaultClock.getInstance();
    String mDisplayName;
    String mEmail;
    long mExpirationTimeSecs;
    List mGrantedScopes;
    String mId;
    String mIdToken;
    String mObfuscatedIdentifier;
    Uri mPhotoUrl;
    String mServerAuthCode;
    final int versionCode;

    GoogleSignInAccount(int i, String s, String s1, String s2, String s3, Uri uri, String s4, 
            long l, String s5, List list)
    {
        versionCode = i;
        mId = s;
        mIdToken = s1;
        mEmail = s2;
        mDisplayName = s3;
        mPhotoUrl = uri;
        mServerAuthCode = s4;
        mExpirationTimeSecs = l;
        mObfuscatedIdentifier = s5;
        mGrantedScopes = list;
    }

    public static GoogleSignInAccount fromJsonString(String s)
        throws JSONException
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        JSONObject jsonobject = new JSONObject(s);
        s = null;
        Object obj = jsonobject.optString("photoUrl", null);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            s = Uri.parse(((String) (obj)));
        }
        long l = Long.parseLong(jsonobject.getString("expirationTime"));
        HashSet hashset = new HashSet();
        obj = jsonobject.getJSONArray("grantedScopes");
        int j = ((JSONArray) (obj)).length();
        for (int i = 0; i < j; i++)
        {
            hashset.add(new Scope(((JSONArray) (obj)).getString(i)));
        }

        String s1 = jsonobject.optString("id");
        String s2 = jsonobject.optString("tokenId", null);
        String s3 = jsonobject.optString("email", null);
        String s4 = jsonobject.optString("displayName", null);
        obj = Long.valueOf(l);
        String s5 = jsonobject.getString("obfuscatedIdentifier");
        if (obj == null)
        {
            obj = Long.valueOf(sClock.currentTimeMillis() / 1000L);
        }
        s = new GoogleSignInAccount(2, s1, s2, s3, s4, s, null, ((Long) (obj)).longValue(), Preconditions.checkNotEmpty(s5), new ArrayList((Collection)Preconditions.checkNotNull(hashset)));
        s.mServerAuthCode = jsonobject.optString("serverAuthCode", null);
        return s;
    }

    private JSONObject toJsonObject()
    {
        Object obj;
        JSONArray jsonarray;
        obj = new JSONObject();
        try
        {
            if (mId != null)
            {
                ((JSONObject) (obj)).put("id", mId);
            }
            if (mIdToken != null)
            {
                ((JSONObject) (obj)).put("tokenId", mIdToken);
            }
            if (mEmail != null)
            {
                ((JSONObject) (obj)).put("email", mEmail);
            }
            if (mDisplayName != null)
            {
                ((JSONObject) (obj)).put("displayName", mDisplayName);
            }
            if (mPhotoUrl != null)
            {
                ((JSONObject) (obj)).put("photoUrl", mPhotoUrl.toString());
            }
            if (mServerAuthCode != null)
            {
                ((JSONObject) (obj)).put("serverAuthCode", mServerAuthCode);
            }
            ((JSONObject) (obj)).put("expirationTime", mExpirationTimeSecs);
            ((JSONObject) (obj)).put("obfuscatedIdentifier", mObfuscatedIdentifier);
            jsonarray = new JSONArray();
            Collections.sort(mGrantedScopes, SCOPE_ORDER);
            for (Iterator iterator = mGrantedScopes.iterator(); iterator.hasNext(); jsonarray.put(((Scope)iterator.next()).mScopeUri)) { }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        ((JSONObject) (obj)).put("grantedScopes", jsonarray);
        return ((JSONObject) (obj));
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
            return ((GoogleSignInAccount)obj).toJsonObject().toString().equals(toJsonObject().toString());
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GoogleSignInAccountCreator.writeToParcel(this, parcel, i);
    }

}
