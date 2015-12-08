// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import com.spotify.mobile.android.util.logging.Logger;
import cty;
import dmz;
import gby;
import gfn;
import java.util.ArrayList;

public class Assertion
{

    public static final gby a = new gby() {

        public final void a(RecoverableAssertionError recoverableassertionerror)
        {
            Throwable throwable = recoverableassertionerror.getCause();
            if (throwable != null)
            {
                recoverableassertionerror.getMessage();
                throwable.getMessage();
            } else
            {
                recoverableassertionerror.getMessage();
            }
            if (recoverableassertionerror.mDetails == null);
            ((gfn)dmz.a(com/spotify/mobile/android/util/Assertion, gfn)).a(recoverableassertionerror);
        }

        public final void a(AssertionError assertionerror)
        {
            Logger.b(assertionerror, "", new Object[0]);
            throw assertionerror;
        }

        public final void a(Throwable throwable)
        {
            throwable.getMessage();
            ((gfn)dmz.a(com/spotify/mobile/android/util/Assertion, gfn)).a(throwable);
        }

        public final void b(RecoverableAssertionError recoverableassertionerror)
        {
            a(recoverableassertionerror);
        }

    };
    private static gby b;

    public Assertion()
    {
    }

    private static void a(RecoverableAssertionError recoverableassertionerror)
    {
        a(((Error) (recoverableassertionerror)));
        ((gby)dmz.a(com/spotify/mobile/android/util/Assertion, gby)).a(recoverableassertionerror);
    }

    public static void a(gfn gfn1, gby gby1)
    {
        dmz.a(com/spotify/mobile/android/util/Assertion, gfn, gfn1);
        dmz.a(com/spotify/mobile/android/util/Assertion, gby, gby1);
    }

    private static void a(AssertionError assertionerror)
    {
        a(((Error) (assertionerror)));
        ((gby)dmz.a(com/spotify/mobile/android/util/Assertion, gby)).a(assertionerror);
    }

    public static void a(CharSequence charsequence, String s)
    {
        if (charsequence == null)
        {
            a("chars is null");
        } else
        if (charsequence.length() <= 0)
        {
            a(s);
            return;
        }
    }

    private static void a(Error error)
    {
        ArrayList arraylist = new ArrayList();
        StackTraceElement astacktraceelement[] = error.getStackTrace();
        int j = astacktraceelement.length;
        for (int i = 0; i < j; i++)
        {
            StackTraceElement stacktraceelement = astacktraceelement[i];
            String s = stacktraceelement.getClassName();
            if (!com/spotify/mobile/android/util/Assertion.getCanonicalName().equals(s))
            {
                arraylist.add(stacktraceelement);
            }
        }

        error.setStackTrace((StackTraceElement[])arraylist.toArray(new StackTraceElement[arraylist.size()]));
    }

    public static void a(Exception exception)
    {
        Logger.b(exception, "[no message]", new Object[0]);
        a(new AssertionError(exception));
    }

    public static void a(Object obj)
    {
        a(obj, "Object failed null check");
    }

    public static void a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            if (obj1 != null)
            {
                a((new StringBuilder("The two objects(null, ")).append(obj1).append(") are not equal.").toString());
            }
        } else
        if (!obj.equals(obj1))
        {
            a((new StringBuilder("The two objects(")).append(obj).append(", ").append(obj1).append(") are not equal.").toString());
            return;
        }
    }

    public static void a(Object obj, String s)
    {
        if (obj == null)
        {
            a(s);
        }
    }

    public static void a(String s)
    {
        Logger.c("%s", new Object[] {
            s
        });
        a(new AssertionError(s));
    }

    public static void a(String s, Exception exception)
    {
        Logger.b(exception, "%s", new Object[] {
            s
        });
        a(new AssertionError(new RuntimeException(s, exception)));
    }

    public static void a(String s, String s1)
    {
        a(new RecoverableAssertionError(s, s1));
    }

    public static void a(String s, Throwable throwable)
    {
        a(new RecoverableAssertionError(s, throwable));
    }

    public static void a(Throwable throwable)
    {
        ((gby)dmz.a(com/spotify/mobile/android/util/Assertion, gby)).a(throwable);
    }

    public static void a(boolean flag, String s)
    {
        if (!flag)
        {
            a(s);
        }
    }

    private static void b(RecoverableAssertionError recoverableassertionerror)
    {
        a(recoverableassertionerror);
        ((gby)dmz.a(com/spotify/mobile/android/util/Assertion, gby)).b(recoverableassertionerror);
    }

    public static void b(CharSequence charsequence, String s)
    {
        if (charsequence == null || charsequence.length() <= 0)
        {
            d(s);
        }
    }

    public static void b(Object obj, Object obj1)
    {
        boolean flag;
        if (obj != null)
        {
            flag = obj.equals(obj1);
        } else
        if (obj1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a((new StringBuilder("The two objects(")).append(obj).append(", ").append(obj1).append(") are equal.").toString());
        }
    }

    public static void b(String s)
    {
        d(s);
    }

    public static void b(String s, Throwable throwable)
    {
        b(new RecoverableAssertionError(s, throwable));
    }

    public static void b(boolean flag, String s)
    {
        if (flag)
        {
            a(s);
        }
    }

    public static void c(Object obj, Object obj1)
    {
        if (!cty.a(obj, obj1))
        {
            d((new StringBuilder("The two objects (")).append(obj).append(", ").append(obj1).append(") are not equal.").toString());
        }
    }

    public static void c(String s)
    {
        b(new RecoverableAssertionError(s));
    }

    public static void c(boolean flag, String s)
    {
        if (!flag)
        {
            d(s);
        }
    }

    private static void d(String s)
    {
        a(new RecoverableAssertionError(s));
    }

    static 
    {
        b = new gby() {

            public final void a(RecoverableAssertionError recoverableassertionerror)
            {
                Logger.b(recoverableassertionerror, "", new Object[0]);
                throw recoverableassertionerror;
            }

            public final void a(AssertionError assertionerror)
            {
                Logger.b(assertionerror, "", new Object[0]);
                throw assertionerror;
            }

            public final void a(Throwable throwable)
            {
                throwable.getMessage();
                throw throwable;
            }

            public final void b(RecoverableAssertionError recoverableassertionerror)
            {
                Logger.b(recoverableassertionerror, "", new Object[0]);
            }

        };
        a(gfn.a, b);
    }

    private class RecoverableAssertionError extends Error
    {

        private static final long serialVersionUID = 1L;
        final String mDetails;

        public RecoverableAssertionError(String s)
        {
            this(s, ((String) (null)));
        }

        public RecoverableAssertionError(String s, String s1)
        {
            super(s);
            mDetails = s1;
        }

        public RecoverableAssertionError(String s, Throwable throwable)
        {
            this(s, throwable, (byte)0);
        }

        private RecoverableAssertionError(String s, Throwable throwable, byte byte0)
        {
            super(s, throwable);
            mDetails = null;
        }
    }

}
