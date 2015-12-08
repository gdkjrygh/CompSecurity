// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.photos.remotemedia.ui.AlbumTitleCard;

final class hnq
    implements iwe
{

    private hnd a;

    hnq(hnd hnd1)
    {
        a = hnd1;
        super();
    }

    public final boolean a(MotionEvent motionevent)
    {
        android.widget.EditText edittext = hnd.f(a).a;
        int ai[] = new int[2];
        edittext.getLocationOnScreen(ai);
        int i = ai[0];
        int j = ai[1];
        int k = ai[0];
        int l = edittext.getWidth();
        int i1 = ai[1];
        if ((new Rect(i, j, k + l, edittext.getHeight() + i1)).contains((int)motionevent.getX(), (int)motionevent.getY()))
        {
            return false;
        }
        if (motionevent.getActionMasked() != 0)
        {
            return true;
        } else
        {
            hnd.g(a);
            return true;
        }
    }
}
