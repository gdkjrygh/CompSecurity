// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.View;
import com.spotify.mobile.android.ui.ActionBarManager;
import com.spotify.mobile.android.ui.ActionBarTitle;
import com.spotify.music.MainActivity;

public final class fzx
{

    static dir a(Activity activity, Fragment fragment, dir dir1)
    {
        int i = dgo.b(activity, 0x1010054);
        dir1.g().setBackgroundColor(i);
        dir1.a(i);
        if (activity instanceof MainActivity)
        {
            dir1.a(new dii((MainActivity)activity, fragment) {

                private ActionBarTitle b;
                private float c;
                private fpe d;
                private Fragment e;

                public final void a(float f)
                {
                    c = f;
                    if (b != null)
                    {
                        b.a = f;
                        d.a(e, b);
                    }
                }

                public final void a(String s)
                {
                    b = new ActionBarTitle(d.e(), s);
                    b.a = c;
                    d.a(e, b);
                }

            
            {
                d = fpe1;
                e = fragment;
                super();
                c = 1.0F;
            }
            });
            return dir1;
        } else
        {
            dir1.a(dii.a);
            return dir1;
        }
    }

    public static dir a(Fragment fragment, View view)
    {
        u u = a(fragment);
        return a(((Activity) (u)), fragment, ((dir) (new diu(u, view, ActionBarManager.a(u)))));
    }

    static u a(Fragment fragment)
    {
        if (!fragment.o())
        {
            throw new IllegalStateException("PrettyLists can only be created for attached fragments");
        } else
        {
            return fragment.k();
        }
    }

    public static dir b(Fragment fragment, View view)
    {
        u u = a(fragment);
        return a(u, fragment, new diq(u, view));
    }
}
