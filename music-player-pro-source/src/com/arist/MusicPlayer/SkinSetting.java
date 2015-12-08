// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import com.arist.Adapter.SkinAdapter;
import com.arist.entity.Skin;
import com.arist.util.BitmapService;
import java.util.ArrayList;

// Referenced classes of package com.arist.MusicPlayer:
//            MyApplication

public class SkinSetting extends Activity
{

    private SkinAdapter adapter;
    private GridView gridView;
    private LinearLayout layout;
    private ArrayList skins;

    public SkinSetting()
    {
    }

    private void initData()
    {
        TypedArray typedarray = getResources().obtainTypedArray(0x7f0b0006);
        skins = new ArrayList();
        int i = 0;
        do
        {
            if (i >= typedarray.length())
            {
                return;
            }
            Skin skin = new Skin();
            skin.setResId(typedarray.getResourceId(i, 0));
            skins.add(skin);
            i++;
        } while (true);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(0x7f03000d);
        gridView = (GridView)findViewById(0x7f0d004a);
        layout = (LinearLayout)findViewById(0x7f0d0046);
        initData();
        adapter = new SkinAdapter(this, skins);
        gridView.setAdapter(adapter);
        gridView.setFocusable(true);
        gridView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final SkinSetting this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                i = (int)l;
                adapterview = new BitmapDrawable(BitmapService.readBitMap(getResources(), i));
                layout.setBackgroundDrawable(adapterview);
                MyApplication.setWallpaperId(i);
                adapter.notifyDataSetChanged();
            }

            
            {
                this$0 = SkinSetting.this;
                super();
            }
        });
        findViewById(0x7f0d0048).setOnClickListener(new android.view.View.OnClickListener() {

            final SkinSetting this$0;

            public void onClick(View view)
            {
                finish();
            }

            
            {
                this$0 = SkinSetting.this;
                super();
            }
        });
    }

    protected void onResume()
    {
        layout.setBackgroundResource(MyApplication.getWallpaperId());
        super.onResume();
    }


}
