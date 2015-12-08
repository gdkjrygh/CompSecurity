// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.internal.ew;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaMetadata
{
    private static class a
    {

        private final Map yt = new HashMap();
        private final Map yu = new HashMap();
        private final Map yv = new HashMap();

        public String R(String s)
        {
            return (String)yt.get(s);
        }

        public String S(String s)
        {
            return (String)yu.get(s);
        }

        public int T(String s)
        {
            s = (Integer)yv.get(s);
            if (s != null)
            {
                return s.intValue();
            } else
            {
                return 0;
            }
        }

        public a a(String s, String s1, int i)
        {
            yt.put(s, s1);
            yu.put(s1, s);
            yv.put(s, Integer.valueOf(i));
            return this;
        }

        public a()
        {
        }
    }


    public static final String KEY_ALBUM_ARTIST = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";
    public static final String KEY_ALBUM_TITLE = "com.google.android.gms.cast.metadata.ALBUM_TITLE";
    public static final String KEY_ARTIST = "com.google.android.gms.cast.metadata.ARTIST";
    public static final String KEY_BROADCAST_DATE = "com.google.android.gms.cast.metadata.BROADCAST_DATE";
    public static final String KEY_COMPOSER = "com.google.android.gms.cast.metadata.COMPOSER";
    public static final String KEY_CREATION_DATE = "com.google.android.gms.cast.metadata.CREATION_DATE";
    public static final String KEY_DISC_NUMBER = "com.google.android.gms.cast.metadata.DISC_NUMBER";
    public static final String KEY_EPISODE_NUMBER = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";
    public static final String KEY_HEIGHT = "com.google.android.gms.cast.metadata.HEIGHT";
    public static final String KEY_LOCATION_LATITUDE = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";
    public static final String KEY_LOCATION_LONGITUDE = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";
    public static final String KEY_LOCATION_NAME = "com.google.android.gms.cast.metadata.LOCATION_NAME";
    public static final String KEY_RELEASE_DATE = "com.google.android.gms.cast.metadata.RELEASE_DATE";
    public static final String KEY_SEASON_NUMBER = "com.google.android.gms.cast.metadata.SEASON_NUMBER";
    public static final String KEY_SERIES_TITLE = "com.google.android.gms.cast.metadata.SERIES_TITLE";
    public static final String KEY_STUDIO = "com.google.android.gms.cast.metadata.STUDIO";
    public static final String KEY_SUBTITLE = "com.google.android.gms.cast.metadata.SUBTITLE";
    public static final String KEY_TITLE = "com.google.android.gms.cast.metadata.TITLE";
    public static final String KEY_TRACK_NUMBER = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
    public static final String KEY_WIDTH = "com.google.android.gms.cast.metadata.WIDTH";
    public static final int MEDIA_TYPE_GENERIC = 0;
    public static final int MEDIA_TYPE_MOVIE = 1;
    public static final int MEDIA_TYPE_MUSIC_TRACK = 3;
    public static final int MEDIA_TYPE_PHOTO = 4;
    public static final int MEDIA_TYPE_TV_SHOW = 2;
    public static final int MEDIA_TYPE_USER = 100;
    private static final String yp[] = {
        null, "String", "int", "double", "ISO-8601 date String"
    };
    private static final a yq = (new a()).a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4).a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4).a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4).a("com.google.android.gms.cast.metadata.TITLE", "title", 1).a("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1).a("com.google.android.gms.cast.metadata.ARTIST", "artist", 1).a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1).a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1).a("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1).a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2).a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2).a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2).a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2).a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1).a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1).a("com.google.android.gms.cast.metadata.WIDTH", "width", 2).a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2).a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1).a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3).a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
    private final List xJ;
    private final Bundle yr;
    private int ys;

    public MediaMetadata()
    {
        this(0);
    }

    public MediaMetadata(int i)
    {
        xJ = new ArrayList();
        yr = new Bundle();
        ys = i;
    }

    private transient void a(JSONObject jsonobject, String as[])
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
        if (!yr.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_249;
        }
        yq.T(s);
        JVM INSTR tableswitch 1 4: default 258
    //                   1 72
    //                   2 95
    //                   3 118
    //                   4 72;
           goto _L3 _L4 _L5 _L6 _L4
_L3:
        break MISSING_BLOCK_LABEL_249;
_L4:
        jsonobject.put(yq.R(s), yr.getString(s));
        break MISSING_BLOCK_LABEL_249;
_L5:
        jsonobject.put(yq.R(s), yr.getInt(s));
        break MISSING_BLOCK_LABEL_249;
_L6:
        jsonobject.put(yq.R(s), yr.getDouble(s));
        break MISSING_BLOCK_LABEL_249;
_L2:
        as = yr.keySet().iterator();
_L9:
        do
        {
            if (!as.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)as.next();
        } while (s.startsWith("com.google."));
        obj = yr.get(s);
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
        obj1 = yq.S(((String) (obj)));
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
        yq.T(((String) (obj1)));
        JVM INSTR tableswitch 1 4: default 334
    //                   1 128
    //                   2 189
    //                   3 217
    //                   4 153;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        continue; /* Loop/switch isn't completed */
_L4:
        if (obj instanceof String)
        {
            yr.putString(((String) (obj1)), (String)obj);
        }
        continue; /* Loop/switch isn't completed */
_L7:
        try
        {
            if ((obj instanceof String) && ew.ac((String)obj) != null)
            {
                yr.putString(((String) (obj1)), (String)obj);
            }
        }
        catch (JSONException jsonexception) { }
        continue; /* Loop/switch isn't completed */
_L5:
        if (obj instanceof Integer)
        {
            yr.putInt(((String) (obj1)), ((Integer)obj).intValue());
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (obj instanceof Double)
        {
            yr.putDouble(((String) (obj1)), ((Double)obj).doubleValue());
        }
        continue; /* Loop/switch isn't completed */
_L2:
        obj1 = jsonobject.get(((String) (obj)));
        if (obj1 instanceof String)
        {
            yr.putString(((String) (obj)), (String)obj1);
            continue; /* Loop/switch isn't completed */
        }
        if (obj1 instanceof Integer)
        {
            yr.putInt(((String) (obj)), ((Integer)obj1).intValue());
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            if (obj1 instanceof Double)
            {
                yr.putDouble(((String) (obj)), ((Double)obj1).doubleValue());
            }
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject) { }
        break; /* Loop/switch isn't completed */
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void d(String s, int i)
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int j = yq.T(s);
        if (j != i && j != 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Value for ").append(s).append(" must be a ").append(yp[i]).toString());
        } else
        {
            return;
        }
    }

    public void addImage(WebImage webimage)
    {
        xJ.add(webimage);
    }

    public void c(JSONObject jsonobject)
    {
        clear();
        ys = 0;
        try
        {
            ys = jsonobject.getInt("metadataType");
        }
        catch (JSONException jsonexception) { }
        ew.a(xJ, jsonobject);
        switch (ys)
        {
        default:
            b(jsonobject, new String[0]);
            return;

        case 0: // '\0'
            b(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"
            });
            return;

        case 1: // '\001'
            b(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"
            });
            return;

        case 2: // '\002'
            b(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"
            });
            return;

        case 3: // '\003'
            b(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE"
            });
            return;

        case 4: // '\004'
            b(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"
            });
            break;
        }
    }

    public void clear()
    {
        yr.clear();
        xJ.clear();
    }

    public void clearImages()
    {
        xJ.clear();
    }

    public boolean containsKey(String s)
    {
        return yr.containsKey(s);
    }

    public JSONObject dB()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("metadataType", ys);
        }
        catch (JSONException jsonexception) { }
        ew.a(jsonobject, xJ);
        switch (ys)
        {
        default:
            a(jsonobject, new String[0]);
            return jsonobject;

        case 0: // '\0'
            a(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"
            });
            return jsonobject;

        case 1: // '\001'
            a(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"
            });
            return jsonobject;

        case 2: // '\002'
            a(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"
            });
            return jsonobject;

        case 3: // '\003'
            a(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE"
            });
            return jsonobject;

        case 4: // '\004'
            a(jsonobject, new String[] {
                "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"
            });
            break;
        }
        return jsonobject;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof MediaMetadata))
            {
                return false;
            }
            obj = (MediaMetadata)obj;
            if (!a(yr, ((MediaMetadata) (obj)).yr) || !xJ.equals(((MediaMetadata) (obj)).xJ))
            {
                return false;
            }
        }
        return true;
    }

    public Calendar getDate(String s)
    {
        d(s, 4);
        s = yr.getString(s);
        if (s != null)
        {
            return ew.ac(s);
        } else
        {
            return null;
        }
    }

    public String getDateAsString(String s)
    {
        d(s, 4);
        return yr.getString(s);
    }

    public double getDouble(String s)
    {
        d(s, 3);
        return yr.getDouble(s);
    }

    public List getImages()
    {
        return xJ;
    }

    public int getInt(String s)
    {
        d(s, 2);
        return yr.getInt(s);
    }

    public int getMediaType()
    {
        return ys;
    }

    public String getString(String s)
    {
        d(s, 1);
        return yr.getString(s);
    }

    public boolean hasImages()
    {
        return xJ != null && !xJ.isEmpty();
    }

    public int hashCode()
    {
        Iterator iterator = yr.keySet().iterator();
        String s;
        int i;
        for (i = 17; iterator.hasNext(); i = yr.get(s).hashCode() + i * 31)
        {
            s = (String)iterator.next();
        }

        return i * 31 + xJ.hashCode();
    }

    public Set keySet()
    {
        return yr.keySet();
    }

    public void putDate(String s, Calendar calendar)
    {
        d(s, 4);
        yr.putString(s, ew.a(calendar));
    }

    public void putDouble(String s, double d1)
    {
        d(s, 3);
        yr.putDouble(s, d1);
    }

    public void putInt(String s, int i)
    {
        d(s, 2);
        yr.putInt(s, i);
    }

    public void putString(String s, String s1)
    {
        d(s, 1);
        yr.putString(s, s1);
    }

}
