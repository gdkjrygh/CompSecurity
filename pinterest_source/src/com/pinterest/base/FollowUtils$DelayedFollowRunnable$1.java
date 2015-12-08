// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import android.widget.BaseAdapter;
import com.pinterest.api.model.User;

class <init> extends com.pinterest.api.remote.
{

    final this._cls0 this$0;

    public void onFailure()
    {
        User user = cess._mth000(this._cls0.this);
        boolean flag;
        if (!cess._mth000(this._cls0.this).getFollowing().booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        user.setFollowing(flag);
        cess._mth100(this._cls0.this).notifyDataSetChanged();
    }

    public void onFinish()
    {
        if (cess._mth200(this._cls0.this) != null)
        {
            cess._mth200(this._cls0.this).onComplete();
        }
    }

    public void onSuccess(User user)
    {
        User.merge(user, cess._mth000(this._cls0.this));
    }

    layedFollowListener()
    {
        this$0 = this._cls0.this;
        super();
    }
}
