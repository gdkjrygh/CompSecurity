// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;


// Referenced classes of package android.support.v4.text:
//            ICUCompatIcs

public class ICUCompat
{
    static interface ICUCompatImpl
    {

        public abstract String addLikelySubtags(String s);

        public abstract String getScript(String s);
    }

    static class ICUCompatImplBase
        implements ICUCompatImpl
    {

        public String addLikelySubtags(String s)
        {
            return s;
        }

        public String getScript(String s)
        {
            return null;
        }

        ICUCompatImplBase()
        {
        }
    }

    static class ICUCompatImplIcs
        implements ICUCompatImpl
    {

        public String addLikelySubtags(String s)
        {
            return ICUCompatIcs.addLikelySubtags(s);
        }

        public String getScript(String s)
        {
            return ICUCompatIcs.getScript(s);
        }

        ICUCompatImplIcs()
        {
        }
    }


    private static final ICUCompatImpl IMPL;

    public ICUCompat()
    {
    }

    public static String addLikelySubtags(String s)
    {
        return IMPL.addLikelySubtags(s);
    }

    public static String getScript(String s)
    {
        return IMPL.getScript(s);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new ICUCompatImplIcs();
        } else
        {
            IMPL = new ICUCompatImplBase();
        }
    }
}
