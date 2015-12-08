// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.CheckBox;
import com.google.android.apps.photos.daydream.DreamSettingsActivity;
import com.google.android.apps.photos.daydream.PhotosDreamService;
import java.util.Set;

public final class ezf
    implements android.view.View.OnClickListener
{

    private ekq a;
    private DreamSettingsActivity b;

    public ezf(DreamSettingsActivity dreamsettingsactivity, ekq ekq)
    {
        b = dreamsettingsactivity;
        super();
        a = ekq;
    }

    public final void onClick(View view)
    {
        view = (CheckBox)view.findViewById(u.c);
        boolean flag;
        if (!view.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setChecked(flag);
        if (view.isChecked())
        {
            DreamSettingsActivity.a(b).add(a);
        } else
        {
            DreamSettingsActivity.a(b).remove(a);
        }
        PhotosDreamService.a(DreamSettingsActivity.b(b), b, DreamSettingsActivity.a(b));
    }
}
