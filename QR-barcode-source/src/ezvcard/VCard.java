// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;

import ezvcard.parameter.EmailType;
import ezvcard.parameter.TelephoneType;
import ezvcard.property.Address;
import ezvcard.property.Agent;
import ezvcard.property.Anniversary;
import ezvcard.property.Birthday;
import ezvcard.property.Birthplace;
import ezvcard.property.CalendarRequestUri;
import ezvcard.property.CalendarUri;
import ezvcard.property.Categories;
import ezvcard.property.Classification;
import ezvcard.property.ClientPidMap;
import ezvcard.property.Deathdate;
import ezvcard.property.Deathplace;
import ezvcard.property.Email;
import ezvcard.property.Expertise;
import ezvcard.property.FormattedName;
import ezvcard.property.FreeBusyUrl;
import ezvcard.property.Gender;
import ezvcard.property.Geo;
import ezvcard.property.HasAltId;
import ezvcard.property.Hobby;
import ezvcard.property.Impp;
import ezvcard.property.Interest;
import ezvcard.property.Key;
import ezvcard.property.Kind;
import ezvcard.property.Label;
import ezvcard.property.Language;
import ezvcard.property.Logo;
import ezvcard.property.Mailer;
import ezvcard.property.Member;
import ezvcard.property.Nickname;
import ezvcard.property.Note;
import ezvcard.property.OrgDirectory;
import ezvcard.property.Organization;
import ezvcard.property.Photo;
import ezvcard.property.ProductId;
import ezvcard.property.Profile;
import ezvcard.property.RawProperty;
import ezvcard.property.Related;
import ezvcard.property.Revision;
import ezvcard.property.Role;
import ezvcard.property.SortString;
import ezvcard.property.Sound;
import ezvcard.property.Source;
import ezvcard.property.SourceDisplayText;
import ezvcard.property.StructuredName;
import ezvcard.property.Telephone;
import ezvcard.property.Timezone;
import ezvcard.property.Title;
import ezvcard.property.Uid;
import ezvcard.property.Url;
import ezvcard.property.VCardProperty;
import ezvcard.property.Xml;
import ezvcard.util.ListMultimap;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.xml.transform.TransformerException;

// Referenced classes of package ezvcard:
//            VCardVersion, ValidationWarnings, Ezvcard

public class VCard
    implements Iterable
{

    private final ListMultimap properties = new ListMultimap();
    private VCardVersion version;

    public VCard()
    {
        version = VCardVersion.V3_0;
    }

    static String generateAltId(Collection collection)
    {
        HashSet hashset = new HashSet();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            String s = ((HasAltId)collection.next()).getAltId();
            if (s != null)
            {
                hashset.add(s);
            }
        } while (true);
        int i;
        for (i = 1; hashset.contains((new StringBuilder()).append(i).append("").toString()); i++) { }
        return (new StringBuilder()).append(i).append("").toString();
    }

    public void addAddress(Address address)
    {
        addProperty(address);
    }

    public void addAddressAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Address, collection);
    }

    public transient void addAddressAlt(Address aaddress[])
    {
        addPropertyAlt(ezvcard/property/Address, aaddress);
    }

    public void addCalendarRequestUri(CalendarRequestUri calendarrequesturi)
    {
        addProperty(calendarrequesturi);
    }

    public void addCalendarRequestUriAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/CalendarRequestUri, collection);
    }

    public transient void addCalendarRequestUriAlt(CalendarRequestUri acalendarrequesturi[])
    {
        addPropertyAlt(ezvcard/property/CalendarRequestUri, acalendarrequesturi);
    }

    public void addCalendarUri(CalendarUri calendaruri)
    {
        addProperty(calendaruri);
    }

    public void addCalendarUriAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/CalendarUri, collection);
    }

    public transient void addCalendarUriAlt(CalendarUri acalendaruri[])
    {
        addPropertyAlt(ezvcard/property/CalendarUri, acalendaruri);
    }

    public void addCategories(Categories categories)
    {
        addProperty(categories);
    }

    public void addCategoriesAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Categories, collection);
    }

    public transient void addCategoriesAlt(Categories acategories[])
    {
        addPropertyAlt(ezvcard/property/Categories, acategories);
    }

    public void addClientPidMap(ClientPidMap clientpidmap)
    {
        addProperty(clientpidmap);
    }

    public transient Email addEmail(String s, EmailType aemailtype[])
    {
        s = new Email(s);
        int j = aemailtype.length;
        for (int i = 0; i < j; i++)
        {
            s.addType(aemailtype[i]);
        }

        addEmail(((Email) (s)));
        return s;
    }

    public void addEmail(Email email)
    {
        addProperty(email);
    }

    public void addEmailAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Email, collection);
    }

    public transient void addEmailAlt(Email aemail[])
    {
        addPropertyAlt(ezvcard/property/Email, aemail);
    }

    public Expertise addExpertise(String s)
    {
        s = new Expertise(s);
        addExpertise(((Expertise) (s)));
        return s;
    }

    public void addExpertise(Expertise expertise)
    {
        addProperty(expertise);
    }

    public void addExpertiseAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Expertise, collection);
    }

    public transient void addExpertiseAlt(Expertise aexpertise[])
    {
        addPropertyAlt(ezvcard/property/Expertise, aexpertise);
    }

    public RawProperty addExtendedProperty(String s, String s1)
    {
        s = new RawProperty(s, s1);
        addProperty(s);
        return s;
    }

    public void addFbUrl(FreeBusyUrl freebusyurl)
    {
        addProperty(freebusyurl);
    }

    public void addFbUrlAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/FreeBusyUrl, collection);
    }

    public transient void addFbUrlAlt(FreeBusyUrl afreebusyurl[])
    {
        addPropertyAlt(ezvcard/property/FreeBusyUrl, afreebusyurl);
    }

    public void addFormattedName(FormattedName formattedname)
    {
        addProperty(formattedname);
    }

    public void addFormattedNameAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/FormattedName, collection);
    }

    public transient void addFormattedNameAlt(FormattedName aformattedname[])
    {
        addPropertyAlt(ezvcard/property/FormattedName, aformattedname);
    }

    public void addGeo(Geo geo)
    {
        addProperty(geo);
    }

    public void addGeoAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Geo, collection);
    }

    public transient void addGeoAlt(Geo ageo[])
    {
        addPropertyAlt(ezvcard/property/Geo, ageo);
    }

    public Hobby addHobby(String s)
    {
        s = new Hobby(s);
        addHobby(((Hobby) (s)));
        return s;
    }

    public void addHobby(Hobby hobby)
    {
        addProperty(hobby);
    }

    public void addHobbyAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Hobby, collection);
    }

    public transient void addHobbyAlt(Hobby ahobby[])
    {
        addPropertyAlt(ezvcard/property/Hobby, ahobby);
    }

    public void addImpp(Impp impp)
    {
        addProperty(impp);
    }

    public void addImppAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Impp, collection);
    }

    public transient void addImppAlt(Impp aimpp[])
    {
        addPropertyAlt(ezvcard/property/Impp, aimpp);
    }

    public Interest addInterest(String s)
    {
        s = new Interest(s);
        addInterest(((Interest) (s)));
        return s;
    }

    public void addInterest(Interest interest)
    {
        addProperty(interest);
    }

    public void addInterestAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Interest, collection);
    }

    public transient void addInterestAlt(Interest ainterest[])
    {
        addPropertyAlt(ezvcard/property/Interest, ainterest);
    }

    public void addKey(Key key)
    {
        addProperty(key);
    }

    public void addKeyAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Key, collection);
    }

    public transient void addKeyAlt(Key akey[])
    {
        addPropertyAlt(ezvcard/property/Key, akey);
    }

    public Language addLanguage(String s)
    {
        s = new Language(s);
        addLanguage(((Language) (s)));
        return s;
    }

    public void addLanguage(Language language)
    {
        addProperty(language);
    }

    public void addLanguageAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Language, collection);
    }

    public transient void addLanguageAlt(Language alanguage[])
    {
        addPropertyAlt(ezvcard/property/Language, alanguage);
    }

    public void addLogo(Logo logo)
    {
        addProperty(logo);
    }

    public void addLogoAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Logo, collection);
    }

    public transient void addLogoAlt(Logo alogo[])
    {
        addPropertyAlt(ezvcard/property/Logo, alogo);
    }

    public void addMember(Member member)
    {
        addProperty(member);
    }

    public void addMemberAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Member, collection);
    }

    public transient void addMemberAlt(Member amember[])
    {
        addPropertyAlt(ezvcard/property/Member, amember);
    }

    public void addNickname(Nickname nickname)
    {
        addProperty(nickname);
    }

    public void addNicknameAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Nickname, collection);
    }

    public transient void addNicknameAlt(Nickname anickname[])
    {
        addPropertyAlt(ezvcard/property/Nickname, anickname);
    }

    public Note addNote(String s)
    {
        s = new Note(s);
        addNote(((Note) (s)));
        return s;
    }

    public void addNote(Note note)
    {
        addProperty(note);
    }

    public void addNoteAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Note, collection);
    }

    public transient void addNoteAlt(Note anote[])
    {
        addPropertyAlt(ezvcard/property/Note, anote);
    }

    public OrgDirectory addOrgDirectory(String s)
    {
        s = new OrgDirectory(s);
        addOrgDirectory(((OrgDirectory) (s)));
        return s;
    }

    public void addOrgDirectory(OrgDirectory orgdirectory)
    {
        addProperty(orgdirectory);
    }

    public void addOrgDirectoryAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/OrgDirectory, collection);
    }

    public transient void addOrgDirectoryAlt(OrgDirectory aorgdirectory[])
    {
        addPropertyAlt(ezvcard/property/OrgDirectory, aorgdirectory);
    }

    public void addOrganization(Organization organization)
    {
        addProperty(organization);
    }

    public void addOrganizationAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Organization, collection);
    }

    public transient void addOrganizationAlt(Organization aorganization[])
    {
        addPropertyAlt(ezvcard/property/Organization, aorganization);
    }

    public void addOrphanedLabel(Label label)
    {
        addProperty(label);
    }

    public void addPhoto(Photo photo)
    {
        addProperty(photo);
    }

    public void addPhotoAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Photo, collection);
    }

    public transient void addPhotoAlt(Photo aphoto[])
    {
        addPropertyAlt(ezvcard/property/Photo, aphoto);
    }

    public void addProperty(VCardProperty vcardproperty)
    {
        properties.put(vcardproperty.getClass(), vcardproperty);
    }

    public void addPropertyAlt(Class class1, Collection collection)
    {
        class1 = generateAltId(getProperties(class1));
        VCardProperty vcardproperty;
        for (collection = collection.iterator(); collection.hasNext(); addProperty(vcardproperty))
        {
            vcardproperty = (VCardProperty)collection.next();
            ((HasAltId)vcardproperty).setAltId(class1);
        }

    }

    public transient void addPropertyAlt(Class class1, VCardProperty avcardproperty[])
    {
        addPropertyAlt(class1, ((Collection) (Arrays.asList(avcardproperty))));
    }

    public void addRelated(Related related)
    {
        addProperty(related);
    }

    public void addRelatedAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Related, collection);
    }

    public transient void addRelatedAlt(Related arelated[])
    {
        addPropertyAlt(ezvcard/property/Related, arelated);
    }

    public Role addRole(String s)
    {
        s = new Role(s);
        addRole(((Role) (s)));
        return s;
    }

    public void addRole(Role role)
    {
        addProperty(role);
    }

    public void addRoleAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Role, collection);
    }

    public transient void addRoleAlt(Role arole[])
    {
        addPropertyAlt(ezvcard/property/Role, arole);
    }

    public void addSound(Sound sound)
    {
        addProperty(sound);
    }

    public void addSoundAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Sound, collection);
    }

    public transient void addSoundAlt(Sound asound[])
    {
        addPropertyAlt(ezvcard/property/Sound, asound);
    }

    public Source addSource(String s)
    {
        s = new Source(s);
        addSource(((Source) (s)));
        return s;
    }

    public void addSource(Source source)
    {
        addProperty(source);
    }

    public void addSourceAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Source, collection);
    }

    public transient void addSourceAlt(Source asource[])
    {
        addPropertyAlt(ezvcard/property/Source, asource);
    }

    public transient Telephone addTelephoneNumber(String s, TelephoneType atelephonetype[])
    {
        s = new Telephone(s);
        int j = atelephonetype.length;
        for (int i = 0; i < j; i++)
        {
            s.addType(atelephonetype[i]);
        }

        addTelephoneNumber(((Telephone) (s)));
        return s;
    }

    public void addTelephoneNumber(Telephone telephone)
    {
        addProperty(telephone);
    }

    public void addTelephoneNumberAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Telephone, collection);
    }

    public transient void addTelephoneNumberAlt(Telephone atelephone[])
    {
        addPropertyAlt(ezvcard/property/Telephone, atelephone);
    }

    public void addTimezone(Timezone timezone)
    {
        addProperty(timezone);
    }

    public void addTimezoneAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Timezone, collection);
    }

    public transient void addTimezoneAlt(Timezone atimezone[])
    {
        addPropertyAlt(ezvcard/property/Timezone, atimezone);
    }

    public Title addTitle(String s)
    {
        s = new Title(s);
        addTitle(((Title) (s)));
        return s;
    }

    public void addTitle(Title title)
    {
        addProperty(title);
    }

    public void addTitleAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Title, collection);
    }

    public transient void addTitleAlt(Title atitle[])
    {
        addPropertyAlt(ezvcard/property/Title, atitle);
    }

    public Url addUrl(String s)
    {
        s = new Url(s);
        addUrl(((Url) (s)));
        return s;
    }

    public void addUrl(Url url)
    {
        addProperty(url);
    }

    public void addUrlAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Url, collection);
    }

    public transient void addUrlAlt(Url aurl[])
    {
        addPropertyAlt(ezvcard/property/Url, aurl);
    }

    public void addXml(Xml xml)
    {
        addProperty(xml);
    }

    public void addXmlAlt(Collection collection)
    {
        addPropertyAlt(ezvcard/property/Xml, collection);
    }

    public transient void addXmlAlt(Xml axml[])
    {
        addPropertyAlt(ezvcard/property/Xml, axml);
    }

    public List getAddresses()
    {
        return getProperties(ezvcard/property/Address);
    }

    public Agent getAgent()
    {
        return (Agent)getProperty(ezvcard/property/Agent);
    }

    public List getAnniversaries()
    {
        return getProperties(ezvcard/property/Anniversary);
    }

    public Anniversary getAnniversary()
    {
        return (Anniversary)getProperty(ezvcard/property/Anniversary);
    }

    public Birthday getBirthday()
    {
        return (Birthday)getProperty(ezvcard/property/Birthday);
    }

    public List getBirthdays()
    {
        return getProperties(ezvcard/property/Birthday);
    }

    public Birthplace getBirthplace()
    {
        return (Birthplace)getProperty(ezvcard/property/Birthplace);
    }

    public List getBirthplaces()
    {
        return getProperties(ezvcard/property/Birthplace);
    }

    public List getCalendarRequestUris()
    {
        return getProperties(ezvcard/property/CalendarRequestUri);
    }

    public List getCalendarUris()
    {
        return getProperties(ezvcard/property/CalendarUri);
    }

    public Categories getCategories()
    {
        return (Categories)getProperty(ezvcard/property/Categories);
    }

    public List getCategoriesList()
    {
        return getProperties(ezvcard/property/Categories);
    }

    public Classification getClassification()
    {
        return (Classification)getProperty(ezvcard/property/Classification);
    }

    public List getClientPidMaps()
    {
        return getProperties(ezvcard/property/ClientPidMap);
    }

    public Deathdate getDeathdate()
    {
        return (Deathdate)getProperty(ezvcard/property/Deathdate);
    }

    public List getDeathdates()
    {
        return getProperties(ezvcard/property/Deathdate);
    }

    public Deathplace getDeathplace()
    {
        return (Deathplace)getProperty(ezvcard/property/Deathplace);
    }

    public List getDeathplaces()
    {
        return getProperties(ezvcard/property/Deathplace);
    }

    public List getEmails()
    {
        return getProperties(ezvcard/property/Email);
    }

    public List getExpertise()
    {
        return getProperties(ezvcard/property/Expertise);
    }

    public List getExtendedProperties()
    {
        return getProperties(ezvcard/property/RawProperty);
    }

    public List getExtendedProperties(String s)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator1 = getProperties(ezvcard/property/RawProperty).iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            RawProperty rawproperty = (RawProperty)iterator1.next();
            if (rawproperty.getPropertyName().equalsIgnoreCase(s))
            {
                arraylist.add(rawproperty);
            }
        } while (true);
        return arraylist;
    }

    public RawProperty getExtendedProperty(String s)
    {
        for (Iterator iterator1 = getProperties(ezvcard/property/RawProperty).iterator(); iterator1.hasNext();)
        {
            RawProperty rawproperty = (RawProperty)iterator1.next();
            if (rawproperty.getPropertyName().equalsIgnoreCase(s))
            {
                return rawproperty;
            }
        }

        return null;
    }

    public List getFbUrls()
    {
        return getProperties(ezvcard/property/FreeBusyUrl);
    }

    public FormattedName getFormattedName()
    {
        return (FormattedName)getProperty(ezvcard/property/FormattedName);
    }

    public List getFormattedNames()
    {
        return getProperties(ezvcard/property/FormattedName);
    }

    public Gender getGender()
    {
        return (Gender)getProperty(ezvcard/property/Gender);
    }

    public Geo getGeo()
    {
        return (Geo)getProperty(ezvcard/property/Geo);
    }

    public List getGeos()
    {
        return getProperties(ezvcard/property/Geo);
    }

    public List getHobbies()
    {
        return getProperties(ezvcard/property/Hobby);
    }

    public List getImpps()
    {
        return getProperties(ezvcard/property/Impp);
    }

    public List getInterests()
    {
        return getProperties(ezvcard/property/Interest);
    }

    public List getKeys()
    {
        return getProperties(ezvcard/property/Key);
    }

    public Kind getKind()
    {
        return (Kind)getProperty(ezvcard/property/Kind);
    }

    public List getLanguages()
    {
        return getProperties(ezvcard/property/Language);
    }

    public List getLogos()
    {
        return getProperties(ezvcard/property/Logo);
    }

    public Mailer getMailer()
    {
        return (Mailer)getProperty(ezvcard/property/Mailer);
    }

    public List getMembers()
    {
        return getProperties(ezvcard/property/Member);
    }

    public Nickname getNickname()
    {
        return (Nickname)getProperty(ezvcard/property/Nickname);
    }

    public List getNicknames()
    {
        return getProperties(ezvcard/property/Nickname);
    }

    public List getNotes()
    {
        return getProperties(ezvcard/property/Note);
    }

    public List getOrgDirectories()
    {
        return getProperties(ezvcard/property/OrgDirectory);
    }

    public Organization getOrganization()
    {
        return (Organization)getProperty(ezvcard/property/Organization);
    }

    public List getOrganizations()
    {
        return getProperties(ezvcard/property/Organization);
    }

    public List getOrphanedLabels()
    {
        return getProperties(ezvcard/property/Label);
    }

    public List getPhotos()
    {
        return getProperties(ezvcard/property/Photo);
    }

    public ProductId getProdId()
    {
        return (ProductId)getProperty(ezvcard/property/ProductId);
    }

    public Profile getProfile()
    {
        return (Profile)getProperty(ezvcard/property/Profile);
    }

    public Collection getProperties()
    {
        return properties.values();
    }

    public List getProperties(Class class1)
    {
        Object obj = properties.get(class1);
        ArrayList arraylist = new ArrayList(((List) (obj)).size());
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(class1.cast((VCardProperty)((Iterator) (obj)).next()))) { }
        return arraylist;
    }

    public List getPropertiesAlt(Class class1)
    {
        Object obj = new ArrayList();
        Object obj1 = new ListMultimap();
        for (class1 = getProperties(class1).iterator(); class1.hasNext();)
        {
            VCardProperty vcardproperty1 = (VCardProperty)class1.next();
            String s = ((HasAltId)vcardproperty1).getAltId();
            if (s == null)
            {
                ((List) (obj)).add(vcardproperty1);
            } else
            {
                ((ListMultimap) (obj1)).put(s, vcardproperty1);
            }
        }

        class1 = new ArrayList();
        for (obj1 = ((ListMultimap) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); class1.add(((java.util.Map.Entry)((Iterator) (obj1)).next()).getValue())) { }
        ArrayList arraylist;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); class1.add(arraylist))
        {
            VCardProperty vcardproperty = (VCardProperty)((Iterator) (obj)).next();
            arraylist = new ArrayList(1);
            arraylist.add(vcardproperty);
        }

        return class1;
    }

    public VCardProperty getProperty(Class class1)
    {
        return (VCardProperty)class1.cast(properties.first(class1));
    }

    public List getRelations()
    {
        return getProperties(ezvcard/property/Related);
    }

    public Revision getRevision()
    {
        return (Revision)getProperty(ezvcard/property/Revision);
    }

    public List getRoles()
    {
        return getProperties(ezvcard/property/Role);
    }

    public SortString getSortString()
    {
        return (SortString)getProperty(ezvcard/property/SortString);
    }

    public List getSounds()
    {
        return getProperties(ezvcard/property/Sound);
    }

    public SourceDisplayText getSourceDisplayText()
    {
        return (SourceDisplayText)getProperty(ezvcard/property/SourceDisplayText);
    }

    public List getSources()
    {
        return getProperties(ezvcard/property/Source);
    }

    public StructuredName getStructuredName()
    {
        return (StructuredName)getProperty(ezvcard/property/StructuredName);
    }

    public List getStructuredNames()
    {
        return getProperties(ezvcard/property/StructuredName);
    }

    public List getTelephoneNumbers()
    {
        return getProperties(ezvcard/property/Telephone);
    }

    public Timezone getTimezone()
    {
        return (Timezone)getProperty(ezvcard/property/Timezone);
    }

    public List getTimezones()
    {
        return getProperties(ezvcard/property/Timezone);
    }

    public List getTitles()
    {
        return getProperties(ezvcard/property/Title);
    }

    public Uid getUid()
    {
        return (Uid)getProperty(ezvcard/property/Uid);
    }

    public List getUrls()
    {
        return getProperties(ezvcard/property/Url);
    }

    public VCardVersion getVersion()
    {
        return version;
    }

    public List getXmls()
    {
        return getProperties(ezvcard/property/Xml);
    }

    public Iterator iterator()
    {
        return properties.values().iterator();
    }

    public void removeExtendedProperty(String s)
    {
        RawProperty rawproperty;
        for (s = getExtendedProperties(s).iterator(); s.hasNext(); properties.remove(rawproperty.getClass(), rawproperty))
        {
            rawproperty = (RawProperty)s.next();
        }

    }

    public void removeProperties(Class class1)
    {
        properties.removeAll(class1);
    }

    public void removeProperty(VCardProperty vcardproperty)
    {
        properties.remove(vcardproperty.getClass(), vcardproperty);
    }

    public void setAgent(Agent agent)
    {
        setProperty(ezvcard/property/Agent, agent);
    }

    public void setAnniversary(Anniversary anniversary)
    {
        setProperty(ezvcard/property/Anniversary, anniversary);
    }

    public void setAnniversaryAlt(Collection collection)
    {
        setPropertyAlt(ezvcard/property/Anniversary, collection);
    }

    public transient void setAnniversaryAlt(Anniversary aanniversary[])
    {
        setPropertyAlt(ezvcard/property/Anniversary, aanniversary);
    }

    public void setBirthday(Birthday birthday)
    {
        setProperty(ezvcard/property/Birthday, birthday);
    }

    public void setBirthdayAlt(Collection collection)
    {
        setPropertyAlt(ezvcard/property/Birthday, collection);
    }

    public transient void setBirthdayAlt(Birthday abirthday[])
    {
        setPropertyAlt(ezvcard/property/Birthday, abirthday);
    }

    public void setBirthplace(Birthplace birthplace)
    {
        setProperty(ezvcard/property/Birthplace, birthplace);
    }

    public void setBirthplaceAlt(Collection collection)
    {
        setPropertyAlt(ezvcard/property/Birthplace, collection);
    }

    public transient void setBirthplaceAlt(Birthplace abirthplace[])
    {
        setPropertyAlt(ezvcard/property/Birthplace, abirthplace);
    }

    public transient Categories setCategories(String as[])
    {
        Categories categories = null;
        if (as != null)
        {
            Categories categories1 = new Categories();
            int j = as.length;
            int i = 0;
            do
            {
                categories = categories1;
                if (i >= j)
                {
                    break;
                }
                categories1.addValue(as[i]);
                i++;
            } while (true);
        }
        setCategories(categories);
        return categories;
    }

    public void setCategories(Categories categories)
    {
        setProperty(ezvcard/property/Categories, categories);
    }

    public void setCategoriesAlt(Collection collection)
    {
        setPropertyAlt(ezvcard/property/Categories, collection);
    }

    public transient void setCategoriesAlt(Categories acategories[])
    {
        setPropertyAlt(ezvcard/property/Categories, acategories);
    }

    public Classification setClassification(String s)
    {
        Classification classification = null;
        if (s != null)
        {
            classification = new Classification(s);
        }
        setClassification(classification);
        return classification;
    }

    public void setClassification(Classification classification)
    {
        setProperty(ezvcard/property/Classification, classification);
    }

    public void setDeathdate(Deathdate deathdate)
    {
        setProperty(ezvcard/property/Deathdate, deathdate);
    }

    public void setDeathdateAlt(Collection collection)
    {
        setPropertyAlt(ezvcard/property/Deathdate, collection);
    }

    public transient void setDeathdateAlt(Deathdate adeathdate[])
    {
        setPropertyAlt(ezvcard/property/Deathdate, adeathdate);
    }

    public void setDeathplace(Deathplace deathplace)
    {
        setProperty(ezvcard/property/Deathplace, deathplace);
    }

    public void setDeathplaceAlt(Collection collection)
    {
        setPropertyAlt(ezvcard/property/Deathplace, collection);
    }

    public transient void setDeathplaceAlt(Deathplace adeathplace[])
    {
        setPropertyAlt(ezvcard/property/Deathplace, adeathplace);
    }

    public RawProperty setExtendedProperty(String s, String s1)
    {
        removeExtendedProperty(s);
        s = new RawProperty(s, s1);
        addProperty(s);
        return s;
    }

    public FormattedName setFormattedName(String s)
    {
        FormattedName formattedname = null;
        if (s != null)
        {
            formattedname = new FormattedName(s);
        }
        setFormattedName(formattedname);
        return formattedname;
    }

    public void setFormattedName(FormattedName formattedname)
    {
        setProperty(ezvcard/property/FormattedName, formattedname);
    }

    public void setFormattedNameAlt(Collection collection)
    {
        setPropertyAlt(ezvcard/property/FormattedName, collection);
    }

    public transient void setFormattedNameAlt(FormattedName aformattedname[])
    {
        setPropertyAlt(ezvcard/property/FormattedName, aformattedname);
    }

    public void setGender(Gender gender)
    {
        setProperty(ezvcard/property/Gender, gender);
    }

    public Geo setGeo(double d, double d1)
    {
        Geo geo = new Geo(Double.valueOf(d), Double.valueOf(d1));
        setGeo(geo);
        return geo;
    }

    public void setGeo(Geo geo)
    {
        setProperty(ezvcard/property/Geo, geo);
    }

    public void setGeoAlt(Collection collection)
    {
        setPropertyAlt(ezvcard/property/Geo, collection);
    }

    public void setKind(Kind kind)
    {
        setProperty(ezvcard/property/Kind, kind);
    }

    public Mailer setMailer(String s)
    {
        Mailer mailer = null;
        if (s != null)
        {
            mailer = new Mailer(s);
        }
        setMailer(mailer);
        return mailer;
    }

    public void setMailer(Mailer mailer)
    {
        setProperty(ezvcard/property/Mailer, mailer);
    }

    public transient Nickname setNickname(String as[])
    {
        Nickname nickname = null;
        if (as != null)
        {
            Nickname nickname1 = new Nickname();
            int j = as.length;
            int i = 0;
            do
            {
                nickname = nickname1;
                if (i >= j)
                {
                    break;
                }
                nickname1.addValue(as[i]);
                i++;
            } while (true);
        }
        setNickname(nickname);
        return nickname;
    }

    public void setNickname(Nickname nickname)
    {
        setProperty(ezvcard/property/Nickname, nickname);
    }

    public void setNicknameAlt(Collection collection)
    {
        setPropertyAlt(ezvcard/property/Nickname, collection);
    }

    public transient void setNicknameAlt(Nickname anickname[])
    {
        setPropertyAlt(ezvcard/property/Nickname, anickname);
    }

    public transient Organization setOrganization(String as[])
    {
        Organization organization = null;
        if (as != null)
        {
            Organization organization1 = new Organization();
            int j = as.length;
            int i = 0;
            do
            {
                organization = organization1;
                if (i >= j)
                {
                    break;
                }
                organization1.addValue(as[i]);
                i++;
            } while (true);
        }
        setOrganization(organization);
        return organization;
    }

    public void setOrganization(Organization organization)
    {
        setProperty(ezvcard/property/Organization, organization);
    }

    public void setOrganizationAlt(Collection collection)
    {
        setPropertyAlt(ezvcard/property/Organization, collection);
    }

    public transient void setOrganizationAlt(Organization aorganization[])
    {
        setPropertyAlt(ezvcard/property/Organization, aorganization);
    }

    public ProductId setProdId(String s)
    {
        ProductId productid = null;
        if (s != null)
        {
            productid = new ProductId(s);
        }
        setProdId(productid);
        return productid;
    }

    public void setProdId(ProductId productid)
    {
        setProperty(ezvcard/property/ProductId, productid);
    }

    public void setProfile(Profile profile)
    {
        setProperty(ezvcard/property/Profile, profile);
    }

    public void setProperty(Class class1, VCardProperty vcardproperty)
    {
        properties.replace(class1, vcardproperty);
    }

    public void setPropertyAlt(Class class1, Collection collection)
    {
        removeProperties(class1);
        addPropertyAlt(class1, collection);
    }

    public transient void setPropertyAlt(Class class1, VCardProperty avcardproperty[])
    {
        removeProperties(class1);
        addPropertyAlt(class1, avcardproperty);
    }

    public Revision setRevision(Date date)
    {
        Revision revision = null;
        if (date != null)
        {
            revision = new Revision(date);
        }
        setRevision(revision);
        return revision;
    }

    public void setRevision(Revision revision)
    {
        setProperty(ezvcard/property/Revision, revision);
    }

    public SortString setSortString(String s)
    {
        SortString sortstring = null;
        if (s != null)
        {
            sortstring = new SortString(s);
        }
        setSortString(sortstring);
        return sortstring;
    }

    public void setSortString(SortString sortstring)
    {
        setProperty(ezvcard/property/SortString, sortstring);
    }

    public SourceDisplayText setSourceDisplayText(String s)
    {
        SourceDisplayText sourcedisplaytext = null;
        if (s != null)
        {
            sourcedisplaytext = new SourceDisplayText(s);
        }
        setSourceDisplayText(sourcedisplaytext);
        return sourcedisplaytext;
    }

    public void setSourceDisplayText(SourceDisplayText sourcedisplaytext)
    {
        setProperty(ezvcard/property/SourceDisplayText, sourcedisplaytext);
    }

    public void setStructuredName(StructuredName structuredname)
    {
        setProperty(ezvcard/property/StructuredName, structuredname);
    }

    public void setStructuredNameAlt(Collection collection)
    {
        setPropertyAlt(ezvcard/property/StructuredName, collection);
    }

    public transient void setStructuredNameAlt(StructuredName astructuredname[])
    {
        setPropertyAlt(ezvcard/property/StructuredName, astructuredname);
    }

    public void setTimezone(Timezone timezone)
    {
        setProperty(ezvcard/property/Timezone, timezone);
    }

    public void setTimezoneAlt(Collection collection)
    {
        setPropertyAlt(ezvcard/property/Timezone, collection);
    }

    public transient void setTimezoneAlt(Timezone atimezone[])
    {
        setPropertyAlt(ezvcard/property/Timezone, atimezone);
    }

    public void setUid(Uid uid)
    {
        setProperty(ezvcard/property/Uid, uid);
    }

    public void setVersion(VCardVersion vcardversion)
    {
        version = vcardversion;
    }

    public ValidationWarnings validate(VCardVersion vcardversion)
    {
        ArrayList arraylist = new ArrayList();
        Object obj = new ArrayList();
        if (getStructuredName() == null && (vcardversion == VCardVersion.V2_1 || vcardversion == VCardVersion.V3_0))
        {
            ((List) (obj)).add("A structured name property must be defined.");
        }
        if (getFormattedName() == null && (vcardversion == VCardVersion.V3_0 || vcardversion == VCardVersion.V4_0))
        {
            ((List) (obj)).add("A formatted name property must be defined.");
        }
        if (!((List) (obj)).isEmpty())
        {
            arraylist.add(new ValidationWarnings.WarningsGroup(null, ((List) (obj))));
        }
        obj = iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            VCardProperty vcardproperty = (VCardProperty)((Iterator) (obj)).next();
            List list = vcardproperty.validate(vcardversion, this);
            if (!list.isEmpty())
            {
                arraylist.add(new ValidationWarnings.WarningsGroup(vcardproperty, list));
            }
        } while (true);
        return new ValidationWarnings(arraylist, vcardversion);
    }

    public String write()
    {
        return Ezvcard.write(new VCard[] {
            this
        }).go();
    }

    public void write(File file)
        throws IOException
    {
        Ezvcard.write(new VCard[] {
            this
        }).go(file);
    }

    public void write(OutputStream outputstream)
        throws IOException
    {
        Ezvcard.write(new VCard[] {
            this
        }).go(outputstream);
    }

    public void write(Writer writer)
        throws IOException
    {
        Ezvcard.write(new VCard[] {
            this
        }).go(writer);
    }

    public String writeHtml()
    {
        return Ezvcard.writeHtml(new VCard[] {
            this
        }).go();
    }

    public void writeHtml(File file)
        throws IOException
    {
        Ezvcard.writeHtml(new VCard[] {
            this
        }).go(file);
    }

    public void writeHtml(OutputStream outputstream)
        throws IOException
    {
        Ezvcard.writeHtml(new VCard[] {
            this
        }).go(outputstream);
    }

    public void writeHtml(Writer writer)
        throws IOException
    {
        Ezvcard.writeHtml(new VCard[] {
            this
        }).go(writer);
    }

    public String writeJson()
    {
        return Ezvcard.writeJson(new VCard[] {
            this
        }).go();
    }

    public void writeJson(File file)
        throws IOException
    {
        Ezvcard.writeJson(new VCard[] {
            this
        }).go(file);
    }

    public void writeJson(OutputStream outputstream)
        throws IOException
    {
        Ezvcard.writeJson(new VCard[] {
            this
        }).go(outputstream);
    }

    public void writeJson(Writer writer)
        throws IOException
    {
        Ezvcard.writeJson(new VCard[] {
            this
        }).go(writer);
    }

    public String writeXml()
    {
        return Ezvcard.writeXml(new VCard[] {
            this
        }).indent(2).go();
    }

    public void writeXml(File file)
        throws IOException, TransformerException
    {
        Ezvcard.writeXml(new VCard[] {
            this
        }).indent(2).go(file);
    }

    public void writeXml(OutputStream outputstream)
        throws TransformerException
    {
        Ezvcard.writeXml(new VCard[] {
            this
        }).indent(2).go(outputstream);
    }

    public void writeXml(Writer writer)
        throws TransformerException
    {
        Ezvcard.writeXml(new VCard[] {
            this
        }).indent(2).go(writer);
    }
}
