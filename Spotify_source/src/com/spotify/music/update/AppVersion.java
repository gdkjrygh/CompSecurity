// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.update;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import ctz;
import gcy;
import java.text.ParseException;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.spotify.music.update:
//            AppVersionParsingException

public final class AppVersion
{

    public final long a;
    public final int b;
    public final int c;
    public final long d;
    private final Source e;
    private final String f;

    public AppVersion(Source source, String s, long l, int i, int j, long l1)
    {
        a = l;
        d = l1;
        e = (Source)ctz.a(source);
        f = (String)ctz.a(s);
        b = i;
        c = j;
    }

    public static AppVersion a(JSONObject jsonobject)
    {
        boolean flag1 = true;
        Source source;
        String s;
        int i;
        int j;
        long l;
        long l1;
        source = Source.a(jsonobject.getString("source"));
        s = jsonobject.getString("abi");
        i = jsonobject.getInt("minApi");
        j = jsonobject.getInt("versionCode");
        l = gcy.a(jsonobject.getString("releaseDate")).getTimeInMillis();
        l1 = jsonobject.getLong("notificationDelay");
        Assertion.a(source);
        Assertion.a(s, (new StringBuilder("abi string is empty or null: ")).append(s).toString());
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertion.a(flag, (new StringBuilder("minApi is not positive: ")).append(i).toString());
        if (j > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Assertion.a(flag, (new StringBuilder("versionCode is not positive: ")).append(j).toString());
        jsonobject = new AppVersion(source, s, l1, i, j, l);
        return jsonobject;
        jsonobject;
_L2:
        throw new AppVersionParsingException(jsonobject);
        jsonobject;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private String a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("source", e.toString());
            jsonobject.put("abi", f);
            jsonobject.put("minApi", b);
            jsonobject.put("versionCode", c);
            jsonobject.put("notificationDelay", a);
            jsonobject.put("releaseDate", d);
        }
        catch (JSONException jsonexception)
        {
            Assertion.a("Failed to convert AppVersion object to JSON.", jsonexception.getMessage());
        }
        return jsonobject.toString();
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AppVersion)obj;
            Logger.a("UpdateNag: Comparing Versions: \n Installed: ABI: %s, Source: %s \n Available: ABI %s, Source: %s;", new Object[] {
                f, e, ((AppVersion) (obj)).f, ((AppVersion) (obj)).e
            });
            if (!f.equals(((AppVersion) (obj)).f))
            {
                return false;
            }
            if (e == null ? ((AppVersion) (obj)).e != null : !e.equals(((AppVersion) (obj)).e))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i;
        if (e != null)
        {
            i = e.hashCode();
        } else
        {
            i = 0;
        }
        return i * 31 + f.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("AppVersion:")).append(a()).toString();
    }

    private class Source extends Enum
    {

        public static final Source a;
        public static final Source b;
        public static final Source c;
        private static final Source d[];

        public static Source a(String s)
        {
            if (s != null) goto _L2; else goto _L1
_L1:
            s = c;
_L4:
            return s;
_L2:
            String s1 = s.toLowerCase(Locale.US);
            Source asource[] = values();
            int j = asource.length;
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    Source source = asource[i];
                    s = source;
                    if (s1.equals(source.toString()))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
            return c;
        }

        public static Source valueOf(String s)
        {
            return (Source)Enum.valueOf(com/spotify/music/update/AppVersion$Source, s);
        }

        public static Source[] values()
        {
            return (Source[])d.clone();
        }

        public final String toString()
        {
            return super.toString().toLowerCase(Locale.US);
        }

        static 
        {
            a = new Source("GOOGLE_PLAY", 0);
            b = new Source("AMAZON", 1);
            c = new Source("UNKNOWN", 2);
            d = (new Source[] {
                a, b, c
            });
        }

        private Source(String s, int i)
        {
            super(s, i);
        }
    }

}
