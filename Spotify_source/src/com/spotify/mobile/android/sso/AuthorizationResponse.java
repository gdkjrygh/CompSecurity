// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.sso;


public class AuthorizationResponse
{

    final Type a;
    final String b;
    final String c;
    final String d;
    final int e;

    public AuthorizationResponse(Type type, String s, String s1, String s2, int i)
    {
        if (type == null)
        {
            type = Type.e;
        }
        a = type;
        b = s;
        c = s1;
        d = s2;
        e = i;
    }

    private class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        public static final Type c;
        public static final Type d;
        public static final Type e;
        private static final Type f[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/spotify/mobile/android/sso/AuthorizationResponse$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])f.clone();
        }

        static 
        {
            a = new Type("CODE", 0);
            b = new Type("TOKEN", 1);
            c = new Type("ERROR", 2);
            d = new Type("EMPTY", 3);
            e = new Type("UNKNOWN", 4);
            f = (new Type[] {
                a, b, c, d, e
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }

}
