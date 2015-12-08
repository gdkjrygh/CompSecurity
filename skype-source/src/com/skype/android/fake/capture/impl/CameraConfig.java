// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.fake.capture.impl;

import com.skype.android.platform.capture.CameraCapabilities;
import com.skype.android.platform.capture.CameraInfo;
import com.skype.android.platform.capture.FpsRange;
import com.skype.android.platform.capture.ImageFormat;
import com.skype.android.video.hw.format.Resolution;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.fake.capture.impl:
//            CameraConfigOptions

public class CameraConfig
{

    private static final com.skype.android.platform.capture.CameraInfo.Facing d;
    private static final NavigableSet e;
    private static final NavigableSet f = new TreeSet(Arrays.asList(new Resolution[] {
        new Resolution(320, 240)
    }));
    private static final NavigableSet g = new TreeSet(Arrays.asList(new FpsRange[] {
        new FpsRange(0, 15000)
    }));
    private static final String h = null;
    private static final CameraConfigOptions.Stamp i = new CameraConfigOptions.Stamp(70F, 10F, 20F);
    public final CameraInfo a;
    public final CameraCapabilities b;
    public final CameraConfigOptions c;

    private CameraConfig(JSONObject jsonobject)
        throws JSONException
    {
        float f1;
        Object obj;
        Object obj2 = null;
        super();
        int k = jsonobject.getInt("id");
        Object obj1;
        CameraCapabilities cameracapabilities;
        int j;
        int l;
        if (jsonobject.has("info"))
        {
            obj = jsonobject.getJSONObject("info");
        } else
        {
            obj = null;
        }
        if (obj != null && ((JSONObject) (obj)).has("facing"))
        {
            obj1 = com.skype.android.platform.capture.CameraInfo.Facing.valueOf(((JSONObject) (obj)).getString("facing").toUpperCase());
        } else
        {
            obj1 = d;
        }
        if (obj != null && ((JSONObject) (obj)).has("orientation"))
        {
            j = ((JSONObject) (obj)).getInt("orientation");
        } else
        {
            j = 0;
        }
        a = new CameraInfo(((com.skype.android.platform.capture.CameraInfo.Facing) (obj1)), j);
        if (jsonobject.has("capabilities"))
        {
            obj = jsonobject.getJSONObject("capabilities");
        } else
        {
            obj = null;
        }
        cameracapabilities = new CameraCapabilities();
        if (obj != null && ((JSONObject) (obj)).has("imageFormats"))
        {
            obj1 = b(((JSONObject) (obj)).getJSONArray("imageFormats"));
        } else
        {
            obj1 = e;
        }
        cameracapabilities.a(((NavigableSet) (obj1)));
        if (obj != null && ((JSONObject) (obj)).has("resolutions"))
        {
            obj1 = c(((JSONObject) (obj)).getJSONArray("resolutions"));
        } else
        {
            obj1 = f;
        }
        cameracapabilities.b(((NavigableSet) (obj1)));
        if (obj != null && ((JSONObject) (obj)).has("fpsRanges"))
        {
            obj1 = d(((JSONObject) (obj)).getJSONArray("fpsRanges"));
        } else
        {
            obj1 = g;
        }
        cameracapabilities.c(((NavigableSet) (obj1)));
        if (obj == null || !((JSONObject) (obj)).has("nativeAspectRatio"))
        {
            break MISSING_BLOCK_LABEL_483;
        }
        obj = ((JSONObject) (obj)).get("nativeAspectRatio");
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        obj = (String)obj;
        l = ((String) (obj)).indexOf(':');
        if (l <= 0) goto _L4; else goto _L3
_L3:
        j = Integer.valueOf(((String) (obj)).substring(0, l)).intValue();
        l = Integer.valueOf(((String) (obj)).substring(l + 1)).intValue();
        f1 = (float)j / (float)l;
_L6:
        cameracapabilities.a(f1);
        b = cameracapabilities;
        b.a(k);
        obj = obj2;
        if (jsonobject.has("options"))
        {
            obj = jsonobject.getJSONObject("options");
        }
        obj1 = new CameraConfigOptions();
        if (obj != null && ((JSONObject) (obj)).has("videoFileName"))
        {
            jsonobject = ((JSONObject) (obj)).getString("videoFileName");
        } else
        {
            jsonobject = h;
        }
        ((CameraConfigOptions) (obj1)).a(jsonobject);
        if (obj != null && ((JSONObject) (obj)).has("stamp"))
        {
            jsonobject = a(((JSONObject) (obj)).getString("stamp"));
        } else
        {
            jsonobject = i;
        }
        ((CameraConfigOptions) (obj1)).a(jsonobject);
        c = ((CameraConfigOptions) (obj1));
        return;
_L2:
        if (!(obj instanceof Double)) goto _L4; else goto _L5
_L5:
        f1 = ((Double)obj).floatValue();
          goto _L6
_L4:
        throw new JSONException("Malformed aspect ratio");
        f1 = 1.333333F;
          goto _L6
    }

    private static CameraConfigOptions.Stamp a(String s)
        throws JSONException
    {
        s = Pattern.compile("([0-9]+(?:\\.[0-9]+)?)\\|([0-9]+(?:\\.[0-9]+)?)\\|([0-9]+(?:\\.[0-9]+)?)").matcher(s);
        if (!s.matches())
        {
            throw new JSONException("stamp is malformed");
        }
        try
        {
            s = new CameraConfigOptions.Stamp(Double.valueOf(s.group(1)).floatValue(), Double.valueOf(s.group(2)).floatValue(), Double.valueOf(s.group(3)).floatValue());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new JSONException("stamp is malformed");
        }
        return s;
    }

    public static List a(JSONArray jsonarray)
        throws JSONException
    {
        System.currentTimeMillis();
        ArrayList arraylist = new ArrayList(jsonarray.length());
        for (int j = 0; j < jsonarray.length(); j++)
        {
            arraylist.add(new CameraConfig(jsonarray.getJSONObject(j)));
        }

        Collections.sort(arraylist, new Comparator() {

            public final int compare(Object obj, Object obj1)
            {
                obj = (CameraConfig)obj;
                obj1 = (CameraConfig)obj1;
                int k = ((CameraConfig) (obj)).b.a() - ((CameraConfig) (obj1)).b.a();
                if (k > 0)
                {
                    return 1;
                }
                return k >= 0 ? 0 : -1;
            }

        });
        return arraylist;
    }

    private static NavigableSet b(JSONArray jsonarray)
        throws JSONException
    {
        TreeSet treeset = new TreeSet();
        for (int j = 0; j < jsonarray.length(); j++)
        {
            treeset.add(ImageFormat.valueOf(jsonarray.getString(j).toUpperCase()));
        }

        return treeset;
    }

    private static NavigableSet c(JSONArray jsonarray)
        throws JSONException
    {
        TreeSet treeset = new TreeSet();
        for (int j = 0; j < jsonarray.length(); j++)
        {
            treeset.add(new Resolution(jsonarray.getString(j).toLowerCase()));
        }

        return treeset;
    }

    private static NavigableSet d(JSONArray jsonarray)
        throws JSONException
    {
        TreeSet treeset = new TreeSet();
        for (int j = 0; j < jsonarray.length(); j++)
        {
            treeset.add(new FpsRange(jsonarray.getString(j).toLowerCase()));
        }

        return treeset;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [info=").append(a).append(", capabilities=").append(b).append(", options=").append(c).append("]").toString();
    }

    static 
    {
        d = com.skype.android.platform.capture.CameraInfo.Facing.b;
        e = new TreeSet(Arrays.asList(new ImageFormat[] {
            ImageFormat.b
        }));
    }
}
