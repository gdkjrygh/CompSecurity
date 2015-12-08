// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.View;
import java.util.List;

// Referenced classes of package com.appboy.ui.inappmessage:
//            IInAppMessageView

public interface IInAppMessageImmersiveView
    extends IInAppMessageView
{

    public abstract List getMessageButtonViews();

    public abstract View getMessageCloseButtonView();
}
