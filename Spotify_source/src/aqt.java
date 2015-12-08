// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;
import java.util.EnumSet;

public final class aqt extends arw
{

    private String f;

    public aqt(Activity activity, String s)
    {
        super(activity);
        f = s;
    }

    protected final EnumSet a()
    {
        return EnumSet.of(com.facebook.internal.LikeActionController.LikeDialogFeature.a);
    }

    protected final Bundle b()
    {
        Bundle bundle = new Bundle();
        bundle.putString("object_id", f);
        return bundle;
    }
}
