.class Lcom/facebook/mqtt/a/d;
.super Lcom/facebook/mqtt/a/c;
.source "MessageDecoder.java"


# instance fields
.field private c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/facebook/mqtt/messages/h;Ljava/lang/Object;I)V
    .locals 0

    .prologue
    .line 213
    invoke-direct {p0, p1, p3}, Lcom/facebook/mqtt/a/c;-><init>(Lcom/facebook/mqtt/messages/h;I)V

    .line 214
    iput-object p2, p0, Lcom/facebook/mqtt/a/d;->c:Ljava/lang/Object;

    .line 215
    return-void
.end method

.method static synthetic a(Lcom/facebook/mqtt/a/d;Ljava/io/DataInputStream;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 208
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/d;->c(Ljava/io/DataInputStream;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private c(Ljava/io/DataInputStream;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 218
    sget-object v0, Lcom/facebook/mqtt/a/b;->a:[I

    iget-object v1, p0, Lcom/facebook/mqtt/a/d;->a:Lcom/facebook/mqtt/messages/h;

    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/h;->a()Lcom/facebook/mqtt/messages/k;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/k;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 235
    :pswitch_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 220
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/d;->d(Ljava/io/DataInputStream;)Lcom/facebook/mqtt/messages/d;

    move-result-object v0

    goto :goto_0

    .line 223
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/d;->e(Ljava/io/DataInputStream;)Lcom/facebook/mqtt/messages/s;

    move-result-object v0

    goto :goto_0

    .line 226
    :pswitch_3
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/d;->f(Ljava/io/DataInputStream;)Lcom/facebook/mqtt/messages/q;

    move-result-object v0

    goto :goto_0

    .line 229
    :pswitch_4
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/d;->g(Ljava/io/DataInputStream;)Lcom/facebook/mqtt/messages/w;

    move-result-object v0

    goto :goto_0

    .line 232
    :pswitch_5
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/d;->h(Ljava/io/DataInputStream;)[B

    move-result-object v0

    goto :goto_0

    .line 218
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_5
    .end packed-switch
.end method

.method private d(Ljava/io/DataInputStream;)Lcom/facebook/mqtt/messages/d;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 240
    iget-object v0, p0, Lcom/facebook/mqtt/a/d;->c:Ljava/lang/Object;

    check-cast v0, Lcom/facebook/mqtt/messages/f;

    .line 241
    invoke-virtual {p0, p1}, Lcom/facebook/mqtt/a/d;->a(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object v5

    .line 244
    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/f;->d()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 245
    invoke-virtual {p0, p1}, Lcom/facebook/mqtt/a/d;->a(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object v3

    .line 246
    invoke-virtual {p0, p1}, Lcom/facebook/mqtt/a/d;->a(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object v1

    .line 250
    :goto_0
    iget v4, p0, Lcom/facebook/mqtt/a/d;->b:I

    if-lez v4, :cond_2

    .line 251
    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/f;->b()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 252
    invoke-virtual {p0, p1}, Lcom/facebook/mqtt/a/d;->a(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object v4

    .line 254
    :goto_1
    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/f;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 255
    invoke-virtual {p0, p1}, Lcom/facebook/mqtt/a/d;->a(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object v2

    .line 258
    :cond_0
    :goto_2
    new-instance v0, Lcom/facebook/mqtt/messages/e;

    invoke-direct {v0}, Lcom/facebook/mqtt/messages/e;-><init>()V

    .line 259
    invoke-virtual {v0, v5}, Lcom/facebook/mqtt/messages/e;->a(Ljava/lang/String;)Lcom/facebook/mqtt/messages/e;

    .line 260
    invoke-virtual {v0, v3}, Lcom/facebook/mqtt/messages/e;->b(Ljava/lang/String;)Lcom/facebook/mqtt/messages/e;

    .line 261
    invoke-virtual {v0, v1}, Lcom/facebook/mqtt/messages/e;->c(Ljava/lang/String;)Lcom/facebook/mqtt/messages/e;

    .line 262
    invoke-virtual {v0, v4}, Lcom/facebook/mqtt/messages/e;->d(Ljava/lang/String;)Lcom/facebook/mqtt/messages/e;

    .line 263
    invoke-virtual {v0, v2}, Lcom/facebook/mqtt/messages/e;->e(Ljava/lang/String;)Lcom/facebook/mqtt/messages/e;

    .line 264
    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/e;->f()Lcom/facebook/mqtt/messages/d;

    move-result-object v0

    return-object v0

    :cond_1
    move-object v4, v2

    goto :goto_1

    :cond_2
    move-object v4, v2

    goto :goto_2

    :cond_3
    move-object v1, v2

    move-object v3, v2

    goto :goto_0
.end method

.method private e(Ljava/io/DataInputStream;)Lcom/facebook/mqtt/messages/s;
    .locals 4

    .prologue
    .line 268
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 269
    :goto_0
    iget v1, p0, Lcom/facebook/mqtt/a/d;->b:I

    if-lez v1, :cond_0

    .line 270
    invoke-virtual {p0, p1}, Lcom/facebook/mqtt/a/d;->a(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object v1

    .line 271
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v2

    .line 272
    iget v3, p0, Lcom/facebook/mqtt/a/d;->b:I

    add-int/lit8 v3, v3, -0x1

    iput v3, p0, Lcom/facebook/mqtt/a/d;->b:I

    .line 273
    new-instance v3, Lcom/facebook/mqtt/messages/SubscribeTopic;

    invoke-direct {v3, v1, v2}, Lcom/facebook/mqtt/messages/SubscribeTopic;-><init>(Ljava/lang/String;I)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 275
    :cond_0
    new-instance v1, Lcom/facebook/mqtt/messages/s;

    invoke-direct {v1, v0}, Lcom/facebook/mqtt/messages/s;-><init>(Ljava/util/List;)V

    return-object v1
.end method

.method private f(Ljava/io/DataInputStream;)Lcom/facebook/mqtt/messages/q;
    .locals 3

    .prologue
    .line 279
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 280
    :goto_0
    iget v1, p0, Lcom/facebook/mqtt/a/d;->b:I

    if-lez v1, :cond_0

    .line 281
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v1

    and-int/lit8 v1, v1, -0x4

    .line 282
    iget v2, p0, Lcom/facebook/mqtt/a/d;->b:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lcom/facebook/mqtt/a/d;->b:I

    .line 283
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 285
    :cond_0
    new-instance v1, Lcom/facebook/mqtt/messages/q;

    invoke-direct {v1, v0}, Lcom/facebook/mqtt/messages/q;-><init>(Ljava/util/List;)V

    return-object v1
.end method

.method private g(Ljava/io/DataInputStream;)Lcom/facebook/mqtt/messages/w;
    .locals 2

    .prologue
    .line 289
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 290
    :goto_0
    iget v1, p0, Lcom/facebook/mqtt/a/d;->b:I

    if-lez v1, :cond_0

    .line 291
    invoke-virtual {p0, p1}, Lcom/facebook/mqtt/a/d;->a(Ljava/io/DataInputStream;)Ljava/lang/String;

    move-result-object v1

    .line 292
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 294
    :cond_0
    new-instance v1, Lcom/facebook/mqtt/messages/w;

    invoke-direct {v1, v0}, Lcom/facebook/mqtt/messages/w;-><init>(Ljava/util/List;)V

    return-object v1
.end method

.method private h(Ljava/io/DataInputStream;)[B
    .locals 2

    .prologue
    .line 298
    iget v0, p0, Lcom/facebook/mqtt/a/d;->b:I

    new-array v0, v0, [B

    .line 299
    invoke-virtual {p1, v0}, Ljava/io/DataInputStream;->readFully([B)V

    .line 300
    const/4 v1, 0x0

    iput v1, p0, Lcom/facebook/mqtt/a/d;->b:I

    .line 301
    return-object v0
.end method
