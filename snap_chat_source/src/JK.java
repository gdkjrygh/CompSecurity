// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.widget.ImageView;

public final class JK
    implements JG
{

    public JK()
    {
    }

    public final void a(Jw jw, JF jf)
    {
        PG.a();
        if (jw.mBitmap != null)
        {
            ImageView imageview = jf.mImageView;
            if (imageview != null)
            {
                Object obj = imageview.getDrawable();
                if (obj instanceof JM)
                {
                    obj = (JM)obj;
                    if (TextUtils.equals(jf.mRequestId, ((JM) (obj)).mLoaderTask.mRequest.mRequestId))
                    {
                        imageview.setImageBitmap(jw.mBitmap);
                    }
                }
            }
        }
    }
}
