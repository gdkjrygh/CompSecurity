// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCardVersion;
import ezvcard.property.RawProperty;
import ezvcard.property.VCardProperty;
import ezvcard.property.Xml;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;

// Referenced classes of package ezvcard.io.scribe:
//            AddressScribe, AgentScribe, AnniversaryScribe, BirthdayScribe, 
//            CalendarRequestUriScribe, CalendarUriScribe, CategoriesScribe, ClassificationScribe, 
//            ClientPidMapScribe, EmailScribe, FreeBusyUrlScribe, FormattedNameScribe, 
//            GenderScribe, GeoScribe, ImppScribe, KeyScribe, 
//            KindScribe, LabelScribe, LanguageScribe, LogoScribe, 
//            MailerScribe, MemberScribe, NicknameScribe, NoteScribe, 
//            OrganizationScribe, PhotoScribe, ProductIdScribe, ProfileScribe, 
//            RelatedScribe, RevisionScribe, RoleScribe, SortStringScribe, 
//            SoundScribe, SourceDisplayTextScribe, SourceScribe, StructuredNameScribe, 
//            TelephoneScribe, TimezoneScribe, TitleScribe, UidScribe, 
//            UrlScribe, XmlScribe, BirthplaceScribe, DeathdateScribe, 
//            DeathplaceScribe, ExpertiseScribe, OrgDirectoryScribe, InterestScribe, 
//            HobbyScribe, VCardPropertyScribe, RawPropertyScribe

public class ScribeIndex
{

    private static final Map standardByClass = new HashMap();
    private static final Map standardByName = new HashMap();
    private static final Map standardByQName = new HashMap();
    private final Map extendedByClass = new HashMap(0);
    private final Map extendedByName = new HashMap(0);
    private final Map extendedByQName = new HashMap(0);

    public ScribeIndex()
    {
    }

    private static void registerStandard(VCardPropertyScribe vcardpropertyscribe)
    {
        standardByName.put(vcardpropertyscribe.getPropertyName().toUpperCase(), vcardpropertyscribe);
        standardByClass.put(vcardpropertyscribe.getPropertyClass(), vcardpropertyscribe);
        standardByQName.put(vcardpropertyscribe.getQName(), vcardpropertyscribe);
    }

    public VCardPropertyScribe getPropertyScribe(VCardProperty vcardproperty)
    {
        if (vcardproperty instanceof RawProperty)
        {
            return new RawPropertyScribe(((RawProperty)vcardproperty).getPropertyName());
        } else
        {
            return getPropertyScribe(vcardproperty.getClass());
        }
    }

    public VCardPropertyScribe getPropertyScribe(Class class1)
    {
        VCardPropertyScribe vcardpropertyscribe = (VCardPropertyScribe)extendedByClass.get(class1);
        if (vcardpropertyscribe != null)
        {
            return vcardpropertyscribe;
        } else
        {
            return (VCardPropertyScribe)standardByClass.get(class1);
        }
    }

    public VCardPropertyScribe getPropertyScribe(String s)
    {
        s = s.toUpperCase();
        VCardPropertyScribe vcardpropertyscribe = (VCardPropertyScribe)extendedByName.get(s);
        if (vcardpropertyscribe != null)
        {
            return vcardpropertyscribe;
        } else
        {
            return (VCardPropertyScribe)standardByName.get(s);
        }
    }

    public VCardPropertyScribe getPropertyScribe(QName qname)
    {
        VCardPropertyScribe vcardpropertyscribe = (VCardPropertyScribe)extendedByQName.get(qname);
        if (vcardpropertyscribe != null)
        {
            return vcardpropertyscribe;
        }
        vcardpropertyscribe = (VCardPropertyScribe)standardByQName.get(qname);
        if (vcardpropertyscribe != null)
        {
            return vcardpropertyscribe;
        }
        if (VCardVersion.V4_0.getXmlNamespace().equals(qname.getNamespaceURI()))
        {
            return new RawPropertyScribe(qname.getLocalPart().toUpperCase());
        } else
        {
            return getPropertyScribe(ezvcard/property/Xml);
        }
    }

    public void register(VCardPropertyScribe vcardpropertyscribe)
    {
        extendedByName.put(vcardpropertyscribe.getPropertyName().toUpperCase(), vcardpropertyscribe);
        extendedByClass.put(vcardpropertyscribe.getPropertyClass(), vcardpropertyscribe);
        extendedByQName.put(vcardpropertyscribe.getQName(), vcardpropertyscribe);
    }

    public void unregister(VCardPropertyScribe vcardpropertyscribe)
    {
        extendedByName.remove(vcardpropertyscribe.getPropertyName().toUpperCase());
        extendedByClass.remove(vcardpropertyscribe.getPropertyClass());
        extendedByQName.remove(vcardpropertyscribe.getQName());
    }

    static 
    {
        registerStandard(new AddressScribe());
        registerStandard(new AgentScribe());
        registerStandard(new AnniversaryScribe());
        registerStandard(new BirthdayScribe());
        registerStandard(new CalendarRequestUriScribe());
        registerStandard(new CalendarUriScribe());
        registerStandard(new CategoriesScribe());
        registerStandard(new ClassificationScribe());
        registerStandard(new ClientPidMapScribe());
        registerStandard(new EmailScribe());
        registerStandard(new FreeBusyUrlScribe());
        registerStandard(new FormattedNameScribe());
        registerStandard(new GenderScribe());
        registerStandard(new GeoScribe());
        registerStandard(new ImppScribe());
        registerStandard(new KeyScribe());
        registerStandard(new KindScribe());
        registerStandard(new LabelScribe());
        registerStandard(new LanguageScribe());
        registerStandard(new LogoScribe());
        registerStandard(new MailerScribe());
        registerStandard(new MemberScribe());
        registerStandard(new NicknameScribe());
        registerStandard(new NoteScribe());
        registerStandard(new OrganizationScribe());
        registerStandard(new PhotoScribe());
        registerStandard(new ProductIdScribe());
        registerStandard(new ProfileScribe());
        registerStandard(new RelatedScribe());
        registerStandard(new RevisionScribe());
        registerStandard(new RoleScribe());
        registerStandard(new SortStringScribe());
        registerStandard(new SoundScribe());
        registerStandard(new SourceDisplayTextScribe());
        registerStandard(new SourceScribe());
        registerStandard(new StructuredNameScribe());
        registerStandard(new TelephoneScribe());
        registerStandard(new TimezoneScribe());
        registerStandard(new TitleScribe());
        registerStandard(new UidScribe());
        registerStandard(new UrlScribe());
        registerStandard(new XmlScribe());
        registerStandard(new BirthplaceScribe());
        registerStandard(new DeathdateScribe());
        registerStandard(new DeathplaceScribe());
        registerStandard(new ExpertiseScribe());
        registerStandard(new OrgDirectoryScribe());
        registerStandard(new InterestScribe());
        registerStandard(new HobbyScribe());
    }
}
