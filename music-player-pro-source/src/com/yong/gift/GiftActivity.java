// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.gift;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import java.io.File;
import java.util.ArrayList;

// Referenced classes of package com.yong.gift:
//            GiftListViewAdapter, NetMusicXmlParseTask, GiftEntity

public class GiftActivity extends Activity
{

    public static final String BASE_URL = "http://moobosoft.com/giftmodule/";
    public static final String DOWNLOAD_ICON_PATH = (new StringBuilder(String.valueOf(Environment.getExternalStorageDirectory().getPath()))).append("/gift/").toString();
    private static final int startAnim = 0;
    private static final int stopAnim = 1;
    private ListView giftListView;
    private GiftListViewAdapter giftListViewAdapter;
    private Handler handler;
    private ImageView iv_gift_loading;

    public GiftActivity()
    {
        handler = new Handler() {

            final GiftActivity this$0;

            public void handleMessage(Message message)
            {
                message.what;
                JVM INSTR tableswitch 7 7: default 24
            //                           7 30;
                   goto _L1 _L2
_L1:
                super.handleMessage(message);
                return;
_L2:
                if (message.arg1 == 0)
                {
                    iv_gift_loading.setVisibility(0);
                    iv_gift_loading.startAnimation(AnimationUtils.loadAnimation(GiftActivity.this, 0x7f040004));
                } else
                {
                    iv_gift_loading.setVisibility(8);
                    iv_gift_loading.clearAnimation();
                }
                if (true) goto _L1; else goto _L3
_L3:
            }

            
            {
                this$0 = GiftActivity.this;
                super();
            }
        };
    }

    private void findView()
    {
        iv_gift_loading = (ImageView)findViewById(0x7f0d001e);
        giftListView = (ListView)findViewById(0x7f0d001c);
        giftListViewAdapter = new GiftListViewAdapter(this, null, giftListView);
        giftListView.setAdapter(giftListViewAdapter);
        giftListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final GiftActivity this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = new Intent("android.intent.action.VIEW", Uri.parse(((GiftEntity)giftListViewAdapter.getItem(i)).getMarketUrl()));
                startActivity(adapterview);
            }

            
            {
                this$0 = GiftActivity.this;
                super();
            }
        });
        findViewById(0x7f0d001a).setOnClickListener(new android.view.View.OnClickListener() {

            final GiftActivity this$0;

            public void onClick(View view)
            {
                finish();
            }

            
            {
                this$0 = GiftActivity.this;
                super();
            }
        });
    }

    protected void onCreate(Bundle bundle)
    {
        requestWindowFeature(1);
        setContentView(0x7f030003);
        findView();
        Message message = handler.obtainMessage();
        message.what = 7;
        message.arg1 = 0;
        handler.sendMessage(message);
        (new NetMusicXmlParseTask(this)).execute(new String[] {
            "http://moobosoft.com/giftmodule/giftList.xml"
        });
        super.onCreate(bundle);
    }

    public void updateView(ArrayList arraylist)
    {
        giftListViewAdapter.changeData(arraylist);
        arraylist = handler.obtainMessage();
        arraylist.what = 7;
        arraylist.arg1 = 1;
        handler.sendMessage(arraylist);
    }



}
