// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.model.Person;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.people.internal:
//            PeopleUtils

public final class PersonRef extends DataBufferRef
    implements Person
{

    public static final String ALL_COLUMNS[] = {
        "_id", "qualified_id", "gaia_id", "name", "sort_key", "sort_key_irank", "avatar", "profile_type", "v_circle_ids", "blocked", 
        "in_viewer_domain", "last_modified", "name_verified", "given_name", "family_name", "affinity1", "affinity2", "affinity3", "affinity4", "affinity5", 
        "people_in_common", "v_emails", "v_phones"
    };
    private final com.google.android.gms.people.internal.agg.PhoneEmailDecoder.EmailDecoder mEmailDecoder;
    private final boolean mEmailsWithAffinities;
    private final Bundle mMetadata;
    private final com.google.android.gms.people.internal.agg.PhoneEmailDecoder.PhoneDecoder mPhoneDecoder;

    public PersonRef(DataHolder dataholder, int i, Bundle bundle, com.google.android.gms.people.internal.agg.PhoneEmailDecoder.PhoneDecoder phonedecoder, com.google.android.gms.people.internal.agg.PhoneEmailDecoder.EmailDecoder emaildecoder)
    {
        super(dataholder, i);
        mMetadata = bundle;
        mPhoneDecoder = phonedecoder;
        mEmailDecoder = emaildecoder;
        mEmailsWithAffinities = mMetadata.getBoolean("emails_with_affinities", false);
    }

    public final String[] getBelongingCircleIds()
    {
        String s = getString("v_circle_ids");
        if (TextUtils.isEmpty(s))
        {
            return PeopleUtils.EMPTY_STRINGS;
        } else
        {
            return PeopleUtils.REGEX_COMMA.split(s, -1);
        }
    }

    public final String getGaiaId()
    {
        return getString("gaia_id");
    }

    public final String getName()
    {
        return getString("name");
    }

}
