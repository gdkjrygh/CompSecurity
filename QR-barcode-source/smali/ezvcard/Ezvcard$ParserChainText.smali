.class abstract Lezvcard/Ezvcard$ParserChainText;
.super Lezvcard/Ezvcard$ParserChain;
.source "Ezvcard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/Ezvcard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "ParserChainText"
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


# instance fields
.field caretDecoding:Z

.field final closeWhenDone:Z


# direct methods
.method private constructor <init>(Z)V
    .locals 1
    .param p1, "closeWhenDone"    # Z

    .prologue
    .line 645
    .local p0, "this":Lezvcard/Ezvcard$ParserChainText;, "Lezvcard/Ezvcard$ParserChainText<TT;>;"
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChain;-><init>()V

    .line 642
    const/4 v0, 0x1

    iput-boolean v0, p0, Lezvcard/Ezvcard$ParserChainText;->caretDecoding:Z

    .line 646
    iput-boolean p1, p0, Lezvcard/Ezvcard$ParserChainText;->closeWhenDone:Z

    .line 647
    return-void
.end method

.method synthetic constructor <init>(ZLezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Z
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 641
    .local p0, "this":Lezvcard/Ezvcard$ParserChainText;, "Lezvcard/Ezvcard$ParserChainText<TT;>;"
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$ParserChainText;-><init>(Z)V

    return-void
.end method

.method private constructReader()Lezvcard/io/text/VCardReader;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 702
    .local p0, "this":Lezvcard/Ezvcard$ParserChainText;, "Lezvcard/Ezvcard$ParserChainText<TT;>;"
    invoke-virtual {p0}, Lezvcard/Ezvcard$ParserChainText;->_constructReader()Lezvcard/io/text/VCardReader;

    move-result-object v0

    .line 703
    .local v0, "parser":Lezvcard/io/text/VCardReader;
    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainText;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v0, v1}, Lezvcard/io/text/VCardReader;->setScribeIndex(Lezvcard/io/scribe/ScribeIndex;)V

    .line 704
    iget-boolean v1, p0, Lezvcard/Ezvcard$ParserChainText;->caretDecoding:Z

    invoke-virtual {v0, v1}, Lezvcard/io/text/VCardReader;->setCaretDecodingEnabled(Z)V

    .line 705
    return-object v0
.end method


# virtual methods
.method abstract _constructReader()Lezvcard/io/text/VCardReader;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public all()Ljava/util/List;
    .locals 5
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
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 682
    .local p0, "this":Lezvcard/Ezvcard$ParserChainText;, "Lezvcard/Ezvcard$ParserChainText<TT;>;"
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChainText;->constructReader()Lezvcard/io/text/VCardReader;

    move-result-object v0

    .line 685
    .local v0, "parser":Lezvcard/io/text/VCardReader;
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 687
    .local v2, "vcards":Ljava/util/List;, "Ljava/util/List<Lezvcard/VCard;>;"
    :goto_0
    invoke-virtual {v0}, Lezvcard/io/text/VCardReader;->readNext()Lezvcard/VCard;

    move-result-object v1

    .local v1, "vcard":Lezvcard/VCard;
    if-eqz v1, :cond_2

    .line 688
    iget-object v3, p0, Lezvcard/Ezvcard$ParserChainText;->warnings:Ljava/util/List;

    if-eqz v3, :cond_0

    .line 689
    iget-object v3, p0, Lezvcard/Ezvcard$ParserChainText;->warnings:Ljava/util/List;

    invoke-virtual {v0}, Lezvcard/io/text/VCardReader;->getWarnings()Ljava/util/List;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 691
    :cond_0
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 695
    .end local v1    # "vcard":Lezvcard/VCard;
    .end local v2    # "vcards":Ljava/util/List;, "Ljava/util/List<Lezvcard/VCard;>;"
    :catchall_0
    move-exception v3

    iget-boolean v4, p0, Lezvcard/Ezvcard$ParserChainText;->closeWhenDone:Z

    if-eqz v4, :cond_1

    .line 696
    invoke-static {v0}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    :cond_1
    throw v3

    .line 695
    .restart local v1    # "vcard":Lezvcard/VCard;
    .restart local v2    # "vcards":Ljava/util/List;, "Ljava/util/List<Lezvcard/VCard;>;"
    :cond_2
    iget-boolean v3, p0, Lezvcard/Ezvcard$ParserChainText;->closeWhenDone:Z

    if-eqz v3, :cond_3

    .line 696
    invoke-static {v0}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    :cond_3
    return-object v2
.end method

.method public caretDecoding(Z)Ljava/lang/Object;
    .locals 1
    .param p1, "enable"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    .prologue
    .line 659
    .local p0, "this":Lezvcard/Ezvcard$ParserChainText;, "Lezvcard/Ezvcard$ParserChainText<TT;>;"
    iput-boolean p1, p0, Lezvcard/Ezvcard$ParserChainText;->caretDecoding:Z

    .line 660
    iget-object v0, p0, Lezvcard/Ezvcard$ParserChainText;->this_:Ljava/lang/Object;

    return-object v0
.end method

.method public first()Lezvcard/VCard;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 665
    .local p0, "this":Lezvcard/Ezvcard$ParserChainText;, "Lezvcard/Ezvcard$ParserChainText<TT;>;"
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChainText;->constructReader()Lezvcard/io/text/VCardReader;

    move-result-object v0

    .line 668
    .local v0, "parser":Lezvcard/io/text/VCardReader;
    :try_start_0
    invoke-virtual {v0}, Lezvcard/io/text/VCardReader;->readNext()Lezvcard/VCard;

    move-result-object v1

    .line 669
    .local v1, "vcard":Lezvcard/VCard;
    iget-object v2, p0, Lezvcard/Ezvcard$ParserChainText;->warnings:Ljava/util/List;

    if-eqz v2, :cond_0

    .line 670
    iget-object v2, p0, Lezvcard/Ezvcard$ParserChainText;->warnings:Ljava/util/List;

    invoke-virtual {v0}, Lezvcard/io/text/VCardReader;->getWarnings()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 674
    :cond_0
    iget-boolean v2, p0, Lezvcard/Ezvcard$ParserChainText;->closeWhenDone:Z

    if-eqz v2, :cond_1

    .line 675
    invoke-static {v0}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    :cond_1
    return-object v1

    .line 674
    .end local v1    # "vcard":Lezvcard/VCard;
    :catchall_0
    move-exception v2

    iget-boolean v3, p0, Lezvcard/Ezvcard$ParserChainText;->closeWhenDone:Z

    if-eqz v3, :cond_2

    .line 675
    invoke-static {v0}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    :cond_2
    throw v2
.end method
