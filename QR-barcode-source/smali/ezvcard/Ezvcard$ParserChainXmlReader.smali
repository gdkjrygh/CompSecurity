.class public Lezvcard/Ezvcard$ParserChainXmlReader;
.super Lezvcard/Ezvcard$ParserChainXml;
.source "Ezvcard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/Ezvcard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ParserChainXmlReader"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/Ezvcard$ParserChainXml",
        "<",
        "Lezvcard/Ezvcard$ParserChainXmlReader;",
        ">;"
    }
.end annotation


# instance fields
.field private final file:Ljava/io/File;

.field private final in:Ljava/io/InputStream;

.field private final reader:Ljava/io/Reader;


# direct methods
.method private constructor <init>(Ljava/io/File;)V
    .locals 1
    .param p1, "file"    # Ljava/io/File;

    .prologue
    const/4 v0, 0x0

    .line 855
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChainXml;-><init>()V

    .line 856
    iput-object v0, p0, Lezvcard/Ezvcard$ParserChainXmlReader;->in:Ljava/io/InputStream;

    .line 857
    iput-object v0, p0, Lezvcard/Ezvcard$ParserChainXmlReader;->reader:Ljava/io/Reader;

    .line 858
    iput-object p1, p0, Lezvcard/Ezvcard$ParserChainXmlReader;->file:Ljava/io/File;

    .line 859
    return-void
.end method

.method synthetic constructor <init>(Ljava/io/File;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/io/File;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 844
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$ParserChainXmlReader;-><init>(Ljava/io/File;)V

    return-void
.end method

.method private constructor <init>(Ljava/io/InputStream;)V
    .locals 1
    .param p1, "in"    # Ljava/io/InputStream;

    .prologue
    const/4 v0, 0x0

    .line 849
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChainXml;-><init>()V

    .line 850
    iput-object p1, p0, Lezvcard/Ezvcard$ParserChainXmlReader;->in:Ljava/io/InputStream;

    .line 851
    iput-object v0, p0, Lezvcard/Ezvcard$ParserChainXmlReader;->reader:Ljava/io/Reader;

    .line 852
    iput-object v0, p0, Lezvcard/Ezvcard$ParserChainXmlReader;->file:Ljava/io/File;

    .line 853
    return-void
.end method

.method synthetic constructor <init>(Ljava/io/InputStream;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/io/InputStream;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 844
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$ParserChainXmlReader;-><init>(Ljava/io/InputStream;)V

    return-void
.end method

.method private constructor <init>(Ljava/io/Reader;)V
    .locals 1
    .param p1, "reader"    # Ljava/io/Reader;

    .prologue
    const/4 v0, 0x0

    .line 861
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChainXml;-><init>()V

    .line 862
    iput-object v0, p0, Lezvcard/Ezvcard$ParserChainXmlReader;->in:Ljava/io/InputStream;

    .line 863
    iput-object p1, p0, Lezvcard/Ezvcard$ParserChainXmlReader;->reader:Ljava/io/Reader;

    .line 864
    iput-object v0, p0, Lezvcard/Ezvcard$ParserChainXmlReader;->file:Ljava/io/File;

    .line 865
    return-void
.end method

.method synthetic constructor <init>(Ljava/io/Reader;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/io/Reader;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 844
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$ParserChainXmlReader;-><init>(Ljava/io/Reader;)V

    return-void
.end method


# virtual methods
.method _constructDocument()Lezvcard/io/xml/XCardDocument;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .prologue
    .line 879
    iget-object v0, p0, Lezvcard/Ezvcard$ParserChainXmlReader;->in:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    .line 880
    new-instance v0, Lezvcard/io/xml/XCardDocument;

    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainXmlReader;->in:Ljava/io/InputStream;

    invoke-direct {v0, v1}, Lezvcard/io/xml/XCardDocument;-><init>(Ljava/io/InputStream;)V

    .line 885
    :goto_0
    return-object v0

    .line 882
    :cond_0
    iget-object v0, p0, Lezvcard/Ezvcard$ParserChainXmlReader;->file:Ljava/io/File;

    if-eqz v0, :cond_1

    .line 883
    new-instance v0, Lezvcard/io/xml/XCardDocument;

    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainXmlReader;->file:Ljava/io/File;

    invoke-direct {v0, v1}, Lezvcard/io/xml/XCardDocument;-><init>(Ljava/io/File;)V

    goto :goto_0

    .line 885
    :cond_1
    new-instance v0, Lezvcard/io/xml/XCardDocument;

    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainXmlReader;->reader:Ljava/io/Reader;

    invoke-direct {v0, v1}, Lezvcard/io/xml/XCardDocument;-><init>(Ljava/io/Reader;)V

    goto :goto_0
.end method

.method public bridge synthetic all()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .prologue
    .line 844
    invoke-super {p0}, Lezvcard/Ezvcard$ParserChainXml;->all()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic first()Lezvcard/VCard;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .prologue
    .line 844
    invoke-super {p0}, Lezvcard/Ezvcard$ParserChainXml;->first()Lezvcard/VCard;

    move-result-object v0

    return-object v0
.end method

.method public register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$ParserChainXmlReader;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)",
            "Lezvcard/Ezvcard$ParserChainXmlReader;"
        }
    .end annotation

    .prologue
    .line 869
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainXml;->register(Lezvcard/io/scribe/VCardPropertyScribe;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainXmlReader;

    return-object v0
.end method

.method public bridge synthetic register(Lezvcard/io/scribe/VCardPropertyScribe;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/scribe/VCardPropertyScribe;

    .prologue
    .line 844
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainXmlReader;->register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$ParserChainXmlReader;

    move-result-object v0

    return-object v0
.end method

.method public warnings(Ljava/util/List;)Lezvcard/Ezvcard$ParserChainXmlReader;
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
            "Lezvcard/Ezvcard$ParserChainXmlReader;"
        }
    .end annotation

    .prologue
    .line 874
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainXml;->warnings(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainXmlReader;

    return-object v0
.end method

.method public bridge synthetic warnings(Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/util/List;

    .prologue
    .line 844
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainXmlReader;->warnings(Ljava/util/List;)Lezvcard/Ezvcard$ParserChainXmlReader;

    move-result-object v0

    return-object v0
.end method
