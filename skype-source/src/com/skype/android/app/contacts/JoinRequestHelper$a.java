// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.Conversation;
import com.skype.android.concurrent.AsyncCallback;

// Referenced classes of package com.skype.android.app.contacts:
//            JoinRequestHelper

private static final class isPhone
{

    final String address;
    final AsyncCallback callback;
    final Conversation conversation;
    final boolean isPhone;
    String url;

    (Conversation conversation1, AsyncCallback asynccallback, String s, boolean flag)
    {
        conversation = conversation1;
        callback = asynccallback;
        address = s;
        isPhone = flag;
    }
}
