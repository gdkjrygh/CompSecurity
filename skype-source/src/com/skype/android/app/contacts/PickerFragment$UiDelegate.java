// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.os.Bundle;
import android.view.View;
import com.skype.ObjectInterface;

// Referenced classes of package com.skype.android.app.contacts:
//            PickerFragment

protected static interface 
{

    public abstract void onItemClicked(boolean flag, ObjectInterface objectinterface);

    public abstract void onViewCreated(View view, Bundle bundle);

    public abstract void saveInstanceState(Bundle bundle);
}
