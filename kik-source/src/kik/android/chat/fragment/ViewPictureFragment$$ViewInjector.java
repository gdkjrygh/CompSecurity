// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import com.kik.cache.ContentImageView;
import com.kik.cache.ProfileImageView;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment

public class A
{

    public static void inject(butterknife..ViewInjector viewinjector, ViewPictureFragment viewpicturefragment, Object obj)
    {
        android.view.View view = viewinjector.ViewInjector(obj, 0x7f0e0089);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624073' for field '_topbar' was not found. If this view is optional add '@Optional' annotation.");
        }
        viewpicturefragment._topbar = (ViewGroup)view;
        view = viewinjector._topbar(obj, 0x7f0e0092);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624082' for field 'openButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        viewpicturefragment.openButton = (ViewGroup)view;
        view = viewinjector.openButton(obj, 0x7f0e0090);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624080' for field 'contentImageView' was not found. If this view is optional add '@Optional' annotation.");
        }
        viewpicturefragment.contentImageView = (ContentImageView)view;
        view = viewinjector.contentImageView(obj, 0x7f0e0091);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624081' for field 'profImageView' was not found. If this view is optional add '@Optional' annotation.");
        }
        viewpicturefragment.profImageView = (ProfileImageView)view;
        view = viewinjector.profImageView(obj, 0x7f0e008f);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624079' for field '_saveButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        viewpicturefragment._saveButton = (ImageButton)view;
        view = viewinjector._saveButton(obj, 0x7f0e001e);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131623966' for field 'title' was not found. If this view is optional add '@Optional' annotation.");
        }
        viewpicturefragment.title = (TextView)view;
        view = viewinjector.title(obj, 0x7f0e008b);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624075' for field '_videoView' was not found. If this view is optional add '@Optional' annotation.");
        }
        viewpicturefragment._videoView = (VideoView)view;
        view = viewinjector._videoView(obj, 0x7f0e008c);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624076' for field '_videoPlayIcon' was not found. If this view is optional add '@Optional' annotation.");
        }
        viewpicturefragment._videoPlayIcon = (ImageView)view;
        viewinjector = viewinjector._videoPlayIcon(obj, 0x7f0e0088);
        if (viewinjector == null)
        {
            throw new IllegalStateException("Required view with id '2131624072' for field '_videoViewContainer' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            viewpicturefragment._videoViewContainer = (FrameLayout)viewinjector;
            return;
        }
    }

    public static void reset(ViewPictureFragment viewpicturefragment)
    {
        viewpicturefragment._topbar = null;
        viewpicturefragment.openButton = null;
        viewpicturefragment.contentImageView = null;
        viewpicturefragment.profImageView = null;
        viewpicturefragment._saveButton = null;
        viewpicturefragment.title = null;
        viewpicturefragment._videoView = null;
        viewpicturefragment._videoPlayIcon = null;
        viewpicturefragment._videoViewContainer = null;
    }

    public A()
    {
    }
}
