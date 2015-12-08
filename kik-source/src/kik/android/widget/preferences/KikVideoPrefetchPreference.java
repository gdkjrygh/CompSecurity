// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.kik.e.a;
import kik.a.e.v;

// Referenced classes of package kik.android.widget.preferences:
//            KikListPreference, ai

public class KikVideoPrefetchPreference extends KikListPreference
{

    protected com.kik.android.a a;
    protected v b;

    public KikVideoPrefetchPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public final void a(a a1)
    {
        a1.a(this);
        setValue(b.n("kik.chat.video.prefetch"));
    }

    protected void onBindView(View view)
    {
        super.onBindView(view);
        setOnPreferenceChangeListener(new ai(this));
    }
}
