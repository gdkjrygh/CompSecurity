// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.google.android.apps.wallet.widgets.validation.ValidatedSpinnerAdapterWrapper;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            UserDataWidgetFactory

static final class mHintText extends ValidatedSpinnerAdapterWrapper
{

    private final String mHintText;
    private final String mValueArray[];

    public static mHintText createFromResource(Context context, int i, String as[], String s, int j, int k, int l)
    {
        ArrayAdapter arrayadapter = ArrayAdapter.createFromResource(context, i, j);
        arrayadapter.setDropDownViewResource(k);
        return new <init>(context, arrayadapter, as, s, l);
    }

    private String getItemValue(int i)
    {
        return mValueArray[i];
    }

    protected final String getHintText()
    {
        return mHintText;
    }

    protected final volatile Object getItemValue(int i)
    {
        return getItemValue(i);
    }

    private (Context context, ArrayAdapter arrayadapter, String as[], String s, int i)
    {
        super(context, arrayadapter, i);
        mValueArray = as;
        mHintText = s;
    }
}
