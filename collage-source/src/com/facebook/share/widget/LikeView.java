// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.FacebookException;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.share.internal.LikeActionController;
import com.facebook.share.internal.LikeBoxCountView;
import com.facebook.share.internal.LikeButton;

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
            int k = aauxiliaryviewposition.length;
            for (int j = 0; j < k; j++)
            {
                AuxiliaryViewPosition auxiliaryviewposition = aauxiliaryviewposition[j];
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
            return (AuxiliaryViewPosition)Enum.valueOf(com/facebook/share/widget/LikeView$AuxiliaryViewPosition, s);
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


        private AuxiliaryViewPosition(String s, int i, String s1, int j)
        {
            super(s, i);
            stringValue = s1;
            intValue = j;
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
            int k = ahorizontalalignment.length;
            for (int j = 0; j < k; j++)
            {
                HorizontalAlignment horizontalalignment = ahorizontalalignment[j];
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
            return (HorizontalAlignment)Enum.valueOf(com/facebook/share/widget/LikeView$HorizontalAlignment, s);
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


        private HorizontalAlignment(String s, int i, String s1, int j)
        {
            super(s, i);
            stringValue = s1;
            intValue = j;
        }
    }

    private class LikeActionControllerCreationCallback
        implements com.facebook.share.internal.LikeActionController.CreationCallback
    {

        private boolean isCancelled;
        final LikeView this$0;

        public void cancel()
        {
            isCancelled = true;
        }

        public void onComplete(LikeActionController likeactioncontroller, FacebookException facebookexception)
        {
            if (isCancelled)
            {
                return;
            }
            FacebookException facebookexception1 = facebookexception;
            if (likeactioncontroller != null)
            {
                if (!likeactioncontroller.shouldEnableView())
                {
                    facebookexception = new FacebookException("Cannot use LikeView. The device may not be supported.");
                }
                associateWithLikeActionController(likeactioncontroller);
                updateLikeStateAndLayout();
                facebookexception1 = facebookexception;
            }
            if (facebookexception1 != null && onErrorListener != null)
            {
                onErrorListener.onError(facebookexception1);
            }
            creationCallback = null;
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
            onErrorListener.onError(NativeProtocol.getExceptionFromErrorData(intent));
            return;
            if (!"com.facebook.sdk.LikeActionController.DID_RESET".equals(context)) goto _L1; else goto _L4
_L4:
            setObjectIdAndTypeForced(objectId, objectType);
            updateLikeStateAndLayout();
            return;
        }

        private LikeControllerBroadcastReceiver()
        {
            this$0 = LikeView.this;
            super();
        }

    }

    public static final class ObjectType extends Enum
    {

        private static final ObjectType $VALUES[];
        public static ObjectType DEFAULT;
        public static final ObjectType OPEN_GRAPH;
        public static final ObjectType PAGE;
        public static final ObjectType UNKNOWN;
        private int intValue;
        private String stringValue;

        public static ObjectType fromInt(int i)
        {
            ObjectType aobjecttype[] = values();
            int k = aobjecttype.length;
            for (int j = 0; j < k; j++)
            {
                ObjectType objecttype = aobjecttype[j];
                if (objecttype.getValue() == i)
                {
                    return objecttype;
                }
            }

            return null;
        }

        public static ObjectType valueOf(String s)
        {
            return (ObjectType)Enum.valueOf(com/facebook/share/widget/LikeView$ObjectType, s);
        }

        public static ObjectType[] values()
        {
            return (ObjectType[])$VALUES.clone();
        }

        public int getValue()
        {
            return intValue;
        }

        public String toString()
        {
            return stringValue;
        }

        static 
        {
            UNKNOWN = new ObjectType("UNKNOWN", 0, "unknown", 0);
            OPEN_GRAPH = new ObjectType("OPEN_GRAPH", 1, "open_graph", 1);
            PAGE = new ObjectType("PAGE", 2, "page", 2);
            $VALUES = (new ObjectType[] {
                UNKNOWN, OPEN_GRAPH, PAGE
            });
            DEFAULT = UNKNOWN;
        }

        private ObjectType(String s, int i, String s1, int j)
        {
            super(s, i);
            stringValue = s1;
            intValue = j;
        }
    }

    public static interface OnErrorListener
    {

        public abstract void onError(FacebookException facebookexception);
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
            int k = astyle.length;
            for (int j = 0; j < k; j++)
            {
                Style style = astyle[j];
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
            return (Style)Enum.valueOf(com/facebook/share/widget/LikeView$Style, s);
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


        private Style(String s, int i, String s1, int j)
        {
            super(s, i);
            stringValue = s1;
            intValue = j;
        }
    }


    private static final int NO_FOREGROUND_COLOR = -1;
    private AuxiliaryViewPosition auxiliaryViewPosition;
    private BroadcastReceiver broadcastReceiver;
    private LinearLayout containerView;
    private LikeActionControllerCreationCallback creationCallback;
    private int edgePadding;
    private boolean explicitlyDisabled;
    private int foregroundColor;
    private HorizontalAlignment horizontalAlignment;
    private int internalPadding;
    private LikeActionController likeActionController;
    private LikeBoxCountView likeBoxCountView;
    private LikeButton likeButton;
    private Style likeViewStyle;
    private String objectId;
    private ObjectType objectType;
    private OnErrorListener onErrorListener;
    private Fragment parentFragment;
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
        likeactioncontroller = LocalBroadcastManager.getInstance(getContext());
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.sdk.LikeActionController.UPDATED");
        intentfilter.addAction("com.facebook.sdk.LikeActionController.DID_ERROR");
        intentfilter.addAction("com.facebook.sdk.LikeActionController.DID_RESET");
        likeactioncontroller.registerReceiver(broadcastReceiver, intentfilter);
    }

    private Activity getActivity()
    {
        Context context;
        for (context = getContext(); !(context instanceof Activity) && (context instanceof ContextWrapper); context = ((ContextWrapper)context).getBaseContext()) { }
        if (context instanceof Activity)
        {
            return (Activity)context;
        } else
        {
            throw new FacebookException("Unable to get Activity.");
        }
    }

    private Bundle getAnalyticsParameters()
    {
        Bundle bundle = new Bundle();
        bundle.putString("style", likeViewStyle.toString());
        bundle.putString("auxiliary_position", auxiliaryViewPosition.toString());
        bundle.putString("horizontal_alignment", horizontalAlignment.toString());
        bundle.putString("object_id", Utility.coerceValueIfNullOrEmpty(objectId, ""));
        bundle.putString("object_type", objectType.toString());
        return bundle;
    }

    private void initialize(Context context)
    {
        edgePadding = getResources().getDimensionPixelSize(com.facebook.R.dimen.com_facebook_likeview_edge_padding);
        internalPadding = getResources().getDimensionPixelSize(com.facebook.R.dimen.com_facebook_likeview_internal_padding);
        if (foregroundColor == -1)
        {
            foregroundColor = getResources().getColor(com.facebook.R.color.com_facebook_likeview_text_color);
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
        setObjectIdAndTypeForced(objectId, objectType);
        updateLikeStateAndLayout();
    }

    private void initializeLikeButton(Context context)
    {
        boolean flag;
        if (likeActionController != null && likeActionController.isObjectLiked())
        {
            flag = true;
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
        socialSentenceView.setTextSize(0, getResources().getDimension(com.facebook.R.dimen.com_facebook_likeview_text_size));
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
            if ((attributeset = getContext().obtainStyledAttributes(attributeset, com.facebook.R.styleable.com_facebook_like_view)) != null)
            {
                objectId = Utility.coerceValueIfNullOrEmpty(attributeset.getString(com.facebook.R.styleable.com_facebook_like_view_com_facebook_object_id), null);
                objectType = ObjectType.fromInt(attributeset.getInt(com.facebook.R.styleable.com_facebook_like_view_com_facebook_object_type, ObjectType.DEFAULT.getValue()));
                likeViewStyle = Style.fromInt(attributeset.getInt(com.facebook.R.styleable.com_facebook_like_view_com_facebook_style, Style.DEFAULT.getValue()));
                if (likeViewStyle == null)
                {
                    throw new IllegalArgumentException("Unsupported value for LikeView 'style'");
                }
                auxiliaryViewPosition = AuxiliaryViewPosition.fromInt(attributeset.getInt(com.facebook.R.styleable.com_facebook_like_view_com_facebook_auxiliary_view_position, AuxiliaryViewPosition.DEFAULT.getValue()));
                if (auxiliaryViewPosition == null)
                {
                    throw new IllegalArgumentException("Unsupported value for LikeView 'auxiliary_view_position'");
                }
                horizontalAlignment = HorizontalAlignment.fromInt(attributeset.getInt(com.facebook.R.styleable.com_facebook_like_view_com_facebook_horizontal_alignment, HorizontalAlignment.DEFAULT.getValue()));
                if (horizontalAlignment == null)
                {
                    throw new IllegalArgumentException("Unsupported value for LikeView 'horizontal_alignment'");
                } else
                {
                    foregroundColor = attributeset.getColor(com.facebook.R.styleable.com_facebook_like_view_com_facebook_foreground_color, -1);
                    attributeset.recycle();
                    return;
                }
            }
        }
    }

    private void setObjectIdAndTypeForced(String s, ObjectType objecttype)
    {
        tearDownObjectAssociations();
        objectId = s;
        objectType = objecttype;
        if (!Utility.isNullOrEmpty(s))
        {
            creationCallback = new LikeActionControllerCreationCallback();
            if (!isInEditMode())
            {
                LikeActionController.getControllerForObjectId(s, objecttype, creationCallback);
                return;
            }
        }
    }

    private void tearDownObjectAssociations()
    {
        if (broadcastReceiver != null)
        {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(broadcastReceiver);
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
            Activity activity = null;
            if (parentFragment == null)
            {
                activity = getActivity();
            }
            likeActionController.toggleLike(activity, parentFragment, getAnalyticsParameters());
        }
    }

    private void updateBoxCountCaretPosition()
    {
        static class _cls2
        {

            static final int $SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition[];

            static 
            {
                $SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition = new int[AuxiliaryViewPosition.values().length];
                try
                {
                    $SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition[AuxiliaryViewPosition.TOP.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition[AuxiliaryViewPosition.BOTTOM.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition[AuxiliaryViewPosition.INLINE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        LikeBoxCountView likeboxcountview;
        switch (_cls2..SwitchMap.com.facebook.share.widget.LikeView.AuxiliaryViewPosition[auxiliaryViewPosition.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            likeBoxCountView.setCaretPosition(com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.BOTTOM);
            return;

        case 2: // '\002'
            likeBoxCountView.setCaretPosition(com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.TOP);
            return;

        case 3: // '\003'
            likeboxcountview = likeBoxCountView;
            break;
        }
        com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition likeboxcountviewcaretposition;
        if (horizontalAlignment == HorizontalAlignment.RIGHT)
        {
            likeboxcountviewcaretposition = com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.RIGHT;
        } else
        {
            likeboxcountviewcaretposition = com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.LEFT;
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
        _cls2..SwitchMap.com.facebook.share.widget.LikeView.AuxiliaryViewPosition[auxiliaryViewPosition.ordinal()];
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
        boolean flag;
        if (!explicitlyDisabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (likeActionController == null)
        {
            likeButton.setSelected(false);
            socialSentenceView.setText(null);
            likeBoxCountView.setText(null);
        } else
        {
            likeButton.setSelected(likeActionController.isObjectLiked());
            socialSentenceView.setText(likeActionController.getSocialSentence());
            likeBoxCountView.setText(likeActionController.getLikeCountString());
            flag &= likeActionController.shouldEnableView();
        }
        super.setEnabled(flag);
        likeButton.setEnabled(flag);
        updateLayout();
    }

    public OnErrorListener getOnErrorListener()
    {
        return onErrorListener;
    }

    protected void onDetachedFromWindow()
    {
        setObjectIdAndType(null, ObjectType.UNKNOWN);
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

    public void setEnabled(boolean flag)
    {
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        explicitlyDisabled = flag;
        updateLikeStateAndLayout();
    }

    public void setForegroundColor(int i)
    {
        if (foregroundColor != i)
        {
            socialSentenceView.setTextColor(i);
        }
    }

    public void setFragment(Fragment fragment)
    {
        parentFragment = fragment;
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

    public void setObjectIdAndType(String s, ObjectType objecttype)
    {
        s = Utility.coerceValueIfNullOrEmpty(s, null);
        if (objecttype == null)
        {
            objecttype = ObjectType.DEFAULT;
        }
        if (!Utility.areObjectsEqual(s, objectId) || objecttype != objectType)
        {
            setObjectIdAndTypeForced(s, objecttype);
            updateLikeStateAndLayout();
        }
    }

    public void setOnErrorListener(OnErrorListener onerrorlistener)
    {
        onErrorListener = onerrorlistener;
    }




/*
    static LikeActionControllerCreationCallback access$1202(LikeView likeview, LikeActionControllerCreationCallback likeactioncontrollercreationcallback)
    {
        likeview.creationCallback = likeactioncontrollercreationcallback;
        return likeactioncontrollercreationcallback;
    }

*/





}
