// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;


// Referenced classes of package com.google.zxing.client.result:
//            ParsedResult, ParsedResultType

public final class AddressBookParsedResult extends ParsedResult
{

    private final String addressTypes[];
    private final String addresses[];
    private final String birthday;
    private final String emailTypes[];
    private final String emails[];
    private final String geo[];
    private final String instantMessenger;
    private final String names[];
    private final String nicknames[];
    private final String note;
    private final String org;
    private final String phoneNumbers[];
    private final String phoneTypes[];
    private final String pronunciation;
    private final String title;
    private final String urls[];

    public AddressBookParsedResult(String as[], String as1[], String s, String as2[], String as3[], String as4[], String as5[], 
            String s1, String s2, String as6[], String as7[], String s3, String s4, String s5, 
            String as8[], String as9[])
    {
        super(ParsedResultType.ADDRESSBOOK);
        names = as;
        nicknames = as1;
        pronunciation = s;
        phoneNumbers = as2;
        phoneTypes = as3;
        emails = as4;
        emailTypes = as5;
        instantMessenger = s1;
        note = s2;
        addresses = as6;
        addressTypes = as7;
        org = s3;
        birthday = s4;
        title = s5;
        urls = as8;
        geo = as9;
    }

    public AddressBookParsedResult(String as[], String as1[], String as2[], String as3[], String as4[], String as5[], String as6[])
    {
        this(as, null, null, as1, as2, as3, as4, null, null, as5, as6, null, null, null, null, null);
    }

    public String[] getAddressTypes()
    {
        return addressTypes;
    }

    public String[] getAddresses()
    {
        return addresses;
    }

    public String getBirthday()
    {
        return birthday;
    }

    public String getDisplayResult()
    {
        StringBuilder stringbuilder = new StringBuilder(100);
        maybeAppend(names, stringbuilder);
        maybeAppend(nicknames, stringbuilder);
        maybeAppend(pronunciation, stringbuilder);
        maybeAppend(title, stringbuilder);
        maybeAppend(org, stringbuilder);
        maybeAppend(addresses, stringbuilder);
        maybeAppend(phoneNumbers, stringbuilder);
        maybeAppend(emails, stringbuilder);
        maybeAppend(instantMessenger, stringbuilder);
        maybeAppend(urls, stringbuilder);
        maybeAppend(birthday, stringbuilder);
        maybeAppend(geo, stringbuilder);
        maybeAppend(note, stringbuilder);
        return stringbuilder.toString();
    }

    public String[] getEmailTypes()
    {
        return emailTypes;
    }

    public String[] getEmails()
    {
        return emails;
    }

    public String[] getGeo()
    {
        return geo;
    }

    public String getInstantMessenger()
    {
        return instantMessenger;
    }

    public String[] getNames()
    {
        return names;
    }

    public String[] getNicknames()
    {
        return nicknames;
    }

    public String getNote()
    {
        return note;
    }

    public String getOrg()
    {
        return org;
    }

    public String[] getPhoneNumbers()
    {
        return phoneNumbers;
    }

    public String[] getPhoneTypes()
    {
        return phoneTypes;
    }

    public String getPronunciation()
    {
        return pronunciation;
    }

    public String getTitle()
    {
        return title;
    }

    public String[] getURLs()
    {
        return urls;
    }
}
