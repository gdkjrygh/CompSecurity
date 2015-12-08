.class public Lezvcard/io/scribe/DeathdateScribe;
.super Lezvcard/io/scribe/DateOrTimePropertyScribe;
.source "DeathdateScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/DateOrTimePropertyScribe",
        "<",
        "Lezvcard/property/Deathdate;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 39
    const-class v0, Lezvcard/property/Deathdate;

    const-string v1, "DEATHDATE"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/DateOrTimePropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 40
    return-void
.end method


# virtual methods
.method protected bridge synthetic newInstance(Lezvcard/util/PartialDate;)Lezvcard/property/DateOrTimeProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/util/PartialDate;

    .prologue
    .line 37
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/DeathdateScribe;->newInstance(Lezvcard/util/PartialDate;)Lezvcard/property/Deathdate;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic newInstance(Ljava/lang/String;)Lezvcard/property/DateOrTimeProperty;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;

    .prologue
    .line 37
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/DeathdateScribe;->newInstance(Ljava/lang/String;)Lezvcard/property/Deathdate;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic newInstance(Ljava/util/Date;Z)Lezvcard/property/DateOrTimeProperty;
    .locals 1
    .param p1, "x0"    # Ljava/util/Date;
    .param p2, "x1"    # Z

    .prologue
    .line 37
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/DeathdateScribe;->newInstance(Ljava/util/Date;Z)Lezvcard/property/Deathdate;

    move-result-object v0

    return-object v0
.end method

.method protected newInstance(Lezvcard/util/PartialDate;)Lezvcard/property/Deathdate;
    .locals 1
    .param p1, "partialDate"    # Lezvcard/util/PartialDate;

    .prologue
    .line 54
    new-instance v0, Lezvcard/property/Deathdate;

    invoke-direct {v0, p1}, Lezvcard/property/Deathdate;-><init>(Lezvcard/util/PartialDate;)V

    return-object v0
.end method

.method protected newInstance(Ljava/lang/String;)Lezvcard/property/Deathdate;
    .locals 1
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 44
    new-instance v0, Lezvcard/property/Deathdate;

    invoke-direct {v0, p1}, Lezvcard/property/Deathdate;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method protected newInstance(Ljava/util/Date;Z)Lezvcard/property/Deathdate;
    .locals 1
    .param p1, "date"    # Ljava/util/Date;
    .param p2, "hasTime"    # Z

    .prologue
    .line 49
    new-instance v0, Lezvcard/property/Deathdate;

    invoke-direct {v0, p1, p2}, Lezvcard/property/Deathdate;-><init>(Ljava/util/Date;Z)V

    return-object v0
.end method
