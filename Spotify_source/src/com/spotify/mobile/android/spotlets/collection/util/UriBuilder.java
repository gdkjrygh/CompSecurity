// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.util;

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import gfp;
import java.util.Locale;

public final class UriBuilder
{

    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public gfp n;
    public Integer o;
    public com.spotify.mobile.android.spotlets.show.model.Show.MediaType p;
    public Format q;
    private String r;
    private String s;
    private Integer t;
    private Integer u;
    private Integer v;

    public UriBuilder(String s1)
    {
        Assertion.a(s1);
        Assertion.b(s1.contains("?"), "Base uri should not contain a question mark (?).");
        a = s1;
    }

    private String a(gfp gfp1)
    {
label0:
        {
            gfp gfp2 = gfp1.d;
            boolean flag1 = gfp1.b();
            boolean flag;
            if (!TextUtils.equals(gfp1.a, "addTime"))
            {
                flag = flag1;
                if (!TextUtils.equals(gfp1.a, "publishDate"))
                {
                    break label0;
                }
            }
            StringBuilder stringbuilder;
            if (!flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        stringbuilder = (new StringBuilder()).append(Uri.encode(gfp1.a));
        if (flag)
        {
            gfp1 = " DESC";
        } else
        {
            gfp1 = "";
        }
        stringbuilder = stringbuilder.append(gfp1);
        if (gfp2 != null)
        {
            gfp1 = (new StringBuilder(",")).append(a(gfp2)).toString();
        } else
        {
            gfp1 = "";
        }
        return stringbuilder.append(gfp1).toString();
    }

    private static void a(StringBuilder stringbuilder, String s1, String s2)
    {
        int i1 = stringbuilder.indexOf(s1);
        if (i1 == -1)
        {
            return;
        } else
        {
            stringbuilder.replace(i1, s1.length() + i1, s2);
            return;
        }
    }

    public final UriBuilder a(int i1)
    {
        v = Integer.valueOf(i1);
        return this;
    }

    public final UriBuilder a(Integer integer, Integer integer1)
    {
        t = integer;
        u = integer1;
        return this;
    }

    public final UriBuilder a(String s1)
    {
        Assertion.a(a.contains("<username>"), "Base uri does not contain the username placeholder.");
        r = s1;
        return this;
    }

    public final String a()
    {
        StringBuilder stringbuilder = new StringBuilder(a);
        String s1;
        boolean flag1;
        boolean flag2;
        if (l && m)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Assertion.b(flag2, "play() and offline() cannot be set at the same time.");
        if (l)
        {
            boolean flag;
            if (stringbuilder.charAt(stringbuilder.length() - 1) == '/')
            {
                s1 = "play";
            } else
            {
                s1 = "/play";
            }
            stringbuilder.append(s1);
        }
        if (m)
        {
            if (stringbuilder.charAt(stringbuilder.length() - 1) == '/')
            {
                s1 = "offline";
            } else
            {
                s1 = "/offline";
            }
            stringbuilder.append(s1);
        }
        if (!TextUtils.isEmpty(r))
        {
            a(stringbuilder, "<username>", Uri.encode(r));
        }
        if (!TextUtils.isEmpty(s))
        {
            a(stringbuilder, "<b62-album-id>", Uri.encode(s));
        }
        if (!TextUtils.isEmpty(null))
        {
            a(stringbuilder, "<b62-artist-id>", Uri.encode(null));
        }
        if (!TextUtils.isEmpty(b))
        {
            a(stringbuilder, "<b62-show-id>", Uri.encode(b));
        }
        if (!TextUtils.isEmpty(null))
        {
            a(stringbuilder, "<playlist-uri>", Uri.encode(null));
        }
        if (!TextUtils.isEmpty(null))
        {
            a(stringbuilder, "<folder-id>", Uri.encode(null));
        }
        stringbuilder.append("?sort=");
        if (n != null)
        {
            stringbuilder.append(a(n));
        }
        if (!TextUtils.isEmpty(null))
        {
            if (n != null)
            {
                stringbuilder.append(',');
            }
            stringbuilder.append(Uri.encode(null));
        }
        stringbuilder.append("&filter=");
        if (!TextUtils.isEmpty(c))
        {
            stringbuilder.append(String.format(Locale.US, "text contains %s", new Object[] {
                Uri.encode(c)
            }));
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag = flag1;
        if (e)
        {
            if (flag1)
            {
                stringbuilder.append(',');
            }
            stringbuilder.append("availableOffline eq true");
            flag = true;
        }
        flag1 = flag;
        if (f)
        {
            if (flag)
            {
                stringbuilder.append(',');
            }
            stringbuilder.append("complete eq true");
            flag1 = true;
        }
        flag = flag1;
        if (g)
        {
            if (flag1)
            {
                stringbuilder.append(',');
            }
            stringbuilder.append("inCollection eq true");
            flag = true;
        }
        flag1 = flag;
        if (h)
        {
            if (flag)
            {
                stringbuilder.append(',');
            }
            stringbuilder.append("timeLeft gt 0,isPlayed ne true");
            flag1 = true;
        }
        flag = flag1;
        if (i)
        {
            if (flag1)
            {
                stringbuilder.append(',');
            }
            stringbuilder.append("available eq true");
            flag = true;
        }
        if (p != null)
        {
            if (flag)
            {
                stringbuilder.append(',');
            }
            stringbuilder.append("mediaTypeEnum eq ").append(p.ordinal());
        }
        if (j)
        {
            stringbuilder.append("&group");
        }
        if (t != null && u != null)
        {
            stringbuilder.append(String.format(Locale.US, "&start=%d&length=%d", new Object[] {
                t, u
            }));
        }
        if (v != null)
        {
            stringbuilder.append(String.format(Locale.US, "&updateThrottling=%d", new Object[] {
                v
            }));
        }
        if (q != null)
        {
            stringbuilder.append(String.format("&responseFormat=%s", new Object[] {
                q.toString().toLowerCase(Locale.US)
            }));
        }
        if (d != null)
        {
            stringbuilder.append(String.format("&includeInRange=%s", new Object[] {
                d
            }));
        }
        if (o != null)
        {
            stringbuilder.append(String.format("&includeInRangeContext=%s", new Object[] {
                o
            }));
        }
        if (k)
        {
            stringbuilder.append("&preferCached");
        }
        return stringbuilder.toString();
    }

    public final UriBuilder b(String s1)
    {
        Assertion.a(a.contains("<b62-album-id>"), "Base uri does not contain the album id placeholder.");
        s = s1;
        return this;
    }

    private class Format extends Enum
    {

        public static final Format a;
        public static final Format b;
        private static final Format c[];

        public static Format valueOf(String s1)
        {
            return (Format)Enum.valueOf(com/spotify/mobile/android/spotlets/collection/util/UriBuilder$Format, s1);
        }

        public static Format[] values()
        {
            return (Format[])c.clone();
        }

        static 
        {
            a = new Format("JSON", 0);
            b = new Format("PROTOBUF", 1);
            c = (new Format[] {
                a, b
            });
        }

        private Format(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
