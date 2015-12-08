// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import com.google.android.apps.photos.stories.StoryEditService;

public final class iqa
{

    final Intent a;

    public iqa(Context context, int i, pew apew[], iuj iuj, pgq pgq, Point apoint[])
    {
        a = new Intent(context, com/google/android/apps/photos/stories/StoryEditService);
        a.putExtra("edit_type", "edit_type_story");
        a.putExtra("account_id", i);
        a.putExtra("story_ref", iuj);
        a.putExtra("story_version", qlw.a(pgq));
        a.putExtra("story_render_sizes_dp", apoint);
        context = new Bundle();
        for (i = 0; i < apew.length; i++)
        {
            context.putByteArray(String.valueOf(i), qlw.a(apew[i]));
        }

        a.putExtra("story_edits", context);
    }
}
