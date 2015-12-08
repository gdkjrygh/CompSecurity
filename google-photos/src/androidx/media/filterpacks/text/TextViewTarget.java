// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.text;

import ahs;
import aif;
import aig;
import ajo;
import ajr;
import ajw;
import alg;
import android.widget.TextView;
import androidx.media.filterfw.ViewFilter;

public class TextViewTarget extends ViewFilter
{

    private TextView mTextView;

    public TextViewTarget(ajr ajr, String s)
    {
        super(ajr, s);
        mTextView = null;
    }

    public static TextView a(TextViewTarget textviewtarget)
    {
        return textviewtarget.mTextView;
    }

    public final ajw b()
    {
        return (new ajw()).a("text", 2, aif.a(java/lang/String)).a();
    }

    protected final void e()
    {
        String s = (String)a("text").a().d().m();
        if (mTextView != null)
        {
            mTextView.post(new alg(this, s));
        }
    }
}
