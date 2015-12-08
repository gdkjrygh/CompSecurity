// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.widget.FrameLayout;
import android.widget.ImageView;

// Referenced classes of package kik.android.widget:
//            SquareNetworkedImageView, ContentLinkView, RobotoTextView

public class 
{

    public static void inject(butterknife.jector jector, ContentLinkView contentlinkview, Object obj)
    {
        android.view.View view = jector.jector(obj, 0x7f0e00ec);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624172' for field '_contentLinkPic' was not found. If this view is optional add '@Optional' annotation.");
        }
        contentlinkview._contentLinkPic = (SquareNetworkedImageView)view;
        view = jector.w(obj, 0x7f0e00ed);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624173' for field '_contentLinkText' was not found. If this view is optional add '@Optional' annotation.");
        }
        contentlinkview._contentLinkText = (RobotoTextView)view;
        view = jector.tLinkText(obj, 0x7f0e00eb);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624171' for field '_contentLinkCenterLayout' was not found. If this view is optional add '@Optional' annotation.");
        }
        contentlinkview._contentLinkCenterLayout = (FrameLayout)view;
        jector = jector.tLinkCenterLayout(obj, 0x7f0e00ee);
        if (jector == null)
        {
            throw new IllegalStateException("Required view with id '2131624174' for field '_contentLinkButtonImg' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            contentlinkview._contentLinkButtonImg = (ImageView)jector;
            return;
        }
    }

    public static void reset(ContentLinkView contentlinkview)
    {
        contentlinkview._contentLinkPic = null;
        contentlinkview._contentLinkText = null;
        contentlinkview._contentLinkCenterLayout = null;
        contentlinkview._contentLinkButtonImg = null;
    }

    public ()
    {
    }
}
