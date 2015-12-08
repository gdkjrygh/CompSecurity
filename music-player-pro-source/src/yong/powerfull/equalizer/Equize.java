// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yong.powerfull.equalizer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.arist.MusicPlayer.MyApplication;
import com.arist.service.MusicPlayService;
import java.util.Map;

// Referenced classes of package yong.powerfull.equalizer:
//            CompatEq, PreferenceService, ScreenInfo, VisualizerView, 
//            MySeekBar, EquzeHelper

public class Equize extends Activity
{
    public class Audiachange extends BroadcastReceiver
    {

        final Equize this$0;

        public void onReceive(Context context, Intent intent)
        {
            currentVolume = audioManager.getStreamVolume(3);
            bar1.setProgress(currentVolume);
        }

        public Audiachange()
        {
            this$0 = Equize.this;
            super();
        }
    }


    private static final String TAG = "AudioFxActivity";
    static PreferenceService preferenceService;
    private AudioManager audioManager;
    MySeekBar bar1;
    MySeekBar bar2;
    MySeekBar bar3;
    MySeekBar bar4;
    MySeekBar bar5;
    MySeekBar bar6;
    boolean choose;
    private int currentVolume;
    private MusicPlayService eqService;
    private Button equzechoosebtn;
    private Button equzesave;
    int h;
    ImageView inggebgadjust;
    short maxEQLevel;
    private int maxVolume;
    int presetEQ[][];
    private String presetName[];
    private VisualizerView visualizer;
    int w;

    public Equize()
    {
        maxEQLevel = 0;
        choose = false;
        int ai[] = new int[5];
        ai[0] = 300;
        ai[4] = 300;
        int ai1[] = new int[5];
        ai1[0] = 600;
        ai1[2] = 200;
        ai1[3] = 400;
        ai1[4] = 100;
        int ai2[] = new int[5];
        int ai3[] = new int[5];
        ai3[0] = 300;
        ai3[3] = 200;
        ai3[4] = -100;
        int ai4[] = new int[5];
        ai4[0] = 400;
        ai4[1] = 100;
        ai4[2] = 900;
        ai4[3] = 300;
        int ai5[] = new int[5];
        ai5[0] = 500;
        ai5[1] = 300;
        ai5[3] = 100;
        ai5[4] = 300;
        int ai6[] = {
            400, 200, -200, 200, 500
        };
        presetEQ = (new int[][] {
            ai, new int[] {
                500, 300, -200, 400, 400
            }, ai1, ai2, ai3, ai4, ai5, ai6, new int[] {
                -100, 200, 500, 100, -200
            }, new int[] {
                500, 300, -100, 300, 500
            }
        });
    }

    public void onBackPressed()
    {
        onFinish();
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        final MySeekBar equizeBar[];
        int i;
        super.onCreate(bundle);
        requestWindowFeature(7);
        setContentView(0x7f030018);
        getWindow().setFeatureInt(7, 0x7f030025);
        bundle = (ImageButton)findViewById(0x7f0d00af);
        Object obj = (ImageButton)findViewById(0x7f0d00b1);
        ((TextView)findViewById(0x7f0d00b0)).setText(0x7f08009b);
        ((ImageButton) (obj)).setVisibility(8);
        presetName = getResources().getStringArray(0x7f0b0005);
        if (MusicPlayService.hasInstance())
        {
            eqService = MusicPlayService.get(getApplicationContext());
        }
        maxEQLevel = (short)eqService.mEqualizer.getBandMaxLevel();
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            final Equize this$0;

            public void onClick(View view)
            {
                onFinish();
            }

            
            {
                this$0 = Equize.this;
                super();
            }
        });
        inggebgadjust = (ImageView)findViewById(0x7f0d0063);
        equzesave = (Button)findViewById(0x7f0d0061);
        equzechoosebtn = (Button)findViewById(0x7f0d0060);
        audioManager = (AudioManager)getSystemService("audio");
        maxVolume = audioManager.getStreamMaxVolume(3);
        currentVolume = audioManager.getStreamVolume(3);
        preferenceService = new PreferenceService(this);
        bundle = new ScreenInfo(this);
        obj = (android.widget.LinearLayout.LayoutParams)inggebgadjust.getLayoutParams();
        visualizer = (VisualizerView)findViewById(0x7f0d006a);
        visualizer.setupVisualizerFx(MyApplication.mediaPlayer.getAudioSessionId());
        w = bundle.getWidth();
        h = (bundle.getHeight() / 93) * 9;
        obj.width = w;
        obj.height = (w * 403) / 360;
        inggebgadjust.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        equzesave.setOnClickListener(new android.view.View.OnClickListener() {

            final Equize this$0;

            public void onClick(View view)
            {
                onFinish();
            }

            
            {
                this$0 = Equize.this;
                super();
            }
        });
        bar1 = (MySeekBar)findViewById(0x7f0d0064);
        bar2 = (MySeekBar)findViewById(0x7f0d0065);
        bar3 = (MySeekBar)findViewById(0x7f0d0066);
        bar4 = (MySeekBar)findViewById(0x7f0d0067);
        bar5 = (MySeekBar)findViewById(0x7f0d0068);
        bar6 = (MySeekBar)findViewById(0x7f0d0069);
        obj = preferenceService.getPreferences00();
        Map map = preferenceService.getPreferences01();
        Map map1 = preferenceService.getPreferences02();
        Map map2 = preferenceService.getPreferences03();
        Map map3 = preferenceService.getPreferences04();
        bundle = new int[5];
        bundle[0] = Integer.valueOf((String)((Map) (obj)).get("progress0")).intValue();
        bundle[1] = Integer.valueOf((String)map.get("progress1")).intValue();
        bundle[2] = Integer.valueOf((String)map1.get("progress2")).intValue();
        bundle[3] = Integer.valueOf((String)map2.get("progress3")).intValue();
        bundle[4] = Integer.valueOf((String)map3.get("progress4")).intValue();
        equizeBar = new MySeekBar[5];
        equizeBar[0] = bar2;
        equizeBar[1] = bar3;
        equizeBar[2] = bar4;
        equizeBar[3] = bar5;
        equizeBar[4] = bar6;
        i = 0;
_L1:
        if (i < presetName.length)
        {
label0:
            {
                if (bundle[0] != presetEQ[i][0] || bundle[1] != presetEQ[i][1] || bundle[2] != presetEQ[i][2] || bundle[3] != presetEQ[i][3] || bundle[4] != presetEQ[i][4])
                {
                    break label0;
                }
                equzechoosebtn.setText(presetName[i]);
            }
        }
        bar1.setMax(maxVolume);
        bar1.setProgress(currentVolume);
        bar1.setOnSeekBarChangeListener(new MySeekBar.OnSeekBarChangeListener() {

            final Equize this$0;

            public void onProgressChanged(MySeekBar myseekbar, int j, boolean flag)
            {
                audioManager.setStreamVolume(3, j, 2);
            }

            public void onStartTrackingTouch(MySeekBar myseekbar)
            {
            }

            public void onStopTrackingTouch(MySeekBar myseekbar)
            {
            }

            
            {
                this$0 = Equize.this;
                super();
            }
        });
        i = 0;
_L2:
        if (i >= 5)
        {
            equzechoosebtn.setOnClickListener(new android.view.View.OnClickListener() {

                final Equize this$0;
                private final MySeekBar val$equizeBar[];

                public void onClick(View view)
                {
                    choose = true;
                    (new android.app.AlertDialog.Builder(Equize.this)).setItems(presetName, equizeBar. new android.content.DialogInterface.OnClickListener() {

                        final _cls5 this$1;
                        private final MySeekBar val$equizeBar[];

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            equzechoosebtn.setText(presetName[i]);
                            int j = 0;
                            do
                            {
                                if (j > 4)
                                {
                                    return;
                                }
                                equizeBar[j].setProgress(presetEQ[i][j] + maxEQLevel);
                                j++;
                            } while (true);
                        }

            
            {
                this$1 = final__pcls5;
                equizeBar = _5B_Lyong.powerfull.equalizer.MySeekBar_3B_.this;
                super();
            }
                    }).create().show();
                }


            
            {
                this$0 = Equize.this;
                equizeBar = amyseekbar;
                super();
            }
            });
            return;
        }
        break MISSING_BLOCK_LABEL_789;
        equzechoosebtn.setText(0x7f08009a);
        i++;
          goto _L1
        equizeBar[i].setMax(eqService.mEqualizer.getBandMaxLevel() * 2);
        equizeBar[i].setProgress(bundle[i] + maxEQLevel);
        equizeBar[i].setOnSeekBarChangeListener(new MySeekBar.OnSeekBarChangeListener() {

            final Equize this$0;
            private final MySeekBar val$equizeBar[];

            public void onProgressChanged(MySeekBar myseekbar, int j, boolean flag)
            {
                if (eqService.mEqualizer == null) goto _L2; else goto _L1
_L1:
                int k = 0;
_L5:
                if (k < 5) goto _L3; else goto _L2
_L2:
                if (!choose)
                {
                    equzechoosebtn.setText(0x7f08009a);
                }
                return;
_L3:
                if (myseekbar.equals(equizeBar[k]))
                {
                    eqService.mEqualizer.setBandLevel((short)k, (short)(j - maxEQLevel));
                }
                k++;
                if (true) goto _L5; else goto _L4
_L4:
            }

            public void onStartTrackingTouch(MySeekBar myseekbar)
            {
            }

            public void onStopTrackingTouch(MySeekBar myseekbar)
            {
            }

            
            {
                this$0 = Equize.this;
                equizeBar = amyseekbar;
                super();
            }
        });
        i++;
          goto _L2
    }

    protected void onDestroy()
    {
        preferenceService.band0("AudioFxActivity", Integer.valueOf(EquzeHelper.getEe(0)));
        preferenceService.band1("AudioFxActivity", Integer.valueOf(EquzeHelper.getEe(1)));
        preferenceService.band2("AudioFxActivity", Integer.valueOf(EquzeHelper.getEe(2)));
        preferenceService.band3("AudioFxActivity", Integer.valueOf(EquzeHelper.getEe(3)));
        preferenceService.band4("AudioFxActivity", Integer.valueOf(EquzeHelper.getEe(4)));
        super.onDestroy();
    }

    public void onFinish()
    {
        if (visualizer != null)
        {
            visualizer.releaseVisualizerFx();
        }
        finish();
    }






}
