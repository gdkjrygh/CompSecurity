.class public Lezvcard/VCard;
.super Ljava/lang/Object;
.source "VCard.java"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable",
        "<",
        "Lezvcard/property/VCardProperty;",
        ">;"
    }
.end annotation


# instance fields
.field private final properties:Lezvcard/util/ListMultimap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lezvcard/util/ListMultimap",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;",
            "Lezvcard/property/VCardProperty;",
            ">;"
        }
    .end annotation
.end field

.field private version:Lezvcard/VCardVersion;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    sget-object v0, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    iput-object v0, p0, Lezvcard/VCard;->version:Lezvcard/VCardVersion;

    .line 114
    new-instance v0, Lezvcard/util/ListMultimap;

    invoke-direct {v0}, Lezvcard/util/ListMultimap;-><init>()V

    iput-object v0, p0, Lezvcard/VCard;->properties:Lezvcard/util/ListMultimap;

    return-void
.end method

.method static generateAltId(Ljava/util/Collection;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lezvcard/property/HasAltId;",
            ">(",
            "Ljava/util/Collection",
            "<TT;>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 4718
    .local p0, "properties":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 4719
    .local v1, "altIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lezvcard/property/HasAltId;

    .line 4720
    .local v3, "property":Lezvcard/property/HasAltId;, "TT;"
    invoke-interface {v3}, Lezvcard/property/HasAltId;->getAltId()Ljava/lang/String;

    move-result-object v0

    .line 4721
    .local v0, "altId":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 4722
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 4726
    .end local v0    # "altId":Ljava/lang/String;
    .end local v3    # "property":Lezvcard/property/HasAltId;, "TT;"
    :cond_1
    const/4 v0, 0x1

    .line 4727
    .local v0, "altId":I
    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 4728
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 4730
    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    return-object v4
.end method


# virtual methods
.method public addAddress(Lezvcard/property/Address;)V
    .locals 0
    .param p1, "address"    # Lezvcard/property/Address;

    .prologue
    .line 2290
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 2291
    return-void
.end method

.method public addAddressAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Address;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 2310
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Address;>;"
    const-class v0, Lezvcard/property/Address;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 2311
    return-void
.end method

.method public varargs addAddressAlt([Lezvcard/property/Address;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Address;

    .prologue
    .line 2330
    const-class v0, Lezvcard/property/Address;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 2331
    return-void
.end method

.method public addCalendarRequestUri(Lezvcard/property/CalendarRequestUri;)V
    .locals 0
    .param p1, "calendarRequestUri"    # Lezvcard/property/CalendarRequestUri;

    .prologue
    .line 3798
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 3799
    return-void
.end method

.method public addCalendarRequestUriAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/CalendarRequestUri;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 3817
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/CalendarRequestUri;>;"
    const-class v0, Lezvcard/property/CalendarRequestUri;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 3818
    return-void
.end method

.method public varargs addCalendarRequestUriAlt([Lezvcard/property/CalendarRequestUri;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/CalendarRequestUri;

    .prologue
    .line 3836
    const-class v0, Lezvcard/property/CalendarRequestUri;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 3837
    return-void
.end method

.method public addCalendarUri(Lezvcard/property/CalendarUri;)V
    .locals 0
    .param p1, "calendarUri"    # Lezvcard/property/CalendarUri;

    .prologue
    .line 3864
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 3865
    return-void
.end method

.method public addCalendarUriAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/CalendarUri;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 3883
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/CalendarUri;>;"
    const-class v0, Lezvcard/property/CalendarUri;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 3884
    return-void
.end method

.method public varargs addCalendarUriAlt([Lezvcard/property/CalendarUri;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/CalendarUri;

    .prologue
    .line 3902
    const-class v0, Lezvcard/property/CalendarUri;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 3903
    return-void
.end method

.method public addCategories(Lezvcard/property/Categories;)V
    .locals 0
    .param p1, "categories"    # Lezvcard/property/Categories;

    .prologue
    .line 3314
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 3315
    return-void
.end method

.method public addCategoriesAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Categories;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 3256
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Categories;>;"
    const-class v0, Lezvcard/property/Categories;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 3257
    return-void
.end method

.method public varargs addCategoriesAlt([Lezvcard/property/Categories;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Categories;

    .prologue
    .line 3276
    const-class v0, Lezvcard/property/Categories;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 3277
    return-void
.end method

.method public addClientPidMap(Lezvcard/property/ClientPidMap;)V
    .locals 0
    .param p1, "clientPidMap"    # Lezvcard/property/ClientPidMap;

    .prologue
    .line 4000
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 4001
    return-void
.end method

.method public varargs addEmail(Ljava/lang/String;[Lezvcard/parameter/EmailType;)Lezvcard/property/Email;
    .locals 5
    .param p1, "email"    # Ljava/lang/String;
    .param p2, "types"    # [Lezvcard/parameter/EmailType;

    .prologue
    .line 2407
    new-instance v4, Lezvcard/property/Email;

    invoke-direct {v4, p1}, Lezvcard/property/Email;-><init>(Ljava/lang/String;)V

    .line 2408
    .local v4, "type":Lezvcard/property/Email;
    move-object v0, p2

    .local v0, "arr$":[Lezvcard/parameter/EmailType;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    .line 2409
    .local v3, "t":Lezvcard/parameter/EmailType;
    invoke-virtual {v4, v3}, Lezvcard/property/Email;->addType(Lezvcard/parameter/EmailType;)V

    .line 2408
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2411
    .end local v3    # "t":Lezvcard/parameter/EmailType;
    :cond_0
    invoke-virtual {p0, v4}, Lezvcard/VCard;->addEmail(Lezvcard/property/Email;)V

    .line 2412
    return-object v4
.end method

.method public addEmail(Lezvcard/property/Email;)V
    .locals 0
    .param p1, "email"    # Lezvcard/property/Email;

    .prologue
    .line 2390
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 2391
    return-void
.end method

.method public addEmailAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Email;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 2432
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Email;>;"
    const-class v0, Lezvcard/property/Email;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 2433
    return-void
.end method

.method public varargs addEmailAlt([Lezvcard/property/Email;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Email;

    .prologue
    .line 2452
    const-class v0, Lezvcard/property/Email;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 2453
    return-void
.end method

.method public addExpertise(Ljava/lang/String;)Lezvcard/property/Expertise;
    .locals 1
    .param p1, "expertise"    # Ljava/lang/String;

    .prologue
    .line 4122
    new-instance v0, Lezvcard/property/Expertise;

    invoke-direct {v0, p1}, Lezvcard/property/Expertise;-><init>(Ljava/lang/String;)V

    .line 4123
    .local v0, "type":Lezvcard/property/Expertise;
    invoke-virtual {p0, v0}, Lezvcard/VCard;->addExpertise(Lezvcard/property/Expertise;)V

    .line 4124
    return-object v0
.end method

.method public addExpertise(Lezvcard/property/Expertise;)V
    .locals 0
    .param p1, "expertise"    # Lezvcard/property/Expertise;

    .prologue
    .line 4104
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 4105
    return-void
.end method

.method public addExpertiseAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Expertise;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 4144
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Expertise;>;"
    const-class v0, Lezvcard/property/Expertise;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 4145
    return-void
.end method

.method public varargs addExpertiseAlt([Lezvcard/property/Expertise;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Expertise;

    .prologue
    .line 4164
    const-class v0, Lezvcard/property/Expertise;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 4165
    return-void
.end method

.method public addExtendedProperty(Ljava/lang/String;Ljava/lang/String;)Lezvcard/property/RawProperty;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 4586
    new-instance v0, Lezvcard/property/RawProperty;

    invoke-direct {v0, p1, p2}, Lezvcard/property/RawProperty;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 4587
    .local v0, "raw":Lezvcard/property/RawProperty;
    invoke-virtual {p0, v0}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 4588
    return-object v0
.end method

.method public addFbUrl(Lezvcard/property/FreeBusyUrl;)V
    .locals 0
    .param p1, "fbUrl"    # Lezvcard/property/FreeBusyUrl;

    .prologue
    .line 3932
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 3933
    return-void
.end method

.method public addFbUrlAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/FreeBusyUrl;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 3950
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/FreeBusyUrl;>;"
    const-class v0, Lezvcard/property/FreeBusyUrl;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 3951
    return-void
.end method

.method public varargs addFbUrlAlt([Lezvcard/property/FreeBusyUrl;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/FreeBusyUrl;

    .prologue
    .line 3968
    const-class v0, Lezvcard/property/FreeBusyUrl;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 3969
    return-void
.end method

.method public addFormattedName(Lezvcard/property/FormattedName;)V
    .locals 0
    .param p1, "formattedName"    # Lezvcard/property/FormattedName;

    .prologue
    .line 969
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 970
    return-void
.end method

.method public addFormattedNameAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/FormattedName;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 907
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/FormattedName;>;"
    const-class v0, Lezvcard/property/FormattedName;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 908
    return-void
.end method

.method public varargs addFormattedNameAlt([Lezvcard/property/FormattedName;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/FormattedName;

    .prologue
    .line 927
    const-class v0, Lezvcard/property/FormattedName;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 928
    return-void
.end method

.method public addGeo(Lezvcard/property/Geo;)V
    .locals 0
    .param p1, "geo"    # Lezvcard/property/Geo;

    .prologue
    .line 2960
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 2961
    return-void
.end method

.method public addGeoAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Geo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 2906
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Geo;>;"
    const-class v0, Lezvcard/property/Geo;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 2907
    return-void
.end method

.method public varargs addGeoAlt([Lezvcard/property/Geo;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Geo;

    .prologue
    .line 2926
    const-class v0, Lezvcard/property/Geo;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 2927
    return-void
.end method

.method public addHobby(Ljava/lang/String;)Lezvcard/property/Hobby;
    .locals 1
    .param p1, "hobby"    # Ljava/lang/String;

    .prologue
    .line 4211
    new-instance v0, Lezvcard/property/Hobby;

    invoke-direct {v0, p1}, Lezvcard/property/Hobby;-><init>(Ljava/lang/String;)V

    .line 4212
    .local v0, "type":Lezvcard/property/Hobby;
    invoke-virtual {p0, v0}, Lezvcard/VCard;->addHobby(Lezvcard/property/Hobby;)V

    .line 4213
    return-object v0
.end method

.method public addHobby(Lezvcard/property/Hobby;)V
    .locals 0
    .param p1, "hobby"    # Lezvcard/property/Hobby;

    .prologue
    .line 4194
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 4195
    return-void
.end method

.method public addHobbyAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Hobby;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 4232
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Hobby;>;"
    const-class v0, Lezvcard/property/Hobby;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 4233
    return-void
.end method

.method public varargs addHobbyAlt([Lezvcard/property/Hobby;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Hobby;

    .prologue
    .line 4251
    const-class v0, Lezvcard/property/Hobby;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 4252
    return-void
.end method

.method public addImpp(Lezvcard/property/Impp;)V
    .locals 0
    .param p1, "impp"    # Lezvcard/property/Impp;

    .prologue
    .line 3580
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 3581
    return-void
.end method

.method public addImppAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Impp;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 3600
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Impp;>;"
    const-class v0, Lezvcard/property/Impp;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 3601
    return-void
.end method

.method public varargs addImppAlt([Lezvcard/property/Impp;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Impp;

    .prologue
    .line 3620
    const-class v0, Lezvcard/property/Impp;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 3621
    return-void
.end method

.method public addInterest(Ljava/lang/String;)Lezvcard/property/Interest;
    .locals 1
    .param p1, "interest"    # Ljava/lang/String;

    .prologue
    .line 4298
    new-instance v0, Lezvcard/property/Interest;

    invoke-direct {v0, p1}, Lezvcard/property/Interest;-><init>(Ljava/lang/String;)V

    .line 4299
    .local v0, "type":Lezvcard/property/Interest;
    invoke-virtual {p0, v0}, Lezvcard/VCard;->addInterest(Lezvcard/property/Interest;)V

    .line 4300
    return-object v0
.end method

.method public addInterest(Lezvcard/property/Interest;)V
    .locals 0
    .param p1, "interest"    # Lezvcard/property/Interest;

    .prologue
    .line 4281
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 4282
    return-void
.end method

.method public addInterestAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Interest;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 4319
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Interest;>;"
    const-class v0, Lezvcard/property/Interest;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 4320
    return-void
.end method

.method public varargs addInterestAlt([Lezvcard/property/Interest;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Interest;

    .prologue
    .line 4338
    const-class v0, Lezvcard/property/Interest;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 4339
    return-void
.end method

.method public addKey(Lezvcard/property/Key;)V
    .locals 0
    .param p1, "key"    # Lezvcard/property/Key;

    .prologue
    .line 3512
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 3513
    return-void
.end method

.method public addKeyAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Key;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 3532
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Key;>;"
    const-class v0, Lezvcard/property/Key;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 3533
    return-void
.end method

.method public varargs addKeyAlt([Lezvcard/property/Key;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Key;

    .prologue
    .line 3552
    const-class v0, Lezvcard/property/Key;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 3553
    return-void
.end method

.method public addLanguage(Ljava/lang/String;)Lezvcard/property/Language;
    .locals 1
    .param p1, "language"    # Ljava/lang/String;

    .prologue
    .line 3730
    new-instance v0, Lezvcard/property/Language;

    invoke-direct {v0, p1}, Lezvcard/property/Language;-><init>(Ljava/lang/String;)V

    .line 3731
    .local v0, "type":Lezvcard/property/Language;
    invoke-virtual {p0, v0}, Lezvcard/VCard;->addLanguage(Lezvcard/property/Language;)V

    .line 3732
    return-object v0
.end method

.method public addLanguage(Lezvcard/property/Language;)V
    .locals 0
    .param p1, "language"    # Lezvcard/property/Language;

    .prologue
    .line 3714
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 3715
    return-void
.end method

.method public addLanguageAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Language;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 3750
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Language;>;"
    const-class v0, Lezvcard/property/Language;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 3751
    return-void
.end method

.method public varargs addLanguageAlt([Lezvcard/property/Language;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Language;

    .prologue
    .line 3768
    const-class v0, Lezvcard/property/Language;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 3769
    return-void
.end method

.method public addLogo(Lezvcard/property/Logo;)V
    .locals 0
    .param p1, "logo"    # Lezvcard/property/Logo;

    .prologue
    .line 1597
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 1598
    return-void
.end method

.method public addLogoAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Logo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1617
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Logo;>;"
    const-class v0, Lezvcard/property/Logo;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 1618
    return-void
.end method

.method public varargs addLogoAlt([Lezvcard/property/Logo;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Logo;

    .prologue
    .line 1637
    const-class v0, Lezvcard/property/Logo;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 1638
    return-void
.end method

.method public addMember(Lezvcard/property/Member;)V
    .locals 0
    .param p1, "member"    # Lezvcard/property/Member;

    .prologue
    .line 551
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 552
    return-void
.end method

.method public addMemberAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Member;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 570
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Member;>;"
    const-class v0, Lezvcard/property/Member;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 571
    return-void
.end method

.method public varargs addMemberAlt([Lezvcard/property/Member;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Member;

    .prologue
    .line 589
    const-class v0, Lezvcard/property/Member;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 590
    return-void
.end method

.method public addNickname(Lezvcard/property/Nickname;)V
    .locals 0
    .param p1, "nickname"    # Lezvcard/property/Nickname;

    .prologue
    .line 1234
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 1235
    return-void
.end method

.method public addNicknameAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Nickname;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1178
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Nickname;>;"
    const-class v0, Lezvcard/property/Nickname;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 1179
    return-void
.end method

.method public varargs addNicknameAlt([Lezvcard/property/Nickname;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Nickname;

    .prologue
    .line 1198
    const-class v0, Lezvcard/property/Nickname;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 1199
    return-void
.end method

.method public addNote(Ljava/lang/String;)Lezvcard/property/Note;
    .locals 1
    .param p1, "note"    # Ljava/lang/String;

    .prologue
    .line 3414
    new-instance v0, Lezvcard/property/Note;

    invoke-direct {v0, p1}, Lezvcard/property/Note;-><init>(Ljava/lang/String;)V

    .line 3415
    .local v0, "type":Lezvcard/property/Note;
    invoke-virtual {p0, v0}, Lezvcard/VCard;->addNote(Lezvcard/property/Note;)V

    .line 3416
    return-object v0
.end method

.method public addNote(Lezvcard/property/Note;)V
    .locals 0
    .param p1, "note"    # Lezvcard/property/Note;

    .prologue
    .line 3398
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 3399
    return-void
.end method

.method public addNoteAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Note;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 3436
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Note;>;"
    const-class v0, Lezvcard/property/Note;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 3437
    return-void
.end method

.method public varargs addNoteAlt([Lezvcard/property/Note;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Note;

    .prologue
    .line 3456
    const-class v0, Lezvcard/property/Note;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 3457
    return-void
.end method

.method public addOrgDirectory(Ljava/lang/String;)Lezvcard/property/OrgDirectory;
    .locals 1
    .param p1, "orgDirectory"    # Ljava/lang/String;

    .prologue
    .line 4386
    new-instance v0, Lezvcard/property/OrgDirectory;

    invoke-direct {v0, p1}, Lezvcard/property/OrgDirectory;-><init>(Ljava/lang/String;)V

    .line 4387
    .local v0, "type":Lezvcard/property/OrgDirectory;
    invoke-virtual {p0, v0}, Lezvcard/VCard;->addOrgDirectory(Lezvcard/property/OrgDirectory;)V

    .line 4388
    return-object v0
.end method

.method public addOrgDirectory(Lezvcard/property/OrgDirectory;)V
    .locals 0
    .param p1, "orgDirectory"    # Lezvcard/property/OrgDirectory;

    .prologue
    .line 4368
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 4369
    return-void
.end method

.method public addOrgDirectoryAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/OrgDirectory;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 4407
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/OrgDirectory;>;"
    const-class v0, Lezvcard/property/OrgDirectory;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 4408
    return-void
.end method

.method public varargs addOrgDirectoryAlt([Lezvcard/property/OrgDirectory;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/OrgDirectory;

    .prologue
    .line 4426
    const-class v0, Lezvcard/property/OrgDirectory;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 4427
    return-void
.end method

.method public addOrganization(Lezvcard/property/Organization;)V
    .locals 0
    .param p1, "organization"    # Lezvcard/property/Organization;

    .prologue
    .line 3131
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 3132
    return-void
.end method

.method public addOrganizationAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Organization;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 3077
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Organization;>;"
    const-class v0, Lezvcard/property/Organization;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 3078
    return-void
.end method

.method public varargs addOrganizationAlt([Lezvcard/property/Organization;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Organization;

    .prologue
    .line 3097
    const-class v0, Lezvcard/property/Organization;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 3098
    return-void
.end method

.method public addOrphanedLabel(Lezvcard/property/Label;)V
    .locals 0
    .param p1, "label"    # Lezvcard/property/Label;

    .prologue
    .line 2362
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 2363
    return-void
.end method

.method public addPhoto(Lezvcard/property/Photo;)V
    .locals 0
    .param p1, "photo"    # Lezvcard/property/Photo;

    .prologue
    .line 1529
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 1530
    return-void
.end method

.method public addPhotoAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Photo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1549
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Photo;>;"
    const-class v0, Lezvcard/property/Photo;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 1550
    return-void
.end method

.method public varargs addPhotoAlt([Lezvcard/property/Photo;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Photo;

    .prologue
    .line 1569
    const-class v0, Lezvcard/property/Photo;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 1570
    return-void
.end method

.method public addProperty(Lezvcard/property/VCardProperty;)V
    .locals 2
    .param p1, "property"    # Lezvcard/property/VCardProperty;

    .prologue
    .line 4510
    iget-object v0, p0, Lezvcard/VCard;->properties:Lezvcard/util/ListMultimap;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lezvcard/util/ListMultimap;->put(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4511
    return-void
.end method

.method public addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lezvcard/property/VCardProperty;",
            ":",
            "Lezvcard/property/HasAltId;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/util/Collection",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 4639
    .local p1, "propertyClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    .local p2, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
    invoke-virtual {p0, p1}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lezvcard/VCard;->generateAltId(Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v0

    .line 4640
    .local v0, "altId":Ljava/lang/String;
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lezvcard/property/VCardProperty;

    .local v2, "property":Lezvcard/property/VCardProperty;, "TT;"
    move-object v3, v2

    .line 4641
    check-cast v3, Lezvcard/property/HasAltId;

    invoke-interface {v3, v0}, Lezvcard/property/HasAltId;->setAltId(Ljava/lang/String;)V

    .line 4642
    invoke-virtual {p0, v2}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    goto :goto_0

    .line 4644
    .end local v2    # "property":Lezvcard/property/VCardProperty;, "TT;"
    :cond_0
    return-void
.end method

.method public varargs addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lezvcard/property/VCardProperty;",
            ":",
            "Lezvcard/property/HasAltId;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;[TT;)V"
        }
    .end annotation

    .prologue
    .line 4626
    .local p1, "propertyClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    .local p2, "altRepresentations":[Lezvcard/property/VCardProperty;, "[TT;"
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 4627
    return-void
.end method

.method public addRelated(Lezvcard/property/Related;)V
    .locals 0
    .param p1, "related"    # Lezvcard/property/Related;

    .prologue
    .line 3648
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 3649
    return-void
.end method

.method public addRelatedAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Related;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 3667
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Related;>;"
    const-class v0, Lezvcard/property/Related;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 3668
    return-void
.end method

.method public varargs addRelatedAlt([Lezvcard/property/Related;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Related;

    .prologue
    .line 3686
    const-class v0, Lezvcard/property/Related;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 3687
    return-void
.end method

.method public addRole(Ljava/lang/String;)Lezvcard/property/Role;
    .locals 1
    .param p1, "role"    # Ljava/lang/String;

    .prologue
    .line 1458
    new-instance v0, Lezvcard/property/Role;

    invoke-direct {v0, p1}, Lezvcard/property/Role;-><init>(Ljava/lang/String;)V

    .line 1459
    .local v0, "type":Lezvcard/property/Role;
    invoke-virtual {p0, v0}, Lezvcard/VCard;->addRole(Lezvcard/property/Role;)V

    .line 1460
    return-object v0
.end method

.method public addRole(Lezvcard/property/Role;)V
    .locals 0
    .param p1, "role"    # Lezvcard/property/Role;

    .prologue
    .line 1442
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 1443
    return-void
.end method

.method public addRoleAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Role;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1480
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Role;>;"
    const-class v0, Lezvcard/property/Role;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 1481
    return-void
.end method

.method public varargs addRoleAlt([Lezvcard/property/Role;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Role;

    .prologue
    .line 1500
    const-class v0, Lezvcard/property/Role;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 1501
    return-void
.end method

.method public addSound(Lezvcard/property/Sound;)V
    .locals 0
    .param p1, "sound"    # Lezvcard/property/Sound;

    .prologue
    .line 1666
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 1667
    return-void
.end method

.method public addSoundAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Sound;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1686
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Sound;>;"
    const-class v0, Lezvcard/property/Sound;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 1687
    return-void
.end method

.method public varargs addSoundAlt([Lezvcard/property/Sound;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Sound;

    .prologue
    .line 1706
    const-class v0, Lezvcard/property/Sound;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 1707
    return-void
.end method

.method public addSource(Ljava/lang/String;)Lezvcard/property/Source;
    .locals 1
    .param p1, "source"    # Ljava/lang/String;

    .prologue
    .line 719
    new-instance v0, Lezvcard/property/Source;

    invoke-direct {v0, p1}, Lezvcard/property/Source;-><init>(Ljava/lang/String;)V

    .line 720
    .local v0, "type":Lezvcard/property/Source;
    invoke-virtual {p0, v0}, Lezvcard/VCard;->addSource(Lezvcard/property/Source;)V

    .line 721
    return-object v0
.end method

.method public addSource(Lezvcard/property/Source;)V
    .locals 0
    .param p1, "source"    # Lezvcard/property/Source;

    .prologue
    .line 702
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 703
    return-void
.end method

.method public addSourceAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Source;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 741
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Source;>;"
    const-class v0, Lezvcard/property/Source;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 742
    return-void
.end method

.method public varargs addSourceAlt([Lezvcard/property/Source;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Source;

    .prologue
    .line 761
    const-class v0, Lezvcard/property/Source;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 762
    return-void
.end method

.method public varargs addTelephoneNumber(Ljava/lang/String;[Lezvcard/parameter/TelephoneType;)Lezvcard/property/Telephone;
    .locals 5
    .param p1, "telephoneNumber"    # Ljava/lang/String;
    .param p2, "types"    # [Lezvcard/parameter/TelephoneType;

    .prologue
    .line 2499
    new-instance v4, Lezvcard/property/Telephone;

    invoke-direct {v4, p1}, Lezvcard/property/Telephone;-><init>(Ljava/lang/String;)V

    .line 2500
    .local v4, "type":Lezvcard/property/Telephone;
    move-object v0, p2

    .local v0, "arr$":[Lezvcard/parameter/TelephoneType;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    .line 2501
    .local v3, "t":Lezvcard/parameter/TelephoneType;
    invoke-virtual {v4, v3}, Lezvcard/property/Telephone;->addType(Lezvcard/parameter/TelephoneType;)V

    .line 2500
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2503
    .end local v3    # "t":Lezvcard/parameter/TelephoneType;
    :cond_0
    invoke-virtual {p0, v4}, Lezvcard/VCard;->addTelephoneNumber(Lezvcard/property/Telephone;)V

    .line 2504
    return-object v4
.end method

.method public addTelephoneNumber(Lezvcard/property/Telephone;)V
    .locals 0
    .param p1, "telephoneNumber"    # Lezvcard/property/Telephone;

    .prologue
    .line 2480
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 2481
    return-void
.end method

.method public addTelephoneNumberAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Telephone;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 2524
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Telephone;>;"
    const-class v0, Lezvcard/property/Telephone;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 2525
    return-void
.end method

.method public varargs addTelephoneNumberAlt([Lezvcard/property/Telephone;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Telephone;

    .prologue
    .line 2544
    const-class v0, Lezvcard/property/Telephone;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 2545
    return-void
.end method

.method public addTimezone(Lezvcard/property/Timezone;)V
    .locals 0
    .param p1, "timezone"    # Lezvcard/property/Timezone;

    .prologue
    .line 2830
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 2831
    return-void
.end method

.method public addTimezoneAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Timezone;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 2777
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Timezone;>;"
    const-class v0, Lezvcard/property/Timezone;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 2778
    return-void
.end method

.method public varargs addTimezoneAlt([Lezvcard/property/Timezone;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Timezone;

    .prologue
    .line 2797
    const-class v0, Lezvcard/property/Timezone;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 2798
    return-void
.end method

.method public addTitle(Ljava/lang/String;)Lezvcard/property/Title;
    .locals 1
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 1372
    new-instance v0, Lezvcard/property/Title;

    invoke-direct {v0, p1}, Lezvcard/property/Title;-><init>(Ljava/lang/String;)V

    .line 1373
    .local v0, "type":Lezvcard/property/Title;
    invoke-virtual {p0, v0}, Lezvcard/VCard;->addTitle(Lezvcard/property/Title;)V

    .line 1374
    return-object v0
.end method

.method public addTitle(Lezvcard/property/Title;)V
    .locals 0
    .param p1, "title"    # Lezvcard/property/Title;

    .prologue
    .line 1356
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 1357
    return-void
.end method

.method public addTitleAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Title;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1394
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Title;>;"
    const-class v0, Lezvcard/property/Title;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 1395
    return-void
.end method

.method public varargs addTitleAlt([Lezvcard/property/Title;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Title;

    .prologue
    .line 1414
    const-class v0, Lezvcard/property/Title;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 1415
    return-void
.end method

.method public addUrl(Ljava/lang/String;)Lezvcard/property/Url;
    .locals 1
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 2639
    new-instance v0, Lezvcard/property/Url;

    invoke-direct {v0, p1}, Lezvcard/property/Url;-><init>(Ljava/lang/String;)V

    .line 2640
    .local v0, "type":Lezvcard/property/Url;
    invoke-virtual {p0, v0}, Lezvcard/VCard;->addUrl(Lezvcard/property/Url;)V

    .line 2641
    return-object v0
.end method

.method public addUrl(Lezvcard/property/Url;)V
    .locals 0
    .param p1, "url"    # Lezvcard/property/Url;

    .prologue
    .line 2623
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 2624
    return-void
.end method

.method public addUrlAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Url;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 2661
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Url;>;"
    const-class v0, Lezvcard/property/Url;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 2662
    return-void
.end method

.method public varargs addUrlAlt([Lezvcard/property/Url;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Url;

    .prologue
    .line 2681
    const-class v0, Lezvcard/property/Url;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 2682
    return-void
.end method

.method public addXml(Lezvcard/property/Xml;)V
    .locals 0
    .param p1, "xml"    # Lezvcard/property/Xml;

    .prologue
    .line 4034
    invoke-virtual {p0, p1}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 4035
    return-void
.end method

.method public addXmlAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Xml;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 4053
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Xml;>;"
    const-class v0, Lezvcard/property/Xml;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 4054
    return-void
.end method

.method public varargs addXmlAlt([Lezvcard/property/Xml;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Xml;

    .prologue
    .line 4072
    const-class v0, Lezvcard/property/Xml;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 4073
    return-void
.end method

.method public getAddresses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Address;",
            ">;"
        }
    .end annotation

    .prologue
    .line 2276
    const-class v0, Lezvcard/property/Address;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getAgent()Lezvcard/property/Agent;
    .locals 1

    .prologue
    .line 3356
    const-class v0, Lezvcard/property/Agent;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/Agent;

    return-object v0
.end method

.method public getAnniversaries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Anniversary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 2092
    const-class v0, Lezvcard/property/Anniversary;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getAnniversary()Lezvcard/property/Anniversary;
    .locals 1

    .prologue
    .line 2108
    const-class v0, Lezvcard/property/Anniversary;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/Anniversary;

    return-object v0
.end method

.method public getBirthday()Lezvcard/property/Birthday;
    .locals 1

    .prologue
    .line 2018
    const-class v0, Lezvcard/property/Birthday;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/Birthday;

    return-object v0
.end method

.method public getBirthdays()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Birthday;",
            ">;"
        }
    .end annotation

    .prologue
    .line 2002
    const-class v0, Lezvcard/property/Birthday;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getBirthplace()Lezvcard/property/Birthplace;
    .locals 1

    .prologue
    .line 1742
    const-class v0, Lezvcard/property/Birthplace;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/Birthplace;

    return-object v0
.end method

.method public getBirthplaces()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Birthplace;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1725
    const-class v0, Lezvcard/property/Birthplace;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getCalendarRequestUris()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/CalendarRequestUri;",
            ">;"
        }
    .end annotation

    .prologue
    .line 3783
    const-class v0, Lezvcard/property/CalendarRequestUri;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getCalendarUris()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/CalendarUri;",
            ">;"
        }
    .end annotation

    .prologue
    .line 3850
    const-class v0, Lezvcard/property/CalendarUri;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getCategories()Lezvcard/property/Categories;
    .locals 1

    .prologue
    .line 3196
    const-class v0, Lezvcard/property/Categories;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/Categories;

    return-object v0
.end method

.method public getCategoriesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Categories;",
            ">;"
        }
    .end annotation

    .prologue
    .line 3179
    const-class v0, Lezvcard/property/Categories;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getClassification()Lezvcard/property/Classification;
    .locals 1

    .prologue
    .line 632
    const-class v0, Lezvcard/property/Classification;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/Classification;

    return-object v0
.end method

.method public getClientPidMaps()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/ClientPidMap;",
            ">;"
        }
    .end annotation

    .prologue
    .line 3984
    const-class v0, Lezvcard/property/ClientPidMap;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getDeathdate()Lezvcard/property/Deathdate;
    .locals 1

    .prologue
    .line 1928
    const-class v0, Lezvcard/property/Deathdate;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/Deathdate;

    return-object v0
.end method

.method public getDeathdates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Deathdate;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1911
    const-class v0, Lezvcard/property/Deathdate;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getDeathplace()Lezvcard/property/Deathplace;
    .locals 1

    .prologue
    .line 1835
    const-class v0, Lezvcard/property/Deathplace;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/Deathplace;

    return-object v0
.end method

.method public getDeathplaces()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Deathplace;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1818
    const-class v0, Lezvcard/property/Deathplace;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getEmails()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Email;",
            ">;"
        }
    .end annotation

    .prologue
    .line 2376
    const-class v0, Lezvcard/property/Email;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getExpertise()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Expertise;",
            ">;"
        }
    .end annotation

    .prologue
    .line 4088
    const-class v0, Lezvcard/property/Expertise;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getExtendedProperties()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/RawProperty;",
            ">;"
        }
    .end annotation

    .prologue
    .line 4576
    const-class v0, Lezvcard/property/RawProperty;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getExtendedProperties(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .param p1, "name"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/RawProperty;",
            ">;"
        }
    .end annotation

    .prologue
    .line 4560
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4562
    .local v1, "props":Ljava/util/List;, "Ljava/util/List<Lezvcard/property/RawProperty;>;"
    const-class v3, Lezvcard/property/RawProperty;

    invoke-virtual {p0, v3}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lezvcard/property/RawProperty;

    .line 4563
    .local v2, "raw":Lezvcard/property/RawProperty;
    invoke-virtual {v2}, Lezvcard/property/RawProperty;->getPropertyName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4564
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 4568
    .end local v2    # "raw":Lezvcard/property/RawProperty;
    :cond_1
    return-object v1
.end method

.method public getExtendedProperty(Ljava/lang/String;)Lezvcard/property/RawProperty;
    .locals 3
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 4546
    const-class v2, Lezvcard/property/RawProperty;

    invoke-virtual {p0, v2}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lezvcard/property/RawProperty;

    .line 4547
    .local v1, "raw":Lezvcard/property/RawProperty;
    invoke-virtual {v1}, Lezvcard/property/RawProperty;->getPropertyName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4551
    .end local v1    # "raw":Lezvcard/property/RawProperty;
    :goto_0
    return-object v1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public getFbUrls()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/FreeBusyUrl;",
            ">;"
        }
    .end annotation

    .prologue
    .line 3917
    const-class v0, Lezvcard/property/FreeBusyUrl;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getFormattedName()Lezvcard/property/FormattedName;
    .locals 1

    .prologue
    .line 847
    const-class v0, Lezvcard/property/FormattedName;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/FormattedName;

    return-object v0
.end method

.method public getFormattedNames()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/FormattedName;",
            ">;"
        }
    .end annotation

    .prologue
    .line 831
    const-class v0, Lezvcard/property/FormattedName;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getGender()Lezvcard/property/Gender;
    .locals 1

    .prologue
    .line 481
    const-class v0, Lezvcard/property/Gender;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/Gender;

    return-object v0
.end method

.method public getGeo()Lezvcard/property/Geo;
    .locals 1

    .prologue
    .line 2866
    const-class v0, Lezvcard/property/Geo;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/Geo;

    return-object v0
.end method

.method public getGeos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Geo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 2850
    const-class v0, Lezvcard/property/Geo;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getHobbies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Hobby;",
            ">;"
        }
    .end annotation

    .prologue
    .line 4179
    const-class v0, Lezvcard/property/Hobby;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getImpps()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Impp;",
            ">;"
        }
    .end annotation

    .prologue
    .line 3566
    const-class v0, Lezvcard/property/Impp;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getInterests()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Interest;",
            ">;"
        }
    .end annotation

    .prologue
    .line 4266
    const-class v0, Lezvcard/property/Interest;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getKeys()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Key;",
            ">;"
        }
    .end annotation

    .prologue
    .line 3498
    const-class v0, Lezvcard/property/Key;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getKind()Lezvcard/property/Kind;
    .locals 1

    .prologue
    .line 453
    const-class v0, Lezvcard/property/Kind;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/Kind;

    return-object v0
.end method

.method public getLanguages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Language;",
            ">;"
        }
    .end annotation

    .prologue
    .line 3700
    const-class v0, Lezvcard/property/Language;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getLogos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Logo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1583
    const-class v0, Lezvcard/property/Logo;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getMailer()Lezvcard/property/Mailer;
    .locals 1

    .prologue
    .line 2558
    const-class v0, Lezvcard/property/Mailer;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/Mailer;

    return-object v0
.end method

.method public getMembers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Member;",
            ">;"
        }
    .end annotation

    .prologue
    .line 525
    const-class v0, Lezvcard/property/Member;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getNickname()Lezvcard/property/Nickname;
    .locals 1

    .prologue
    .line 1118
    const-class v0, Lezvcard/property/Nickname;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/Nickname;

    return-object v0
.end method

.method public getNicknames()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Nickname;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1102
    const-class v0, Lezvcard/property/Nickname;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getNotes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Note;",
            ">;"
        }
    .end annotation

    .prologue
    .line 3384
    const-class v0, Lezvcard/property/Note;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getOrgDirectories()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/OrgDirectory;",
            ">;"
        }
    .end annotation

    .prologue
    .line 4353
    const-class v0, Lezvcard/property/OrgDirectory;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getOrganization()Lezvcard/property/Organization;
    .locals 1

    .prologue
    .line 3017
    const-class v0, Lezvcard/property/Organization;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/Organization;

    return-object v0
.end method

.method public getOrganizations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Organization;",
            ">;"
        }
    .end annotation

    .prologue
    .line 3001
    const-class v0, Lezvcard/property/Organization;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getOrphanedLabels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Label;",
            ">;"
        }
    .end annotation

    .prologue
    .line 2346
    const-class v0, Lezvcard/property/Label;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPhotos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Photo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1515
    const-class v0, Lezvcard/property/Photo;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getProdId()Lezvcard/property/ProductId;
    .locals 1

    .prologue
    .line 2226
    const-class v0, Lezvcard/property/ProductId;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/ProductId;

    return-object v0
.end method

.method public getProfile()Lezvcard/property/Profile;
    .locals 1

    .prologue
    .line 603
    const-class v0, Lezvcard/property/Profile;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/Profile;

    return-object v0
.end method

.method public getProperties()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/VCardProperty;",
            ">;"
        }
    .end annotation

    .prologue
    .line 4502
    iget-object v0, p0, Lezvcard/VCard;->properties:Lezvcard/util/ListMultimap;

    invoke-virtual {v0}, Lezvcard/util/ListMultimap;->values()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getProperties(Ljava/lang/Class;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lezvcard/property/VCardProperty;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Ljava/util/List",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 4453
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v4, p0, Lezvcard/VCard;->properties:Lezvcard/util/ListMultimap;

    invoke-virtual {v4, p1}, Lezvcard/util/ListMultimap;->get(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 4456
    .local v2, "props":Ljava/util/List;, "Ljava/util/List<Lezvcard/property/VCardProperty;>;"
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 4457
    .local v3, "ret":Ljava/util/List;, "Ljava/util/List<TT;>;"
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lezvcard/property/VCardProperty;

    .line 4458
    .local v1, "property":Lezvcard/property/VCardProperty;
    invoke-virtual {p1, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 4460
    .end local v1    # "property":Lezvcard/property/VCardProperty;
    :cond_0
    return-object v3
.end method

.method public getPropertiesAlt(Ljava/lang/Class;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lezvcard/property/VCardProperty;",
            ":",
            "Lezvcard/property/HasAltId;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Ljava/util/List",
            "<",
            "Ljava/util/List",
            "<TT;>;>;"
        }
    .end annotation

    .prologue
    .line 4471
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 4472
    .local v6, "nullAltId":Ljava/util/List;, "Ljava/util/List<TT;>;"
    new-instance v5, Lezvcard/util/ListMultimap;

    invoke-direct {v5}, Lezvcard/util/ListMultimap;-><init>()V

    .line 4473
    .local v5, "map":Lezvcard/util/ListMultimap;, "Lezvcard/util/ListMultimap<Ljava/lang/String;TT;>;"
    invoke-virtual {p0, p1}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lezvcard/property/VCardProperty;

    .local v7, "property":Lezvcard/property/VCardProperty;, "TT;"
    move-object v8, v7

    .line 4474
    check-cast v8, Lezvcard/property/HasAltId;

    invoke-interface {v8}, Lezvcard/property/HasAltId;->getAltId()Ljava/lang/String;

    move-result-object v0

    .line 4475
    .local v0, "altId":Ljava/lang/String;
    if-nez v0, :cond_0

    .line 4476
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 4478
    :cond_0
    invoke-virtual {v5, v0, v7}, Lezvcard/util/ListMultimap;->put(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 4482
    .end local v0    # "altId":Ljava/lang/String;
    .end local v7    # "property":Lezvcard/property/VCardProperty;, "TT;"
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 4483
    .local v4, "list":Ljava/util/List;, "Ljava/util/List<Ljava/util/List<TT;>;>;"
    invoke-virtual {v5}, Lezvcard/util/ListMultimap;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 4484
    .local v1, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/List<TT;>;>;"
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 4488
    .end local v1    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/List<TT;>;>;"
    :cond_2
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lezvcard/property/VCardProperty;

    .line 4489
    .restart local v7    # "property":Lezvcard/property/VCardProperty;, "TT;"
    new-instance v3, Ljava/util/ArrayList;

    const/4 v8, 0x1

    invoke-direct {v3, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 4490
    .local v3, "l":Ljava/util/List;, "Ljava/util/List<TT;>;"
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4491
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 4494
    .end local v3    # "l":Ljava/util/List;, "Ljava/util/List<TT;>;"
    .end local v7    # "property":Lezvcard/property/VCardProperty;, "TT;"
    :cond_3
    return-object v4
.end method

.method public getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lezvcard/property/VCardProperty;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 4444
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v0, p0, Lezvcard/VCard;->properties:Lezvcard/util/ListMultimap;

    invoke-virtual {v0, p1}, Lezvcard/util/ListMultimap;->first(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/property/VCardProperty;

    return-object v0
.end method

.method public getRelations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Related;",
            ">;"
        }
    .end annotation

    .prologue
    .line 3634
    const-class v0, Lezvcard/property/Related;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getRevision()Lezvcard/property/Revision;
    .locals 1

    .prologue
    .line 2176
    const-class v0, Lezvcard/property/Revision;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/Revision;

    return-object v0
.end method

.method public getRoles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Role;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1428
    const-class v0, Lezvcard/property/Role;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSortString()Lezvcard/property/SortString;
    .locals 1

    .prologue
    .line 1280
    const-class v0, Lezvcard/property/SortString;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/SortString;

    return-object v0
.end method

.method public getSounds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Sound;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1652
    const-class v0, Lezvcard/property/Sound;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSourceDisplayText()Lezvcard/property/SourceDisplayText;
    .locals 1

    .prologue
    .line 775
    const-class v0, Lezvcard/property/SourceDisplayText;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/SourceDisplayText;

    return-object v0
.end method

.method public getSources()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Source;",
            ">;"
        }
    .end annotation

    .prologue
    .line 687
    const-class v0, Lezvcard/property/Source;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getStructuredName()Lezvcard/property/StructuredName;
    .locals 1

    .prologue
    .line 1028
    const-class v0, Lezvcard/property/StructuredName;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/StructuredName;

    return-object v0
.end method

.method public getStructuredNames()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/StructuredName;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1012
    const-class v0, Lezvcard/property/StructuredName;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getTelephoneNumbers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Telephone;",
            ">;"
        }
    .end annotation

    .prologue
    .line 2466
    const-class v0, Lezvcard/property/Telephone;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getTimezone()Lezvcard/property/Timezone;
    .locals 1

    .prologue
    .line 2717
    const-class v0, Lezvcard/property/Timezone;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/Timezone;

    return-object v0
.end method

.method public getTimezones()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Timezone;",
            ">;"
        }
    .end annotation

    .prologue
    .line 2701
    const-class v0, Lezvcard/property/Timezone;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getTitles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Title;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1342
    const-class v0, Lezvcard/property/Title;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getUid()Lezvcard/property/Uid;
    .locals 1

    .prologue
    .line 3470
    const-class v0, Lezvcard/property/Uid;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperty(Ljava/lang/Class;)Lezvcard/property/VCardProperty;

    move-result-object v0

    check-cast v0, Lezvcard/property/Uid;

    return-object v0
.end method

.method public getUrls()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Url;",
            ">;"
        }
    .end annotation

    .prologue
    .line 2608
    const-class v0, Lezvcard/property/Url;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getVersion()Lezvcard/VCardVersion;
    .locals 1

    .prologue
    .line 427
    iget-object v0, p0, Lezvcard/VCard;->version:Lezvcard/VCardVersion;

    return-object v0
.end method

.method public getXmls()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/property/Xml;",
            ">;"
        }
    .end annotation

    .prologue
    .line 4017
    const-class v0, Lezvcard/property/Xml;

    invoke-virtual {p0, v0}, Lezvcard/VCard;->getProperties(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lezvcard/property/VCardProperty;",
            ">;"
        }
    .end annotation

    .prologue
    .line 4435
    iget-object v0, p0, Lezvcard/VCard;->properties:Lezvcard/util/ListMultimap;

    invoke-virtual {v0}, Lezvcard/util/ListMultimap;->values()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public removeExtendedProperty(Ljava/lang/String;)V
    .locals 5
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 4610
    invoke-virtual {p0, p1}, Lezvcard/VCard;->getExtendedProperties(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 4611
    .local v1, "xproperties":Ljava/util/List;, "Ljava/util/List<Lezvcard/property/RawProperty;>;"
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lezvcard/property/RawProperty;

    .line 4612
    .local v2, "xproperty":Lezvcard/property/RawProperty;
    iget-object v3, p0, Lezvcard/VCard;->properties:Lezvcard/util/ListMultimap;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Lezvcard/util/ListMultimap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0

    .line 4614
    .end local v2    # "xproperty":Lezvcard/property/RawProperty;
    :cond_0
    return-void
.end method

.method public removeProperties(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 4537
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<+Lezvcard/property/VCardProperty;>;"
    iget-object v0, p0, Lezvcard/VCard;->properties:Lezvcard/util/ListMultimap;

    invoke-virtual {v0, p1}, Lezvcard/util/ListMultimap;->removeAll(Ljava/lang/Object;)Ljava/util/List;

    .line 4538
    return-void
.end method

.method public removeProperty(Lezvcard/property/VCardProperty;)V
    .locals 2
    .param p1, "property"    # Lezvcard/property/VCardProperty;

    .prologue
    .line 4529
    iget-object v0, p0, Lezvcard/VCard;->properties:Lezvcard/util/ListMultimap;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lezvcard/util/ListMultimap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4530
    return-void
.end method

.method public setAgent(Lezvcard/property/Agent;)V
    .locals 1
    .param p1, "agent"    # Lezvcard/property/Agent;

    .prologue
    .line 3370
    const-class v0, Lezvcard/property/Agent;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 3371
    return-void
.end method

.method public setAnniversary(Lezvcard/property/Anniversary;)V
    .locals 1
    .param p1, "anniversary"    # Lezvcard/property/Anniversary;

    .prologue
    .line 2162
    const-class v0, Lezvcard/property/Anniversary;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 2163
    return-void
.end method

.method public setAnniversaryAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Anniversary;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 2127
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Anniversary;>;"
    const-class v0, Lezvcard/property/Anniversary;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 2128
    return-void
.end method

.method public varargs setAnniversaryAlt([Lezvcard/property/Anniversary;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Anniversary;

    .prologue
    .line 2146
    const-class v0, Lezvcard/property/Anniversary;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 2147
    return-void
.end method

.method public setBirthday(Lezvcard/property/Birthday;)V
    .locals 1
    .param p1, "birthday"    # Lezvcard/property/Birthday;

    .prologue
    .line 2074
    const-class v0, Lezvcard/property/Birthday;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 2075
    return-void
.end method

.method public setBirthdayAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Birthday;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 2038
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Birthday;>;"
    const-class v0, Lezvcard/property/Birthday;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 2039
    return-void
.end method

.method public varargs setBirthdayAlt([Lezvcard/property/Birthday;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Birthday;

    .prologue
    .line 2058
    const-class v0, Lezvcard/property/Birthday;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 2059
    return-void
.end method

.method public setBirthplace(Lezvcard/property/Birthplace;)V
    .locals 1
    .param p1, "birthplace"    # Lezvcard/property/Birthplace;

    .prologue
    .line 1799
    const-class v0, Lezvcard/property/Birthplace;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 1800
    return-void
.end method

.method public setBirthplaceAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Birthplace;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1762
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Birthplace;>;"
    const-class v0, Lezvcard/property/Birthplace;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 1763
    return-void
.end method

.method public varargs setBirthplaceAlt([Lezvcard/property/Birthplace;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Birthplace;

    .prologue
    .line 1782
    const-class v0, Lezvcard/property/Birthplace;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 1783
    return-void
.end method

.method public varargs setCategories([Ljava/lang/String;)Lezvcard/property/Categories;
    .locals 5
    .param p1, "categories"    # [Ljava/lang/String;

    .prologue
    .line 3334
    const/4 v4, 0x0

    .line 3335
    .local v4, "type":Lezvcard/property/Categories;
    if-eqz p1, :cond_0

    .line 3336
    new-instance v4, Lezvcard/property/Categories;

    .end local v4    # "type":Lezvcard/property/Categories;
    invoke-direct {v4}, Lezvcard/property/Categories;-><init>()V

    .line 3337
    .restart local v4    # "type":Lezvcard/property/Categories;
    move-object v0, p1

    .local v0, "arr$":[Ljava/lang/String;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_0

    aget-object v1, v0, v2

    .line 3338
    .local v1, "category":Ljava/lang/String;
    invoke-virtual {v4, v1}, Lezvcard/property/Categories;->addValue(Ljava/lang/Object;)V

    .line 3337
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 3341
    .end local v0    # "arr$":[Ljava/lang/String;
    .end local v1    # "category":Ljava/lang/String;
    .end local v2    # "i$":I
    .end local v3    # "len$":I
    :cond_0
    invoke-virtual {p0, v4}, Lezvcard/VCard;->setCategories(Lezvcard/property/Categories;)V

    .line 3342
    return-object v4
.end method

.method public setCategories(Lezvcard/property/Categories;)V
    .locals 1
    .param p1, "categories"    # Lezvcard/property/Categories;

    .prologue
    .line 3294
    const-class v0, Lezvcard/property/Categories;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 3295
    return-void
.end method

.method public setCategoriesAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Categories;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 3216
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Categories;>;"
    const-class v0, Lezvcard/property/Categories;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 3217
    return-void
.end method

.method public varargs setCategoriesAlt([Lezvcard/property/Categories;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Categories;

    .prologue
    .line 3236
    const-class v0, Lezvcard/property/Categories;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 3237
    return-void
.end method

.method public setClassification(Ljava/lang/String;)Lezvcard/property/Classification;
    .locals 1
    .param p1, "classification"    # Ljava/lang/String;

    .prologue
    .line 667
    const/4 v0, 0x0

    .line 668
    .local v0, "type":Lezvcard/property/Classification;
    if-eqz p1, :cond_0

    .line 669
    new-instance v0, Lezvcard/property/Classification;

    .end local v0    # "type":Lezvcard/property/Classification;
    invoke-direct {v0, p1}, Lezvcard/property/Classification;-><init>(Ljava/lang/String;)V

    .line 671
    .restart local v0    # "type":Lezvcard/property/Classification;
    :cond_0
    invoke-virtual {p0, v0}, Lezvcard/VCard;->setClassification(Lezvcard/property/Classification;)V

    .line 672
    return-object v0
.end method

.method public setClassification(Lezvcard/property/Classification;)V
    .locals 1
    .param p1, "classification"    # Lezvcard/property/Classification;

    .prologue
    .line 647
    const-class v0, Lezvcard/property/Classification;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 648
    return-void
.end method

.method public setDeathdate(Lezvcard/property/Deathdate;)V
    .locals 1
    .param p1, "deathdate"    # Lezvcard/property/Deathdate;

    .prologue
    .line 1983
    const-class v0, Lezvcard/property/Deathdate;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 1984
    return-void
.end method

.method public setDeathdateAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Deathdate;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1947
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Deathdate;>;"
    const-class v0, Lezvcard/property/Deathdate;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 1948
    return-void
.end method

.method public varargs setDeathdateAlt([Lezvcard/property/Deathdate;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Deathdate;

    .prologue
    .line 1966
    const-class v0, Lezvcard/property/Deathdate;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 1967
    return-void
.end method

.method public setDeathplace(Lezvcard/property/Deathplace;)V
    .locals 1
    .param p1, "deathplace"    # Lezvcard/property/Deathplace;

    .prologue
    .line 1892
    const-class v0, Lezvcard/property/Deathplace;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 1893
    return-void
.end method

.method public setDeathplaceAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Deathplace;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1855
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Deathplace;>;"
    const-class v0, Lezvcard/property/Deathplace;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 1856
    return-void
.end method

.method public varargs setDeathplaceAlt([Lezvcard/property/Deathplace;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Deathplace;

    .prologue
    .line 1875
    const-class v0, Lezvcard/property/Deathplace;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 1876
    return-void
.end method

.method public setExtendedProperty(Ljava/lang/String;Ljava/lang/String;)Lezvcard/property/RawProperty;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 4599
    invoke-virtual {p0, p1}, Lezvcard/VCard;->removeExtendedProperty(Ljava/lang/String;)V

    .line 4600
    new-instance v0, Lezvcard/property/RawProperty;

    invoke-direct {v0, p1, p2}, Lezvcard/property/RawProperty;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 4601
    .local v0, "raw":Lezvcard/property/RawProperty;
    invoke-virtual {p0, v0}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    .line 4602
    return-object v0
.end method

.method public setFormattedName(Ljava/lang/String;)Lezvcard/property/FormattedName;
    .locals 1
    .param p1, "formattedName"    # Ljava/lang/String;

    .prologue
    .line 988
    const/4 v0, 0x0

    .line 989
    .local v0, "type":Lezvcard/property/FormattedName;
    if-eqz p1, :cond_0

    .line 990
    new-instance v0, Lezvcard/property/FormattedName;

    .end local v0    # "type":Lezvcard/property/FormattedName;
    invoke-direct {v0, p1}, Lezvcard/property/FormattedName;-><init>(Ljava/lang/String;)V

    .line 992
    .restart local v0    # "type":Lezvcard/property/FormattedName;
    :cond_0
    invoke-virtual {p0, v0}, Lezvcard/VCard;->setFormattedName(Lezvcard/property/FormattedName;)V

    .line 993
    return-object v0
.end method

.method public setFormattedName(Lezvcard/property/FormattedName;)V
    .locals 1
    .param p1, "formattedName"    # Lezvcard/property/FormattedName;

    .prologue
    .line 951
    const-class v0, Lezvcard/property/FormattedName;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 952
    return-void
.end method

.method public setFormattedNameAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/FormattedName;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 867
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/FormattedName;>;"
    const-class v0, Lezvcard/property/FormattedName;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 868
    return-void
.end method

.method public varargs setFormattedNameAlt([Lezvcard/property/FormattedName;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/FormattedName;

    .prologue
    .line 887
    const-class v0, Lezvcard/property/FormattedName;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 888
    return-void
.end method

.method public setGender(Lezvcard/property/Gender;)V
    .locals 1
    .param p1, "gender"    # Lezvcard/property/Gender;

    .prologue
    .line 495
    const-class v0, Lezvcard/property/Gender;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 496
    return-void
.end method

.method public setGeo(DD)Lezvcard/property/Geo;
    .locals 3
    .param p1, "latitude"    # D
    .param p3, "longitude"    # D

    .prologue
    .line 2979
    new-instance v0, Lezvcard/property/Geo;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lezvcard/property/Geo;-><init>(Ljava/lang/Double;Ljava/lang/Double;)V

    .line 2980
    .local v0, "type":Lezvcard/property/Geo;
    invoke-virtual {p0, v0}, Lezvcard/VCard;->setGeo(Lezvcard/property/Geo;)V

    .line 2981
    return-object v0
.end method

.method public setGeo(Lezvcard/property/Geo;)V
    .locals 1
    .param p1, "geo"    # Lezvcard/property/Geo;

    .prologue
    .line 2942
    const-class v0, Lezvcard/property/Geo;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 2943
    return-void
.end method

.method public setGeoAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Geo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 2886
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Geo;>;"
    const-class v0, Lezvcard/property/Geo;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 2887
    return-void
.end method

.method public setKind(Lezvcard/property/Kind;)V
    .locals 1
    .param p1, "kind"    # Lezvcard/property/Kind;

    .prologue
    .line 467
    const-class v0, Lezvcard/property/Kind;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 468
    return-void
.end method

.method public setMailer(Ljava/lang/String;)Lezvcard/property/Mailer;
    .locals 1
    .param p1, "mailer"    # Ljava/lang/String;

    .prologue
    .line 2588
    const/4 v0, 0x0

    .line 2589
    .local v0, "type":Lezvcard/property/Mailer;
    if-eqz p1, :cond_0

    .line 2590
    new-instance v0, Lezvcard/property/Mailer;

    .end local v0    # "type":Lezvcard/property/Mailer;
    invoke-direct {v0, p1}, Lezvcard/property/Mailer;-><init>(Ljava/lang/String;)V

    .line 2592
    .restart local v0    # "type":Lezvcard/property/Mailer;
    :cond_0
    invoke-virtual {p0, v0}, Lezvcard/VCard;->setMailer(Lezvcard/property/Mailer;)V

    .line 2593
    return-object v0
.end method

.method public setMailer(Lezvcard/property/Mailer;)V
    .locals 1
    .param p1, "mailer"    # Lezvcard/property/Mailer;

    .prologue
    .line 2572
    const-class v0, Lezvcard/property/Mailer;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 2573
    return-void
.end method

.method public varargs setNickname([Ljava/lang/String;)Lezvcard/property/Nickname;
    .locals 5
    .param p1, "nicknames"    # [Ljava/lang/String;

    .prologue
    .line 1252
    const/4 v4, 0x0

    .line 1253
    .local v4, "type":Lezvcard/property/Nickname;
    if-eqz p1, :cond_0

    .line 1254
    new-instance v4, Lezvcard/property/Nickname;

    .end local v4    # "type":Lezvcard/property/Nickname;
    invoke-direct {v4}, Lezvcard/property/Nickname;-><init>()V

    .line 1255
    .restart local v4    # "type":Lezvcard/property/Nickname;
    move-object v0, p1

    .local v0, "arr$":[Ljava/lang/String;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    .line 1256
    .local v3, "nickname":Ljava/lang/String;
    invoke-virtual {v4, v3}, Lezvcard/property/Nickname;->addValue(Ljava/lang/Object;)V

    .line 1255
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1259
    .end local v0    # "arr$":[Ljava/lang/String;
    .end local v1    # "i$":I
    .end local v2    # "len$":I
    .end local v3    # "nickname":Ljava/lang/String;
    :cond_0
    invoke-virtual {p0, v4}, Lezvcard/VCard;->setNickname(Lezvcard/property/Nickname;)V

    .line 1260
    return-object v4
.end method

.method public setNickname(Lezvcard/property/Nickname;)V
    .locals 1
    .param p1, "nickname"    # Lezvcard/property/Nickname;

    .prologue
    .line 1215
    const-class v0, Lezvcard/property/Nickname;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 1216
    return-void
.end method

.method public setNicknameAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Nickname;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1138
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Nickname;>;"
    const-class v0, Lezvcard/property/Nickname;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 1139
    return-void
.end method

.method public varargs setNicknameAlt([Lezvcard/property/Nickname;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Nickname;

    .prologue
    .line 1158
    const-class v0, Lezvcard/property/Nickname;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 1159
    return-void
.end method

.method public varargs setOrganization([Ljava/lang/String;)Lezvcard/property/Organization;
    .locals 5
    .param p1, "departments"    # [Ljava/lang/String;

    .prologue
    .line 3151
    const/4 v4, 0x0

    .line 3152
    .local v4, "type":Lezvcard/property/Organization;
    if-eqz p1, :cond_0

    .line 3153
    new-instance v4, Lezvcard/property/Organization;

    .end local v4    # "type":Lezvcard/property/Organization;
    invoke-direct {v4}, Lezvcard/property/Organization;-><init>()V

    .line 3154
    .restart local v4    # "type":Lezvcard/property/Organization;
    move-object v0, p1

    .local v0, "arr$":[Ljava/lang/String;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_0

    aget-object v1, v0, v2

    .line 3155
    .local v1, "department":Ljava/lang/String;
    invoke-virtual {v4, v1}, Lezvcard/property/Organization;->addValue(Ljava/lang/Object;)V

    .line 3154
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 3158
    .end local v0    # "arr$":[Ljava/lang/String;
    .end local v1    # "department":Ljava/lang/String;
    .end local v2    # "i$":I
    .end local v3    # "len$":I
    :cond_0
    invoke-virtual {p0, v4}, Lezvcard/VCard;->setOrganization(Lezvcard/property/Organization;)V

    .line 3159
    return-object v4
.end method

.method public setOrganization(Lezvcard/property/Organization;)V
    .locals 1
    .param p1, "organization"    # Lezvcard/property/Organization;

    .prologue
    .line 3113
    const-class v0, Lezvcard/property/Organization;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 3114
    return-void
.end method

.method public setOrganizationAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Organization;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 3037
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Organization;>;"
    const-class v0, Lezvcard/property/Organization;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 3038
    return-void
.end method

.method public varargs setOrganizationAlt([Lezvcard/property/Organization;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Organization;

    .prologue
    .line 3057
    const-class v0, Lezvcard/property/Organization;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 3058
    return-void
.end method

.method public setProdId(Ljava/lang/String;)Lezvcard/property/ProductId;
    .locals 1
    .param p1, "prodId"    # Ljava/lang/String;

    .prologue
    .line 2257
    const/4 v0, 0x0

    .line 2258
    .local v0, "type":Lezvcard/property/ProductId;
    if-eqz p1, :cond_0

    .line 2259
    new-instance v0, Lezvcard/property/ProductId;

    .end local v0    # "type":Lezvcard/property/ProductId;
    invoke-direct {v0, p1}, Lezvcard/property/ProductId;-><init>(Ljava/lang/String;)V

    .line 2261
    .restart local v0    # "type":Lezvcard/property/ProductId;
    :cond_0
    invoke-virtual {p0, v0}, Lezvcard/VCard;->setProdId(Lezvcard/property/ProductId;)V

    .line 2262
    return-object v0
.end method

.method public setProdId(Lezvcard/property/ProductId;)V
    .locals 1
    .param p1, "prodId"    # Lezvcard/property/ProductId;

    .prologue
    .line 2241
    const-class v0, Lezvcard/property/ProductId;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 2242
    return-void
.end method

.method public setProfile(Lezvcard/property/Profile;)V
    .locals 1
    .param p1, "profile"    # Lezvcard/property/Profile;

    .prologue
    .line 617
    const-class v0, Lezvcard/property/Profile;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 618
    return-void
.end method

.method public setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lezvcard/property/VCardProperty;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;TT;)V"
        }
    .end annotation

    .prologue
    .line 4521
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    .local p2, "property":Lezvcard/property/VCardProperty;, "TT;"
    iget-object v0, p0, Lezvcard/VCard;->properties:Lezvcard/util/ListMultimap;

    invoke-virtual {v0, p1, p2}, Lezvcard/util/ListMultimap;->replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    .line 4522
    return-void
.end method

.method public setPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lezvcard/property/VCardProperty;",
            ":",
            "Lezvcard/property/HasAltId;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/util/Collection",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 4670
    .local p1, "propertyClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    .local p2, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
    invoke-virtual {p0, p1}, Lezvcard/VCard;->removeProperties(Ljava/lang/Class;)V

    .line 4671
    invoke-virtual {p0, p1, p2}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 4672
    return-void
.end method

.method public varargs setPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lezvcard/property/VCardProperty;",
            ":",
            "Lezvcard/property/HasAltId;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;[TT;)V"
        }
    .end annotation

    .prologue
    .line 4656
    .local p1, "propertyClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    .local p2, "altRepresentations":[Lezvcard/property/VCardProperty;, "[TT;"
    invoke-virtual {p0, p1}, Lezvcard/VCard;->removeProperties(Ljava/lang/Class;)V

    .line 4657
    invoke-virtual {p0, p1, p2}, Lezvcard/VCard;->addPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 4658
    return-void
.end method

.method public setRevision(Ljava/util/Date;)Lezvcard/property/Revision;
    .locals 1
    .param p1, "rev"    # Ljava/util/Date;

    .prologue
    .line 2206
    const/4 v0, 0x0

    .line 2207
    .local v0, "type":Lezvcard/property/Revision;
    if-eqz p1, :cond_0

    .line 2208
    new-instance v0, Lezvcard/property/Revision;

    .end local v0    # "type":Lezvcard/property/Revision;
    invoke-direct {v0, p1}, Lezvcard/property/Revision;-><init>(Ljava/util/Date;)V

    .line 2210
    .restart local v0    # "type":Lezvcard/property/Revision;
    :cond_0
    invoke-virtual {p0, v0}, Lezvcard/VCard;->setRevision(Lezvcard/property/Revision;)V

    .line 2211
    return-object v0
.end method

.method public setRevision(Lezvcard/property/Revision;)V
    .locals 1
    .param p1, "rev"    # Lezvcard/property/Revision;

    .prologue
    .line 2190
    const-class v0, Lezvcard/property/Revision;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 2191
    return-void
.end method

.method public setSortString(Ljava/lang/String;)Lezvcard/property/SortString;
    .locals 1
    .param p1, "sortString"    # Ljava/lang/String;

    .prologue
    .line 1323
    const/4 v0, 0x0

    .line 1324
    .local v0, "type":Lezvcard/property/SortString;
    if-eqz p1, :cond_0

    .line 1325
    new-instance v0, Lezvcard/property/SortString;

    .end local v0    # "type":Lezvcard/property/SortString;
    invoke-direct {v0, p1}, Lezvcard/property/SortString;-><init>(Ljava/lang/String;)V

    .line 1327
    .restart local v0    # "type":Lezvcard/property/SortString;
    :cond_0
    invoke-virtual {p0, v0}, Lezvcard/VCard;->setSortString(Lezvcard/property/SortString;)V

    .line 1328
    return-object v0
.end method

.method public setSortString(Lezvcard/property/SortString;)V
    .locals 1
    .param p1, "sortString"    # Lezvcard/property/SortString;

    .prologue
    .line 1300
    const-class v0, Lezvcard/property/SortString;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 1301
    return-void
.end method

.method public setSourceDisplayText(Ljava/lang/String;)Lezvcard/property/SourceDisplayText;
    .locals 1
    .param p1, "sourceDisplayText"    # Ljava/lang/String;

    .prologue
    .line 806
    const/4 v0, 0x0

    .line 807
    .local v0, "type":Lezvcard/property/SourceDisplayText;
    if-eqz p1, :cond_0

    .line 808
    new-instance v0, Lezvcard/property/SourceDisplayText;

    .end local v0    # "type":Lezvcard/property/SourceDisplayText;
    invoke-direct {v0, p1}, Lezvcard/property/SourceDisplayText;-><init>(Ljava/lang/String;)V

    .line 810
    .restart local v0    # "type":Lezvcard/property/SourceDisplayText;
    :cond_0
    invoke-virtual {p0, v0}, Lezvcard/VCard;->setSourceDisplayText(Lezvcard/property/SourceDisplayText;)V

    .line 811
    return-object v0
.end method

.method public setSourceDisplayText(Lezvcard/property/SourceDisplayText;)V
    .locals 1
    .param p1, "sourceDisplayText"    # Lezvcard/property/SourceDisplayText;

    .prologue
    .line 789
    const-class v0, Lezvcard/property/SourceDisplayText;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 790
    return-void
.end method

.method public setStructuredName(Lezvcard/property/StructuredName;)V
    .locals 1
    .param p1, "structuredName"    # Lezvcard/property/StructuredName;

    .prologue
    .line 1083
    const-class v0, Lezvcard/property/StructuredName;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 1084
    return-void
.end method

.method public setStructuredNameAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/StructuredName;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1048
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/StructuredName;>;"
    const-class v0, Lezvcard/property/StructuredName;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 1049
    return-void
.end method

.method public varargs setStructuredNameAlt([Lezvcard/property/StructuredName;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/StructuredName;

    .prologue
    .line 1068
    const-class v0, Lezvcard/property/StructuredName;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 1069
    return-void
.end method

.method public setTimezone(Lezvcard/property/Timezone;)V
    .locals 1
    .param p1, "timezone"    # Lezvcard/property/Timezone;

    .prologue
    .line 2813
    const-class v0, Lezvcard/property/Timezone;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 2814
    return-void
.end method

.method public setTimezoneAlt(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/property/Timezone;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 2737
    .local p1, "altRepresentations":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/property/Timezone;>;"
    const-class v0, Lezvcard/property/Timezone;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;Ljava/util/Collection;)V

    .line 2738
    return-void
.end method

.method public varargs setTimezoneAlt([Lezvcard/property/Timezone;)V
    .locals 1
    .param p1, "altRepresentations"    # [Lezvcard/property/Timezone;

    .prologue
    .line 2757
    const-class v0, Lezvcard/property/Timezone;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setPropertyAlt(Ljava/lang/Class;[Lezvcard/property/VCardProperty;)V

    .line 2758
    return-void
.end method

.method public setUid(Lezvcard/property/Uid;)V
    .locals 1
    .param p1, "uid"    # Lezvcard/property/Uid;

    .prologue
    .line 3484
    const-class v0, Lezvcard/property/Uid;

    invoke-virtual {p0, v0, p1}, Lezvcard/VCard;->setProperty(Ljava/lang/Class;Lezvcard/property/VCardProperty;)V

    .line 3485
    return-void
.end method

.method public setVersion(Lezvcard/VCardVersion;)V
    .locals 0
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 439
    iput-object p1, p0, Lezvcard/VCard;->version:Lezvcard/VCardVersion;

    .line 440
    return-void
.end method

.method public validate(Lezvcard/VCardVersion;)Lezvcard/ValidationWarnings;
    .locals 7
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 4686
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4689
    .local v0, "groups":Ljava/util/List;, "Ljava/util/List<Lezvcard/ValidationWarnings$WarningsGroup;>;"
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 4690
    .local v3, "vcardWarnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p0}, Lezvcard/VCard;->getStructuredName()Lezvcard/property/StructuredName;

    move-result-object v5

    if-nez v5, :cond_1

    sget-object v5, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    if-eq p1, v5, :cond_0

    sget-object v5, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    if-ne p1, v5, :cond_1

    .line 4691
    :cond_0
    const-string v5, "A structured name property must be defined."

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4693
    :cond_1
    invoke-virtual {p0}, Lezvcard/VCard;->getFormattedName()Lezvcard/property/FormattedName;

    move-result-object v5

    if-nez v5, :cond_3

    sget-object v5, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    if-eq p1, v5, :cond_2

    sget-object v5, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    if-ne p1, v5, :cond_3

    .line 4694
    :cond_2
    const-string v5, "A formatted name property must be defined."

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4696
    :cond_3
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_4

    .line 4697
    new-instance v5, Lezvcard/ValidationWarnings$WarningsGroup;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v3}, Lezvcard/ValidationWarnings$WarningsGroup;-><init>(Lezvcard/property/VCardProperty;Ljava/util/List;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4701
    :cond_4
    invoke-virtual {p0}, Lezvcard/VCard;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_5
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lezvcard/property/VCardProperty;

    .line 4702
    .local v2, "property":Lezvcard/property/VCardProperty;
    invoke-virtual {v2, p1, p0}, Lezvcard/property/VCardProperty;->validate(Lezvcard/VCardVersion;Lezvcard/VCard;)Ljava/util/List;

    move-result-object v4

    .line 4703
    .local v4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_5

    .line 4704
    new-instance v5, Lezvcard/ValidationWarnings$WarningsGroup;

    invoke-direct {v5, v2, v4}, Lezvcard/ValidationWarnings$WarningsGroup;-><init>(Lezvcard/property/VCardProperty;Ljava/util/List;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 4708
    .end local v2    # "property":Lezvcard/property/VCardProperty;
    .end local v4    # "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_6
    new-instance v5, Lezvcard/ValidationWarnings;

    invoke-direct {v5, v0, p1}, Lezvcard/ValidationWarnings;-><init>(Ljava/util/List;Lezvcard/VCardVersion;)V

    return-object v5
.end method

.method public write()Ljava/lang/String;
    .locals 2

    .prologue
    .line 136
    const/4 v0, 0x1

    new-array v0, v0, [Lezvcard/VCard;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lezvcard/Ezvcard;->write([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainText;

    move-result-object v0

    invoke-virtual {v0}, Lezvcard/Ezvcard$WriterChainText;->go()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(Ljava/io/File;)V
    .locals 2
    .param p1, "file"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 160
    const/4 v0, 0x1

    new-array v0, v0, [Lezvcard/VCard;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lezvcard/Ezvcard;->write([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainText;

    move-result-object v0

    invoke-virtual {v0, p1}, Lezvcard/Ezvcard$WriterChainText;->go(Ljava/io/File;)V

    .line 161
    return-void
.end method

.method public write(Ljava/io/OutputStream;)V
    .locals 2
    .param p1, "out"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 184
    const/4 v0, 0x1

    new-array v0, v0, [Lezvcard/VCard;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lezvcard/Ezvcard;->write([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainText;

    move-result-object v0

    invoke-virtual {v0, p1}, Lezvcard/Ezvcard$WriterChainText;->go(Ljava/io/OutputStream;)V

    .line 185
    return-void
.end method

.method public write(Ljava/io/Writer;)V
    .locals 2
    .param p1, "writer"    # Ljava/io/Writer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 208
    const/4 v0, 0x1

    new-array v0, v0, [Lezvcard/VCard;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lezvcard/Ezvcard;->write([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainText;

    move-result-object v0

    invoke-virtual {v0, p1}, Lezvcard/Ezvcard$WriterChainText;->go(Ljava/io/Writer;)V

    .line 209
    return-void
.end method

.method public writeHtml()Ljava/lang/String;
    .locals 2

    .prologue
    .line 293
    const/4 v0, 0x1

    new-array v0, v0, [Lezvcard/VCard;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lezvcard/Ezvcard;->writeHtml([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainHtml;

    move-result-object v0

    invoke-virtual {v0}, Lezvcard/Ezvcard$WriterChainHtml;->go()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeHtml(Ljava/io/File;)V
    .locals 2
    .param p1, "file"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 310
    const/4 v0, 0x1

    new-array v0, v0, [Lezvcard/VCard;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lezvcard/Ezvcard;->writeHtml([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainHtml;

    move-result-object v0

    invoke-virtual {v0, p1}, Lezvcard/Ezvcard$WriterChainHtml;->go(Ljava/io/File;)V

    .line 311
    return-void
.end method

.method public writeHtml(Ljava/io/OutputStream;)V
    .locals 2
    .param p1, "out"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 327
    const/4 v0, 0x1

    new-array v0, v0, [Lezvcard/VCard;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lezvcard/Ezvcard;->writeHtml([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainHtml;

    move-result-object v0

    invoke-virtual {v0, p1}, Lezvcard/Ezvcard$WriterChainHtml;->go(Ljava/io/OutputStream;)V

    .line 328
    return-void
.end method

.method public writeHtml(Ljava/io/Writer;)V
    .locals 2
    .param p1, "writer"    # Ljava/io/Writer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 344
    const/4 v0, 0x1

    new-array v0, v0, [Lezvcard/VCard;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lezvcard/Ezvcard;->writeHtml([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainHtml;

    move-result-object v0

    invoke-virtual {v0, p1}, Lezvcard/Ezvcard$WriterChainHtml;->go(Ljava/io/Writer;)V

    .line 345
    return-void
.end method

.method public writeJson()Ljava/lang/String;
    .locals 2

    .prologue
    .line 362
    const/4 v0, 0x1

    new-array v0, v0, [Lezvcard/VCard;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lezvcard/Ezvcard;->writeJson([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainJson;

    move-result-object v0

    invoke-virtual {v0}, Lezvcard/Ezvcard$WriterChainJson;->go()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeJson(Ljava/io/File;)V
    .locals 2
    .param p1, "file"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 381
    const/4 v0, 0x1

    new-array v0, v0, [Lezvcard/VCard;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lezvcard/Ezvcard;->writeJson([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainJson;

    move-result-object v0

    invoke-virtual {v0, p1}, Lezvcard/Ezvcard$WriterChainJson;->go(Ljava/io/File;)V

    .line 382
    return-void
.end method

.method public writeJson(Ljava/io/OutputStream;)V
    .locals 2
    .param p1, "out"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 400
    const/4 v0, 0x1

    new-array v0, v0, [Lezvcard/VCard;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lezvcard/Ezvcard;->writeJson([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainJson;

    move-result-object v0

    invoke-virtual {v0, p1}, Lezvcard/Ezvcard$WriterChainJson;->go(Ljava/io/OutputStream;)V

    .line 401
    return-void
.end method

.method public writeJson(Ljava/io/Writer;)V
    .locals 2
    .param p1, "writer"    # Ljava/io/Writer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 419
    const/4 v0, 0x1

    new-array v0, v0, [Lezvcard/VCard;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lezvcard/Ezvcard;->writeJson([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainJson;

    move-result-object v0

    invoke-virtual {v0, p1}, Lezvcard/Ezvcard$WriterChainJson;->go(Ljava/io/Writer;)V

    .line 420
    return-void
.end method

.method public writeXml()Ljava/lang/String;
    .locals 2

    .prologue
    .line 224
    const/4 v0, 0x1

    new-array v0, v0, [Lezvcard/VCard;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lezvcard/Ezvcard;->writeXml([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainXml;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lezvcard/Ezvcard$WriterChainXml;->indent(I)Lezvcard/Ezvcard$WriterChainXml;

    move-result-object v0

    invoke-virtual {v0}, Lezvcard/Ezvcard$WriterChainXml;->go()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeXml(Ljava/io/File;)V
    .locals 2
    .param p1, "file"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljavax/xml/transform/TransformerException;
        }
    .end annotation

    .prologue
    .line 242
    const/4 v0, 0x1

    new-array v0, v0, [Lezvcard/VCard;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lezvcard/Ezvcard;->writeXml([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainXml;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lezvcard/Ezvcard$WriterChainXml;->indent(I)Lezvcard/Ezvcard$WriterChainXml;

    move-result-object v0

    invoke-virtual {v0, p1}, Lezvcard/Ezvcard$WriterChainXml;->go(Ljava/io/File;)V

    .line 243
    return-void
.end method

.method public writeXml(Ljava/io/OutputStream;)V
    .locals 2
    .param p1, "out"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/transform/TransformerException;
        }
    .end annotation

    .prologue
    .line 260
    const/4 v0, 0x1

    new-array v0, v0, [Lezvcard/VCard;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lezvcard/Ezvcard;->writeXml([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainXml;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lezvcard/Ezvcard$WriterChainXml;->indent(I)Lezvcard/Ezvcard$WriterChainXml;

    move-result-object v0

    invoke-virtual {v0, p1}, Lezvcard/Ezvcard$WriterChainXml;->go(Ljava/io/OutputStream;)V

    .line 261
    return-void
.end method

.method public writeXml(Ljava/io/Writer;)V
    .locals 2
    .param p1, "writer"    # Ljava/io/Writer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/transform/TransformerException;
        }
    .end annotation

    .prologue
    .line 277
    const/4 v0, 0x1

    new-array v0, v0, [Lezvcard/VCard;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Lezvcard/Ezvcard;->writeXml([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainXml;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lezvcard/Ezvcard$WriterChainXml;->indent(I)Lezvcard/Ezvcard$WriterChainXml;

    move-result-object v0

    invoke-virtual {v0, p1}, Lezvcard/Ezvcard$WriterChainXml;->go(Ljava/io/Writer;)V

    .line 278
    return-void
.end method
