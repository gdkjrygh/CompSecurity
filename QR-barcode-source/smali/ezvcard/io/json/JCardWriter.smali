.class public Lezvcard/io/json/JCardWriter;
.super Ljava/lang/Object;
.source "JCardWriter.java"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# instance fields
.field private addProdId:Z

.field private index:Lezvcard/io/scribe/ScribeIndex;

.field private final targetVersion:Lezvcard/VCardVersion;

.field private versionStrict:Z

.field private final writer:Lezvcard/io/json/JCardRawWriter;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1
    .param p1, "file"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 111
    invoke-static {p1}, Lezvcard/util/IOUtils;->utf8Writer(Ljava/io/File;)Ljava/io/Writer;

    move-result-object v0

    invoke-direct {p0, v0}, Lezvcard/io/json/JCardWriter;-><init>(Ljava/io/Writer;)V

    .line 112
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Z)V
    .locals 1
    .param p1, "file"    # Ljava/io/File;
    .param p2, "wrapInArray"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 123
    invoke-static {p1}, Lezvcard/util/IOUtils;->utf8Writer(Ljava/io/File;)Ljava/io/Writer;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lezvcard/io/json/JCardWriter;-><init>(Ljava/io/Writer;Z)V

    .line 124
    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 1
    .param p1, "out"    # Ljava/io/OutputStream;

    .prologue
    .line 90
    invoke-static {p1}, Lezvcard/util/IOUtils;->utf8Writer(Ljava/io/OutputStream;)Ljava/io/Writer;

    move-result-object v0

    invoke-direct {p0, v0}, Lezvcard/io/json/JCardWriter;-><init>(Ljava/io/Writer;)V

    .line 91
    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Z)V
    .locals 1
    .param p1, "out"    # Ljava/io/OutputStream;
    .param p2, "wrapInArray"    # Z

    .prologue
    .line 101
    invoke-static {p1}, Lezvcard/util/IOUtils;->utf8Writer(Ljava/io/OutputStream;)Ljava/io/Writer;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lezvcard/io/json/JCardWriter;-><init>(Ljava/io/Writer;Z)V

    .line 102
    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;)V
    .locals 1
    .param p1, "writer"    # Ljava/io/Writer;

    .prologue
    .line 131
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lezvcard/io/json/JCardWriter;-><init>(Ljava/io/Writer;Z)V

    .line 132
    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;Z)V
    .locals 2
    .param p1, "writer"    # Ljava/io/Writer;
    .param p2, "wrapInArray"    # Z

    .prologue
    const/4 v1, 0x1

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    new-instance v0, Lezvcard/io/scribe/ScribeIndex;

    invoke-direct {v0}, Lezvcard/io/scribe/ScribeIndex;-><init>()V

    iput-object v0, p0, Lezvcard/io/json/JCardWriter;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 80
    sget-object v0, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    iput-object v0, p0, Lezvcard/io/json/JCardWriter;->targetVersion:Lezvcard/VCardVersion;

    .line 81
    iput-boolean v1, p0, Lezvcard/io/json/JCardWriter;->addProdId:Z

    .line 82
    iput-boolean v1, p0, Lezvcard/io/json/JCardWriter;->versionStrict:Z

    .line 141
    new-instance v0, Lezvcard/io/json/JCardRawWriter;

    invoke-direct {v0, p1, p2}, Lezvcard/io/json/JCardRawWriter;-><init>(Ljava/io/Writer;Z)V

    iput-object v0, p0, Lezvcard/io/json/JCardWriter;->writer:Lezvcard/io/json/JCardRawWriter;

    .line 142
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 313
    iget-object v0, p0, Lezvcard/io/json/JCardWriter;->writer:Lezvcard/io/json/JCardRawWriter;

    invoke-virtual {v0}, Lezvcard/io/json/JCardRawWriter;->close()V

    .line 314
    return-void
.end method

.method public closeJsonStream()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 305
    iget-object v0, p0, Lezvcard/io/json/JCardWriter;->writer:Lezvcard/io/json/JCardRawWriter;

    invoke-virtual {v0}, Lezvcard/io/json/JCardRawWriter;->closeJsonStream()V

    .line 306
    return-void
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 297
    iget-object v0, p0, Lezvcard/io/json/JCardWriter;->writer:Lezvcard/io/json/JCardRawWriter;

    invoke-virtual {v0}, Lezvcard/io/json/JCardRawWriter;->flush()V

    .line 298
    return-void
.end method

.method public getScribeIndex()Lezvcard/io/scribe/ScribeIndex;
    .locals 1

    .prologue
    .line 281
    iget-object v0, p0, Lezvcard/io/json/JCardWriter;->index:Lezvcard/io/scribe/ScribeIndex;

    return-object v0
.end method

.method public isAddProdId()Z
    .locals 1

    .prologue
    .line 213
    iget-boolean v0, p0, Lezvcard/io/json/JCardWriter;->addProdId:Z

    return v0
.end method

.method public isIndent()Z
    .locals 1

    .prologue
    .line 252
    iget-object v0, p0, Lezvcard/io/json/JCardWriter;->writer:Lezvcard/io/json/JCardRawWriter;

    invoke-virtual {v0}, Lezvcard/io/json/JCardRawWriter;->isIndent()Z

    move-result v0

    return v0
.end method

.method public isVersionStrict()Z
    .locals 1

    .prologue
    .line 233
    iget-boolean v0, p0, Lezvcard/io/json/JCardWriter;->versionStrict:Z

    return v0
.end method

.method public registerScribe(Lezvcard/io/scribe/VCardPropertyScribe;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 273
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    iget-object v0, p0, Lezvcard/io/json/JCardWriter;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v0, p1}, Lezvcard/io/scribe/ScribeIndex;->register(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 274
    return-void
.end method

.method public setAddProdId(Z)V
    .locals 0
    .param p1, "addProdId"    # Z

    .prologue
    .line 223
    iput-boolean p1, p0, Lezvcard/io/json/JCardWriter;->addProdId:Z

    .line 224
    return-void
.end method

.method public setIndent(Z)V
    .locals 1
    .param p1, "indent"    # Z

    .prologue
    .line 260
    iget-object v0, p0, Lezvcard/io/json/JCardWriter;->writer:Lezvcard/io/json/JCardRawWriter;

    invoke-virtual {v0, p1}, Lezvcard/io/json/JCardRawWriter;->setIndent(Z)V

    .line 261
    return-void
.end method

.method public setScribeIndex(Lezvcard/io/scribe/ScribeIndex;)V
    .locals 0
    .param p1, "index"    # Lezvcard/io/scribe/ScribeIndex;

    .prologue
    .line 289
    iput-object p1, p0, Lezvcard/io/json/JCardWriter;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 290
    return-void
.end method

.method public setVersionStrict(Z)V
    .locals 0
    .param p1, "versionStrict"    # Z

    .prologue
    .line 243
    iput-boolean p1, p0, Lezvcard/io/json/JCardWriter;->versionStrict:Z

    .line 244
    return-void
.end method

.method public write(Lezvcard/VCard;)V
    .locals 12
    .param p1, "vcard"    # Lezvcard/VCard;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 153
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 155
    .local v10, "typesToAdd":Ljava/util/List;, "Ljava/util/List<Lezvcard/property/VCardProperty;>;"
    invoke-virtual {p1}, Lezvcard/VCard;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .local v6, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lezvcard/property/VCardProperty;

    .line 156
    .local v9, "type":Lezvcard/property/VCardProperty;
    iget-boolean v0, p0, Lezvcard/io/json/JCardWriter;->addProdId:Z

    if-eqz v0, :cond_1

    instance-of v0, v9, Lezvcard/property/ProductId;

    if-nez v0, :cond_0

    .line 161
    :cond_1
    iget-boolean v0, p0, Lezvcard/io/json/JCardWriter;->versionStrict:Z

    if-eqz v0, :cond_2

    invoke-virtual {v9}, Lezvcard/property/VCardProperty;->getSupportedVersions()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lezvcard/io/json/JCardWriter;->targetVersion:Lezvcard/VCardVersion;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    :cond_2
    iget-object v0, p0, Lezvcard/io/json/JCardWriter;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v0, v9}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Lezvcard/property/VCardProperty;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v0

    if-nez v0, :cond_3

    .line 168
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No scribe found for property class \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\"."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 171
    :cond_3
    invoke-interface {v10, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 175
    .end local v9    # "type":Lezvcard/property/VCardProperty;
    :cond_4
    iget-boolean v0, p0, Lezvcard/io/json/JCardWriter;->addProdId:Z

    if-eqz v0, :cond_5

    .line 177
    iget-object v0, p0, Lezvcard/io/json/JCardWriter;->targetVersion:Lezvcard/VCardVersion;

    sget-object v1, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    if-ne v0, v1, :cond_6

    .line 178
    new-instance v7, Lezvcard/property/RawProperty;

    const-string v0, "X-PRODID"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ezvcard "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lezvcard/Ezvcard;->VERSION:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v7, v0, v1}, Lezvcard/property/RawProperty;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    .local v7, "property":Lezvcard/property/VCardProperty;
    :goto_1
    invoke-interface {v10, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 185
    .end local v7    # "property":Lezvcard/property/VCardProperty;
    :cond_5
    iget-object v0, p0, Lezvcard/io/json/JCardWriter;->writer:Lezvcard/io/json/JCardRawWriter;

    invoke-virtual {v0}, Lezvcard/io/json/JCardRawWriter;->writeStartVCard()V

    .line 186
    iget-object v0, p0, Lezvcard/io/json/JCardWriter;->writer:Lezvcard/io/json/JCardRawWriter;

    const-string v1, "version"

    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    iget-object v4, p0, Lezvcard/io/json/JCardWriter;->targetVersion:Lezvcard/VCardVersion;

    invoke-virtual {v4}, Lezvcard/VCardVersion;->getVersion()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v4}, Lezvcard/io/json/JCardRawWriter;->writeProperty(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/io/json/JCardValue;)V

    .line 188
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lezvcard/property/VCardProperty;

    .line 189
    .restart local v9    # "type":Lezvcard/property/VCardProperty;
    iget-object v0, p0, Lezvcard/io/json/JCardWriter;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v0, v9}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Lezvcard/property/VCardProperty;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v8

    .line 192
    .local v8, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;
    :try_start_0
    invoke-virtual {v8, v9}, Lezvcard/io/scribe/VCardPropertyScribe;->writeJson(Lezvcard/property/VCardProperty;)Lezvcard/io/json/JCardValue;

    move-result-object v11

    .line 193
    .local v11, "value":Lezvcard/io/json/JCardValue;
    new-instance v5, Lezvcard/io/json/JCardValue;

    invoke-virtual {v11}, Lezvcard/io/json/JCardValue;->getValues()Ljava/util/List;

    move-result-object v0

    invoke-direct {v5, v0}, Lezvcard/io/json/JCardValue;-><init>(Ljava/util/List;)V

    .line 194
    .end local v11    # "value":Lezvcard/io/json/JCardValue;
    .local v5, "value":Lezvcard/io/json/JCardValue;
    iget-object v0, p0, Lezvcard/io/json/JCardWriter;->targetVersion:Lezvcard/VCardVersion;

    invoke-virtual {v8, v9, v0, p1}, Lezvcard/io/scribe/VCardPropertyScribe;->prepareParameters(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;Lezvcard/VCard;)Lezvcard/parameter/VCardParameters;

    move-result-object v3

    .line 195
    .local v3, "subTypes":Lezvcard/parameter/VCardParameters;
    iget-object v0, p0, Lezvcard/io/json/JCardWriter;->writer:Lezvcard/io/json/JCardRawWriter;

    invoke-virtual {v9}, Lezvcard/property/VCardProperty;->getGroup()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lezvcard/io/json/JCardWriter;->targetVersion:Lezvcard/VCardVersion;

    invoke-virtual {v8, v9, v4}, Lezvcard/io/scribe/VCardPropertyScribe;->dataType(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v4

    invoke-virtual/range {v0 .. v5}, Lezvcard/io/json/JCardRawWriter;->writeProperty(Ljava/lang/String;Ljava/lang/String;Lezvcard/parameter/VCardParameters;Lezvcard/VCardDataType;Lezvcard/io/json/JCardValue;)V
    :try_end_0
    .catch Lezvcard/io/SkipMeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lezvcard/io/EmbeddedVCardException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_2

    .line 196
    .end local v3    # "subTypes":Lezvcard/parameter/VCardParameters;
    .end local v5    # "value":Lezvcard/io/json/JCardValue;
    :catch_0
    move-exception v0

    goto :goto_2

    .line 180
    .end local v8    # "scribe":Lezvcard/io/scribe/VCardPropertyScribe;
    .end local v9    # "type":Lezvcard/property/VCardProperty;
    :cond_6
    new-instance v7, Lezvcard/property/ProductId;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ezvcard "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lezvcard/Ezvcard;->VERSION:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Lezvcard/property/ProductId;-><init>(Ljava/lang/String;)V

    .restart local v7    # "property":Lezvcard/property/VCardProperty;
    goto :goto_1

    .line 203
    .end local v7    # "property":Lezvcard/property/VCardProperty;
    :cond_7
    iget-object v0, p0, Lezvcard/io/json/JCardWriter;->writer:Lezvcard/io/json/JCardRawWriter;

    invoke-virtual {v0}, Lezvcard/io/json/JCardRawWriter;->writeEndVCard()V

    .line 204
    return-void

    .line 198
    .restart local v8    # "scribe":Lezvcard/io/scribe/VCardPropertyScribe;
    .restart local v9    # "type":Lezvcard/property/VCardProperty;
    :catch_1
    move-exception v0

    goto :goto_2
.end method
