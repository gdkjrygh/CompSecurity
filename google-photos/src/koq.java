// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.feedback.FeedbackOptions;

public final class koq
{

    public static final jyh a;
    private static final jym b;
    private static final jyi c;

    static jym a()
    {
        return b;
    }

    public static jyt a(jyn jyn1, FeedbackOptions feedbackoptions)
    {
        return jyn1.a(new kos(jyn1, feedbackoptions));
    }

    static 
    {
        b = new jym();
        c = new kor();
        a = new jyh("Feedback.API", c, b);
    }
}
