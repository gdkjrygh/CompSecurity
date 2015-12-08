// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import com.soundcloud.android.utils.ErrorUtils;
import java.util.List;

// Referenced classes of package com.soundcloud.android.sync.likes:
//            LoadLikesPendingAdditionCommand, LoadLikesPendingRemovalCommand

public class MyLikesStateProvider
{

    private final LoadLikesPendingAdditionCommand loadLikesPendingAdditionCommand;
    private final LoadLikesPendingRemovalCommand loadLikesPendingRemovalCommand;

    public MyLikesStateProvider(LoadLikesPendingAdditionCommand loadlikespendingadditioncommand, LoadLikesPendingRemovalCommand loadlikespendingremovalcommand)
    {
        loadLikesPendingAdditionCommand = loadlikespendingadditioncommand;
        loadLikesPendingRemovalCommand = loadlikespendingremovalcommand;
    }

    public boolean hasLocalChanges()
    {
label0:
        {
label1:
            {
                boolean flag;
                try
                {
                    if (!((LoadLikesPendingAdditionCommand)loadLikesPendingAdditionCommand.with(Integer.valueOf(0))).call().isEmpty() || !((LoadLikesPendingAdditionCommand)loadLikesPendingAdditionCommand.with(Integer.valueOf(1))).call().isEmpty() || !((LoadLikesPendingRemovalCommand)loadLikesPendingRemovalCommand.with(Integer.valueOf(0))).call().isEmpty())
                    {
                        break label1;
                    }
                    flag = ((LoadLikesPendingRemovalCommand)loadLikesPendingRemovalCommand.with(Integer.valueOf(1))).call().isEmpty();
                }
                catch (Exception exception)
                {
                    ErrorUtils.handleSilentException(exception);
                    return false;
                }
                if (flag)
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }
}
