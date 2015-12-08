.class public Lezvcard/property/Anniversary;
.super Lezvcard/property/DateOrTimeProperty;
.source "Anniversary.java"


# direct methods
.method public constructor <init>(Lezvcard/util/PartialDate;)V
    .locals 0
    .param p1, "partialDate"    # Lezvcard/util/PartialDate;

    .prologue
    .line 121
    invoke-direct {p0, p1}, Lezvcard/property/DateOrTimeProperty;-><init>(Lezvcard/util/PartialDate;)V

    .line 122
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 129
    invoke-direct {p0, p1}, Lezvcard/property/DateOrTimeProperty;-><init>(Ljava/lang/String;)V

    .line 130
    return-void
.end method

.method public constructor <init>(Ljava/util/Date;)V
    .locals 0
    .param p1, "date"    # Ljava/util/Date;

    .prologue
    .line 103
    invoke-direct {p0, p1}, Lezvcard/property/DateOrTimeProperty;-><init>(Ljava/util/Date;)V

    .line 104
    return-void
.end method

.method public constructor <init>(Ljava/util/Date;Z)V
    .locals 0
    .param p1, "date"    # Ljava/util/Date;
    .param p2, "hasTime"    # Z

    .prologue
    .line 113
    invoke-direct {p0, p1, p2}, Lezvcard/property/DateOrTimeProperty;-><init>(Ljava/util/Date;Z)V

    .line 114
    return-void
.end method


# virtual methods
.method public _supportedVersions()Ljava/util/Set;
    .locals 1
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
    .line 134
    sget-object v0, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method
