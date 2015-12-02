.class public Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;
.super Lcom/fasterxml/jackson/core/JsonFactory;
.source "SmileFactory.java"


# static fields
.field static final DEFAULT_SMILE_GENERATOR_FEATURE_FLAGS:I

.field static final DEFAULT_SMILE_PARSER_FEATURE_FLAGS:I

.field public static final FORMAT_NAME_SMILE:Ljava/lang/String; = "Smile"


# instance fields
.field protected _cfgDelegateToTextual:Z

.field protected _smileGeneratorFeatures:I

.field protected _smileParserFeatures:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    invoke-static {}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser$Feature;->collectDefaults()I

    move-result v0

    sput v0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->DEFAULT_SMILE_PARSER_FEATURE_FLAGS:I

    .line 45
    invoke-static {}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->collectDefaults()I

    move-result v0

    sput v0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->DEFAULT_SMILE_GENERATOR_FEATURE_FLAGS:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 82
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;-><init>(Lcom/fasterxml/jackson/core/ObjectCodec;)V

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/ObjectCodec;)V
    .locals 1

    .prologue
    .line 84
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/JsonFactory;-><init>(Lcom/fasterxml/jackson/core/ObjectCodec;)V

    .line 62
    sget v0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->DEFAULT_SMILE_PARSER_FEATURE_FLAGS:I

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_smileParserFeatures:I

    .line 64
    sget v0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->DEFAULT_SMILE_GENERATOR_FEATURE_FLAGS:I

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_smileGeneratorFeatures:I

    .line 84
    return-void
.end method


# virtual methods
.method protected _createJsonGenerator(Ljava/io/Writer;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonGenerator;
    .locals 2

    .prologue
    .line 344
    iget-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_cfgDelegateToTextual:Z

    if-eqz v0, :cond_0

    .line 345
    invoke-super {p0, p1, p2}, Lcom/fasterxml/jackson/core/JsonFactory;->_createJsonGenerator(Ljava/io/Writer;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object v0

    return-object v0

    .line 347
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Can not create generator for non-byte-based target"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected _createJsonGenerator(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;
    .locals 6

    .prologue
    .line 377
    iget v3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_smileGeneratorFeatures:I

    .line 383
    new-instance v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_generatorFeatures:I

    iget-object v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

    move-object v1, p2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;-><init>(Lcom/fasterxml/jackson/core/io/IOContext;IILcom/fasterxml/jackson/core/ObjectCodec;Ljava/io/OutputStream;)V

    .line 384
    sget-object v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->WRITE_HEADER:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->getMask()I

    move-result v1

    and-int/2addr v1, v3

    if-eqz v1, :cond_1

    .line 385
    invoke-virtual {v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;->writeHeader()V

    .line 398
    :cond_0
    return-object v0

    .line 387
    :cond_1
    sget-object v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->CHECK_SHARED_STRING_VALUES:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->getMask()I

    move-result v1

    and-int/2addr v1, v3

    if-eqz v1, :cond_2

    .line 388
    new-instance v0, Lcom/fasterxml/jackson/core/JsonGenerationException;

    const-string v1, "Inconsistent settings: WRITE_HEADER disabled, but CHECK_SHARED_STRING_VALUES enabled; can not construct generator due to possible data loss (either enable WRITE_HEADER, or disable CHECK_SHARED_STRING_VALUES to resolve)"

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 392
    :cond_2
    sget-object v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->ENCODE_BINARY_AS_7BIT:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->getMask()I

    move-result v1

    and-int/2addr v1, v3

    if-nez v1, :cond_0

    .line 393
    new-instance v0, Lcom/fasterxml/jackson/core/JsonGenerationException;

    const-string v1, "Inconsistent settings: WRITE_HEADER disabled, but ENCODE_BINARY_AS_7BIT disabled; can not construct generator due to possible data loss (either enable WRITE_HEADER, or ENCODE_BINARY_AS_7BIT to resolve)"

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/core/JsonGenerationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected bridge synthetic _createJsonParser(Ljava/io/InputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonParser;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_createJsonParser(Ljava/io/InputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;

    move-result-object v0

    return-object v0
.end method

.method protected _createJsonParser(Ljava/io/Reader;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonParser;
    .locals 2

    .prologue
    .line 316
    iget-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_cfgDelegateToTextual:Z

    if-eqz v0, :cond_0

    .line 317
    invoke-super {p0, p1, p2}, Lcom/fasterxml/jackson/core/JsonFactory;->_createJsonParser(Ljava/io/Reader;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v0

    return-object v0

    .line 319
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Can not create generator for non-byte-based target"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected bridge synthetic _createJsonParser([BIILcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonParser;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_createJsonParser([BIILcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;

    move-result-object v0

    return-object v0
.end method

.method protected _createJsonParser(Ljava/io/InputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;
    .locals 6

    .prologue
    .line 303
    new-instance v0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;

    invoke-direct {v0, p2, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;-><init>(Lcom/fasterxml/jackson/core/io/IOContext;Ljava/io/InputStream;)V

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_parserFeatures:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_smileParserFeatures:I

    sget-object v3, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->INTERN_FIELD_NAMES:Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    invoke-virtual {p0, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->isEnabled(Lcom/fasterxml/jackson/core/JsonFactory$Feature;)Z

    move-result v3

    iget-object v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

    iget-object v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_rootByteSymbols:Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->constructParser(IIZLcom/fasterxml/jackson/core/ObjectCodec;Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;

    move-result-object v0

    return-object v0
.end method

.method protected _createJsonParser([BIILcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;
    .locals 6

    .prologue
    .line 330
    new-instance v0, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;

    invoke-direct {v0, p4, p1, p2, p3}, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;-><init>(Lcom/fasterxml/jackson/core/io/IOContext;[BII)V

    iget v1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_parserFeatures:I

    iget v2, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_smileParserFeatures:I

    sget-object v3, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->INTERN_FIELD_NAMES:Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    invoke-virtual {p0, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->isEnabled(Lcom/fasterxml/jackson/core/JsonFactory$Feature;)Z

    move-result v3

    iget-object v4, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_objectCodec:Lcom/fasterxml/jackson/core/ObjectCodec;

    iget-object v5, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_rootByteSymbols:Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;

    invoke-virtual/range {v0 .. v5}, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->constructParser(IIZLcom/fasterxml/jackson/core/ObjectCodec;Lcom/fasterxml/jackson/core/sym/BytesToNameCanonicalizer;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;

    move-result-object v0

    return-object v0
.end method

.method protected _createUTF8JsonGenerator(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/core/JsonGenerator;
    .locals 1

    .prologue
    .line 354
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_createJsonGenerator(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;

    move-result-object v0

    return-object v0
.end method

.method protected _createWriter(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/JsonEncoding;Lcom/fasterxml/jackson/core/io/IOContext;)Ljava/io/Writer;
    .locals 2

    .prologue
    .line 362
    iget-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_cfgDelegateToTextual:Z

    if-eqz v0, :cond_0

    .line 363
    invoke-super {p0, p1, p2, p3}, Lcom/fasterxml/jackson/core/JsonFactory;->_createWriter(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/JsonEncoding;Lcom/fasterxml/jackson/core/io/IOContext;)Ljava/io/Writer;

    move-result-object v0

    return-object v0

    .line 365
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Can not create generator for non-byte-based target"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final configure(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;Z)Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;
    .locals 0

    .prologue
    .line 180
    if-eqz p2, :cond_0

    .line 181
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->enable(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    .line 185
    :goto_0
    return-object p0

    .line 183
    :cond_0
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->disable(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    goto :goto_0
.end method

.method public final configure(Lcom/fasterxml/jackson/dataformat/smile/SmileParser$Feature;Z)Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;
    .locals 0

    .prologue
    .line 134
    if-eqz p2, :cond_0

    .line 135
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->enable(Lcom/fasterxml/jackson/dataformat/smile/SmileParser$Feature;)Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    .line 139
    :goto_0
    return-object p0

    .line 137
    :cond_0
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->disable(Lcom/fasterxml/jackson/dataformat/smile/SmileParser$Feature;)Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    goto :goto_0
.end method

.method public bridge synthetic createJsonGenerator(Ljava/io/OutputStream;)Lcom/fasterxml/jackson/core/JsonGenerator;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->createJsonGenerator(Ljava/io/OutputStream;)Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic createJsonGenerator(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/JsonEncoding;)Lcom/fasterxml/jackson/core/JsonGenerator;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->createJsonGenerator(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/JsonEncoding;)Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;

    move-result-object v0

    return-object v0
.end method

.method public createJsonGenerator(Ljava/io/OutputStream;)Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;
    .locals 1

    .prologue
    .line 283
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_createContext(Ljava/lang/Object;Z)Lcom/fasterxml/jackson/core/io/IOContext;

    move-result-object v0

    .line 284
    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_createJsonGenerator(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;

    move-result-object v0

    return-object v0
.end method

.method public createJsonGenerator(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/JsonEncoding;)Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;
    .locals 1

    .prologue
    .line 272
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->createJsonGenerator(Ljava/io/OutputStream;)Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic createJsonParser(Ljava/io/File;)Lcom/fasterxml/jackson/core/JsonParser;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->createJsonParser(Ljava/io/File;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic createJsonParser(Ljava/io/InputStream;)Lcom/fasterxml/jackson/core/JsonParser;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->createJsonParser(Ljava/io/InputStream;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic createJsonParser(Ljava/net/URL;)Lcom/fasterxml/jackson/core/JsonParser;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->createJsonParser(Ljava/net/URL;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic createJsonParser([B)Lcom/fasterxml/jackson/core/JsonParser;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->createJsonParser([B)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic createJsonParser([BII)Lcom/fasterxml/jackson/core/JsonParser;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->createJsonParser([BII)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;

    move-result-object v0

    return-object v0
.end method

.method public createJsonParser(Ljava/io/File;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;
    .locals 2

    .prologue
    .line 224
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_createContext(Ljava/lang/Object;Z)Lcom/fasterxml/jackson/core/io/IOContext;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_createJsonParser(Ljava/io/InputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;

    move-result-object v0

    return-object v0
.end method

.method public createJsonParser(Ljava/io/InputStream;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;
    .locals 1

    .prologue
    .line 238
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_createContext(Ljava/lang/Object;Z)Lcom/fasterxml/jackson/core/io/IOContext;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_createJsonParser(Ljava/io/InputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;

    move-result-object v0

    return-object v0
.end method

.method public createJsonParser(Ljava/net/URL;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;
    .locals 2

    .prologue
    .line 231
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_optimizedStreamFromURL(Ljava/net/URL;)Ljava/io/InputStream;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_createContext(Ljava/lang/Object;Z)Lcom/fasterxml/jackson/core/io/IOContext;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_createJsonParser(Ljava/io/InputStream;Lcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;

    move-result-object v0

    return-object v0
.end method

.method public createJsonParser([B)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;
    .locals 3

    .prologue
    .line 247
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_createContext(Ljava/lang/Object;Z)Lcom/fasterxml/jackson/core/io/IOContext;

    move-result-object v0

    .line 248
    const/4 v1, 0x0

    array-length v2, p1

    invoke-virtual {p0, p1, v1, v2, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_createJsonParser([BIILcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;

    move-result-object v0

    return-object v0
.end method

.method public createJsonParser([BII)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;
    .locals 1

    .prologue
    .line 255
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_createContext(Ljava/lang/Object;Z)Lcom/fasterxml/jackson/core/io/IOContext;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_createJsonParser([BIILcom/fasterxml/jackson/core/io/IOContext;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;

    move-result-object v0

    return-object v0
.end method

.method public delegateToTextual(Z)V
    .locals 0

    .prologue
    .line 87
    iput-boolean p1, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_cfgDelegateToTextual:Z

    .line 88
    return-void
.end method

.method public disable(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;
    .locals 2

    .prologue
    .line 203
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_smileGeneratorFeatures:I

    invoke-virtual {p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->getMask()I

    move-result v1

    xor-int/lit8 v1, v1, -0x1

    and-int/2addr v0, v1

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_smileGeneratorFeatures:I

    .line 204
    return-object p0
.end method

.method public disable(Lcom/fasterxml/jackson/dataformat/smile/SmileParser$Feature;)Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;
    .locals 2

    .prologue
    .line 156
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_smileParserFeatures:I

    invoke-virtual {p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser$Feature;->getMask()I

    move-result v1

    xor-int/lit8 v1, v1, -0x1

    and-int/2addr v0, v1

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_smileParserFeatures:I

    .line 157
    return-object p0
.end method

.method public enable(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;)Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;
    .locals 2

    .prologue
    .line 194
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_smileGeneratorFeatures:I

    invoke-virtual {p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->getMask()I

    move-result v1

    or-int/2addr v0, v1

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_smileGeneratorFeatures:I

    .line 195
    return-object p0
.end method

.method public enable(Lcom/fasterxml/jackson/dataformat/smile/SmileParser$Feature;)Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;
    .locals 2

    .prologue
    .line 147
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_smileParserFeatures:I

    invoke-virtual {p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser$Feature;->getMask()I

    move-result v1

    or-int/2addr v0, v1

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_smileParserFeatures:I

    .line 148
    return-object p0
.end method

.method public getFormatName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 110
    const-string v0, "Smile"

    return-object v0
.end method

.method public hasFormat(Lcom/fasterxml/jackson/core/format/InputAccessor;)Lcom/fasterxml/jackson/core/format/MatchStrength;
    .locals 1

    .prologue
    .line 119
    invoke-static {p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParserBootstrapper;->hasSmileFormat(Lcom/fasterxml/jackson/core/format/InputAccessor;)Lcom/fasterxml/jackson/core/format/MatchStrength;

    move-result-object v0

    return-object v0
.end method

.method public final isEnabled(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;)Z
    .locals 2

    .prologue
    .line 211
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_smileGeneratorFeatures:I

    invoke-virtual {p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->getMask()I

    move-result v1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final isEnabled(Lcom/fasterxml/jackson/dataformat/smile/SmileParser$Feature;)Z
    .locals 2

    .prologue
    .line 164
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->_smileParserFeatures:I

    invoke-virtual {p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileParser$Feature;->getMask()I

    move-result v1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public version()Lcom/fasterxml/jackson/core/Version;
    .locals 1

    .prologue
    .line 98
    sget-object v0, Lcom/fasterxml/jackson/dataformat/smile/ModuleVersion;->instance:Lcom/fasterxml/jackson/dataformat/smile/ModuleVersion;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/dataformat/smile/ModuleVersion;->version()Lcom/fasterxml/jackson/core/Version;

    move-result-object v0

    return-object v0
.end method
