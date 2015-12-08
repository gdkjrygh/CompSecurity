// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.photos.edittext.EditTextHolder;
import com.google.android.apps.photos.touchcapture.TouchCaptureView;

final class fgj
    implements fgk
{

    private fgf a;

    fgj(fgf fgf1)
    {
        a = fgf1;
        super();
    }

    public final void a(EditTextHolder edittextholder)
    {
        if (!fgf.a(a).ah_())
        {
            Object obj = fgf.b(a);
            edittextholder.a.setVisibility(8);
            edittextholder.c();
            String s = edittextholder.b.getText().toString();
            if (TextUtils.equals(edittextholder.f, s))
            {
                edittextholder.b.setSelection(0);
                edittextholder.b("");
            } else
            {
                edittextholder.b.setSelection(s.length());
            }
            obj = EditTextHolder.a(((android.content.Context) (obj)));
            if (obj != null)
            {
                ((InputMethodManager) (obj)).showSoftInput(edittextholder.b, 1);
            }
            if (fgf.c(a) == null)
            {
                fgf.a(a, new fgl(a));
            }
            if (fgf.d(a) != null)
            {
                fgf.d(a).a().a(fgf.c(a));
                return;
            }
        }
    }
}
