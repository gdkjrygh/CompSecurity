// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import dagger.b;

// Referenced classes of package com.soundcloud.android.creators.record:
//            RecordPresenter

public class RecordFragment extends LightCycleSupportFragment
{
    public static final class CreateState extends Enum
    {

        private static final CreateState $VALUES[];
        public static final CreateState EDIT;
        public static final CreateState EDIT_PLAYBACK;
        public static final CreateState IDLE_PLAYBACK;
        public static final CreateState IDLE_RECORD;
        public static final CreateState PLAYBACK;
        public static final CreateState RECORD;
        private final int titleId;

        public static CreateState valueOf(String s)
        {
            return (CreateState)Enum.valueOf(com/soundcloud/android/creators/record/RecordFragment$CreateState, s);
        }

        public static CreateState[] values()
        {
            return (CreateState[])$VALUES.clone();
        }

        public final int getTitleId()
        {
            return titleId;
        }

        public final boolean isEdit()
        {
            return this == EDIT || this == EDIT_PLAYBACK;
        }

        public final boolean isPlayState()
        {
            return this == PLAYBACK || this == EDIT_PLAYBACK;
        }

        static 
        {
            IDLE_RECORD = new CreateState("IDLE_RECORD", 0, 0x7f0701b0);
            RECORD = new CreateState("RECORD", 1, 0x7f0701b2);
            IDLE_PLAYBACK = new CreateState("IDLE_PLAYBACK", 2, 0x7f0701af);
            PLAYBACK = new CreateState("PLAYBACK", 3, 0x7f0701b1);
            EDIT = new CreateState("EDIT", 4, 0x7f0701ae);
            EDIT_PLAYBACK = new CreateState("EDIT_PLAYBACK", 5, 0x7f0701ae);
            $VALUES = (new CreateState[] {
                IDLE_RECORD, RECORD, IDLE_PLAYBACK, PLAYBACK, EDIT, EDIT_PLAYBACK
            });
        }

        private CreateState(String s, int i, int j)
        {
            super(s, i);
            titleId = j;
        }
    }


    RecordPresenter recordPresenter;

    public RecordFragment()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public static Fragment create()
    {
        return new RecordFragment();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300a6, viewgroup, false);
    }
}
