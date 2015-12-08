.class public Lezvcard/io/text/VCardWriter;
.super Ljava/lang/Object;
.source "VCardWriter.java"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# instance fields
.field private addProdId:Z

.field private index:Lezvcard/io/scribe/ScribeIndex;

.field private versionStrict:Z

.field private final writer:Lezvcard/io/text/VCardRawWriter;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 2
    .param p1, "file"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 129
    new-instance v0, Ljava/io/FileWriter;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V

    invoke-direct {p0, v0}, Lezvcard/io/text/VCardWriter;-><init>(Ljava/io/Writer;)V

    .line 130
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Z)V
    .locals 1
    .param p1, "file"    # Ljava/io/File;
    .param p2, "append"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 141
    new-instance v0, Ljava/io/FileWriter;

    invoke-direct {v0, p1, p2}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V

    invoke-direct {p0, v0}, Lezvcard/io/text/VCardWriter;-><init>(Ljava/io/Writer;)V

    .line 142
    return-void
.end method

.method public constructor <init>(Ljava/io/File;ZLezvcard/VCardVersion;)V
    .locals 1
    .param p1, "file"    # Ljava/io/File;
    .param p2, "append"    # Z
    .param p3, "targetVersion"    # Lezvcard/VCardVersion;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 155
    sget-object v0, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    if-ne p3, v0, :cond_0

    invoke-static {p1, p2}, Lezvcard/util/IOUtils;->utf8Writer(Ljava/io/File;Z)Ljava/io/Writer;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0, p3}, Lezvcard/io/text/VCardWriter;-><init>(Ljava/io/Writer;Lezvcard/VCardVersion;)V

    .line 156
    return-void

    .line 155
    :cond_0
    new-instance v0, Ljava/io/FileWriter;

    invoke-direct {v0, p1, p2}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V

    goto :goto_0
.end method

.method public constructor <init>(Ljava/io/File;ZLezvcard/VCardVersion;Lezvcard/io/text/FoldingScheme;Ljava/lang/String;)V
    .locals 1
    .param p1, "file"    # Ljava/io/File;
    .param p2, "append"    # Z
    .param p3, "targetVersion"    # Lezvcard/VCardVersion;
    .param p4, "foldingScheme"    # Lezvcard/io/text/FoldingScheme;
    .param p5, "newline"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 170
    sget-object v0, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    if-ne p3, v0, :cond_0

    invoke-static {p1, p2}, Lezvcard/util/IOUtils;->utf8Writer(Ljava/io/File;Z)Ljava/io/Writer;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0, p3, p4, p5}, Lezvcard/io/text/VCardWriter;-><init>(Ljava/io/Writer;Lezvcard/VCardVersion;Lezvcard/io/text/FoldingScheme;Ljava/lang/String;)V

    .line 171
    return-void

    .line 170
    :cond_0
    new-instance v0, Ljava/io/FileWriter;

    invoke-direct {v0, p1, p2}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V

    goto :goto_0
.end method

.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 1
    .param p1, "out"    # Ljava/io/OutputStream;

    .prologue
    .line 96
    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-direct {v0, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {p0, v0}, Lezvcard/io/text/VCardWriter;-><init>(Ljava/io/Writer;)V

    .line 97
    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Lezvcard/VCardVersion;)V
    .locals 1
    .param p1, "out"    # Ljava/io/OutputStream;
    .param p2, "targetVersion"    # Lezvcard/VCardVersion;

    .prologue
    .line 107
    sget-object v0, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    if-ne p2, v0, :cond_0

    invoke-static {p1}, Lezvcard/util/IOUtils;->utf8Writer(Ljava/io/OutputStream;)Ljava/io/Writer;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0, p2}, Lezvcard/io/text/VCardWriter;-><init>(Ljava/io/Writer;Lezvcard/VCardVersion;)V

    .line 108
    return-void

    .line 107
    :cond_0
    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-direct {v0, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    goto :goto_0
.end method

.method public constructor <init>(Ljava/io/OutputStream;Lezvcard/VCardVersion;Lezvcard/io/text/FoldingScheme;Ljava/lang/String;)V
    .locals 1
    .param p1, "out"    # Ljava/io/OutputStream;
    .param p2, "targetVersion"    # Lezvcard/VCardVersion;
    .param p3, "foldingScheme"    # Lezvcard/io/text/FoldingScheme;
    .param p4, "newline"    # Ljava/lang/String;

    .prologue
    .line 119
    sget-object v0, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    if-ne p2, v0, :cond_0

    invoke-static {p1}, Lezvcard/util/IOUtils;->utf8Writer(Ljava/io/OutputStream;)Ljava/io/Writer;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0, p2, p3, p4}, Lezvcard/io/text/VCardWriter;-><init>(Ljava/io/Writer;Lezvcard/VCardVersion;Lezvcard/io/text/FoldingScheme;Ljava/lang/String;)V

    .line 120
    return-void

    .line 119
    :cond_0
    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-direct {v0, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    goto :goto_0
.end method

.method public constructor <init>(Ljava/io/Writer;)V
    .locals 1
    .param p1, "writer"    # Ljava/io/Writer;

    .prologue
    .line 179
    sget-object v0, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    invoke-direct {p0, p1, v0}, Lezvcard/io/text/VCardWriter;-><init>(Ljava/io/Writer;Lezvcard/VCardVersion;)V

    .line 180
    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;Lezvcard/VCardVersion;)V
    .locals 2
    .param p1, "writer"    # Ljava/io/Writer;
    .param p2, "targetVersion"    # Lezvcard/VCardVersion;

    .prologue
    .line 189
    sget-object v0, Lezvcard/io/text/FoldingScheme;->MIME_DIR:Lezvcard/io/text/FoldingScheme;

    const-string v1, "\r\n"

    invoke-direct {p0, p1, p2, v0, v1}, Lezvcard/io/text/VCardWriter;-><init>(Ljava/io/Writer;Lezvcard/VCardVersion;Lezvcard/io/text/FoldingScheme;Ljava/lang/String;)V

    .line 190
    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;Lezvcard/VCardVersion;Lezvcard/io/text/FoldingScheme;Ljava/lang/String;)V
    .locals 2
    .param p1, "writer"    # Ljava/io/Writer;
    .param p2, "targetVersion"    # Lezvcard/VCardVersion;
    .param p3, "foldingScheme"    # Lezvcard/io/text/FoldingScheme;
    .param p4, "newline"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x1

    .line 199
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    new-instance v0, Lezvcard/io/scribe/ScribeIndex;

    invoke-direct {v0}, Lezvcard/io/scribe/ScribeIndex;-><init>()V

    iput-object v0, p0, Lezvcard/io/text/VCardWriter;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 86
    iput-boolean v1, p0, Lezvcard/io/text/VCardWriter;->addProdId:Z

    .line 87
    iput-boolean v1, p0, Lezvcard/io/text/VCardWriter;->versionStrict:Z

    .line 200
    new-instance v0, Lezvcard/io/text/VCardRawWriter;

    invoke-direct {v0, p1, p2, p3, p4}, Lezvcard/io/text/VCardRawWriter;-><init>(Ljava/io/Writer;Lezvcard/VCardVersion;Lezvcard/io/text/FoldingScheme;Ljava/lang/String;)V

    iput-object v0, p0, Lezvcard/io/text/VCardWriter;->writer:Lezvcard/io/text/VCardRawWriter;

    .line 201
    return-void
.end method

.method private write(Lezvcard/VCard;Z)V
    .locals 27
    .param p1, "vcard"    # Lezvcard/VCard;
    .param p2, "addProdId"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 359
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/text/VCardWriter;->writer:Lezvcard/io/text/VCardRawWriter;

    move-object/from16 v24, v0

    invoke-virtual/range {v24 .. v24}, Lezvcard/io/text/VCardRawWriter;->getVersion()Lezvcard/VCardVersion;

    move-result-object v19

    .line 361
    .local v19, "targetVersion":Lezvcard/VCardVersion;
    new-instance v21, Ljava/util/ArrayList;

    invoke-direct/range {v21 .. v21}, Ljava/util/ArrayList;-><init>()V

    .line 362
    .local v21, "typesToAdd":Ljava/util/List;, "Ljava/util/List<Lezvcard/property/VCardProperty;>;"
    invoke-virtual/range {p1 .. p1}, Lezvcard/VCard;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_0
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v24

    if-eqz v24, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lezvcard/property/VCardProperty;

    .line 363
    .local v20, "type":Lezvcard/property/VCardProperty;
    if-eqz p2, :cond_1

    move-object/from16 v0, v20

    instance-of v0, v0, Lezvcard/property/ProductId;

    move/from16 v24, v0

    if-nez v24, :cond_0

    .line 368
    :cond_1
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lezvcard/io/text/VCardWriter;->versionStrict:Z

    move/from16 v24, v0

    if-eqz v24, :cond_2

    invoke-virtual/range {v20 .. v20}, Lezvcard/property/VCardProperty;->getSupportedVersions()Ljava/util/Set;

    move-result-object v24

    move-object/from16 v0, v24

    move-object/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_0

    .line 374
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/text/VCardWriter;->index:Lezvcard/io/scribe/ScribeIndex;

    move-object/from16 v24, v0

    move-object/from16 v0, v24

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Lezvcard/property/VCardProperty;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v24

    if-nez v24, :cond_3

    .line 375
    new-instance v24, Ljava/lang/IllegalArgumentException;

    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    const-string v26, "No scribe found for property class \""

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const-string v26, "\"."

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-direct/range {v24 .. v25}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v24

    .line 378
    :cond_3
    move-object/from16 v0, v21

    move-object/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 381
    move-object/from16 v0, v20

    instance-of v0, v0, Lezvcard/property/Address;

    move/from16 v24, v0

    if-eqz v24, :cond_0

    sget-object v24, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    move-object/from16 v0, v19

    move-object/from16 v1, v24

    if-eq v0, v1, :cond_4

    sget-object v24, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    move-object/from16 v0, v19

    move-object/from16 v1, v24

    if-ne v0, v1, :cond_0

    :cond_4
    move-object/from16 v4, v20

    .line 382
    check-cast v4, Lezvcard/property/Address;

    .line 383
    .local v4, "adr":Lezvcard/property/Address;
    invoke-virtual {v4}, Lezvcard/property/Address;->getLabel()Ljava/lang/String;

    move-result-object v12

    .line 384
    .local v12, "labelStr":Ljava/lang/String;
    if-eqz v12, :cond_0

    .line 385
    new-instance v11, Lezvcard/property/Label;

    invoke-direct {v11, v12}, Lezvcard/property/Label;-><init>(Ljava/lang/String;)V

    .line 386
    .local v11, "label":Lezvcard/property/Label;
    invoke-virtual {v4}, Lezvcard/property/Address;->getTypes()Ljava/util/Set;

    move-result-object v24

    invoke-interface/range {v24 .. v24}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    .local v10, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v24

    if-eqz v24, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lezvcard/parameter/AddressType;

    .line 387
    .local v18, "t":Lezvcard/parameter/AddressType;
    move-object/from16 v0, v18

    invoke-virtual {v11, v0}, Lezvcard/property/Label;->addType(Lezvcard/parameter/AddressType;)V

    goto :goto_1

    .line 389
    .end local v18    # "t":Lezvcard/parameter/AddressType;
    :cond_5
    move-object/from16 v0, v21

    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 395
    .end local v4    # "adr":Lezvcard/property/Address;
    .end local v10    # "i$":Ljava/util/Iterator;
    .end local v11    # "label":Lezvcard/property/Label;
    .end local v12    # "labelStr":Ljava/lang/String;
    .end local v20    # "type":Lezvcard/property/VCardProperty;
    :cond_6
    if-eqz p2, :cond_7

    .line 397
    sget-object v24, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    move-object/from16 v0, v19

    move-object/from16 v1, v24

    if-ne v0, v1, :cond_9

    .line 398
    new-instance v15, Lezvcard/property/RawProperty;

    const-string v24, "X-PRODID"

    new-instance v25, Ljava/lang/StringBuilder;

    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    const-string v26, "ezvcard "

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    sget-object v26, Lezvcard/Ezvcard;->VERSION:Ljava/lang/String;

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    move-object/from16 v0, v24

    move-object/from16 v1, v25

    invoke-direct {v15, v0, v1}, Lezvcard/property/RawProperty;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 402
    .local v15, "property":Lezvcard/property/VCardProperty;
    :goto_2
    move-object/from16 v0, v21

    invoke-interface {v0, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 405
    .end local v15    # "property":Lezvcard/property/VCardProperty;
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/text/VCardWriter;->writer:Lezvcard/io/text/VCardRawWriter;

    move-object/from16 v24, v0

    const-string v25, "VCARD"

    invoke-virtual/range {v24 .. v25}, Lezvcard/io/text/VCardRawWriter;->writeBeginComponent(Ljava/lang/String;)V

    .line 406
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/text/VCardWriter;->writer:Lezvcard/io/text/VCardRawWriter;

    move-object/from16 v24, v0

    invoke-virtual/range {v24 .. v24}, Lezvcard/io/text/VCardRawWriter;->writeVersion()V

    .line 408
    invoke-interface/range {v21 .. v21}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    .local v9, "i$":Ljava/util/Iterator;
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v24

    if-eqz v24, :cond_d

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lezvcard/property/VCardProperty;

    .line 409
    .restart local v20    # "type":Lezvcard/property/VCardProperty;
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/text/VCardWriter;->index:Lezvcard/io/scribe/ScribeIndex;

    move-object/from16 v24, v0

    move-object/from16 v0, v24

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Lezvcard/property/VCardProperty;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v16

    .line 412
    .local v16, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;
    const/16 v23, 0x0

    .line 413
    .local v23, "value":Ljava/lang/String;
    const/4 v13, 0x0

    .line 415
    .local v13, "nestedVCard":Lezvcard/VCard;
    :try_start_0
    move-object/from16 v0, v16

    move-object/from16 v1, v20

    move-object/from16 v2, v19

    invoke-virtual {v0, v1, v2}, Lezvcard/io/scribe/VCardPropertyScribe;->writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    :try_end_0
    .catch Lezvcard/io/SkipMeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lezvcard/io/EmbeddedVCardException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v23

    .line 423
    :goto_4
    move-object/from16 v0, v16

    move-object/from16 v1, v20

    move-object/from16 v2, v19

    move-object/from16 v3, p1

    invoke-virtual {v0, v1, v2, v3}, Lezvcard/io/scribe/VCardPropertyScribe;->prepareParameters(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;Lezvcard/VCard;)Lezvcard/parameter/VCardParameters;

    move-result-object v14

    .line 425
    .local v14, "parameters":Lezvcard/parameter/VCardParameters;
    if-nez v13, :cond_b

    .line 428
    move-object/from16 v0, v16

    move-object/from16 v1, v20

    move-object/from16 v2, v19

    invoke-virtual {v0, v1, v2}, Lezvcard/io/scribe/VCardPropertyScribe;->dataType(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v6

    .line 429
    .local v6, "dataType":Lezvcard/VCardDataType;
    if-eqz v6, :cond_8

    .line 430
    move-object/from16 v0, v16

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe;->defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;

    move-result-object v7

    .line 431
    .local v7, "defaultDataType":Lezvcard/VCardDataType;
    if-eq v6, v7, :cond_8

    .line 432
    sget-object v24, Lezvcard/VCardDataType;->DATE_AND_OR_TIME:Lezvcard/VCardDataType;

    move-object/from16 v0, v24

    if-ne v7, v0, :cond_a

    sget-object v24, Lezvcard/VCardDataType;->DATE:Lezvcard/VCardDataType;

    move-object/from16 v0, v24

    if-eq v6, v0, :cond_8

    sget-object v24, Lezvcard/VCardDataType;->DATE_TIME:Lezvcard/VCardDataType;

    move-object/from16 v0, v24

    if-eq v6, v0, :cond_8

    sget-object v24, Lezvcard/VCardDataType;->TIME:Lezvcard/VCardDataType;

    move-object/from16 v0, v24

    if-ne v6, v0, :cond_a

    .line 440
    .end local v7    # "defaultDataType":Lezvcard/VCardDataType;
    :cond_8
    :goto_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/text/VCardWriter;->writer:Lezvcard/io/text/VCardRawWriter;

    move-object/from16 v24, v0

    invoke-virtual/range {v20 .. v20}, Lezvcard/property/VCardProperty;->getGroup()Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v16 .. v16}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, v24

    move-object/from16 v1, v25

    move-object/from16 v2, v26

    move-object/from16 v3, v23

    invoke-virtual {v0, v1, v2, v14, v3}, Lezvcard/io/text/VCardRawWriter;->writeProperty(Ljava/lang/String;Ljava/lang/String;Lezvcard/parameter/VCardParameters;Ljava/lang/String;)V

    goto :goto_3

    .line 400
    .end local v6    # "dataType":Lezvcard/VCardDataType;
    .end local v9    # "i$":Ljava/util/Iterator;
    .end local v13    # "nestedVCard":Lezvcard/VCard;
    .end local v14    # "parameters":Lezvcard/parameter/VCardParameters;
    .end local v16    # "scribe":Lezvcard/io/scribe/VCardPropertyScribe;
    .end local v20    # "type":Lezvcard/property/VCardProperty;
    .end local v23    # "value":Ljava/lang/String;
    :cond_9
    new-instance v15, Lezvcard/property/ProductId;

    new-instance v24, Ljava/lang/StringBuilder;

    invoke-direct/range {v24 .. v24}, Ljava/lang/StringBuilder;-><init>()V

    const-string v25, "ezvcard "

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    sget-object v25, Lezvcard/Ezvcard;->VERSION:Ljava/lang/String;

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    move-object/from16 v0, v24

    invoke-direct {v15, v0}, Lezvcard/property/ProductId;-><init>(Ljava/lang/String;)V

    .restart local v15    # "property":Lezvcard/property/VCardProperty;
    goto/16 :goto_2

    .line 416
    .end local v15    # "property":Lezvcard/property/VCardProperty;
    .restart local v9    # "i$":Ljava/util/Iterator;
    .restart local v13    # "nestedVCard":Lezvcard/VCard;
    .restart local v16    # "scribe":Lezvcard/io/scribe/VCardPropertyScribe;
    .restart local v20    # "type":Lezvcard/property/VCardProperty;
    .restart local v23    # "value":Ljava/lang/String;
    :catch_0
    move-exception v8

    .line 417
    .local v8, "e":Lezvcard/io/SkipMeException;
    goto/16 :goto_3

    .line 418
    .end local v8    # "e":Lezvcard/io/SkipMeException;
    :catch_1
    move-exception v8

    .line 419
    .local v8, "e":Lezvcard/io/EmbeddedVCardException;
    invoke-virtual {v8}, Lezvcard/io/EmbeddedVCardException;->getVCard()Lezvcard/VCard;

    move-result-object v13

    goto :goto_4

    .line 435
    .end local v8    # "e":Lezvcard/io/EmbeddedVCardException;
    .restart local v6    # "dataType":Lezvcard/VCardDataType;
    .restart local v7    # "defaultDataType":Lezvcard/VCardDataType;
    .restart local v14    # "parameters":Lezvcard/parameter/VCardParameters;
    :cond_a
    invoke-virtual {v14, v6}, Lezvcard/parameter/VCardParameters;->setValue(Lezvcard/VCardDataType;)V

    goto :goto_5

    .line 442
    .end local v6    # "dataType":Lezvcard/VCardDataType;
    .end local v7    # "defaultDataType":Lezvcard/VCardDataType;
    :cond_b
    sget-object v24, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    move-object/from16 v0, v19

    move-object/from16 v1, v24

    if-ne v0, v1, :cond_c

    .line 444
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/text/VCardWriter;->writer:Lezvcard/io/text/VCardRawWriter;

    move-object/from16 v24, v0

    invoke-virtual/range {v20 .. v20}, Lezvcard/property/VCardProperty;->getGroup()Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v16 .. v16}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, v24

    move-object/from16 v1, v25

    move-object/from16 v2, v26

    move-object/from16 v3, v23

    invoke-virtual {v0, v1, v2, v14, v3}, Lezvcard/io/text/VCardRawWriter;->writeProperty(Ljava/lang/String;Ljava/lang/String;Lezvcard/parameter/VCardParameters;Ljava/lang/String;)V

    .line 445
    const/16 v24, 0x0

    move-object/from16 v0, p0

    move/from16 v1, v24

    invoke-direct {v0, v13, v1}, Lezvcard/io/text/VCardWriter;->write(Lezvcard/VCard;Z)V

    goto/16 :goto_3

    .line 448
    :cond_c
    new-instance v17, Ljava/io/StringWriter;

    invoke-direct/range {v17 .. v17}, Ljava/io/StringWriter;-><init>()V

    .line 449
    .local v17, "sw":Ljava/io/StringWriter;
    new-instance v5, Lezvcard/io/text/VCardWriter;

    const/16 v24, 0x0

    const-string v25, "\n"

    move-object/from16 v0, v17

    move-object/from16 v1, v19

    move-object/from16 v2, v24

    move-object/from16 v3, v25

    invoke-direct {v5, v0, v1, v2, v3}, Lezvcard/io/text/VCardWriter;-><init>(Ljava/io/Writer;Lezvcard/VCardVersion;Lezvcard/io/text/FoldingScheme;Ljava/lang/String;)V

    .line 450
    .local v5, "agentWriter":Lezvcard/io/text/VCardWriter;
    const/16 v24, 0x0

    move/from16 v0, v24

    invoke-virtual {v5, v0}, Lezvcard/io/text/VCardWriter;->setAddProdId(Z)V

    .line 451
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lezvcard/io/text/VCardWriter;->versionStrict:Z

    move/from16 v24, v0

    move/from16 v0, v24

    invoke-virtual {v5, v0}, Lezvcard/io/text/VCardWriter;->setVersionStrict(Z)V

    .line 453
    :try_start_1
    invoke-virtual {v5, v13}, Lezvcard/io/text/VCardWriter;->write(Lezvcard/VCard;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 457
    invoke-static {v5}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 460
    :goto_6
    invoke-virtual/range {v17 .. v17}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v22

    .line 461
    .local v22, "vCardStr":Ljava/lang/String;
    invoke-static/range {v22 .. v22}, Lezvcard/io/scribe/VCardPropertyScribe;->escape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    .line 462
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/text/VCardWriter;->writer:Lezvcard/io/text/VCardRawWriter;

    move-object/from16 v24, v0

    invoke-virtual/range {v20 .. v20}, Lezvcard/property/VCardProperty;->getGroup()Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v16 .. v16}, Lezvcard/io/scribe/VCardPropertyScribe;->getPropertyName()Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, v24

    move-object/from16 v1, v25

    move-object/from16 v2, v26

    move-object/from16 v3, v22

    invoke-virtual {v0, v1, v2, v14, v3}, Lezvcard/io/text/VCardRawWriter;->writeProperty(Ljava/lang/String;Ljava/lang/String;Lezvcard/parameter/VCardParameters;Ljava/lang/String;)V

    goto/16 :goto_3

    .line 454
    .end local v22    # "vCardStr":Ljava/lang/String;
    :catch_2
    move-exception v24

    .line 457
    invoke-static {v5}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_6

    :catchall_0
    move-exception v24

    invoke-static {v5}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    throw v24

    .line 467
    .end local v5    # "agentWriter":Lezvcard/io/text/VCardWriter;
    .end local v13    # "nestedVCard":Lezvcard/VCard;
    .end local v14    # "parameters":Lezvcard/parameter/VCardParameters;
    .end local v16    # "scribe":Lezvcard/io/scribe/VCardPropertyScribe;
    .end local v17    # "sw":Ljava/io/StringWriter;
    .end local v20    # "type":Lezvcard/property/VCardProperty;
    .end local v23    # "value":Ljava/lang/String;
    :cond_d
    move-object/from16 v0, p0

    iget-object v0, v0, Lezvcard/io/text/VCardWriter;->writer:Lezvcard/io/text/VCardRawWriter;

    move-object/from16 v24, v0

    const-string v25, "VCARD"

    invoke-virtual/range {v24 .. v25}, Lezvcard/io/text/VCardRawWriter;->writeEndComponent(Ljava/lang/String;)V

    .line 468
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
    .line 483
    iget-object v0, p0, Lezvcard/io/text/VCardWriter;->writer:Lezvcard/io/text/VCardRawWriter;

    invoke-virtual {v0}, Lezvcard/io/text/VCardRawWriter;->close()V

    .line 484
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
    .line 475
    iget-object v0, p0, Lezvcard/io/text/VCardWriter;->writer:Lezvcard/io/text/VCardRawWriter;

    invoke-virtual {v0}, Lezvcard/io/text/VCardRawWriter;->flush()V

    .line 476
    return-void
.end method

.method public getFoldingScheme()Lezvcard/io/text/FoldingScheme;
    .locals 1

    .prologue
    .line 314
    iget-object v0, p0, Lezvcard/io/text/VCardWriter;->writer:Lezvcard/io/text/VCardRawWriter;

    invoke-virtual {v0}, Lezvcard/io/text/VCardRawWriter;->getFoldingScheme()Lezvcard/io/text/FoldingScheme;

    move-result-object v0

    return-object v0
.end method

.method public getNewline()Ljava/lang/String;
    .locals 1

    .prologue
    .line 306
    iget-object v0, p0, Lezvcard/io/text/VCardWriter;->writer:Lezvcard/io/text/VCardRawWriter;

    invoke-virtual {v0}, Lezvcard/io/text/VCardRawWriter;->getNewline()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getScribeIndex()Lezvcard/io/scribe/ScribeIndex;
    .locals 1

    .prologue
    .line 335
    iget-object v0, p0, Lezvcard/io/text/VCardWriter;->index:Lezvcard/io/scribe/ScribeIndex;

    return-object v0
.end method

.method public getTargetVersion()Lezvcard/VCardVersion;
    .locals 1

    .prologue
    .line 208
    iget-object v0, p0, Lezvcard/io/text/VCardWriter;->writer:Lezvcard/io/text/VCardRawWriter;

    invoke-virtual {v0}, Lezvcard/io/text/VCardRawWriter;->getVersion()Lezvcard/VCardVersion;

    move-result-object v0

    return-object v0
.end method

.method public isAddProdId()Z
    .locals 1

    .prologue
    .line 228
    iget-boolean v0, p0, Lezvcard/io/text/VCardWriter;->addProdId:Z

    return v0
.end method

.method public isCaretEncodingEnabled()Z
    .locals 1

    .prologue
    .line 279
    iget-object v0, p0, Lezvcard/io/text/VCardWriter;->writer:Lezvcard/io/text/VCardRawWriter;

    invoke-virtual {v0}, Lezvcard/io/text/VCardRawWriter;->isCaretEncodingEnabled()Z

    move-result v0

    return v0
.end method

.method public isVersionStrict()Z
    .locals 1

    .prologue
    .line 250
    iget-boolean v0, p0, Lezvcard/io/text/VCardWriter;->versionStrict:Z

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
    .line 327
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    iget-object v0, p0, Lezvcard/io/text/VCardWriter;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v0, p1}, Lezvcard/io/scribe/ScribeIndex;->register(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 328
    return-void
.end method

.method public setAddProdId(Z)V
    .locals 0
    .param p1, "addProdId"    # Z

    .prologue
    .line 240
    iput-boolean p1, p0, Lezvcard/io/text/VCardWriter;->addProdId:Z

    .line 241
    return-void
.end method

.method public setCaretEncodingEnabled(Z)V
    .locals 1
    .param p1, "enable"    # Z

    .prologue
    .line 298
    iget-object v0, p0, Lezvcard/io/text/VCardWriter;->writer:Lezvcard/io/text/VCardRawWriter;

    invoke-virtual {v0, p1}, Lezvcard/io/text/VCardRawWriter;->setCaretEncodingEnabled(Z)V

    .line 299
    return-void
.end method

.method public setScribeIndex(Lezvcard/io/scribe/ScribeIndex;)V
    .locals 0
    .param p1, "index"    # Lezvcard/io/scribe/ScribeIndex;

    .prologue
    .line 343
    iput-object p1, p0, Lezvcard/io/text/VCardWriter;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 344
    return-void
.end method

.method public setTargetVersion(Lezvcard/VCardVersion;)V
    .locals 1
    .param p1, "targetVersion"    # Lezvcard/VCardVersion;

    .prologue
    .line 216
    iget-object v0, p0, Lezvcard/io/text/VCardWriter;->writer:Lezvcard/io/text/VCardRawWriter;

    invoke-virtual {v0, p1}, Lezvcard/io/text/VCardRawWriter;->setVersion(Lezvcard/VCardVersion;)V

    .line 217
    return-void
.end method

.method public setVersionStrict(Z)V
    .locals 0
    .param p1, "versionStrict"    # Z

    .prologue
    .line 260
    iput-boolean p1, p0, Lezvcard/io/text/VCardWriter;->versionStrict:Z

    .line 261
    return-void
.end method

.method public write(Lezvcard/VCard;)V
    .locals 1
    .param p1, "vcard"    # Lezvcard/VCard;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 354
    iget-boolean v0, p0, Lezvcard/io/text/VCardWriter;->addProdId:Z

    invoke-direct {p0, p1, v0}, Lezvcard/io/text/VCardWriter;->write(Lezvcard/VCard;Z)V

    .line 355
    return-void
.end method
