.class public Lezvcard/Ezvcard$WriterChainText;
.super Lezvcard/Ezvcard$WriterChain;
.source "Ezvcard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/Ezvcard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WriterChainText"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/Ezvcard$WriterChain",
        "<",
        "Lezvcard/Ezvcard$WriterChainText;",
        ">;"
    }
.end annotation


# instance fields
.field caretEncoding:Z

.field final index:Lezvcard/io/scribe/ScribeIndex;

.field prodId:Z

.field version:Lezvcard/VCardVersion;

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

    .line 1340
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$WriterChain;-><init>(Ljava/util/Collection;)V

    .line 1334
    iput-boolean v0, p0, Lezvcard/Ezvcard$WriterChainText;->prodId:Z

    .line 1335
    iput-boolean v0, p0, Lezvcard/Ezvcard$WriterChainText;->versionStrict:Z

    .line 1336
    const/4 v0, 0x0

    iput-boolean v0, p0, Lezvcard/Ezvcard$WriterChainText;->caretEncoding:Z

    .line 1337
    new-instance v0, Lezvcard/io/scribe/ScribeIndex;

    invoke-direct {v0}, Lezvcard/io/scribe/ScribeIndex;-><init>()V

    iput-object v0, p0, Lezvcard/Ezvcard$WriterChainText;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 1341
    return-void
.end method

.method synthetic constructor <init>(Ljava/util/Collection;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/util/Collection;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 1332
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$WriterChainText;-><init>(Ljava/util/Collection;)V

    return-void
.end method

.method private go(Lezvcard/io/text/VCardWriter;)V
    .locals 4
    .param p1, "vcardWriter"    # Lezvcard/io/text/VCardWriter;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1473
    iget-boolean v3, p0, Lezvcard/Ezvcard$WriterChainText;->prodId:Z

    invoke-virtual {p1, v3}, Lezvcard/io/text/VCardWriter;->setAddProdId(Z)V

    .line 1474
    iget-boolean v3, p0, Lezvcard/Ezvcard$WriterChainText;->caretEncoding:Z

    invoke-virtual {p1, v3}, Lezvcard/io/text/VCardWriter;->setCaretEncodingEnabled(Z)V

    .line 1475
    iget-boolean v3, p0, Lezvcard/Ezvcard$WriterChainText;->versionStrict:Z

    invoke-virtual {p1, v3}, Lezvcard/io/text/VCardWriter;->setVersionStrict(Z)V

    .line 1476
    iget-object v3, p0, Lezvcard/Ezvcard$WriterChainText;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {p1, v3}, Lezvcard/io/text/VCardWriter;->setScribeIndex(Lezvcard/io/scribe/ScribeIndex;)V

    .line 1478
    iget-object v3, p0, Lezvcard/Ezvcard$WriterChainText;->vcards:Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lezvcard/VCard;

    .line 1479
    .local v1, "vcard":Lezvcard/VCard;
    iget-object v3, p0, Lezvcard/Ezvcard$WriterChainText;->version:Lezvcard/VCardVersion;

    if-nez v3, :cond_1

    .line 1480
    invoke-virtual {v1}, Lezvcard/VCard;->getVersion()Lezvcard/VCardVersion;

    move-result-object v2

    .line 1481
    .local v2, "vcardVersion":Lezvcard/VCardVersion;
    if-nez v2, :cond_0

    .line 1482
    sget-object v2, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    .line 1484
    :cond_0
    invoke-virtual {p1, v2}, Lezvcard/io/text/VCardWriter;->setTargetVersion(Lezvcard/VCardVersion;)V

    .line 1486
    .end local v2    # "vcardVersion":Lezvcard/VCardVersion;
    :cond_1
    invoke-virtual {p1, v1}, Lezvcard/io/text/VCardWriter;->write(Lezvcard/VCard;)V

    .line 1487
    invoke-virtual {p1}, Lezvcard/io/text/VCardWriter;->flush()V

    goto :goto_0

    .line 1489
    .end local v1    # "vcard":Lezvcard/VCard;
    :cond_2
    return-void
.end method


# virtual methods
.method public caretEncoding(Z)Lezvcard/Ezvcard$WriterChainText;
    .locals 1
    .param p1, "enable"    # Z

    .prologue
    .line 1385
    iput-boolean p1, p0, Lezvcard/Ezvcard$WriterChainText;->caretEncoding:Z

    .line 1386
    iget-object v0, p0, Lezvcard/Ezvcard$WriterChainText;->this_:Ljava/lang/Object;

    check-cast v0, Lezvcard/Ezvcard$WriterChainText;

    return-object v0
.end method

.method public go()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1416
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 1418
    .local v0, "sw":Ljava/io/StringWriter;
    :try_start_0
    invoke-virtual {p0, v0}, Lezvcard/Ezvcard$WriterChainText;->go(Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1422
    :goto_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 1419
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public go(Ljava/io/File;)V
    .locals 1
    .param p1, "file"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1442
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lezvcard/Ezvcard$WriterChainText;->go(Ljava/io/File;Z)V

    .line 1443
    return-void
.end method

.method public go(Ljava/io/File;Z)V
    .locals 2
    .param p1, "file"    # Ljava/io/File;
    .param p2, "append"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1453
    iget-object v1, p0, Lezvcard/Ezvcard$WriterChainText;->version:Lezvcard/VCardVersion;

    if-nez v1, :cond_0

    new-instance v0, Lezvcard/io/text/VCardWriter;

    invoke-direct {v0, p1, p2}, Lezvcard/io/text/VCardWriter;-><init>(Ljava/io/File;Z)V

    .line 1455
    .local v0, "vcardWriter":Lezvcard/io/text/VCardWriter;
    :goto_0
    :try_start_0
    invoke-direct {p0, v0}, Lezvcard/Ezvcard$WriterChainText;->go(Lezvcard/io/text/VCardWriter;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1457
    invoke-static {v0}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 1459
    return-void

    .line 1453
    .end local v0    # "vcardWriter":Lezvcard/io/text/VCardWriter;
    :cond_0
    new-instance v0, Lezvcard/io/text/VCardWriter;

    iget-object v1, p0, Lezvcard/Ezvcard$WriterChainText;->version:Lezvcard/VCardVersion;

    invoke-direct {v0, p1, p2, v1}, Lezvcard/io/text/VCardWriter;-><init>(Ljava/io/File;ZLezvcard/VCardVersion;)V

    goto :goto_0

    .line 1457
    .restart local v0    # "vcardWriter":Lezvcard/io/text/VCardWriter;
    :catchall_0
    move-exception v1

    invoke-static {v0}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    throw v1
.end method

.method public go(Ljava/io/OutputStream;)V
    .locals 2
    .param p1, "out"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1431
    iget-object v1, p0, Lezvcard/Ezvcard$WriterChainText;->version:Lezvcard/VCardVersion;

    if-nez v1, :cond_0

    new-instance v0, Lezvcard/io/text/VCardWriter;

    invoke-direct {v0, p1}, Lezvcard/io/text/VCardWriter;-><init>(Ljava/io/OutputStream;)V

    .line 1432
    .local v0, "vcardWriter":Lezvcard/io/text/VCardWriter;
    :goto_0
    invoke-direct {p0, v0}, Lezvcard/Ezvcard$WriterChainText;->go(Lezvcard/io/text/VCardWriter;)V

    .line 1433
    return-void

    .line 1431
    .end local v0    # "vcardWriter":Lezvcard/io/text/VCardWriter;
    :cond_0
    new-instance v0, Lezvcard/io/text/VCardWriter;

    iget-object v1, p0, Lezvcard/Ezvcard$WriterChainText;->version:Lezvcard/VCardVersion;

    invoke-direct {v0, p1, v1}, Lezvcard/io/text/VCardWriter;-><init>(Ljava/io/OutputStream;Lezvcard/VCardVersion;)V

    goto :goto_0
.end method

.method public go(Ljava/io/Writer;)V
    .locals 2
    .param p1, "writer"    # Ljava/io/Writer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1467
    new-instance v0, Lezvcard/io/text/VCardWriter;

    invoke-direct {v0, p1}, Lezvcard/io/text/VCardWriter;-><init>(Ljava/io/Writer;)V

    .line 1468
    .local v0, "vcardWriter":Lezvcard/io/text/VCardWriter;
    iget-object v1, p0, Lezvcard/Ezvcard$WriterChainText;->version:Lezvcard/VCardVersion;

    invoke-virtual {v0, v1}, Lezvcard/io/text/VCardWriter;->setTargetVersion(Lezvcard/VCardVersion;)V

    .line 1469
    invoke-direct {p0, v0}, Lezvcard/Ezvcard$WriterChainText;->go(Lezvcard/io/text/VCardWriter;)V

    .line 1470
    return-void
.end method

.method public prodId(Z)Lezvcard/Ezvcard$WriterChainText;
    .locals 1
    .param p1, "include"    # Z

    .prologue
    .line 1372
    iput-boolean p1, p0, Lezvcard/Ezvcard$WriterChainText;->prodId:Z

    .line 1373
    iget-object v0, p0, Lezvcard/Ezvcard$WriterChainText;->this_:Ljava/lang/Object;

    check-cast v0, Lezvcard/Ezvcard$WriterChainText;

    return-object v0
.end method

.method public register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$WriterChainText;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)",
            "Lezvcard/Ezvcard$WriterChainText;"
        }
    .end annotation

    .prologue
    .line 1407
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    iget-object v0, p0, Lezvcard/Ezvcard$WriterChainText;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v0, p1}, Lezvcard/io/scribe/ScribeIndex;->register(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 1408
    iget-object v0, p0, Lezvcard/Ezvcard$WriterChainText;->this_:Ljava/lang/Object;

    check-cast v0, Lezvcard/Ezvcard$WriterChainText;

    return-object v0
.end method

.method public version(Lezvcard/VCardVersion;)Lezvcard/Ezvcard$WriterChainText;
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 1359
    iput-object p1, p0, Lezvcard/Ezvcard$WriterChainText;->version:Lezvcard/VCardVersion;

    .line 1360
    iget-object v0, p0, Lezvcard/Ezvcard$WriterChainText;->this_:Ljava/lang/Object;

    check-cast v0, Lezvcard/Ezvcard$WriterChainText;

    return-object v0
.end method

.method public versionStrict(Z)Lezvcard/Ezvcard$WriterChainText;
    .locals 1
    .param p1, "versionStrict"    # Z

    .prologue
    .line 1397
    iput-boolean p1, p0, Lezvcard/Ezvcard$WriterChainText;->versionStrict:Z

    .line 1398
    iget-object v0, p0, Lezvcard/Ezvcard$WriterChainText;->this_:Ljava/lang/Object;

    check-cast v0, Lezvcard/Ezvcard$WriterChainText;

    return-object v0
.end method
