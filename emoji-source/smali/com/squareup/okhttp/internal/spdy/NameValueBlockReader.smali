.class Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;
.super Ljava/lang/Object;
.source "NameValueBlockReader.java"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$FillableInflaterInputStream;
    }
.end annotation


# instance fields
.field private compressedLimit:I

.field private final fillableInflaterInputStream:Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$FillableInflaterInputStream;

.field private final nameValueBlockIn:Ljava/io/DataInputStream;


# direct methods
.method constructor <init>(Ljava/io/InputStream;)V
    .locals 4
    .param p1, "in"    # Ljava/io/InputStream;

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v1, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$1;

    invoke-direct {v1, p0, p1}, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$1;-><init>(Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;Ljava/io/InputStream;)V

    .line 63
    .local v1, "throttleStream":Ljava/io/InputStream;
    new-instance v0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$2;

    invoke-direct {v0, p0}, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$2;-><init>(Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;)V

    .line 75
    .local v0, "inflater":Ljava/util/zip/Inflater;
    new-instance v2, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$FillableInflaterInputStream;

    invoke-direct {v2, v1, v0}, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$FillableInflaterInputStream;-><init>(Ljava/io/InputStream;Ljava/util/zip/Inflater;)V

    iput-object v2, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->fillableInflaterInputStream:Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$FillableInflaterInputStream;

    .line 76
    new-instance v2, Ljava/io/DataInputStream;

    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->fillableInflaterInputStream:Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$FillableInflaterInputStream;

    invoke-direct {v2, v3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v2, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->nameValueBlockIn:Ljava/io/DataInputStream;

    .line 77
    return-void
.end method

.method static synthetic access$000(Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;)I
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;

    .prologue
    .line 36
    iget v0, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->compressedLimit:I

    return v0
.end method

.method static synthetic access$002(Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;I)I
    .locals 0
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;
    .param p1, "x1"    # I

    .prologue
    .line 36
    iput p1, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->compressedLimit:I

    return p1
.end method

.method private doneReading()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 118
    iget v0, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->compressedLimit:I

    if-nez v0, :cond_1

    .line 127
    :cond_0
    return-void

    .line 122
    :cond_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->fillableInflaterInputStream:Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$FillableInflaterInputStream;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader$FillableInflaterInputStream;->fill()V

    .line 124
    iget v0, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->compressedLimit:I

    if-eqz v0, :cond_0

    .line 125
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "compressedLimit > 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->compressedLimit:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private readString()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/zip/DataFormatException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 130
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->nameValueBlockIn:Ljava/io/DataInputStream;

    invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    .line 131
    .local v1, "length":I
    new-array v0, v1, [B

    .line 132
    .local v0, "bytes":[B
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->nameValueBlockIn:Ljava/io/DataInputStream;

    invoke-static {v2, v0}, Lcom/squareup/okhttp/internal/Util;->readFully(Ljava/io/InputStream;[B)V

    .line 133
    new-instance v2, Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "UTF-8"

    invoke-direct {v2, v0, v3, v1, v4}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    return-object v2
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
    .line 137
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->nameValueBlockIn:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->close()V

    .line 138
    return-void
.end method

.method public readNameValueBlock(I)Ljava/util/List;
    .locals 9
    .param p1, "length"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 91
    iget v6, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->compressedLimit:I

    add-int/2addr v6, p1

    iput v6, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->compressedLimit:I

    .line 93
    :try_start_0
    iget-object v6, p0, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->nameValueBlockIn:Ljava/io/DataInputStream;

    invoke-virtual {v6}, Ljava/io/DataInputStream;->readInt()I

    move-result v4

    .line 94
    .local v4, "numberOfPairs":I
    if-gez v4, :cond_0

    .line 95
    new-instance v6, Ljava/io/IOException;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "numberOfPairs < 0: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v6
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    .end local v4    # "numberOfPairs":I
    :catch_0
    move-exception v0

    .line 113
    .local v0, "e":Ljava/util/zip/DataFormatException;
    new-instance v6, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/util/zip/DataFormatException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 97
    .end local v0    # "e":Ljava/util/zip/DataFormatException;
    .restart local v4    # "numberOfPairs":I
    :cond_0
    const/16 v6, 0x400

    if-le v4, v6, :cond_1

    .line 98
    :try_start_1
    new-instance v6, Ljava/io/IOException;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "numberOfPairs > 1024: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 100
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    mul-int/lit8 v6, v4, 0x2

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    .local v1, "entries":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    if-ge v2, v4, :cond_3

    .line 102
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->readString()Ljava/lang/String;

    move-result-object v3

    .line 103
    .local v3, "name":Ljava/lang/String;
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->readString()Ljava/lang/String;

    move-result-object v5

    .line 104
    .local v5, "values":Ljava/lang/String;
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_2

    new-instance v6, Ljava/io/IOException;

    const-string v7, "name.length == 0"

    invoke-direct {v6, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 105
    :cond_2
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 109
    .end local v3    # "name":Ljava/lang/String;
    .end local v5    # "values":Ljava/lang/String;
    :cond_3
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/spdy/NameValueBlockReader;->doneReading()V
    :try_end_1
    .catch Ljava/util/zip/DataFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 111
    return-object v1
.end method
