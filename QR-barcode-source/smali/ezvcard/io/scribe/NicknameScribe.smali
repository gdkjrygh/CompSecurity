.class public Lezvcard/io/scribe/NicknameScribe;
.super Lezvcard/io/scribe/ListPropertyScribe;
.source "NicknameScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/ListPropertyScribe",
        "<",
        "Lezvcard/property/Nickname;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 39
    const-class v0, Lezvcard/property/Nickname;

    const-string v1, "NICKNAME"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/ListPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 40
    return-void
.end method


# virtual methods
.method protected _newInstance()Lezvcard/property/Nickname;
    .locals 1

    .prologue
    .line 51
    new-instance v0, Lezvcard/property/Nickname;

    invoke-direct {v0}, Lezvcard/property/Nickname;-><init>()V

    return-object v0
.end method

.method protected bridge synthetic _newInstance()Lezvcard/property/TextListProperty;
    .locals 1

    .prologue
    .line 37
    invoke-virtual {p0}, Lezvcard/io/scribe/NicknameScribe;->_newInstance()Lezvcard/property/Nickname;

    move-result-object v0

    return-object v0
.end method

.method protected _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Nickname;
    .locals 2
    .param p1, "element"    # Lezvcard/io/html/HCardElement;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/html/HCardElement;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lezvcard/property/Nickname;"
        }
    .end annotation

    .prologue
    .line 44
    .local p2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p0}, Lezvcard/io/scribe/NicknameScribe;->_newInstance()Lezvcard/property/Nickname;

    move-result-object v0

    .line 45
    .local v0, "property":Lezvcard/property/Nickname;
    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lezvcard/property/Nickname;->addValue(Ljava/lang/Object;)V

    .line 46
    return-object v0
.end method

.method protected bridge synthetic _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/html/HCardElement;
    .param p2, "x1"    # Ljava/util/List;

    .prologue
    .line 37
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/NicknameScribe;->_parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Nickname;

    move-result-object v0

    return-object v0
.end method
