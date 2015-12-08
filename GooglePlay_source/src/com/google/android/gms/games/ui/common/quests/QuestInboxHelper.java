// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.quests;


// Referenced classes of package com.google.android.gms.games.ui.common.quests:
//            QuestEventListener

public abstract class QuestInboxHelper
    implements QuestEventListener
{
    public static interface QuestInboxHelperProvider
    {

        public abstract QuestInboxHelper getQuestInboxHelper();
    }


    public QuestInboxHelper()
    {
    }
}
