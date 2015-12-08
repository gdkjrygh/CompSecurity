.class public Lezvcard/io/text/VCardReader;
.super Ljava/lang/Object;
.source "VCardReader.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/io/text/VCardReader$1;,
        Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;
    }
.end annotation


# instance fields
.field private index:Lezvcard/io/scribe/ScribeIndex;

.field private final reader:Lezvcard/io/text/VCardRawReader;

.field private final warnings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1
    .param p1, "file"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    .line 115
    new-instance v0, Ljava/io/FileReader;

    invoke-direct {v0, p1}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {p0, v0}, Lezvcard/io/text/VCardReader;-><init>(Ljava/io/Reader;)V

    .line 116
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1
    .param p1, "in"    # Ljava/io/InputStream;

    .prologue
    .line 106
    new-instance v0, Ljava/io/InputStreamReader;

    invoke-direct {v0, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p0, v0}, Lezvcard/io/text/VCardReader;-><init>(Ljava/io/Reader;)V

    .line 107
    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;)V
    .locals 1
    .param p1, "reader"    # Ljava/io/Reader;

    .prologue
    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lezvcard/io/text/VCardReader;->warnings:Ljava/util/List;

    .line 90
    new-instance v0, Lezvcard/io/scribe/ScribeIndex;

    invoke-direct {v0}, Lezvcard/io/scribe/ScribeIndex;-><init>()V

    iput-object v0, p0, Lezvcard/io/text/VCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 123
    new-instance v0, Lezvcard/io/text/VCardRawReader;

    invoke-direct {v0, p1}, Lezvcard/io/text/VCardRawReader;-><init>(Ljava/io/Reader;)V

    iput-object v0, p0, Lezvcard/io/text/VCardReader;->reader:Lezvcard/io/text/VCardRawReader;

    .line 124
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "str"    # Ljava/lang/String;

    .prologue
    .line 98
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lezvcard/io/text/VCardReader;-><init>(Ljava/io/Reader;)V

    .line 99
    return-void
.end method

.method static synthetic access$200(Lezvcard/io/text/VCardReader;Lezvcard/parameter/VCardParameters;)V
    .locals 0
    .param p0, "x0"    # Lezvcard/io/text/VCardReader;
    .param p1, "x1"    # Lezvcard/parameter/VCardParameters;

    .prologue
    .line 88
    invoke-direct {p0, p1}, Lezvcard/io/text/VCardReader;->handleNamelessParameters(Lezvcard/parameter/VCardParameters;)V

    return-void
.end method

.method static synthetic access$300(Lezvcard/io/text/VCardReader;Lezvcard/parameter/VCardParameters;)V
    .locals 0
    .param p0, "x0"    # Lezvcard/io/text/VCardReader;
    .param p1, "x1"    # Lezvcard/parameter/VCardParameters;

    .prologue
    .line 88
    invoke-direct {p0, p1}, Lezvcard/io/text/VCardReader;->handleQuotedMultivaluedTypeParams(Lezvcard/parameter/VCardParameters;)V

    return-void
.end method

.method static synthetic access$400(Lezvcard/io/text/VCardReader;Ljava/lang/String;Lezvcard/parameter/VCardParameters;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lezvcard/io/text/VCardReader;
    .param p1, "x1"    # Ljava/lang/String;
    .param p2, "x2"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x3"    # Ljava/lang/String;

    .prologue
    .line 88
    invoke-direct {p0, p1, p2, p3}, Lezvcard/io/text/VCardReader;->decodeQuotedPrintable(Ljava/lang/String;Lezvcard/parameter/VCardParameters;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$500(Lezvcard/io/text/VCardReader;)Lezvcard/io/scribe/ScribeIndex;
    .locals 1
    .param p0, "x0"    # Lezvcard/io/text/VCardReader;

    .prologue
    .line 88
    iget-object v0, p0, Lezvcard/io/text/VCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    return-object v0
.end method

.method static synthetic access$600(Lezvcard/io/text/VCardReader;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p0, "x0"    # Lezvcard/io/text/VCardReader;
    .param p1, "x1"    # Ljava/lang/String;
    .param p2, "x2"    # Ljava/lang/String;

    .prologue
    .line 88
    invoke-direct {p0, p1, p2}, Lezvcard/io/text/VCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$700(Lezvcard/io/text/VCardReader;Ljava/lang/String;)V
    .locals 0
    .param p0, "x0"    # Lezvcard/io/text/VCardReader;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 88
    invoke-direct {p0, p1}, Lezvcard/io/text/VCardReader;->addWarning(Ljava/lang/String;)V

    return-void
.end method

.method private addWarning(Ljava/lang/String;)V
    .locals 1
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 297
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lezvcard/io/text/VCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    return-void
.end method

.method private addWarning(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "propertyName"    # Ljava/lang/String;

    .prologue
    .line 301
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 302
    .local v0, "sb":Ljava/lang/StringBuilder;
    const-string v1, "Line "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lezvcard/io/text/VCardReader;->reader:Lezvcard/io/text/VCardRawReader;

    invoke-virtual {v2}, Lezvcard/io/text/VCardRawReader;->getLineNum()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 303
    if-eqz p2, :cond_0

    .line 304
    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " property)"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    :cond_0
    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    iget-object v1, p0, Lezvcard/io/text/VCardReader;->warnings:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 309
    return-void
.end method

.method private decodeQuotedPrintable(Ljava/lang/String;Lezvcard/parameter/VCardParameters;Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "parameters"    # Lezvcard/parameter/VCardParameters;
    .param p3, "value"    # Ljava/lang/String;

    .prologue
    .line 263
    invoke-virtual {p2}, Lezvcard/parameter/VCardParameters;->getEncoding()Lezvcard/parameter/Encoding;

    move-result-object v3

    sget-object v4, Lezvcard/parameter/Encoding;->QUOTED_PRINTABLE:Lezvcard/parameter/Encoding;

    if-eq v3, v4, :cond_0

    .line 286
    .end local p3    # "value":Ljava/lang/String;
    :goto_0
    return-object p3

    .line 267
    .restart local p3    # "value":Ljava/lang/String;
    :cond_0
    const/4 v3, 0x0

    invoke-virtual {p2, v3}, Lezvcard/parameter/VCardParameters;->setEncoding(Lezvcard/parameter/Encoding;)V

    .line 269
    new-instance v1, Lezvcard/util/org/apache/commons/codec/net/QuotedPrintableCodec;

    invoke-direct {v1}, Lezvcard/util/org/apache/commons/codec/net/QuotedPrintableCodec;-><init>()V

    .line 270
    .local v1, "codec":Lezvcard/util/org/apache/commons/codec/net/QuotedPrintableCodec;
    invoke-virtual {p2}, Lezvcard/parameter/VCardParameters;->getCharset()Ljava/lang/String;

    move-result-object v0

    .line 272
    .local v0, "charset":Ljava/lang/String;
    if-nez v0, :cond_1

    .line 273
    :try_start_0
    invoke-virtual {v1, p3}, Lezvcard/util/org/apache/commons/codec/net/QuotedPrintableCodec;->decode(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lezvcard/util/org/apache/commons/codec/DecoderException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object p3

    goto :goto_0

    .line 276
    :cond_1
    :try_start_1
    invoke-virtual {v1, p3, v0}, Lezvcard/util/org/apache/commons/codec/net/QuotedPrintableCodec;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lezvcard/util/org/apache/commons/codec/DecoderException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object p3

    goto :goto_0

    .line 277
    :catch_0
    move-exception v2

    .line 278
    .local v2, "e":Ljava/io/UnsupportedEncodingException;
    :try_start_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "The specified charset is not supported.  Using default charset instead: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3, p1}, Lezvcard/io/text/VCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    invoke-virtual {v1, p3}, Lezvcard/util/org/apache/commons/codec/net/QuotedPrintableCodec;->decode(Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catch Lezvcard/util/org/apache/commons/codec/DecoderException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object p3

    goto :goto_0

    .line 282
    .end local v2    # "e":Ljava/io/UnsupportedEncodingException;
    :catch_1
    move-exception v2

    .line 283
    .local v2, "e":Lezvcard/util/org/apache/commons/codec/DecoderException;
    const-string v3, "Property value was marked as \"quoted-printable\", but it could not be decoded.  Treating the value as plain text."

    invoke-direct {p0, v3, p1}, Lezvcard/io/text/VCardReader;->addWarning(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private handleNamelessParameters(Lezvcard/parameter/VCardParameters;)V
    .locals 6
    .param p1, "parameters"    # Lezvcard/parameter/VCardParameters;

    .prologue
    const/4 v5, 0x0

    .line 210
    invoke-virtual {p1, v5}, Lezvcard/parameter/VCardParameters;->get(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 211
    .local v1, "namelessParamValues":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 213
    .local v3, "paramValue":Ljava/lang/String;
    invoke-static {v3}, Lezvcard/VCardDataType;->find(Ljava/lang/String;)Lezvcard/VCardDataType;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 214
    const-string v2, "VALUE"

    .line 221
    .local v2, "paramName":Ljava/lang/String;
    :goto_1
    invoke-virtual {p1, v2, v3}, Lezvcard/parameter/VCardParameters;->put(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 215
    .end local v2    # "paramName":Ljava/lang/String;
    :cond_0
    invoke-static {v3}, Lezvcard/parameter/Encoding;->find(Ljava/lang/String;)Lezvcard/parameter/Encoding;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 216
    const-string v2, "ENCODING"

    .restart local v2    # "paramName":Ljava/lang/String;
    goto :goto_1

    .line 219
    .end local v2    # "paramName":Ljava/lang/String;
    :cond_1
    const-string v2, "TYPE"

    .restart local v2    # "paramName":Ljava/lang/String;
    goto :goto_1

    .line 223
    .end local v2    # "paramName":Ljava/lang/String;
    .end local v3    # "paramValue":Ljava/lang/String;
    :cond_2
    invoke-virtual {p1, v5}, Lezvcard/parameter/VCardParameters;->removeAll(Ljava/lang/Object;)Ljava/util/List;

    .line 224
    return-void
.end method

.method private handleQuotedMultivaluedTypeParams(Lezvcard/parameter/VCardParameters;)V
    .locals 7
    .param p1, "parameters"    # Lezvcard/parameter/VCardParameters;

    .prologue
    .line 242
    invoke-virtual {p1}, Lezvcard/parameter/VCardParameters;->getTypes()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 243
    .local v5, "typeParam":Ljava/lang/String;
    const-string v6, ","

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 247
    invoke-virtual {p1}, Lezvcard/parameter/VCardParameters;->removeTypes()V

    .line 248
    const-string v6, ","

    invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/String;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_0

    aget-object v4, v0, v2

    .line 249
    .local v4, "splitValue":Ljava/lang/String;
    invoke-virtual {p1, v4}, Lezvcard/parameter/VCardParameters;->addType(Ljava/lang/String;)V

    .line 248
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 252
    .end local v0    # "arr$":[Ljava/lang/String;
    .end local v2    # "i$":I
    .end local v3    # "len$":I
    .end local v4    # "splitValue":Ljava/lang/String;
    .end local v5    # "typeParam":Ljava/lang/String;
    :cond_1
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
    .line 293
    iget-object v0, p0, Lezvcard/io/text/VCardReader;->reader:Lezvcard/io/text/VCardRawReader;

    invoke-virtual {v0}, Lezvcard/io/text/VCardRawReader;->close()V

    .line 294
    return-void
.end method

.method public getScribeIndex()Lezvcard/io/scribe/ScribeIndex;
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lezvcard/io/text/VCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    return-object v0
.end method

.method public getWarnings()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 183
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lezvcard/io/text/VCardReader;->warnings:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public isCaretDecodingEnabled()Z
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lezvcard/io/text/VCardReader;->reader:Lezvcard/io/text/VCardRawReader;

    invoke-virtual {v0}, Lezvcard/io/text/VCardRawReader;->isCaretDecodingEnabled()Z

    move-result v0

    return v0
.end method

.method public readNext()Lezvcard/VCard;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 192
    iget-object v2, p0, Lezvcard/io/text/VCardReader;->reader:Lezvcard/io/text/VCardRawReader;

    invoke-virtual {v2}, Lezvcard/io/text/VCardRawReader;->eof()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 201
    :goto_0
    return-object v1

    .line 196
    :cond_0
    iget-object v2, p0, Lezvcard/io/text/VCardReader;->warnings:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 198
    new-instance v0, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;

    invoke-direct {v0, p0, v1}, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;-><init>(Lezvcard/io/text/VCardReader;Lezvcard/io/text/VCardReader$1;)V

    .line 199
    .local v0, "listener":Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;
    iget-object v1, p0, Lezvcard/io/text/VCardReader;->reader:Lezvcard/io/text/VCardRawReader;

    invoke-virtual {v1, v0}, Lezvcard/io/text/VCardRawReader;->start(Lezvcard/io/text/VCardRawReader$VCardDataStreamListener;)V

    .line 201
    # getter for: Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->root:Lezvcard/VCard;
    invoke-static {v0}, Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;->access$100(Lezvcard/io/text/VCardReader$VCardDataStreamListenerImpl;)Lezvcard/VCard;

    move-result-object v1

    goto :goto_0
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
    .line 158
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    iget-object v0, p0, Lezvcard/io/text/VCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v0, p1}, Lezvcard/io/scribe/ScribeIndex;->register(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 159
    return-void
.end method

.method public setCaretDecodingEnabled(Z)V
    .locals 1
    .param p1, "enable"    # Z

    .prologue
    .line 145
    iget-object v0, p0, Lezvcard/io/text/VCardReader;->reader:Lezvcard/io/text/VCardRawReader;

    invoke-virtual {v0, p1}, Lezvcard/io/text/VCardRawReader;->setCaretDecodingEnabled(Z)V

    .line 146
    return-void
.end method

.method public setScribeIndex(Lezvcard/io/scribe/ScribeIndex;)V
    .locals 0
    .param p1, "index"    # Lezvcard/io/scribe/ScribeIndex;

    .prologue
    .line 174
    iput-object p1, p0, Lezvcard/io/text/VCardReader;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 175
    return-void
.end method
