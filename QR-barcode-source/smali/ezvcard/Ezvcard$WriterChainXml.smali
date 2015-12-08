.class public Lezvcard/Ezvcard$WriterChainXml;
.super Lezvcard/Ezvcard$WriterChain;
.source "Ezvcard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/Ezvcard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WriterChainXml"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/Ezvcard$WriterChain",
        "<",
        "Lezvcard/Ezvcard$WriterChainXml;",
        ">;"
    }
.end annotation


# instance fields
.field indent:I

.field final index:Lezvcard/io/scribe/ScribeIndex;

.field prodId:Z

.field versionStrict:Z


# direct methods
.method private constructor <init>(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/VCard;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p1, "vcards":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/VCard;>;"
    const/4 v0, 0x1

    .line 1504
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$WriterChain;-><init>(Ljava/util/Collection;)V

    .line 1498
    iput-boolean v0, p0, Lezvcard/Ezvcard$WriterChainXml;->prodId:Z

    .line 1499
    iput-boolean v0, p0, Lezvcard/Ezvcard$WriterChainXml;->versionStrict:Z

    .line 1500
    const/4 v0, -0x1

    iput v0, p0, Lezvcard/Ezvcard$WriterChainXml;->indent:I

    .line 1501
    new-instance v0, Lezvcard/io/scribe/ScribeIndex;

    invoke-direct {v0}, Lezvcard/io/scribe/ScribeIndex;-><init>()V

    iput-object v0, p0, Lezvcard/Ezvcard$WriterChainXml;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 1505
    return-void
.end method

.method synthetic constructor <init>(Ljava/util/Collection;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/util/Collection;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 1497
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$WriterChainXml;-><init>(Ljava/util/Collection;)V

    return-void
.end method

.method private createXCardDocument()Lezvcard/io/xml/XCardDocument;
    .locals 4

    .prologue
    .line 1608
    new-instance v0, Lezvcard/io/xml/XCardDocument;

    invoke-direct {v0}, Lezvcard/io/xml/XCardDocument;-><init>()V

    .line 1609
    .local v0, "doc":Lezvcard/io/xml/XCardDocument;
    iget-boolean v3, p0, Lezvcard/Ezvcard$WriterChainXml;->prodId:Z

    invoke-virtual {v0, v3}, Lezvcard/io/xml/XCardDocument;->setAddProdId(Z)V

    .line 1610
    iget-boolean v3, p0, Lezvcard/Ezvcard$WriterChainXml;->versionStrict:Z

    invoke-virtual {v0, v3}, Lezvcard/io/xml/XCardDocument;->setVersionStrict(Z)V

    .line 1611
    iget-object v3, p0, Lezvcard/Ezvcard$WriterChainXml;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v0, v3}, Lezvcard/io/xml/XCardDocument;->setScribeIndex(Lezvcard/io/scribe/ScribeIndex;)V

    .line 1613
    iget-object v3, p0, Lezvcard/Ezvcard$WriterChainXml;->vcards:Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lezvcard/VCard;

    .line 1614
    .local v2, "vcard":Lezvcard/VCard;
    invoke-virtual {v0, v2}, Lezvcard/io/xml/XCardDocument;->add(Lezvcard/VCard;)V

    goto :goto_0

    .line 1617
    .end local v2    # "vcard":Lezvcard/VCard;
    :cond_0
    return-object v0
.end method


# virtual methods
.method public dom()Lorg/w3c/dom/Document;
    .locals 2

    .prologue
    .line 1603
    invoke-direct {p0}, Lezvcard/Ezvcard$WriterChainXml;->createXCardDocument()Lezvcard/io/xml/XCardDocument;

    move-result-object v0

    .line 1604
    .local v0, "doc":Lezvcard/io/xml/XCardDocument;
    invoke-virtual {v0}, Lezvcard/io/xml/XCardDocument;->getDocument()Lorg/w3c/dom/Document;

    move-result-object v1

    return-object v1
.end method

.method public go()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1556
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 1558
    .local v0, "sw":Ljava/io/StringWriter;
    :try_start_0
    invoke-virtual {p0, v0}, Lezvcard/Ezvcard$WriterChainXml;->go(Ljava/io/Writer;)V
    :try_end_0
    .catch Ljavax/xml/transform/TransformerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1562
    :goto_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 1559
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public go(Ljava/io/File;)V
    .locals 2
    .param p1, "file"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljavax/xml/transform/TransformerException;
        }
    .end annotation

    .prologue
    .line 1583
    invoke-direct {p0}, Lezvcard/Ezvcard$WriterChainXml;->createXCardDocument()Lezvcard/io/xml/XCardDocument;

    move-result-object v0

    .line 1584
    .local v0, "doc":Lezvcard/io/xml/XCardDocument;
    iget v1, p0, Lezvcard/Ezvcard$WriterChainXml;->indent:I

    invoke-virtual {v0, p1, v1}, Lezvcard/io/xml/XCardDocument;->write(Ljava/io/File;I)V

    .line 1585
    return-void
.end method

.method public go(Ljava/io/OutputStream;)V
    .locals 2
    .param p1, "out"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/transform/TransformerException;
        }
    .end annotation

    .prologue
    .line 1572
    invoke-direct {p0}, Lezvcard/Ezvcard$WriterChainXml;->createXCardDocument()Lezvcard/io/xml/XCardDocument;

    move-result-object v0

    .line 1573
    .local v0, "doc":Lezvcard/io/xml/XCardDocument;
    iget v1, p0, Lezvcard/Ezvcard$WriterChainXml;->indent:I

    invoke-virtual {v0, p1, v1}, Lezvcard/io/xml/XCardDocument;->write(Ljava/io/OutputStream;I)V

    .line 1574
    return-void
.end method

.method public go(Ljava/io/Writer;)V
    .locals 2
    .param p1, "writer"    # Ljava/io/Writer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/transform/TransformerException;
        }
    .end annotation

    .prologue
    .line 1594
    invoke-direct {p0}, Lezvcard/Ezvcard$WriterChainXml;->createXCardDocument()Lezvcard/io/xml/XCardDocument;

    move-result-object v0

    .line 1595
    .local v0, "doc":Lezvcard/io/xml/XCardDocument;
    iget v1, p0, Lezvcard/Ezvcard$WriterChainXml;->indent:I

    invoke-virtual {v0, p1, v1}, Lezvcard/io/xml/XCardDocument;->write(Ljava/io/Writer;I)V

    .line 1596
    return-void
.end method

.method public indent(I)Lezvcard/Ezvcard$WriterChainXml;
    .locals 1
    .param p1, "indent"    # I

    .prologue
    .line 1525
    iput p1, p0, Lezvcard/Ezvcard$WriterChainXml;->indent:I

    .line 1526
    iget-object v0, p0, Lezvcard/Ezvcard$WriterChainXml;->this_:Ljava/lang/Object;

    check-cast v0, Lezvcard/Ezvcard$WriterChainXml;

    return-object v0
.end method

.method public prodId(Z)Lezvcard/Ezvcard$WriterChainXml;
    .locals 1
    .param p1, "include"    # Z

    .prologue
    .line 1514
    iput-boolean p1, p0, Lezvcard/Ezvcard$WriterChainXml;->prodId:Z

    .line 1515
    iget-object v0, p0, Lezvcard/Ezvcard$WriterChainXml;->this_:Ljava/lang/Object;

    check-cast v0, Lezvcard/Ezvcard$WriterChainXml;

    return-object v0
.end method

.method public register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$WriterChainXml;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)",
            "Lezvcard/Ezvcard$WriterChainXml;"
        }
    .end annotation

    .prologue
    .line 1547
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    iget-object v0, p0, Lezvcard/Ezvcard$WriterChainXml;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v0, p1}, Lezvcard/io/scribe/ScribeIndex;->register(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 1548
    iget-object v0, p0, Lezvcard/Ezvcard$WriterChainXml;->this_:Ljava/lang/Object;

    check-cast v0, Lezvcard/Ezvcard$WriterChainXml;

    return-object v0
.end method

.method public versionStrict(Z)Lezvcard/Ezvcard$WriterChainXml;
    .locals 1
    .param p1, "versionStrict"    # Z

    .prologue
    .line 1537
    iput-boolean p1, p0, Lezvcard/Ezvcard$WriterChainXml;->versionStrict:Z

    .line 1538
    iget-object v0, p0, Lezvcard/Ezvcard$WriterChainXml;->this_:Ljava/lang/Object;

    check-cast v0, Lezvcard/Ezvcard$WriterChainXml;

    return-object v0
.end method
