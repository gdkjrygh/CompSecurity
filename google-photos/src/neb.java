// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

public final class neb
    implements android.widget.AdapterView.OnItemClickListener
{

    private LicenseMenuActivity a;

    public neb(LicenseMenuActivity licensemenuactivity)
    {
        a = licensemenuactivity;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (ndy)adapterview.getItemAtPosition(i);
        view = new Intent(a, com/google/android/libraries/social/licenses/LicenseActivity);
        view.putExtra("license", adapterview);
        a.startActivity(view);
    }
}
