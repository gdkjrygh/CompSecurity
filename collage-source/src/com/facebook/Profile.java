// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            AccessToken, ProfileManager, FacebookException

public final class Profile
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Profile createFromParcel(Parcel parcel)
        {
            return new Profile(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Profile[] newArray(int i)
        {
            return new Profile[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final String FIRST_NAME_KEY = "first_name";
    private static final String ID_KEY = "id";
    private static final String LAST_NAME_KEY = "last_name";
    private static final String LINK_URI_KEY = "link_uri";
    private static final String MIDDLE_NAME_KEY = "middle_name";
    private static final String NAME_KEY = "name";
    private final String firstName;
    private final String id;
    private final String lastName;
    private final Uri linkUri;
    private final String middleName;
    private final String name;

    private Profile(Parcel parcel)
    {
        id = parcel.readString();
        firstName = parcel.readString();
        middleName = parcel.readString();
        lastName = parcel.readString();
        name = parcel.readString();
        parcel = parcel.readString();
        if (parcel == null)
        {
            parcel = null;
        } else
        {
            parcel = Uri.parse(parcel);
        }
        linkUri = parcel;
    }


    public Profile(String s, String s1, String s2, String s3, String s4, Uri uri)
    {
        Validate.notNullOrEmpty(s, "id");
        id = s;
        firstName = s1;
        middleName = s2;
        lastName = s3;
        name = s4;
        linkUri = uri;
    }

    Profile(JSONObject jsonobject)
    {
        Object obj = null;
        super();
        id = jsonobject.optString("id", null);
        firstName = jsonobject.optString("first_name", null);
        middleName = jsonobject.optString("middle_name", null);
        lastName = jsonobject.optString("last_name", null);
        name = jsonobject.optString("name", null);
        jsonobject = jsonobject.optString("link_uri", null);
        if (jsonobject == null)
        {
            jsonobject = obj;
        } else
        {
            jsonobject = Uri.parse(jsonobject);
        }
        linkUri = jsonobject;
    }

    public static void fetchProfileForCurrentAccessToken()
    {
        AccessToken accesstoken = AccessToken.getCurrentAccessToken();
        if (accesstoken == null)
        {
            setCurrentProfile(null);
            return;
        } else
        {
            Utility.getGraphMeRequestWithCacheAsync(accesstoken.getToken(), new com.facebook.internal.Utility.GraphMeRequestWithCacheCallback() {

                public void onFailure(FacebookException facebookexception)
                {
                }

                public void onSuccess(JSONObject jsonobject)
                {
                    String s = jsonobject.optString("id");
                    if (s == null)
                    {
                        return;
                    }
                    String s5 = jsonobject.optString("link");
                    String s1 = jsonobject.optString("first_name");
                    String s2 = jsonobject.optString("middle_name");
                    String s3 = jsonobject.optString("last_name");
                    String s4 = jsonobject.optString("name");
                    if (s5 != null)
                    {
                        jsonobject = Uri.parse(s5);
                    } else
                    {
                        jsonobject = null;
                    }
                    Profile.setCurrentProfile(new Profile(s, s1, s2, s3, s4, jsonobject));
                }

            });
            return;
        }
    }

    public static Profile getCurrentProfile()
    {
        return ProfileManager.getInstance().getCurrentProfile();
    }

    public static void setCurrentProfile(Profile profile)
    {
        ProfileManager.getInstance().setCurrentProfile(profile);
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
        if (!(obj instanceof Profile))
        {
            return false;
        }
        obj = (Profile)obj;
        if (!id.equals(((Profile) (obj)).id) || firstName != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((Profile) (obj)).firstName != null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!firstName.equals(((Profile) (obj)).firstName) || middleName != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((Profile) (obj)).middleName != null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (!middleName.equals(((Profile) (obj)).middleName) || lastName != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((Profile) (obj)).lastName != null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L5
_L5:
        if (!lastName.equals(((Profile) (obj)).lastName) || name != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((Profile) (obj)).name != null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L6
_L6:
        if (name.equals(((Profile) (obj)).name) && linkUri == null)
        {
            if (((Profile) (obj)).linkUri != null)
            {
                return false;
            }
        } else
        {
            return linkUri.equals(((Profile) (obj)).linkUri);
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getId()
    {
        return id;
    }

    public String getLastName()
    {
        return lastName;
    }

    public Uri getLinkUri()
    {
        return linkUri;
    }

    public String getMiddleName()
    {
        return middleName;
    }

    public String getName()
    {
        return name;
    }

    public Uri getProfilePictureUri(int i, int j)
    {
        return ImageRequest.getProfilePictureUri(id, i, j);
    }

    public int hashCode()
    {
        int j = id.hashCode() + 527;
        int i = j;
        if (firstName != null)
        {
            i = j * 31 + firstName.hashCode();
        }
        j = i;
        if (middleName != null)
        {
            j = i * 31 + middleName.hashCode();
        }
        i = j;
        if (lastName != null)
        {
            i = j * 31 + lastName.hashCode();
        }
        j = i;
        if (name != null)
        {
            j = i * 31 + name.hashCode();
        }
        i = j;
        if (linkUri != null)
        {
            i = j * 31 + linkUri.hashCode();
        }
        return i;
    }

    JSONObject toJSONObject()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", id);
            jsonobject.put("first_name", firstName);
            jsonobject.put("middle_name", middleName);
            jsonobject.put("last_name", lastName);
            jsonobject.put("name", name);
            if (linkUri != null)
            {
                jsonobject.put("link_uri", linkUri.toString());
            }
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return jsonobject;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(id);
        parcel.writeString(firstName);
        parcel.writeString(middleName);
        parcel.writeString(lastName);
        parcel.writeString(name);
        String s;
        if (linkUri == null)
        {
            s = null;
        } else
        {
            s = linkUri.toString();
        }
        parcel.writeString(s);
    }

}
