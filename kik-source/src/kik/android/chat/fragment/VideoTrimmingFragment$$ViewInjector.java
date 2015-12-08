// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import kik.android.widget.VideoKeyFrameView;

// Referenced classes of package kik.android.chat.fragment:
//            VideoTrimmingFragment

public class 
{

    public static void inject(butterknife..ViewInjector viewinjector, VideoTrimmingFragment videotrimmingfragment, Object obj)
    {
        android.view.View view = viewinjector.ViewInjector(obj, 0x7f0e008b);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624075' for field '_videoView' was not found. If this view is optional add '@Optional' annotation.");
        }
        videotrimmingfragment._videoView = (VideoView)view;
        view = viewinjector._videoView(obj, 0x7f0e008c);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624076' for field '_videoPlayIcon' was not found. If this view is optional add '@Optional' annotation.");
        }
        videotrimmingfragment._videoPlayIcon = (ImageView)view;
        view = viewinjector._videoPlayIcon(obj, 0x7f0e0088);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624072' for field '_videoViewContainer' was not found. If this view is optional add '@Optional' annotation.");
        }
        videotrimmingfragment._videoViewContainer = (FrameLayout)view;
        view = viewinjector._videoViewContainer(obj, 0x7f0e008f);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624079' for field '_saveButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        videotrimmingfragment._saveButton = (ImageButton)view;
        view = viewinjector._saveButton(obj, 0x7f0e008a);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624074' for field '_videoKeyFrameView' was not found. If this view is optional add '@Optional' annotation.");
        }
        videotrimmingfragment._videoKeyFrameView = (VideoKeyFrameView)view;
        viewinjector = viewinjector._videoKeyFrameView(obj, 0x7f0e008e);
        if (viewinjector == null)
        {
            throw new IllegalStateException("Required view with id '2131624078' for field '_editedSizeText' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            videotrimmingfragment._editedSizeText = (TextView)viewinjector;
            return;
        }
    }

    public static void reset(VideoTrimmingFragment videotrimmingfragment)
    {
        videotrimmingfragment._videoView = null;
        videotrimmingfragment._videoPlayIcon = null;
        videotrimmingfragment._videoViewContainer = null;
        videotrimmingfragment._saveButton = null;
        videotrimmingfragment._videoKeyFrameView = null;
        videotrimmingfragment._editedSizeText = null;
    }

    public ()
    {
    }
}
