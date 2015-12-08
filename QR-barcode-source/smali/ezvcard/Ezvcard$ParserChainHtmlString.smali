.class public Lezvcard/Ezvcard$ParserChainHtmlString;
.super Lezvcard/Ezvcard$ParserChainHtml;
.source "Ezvcard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/Ezvcard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ParserChainHtmlString"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/Ezvcard$ParserChainHtml",
        "<",
        "Lezvcard/Ezvcard$ParserChainHtmlString;",
        ">;"
    }
.end annotation


# instance fields
.field private final html:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "html"    # Ljava/lang/String;

    .prologue
    .line 1105
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChainHtml;-><init>()V

    .line 1106
    iput-object p1, p0, Lezvcard/Ezvcard$ParserChainHtmlString;->html:Ljava/lang/String;

    .line 1107
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 1102
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$ParserChainHtmlString;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method _constructReader()Lezvcard/io/html/HCardReader;
    .locals 3

    .prologue
    .line 1126
    new-instance v0, Lezvcard/io/html/HCardReader;

    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainHtmlString;->html:Ljava/lang/String;

    iget-object v2, p0, Lezvcard/Ezvcard$ParserChainHtmlString;->pageUrl:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lezvcard/io/html/HCardReader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public all()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/VCard;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1142
    :try_start_0
    invoke-super {p0}, Lezvcard/Ezvcard$ParserChainHtml;->all()Ljava/util/List;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 1143
    :catch_0
    move-exception v0

    .line 1145
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public first()Lezvcard/VCard;
    .locals 2

    .prologue
    .line 1132
    :try_start_0
    invoke-super {p0}, Lezvcard/Ezvcard$ParserChainHtml;->first()Lezvcard/VCard;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    return-object v1

    .line 1133
    :catch_0
    move-exception v0

    .line 1135
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public pageUrl(Ljava/lang/String;)Lezvcard/Ezvcard$ParserChainHtmlString;
    .locals 1
    .param p1, "pageUrl"    # Ljava/lang/String;

    .prologue
    .line 1121
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainHtml;->pageUrl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainHtmlString;

    return-object v0
.end method

.method public bridge synthetic pageUrl(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;

    .prologue
    .line 1102
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainHtmlString;->pageUrl(Ljava/lang/String;)Lezvcard/Ezvcard$ParserChainHtmlString;

    move-result-object v0

    return-object v0
.end method

.method public register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$ParserChainHtmlString;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)",
            "Lezvcard/Ezvcard$ParserChainHtmlString;"
        }
    .end annotation

    .prologue
    .line 1111
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainHtml;->register(Lezvcard/io/scribe/VCardPropertyScribe;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainHtmlString;

    return-object v0
.end method

.method public bridge synthetic register(Lezvcard/io/scribe/VCardPropertyScribe;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/scribe/VCardPropertyScribe;

    .prologue
    .line 1102
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainHtmlString;->register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$ParserChainHtmlString;

    move-result-object v0

    return-object v0
.end method

.method public warnings(Ljava/util/List;)Lezvcard/Ezvcard$ParserChainHtmlString;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lezvcard/Ezvcard$ParserChainHtmlString;"
        }
    .end annotation

    .prologue
    .line 1116
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainHtml;->warnings(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainHtmlString;

    return-object v0
.end method

.method public bridge synthetic warnings(Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/util/List;

    .prologue
    .line 1102
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainHtmlString;->warnings(Ljava/util/List;)Lezvcard/Ezvcard$ParserChainHtmlString;

    move-result-object v0

    return-object v0
.end method
