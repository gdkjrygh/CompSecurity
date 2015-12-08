// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.image;

import ahs;
import ahv;
import aif;
import ajo;
import ajr;
import ajw;
import akx;
import aky;
import android.os.Handler;
import android.widget.ImageView;
import androidx.media.filterfw.ViewFilter;
import k;

public class BitmapTarget extends ViewFilter
{

    private Handler mHandler;
    private ImageView mImageView;
    private k mListener$201c281a;

    public BitmapTarget(ajr ajr, String s)
    {
        super(ajr, s);
        mListener$201c281a = null;
        mHandler = null;
        mImageView = null;
    }

    public static ImageView a(BitmapTarget bitmaptarget)
    {
        return bitmaptarget.mImageView;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 1);
        return (new ajw()).a("image", 2, aif1).a();
    }

    protected final void e()
    {
        android.graphics.Bitmap bitmap = a("image").a().h().q();
        if (mImageView != null)
        {
            mImageView.post(new akx(this, bitmap));
        }
        if (mListener$201c281a != null && mHandler != null)
        {
            mHandler.post(new aky(this, bitmap));
        }
    }
}
