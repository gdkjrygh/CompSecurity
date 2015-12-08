.class public Lezvcard/Ezvcard$ParserChainHtmlReader;
.super Lezvcard/Ezvcard$ParserChainHtml;
.source "Ezvcard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/Ezvcard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ParserChainHtmlReader"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/Ezvcard$ParserChainHtml",
        "<",
        "Lezvcard/Ezvcard$ParserChainHtmlReader;",
        ">;"
    }
.end annotation


# instance fields
.field private final file:Ljava/io/File;

.field private final reader:Ljava/io/Reader;

.field private final url:Ljava/net/URL;


# direct methods
.method private constructor <init>(Ljava/io/File;)V
    .locals 1
    .param p1, "file"    # Ljava/io/File;

    .prologue
    const/4 v0, 0x0

    .line 1056
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChainHtml;-><init>()V

    .line 1057
    iput-object v0, p0, Lezvcard/Ezvcard$ParserChainHtmlReader;->reader:Ljava/io/Reader;

    .line 1058
    iput-object p1, p0, Lezvcard/Ezvcard$ParserChainHtmlReader;->file:Ljava/io/File;

    .line 1059
    iput-object v0, p0, Lezvcard/Ezvcard$ParserChainHtmlReader;->url:Ljava/net/URL;

    .line 1060
    return-void
.end method

.method synthetic constructor <init>(Ljava/io/File;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/io/File;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 1045
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$ParserChainHtmlReader;-><init>(Ljava/io/File;)V

    return-void
.end method

.method private constructor <init>(Ljava/io/Reader;)V
    .locals 1
    .param p1, "reader"    # Ljava/io/Reader;

    .prologue
    const/4 v0, 0x0

    .line 1050
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChainHtml;-><init>()V

    .line 1051
    iput-object p1, p0, Lezvcard/Ezvcard$ParserChainHtmlReader;->reader:Ljava/io/Reader;

    .line 1052
    iput-object v0, p0, Lezvcard/Ezvcard$ParserChainHtmlReader;->file:Ljava/io/File;

    .line 1053
    iput-object v0, p0, Lezvcard/Ezvcard$ParserChainHtmlReader;->url:Ljava/net/URL;

    .line 1054
    return-void
.end method

.method synthetic constructor <init>(Ljava/io/Reader;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/io/Reader;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 1045
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$ParserChainHtmlReader;-><init>(Ljava/io/Reader;)V

    return-void
.end method

.method private constructor <init>(Ljava/net/URL;)V
    .locals 1
    .param p1, "url"    # Ljava/net/URL;

    .prologue
    const/4 v0, 0x0

    .line 1062
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChainHtml;-><init>()V

    .line 1063
    iput-object v0, p0, Lezvcard/Ezvcard$ParserChainHtmlReader;->reader:Ljava/io/Reader;

    .line 1064
    iput-object v0, p0, Lezvcard/Ezvcard$ParserChainHtmlReader;->file:Ljava/io/File;

    .line 1065
    iput-object p1, p0, Lezvcard/Ezvcard$ParserChainHtmlReader;->url:Ljava/net/URL;

    .line 1066
    return-void
.end method

.method synthetic constructor <init>(Ljava/net/URL;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/net/URL;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 1045
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$ParserChainHtmlReader;-><init>(Ljava/net/URL;)V

    return-void
.end method


# virtual methods
.method _constructReader()Lezvcard/io/html/HCardReader;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1085
    iget-object v0, p0, Lezvcard/Ezvcard$ParserChainHtmlReader;->reader:Ljava/io/Reader;

    if-eqz v0, :cond_0

    .line 1086
    new-instance v0, Lezvcard/io/html/HCardReader;

    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainHtmlReader;->reader:Ljava/io/Reader;

    iget-object v2, p0, Lezvcard/Ezvcard$ParserChainHtmlReader;->pageUrl:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lezvcard/io/html/HCardReader;-><init>(Ljava/io/Reader;Ljava/lang/String;)V

    .line 1094
    :goto_0
    return-object v0

    .line 1089
    :cond_0
    iget-object v0, p0, Lezvcard/Ezvcard$ParserChainHtmlReader;->file:Ljava/io/File;

    if-eqz v0, :cond_1

    .line 1091
    new-instance v0, Lezvcard/io/html/HCardReader;

    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainHtmlReader;->file:Ljava/io/File;

    iget-object v2, p0, Lezvcard/Ezvcard$ParserChainHtmlReader;->pageUrl:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lezvcard/io/html/HCardReader;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_0

    .line 1094
    :cond_1
    new-instance v0, Lezvcard/io/html/HCardReader;

    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainHtmlReader;->url:Ljava/net/URL;

    invoke-direct {v0, v1}, Lezvcard/io/html/HCardReader;-><init>(Ljava/net/URL;)V

    goto :goto_0
.end method

.method public bridge synthetic all()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1045
    invoke-super {p0}, Lezvcard/Ezvcard$ParserChainHtml;->all()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic first()Lezvcard/VCard;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1045
    invoke-super {p0}, Lezvcard/Ezvcard$ParserChainHtml;->first()Lezvcard/VCard;

    move-result-object v0

    return-object v0
.end method

.method public pageUrl(Ljava/lang/String;)Lezvcard/Ezvcard$ParserChainHtmlReader;
    .locals 1
    .param p1, "pageUrl"    # Ljava/lang/String;

    .prologue
    .line 1080
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainHtml;->pageUrl(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainHtmlReader;

    return-object v0
.end method

.method public bridge synthetic pageUrl(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;

    .prologue
    .line 1045
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainHtmlReader;->pageUrl(Ljava/lang/String;)Lezvcard/Ezvcard$ParserChainHtmlReader;

    move-result-object v0

    return-object v0
.end method

.method public register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$ParserChainHtmlReader;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)",
            "Lezvcard/Ezvcard$ParserChainHtmlReader;"
        }
    .end annotation

    .prologue
    .line 1070
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainHtml;->register(Lezvcard/io/scribe/VCardPropertyScribe;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainHtmlReader;

    return-object v0
.end method

.method public bridge synthetic register(Lezvcard/io/scribe/VCardPropertyScribe;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/scribe/VCardPropertyScribe;

    .prologue
    .line 1045
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainHtmlReader;->register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$ParserChainHtmlReader;

    move-result-object v0

    return-object v0
.end method

.method public warnings(Ljava/util/List;)Lezvcard/Ezvcard$ParserChainHtmlReader;
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
            "Lezvcard/Ezvcard$ParserChainHtmlReader;"
        }
    .end annotation

    .prologue
    .line 1075
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainHtml;->warnings(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainHtmlReader;

    return-object v0
.end method

.method public bridge synthetic warnings(Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/util/List;

    .prologue
    .line 1045
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainHtmlReader;->warnings(Ljava/util/List;)Lezvcard/Ezvcard$ParserChainHtmlReader;

    move-result-object v0

    return-object v0
.end method
