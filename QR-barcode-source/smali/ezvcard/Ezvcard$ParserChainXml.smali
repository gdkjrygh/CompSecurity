.class abstract Lezvcard/Ezvcard$ParserChainXml;
.super Lezvcard/Ezvcard$ParserChain;
.source "Ezvcard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/Ezvcard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "ParserChainXml"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lezvcard/Ezvcard$ParserChain",
        "<TT;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 808
    .local p0, "this":Lezvcard/Ezvcard$ParserChainXml;, "Lezvcard/Ezvcard$ParserChainXml<TT;>;"
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChain;-><init>()V

    return-void
.end method

.method private constructDocument()Lezvcard/io/xml/XCardDocument;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 830
    .local p0, "this":Lezvcard/Ezvcard$ParserChainXml;, "Lezvcard/Ezvcard$ParserChainXml<TT;>;"
    invoke-virtual {p0}, Lezvcard/Ezvcard$ParserChainXml;->_constructDocument()Lezvcard/io/xml/XCardDocument;

    move-result-object v0

    .line 831
    .local v0, "parser":Lezvcard/io/xml/XCardDocument;
    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainXml;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v0, v1}, Lezvcard/io/xml/XCardDocument;->setScribeIndex(Lezvcard/io/scribe/ScribeIndex;)V

    .line 832
    return-object v0
.end method


# virtual methods
.method abstract _constructDocument()Lezvcard/io/xml/XCardDocument;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xml/sax/SAXException;
        }
    .end annotation
.end method

.method public all()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/VCard;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .prologue
    .line 821
    .local p0, "this":Lezvcard/Ezvcard$ParserChainXml;, "Lezvcard/Ezvcard$ParserChainXml<TT;>;"
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChainXml;->constructDocument()Lezvcard/io/xml/XCardDocument;

    move-result-object v0

    .line 822
    .local v0, "document":Lezvcard/io/xml/XCardDocument;
    invoke-virtual {v0}, Lezvcard/io/xml/XCardDocument;->parseAll()Ljava/util/List;

    move-result-object v1

    .line 823
    .local v1, "icals":Ljava/util/List;, "Ljava/util/List<Lezvcard/VCard;>;"
    iget-object v2, p0, Lezvcard/Ezvcard$ParserChainXml;->warnings:Ljava/util/List;

    if-eqz v2, :cond_0

    .line 824
    iget-object v2, p0, Lezvcard/Ezvcard$ParserChainXml;->warnings:Ljava/util/List;

    invoke-virtual {v0}, Lezvcard/io/xml/XCardDocument;->getParseWarnings()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 826
    :cond_0
    return-object v1
.end method

.method public first()Lezvcard/VCard;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .prologue
    .line 811
    .local p0, "this":Lezvcard/Ezvcard$ParserChainXml;, "Lezvcard/Ezvcard$ParserChainXml<TT;>;"
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChainXml;->constructDocument()Lezvcard/io/xml/XCardDocument;

    move-result-object v0

    .line 812
    .local v0, "document":Lezvcard/io/xml/XCardDocument;
    invoke-virtual {v0}, Lezvcard/io/xml/XCardDocument;->parseFirst()Lezvcard/VCard;

    move-result-object v1

    .line 813
    .local v1, "vcard":Lezvcard/VCard;
    iget-object v2, p0, Lezvcard/Ezvcard$ParserChainXml;->warnings:Ljava/util/List;

    if-eqz v2, :cond_0

    .line 814
    iget-object v2, p0, Lezvcard/Ezvcard$ParserChainXml;->warnings:Ljava/util/List;

    invoke-virtual {v0}, Lezvcard/io/xml/XCardDocument;->getParseWarnings()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 816
    :cond_0
    return-object v1
.end method
