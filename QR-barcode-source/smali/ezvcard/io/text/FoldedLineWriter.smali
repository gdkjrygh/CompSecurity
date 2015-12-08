.class public Lezvcard/io/text/FoldedLineWriter;
.super Ljava/io/Writer;
.source "FoldedLineWriter.java"


# instance fields
.field private curLineLength:I

.field private indent:Ljava/lang/String;

.field private lineLength:Ljava/lang/Integer;

.field private newline:Ljava/lang/String;

.field private final writer:Ljava/io/Writer;


# direct methods
.method public constructor <init>(Ljava/io/Writer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "writer"    # Ljava/io/Writer;
    .param p2, "lineLength"    # Ljava/lang/Integer;
    .param p3, "indent"    # Ljava/lang/String;
    .param p4, "newline"    # Ljava/lang/String;

    .prologue
    .line 62
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lezvcard/io/text/FoldedLineWriter;->curLineLength:I

    .line 63
    iput-object p1, p0, Lezvcard/io/text/FoldedLineWriter;->writer:Ljava/io/Writer;

    .line 64
    invoke-virtual {p0, p2}, Lezvcard/io/text/FoldedLineWriter;->setLineLength(Ljava/lang/Integer;)V

    .line 65
    invoke-virtual {p0, p3}, Lezvcard/io/text/FoldedLineWriter;->setIndent(Ljava/lang/String;)V

    .line 66
    iput-object p4, p0, Lezvcard/io/text/FoldedLineWriter;->newline:Ljava/lang/String;

    .line 67
    return-void
.end method


# virtual methods
.method public append(Ljava/lang/CharSequence;Z)Lezvcard/io/text/FoldedLineWriter;
    .locals 0
    .param p1, "str"    # Ljava/lang/CharSequence;
    .param p2, "quotedPrintable"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 88
    invoke-virtual {p0, p1, p2}, Lezvcard/io/text/FoldedLineWriter;->write(Ljava/lang/CharSequence;Z)V

    .line 89
    return-object p0
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 225
    iget-object v0, p0, Lezvcard/io/text/FoldedLineWriter;->writer:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 226
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
    .line 233
    iget-object v0, p0, Lezvcard/io/text/FoldedLineWriter;->writer:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    .line 234
    return-void
.end method

.method public getIndent()Ljava/lang/String;
    .locals 1

    .prologue
    .line 264
    iget-object v0, p0, Lezvcard/io/text/FoldedLineWriter;->indent:Ljava/lang/String;

    return-object v0
.end method

.method public getLineLength()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 242
    iget-object v0, p0, Lezvcard/io/text/FoldedLineWriter;->lineLength:Ljava/lang/Integer;

    return-object v0
.end method

.method public getNewline()Ljava/lang/String;
    .locals 1

    .prologue
    .line 285
    iget-object v0, p0, Lezvcard/io/text/FoldedLineWriter;->newline:Ljava/lang/String;

    return-object v0
.end method

.method public getWriter()Ljava/io/Writer;
    .locals 1

    .prologue
    .line 301
    iget-object v0, p0, Lezvcard/io/text/FoldedLineWriter;->writer:Ljava/io/Writer;

    return-object v0
.end method

.method public setIndent(Ljava/lang/String;)V
    .locals 2
    .param p1, "indent"    # Ljava/lang/String;

    .prologue
    .line 274
    iget-object v0, p0, Lezvcard/io/text/FoldedLineWriter;->lineLength:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iget-object v1, p0, Lezvcard/io/text/FoldedLineWriter;->lineLength:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 275
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The length of the indent string must be less than the max line length."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 277
    :cond_0
    iput-object p1, p0, Lezvcard/io/text/FoldedLineWriter;->indent:Ljava/lang/String;

    .line 278
    return-void
.end method

.method public setLineLength(Ljava/lang/Integer;)V
    .locals 2
    .param p1, "lineLength"    # Ljava/lang/Integer;

    .prologue
    .line 253
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gtz v0, :cond_0

    .line 254
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Line length must be greater than 0."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 256
    :cond_0
    iput-object p1, p0, Lezvcard/io/text/FoldedLineWriter;->lineLength:Ljava/lang/Integer;

    .line 257
    return-void
.end method

.method public setNewline(Ljava/lang/String;)V
    .locals 0
    .param p1, "newline"    # Ljava/lang/String;

    .prologue
    .line 293
    iput-object p1, p0, Lezvcard/io/text/FoldedLineWriter;->newline:Ljava/lang/String;

    .line 294
    return-void
.end method

.method public write(Ljava/lang/CharSequence;Z)V
    .locals 3
    .param p1, "str"    # Ljava/lang/CharSequence;
    .param p2, "quotedPrintable"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2, p2}, Lezvcard/io/text/FoldedLineWriter;->write([CIIZ)V

    .line 101
    return-void
.end method

.method public write([CII)V
    .locals 1
    .param p1, "cbuf"    # [C
    .param p2, "off"    # I
    .param p3, "len"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 105
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lezvcard/io/text/FoldedLineWriter;->write([CIIZ)V

    .line 106
    return-void
.end method

.method public write([CIIZ)V
    .locals 10
    .param p1, "cbuf"    # [C
    .param p2, "off"    # I
    .param p3, "len"    # I
    .param p4, "quotedPrintable"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 119
    if-eqz p4, :cond_0

    .line 120
    new-instance v1, Lezvcard/util/org/apache/commons/codec/net/QuotedPrintableCodec;

    invoke-direct {v1}, Lezvcard/util/org/apache/commons/codec/net/QuotedPrintableCodec;-><init>()V

    .line 122
    .local v1, "codec":Lezvcard/util/org/apache/commons/codec/net/QuotedPrintableCodec;
    :try_start_0
    new-instance v8, Ljava/lang/String;

    invoke-direct {v8, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {v1, v8}, Lezvcard/util/org/apache/commons/codec/net/QuotedPrintableCodec;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    .line 123
    const/4 p2, 0x0

    .line 124
    array-length p3, p1
    :try_end_0
    .catch Lezvcard/util/org/apache/commons/codec/EncoderException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    .end local v1    # "codec":Lezvcard/util/org/apache/commons/codec/net/QuotedPrintableCodec;
    :cond_0
    iget-object v8, p0, Lezvcard/io/text/FoldedLineWriter;->lineLength:Ljava/lang/Integer;

    if-nez v8, :cond_1

    .line 133
    iget-object v8, p0, Lezvcard/io/text/FoldedLineWriter;->writer:Ljava/io/Writer;

    invoke-virtual {v8, p1, p2, p3}, Ljava/io/Writer;->write([CII)V

    .line 218
    :goto_0
    return-void

    .line 125
    .restart local v1    # "codec":Lezvcard/util/org/apache/commons/codec/net/QuotedPrintableCodec;
    :catch_0
    move-exception v2

    .line 127
    .local v2, "e":Lezvcard/util/org/apache/commons/codec/EncoderException;
    new-instance v8, Ljava/lang/RuntimeException;

    invoke-direct {v8, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v8

    .line 137
    .end local v1    # "codec":Lezvcard/util/org/apache/commons/codec/net/QuotedPrintableCodec;
    .end local v2    # "e":Lezvcard/util/org/apache/commons/codec/EncoderException;
    :cond_1
    iget-object v8, p0, Lezvcard/io/text/FoldedLineWriter;->lineLength:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 138
    .local v3, "effectiveLineLength":I
    if-eqz p4, :cond_2

    .line 140
    add-int/lit8 v3, v3, -0x1

    .line 143
    :cond_2
    const/4 v4, -0x1

    .line 144
    .local v4, "encodedCharPos":I
    move v7, p2

    .line 145
    .local v7, "start":I
    add-int v5, p2, p3

    .line 146
    .local v5, "end":I
    move v6, v7

    .local v6, "i":I
    :goto_1
    if-ge v6, v5, :cond_a

    .line 147
    aget-char v0, p1, v6

    .line 150
    .local v0, "c":C
    if-ltz v4, :cond_3

    .line 151
    add-int/lit8 v4, v4, 0x1

    .line 152
    const/4 v8, 0x3

    if-ne v4, v8, :cond_3

    .line 153
    const/4 v4, -0x1

    .line 157
    :cond_3
    const/16 v8, 0xa

    if-ne v0, v8, :cond_4

    .line 158
    iget-object v8, p0, Lezvcard/io/text/FoldedLineWriter;->writer:Ljava/io/Writer;

    sub-int v9, v6, v7

    add-int/lit8 v9, v9, 0x1

    invoke-virtual {v8, p1, v7, v9}, Ljava/io/Writer;->write([CII)V

    .line 159
    const/4 v8, 0x0

    iput v8, p0, Lezvcard/io/text/FoldedLineWriter;->curLineLength:I

    .line 160
    add-int/lit8 v7, v6, 0x1

    .line 146
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 164
    :cond_4
    const/16 v8, 0xd

    if-ne v0, v8, :cond_7

    .line 165
    add-int/lit8 v8, v5, -0x1

    if-eq v6, v8, :cond_5

    add-int/lit8 v8, v6, 0x1

    aget-char v8, p1, v8

    const/16 v9, 0xa

    if-eq v8, v9, :cond_6

    .line 166
    :cond_5
    iget-object v8, p0, Lezvcard/io/text/FoldedLineWriter;->writer:Ljava/io/Writer;

    sub-int v9, v6, v7

    add-int/lit8 v9, v9, 0x1

    invoke-virtual {v8, p1, v7, v9}, Ljava/io/Writer;->write([CII)V

    .line 167
    const/4 v8, 0x0

    iput v8, p0, Lezvcard/io/text/FoldedLineWriter;->curLineLength:I

    .line 168
    add-int/lit8 v7, v6, 0x1

    goto :goto_2

    .line 170
    :cond_6
    iget v8, p0, Lezvcard/io/text/FoldedLineWriter;->curLineLength:I

    add-int/lit8 v8, v8, 0x1

    iput v8, p0, Lezvcard/io/text/FoldedLineWriter;->curLineLength:I

    goto :goto_2

    .line 175
    :cond_7
    const/16 v8, 0x3d

    if-ne v0, v8, :cond_8

    if-eqz p4, :cond_8

    .line 176
    const/4 v4, 0x0

    .line 179
    :cond_8
    iget v8, p0, Lezvcard/io/text/FoldedLineWriter;->curLineLength:I

    if-lt v8, v3, :cond_e

    .line 182
    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v8

    if-eqz v8, :cond_b

    .line 183
    :goto_3
    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v8

    if-eqz v8, :cond_9

    add-int/lit8 v8, v5, -0x1

    if-ge v6, v8, :cond_9

    .line 184
    add-int/lit8 v6, v6, 0x1

    .line 185
    aget-char v0, p1, v6

    goto :goto_3

    .line 187
    :cond_9
    add-int/lit8 v8, v5, -0x1

    if-lt v6, v8, :cond_b

    .line 217
    .end local v0    # "c":C
    :cond_a
    iget-object v8, p0, Lezvcard/io/text/FoldedLineWriter;->writer:Ljava/io/Writer;

    sub-int v9, v5, v7

    invoke-virtual {v8, p1, v7, v9}, Ljava/io/Writer;->write([CII)V

    goto/16 :goto_0

    .line 194
    .restart local v0    # "c":C
    :cond_b
    if-lez v4, :cond_c

    .line 195
    rsub-int/lit8 v8, v4, 0x3

    add-int/2addr v6, v8

    .line 196
    add-int/lit8 v8, v5, -0x1

    if-ge v6, v8, :cond_a

    .line 202
    :cond_c
    iget-object v8, p0, Lezvcard/io/text/FoldedLineWriter;->writer:Ljava/io/Writer;

    sub-int v9, v6, v7

    invoke-virtual {v8, p1, v7, v9}, Ljava/io/Writer;->write([CII)V

    .line 203
    if-eqz p4, :cond_d

    .line 204
    iget-object v8, p0, Lezvcard/io/text/FoldedLineWriter;->writer:Ljava/io/Writer;

    const/16 v9, 0x3d

    invoke-virtual {v8, v9}, Ljava/io/Writer;->write(I)V

    .line 206
    :cond_d
    iget-object v8, p0, Lezvcard/io/text/FoldedLineWriter;->writer:Ljava/io/Writer;

    iget-object v9, p0, Lezvcard/io/text/FoldedLineWriter;->newline:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 207
    iget-object v8, p0, Lezvcard/io/text/FoldedLineWriter;->writer:Ljava/io/Writer;

    iget-object v9, p0, Lezvcard/io/text/FoldedLineWriter;->indent:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 208
    iget-object v8, p0, Lezvcard/io/text/FoldedLineWriter;->indent:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    add-int/lit8 v8, v8, 0x1

    iput v8, p0, Lezvcard/io/text/FoldedLineWriter;->curLineLength:I

    .line 209
    move v7, v6

    .line 211
    goto/16 :goto_2

    .line 214
    :cond_e
    iget v8, p0, Lezvcard/io/text/FoldedLineWriter;->curLineLength:I

    add-int/lit8 v8, v8, 0x1

    iput v8, p0, Lezvcard/io/text/FoldedLineWriter;->curLineLength:I

    goto/16 :goto_2
.end method

.method public writeln(Ljava/lang/String;)V
    .locals 1
    .param p1, "str"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 75
    invoke-virtual {p0, p1}, Lezvcard/io/text/FoldedLineWriter;->write(Ljava/lang/String;)V

    .line 76
    iget-object v0, p0, Lezvcard/io/text/FoldedLineWriter;->newline:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lezvcard/io/text/FoldedLineWriter;->write(Ljava/lang/String;)V

    .line 77
    return-void
.end method
