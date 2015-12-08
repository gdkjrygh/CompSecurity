// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.skype.MediaDocument;
import com.skype.android.app.media.MediaLinkProfile;
import com.skype.android.util.ImageCache;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.skype.android.mediacontent:
//            MediaContent

public class MojiContent extends MediaContent
{

    private static final Logger a = Logger.getLogger("MojiContent");
    private Drawable e;
    private String f;
    private ArrayList g;

    public MojiContent(Context context, MediaDocument mediadocument, ImageCache imagecache)
    {
        super(mediadocument, imagecache, context);
        f = mediadocument.getMetadataStringValue("copyright").m_value;
    }

    public final String a()
    {
        return f;
    }

    public final Drawable b()
    {
        if (e == null)
        {
            String s = (new StringBuilder("moji:")).append(k()).toString();
            Bitmap bitmap = b.a(s);
            Object obj1 = bitmap;
            if (bitmap == null)
            {
                Object obj = d.getMediaLink(MediaLinkProfile.THUMBNAIL_PROFILE.toString());
                if (TextUtils.isEmpty(((com.skype.MediaDocument.GetMediaLink_Result) (obj)).m_path))
                {
                    obj = null;
                } else
                {
                    obj = BitmapFactory.decodeFile(((com.skype.MediaDocument.GetMediaLink_Result) (obj)).m_path);
                }
                obj1 = obj;
                if (obj != null)
                {
                    b.a(s, ((Bitmap) (obj)));
                    obj1 = obj;
                }
            }
            if (obj1 != null)
            {
                e = new BitmapDrawable(c.getResources(), ((Bitmap) (obj1)));
            }
        }
        return e;
    }

    public final Bitmap c()
    {
        BitmapDrawable bitmapdrawable = (BitmapDrawable)b();
        if (bitmapdrawable != null)
        {
            return bitmapdrawable.getBitmap();
        } else
        {
            return null;
        }
    }

    public final ArrayList d()
    {
        if (g != null) goto _L2; else goto _L1
_L1:
        Object obj;
        g = new ArrayList();
        obj = d.getMetadataStringValue("keywords");
        if (!((com.skype.MediaDocument.GetMetadataStringValue_Result) (obj)).m_return) goto _L2; else goto _L3
_L3:
        obj = new JSONArray(((com.skype.MediaDocument.GetMetadataStringValue_Result) (obj)).m_value);
        int i = 0;
_L4:
        if (i >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        g.add((String)((JSONArray) (obj)).get(i));
        i++;
        if (true) goto _L4; else goto _L2
        JSONException jsonexception;
        jsonexception;
        a.warning("Failed tp parse the string as JSONArray to get the keywords for Moji");
_L2:
        return g;
    }

    public final com.skype.MediaDocument.MEDIA_STATUS f()
    {
        return d.getMediaLink(MediaLinkProfile.DEFAULT_PROFILE.toString()).m_return;
    }

}
