// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.Validate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.facebook.login:
//            LoginBehavior, DefaultAudience

public class authId
    implements Parcelable
{

    public static final android.os.Request._cls1 CREATOR = new _cls1();
    private final String applicationId;
    private final String authId;
    private final DefaultAudience defaultAudience;
    private boolean isRerequest;
    private final LoginBehavior loginBehavior;
    private Set permissions;

    public int describeContents()
    {
        return 0;
    }

    String getApplicationId()
    {
        return applicationId;
    }

    String getAuthId()
    {
        return authId;
    }

    DefaultAudience getDefaultAudience()
    {
        return defaultAudience;
    }

    LoginBehavior getLoginBehavior()
    {
        return loginBehavior;
    }

    Set getPermissions()
    {
        return permissions;
    }

    boolean isRerequest()
    {
        return isRerequest;
    }

    void setPermissions(Set set)
    {
        Validate.notNull(set, "permissions");
        permissions = set;
    }

    void setRerequest(boolean flag)
    {
        isRerequest = flag;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Object obj = null;
        String s;
        if (loginBehavior != null)
        {
            s = loginBehavior.name();
        } else
        {
            s = null;
        }
        parcel.writeString(s);
        parcel.writeStringList(new ArrayList(permissions));
        s = obj;
        if (defaultAudience != null)
        {
            s = defaultAudience.name();
        }
        parcel.writeString(s);
        parcel.writeString(applicationId);
        parcel.writeString(authId);
        if (isRerequest)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }


    private _cls1(Parcel parcel)
    {
        Object obj1 = null;
        super();
        isRerequest = false;
        Object obj = parcel.readString();
        String s;
        boolean flag;
        if (obj != null)
        {
            obj = LoginBehavior.valueOf(((String) (obj)));
        } else
        {
            obj = null;
        }
        loginBehavior = ((LoginBehavior) (obj));
        obj = new ArrayList();
        parcel.readStringList(((java.util.List) (obj)));
        permissions = new HashSet(((java.util.Collection) (obj)));
        s = parcel.readString();
        obj = obj1;
        if (s != null)
        {
            obj = DefaultAudience.valueOf(s);
        }
        defaultAudience = ((DefaultAudience) (obj));
        applicationId = parcel.readString();
        authId = parcel.readString();
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isRerequest = flag;
    }

    isRerequest(Parcel parcel, isRerequest isrerequest)
    {
        this(parcel);
    }

    <init>(LoginBehavior loginbehavior, Set set, DefaultAudience defaultaudience, String s, String s1)
    {
        isRerequest = false;
        loginBehavior = loginbehavior;
        if (set == null)
        {
            set = new HashSet();
        }
        permissions = set;
        defaultAudience = defaultaudience;
        applicationId = s;
        authId = s1;
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final LoginClient.Request createFromParcel(Parcel parcel)
        {
            return new LoginClient.Request(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final LoginClient.Request[] newArray(int i)
        {
            return new LoginClient.Request[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

            _cls1()
            {
            }
    }

}
