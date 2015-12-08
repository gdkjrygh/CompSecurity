// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.contacts;

import java.util.ArrayList;

// Referenced classes of package org.xwalk.core.internal.extension.api.contacts:
//            ContactConstants

static final class ypeValuesMap extends ArrayList
{

    tactMap()
    {
        add(new tactMap("emails", ContactConstants.emailDataMap, ContactConstants.emailTypeMap, ContactConstants.emailTypeValuesMap));
        add(new tactMap("photos", ContactConstants.photoDataMap, null, null));
        add(new tactMap("urls", ContactConstants.websiteDataMap, ContactConstants.websiteTypeMap, ContactConstants.websiteTypeValuesMap));
        add(new tactMap("phoneNumbers", ContactConstants.phoneDataMap, ContactConstants.phoneTypeMap, ContactConstants.phoneTypeValuesMap));
        add(new tactMap("addresses", ContactConstants.addressDataMap, ContactConstants.addressTypeMap, ContactConstants.addressTypeValuesMap));
        add(new tactMap("organizations", ContactConstants.companyDataMap, null, null));
        add(new tactMap("jobTitles", ContactConstants.jobtitleDataMap, null, null));
        add(new tactMap("notes", ContactConstants.noteDataMap, null, null));
        add(new tactMap("impp", ContactConstants.imDataMap, ContactConstants.imTypeMap, ContactConstants.imTypeValuesMap));
    }
}
