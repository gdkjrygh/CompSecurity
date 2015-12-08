// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.virtual.impl;

import com.microsoft.dl.video.capture.api.CameraCapabilities;
import com.microsoft.dl.video.capture.api.FpsRange;
import com.microsoft.dl.video.capture.api.ImageFormat;
import com.microsoft.dl.video.capture.api.Resolution;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.microsoft.dl.video.capture.impl.virtual.impl:
//            CameraConfigOptions

public final class CameraConfig
{

    private static final com.microsoft.dl.video.capture.api.CameraCapabilities.Facing a;
    private static final NavigableSet b;
    private static final NavigableSet c = new TreeSet(Arrays.asList(new Resolution[] {
        new Resolution(320, 240)
    }));
    private static final NavigableSet d = new TreeSet(Arrays.asList(new FpsRange[] {
        new FpsRange(0, 15000)
    }));
    private static final String e = null;
    private static final CameraConfigOptions.Stamp f = new CameraConfigOptions.Stamp(70F, 10F, 20F);
    private final CameraCapabilities g;
    private final CameraConfigOptions h;

    private CameraConfig(JSONObject jsonobject)
        throws JSONException
    {
        float f1;
        Object obj;
        Object obj2 = null;
        super();
        int j = jsonobject.getInt("id");
        Object obj1;
        CameraCapabilities cameracapabilities;
        int i;
        int k;
        if (jsonobject.has("capabilities"))
        {
            obj = jsonobject.getJSONObject("capabilities");
        } else
        {
            obj = null;
        }
        cameracapabilities = new CameraCapabilities();
        if (obj != null && ((JSONObject) (obj)).has("facing"))
        {
            obj1 = com.microsoft.dl.video.capture.api.CameraCapabilities.Facing.valueOf(((JSONObject) (obj)).getString("facing").toUpperCase(Locale.US));
        } else
        {
            obj1 = a;
        }
        cameracapabilities.setFacing(((com.microsoft.dl.video.capture.api.CameraCapabilities.Facing) (obj1)));
        if (obj != null && ((JSONObject) (obj)).has("orientation"))
        {
            i = ((JSONObject) (obj)).getInt("orientation");
        } else
        {
            i = 0;
        }
        cameracapabilities.setOrientation(i);
        if (obj != null && ((JSONObject) (obj)).has("imageFormats"))
        {
            obj1 = a(((JSONObject) (obj)).getJSONArray("imageFormats"));
        } else
        {
            obj1 = b;
        }
        cameracapabilities.setSupportedImageFormats(((NavigableSet) (obj1)));
        if (obj != null && ((JSONObject) (obj)).has("resolutions"))
        {
            obj1 = b(((JSONObject) (obj)).getJSONArray("resolutions"));
        } else
        {
            obj1 = c;
        }
        cameracapabilities.setSupportedResolutions(((NavigableSet) (obj1)));
        if (obj != null && ((JSONObject) (obj)).has("fpsRanges"))
        {
            obj1 = c(((JSONObject) (obj)).getJSONArray("fpsRanges"));
        } else
        {
            obj1 = d;
        }
        cameracapabilities.setSupportedFpsRanges(((NavigableSet) (obj1)));
        if (obj == null || !((JSONObject) (obj)).has("nativeAspectRatio"))
        {
            break MISSING_BLOCK_LABEL_464;
        }
        obj = ((JSONObject) (obj)).get("nativeAspectRatio");
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        obj = (String)obj;
        k = ((String) (obj)).indexOf(':');
        if (k <= 0) goto _L4; else goto _L3
_L3:
        i = Integer.valueOf(((String) (obj)).substring(0, k)).intValue();
        k = Integer.valueOf(((String) (obj)).substring(k + 1)).intValue();
        f1 = (float)i / (float)k;
_L6:
        cameracapabilities.setNativeAspectRatio(f1);
        g = cameracapabilities;
        g.setCameraId(j);
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
            jsonobject = e;
        }
        ((CameraConfigOptions) (obj1)).setVideoFileName(jsonobject);
        if (obj != null && ((JSONObject) (obj)).has("stamp"))
        {
            jsonobject = a(((JSONObject) (obj)).getString("stamp"));
        } else
        {
            jsonobject = f;
        }
        ((CameraConfigOptions) (obj1)).setStamp(jsonobject);
        h = ((CameraConfigOptions) (obj1));
        return;
_L2:
        if (!(obj instanceof Double)) goto _L4; else goto _L5
_L5:
        f1 = ((Double)obj).floatValue();
          goto _L6
_L4:
        throw new JSONException("aspect ratio is invalid");
        f1 = 1.333333F;
          goto _L6
    }

    static CameraCapabilities a(CameraConfig cameraconfig)
    {
        return cameraconfig.g;
    }

    private static CameraConfigOptions.Stamp a(String s)
        throws JSONException
    {
        s = Pattern.compile("([0-9]+(?:\\.[0-9]+)?)\\|([0-9]+(?:\\.[0-9]+)?)\\|([0-9]+(?:\\.[0-9]+)?)").matcher(s);
        if (!s.matches())
        {
            throw new JSONException("stamp is invalid");
        }
        try
        {
            s = new CameraConfigOptions.Stamp(Double.valueOf(s.group(1)).floatValue(), Double.valueOf(s.group(2)).floatValue(), Double.valueOf(s.group(3)).floatValue());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new JSONException("stamp is invalid");
        }
        return s;
    }

    private static NavigableSet a(JSONArray jsonarray)
        throws JSONException
    {
        TreeSet treeset = new TreeSet();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            treeset.add(ImageFormat.valueOf(jsonarray.getString(i).toUpperCase(Locale.US)));
        }

        return treeset;
    }

    private static NavigableSet b(JSONArray jsonarray)
        throws JSONException
    {
        TreeSet treeset = new TreeSet();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            treeset.add(new Resolution(jsonarray.getString(i).toLowerCase(Locale.US)));
        }

        return treeset;
    }

    private static NavigableSet c(JSONArray jsonarray)
        throws JSONException
    {
        TreeSet treeset = new TreeSet();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            treeset.add(new FpsRange(jsonarray.getString(i).toLowerCase(Locale.US)));
        }

        return treeset;
    }

    public static List parse(JSONArray jsonarray)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList(jsonarray.length());
        for (int i = 0; i < jsonarray.length(); i++)
        {
            arraylist.add(new CameraConfig(jsonarray.getJSONObject(i)));
        }

        Collections.sort(arraylist, new Comparator() {

            public final int compare(CameraConfig cameraconfig, CameraConfig cameraconfig1)
            {
                int j = CameraConfig.a(cameraconfig).getCameraId() - CameraConfig.a(cameraconfig1).getCameraId();
                if (j > 0)
                {
                    return 1;
                }
                return j >= 0 ? 0 : -1;
            }

            public final volatile int compare(Object obj, Object obj1)
            {
                return compare((CameraConfig)obj, (CameraConfig)obj1);
            }

        });
        return arraylist;
    }

    public final CameraCapabilities getCapabilities()
    {
        return g;
    }

    public final CameraConfigOptions getOptions()
    {
        return h;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [capabilities=").append(g).append(", options=").append(h).append("]").toString();
    }

    static 
    {
        a = com.microsoft.dl.video.capture.api.CameraCapabilities.Facing.FRONT;
        b = new TreeSet(Arrays.asList(new ImageFormat[] {
            ImageFormat.NV21
        }));
    }
}
