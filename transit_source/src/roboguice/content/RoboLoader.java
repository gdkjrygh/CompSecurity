// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.content;

import android.content.Context;
import android.support.v4.content.Loader;
import roboguice.RoboGuice;

public abstract class RoboLoader extends Loader
{

    public RoboLoader(Context context)
    {
        super(context);
        RoboGuice.injectMembers(context, this);
    }
}
