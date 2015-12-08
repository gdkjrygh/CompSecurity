// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.photos.localmedia.ui.LocalFoldersActivity;

final class dwr
    implements dwg
{

    private dum a;

    dwr(dwq dwq, dum dum1)
    {
        a = dum1;
        super();
    }

    public final void a(Context context)
    {
        Intent intent = new Intent(context, com/google/android/apps/photos/localmedia/ui/LocalFoldersActivity);
        intent.putExtra("account_id", a.a.a());
        context.startActivity(intent);
    }
}
