// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.util.Log;
import com.google.android.apps.photos.stories.StoryElementPickerView;

public final class iqq extends azf
{

    private StoryElementPickerView a;

    public iqq(StoryElementPickerView storyelementpickerview)
    {
        a = storyelementpickerview;
        super();
    }

    public final void a(Drawable drawable)
    {
        a.a(drawable);
    }

    public final void a(Object obj, azp azp)
    {
        obj = (Drawable)obj;
        a.a(((Drawable) (obj)));
    }

    public final void b(Drawable drawable)
    {
        a.a(StoryElementPickerView.f());
    }

    public final void c(Drawable drawable)
    {
        Log.e("StoryElementPickerView", "Failed to load drawable for element picker view");
    }
}
