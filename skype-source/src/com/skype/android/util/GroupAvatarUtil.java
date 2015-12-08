// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import com.skype.Conversation;
import com.skype.android.app.media.MediaDocumentDownloadUtil;
import com.skype.android.concurrent.AsyncCallback;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.util:
//            ImageCache

public class GroupAvatarUtil
{

    private static final Logger a = Logger.getLogger("GroupAvatarUtil");
    private final ImageCache b;
    private final MediaDocumentDownloadUtil c;

    public GroupAvatarUtil(ImageCache imagecache, MediaDocumentDownloadUtil mediadocumentdownloadutil)
    {
        b = imagecache;
        c = mediadocumentdownloadutil;
    }

    public static Bitmap a(List list)
    {
        int j = list.size();
        if (j >= 2 && j <= 3) goto _L2; else goto _L1
_L1:
        a.warning((new StringBuilder("Composing group avatar is not supported with ")).append(j).append(" images").toString());
        list = null;
_L4:
        return list;
_L2:
        float f8;
        float f9;
        Bitmap bitmap;
        Canvas canvas;
        Paint paint;
        Iterator iterator;
        int i;
        int k;
        int l = ((Bitmap)list.get(0)).getWidth();
        k = ((Bitmap)list.get(0)).getWidth();
        bitmap = Bitmap.createBitmap(l, k, ((Bitmap)list.get(0)).getConfig());
        canvas = new Canvas(bitmap);
        canvas.drawColor(-1);
        paint = new Paint(2);
        f8 = (float)l / 2.0F;
        i = 0;
        f9 = (float)Math.floor((float)l / 80F);
        iterator = list.iterator();
_L7:
        list = bitmap;
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        float f3;
        float f5;
        float f6;
        float f7;
        float f10;
        list = (Bitmap)iterator.next();
        float f = 0.0F;
        float f1 = 0.0F;
        f3 = k;
        float f2;
        float f4;
        RectF rectf;
        if (j == 2)
        {
            if (i == 0)
            {
                f = -f9;
                f1 = 0.0F;
                f2 = f3;
            } else
            {
                f = f8 + f9;
                f1 = 0.0F;
                f2 = f3;
            }
        } else
        {
            f2 = f3;
            if (j == 3)
            {
                if (i == 0)
                {
                    f = -f9;
                    f1 = 0.0F;
                    f2 = f3;
                } else
                if (i == 1)
                {
                    f2 = f3 / 2.0F;
                    f = f8 + f9;
                    f1 = -f9;
                } else
                {
                    f2 = f3 / 2.0F;
                    f = f8 + f9;
                    f1 = f2 + f9;
                }
            }
        }
        f6 = list.getWidth();
        f5 = list.getHeight();
        f7 = f8 / f2;
        f10 = f6 / f5;
        f4 = 0.0F;
        f3 = 0.0F;
        if (f7 >= f10) goto _L6; else goto _L5
_L5:
        f7 *= f5;
        f4 = (f6 - f7) * 0.5F;
        f6 = f7;
_L10:
        list = Bitmap.createBitmap(list, Math.round(f4), Math.round(f3), Math.round(f6), Math.round(f5));
_L9:
        rectf = new RectF(f, f1, f + f8, f1 + f2);
        canvas.drawBitmap(list, new Rect(0, 0, list.getWidth(), list.getHeight()), rectf, paint);
        i++;
          goto _L7
_L6:
        if (f7 <= f10) goto _L9; else goto _L8
_L8:
        f7 *= f6;
        f3 = ((f5 - f7) * 2.0F) / 3F;
        f5 = f7;
          goto _L10
    }

    public final Future a(Conversation conversation, Object obj, AsyncCallback asynccallback)
    {
        String s = conversation.getPictureProp();
        Future future1 = null;
        Future future = future1;
        if (!TextUtils.isEmpty(s))
        {
            future = future1;
            if (!s.equals("0"))
            {
                future = c.fetchCloudGroupAvatar(conversation, obj, asynccallback);
            }
        }
        future1 = future;
        if (future == null)
        {
            future1 = b.b(conversation, obj, asynccallback);
        }
        return future1;
    }

}
