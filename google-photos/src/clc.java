// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Log;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class clc
{

    private static final String a = android/media/MediaCodec.getSimpleName();
    private static final cla b = new cld();
    private static final cla c = new cle();
    private static final cla d = new clf();
    private static final cla e = new clg();
    private static Map f;
    private static Map g;

    public static cla a()
    {
        return c;
    }

    public static cla a(String s)
    {
        if (s == null)
        {
            return e;
        } else
        {
            return new cli(s);
        }
    }

    public static cla a(String as[])
    {
        if (as == null || as.length == 0)
        {
            return d;
        } else
        {
            return new clh(as);
        }
    }

    static clb a(List list, String s, String s1)
    {
        return b(list, s, s1);
    }

    public static cla b()
    {
        return b;
    }

    static clb b(String s)
    {
        return i(s);
    }

    private static clb b(List list, String s, String s1)
    {
        Iterator iterator = list.iterator();
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((MediaCodecInfo)iterator.next()).getName().equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        list = new clj(MediaCodec.createByCodecName(s), s1);
        return list;
        IOException ioexception;
        ioexception;
        String s2 = a;
        list = String.valueOf(s);
        if (list.length() != 0)
        {
            list = "Problem creating codec by name: ".concat(list);
        } else
        {
            list = new String("Problem creating codec by name: ");
        }
        Log.e(s2, list, ioexception);
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    public static cla c()
    {
        return d;
    }

    public static clb c(String s)
    {
        return j(s);
    }

    public static cla d()
    {
        return e;
    }

    static clb d(String s)
    {
        return k(s);
    }

    static String e()
    {
        return a;
    }

    static String e(String s)
    {
        return s.toLowerCase(Locale.US);
    }

    static List f(String s)
    {
        return h(s);
    }

    static List g(String s)
    {
        if (g == null)
        {
            g = new HashMap();
label0:
            for (int l = 0; l < MediaCodecList.getCodecCount(); l++)
            {
                MediaCodecInfo mediacodecinfo = MediaCodecList.getCodecInfoAt(l);
                if (!mediacodecinfo.isEncoder())
                {
                    continue;
                }
                String as[] = mediacodecinfo.getSupportedTypes();
                int j1 = as.length;
                int i1 = 0;
                do
                {
                    if (i1 >= j1)
                    {
                        continue label0;
                    }
                    String s1 = as[i1].toLowerCase(Locale.US);
                    if (!g.containsKey(s1))
                    {
                        g.put(s1, new LinkedList());
                    }
                    ((List)g.get(s1)).add(mediacodecinfo);
                    i1++;
                } while (true);
            }

        }
        s = s.toLowerCase(Locale.US);
        if (g.containsKey(s))
        {
            return (List)g.get(s);
        } else
        {
            return Collections.emptyList();
        }
    }

    private static List h(String s)
    {
        if (f == null)
        {
            f = new HashMap();
label0:
            for (int l = 0; l < MediaCodecList.getCodecCount(); l++)
            {
                MediaCodecInfo mediacodecinfo = MediaCodecList.getCodecInfoAt(l);
                if (mediacodecinfo.isEncoder())
                {
                    continue;
                }
                String as[] = mediacodecinfo.getSupportedTypes();
                int j1 = as.length;
                int i1 = 0;
                do
                {
                    if (i1 >= j1)
                    {
                        continue label0;
                    }
                    String s1 = as[i1].toLowerCase(Locale.US);
                    if (!f.containsKey(s1))
                    {
                        f.put(s1, new LinkedList());
                    }
                    ((List)f.get(s1)).add(mediacodecinfo);
                    i1++;
                } while (true);
            }

        }
        s = s.toLowerCase(Locale.US);
        if (f.containsKey(s))
        {
            return (List)f.get(s);
        } else
        {
            return Collections.emptyList();
        }
    }

    private static clb i(String s)
    {
        String s1;
        Iterator iterator;
        s1 = s.toLowerCase(Locale.US);
        iterator = h(s1).iterator();
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = ((MediaCodecInfo)iterator.next()).getName();
        if (!s.startsWith("OMX.google."))
        {
            continue; /* Loop/switch isn't completed */
        }
        clj clj1 = new clj(MediaCodec.createByCodecName(s), s1);
        return clj1;
        IOException ioexception;
        ioexception;
        String s2 = a;
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Problem creating codec by name: ".concat(s);
        } else
        {
            s = new String("Problem creating codec by name: ");
        }
        Log.e(s2, s, ioexception);
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    private static clb j(String s)
    {
        Iterator iterator;
        s = s.toLowerCase(Locale.US);
        iterator = h(s).iterator();
_L2:
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj = ((MediaCodecInfo)iterator.next()).getName();
        if (((String) (obj)).startsWith("OMX.google."))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = new clj(MediaCodec.createByCodecName(((String) (obj))), s);
        return ((clb) (obj));
        return null;
        IOException ioexception;
        ioexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static clb k(String s)
    {
        String s1;
        Iterator iterator;
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            return null;
        }
        s1 = s.toLowerCase(Locale.US);
        iterator = h(s1).iterator();
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (MediaCodecInfo)iterator.next();
        if (!s.getCapabilitiesForType(s1).isFeatureSupported("adaptive-playback"))
        {
            continue; /* Loop/switch isn't completed */
        }
        clj clj1;
        clj1 = new clj(MediaCodec.createByCodecName(s.getName()), s1);
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            clj1.c = clj1.a.getCapabilitiesForType(clj1.b).isFeatureSupported("adaptive-playback");
            boolean flag = clj1.c;
        }
        return clj1;
        IOException ioexception;
        ioexception;
        String s2 = a;
        s = String.valueOf(s.getName());
        if (s.length() != 0)
        {
            s = "Problem creating codec by name: ".concat(s);
        } else
        {
            s = new String("Problem creating codec by name: ");
        }
        Log.e(s2, s, ioexception);
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

}
