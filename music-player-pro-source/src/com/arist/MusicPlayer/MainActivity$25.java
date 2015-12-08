// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import com.arist.Adapter.MainGridAdapter;
import com.arist.biz.ButtonInfoBiz;
import java.util.ArrayList;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity, MyApplication

class this._cls0
    implements android.support.v4.view.ChangeListener
{

    final MainActivity this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        currentPageIndex = i;
        MyApplication.setCurrentPage(currentPageIndex);
        if (currentPageIndex == 0)
        {
            MainActivity.access$54(MainActivity.this, MainActivity.access$53(MainActivity.this).getButtonInfos());
            MainActivity.access$55(MainActivity.this).setData(MainActivity.access$56(MainActivity.this));
            MainActivity.access$55(MainActivity.this).notifyDataSetChanged();
        }
        int j = MainActivity.access$57(MainActivity.this).size();
        int ai[] = new int[4];
        i = 0;
        do
        {
            if (i >= j)
            {
                MainActivity.access$58(MainActivity.this, j, ai);
                (new Thread() {

                    final MainActivity._cls25 this$1;

                    public void run()
                    {
                    }

            
            {
                this$1 = MainActivity._cls25.this;
                super();
            }
                }).start();
                return;
            }
            if (i == currentPageIndex)
            {
                ai[i] = 1;
            }
            i++;
        } while (true);
    }

    _cls1.this._cls1()
    {
        this$0 = MainActivity.this;
        super();
    }
}
