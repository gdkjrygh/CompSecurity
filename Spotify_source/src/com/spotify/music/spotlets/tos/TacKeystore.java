// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.tos;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.HttpCallbackReceiver;
import com.spotify.mobile.android.cosmos.JsonHttpCallbackReceiver;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import gpn;

public final class TacKeystore
{

    public final Handler a = new Handler();
    public final Resolver b;
    public final String c;
    public final String d;
    public gpn e;
    public boolean f;
    private final ObjectMapper g;

    public TacKeystore(Context context, String s, ObjectMapper objectmapper)
    {
        g = objectmapper;
        Assertion.b(TextUtils.isEmpty(s), "Not empty");
        c = s;
        d = Uri.parse("hm://tac/").buildUpon().appendPath("user").appendPath(s).appendPath("columns").build().toString();
        b = Cosmos.getResolver(context);
        b.connect();
    }

    public final void a(Model model)
    {
        Request request = new Request("PUT", d);
        try
        {
            request.setBody(g.writeValueAsBytes(model));
        }
        // Misplaced declaration of an exception variable
        catch (Model model)
        {
            Logger.b(model, "Error when serializing model", new Object[0]);
            Assertion.a(model);
        }
        b.resolve(request, new HttpCallbackReceiver(a) {

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                Logger.a(throwable, "Error when trying to save model", new Object[0]);
            }

            protected final volatile void onResolved(Response response, Object obj)
            {
            }

            protected final volatile Object parseResponse(Response response)
            {
                return null;
            }

        });
    }

    // Unreferenced inner class com/spotify/music/spotlets/tos/TacKeystore$1

/* anonymous class */
    public final class _cls1 extends JsonHttpCallbackReceiver
    {

        private TacKeystore a;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            Logger.a(throwable, "Error when trying to fetch model", new Object[0]);
            a.f = false;
            if (a.e != null)
            {
                a.e.a();
            }
        }

        protected final void onResolved(Response response, Object obj)
        {
            response = (Model)obj;
            a.f = false;
            if (a.e != null)
            {
                a.e.a(response);
            }
        }

            public 
            {
                a = TacKeystore.this;
                super(handler, class1);
            }

        private class Model
            implements Parcelable, JacksonModel
        {

            public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                public final Object createFromParcel(Parcel parcel)
                {
                    return new Model(parcel);
                }

                public final volatile Object[] newArray(int i)
                {
                    return new Model[i];
                }

            };
            private String mExpirationTime;

            public int describeContents()
            {
                return 0;
            }

            public boolean equals(Object obj)
            {
                if (this == obj)
                {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                } else
                {
                    obj = (Model)obj;
                    return TextUtils.equals(mExpirationTime, ((Model) (obj)).mExpirationTime);
                }
            }

            public String getExpirationTime()
            {
                return mExpirationTime;
            }

            public Long getExpirationTimeAsLong()
            {
                if (TextUtils.isEmpty(mExpirationTime))
                {
                    break MISSING_BLOCK_LABEL_47;
                }
                long l = Long.parseLong(mExpirationTime);
                return Long.valueOf(l);
                NumberFormatException numberformatexception;
                numberformatexception;
                Assertion.a((new StringBuilder("Failed to convert ")).append(mExpirationTime).toString(), numberformatexception);
                return null;
            }

            public int hashCode()
            {
                if (mExpirationTime != null)
                {
                    return mExpirationTime.hashCode();
                } else
                {
                    return 0;
                }
            }

            public String toString()
            {
                return (new StringBuilder("Model{mExpirationTime='")).append(mExpirationTime).append("'}").toString();
            }

            public void writeToParcel(Parcel parcel, int i)
            {
                parcel.writeString(mExpirationTime);
            }


            public Model(Parcel parcel)
            {
                mExpirationTime = parcel.readString();
            }

            public Model(String s)
            {
                mExpirationTime = s;
            }
        }

    }

}
