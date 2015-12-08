// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import kik.android.scan.widget.ScannerViewFinder;

// Referenced classes of package kik.android.scan.fragment:
//            ScanFragment

public class 
{

    public static void inject(butterknife..ViewInjector viewinjector, ScanFragment scanfragment, Object obj)
    {
        android.view.View view = viewinjector.(obj, 0x7f0e01ca);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624394' for field '_scanContainer' was not found. If this view is optional add '@Optional' annotation.");
        }
        scanfragment._scanContainer = (ViewGroup)view;
        view = viewinjector.(obj, 0x7f0e01cf);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624399' for field '_animationContainer' was not found. If this view is optional add '@Optional' annotation.");
        }
        scanfragment._animationContainer = view;
        view = viewinjector.(obj, 0x7f0e01d0);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624400' for field '_loadingContainer' was not found. If this view is optional add '@Optional' annotation.");
        }
        scanfragment._loadingContainer = view;
        view = viewinjector.(obj, 0x7f0e01d1);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624401' for field '_progress' was not found. If this view is optional add '@Optional' annotation.");
        }
        scanfragment._progress = (ProgressBar)view;
        view = viewinjector.(obj, 0x7f0e01d2);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624402' for field '_errorImage' was not found. If this view is optional add '@Optional' annotation.");
        }
        scanfragment._errorImage = view;
        view = viewinjector.(obj, 0x7f0e01d3);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624403' for field '_errorTitle' was not found. If this view is optional add '@Optional' annotation.");
        }
        scanfragment._errorTitle = (TextView)view;
        view = viewinjector.(obj, 0x7f0e00be);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624126' for field '_cameraErrorCover' was not found. If this view is optional add '@Optional' annotation.");
        }
        scanfragment._cameraErrorCover = view;
        view = viewinjector.(obj, 0x7f0e01cd);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624397' for field '_scanFinder' was not found. If this view is optional add '@Optional' annotation.");
        }
        scanfragment._scanFinder = (ScannerViewFinder)view;
        view = viewinjector.(obj, 0x7f0e01cc);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624396' for field '_resultImageView' was not found. If this view is optional add '@Optional' annotation.");
        }
        scanfragment._resultImageView = (ImageView)view;
        view = viewinjector.(obj, 0x7f0e01ce);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624398' for field '_callToActionTextView' was not found. If this view is optional add '@Optional' annotation.");
        }
        scanfragment._callToActionTextView = (TextView)view;
        view = viewinjector.(obj, 0x7f0e01cb);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624395' for field '_cameraBlurView' was not found. If this view is optional add '@Optional' annotation.");
        }
        scanfragment._cameraBlurView = (ImageView)view;
        view = viewinjector.(obj, 0x7f0e01d4);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624404' for field '_errorText' was not found. If this view is optional add '@Optional' annotation.");
        }
        scanfragment._errorText = (TextView)view;
        viewinjector = viewinjector.(obj, 0x7f0e01d5);
        if (viewinjector == null)
        {
            throw new IllegalStateException("Required view with id '2131624405' for field '_errorRetryButton' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            scanfragment._errorRetryButton = (TextView)viewinjector;
            return;
        }
    }

    public static void reset(ScanFragment scanfragment)
    {
        scanfragment._scanContainer = null;
        scanfragment._animationContainer = null;
        scanfragment._loadingContainer = null;
        scanfragment._progress = null;
        scanfragment._errorImage = null;
        scanfragment._errorTitle = null;
        scanfragment._cameraErrorCover = null;
        scanfragment._scanFinder = null;
        scanfragment._resultImageView = null;
        scanfragment._callToActionTextView = null;
        scanfragment._cameraBlurView = null;
        scanfragment._errorText = null;
        scanfragment._errorRetryButton = null;
    }

    public ()
    {
    }
}
