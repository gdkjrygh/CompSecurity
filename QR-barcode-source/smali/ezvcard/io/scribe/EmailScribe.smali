.class public Lezvcard/io/scribe/EmailScribe;
.super Lezvcard/io/scribe/StringPropertyScribe;
.source "EmailScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/StringPropertyScribe",
        "<",
        "Lezvcard/property/Email;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 44
    const-class v0, Lezvcard/property/Email;

    const-string v1, "EMAIL"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/StringPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 45
    return-void
.end method


# virtual methods
.method protected _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Email;
    .locals 10
    .param p1, "element"    # Lezvcard/io/html/HCardElement;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/html/HCardElement;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lezvcard/property/Email;"
        }
    .end annotation

    .prologue
    .line 61
    .local p2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const-string v8, "href"

    invoke-virtual {p1, v8}, Lezvcard/io/html/HCardElement;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 62
    .local v1, "href":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_1

    .line 63
    const-string v8, "^mailto:(.*)$"

    const/4 v9, 0x2

    invoke-static {v8, v9}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v4

    .line 64
    .local v4, "p":Ljava/util/regex/Pattern;
    invoke-virtual {v4, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 65
    .local v3, "m":Ljava/util/regex/Matcher;
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v8, 0x1

    invoke-virtual {v3, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    .line 70
    .end local v3    # "m":Ljava/util/regex/Matcher;
    .end local v4    # "p":Ljava/util/regex/Pattern;
    .local v0, "email":Ljava/lang/String;
    :goto_0
    new-instance v5, Lezvcard/property/Email;

    invoke-direct {v5, v0}, Lezvcard/property/Email;-><init>(Ljava/lang/String;)V

    .line 73
    .local v5, "property":Lezvcard/property/Email;
    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->types()Ljava/util/List;

    move-result-object v7

    .line 74
    .local v7, "types":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 75
    .local v6, "type":Ljava/lang/String;
    invoke-virtual {v5}, Lezvcard/property/Email;->getParameters()Lezvcard/parameter/VCardParameters;

    move-result-object v8

    invoke-virtual {v8, v6}, Lezvcard/parameter/VCardParameters;->addType(Ljava/lang/String;)V

    goto :goto_1

    .line 65
    .end local v0    # "email":Ljava/lang/String;
    .end local v2    # "i$":Ljava/util/Iterator;
    .end local v5    # "property":Lezvcard/property/Email;
    .end local v6    # "type":Ljava/lang/String;
    .end local v7    # "types":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .restart local v3    # "m":Ljava/util/regex/Matcher;
    .restart local v4    # "p":Ljava/util/regex/Pattern;
    :cond_0
    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->value()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 67
    .end local v3    # "m":Ljava/util/regex/Matcher;
    .end local v4    # "p":Ljava/util/regex/Pattern;
    :cond_1
    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->value()Ljava/lang/String;

    move-result-object v0

    .restart local v0    # "email":Ljava/lang/String;
    goto :goto_0

    .line 78
    .restart local v2    # "i$":Ljava/util/Iterator;
    .restart local v5    # "property":Lezvcard/property/Email;
    .restart local v7    # "types":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_2
    return-object v5
.end method

.method protected bridge synthetic _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/html/HCardElement;
    .param p2, "x1"    # Ljava/util/List;

    .prologue
    .line 42
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/EmailScribe;->_parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Email;

    move-result-object v0

    return-object v0
.end method

.method protected _parseValue(Ljava/lang/String;)Lezvcard/property/Email;
    .locals 1
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 54
    new-instance v0, Lezvcard/property/Email;

    invoke-direct {v0, p1}, Lezvcard/property/Email;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method protected bridge synthetic _parseValue(Ljava/lang/String;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;

    .prologue
    .line 42
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/EmailScribe;->_parseValue(Ljava/lang/String;)Lezvcard/property/Email;

    move-result-object v0

    return-object v0
.end method

.method protected _prepareParameters(Lezvcard/property/Email;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Lezvcard/VCard;)V
    .locals 0
    .param p1, "property"    # Lezvcard/property/Email;
    .param p2, "copy"    # Lezvcard/parameter/VCardParameters;
    .param p3, "version"    # Lezvcard/VCardVersion;
    .param p4, "vcard"    # Lezvcard/VCard;

    .prologue
    .line 49
    invoke-static {p1, p2, p3, p4}, Lezvcard/io/scribe/EmailScribe;->handlePrefParam(Lezvcard/property/VCardProperty;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Lezvcard/VCard;)V

    .line 50
    return-void
.end method

.method protected bridge synthetic _prepareParameters(Lezvcard/property/VCardProperty;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Lezvcard/VCard;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x2"    # Lezvcard/VCardVersion;
    .param p4, "x3"    # Lezvcard/VCard;

    .prologue
    .line 42
    check-cast p1, Lezvcard/property/Email;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/EmailScribe;->_prepareParameters(Lezvcard/property/Email;Lezvcard/parameter/VCardParameters;Lezvcard/VCardVersion;Lezvcard/VCard;)V

    return-void
.end method
