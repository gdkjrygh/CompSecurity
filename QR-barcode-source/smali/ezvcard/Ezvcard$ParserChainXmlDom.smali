.class public Lezvcard/Ezvcard$ParserChainXmlDom;
.super Lezvcard/Ezvcard$ParserChainXml;
.source "Ezvcard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/Ezvcard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ParserChainXmlDom"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/Ezvcard$ParserChainXml",
        "<",
        "Lezvcard/Ezvcard$ParserChainXmlDom;",
        ">;"
    }
.end annotation


# instance fields
.field private final document:Lorg/w3c/dom/Document;


# direct methods
.method private constructor <init>(Lorg/w3c/dom/Document;)V
    .locals 0
    .param p1, "document"    # Lorg/w3c/dom/Document;

    .prologue
    .line 943
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChainXml;-><init>()V

    .line 944
    iput-object p1, p0, Lezvcard/Ezvcard$ParserChainXmlDom;->document:Lorg/w3c/dom/Document;

    .line 945
    return-void
.end method

.method synthetic constructor <init>(Lorg/w3c/dom/Document;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/w3c/dom/Document;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 940
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$ParserChainXmlDom;-><init>(Lorg/w3c/dom/Document;)V

    return-void
.end method


# virtual methods
.method _constructDocument()Lezvcard/io/xml/XCardDocument;
    .locals 2

    .prologue
    .line 959
    new-instance v0, Lezvcard/io/xml/XCardDocument;

    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainXmlDom;->document:Lorg/w3c/dom/Document;

    invoke-direct {v0, v1}, Lezvcard/io/xml/XCardDocument;-><init>(Lorg/w3c/dom/Document;)V

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
    .line 978
    :try_start_0
    invoke-super {p0}, Lezvcard/Ezvcard$ParserChainXml;->all()Ljava/util/List;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    return-object v1

    .line 979
    :catch_0
    move-exception v0

    .line 981
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 982
    .end local v0    # "e":Ljava/io/IOException;
    :catch_1
    move-exception v0

    .line 984
    .local v0, "e":Lorg/xml/sax/SAXException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public first()Lezvcard/VCard;
    .locals 2

    .prologue
    .line 965
    :try_start_0
    invoke-super {p0}, Lezvcard/Ezvcard$ParserChainXml;->first()Lezvcard/VCard;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/xml/sax/SAXException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    return-object v1

    .line 966
    :catch_0
    move-exception v0

    .line 968
    .local v0, "e":Ljava/io/IOException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 969
    .end local v0    # "e":Ljava/io/IOException;
    :catch_1
    move-exception v0

    .line 971
    .local v0, "e":Lorg/xml/sax/SAXException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$ParserChainXmlDom;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)",
            "Lezvcard/Ezvcard$ParserChainXmlDom;"
        }
    .end annotation

    .prologue
    .line 949
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainXml;->register(Lezvcard/io/scribe/VCardPropertyScribe;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainXmlDom;

    return-object v0
.end method

.method public bridge synthetic register(Lezvcard/io/scribe/VCardPropertyScribe;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/scribe/VCardPropertyScribe;

    .prologue
    .line 940
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainXmlDom;->register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$ParserChainXmlDom;

    move-result-object v0

    return-object v0
.end method

.method public warnings(Ljava/util/List;)Lezvcard/Ezvcard$ParserChainXmlDom;
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
            "Lezvcard/Ezvcard$ParserChainXmlDom;"
        }
    .end annotation

    .prologue
    .line 954
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-super {p0, p1}, Lezvcard/Ezvcard$ParserChainXml;->warnings(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/Ezvcard$ParserChainXmlDom;

    return-object v0
.end method

.method public bridge synthetic warnings(Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/util/List;

    .prologue
    .line 940
    invoke-virtual {p0, p1}, Lezvcard/Ezvcard$ParserChainXmlDom;->warnings(Ljava/util/List;)Lezvcard/Ezvcard$ParserChainXmlDom;

    move-result-object v0

    return-object v0
.end method
