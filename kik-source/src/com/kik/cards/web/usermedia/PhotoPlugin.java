// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.usermedia;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.os.Environment;
import com.kik.cards.web.bf;
import com.kik.cards.web.plugin.a;
import com.kik.cards.web.plugin.d;
import com.kik.cards.web.plugin.f;
import com.kik.cards.web.plugin.j;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.m.e;
import com.kik.m.k;
import com.kik.m.q;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kik.android.widget.cr;
import org.c.b;
import org.c.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.usermedia:
//            i, d, a, g, 
//            c, j

public class PhotoPlugin extends d
{
    private final class a
        implements Callable
    {

        File a;
        String b;
        String c;
        Context d;
        com.kik.cards.web.plugin.a e;
        final PhotoPlugin f;

        private JSONArray a()
        {
            File file = Environment.getExternalStorageDirectory();
            if (file != null && file.exists()) goto _L2; else goto _L1
_L1:
            File file1 = null;
_L4:
            if (file1 == null)
            {
                throw new IOException();
            }
            break; /* Loop/switch isn't completed */
_L2:
            file1 = new File(file, "Kik");
            if (!file1.exists())
            {
                file1.mkdirs();
            }
            if (true) goto _L4; else goto _L3
_L3:
label0:
            {
                {
                    if (!kik.a.f.e.a.a(b))
                    {
                        break label0;
                    }
                    String s1 = UUID.randomUUID().toString();
                    Object obj = b;
                    if (obj == null)
                    {
                        obj = null;
                    } else
                    {
                        obj = Pattern.compile("^data:(.*?)base64,(.*)").matcher(((CharSequence) (obj)));
                        String s2;
                        int i1;
                        if (((Matcher) (obj)).matches())
                        {
                            obj = ((Matcher) (obj)).group(1);
                        } else
                        {
                            obj = null;
                        }
                    }
                    obj = com.kik.m.k.c(((String) (obj)));
                    if (obj != null)
                    {
                        obj = (new StringBuilder()).append(s1).append(".").append(((String) (obj))).toString();
                    } else
                    {
                        obj = s1;
                    }
                    a = new File(file1, ((String) (obj)));
                    obj = new FileOutputStream(a);
                    ((FileOutputStream) (obj)).write(com.kik.m.e.c(kik.a.h.f.a(b).getBytes()));
                    try
                    {
                        ((FileOutputStream) (obj)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        ((IOException) (obj)).printStackTrace();
                    }
                }
                if (a != null && a.exists())
                {
                    cr.a(d, a);
                }
                return null;
            }
            if (b == null || b.length() <= 0) goto _L6; else goto _L5
_L5:
            s1 = UUID.randomUUID().toString();
            obj = b;
            i1 = ((String) (obj)).lastIndexOf('.');
            if (i1 == -1) goto _L8; else goto _L7
_L7:
            i1++;
            if (((String) (obj)).length() - i1 > 4) goto _L8; else goto _L9
_L9:
            obj = ((String) (obj)).substring(i1, ((String) (obj)).length());
_L10:
            s2 = bf.a(b, c);
            if (s2 != null)
            {
                a = com.kik.m.k.a(s2, file1, s1, ((String) (obj)));
                if (a == null)
                {
                    throw new IOException();
                }
            } else
            {
                throw new IOException();
            }
_L6:
            if (false)
            {
                break MISSING_BLOCK_LABEL_342;
            } else
            {
                break MISSING_BLOCK_LABEL_162;
            }
_L8:
            obj = null;
              goto _L10
        }

        public final Object call()
        {
            return a();
        }

        public a(Context context, com.kik.cards.web.plugin.a a1, String s1, String s2)
        {
            f = PhotoPlugin.this;
            super();
            b = s1;
            c = s2;
            e = a1;
            d = context;
        }
    }

    private final class b
    {

        public String a;
        public String b;
        final PhotoPlugin c;

        public b(String s1, String s2)
        {
            c = PhotoPlugin.this;
            super();
            a = s1;
            b = s2;
        }
    }

    private final class c
        implements Callable
    {

        final PhotoPlugin a;
        private android.graphics.Bitmap.CompressFormat b;
        private List c;
        private long d;
        private int e;
        private int f;
        private int g;
        private String h;

        public final Object call()
        {
            Iterator iterator = c.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (b)iterator.next();
                if (obj != null)
                {
                    obj = com.kik.cards.web.usermedia.PhotoPlugin.a(((b) (obj)).a, h, b, g, e, f, ((b) (obj)).b);
                    a.a(((JSONObject) (obj)));
                }
            } while (true);
            return null;
        }

        private c(List list, android.graphics.Bitmap.CompressFormat compressformat, String s1, int i1, int j1, int k1)
        {
            a = PhotoPlugin.this;
            super();
            c = list;
            d = 0L;
            e = i1;
            f = j1;
            g = k1;
            b = compressformat;
            h = s1;
        }

        c(List list, android.graphics.Bitmap.CompressFormat compressformat, String s1, int i1, int j1, int k1, 
                byte byte0)
        {
            this(list, compressformat, s1, i1, j1, k1);
        }
    }


    private static Map b;
    private static final org.c.b m = org.c.c.a("CardsWebNotification");
    private boolean a;
    private q d;
    private com.kik.cards.web.usermedia.c e;
    private com.kik.cards.web.usermedia.c f;
    private i g;
    private String h;
    private com.kik.cards.web.usermedia.j i;
    private com.kik.cards.web.usermedia.a j;
    private Context k;
    private com.kik.cards.web.browser.BrowserPlugin.a l;

    public PhotoPlugin(com.kik.cards.web.usermedia.c c1, com.kik.cards.web.usermedia.c c2, i i1, com.kik.cards.web.usermedia.j j1, com.kik.cards.web.usermedia.a a1, Context context, String s1, 
            com.kik.cards.web.browser.BrowserPlugin.a a2)
    {
        super("Photo");
        a = false;
        h = s1;
        e = c1;
        f = c2;
        g = i1;
        i = j1;
        j = a1;
        k = context;
        d = new q();
        l = a2;
    }

    static Context a(PhotoPlugin photoplugin)
    {
        return photoplugin.k;
    }

    static JSONObject a(String s1, String s2, android.graphics.Bitmap.CompressFormat compressformat, int i1, int j1, int k1, String s3)
    {
        return b(s1, s2, compressformat, i1, j1, k1, s3);
    }

    protected static void a(com.kik.cards.web.plugin.a a1, int i1, List list)
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        if (list == null) goto _L2; else goto _L1
_L1:
        for (list = list.iterator(); list.hasNext(); jsonarray.put((String)list.next())) { }
          goto _L2
_L4:
        a1.a(new j(i1, jsonobject));
        return;
_L2:
        try
        {
            jsonobject.put("photoIds", jsonarray);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            m.b("Failed to fire result", list);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static q b(PhotoPlugin photoplugin)
    {
        return photoplugin.d;
    }

    private static JSONObject b(String s1, String s2, android.graphics.Bitmap.CompressFormat compressformat, int i1, int j1, int k1, String s3)
    {
        JSONObject jsonobject;
        File file;
        boolean flag;
        flag = false;
        file = new File(s1);
        jsonobject = new JSONObject();
        try
        {
            jsonobject.put("source", s2);
            jsonobject.put("id", s3);
        }
        // Misplaced declaration of an exception variable
        catch (String s2)
        {
            m.b("Error processing photo event source and index params", s2);
        }
        if (!file.exists() || !file.isFile())
        {
            return jsonobject;
        }
        s2 = new android.graphics.BitmapFactory.Options();
        s2.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s1, s2);
        s3 = new android.graphics.BitmapFactory.Options();
        s3.inSampleSize = com.kik.m.k.a(s2, k1, j1);
        s2 = BitmapFactory.decodeFile(s1, s3);
        if (s2 == null) goto _L2; else goto _L1
_L1:
        s1 = com.kik.m.k.a(s2, k1, j1);
        if (s1 == null) goto _L2; else goto _L3
_L3:
        if (s2 == s1)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        s2.recycle();
        k1 = (new ExifInterface(file.getAbsolutePath())).getAttributeInt("Orientation", 1);
        j1 = ((flag) ? 1 : 0);
        k1;
        JVM INSTR tableswitch 3 8: default 212
    //                   3 451
    //                   4 216
    //                   5 216
    //                   6 459
    //                   7 216
    //                   8 444;
           goto _L4 _L5 _L6 _L6 _L7 _L6 _L8
_L6:
        break; /* Loop/switch isn't completed */
_L4:
        j1 = ((flag) ? 1 : 0);
_L14:
        s2 = new Matrix();
        s2.postRotate(j1);
        s1 = Bitmap.createBitmap(s1, 0, 0, s1.getWidth(), s1.getHeight(), s2, true);
        s2 = new ByteArrayOutputStream();
        s1.compress(compressformat, i1, s2);
        s3 = s2.toByteArray();
        s2.close();
        s1.recycle();
        if (s3 == null) goto _L2; else goto _L9
_L9:
        i1 = s1.getWidth();
        j1 = s1.getHeight();
        s2 = com.kik.m.e.a(s3);
        if (compressformat != android.graphics.Bitmap.CompressFormat.JPEG) goto _L11; else goto _L10
_L10:
        s1 = "image/jpeg";
_L12:
        if (i1 != 0 && j1 != 0)
        {
            try
            {
                jsonobject.put("url", (new StringBuilder("data:")).append(s1).append(";base64,").append(s2).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                m.b("Error processing photo event data-url", s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                m.b("Generic error processing photo event data-url", s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                m.b("Out Of memory", s1);
            }
        }
        break; /* Loop/switch isn't completed */
        s2;
        s2.printStackTrace();
        j1 = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L11:
        if (compressformat == android.graphics.Bitmap.CompressFormat.PNG)
        {
            s1 = "image/png";
        } else
        {
            s1 = "";
        }
        if (true) goto _L12; else goto _L2
_L2:
        return jsonobject;
_L8:
        j1 = -90;
        continue; /* Loop/switch isn't completed */
_L5:
        j1 = -180;
        continue; /* Loop/switch isn't completed */
_L7:
        j1 = 90;
        if (true) goto _L14; else goto _L13
_L13:
    }

    static com.kik.cards.web.usermedia.j c(PhotoPlugin photoplugin)
    {
        return photoplugin.i;
    }

    static String d(PhotoPlugin photoplugin)
    {
        return photoplugin.h;
    }

    static boolean e(PhotoPlugin photoplugin)
    {
        photoplugin.a = false;
        return false;
    }

    protected final void a(JSONObject jsonobject)
    {
        a(new f("photo", jsonobject));
    }

    protected final com.kik.cards.web.usermedia.c b(String s1)
    {
        if (s1.equals("camera"))
        {
            return f;
        } else
        {
            return e;
        }
    }

    public j getPhoto(com.kik.cards.web.plugin.a a1, JSONObject jsonobject)
    {
        if (l.e())
        {
            return new j(405);
        }
        int i1 = Math.max(Math.min((int)(jsonobject.optDouble("quality", 0.69999998807907104D) * 100D), 100), 0);
        int j1 = Math.max(Math.min(jsonobject.optInt("maxResults", 25), 25), 0);
        int k1 = Math.max(Math.min(j1, jsonobject.optInt("minResults", 0)), 0);
        int l1 = Math.max(0, Math.min(1280, jsonobject.optInt("maxHeight", 1280)));
        int i2 = Math.max(0, Math.min(1280, jsonobject.optInt("maxWidth", 1280)));
        Object obj = jsonobject.optString("targetFormat", "jpg").toLowerCase();
        boolean flag = jsonobject.optBoolean("autoSave", false);
        if (b.containsKey(obj))
        {
            obj = (android.graphics.Bitmap.CompressFormat)b.get(obj);
        } else
        {
            obj = android.graphics.Bitmap.CompressFormat.JPEG;
        }
        jsonobject = jsonobject.optString("source", null);
        if (jsonobject == null || !jsonobject.equals("camera") && !jsonobject.equals("gallery"))
        {
            jsonobject = g.a();
        } else
        {
            jsonobject = s.a(jsonobject);
        }
        jsonobject.a(new com.kik.cards.web.usermedia.d(this, a1, j1, k1, flag, ((android.graphics.Bitmap.CompressFormat) (obj)), i2, l1, i1));
        return new j(202);
    }

    public j savePhoto(com.kik.cards.web.plugin.a a1, JSONObject jsonobject)
    {
        if (a)
        {
            return new j(420);
        } else
        {
            jsonobject = jsonobject.getString("url");
            a = true;
            j.a(jsonobject).a(new g(this, a1, jsonobject));
            return new j(202);
        }
    }

    static 
    {
        HashMap hashmap = new HashMap();
        b = hashmap;
        hashmap.put("jpg", android.graphics.Bitmap.CompressFormat.JPEG);
        b.put("png", android.graphics.Bitmap.CompressFormat.PNG);
        b.put("jpeg", android.graphics.Bitmap.CompressFormat.JPEG);
    }
}
