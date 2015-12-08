// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.content.j;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.internal.LikeActionController;
import com.facebook.internal.LikeBoxCountView;
import com.facebook.internal.LikeButton;
import com.facebook.internal.Utility;

public class LikeView extends FrameLayout
{
    public static final class AuxiliaryViewPosition extends Enum
    {

        private static final AuxiliaryViewPosition $VALUES[];
        public static final AuxiliaryViewPosition BOTTOM;
        static AuxiliaryViewPosition DEFAULT;
        public static final AuxiliaryViewPosition INLINE;
        public static final AuxiliaryViewPosition TOP;
        private int intValue;
        private String stringValue;

        static AuxiliaryViewPosition fromInt(int i)
        {
            AuxiliaryViewPosition aauxiliaryviewposition[] = values();
            int l = aauxiliaryviewposition.length;
            for (int k = 0; k < l; k++)
            {
                AuxiliaryViewPosition auxiliaryviewposition = aauxiliaryviewposition[k];
                if (auxiliaryviewposition.getValue() == i)
                {
                    return auxiliaryviewposition;
                }
            }

            return null;
        }

        private int getValue()
        {
            return intValue;
        }

        public static AuxiliaryViewPosition valueOf(String s)
        {
            return (AuxiliaryViewPosition)Enum.valueOf(com/facebook/widget/LikeView$AuxiliaryViewPosition, s);
        }

        public static AuxiliaryViewPosition[] values()
        {
            return (AuxiliaryViewPosition[])$VALUES.clone();
        }

        public String toString()
        {
            return stringValue;
        }

        static 
        {
            BOTTOM = new AuxiliaryViewPosition("BOTTOM", 0, "bottom", 0);
            INLINE = new AuxiliaryViewPosition("INLINE", 1, "inline", 1);
            TOP = new AuxiliaryViewPosition("TOP", 2, "top", 2);
            $VALUES = (new AuxiliaryViewPosition[] {
                BOTTOM, INLINE, TOP
            });
            DEFAULT = BOTTOM;
        }


        private AuxiliaryViewPosition(String s, int i, String s1, int k)
        {
            super(s, i);
            stringValue = s1;
            intValue = k;
        }
    }

    public static final class HorizontalAlignment extends Enum
    {

        private static final HorizontalAlignment $VALUES[];
        public static final HorizontalAlignment CENTER;
        static HorizontalAlignment DEFAULT;
        public static final HorizontalAlignment LEFT;
        public static final HorizontalAlignment RIGHT;
        private int intValue;
        private String stringValue;

        static HorizontalAlignment fromInt(int i)
        {
            HorizontalAlignment ahorizontalalignment[] = values();
            int l = ahorizontalalignment.length;
            for (int k = 0; k < l; k++)
            {
                HorizontalAlignment horizontalalignment = ahorizontalalignment[k];
                if (horizontalalignment.getValue() == i)
                {
                    return horizontalalignment;
                }
            }

            return null;
        }

        private int getValue()
        {
            return intValue;
        }

        public static HorizontalAlignment valueOf(String s)
        {
            return (HorizontalAlignment)Enum.valueOf(com/facebook/widget/LikeView$HorizontalAlignment, s);
        }

        public static HorizontalAlignment[] values()
        {
            return (HorizontalAlignment[])$VALUES.clone();
        }

        public String toString()
        {
            return stringValue;
        }

        static 
        {
            CENTER = new HorizontalAlignment("CENTER", 0, "center", 0);
            LEFT = new HorizontalAlignment("LEFT", 1, "left", 1);
            RIGHT = new HorizontalAlignment("RIGHT", 2, "right", 2);
            $VALUES = (new HorizontalAlignment[] {
                CENTER, LEFT, RIGHT
            });
            DEFAULT = CENTER;
        }


        private HorizontalAlignment(String s, int i, String s1, int k)
        {
            super(s, i);
            stringValue = s1;
            intValue = k;
        }
    }

    private class LikeActionControllerCreationCallback
        implements com.facebook.internal.LikeActionController.CreationCallback
    {

        private boolean isCancelled;
        final LikeView this$0;

        public void cancel()
        {
            isCancelled = true;
        }

        public void onComplete(LikeActionController likeactioncontroller)
        {
            if (isCancelled)
            {
                return;
            } else
            {
                associateWithLikeActionController(likeactioncontroller);
                updateLikeStateAndLayout();
                creationCallback = null;
                return;
            }
        }

        private LikeActionControllerCreationCallback()
        {
            this$0 = LikeView.this;
            super();
        }

    }

    private class LikeControllerBroadcastReceiver extends BroadcastReceiver
    {

        final LikeView this$0;

        public void onReceive(Context context, Intent intent)
        {
            boolean flag1 = true;
            context = intent.getAction();
            intent = intent.getExtras();
            boolean flag = flag1;
            if (intent != null)
            {
                String s = intent.getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
                flag = flag1;
                if (!Utility.isNullOrEmpty(s))
                {
                    if (Utility.areObjectsEqual(objectId, s))
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                }
            }
            if (flag) goto _L2; else goto _L1
_L1:
            return;
_L2:
            if ("com.facebook.sdk.LikeActionController.UPDATED".equals(context))
            {
                updateLikeStateAndLayout();
                return;
            }
            if (!"com.facebook.sdk.LikeActionController.DID_ERROR".equals(context))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (onErrorListener == null) goto _L1; else goto _L3
_L3:
            onErrorListener.onError(intent);
            return;
            if (!"com.facebook.sdk.LikeActionController.DID_RESET".equals(context)) goto _L1; else goto _L4
_L4:
            setObjectIdForced(objectId);
            updateLikeStateAndLayout();
            return;
        }

        private LikeControllerBroadcastReceiver()
        {
            this$0 = LikeView.this;
            super();
        }

    }

    public static interface OnErrorListener
    {

        public abstract void onError(Bundle bundle);
    }

    public static final class Style extends Enum
    {

        private static final Style $VALUES[];
        public static final Style BOX_COUNT;
        public static final Style BUTTON;
        static Style DEFAULT;
        public static final Style STANDARD;
        private int intValue;
        private String stringValue;

        static Style fromInt(int i)
        {
            Style astyle[] = values();
            int l = astyle.length;
            for (int k = 0; k < l; k++)
            {
                Style style = astyle[k];
                if (style.getValue() == i)
                {
                    return style;
                }
            }

            return null;
        }

        private int getValue()
        {
            return intValue;
        }

        public static Style valueOf(String s)
        {
            return (Style)Enum.valueOf(com/facebook/widget/LikeView$Style, s);
        }

        public static Style[] values()
        {
            return (Style[])$VALUES.clone();
        }

        public String toString()
        {
            return stringValue;
        }

        static 
        {
            STANDARD = new Style("STANDARD", 0, "standard", 0);
            BUTTON = new Style("BUTTON", 1, "button", 1);
            BOX_COUNT = new Style("BOX_COUNT", 2, "box_count", 2);
            $VALUES = (new Style[] {
                STANDARD, BUTTON, BOX_COUNT
            });
            DEFAULT = STANDARD;
        }


        private Style(String s, int i, String s1, int k)
        {
            super(s, i);
            stringValue = s1;
            intValue = k;
        }
    }


    private static final int NO_FOREGROUND_COLOR = -1;
    private AuxiliaryViewPosition auxiliaryViewPosition;
    private BroadcastReceiver broadcastReceiver;
    private LinearLayout containerView;
    private LikeActionControllerCreationCallback creationCallback;
    private int edgePadding;
    private int foregroundColor;
    private HorizontalAlignment horizontalAlignment;
    private int internalPadding;
    private LikeActionController likeActionController;
    private LikeBoxCountView likeBoxCountView;
    private LikeButton likeButton;
    private Style likeViewStyle;
    private String objectId;
    private OnErrorListener onErrorListener;
    private TextView socialSentenceView;

    public LikeView(Context context)
    {
        super(context);
        likeViewStyle = Style.DEFAULT;
        horizontalAlignment = HorizontalAlignment.DEFAULT;
        auxiliaryViewPosition = AuxiliaryViewPosition.DEFAULT;
        foregroundColor = -1;
        initialize(context);
    }

    public LikeView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        likeViewStyle = Style.DEFAULT;
        horizontalAlignment = HorizontalAlignment.DEFAULT;
        auxiliaryViewPosition = AuxiliaryViewPosition.DEFAULT;
        foregroundColor = -1;
        parseAttributes(attributeset);
        initialize(context);
    }

    private void associateWithLikeActionController(LikeActionController likeactioncontroller)
    {
        likeActionController = likeactioncontroller;
        broadcastReceiver = new LikeControllerBroadcastReceiver();
        likeactioncontroller = j.a(getContext());
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.sdk.LikeActionController.UPDATED");
        intentfilter.addAction("com.facebook.sdk.LikeActionController.DID_ERROR");
        intentfilter.addAction("com.facebook.sdk.LikeActionController.DID_RESET");
        likeactioncontroller.a(broadcastReceiver, intentfilter);
    }

    private Bundle getAnalyticsParameters()
    {
        Bundle bundle = new Bundle();
        bundle.putString("style", likeViewStyle.toString());
        bundle.putString("auxiliary_position", auxiliaryViewPosition.toString());
        bundle.putString("horizontal_alignment", horizontalAlignment.toString());
        bundle.putString("object_id", Utility.coerceValueIfNullOrEmpty(objectId, ""));
        return bundle;
    }

    public static boolean handleOnActivityResult(Context context, int i, int k, Intent intent)
    {
        return LikeActionController.handleOnActivityResult(context, i, k, intent);
    }

    private void initialize(Context context)
    {
        edgePadding = getResources().getDimensionPixelSize(com.facebook.android.R.dimen.com_facebook_likeview_edge_padding);
        internalPadding = getResources().getDimensionPixelSize(com.facebook.android.R.dimen.com_facebook_likeview_internal_padding);
        if (foregroundColor == -1)
        {
            foregroundColor = getResources().getColor(com.facebook.android.R.color.com_facebook_likeview_text_color);
        }
        setBackgroundColor(0);
        containerView = new LinearLayout(context);
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        containerView.setLayoutParams(layoutparams);
        initializeLikeButton(context);
        initializeSocialSentenceView(context);
        initializeLikeCountView(context);
        containerView.addView(likeButton);
        containerView.addView(socialSentenceView);
        containerView.addView(likeBoxCountView);
        addView(containerView);
        setObjectIdForced(objectId);
        updateLikeStateAndLayout();
    }

    private void initializeLikeButton(Context context)
    {
        boolean flag;
        if (likeActionController != null)
        {
            flag = likeActionController.isObjectLiked();
        } else
        {
            flag = false;
        }
        likeButton = new LikeButton(context, flag);
        likeButton.setOnClickListener(new android.view.View.OnClickListener() {

            final LikeView this$0;

            public void onClick(View view)
            {
                toggleLike();
            }

            
            {
                this$0 = LikeView.this;
                super();
            }
        });
        context = new android.widget.LinearLayout.LayoutParams(-2, -2);
        likeButton.setLayoutParams(context);
    }

    private void initializeLikeCountView(Context context)
    {
        likeBoxCountView = new LikeBoxCountView(context);
        context = new android.widget.LinearLayout.LayoutParams(-1, -1);
        likeBoxCountView.setLayoutParams(context);
    }

    private void initializeSocialSentenceView(Context context)
    {
        socialSentenceView = new TextView(context);
        socialSentenceView.setTextSize(0, getResources().getDimension(com.facebook.android.R.dimen.com_facebook_likeview_text_size));
        socialSentenceView.setMaxLines(2);
        socialSentenceView.setTextColor(foregroundColor);
        socialSentenceView.setGravity(17);
        context = new android.widget.LinearLayout.LayoutParams(-2, -1);
        socialSentenceView.setLayoutParams(context);
    }

    private void parseAttributes(AttributeSet attributeset)
    {
        if (attributeset != null && getContext() != null)
        {
            if ((attributeset = getContext().obtainStyledAttributes(attributeset, com.facebook.android.R.styleable.com_facebook_like_view)) != null)
            {
                objectId = Utility.coerceValueIfNullOrEmpty(attributeset.getString(com.facebook.android.R.styleable.com_facebook_like_view_object_id), null);
                likeViewStyle = Style.fromInt(attributeset.getInt(com.facebook.android.R.styleable.com_facebook_like_view_style, Style.DEFAULT.getValue()));
                if (likeViewStyle == null)
                {
                    throw new IllegalArgumentException("Unsupported value for LikeView 'style'");
                }
                auxiliaryViewPosition = AuxiliaryViewPosition.fromInt(attributeset.getInt(com.facebook.android.R.styleable.com_facebook_like_view_auxiliary_view_position, AuxiliaryViewPosition.DEFAULT.getValue()));
                if (auxiliaryViewPosition == null)
                {
                    throw new IllegalArgumentException("Unsupported value for LikeView 'auxiliary_view_position'");
                }
                horizontalAlignment = HorizontalAlignment.fromInt(attributeset.getInt(com.facebook.android.R.styleable.com_facebook_like_view_horizontal_alignment, HorizontalAlignment.DEFAULT.getValue()));
                if (horizontalAlignment == null)
                {
                    throw new IllegalArgumentException("Unsupported value for LikeView 'horizontal_alignment'");
                } else
                {
                    foregroundColor = attributeset.getColor(com.facebook.android.R.styleable.com_facebook_like_view_foreground_color, -1);
                    attributeset.recycle();
                    return;
                }
            }
        }
    }

    private void setObjectIdForced(String s)
    {
        tearDownObjectAssociations();
        objectId = s;
        if (Utility.isNullOrEmpty(s))
        {
            return;
        } else
        {
            creationCallback = new LikeActionControllerCreationCallback();
            LikeActionController.getControllerForObjectId(getContext(), s, creationCallback);
            return;
        }
    }

    private void tearDownObjectAssociations()
    {
        if (broadcastReceiver != null)
        {
            j.a(getContext()).a(broadcastReceiver);
            broadcastReceiver = null;
        }
        if (creationCallback != null)
        {
            creationCallback.cancel();
            creationCallback = null;
        }
        likeActionController = null;
    }

    private void toggleLike()
    {
        if (likeActionController != null)
        {
            Activity activity = (Activity)getContext();
            likeActionController.toggleLike(activity, getAnalyticsParameters());
        }
    }

    private void updateBoxCountCaretPosition()
    {
        static class _cls2
        {

            static final int $SwitchMap$com$facebook$widget$LikeView$AuxiliaryViewPosition[];

            static 
            {
                $SwitchMap$com$facebook$widget$LikeView$AuxiliaryViewPosition = new int[AuxiliaryViewPosition.values().length];
                try
                {
                    $SwitchMap$com$facebook$widget$LikeView$AuxiliaryViewPosition[AuxiliaryViewPosition.TOP.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$facebook$widget$LikeView$AuxiliaryViewPosition[AuxiliaryViewPosition.BOTTOM.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$facebook$widget$LikeView$AuxiliaryViewPosition[AuxiliaryViewPosition.INLINE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        LikeBoxCountView likeboxcountview;
        switch (_cls2..SwitchMap.com.facebook.widget.LikeView.AuxiliaryViewPosition[auxiliaryViewPosition.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            likeBoxCountView.setCaretPosition(com.facebook.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.BOTTOM);
            return;

        case 2: // '\002'
            likeBoxCountView.setCaretPosition(com.facebook.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.TOP);
            return;

        case 3: // '\003'
            likeboxcountview = likeBoxCountView;
            break;
        }
        com.facebook.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition likeboxcountviewcaretposition;
        if (horizontalAlignment == HorizontalAlignment.RIGHT)
        {
            likeboxcountviewcaretposition = com.facebook.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.RIGHT;
        } else
        {
            likeboxcountviewcaretposition = com.facebook.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.LEFT;
        }
        likeboxcountview.setCaretPosition(likeboxcountviewcaretposition);
    }

    private void updateLayout()
    {
        Object obj;
        boolean flag = true;
        obj = (android.widget.FrameLayout.LayoutParams)containerView.getLayoutParams();
        Object obj1 = (android.widget.LinearLayout.LayoutParams)likeButton.getLayoutParams();
        int i;
        if (horizontalAlignment == HorizontalAlignment.LEFT)
        {
            i = 3;
        } else
        if (horizontalAlignment == HorizontalAlignment.CENTER)
        {
            i = 1;
        } else
        {
            i = 5;
        }
        obj.gravity = i | 0x30;
        obj1.gravity = i;
        socialSentenceView.setVisibility(8);
        likeBoxCountView.setVisibility(8);
        if (likeViewStyle != Style.STANDARD || likeActionController == null || Utility.isNullOrEmpty(likeActionController.getSocialSentence())) goto _L2; else goto _L1
_L1:
        obj = socialSentenceView;
_L8:
        ((View) (obj)).setVisibility(0);
        ((android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams()).gravity = i;
        obj1 = containerView;
        i = ((flag) ? 1 : 0);
        if (auxiliaryViewPosition == AuxiliaryViewPosition.INLINE)
        {
            i = 0;
        }
        ((LinearLayout) (obj1)).setOrientation(i);
        if (auxiliaryViewPosition == AuxiliaryViewPosition.TOP || auxiliaryViewPosition == AuxiliaryViewPosition.INLINE && horizontalAlignment == HorizontalAlignment.RIGHT)
        {
            containerView.removeView(likeButton);
            containerView.addView(likeButton);
        } else
        {
            containerView.removeView(((View) (obj)));
            containerView.addView(((View) (obj)));
        }
        _cls2..SwitchMap.com.facebook.widget.LikeView.AuxiliaryViewPosition[auxiliaryViewPosition.ordinal()];
        JVM INSTR tableswitch 1 3: default 232
    //                   1 314
    //                   2 335
    //                   3 356;
           goto _L3 _L4 _L5 _L6
_L3:
        return;
_L2:
        if (likeViewStyle != Style.BOX_COUNT || likeActionController == null || Utility.isNullOrEmpty(likeActionController.getLikeCountString())) goto _L3; else goto _L7
_L7:
        updateBoxCountCaretPosition();
        obj = likeBoxCountView;
          goto _L8
_L4:
        ((View) (obj)).setPadding(edgePadding, edgePadding, edgePadding, internalPadding);
        return;
_L5:
        ((View) (obj)).setPadding(edgePadding, internalPadding, edgePadding, edgePadding);
        return;
_L6:
        if (horizontalAlignment == HorizontalAlignment.RIGHT)
        {
            ((View) (obj)).setPadding(edgePadding, edgePadding, internalPadding, edgePadding);
            return;
        } else
        {
            ((View) (obj)).setPadding(internalPadding, edgePadding, edgePadding, edgePadding);
            return;
        }
    }

    private void updateLikeStateAndLayout()
    {
        if (likeActionController == null)
        {
            likeButton.setLikeState(false);
            socialSentenceView.setText(null);
            likeBoxCountView.setText(null);
        } else
        {
            likeButton.setLikeState(likeActionController.isObjectLiked());
            socialSentenceView.setText(likeActionController.getSocialSentence());
            likeBoxCountView.setText(likeActionController.getLikeCountString());
        }
        updateLayout();
    }

    public OnErrorListener getOnErrorListener()
    {
        return onErrorListener;
    }

    protected void onDetachedFromWindow()
    {
        setObjectId(null);
        super.onDetachedFromWindow();
    }

    public void setAuxiliaryViewPosition(AuxiliaryViewPosition auxiliaryviewposition)
    {
        if (auxiliaryviewposition == null)
        {
            auxiliaryviewposition = AuxiliaryViewPosition.DEFAULT;
        }
        if (auxiliaryViewPosition != auxiliaryviewposition)
        {
            auxiliaryViewPosition = auxiliaryviewposition;
            updateLayout();
        }
    }

    public void setForegroundColor(int i)
    {
        if (foregroundColor != i)
        {
            socialSentenceView.setTextColor(i);
        }
    }

    public void setHorizontalAlignment(HorizontalAlignment horizontalalignment)
    {
        if (horizontalalignment == null)
        {
            horizontalalignment = HorizontalAlignment.DEFAULT;
        }
        if (horizontalAlignment != horizontalalignment)
        {
            horizontalAlignment = horizontalalignment;
            updateLayout();
        }
    }

    public void setLikeViewStyle(Style style)
    {
        if (style == null)
        {
            style = Style.DEFAULT;
        }
        if (likeViewStyle != style)
        {
            likeViewStyle = style;
            updateLayout();
        }
    }

    public void setObjectId(String s)
    {
        s = Utility.coerceValueIfNullOrEmpty(s, null);
        if (!Utility.areObjectsEqual(s, objectId))
        {
            setObjectIdForced(s);
            updateLikeStateAndLayout();
        }
    }

    public void setOnErrorListener(OnErrorListener onerrorlistener)
    {
        onErrorListener = onerrorlistener;
    }



/*
    static LikeActionControllerCreationCallback access$1102(LikeView likeview, LikeActionControllerCreationCallback likeactioncontrollercreationcallback)
    {
        likeview.creationCallback = likeactioncontrollercreationcallback;
        return likeactioncontrollercreationcallback;
    }

*/





}
