// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.HeaderParser;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.okhttp:
//            Headers

public final class CacheControl
{

    public static final CacheControl FORCE_CACHE;
    public static final CacheControl FORCE_NETWORK = (new Builder()).noCache().build();
    String headerValue;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    private CacheControl(Builder builder)
    {
        noCache = builder.noCache;
        noStore = builder.noStore;
        maxAgeSeconds = builder.maxAgeSeconds;
        sMaxAgeSeconds = -1;
        isPrivate = false;
        isPublic = false;
        mustRevalidate = false;
        maxStaleSeconds = builder.maxStaleSeconds;
        minFreshSeconds = builder.minFreshSeconds;
        onlyIfCached = builder.onlyIfCached;
        noTransform = builder.noTransform;
    }


    private CacheControl(boolean flag, boolean flag1, int i, int j, boolean flag2, boolean flag3, boolean flag4, 
            int k, int l, boolean flag5, boolean flag6, String s)
    {
        noCache = flag;
        noStore = flag1;
        maxAgeSeconds = i;
        sMaxAgeSeconds = j;
        isPrivate = flag2;
        isPublic = flag3;
        mustRevalidate = flag4;
        maxStaleSeconds = k;
        minFreshSeconds = l;
        onlyIfCached = flag5;
        noTransform = flag6;
        headerValue = s;
    }

    private String headerValue()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (noCache)
        {
            stringbuilder.append("no-cache, ");
        }
        if (noStore)
        {
            stringbuilder.append("no-store, ");
        }
        if (maxAgeSeconds != -1)
        {
            stringbuilder.append("max-age=").append(maxAgeSeconds).append(", ");
        }
        if (sMaxAgeSeconds != -1)
        {
            stringbuilder.append("s-maxage=").append(sMaxAgeSeconds).append(", ");
        }
        if (isPrivate)
        {
            stringbuilder.append("private, ");
        }
        if (isPublic)
        {
            stringbuilder.append("public, ");
        }
        if (mustRevalidate)
        {
            stringbuilder.append("must-revalidate, ");
        }
        if (maxStaleSeconds != -1)
        {
            stringbuilder.append("max-stale=").append(maxStaleSeconds).append(", ");
        }
        if (minFreshSeconds != -1)
        {
            stringbuilder.append("min-fresh=").append(minFreshSeconds).append(", ");
        }
        if (onlyIfCached)
        {
            stringbuilder.append("only-if-cached, ");
        }
        if (noTransform)
        {
            stringbuilder.append("no-transform, ");
        }
        if (stringbuilder.length() == 0)
        {
            return "";
        } else
        {
            stringbuilder.delete(stringbuilder.length() - 2, stringbuilder.length());
            return stringbuilder.toString();
        }
    }

    public static CacheControl parse(Headers headers)
    {
        String s;
        int i;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int i3;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        flag4 = false;
        j1 = -1;
        i1 = -1;
        flag6 = false;
        flag5 = false;
        flag3 = false;
        l = -1;
        k = -1;
        flag2 = false;
        flag1 = false;
        i = 1;
        i3 = headers.size();
        k1 = 0;
        s = null;
        flag = false;
_L1:
        String s1;
        int j;
        int i2;
        int j2;
        int k2;
        int l2;
        boolean flag7;
        boolean flag8;
        boolean flag9;
        boolean flag10;
        boolean flag11;
        boolean flag12;
        boolean flag13;
        if (k1 < i3)
        {
            s1 = headers.name(k1);
            String s2 = headers.value(k1);
            int l1;
            if (s1.equalsIgnoreCase("Cache-Control"))
            {
                if (s != null)
                {
                    i = 0;
                } else
                {
                    s = s2;
                }
            } else
            {
label0:
                {
                    if (!s1.equalsIgnoreCase("Pragma"))
                    {
                        break label0;
                    }
                    i = 0;
                }
            }
            l1 = 0;
            do
            {
                s1 = s;
                flag13 = flag4;
                l2 = j1;
                k2 = i1;
                flag12 = flag6;
                flag11 = flag5;
                flag10 = flag3;
                j2 = l;
                i2 = k;
                flag9 = flag2;
                flag8 = flag1;
                j = i;
                flag7 = flag;
                if (l1 >= s2.length())
                {
                    break;
                }
                j = HeaderParser.skipUntil(s2, l1, "=,;");
                String s3 = s2.substring(l1, j).trim();
                if (j == s2.length() || s2.charAt(j) == ',' || s2.charAt(j) == ';')
                {
                    j++;
                    s1 = null;
                } else
                {
                    l1 = HeaderParser.skipWhitespace(s2, j + 1);
                    if (l1 < s2.length() && s2.charAt(l1) == '"')
                    {
                        j = l1 + 1;
                        l1 = HeaderParser.skipUntil(s2, j, "\"");
                        s1 = s2.substring(j, l1);
                        j = l1 + 1;
                    } else
                    {
                        j = HeaderParser.skipUntil(s2, l1, ",;");
                        s1 = s2.substring(l1, j).trim();
                    }
                }
                if ("no-cache".equalsIgnoreCase(s3))
                {
                    flag = true;
                    l1 = j;
                } else
                if ("no-store".equalsIgnoreCase(s3))
                {
                    flag4 = true;
                    l1 = j;
                } else
                if ("max-age".equalsIgnoreCase(s3))
                {
                    j1 = HeaderParser.parseSeconds(s1, -1);
                    l1 = j;
                } else
                if ("s-maxage".equalsIgnoreCase(s3))
                {
                    i1 = HeaderParser.parseSeconds(s1, -1);
                    l1 = j;
                } else
                if ("private".equalsIgnoreCase(s3))
                {
                    flag6 = true;
                    l1 = j;
                } else
                if ("public".equalsIgnoreCase(s3))
                {
                    flag5 = true;
                    l1 = j;
                } else
                if ("must-revalidate".equalsIgnoreCase(s3))
                {
                    flag3 = true;
                    l1 = j;
                } else
                if ("max-stale".equalsIgnoreCase(s3))
                {
                    l = HeaderParser.parseSeconds(s1, 0x7fffffff);
                    l1 = j;
                } else
                if ("min-fresh".equalsIgnoreCase(s3))
                {
                    k = HeaderParser.parseSeconds(s1, -1);
                    l1 = j;
                } else
                if ("only-if-cached".equalsIgnoreCase(s3))
                {
                    flag2 = true;
                    l1 = j;
                } else
                {
                    l1 = j;
                    if ("no-transform".equalsIgnoreCase(s3))
                    {
                        flag1 = true;
                        l1 = j;
                    }
                }
            } while (true);
            break MISSING_BLOCK_LABEL_608;
        } else
        {
            if (i == 0)
            {
                headers = null;
            } else
            {
                headers = s;
            }
            return new CacheControl(flag, flag4, j1, i1, flag6, flag5, flag3, l, k, flag2, flag1, headers);
        }
        flag7 = flag;
        j = i;
        flag8 = flag1;
        flag9 = flag2;
        i2 = k;
        j2 = l;
        flag10 = flag3;
        flag11 = flag5;
        flag12 = flag6;
        k2 = i1;
        l2 = j1;
        flag13 = flag4;
        s1 = s;
        k1++;
        flag = flag7;
        s = s1;
        flag4 = flag13;
        j1 = l2;
        i1 = k2;
        flag6 = flag12;
        flag5 = flag11;
        flag3 = flag10;
        l = j2;
        k = i2;
        flag2 = flag9;
        flag1 = flag8;
        i = j;
          goto _L1
    }

    public boolean isPrivate()
    {
        return isPrivate;
    }

    public boolean isPublic()
    {
        return isPublic;
    }

    public int maxAgeSeconds()
    {
        return maxAgeSeconds;
    }

    public int maxStaleSeconds()
    {
        return maxStaleSeconds;
    }

    public int minFreshSeconds()
    {
        return minFreshSeconds;
    }

    public boolean mustRevalidate()
    {
        return mustRevalidate;
    }

    public boolean noCache()
    {
        return noCache;
    }

    public boolean noStore()
    {
        return noStore;
    }

    public boolean noTransform()
    {
        return noTransform;
    }

    public boolean onlyIfCached()
    {
        return onlyIfCached;
    }

    public int sMaxAgeSeconds()
    {
        return sMaxAgeSeconds;
    }

    public String toString()
    {
        String s = headerValue;
        if (s != null)
        {
            return s;
        } else
        {
            String s1 = headerValue();
            headerValue = s1;
            return s1;
        }
    }

    static 
    {
        FORCE_CACHE = (new Builder()).onlyIfCached().maxStale(0x7fffffff, TimeUnit.SECONDS).build();
    }

    private class Builder
    {

        int maxAgeSeconds;
        int maxStaleSeconds;
        int minFreshSeconds;
        boolean noCache;
        boolean noStore;
        boolean noTransform;
        boolean onlyIfCached;

        public CacheControl build()
        {
            return new CacheControl(this);
        }

        public Builder maxAge(int i, TimeUnit timeunit)
        {
            if (i < 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("maxAge < 0: ").append(i).toString());
            }
            long l = timeunit.toSeconds(i);
            if (l > 0x7fffffffL)
            {
                i = 0x7fffffff;
            } else
            {
                i = (int)l;
            }
            maxAgeSeconds = i;
            return this;
        }

        public Builder maxStale(int i, TimeUnit timeunit)
        {
            if (i < 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("maxStale < 0: ").append(i).toString());
            }
            long l = timeunit.toSeconds(i);
            if (l > 0x7fffffffL)
            {
                i = 0x7fffffff;
            } else
            {
                i = (int)l;
            }
            maxStaleSeconds = i;
            return this;
        }

        public Builder minFresh(int i, TimeUnit timeunit)
        {
            if (i < 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("minFresh < 0: ").append(i).toString());
            }
            long l = timeunit.toSeconds(i);
            if (l > 0x7fffffffL)
            {
                i = 0x7fffffff;
            } else
            {
                i = (int)l;
            }
            minFreshSeconds = i;
            return this;
        }

        public Builder noCache()
        {
            noCache = true;
            return this;
        }

        public Builder noStore()
        {
            noStore = true;
            return this;
        }

        public Builder noTransform()
        {
            noTransform = true;
            return this;
        }

        public Builder onlyIfCached()
        {
            onlyIfCached = true;
            return this;
        }

        public Builder()
        {
            maxAgeSeconds = -1;
            maxStaleSeconds = -1;
            minFreshSeconds = -1;
        }
    }

}
