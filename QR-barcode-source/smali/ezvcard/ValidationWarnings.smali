.class public Lezvcard/ValidationWarnings;
.super Ljava/lang/Object;
.source "ValidationWarnings.java"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/ValidationWarnings$WarningsGroup;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable",
        "<",
        "Lezvcard/ValidationWarnings$WarningsGroup;",
        ">;"
    }
.end annotation


# instance fields
.field private final version:Lezvcard/VCardVersion;

.field private final warnings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lezvcard/ValidationWarnings$WarningsGroup;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lezvcard/VCardVersion;)V
    .locals 0
    .param p2, "version"    # Lezvcard/VCardVersion;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lezvcard/ValidationWarnings$WarningsGroup;",
            ">;",
            "Lezvcard/VCardVersion;",
            ")V"
        }
    .end annotation

    .prologue
    .line 85
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Lezvcard/ValidationWarnings$WarningsGroup;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-object p1, p0, Lezvcard/ValidationWarnings;->warnings:Ljava/util/List;

    .line 87
    iput-object p2, p0, Lezvcard/ValidationWarnings;->version:Lezvcard/VCardVersion;

    .line 88
    return-void
.end method


# virtual methods
.method public getByProperty(Ljava/lang/Class;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lezvcard/ValidationWarnings$WarningsGroup;",
            ">;"
        }
    .end annotation

    .prologue
    .line 97
    .local p1, "propertyClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lezvcard/property/VCardProperty;>;"
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .local v3, "warnings":Ljava/util/List;, "Ljava/util/List<Lezvcard/ValidationWarnings$WarningsGroup;>;"
    iget-object v4, p0, Lezvcard/ValidationWarnings;->warnings:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/ValidationWarnings$WarningsGroup;

    .line 99
    .local v0, "group":Lezvcard/ValidationWarnings$WarningsGroup;
    invoke-virtual {v0}, Lezvcard/ValidationWarnings$WarningsGroup;->getProperty()Lezvcard/property/VCardProperty;

    move-result-object v2

    .line 100
    .local v2, "property":Lezvcard/property/VCardProperty;
    if-nez v2, :cond_1

    .line 101
    if-nez p1, :cond_0

    .line 102
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 104
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    if-ne p1, v4, :cond_0

    .line 105
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 108
    .end local v0    # "group":Lezvcard/ValidationWarnings$WarningsGroup;
    .end local v2    # "property":Lezvcard/property/VCardProperty;
    :cond_2
    return-object v3
.end method

.method public getVersion()Lezvcard/VCardVersion;
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lezvcard/ValidationWarnings;->version:Lezvcard/VCardVersion;

    return-object v0
.end method

.method public getWarnings()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/ValidationWarnings$WarningsGroup;",
            ">;"
        }
    .end annotation

    .prologue
    .line 116
    iget-object v0, p0, Lezvcard/ValidationWarnings;->warnings:Ljava/util/List;

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 132
    iget-object v0, p0, Lezvcard/ValidationWarnings;->warnings:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lezvcard/ValidationWarnings$WarningsGroup;",
            ">;"
        }
    .end annotation

    .prologue
    .line 157
    iget-object v0, p0, Lezvcard/ValidationWarnings;->warnings:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 148
    iget-object v0, p0, Lezvcard/ValidationWarnings;->warnings:Ljava/util/List;

    sget-object v1, Lezvcard/util/StringUtils;->NEWLINE:Ljava/lang/String;

    invoke-static {v0, v1}, Lezvcard/util/StringUtils;->join(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
