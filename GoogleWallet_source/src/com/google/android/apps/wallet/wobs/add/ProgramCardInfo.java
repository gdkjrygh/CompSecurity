// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.os.Parcelable;
import com.google.common.base.Optional;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            UserDataPrompt, ImageInfo

public interface ProgramCardInfo
    extends Parcelable
{

    public abstract ProgramCardInfo copy();

    public abstract String getAddMsgContent();

    public abstract String getAddMsgTitle();

    public abstract Optional getCardNumber();

    public abstract UserDataPrompt getColorPrompt();

    public abstract List getFormPrompts();

    public abstract ImageInfo getImage(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side side);

    public abstract ImageInfo[] getImages();

    public abstract String getLogoUrl();

    public abstract String getMerchantName();

    public abstract void setImages(ImageInfo aimageinfo[]);

    public abstract void setMerchantName(String s);
}
