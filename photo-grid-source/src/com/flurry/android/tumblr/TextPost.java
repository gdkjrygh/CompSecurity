// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.android.tumblr;

import android.os.Bundle;
import android.text.TextUtils;

// Referenced classes of package com.flurry.android.tumblr:
//            Post

public class TextPost extends Post
{

    private String a;
    private String b;

    public TextPost(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Body to post cannot be null or empty");
        } else
        {
            b = s;
            return;
        }
    }

    String a()
    {
        return a;
    }

    String b()
    {
        return b;
    }

    Bundle c()
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.flurry.android.post_title", a());
        bundle.putString("com.flurry.android.post_body", b());
        bundle.putString("com.flurry.android.post_ios_deeplinks", e());
        bundle.putString("com.flurry.android.post_android_deeplinks", d());
        bundle.putString("com.flurry.android.post_weblink", f());
        bundle.putBoolean("com.flurry.android.is_text_post", true);
        bundle.putInt("com.flurry.android.post_id", g());
        return bundle;
    }

    public void setTitle(String s)
    {
        a = s;
    }
}
