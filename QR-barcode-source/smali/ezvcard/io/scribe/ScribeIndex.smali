.class public Lezvcard/io/scribe/ScribeIndex;
.super Ljava/lang/Object;
.source "ScribeIndex.java"


# static fields
.field private static final standardByClass:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final standardByName:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final standardByQName:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljavax/xml/namespace/QName;",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private final extendedByClass:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;>;"
        }
    .end annotation
.end field

.field private final extendedByName:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;>;"
        }
    .end annotation
.end field

.field private final extendedByQName:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljavax/xml/namespace/QName;",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 77
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lezvcard/io/scribe/ScribeIndex;->standardByName:Ljava/util/Map;

    .line 78
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lezvcard/io/scribe/ScribeIndex;->standardByClass:Ljava/util/Map;

    .line 79
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lezvcard/io/scribe/ScribeIndex;->standardByQName:Ljava/util/Map;

    .line 82
    new-instance v0, Lezvcard/io/scribe/AddressScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/AddressScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 83
    new-instance v0, Lezvcard/io/scribe/AgentScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/AgentScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 84
    new-instance v0, Lezvcard/io/scribe/AnniversaryScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/AnniversaryScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 85
    new-instance v0, Lezvcard/io/scribe/BirthdayScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/BirthdayScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 86
    new-instance v0, Lezvcard/io/scribe/CalendarRequestUriScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/CalendarRequestUriScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 87
    new-instance v0, Lezvcard/io/scribe/CalendarUriScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/CalendarUriScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 88
    new-instance v0, Lezvcard/io/scribe/CategoriesScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/CategoriesScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 89
    new-instance v0, Lezvcard/io/scribe/ClassificationScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/ClassificationScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 90
    new-instance v0, Lezvcard/io/scribe/ClientPidMapScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/ClientPidMapScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 91
    new-instance v0, Lezvcard/io/scribe/EmailScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/EmailScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 92
    new-instance v0, Lezvcard/io/scribe/FreeBusyUrlScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/FreeBusyUrlScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 93
    new-instance v0, Lezvcard/io/scribe/FormattedNameScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/FormattedNameScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 94
    new-instance v0, Lezvcard/io/scribe/GenderScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/GenderScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 95
    new-instance v0, Lezvcard/io/scribe/GeoScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/GeoScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 96
    new-instance v0, Lezvcard/io/scribe/ImppScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/ImppScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 97
    new-instance v0, Lezvcard/io/scribe/KeyScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/KeyScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 98
    new-instance v0, Lezvcard/io/scribe/KindScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/KindScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 99
    new-instance v0, Lezvcard/io/scribe/LabelScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/LabelScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 100
    new-instance v0, Lezvcard/io/scribe/LanguageScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/LanguageScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 101
    new-instance v0, Lezvcard/io/scribe/LogoScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/LogoScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 102
    new-instance v0, Lezvcard/io/scribe/MailerScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/MailerScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 103
    new-instance v0, Lezvcard/io/scribe/MemberScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/MemberScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 104
    new-instance v0, Lezvcard/io/scribe/NicknameScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/NicknameScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 105
    new-instance v0, Lezvcard/io/scribe/NoteScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/NoteScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 106
    new-instance v0, Lezvcard/io/scribe/OrganizationScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/OrganizationScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 107
    new-instance v0, Lezvcard/io/scribe/PhotoScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/PhotoScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 108
    new-instance v0, Lezvcard/io/scribe/ProductIdScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/ProductIdScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 109
    new-instance v0, Lezvcard/io/scribe/ProfileScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/ProfileScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 110
    new-instance v0, Lezvcard/io/scribe/RelatedScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/RelatedScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 111
    new-instance v0, Lezvcard/io/scribe/RevisionScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/RevisionScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 112
    new-instance v0, Lezvcard/io/scribe/RoleScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/RoleScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 113
    new-instance v0, Lezvcard/io/scribe/SortStringScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/SortStringScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 114
    new-instance v0, Lezvcard/io/scribe/SoundScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/SoundScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 115
    new-instance v0, Lezvcard/io/scribe/SourceDisplayTextScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/SourceDisplayTextScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 116
    new-instance v0, Lezvcard/io/scribe/SourceScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/SourceScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 117
    new-instance v0, Lezvcard/io/scribe/StructuredNameScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/StructuredNameScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 118
    new-instance v0, Lezvcard/io/scribe/TelephoneScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/TelephoneScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 119
    new-instance v0, Lezvcard/io/scribe/TimezoneScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/TimezoneScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 120
    new-instance v0, Lezvcard/io/scribe/TitleScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/TitleScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 121
    new-instance v0, Lezvcard/io/scribe/UidScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/UidScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 122
    new-instance v0, Lezvcard/io/scribe/UrlScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/UrlScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 125
    new-instance v0, Lezvcard/io/scribe/XmlScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/XmlScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 128
    new-instance v0, Lezvcard/io/scribe/BirthplaceScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/BirthplaceScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 129
    new-instance v0, Lezvcard/io/scribe/DeathdateScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/DeathdateScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 130
    new-instance v0, Lezvcard/io/scribe/DeathplaceScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/DeathplaceScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 133
    new-instance v0, Lezvcard/io/scribe/ExpertiseScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/ExpertiseScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 134
    new-instance v0, Lezvcard/io/scribe/OrgDirectoryScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/OrgDirectoryScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 135
    new-instance v0, Lezvcard/io/scribe/InterestScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/InterestScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 136
    new-instance v0, Lezvcard/io/scribe/HobbyScribe;

    invoke-direct {v0}, Lezvcard/io/scribe/HobbyScribe;-><init>()V

    invoke-static {v0}, Lezvcard/io/scribe/ScribeIndex;->registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 137
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lezvcard/io/scribe/ScribeIndex;->extendedByName:Ljava/util/Map;

    .line 140
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lezvcard/io/scribe/ScribeIndex;->extendedByClass:Ljava/util/Map;

    .line 141
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lezvcard/io/scribe/ScribeIndex;->extendedByQName:Ljava/util/Map;

    return-void
.end method

.method private static registerStandard(Lezvcard/io/scribe/VCardPropertyScribe;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 231
    .local p0, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    sget-object v0, Lezvcard/io/scribe/ScribeIndex;->standardByName:Ljava/util/Map;

    invoke-virtual {p0}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    sget-object v0, Lezvcard/io/scribe/ScribeIndex;->standardByClass:Ljava/util/Map;

    invoke-virtual {p0}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    sget-object v0, Lezvcard/io/scribe/ScribeIndex;->standardByQName:Ljava/util/Map;

    invoke-virtual {p0}, Lezvcard/io/scribe/VCardPropertyScribe;->getQName()Ljavax/xml/namespace/QName;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    return-void
.end method


# virtual methods
.method public getPropertyScribe(Lezvcard/property/VCardProperty;)Lezvcard/io/scribe/VCardPropertyScribe;
    .locals 3
    .param p1, "property"    # Lezvcard/property/VCardProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/property/VCardProperty;",
            ")",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;"
        }
    .end annotation

    .prologue
    .line 179
    instance-of v1, p1, Lezvcard/property/RawProperty;

    if-eqz v1, :cond_0

    move-object v0, p1

    .line 180
    check-cast v0, Lezvcard/property/RawProperty;

    .line 181
    .local v0, "raw":Lezvcard/property/RawProperty;
    new-instance v1, Lezvcard/io/scribe/RawPropertyScribe;

    invoke-virtual {v0}, Lezvcard/property/RawProperty;->getPropertyName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lezvcard/io/scribe/RawPropertyScribe;-><init>(Ljava/lang/String;)V

    .line 184
    .end local v0    # "raw":Lezvcard/property/RawProperty;
    :goto_0
    return-object v1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0, v1}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v1

    goto :goto_0
.end method

.method public getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;"
        }
    .end annotation

    .prologue
    .line 165
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<+Lezvcard/property/VCardProperty;>;"
    iget-object v1, p0, Lezvcard/io/scribe/ScribeIndex;->extendedByClass:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/io/scribe/VCardPropertyScribe;

    .line 166
    .local v0, "marshaller":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    if-eqz v0, :cond_0

    .line 170
    .end local v0    # "marshaller":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    :goto_0
    return-object v0

    .restart local v0    # "marshaller":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    :cond_0
    sget-object v1, Lezvcard/io/scribe/ScribeIndex;->standardByClass:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lezvcard/io/scribe/VCardPropertyScribe;

    move-object v0, v1

    goto :goto_0
.end method

.method public getPropertyScribe(Ljava/lang/String;)Lezvcard/io/scribe/VCardPropertyScribe;
    .locals 2
    .param p1, "propertyName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;"
        }
    .end annotation

    .prologue
    .line 149
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    .line 151
    iget-object v1, p0, Lezvcard/io/scribe/ScribeIndex;->extendedByName:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/io/scribe/VCardPropertyScribe;

    .line 152
    .local v0, "marshaller":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    if-eqz v0, :cond_0

    .line 156
    .end local v0    # "marshaller":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    :goto_0
    return-object v0

    .restart local v0    # "marshaller":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    :cond_0
    sget-object v1, Lezvcard/io/scribe/ScribeIndex;->standardByName:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lezvcard/io/scribe/VCardPropertyScribe;

    move-object v0, v1

    goto :goto_0
.end method

.method public getPropertyScribe(Ljavax/xml/namespace/QName;)Lezvcard/io/scribe/VCardPropertyScribe;
    .locals 3
    .param p1, "qname"    # Ljavax/xml/namespace/QName;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/xml/namespace/QName;",
            ")",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;"
        }
    .end annotation

    .prologue
    .line 193
    iget-object v1, p0, Lezvcard/io/scribe/ScribeIndex;->extendedByQName:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/io/scribe/VCardPropertyScribe;

    .line 194
    .local v0, "marshaller":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    if-eqz v0, :cond_0

    move-object v1, v0

    .line 207
    :goto_0
    return-object v1

    .line 198
    :cond_0
    sget-object v1, Lezvcard/io/scribe/ScribeIndex;->standardByQName:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "marshaller":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    check-cast v0, Lezvcard/io/scribe/VCardPropertyScribe;

    .line 199
    .restart local v0    # "marshaller":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    if-eqz v0, :cond_1

    move-object v1, v0

    .line 200
    goto :goto_0

    .line 203
    :cond_1
    sget-object v1, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-virtual {v1}, Lezvcard/VCardVersion;->getXmlNamespace()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljavax/xml/namespace/QName;->getNamespaceURI()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 204
    new-instance v1, Lezvcard/io/scribe/RawPropertyScribe;

    invoke-virtual {p1}, Ljavax/xml/namespace/QName;->getLocalPart()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lezvcard/io/scribe/RawPropertyScribe;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 207
    :cond_2
    const-class v1, Lezvcard/property/Xml;

    invoke-virtual {p0, v1}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v1

    goto :goto_0
.end method

.method public register(Lezvcard/io/scribe/VCardPropertyScribe;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 215
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    iget-object v0, p0, Lezvcard/io/scribe/ScribeIndex;->extendedByName:Ljava/util/Map;

    invoke-virtual {p1}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    iget-object v0, p0, Lezvcard/io/scribe/ScribeIndex;->extendedByClass:Ljava/util/Map;

    invoke-virtual {p1}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    iget-object v0, p0, Lezvcard/io/scribe/ScribeIndex;->extendedByQName:Ljava/util/Map;

    invoke-virtual {p1}, Lezvcard/io/scribe/VCardPropertyScribe;->getQName()Ljavax/xml/namespace/QName;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    return-void
.end method

.method public unregister(Lezvcard/io/scribe/VCardPropertyScribe;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 225
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    iget-object v0, p0, Lezvcard/io/scribe/ScribeIndex;->extendedByName:Ljava/util/Map;

    invoke-virtual {p1}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    iget-object v0, p0, Lezvcard/io/scribe/ScribeIndex;->extendedByClass:Ljava/util/Map;

    invoke-virtual {p1}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    iget-object v0, p0, Lezvcard/io/scribe/ScribeIndex;->extendedByQName:Ljava/util/Map;

    invoke-virtual {p1}, Lezvcard/io/scribe/VCardPropertyScribe;->getQName()Ljavax/xml/namespace/QName;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    return-void
.end method
