// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import com.jcp.views.JcpBrightcoveVideoView;

// Referenced classes of package com.jcp.fragments:
//            MultipleVideosGridFragment, bv, bw, bx

public class 
    implements butterknife.ector
{

    public void inject(butterknife.ector ector, MultipleVideosGridFragment multiplevideosgridfragment, Object obj)
    {
        View view = (View)ector.ector(obj, 0x7f0e0280, "field 'mGridView' and method 'onItemClick'");
        multiplevideosgridfragment.mGridView = (GridView)ector.w(view, 0x7f0e0280, "field 'mGridView'");
        ((AdapterView)view).setOnItemClickListener(new bv(this, multiplevideosgridfragment));
        view = (View)ector.ector(obj, 0x7f0e027f, "field 'mCloseView' and method 'onCloseFragmentClick'");
        multiplevideosgridfragment.mCloseView = (ImageView)ector.ew(view, 0x7f0e027f, "field 'mCloseView'");
        view.setOnClickListener(new bw(this, multiplevideosgridfragment));
        multiplevideosgridfragment.mGridLayout = (View)ector.out(obj, 0x7f0e027e, "field 'mGridLayout'");
        multiplevideosgridfragment.mVideoLayout = (View)ector.yout(obj, 0x7f0e0281, "field 'mVideoLayout'");
        multiplevideosgridfragment.mVideoView = (JcpBrightcoveVideoView)ector.ew((View)ector.ew(obj, 0x7f0e01d0, "field 'mVideoView'"), 0x7f0e01d0, "field 'mVideoView'");
        multiplevideosgridfragment.mProgressBar = (View)ector.sBar(obj, 0x7f0e01d1, "field 'mProgressBar'");
        ((View)ector.sBar(obj, 0x7f0e028a, "method 'onCloseVideoClick'")).setOnClickListener(new bx(this, multiplevideosgridfragment));
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (MultipleVideosGridFragment)obj, obj1);
    }

    public void reset(MultipleVideosGridFragment multiplevideosgridfragment)
    {
        multiplevideosgridfragment.mGridView = null;
        multiplevideosgridfragment.mCloseView = null;
        multiplevideosgridfragment.mGridLayout = null;
        multiplevideosgridfragment.mVideoLayout = null;
        multiplevideosgridfragment.mVideoView = null;
        multiplevideosgridfragment.mProgressBar = null;
    }

    public volatile void reset(Object obj)
    {
        reset((MultipleVideosGridFragment)obj);
    }

    public ()
    {
    }
}
