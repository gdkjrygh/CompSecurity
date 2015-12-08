.class public abstract Lezvcard/io/scribe/UriPropertyScribe;
.super Lezvcard/io/scribe/StringPropertyScribe;
.source "UriPropertyScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lezvcard/property/TextProperty;",
        ">",
        "Lezvcard/io/scribe/StringPropertyScribe",
        "<TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1
    .param p2, "propertyName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 41
    .local p0, "this":Lezvcard/io/scribe/UriPropertyScribe;, "Lezvcard/io/scribe/UriPropertyScribe<TT;>;"
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    sget-object v0, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    invoke-direct {p0, p1, p2, v0}, Lezvcard/io/scribe/StringPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 42
    return-void
.end method


# virtual methods
.method protected _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/TextProperty;
    .locals 2
    .param p1, "element"    # Lezvcard/io/html/HCardElement;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/html/HCardElement;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)TT;"
        }
    .end annotation

    .prologue
    .line 46
    .local p0, "this":Lezvcard/io/scribe/UriPropertyScribe;, "Lezvcard/io/scribe/UriPropertyScribe<TT;>;"
    .local p2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const-string v1, "href"

    invoke-virtual {p1, v1}, Lezvcard/io/html/HCardElement;->absUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 47
    .local v0, "href":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    .line 48
    invoke-super {p0, p1, p2}, Lezvcard/io/scribe/StringPropertyScribe;->_parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;

    move-result-object v1

    check-cast v1, Lezvcard/property/TextProperty;

    .line 50
    :goto_0
    return-object v1

    :cond_0
    invoke-virtual {p0, v0}, Lezvcard/io/scribe/UriPropertyScribe;->_parseValue(Ljava/lang/String;)Lezvcard/property/VCardProperty;

    move-result-object v1

    check-cast v1, Lezvcard/property/TextProperty;

    goto :goto_0
.end method

.method protected bridge synthetic _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/html/HCardElement;
    .param p2, "x1"    # Ljava/util/List;

    .prologue
    .line 39
    .local p0, "this":Lezvcard/io/scribe/UriPropertyScribe;, "Lezvcard/io/scribe/UriPropertyScribe<TT;>;"
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/UriPropertyScribe;->_parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/TextProperty;

    move-result-object v0

    return-object v0
.end method
