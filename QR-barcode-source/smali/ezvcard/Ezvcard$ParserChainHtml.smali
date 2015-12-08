.class abstract Lezvcard/Ezvcard$ParserChainHtml;
.super Lezvcard/Ezvcard$ParserChain;
.source "Ezvcard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/Ezvcard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "ParserChainHtml"
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
.field pageUrl:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 989
    .local p0, "this":Lezvcard/Ezvcard$ParserChainHtml;, "Lezvcard/Ezvcard$ParserChainHtml<TT;>;"
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChain;-><init>()V

    return-void
.end method

.method private constructReader()Lezvcard/io/html/HCardReader;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1031
    .local p0, "this":Lezvcard/Ezvcard$ParserChainHtml;, "Lezvcard/Ezvcard$ParserChainHtml<TT;>;"
    invoke-virtual {p0}, Lezvcard/Ezvcard$ParserChainHtml;->_constructReader()Lezvcard/io/html/HCardReader;

    move-result-object v0

    .line 1032
    .local v0, "parser":Lezvcard/io/html/HCardReader;
    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainHtml;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v0, v1}, Lezvcard/io/html/HCardReader;->setScribeIndex(Lezvcard/io/scribe/ScribeIndex;)V

    .line 1033
    return-object v0
.end method


# virtual methods
.method abstract _constructReader()Lezvcard/io/html/HCardReader;
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
    .line 1017
    .local p0, "this":Lezvcard/Ezvcard$ParserChainHtml;, "Lezvcard/Ezvcard$ParserChainHtml<TT;>;"
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChainHtml;->constructReader()Lezvcard/io/html/HCardReader;

    move-result-object v0

    .line 1019
    .local v0, "parser":Lezvcard/io/html/HCardReader;
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1021
    .local v2, "vcards":Ljava/util/List;, "Ljava/util/List<Lezvcard/VCard;>;"
    :goto_0
    invoke-virtual {v0}, Lezvcard/io/html/HCardReader;->readNext()Lezvcard/VCard;

    move-result-object v1

    .local v1, "vcard":Lezvcard/VCard;
    if-eqz v1, :cond_1

    .line 1022
    iget-object v3, p0, Lezvcard/Ezvcard$ParserChainHtml;->warnings:Ljava/util/List;

    if-eqz v3, :cond_0

    .line 1023
    iget-object v3, p0, Lezvcard/Ezvcard$ParserChainHtml;->warnings:Ljava/util/List;

    invoke-virtual {v0}, Lezvcard/io/html/HCardReader;->getWarnings()Ljava/util/List;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1025
    :cond_0
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1027
    :cond_1
    return-object v2
.end method

.method public first()Lezvcard/VCard;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1006
    .local p0, "this":Lezvcard/Ezvcard$ParserChainHtml;, "Lezvcard/Ezvcard$ParserChainHtml<TT;>;"
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChainHtml;->constructReader()Lezvcard/io/html/HCardReader;

    move-result-object v0

    .line 1008
    .local v0, "parser":Lezvcard/io/html/HCardReader;
    invoke-virtual {v0}, Lezvcard/io/html/HCardReader;->readNext()Lezvcard/VCard;

    move-result-object v1

    .line 1009
    .local v1, "vcard":Lezvcard/VCard;
    iget-object v2, p0, Lezvcard/Ezvcard$ParserChainHtml;->warnings:Ljava/util/List;

    if-eqz v2, :cond_0

    .line 1010
    iget-object v2, p0, Lezvcard/Ezvcard$ParserChainHtml;->warnings:Ljava/util/List;

    invoke-virtual {v0}, Lezvcard/io/html/HCardReader;->getWarnings()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1012
    :cond_0
    return-object v1
.end method

.method public pageUrl(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .param p1, "pageUrl"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 1000
    .local p0, "this":Lezvcard/Ezvcard$ParserChainHtml;, "Lezvcard/Ezvcard$ParserChainHtml<TT;>;"
    iput-object p1, p0, Lezvcard/Ezvcard$ParserChainHtml;->pageUrl:Ljava/lang/String;

    .line 1001
    iget-object v0, p0, Lezvcard/Ezvcard$ParserChainHtml;->this_:Ljava/lang/Object;

    return-object v0
.end method
