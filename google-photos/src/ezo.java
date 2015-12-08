// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.google.android.apps.photos.daydream.DreamSettingsActivity;
import java.util.List;

public final class ezo
    implements emj
{

    private DreamSettingsActivity a;

    public ezo(DreamSettingsActivity dreamsettingsactivity)
    {
        a = dreamsettingsactivity;
        super();
    }

    public final void a(elb elb1)
    {
        try
        {
            elb1 = (List)elb1.a();
            DreamSettingsActivity.a(a, null, elb1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (elb elb1)
        {
            Toast.makeText(a.getApplicationContext(), b.nC, 1).show();
        }
    }
}
