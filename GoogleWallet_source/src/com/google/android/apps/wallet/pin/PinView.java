// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Handler;
import android.support.v4.widget.DrawerLayout;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.util.accessibility.AccessibilityUtil;
import com.google.android.apps.wallet.util.view.Views;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            UserPin

public class PinView extends RelativeLayout
{
    final class PinButtonClickListener
        implements android.view.View.OnClickListener, android.view.View.OnHoverListener, android.view.View.OnTouchListener
    {

        final PinView this$0;

        private static void simulateClickForAccessibility(View view)
        {
            if (view.isPressed())
            {
                return;
            } else
            {
                view.setPressed(true);
                view.performClick();
                view.setPressed(false);
                return;
            }
        }

        public final void onClick(View view)
        {
            view.performHapticFeedback(3);
            if (view.getId() != com.google.android.apps.walletnfcrel.R.id.PinCancel)
            {
                if (view.getId() == com.google.android.apps.walletnfcrel.R.id.PinBack)
                {
                    if (pinBuilder.length() > 0)
                    {
                        pinBuilder.pop();
                        pinFields[pinBuilder.length()].setVisibility(4);
                    }
                } else
                if (pinBuilder.length() < 4)
                {
                    pinFields[pinBuilder.length()].setVisibility(0);
                    pinBuilder.push(Integer.toString(PinView.getButtonValue(view)));
                    if (pinBuilder.length() == 4)
                    {
                        view = pinBuilder.build();
                        handler.post(view. new Runnable() {

                            final PinButtonClickListener this$1;
                            final UserPin val$userPin;

                            public final void run()
                            {
                                dispatchPinEnteredEvent(userPin);
                                userPin.shred();
                                return;
                                Exception exception;
                                exception;
                                userPin.shred();
                                throw exception;
                            }

            
            {
                this$1 = final_pinbuttonclicklistener;
                userPin = UserPin.this;
                super();
            }
                        });
                        pinBuilder.clear();
                        return;
                    }
                }
            }
        }

        public final boolean onHover(View view, MotionEvent motionevent)
        {
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())
            {
                int i;
                switch (motionevent.getActionMasked())
                {
                default:
                    return false;

                case 10: // '\n'
                    i = view.getPaddingLeft();
                    break;
                }
                int j = view.getWidth();
                int k = view.getPaddingRight();
                int l = view.getPaddingTop();
                int i1 = view.getHeight();
                int j1 = view.getPaddingBottom();
                int k1 = (int)motionevent.getX();
                int l1 = (int)motionevent.getY();
                if (k1 > i && k1 < j - k && l1 > l && l1 < i1 - j1)
                {
                    simulateClickForAccessibility(view);
                    return false;
                }
            }
            return false;
        }

        public final boolean onTouch(View view, MotionEvent motionevent)
        {
            if (motionevent.getAction() == 0)
            {
                view.setPressed(true);
                return true;
            } else
            {
                return false;
            }
        }

        private PinButtonClickListener()
        {
            this$0 = PinView.this;
            super();
        }

    }


    private final AccessibilityManager accessibilityManager;
    private final AccessibilityUtil accessibilityUtil;
    private final ImageButton backspaceButton;
    private final int buttonFadeDuration = getResources().getInteger(0x10e0000);
    private final Button digitButtons[] = new Button[10];
    private final TextView forgotPinLink;
    private final Handler handler = new Handler();
    private final ImageButton infoButton;
    private final ImageButton menuButton;
    private boolean networkAvailable;
    private final UserPin.Builder pinBuilder = new UserPin.Builder(4);
    private OnActionListener pinEnteredListener;
    private final View pinEntrySection;
    private final View pinFields[];
    private final int pinPadFadeDuration = getResources().getInteger(0x10e0001);
    private final TextView pinViewTitle;
    private final TextView problemMessage;
    private final View progressSpinnerView;
    private boolean showForgotPin;
    private final TextView userEmail;
    private boolean waiting;
    private boolean wasWaiting;

    public PinView(Context context, String s, AccessibilityUtil accessibilityutil, AccessibilityManager accessibilitymanager)
    {
        super(context);
        showForgotPin = false;
        networkAvailable = true;
        waiting = false;
        wasWaiting = false;
        accessibilityUtil = accessibilityutil;
        accessibilityManager = accessibilitymanager;
        LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.pin_view, this);
        userEmail = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.UserEmail);
        userEmail.setText(s);
        ((ImageView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Logo)).setImageDrawable(getResources().getDrawable(com.google.android.apps.walletnfcrel.R.drawable.img_logo_wallet_color_88dp));
        pinViewTitle = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Title);
        forgotPinLink = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ForgotPinLink);
        problemMessage = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ProblemMessage);
        pinEntrySection = findViewById(com.google.android.apps.walletnfcrel.R.id.PinEntrySection);
        progressSpinnerView = findViewById(com.google.android.apps.walletnfcrel.R.id.WaitingView);
        menuButton = (ImageButton)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.MenuButton);
        menuButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PinView this$0;

            public final void onClick(View view)
            {
                view = (DrawerLayout)Views.findViewById(getRootView(), com.google.android.apps.walletnfcrel.R.id.RootDrawerLayout);
                if (view.isDrawerOpen(3))
                {
                    view.closeDrawer(3);
                    return;
                } else
                {
                    view.openDrawer(3);
                    return;
                }
            }

            
            {
                this$0 = PinView.this;
                super();
            }
        });
        infoButton = (ImageButton)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.InfoButton);
        infoButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PinView this$0;

            public final void onClick(View view)
            {
                view = HelpUrls.createPinHelpUrl();
                getContext().startActivity(UriIntents.create(getContext(), view));
            }

            
            {
                this$0 = PinView.this;
                super();
            }
        });
        context = new PinButtonClickListener();
        digitButtons[0] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Pin0), context);
        digitButtons[1] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Pin1), context);
        digitButtons[2] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Pin2), context);
        digitButtons[3] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Pin3), context);
        digitButtons[4] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Pin4), context);
        digitButtons[5] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Pin5), context);
        digitButtons[6] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Pin6), context);
        digitButtons[7] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Pin7), context);
        digitButtons[8] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Pin8), context);
        digitButtons[9] = (Button)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.Pin9), context);
        backspaceButton = (ImageButton)setupButton(findViewById(com.google.android.apps.walletnfcrel.R.id.PinBack), context);
        findViewById(com.google.android.apps.walletnfcrel.R.id.PinCancel).setVisibility(4);
        pinFields = (new View[] {
            findViewById(com.google.android.apps.walletnfcrel.R.id.PinField1), findViewById(com.google.android.apps.walletnfcrel.R.id.PinField2), findViewById(com.google.android.apps.walletnfcrel.R.id.PinField3), findViewById(com.google.android.apps.walletnfcrel.R.id.PinField4)
        });
        updateDisplay(true);
    }

    private void animateWaiting()
    {
        float f1 = 1.0F;
        if (wasWaiting == waiting)
        {
            return;
        }
        float f;
        ViewPropertyAnimator viewpropertyanimator;
        final byte pinEntryVisibility;
        final int progressVisibility;
        if (waiting)
        {
            pinEntryVisibility = 4;
        } else
        {
            pinEntryVisibility = 0;
        }
        if (waiting)
        {
            progressVisibility = 0;
        } else
        {
            progressVisibility = 4;
        }
        viewpropertyanimator = pinEntrySection.animate();
        if (pinEntryVisibility == 0)
        {
            f = 1.0F;
        } else
        {
            f = 0.0F;
        }
        viewpropertyanimator.alpha(f).setDuration(pinPadFadeDuration).setListener(new AnimatorListenerAdapter() {

            final PinView this$0;
            final int val$pinEntryVisibility;

            public final void onAnimationEnd(Animator animator)
            {
                if (pinEntryVisibility == 4)
                {
                    pinEntrySection.setVisibility(4);
                }
            }

            public final void onAnimationStart(Animator animator)
            {
                if (pinEntryVisibility == 0)
                {
                    pinEntrySection.setAlpha(0.0F);
                    pinEntrySection.setVisibility(0);
                }
            }

            
            {
                this$0 = PinView.this;
                pinEntryVisibility = i;
                super();
            }
        }).start();
        viewpropertyanimator = progressSpinnerView.animate();
        if (progressVisibility == 0)
        {
            f = f1;
        } else
        {
            f = 0.0F;
        }
        viewpropertyanimator.alpha(f).setDuration(pinPadFadeDuration).setListener(new AnimatorListenerAdapter() {

            final PinView this$0;
            final int val$progressVisibility;

            public final void onAnimationEnd(Animator animator)
            {
                if (progressVisibility == 4)
                {
                    progressSpinnerView.setVisibility(4);
                }
            }

            public final void onAnimationStart(Animator animator)
            {
                if (progressVisibility == 0)
                {
                    progressSpinnerView.setAlpha(0.0F);
                    progressSpinnerView.setVisibility(0);
                }
            }

            
            {
                this$0 = PinView.this;
                progressVisibility = i;
                super();
            }
        }).start();
        wasWaiting = waiting;
    }

    private void clearPin()
    {
        pinBuilder.clear();
        pinFields[0].setVisibility(4);
        pinFields[1].setVisibility(4);
        pinFields[2].setVisibility(4);
        pinFields[3].setVisibility(4);
    }

    private void dispatchPinEnteredEvent(UserPin userpin)
    {
        pinEnteredListener.onAction(userpin);
    }

    private static int getButtonValue(View view)
    {
        int i = view.getId();
        if (i == com.google.android.apps.walletnfcrel.R.id.Pin1)
        {
            return 1;
        }
        if (i == com.google.android.apps.walletnfcrel.R.id.Pin2)
        {
            return 2;
        }
        if (i == com.google.android.apps.walletnfcrel.R.id.Pin3)
        {
            return 3;
        }
        if (i == com.google.android.apps.walletnfcrel.R.id.Pin4)
        {
            return 4;
        }
        if (i == com.google.android.apps.walletnfcrel.R.id.Pin5)
        {
            return 5;
        }
        if (i == com.google.android.apps.walletnfcrel.R.id.Pin6)
        {
            return 6;
        }
        if (i == com.google.android.apps.walletnfcrel.R.id.Pin7)
        {
            return 7;
        }
        if (i == com.google.android.apps.walletnfcrel.R.id.Pin8)
        {
            return 8;
        }
        if (i == com.google.android.apps.walletnfcrel.R.id.Pin9)
        {
            return 9;
        }
        if (i == com.google.android.apps.walletnfcrel.R.id.Pin0)
        {
            return 0;
        } else
        {
            throw new IllegalArgumentException("unexpected View parameter");
        }
    }

    private boolean hasPrivateAudio()
    {
        AudioManager audiomanager = (AudioManager)getContext().getSystemService("audio");
        return audiomanager.isWiredHeadsetOn() || audiomanager.isBluetoothA2dpOn();
    }

    private void setInfoButtonEnabled(boolean flag)
    {
        infoButton.setClickable(flag);
        float f;
        if (flag)
        {
            f = 1.0F;
        } else
        {
            f = 0.5F;
        }
        infoButton.animate().alpha(f).setDuration(buttonFadeDuration).start();
    }

    private void setPinButtonEnabled(View view, boolean flag)
    {
        view.setClickable(flag);
        view.setEnabled(flag);
        float f;
        if (flag)
        {
            f = 1.0F;
        } else
        {
            f = 0.5F;
        }
        view.animate().alpha(f).setDuration(buttonFadeDuration).start();
    }

    private void setPinButtonsEnabled(boolean flag)
    {
        for (int i = 0; i < digitButtons.length; i++)
        {
            setPinButtonEnabled(digitButtons[i], flag);
        }

        setPinButtonEnabled(backspaceButton, flag);
    }

    private void setPinFieldsEnabled(boolean flag)
    {
        float f;
        if (flag)
        {
            f = 1.0F;
        } else
        {
            f = 0.5F;
        }
        findViewById(com.google.android.apps.walletnfcrel.R.id.PinField1).animate().alpha(f).setDuration(buttonFadeDuration).start();
        findViewById(com.google.android.apps.walletnfcrel.R.id.PinField2).animate().alpha(f).setDuration(buttonFadeDuration).start();
        findViewById(com.google.android.apps.walletnfcrel.R.id.PinField3).animate().alpha(f).setDuration(buttonFadeDuration).start();
        findViewById(com.google.android.apps.walletnfcrel.R.id.PinField4).animate().alpha(f).setDuration(buttonFadeDuration).start();
    }

    private static View setupButton(View view, PinButtonClickListener pinbuttonclicklistener)
    {
        view.setOnClickListener(pinbuttonclicklistener);
        view.setOnTouchListener(pinbuttonclicklistener);
        view.setOnHoverListener(pinbuttonclicklistener);
        return view;
    }

    public final void announceTitleText()
    {
        accessibilityUtil.announce(this, pinViewTitle.getText());
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        i;
        JVM INSTR lookupswitch 11: default 100
    //                   7: 165
    //                   8: 107
    //                   9: 121
    //                   10: 126
    //                   11: 131
    //                   12: 136
    //                   13: 141
    //                   14: 147
    //                   15: 153
    //                   16: 159
    //                   67: 170;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        return super.onKeyUp(i, keyevent);
_L3:
        i = 1;
_L13:
        digitButtons[i].performClick();
        return true;
_L4:
        i = 2;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 3;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 4;
        continue; /* Loop/switch isn't completed */
_L7:
        i = 5;
        continue; /* Loop/switch isn't completed */
_L8:
        i = 6;
        continue; /* Loop/switch isn't completed */
_L9:
        i = 7;
        continue; /* Loop/switch isn't completed */
_L10:
        i = 8;
        continue; /* Loop/switch isn't completed */
_L11:
        i = 9;
        continue; /* Loop/switch isn't completed */
_L2:
        i = 0;
        if (true) goto _L13; else goto _L12
_L12:
        backspaceButton.performClick();
        return true;
    }

    public void setForgotPinOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        Views.setLinkOnClickListener(forgotPinLink, onclicklistener);
    }

    public void setNetworkAvailable(boolean flag)
    {
        networkAvailable = flag;
    }

    public void setPinEnteredListener(OnActionListener onactionlistener)
    {
        pinEnteredListener = onactionlistener;
    }

    public void setPinViewTitle(int i)
    {
        pinViewTitle.setText(i);
    }

    public void setShowForgotPin(boolean flag)
    {
        showForgotPin = flag;
    }

    public void setWaiting(boolean flag)
    {
        waiting = flag;
    }

    public final void updateDisplay(boolean flag)
    {
        byte byte2 = 4;
        byte byte0 = 4;
        byte byte1 = 4;
        boolean flag2 = true;
        if (flag)
        {
            clearPin();
        }
        boolean flag1;
        if (!networkAvailable)
        {
            problemMessage.setText(com.google.android.apps.walletnfcrel.R.string.pin_network_unavailable);
            byte1 = 0;
            flag = false;
        } else
        if (showForgotPin)
        {
            byte0 = 0;
            flag = flag2;
        } else
        {
            byte2 = 0;
            flag = flag2;
        }
        if (byte1 == 0 && problemMessage.getVisibility() != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        animateWaiting();
        problemMessage.setVisibility(byte1);
        forgotPinLink.setVisibility(byte0);
        userEmail.setVisibility(byte2);
        setPinButtonsEnabled(flag);
        setPinFieldsEnabled(flag);
        setInfoButtonEnabled(flag);
        if (flag1)
        {
            accessibilityUtil.announce(problemMessage, problemMessage.getText());
        }
        if (android.provider.Settings.Secure.getInt(getContext().getContentResolver(), "speak_password", 0) != 0)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        if (byte0 != 0 || hasPrivateAudio())
        {
            digitButtons[0].setContentDescription(getResources().getString(com.google.android.apps.walletnfcrel.R.string.pin_button_numeral0));
            digitButtons[1].setContentDescription(getResources().getString(com.google.android.apps.walletnfcrel.R.string.pin_button_numeral1));
            digitButtons[2].setContentDescription(getResources().getString(com.google.android.apps.walletnfcrel.R.string.pin_button_numeral2));
            digitButtons[3].setContentDescription(getResources().getString(com.google.android.apps.walletnfcrel.R.string.pin_button_numeral3));
            digitButtons[4].setContentDescription(getResources().getString(com.google.android.apps.walletnfcrel.R.string.pin_button_numeral4));
            digitButtons[5].setContentDescription(getResources().getString(com.google.android.apps.walletnfcrel.R.string.pin_button_numeral5));
            digitButtons[6].setContentDescription(getResources().getString(com.google.android.apps.walletnfcrel.R.string.pin_button_numeral6));
            digitButtons[7].setContentDescription(getResources().getString(com.google.android.apps.walletnfcrel.R.string.pin_button_numeral7));
            digitButtons[8].setContentDescription(getResources().getString(com.google.android.apps.walletnfcrel.R.string.pin_button_numeral8));
            digitButtons[9].setContentDescription(getResources().getString(com.google.android.apps.walletnfcrel.R.string.pin_button_numeral9));
        } else
        {
            int i = 0;
            while (i < digitButtons.length) 
            {
                digitButtons[i].setContentDescription(getResources().getString(com.google.android.apps.walletnfcrel.R.string.pin_button_contentDescription));
                i++;
            }
        }
    }








}
