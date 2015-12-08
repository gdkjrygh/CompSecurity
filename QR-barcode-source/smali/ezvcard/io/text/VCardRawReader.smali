.class public Lezvcard/io/text/VCardRawReader;
.super Ljava/lang/Object;
.source "VCardRawReader.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/io/text/VCardRawReader$StopReadingException;,
        Lezvcard/io/text/VCardRawReader$VCardDataStreamListener;
    }
.end annotation


# instance fields
.field private caretDecodingEnabled:Z

.field private eof:Z

.field private final reader:Lezvcard/io/text/FoldedLineReader;

.field private version:Lezvcard/VCardVersion;


# direct methods
.method public constructor <init>(Ljava/io/Reader;)V
    .locals 1
    .param p1, "reader"    # Ljava/io/Reader;

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    const/4 v0, 0x1

    iput-boolean v0, p0, Lezvcard/io/text/VCardRawReader;->caretDecodingEnabled:Z

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lezvcard/io/text/VCardRawReader;->eof:Z

    .line 51
    sget-object v0, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    iput-object v0, p0, Lezvcard/io/text/VCardRawReader;->version:Lezvcard/VCardVersion;

    .line 58
    new-instance v0, Lezvcard/io/text/FoldedLineReader;

    invoke-direct {v0, p1}, Lezvcard/io/text/FoldedLineReader;-><init>(Ljava/io/Reader;)V

    iput-object v0, p0, Lezvcard/io/text/VCardRawReader;->reader:Lezvcard/io/text/FoldedLineReader;

    .line 59
    return-void
.end method

.method private parseLine(Ljava/lang/String;Lezvcard/io/text/VCardRawReader$VCardDataStreamListener;)V
    .locals 17
    .param p1, "line"    # Ljava/lang/String;
    .param p2, "listener"    # Lezvcard/io/text/VCardRawReader$VCardDataStreamListener;

    .prologue
    .line 87
    const/4 v6, 0x0

    .line 88
    .local v6, "group":Ljava/lang/String;
    const/4 v12, 0x0

    .line 89
    .local v12, "propertyName":Ljava/lang/String;
    new-instance v11, Lezvcard/parameter/VCardParameters;

    invoke-direct {v11}, Lezvcard/parameter/VCardParameters;-><init>()V

    .line 90
    .local v11, "parameters":Lezvcard/parameter/VCardParameters;
    const/4 v13, 0x0

    .line 92
    .local v13, "value":Ljava/lang/String;
    const/4 v5, 0x0

    .line 93
    .local v5, "escapeChar":C
    const/4 v8, 0x0

    .line 94
    .local v8, "inQuotes":Z
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .local v2, "buffer":Ljava/lang/StringBuilder;
    const/4 v4, 0x0

    .line 96
    .local v4, "curParamName":Ljava/lang/String;
    const/4 v7, 0x0

    .local v7, "i":I
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v15

    if-ge v7, v15, :cond_10

    .line 97
    move-object/from16 v0, p1

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 98
    .local v3, "ch":C
    if-eqz v5, :cond_b

    .line 99
    const/16 v15, 0x5c

    if-ne v5, v15, :cond_7

    .line 100
    const/16 v15, 0x5c

    if-ne v3, v15, :cond_2

    .line 101
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 128
    :cond_0
    :goto_1
    const/4 v5, 0x0

    .line 96
    :cond_1
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 102
    :cond_2
    const/16 v15, 0x6e

    if-eq v3, v15, :cond_3

    const/16 v15, 0x4e

    if-ne v3, v15, :cond_4

    .line 104
    :cond_3
    sget-object v15, Lezvcard/util/StringUtils;->NEWLINE:Ljava/lang/String;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 105
    :cond_4
    const/16 v15, 0x22

    if-ne v3, v15, :cond_5

    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardRawReader;->version:Lezvcard/VCardVersion;

    sget-object v16, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    move-object/from16 v0, v16

    if-eq v15, v0, :cond_5

    .line 107
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 108
    :cond_5
    const/16 v15, 0x3b

    if-ne v3, v15, :cond_6

    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardRawReader;->version:Lezvcard/VCardVersion;

    sget-object v16, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    move-object/from16 v0, v16

    if-ne v15, v0, :cond_6

    .line 111
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 114
    :cond_6
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 116
    :cond_7
    const/16 v15, 0x5e

    if-ne v5, v15, :cond_0

    .line 117
    const/16 v15, 0x5e

    if-ne v3, v15, :cond_8

    .line 118
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 119
    :cond_8
    const/16 v15, 0x6e

    if-ne v3, v15, :cond_9

    .line 120
    sget-object v15, Lezvcard/util/StringUtils;->NEWLINE:Ljava/lang/String;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 121
    :cond_9
    const/16 v15, 0x27

    if-ne v3, v15, :cond_a

    .line 122
    const/16 v15, 0x22

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 125
    :cond_a
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 129
    :cond_b
    const/16 v15, 0x5c

    if-eq v3, v15, :cond_c

    const/16 v15, 0x5e

    if-ne v3, v15, :cond_d

    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardRawReader;->version:Lezvcard/VCardVersion;

    sget-object v16, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    move-object/from16 v0, v16

    if-eq v15, v0, :cond_d

    move-object/from16 v0, p0

    iget-boolean v15, v0, Lezvcard/io/text/VCardRawReader;->caretDecodingEnabled:Z

    if-eqz v15, :cond_d

    .line 130
    :cond_c
    move v5, v3

    goto :goto_2

    .line 131
    :cond_d
    const/16 v15, 0x2e

    if-ne v3, v15, :cond_e

    if-nez v6, :cond_e

    if-nez v12, :cond_e

    .line 132
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 133
    const/4 v15, 0x0

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    goto/16 :goto_2

    .line 134
    :cond_e
    const/16 v15, 0x3b

    if-eq v3, v15, :cond_f

    const/16 v15, 0x3a

    if-ne v3, v15, :cond_15

    :cond_f
    if-nez v8, :cond_15

    .line 135
    if-nez v12, :cond_12

    .line 136
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 147
    :goto_3
    const/4 v15, 0x0

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 149
    const/16 v15, 0x3a

    if-ne v3, v15, :cond_1

    .line 150
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v15

    add-int/lit8 v15, v15, -0x1

    if-ge v7, v15, :cond_14

    .line 151
    add-int/lit8 v15, v7, 0x1

    move-object/from16 v0, p1

    invoke-virtual {v0, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v13

    .line 178
    .end local v3    # "ch":C
    :cond_10
    :goto_4
    if-eqz v12, :cond_11

    if-nez v13, :cond_1b

    .line 179
    :cond_11
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    invoke-interface {v0, v1}, Lezvcard/io/text/VCardRawReader$VCardDataStreamListener;->invalidLine(Ljava/lang/String;)V

    .line 201
    :goto_5
    return-void

    .line 139
    .restart local v3    # "ch":C
    :cond_12
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 140
    .local v10, "paramValue":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardRawReader;->version:Lezvcard/VCardVersion;

    sget-object v16, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    move-object/from16 v0, v16

    if-ne v15, v0, :cond_13

    .line 142
    invoke-static {v10}, Lezvcard/util/StringUtils;->ltrim(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 144
    :cond_13
    invoke-virtual {v11, v4, v10}, Lezvcard/parameter/VCardParameters;->put(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 145
    const/4 v4, 0x0

    goto :goto_3

    .line 153
    .end local v10    # "paramValue":Ljava/lang/String;
    :cond_14
    const-string v13, ""

    .line 155
    goto :goto_4

    .line 157
    :cond_15
    const/16 v15, 0x2c

    if-ne v3, v15, :cond_16

    if-nez v8, :cond_16

    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardRawReader;->version:Lezvcard/VCardVersion;

    sget-object v16, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    move-object/from16 v0, v16

    if-eq v15, v0, :cond_16

    .line 159
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v11, v4, v15}, Lezvcard/parameter/VCardParameters;->put(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 160
    const/4 v15, 0x0

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    goto/16 :goto_2

    .line 161
    :cond_16
    const/16 v15, 0x3d

    if-ne v3, v15, :cond_18

    if-nez v4, :cond_18

    .line 163
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 164
    .local v9, "paramName":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardRawReader;->version:Lezvcard/VCardVersion;

    sget-object v16, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    move-object/from16 v0, v16

    if-ne v15, v0, :cond_17

    .line 166
    invoke-static {v9}, Lezvcard/util/StringUtils;->rtrim(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 168
    :cond_17
    move-object v4, v9

    .line 169
    const/4 v15, 0x0

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->setLength(I)V

    goto/16 :goto_2

    .line 170
    .end local v9    # "paramName":Ljava/lang/String;
    :cond_18
    const/16 v15, 0x22

    if-ne v3, v15, :cond_1a

    move-object/from16 v0, p0

    iget-object v15, v0, Lezvcard/io/text/VCardRawReader;->version:Lezvcard/VCardVersion;

    sget-object v16, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    move-object/from16 v0, v16

    if-eq v15, v0, :cond_1a

    .line 172
    if-nez v8, :cond_19

    const/4 v8, 0x1

    :goto_6
    goto/16 :goto_2

    :cond_19
    const/4 v8, 0x0

    goto :goto_6

    .line 174
    :cond_1a
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_2

    .line 182
    .end local v3    # "ch":C
    :cond_1b
    const-string v15, "VERSION"

    invoke-virtual {v15, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_1d

    .line 183
    invoke-virtual {v13}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lezvcard/VCardVersion;->valueOfByStr(Ljava/lang/String;)Lezvcard/VCardVersion;

    move-result-object v14

    .line 184
    .local v14, "version":Lezvcard/VCardVersion;
    if-nez v14, :cond_1c

    .line 185
    move-object/from16 v0, p2

    invoke-interface {v0, v13}, Lezvcard/io/text/VCardRawReader$VCardDataStreamListener;->invalidVersion(Ljava/lang/String;)V

    goto/16 :goto_5

    .line 187
    :cond_1c
    move-object/from16 v0, p0

    iput-object v14, v0, Lezvcard/io/text/VCardRawReader;->version:Lezvcard/VCardVersion;

    .line 188
    move-object/from16 v0, p2

    invoke-interface {v0, v14}, Lezvcard/io/text/VCardRawReader$VCardDataStreamListener;->readVersion(Lezvcard/VCardVersion;)V

    goto/16 :goto_5

    .line 192
    .end local v14    # "version":Lezvcard/VCardVersion;
    :cond_1d
    const-string v15, "BEGIN"

    invoke-virtual {v15, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_1e

    .line 193
    invoke-virtual {v13}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v0, p2

    invoke-interface {v0, v15}, Lezvcard/io/text/VCardRawReader$VCardDataStreamListener;->beginComponent(Ljava/lang/String;)V

    goto/16 :goto_5

    .line 196
    :cond_1e
    const-string v15, "END"

    invoke-virtual {v15, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_1f

    .line 197
    invoke-virtual {v13}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v0, p2

    invoke-interface {v0, v15}, Lezvcard/io/text/VCardRawReader$VCardDataStreamListener;->endComponent(Ljava/lang/String;)V

    goto/16 :goto_5

    .line 200
    :cond_1f
    move-object/from16 v0, p2

    invoke-interface {v0, v6, v12, v11, v13}, Lezvcard/io/text/VCardRawReader$VCardDataStreamListener;->readProperty(Ljava/lang/String;Ljava/lang/String;Lezvcard/parameter/VCardParameters;Ljava/lang/String;)V

    goto/16 :goto_5
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
    .line 368
    iget-object v0, p0, Lezvcard/io/text/VCardRawReader;->reader:Lezvcard/io/text/FoldedLineReader;

    invoke-virtual {v0}, Lezvcard/io/text/FoldedLineReader;->close()V

    .line 369
    return-void
.end method

.method public eof()Z
    .locals 1

    .prologue
    .line 292
    iget-boolean v0, p0, Lezvcard/io/text/VCardRawReader;->eof:Z

    return v0
.end method

.method public getLineNum()I
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lezvcard/io/text/VCardRawReader;->reader:Lezvcard/io/text/FoldedLineReader;

    invoke-virtual {v0}, Lezvcard/io/text/FoldedLineReader;->getLineNum()I

    move-result v0

    return v0
.end method

.method public isCaretDecodingEnabled()Z
    .locals 1

    .prologue
    .line 242
    iget-boolean v0, p0, Lezvcard/io/text/VCardRawReader;->caretDecodingEnabled:Z

    return v0
.end method

.method public setCaretDecodingEnabled(Z)V
    .locals 0
    .param p1, "enable"    # Z

    .prologue
    .line 284
    iput-boolean p1, p0, Lezvcard/io/text/VCardRawReader;->caretDecodingEnabled:Z

    .line 285
    return-void
.end method

.method public start(Lezvcard/io/text/VCardRawReader$VCardDataStreamListener;)V
    .locals 3
    .param p1, "listener"    # Lezvcard/io/text/VCardRawReader$VCardDataStreamListener;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 76
    :goto_0
    iget-object v2, p0, Lezvcard/io/text/VCardRawReader;->reader:Lezvcard/io/text/FoldedLineReader;

    invoke-virtual {v2}, Lezvcard/io/text/FoldedLineReader;->readLine()Ljava/lang/String;

    move-result-object v1

    .local v1, "line":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 78
    :try_start_0
    invoke-direct {p0, v1, p1}, Lezvcard/io/text/VCardRawReader;->parseLine(Ljava/lang/String;Lezvcard/io/text/VCardRawReader$VCardDataStreamListener;)V
    :try_end_0
    .catch Lezvcard/io/text/VCardRawReader$StopReadingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 79
    :catch_0
    move-exception v0

    .line 84
    :goto_1
    return-void

    .line 83
    :cond_0
    const/4 v2, 0x1

    iput-boolean v2, p0, Lezvcard/io/text/VCardRawReader;->eof:Z

    goto :goto_1
.end method
