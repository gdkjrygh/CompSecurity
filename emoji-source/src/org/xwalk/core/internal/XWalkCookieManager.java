// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;


public final class XWalkCookieManager
{

    public XWalkCookieManager()
    {
    }

    private native boolean nativeAcceptCookie();

    private native boolean nativeAllowFileSchemeCookies();

    private native void nativeFlushCookieStore();

    private native String nativeGetCookie(String s);

    private native boolean nativeHasCookies();

    private native void nativeRemoveAllCookie();

    private native void nativeRemoveExpiredCookie();

    private native void nativeRemoveSessionCookie();

    private native void nativeSetAcceptCookie(boolean flag);

    private native void nativeSetAcceptFileSchemeCookies(boolean flag);

    private native void nativeSetCookie(String s, String s1);

    public boolean acceptCookie()
    {
        return nativeAcceptCookie();
    }

    public boolean allowFileSchemeCookies()
    {
        return nativeAllowFileSchemeCookies();
    }

    public void flushCookieStore()
    {
        nativeFlushCookieStore();
    }

    public String getCookie(String s)
    {
label0:
        {
            String s1 = nativeGetCookie(s.toString());
            if (s1 != null)
            {
                s = s1;
                if (!s1.trim().isEmpty())
                {
                    break label0;
                }
            }
            s = null;
        }
        return s;
    }

    public boolean hasCookies()
    {
        return nativeHasCookies();
    }

    public void removeAllCookie()
    {
        nativeRemoveAllCookie();
    }

    public void removeExpiredCookie()
    {
        nativeRemoveExpiredCookie();
    }

    public void removeSessionCookie()
    {
        nativeRemoveSessionCookie();
    }

    public void setAcceptCookie(boolean flag)
    {
        nativeSetAcceptCookie(flag);
    }

    public void setAcceptFileSchemeCookies(boolean flag)
    {
        nativeSetAcceptFileSchemeCookies(flag);
    }

    public void setCookie(String s, String s1)
    {
        nativeSetCookie(s, s1);
    }
}
