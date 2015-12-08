// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import android.view.View;

// Referenced classes of package com.pinterest.activity.contacts:
//            UploadContactsFragment

public class _cls2
{

    public static void inject(butterknife.gment gment, final UploadContactsFragment target, Object obj)
    {
        class _cls1 extends DebouncingOnClickListener
        {

            final UploadContactsFragment val$target;

            public final void doClick(View view)
            {
                target.onUploadContactsClick((Button)view);
            }

            _cls1()
            {
                target = uploadcontactsfragment;
                super();
            }
        }

        gment.gment(obj, 0x7f0f02d4, "method 'onUploadContactsClick'").setOnClickListener(new _cls1());
        class _cls2 extends DebouncingOnClickListener
        {

            final UploadContactsFragment val$target;

            public final void doClick(View view)
            {
                target.onCancelClick((Button)view);
            }

            _cls2()
            {
                target = uploadcontactsfragment;
                super();
            }
        }

        gment.gment(obj, 0x7f0f01dd, "method 'onCancelClick'").setOnClickListener(new _cls2());
    }

    public static void reset(UploadContactsFragment uploadcontactsfragment)
    {
    }

    public _cls2()
    {
    }
}
