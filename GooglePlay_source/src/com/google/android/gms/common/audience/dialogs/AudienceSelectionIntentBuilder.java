// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.audience.dialogs;

import android.content.Intent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.people.internal.PeopleUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class AudienceSelectionIntentBuilder
    implements AclSelection.Builder, AclSelection.Results, CircleSelection.Results, CircleSelection.UpdateBuilder
{

    private final Intent mIntent;

    public AudienceSelectionIntentBuilder(Intent intent)
    {
        mIntent = new Intent(intent);
    }

    public AudienceSelectionIntentBuilder(String s)
    {
        this((new Intent(s)).setPackage("com.google.android.gms"));
    }

    private AudienceSelectionIntentBuilder setAccountName(String s)
    {
        mIntent.putExtra("com.google.android.gms.common.acl.EXTRA_ACCOUNT_NAME", s);
        return this;
    }

    private AudienceSelectionIntentBuilder setInitialAudience(List list)
    {
        List list1 = list;
        if (list == null)
        {
            list1 = Collections.EMPTY_LIST;
        }
        Intent intent = mIntent;
        if (list1 instanceof ArrayList)
        {
            list = (ArrayList)list1;
        } else
        {
            list = new ArrayList(list1);
        }
        intent.putParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_INITIAL_AUDIENCE", list);
        return this;
    }

    private AudienceSelectionIntentBuilder setTitleText(String s)
    {
        mIntent.putExtra("com.google.android.gms.common.acl.EXTRA_TITLE_TEXT", s);
        return this;
    }

    public final Intent build()
    {
        return mIntent;
    }

    public final ArrayList getAddedCirclesDelta()
    {
        return mIntent.getParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_ADDED_AUDIENCE");
    }

    public final ArrayList getRemovedCirclesDelta()
    {
        return mIntent.getParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_REMOVED_AUDIENCE");
    }

    public final ArrayList getSelectedAudienceMembers()
    {
        Intent intent = mIntent;
        ArrayList arraylist = new ArrayList();
        Object obj;
        if (intent.hasExtra("com.google.android.gms.common.acl.EXTRA_INITIAL_AUDIENCE"))
        {
            obj = intent.getParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_INITIAL_AUDIENCE");
        } else
        {
            obj = Collections.emptyList();
        }
        if (obj != null && !((List) (obj)).isEmpty())
        {
            arraylist.addAll(((java.util.Collection) (obj)));
        }
        obj = intent.getParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_REMOVED_AUDIENCE");
        if (obj != null)
        {
            arraylist.removeAll(((java.util.Collection) (obj)));
        }
        obj = intent.getParcelableArrayListExtra("com.google.android.gms.common.acl.EXTRA_ADDED_AUDIENCE");
        if (obj != null)
        {
            arraylist.addAll(((java.util.Collection) (obj)));
        }
        return arraylist;
    }

    public final ArrayList getSelectedCircles()
    {
        return getSelectedAudienceMembers();
    }

    public final volatile AclSelection.Builder setAccountName(String s)
    {
        return setAccountName(s);
    }

    public final volatile CircleSelection.UpdateBuilder setAccountName(String s)
    {
        return setAccountName(s);
    }

    public final volatile AclSelection.Builder setInitialAcl(List list)
    {
        setInitialAudience(list);
        return this;
    }

    public final volatile CircleSelection.UpdateBuilder setInitialCircles(List list)
    {
        setInitialAudience(list);
        return this;
    }

    public final volatile AclSelection.Builder setTitleText(String s)
    {
        return setTitleText(s);
    }

    public final volatile CircleSelection.UpdateBuilder setTitleText(String s)
    {
        return setTitleText(s);
    }

    public final volatile CircleSelection.UpdateBuilder setUpdatePersonId(String s)
    {
        PeopleUtils.checkQualifiedId(s, "People qualified ID");
        SafeParcelableSerializer.serializeToIntentExtra(AudienceMember.forPersonWithPeopleQualifiedId(s, null, null), mIntent, "com.google.android.gms.common.acl.EXTRA_UPDATE_PERSON");
        return this;
    }
}
