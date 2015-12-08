// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;


public interface CommandPathEncoder
{

    public static final CommandPathEncoder ARGUMENT_PATH_ENCODER = new CommandPathEncoder() {

        public final transient String encode(String s, Object aobj[])
        {
            s = (new StringBuilder("/")).append(s);
            int j = aobj.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = aobj[i];
                s.append("/").append(obj.toString());
            }

            return s.toString();
        }

    };
    public static final CommandPathEncoder DEFAULT_PATH_ENCODER = new CommandPathEncoder() {

        public final transient String encode(String s, Object aobj[])
        {
            return (new StringBuilder("/")).append(s).toString();
        }

    };
    public static final CommandPathEncoder SIMPLE_PATH_ENCODER = new CommandPathEncoder() {

        public final transient String encode(String s, Object aobj[])
        {
            return (new StringBuilder("/")).append(s).append('/').append(aobj[0]).toString();
        }

    };

    public transient abstract String encode(String s, Object aobj[]);

}
