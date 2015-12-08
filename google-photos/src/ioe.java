// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

public final class ioe extends mtf
{

    static final ekk a = (new ekm()).a(hpe).b(gsn).b(hjp).a();
    private final ekq b;

    public ioe(ekq ekq1)
    {
        super("LoadResolvedMediaCollectionFeatureTask");
        b = ekq1;
    }

    public static boolean a(ekq ekq1)
    {
        return ekq1.b(hpe) != null && ekq1.b(gsn) != null && ekq1.b(hjp) != null;
    }

    protected final mue a(Context context)
    {
        context = b.b(context, b);
        mue mue1;
        try
        {
            context = (ekq)context.a(b, a).a();
            mue1 = new mue(true);
            mue1.a().putParcelable("story_media_collection", context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("LoadReqStoryFeatures", "CoreOperationException while trying to get MediaCollection in LoadResolvedMediaCollectionFeatureTask.");
            return new mue(false);
        }
        return mue1;
    }

}
