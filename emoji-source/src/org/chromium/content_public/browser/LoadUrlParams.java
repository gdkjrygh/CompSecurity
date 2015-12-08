// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content_public.browser;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.chromium.content_public.common.Referrer;

public class LoadUrlParams
{

    static final boolean $assertionsDisabled;
    public static final int LOAD_TYPE_BROWSER_INITIATED_HTTP_POST = 1;
    public static final int LOAD_TYPE_DATA = 2;
    public static final int LOAD_TYPE_DEFAULT = 0;
    public static final int UA_OVERRIDE_FALSE = 1;
    public static final int UA_OVERRIDE_INHERIT = 0;
    public static final int UA_OVERRIDE_TRUE = 2;
    String mBaseUrlForDataUrl;
    boolean mCanLoadLocalResources;
    private Map mExtraHeaders;
    boolean mIsRendererInitiated;
    int mLoadUrlType;
    byte mPostData[];
    Referrer mReferrer;
    int mTransitionType;
    int mUaOverrideOption;
    String mUrl;
    private String mVerbatimHeaders;
    String mVirtualUrlForDataUrl;

    public LoadUrlParams(String s)
    {
        this(s, 0);
    }

    public LoadUrlParams(String s, int i)
    {
        mUrl = s;
        mTransitionType = i;
        mLoadUrlType = 0;
        mUaOverrideOption = 0;
        mPostData = null;
        mBaseUrlForDataUrl = null;
        mVirtualUrlForDataUrl = null;
    }

    public static LoadUrlParams createLoadDataParams(String s, String s1, boolean flag)
    {
        return createLoadDataParams(s, s1, flag, null);
    }

    public static LoadUrlParams createLoadDataParams(String s, String s1, boolean flag, String s2)
    {
        StringBuilder stringbuilder = new StringBuilder("data:");
        stringbuilder.append(s1);
        if (s2 != null && !s2.isEmpty())
        {
            stringbuilder.append((new StringBuilder()).append(";charset=").append(s2).toString());
        }
        if (flag)
        {
            stringbuilder.append(";base64");
        }
        stringbuilder.append(",");
        stringbuilder.append(s);
        s = new LoadUrlParams(stringbuilder.toString());
        s.setLoadType(2);
        s.setTransitionType(1);
        return s;
    }

    public static LoadUrlParams createLoadDataParamsWithBaseUrl(String s, String s1, boolean flag, String s2, String s3)
    {
        return createLoadDataParamsWithBaseUrl(s, s1, flag, s2, s3, null);
    }

    public static LoadUrlParams createLoadDataParamsWithBaseUrl(String s, String s1, boolean flag, String s2, String s3, String s4)
    {
        s = createLoadDataParams(s, s1, flag, s4);
        if (s2 == null || !s2.toLowerCase(Locale.US).startsWith("data:"))
        {
            if (s2 == null)
            {
                s2 = "about:blank";
            }
            s.setBaseUrlForDataUrl(s2);
            if (s3 == null)
            {
                s3 = "about:blank";
            }
            s.setVirtualUrlForDataUrl(s3);
        }
        return s;
    }

    public static LoadUrlParams createLoadHttpPostParams(String s, byte abyte0[])
    {
        s = new LoadUrlParams(s);
        s.setLoadType(1);
        s.setTransitionType(1);
        s.setPostData(abyte0);
        return s;
    }

    private String getExtraHeadersString(String s, boolean flag)
    {
        if (mExtraHeaders == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        java.util.Map.Entry entry;
        for (Iterator iterator = mExtraHeaders.entrySet().iterator(); iterator.hasNext(); stringbuilder.append((String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(s);
            }
            stringbuilder.append(((String)entry.getKey()).toLowerCase(Locale.US));
            stringbuilder.append(":");
        }

        if (flag)
        {
            stringbuilder.append(s);
        }
        return stringbuilder.toString();
    }

    private static void initializeConstants(int i, int j, int k, int l, int i1, int j1)
    {
        if (!$assertionsDisabled && i != 0)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && 1 != j)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && 2 != k)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && l != 0)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && 1 != i1)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && 2 != j1)
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    private static native boolean nativeIsDataScheme(String s);

    public String getBaseUrl()
    {
        return mBaseUrlForDataUrl;
    }

    public boolean getCanLoadLocalResources()
    {
        return mCanLoadLocalResources;
    }

    public Map getExtraHeaders()
    {
        return mExtraHeaders;
    }

    public String getExtraHeadersString()
    {
        return getExtraHeadersString("\n", false);
    }

    public String getExtraHttpRequestHeadersString()
    {
        return getExtraHeadersString("\r\n", true);
    }

    public boolean getIsRendererInitiated()
    {
        return mIsRendererInitiated;
    }

    public int getLoadUrlType()
    {
        return mLoadUrlType;
    }

    public byte[] getPostData()
    {
        return mPostData;
    }

    public Referrer getReferrer()
    {
        return mReferrer;
    }

    public int getTransitionType()
    {
        return mTransitionType;
    }

    public String getUrl()
    {
        return mUrl;
    }

    public int getUserAgentOverrideOption()
    {
        return mUaOverrideOption;
    }

    public String getVerbatimHeaders()
    {
        return mVerbatimHeaders;
    }

    public String getVirtualUrlForDataUrl()
    {
        return mVirtualUrlForDataUrl;
    }

    public boolean isBaseUrlDataScheme()
    {
        if (mBaseUrlForDataUrl == null && mLoadUrlType == 2)
        {
            return true;
        } else
        {
            return nativeIsDataScheme(mBaseUrlForDataUrl);
        }
    }

    public void setBaseUrlForDataUrl(String s)
    {
        mBaseUrlForDataUrl = s;
    }

    public void setCanLoadLocalResources(boolean flag)
    {
        mCanLoadLocalResources = flag;
    }

    public void setExtraHeaders(Map map)
    {
        mExtraHeaders = map;
    }

    public void setIsRendererInitiated(boolean flag)
    {
        mIsRendererInitiated = flag;
    }

    public void setLoadType(int i)
    {
        mLoadUrlType = i;
    }

    public void setOverrideUserAgent(int i)
    {
        mUaOverrideOption = i;
    }

    public void setPostData(byte abyte0[])
    {
        mPostData = abyte0;
    }

    public void setReferrer(Referrer referrer)
    {
        mReferrer = referrer;
    }

    public void setTransitionType(int i)
    {
        mTransitionType = i;
    }

    public void setUrl(String s)
    {
        mUrl = s;
    }

    public void setVerbatimHeaders(String s)
    {
        mVerbatimHeaders = s;
    }

    public void setVirtualUrlForDataUrl(String s)
    {
        mVirtualUrlForDataUrl = s;
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content_public/browser/LoadUrlParams.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
