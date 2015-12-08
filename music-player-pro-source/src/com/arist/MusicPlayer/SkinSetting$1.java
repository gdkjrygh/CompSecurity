// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import com.arist.Adapter.SkinAdapter;
import com.arist.util.BitmapService;

// Referenced classes of package com.arist.MusicPlayer:
//            SkinSetting, MyApplication

class this._cls0
    implements android.widget.ItemClickListener
{

    final SkinSetting this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        i = (int)l;
        adapterview = new BitmapDrawable(BitmapService.readBitMap(getResources(), i));
        SkinSetting.access$0(SkinSetting.this).setBackgroundDrawable(adapterview);
        MyApplication.setWallpaperId(i);
        SkinSetting.access$1(SkinSetting.this).notifyDataSetChanged();
    }

    able()
    {
        this$0 = SkinSetting.this;
        super();
    }
}
