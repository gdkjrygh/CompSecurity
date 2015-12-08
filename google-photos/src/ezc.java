// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.RadioButton;
import com.google.android.apps.photos.daydream.DreamSettingsActivity;

public final class ezc
    implements android.view.View.OnClickListener
{

    private int a;
    private DreamSettingsActivity b;

    public ezc(DreamSettingsActivity dreamsettingsactivity, int i)
    {
        b = dreamsettingsactivity;
        super();
        a = i;
    }

    public final void onClick(View view)
    {
        if (((RadioButton)view.findViewById(u.g)).isChecked())
        {
            return;
        } else
        {
            DreamSettingsActivity.a(b, a);
            return;
        }
    }
}
