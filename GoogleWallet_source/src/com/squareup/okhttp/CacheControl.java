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
    public static final class Builder
    {

        int maxAgeSeconds;
        int maxStaleSeconds;
        int minFreshSeconds;
        boolean noCache;
        boolean noStore;
        boolean noTransform;
        boolean onlyIfCached;

        public final CacheControl build()
        {
            return new CacheControl(this);
        }

        public final Builder maxStale(int i, TimeUnit timeunit)
        {
            if (i < 0)
            {
                throw new IllegalArgumentException((new StringBuilder("maxStale < 0: ")).append(i).toString());
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

        public final Builder noCache()
        {
            noCache = true;
            return this;
        }

        public final Builder onlyIfCached()
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


    public static final CacheControl FORCE_CACHE;
    public static final CacheControl FORCE_NETWORK = (new Builder()).noCache().build();
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
        isPublic = false;
        mustRevalidate = false;
        maxStaleSeconds = builder.maxStaleSeconds;
        minFreshSeconds = builder.minFreshSeconds;
        onlyIfCached = builder.onlyIfCached;
        noTransform = builder.noTransform;
    }


    private CacheControl(boolean flag, boolean flag1, int i, int j, boolean flag2, boolean flag3, int k, 
            int l, boolean flag4, boolean flag5)
    {
        noCache = flag;
        noStore = flag1;
        maxAgeSeconds = i;
        sMaxAgeSeconds = j;
        isPublic = flag2;
        mustRevalidate = flag3;
        maxStaleSeconds = k;
        minFreshSeconds = l;
        onlyIfCached = flag4;
        noTransform = flag5;
    }

    public static CacheControl parse(Headers headers)
    {
        boolean flag5 = false;
        boolean flag4 = false;
        int i1 = -1;
        int l = -1;
        boolean flag3 = false;
        boolean flag2 = false;
        int k = -1;
        int j = -1;
        boolean flag1 = false;
        boolean flag = false;
        int j1 = 0;
        for (int k2 = headers.size(); j1 < k2;)
        {
            int i;
            int l1;
            int i2;
            int j2;
            boolean flag6;
            boolean flag7;
            boolean flag8;
            boolean flag9;
            boolean flag10;
            boolean flag11;
label0:
            {
                if (!headers.name(j1).equalsIgnoreCase("Cache-Control"))
                {
                    flag6 = flag5;
                    flag7 = flag4;
                    i = i1;
                    l1 = l;
                    flag8 = flag3;
                    flag9 = flag2;
                    i2 = k;
                    j2 = j;
                    flag10 = flag1;
                    flag11 = flag;
                    if (!headers.name(j1).equalsIgnoreCase("Pragma"))
                    {
                        break label0;
                    }
                }
                String s1 = headers.value(j1);
                int k1 = 0;
                do
                {
                    flag6 = flag5;
                    flag7 = flag4;
                    i = i1;
                    l1 = l;
                    flag8 = flag3;
                    flag9 = flag2;
                    i2 = k;
                    j2 = j;
                    flag10 = flag1;
                    flag11 = flag;
                    if (k1 >= s1.length())
                    {
                        break;
                    }
                    i = HeaderParser.skipUntil(s1, k1, "=,;");
                    String s2 = s1.substring(k1, i).trim();
                    String s;
                    if (i == s1.length() || s1.charAt(i) == ',' || s1.charAt(i) == ';')
                    {
                        i++;
                        s = null;
                    } else
                    {
                        k1 = HeaderParser.skipWhitespace(s1, i + 1);
                        if (k1 < s1.length() && s1.charAt(k1) == '"')
                        {
                            i = k1 + 1;
                            k1 = HeaderParser.skipUntil(s1, i, "\"");
                            s = s1.substring(i, k1);
                            i = k1 + 1;
                        } else
                        {
                            i = HeaderParser.skipUntil(s1, k1, ",;");
                            s = s1.substring(k1, i).trim();
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(s2))
                    {
                        flag5 = true;
                        k1 = i;
                    } else
                    if ("no-store".equalsIgnoreCase(s2))
                    {
                        flag4 = true;
                        k1 = i;
                    } else
                    if ("max-age".equalsIgnoreCase(s2))
                    {
                        i1 = HeaderParser.parseSeconds(s, -1);
                        k1 = i;
                    } else
                    if ("s-maxage".equalsIgnoreCase(s2))
                    {
                        l = HeaderParser.parseSeconds(s, -1);
                        k1 = i;
                    } else
                    if ("public".equalsIgnoreCase(s2))
                    {
                        flag3 = true;
                        k1 = i;
                    } else
                    if ("must-revalidate".equalsIgnoreCase(s2))
                    {
                        flag2 = true;
                        k1 = i;
                    } else
                    if ("max-stale".equalsIgnoreCase(s2))
                    {
                        k = HeaderParser.parseSeconds(s, 0x7fffffff);
                        k1 = i;
                    } else
                    if ("min-fresh".equalsIgnoreCase(s2))
                    {
                        j = HeaderParser.parseSeconds(s, -1);
                        k1 = i;
                    } else
                    if ("only-if-cached".equalsIgnoreCase(s2))
                    {
                        flag1 = true;
                        k1 = i;
                    } else
                    {
                        k1 = i;
                        if ("no-transform".equalsIgnoreCase(s2))
                        {
                            flag = true;
                            k1 = i;
                        }
                    }
                } while (true);
            }
            j1++;
            flag5 = flag6;
            flag4 = flag7;
            i1 = i;
            l = l1;
            flag3 = flag8;
            flag2 = flag9;
            k = i2;
            j = j2;
            flag1 = flag10;
            flag = flag11;
        }

        return new CacheControl(flag5, flag4, i1, l, flag3, flag2, k, j, flag1, flag);
    }

    public final boolean isPublic()
    {
        return isPublic;
    }

    public final int maxAgeSeconds()
    {
        return maxAgeSeconds;
    }

    public final int maxStaleSeconds()
    {
        return maxStaleSeconds;
    }

    public final int minFreshSeconds()
    {
        return minFreshSeconds;
    }

    public final boolean mustRevalidate()
    {
        return mustRevalidate;
    }

    public final boolean noCache()
    {
        return noCache;
    }

    public final boolean noStore()
    {
        return noStore;
    }

    public final boolean onlyIfCached()
    {
        return onlyIfCached;
    }

    public final int sMaxAgeSeconds()
    {
        return sMaxAgeSeconds;
    }

    public final String toString()
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

    static 
    {
        FORCE_CACHE = (new Builder()).onlyIfCached().maxStale(0x7fffffff, TimeUnit.SECONDS).build();
    }
}
