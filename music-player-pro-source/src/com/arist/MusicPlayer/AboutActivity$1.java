// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.arist.Adapter.MyPagerAdapter;
import java.util.ArrayList;

// Referenced classes of package com.arist.MusicPlayer:
//            AboutActivity

class val.views
    implements Runnable
{

    final AboutActivity this$0;
    private final LayoutInflater val$inflater;
    private final TypedArray val$skinRes;
    private final ArrayList val$views;

    public void run()
    {
        int i = 2;
        do
        {
            if (i >= val$skinRes.length())
            {
                AboutActivity.access$0(AboutActivity.this).changeData(val$views);
                return;
            }
            View view = val$inflater.inflate(0x7f030002, null);
            ((ImageView)view.findViewById(0x7f0d0018)).setImageResource(val$skinRes.getResourceId(i, 0));
            val$views.add(view);
            i++;
        } while (true);
    }

    ()
    {
        this$0 = final_aboutactivity;
        val$skinRes = typedarray;
        val$inflater = layoutinflater;
        val$views = ArrayList.this;
        super();
    }
}
