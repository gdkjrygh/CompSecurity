.class public Lezvcard/Ezvcard$WriterChainJson;
.super Lezvcard/Ezvcard$WriterChain;
.source "Ezvcard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/Ezvcard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WriterChainJson"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/Ezvcard$WriterChain",
        "<",
        "Lezvcard/Ezvcard$WriterChainJson;",
        ">;"
    }
.end annotation


# instance fields
.field indent:Z

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

    .line 1695
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$WriterChain;-><init>(Ljava/util/Collection;)V

    .line 1689
    iput-boolean v0, p0, Lezvcard/Ezvcard$WriterChainJson;->prodId:Z

    .line 1690
    iput-boolean v0, p0, Lezvcard/Ezvcard$WriterChainJson;->versionStrict:Z

    .line 1691
    const/4 v0, 0x0

    iput-boolean v0, p0, Lezvcard/Ezvcard$WriterChainJson;->indent:Z

    .line 1692
    new-instance v0, Lezvcard/io/scribe/ScribeIndex;

    invoke-direct {v0}, Lezvcard/io/scribe/ScribeIndex;-><init>()V

    iput-object v0, p0, Lezvcard/Ezvcard$WriterChainJson;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 1696
    return-void
.end method

.method synthetic constructor <init>(Ljava/util/Collection;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/util/Collection;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 1688
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$WriterChainJson;-><init>(Ljava/util/Collection;)V

    return-void
.end method

.method private go(Lezvcard/io/json/JCardWriter;)V
    .locals 3
    .param p1, "writer"    # Lezvcard/io/json/JCardWriter;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1789
    iget-boolean v2, p0, Lezvcard/Ezvcard$WriterChainJson;->prodId:Z

    invoke-virtual {p1, v2}, Lezvcard/io/json/JCardWriter;->setAddProdId(Z)V

    .line 1790
    iget-boolean v2, p0, Lezvcard/Ezvcard$WriterChainJson;->indent:Z

    invoke-virtual {p1, v2}, Lezvcard/io/json/JCardWriter;->setIndent(Z)V

    .line 1791
    iget-boolean v2, p0, Lezvcard/Ezvcard$WriterChainJson;->versionStrict:Z

    invoke-virtual {p1, v2}, Lezvcard/io/json/JCardWriter;->setVersionStrict(Z)V

    .line 1792
    iget-object v2, p0, Lezvcard/Ezvcard$WriterChainJson;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {p1, v2}, Lezvcard/io/json/JCardWriter;->setScribeIndex(Lezvcard/io/scribe/ScribeIndex;)V

    .line 1794
    :try_start_0
    iget-object v2, p0, Lezvcard/Ezvcard$WriterChainJson;->vcards:Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lezvcard/VCard;

    .line 1795
    .local v1, "vcard":Lezvcard/VCard;
    invoke-virtual {p1, v1}, Lezvcard/io/json/JCardWriter;->write(Lezvcard/VCard;)V

    .line 1796
    invoke-virtual {p1}, Lezvcard/io/json/JCardWriter;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1799
    .end local v0    # "i$":Ljava/util/Iterator;
    .end local v1    # "vcard":Lezvcard/VCard;
    :catchall_0
    move-exception v2

    invoke-virtual {p1}, Lezvcard/io/json/JCardWriter;->closeJsonStream()V

    throw v2

    .restart local v0    # "i$":Ljava/util/Iterator;
    :cond_0
    invoke-virtual {p1}, Lezvcard/io/json/JCardWriter;->closeJsonStream()V

    .line 1801
    return-void
.end method


# virtual methods
.method public go()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1747
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 1749
    .local v0, "sw":Ljava/io/StringWriter;
    :try_start_0
    invoke-virtual {p0, v0}, Lezvcard/Ezvcard$WriterChainJson;->go(Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1753
    :goto_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 1750
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public go(Ljava/io/File;)V
    .locals 3
    .param p1, "file"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    .line 1771
    new-instance v0, Lezvcard/io/json/JCardWriter;

    iget-object v2, p0, Lezvcard/Ezvcard$WriterChainJson;->vcards:Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    if-le v2, v1, :cond_0

    :goto_0
    invoke-direct {v0, p1, v1}, Lezvcard/io/json/JCardWriter;-><init>(Ljava/io/File;Z)V

    .line 1773
    .local v0, "writer":Lezvcard/io/json/JCardWriter;
    :try_start_0
    invoke-direct {p0, v0}, Lezvcard/Ezvcard$WriterChainJson;->go(Lezvcard/io/json/JCardWriter;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1775
    invoke-static {v0}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 1777
    return-void

    .line 1771
    .end local v0    # "writer":Lezvcard/io/json/JCardWriter;
    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    .line 1775
    .restart local v0    # "writer":Lezvcard/io/json/JCardWriter;
    :catchall_0
    move-exception v1

    invoke-static {v0}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    throw v1
.end method

.method public go(Ljava/io/OutputStream;)V
    .locals 3
    .param p1, "out"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    .line 1762
    new-instance v1, Lezvcard/io/json/JCardWriter;

    iget-object v2, p0, Lezvcard/Ezvcard$WriterChainJson;->vcards:Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    if-le v2, v0, :cond_0

    :goto_0
    invoke-direct {v1, p1, v0}, Lezvcard/io/json/JCardWriter;-><init>(Ljava/io/OutputStream;Z)V

    invoke-direct {p0, v1}, Lezvcard/Ezvcard$WriterChainJson;->go(Lezvcard/io/json/JCardWriter;)V

    .line 1763
    return-void

    .line 1762
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public go(Ljava/io/Writer;)V
    .locals 3
    .param p1, "writer"    # Ljava/io/Writer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    .line 1785
    new-instance v1, Lezvcard/io/json/JCardWriter;

    iget-object v2, p0, Lezvcard/Ezvcard$WriterChainJson;->vcards:Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    if-le v2, v0, :cond_0

    :goto_0
    invoke-direct {v1, p1, v0}, Lezvcard/io/json/JCardWriter;-><init>(Ljava/io/Writer;Z)V

    invoke-direct {p0, v1}, Lezvcard/Ezvcard$WriterChainJson;->go(Lezvcard/io/json/JCardWriter;)V

    .line 1786
    return-void

    .line 1785
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public indent(Z)Lezvcard/Ezvcard$WriterChainJson;
    .locals 1
    .param p1, "indent"    # Z

    .prologue
    .line 1716
    iput-boolean p1, p0, Lezvcard/Ezvcard$WriterChainJson;->indent:Z

    .line 1717
    iget-object v0, p0, Lezvcard/Ezvcard$WriterChainJson;->this_:Ljava/lang/Object;

    check-cast v0, Lezvcard/Ezvcard$WriterChainJson;

    return-object v0
.end method

.method public prodId(Z)Lezvcard/Ezvcard$WriterChainJson;
    .locals 1
    .param p1, "include"    # Z

    .prologue
    .line 1705
    iput-boolean p1, p0, Lezvcard/Ezvcard$WriterChainJson;->prodId:Z

    .line 1706
    iget-object v0, p0, Lezvcard/Ezvcard$WriterChainJson;->this_:Ljava/lang/Object;

    check-cast v0, Lezvcard/Ezvcard$WriterChainJson;

    return-object v0
.end method

.method public register(Lezvcard/io/scribe/VCardPropertyScribe;)Lezvcard/Ezvcard$WriterChainJson;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)",
            "Lezvcard/Ezvcard$WriterChainJson;"
        }
    .end annotation

    .prologue
    .line 1738
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    iget-object v0, p0, Lezvcard/Ezvcard$WriterChainJson;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v0, p1}, Lezvcard/io/scribe/ScribeIndex;->register(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 1739
    iget-object v0, p0, Lezvcard/Ezvcard$WriterChainJson;->this_:Ljava/lang/Object;

    check-cast v0, Lezvcard/Ezvcard$WriterChainJson;

    return-object v0
.end method

.method public versionStrict(Z)Lezvcard/Ezvcard$WriterChainJson;
    .locals 1
    .param p1, "versionStrict"    # Z

    .prologue
    .line 1728
    iput-boolean p1, p0, Lezvcard/Ezvcard$WriterChainJson;->versionStrict:Z

    .line 1729
    iget-object v0, p0, Lezvcard/Ezvcard$WriterChainJson;->this_:Ljava/lang/Object;

    check-cast v0, Lezvcard/Ezvcard$WriterChainJson;

    return-object v0
.end method
