// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.consumerphotoeditor.fragments.ConsumerPhotoEditorActivity;

public final class bed
    implements Runnable
{

    private View a;

    public bed(ConsumerPhotoEditorActivity consumerphotoeditoractivity, View view)
    {
        a = view;
        super();
    }

    public final void run()
    {
        a.setVisibility(8);
    }
}
