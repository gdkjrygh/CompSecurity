// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.Map;

// Referenced classes of package com.facebook.login:
//            LoginClient

public static class errorCode
    implements Parcelable
{
    static final class Code extends Enum
    {

        private static final Code $VALUES[];
        public static final Code CANCEL;
        public static final Code ERROR;
        public static final Code SUCCESS;
        private final String loggingValue;

        public static Code valueOf(String s)
        {
            return (Code)Enum.valueOf(com/facebook/login/LoginClient$Result$Code, s);
        }

        public static Code[] values()
        {
            return (Code[])$VALUES.clone();
        }

        String getLoggingValue()
        {
            return loggingValue;
        }

        static 
        {
            SUCCESS = new Code("SUCCESS", 0, "success");
            CANCEL = new Code("CANCEL", 1, "cancel");
            ERROR = new Code("ERROR", 2, "error");
            $VALUES = (new Code[] {
                SUCCESS, CANCEL, ERROR
            });
        }

        private Code(String s, int i, String s1)
        {
            super(s, i);
            loggingValue = s1;
        }
    }


    public static final android.os..Result.loggingExtras CREATOR = new android.os.Parcelable.Creator() {

        public LoginClient.Result createFromParcel(Parcel parcel)
        {
            return new LoginClient.Result(parcel, null);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public LoginClient.Result[] newArray(int i)
        {
            return new LoginClient.Result[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    final Code code;
    final String errorCode;
    final String errorMessage;
    public Map loggingExtras;
    final  request;
    final AccessToken token;

    static  createCancelResult( , String s)
    {
        return new <init>(, Code.CANCEL, null, s, null);
    }

    static  createErrorResult( , String s, String s1)
    {
        return createErrorResult(, s, s1, null);
    }

    static  createErrorResult( , String s, String s1, String s2)
    {
        s = TextUtils.join(": ", Utility.asListNoNulls(new String[] {
            s, s1
        }));
        return new <init>(, Code.ERROR, null, s, s2);
    }

    static  createTokenResult( , AccessToken accesstoken)
    {
        return new <init>(, Code.SUCCESS, accesstoken, null, null);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(code.name());
        parcel.writeParcelable(token, i);
        parcel.writeString(errorMessage);
        parcel.writeString(errorCode);
        parcel.writeParcelable(request, i);
        Utility.writeStringMapToParcel(parcel, loggingExtras);
    }


    private Code(Parcel parcel)
    {
        code = Code.valueOf(parcel.readString());
        token = (AccessToken)parcel.readParcelable(com/facebook/AccessToken.getClassLoader());
        errorMessage = parcel.readString();
        errorCode = parcel.readString();
        request = ()parcel.readParcelable(com/facebook/login/LoginClient$Request.getClassLoader());
        loggingExtras = Utility.readStringMapFromParcel(parcel);
    }

    ngMapFromParcel(Parcel parcel, ngMapFromParcel ngmapfromparcel)
    {
        this(parcel);
    }

    Code( , Code code1, AccessToken accesstoken, String s, String s1)
    {
        Validate.notNull(code1, "code");
        request = ;
        token = accesstoken;
        errorMessage = s;
        code = code1;
        errorCode = s1;
    }
}
