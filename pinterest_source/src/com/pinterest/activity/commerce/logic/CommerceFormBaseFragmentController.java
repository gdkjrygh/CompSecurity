// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import com.pinterest.activity.commerce.dialog.CommerceFormBaseFragment;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            CommerceFormBaseController

public interface CommerceFormBaseFragmentController
    extends CommerceFormBaseController
{

    public abstract void handleSaveClicked();

    public abstract void setFragment(CommerceFormBaseFragment commerceformbasefragment);
}
