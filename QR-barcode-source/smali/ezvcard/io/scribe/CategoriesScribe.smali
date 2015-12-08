.class public Lezvcard/io/scribe/CategoriesScribe;
.super Lezvcard/io/scribe/ListPropertyScribe;
.source "CategoriesScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/ListPropertyScribe",
        "<",
        "Lezvcard/property/Categories;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 39
    const-class v0, Lezvcard/property/Categories;

    const-string v1, "CATEGORIES"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/ListPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 40
    return-void
.end method


# virtual methods
.method protected _newInstance()Lezvcard/property/Categories;
    .locals 1

    .prologue
    .line 56
    new-instance v0, Lezvcard/property/Categories;

    invoke-direct {v0}, Lezvcard/property/Categories;-><init>()V

    return-object v0
.end method

.method protected bridge synthetic _newInstance()Lezvcard/property/TextListProperty;
    .locals 1

    .prologue
    .line 37
    invoke-virtual {p0}, Lezvcard/io/scribe/CategoriesScribe;->_newInstance()Lezvcard/property/Categories;

    move-result-object v0

    return-object v0
.end method

.method protected _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Categories;
    .locals 3
    .param p1, "element"    # Lezvcard/io/html/HCardElement;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/html/HCardElement;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lezvcard/property/Categories;"
        }
    .end annotation

    .prologue
    .line 44
    .local p2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const-string v2, "rel"

    invoke-virtual {p1, v2}, Lezvcard/io/html/HCardElement;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 45
    .local v1, "value":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_0

    .line 46
    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->value()Ljava/lang/String;

    move-result-object v1

    .line 49
    :cond_0
    invoke-virtual {p0}, Lezvcard/io/scribe/CategoriesScribe;->_newInstance()Lezvcard/property/Categories;

    move-result-object v0

    .line 50
    .local v0, "property":Lezvcard/property/Categories;
    invoke-virtual {v0, v1}, Lezvcard/property/Categories;->addValue(Ljava/lang/Object;)V

    .line 51
    return-object v0
.end method

.method protected bridge synthetic _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/html/HCardElement;
    .param p2, "x1"    # Ljava/util/List;

    .prologue
    .line 37
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/CategoriesScribe;->_parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Categories;

    move-result-object v0

    return-object v0
.end method
