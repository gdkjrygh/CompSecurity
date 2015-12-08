// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Property;
import android.view.View;
import java.util.Collections;
import java.util.List;

public final class det
{

    public static dfb a(View view, Property property)
    {
        return new deu(view, Collections.singletonList(property));
    }

    public static dfb a(View view, List list)
    {
        return new deu(view, list);
    }
}
