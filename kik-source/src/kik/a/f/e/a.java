// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kik.a.h.i;
import kik.a.h.n;

public final class a
{

    private static final String a[] = {
        "com.kik.ext.camera", "com.kik.ext.gallery", "com.kik.ext.video-camera", "com.kik.ext.video-gallery"
    };
    private static final HashSet b = new HashSet(Arrays.asList(a));

    private static String a(String s, String s1)
    {
        if (s != null)
        {
            s1 = (new StringBuilder()).append(s1).append("=").toString();
            int l = s.indexOf(s1);
            int k = s.indexOf("&", l);
            int j = k;
            if (k < 0)
            {
                j = s.length();
            }
            return s.substring(s1.length() + l, j);
        } else
        {
            return null;
        }
    }

    public static kik.a.d.a.a a(String s, Map map, String s1)
    {
        String s2;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        ArrayList arraylist;
        Hashtable hashtable;
        Hashtable hashtable1;
        Hashtable hashtable2;
        ArrayList arraylist1;
        String s3;
        boolean flag;
        boolean flag1;
        boolean flag2;
        int j;
        int k;
        int l;
        boolean flag3;
        int i1;
        int j1;
        int k1;
        int l1;
        boolean flag5;
        arraylist = new ArrayList();
        hashtable = new Hashtable();
        hashtable1 = new Hashtable();
        hashtable2 = new Hashtable();
        obj5 = null;
        obj6 = null;
        flag5 = false;
        k = 0;
        k1 = 0;
        flag3 = false;
        j1 = 0;
        i1 = 0;
        l = 0;
        l1 = 0;
        obj1 = null;
        obj4 = null;
        obj2 = null;
        s2 = null;
        j = 0;
        arraylist1 = new ArrayList();
        Object obj8;
        Object obj10;
        Iterator iterator;
        Iterator iterator1;
        int i2;
        boolean flag4;
        if ("photo".equalsIgnoreCase(s))
        {
            hashtable2.put("layout", kik.a.d.a.b.b.a());
            flag = false;
            flag1 = true;
            flag2 = false;
        } else
        if ("article".equalsIgnoreCase(s))
        {
            hashtable2.put("layout", kik.a.d.a.b.c.a());
            flag = true;
            flag1 = false;
            flag2 = false;
        } else
        if ("video".equalsIgnoreCase(s))
        {
            hashtable2.put("layout", kik.a.d.a.b.e.a());
            flag = false;
            flag1 = false;
            flag2 = true;
        } else
        {
            return null;
        }
        iterator = map.entrySet().iterator();
        obj = null;
        map = null;
        obj3 = null;
        obj7 = null;
        s = ((String) (obj6));
_L9:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        obj6 = (java.util.Map.Entry)iterator.next();
        s3 = (String)((java.util.Map.Entry) (obj6)).getKey();
        iterator1 = ((List)((java.util.Map.Entry) (obj6)).getValue()).iterator();
        i2 = l1;
        l1 = k1;
        obj10 = obj5;
        obj5 = obj4;
        obj4 = s;
        obj8 = obj2;
        k1 = i1;
        obj2 = obj1;
        obj6 = map;
        flag4 = j;
        map = ((Map) (obj3));
        s = ((String) (obj10));
        obj3 = obj;
        obj1 = obj4;
        i1 = k;
        j = l1;
        k = j1;
        l1 = l;
        j1 = i2;
        obj4 = obj2;
        obj2 = obj5;
        obj5 = obj8;
        l = ((flag4) ? 1 : 0);
_L8:
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (String)iterator1.next();
        if ("app_name".equalsIgnoreCase(s3))
        {
            hashtable2.put("app-name", obj);
            j = 1;
            continue; /* Loop/switch isn't completed */
        }
        if ("app_pkg".equalsIgnoreCase(s3))
        {
            if (obj != null && b.contains(obj))
            {
                return null;
            }
            hashtable2.put("app-pkg", obj);
            i1 = 1;
            obj3 = obj;
            continue; /* Loop/switch isn't completed */
        }
        if ("title".equalsIgnoreCase(s3))
        {
            hashtable2.put("title", obj);
            continue; /* Loop/switch isn't completed */
        }
        if ("text".equalsIgnoreCase(s3))
        {
            hashtable2.put("text", obj);
            continue; /* Loop/switch isn't completed */
        }
        if ("forwardable".equalsIgnoreCase(s3))
        {
            hashtable2.put("allow-forward", c(((String) (obj))));
            continue; /* Loop/switch isn't completed */
        }
        if ("url".equalsIgnoreCase(s3))
        {
            int j2 = ((String) (obj)).indexOf(",");
            Object obj9;
            Object obj11;
            int k2;
            if (j2 > 0)
            {
                obj7 = ((String) (obj)).substring(0, j2);
            } else
            {
                obj7 = null;
            }
            obj = ((String) (obj)).substring(j2 + 1);
            obj9 = new com.kik.f.a.a.a(((String) (obj)), "app_name");
            ((com.kik.f.a.a.a) (obj9)).a(((String) (obj7)));
            if (l < arraylist1.size() && arraylist1.get(l) != null)
            {
                ((com.kik.f.a.a.a) (obj9)).c((String)arraylist1.get(l));
            }
            arraylist.add(obj9);
            l++;
            obj7 = obj;
            continue; /* Loop/switch isn't completed */
        }
        if ("byline".equalsIgnoreCase(s3))
        {
            arraylist1.add(obj);
            continue; /* Loop/switch isn't completed */
        }
        if ("image_url".equalsIgnoreCase(s3))
        {
            if (a(((String) (obj))))
            {
                map = a(s1, "image_url");
            } else
            {
                if (!n.a(((String) (obj))))
                {
                    return null;
                }
                obj = new com.kik.f.a.a.a(((String) (obj)), "app_name");
                ((com.kik.f.a.a.a) (obj)).a(null);
                ((com.kik.f.a.a.a) (obj)).b("image");
                arraylist.add(obj);
            }
            k1 = 1;
            continue; /* Loop/switch isn't completed */
        }
        if ("video_url".equalsIgnoreCase(s3))
        {
            if (!n.a(((String) (obj))) && !b(((String) (obj))))
            {
                return null;
            }
            if (b(((String) (obj))))
            {
                j1 = 1;
            }
            obj9 = new com.kik.f.a.a.a(((String) (obj)), "app_name");
            ((com.kik.f.a.a.a) (obj9)).a(null);
            ((com.kik.f.a.a.a) (obj9)).b("video");
            arraylist.add(obj9);
            obj = new com.kik.f.a.a.a(((String) (obj)), "app_name");
            ((com.kik.f.a.a.a) (obj)).a(null);
            ((com.kik.f.a.a.a) (obj)).b("image");
            arraylist.add(obj);
            l1 = 1;
            continue; /* Loop/switch isn't completed */
        }
        if ("preview_url".equalsIgnoreCase(s3))
        {
            if (a(((String) (obj))))
            {
                s = a(s1, "preview_url");
            } else
            {
                if (!n.a(((String) (obj))))
                {
                    return null;
                }
                s = ((String) (obj));
            }
            continue; /* Loop/switch isn't completed */
        }
        if (!"icon_url".equalsIgnoreCase(s3))
        {
            break MISSING_BLOCK_LABEL_961;
        }
        if (!a(((String) (obj)))) goto _L4; else goto _L3
_L3:
        obj = a(s1, "icon_url");
_L6:
        flag3 = true;
        obj6 = obj;
        continue; /* Loop/switch isn't completed */
_L4:
        if (n.a(((String) (obj)))) goto _L6; else goto _L5
_L5:
        return null;
        if ("native".equalsIgnoreCase(s3))
        {
            flag5 = "1".equals(obj);
        } else
        if ("referer".equalsIgnoreCase(s3))
        {
            k = 1;
            obj1 = obj;
        } else
        if ("video_should_autoplay".equalsIgnoreCase(s3))
        {
            obj4 = c(((String) (obj)));
        } else
        if ("video_should_loop".equalsIgnoreCase(s3))
        {
            obj5 = c(((String) (obj)));
        } else
        if ("video_should_be_muted".equalsIgnoreCase(s3))
        {
            obj2 = c(((String) (obj)));
        } else
        if ("disallow_save".equalsIgnoreCase(s3))
        {
            s2 = c(((String) (obj)));
        }
        if (true) goto _L8; else goto _L7
_L7:
        obj11 = obj6;
        j2 = i1;
        i1 = l1;
        obj = obj3;
        obj6 = obj4;
        k2 = k1;
        obj4 = obj5;
        obj3 = map;
        obj9 = obj1;
        obj1 = obj2;
        k1 = j;
        j = l;
        map = ((Map) (obj11));
        obj5 = s;
        obj2 = obj4;
        obj4 = obj1;
        obj1 = obj6;
        l1 = j1;
        l = i1;
        i1 = k2;
        j1 = k;
        k = j2;
        s = ((String) (obj9));
          goto _L9
_L2:
        if (k == 0 || k1 == 0 || !flag3 || j1 == 0)
        {
            return null;
        }
        if (flag)
        {
            if (hashtable2.get("title") == null && hashtable2.get("text") == null || obj7 == null)
            {
                return null;
            }
        } else
        {
            if (flag1 && (obj5 == null || i1 == 0))
            {
                return null;
            }
            if (flag2 && (l == 0 || obj5 == null && l1 == 0))
            {
                return null;
            }
        }
        if (flag5)
        {
            s = (String)hashtable2.get("app-pkg");
        }
        s = new kik.a.d.a.a(UUID.randomUUID().toString(), ((String) (obj)), "2", arraylist, hashtable2, hashtable1, hashtable, map, ((String) (obj3)), ((String) (obj5)), s, flag5);
        s.j(((String) (obj1)));
        s.i(s2);
        s.l(((String) (obj4)));
        s.k(((String) (obj2)));
        return s;
    }

    public static boolean a(String s)
    {
        if (s != null)
        {
            return s.startsWith("data:");
        } else
        {
            return false;
        }
    }

    public static boolean b(String s)
    {
        return s != null && s.startsWith("content://");
    }

    private static String c(String s)
    {
        if (i.a(s))
        {
            return "false";
        }
        if ("1".equals(s))
        {
            return "true";
        } else
        {
            return "false";
        }
    }

}
