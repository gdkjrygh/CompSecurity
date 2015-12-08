// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.checkout;

import android.os.Bundle;

// Referenced classes of package com.dominos.fragments.checkout:
//            DominosFormValidationResult

public interface IDominosFormFragment
{

    public abstract void clearFields();

    public abstract Bundle getData();

    public abstract DominosFormValidationResult getValidationResult();

    public abstract void setData(Bundle bundle);
}
