// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;

// Referenced classes of package me.lyft.android.controls:
//            AdvancedEditText

public class EmailAutoFillEditText extends AdvancedEditText
{

    static final String FILTER_GOOGLE_ACCOUNTS = "com.google";

    public EmailAutoFillEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (!isInEditMode())
        {
            setThreshold(1);
            attributeset = new ArrayAdapter(context, 0x109000a);
            setAdapter(attributeset);
            context = AccountManager.get(context).getAccountsByType("com.google");
            int j = context.length;
            int i = 0;
            while (i < j) 
            {
                attributeset.add(((Account) (context[i])).name);
                i++;
            }
        }
    }
}
