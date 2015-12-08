// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import com.skype.MediaDocument;
import com.skype.android.config.FileUtil;
import com.skype.android.util.ImageCache;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.skype.android.mediacontent:
//            MediaContent, EmoticonSize, a, b

public class EmoticonContent extends MediaContent
{

    static EmoticonSize a;
    private static final Logger e = Logger.getLogger("MojiContent");
    private static final Map f;
    private b g;
    private final Map h = new HashMap();
    private final Map i = new HashMap();
    private final Map j = new HashMap();
    private String k;

    EmoticonContent(Context context, ImageCache imagecache, b b1, MediaDocument mediadocument)
    {
        super(mediadocument, imagecache, context);
        g = b1;
        k = mediadocument.getMetadataStringValue("id").m_value;
    }

    private Drawable a(EmoticonSize emoticonsize, String s)
    {
label0:
        {
            synchronized (h)
            {
                if (!h.containsKey(s))
                {
                    break label0;
                }
                emoticonsize = (Drawable)h.get(s);
            }
            return emoticonsize;
        }
        emoticonsize = new a(this, emoticonsize, s);
        h.put(s, emoticonsize);
        map;
        JVM INSTR monitorexit ;
        return emoticonsize;
        emoticonsize;
        map;
        JVM INSTR monitorexit ;
        throw emoticonsize;
    }

    private String c(int l)
    {
        return (new StringBuilder("e:")).append(g.a()).append("_").append(l).toString();
    }

    private String d(int l)
    {
        String s1 = g.a();
        String s = s1;
        if (f.containsKey(s1))
        {
            s = (String)f.get(s1);
        }
        return (new StringBuilder("emoticons/")).append(s).append("_").append(l).toString();
    }

    public final Bitmap a(EmoticonSize emoticonsize)
    {
        int l = emoticonsize.a(c);
        String s = c(l);
        Bitmap bitmap1 = b.a(s);
        EmoticonSize emoticonsize2 = null;
        EmoticonSize emoticonsize1 = null;
        Bitmap bitmap = bitmap1;
        if (bitmap1 != null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        bitmap = bitmap1;
        try
        {
            emoticonsize = a(emoticonsize.b(c), l, false);
        }
        // Misplaced declaration of an exception variable
        catch (EmoticonSize emoticonsize)
        {
            FileUtil.closeStream(emoticonsize1);
            return bitmap;
        }
        finally
        {
            FileUtil.closeStream(emoticonsize2);
        }
        bitmap = bitmap1;
        emoticonsize1 = emoticonsize;
        emoticonsize2 = emoticonsize;
        bitmap1 = BitmapFactory.decodeStream(emoticonsize);
        if (bitmap1 == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        bitmap = bitmap1;
        emoticonsize1 = emoticonsize;
        emoticonsize2 = emoticonsize;
        bitmap1.setDensity(0);
        bitmap = bitmap1;
        emoticonsize1 = emoticonsize;
        emoticonsize2 = emoticonsize;
        b.a(s, bitmap1);
        FileUtil.closeStream(emoticonsize);
        bitmap = bitmap1;
        return bitmap;
        throw emoticonsize;
    }

    public final InputStream a(String s, int l, boolean flag)
        throws IOException
    {
        Object obj = (com.skype.MediaDocument.GetMediaLink_Result)i.get(s);
        if (d != null)
        {
            j.put(s, Long.valueOf(System.currentTimeMillis()));
            obj = d.getMediaLink(s, com.skype.MediaDocument.MEDIA_GET_POLICY.CACHE_THEN_DOWNLOAD);
            i.put(s, obj);
        }
        if (obj != null && ((com.skype.MediaDocument.GetMediaLink_Result) (obj)).m_return == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
        {
            s = new File(((com.skype.MediaDocument.GetMediaLink_Result) (obj)).m_path);
        } else
        {
            s = null;
        }
        if (s != null && s.exists())
        {
            return new FileInputStream(s);
        }
        obj = (new StringBuilder()).append(d(l));
        if (flag)
        {
            s = "_anim.png";
        } else
        {
            s = ".png";
        }
        s = ((StringBuilder) (obj)).append(s).toString();
        return c.getAssets().open(s);
    }

    public final String a()
    {
        return k;
    }

    final void a(String s)
    {
        EmoticonSize aemoticonsize[] = EmoticonSize.values();
        int i1 = aemoticonsize.length;
        for (int l = 0; l < i1; l++)
        {
            EmoticonSize emoticonsize = aemoticonsize[l];
            b.b(c(emoticonsize.a(c)));
        }

        Map map = h;
        map;
        JVM INSTR monitorenter ;
        s = (a)h.get(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        s.b();
        map;
        JVM INSTR monitorexit ;
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    final void a(String s, com.skype.MediaDocument.GetMediaLink_Result getmedialink_result)
    {
        i.put(s, getmedialink_result);
    }

    public final Drawable b()
    {
        a a1 = (a)b(a);
        if (a1.a() != null)
        {
            return a1;
        } else
        {
            return null;
        }
    }

    public final Drawable b(EmoticonSize emoticonsize)
    {
        return a(emoticonsize, emoticonsize.b(c));
    }

    final Long b(String s)
    {
        return (Long)j.get(s);
    }

    public final Bitmap c()
    {
        a a1 = (a)b();
        if (a1 != null)
        {
            return a1.a();
        } else
        {
            return null;
        }
    }

    public final Drawable c(EmoticonSize emoticonsize)
    {
        Context context = c;
        return a(emoticonsize, (new StringBuilder("default_")).append(emoticonsize.a(context)).append("_anim").toString());
    }

    public final boolean d()
    {
        try
        {
            c.getAssets().open((new StringBuilder()).append(d(a.a(c))).append(".png").toString()).close();
        }
        catch (IOException ioexception)
        {
            return false;
        }
        return true;
    }

    public final String e()
    {
        return g.a();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof EmoticonContent)
        {
            return ((EmoticonContent)obj).g.a().equals(g.a());
        } else
        {
            return false;
        }
    }

    public final String f()
    {
        return g.b();
    }

    public final List g()
    {
        return g.e();
    }

    final b h()
    {
        return g;
    }

    public int hashCode()
    {
        return g.a().hashCode();
    }

    final void i()
    {
        b b1;
        Object obj;
        boolean flag1;
        flag1 = true;
        b1 = g;
        obj = d.getMetadataIntValue("media/default/firstFrame");
        if (((com.skype.MediaDocument.GetMetadataIntValue_Result) (obj)).m_return)
        {
            b1.b(((com.skype.MediaDocument.GetMetadataIntValue_Result) (obj)).m_value);
        }
        obj = d.getMetadataIntValue("media/default/framesCount");
        if (((com.skype.MediaDocument.GetMetadataIntValue_Result) (obj)).m_return)
        {
            b1.a(((com.skype.MediaDocument.GetMetadataIntValue_Result) (obj)).m_value);
        }
        obj = d.getMetadataStringValue("shortcut");
        if (((com.skype.MediaDocument.GetMetadataStringValue_Result) (obj)).m_return)
        {
            b1.b(((com.skype.MediaDocument.GetMetadataStringValue_Result) (obj)).m_value);
        }
        obj = d.getMetadataStringValue("shortcuts");
        if (!((com.skype.MediaDocument.GetMetadataStringValue_Result) (obj)).m_return)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        ArrayList arraylist;
        obj = new JSONArray(((com.skype.MediaDocument.GetMetadataStringValue_Result) (obj)).m_value);
        arraylist = new ArrayList();
        int l = 0;
_L2:
        if (l >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add((String)((JSONArray) (obj)).get(l));
        l++;
        if (true) goto _L2; else goto _L1
_L1:
        boolean flag;
        try
        {
            b1.a(arraylist);
        }
        catch (JSONException jsonexception)
        {
            e.warning("Failed to parse the string as JSONArray to get the emoticon shortcuts");
        }
        obj = d.getMetadataIntValue("useInSms");
        if (((com.skype.MediaDocument.GetMetadataIntValue_Result) (obj)).m_return)
        {
            if (((com.skype.MediaDocument.GetMetadataIntValue_Result) (obj)).m_value > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b1.b(flag);
        }
        obj = d.getMetadataIntValue("visible");
        if (((com.skype.MediaDocument.GetMetadataIntValue_Result) (obj)).m_return)
        {
            if (((com.skype.MediaDocument.GetMetadataIntValue_Result) (obj)).m_value > 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            b1.a(flag);
        }
        return;
    }

    static 
    {
        a = EmoticonSize.b;
        HashMap hashmap = new HashMap();
        f = hashmap;
        hashmap.put("sun", "sunshine");
        f.put("clap", "clapping");
        f.put("dance", "dancing");
        f.put("sad", "sadsmile");
        f.put("laugh", "bigsmile");
        f.put("cry", "crying");
        f.put("sweat", "sweating");
        f.put("blush", "blushing");
        f.put("wonder", "wondering");
        f.put("eg", "evilgrin");
        f.put("yawn", "yawning");
        f.put("puke", "puking");
        f.put("wasntme", "itwasntme");
        f.put("worry", "worried");
        f.put("nerdy", "nerd");
        f.put("clap", "clapping");
        f.put("think", "thinking");
        f.put("smoke", "smoking");
        f.put("talk", "talking");
        f.put("bertlett", "bartlett");
        f.put("mlt", "malthe");
        f.put("taur", "dull_tauri");
    }
}
