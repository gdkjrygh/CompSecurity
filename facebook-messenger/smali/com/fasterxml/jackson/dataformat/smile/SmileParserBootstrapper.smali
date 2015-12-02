.class public Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;
.super Ljava/lang/Object;
.source "SmileParserBootstrapper.java"


# instance fields
.field private final _bufferRecyclable:Z

.field final _context:Lcom/fasterxml/jackson/core/io/IOContext;

.field final _in:Ljava/io/InputStream;

.field final _inputBuffer:[B

.field private _inputEnd:I

.field protected _inputProcessed:I

.field private _inputPtr:I


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/core/io/IOContext;Ljava/io/InputStream;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_context:Lcom/fasterxml/jackson/core/io/IOContext;

    .line 76
    iput-object p2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_in:Ljava/io/InputStream;

    .line 77
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/io/IOContext;->allocReadIOBuffer()[B

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputBuffer:[B

    .line 78
    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputPtr:I

    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputEnd:I

    .line 79
    iput v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputProcessed:I

    .line 80
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_bufferRecyclable:Z

    .line 81
    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/io/IOContext;[BII)V
    .locals 1

    .prologue
    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object p1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_context:Lcom/fasterxml/jackson/core/io/IOContext;

    .line 86
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_in:Ljava/io/InputStream;

    .line 87
    iput-object p2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputBuffer:[B

    .line 88
    iput p3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputPtr:I

    .line 89
    add-int v0, p3, p4

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputEnd:I

    .line 91
    neg-int v0, p3

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputProcessed:I

    .line 92
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_bufferRecyclable:Z

    .line 93
    return-void
.end method

.method public static hasSmileFormat(Lcom/fasterxml/jackson/core/format/InputAccessor;)Lcom/fasterxml/jackson/core/format/MatchStrength;
    .locals 3

    .prologue
    .line 145
    invoke-interface {p0}, Lcom/fasterxml/jackson/core/format/InputAccessor;->hasMoreBytes()Z

    move-result v0

    if-nez v0, :cond_0

    .line 146
    sget-object v0, Lcom/fasterxml/jackson/core/format/MatchStrength;->INCONCLUSIVE:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 197
    :goto_0
    return-object v0

    .line 149
    :cond_0
    invoke-interface {p0}, Lcom/fasterxml/jackson/core/format/InputAccessor;->nextByte()B

    move-result v0

    .line 150
    invoke-interface {p0}, Lcom/fasterxml/jackson/core/format/InputAccessor;->hasMoreBytes()Z

    move-result v1

    if-nez v1, :cond_1

    .line 151
    sget-object v0, Lcom/fasterxml/jackson/core/format/MatchStrength;->INCONCLUSIVE:Lcom/fasterxml/jackson/core/format/MatchStrength;

    goto :goto_0

    .line 153
    :cond_1
    invoke-interface {p0}, Lcom/fasterxml/jackson/core/format/InputAccessor;->nextByte()B

    move-result v1

    .line 156
    const/16 v2, 0x3a

    if-ne v0, v2, :cond_5

    .line 157
    const/16 v0, 0x29

    if-eq v1, v0, :cond_2

    .line 158
    sget-object v0, Lcom/fasterxml/jackson/core/format/MatchStrength;->NO_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    goto :goto_0

    .line 160
    :cond_2
    invoke-interface {p0}, Lcom/fasterxml/jackson/core/format/InputAccessor;->hasMoreBytes()Z

    move-result v0

    if-nez v0, :cond_3

    .line 161
    sget-object v0, Lcom/fasterxml/jackson/core/format/MatchStrength;->INCONCLUSIVE:Lcom/fasterxml/jackson/core/format/MatchStrength;

    goto :goto_0

    .line 163
    :cond_3
    invoke-interface {p0}, Lcom/fasterxml/jackson/core/format/InputAccessor;->nextByte()B

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_4

    sget-object v0, Lcom/fasterxml/jackson/core/format/MatchStrength;->FULL_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    goto :goto_0

    :cond_4
    sget-object v0, Lcom/fasterxml/jackson/core/format/MatchStrength;->NO_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    goto :goto_0

    .line 167
    :cond_5
    const/4 v2, -0x6

    if-ne v0, v2, :cond_8

    .line 171
    const/16 v0, 0x34

    if-ne v1, v0, :cond_6

    .line 172
    sget-object v0, Lcom/fasterxml/jackson/core/format/MatchStrength;->SOLID_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    goto :goto_0

    .line 174
    :cond_6
    and-int/lit16 v0, v1, 0xff

    .line 175
    const/16 v1, 0x80

    if-lt v0, v1, :cond_7

    const/16 v1, 0xf8

    if-ge v0, v1, :cond_7

    .line 176
    sget-object v0, Lcom/fasterxml/jackson/core/format/MatchStrength;->SOLID_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    goto :goto_0

    .line 178
    :cond_7
    sget-object v0, Lcom/fasterxml/jackson/core/format/MatchStrength;->NO_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    goto :goto_0

    .line 181
    :cond_8
    const/4 v2, -0x8

    if-ne v0, v2, :cond_c

    .line 182
    invoke-interface {p0}, Lcom/fasterxml/jackson/core/format/InputAccessor;->hasMoreBytes()Z

    move-result v0

    if-nez v0, :cond_9

    .line 183
    sget-object v0, Lcom/fasterxml/jackson/core/format/MatchStrength;->INCONCLUSIVE:Lcom/fasterxml/jackson/core/format/MatchStrength;

    goto :goto_0

    .line 188
    :cond_9
    invoke-static {v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->likelySmileValue(B)Z

    move-result v0

    if-nez v0, :cond_a

    const/4 v0, 0x1

    invoke-static {v1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->possibleSmileValue(BZ)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 189
    :cond_a
    sget-object v0, Lcom/fasterxml/jackson/core/format/MatchStrength;->SOLID_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    goto :goto_0

    .line 191
    :cond_b
    sget-object v0, Lcom/fasterxml/jackson/core/format/MatchStrength;->NO_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    goto :goto_0

    .line 194
    :cond_c
    invoke-static {v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->likelySmileValue(B)Z

    move-result v0

    if-nez v0, :cond_d

    const/4 v0, 0x0

    invoke-static {v1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->possibleSmileValue(BZ)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 195
    :cond_d
    sget-object v0, Lcom/fasterxml/jackson/core/format/MatchStrength;->SOLID_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    goto :goto_0

    .line 197
    :cond_e
    sget-object v0, Lcom/fasterxml/jackson/core/format/MatchStrength;->NO_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    goto :goto_0
.end method

.method private static likelySmileValue(B)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 202
    and-int/lit16 v2, p0, 0xff

    .line 203
    const/16 v3, 0xe0

    if-lt v2, v3, :cond_1

    .line 204
    sparse-switch v2, :sswitch_data_0

    move v0, v1

    .line 219
    :cond_0
    :goto_0
    :sswitch_0
    return v0

    .line 216
    :cond_1
    const/16 v3, 0x80

    if-lt v2, v3, :cond_2

    const/16 v3, 0x9f

    if-le v2, v3, :cond_0

    :cond_2
    move v0, v1

    .line 219
    goto :goto_0

    .line 204
    nop

    :sswitch_data_0
    .sparse-switch
        -0x8 -> :sswitch_0
        -0x6 -> :sswitch_0
        0xe0 -> :sswitch_0
        0xe4 -> :sswitch_0
        0xe8 -> :sswitch_0
    .end sparse-switch
.end method

.method private static possibleSmileValue(BZ)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 228
    and-int/lit16 v2, p0, 0xff

    .line 230
    const/16 v3, 0x80

    if-lt v2, v3, :cond_2

    .line 231
    const/16 v3, 0xe0

    if-gt v2, v3, :cond_1

    .line 241
    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    .line 231
    goto :goto_0

    .line 233
    :cond_2
    if-eqz p1, :cond_3

    .line 234
    const/16 v3, 0x40

    if-ge v2, v3, :cond_0

    .line 237
    const/16 v3, -0x20

    if-le v2, v3, :cond_3

    .line 238
    const/16 v3, 0x2c

    if-lt v2, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_3
    move v0, v1

    .line 241
    goto :goto_0
.end method


# virtual methods
.method public constructParser(IIZLcom/fasterxml/jackson/core/ObjectCodec;Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;
    .locals 12

    .prologue
    .line 100
    const/4 v1, 0x1

    move-object/from16 v0, p5

    invoke-virtual {v0, v1, p3}, Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;->makeChild(ZZ)Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;

    move-result-object v6

    .line 102
    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->ensureLoaded(I)Z

    .line 103
    new-instance v1, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;

    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_context:Lcom/fasterxml/jackson/core/io/IOContext;

    iget-object v7, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_in:Ljava/io/InputStream;

    iget-object v8, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputBuffer:[B

    iget v9, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputPtr:I

    iget v10, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputEnd:I

    iget-boolean v11, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_bufferRecyclable:Z

    move v3, p1

    move v4, p2

    move-object/from16 v5, p4

    invoke-direct/range {v1 .. v11}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;-><init>(Lcom/fasterxml/jackson/core/io/IOContext;IILcom/fasterxml/jackson/core/ObjectCodec;Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;Ljava/io/InputStream;[BIIZ)V

    .line 106
    const/4 v2, 0x0

    .line 107
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputPtr:I

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputEnd:I

    if-ge v3, v4, :cond_0

    .line 108
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputBuffer:[B

    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputPtr:I

    aget-byte v3, v3, v4

    const/16 v4, 0x3a

    if-ne v3, v4, :cond_0

    .line 110
    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser;->handleSignature(ZZ)Z

    move-result v2

    .line 113
    :cond_0
    if-nez v2, :cond_4

    sget-object v2, Lcom/fasterxml/jackson/dataformat/smile/SmileParser$Feature;->REQUIRE_HEADER:Lcom/fasterxml/jackson/dataformat/smile/SmileParser$Feature;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser$Feature;->getMask()I

    move-result v2

    and-int/2addr v2, p2

    if-eqz v2, :cond_4

    .line 117
    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputPtr:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputEnd:I

    if-ge v1, v2, :cond_2

    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputBuffer:[B

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputPtr:I

    aget-byte v1, v1, v2

    .line 118
    :goto_0
    const/16 v2, 0x7b

    if-eq v1, v2, :cond_1

    const/16 v2, 0x5b

    if-ne v1, v2, :cond_3

    .line 119
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Input does not start with Smile format header (first byte = 0x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    and-int/lit16 v3, v1, 0xff

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ") -- rather, it starts with \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    int-to-char v1, v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' (plain JSON input?) -- can not parse"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 126
    :goto_1
    new-instance v2, Lcom/fasterxml/jackson/core/JsonParseException;

    sget-object v3, Lcom/fasterxml/jackson/core/JsonLocation;->NA:Lcom/fasterxml/jackson/core/JsonLocation;

    invoke-direct {v2, v1, v3}, Lcom/fasterxml/jackson/core/JsonParseException;-><init>(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonLocation;)V

    throw v2

    .line 117
    :cond_2
    const/4 v1, 0x0

    goto :goto_0

    .line 123
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Input does not start with Smile format header (first byte = 0x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    and-int/lit16 v1, v1, 0xff

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") and parser has REQUIRE_HEADER enabled: can not parse"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 128
    :cond_4
    return-object v1
.end method

.method protected ensureLoaded(I)Z
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 253
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_in:Ljava/io/InputStream;

    if-nez v2, :cond_1

    .line 269
    :cond_0
    :goto_0
    return v0

    .line 260
    :cond_1
    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputEnd:I

    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputPtr:I

    sub-int/2addr v2, v3

    .line 261
    :goto_1
    if-ge v2, p1, :cond_2

    .line 262
    iget-object v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_in:Ljava/io/InputStream;

    iget-object v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputBuffer:[B

    iget v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputEnd:I

    iget-object v6, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputBuffer:[B

    array-length v6, v6

    iget v7, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputEnd:I

    sub-int/2addr v6, v7

    invoke-virtual {v3, v4, v5, v6}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    .line 263
    if-lt v3, v1, :cond_0

    .line 266
    iget v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputEnd:I

    add-int/2addr v4, v3

    iput v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->_inputEnd:I

    .line 267
    add-int/2addr v2, v3

    .line 268
    goto :goto_1

    :cond_2
    move v0, v1

    .line 269
    goto :goto_0
.end method
