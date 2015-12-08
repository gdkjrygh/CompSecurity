.class public Lezvcard/io/scribe/LabelScribe;
.super Lezvcard/io/scribe/StringPropertyScribe;
.source "LabelScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/StringPropertyScribe",
        "<",
        "Lezvcard/property/Label;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 39
    const-class v0, Lezvcard/property/Label;

    const-string v1, "LABEL"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/StringPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 40
    return-void
.end method


# virtual methods
.method protected _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Label;
    .locals 5
    .param p1, "element"    # Lezvcard/io/html/HCardElement;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/html/HCardElement;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lezvcard/property/Label;"
        }
    .end annotation

    .prologue
    .line 49
    .local p2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v1, Lezvcard/property/Label;

    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->value()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Lezvcard/property/Label;-><init>(Ljava/lang/String;)V

    .line 51
    .local v1, "property":Lezvcard/property/Label;
    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->types()Ljava/util/List;

    move-result-object v3

    .line 52
    .local v3, "types":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 53
    .local v2, "type":Ljava/lang/String;
    invoke-virtual {v1}, Lezvcard/property/Label;->getParameters()Lezvcard/parameter/VCardParameters;

    move-result-object v4

    invoke-virtual {v4, v2}, Lezvcard/parameter/VCardParameters;->addType(Ljava/lang/String;)V

    goto :goto_0

    .line 56
    .end local v2    # "type":Ljava/lang/String;
    :cond_0
    return-object v1
.end method

.method protected bridge synthetic _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/html/HCardElement;
    .param p2, "x1"    # Ljava/util/List;

    .prologue
    .line 37
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/LabelScribe;->_parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Label;

    move-result-object v0

    return-object v0
.end method

.method protected _parseValue(Ljava/lang/String;)Lezvcard/property/Label;
    .locals 1
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 44
    new-instance v0, Lezvcard/property/Label;

    invoke-direct {v0, p1}, Lezvcard/property/Label;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method protected bridge synthetic _parseValue(Ljava/lang/String;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;

    .prologue
    .line 37
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/LabelScribe;->_parseValue(Ljava/lang/String;)Lezvcard/property/Label;

    move-result-object v0

    return-object v0
.end method
