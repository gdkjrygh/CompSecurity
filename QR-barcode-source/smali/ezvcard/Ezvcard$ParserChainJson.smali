.class abstract Lezvcard/Ezvcard$ParserChainJson;
.super Lezvcard/Ezvcard$ParserChain;
.source "Ezvcard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/Ezvcard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "ParserChainJson"
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
.field final closeWhenDone:Z


# direct methods
.method private constructor <init>(Z)V
    .locals 0
    .param p1, "closeWhenDone"    # Z

    .prologue
    .line 1153
    .local p0, "this":Lezvcard/Ezvcard$ParserChainJson;, "Lezvcard/Ezvcard$ParserChainJson<TT;>;"
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChain;-><init>()V

    .line 1154
    iput-boolean p1, p0, Lezvcard/Ezvcard$ParserChainJson;->closeWhenDone:Z

    .line 1155
    return-void
.end method

.method synthetic constructor <init>(ZLezvcard/Ezvcard$1;)V
    .locals 0
    .param p1, "x0"    # Z
    .param p2, "x1"    # Lezvcard/Ezvcard$1;

    .prologue
    .line 1150
    .local p0, "this":Lezvcard/Ezvcard$ParserChainJson;, "Lezvcard/Ezvcard$ParserChainJson<TT;>;"
    invoke-direct {p0, p1}, Lezvcard/Ezvcard$ParserChainJson;-><init>(Z)V

    return-void
.end method

.method private constructReader()Lezvcard/io/json/JCardReader;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 1206
    .local p0, "this":Lezvcard/Ezvcard$ParserChainJson;, "Lezvcard/Ezvcard$ParserChainJson<TT;>;"
    invoke-virtual {p0}, Lezvcard/Ezvcard$ParserChainJson;->_constructReader()Lezvcard/io/json/JCardReader;

    move-result-object v0

    .line 1207
    .local v0, "parser":Lezvcard/io/json/JCardReader;
    iget-object v1, p0, Lezvcard/Ezvcard$ParserChainJson;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v0, v1}, Lezvcard/io/json/JCardReader;->setScribeIndex(Lezvcard/io/scribe/ScribeIndex;)V

    .line 1208
    return-object v0
.end method


# virtual methods
.method abstract _constructReader()Lezvcard/io/json/JCardReader;
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
    .line 1186
    .local p0, "this":Lezvcard/Ezvcard$ParserChainJson;, "Lezvcard/Ezvcard$ParserChainJson<TT;>;"
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChainJson;->constructReader()Lezvcard/io/json/JCardReader;

    move-result-object v0

    .line 1189
    .local v0, "parser":Lezvcard/io/json/JCardReader;
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1191
    .local v2, "vcards":Ljava/util/List;, "Ljava/util/List<Lezvcard/VCard;>;"
    :goto_0
    invoke-virtual {v0}, Lezvcard/io/json/JCardReader;->readNext()Lezvcard/VCard;

    move-result-object v1

    .local v1, "vcard":Lezvcard/VCard;
    if-eqz v1, :cond_2

    .line 1192
    iget-object v3, p0, Lezvcard/Ezvcard$ParserChainJson;->warnings:Ljava/util/List;

    if-eqz v3, :cond_0

    .line 1193
    iget-object v3, p0, Lezvcard/Ezvcard$ParserChainJson;->warnings:Ljava/util/List;

    invoke-virtual {v0}, Lezvcard/io/json/JCardReader;->getWarnings()Ljava/util/List;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1195
    :cond_0
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1199
    .end local v1    # "vcard":Lezvcard/VCard;
    .end local v2    # "vcards":Ljava/util/List;, "Ljava/util/List<Lezvcard/VCard;>;"
    :catchall_0
    move-exception v3

    iget-boolean v4, p0, Lezvcard/Ezvcard$ParserChainJson;->closeWhenDone:Z

    if-eqz v4, :cond_1

    .line 1200
    invoke-static {v0}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    :cond_1
    throw v3

    .line 1199
    .restart local v1    # "vcard":Lezvcard/VCard;
    .restart local v2    # "vcards":Ljava/util/List;, "Ljava/util/List<Lezvcard/VCard;>;"
    :cond_2
    iget-boolean v3, p0, Lezvcard/Ezvcard$ParserChainJson;->closeWhenDone:Z

    if-eqz v3, :cond_3

    .line 1200
    invoke-static {v0}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    :cond_3
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
    .line 1164
    .local p0, "this":Lezvcard/Ezvcard$ParserChainJson;, "Lezvcard/Ezvcard$ParserChainJson<TT;>;"
    invoke-direct {p0}, Lezvcard/Ezvcard$ParserChainJson;->constructReader()Lezvcard/io/json/JCardReader;

    move-result-object v0

    .line 1167
    .local v0, "parser":Lezvcard/io/json/JCardReader;
    :try_start_0
    invoke-virtual {v0}, Lezvcard/io/json/JCardReader;->readNext()Lezvcard/VCard;

    move-result-object v1

    .line 1168
    .local v1, "vcard":Lezvcard/VCard;
    iget-object v2, p0, Lezvcard/Ezvcard$ParserChainJson;->warnings:Ljava/util/List;

    if-eqz v2, :cond_0

    .line 1169
    iget-object v2, p0, Lezvcard/Ezvcard$ParserChainJson;->warnings:Ljava/util/List;

    invoke-virtual {v0}, Lezvcard/io/json/JCardReader;->getWarnings()Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1173
    :cond_0
    iget-boolean v2, p0, Lezvcard/Ezvcard$ParserChainJson;->closeWhenDone:Z

    if-eqz v2, :cond_1

    .line 1174
    invoke-static {v0}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    :cond_1
    return-object v1

    .line 1173
    .end local v1    # "vcard":Lezvcard/VCard;
    :catchall_0
    move-exception v2

    iget-boolean v3, p0, Lezvcard/Ezvcard$ParserChainJson;->closeWhenDone:Z

    if-eqz v3, :cond_2

    .line 1174
    invoke-static {v0}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    :cond_2
    throw v2
.end method
