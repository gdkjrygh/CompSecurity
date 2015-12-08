// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.net.Uri;

// Referenced classes of package bolts:
//            Task

public interface AppLinkResolver
{

    public abstract Task getAppLinkFromUrlInBackground(Uri uri);
}
