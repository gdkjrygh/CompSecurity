// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.util.Linkify;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import java.util.regex.Pattern;

// Referenced classes of package com.dominos.views:
//            QuantityView

public class TrackerStoreAddressView extends LinearLayout
{

    public static final String TAG = com/dominos/views/QuantityView.getSimpleName();
    FrameLayout mFeedbackContainer;
    TextView mStoreAddress;

    public TrackerStoreAddressView(Context context)
    {
        super(context);
    }

    public TrackerStoreAddressView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void setStoreAddress(String s)
    {
        mStoreAddress.setText(s);
        if (((TelephonyManager)getContext().getSystemService("phone")).getDeviceId() != null)
        {
            s = Pattern.compile("(\\d-)?(\\d{3}-)?\\d{3}-\\d{4}");
            Linkify.addLinks(mStoreAddress, s, "tel:");
        }
    }

    public void bind(String s, String s1)
    {
        setStoreAddress((new StringBuilder()).append(s).append("\n\n").append(getContext().getString(0x7f08023c)).append(" ").append(s1).toString());
    }

    void setupFonts()
    {
        FontManager.applyDominosFont(this);
    }

}
