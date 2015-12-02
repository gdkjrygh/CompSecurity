.class public Lcom/fasterxml/jackson/dataformat/smile/Tool;
.super Ljava/lang/Object;
.source "Tool.java"


# static fields
.field public static final SUFFIX:Ljava/lang/String; = ".lzf"


# instance fields
.field public final jsonFactory:Lcom/fasterxml/jackson/core/JsonFactory;

.field public final smileFactory:Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-direct {v0}, Lcom/fasterxml/jackson/core/JsonFactory;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/Tool;->jsonFactory:Lcom/fasterxml/jackson/core/JsonFactory;

    .line 26
    new-instance v0, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    invoke-direct {v0}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/Tool;->smileFactory:Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    .line 28
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/Tool;->smileFactory:Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    sget-object v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->CHECK_SHARED_NAMES:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->configure(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;Z)Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    .line 29
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/Tool;->smileFactory:Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    sget-object v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->CHECK_SHARED_STRING_VALUES:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->configure(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;Z)Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    .line 30
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/Tool;->smileFactory:Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    sget-object v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->ENCODE_BINARY_AS_7BIT:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->configure(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;Z)Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    .line 31
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/Tool;->smileFactory:Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    sget-object v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->WRITE_HEADER:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->configure(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;Z)Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    .line 32
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/Tool;->smileFactory:Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    sget-object v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->WRITE_END_MARKER:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-virtual {v0, v1, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->configure(Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;Z)Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    .line 34
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/Tool;->smileFactory:Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    sget-object v1, Lcom/fasterxml/jackson/dataformat/smile/SmileParser$Feature;->REQUIRE_HEADER:Lcom/fasterxml/jackson/dataformat/smile/SmileParser$Feature;

    invoke-virtual {v0, v1, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->configure(Lcom/fasterxml/jackson/dataformat/smile/SmileParser$Feature;Z)Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    .line 35
    return-void
.end method

.method private decode(Ljava/io/InputStream;)V
    .locals 4

    .prologue
    .line 80
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/Tool;->smileFactory:Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->createJsonParser(Ljava/io/InputStream;)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;

    move-result-object v0

    .line 81
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/Tool;->jsonFactory:Lcom/fasterxml/jackson/core/JsonFactory;

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    sget-object v3, Lcom/fasterxml/jackson/core/JsonEncoding;->UTF8:Lcom/fasterxml/jackson/core/JsonEncoding;

    invoke-virtual {v1, v2, v3}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonGenerator(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/JsonEncoding;)Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object v1

    .line 87
    :goto_0
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    if-nez v2, :cond_0

    .line 88
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    if-nez v2, :cond_0

    .line 94
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->close()V

    .line 95
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->close()V

    .line 96
    return-void

    .line 92
    :cond_0
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->copyCurrentEvent(Lcom/fasterxml/jackson/core/JsonParser;)V

    goto :goto_0
.end method

.method private encode(Ljava/io/InputStream;)V
    .locals 4

    .prologue
    .line 100
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/Tool;->jsonFactory:Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonParser(Ljava/io/InputStream;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v0

    .line 101
    iget-object v1, p0, Lcom/fasterxml/jackson/dataformat/smile/Tool;->smileFactory:Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    sget-object v3, Lcom/fasterxml/jackson/core/JsonEncoding;->UTF8:Lcom/fasterxml/jackson/core/JsonEncoding;

    invoke-virtual {v1, v2, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->createJsonGenerator(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/JsonEncoding;)Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;

    move-result-object v1

    .line 102
    :goto_0
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 103
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->copyCurrentEvent(Lcom/fasterxml/jackson/core/JsonParser;)V

    goto :goto_0

    .line 105
    :cond_0
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->close()V

    .line 106
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/JsonGenerator;->close()V

    .line 107
    return-void
.end method

.method private inputStream(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 4

    .prologue
    .line 67
    if-nez p1, :cond_0

    .line 68
    sget-object v0, Ljava/lang/System;->in:Ljava/io/InputStream;

    .line 75
    :goto_0
    return-object v0

    .line 70
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 71
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 72
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "File \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\' does not exist."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 73
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 75
    :cond_1
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    goto :goto_0
.end method

.method public static main([Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 157
    new-instance v0, Lcom/fasterxml/jackson/dataformat/smile/Tool;

    invoke-direct {v0}, Lcom/fasterxml/jackson/dataformat/smile/Tool;-><init>()V

    invoke-direct {v0, p0}, Lcom/fasterxml/jackson/dataformat/smile/Tool;->process([Ljava/lang/String;)V

    .line 158
    return-void
.end method

.method private process([Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 39
    .line 42
    array-length v1, p1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 43
    aget-object v1, p1, v3

    .line 44
    aget-object v0, p1, v4

    .line 51
    :goto_0
    const-string v2, "-e"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/Tool;->inputStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/Tool;->encode(Ljava/io/InputStream;)V

    .line 62
    :goto_1
    return-void

    .line 45
    :cond_0
    array-length v1, p1

    if-ne v1, v4, :cond_1

    .line 46
    aget-object v1, p1, v3

    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/Tool;->showUsage()V

    move-object v1, v0

    goto :goto_0

    .line 54
    :cond_2
    const-string v2, "-d"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 55
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/Tool;->inputStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/Tool;->decode(Ljava/io/InputStream;)V

    goto :goto_1

    .line 56
    :cond_3
    const-string v2, "-v"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 58
    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/Tool;->inputStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/dataformat/smile/Tool;->inputStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/fasterxml/jackson/dataformat/smile/Tool;->verify(Ljava/io/InputStream;Ljava/io/InputStream;)V

    goto :goto_1

    .line 60
    :cond_4
    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/Tool;->showUsage()V

    goto :goto_1
.end method

.method private verify(Ljava/io/InputStream;Ljava/io/InputStream;)V
    .locals 7

    .prologue
    .line 111
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/Tool;->jsonFactory:Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonParser(Ljava/io/InputStream;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v0

    .line 112
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    const/16 v2, 0xfa0

    invoke-direct {v1, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 113
    iget-object v2, p0, Lcom/fasterxml/jackson/dataformat/smile/Tool;->smileFactory:Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    sget-object v3, Lcom/fasterxml/jackson/core/JsonEncoding;->UTF8:Lcom/fasterxml/jackson/core/JsonEncoding;

    invoke-virtual {v2, v1, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->createJsonGenerator(Ljava/io/OutputStream;Lcom/fasterxml/jackson/core/JsonEncoding;)Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator;

    move-result-object v2

    .line 116
    :goto_0
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 117
    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/core/JsonGenerator;->copyCurrentEvent(Lcom/fasterxml/jackson/core/JsonParser;)V

    goto :goto_0

    .line 119
    :cond_0
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->close()V

    .line 120
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonGenerator;->close()V

    .line 123
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/Tool;->jsonFactory:Lcom/fasterxml/jackson/core/JsonFactory;

    invoke-virtual {v0, p2}, Lcom/fasterxml/jackson/core/JsonFactory;->createJsonParser(Ljava/io/InputStream;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object v2

    .line 124
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 125
    iget-object v0, p0, Lcom/fasterxml/jackson/dataformat/smile/Tool;->smileFactory:Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/dataformat/smile/SmileFactory;->createJsonParser([B)Lcom/fasterxml/jackson/dataformat/smile/SmileParser;

    move-result-object v3

    .line 128
    const/4 v0, 0x0

    .line 129
    :cond_1
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 130
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v5

    .line 131
    add-int/lit8 v0, v0, 0x1

    .line 132
    if-eq v4, v5, :cond_2

    .line 133
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Input and encoded differ, token #"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "; expected "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", got "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 136
    :cond_2
    invoke-virtual {v2}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v4

    .line 137
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/JsonParser;->getText()Ljava/lang/String;

    move-result-object v5

    .line 138
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 139
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Input and encoded differ, token #"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "; expected text \'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\', got \'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 143
    :cond_3
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "OK: verified "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " tokens (from "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " bytes of Smile encoded data), input and encoded contents are identical"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 144
    return-void
.end method


# virtual methods
.method protected showUsage()V
    .locals 3

    .prologue
    .line 148
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Usage: java "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " -e/-d [file]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 149
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, " (if no file given, reads from stdin -- always writes to stdout)"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 150
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, " -d: decode Smile encoded input as JSON"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 151
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, " -e: encode JSON (text) input as Smile"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 152
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, " -v: encode JSON (text) input as Smile; read back, verify, do not write out"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 153
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 154
    return-void
.end method
