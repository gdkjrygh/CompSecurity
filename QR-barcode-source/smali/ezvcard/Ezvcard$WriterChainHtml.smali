.class public Lezvcard/Ezvcard$WriterChainHtml;
.super Lezvcard/Ezvcard$WriterChain;
.source "Ezvcard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/Ezvcard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WriterChainHtml"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/Ezvcard$WriterChain",
        "<",
        "Lezvcard/Ezvcard$WriterChainHtml;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>(Ljava/util/Collection;)V
    .locals 0
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
    .line 1628
    .local p1, "vcards":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/VCard;>;"
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$WriterChain;-><init>(Ljava/util/Collection;)V

    .line 1629
    return-void
.end method

.method synthetic constructor <init>(Ljava/util/Collection;Lezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/util/Collection;
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 1626
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$WriterChainHtml;-><init>(Ljava/util/Collection;)V

    return-void
.end method


# virtual methods
.method public go()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1636
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 1638
    .local v0, "sw":Ljava/io/StringWriter;
    :try_start_0
    invoke-virtual {p0, v0}, Lezvcard/Ezvcard$WriterChainHtml;->go(Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1642
    :goto_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 1639
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
    .line 1660
    const/4 v0, 0x0

    .line 1662
    .local v0, "writer":Ljava/io/FileWriter;
    :try_start_0
    new-instance v1, Ljava/io/FileWriter;

    invoke-direct {v1, p1}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1663
    .end local v0    # "writer":Ljava/io/FileWriter;
    .local v1, "writer":Ljava/io/FileWriter;
    :try_start_1
    invoke-virtual {p0, v1}, Lezvcard/Ezvcard$WriterChainHtml;->go(Ljava/io/Writer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1665
    invoke-static {v1}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 1667
    return-void

    .line 1665
    .end local v1    # "writer":Ljava/io/FileWriter;
    .restart local v0    # "writer":Ljava/io/FileWriter;
    :catchall_0
    move-exception v2

    :goto_0
    invoke-static {v0}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    throw v2

    .end local v0    # "writer":Ljava/io/FileWriter;
    .restart local v1    # "writer":Ljava/io/FileWriter;
    :catchall_1
    move-exception v2

    move-object v0, v1

    .end local v1    # "writer":Ljava/io/FileWriter;
    .restart local v0    # "writer":Ljava/io/FileWriter;
    goto :goto_0
.end method

.method public go(Ljava/io/OutputStream;)V
    .locals 1
    .param p1, "out"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1651
    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-direct {v0, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {p0, v0}, Lezvcard/Ezvcard$WriterChainHtml;->go(Ljava/io/Writer;)V

    .line 1652
    return-void
.end method

.method public go(Ljava/io/Writer;)V
    .locals 4
    .param p1, "writer"    # Ljava/io/Writer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1675
    new-instance v1, Lezvcard/io/html/HCardPage;

    invoke-direct {v1}, Lezvcard/io/html/HCardPage;-><init>()V

    .line 1676
    .local v1, "page":Lezvcard/io/html/HCardPage;
    iget-object v3, p0, Lezvcard/Ezvcard$WriterChainHtml;->vcards:Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lezvcard/VCard;

    .line 1677
    .local v2, "vcard":Lezvcard/VCard;
    invoke-virtual {v1, v2}, Lezvcard/io/html/HCardPage;->add(Lezvcard/VCard;)V

    goto :goto_0

    .line 1679
    .end local v2    # "vcard":Lezvcard/VCard;
    :cond_0
    invoke-virtual {v1, p1}, Lezvcard/io/html/HCardPage;->write(Ljava/io/Writer;)V

    .line 1680
    return-void
.end method
