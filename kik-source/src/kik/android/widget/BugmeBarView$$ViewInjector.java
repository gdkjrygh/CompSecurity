// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.widget.Button;
import com.kik.cache.ContactImageView;

// Referenced classes of package kik.android.widget:
//            BugmeBarView

public class 
{

    public static void inject(butterknife.jector jector, BugmeBarView bugmebarview, Object obj)
    {
        android.view.View view = jector.(obj, 0x7f0e00aa);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624106' for field '_bugmeButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        bugmebarview._bugmeButton = (Button)view;
        view = jector.(obj, 0x7f0e00ac);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624108' for field '_bugmePic' was not found. If this view is optional add '@Optional' annotation.");
        }
        bugmebarview._bugmePic = (ContactImageView)view;
        jector = jector.(obj, 0x7f0e00ab);
        if (jector == null)
        {
            throw new IllegalStateException("Required view with id '2131624107' for field '_bugMeSingleTextLayout' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            bugmebarview._bugMeSingleTextLayout = jector;
            return;
        }
    }

    public static void reset(BugmeBarView bugmebarview)
    {
        bugmebarview._bugmeButton = null;
        bugmebarview._bugmePic = null;
        bugmebarview._bugMeSingleTextLayout = null;
    }

    public ()
    {
    }
}
