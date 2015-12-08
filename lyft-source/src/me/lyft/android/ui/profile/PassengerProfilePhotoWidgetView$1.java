// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.widget.ImageView;
import com.squareup.picasso.RequestCreator;
import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.profile:
//            PassengerProfilePhotoWidgetView, ProfilePhotoBlurBackgroundTransformation

class val.isSelf
    implements Action1
{

    final PassengerProfilePhotoWidgetView this$0;
    final boolean val$isSelf;
    final String val$userPhotoUrl;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        int i = photoImageView.getHeight();
        int j = photoImageView.getWidth();
        PassengerProfilePhotoWidgetView.access$000(PassengerProfilePhotoWidgetView.this, val$userPhotoUrl, val$isSelf).placeholder(photoImageView.getDrawable()).error(0x7f0201ba).resize(0, i).transform(new ProfilePhotoBlurBackgroundTransformation(getContext(), j, i)).into(photoImageView);
    }

    mation()
    {
        this$0 = final_passengerprofilephotowidgetview;
        val$userPhotoUrl = s;
        val$isSelf = Z.this;
        super();
    }
}
