.class public final Lcom/bumptech/glide/b/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:[B

.field private b:Ljava/nio/ByteBuffer;

.field private c:Lcom/bumptech/glide/b/d;

.field private d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/16 v0, 0x100

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/bumptech/glide/b/e;->a:[B

    .line 30
    const/4 v0, 0x0

    iput v0, p0, Lcom/bumptech/glide/b/e;->d:I

    return-void
.end method

.method private a(I)[I
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 274
    mul-int/lit8 v2, p1, 0x3

    .line 275
    const/4 v0, 0x0

    .line 276
    new-array v4, v2, [B

    .line 279
    :try_start_0
    iget-object v2, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 283
    const/16 v2, 0x100

    new-array v0, v2, [I

    move v2, v1

    .line 286
    :goto_0
    if-ge v2, p1, :cond_0

    .line 287
    add-int/lit8 v3, v1, 0x1

    aget-byte v1, v4, v1

    and-int/lit16 v5, v1, 0xff

    .line 288
    add-int/lit8 v6, v3, 0x1

    aget-byte v1, v4, v3

    and-int/lit16 v7, v1, 0xff

    .line 289
    add-int/lit8 v1, v6, 0x1

    aget-byte v3, v4, v6

    and-int/lit16 v6, v3, 0xff

    .line 290
    add-int/lit8 v3, v2, 0x1

    const/high16 v8, -0x1000000

    shl-int/lit8 v5, v5, 0x10

    or-int/2addr v5, v8

    shl-int/lit8 v7, v7, 0x8

    or-int/2addr v5, v7

    or-int/2addr v5, v6

    aput v5, v0, v2
    :try_end_0
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_0

    move v2, v3

    .line 291
    goto :goto_0

    .line 293
    :catch_0
    move-exception v1

    const-string v1, "GifHeaderParser"

    const/4 v2, 0x3

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 296
    iget-object v1, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    const/4 v2, 0x1

    iput v2, v1, Lcom/bumptech/glide/b/d;->b:I

    .line 299
    :cond_0
    return-object v0
.end method

.method private c()V
    .locals 10

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 81
    move v4, v2

    .line 82
    :cond_0
    :goto_0
    if-nez v4, :cond_a

    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->i()Z

    move-result v0

    if-nez v0, :cond_a

    .line 83
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->h()I

    move-result v0

    .line 84
    sparse-switch v0, :sswitch_data_0

    .line 139
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iput v1, v0, Lcom/bumptech/glide/b/d;->b:I

    goto :goto_0

    .line 90
    :sswitch_0
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v0, v0, Lcom/bumptech/glide/b/d;->d:Lcom/bumptech/glide/b/c;

    if-nez v0, :cond_1

    .line 91
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    new-instance v3, Lcom/bumptech/glide/b/c;

    invoke-direct {v3}, Lcom/bumptech/glide/b/c;-><init>()V

    iput-object v3, v0, Lcom/bumptech/glide/b/d;->d:Lcom/bumptech/glide/b/c;

    .line 1177
    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v0, v0, Lcom/bumptech/glide/b/d;->d:Lcom/bumptech/glide/b/c;

    .line 1368
    iget-object v3, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v3

    .line 1177
    iput v3, v0, Lcom/bumptech/glide/b/c;->a:I

    .line 1178
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v0, v0, Lcom/bumptech/glide/b/d;->d:Lcom/bumptech/glide/b/c;

    .line 2368
    iget-object v3, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v3

    .line 1178
    iput v3, v0, Lcom/bumptech/glide/b/c;->b:I

    .line 1179
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v0, v0, Lcom/bumptech/glide/b/d;->d:Lcom/bumptech/glide/b/c;

    .line 3368
    iget-object v3, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v3

    .line 1179
    iput v3, v0, Lcom/bumptech/glide/b/c;->c:I

    .line 1180
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v0, v0, Lcom/bumptech/glide/b/d;->d:Lcom/bumptech/glide/b/c;

    .line 4368
    iget-object v3, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v3

    .line 1180
    iput v3, v0, Lcom/bumptech/glide/b/c;->d:I

    .line 1182
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->h()I

    move-result v3

    .line 1184
    and-int/lit16 v0, v3, 0x80

    if-eqz v0, :cond_2

    move v0, v1

    .line 1185
    :goto_1
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    and-int/lit8 v5, v3, 0x7

    add-int/lit8 v5, v5, 0x1

    int-to-double v8, v5

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    double-to-int v5, v6

    .line 1189
    iget-object v6, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v6, v6, Lcom/bumptech/glide/b/d;->d:Lcom/bumptech/glide/b/c;

    and-int/lit8 v3, v3, 0x40

    if-eqz v3, :cond_3

    move v3, v1

    :goto_2
    iput-boolean v3, v6, Lcom/bumptech/glide/b/c;->e:Z

    .line 1190
    if-eqz v0, :cond_4

    .line 1192
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v0, v0, Lcom/bumptech/glide/b/d;->d:Lcom/bumptech/glide/b/c;

    invoke-direct {p0, v5}, Lcom/bumptech/glide/b/e;->a(I)[I

    move-result-object v3

    iput-object v3, v0, Lcom/bumptech/glide/b/c;->k:[I

    .line 1199
    :goto_3
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v0, v0, Lcom/bumptech/glide/b/d;->d:Lcom/bumptech/glide/b/c;

    iget-object v3, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->position()I

    move-result v3

    iput v3, v0, Lcom/bumptech/glide/b/c;->j:I

    .line 5307
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->h()I

    .line 5309
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->f()V

    .line 1204
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1208
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget v3, v0, Lcom/bumptech/glide/b/d;->c:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v0, Lcom/bumptech/glide/b/d;->c:I

    .line 1210
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v0, v0, Lcom/bumptech/glide/b/d;->e:Ljava/util/List;

    iget-object v3, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v3, v3, Lcom/bumptech/glide/b/d;->d:Lcom/bumptech/glide/b/c;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_2
    move v0, v2

    .line 1184
    goto :goto_1

    :cond_3
    move v3, v2

    .line 1189
    goto :goto_2

    .line 1195
    :cond_4
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v0, v0, Lcom/bumptech/glide/b/d;->d:Lcom/bumptech/glide/b/c;

    const/4 v3, 0x0

    iput-object v3, v0, Lcom/bumptech/glide/b/c;->k:[I

    goto :goto_3

    .line 97
    :sswitch_1
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->h()I

    move-result v0

    .line 98
    sparse-switch v0, :sswitch_data_1

    .line 129
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->f()V

    goto/16 :goto_0

    .line 102
    :sswitch_2
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    new-instance v3, Lcom/bumptech/glide/b/c;

    invoke-direct {v3}, Lcom/bumptech/glide/b/c;-><init>()V

    iput-object v3, v0, Lcom/bumptech/glide/b/d;->d:Lcom/bumptech/glide/b/c;

    .line 6149
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->h()I

    .line 6151
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->h()I

    move-result v0

    .line 6153
    iget-object v3, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v3, v3, Lcom/bumptech/glide/b/d;->d:Lcom/bumptech/glide/b/c;

    and-int/lit8 v5, v0, 0x1c

    shr-int/lit8 v5, v5, 0x2

    iput v5, v3, Lcom/bumptech/glide/b/c;->g:I

    .line 6154
    iget-object v3, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v3, v3, Lcom/bumptech/glide/b/d;->d:Lcom/bumptech/glide/b/c;

    iget v3, v3, Lcom/bumptech/glide/b/c;->g:I

    if-nez v3, :cond_5

    .line 6156
    iget-object v3, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v3, v3, Lcom/bumptech/glide/b/d;->d:Lcom/bumptech/glide/b/c;

    iput v1, v3, Lcom/bumptech/glide/b/c;->g:I

    .line 6158
    :cond_5
    iget-object v3, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v3, v3, Lcom/bumptech/glide/b/d;->d:Lcom/bumptech/glide/b/c;

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_7

    move v0, v1

    :goto_4
    iput-boolean v0, v3, Lcom/bumptech/glide/b/c;->f:Z

    .line 6368
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    .line 6162
    const/4 v3, 0x3

    if-ge v0, v3, :cond_6

    .line 6163
    const/16 v0, 0xa

    .line 6165
    :cond_6
    iget-object v3, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v3, v3, Lcom/bumptech/glide/b/d;->d:Lcom/bumptech/glide/b/c;

    mul-int/lit8 v0, v0, 0xa

    iput v0, v3, Lcom/bumptech/glide/b/c;->i:I

    .line 6167
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v0, v0, Lcom/bumptech/glide/b/d;->d:Lcom/bumptech/glide/b/c;

    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->h()I

    move-result v3

    iput v3, v0, Lcom/bumptech/glide/b/c;->h:I

    .line 6169
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->h()I

    goto/16 :goto_0

    :cond_7
    move v0, v2

    .line 6158
    goto :goto_4

    .line 107
    :sswitch_3
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->g()I

    .line 108
    const-string v0, ""

    move-object v3, v0

    move v0, v2

    .line 109
    :goto_5
    const/16 v5, 0xb

    if-ge v0, v5, :cond_8

    .line 110
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v5, p0, Lcom/bumptech/glide/b/e;->a:[B

    aget-byte v5, v5, v0

    int-to-char v5, v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 109
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 112
    :cond_8
    const-string v0, "NETSCAPE2.0"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 113
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->d()V

    goto/16 :goto_0

    .line 116
    :cond_9
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->f()V

    goto/16 :goto_0

    .line 121
    :sswitch_4
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->f()V

    goto/16 :goto_0

    .line 125
    :sswitch_5
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->f()V

    goto/16 :goto_0

    :sswitch_6
    move v4, v1

    .line 135
    goto/16 :goto_0

    .line 142
    :cond_a
    return-void

    .line 84
    :sswitch_data_0
    .sparse-switch
        0x21 -> :sswitch_1
        0x2c -> :sswitch_0
        0x3b -> :sswitch_6
    .end sparse-switch

    .line 98
    :sswitch_data_1
    .sparse-switch
        0x1 -> :sswitch_5
        0xf9 -> :sswitch_2
        0xfe -> :sswitch_4
        0xff -> :sswitch_3
    .end sparse-switch
.end method

.method private d()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 217
    :cond_0
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->g()I

    .line 218
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->a:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    if-ne v0, v3, :cond_1

    .line 220
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->a:[B

    aget-byte v0, v0, v3

    and-int/lit16 v0, v0, 0xff

    .line 221
    iget-object v1, p0, Lcom/bumptech/glide/b/e;->a:[B

    const/4 v2, 0x2

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    .line 222
    iget-object v2, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    iput v0, v2, Lcom/bumptech/glide/b/d;->m:I

    .line 224
    :cond_1
    iget v0, p0, Lcom/bumptech/glide/b/e;->d:I

    if-lez v0, :cond_2

    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 225
    :cond_2
    return-void
.end method

.method private e()V
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 232
    const-string v2, ""

    move-object v3, v2

    move v2, v1

    .line 233
    :goto_0
    const/4 v4, 0x6

    if-ge v2, v4, :cond_0

    .line 234
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->h()I

    move-result v4

    int-to-char v4, v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 233
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 236
    :cond_0
    const-string v2, "GIF"

    invoke-virtual {v3, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 237
    iget-object v1, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iput v0, v1, Lcom/bumptech/glide/b/d;->b:I

    .line 245
    :cond_1
    :goto_1
    return-void

    .line 7251
    :cond_2
    iget-object v2, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    .line 7368
    iget-object v3, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v3

    .line 7251
    iput v3, v2, Lcom/bumptech/glide/b/d;->f:I

    .line 7252
    iget-object v2, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    .line 8368
    iget-object v3, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v3

    .line 7252
    iput v3, v2, Lcom/bumptech/glide/b/d;->g:I

    .line 7254
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->h()I

    move-result v2

    .line 7256
    iget-object v3, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    and-int/lit16 v4, v2, 0x80

    if-eqz v4, :cond_3

    :goto_2
    iput-boolean v0, v3, Lcom/bumptech/glide/b/d;->h:Z

    .line 7260
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    const/4 v1, 0x2

    and-int/lit8 v2, v2, 0x7

    shl-int/2addr v1, v2

    iput v1, v0, Lcom/bumptech/glide/b/d;->i:I

    .line 7262
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->h()I

    move-result v1

    iput v1, v0, Lcom/bumptech/glide/b/d;->j:I

    .line 7264
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->h()I

    move-result v1

    iput v1, v0, Lcom/bumptech/glide/b/d;->k:I

    .line 241
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-boolean v0, v0, Lcom/bumptech/glide/b/d;->h:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 242
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v1, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget v1, v1, Lcom/bumptech/glide/b/d;->i:I

    invoke-direct {p0, v1}, Lcom/bumptech/glide/b/e;->a(I)[I

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/b/d;->a:[I

    .line 243
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v1, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget-object v1, v1, Lcom/bumptech/glide/b/d;->a:[I

    iget-object v2, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget v2, v2, Lcom/bumptech/glide/b/d;->j:I

    aget v1, v1, v2

    iput v1, v0, Lcom/bumptech/glide/b/d;->l:I

    goto :goto_1

    :cond_3
    move v0, v1

    .line 7256
    goto :goto_2
.end method

.method private f()V
    .locals 3

    .prologue
    .line 318
    :cond_0
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->h()I

    move-result v0

    .line 319
    iget-object v1, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->position()I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 320
    if-gtz v0, :cond_0

    .line 321
    return-void
.end method

.method private g()I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 329
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->h()I

    move-result v1

    iput v1, p0, Lcom/bumptech/glide/b/e;->d:I

    .line 331
    iget v1, p0, Lcom/bumptech/glide/b/e;->d:I

    if-lez v1, :cond_1

    move v1, v0

    .line 334
    :goto_0
    :try_start_0
    iget v2, p0, Lcom/bumptech/glide/b/e;->d:I

    if-ge v0, v2, :cond_1

    .line 335
    iget v1, p0, Lcom/bumptech/glide/b/e;->d:I

    sub-int/2addr v1, v0

    .line 336
    iget-object v2, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    iget-object v3, p0, Lcom/bumptech/glide/b/e;->a:[B

    invoke-virtual {v2, v3, v0, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 338
    add-int/2addr v0, v1

    goto :goto_0

    .line 341
    :catch_0
    move-exception v2

    const-string v2, "GifHeaderParser"

    const/4 v3, 0x3

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 342
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error Reading Block n: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " count: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " blockSize: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/bumptech/glide/b/e;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 344
    :cond_0
    iget-object v1, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    const/4 v2, 0x1

    iput v2, v1, Lcom/bumptech/glide/b/d;->b:I

    .line 347
    :cond_1
    return v0
.end method

.method private h()I
    .locals 3

    .prologue
    .line 354
    const/4 v0, 0x0

    .line 356
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    and-int/lit16 v0, v0, 0xff

    .line 360
    :goto_0
    return v0

    .line 358
    :catch_0
    move-exception v1

    iget-object v1, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    const/4 v2, 0x1

    iput v2, v1, Lcom/bumptech/glide/b/d;->b:I

    goto :goto_0
.end method

.method private i()Z
    .locals 1

    .prologue
    .line 372
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget v0, v0, Lcom/bumptech/glide/b/d;->b:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a([B)Lcom/bumptech/glide/b/e;
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 33
    .line 1051
    iput-object v2, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    .line 1052
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->a:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([BB)V

    .line 1053
    new-instance v0, Lcom/bumptech/glide/b/d;

    invoke-direct {v0}, Lcom/bumptech/glide/b/d;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    .line 1054
    iput v1, p0, Lcom/bumptech/glide/b/e;->d:I

    .line 34
    if-eqz p1, :cond_0

    .line 35
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    .line 36
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 37
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 42
    :goto_0
    return-object p0

    .line 39
    :cond_0
    iput-object v2, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    .line 40
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    const/4 v1, 0x2

    iput v1, v0, Lcom/bumptech/glide/b/d;->b:I

    goto :goto_0
.end method

.method public final a()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 46
    iput-object v0, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    .line 47
    iput-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    .line 48
    return-void
.end method

.method public final b()Lcom/bumptech/glide/b/d;
    .locals 2

    .prologue
    .line 58
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->b:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must call setData() before parseHeader()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 61
    :cond_0
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 62
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    .line 73
    :goto_0
    return-object v0

    .line 65
    :cond_1
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->e()V

    .line 66
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->i()Z

    move-result v0

    if-nez v0, :cond_2

    .line 67
    invoke-direct {p0}, Lcom/bumptech/glide/b/e;->c()V

    .line 68
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    iget v0, v0, Lcom/bumptech/glide/b/d;->c:I

    if-gez v0, :cond_2

    .line 69
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    const/4 v1, 0x1

    iput v1, v0, Lcom/bumptech/glide/b/d;->b:I

    .line 73
    :cond_2
    iget-object v0, p0, Lcom/bumptech/glide/b/e;->c:Lcom/bumptech/glide/b/d;

    goto :goto_0
.end method
