// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.k;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Toast;
import com.skype.android.audio.AudioRoute;
import com.skype.android.calling.CameraFacing;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.MenuImageButton;
import com.skype.android.widget.OnItemSelectionChanged;
import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package com.skype.android.app.calling:
//            d

public class CallControlsView extends FrameLayout
    implements android.support.v7.internal.view.menu.f.a, android.view.View.OnClickListener
{
    public class AnchorItem
        implements OnItemSelectionChanged
    {

        private MenuImageButton menuImgButton;
        final CallControlsView this$0;

        private void attachListeners()
        {
            menuImgButton.b(this);
            menuImgButton.a(this);
        }

        public void onSelected(boolean flag)
        {
            if (flag)
            {
                settings.onControlsClicked(false);
                return;
            } else
            {
                settings.onControlsClicked(true);
                return;
            }
        }

        private AnchorItem(MenuImageButton menuimagebutton)
        {
            this$0 = CallControlsView.this;
            super();
            menuImgButton = menuimagebutton;
            attachListeners();
        }

    }


    private AccessibilityUtil accessibility;
    private ImageButton addToCallButton;
    private View addToCallButtonGap;
    private AudioManager audioManager;
    private MenuImageButton audioRouteButton;
    private View audioRouteButtonGap;
    private Context context;
    private ViewGroup controlButtonsContainer;
    private ViewGroup controlButtonsLayout;
    private View dialPadButtonGap;
    private ImageButton dialpadButton;
    private ImageButton endCallButton;
    private f menuBuilder;
    private ImageButton muteButton;
    private k popupMenuCompat;
    private d settings;
    private ImageButton videoButton;

    public CallControlsView(Context context1)
    {
        super(context1);
        context = context1;
        initView();
    }

    public CallControlsView(Context context1, AttributeSet attributeset)
    {
        super(context1, attributeset);
        context = context1;
        initView();
    }

    private void addAnchorItemSelectedListener()
    {
        if (audioRouteButton != null)
        {
            new AnchorItem(audioRouteButton);
        }
    }

    private boolean callHasLimitedOptions()
    {
        return settings.isSkypeOutCall();
    }

    private EnumSet getUseableAudioRoutes()
    {
        EnumSet enumset = AudioRoute.e(audioManager);
        if (hasOutgoingVideo() || enumset.contains(AudioRoute.d) || enumset.contains(AudioRoute.e) || enumset.contains(AudioRoute.b))
        {
            enumset.remove(AudioRoute.a);
        }
        if (hasOutgoingVideo())
        {
            enumset.add(AudioRoute.a);
        }
        return enumset;
    }

    private boolean hasOutgoingVideo()
    {
        return settings != null && settings.getCameraFacing() != CameraFacing.c;
    }

    private void onCameraFacingChanged(CameraFacing camerafacing)
    {
        if (camerafacing == null) goto _L2; else goto _L1
_L1:
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$android$audio$AudioRoute[];
            static final int $SwitchMap$com$skype$android$calling$CameraFacing[];

            static 
            {
                $SwitchMap$com$skype$android$calling$CameraFacing = new int[CameraFacing.values().length];
                try
                {
                    $SwitchMap$com$skype$android$calling$CameraFacing[CameraFacing.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$android$calling$CameraFacing[CameraFacing.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$android$calling$CameraFacing[CameraFacing.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                $SwitchMap$com$skype$android$audio$AudioRoute = new int[AudioRoute.values().length];
                try
                {
                    $SwitchMap$com$skype$android$audio$AudioRoute[AudioRoute.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$audio$AudioRoute[AudioRoute.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$audio$AudioRoute[AudioRoute.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$audio$AudioRoute[AudioRoute.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$audio$AudioRoute[AudioRoute.a.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.skype.android.calling.CameraFacing[camerafacing.ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 41
    //                   2 51
    //                   3 61;
           goto _L2 _L3 _L4 _L5
_L2:
        return;
_L3:
        videoButton.setImageResource(0x7f02023a);
        return;
_L4:
        videoButton.setImageResource(0x7f02023b);
        return;
_L5:
        videoButton.setImageResource(0x7f02023b);
        return;
    }

    private void setAudioRoute(AudioRoute audioroute)
    {
        settings.setAudioRoute(audioroute);
        updateAudioRouteButtonImage(audioroute);
    }

    private void setupAudioCallControls()
    {
        videoButton.setImageResource(0x7f02023a);
    }

    private void setupVideoCallControls()
    {
        if (settings.isDialpadShowing())
        {
            showDialpad(false);
        }
    }

    private boolean shouldShowMenuItem(int i)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        i;
        JVM INSTR tableswitch 2131756460 2131756462: default 32
    //                   2131756460 36
    //                   2131756461 32
    //                   2131756462 34;
           goto _L1 _L2 _L1 _L3
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        flag = true;
_L5:
        return flag;
_L2:
        flag = flag1;
        if (!callHasLimitedOptions())
        {
            flag = flag1;
            if (settings.isAudioCall())
            {
                return true;
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void showMenu(View view, int i)
    {
        AppCompatActivity appcompatactivity = (AppCompatActivity)getContext();
        menuBuilder.clear();
        appcompatactivity.getMenuInflater().inflate(i, menuBuilder);
        if (view.getId() != videoButton.getId()) goto _L2; else goto _L1
_L1:
        MenuItem menuitem = menuBuilder.findItem(0x7f1005ab);
        if (menuitem != null && settings.getCameraFacing() == CameraFacing.c)
        {
            menuitem.setTitle(0x7f08019d);
        }
_L4:
        popupMenuCompat.h();
        popupMenuCompat.a(view);
        popupMenuCompat.e();
        popupMenuCompat.a(new android.support.v7.internal.view.menu.l.a() {

            final CallControlsView this$0;

            public final void onCloseMenu(f f1, boolean flag1)
            {
                refreshCallControls();
            }

            public final boolean onOpenSubMenu(f f1)
            {
                return false;
            }

            
            {
                this$0 = CallControlsView.this;
                super();
            }
        });
        return;
_L2:
        if (audioRouteButton != null && view.getId() == audioRouteButton.getId())
        {
            EnumSet enumset = getUseableAudioRoutes();
            boolean flag;
            if (enumset.contains(AudioRoute.d) || enumset.contains(AudioRoute.e))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            menuBuilder.findItem(0x7f1005a7).setVisible(enumset.contains(AudioRoute.b));
            menuBuilder.findItem(0x7f1005a8).setVisible(enumset.contains(AudioRoute.a));
            menuBuilder.findItem(0x7f1005a9).setVisible(enumset.contains(AudioRoute.c));
            menuBuilder.findItem(0x7f1005a6).setVisible(flag);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void updateDialpadAndMoreButtonStates(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0x7f0200a9;
        } else
        {
            i = 0x7f0200bb;
        }
        if (dialpadButton.getVisibility() == 0)
        {
            dialpadButton.setBackgroundResource(i);
            ImageButton imagebutton = dialpadButton;
            if (flag)
            {
                i = 0x7f0200ca;
            } else
            {
                i = 0x7f020154;
            }
            imagebutton.setImageResource(i);
        }
    }

    public boolean canHideControls()
    {
        return !settings.isDialpadShowing();
    }

    public boolean canToggleCameraDirection()
    {
        return settings.getPossibleCameraFacing().size() > 2 && settings.getCameraFacing() != CameraFacing.c;
    }

    public void enableFingerScanningMode()
    {
        if (controlButtonsContainer != null && controlButtonsLayout != null && endCallButton != null)
        {
            controlButtonsContainer.post(accessibility.a(controlButtonsContainer, endCallButton, 12));
            accessibility.a(controlButtonsContainer);
        }
        if (controlButtonsLayout != null)
        {
            controlButtonsLayout.post(accessibility.a(controlButtonsLayout, true));
            accessibility.a(controlButtonsLayout);
        }
    }

    public Rect getRect()
    {
        if (controlButtonsContainer != null)
        {
            return new Rect(controlButtonsContainer.getLeft(), getBottom() - controlButtonsContainer.getHeight(), controlButtonsContainer.getRight(), getBottom());
        } else
        {
            return null;
        }
    }

    public void initView()
    {
        removeAllViews();
        accessibility = new AccessibilityUtil(getContext());
        audioManager = (AudioManager)getContext().getSystemService("audio");
        LayoutInflater.from(getContext()).inflate(0x7f03002a, this);
        videoButton = (ImageButton)ViewUtil.a(this, 0x7f100244);
        muteButton = (ImageButton)ViewUtil.a(this, 0x7f100245);
        audioRouteButton = (MenuImageButton)ViewUtil.a(this, 0x7f100247);
        audioRouteButtonGap = ViewUtil.a(this, 0x7f10024c);
        addToCallButton = (ImageButton)ViewUtil.a(this, 0x7f100246);
        addToCallButtonGap = ViewUtil.a(this, 0x7f10024b);
        dialpadButton = (ImageButton)ViewUtil.a(this, 0x7f100248);
        dialPadButtonGap = ViewUtil.a(this, 0x7f10024d);
        endCallButton = (ImageButton)ViewUtil.a(this, 0x7f100249);
        controlButtonsContainer = (ViewGroup)ViewUtil.a(this, 0x7f100242);
        controlButtonsLayout = (ViewGroup)ViewUtil.a(this, 0x7f100243);
        ViewUtil.a(this, new View[] {
            videoButton, muteButton, audioRouteButton, endCallButton, dialpadButton, addToCallButton
        });
        addAnchorItemSelectedListener();
        menuBuilder = new f(getContext());
        popupMenuCompat = new k(getContext(), menuBuilder);
        menuBuilder.a(this);
        setMeasureAllChildren(false);
    }

    public void onClick(View view)
    {
        boolean flag;
        boolean flag2;
        flag2 = true;
        flag = true;
        if (settings == null) goto _L2; else goto _L1
_L1:
        int i;
        settings.onControlsClicked(true);
        i = view.getId();
        if (i != videoButton.getId()) goto _L4; else goto _L3
_L3:
        view = settings.getPossibleCameraFacing();
        if (view.size() == 0 || view.contains(CameraFacing.c) && view.size() == 1)
        {
            videoButton.setEnabled(false);
        } else
        if (settings.getCameraFacing() == CameraFacing.c)
        {
            view = (CameraFacing)view.iterator().next();
            settings.setCameraFacing(view);
        } else
        {
            settings.setCameraFacing(CameraFacing.c);
        }
_L6:
        refreshCallControls();
_L2:
        return;
_L4:
        if (i == muteButton.getId())
        {
            flag2 = settings.isMicrophoneMuted();
            view = settings;
            if (flag2)
            {
                flag = false;
            }
            view.setMicrophoneMuted(flag);
            if (accessibility.a())
            {
                view = getContext();
                if (!flag2)
                {
                    i = 0x7f080063;
                } else
                {
                    i = 0x7f080064;
                }
                Toast.makeText(view, i, 0).show();
            }
        } else
        if (audioRouteButton != null && i == audioRouteButton.getId())
        {
            view = getUseableAudioRoutes();
            i = view.size();
            if (i == 2)
            {
                view.remove(settings.getAudioRoute());
                view = view.iterator();
                if (view.hasNext())
                {
                    view = (AudioRoute)view.next();
                } else
                {
                    view = AudioRoute.a;
                }
                setAudioRoute(view);
            } else
            if (i > 2)
            {
                showMenu(audioRouteButton, 0x7f110004);
            }
        } else
        if (i == dialpadButton.getId())
        {
            boolean flag1;
            if (!settings.isDialpadShowing())
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            showDialpad(flag1);
        } else
        if (i == endCallButton.getId())
        {
            settings.endCall();
        } else
        if (i == addToCallButton.getId())
        {
            settings.addParticipantsToCall();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onMenuItemSelected(f f1, MenuItem menuitem)
    {
        boolean flag = true;
        switch (menuitem.getItemId())
        {
        case 2131756458: 
        default:
            flag = false;
            // fall through

        case 2131756462: 
            return flag;

        case 2131756459: 
            if (settings.getCameraFacing() == CameraFacing.c)
            {
                f1 = (CameraFacing)settings.getPossibleCameraFacing().iterator().next();
                settings.setCameraFacing(f1);
            } else
            {
                settings.setCameraFacing(CameraFacing.c);
            }
            refreshCallControls();
            return true;

        case 2131756457: 
            setAudioRoute(AudioRoute.c);
            return true;

        case 2131756455: 
            setAudioRoute(AudioRoute.b);
            return true;

        case 2131756454: 
            if (AudioRoute.d.c(audioManager).booleanValue())
            {
                f1 = AudioRoute.d;
            } else
            {
                f1 = AudioRoute.e;
            }
            setAudioRoute(f1);
            return true;

        case 2131756456: 
            setAudioRoute(AudioRoute.a);
            return true;

        case 2131756460: 
            showDialpad(true);
            return true;

        case 2131756461: 
            settings.showChat();
            return true;
        }
    }

    public void onMenuModeChange(f f1)
    {
    }

    public void refreshCallControls()
    {
        if (settings != null)
        {
            if (callHasLimitedOptions())
            {
                videoButton.setVisibility(8);
                dialpadButton.setVisibility(0);
                if (dialPadButtonGap != null)
                {
                    dialPadButtonGap.setVisibility(0);
                }
            }
            boolean flag;
            if (addToCallButton != null)
            {
                Object obj;
                int i;
                boolean flag1;
                if (settings.canAddParticipants())
                {
                    i = 0;
                } else
                {
                    i = 8;
                }
                addToCallButton.setVisibility(i);
                if (addToCallButtonGap != null)
                {
                    addToCallButtonGap.setVisibility(i);
                }
            }
            if (settings.hasUnconsumedMessages())
            {
                popupMenuCompat.i();
            }
            if (settings.isAudioCall())
            {
                setupAudioCallControls();
            } else
            {
                setupVideoCallControls();
            }
            if (settings.getPossibleCameraFacing().isEmpty())
            {
                videoButton.setVisibility(8);
            } else
            {
                videoButton.setVisibility(0);
                onCameraFacingChanged(settings.getCameraFacing());
            }
            if (settings.getCameraFacing() == CameraFacing.c)
            {
                videoButton.setContentDescription(context.getString(0x7f0800e6));
            } else
            {
                videoButton.setContentDescription(context.getString(0x7f0800ee));
            }
            if (settings.isMicrophoneMuted())
            {
                muteButton.setImageResource(0x7f0200d4);
                muteButton.setContentDescription(context.getString(0x7f0800e9));
            } else
            {
                muteButton.setImageResource(0x7f0200d3);
                muteButton.setContentDescription(context.getString(0x7f0800a2));
            }
            updateDialpadAndMoreButtonStates(settings.isDialpadShowing());
            flag1 = settings.isCallOnHold();
            if (audioRouteButton != null)
            {
                obj = audioRouteButton;
                if (!flag1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((MenuImageButton) (obj)).setEnabled(flag);
            }
            obj = muteButton;
            if (!flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((ImageButton) (obj)).setEnabled(flag);
            if (!settings.isCallOnHold() && !settings.isPreCall())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            videoButton.setEnabled(flag);
            addToCallButton.setEnabled(flag);
            dialpadButton.setEnabled(flag);
            videoButton.setClickable(flag);
            dialpadButton.setClickable(flag);
            updateAudioRouteButtonImage(settings.getAudioRoute());
            bringToFront();
        }
    }

    public void removeAllViews()
    {
        super.removeAllViews();
        if (popupMenuCompat != null && popupMenuCompat.i())
        {
            popupMenuCompat.h();
        }
    }

    public void setSettings(d d1)
    {
        settings = d1;
        refreshCallControls();
    }

    public void showDialpad(boolean flag)
    {
        settings.showDialpad(flag);
        updateDialpadAndMoreButtonStates(flag);
    }

    public void toggleCameraDirection()
    {
        if (canToggleCameraDirection())
        {
            if (settings.getCameraFacing() == CameraFacing.b)
            {
                settings.setCameraFacing(CameraFacing.a);
            } else
            if (settings.getCameraFacing() == CameraFacing.a)
            {
                settings.setCameraFacing(CameraFacing.b);
                return;
            }
        }
    }

    public void updateAudioRouteButtonImage(AudioRoute audioroute)
    {
        if (audioRouteButton != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        EnumSet enumset = getUseableAudioRoutes();
        i = 0;
        if (enumset.size() < 2)
        {
            i = 8;
        }
        audioRouteButton.setVisibility(i);
        if (audioRouteButtonGap != null)
        {
            audioRouteButtonGap.setVisibility(i);
        }
        if (i == 8) goto _L1; else goto _L3
_L3:
        AudioRoute audioroute1;
        audioroute1 = audioroute;
        if (audioroute == null)
        {
            audioroute1 = AudioRoute.a;
        }
        _cls2..SwitchMap.com.skype.android.audio.AudioRoute[audioroute1.ordinal()];
        JVM INSTR tableswitch 1 4: default 104
    //                   1 117
    //                   2 124
    //                   3 131
    //                   4 131;
           goto _L4 _L5 _L6 _L7 _L7
_L4:
        i = 0x7f020158;
_L9:
        audioRouteButton.setImageResource(i);
        return;
_L5:
        i = 0x7f020082;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0x7f02020b;
        continue; /* Loop/switch isn't completed */
_L7:
        i = 0x7f020177;
        if (true) goto _L9; else goto _L8
_L8:
    }

}
