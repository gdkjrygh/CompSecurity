// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.kik.cache.ContactImageView;
import kik.android.widget.KikCodeBackgroundImageView;
import kik.android.widget.KikFinderCodeImageView;

// Referenced classes of package kik.android.chat.fragment:
//            KikCodeFragment

public class 
{

    public static void inject(butterknife..ViewInjector viewinjector, KikCodeFragment kikcodefragment, Object obj)
    {
        android.view.View view = viewinjector.ViewInjector(obj, 0x7f0e0032);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131623986' for field '_nameText' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikcodefragment._nameText = (TextView)view;
        view = viewinjector._nameText(obj, 0x7f0e0033);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131623987' for field '_usernameText' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikcodefragment._usernameText = (TextView)view;
        view = viewinjector._usernameText(obj, 0x7f0e00ff);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624191' for field '_scanText' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikcodefragment._scanText = (TextView)view;
        view = viewinjector._scanText(obj, 0x7f0e00fb);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624187' for field '_drawArea' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikcodefragment._drawArea = (KikFinderCodeImageView)view;
        view = viewinjector._drawArea(obj, 0x7f0e00fa);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624186' for field '_fakeCode' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikcodefragment._fakeCode = (KikCodeBackgroundImageView)view;
        view = viewinjector.iew(obj, 0x7f0e00f8);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624184' for field '_tellAFriendImage' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikcodefragment._tellAFriendImage = (ImageView)view;
        view = viewinjector._tellAFriendImage(obj, 0x7f0e0030);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131623984' for field '_profilePic' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikcodefragment._profilePic = (ContactImageView)view;
        view = viewinjector._profilePic(obj, 0x7f0e00fe);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624190' for field '_codeInfo' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikcodefragment._codeInfo = (ViewGroup)view;
        view = viewinjector._codeInfo(obj, 0x7f0e00fc);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624188' for field '_spinner' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikcodefragment._spinner = (ProgressBar)view;
        view = viewinjector._spinner(obj, 0x7f0e0100);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624192' for field '_errorHolder' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikcodefragment._errorHolder = (LinearLayout)view;
        view = viewinjector._errorHolder(obj, 0x7f0e00fd);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624189' for field '_retryImage' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikcodefragment._retryImage = (ImageView)view;
        view = viewinjector._retryImage(obj, 0x7f0e0101);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624193' for field '_wipeContainer' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikcodefragment._wipeContainer = view;
        viewinjector = viewinjector._wipeContainer(obj, 0x7f0e00f9);
        if (viewinjector == null)
        {
            throw new IllegalStateException("Required view with id '2131624185' for field '_codeContainer' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            kikcodefragment._codeContainer = (ViewGroup)viewinjector;
            return;
        }
    }

    public static void reset(KikCodeFragment kikcodefragment)
    {
        kikcodefragment._nameText = null;
        kikcodefragment._usernameText = null;
        kikcodefragment._scanText = null;
        kikcodefragment._drawArea = null;
        kikcodefragment._fakeCode = null;
        kikcodefragment._tellAFriendImage = null;
        kikcodefragment._profilePic = null;
        kikcodefragment._codeInfo = null;
        kikcodefragment._spinner = null;
        kikcodefragment._errorHolder = null;
        kikcodefragment._retryImage = null;
        kikcodefragment._wipeContainer = null;
        kikcodefragment._codeContainer = null;
    }

    public ()
    {
    }
}
