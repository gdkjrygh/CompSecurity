// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class bot
{

    private static final bou d = (new bou()).a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4).a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4).a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4).a("com.google.android.gms.cast.metadata.TITLE", "title", 1).a("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1).a("com.google.android.gms.cast.metadata.ARTIST", "artist", 1).a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1).a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1).a("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1).a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2).a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2).a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2).a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2).a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1).a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1).a("com.google.android.gms.cast.metadata.WIDTH", "width", 2).a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2).a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1).a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3).a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
    final List a;
    final Bundle b;
    int c;

    public bot()
    {
        this(0);
    }

    public bot(int i)
    {
        a = new ArrayList();
        b = new Bundle();
        c = i;
    }

    private boolean a(Bundle bundle, Bundle bundle1)
    {
label0:
        {
            if (bundle.size() != bundle1.size())
            {
                return false;
            }
            Iterator iterator = bundle.keySet().iterator();
            Object obj;
            Object obj1;
label1:
            do
            {
                String s;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    s = (String)iterator.next();
                    obj = bundle.get(s);
                    obj1 = bundle1.get(s);
                    if ((obj instanceof Bundle) && (obj1 instanceof Bundle) && !a((Bundle)obj, (Bundle)obj1))
                    {
                        return false;
                    }
                    if (obj != null)
                    {
                        continue label1;
                    }
                } while (obj1 == null && bundle1.containsKey(s));
                return false;
            } while (obj.equals(obj1));
            return false;
        }
        return true;
    }

    private transient void b(JSONObject jsonobject, String as[])
    {
        String s;
        Object obj;
        int i;
        int j;
        try
        {
            j = as.length;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L14:
        if (i >= j) goto _L2; else goto _L1
_L1:
        s = as[i];
        if (!b.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_245;
        }
        d.b(s);
        JVM INSTR tableswitch 1 4: default 245
    //                   1 68
    //                   2 91
    //                   3 114
    //                   4 68;
           goto _L3 _L4 _L5 _L6 _L4
_L3:
        break MISSING_BLOCK_LABEL_245;
_L4:
        jsonobject.put(d.a(s), b.getString(s));
        break MISSING_BLOCK_LABEL_245;
_L5:
        jsonobject.put(d.a(s), b.getInt(s));
        break MISSING_BLOCK_LABEL_245;
_L6:
        jsonobject.put(d.a(s), b.getDouble(s));
        break MISSING_BLOCK_LABEL_245;
_L2:
        as = b.keySet().iterator();
_L9:
        do
        {
            if (!as.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)as.next();
        } while (s.startsWith("com.google."));
        obj = b.get(s);
        if (!(obj instanceof String)) goto _L8; else goto _L7
_L7:
        jsonobject.put(s, obj);
          goto _L9
_L8:
        if (!(obj instanceof Integer)) goto _L11; else goto _L10
_L10:
        jsonobject.put(s, obj);
          goto _L9
_L11:
        if (!(obj instanceof Double)) goto _L9; else goto _L12
_L12:
        jsonobject.put(s, obj);
          goto _L9
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L14; else goto _L13
_L13:
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("metadataType", c);
        }
        catch (JSONException jsonexception) { }
        clr.a(jsonobject, a);
        switch (c)
        {
        default:
            b(jsonobject, new String[0]);
            return jsonobject;

        case 0: // '\0'
            b(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"
            });
            return jsonobject;

        case 1: // '\001'
            b(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"
            });
            return jsonobject;

        case 2: // '\002'
            b(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"
            });
            return jsonobject;

        case 3: // '\003'
            b(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE"
            });
            return jsonobject;

        case 4: // '\004'
            b(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"
            });
            break;
        }
        return jsonobject;
    }

    final transient void a(JSONObject jsonobject, String as[])
    {
        as = new HashSet(Arrays.asList(as));
        Iterator iterator = jsonobject.keys();
_L9:
        Object obj;
        Object obj1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (String)iterator.next();
        if ("metadataType".equals(obj))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = (String)d.a.get(obj);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        boolean flag = as.contains(obj1);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = jsonobject.get(((String) (obj)));
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        d.b(((String) (obj1)));
        JVM INSTR tableswitch 1 4: default 342
    //                   1 136
    //                   2 197
    //                   3 225
    //                   4 161;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        continue; /* Loop/switch isn't completed */
_L4:
        if (obj instanceof String)
        {
            b.putString(((String) (obj1)), (String)obj);
        }
        continue; /* Loop/switch isn't completed */
_L7:
        try
        {
            if ((obj instanceof String) && clr.a((String)obj) != null)
            {
                b.putString(((String) (obj1)), (String)obj);
            }
        }
        catch (JSONException jsonexception) { }
        continue; /* Loop/switch isn't completed */
_L5:
        if (obj instanceof Integer)
        {
            b.putInt(((String) (obj1)), ((Integer)obj).intValue());
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (obj instanceof Double)
        {
            b.putDouble(((String) (obj1)), ((Double)obj).doubleValue());
        }
        continue; /* Loop/switch isn't completed */
_L2:
        obj1 = jsonobject.get(((String) (obj)));
        if (obj1 instanceof String)
        {
            b.putString(((String) (obj)), (String)obj1);
            continue; /* Loop/switch isn't completed */
        }
        if (obj1 instanceof Integer)
        {
            b.putInt(((String) (obj)), ((Integer)obj1).intValue());
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            if (obj1 instanceof Double)
            {
                b.putDouble(((String) (obj)), ((Double)obj1).doubleValue());
            }
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject) { }
        break; /* Loop/switch isn't completed */
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof bot))
            {
                return false;
            }
            obj = (bot)obj;
            if (!a(b, ((bot) (obj)).b) || !a.equals(((bot) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        Iterator iterator = b.keySet().iterator();
        String s;
        int i;
        for (i = 17; iterator.hasNext(); i = b.get(s).hashCode() + i * 31)
        {
            s = (String)iterator.next();
        }

        return i * 31 + a.hashCode();
    }

}
