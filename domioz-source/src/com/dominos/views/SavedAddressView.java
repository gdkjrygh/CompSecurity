// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.AddressUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.utils.AddressType;

public class SavedAddressView extends RelativeLayout
{

    private final Context mContext;
    View mDivider;
    ImageView mEnumerateSeparatorView;
    TextView mEnumerateView;
    TextView mLocationDescription;
    TextView mLocationStreetAddress;

    public SavedAddressView(Context context)
    {
        super(context);
        mContext = context;
    }

    public SavedAddressView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mContext = context;
    }

    public SavedAddressView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mContext = context;
    }

    public void bindAddress(LabsAddress labsaddress, int i, ViewType viewtype)
    {
        String s2 = labsaddress.getStreet();
        String s;
        String s1;
        if (labsaddress.isDefault())
        {
            s = (new StringBuilder()).append(labsaddress.getName()).append(" ").append(mContext.getString(0x7f080250)).toString();
        } else
        {
            s = labsaddress.getName();
        }
        s1 = s2;
        if (StringHelper.equalsIgnoreCase(labsaddress.getAddressType(), AddressType.TYPE_CAMPUS_BASE.getId()))
        {
            s1 = AddressUtil.removeZeroFromStreetAddress(s2);
        }
        bindValues(s, s1, i, viewtype);
    }

    public void bindValues(String s, String s1, int i, ViewType viewtype)
    {
        mEnumerateView.setVisibility(0);
        mEnumerateView.setText(Integer.toString(i + 1));
        mEnumerateSeparatorView.setVisibility(0);
        mLocationDescription.setText(s);
        if (StringHelper.isNotEmpty(s1))
        {
            mLocationStreetAddress.setText((new StringBuilder("(")).append(s1.trim()).append(")").toString());
        }
        _cls1..SwitchMap.com.dominos.views.SavedAddressView.ViewType[viewtype.ordinal()];
        JVM INSTR tableswitch 1 4: default 116
    //                   1 131
    //                   2 148
    //                   3 166
    //                   4 184;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        setBackgroundResource(0x7f020054);
_L6:
        setTag(Integer.valueOf(i));
        return;
_L2:
        mDivider.setVisibility(0);
        setBackgroundResource(0x7f020056);
        continue; /* Loop/switch isn't completed */
_L3:
        mDivider.setVisibility(8);
        setBackgroundResource(0x7f020053);
        continue; /* Loop/switch isn't completed */
_L4:
        mDivider.setVisibility(8);
        setBackgroundResource(0x7f020055);
        if (true) goto _L6; else goto _L5
_L5:
        mDivider.setVisibility(0);
        if (true) goto _L1; else goto _L7
_L7:
    }

    private class _cls1
    {

        static final int $SwitchMap$com$dominos$views$SavedAddressView$ViewType[];

        static 
        {
            $SwitchMap$com$dominos$views$SavedAddressView$ViewType = new int[ViewType.values().length];
            try
            {
                $SwitchMap$com$dominos$views$SavedAddressView$ViewType[ViewType.TOP.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$dominos$views$SavedAddressView$ViewType[ViewType.BOTTOM.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$views$SavedAddressView$ViewType[ViewType.SINGLE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$views$SavedAddressView$ViewType[ViewType.CENTER.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$views$SavedAddressView$ViewType[ViewType.OTHER.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class ViewType extends Enum
    {

        private static final ViewType $VALUES[];
        public static final ViewType BOTTOM;
        public static final ViewType CENTER;
        public static final ViewType OTHER;
        public static final ViewType SINGLE;
        public static final ViewType TOP;

        public static ViewType valueOf(String s)
        {
            return (ViewType)Enum.valueOf(com/dominos/views/SavedAddressView$ViewType, s);
        }

        public static ViewType[] values()
        {
            return (ViewType[])$VALUES.clone();
        }

        static 
        {
            TOP = new ViewType("TOP", 0);
            CENTER = new ViewType("CENTER", 1);
            BOTTOM = new ViewType("BOTTOM", 2);
            SINGLE = new ViewType("SINGLE", 3);
            OTHER = new ViewType("OTHER", 4);
            $VALUES = (new ViewType[] {
                TOP, CENTER, BOTTOM, SINGLE, OTHER
            });
        }

        private ViewType(String s, int i)
        {
            super(s, i);
        }
    }

}
