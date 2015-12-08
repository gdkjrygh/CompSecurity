// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui:
//            UserImageView

public class 
    implements butterknife.jector
{

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (UserImageView)obj, obj1);
    }

    public void inject(butterknife.jector jector, UserImageView userimageview, Object obj)
    {
        userimageview.userImageView = (ImageView)jector.geView((View)jector.geView(obj, 0x7f0d03e8, "field 'userImageView'"), 0x7f0d03e8, "field 'userImageView'");
        userimageview.partySizeTextView = (TextView)jector.zeTextView((View)jector.zeTextView(obj, 0x7f0d0416, "field 'partySizeTextView'"), 0x7f0d0416, "field 'partySizeTextView'");
    }

    public volatile void reset(Object obj)
    {
        reset((UserImageView)obj);
    }

    public void reset(UserImageView userimageview)
    {
        userimageview.userImageView = null;
        userimageview.partySizeTextView = null;
    }

    public ()
    {
    }
}
