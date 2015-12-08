// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.cell.settings;

import an;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.CompoundButton;
import com.spotify.mobile.android.ui.activity.PermissionsActivity;
import com.spotify.mobile.android.util.Assertion;
import ctz;
import cu;
import da;
import dty;
import dzs;

// Referenced classes of package com.spotify.mobile.android.ui.cell.settings:
//            FacebookSettingsCell

final class a
    implements android.widget.dChangeListener
{

    final FacebookSettingsCell a;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag != FacebookSettingsCell.b(a))
        {
            a.a();
            if (flag)
            {
                FacebookSettingsCell.d(a).a(new an() {

                    private FacebookSettingsCell._cls3 a;

                    public final da a(Bundle bundle)
                    {
                        return new cu(a.a.getContext(), dty.a, FacebookSettingsCell.c(a.a), null, null);
                    }

                    public final void a()
                    {
                    }

                    public final void a(Object obj)
                    {
                        obj = (Cursor)obj;
                        ctz.a(obj);
                        if (((Cursor) (obj)).moveToFirst())
                        {
                            obj = ((Cursor) (obj)).getString(0);
                            if (!TextUtils.isEmpty(((CharSequence) (obj))) && ((String) (obj)).contains("publish_actions"))
                            {
                                Assertion.a(a.a.getContext(), "Context is null, checked state changed before view was initialized.");
                                obj = new Intent(a.a.getContext(), com/spotify/mobile/android/ui/activity/PermissionsActivity);
                                a.a.getContext().startActivity(((Intent) (obj)));
                            }
                            FacebookSettingsCell.d(a.a).a();
                        }
                    }

            
            {
                a = FacebookSettingsCell._cls3.this;
                super();
            }
                });
            }
        }
    }

    _cls1.a(FacebookSettingsCell facebooksettingscell)
    {
        a = facebooksettingscell;
        super();
    }
}
