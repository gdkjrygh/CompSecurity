.class public Lezvcard/property/Agent;
.super Lezvcard/property/VCardProperty;
.source "Agent.java"


# instance fields
.field private url:Ljava/lang/String;

.field private vcard:Lezvcard/VCard;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 83
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 85
    return-void
.end method

.method public constructor <init>(Lezvcard/VCard;)V
    .locals 0
    .param p1, "vcard"    # Lezvcard/VCard;

    .prologue
    .line 99
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 100
    invoke-virtual {p0, p1}, Lezvcard/property/Agent;->setVCard(Lezvcard/VCard;)V

    .line 101
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 91
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 92
    invoke-virtual {p0, p1}, Lezvcard/property/Agent;->setUrl(Ljava/lang/String;)V

    .line 93
    return-void
.end method


# virtual methods
.method public _supportedVersions()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lezvcard/VCardVersion;",
            ">;"
        }
    .end annotation

    .prologue
    .line 105
    sget-object v0, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    sget-object v1, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method

.method protected _validate(Ljava/util/List;Lezvcard/VCardVersion;Lezvcard/VCard;)V
    .locals 9
    .param p2, "version"    # Lezvcard/VCardVersion;
    .param p3, "vcard"    # Lezvcard/VCard;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lezvcard/VCardVersion;",
            "Lezvcard/VCard;",
            ")V"
        }
    .end annotation

    .prologue
    .line 144
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v7, p0, Lezvcard/property/Agent;->url:Ljava/lang/String;

    if-nez v7, :cond_0

    iget-object v7, p0, Lezvcard/property/Agent;->vcard:Lezvcard/VCard;

    if-nez v7, :cond_0

    .line 145
    const-string v7, "Property has neither a URL nor an embedded vCard."

    invoke-interface {p1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 148
    :cond_0
    iget-object v7, p0, Lezvcard/property/Agent;->vcard:Lezvcard/VCard;

    if-eqz v7, :cond_3

    .line 149
    iget-object v7, p0, Lezvcard/property/Agent;->vcard:Lezvcard/VCard;

    invoke-virtual {v7, p2}, Lezvcard/VCard;->validate(Lezvcard/VCardVersion;)Lezvcard/ValidationWarnings;

    move-result-object v5

    .line 150
    .local v5, "validationWarnings":Lezvcard/ValidationWarnings;
    invoke-virtual {v5}, Lezvcard/ValidationWarnings;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/ValidationWarnings$WarningsGroup;

    .line 151
    .local v0, "group":Lezvcard/ValidationWarnings$WarningsGroup;
    invoke-virtual {v0}, Lezvcard/ValidationWarnings$WarningsGroup;->getProperty()Lezvcard/property/VCardProperty;

    move-result-object v4

    .line 152
    .local v4, "property":Lezvcard/property/VCardProperty;
    if-nez v4, :cond_2

    const-string v3, ""

    .line 154
    .local v3, "prefix":Ljava/lang/String;
    :goto_0
    invoke-virtual {v0}, Lezvcard/ValidationWarnings$WarningsGroup;->getMessages()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 155
    .local v6, "warning":Ljava/lang/String;
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 152
    .end local v2    # "i$":Ljava/util/Iterator;
    .end local v3    # "prefix":Ljava/lang/String;
    .end local v6    # "warning":Ljava/lang/String;
    :cond_2
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "["

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "]: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 159
    .end local v0    # "group":Lezvcard/ValidationWarnings$WarningsGroup;
    .end local v4    # "property":Lezvcard/property/VCardProperty;
    .end local v5    # "validationWarnings":Lezvcard/ValidationWarnings;
    :cond_3
    return-void
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lezvcard/property/Agent;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getVCard()Lezvcard/VCard;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lezvcard/property/Agent;->vcard:Lezvcard/VCard;

    return-object v0
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 121
    iput-object p1, p0, Lezvcard/property/Agent;->url:Ljava/lang/String;

    .line 122
    const/4 v0, 0x0

    iput-object v0, p0, Lezvcard/property/Agent;->vcard:Lezvcard/VCard;

    .line 123
    return-void
.end method

.method public setVCard(Lezvcard/VCard;)V
    .locals 1
    .param p1, "vcard"    # Lezvcard/VCard;

    .prologue
    .line 138
    iput-object p1, p0, Lezvcard/property/Agent;->vcard:Lezvcard/VCard;

    .line 139
    const/4 v0, 0x0

    iput-object v0, p0, Lezvcard/property/Agent;->url:Ljava/lang/String;

    .line 140
    return-void
.end method
