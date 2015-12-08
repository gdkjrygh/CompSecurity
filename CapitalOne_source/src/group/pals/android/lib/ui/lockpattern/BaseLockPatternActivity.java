// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package group.pals.android.lib.ui.lockpattern;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.TextView;
import group.pals.android.lib.ui.lockpattern.util.IEncrypter;
import group.pals.android.lib.ui.lockpattern.util.InvalidEncrypterException;
import group.pals.android.lib.ui.lockpattern.widget.LockPatternUtils;
import group.pals.android.lib.ui.lockpattern.widget.LockPatternView;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseLockPatternActivity extends Activity
{
    private static final class InvalidPattern extends Enum
    {

        private static final InvalidPattern $VALUES[];
        public static final InvalidPattern Inv_L_Pattern;
        public static final InvalidPattern L_Pattern;
        public static final InvalidPattern Z_Pattern;
        public String patternVal;

        public static InvalidPattern valueOf(String s)
        {
            return (InvalidPattern)Enum.valueOf(group/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$InvalidPattern, s);
        }

        public static InvalidPattern[] values()
        {
            return (InvalidPattern[])$VALUES.clone();
        }

        public String getPatternReverseVal()
        {
            return (new StringBuffer(patternVal)).reverse().toString();
        }

        public String getPatternVal()
        {
            return patternVal;
        }

        static 
        {
            Z_Pattern = new InvalidPattern("Z_Pattern", 0, "1235789");
            L_Pattern = new InvalidPattern("L_Pattern", 1, "14789");
            Inv_L_Pattern = new InvalidPattern("Inv_L_Pattern", 2, "12369");
            $VALUES = (new InvalidPattern[] {
                Z_Pattern, L_Pattern, Inv_L_Pattern
            });
        }

        private InvalidPattern(String s, int i, String s1)
        {
            super(s, i);
            patternVal = s1;
        }
    }

    public static class LPMode extends Enum
    {

        private static final LPMode $VALUES[];
        public static final LPMode ComparePattern;
        public static final LPMode CreatePattern;

        public static LPMode valueOf(String s)
        {
            return (LPMode)Enum.valueOf(group/pals/android/lib/ui/lockpattern/BaseLockPatternActivity$LPMode, s);
        }

        public static LPMode[] values()
        {
            return (LPMode[])$VALUES.clone();
        }

        static 
        {
            CreatePattern = new LPMode("CreatePattern", 0) {

                public String toString()
                {
                    return "create";
                }

            };
            ComparePattern = new LPMode("ComparePattern", 1) {

                public String toString()
                {
                    return "compare";
                }

            };
            $VALUES = (new LPMode[] {
                CreatePattern, ComparePattern
            });
        }

        private LPMode(String s, int i)
        {
            super(s, i);
        }

    }


    public static final String _AutoSave = (new StringBuilder()).append(_ClassName).append(".auto_save").toString();
    public static final String _ClassName = group/pals/android/lib/ui/lockpattern/BaseLockPatternActivity.getName();
    public static final String _EncrypterClass = group/pals/android/lib/ui/lockpattern/util/IEncrypter.getName();
    public static final String _MaxRetry = (new StringBuilder()).append(_ClassName).append(".max_retry").toString();
    public static final String _Mode = "lockpattern_mode";
    public static final String _Pattern = (new StringBuilder()).append(_ClassName).append(".pattern").toString();
    public static final String _Theme = (new StringBuilder()).append(_ClassName).append(".theme").toString();
    protected View ELI_LockImage;
    protected String errorCode;
    protected String errorMessage;
    protected String errorPattern;
    protected View headerContainer;
    private boolean mAutoSave;
    public Button mBtnConfirm;
    public Button mBtnPasswordSignIn;
    public Button mBtnPatternHelp;
    private final android.view.View.OnClickListener mBtnResetOnClickListener = new android.view.View.OnClickListener() {

        final BaseLockPatternActivity this$0;

        public void onClick(View view)
        {
            if (getString(R.string.alp_cmd_save).equals(mBtnConfirm.getText()))
            {
                mBtnConfirm.setText(R.string.alp_cmd_next);
                mLastPattern = null;
                mTxtInfo.setText(R.string.alp_msg_draw_an_unlock_pattern);
            }
            mLockPatternView.setTag(Integer.valueOf(1));
            mLockPatternView.enableInput();
            mDynamicTxtInfo.setText(R.string.alp_msg_draw_an_unlock_pattern_inital_text);
            mLockPatternView.clearPattern();
            disableButton(mBtnRestart);
            disableButton(mBtnConfirm);
        }

            
            {
                this$0 = BaseLockPatternActivity.this;
                super();
            }
    };
    private Button mBtnRestart;
    protected View mDividerLine;
    protected TextView mDynamicTxtInfo;
    private IEncrypter mEncrypter;
    protected View mFooter;
    protected List mLastPattern;
    protected LockPatternView mLockPatternView;
    protected final Runnable mLockPatternViewReloader = new Runnable() {

        final BaseLockPatternActivity this$0;

        public void run()
        {
            mLockPatternView.clearPattern();
            mPatternViewListener.onPatternCleared();
            mLockPatternView.setEnabled(true);
        }

            
            {
                this$0 = BaseLockPatternActivity.this;
                super();
            }
    };
    protected View mLoginFooter;
    private LPMode mMode;
    private final group.pals.android.lib.ui.lockpattern.widget.LockPatternView.OnPatternListener mPatternViewListener = new group.pals.android.lib.ui.lockpattern.widget.LockPatternView.OnPatternListener() {

        final BaseLockPatternActivity this$0;

        public void onPatternCellAdded(List list)
        {
            if (!getString(R.string.alp_cmd_next).equals(mBtnConfirm.getText()) || list == null) goto _L2; else goto _L1
_L1:
            _cls7..SwitchMap.group.pals.android.lib.ui.lockpattern.BaseLockPatternActivity.LPMode[mMode.ordinal()];
            JVM INSTR tableswitch 1 1: default 64
        //                       1 65;
               goto _L2 _L3
_L2:
            return;
_L3:
            if (list.size() >= 4)
            {
                enableButton(mBtnConfirm);
                enableButton(mBtnRestart);
            }
            switch (list.size())
            {
            default:
                return;

            case 4: // '\004'
                mDynamicTxtInfo.setText(R.string.alp_password_strength_msg_4_dots);
                return;

            case 5: // '\005'
                mDynamicTxtInfo.setText(R.string.alp_password_strength_msg_5_dots);
                return;

            case 6: // '\006'
                mDynamicTxtInfo.setText(R.string.alp_password_strength_msg_6_dots);
                return;

            case 7: // '\007'
                mDynamicTxtInfo.setText(R.string.alp_password_strength_msg_7_dots);
                return;

            case 8: // '\b'
                mDynamicTxtInfo.setText(R.string.alp_password_strength_msg_8_dots);
                return;

            case 9: // '\t'
                mDynamicTxtInfo.setText(R.string.alp_password_strength_msg_9_dots);
                break;
            }
            return;
        }

        public void onPatternCleared()
        {
            mLockPatternView.setDisplayMode(group.pals.android.lib.ui.lockpattern.widget.LockPatternView.DisplayMode.Correct);
            switch (_cls7..SwitchMap.group.pals.android.lib.ui.lockpattern.BaseLockPatternActivity.LPMode[mMode.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                disableButton(mBtnConfirm);
                disableButton(mBtnRestart);
                if (getString(R.string.alp_cmd_next).equals(mBtnConfirm.getText()))
                {
                    mLastPattern = null;
                    mDynamicTxtInfo.setText(R.string.alp_msg_draw_an_unlock_pattern_inital_text);
                    return;
                } else
                {
                    mDynamicTxtInfo.setText(R.string.alp_msg_redraw_pattern_to_confirm);
                    return;
                }

            case 2: // '\002'
                mTxtInfo.setText(R.string.alp_ELI_compare_title);
                headerContainer.setBackgroundColor(Color.parseColor("#000000"));
                mDynamicTxtInfo.setBackgroundColor(Color.parseColor("#000000"));
                mTxtInfo.setPadding(0, 0, 0, 0);
                ELI_LockImage.setVisibility(0);
                mDynamicTxtInfo.setText((new StringBuilder()).append(getString(R.string.alp_msg_draw_pattern_to_unlock)).append(' ').append(userName).toString());
                return;
            }
        }

        public void onPatternDetected(List list)
        {
            switch (_cls7..SwitchMap.group.pals.android.lib.ui.lockpattern.BaseLockPatternActivity.LPMode[mMode.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                doCreatePattern(list);
                return;

            case 2: // '\002'
                doComparePattern(list);
                break;
            }
        }

        public void onPatternStart()
        {
            mLockPatternView.setDisplayMode(group.pals.android.lib.ui.lockpattern.widget.LockPatternView.DisplayMode.Correct);
            if (mMode == LPMode.CreatePattern)
            {
                disableButton(mBtnConfirm);
                disableButton(mBtnRestart);
                if (getString(R.string.alp_cmd_next).equals(mBtnConfirm.getText()))
                {
                    mLastPattern = null;
                }
            }
        }

            
            {
                this$0 = BaseLockPatternActivity.this;
                super();
            }
    };
    private SharedPreferences mPrefs;
    protected TextView mTxtInfo;
    protected String userName;

    public BaseLockPatternActivity()
    {
    }

    private final void disableButton(Button button)
    {
        button.setEnabled(false);
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.4F);
        alphaanimation.setDuration(0L);
        alphaanimation.setFillAfter(true);
        button.startAnimation(alphaanimation);
    }

    private void doComparePattern(List list)
    {
        if (list == null)
        {
            return;
        } else
        {
            mLockPatternView.setTag(Integer.valueOf(2));
            list = LockPatternUtils.patternToStringValue(list);
            Intent intent = new Intent();
            intent.putExtra("mypattern", list);
            intent.putExtra("maskedUserName", userName);
            intent.putExtra("LockPatternAction", "compare");
            setResult(5555, intent);
            finish();
            return;
        }
    }

    private void doCreatePattern(List list)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setCancelable(false);
        TextView textview = new TextView(this);
        textview.setTextSize(22F);
        textview.setPadding(10, 10, 10, 5);
        textview.setGravity(17);
        TextView textview1 = new TextView(this);
        textview1.setGravity(17);
        textview1.setTextSize(16F);
        textview1.setPadding(20, 5, 20, 20);
        if (getString(R.string.alp_cmd_next).equals(mBtnConfirm.getText()))
        {
            if (list.size() < 4)
            {
                mLockPatternView.setDisplayMode(group.pals.android.lib.ui.lockpattern.widget.LockPatternView.DisplayMode.Wrong);
                textview.setText("Invalid Pattern");
                builder.setCustomTitle(textview);
                textview1.setText(R.string.alp_msg_alert_pattern_length_short);
                builder.setView(textview1).setNeutralButton("Try Again", new android.content.DialogInterface.OnClickListener() {

                    final BaseLockPatternActivity this$0;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface.cancel();
                        mLockPatternView.clearPattern();
                        mPatternViewListener.onPatternCleared();
                    }

            
            {
                this$0 = BaseLockPatternActivity.this;
                super();
            }
                });
                list = builder.create();
                list.setCanceledOnTouchOutside(false);
                list.show();
                return;
            }
            mLockPatternView.setTag(Integer.valueOf(1));
            String s = LockPatternUtils.patternToStringValue(list);
            if (s != null && (s.equals(InvalidPattern.Z_Pattern.getPatternVal()) || s.equals(InvalidPattern.Z_Pattern.getPatternReverseVal()) || s.equals(InvalidPattern.L_Pattern.getPatternVal()) || s.equals(InvalidPattern.L_Pattern.getPatternReverseVal()) || s.equals(InvalidPattern.Inv_L_Pattern.getPatternVal()) || s.equals(InvalidPattern.Inv_L_Pattern.getPatternReverseVal())))
            {
                mLockPatternView.setDisplayMode(group.pals.android.lib.ui.lockpattern.widget.LockPatternView.DisplayMode.Wrong);
                disableButton(mBtnConfirm);
                textview.setText("Invalid Pattern");
                builder.setCustomTitle(textview);
                textview1.setText(R.string.alp_msg_alert_pattern_too_common);
                builder.setView(textview1).setNeutralButton("Try Again", new android.content.DialogInterface.OnClickListener() {

                    final BaseLockPatternActivity this$0;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface.cancel();
                        mLockPatternView.clearPattern();
                        mPatternViewListener.onPatternCleared();
                    }

            
            {
                this$0 = BaseLockPatternActivity.this;
                super();
            }
                });
                list = builder.create();
                list.setCanceledOnTouchOutside(false);
                list.show();
                return;
            }
        }
        if (mLastPattern == null)
        {
            mLockPatternView.setTag(Integer.valueOf(2));
            mLastPattern = new ArrayList();
            mLastPattern.addAll(list);
            mLockPatternView.sendAccessEvent(R.string.alp_msg_pattern_recorded);
            enableButton(mBtnConfirm);
            enableButton(mBtnRestart);
            mLockPatternView.disableInput();
            return;
        }
        if (encodePattern(mLastPattern).equals(encodePattern(list)))
        {
            mDynamicTxtInfo.setText(R.string.alp_msg_patterns_match);
            enableButton(mBtnConfirm);
            enableButton(mBtnRestart);
            mLockPatternView.disableInput();
            return;
        } else
        {
            disableButton(mBtnConfirm);
            textview.setText("Pattern Mismatch");
            builder.setCustomTitle(textview);
            textview1.setText(R.string.alp_msg_alert_pattern_mismatch);
            builder.setView(textview1).setNeutralButton("Try Again", new android.content.DialogInterface.OnClickListener() {

                final BaseLockPatternActivity this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface.cancel();
                    mLockPatternView.clearPattern();
                    enableButton(mBtnRestart);
                }

            
            {
                this$0 = BaseLockPatternActivity.this;
                super();
            }
            });
            list = builder.create();
            list.setCanceledOnTouchOutside(false);
            list.show();
            mLockPatternView.setDisplayMode(group.pals.android.lib.ui.lockpattern.widget.LockPatternView.DisplayMode.Wrong);
            return;
        }
    }

    private final void enableButton(Button button)
    {
        button.setEnabled(true);
        AlphaAnimation alphaanimation = new AlphaAnimation(0.4F, 1.0F);
        alphaanimation.setDuration(0L);
        alphaanimation.setFillAfter(true);
        button.startAnimation(alphaanimation);
    }

    protected String encodePattern(List list)
    {
        if (mEncrypter == null)
        {
            return LockPatternUtils.patternToSha1(list);
        }
        try
        {
            list = mEncrypter.encrypt(this, LockPatternUtils.patternToSha1(list));
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new InvalidEncrypterException();
        }
        return list;
    }

    protected View getELI_LockImage(View view)
    {
        return view;
    }

    protected View getHeaderContainer(View view)
    {
        return view;
    }

    protected void init()
    {
        CharSequence charsequence;
        CharSequence charsequence1;
        CharSequence charsequence2;
        Boolean boolean1;
        CharSequence charsequence3;
        Boolean boolean2;
        boolean flag;
        Log.d("BaseLockPatternActivity", "BaseLockPatternActivity init() called!!");
        static class _cls7
        {

            static final int $SwitchMap$group$pals$android$lib$ui$lockpattern$BaseLockPatternActivity$LPMode[];

            static 
            {
                $SwitchMap$group$pals$android$lib$ui$lockpattern$BaseLockPatternActivity$LPMode = new int[LPMode.values().length];
                try
                {
                    $SwitchMap$group$pals$android$lib$ui$lockpattern$BaseLockPatternActivity$LPMode[LPMode.CreatePattern.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$group$pals$android$lib$ui$lockpattern$BaseLockPatternActivity$LPMode[LPMode.ComparePattern.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        group.pals.android.lib.ui.lockpattern.widget.LockPatternView.DisplayMode displaymode;
        List list;
        int i;
        if (mTxtInfo != null)
        {
            charsequence = mTxtInfo.getText();
        } else
        {
            charsequence = null;
        }
        if (mDynamicTxtInfo != null)
        {
            charsequence1 = mDynamicTxtInfo.getText();
        } else
        {
            charsequence1 = null;
        }
        if (mBtnConfirm != null)
        {
            charsequence2 = mBtnConfirm.getText();
        } else
        {
            charsequence2 = null;
        }
        if (mBtnConfirm != null)
        {
            boolean1 = Boolean.valueOf(mBtnConfirm.isEnabled());
        } else
        {
            boolean1 = null;
        }
        if (mBtnRestart != null)
        {
            charsequence3 = mBtnRestart.getText();
        } else
        {
            charsequence3 = null;
        }
        if (mBtnRestart != null)
        {
            boolean2 = Boolean.valueOf(mBtnRestart.isEnabled());
        } else
        {
            boolean2 = null;
        }
        if (mLockPatternView != null)
        {
            displaymode = mLockPatternView.getDisplayMode();
        } else
        {
            displaymode = null;
        }
        if (mLockPatternView != null)
        {
            list = mLockPatternView.getPattern();
        } else
        {
            list = null;
        }
        mTxtInfo = (TextView)findViewById(R.id.alp_lpa_text_info);
        mLockPatternView = (LockPatternView)findViewById(R.id.alp_lpa_lockPattern);
        mDynamicTxtInfo = (TextView)findViewById(R.id.alp_lpa_dynamic_text_info);
        mDynamicTxtInfo.sendAccessibilityEvent(16);
        mFooter = findViewById(R.id.alp_lpa_layout_footer);
        mLoginFooter = findViewById(R.id.alp_lpa_layout_login_footer);
        mDividerLine = findViewById(R.id.divider_line);
        mBtnConfirm = (Button)findViewById(R.id.alp_lpa_button_confirm);
        mBtnRestart = (Button)findViewById(R.id.alp_lpa_button_restart);
        mBtnPasswordSignIn = (Button)findViewById(R.id.alp_lpa_button_passwordsignin);
        mBtnPatternHelp = (Button)findViewById(R.id.alp_lpa_button_patternhelp);
        headerContainer = getHeaderContainer(headerContainer);
        ELI_LockImage = getELI_LockImage(ELI_LockImage);
        if (!mBtnConfirm.isEnabled())
        {
            disableButton(mBtnConfirm);
        }
        if (!mBtnRestart.isEnabled())
        {
            disableButton(mBtnRestart);
        }
        mLockPatternView.setTag(Integer.valueOf(1));
        mLockPatternView.setContentDescription(getString(R.string.alp_ELI_pattern_container_info));
        flag = false;
        i = android.provider.Settings.System.getInt(getContentResolver(), "haptic_feedback_enabled", 0);
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L6:
        mLockPatternView.setTactileFeedbackEnabled(flag);
        mLockPatternView.setOnPatternListener(mPatternViewListener);
        if (list != null && displaymode != null)
        {
            mLockPatternView.setPattern(displaymode, list);
        }
        Log.d("BaseLockPatternActivity", (new StringBuilder()).append("info = ").append(charsequence).toString());
        _cls7..SwitchMap.group.pals.android.lib.ui.lockpattern.BaseLockPatternActivity.LPMode[mMode.ordinal()];
        JVM INSTR tableswitch 1 2: default 492
    //                   1 549
    //                   2 716;
           goto _L1 _L2 _L3
_L1:
        setResult(0);
        return;
_L2:
        mLoginFooter.setVisibility(8);
        mDividerLine.setVisibility(8);
        mBtnRestart.setOnClickListener(mBtnResetOnClickListener);
        mFooter.setVisibility(0);
        if (charsequence != null)
        {
            mTxtInfo.setText(charsequence);
        } else
        {
            mTxtInfo.setText(R.string.alp_msg_draw_an_unlock_pattern);
            mDynamicTxtInfo.setText(R.string.alp_msg_draw_an_unlock_pattern_inital_text);
        }
        if (charsequence1 != null)
        {
            mDynamicTxtInfo.setText(charsequence1);
        }
        if (charsequence2 != null)
        {
            mBtnConfirm.setText(charsequence2);
            if (boolean1.booleanValue())
            {
                enableButton(mBtnConfirm);
            } else
            {
                disableButton(mBtnConfirm);
            }
        }
        if (charsequence3 != null)
        {
            mBtnRestart.setText(charsequence3);
            if (boolean2.booleanValue())
            {
                enableButton(mBtnRestart);
            } else
            {
                disableButton(mBtnRestart);
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        mFooter.setVisibility(8);
        if (charsequence != null)
        {
            mTxtInfo.setText(charsequence);
            mDynamicTxtInfo.setText((new StringBuilder()).append(getString(R.string.alp_msg_draw_pattern_to_unlock)).append(' ').append(userName).toString());
            mDynamicTxtInfo.setContentDescription(charsequence1);
        } else
        {
            mTxtInfo.setText(R.string.alp_ELI_compare_title);
            mDynamicTxtInfo.setText((new StringBuilder()).append(getString(R.string.alp_msg_draw_pattern_to_unlock)).append(' ').append(userName).toString());
            mDynamicTxtInfo.setContentDescription(charsequence1);
        }
        if (true) goto _L1; else goto _L4
_L4:
        Throwable throwable;
        throwable;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void initConfirmPattern()
    {
        mLockPatternView.clearPattern();
        mTxtInfo.setText(R.string.alp_msg_confirm_pattern);
        mDynamicTxtInfo.setText(R.string.alp_msg_redraw_pattern_to_confirm);
        mBtnConfirm.setText(R.string.alp_cmd_save);
        disableButton(mBtnConfirm);
        disableButton(mBtnRestart);
        mLockPatternView.enableInput();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        Log.d(_ClassName, "onConfigurationChanged()");
        super.onConfigurationChanged(configuration);
        init();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mPrefs = getSharedPreferences(group/pals/android/lib/ui/lockpattern/BaseLockPatternActivity.getName(), 0);
        String s = getIntent().getStringExtra("lockpattern_mode");
        bundle = s;
        if (s == null)
        {
            bundle = LPMode.CreatePattern.toString();
        }
        if (bundle.equals(LPMode.CreatePattern.toString()))
        {
            mMode = LPMode.CreatePattern;
        } else
        {
            mMode = LPMode.ComparePattern;
        }
        mAutoSave = getIntent().getBooleanExtra(_AutoSave, false);
        if (!mAutoSave)
        {
            mPrefs.edit().clear().commit();
        }
        bundle = (Class)getIntent().getSerializableExtra(_EncrypterClass);
        if (bundle != null)
        {
            try
            {
                mEncrypter = (IEncrypter)bundle.newInstance();
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new InvalidEncrypterException();
            }
        }
        errorPattern = getIntent().getStringExtra("pattern");
        errorCode = getIntent().getStringExtra("errorcode");
        userName = getIntent().getStringExtra("userName");
        errorMessage = getIntent().getStringExtra("errorMessage");
        Log.d("BaseLockPatternActivity", (new StringBuilder()).append("errorCode = ").append(errorCode).toString());
        Log.d("BaseLockPatternActivity", (new StringBuilder()).append("BaseLockPatternActivity ErrorMessage = ").append(errorMessage).toString());
    }








}
