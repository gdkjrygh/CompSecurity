.class public Lezvcard/property/StructuredName;
.super Lezvcard/property/VCardProperty;
.source "StructuredName.java"

# interfaces
.implements Lezvcard/property/HasAltId;


# instance fields
.field private additional:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private family:Ljava/lang/String;

.field private given:Ljava/lang/String;

.field private prefixes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private suffixes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 62
    invoke-direct {p0}, Lezvcard/property/VCardProperty;-><init>()V

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lezvcard/property/StructuredName;->additional:Ljava/util/List;

    .line 66
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lezvcard/property/StructuredName;->prefixes:Ljava/util/List;

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lezvcard/property/StructuredName;->suffixes:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public addAdditional(Ljava/lang/String;)V
    .locals 1
    .param p1, "additional"    # Ljava/lang/String;

    .prologue
    .line 114
    iget-object v0, p0, Lezvcard/property/StructuredName;->additional:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 115
    return-void
.end method

.method public addPrefix(Ljava/lang/String;)V
    .locals 1
    .param p1, "prefix"    # Ljava/lang/String;

    .prologue
    .line 130
    iget-object v0, p0, Lezvcard/property/StructuredName;->prefixes:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    return-void
.end method

.method public addSuffix(Ljava/lang/String;)V
    .locals 1
    .param p1, "suffix"    # Ljava/lang/String;

    .prologue
    .line 146
    iget-object v0, p0, Lezvcard/property/StructuredName;->suffixes:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 147
    return-void
.end method

.method public getAdditional()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 106
    iget-object v0, p0, Lezvcard/property/StructuredName;->additional:Ljava/util/List;

    return-object v0
.end method

.method public getAltId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 216
    iget-object v0, p0, Lezvcard/property/StructuredName;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getAltId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getFamily()Ljava/lang/String;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lezvcard/property/StructuredName;->family:Ljava/lang/String;

    return-object v0
.end method

.method public getGiven()Ljava/lang/String;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lezvcard/property/StructuredName;->given:Ljava/lang/String;

    return-object v0
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 206
    invoke-super {p0}, Lezvcard/property/VCardProperty;->getLanguage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPrefixes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 122
    iget-object v0, p0, Lezvcard/property/StructuredName;->prefixes:Ljava/util/List;

    return-object v0
.end method

.method public getSortAs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 164
    iget-object v0, p0, Lezvcard/property/StructuredName;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->getSortAs()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getSuffixes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 138
    iget-object v0, p0, Lezvcard/property/StructuredName;->suffixes:Ljava/util/List;

    return-object v0
.end method

.method public setAltId(Ljava/lang/String;)V
    .locals 1
    .param p1, "altId"    # Ljava/lang/String;

    .prologue
    .line 221
    iget-object v0, p0, Lezvcard/property/StructuredName;->parameters:Lezvcard/parameter/VCardParameters;

    invoke-virtual {v0, p1}, Lezvcard/parameter/VCardParameters;->setAltId(Ljava/lang/String;)V

    .line 222
    return-void
.end method

.method public setFamily(Ljava/lang/String;)V
    .locals 0
    .param p1, "family"    # Ljava/lang/String;

    .prologue
    .line 82
    iput-object p1, p0, Lezvcard/property/StructuredName;->family:Ljava/lang/String;

    .line 83
    return-void
.end method

.method public setGiven(Ljava/lang/String;)V
    .locals 0
    .param p1, "given"    # Ljava/lang/String;

    .prologue
    .line 98
    iput-object p1, p0, Lezvcard/property/StructuredName;->given:Ljava/lang/String;

    .line 99
    return-void
.end method

.method public setLanguage(Ljava/lang/String;)V
    .locals 0
    .param p1, "language"    # Ljava/lang/String;

    .prologue
    .line 211
    invoke-super {p0, p1}, Lezvcard/property/VCardProperty;->setLanguage(Ljava/lang/String;)V

    .line 212
    return-void
.end method

.method public setSortAs(Ljava/lang/String;)V
    .locals 3
    .param p1, "family"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x0

    .line 180
    if-nez p1, :cond_0

    .line 181
    iget-object v0, p0, Lezvcard/property/StructuredName;->parameters:Lezvcard/parameter/VCardParameters;

    new-array v1, v2, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Lezvcard/parameter/VCardParameters;->setSortAs([Ljava/lang/String;)V

    .line 185
    :goto_0
    return-void

    .line 183
    :cond_0
    iget-object v0, p0, Lezvcard/property/StructuredName;->parameters:Lezvcard/parameter/VCardParameters;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Lezvcard/parameter/VCardParameters;->setSortAs([Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setSortAs(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "family"    # Ljava/lang/String;
    .param p2, "given"    # Ljava/lang/String;

    .prologue
    .line 201
    iget-object v0, p0, Lezvcard/property/StructuredName;->parameters:Lezvcard/parameter/VCardParameters;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-virtual {v0, v1}, Lezvcard/parameter/VCardParameters;->setSortAs([Ljava/lang/String;)V

    .line 202
    return-void
.end method
