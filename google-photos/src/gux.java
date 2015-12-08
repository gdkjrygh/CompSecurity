// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.apps.photos.photoeditor.intents.EditActivity;

public final class gux
    implements mpj
{

    private EditActivity a;

    public gux(EditActivity editactivity)
    {
        a = editactivity;
        super();
    }

    public final void a(int i, Intent intent)
    {
        if (i == -1)
        {
            EditActivity.a(a, intent);
            return;
        } else
        {
            a.finish();
            return;
        }
    }
}
