// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.google.android.apps.photos.daydream.DreamSettingsActivity;
import java.util.List;

public final class ezm
    implements emj
{

    private DreamSettingsActivity a;

    public ezm(DreamSettingsActivity dreamsettingsactivity)
    {
        a = dreamsettingsactivity;
        super();
    }

    public final void a(elb elb1)
    {
        try
        {
            DreamSettingsActivity.a(a, (List)elb1.a(), null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (elb elb1)
        {
            elb1 = a.getString(b.nC);
        }
        Toast.makeText(a.getApplicationContext(), elb1, 1).show();
    }
}
