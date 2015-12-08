// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.model;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class Network
    implements JacksonModel
{

    private String mId;
    private String mName;
    private Type mNetworkType;
    private State mState;

    public Network(Type type, State state, String s, String s1)
    {
        mNetworkType = type;
        mState = state;
        mId = s;
        mName = s1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Network))
            {
                return false;
            }
            obj = (Network)obj;
            if (mId == null ? ((Network) (obj)).mId != null : !mId.equals(((Network) (obj)).mId))
            {
                return false;
            }
            if (mName == null ? ((Network) (obj)).mName != null : !mName.equals(((Network) (obj)).mName))
            {
                return false;
            }
            if (mNetworkType != ((Network) (obj)).mNetworkType)
            {
                return false;
            }
            if (mState != ((Network) (obj)).mState)
            {
                return false;
            }
        }
        return true;
    }

    public String getId()
    {
        return mId;
    }

    public String getName()
    {
        return mName;
    }

    public Type getNetworkType()
    {
        return mNetworkType;
    }

    public State getState()
    {
        return mState;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (mNetworkType != null)
        {
            i = mNetworkType.hashCode();
        } else
        {
            i = 0;
        }
        if (mState != null)
        {
            j = mState.hashCode();
        } else
        {
            j = 0;
        }
        if (mId != null)
        {
            k = mId.hashCode();
        } else
        {
            k = 0;
        }
        if (mName != null)
        {
            l = mName.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }

    private class Type extends Enum
        implements fhj, fhx
    {

        public static final Type a;
        public static final Type b;
        public static final Type c;
        public static final Type d;
        private static Type e;
        private static final Type f[];
        fhi mConnectDialogFragment;
        public String mName;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/spotify/mobile/android/spotlets/share/model/Network$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])f.clone();
        }

        public final String a()
        {
            return toString().toLowerCase(Locale.ENGLISH);
        }

        static 
        {
            a = new Type("FACEBOOK", "Facebook") {

                public final fhi a(Flags flags)
                {
                    return new fhk();
                }

                public final OAuthInfo b()
                {
                    return null;
                }

            };
            b = new Type("TWITTER", "Twitter") {

                public final fhi a(Flags flags)
                {
                    if (((String)flags.a(fys.Y)).equals("Enabled"))
                    {
                        return fht.a(this);
                    } else
                    {
                        return fhl.a(this);
                    }
                }

                public final OAuthInfo b()
                {
                    return OAuthInfo.a;
                }

            };
            c = new Type("TUMBLR", "Tumblr") {

                public final fhi a(Flags flags)
                {
                    if (((String)flags.a(fys.Y)).equals("Enabled"))
                    {
                        return fht.a(this);
                    } else
                    {
                        return fhl.a(this);
                    }
                }

                public final OAuthInfo b()
                {
                    return OAuthInfo.b;
                }

            };
            e = new Type("GOOGLE_PLUS", "Google+") {

                public final fhi a(Flags flags)
                {
                    return null;
                }

                public final OAuthInfo b()
                {
                    return null;
                }

            };
            d = new Type("SPOTIFY", "Spotify") {

                public final fhi a(Flags flags)
                {
                    return null;
                }

                public final OAuthInfo b()
                {
                    return null;
                }

            };
            f = (new Type[] {
                a, b, c, e, d
            });
        }

        private Type(String s, int i, String s1)
        {
            super(s, i);
            mName = s1;
        }

        Type(String s, int i, String s1, byte byte0)
        {
            this(s, i, s1);
        }
    }


    private class State extends Enum
    {

        public static final State a;
        public static final State b;
        private static State c;
        private static final State d[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/spotify/mobile/android/spotlets/share/model/Network$State, s);
        }

        public static State[] values()
        {
            return (State[])d.clone();
        }

        static 
        {
            a = new State("CONNECTED", 0);
            b = new State("DISCONNECTED", 1);
            c = new State("UNKNOWN", 2);
            d = (new State[] {
                a, b, c
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }

}
