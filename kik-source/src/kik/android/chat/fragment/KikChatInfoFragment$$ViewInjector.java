// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kik.cache.ContactImageView;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment, gh

public class A
{

    public static void inject(butterknife..ViewInjector viewinjector, KikChatInfoFragment kikchatinfofragment, Object obj)
    {
        View view = viewinjector.ViewInjector(obj, 0x7f0e0038);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131623992' for field '_notInGroupTextView' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikchatinfofragment._notInGroupTextView = (TextView)view;
        view = viewinjector._notInGroupTextView(obj, 0x7f0e002f);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131623983' for field '_profilePicBig' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikchatinfofragment._profilePicBig = (ContactImageView)view;
        view = viewinjector._profilePicBig(obj, 0x7f0e0031);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131623985' for field '_verifiedStar' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikchatinfofragment._verifiedStar = (ImageView)view;
        viewinjector = viewinjector._verifiedStar(obj, 0x7f0e0030);
        if (viewinjector == null)
        {
            throw new IllegalStateException("Required view with id '2131623984' for method 'onPictureClick' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            viewinjector.setOnClickListener(new gh(kikchatinfofragment));
            return;
        }
    }

    public static void reset(KikChatInfoFragment kikchatinfofragment)
    {
        kikchatinfofragment._notInGroupTextView = null;
        kikchatinfofragment._profilePicBig = null;
        kikchatinfofragment._verifiedStar = null;
    }

    public A()
    {
    }
}
