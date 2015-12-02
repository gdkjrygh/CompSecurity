.class public Lcom/facebook/mqtt/a/f;
.super Ljava/lang/Object;
.source "MessageEncoder.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Ljava/io/DataOutputStream;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 35
    const-class v0, Lcom/facebook/mqtt/a/f;

    sput-object v0, Lcom/facebook/mqtt/a/f;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    return-void
.end method

.method private a(Lcom/facebook/mqtt/messages/f;)I
    .locals 2

    .prologue
    .line 218
    const/4 v0, 0x0

    .line 219
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/f;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 220
    const/16 v0, 0x80

    .line 222
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/f;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 223
    or-int/lit8 v0, v0, 0x40

    .line 225
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/f;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 226
    or-int/lit8 v0, v0, 0x20

    .line 228
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/f;->f()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    or-int/2addr v0, v1

    .line 229
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/f;->d()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 230
    or-int/lit8 v0, v0, 0x4

    .line 232
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/f;->g()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 233
    or-int/lit8 v0, v0, 0x2

    .line 235
    :cond_4
    return v0
.end method

.method private a(Lcom/facebook/mqtt/messages/h;)I
    .locals 2

    .prologue
    .line 382
    const/4 v0, 0x0

    .line 383
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/h;->a()Lcom/facebook/mqtt/messages/k;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/k;->toInt()I

    move-result v1

    shl-int/lit8 v1, v1, 0x4

    or-int/2addr v0, v1

    .line 384
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/h;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 385
    or-int/lit8 v0, v0, 0x8

    .line 387
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/h;->c()I

    move-result v1

    shl-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    .line 388
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/h;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 389
    or-int/lit8 v0, v0, 0x1

    .line 391
    :cond_1
    return v0
.end method

.method private a(I)V
    .locals 2

    .prologue
    .line 396
    :cond_0
    rem-int/lit16 v0, p1, 0x80

    .line 397
    div-int/lit16 p1, p1, 0x80

    .line 398
    if-lez p1, :cond_1

    .line 399
    or-int/lit16 v0, v0, 0x80

    .line 401
    :cond_1
    iget-object v1, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 402
    if-gtz p1, :cond_0

    .line 403
    return-void
.end method

.method private a(Lcom/facebook/mqtt/messages/a;)V
    .locals 2

    .prologue
    .line 239
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/a;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/h;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 240
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 241
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 242
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/a;->a()Lcom/facebook/mqtt/messages/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/b;->a()B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 243
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 244
    return-void
.end method

.method private a(Lcom/facebook/mqtt/messages/c;)V
    .locals 11

    .prologue
    const/4 v10, 0x0

    .line 144
    const/16 v5, 0xc

    .line 147
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/c;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v6

    .line 148
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/c;->a()Lcom/facebook/mqtt/messages/f;

    move-result-object v7

    .line 149
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/c;->c()Lcom/facebook/mqtt/messages/d;

    move-result-object v4

    .line 152
    invoke-virtual {v4}, Lcom/facebook/mqtt/messages/d;->a()Ljava/lang/String;

    move-result-object v0

    .line 153
    invoke-direct {p0, v0}, Lcom/facebook/mqtt/a/f;->a(Ljava/lang/String;)[B

    move-result-object v8

    .line 154
    array-length v0, v8

    add-int/lit8 v0, v0, 0x2

    add-int v2, v10, v0

    .line 158
    invoke-virtual {v4}, Lcom/facebook/mqtt/messages/d;->b()Ljava/lang/String;

    move-result-object v0

    .line 159
    if-eqz v0, :cond_6

    invoke-direct {p0, v0}, Lcom/facebook/mqtt/a/f;->a(Ljava/lang/String;)[B

    move-result-object v0

    .line 160
    :goto_0
    invoke-virtual {v4}, Lcom/facebook/mqtt/messages/d;->c()Ljava/lang/String;

    move-result-object v1

    .line 161
    if-eqz v1, :cond_7

    invoke-direct {p0, v1}, Lcom/facebook/mqtt/a/f;->a(Ljava/lang/String;)[B

    move-result-object v1

    .line 162
    :goto_1
    invoke-virtual {v7}, Lcom/facebook/mqtt/messages/f;->d()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 163
    array-length v3, v0

    add-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 164
    array-length v3, v1

    add-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    .line 167
    :cond_0
    invoke-virtual {v4}, Lcom/facebook/mqtt/messages/d;->d()Ljava/lang/String;

    move-result-object v3

    .line 168
    if-eqz v3, :cond_8

    invoke-direct {p0, v3}, Lcom/facebook/mqtt/a/f;->a(Ljava/lang/String;)[B

    move-result-object v3

    .line 169
    :goto_2
    invoke-virtual {v7}, Lcom/facebook/mqtt/messages/f;->b()Z

    move-result v9

    if-eqz v9, :cond_1

    .line 170
    array-length v9, v3

    add-int/lit8 v9, v9, 0x2

    add-int/2addr v2, v9

    .line 173
    :cond_1
    invoke-virtual {v4}, Lcom/facebook/mqtt/messages/d;->e()Ljava/lang/String;

    move-result-object v4

    .line 174
    if-eqz v4, :cond_9

    invoke-direct {p0, v4}, Lcom/facebook/mqtt/a/f;->a(Ljava/lang/String;)[B

    move-result-object v4

    .line 175
    :goto_3
    invoke-virtual {v7}, Lcom/facebook/mqtt/messages/f;->c()Z

    move-result v9

    if-eqz v9, :cond_2

    .line 176
    array-length v9, v4

    add-int/lit8 v9, v9, 0x2

    add-int/2addr v2, v9

    .line 180
    :cond_2
    add-int/2addr v2, v5

    .line 181
    iget-object v5, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-direct {p0, v6}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/h;)I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 182
    invoke-direct {p0, v2}, Lcom/facebook/mqtt/a/f;->a(I)V

    .line 185
    iget-object v2, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v2, v10}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 186
    iget-object v2, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    const/4 v5, 0x6

    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 187
    iget-object v2, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    const/16 v5, 0x4d

    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 188
    iget-object v2, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    const/16 v5, 0x51

    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 189
    iget-object v2, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    const/16 v5, 0x49

    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 190
    iget-object v2, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    const/16 v5, 0x73

    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 191
    iget-object v2, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    const/16 v5, 0x64

    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 192
    iget-object v2, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    const/16 v5, 0x70

    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 193
    iget-object v2, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v7}, Lcom/facebook/mqtt/messages/f;->a()I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->write(I)V

    .line 194
    iget-object v2, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-direct {p0, v7}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/f;)I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->write(I)V

    .line 195
    iget-object v2, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v7}, Lcom/facebook/mqtt/messages/f;->h()I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 198
    iget-object v2, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    array-length v5, v8

    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 199
    iget-object v2, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    array-length v5, v8

    invoke-virtual {v2, v8, v10, v5}, Ljava/io/DataOutputStream;->write([BII)V

    .line 200
    invoke-virtual {v7}, Lcom/facebook/mqtt/messages/f;->d()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 201
    iget-object v2, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    array-length v5, v0

    invoke-virtual {v2, v5}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 202
    iget-object v2, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    array-length v5, v0

    invoke-virtual {v2, v0, v10, v5}, Ljava/io/DataOutputStream;->write([BII)V

    .line 203
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    array-length v2, v1

    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 204
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    array-length v2, v1

    invoke-virtual {v0, v1, v10, v2}, Ljava/io/DataOutputStream;->write([BII)V

    .line 206
    :cond_3
    invoke-virtual {v7}, Lcom/facebook/mqtt/messages/f;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 207
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    array-length v1, v3

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 208
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    array-length v1, v3

    invoke-virtual {v0, v3, v10, v1}, Ljava/io/DataOutputStream;->write([BII)V

    .line 210
    :cond_4
    invoke-virtual {v7}, Lcom/facebook/mqtt/messages/f;->c()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 211
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    array-length v1, v4

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 212
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    array-length v1, v4

    invoke-virtual {v0, v4, v10, v1}, Ljava/io/DataOutputStream;->write([BII)V

    .line 214
    :cond_5
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 215
    return-void

    .line 159
    :cond_6
    new-array v0, v10, [B

    goto/16 :goto_0

    .line 161
    :cond_7
    new-array v1, v10, [B

    goto/16 :goto_1

    .line 168
    :cond_8
    new-array v3, v10, [B

    goto/16 :goto_2

    .line 174
    :cond_9
    new-array v4, v10, [B

    goto/16 :goto_3
.end method

.method private a(Lcom/facebook/mqtt/messages/m;)V
    .locals 3

    .prologue
    .line 358
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/m;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v0

    .line 359
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/m;->a()Lcom/facebook/mqtt/messages/j;

    move-result-object v1

    .line 361
    iget-object v2, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-direct {p0, v0}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/h;)I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 362
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/facebook/mqtt/a/f;->a(I)V

    .line 363
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/j;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 364
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 365
    return-void
.end method

.method private a(Lcom/facebook/mqtt/messages/n;)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 334
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/n;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v2

    .line 335
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/n;->a()Lcom/facebook/mqtt/messages/o;

    move-result-object v3

    .line 336
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/n;->c()[B

    move-result-object v4

    .line 338
    invoke-virtual {v3}, Lcom/facebook/mqtt/messages/o;->a()Ljava/lang/String;

    move-result-object v0

    .line 339
    invoke-direct {p0, v0}, Lcom/facebook/mqtt/a/f;->a(Ljava/lang/String;)[B

    move-result-object v5

    .line 341
    array-length v0, v5

    add-int/lit8 v6, v0, 0x2

    invoke-virtual {v2}, Lcom/facebook/mqtt/messages/h;->c()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x2

    :goto_0
    add-int/2addr v0, v6

    .line 343
    array-length v6, v4

    .line 344
    add-int/2addr v0, v6

    .line 346
    iget-object v6, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-direct {p0, v2}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/h;)I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 347
    invoke-direct {p0, v0}, Lcom/facebook/mqtt/a/f;->a(I)V

    .line 348
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    array-length v6, v5

    invoke-virtual {v0, v6}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 349
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    array-length v6, v5

    invoke-virtual {v0, v5, v1, v6}, Ljava/io/DataOutputStream;->write([BII)V

    .line 350
    invoke-virtual {v2}, Lcom/facebook/mqtt/messages/h;->c()I

    move-result v0

    if-lez v0, :cond_0

    .line 351
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v3}, Lcom/facebook/mqtt/messages/o;->b()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 353
    :cond_0
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    array-length v2, v4

    invoke-virtual {v0, v4, v1, v2}, Ljava/io/DataOutputStream;->write([BII)V

    .line 354
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 355
    return-void

    :cond_1
    move v0, v1

    .line 341
    goto :goto_0
.end method

.method private a(Lcom/facebook/mqtt/messages/p;)V
    .locals 3

    .prologue
    .line 313
    const/4 v0, 0x2

    .line 314
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/p;->c()Lcom/facebook/mqtt/messages/q;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/q;->a()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->size()I

    move-result v1

    .line 315
    add-int/2addr v0, v1

    .line 316
    iget-object v1, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/p;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/h;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 317
    invoke-direct {p0, v0}, Lcom/facebook/mqtt/a/f;->a(I)V

    .line 318
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/p;->a()Lcom/facebook/mqtt/messages/j;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/j;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 319
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/p;->c()Lcom/facebook/mqtt/messages/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/q;->a()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 320
    iget-object v2, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeByte(I)V

    goto :goto_0

    .line 322
    :cond_0
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 323
    return-void
.end method

.method private a(Lcom/facebook/mqtt/messages/r;)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 247
    const/4 v3, 0x2

    .line 250
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/r;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v4

    .line 251
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/r;->a()Lcom/facebook/mqtt/messages/j;

    move-result-object v5

    .line 252
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/r;->c()Lcom/facebook/mqtt/messages/s;

    move-result-object v6

    .line 254
    invoke-virtual {v6}, Lcom/facebook/mqtt/messages/s;->a()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v1, v2

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/messages/SubscribeTopic;

    .line 255
    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/SubscribeTopic;->a()Ljava/lang/String;

    move-result-object v0

    .line 256
    invoke-direct {p0, v0}, Lcom/facebook/mqtt/a/f;->a(Ljava/lang/String;)[B

    move-result-object v0

    .line 257
    array-length v0, v0

    add-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v1

    .line 258
    add-int/lit8 v0, v0, 0x1

    move v1, v0

    .line 259
    goto :goto_0

    .line 262
    :cond_0
    add-int v0, v3, v1

    .line 263
    iget-object v1, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-direct {p0, v4}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/h;)I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 264
    invoke-direct {p0, v0}, Lcom/facebook/mqtt/a/f;->a(I)V

    .line 267
    invoke-virtual {v5}, Lcom/facebook/mqtt/messages/j;->a()I

    move-result v0

    .line 268
    iget-object v1, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 271
    invoke-virtual {v6}, Lcom/facebook/mqtt/messages/s;->a()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/messages/SubscribeTopic;

    .line 272
    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/SubscribeTopic;->a()Ljava/lang/String;

    move-result-object v3

    .line 273
    invoke-direct {p0, v3}, Lcom/facebook/mqtt/a/f;->a(Ljava/lang/String;)[B

    move-result-object v3

    .line 274
    iget-object v4, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    array-length v5, v3

    invoke-virtual {v4, v5}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 275
    iget-object v4, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    array-length v5, v3

    invoke-virtual {v4, v3, v2, v5}, Ljava/io/DataOutputStream;->write([BII)V

    .line 276
    iget-object v3, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/SubscribeTopic;->b()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->write(I)V

    goto :goto_1

    .line 278
    :cond_1
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 279
    return-void
.end method

.method private a(Lcom/facebook/mqtt/messages/u;)V
    .locals 3

    .prologue
    .line 326
    const/4 v0, 0x2

    .line 327
    iget-object v1, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/u;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/h;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 328
    invoke-direct {p0, v0}, Lcom/facebook/mqtt/a/f;->a(I)V

    .line 329
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/u;->a()Lcom/facebook/mqtt/messages/j;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/mqtt/messages/j;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 330
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 331
    return-void
.end method

.method private a(Lcom/facebook/mqtt/messages/v;)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 282
    const/4 v3, 0x2

    .line 285
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/v;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v4

    .line 286
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/v;->a()Lcom/facebook/mqtt/messages/j;

    move-result-object v5

    .line 287
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/v;->c()Lcom/facebook/mqtt/messages/w;

    move-result-object v6

    .line 289
    invoke-virtual {v6}, Lcom/facebook/mqtt/messages/w;->a()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v1, v2

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 290
    invoke-direct {p0, v0}, Lcom/facebook/mqtt/a/f;->a(Ljava/lang/String;)[B

    move-result-object v0

    .line 291
    array-length v0, v0

    add-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v1

    move v1, v0

    .line 292
    goto :goto_0

    .line 295
    :cond_0
    add-int v0, v3, v1

    .line 296
    iget-object v1, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-direct {p0, v4}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/h;)I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 297
    invoke-direct {p0, v0}, Lcom/facebook/mqtt/a/f;->a(I)V

    .line 300
    invoke-virtual {v5}, Lcom/facebook/mqtt/messages/j;->a()I

    move-result v0

    .line 301
    iget-object v1, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 304
    invoke-virtual {v6}, Lcom/facebook/mqtt/messages/w;->a()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 305
    invoke-direct {p0, v0}, Lcom/facebook/mqtt/a/f;->a(Ljava/lang/String;)[B

    move-result-object v0

    .line 306
    iget-object v3, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    array-length v4, v0

    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 307
    iget-object v3, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    array-length v4, v0

    invoke-virtual {v3, v0, v2, v4}, Ljava/io/DataOutputStream;->write([BII)V

    goto :goto_1

    .line 309
    :cond_1
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 310
    return-void
.end method

.method private a(Ljava/lang/String;)[B
    .locals 2

    .prologue
    .line 416
    :try_start_0
    const-string v0, "utf-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 417
    :catch_0
    move-exception v0

    .line 418
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private b(Lcom/facebook/mqtt/messages/l;)V
    .locals 2

    .prologue
    .line 368
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/l;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v0

    .line 369
    iget-object v1, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-direct {p0, v0}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/h;)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 370
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 371
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 372
    return-void
.end method

.method private c(Lcom/facebook/mqtt/messages/l;)V
    .locals 2

    .prologue
    .line 375
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/l;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v0

    .line 376
    iget-object v1, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-direct {p0, v0}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/h;)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 377
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 378
    iget-object v0, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 379
    return-void
.end method


# virtual methods
.method public declared-synchronized a(Lcom/facebook/mqtt/messages/l;)V
    .locals 5

    .prologue
    .line 44
    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/l;->e()Lcom/facebook/mqtt/messages/k;

    move-result-object v0

    .line 45
    sget-object v1, Lcom/facebook/mqtt/a/g;->a:[I

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/k;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 137
    sget-object v1, Lcom/facebook/mqtt/a/f;->a:Ljava/lang/Class;

    const-string v2, "MQTT Packet unexpected send: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/k;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown message type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/l;->e()Lcom/facebook/mqtt/messages/k;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/mqtt/messages/k;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 47
    :pswitch_0
    :try_start_1
    instance-of v1, p1, Lcom/facebook/mqtt/messages/a;

    if-nez v1, :cond_0

    .line 48
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 50
    :cond_0
    check-cast p1, Lcom/facebook/mqtt/messages/a;

    .line 51
    sget-object v1, Lcom/facebook/mqtt/a/f;->a:Ljava/lang/Class;

    const-string v2, "MQTT Packet sending: %s retcode:%d"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/k;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/a;->a()Lcom/facebook/mqtt/messages/b;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/mqtt/messages/b;->a()B

    move-result v4

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    :goto_0
    monitor-exit p0

    return-void

    .line 57
    :pswitch_1
    :try_start_2
    instance-of v1, p1, Lcom/facebook/mqtt/messages/r;

    if-nez v1, :cond_1

    .line 58
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 60
    :cond_1
    check-cast p1, Lcom/facebook/mqtt/messages/r;

    .line 61
    sget-object v1, Lcom/facebook/mqtt/a/f;->a:Ljava/lang/Class;

    const-string v2, "MQTT Packet sending: %s topics:%s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/k;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/r;->c()Lcom/facebook/mqtt/messages/s;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/mqtt/messages/s;->a()Lcom/google/common/a/es;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/r;)V

    goto :goto_0

    .line 67
    :pswitch_2
    instance-of v1, p1, Lcom/facebook/mqtt/messages/p;

    if-nez v1, :cond_2

    .line 68
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 70
    :cond_2
    check-cast p1, Lcom/facebook/mqtt/messages/p;

    .line 71
    sget-object v1, Lcom/facebook/mqtt/a/f;->a:Ljava/lang/Class;

    const-string v2, "MQTT Packet sending: %s id:%d"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/k;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/p;->a()Lcom/facebook/mqtt/messages/j;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/mqtt/messages/j;->a()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/p;)V

    goto/16 :goto_0

    .line 76
    :pswitch_3
    instance-of v1, p1, Lcom/facebook/mqtt/messages/v;

    if-nez v1, :cond_3

    .line 77
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 79
    :cond_3
    check-cast p1, Lcom/facebook/mqtt/messages/v;

    .line 80
    sget-object v1, Lcom/facebook/mqtt/a/f;->a:Ljava/lang/Class;

    const-string v2, "MQTT Packet sending: %s topics:%s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/k;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/v;->c()Lcom/facebook/mqtt/messages/w;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/mqtt/messages/w;->a()Lcom/google/common/a/es;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/v;)V

    goto/16 :goto_0

    .line 85
    :pswitch_4
    instance-of v1, p1, Lcom/facebook/mqtt/messages/u;

    if-nez v1, :cond_4

    .line 86
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 88
    :cond_4
    check-cast p1, Lcom/facebook/mqtt/messages/u;

    .line 89
    sget-object v1, Lcom/facebook/mqtt/a/f;->a:Ljava/lang/Class;

    const-string v2, "MQTT Packet sending: %s id:%d"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/k;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/u;->a()Lcom/facebook/mqtt/messages/j;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/mqtt/messages/j;->a()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/u;)V

    goto/16 :goto_0

    .line 95
    :pswitch_5
    instance-of v1, p1, Lcom/facebook/mqtt/messages/n;

    if-nez v1, :cond_5

    .line 96
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 98
    :cond_5
    check-cast p1, Lcom/facebook/mqtt/messages/n;

    .line 99
    sget-object v1, Lcom/facebook/mqtt/a/f;->a:Ljava/lang/Class;

    const-string v2, "MQTT Packet sending: %s id:%d qos:%d topic:%s"

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/k;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/n;->a()Lcom/facebook/mqtt/messages/o;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/mqtt/messages/o;->b()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v0

    const/4 v0, 0x2

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/n;->f()Lcom/facebook/mqtt/messages/h;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/mqtt/messages/h;->c()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v0

    const/4 v0, 0x3

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/n;->a()Lcom/facebook/mqtt/messages/o;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/mqtt/messages/o;->a()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/n;)V

    goto/16 :goto_0

    .line 107
    :pswitch_6
    instance-of v1, p1, Lcom/facebook/mqtt/messages/m;

    if-nez v1, :cond_6

    .line 108
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 110
    :cond_6
    check-cast p1, Lcom/facebook/mqtt/messages/m;

    .line 111
    sget-object v1, Lcom/facebook/mqtt/a/f;->a:Ljava/lang/Class;

    const-string v2, "MQTT Packet sending: %s id:%d"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/k;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/m;->a()Lcom/facebook/mqtt/messages/j;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/mqtt/messages/j;->a()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/m;)V

    goto/16 :goto_0

    .line 117
    :pswitch_7
    sget-object v1, Lcom/facebook/mqtt/a/f;->a:Ljava/lang/Class;

    const-string v2, "MQTT Packet sending: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/k;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/f;->b(Lcom/facebook/mqtt/messages/l;)V

    goto/16 :goto_0

    .line 122
    :pswitch_8
    sget-object v1, Lcom/facebook/mqtt/a/f;->a:Ljava/lang/Class;

    const-string v2, "MQTT Packet sending: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/k;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/f;->c(Lcom/facebook/mqtt/messages/l;)V

    goto/16 :goto_0

    .line 127
    :pswitch_9
    instance-of v1, p1, Lcom/facebook/mqtt/messages/c;

    if-nez v1, :cond_7

    .line 128
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 130
    :cond_7
    check-cast p1, Lcom/facebook/mqtt/messages/c;

    .line 131
    sget-object v1, Lcom/facebook/mqtt/a/f;->a:Ljava/lang/Class;

    const-string v2, "MQTT Packet sending: %s timeout:%d"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lcom/facebook/mqtt/messages/k;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/c;->a()Lcom/facebook/mqtt/messages/f;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/mqtt/messages/f;->h()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    invoke-direct {p0, p1}, Lcom/facebook/mqtt/a/f;->a(Lcom/facebook/mqtt/messages/c;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    .line 45
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

.method public a(Ljava/io/DataOutputStream;)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/facebook/mqtt/a/f;->b:Ljava/io/DataOutputStream;

    .line 41
    return-void
.end method
