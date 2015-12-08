// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.kik.android.a;
import kik.a.d.aa;
import kik.a.e.w;
import kik.android.chat.KikApplication;
import kik.android.util.cc;
import kik.android.widget.KikFinderCodeImageView;

// Referenced classes of package kik.android.chat.fragment:
//            KikCodeFragment

final class is extends kik.android.util.cv.a
{

    final KikCodeFragment a;

    is(KikCodeFragment kikcodefragment)
    {
        a = kikcodefragment;
        super();
    }

    public final void a()
    {
        a.f.b("Share Code Tapped").a("Colour", kik.android.chat.b.a.a(KikCodeFragment.i(a))).b();
        Bitmap bitmap = Bitmap.createBitmap(a._drawArea.getWidth() + 40, a._drawArea.getWidth() + 40, android.graphics.Bitmap.Config.ARGB_8888);
        Object obj = new Canvas(bitmap);
        ((Canvas) (obj)).drawColor(kik.android.chat.b.a.b(KikCodeFragment.i(a)));
        ((Canvas) (obj)).drawBitmap(a._drawArea.e(), 20F, 20F, null);
        obj = a.e.d().c;
        String s;
        if (KikCodeFragment.j(a) == null)
        {
            s = KikApplication.a(0x7f09023d, new Object[] {
                obj
            });
            obj = (new StringBuilder()).append(s).append(" ").append(KikApplication.a(0x7f09008d, new Object[] {
                obj
            })).toString();
            s = KikApplication.f(0x7f090238);
        } else
        {
            obj = KikApplication.f(0x7f09023b);
            s = KikApplication.f(0x7f09023c);
        }
        cc.a(a.e.d(), a.getActivity(), a.f, bitmap, ((String) (obj)), null, s, kik.android.chat.b.a.a(KikCodeFragment.i(a)));
    }
}
