// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            LanguageSelector

static class choice
{

    RadioButton choice;
    TextView name;

    (View view)
    {
        name = (TextView)view.findViewById(0x7f0700e7);
        choice = (RadioButton)view.findViewById(0x7f0700e8);
    }
}
