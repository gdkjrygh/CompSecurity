.class public Lezvcard/io/scribe/LanguageScribe;
.super Lezvcard/io/scribe/StringPropertyScribe;
.source "LanguageScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/StringPropertyScribe",
        "<",
        "Lezvcard/property/Language;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 37
    const-class v0, Lezvcard/property/Language;

    const-string v1, "LANG"

    sget-object v2, Lezvcard/VCardDataType;->LANGUAGE_TAG:Lezvcard/VCardDataType;

    invoke-direct {p0, v0, v1, v2}, Lezvcard/io/scribe/StringPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 38
    return-void
.end method


# virtual methods
.method protected _parseValue(Ljava/lang/String;)Lezvcard/property/Language;
    .locals 1
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 42
    new-instance v0, Lezvcard/property/Language;

    invoke-direct {v0, p1}, Lezvcard/property/Language;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method protected bridge synthetic _parseValue(Ljava/lang/String;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/LanguageScribe;->_parseValue(Ljava/lang/String;)Lezvcard/property/Language;

    move-result-object v0

    return-object v0
.end method
