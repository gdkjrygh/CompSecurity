// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            AccessTokenSource, FacebookException, LegacyTokenHelper, FacebookSdk, 
//            AccessTokenManager, LoggingBehavior

public final class AccessToken
    implements Parcelable
{

    public static final String ACCESS_TOKEN_KEY = "access_token";
    private static final String APPLICATION_ID_KEY = "application_id";
    public static final android.os.Parcelable.Creator CREATOR = new _cls2();
    private static final int CURRENT_JSON_FORMAT = 1;
    private static final String DECLINED_PERMISSIONS_KEY = "declined_permissions";
    private static final AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE;
    private static final Date DEFAULT_EXPIRATION_TIME;
    private static final Date DEFAULT_LAST_REFRESH_TIME = new Date();
    private static final String EXPIRES_AT_KEY = "expires_at";
    public static final String EXPIRES_IN_KEY = "expires_in";
    private static final String LAST_REFRESH_KEY = "last_refresh";
    private static final Date MAX_DATE;
    private static final String PERMISSIONS_KEY = "permissions";
    private static final String SOURCE_KEY = "source";
    private static final String TOKEN_KEY = "token";
    public static final String USER_ID_KEY = "user_id";
    private static final String VERSION_KEY = "version";
    private final String applicationId;
    private final Set declinedPermissions;
    private final Date expires;
    private final Date lastRefresh;
    private final Set permissions;
    private final AccessTokenSource source;
    private final String token;
    private final String userId;

    AccessToken(Parcel parcel)
    {
        expires = new Date(parcel.readLong());
        ArrayList arraylist = new ArrayList();
        parcel.readStringList(arraylist);
        permissions = Collections.unmodifiableSet(new HashSet(arraylist));
        arraylist.clear();
        parcel.readStringList(arraylist);
        declinedPermissions = Collections.unmodifiableSet(new HashSet(arraylist));
        token = parcel.readString();
        source = AccessTokenSource.valueOf(parcel.readString());
        lastRefresh = new Date(parcel.readLong());
        applicationId = parcel.readString();
        userId = parcel.readString();
    }

    public AccessToken(String s, String s1, String s2, Collection collection, Collection collection1, AccessTokenSource accesstokensource, Date date, 
            Date date1)
    {
        Validate.notNullOrEmpty(s, "accessToken");
        Validate.notNullOrEmpty(s1, "applicationId");
        Validate.notNullOrEmpty(s2, "userId");
        if (date == null)
        {
            date = DEFAULT_EXPIRATION_TIME;
        }
        expires = date;
        if (collection != null)
        {
            collection = new HashSet(collection);
        } else
        {
            collection = new HashSet();
        }
        permissions = Collections.unmodifiableSet(collection);
        if (collection1 != null)
        {
            collection = new HashSet(collection1);
        } else
        {
            collection = new HashSet();
        }
        declinedPermissions = Collections.unmodifiableSet(collection);
        token = s;
        if (accesstokensource == null)
        {
            accesstokensource = DEFAULT_ACCESS_TOKEN_SOURCE;
        }
        source = accesstokensource;
        if (date1 == null)
        {
            date1 = DEFAULT_LAST_REFRESH_TIME;
        }
        lastRefresh = date1;
        applicationId = s1;
        userId = s2;
    }

    private void appendPermissions(StringBuilder stringbuilder)
    {
        stringbuilder.append(" permissions:");
        if (permissions == null)
        {
            stringbuilder.append("null");
            return;
        } else
        {
            stringbuilder.append("[");
            stringbuilder.append(TextUtils.join(", ", permissions));
            stringbuilder.append("]");
            return;
        }
    }

    private static AccessToken createFromBundle(List list, Bundle bundle, AccessTokenSource accesstokensource, Date date, String s)
    {
        String s1 = bundle.getString("access_token");
        date = Utility.getBundleLongAsDate(bundle, "expires_in", date);
        bundle = bundle.getString("user_id");
        if (Utility.isNullOrEmpty(s1) || date == null)
        {
            return null;
        } else
        {
            return new AccessToken(s1, s, bundle, list, null, accesstokensource, date, new Date());
        }
    }

    static AccessToken createFromJSONObject(JSONObject jsonobject)
    {
        if (jsonobject.getInt("version") > 1)
        {
            throw new FacebookException("Unknown AccessToken serialization format.");
        } else
        {
            String s = jsonobject.getString("token");
            Date date = new Date(jsonobject.getLong("expires_at"));
            JSONArray jsonarray = jsonobject.getJSONArray("permissions");
            JSONArray jsonarray1 = jsonobject.getJSONArray("declined_permissions");
            Date date1 = new Date(jsonobject.getLong("last_refresh"));
            AccessTokenSource accesstokensource = AccessTokenSource.valueOf(jsonobject.getString("source"));
            return new AccessToken(s, jsonobject.getString("application_id"), jsonobject.getString("user_id"), Utility.jsonArrayToStringList(jsonarray), Utility.jsonArrayToStringList(jsonarray1), accesstokensource, date, date1);
        }
    }

    static AccessToken createFromLegacyCache(Bundle bundle)
    {
        List list = getPermissionsFromBundle(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List list1 = getPermissionsFromBundle(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        String s1 = LegacyTokenHelper.getApplicationId(bundle);
        String s = s1;
        if (Utility.isNullOrEmpty(s1))
        {
            s = FacebookSdk.getApplicationId();
        }
        s1 = LegacyTokenHelper.getToken(bundle);
        Object obj = Utility.awaitGetGraphMeRequestWithCache(s1);
        try
        {
            obj = ((JSONObject) (obj)).getString("id");
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return null;
        }
        return new AccessToken(s1, s, ((String) (obj)), list, list1, LegacyTokenHelper.getSource(bundle), LegacyTokenHelper.getDate(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), LegacyTokenHelper.getDate(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"));
    }

    public static void createFromNativeLinkingIntent(final Intent extras, final String applicationId, final AccessTokenCreationCallback accessTokenCallback)
    {
        Validate.notNull(extras, "intent");
        if (extras.getExtras() == null)
        {
            accessTokenCallback.onError(new FacebookException("No extras found on intent"));
            return;
        }
        extras = new Bundle(extras.getExtras());
        String s = extras.getString("user_id");
        if (s == null || s.isEmpty())
        {
            Utility.getGraphMeRequestWithCacheAsync(extras.getString("access_token"), new _cls1());
            return;
        } else
        {
            accessTokenCallback.onSuccess(createFromBundle(null, extras, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), applicationId));
            return;
        }
    }

    static AccessToken createFromRefresh(AccessToken accesstoken, Bundle bundle)
    {
        if (accesstoken.source != AccessTokenSource.FACEBOOK_APPLICATION_WEB && accesstoken.source != AccessTokenSource.FACEBOOK_APPLICATION_NATIVE && accesstoken.source != AccessTokenSource.FACEBOOK_APPLICATION_SERVICE)
        {
            throw new FacebookException((new StringBuilder("Invalid token source: ")).append(accesstoken.source).toString());
        }
        Date date = Utility.getBundleLongAsDate(bundle, "expires_in", new Date(0L));
        bundle = bundle.getString("access_token");
        if (Utility.isNullOrEmpty(bundle))
        {
            return null;
        } else
        {
            return new AccessToken(bundle, accesstoken.applicationId, accesstoken.getUserId(), accesstoken.getPermissions(), accesstoken.getDeclinedPermissions(), accesstoken.source, date, new Date());
        }
    }

    public static AccessToken getCurrentAccessToken()
    {
        return AccessTokenManager.getInstance().getCurrentAccessToken();
    }

    static List getPermissionsFromBundle(Bundle bundle, String s)
    {
        bundle = bundle.getStringArrayList(s);
        if (bundle == null)
        {
            return Collections.emptyList();
        } else
        {
            return Collections.unmodifiableList(new ArrayList(bundle));
        }
    }

    public static void setCurrentAccessToken(AccessToken accesstoken)
    {
        AccessTokenManager.getInstance().setCurrentAccessToken(accesstoken);
    }

    private String tokenToString()
    {
        if (token == null)
        {
            return "null";
        }
        if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS))
        {
            return token;
        } else
        {
            return "ACCESS_TOKEN_REMOVED";
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof AccessToken))
            {
                return false;
            }
            obj = (AccessToken)obj;
            if (!expires.equals(((AccessToken) (obj)).expires) || !permissions.equals(((AccessToken) (obj)).permissions) || !declinedPermissions.equals(((AccessToken) (obj)).declinedPermissions) || !token.equals(((AccessToken) (obj)).token) || source != ((AccessToken) (obj)).source || !lastRefresh.equals(((AccessToken) (obj)).lastRefresh) || (applicationId != null ? !applicationId.equals(((AccessToken) (obj)).applicationId) : ((AccessToken) (obj)).applicationId != null) || !userId.equals(((AccessToken) (obj)).userId))
            {
                return false;
            }
        }
        return true;
    }

    public final String getApplicationId()
    {
        return applicationId;
    }

    public final Set getDeclinedPermissions()
    {
        return declinedPermissions;
    }

    public final Date getExpires()
    {
        return expires;
    }

    public final Date getLastRefresh()
    {
        return lastRefresh;
    }

    public final Set getPermissions()
    {
        return permissions;
    }

    public final AccessTokenSource getSource()
    {
        return source;
    }

    public final String getToken()
    {
        return token;
    }

    public final String getUserId()
    {
        return userId;
    }

    public final int hashCode()
    {
        int j = expires.hashCode();
        int k = permissions.hashCode();
        int l = declinedPermissions.hashCode();
        int i1 = token.hashCode();
        int j1 = source.hashCode();
        int k1 = lastRefresh.hashCode();
        int i;
        if (applicationId == null)
        {
            i = 0;
        } else
        {
            i = applicationId.hashCode();
        }
        return (i + ((((((j + 527) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31) * 31 + userId.hashCode();
    }

    public final boolean isExpired()
    {
        return (new Date()).after(expires);
    }

    final JSONObject toJSONObject()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("version", 1);
        jsonobject.put("token", token);
        jsonobject.put("expires_at", expires.getTime());
        jsonobject.put("permissions", new JSONArray(permissions));
        jsonobject.put("declined_permissions", new JSONArray(declinedPermissions));
        jsonobject.put("last_refresh", lastRefresh.getTime());
        jsonobject.put("source", source.name());
        jsonobject.put("application_id", applicationId);
        jsonobject.put("user_id", userId);
        return jsonobject;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{AccessToken");
        stringbuilder.append(" token:").append(tokenToString());
        appendPermissions(stringbuilder);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(expires.getTime());
        parcel.writeStringList(new ArrayList(permissions));
        parcel.writeStringList(new ArrayList(declinedPermissions));
        parcel.writeString(token);
        parcel.writeString(source.name());
        parcel.writeLong(lastRefresh.getTime());
        parcel.writeString(applicationId);
        parcel.writeString(userId);
    }

    static 
    {
        Date date = new Date(0x7fffffffffffffffL);
        MAX_DATE = date;
        DEFAULT_EXPIRATION_TIME = date;
        DEFAULT_ACCESS_TOKEN_SOURCE = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }


    private class AccessTokenCreationCallback
    {

        public abstract void onError(FacebookException facebookexception);

        public abstract void onSuccess(AccessToken accesstoken);
    }


    private class _cls1
        implements com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
    {

        final AccessTokenCreationCallback val$accessTokenCallback;
        final String val$applicationId;
        final Bundle val$extras;

        public final void onFailure(FacebookException facebookexception)
        {
            accessTokenCallback.onError(facebookexception);
        }

        public final void onSuccess(JSONObject jsonobject)
        {
            try
            {
                jsonobject = jsonobject.getString("id");
                extras.putString("user_id", jsonobject);
                accessTokenCallback.onSuccess(AccessToken.createFromBundle(null, extras, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), applicationId));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                accessTokenCallback.onError(new FacebookException("Unable to generate access token due to missing user id"));
            }
        }

        _cls1()
        {
            extras = bundle;
            accessTokenCallback = accesstokencreationcallback;
            applicationId = s;
            super();
        }
    }


    private class _cls2
        implements android.os.Parcelable.Creator
    {

        public final AccessToken createFromParcel(Parcel parcel)
        {
            return new AccessToken(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final AccessToken[] newArray(int i)
        {
            return new AccessToken[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls2()
        {
        }
    }

}
