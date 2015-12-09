// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.app.Dialog;
import android.media.AudioManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.media.Subtitle;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.ui.common.LanguageSelector;
import com.netflix.mediaclient.ui.common.Social;
import com.netflix.mediaclient.util.PreferenceUtils;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.ViewUtils;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerSection, PlayerActivity, SubtitleManager, ResourceHelper

public final class TopPanel extends PlayerSection
{

    private static final String TAG = "screen";
    android.view.View.OnClickListener backListener;
    private View mBackArrow;
    private View mBackPadding;
    private Button mBtnLog;
    private Button mBtnMetadata;
    private String mDialogLanguageId;
    private ImageButton mEpisodeSelector;
    private boolean mEpisodeSelectorEnabled;
    private ImageButton mLanguage;
    private LanguageSelector mLanguageSelector;
    private final Social mSocial;
    private SeekBar mSound;
    private TextView mTitleLabel;
    private View mTopPanel;

    public TopPanel(PlayerActivity playeractivity, PlayScreen.Listeners listeners)
    {
        super(playeractivity);
        backListener = new android.view.View.OnClickListener() {

            final TopPanel this$0;

            public void onClick(View view)
            {
                context.performUpAction();
                context.cleanupAndExit();
            }

            
            {
                this$0 = TopPanel.this;
                super();
            }
        };
        mSocial = new Social(playeractivity, playeractivity.getSocialProviderCallback());
        initGeneric(listeners);
        initBack();
        initQa();
        initLanguages();
        initSound(listeners.audioPositionListener);
    }

    private void initBack()
    {
        mBackArrow = context.findViewById(0x7f070151);
        if (mBackArrow != null)
        {
            mBackArrow.setOnClickListener(backListener);
        }
        mBackPadding = context.findViewById(0x7f070152);
        if (mBackPadding != null)
        {
            mBackPadding.setOnClickListener(backListener);
        }
    }

    private void initGeneric(PlayScreen.Listeners listeners)
    {
        mTopPanel = context.findViewById(0x7f070150);
        if (mTopPanel == null)
        {
            Log.e("screen", "========>top null!");
        }
        mTitleLabel = (TextView)context.findViewById(0x7f070153);
        if (context.isForKids())
        {
            mTitleLabel.setOnClickListener(backListener);
        }
        mEpisodeSelector = (ImageButton)context.findViewById(0x7f070158);
        if (mEpisodeSelector != null)
        {
            mEpisodeSelector.setOnClickListener(listeners.episodeSelectorListener);
        }
    }

    private void initLanguages()
    {
        Object obj = new com.netflix.mediaclient.ui.common.LanguageSelector.LanguageSelectorCallback() {

            final TopPanel this$0;

            public void languageChanged(Language language, boolean flag)
            {
                Log.d("screen", "Language changed");
                if (processLanguageChange(language) && flag)
                {
                    context.doUnpause();
                }
                context.startScreenUpdateTask();
                context.reportUiModelessViewSessionEnded(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.audioSubtitlesSelector, mDialogLanguageId);
            }

            public void updateDialog(Dialog dialog)
            {
                context.updateVisibleDialog(dialog);
            }

            public void userCanceled()
            {
                Log.d("screen", "User canceled selection");
                context.doUnpause();
                context.startScreenUpdateTask();
                context.reportUiModelessViewSessionEnded(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.audioSubtitlesSelector, mDialogLanguageId);
            }

            public boolean wasPlaying()
            {
                return context.getPlayer().isPlaying();
            }

            
            {
                this$0 = TopPanel.this;
                super();
            }
        };
        mLanguageSelector = LanguageSelector.createInstance(context, context.isTablet(), ((com.netflix.mediaclient.ui.common.LanguageSelector.LanguageSelectorCallback) (obj)));
        obj = new android.view.View.OnClickListener() {

            final TopPanel this$0;

            public void onClick(View view1)
            {
                Log.d("screen", "Display language dialog");
                view1 = context;
                if (view1 != null)
                {
                    view1.extendTimeoutTimer();
                }
                mLanguageSelector.display(context.getLanguage());
                context.stopScreenUpdateTask();
                mDialogLanguageId = context.reportUiModelessViewSessionStart(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.audioSubtitlesSelector);
            }

            
            {
                this$0 = TopPanel.this;
                super();
            }
        };
        View view = context.findViewById(0x7f070159);
        if (view instanceof ImageView)
        {
            Log.d("screen", "Add language button");
            mLanguage = (ImageButton)view;
            mLanguage.setOnClickListener(((android.view.View.OnClickListener) (obj)));
            mLanguage.setBackgroundColor(transpColor);
        }
    }

    private void initQa()
    {
    }

    private void initSound(android.widget.SeekBar.OnSeekBarChangeListener onseekbarchangelistener)
    {
        mSound = (SeekBar)context.findViewById(0x7f07015a);
        if (mSound != null)
        {
            mSound.setOnSeekBarChangeListener(onseekbarchangelistener);
            onseekbarchangelistener = (AudioManager)context.getSystemService("audio");
            if (onseekbarchangelistener != null)
            {
                int i = onseekbarchangelistener.getStreamMaxVolume(3);
                if (Log.isLoggable("screen", 3))
                {
                    Log.d("screen", (new StringBuilder()).append("Maximal audio volume for music stream is: ").append(i).toString());
                }
                mSound.setMax(i);
                mSound.setKeyProgressIncrement(1);
                mSound.setProgress(onseekbarchangelistener.getStreamVolume(3));
                return;
            } else
            {
                Log.e("screen", "Audio manager is not available, can not set max volume");
                return;
            }
        } else
        {
            Log.e("screen", "Sound seekbar was NOT found!");
            return;
        }
    }

    private boolean processLanguageChange(Language language)
    {
        if (context.getScreen() != null)
        {
            AudioSource audiosource = language.getSelectedAudio();
            Subtitle subtitle = language.getSelectedSubtitle();
            boolean flag;
            int i;
            boolean flag1;
            if (subtitle == null)
            {
                Log.d("screen", "Selected subtitle is NONE");
                flag1 = false;
            } else
            {
                flag1 = true;
            }
            if (Log.isLoggable("screen", 3))
            {
                Log.d("screen", (new StringBuilder()).append("Selected subtitle ").append(subtitle).toString());
                Log.d("screen", (new StringBuilder()).append("Selected audio source ").append(audiosource).toString());
            }
            context.getSubtitleManager().setSubtitleVisibility(flag1);
            flag = false;
            flag1 = false;
            i = audiosource.getNccpOrderNumber();
            if (i != language.getCurrentNccpAudioIndex())
            {
                if (Log.isLoggable("screen", 3))
                {
                    Log.d("screen", (new StringBuilder()).append("Audio source is switched from ").append(language.getCurrentNccpAudioIndex()).append(" to ").append(i).append(" NCCP index").toString());
                }
                flag = true;
                flag1 = true;
                Log.d("screen", "Start change language, get awake clock");
            } else
            {
                Log.d("screen", "No need to change audio.");
            }
            if (subtitle != null)
            {
                int j = subtitle.getNccpOrderNumber();
                if (j != language.getCurrentNccpSubtitleIndex())
                {
                    if (Log.isLoggable("screen", 3))
                    {
                        Log.d("screen", (new StringBuilder()).append("Subtitle is now visible and it is switched from ").append(language.getCurrentNccpSubtitleIndex()).append(" to ").append(j).append(" NCCP index").toString());
                    }
                    flag = true;
                } else
                {
                    Log.d("screen", "No need to change subtitle.");
                }
            } else
            {
                Log.d("screen", "Subtitle is off");
                flag = true;
            }
            if (flag)
            {
                Log.d("screen", "Reloading tracks");
                context.changeLanguage(language, flag1);
            }
            if (!flag1)
            {
                return true;
            }
        }
        return false;
    }

    public void changeActionState(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        enableButton(mLanguage, flag);
        enableButton(mEpisodeSelector, flag);
        if (mBtnLog != null)
        {
            mBtnLog.setEnabled(flag);
        }
        if (mBtnMetadata != null)
        {
            mBtnMetadata.setEnabled(flag);
        }
        mSocial.changeActionState(flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void destroy()
    {
        this;
        JVM INSTR monitorenter ;
        if (mSound != null)
        {
            mSound.setOnSeekBarChangeListener(null);
        }
        mSocial.destroy();
        if (mBackArrow != null)
        {
            mBackArrow.setOnClickListener(null);
        }
        if (mBackPadding != null)
        {
            mBackPadding.setOnClickListener(null);
        }
        if (mEpisodeSelector != null)
        {
            mEpisodeSelector.setOnClickListener(null);
        }
        if (mTitleLabel != null)
        {
            mTitleLabel.setOnClickListener(null);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public String getCurrentTitle()
    {
        if (mTitleLabel == null)
        {
            return null;
        } else
        {
            return mTitleLabel.getText().toString();
        }
    }

    LanguageSelector getLanguageSelector()
    {
        return mLanguageSelector;
    }

    Social getSocial()
    {
        return mSocial;
    }

    public void hide()
    {
        this;
        JVM INSTR monitorenter ;
        if (mTopPanel != null)
        {
            mTopPanel.setVisibility(8);
        }
        if (mLanguage != null)
        {
            mLanguage.setVisibility(8);
        }
        if (mBtnLog != null)
        {
            mBtnLog.setVisibility(8);
        }
        if (mBtnMetadata != null)
        {
            mBtnMetadata.setVisibility(8);
        }
        mSocial.hide();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void hideSoundSection()
    {
        this;
        JVM INSTR monitorenter ;
        if (mTopPanel != null)
        {
            mTopPanel.setBackgroundResource(context.getUiResources().topBackground);
            mTopPanel.setVisibility(8);
        }
        if (mBackArrow != null)
        {
            mBackArrow.setVisibility(0);
        }
        if (mTitleLabel != null)
        {
            mTitleLabel.setVisibility(0);
        }
        if (mEpisodeSelectorEnabled && mEpisodeSelector != null)
        {
            mEpisodeSelector.setVisibility(0);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void initAudioProgress(int i)
    {
        if (Log.isLoggable("screen", 3))
        {
            Log.d("screen", (new StringBuilder()).append("InitAudioProgress: pos ").append(i).toString());
        }
        if (mSound != null)
        {
            Log.d("screen", "Audio: Updating seekbar");
            mSound.setProgress(i);
        }
    }

    public int setAudioProgress(int i)
    {
        if (Log.isLoggable("screen", 3))
        {
            Log.d("screen", (new StringBuilder()).append("SetAudioProgress: pos ").append(i).toString());
        }
        if (mSound != null)
        {
            Log.d("screen", "Audio: Updating seekbar");
            mSound.setProgress(i);
        }
        return i;
    }

    void setEpisodeSelectorVisibility(boolean flag)
    {
        if (mEpisodeSelector == null)
        {
            return;
        } else
        {
            mEpisodeSelectorEnabled = flag;
            ViewUtils.setVisibility(mEpisodeSelector, flag);
            return;
        }
    }

    public void setLanguage(Language language)
    {
label0:
        {
            if (mLanguage != null && language != null && language.isLanguageSwitchEnabled())
            {
                language = context;
                if (language != null)
                {
                    break label0;
                }
            }
            return;
        }
        language.runInUiThread(new Runnable() {

            final TopPanel this$0;

            public void run()
            {
                ImageButton imagebutton = mLanguage;
                if (imagebutton != null && !imagebutton.isShown())
                {
                    imagebutton.setVisibility(0);
                }
            }

            
            {
                this$0 = TopPanel.this;
                super();
            }
        });
    }

    public void setTitles(final String displayText, String s)
    {
        PlayerActivity playeractivity = context;
        StringBuilder stringbuilder = new StringBuilder();
        if (StringUtils.isNotEmpty(s))
        {
            stringbuilder.append(s).append(" : ");
        }
        displayText = stringbuilder.append(displayText).toString();
        if (playeractivity != null && !playeractivity.isFinishing())
        {
            playeractivity.runInUiThread(new Runnable() {

                final TopPanel this$0;
                final String val$displayText;

                public void run()
                {
                    TextView textview = mTitleLabel;
                    if (textview == null)
                    {
                        return;
                    }
                    if (StringUtils.isEmpty(displayText))
                    {
                        textview.setText("");
                        return;
                    } else
                    {
                        textview.setText(displayText);
                        return;
                    }
                }

            
            {
                this$0 = TopPanel.this;
                displayText = s;
                super();
            }
            });
        }
    }

    public void show()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (mTopPanel != null)
        {
            mTopPanel.setBackgroundResource(context.getUiResources().topBackground);
            mTopPanel.setVisibility(0);
        }
        if (mBackArrow != null)
        {
            mBackArrow.setVisibility(0);
        }
        if (mTitleLabel != null)
        {
            mTitleLabel.setVisibility(0);
        }
        obj = context.getLanguage();
        if (mLanguage == null || obj == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        if (((Language) (obj)).isLanguageSwitchEnabled())
        {
            mLanguage.setVisibility(0);
        }
        if (mBtnLog != null)
        {
            mBtnLog.setVisibility(0);
        }
        if (mBtnMetadata != null)
        {
            mBtnMetadata.setVisibility(0);
        }
        mSocial.show();
        if (mSound == null)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        mSound.setVisibility(0);
        obj = (AudioManager)context.getSystemService("audio");
        if (obj == null) goto _L2; else goto _L1
_L1:
        Log.d("screen", (new StringBuilder()).append("Audio manager is available, update volume to ").append(((AudioManager) (obj)).getStreamVolume(3)).toString());
        ((AudioManager) (obj)).setStreamMute(3, false);
        mSound.setProgress(((AudioManager) (obj)).getStreamVolume(3));
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.e("screen", "Audio manager is not available, can not update volume");
          goto _L3
        Exception exception;
        exception;
        throw exception;
        Log.e("screen", "Soundbar not found!");
          goto _L3
    }

    public void showSoundSection()
    {
        this;
        JVM INSTR monitorenter ;
        SeekBar seekbar = mSound;
        if (seekbar == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        seekbar.setVisibility(0);
        if (mBackArrow != null)
        {
            mBackArrow.setVisibility(4);
        }
        if (mLanguage != null)
        {
            mLanguage.setVisibility(8);
        }
        if (mBtnLog != null)
        {
            mBtnLog.setVisibility(8);
        }
        if (mBtnMetadata != null)
        {
            mBtnMetadata.setVisibility(8);
        }
        mSocial.hide();
        if (mEpisodeSelector != null)
        {
            mEpisodeSelector.setVisibility(8);
        }
        if (mTitleLabel != null)
        {
            mTitleLabel.setVisibility(4);
        }
        if (mTopPanel != null)
        {
            mTopPanel.setBackgroundResource(0);
            mTopPanel.setVisibility(0);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }



/*
    static String access$002(TopPanel toppanel, String s)
    {
        toppanel.mDialogLanguageId = s;
        return s;
    }

*/





    // Unreferenced inner class com/netflix/mediaclient/ui/player/TopPanel$4

/* anonymous class */
    class _cls4
        implements android.view.View.OnClickListener
    {

        final TopPanel this$0;

        public void onClick(View view)
        {
            Log.d("screen", "Export log");
        }

            
            {
                this$0 = TopPanel.this;
                super();
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/ui/player/TopPanel$5

/* anonymous class */
    class _cls5
        implements android.view.View.OnClickListener
    {

        final TopPanel this$0;

        public void onClick(View view)
        {
            boolean flag = false;
            boolean flag1 = PreferenceUtils.getBooleanPref(context, "ui.playeroverlay", false);
            if (flag1)
            {
                Log.d("screen", "Disable debug metadata on player UI");
            } else
            {
                Log.d("screen", "Enable debug metadata on `player UI");
            }
            view = context;
            if (!flag1)
            {
                flag = true;
            }
            PreferenceUtils.putBooleanPref(view, "ui.playeroverlay", flag);
        }

            
            {
                this$0 = TopPanel.this;
                super();
            }
    }

}
