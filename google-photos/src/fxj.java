// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.photos.localmedia.ui.LocalPhotosActivity;

public final class fxj
{

    public int a;
    public ekq b;
    public ekw c;
    public int d;
    public String e;
    public String f;
    private final Context g;

    public fxj(Context context)
    {
        a = -1;
        c = ekw.a;
        d = 0;
        g = context;
    }

    public final Intent a()
    {
        Intent intent;
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "must set collection");
        intent = new Intent(g, com/google/android/apps/photos/localmedia/ui/LocalPhotosActivity);
        intent.putExtra("account_id", a);
        intent.putExtra("com.google.android.apps.photos.core.media_collection", b);
        intent.putExtra("com.google.android.apps.photos.core.query_options", c);
        if (d != 0)
        {
            intent.putExtra("com.google.android.apps.photos.selection.ExtraPhotoPickerMode", d);
        }
        if (!TextUtils.isEmpty(e))
        {
            intent.putExtra("com.google.android.apps.photos.selection.cabmode.extra_selection_title", e);
        }
        if (!TextUtils.isEmpty(f))
        {
            intent.putExtra("com.google.android.apps.photos.selection.cabmode.extra_selection_button_text", f);
        }
        return intent;
    }
}
