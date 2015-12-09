// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import org.a.a.a.k;
import org.a.a.a.l;

public class HistoricalProductView extends LinearLayout
{

    TextView mProductDetailTextView;
    TextView mProductNameView;

    public HistoricalProductView(Context context)
    {
        super(context);
    }

    public HistoricalProductView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private String getISOFormattedString(String s)
    {
        try
        {
            s = new String(s.getBytes("ISO-8859-1"), "utf-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s;
    }

    private String insertNewlinesInDescription(String s)
    {
        String s2 = getResources().getString(0x7f080341);
        String s3 = getResources().getString(0x7f08018a);
        String s4 = getResources().getString(0x7f080283);
        String s1 = s;
        if (s.contains(s2))
        {
            s1 = s;
            if (!s.contains(s3))
            {
                s1 = s;
                if (!s.contains(s4))
                {
                    s1 = s.replace(s2, "");
                }
            }
        }
        int i = 0;
        s = s1;
        for (; i < 3; i++)
        {
            s1 = (new String[] {
                s2, s4, s3
            })[i];
            s = s.replace(s1, (new StringBuilder("\n")).append(s1).toString());
        }

        s1 = s;
        if (s.length() > 1)
        {
            s1 = s;
            if (s.charAt(0) == '\n')
            {
                s1 = s.substring(1);
            }
        }
        return s1.replaceAll(", \n", "\n").trim();
    }

    public void bind(LabsProductLine labsproductline)
    {
        if (labsproductline == null)
        {
            return;
        }
        String s = labsproductline.getProduct().getTitle();
        mProductNameView.setText(k.a(String.format(Locale.getDefault(), "\u2022 %d %s", new Object[] {
            Integer.valueOf(labsproductline.getQuantity()), getISOFormattedString(s)
        })));
        labsproductline = labsproductline.getProduct().getDescription().trim();
        if (l.b(labsproductline))
        {
            mProductDetailTextView.setText(insertNewlinesInDescription(getISOFormattedString(labsproductline)));
            mProductDetailTextView.setVisibility(0);
            return;
        } else
        {
            mProductDetailTextView.setVisibility(8);
            return;
        }
    }
}
