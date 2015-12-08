// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.ViewUtils;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            NetflixActionBar

class this._cls0
    implements android.view.GlobalLayoutListener
{

    final NetflixActionBar this$0;

    private void applyUpButtonTouchDelegate()
    {
        Object obj = getHomeView((View)content.getParent());
        if (obj == null)
        {
            Log.d("NetflixActionBar", "Could not find home view");
            return;
        }
        View view = ((View) (obj));
        if (!((View) (obj)).isClickable())
        {
            view = (View)((View) (obj)).getParent();
        }
        view.setFocusable(false);
        int i = view.getWidth();
        Log.v("NetflixActionBar", (new StringBuilder()).append("caret width: ").append(i).toString());
        obj = new Rect();
        view.getHitRect(((Rect) (obj)));
        obj.right = (int)((float)((Rect) (obj)).right * 2.5F);
        Log.v("NetflixActionBar", (new StringBuilder()).append("touch delegate rect: ").append(((Rect) (obj)).toString()).toString());
        content.setTouchDelegate(new TouchDelegate(((Rect) (obj)), view));
    }

    private View findHomeView(View view)
    {
        Log.v("NetflixActionBar", (new StringBuilder()).append("Examining view: ").append(view.getClass().getSimpleName()).toString());
        if ("HomeView".equals(view.getClass().getSimpleName()))
        {
            return view;
        }
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            for (int i = 0; i < view.getChildCount(); i++)
            {
                View view1 = findHomeView(view.getChildAt(i));
                if (view1 != null)
                {
                    return view1;
                }
            }

        } else
        {
            return null;
        }
        return null;
    }

    private View getHomeView(View view)
    {
        if (NetflixActionBar.access$000(NetflixActionBar.this) == null)
        {
            NetflixActionBar.access$002(NetflixActionBar.this, findHomeView(view));
        }
        return NetflixActionBar.access$000(NetflixActionBar.this);
    }

    public void onGlobalLayout()
    {
        ViewUtils.removeGlobalLayoutListener(content, this);
        applyUpButtonTouchDelegate();
    }

    ()
    {
        this$0 = NetflixActionBar.this;
        super();
    }
}
