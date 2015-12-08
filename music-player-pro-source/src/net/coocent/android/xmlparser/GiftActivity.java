// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.coocent.android.xmlparser;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.GridView;
import android.widget.ImageView;
import java.util.ArrayList;

// Referenced classes of package net.coocent.android.xmlparser:
//            LoadAppInfoListener, PromotionSDK, NetMusicXmlParseTask, GiftGridViewAdapter

public class GiftActivity extends Activity
    implements LoadAppInfoListener
{

    public static final int NET_LOADING = 7;
    private static final int startAnim = 0;
    private static final int stopAnim = 1;
    private GridView giftGridView;
    private GiftGridViewAdapter giftListViewAdapter;
    private Handler handler;
    private ImageView iv_gift_loading;

    public GiftActivity()
    {
        handler = new Handler() {

            final GiftActivity this$0;

            public void handleMessage(Message message)
            {
                message.what;
                JVM INSTR tableswitch 0 1: default 28
            //                           0 34
            //                           1 68;
                   goto _L1 _L2 _L3
_L1:
                super.handleMessage(message);
                return;
_L2:
                iv_gift_loading.setVisibility(0);
                iv_gift_loading.startAnimation(AnimationUtils.loadAnimation(GiftActivity.this, net.coocent.promotionsdk.R.anim.loading));
                continue; /* Loop/switch isn't completed */
_L3:
                iv_gift_loading.setVisibility(8);
                iv_gift_loading.clearAnimation();
                if (true) goto _L1; else goto _L4
_L4:
            }

            
            {
                this$0 = GiftActivity.this;
                super();
            }
        };
    }

    private void findView()
    {
        iv_gift_loading = (ImageView)findViewById(net.coocent.promotionsdk.R.id.iv_gift_loading);
        giftGridView = (GridView)findViewById(net.coocent.promotionsdk.R.id.lvGift);
        ArrayList arraylist = PromotionSDK.GetAppInfoList();
        if (arraylist == null)
        {
            handler.sendEmptyMessage(0);
            (new NetMusicXmlParseTask(this, this)).execute(new String[] {
                "http://www.coocent.net/coocentPromotion/yonggift/giftList.xml"
            });
        }
        giftListViewAdapter = new GiftGridViewAdapter(this, arraylist, giftGridView);
        giftGridView.setAdapter(giftListViewAdapter);
        PromotionSDK.setListOnItemClickListner(giftGridView, giftListViewAdapter);
        findViewById(net.coocent.promotionsdk.R.id.back).setOnClickListener(new android.view.View.OnClickListener() {

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

    public void onAppInfoLoaded(ArrayList arraylist)
    {
        giftListViewAdapter.changeData(arraylist);
        handler.sendEmptyMessage(1);
    }

    protected void onCreate(Bundle bundle)
    {
        requestWindowFeature(1);
        setContentView(net.coocent.promotionsdk.R.layout.activity_gift);
        findView();
        super.onCreate(bundle);
    }

}
