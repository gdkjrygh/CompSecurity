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

public final class jvq
{

    private static final jvr d = (new jvr()).a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4).a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4).a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4).a("com.google.android.gms.cast.metadata.TITLE", "title", 1).a("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1).a("com.google.android.gms.cast.metadata.ARTIST", "artist", 1).a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1).a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1).a("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1).a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2).a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2).a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2).a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2).a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1).a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1).a("com.google.android.gms.cast.metadata.WIDTH", "width", 2).a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2).a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1).a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3).a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
    final List a;
    final Bundle b;
    int c;

    public jvq()
    {
        this(0);
    }

    public jvq(int i)
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

    transient void a(JSONObject jsonobject, String as[])
    {
        as = new HashSet(Arrays.asList(as));
        Iterator iterator = jsonobject.keys();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1 = (String)iterator.next();
        if ("metadataType".equals(obj1)) goto _L4; else goto _L3
_L3:
        Object obj = (String)d.a.get(obj1);
        if (obj == null) goto _L6; else goto _L5
_L5:
        boolean flag = as.contains(obj);
        if (!flag) goto _L4; else goto _L7
_L7:
        obj1 = jsonobject.get(((String) (obj1)));
        if (obj1 == null) goto _L4; else goto _L8
_L8:
        Integer integer = (Integer)d.b.get(obj);
        if (integer == null) goto _L10; else goto _L9
_L9:
        int i = integer.intValue();
          goto _L11
_L19:
        if (!(obj1 instanceof String)) goto _L4; else goto _L12
_L12:
        b.putString(((String) (obj)), (String)obj1);
          goto _L4
_L22:
        if (!(obj1 instanceof String) || kza.a((String)obj1) == null) goto _L4; else goto _L13
_L13:
        b.putString(((String) (obj)), (String)obj1);
          goto _L4
_L20:
        if (!(obj1 instanceof Integer)) goto _L4; else goto _L14
_L14:
        b.putInt(((String) (obj)), ((Integer)obj1).intValue());
          goto _L4
_L21:
        if (!(obj1 instanceof Double)) goto _L4; else goto _L15
_L15:
        b.putDouble(((String) (obj)), ((Double)obj1).doubleValue());
          goto _L4
_L6:
label0:
        {
            obj = jsonobject.get(((String) (obj1)));
            if (!(obj instanceof String))
            {
                break label0;
            }
            b.putString(((String) (obj1)), (String)obj);
        }
          goto _L4
        if (!(obj instanceof Integer)) goto _L17; else goto _L16
_L16:
        b.putInt(((String) (obj1)), ((Integer)obj).intValue());
          goto _L4
_L17:
        if (!(obj instanceof Double)) goto _L4; else goto _L18
_L18:
        b.putDouble(((String) (obj1)), ((Double)obj).doubleValue());
          goto _L4
_L11:
        i;
        JVM INSTR tableswitch 1 4: default 368
    //                   1 131
    //                   2 192
    //                   3 220
    //                   4 156;
           goto _L4 _L19 _L20 _L21 _L22
        JSONException jsonexception;
        jsonexception;
          goto _L4
_L10:
        i = 0;
          goto _L11
        jsonobject;
_L2:
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof jvq))
            {
                return false;
            }
            obj = (jvq)obj;
            if (!a(b, ((jvq) (obj)).b) || !a.equals(((jvq) (obj)).a))
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
