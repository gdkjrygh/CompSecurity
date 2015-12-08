// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.api.model.Timestamped;
import com.soundcloud.android.presentation.ListItem;

public interface StreamItem
    extends Timestamped, ListItem
{
    public static final class Kind extends Enum
    {

        private static final Kind $VALUES[];
        public static final Kind NOTIFICATION;
        public static final Kind PLAYABLE;
        public static final Kind PROMOTED;

        public static Kind valueOf(String s)
        {
            return (Kind)Enum.valueOf(com/soundcloud/android/stream/StreamItem$Kind, s);
        }

        public static Kind[] values()
        {
            return (Kind[])$VALUES.clone();
        }

        static 
        {
            PLAYABLE = new Kind("PLAYABLE", 0);
            PROMOTED = new Kind("PROMOTED", 1);
            NOTIFICATION = new Kind("NOTIFICATION", 2);
            $VALUES = (new Kind[] {
                PLAYABLE, PROMOTED, NOTIFICATION
            });
        }

        private Kind(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract Kind getKind();
}
