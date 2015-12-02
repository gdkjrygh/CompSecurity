.class public final Lnet/jarlehansen/protobuf/javame/original/a/a;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private final a:[B

.field private final b:I

.field private c:I


# direct methods
.method private constructor <init>([BII)V
    .locals 1

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->a:[B

    .line 61
    iput p2, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->c:I

    .line 62
    add-int v0, p2, p3

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->b:I

    .line 63
    return-void
.end method

.method public static a(I)I
    .locals 1

    .prologue
    .line 314
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a;->a(II)I

    move-result v0

    invoke-static {v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->c(I)I

    move-result v0

    return v0
.end method

.method public static a([B)Lnet/jarlehansen/protobuf/javame/original/a/a;
    .locals 2

    .prologue
    .line 73
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a([BII)Lnet/jarlehansen/protobuf/javame/original/a/a;

    move-result-object v0

    return-object v0
.end method

.method private static a([BII)Lnet/jarlehansen/protobuf/javame/original/a/a;
    .locals 1

    .prologue
    .line 84
    new-instance v0, Lnet/jarlehansen/protobuf/javame/original/a/a;

    invoke-direct {v0, p0, p1, p2}, Lnet/jarlehansen/protobuf/javame/original/a/a;-><init>([BII)V

    return-object v0
.end method

.method private a(B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 261
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->a:[B

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->c:I

    aput-byte p1, v0, v1

    .line 262
    return-void
.end method

.method private a(J)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 353
    :goto_0
    const-wide/16 v0, -0x80

    and-long/2addr v0, p1

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 354
    long-to-int v0, p1

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(I)V

    .line 355
    return-void

    .line 357
    :cond_0
    long-to-int v0, p1

    and-int/lit8 v0, v0, 0x7f

    or-int/lit16 v0, v0, 0x80

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(I)V

    .line 358
    const/4 v0, 0x7

    ushr-long/2addr p1, v0

    goto :goto_0
.end method

.method public static b(ID)I
    .locals 1

    .prologue
    .line 170
    invoke-static {p0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x8

    return v0
.end method

.method public static b(IF)I
    .locals 1

    .prologue
    .line 178
    invoke-static {p0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public static b(IJ)I
    .locals 3

    .prologue
    .line 186
    invoke-static {p0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(I)I

    move-result v0

    invoke-static {p1, p2}, Lnet/jarlehansen/protobuf/javame/original/a/a;->b(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static b(ILjava/lang/String;)I
    .locals 3

    .prologue
    .line 215
    if-nez p1, :cond_0

    .line 216
    const/4 v0, 0x0

    .line 220
    :goto_0
    return v0

    .line 219
    :cond_0
    :try_start_0
    const-string/jumbo v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    .line 220
    invoke-static {p0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(I)I

    move-result v1

    array-length v2, v0

    invoke-static {v2}, Lnet/jarlehansen/protobuf/javame/original/a/a;->c(I)I

    move-result v2

    add-int/2addr v1, v2

    array-length v0, v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v0, v1

    goto :goto_0

    .line 221
    :catch_0
    move-exception v0

    .line 222
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "UTF-8 not supported."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b(ILnet/jarlehansen/protobuf/javame/b;)I
    .locals 2

    .prologue
    .line 231
    if-nez p1, :cond_0

    .line 232
    const/4 v0, 0x0

    .line 234
    :goto_0
    return v0

    :cond_0
    invoke-static {p0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(I)I

    move-result v0

    invoke-virtual {p1}, Lnet/jarlehansen/protobuf/javame/b;->a()I

    move-result v1

    invoke-static {v1}, Lnet/jarlehansen/protobuf/javame/original/a/a;->c(I)I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p1}, Lnet/jarlehansen/protobuf/javame/b;->a()I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_0
.end method

.method public static b(IZ)I
    .locals 1

    .prologue
    .line 207
    invoke-static {p0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private static b(J)I
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 365
    const-wide/16 v0, -0x80

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 366
    const/4 v0, 0x1

    .line 383
    :goto_0
    return v0

    .line 367
    :cond_0
    const-wide/16 v0, -0x4000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 368
    const/4 v0, 0x2

    goto :goto_0

    .line 369
    :cond_1
    const-wide/32 v0, -0x200000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    .line 370
    const/4 v0, 0x3

    goto :goto_0

    .line 371
    :cond_2
    const-wide/32 v0, -0x10000000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    .line 372
    const/4 v0, 0x4

    goto :goto_0

    .line 373
    :cond_3
    const-wide v0, -0x800000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    .line 374
    const/4 v0, 0x5

    goto :goto_0

    .line 375
    :cond_4
    const-wide v0, -0x40000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_5

    .line 376
    const/4 v0, 0x6

    goto :goto_0

    .line 377
    :cond_5
    const-wide/high16 v0, -0x2000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_6

    .line 378
    const/4 v0, 0x7

    goto :goto_0

    .line 379
    :cond_6
    const-wide/high16 v0, -0x100000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_7

    .line 380
    const/16 v0, 0x8

    goto :goto_0

    .line 381
    :cond_7
    const-wide/high16 v0, -0x8000000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_8

    .line 382
    const/16 v0, 0x9

    goto :goto_0

    .line 383
    :cond_8
    const/16 v0, 0xa

    goto :goto_0
.end method

.method private b([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 271
    if-nez p1, :cond_0

    .line 275
    :goto_0
    return-void

    .line 274
    :cond_0
    const/4 v0, 0x0

    array-length v1, p1

    invoke-direct {p0, p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/original/a/a;->b([BII)V

    goto :goto_0
.end method

.method private b([BII)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 279
    if-nez p1, :cond_1

    .line 305
    :cond_0
    :goto_0
    return-void

    .line 282
    :cond_1
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->b:I

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->c:I

    sub-int/2addr v0, v1

    if-lt v0, p3, :cond_2

    .line 284
    iget-object v0, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->a:[B

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->c:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 285
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->c:I

    add-int/2addr v0, p3

    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->c:I

    goto :goto_0

    .line 290
    :cond_2
    iget v0, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->b:I

    iget v1, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->c:I

    sub-int/2addr v0, v1

    .line 291
    iget-object v1, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->a:[B

    iget v2, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->c:I

    invoke-static {p1, p2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 292
    add-int v1, p2, v0

    .line 293
    sub-int v0, p3, v0

    .line 294
    iget v2, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->b:I

    iput v2, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->c:I

    .line 299
    iget v2, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->b:I

    if-gt v0, v2, :cond_0

    .line 301
    iget-object v2, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->a:[B

    const/4 v3, 0x0

    invoke-static {p1, v1, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 302
    iput v0, p0, Lnet/jarlehansen/protobuf/javame/original/a/a;->c:I

    goto :goto_0
.end method

.method public static c(I)I
    .locals 1

    .prologue
    .line 339
    and-int/lit8 v0, p0, -0x80

    if-nez v0, :cond_0

    .line 340
    const/4 v0, 0x1

    .line 347
    :goto_0
    return v0

    .line 341
    :cond_0
    and-int/lit16 v0, p0, -0x4000

    if-nez v0, :cond_1

    .line 342
    const/4 v0, 0x2

    goto :goto_0

    .line 343
    :cond_1
    const/high16 v0, -0x200000

    and-int/2addr v0, p0

    if-nez v0, :cond_2

    .line 344
    const/4 v0, 0x3

    goto :goto_0

    .line 345
    :cond_2
    const/high16 v0, -0x10000000

    and-int/2addr v0, p0

    if-nez v0, :cond_3

    .line 346
    const/4 v0, 0x4

    goto :goto_0

    .line 347
    :cond_3
    const/4 v0, 0x5

    goto :goto_0
.end method

.method public static c(II)I
    .locals 2

    .prologue
    .line 194
    if-ltz p1, :cond_0

    .line 195
    invoke-static {p0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(I)I

    move-result v0

    invoke-static {p1}, Lnet/jarlehansen/protobuf/javame/original/a/a;->c(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 198
    :goto_0
    return v0

    :cond_0
    invoke-static {p0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(I)I

    move-result v0

    add-int/lit8 v0, v0, 0xa

    goto :goto_0
.end method

.method private c(J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 398
    long-to-int v0, p1

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(I)V

    .line 399
    const/16 v0, 0x8

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(I)V

    .line 400
    const/16 v0, 0x10

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(I)V

    .line 401
    const/16 v0, 0x18

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(I)V

    .line 402
    const/16 v0, 0x20

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(I)V

    .line 403
    const/16 v0, 0x28

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(I)V

    .line 404
    const/16 v0, 0x30

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(I)V

    .line 405
    const/16 v0, 0x38

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(I)V

    .line 406
    return-void
.end method

.method private d(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 266
    int-to-byte v0, p1

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(B)V

    .line 267
    return-void
.end method

.method private d(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 309
    invoke-static {p1, p2}, Lnet/jarlehansen/protobuf/javame/original/a;->a(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->b(I)V

    .line 310
    return-void
.end method

.method private e(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 388
    and-int/lit16 v0, p1, 0xff

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(I)V

    .line 389
    shr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(I)V

    .line 390
    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(I)V

    .line 391
    shr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(I)V

    .line 392
    return-void
.end method


# virtual methods
.method public a(ID)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 91
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(II)V

    .line 92
    invoke-static {p2, p3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lnet/jarlehansen/protobuf/javame/original/a/a;->c(J)V

    .line 93
    return-void
.end method

.method public a(IF)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 97
    const/4 v0, 0x5

    invoke-direct {p0, p1, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(II)V

    .line 98
    invoke-static {p2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->e(I)V

    .line 99
    return-void
.end method

.method public a(II)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 109
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(II)V

    .line 110
    if-ltz p2, :cond_0

    .line 111
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/original/a/a;->b(I)V

    .line 116
    :goto_0
    return-void

    .line 114
    :cond_0
    int-to-long v0, p2

    invoke-direct {p0, v0, v1}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(J)V

    goto :goto_0
.end method

.method public a(IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 103
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(II)V

    .line 104
    invoke-direct {p0, p2, p3}, Lnet/jarlehansen/protobuf/javame/original/a/a;->a(J)V

    .line 105
    return-void
.end method

.method public a(ILjava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 130
    if-nez p2, :cond_0

    .line 142
    :goto_0
    return-void

    .line 133
    :cond_0
    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(II)V

    .line 139
    const-string/jumbo v0, "UTF-8"

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    .line 140
    array-length v1, v0

    invoke-virtual {p0, v1}, Lnet/jarlehansen/protobuf/javame/original/a/a;->b(I)V

    .line 141
    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->b([B)V

    goto :goto_0
.end method

.method public a(ILnet/jarlehansen/protobuf/javame/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 146
    if-nez p2, :cond_0

    .line 153
    :goto_0
    return-void

    .line 149
    :cond_0
    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(II)V

    .line 150
    invoke-virtual {p2}, Lnet/jarlehansen/protobuf/javame/b;->b()[B

    move-result-object v0

    .line 151
    array-length v1, v0

    invoke-virtual {p0, v1}, Lnet/jarlehansen/protobuf/javame/original/a/a;->b(I)V

    .line 152
    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->b([B)V

    goto :goto_0
.end method

.method public a(IZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 124
    invoke-direct {p0, p1, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(II)V

    .line 125
    if-eqz p2, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(I)V

    .line 126
    return-void
.end method

.method public b(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 323
    :goto_0
    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_0

    .line 324
    invoke-direct {p0, p1}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(I)V

    .line 325
    return-void

    .line 327
    :cond_0
    and-int/lit8 v0, p1, 0x7f

    or-int/lit16 v0, v0, 0x80

    invoke-direct {p0, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(I)V

    .line 328
    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0
.end method

.method public b(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 158
    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lnet/jarlehansen/protobuf/javame/original/a/a;->d(II)V

    .line 159
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/original/a/a;->b(I)V

    .line 160
    return-void
.end method
