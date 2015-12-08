// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.kik.cache.c;
import com.kik.cards.usermedia.q;
import com.kik.sdkutils.LazyLoadingImage;
import com.kik.sdkutils.b.a;
import com.kik.sdkutils.b.b;

// Referenced classes of package kik.android.widget:
//            ThumbNailListView

public class UserMediaImageThumbNailList extends ThumbNailListView
{

    public UserMediaImageThumbNailList(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public UserMediaImageThumbNailList(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b();
    }

    protected final void a(c c, a a1, b b, View view, Object obj)
    {
        obj = (q)obj;
        ((LazyLoadingImage)view.findViewById(0x7f0e0165)).a(obj, c, a1, b);
    }
}
