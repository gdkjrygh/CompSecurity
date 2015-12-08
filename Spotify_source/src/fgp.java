// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.style.StyleSpan;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class fgp
{

    public final Map a = new HashMap();
    public final StyleSpan b;
    public final Locale c = Locale.getDefault();
    public final fgm d;
    public boolean e;
    public String f;

    public fgp(StyleSpan stylespan)
    {
        f = "";
        b = (StyleSpan)ctz.a(stylespan);
        d = new fgm(c);
    }
}
