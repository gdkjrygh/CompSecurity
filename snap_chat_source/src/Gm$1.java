// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.snapchat.android.analytics.ui.EmojiPickerAnalytics;
import com.snapchat.android.ui.VerticalSwipeLayout;
import com.snapchat.android.ui.emojipicker.EmojiMovableImageView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

final class lang.Object
    implements android.view.OnClickListener
{

    private Gq a;
    private String b;
    private Gm c;

    public final void onClick(View view)
    {
        Object obj;
        Object obj1;
        int i;
        i = 1;
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        if (ai[1] > Jo.b(c.c) - c.c.getResources().getDimensionPixelSize(0x7f0a00a5))
        {
            return;
        }
        int j = a.l.getHeight();
        int k = a.l.getPaddingTop();
        int l = a.l.getPaddingBottom();
        obj = new EmojiMovableImageView(c.c, b, c.e, j - k - l);
        view = c.f;
        obj1 = a.l;
        Point point = zC.a(((qo) (view)).a);
        Point point1 = zC.a(((View) (obj1)));
        j = point1.x;
        k = ((View) (obj1)).getPaddingLeft();
        l = point.x;
        int i1 = point1.y;
        obj1 = new Point((j + k) - l, (((View) (obj1)).getPaddingTop() + i1) - point.y);
        ((qo) (view)).a.addView(((View) (obj)));
        ((EmojiMovableImageView) (obj)).a(((Point) (obj1)).x, ((Point) (obj1)).y);
        obj1 = ((qo) (view)).b;
        obj = ((EmojiMovableImageView) (obj)).h;
        String s = URLEncoder.encode(((String) (obj)), "UTF-8").replace("%", "");
        if (((EmojiPickerAnalytics) (obj1)).g.containsKey(s))
        {
            i = ((Integer)((EmojiPickerAnalytics) (obj1)).g.get(s)).intValue() + 1;
        }
        ((EmojiPickerAnalytics) (obj1)).g.put(s, Integer.valueOf(i));
        obj1.d = ((EmojiPickerAnalytics) (obj1)).d + 1;
_L2:
        ((qo) (view)).b.a();
        Gm.a(c, b);
        c.d.a(0, 0.0D);
        return;
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        ((EmojiPickerAnalytics) (obj1)).f.a(new lD(((String) (obj)), unsupportedencodingexception.toString()));
        if (true) goto _L2; else goto _L1
_L1:
    }

    >(Gm gm, Gq gq, String s)
    {
        c = gm;
        a = gq;
        b = s;
        super();
    }
}
