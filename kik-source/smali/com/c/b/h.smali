.class public final Lcom/c/b/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/h$a;
    }
.end annotation


# instance fields
.field private final a:[B

.field private final b:I

.field private c:I

.field private d:I

.field private final e:Ljava/io/OutputStream;


# direct methods
.method private constructor <init>(Ljava/io/OutputStream;[B)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput v0, p0, Lcom/c/b/h;->d:I

    .line 85
    iput-object p1, p0, Lcom/c/b/h;->e:Ljava/io/OutputStream;

    .line 86
    iput-object p2, p0, Lcom/c/b/h;->a:[B

    .line 87
    iput v0, p0, Lcom/c/b/h;->c:I

    .line 88
    array-length v0, p2

    iput v0, p0, Lcom/c/b/h;->b:I

    .line 89
    return-void
.end method

.method private constructor <init>([BI)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput v1, p0, Lcom/c/b/h;->d:I

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/h;->e:Ljava/io/OutputStream;

    .line 79
    iput-object p1, p0, Lcom/c/b/h;->a:[B

    .line 80
    iput v1, p0, Lcom/c/b/h;->c:I

    .line 81
    add-int/lit8 v0, p2, 0x0

    iput v0, p0, Lcom/c/b/h;->b:I

    .line 82
    return-void
.end method

.method public static a()I
    .locals 1

    .prologue
    .line 689
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/c/b/h;->j(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public static a(Lcom/c/b/ax;)I
    .locals 2

    .prologue
    .line 869
    invoke-virtual {p0}, Lcom/c/b/ax;->b()I

    move-result v0

    .line 870
    invoke-static {v0}, Lcom/c/b/h;->l(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static a(Ljava/io/OutputStream;I)Lcom/c/b/h;
    .locals 2

    .prologue
    .line 105
    new-instance v0, Lcom/c/b/h;

    new-array v1, p1, [B

    invoke-direct {v0, p0, v1}, Lcom/c/b/h;-><init>(Ljava/io/OutputStream;[B)V

    return-object v0
.end method

.method public static a([B)Lcom/c/b/h;
    .locals 2

    .prologue
    .line 116
    array-length v0, p0

    new-instance v1, Lcom/c/b/h;

    invoke-direct {v1, p0, v0}, Lcom/c/b/h;-><init>([BI)V

    return-object v1
.end method

.method public static b(Lcom/c/b/be;)I
    .locals 2

    .prologue
    .line 860
    invoke-interface {p0}, Lcom/c/b/be;->b()I

    move-result v0

    .line 861
    invoke-static {v0}, Lcom/c/b/h;->l(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static b(Lcom/c/b/f;)I
    .locals 2

    .prologue
    .line 878
    invoke-virtual {p0}, Lcom/c/b/f;->a()I

    move-result v0

    invoke-static {v0}, Lcom/c/b/h;->l(I)I

    move-result v0

    invoke-virtual {p0}, Lcom/c/b/f;->a()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static b(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 829
    sget-object v0, Lcom/c/b/au;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 830
    array-length v1, v0

    invoke-static {v1}, Lcom/c/b/h;->l(I)I

    move-result v1

    array-length v0, v0

    add-int/2addr v0, v1

    return v0
.end method

.method public static c(ILcom/c/b/f;)I
    .locals 2

    .prologue
    .line 636
    invoke-static {p0}, Lcom/c/b/h;->j(I)I

    move-result v0

    invoke-static {p1}, Lcom/c/b/h;->b(Lcom/c/b/f;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static d(II)I
    .locals 2

    .prologue
    .line 559
    invoke-static {p0}, Lcom/c/b/h;->j(I)I

    move-result v0

    invoke-static {p1}, Lcom/c/b/h;->i(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static d(IJ)I
    .locals 3

    .prologue
    .line 543
    invoke-static {p0}, Lcom/c/b/h;->j(I)I

    move-result v0

    invoke-static {p1, p2}, Lcom/c/b/h;->f(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static d(ILcom/c/b/be;)I
    .locals 2

    .prologue
    .line 627
    invoke-static {p0}, Lcom/c/b/h;->j(I)I

    move-result v0

    invoke-static {p1}, Lcom/c/b/h;->b(Lcom/c/b/be;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method private d()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 953
    iget-object v0, p0, Lcom/c/b/h;->e:Ljava/io/OutputStream;

    if-nez v0, :cond_0

    .line 955
    new-instance v0, Lcom/c/b/h$a;

    invoke-direct {v0}, Lcom/c/b/h$a;-><init>()V

    throw v0

    .line 960
    :cond_0
    iget-object v0, p0, Lcom/c/b/h;->e:Ljava/io/OutputStream;

    iget-object v1, p0, Lcom/c/b/h;->a:[B

    iget v2, p0, Lcom/c/b/h;->c:I

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 961
    iput v3, p0, Lcom/c/b/h;->c:I

    .line 962
    return-void
.end method

.method public static e(II)I
    .locals 2

    .prologue
    .line 671
    invoke-static {p0}, Lcom/c/b/h;->j(I)I

    move-result v0

    invoke-static {p1}, Lcom/c/b/h;->l(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static e(IJ)I
    .locals 3

    .prologue
    .line 551
    invoke-static {p0}, Lcom/c/b/h;->j(I)I

    move-result v0

    invoke-static {p1, p2}, Lcom/c/b/h;->f(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static e(ILcom/c/b/be;)I
    .locals 2

    .prologue
    .line 724
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/c/b/h;->j(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    invoke-static {v1, p0}, Lcom/c/b/h;->e(II)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x3

    invoke-static {v1, p1}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static f(II)I
    .locals 2

    .prologue
    .line 680
    invoke-static {p0}, Lcom/c/b/h;->j(I)I

    move-result v0

    invoke-static {p1}, Lcom/c/b/h;->i(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static f(J)I
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 1227
    const-wide/16 v0, -0x80

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 1236
    :goto_0
    return v0

    .line 1228
    :cond_0
    const-wide/16 v0, -0x4000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    .line 1229
    :cond_1
    const-wide/32 v0, -0x200000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    const/4 v0, 0x3

    goto :goto_0

    .line 1230
    :cond_2
    const-wide/32 v0, -0x10000000

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    const/4 v0, 0x4

    goto :goto_0

    .line 1231
    :cond_3
    const-wide v0, -0x800000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    const/4 v0, 0x5

    goto :goto_0

    .line 1232
    :cond_4
    const-wide v0, -0x40000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_5

    const/4 v0, 0x6

    goto :goto_0

    .line 1233
    :cond_5
    const-wide/high16 v0, -0x2000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_6

    const/4 v0, 0x7

    goto :goto_0

    .line 1234
    :cond_6
    const-wide/high16 v0, -0x100000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_7

    const/16 v0, 0x8

    goto :goto_0

    .line 1235
    :cond_7
    const-wide/high16 v0, -0x8000000000000000L

    and-long/2addr v0, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_8

    const/16 v0, 0x9

    goto :goto_0

    .line 1236
    :cond_8
    const/16 v0, 0xa

    goto :goto_0
.end method

.method public static g(I)I
    .locals 1

    .prologue
    .line 586
    invoke-static {p0}, Lcom/c/b/h;->j(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static g(J)J
    .locals 4

    .prologue
    .line 1290
    const/4 v0, 0x1

    shl-long v0, p0, v0

    const/16 v2, 0x3f

    shr-long v2, p0, v2

    xor-long/2addr v0, v2

    return-wide v0
.end method

.method public static h(I)I
    .locals 1

    .prologue
    .line 698
    invoke-static {p0}, Lcom/c/b/h;->j(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x8

    return v0
.end method

.method private h(J)V
    .locals 3

    .prologue
    .line 1251
    long-to-int v0, p1

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lcom/c/b/h;->o(I)V

    .line 1252
    const/16 v0, 0x8

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lcom/c/b/h;->o(I)V

    .line 1253
    const/16 v0, 0x10

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lcom/c/b/h;->o(I)V

    .line 1254
    const/16 v0, 0x18

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lcom/c/b/h;->o(I)V

    .line 1255
    const/16 v0, 0x20

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lcom/c/b/h;->o(I)V

    .line 1256
    const/16 v0, 0x28

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lcom/c/b/h;->o(I)V

    .line 1257
    const/16 v0, 0x30

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lcom/c/b/h;->o(I)V

    .line 1258
    const/16 v0, 0x38

    shr-long v0, p1, v0

    long-to-int v0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lcom/c/b/h;->o(I)V

    .line 1259
    return-void
.end method

.method public static i(I)I
    .locals 1

    .prologue
    .line 792
    if-ltz p0, :cond_0

    .line 793
    invoke-static {p0}, Lcom/c/b/h;->l(I)I

    move-result v0

    .line 796
    :goto_0
    return v0

    :cond_0
    const/16 v0, 0xa

    goto :goto_0
.end method

.method public static j(I)I
    .locals 1

    .prologue
    .line 1180
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/c/b/cd;->a(II)I

    move-result v0

    invoke-static {v0}, Lcom/c/b/h;->l(I)I

    move-result v0

    return v0
.end method

.method public static l(I)I
    .locals 1

    .prologue
    .line 1205
    and-int/lit8 v0, p0, -0x80

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 1209
    :goto_0
    return v0

    .line 1206
    :cond_0
    and-int/lit16 v0, p0, -0x4000

    if-nez v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    .line 1207
    :cond_1
    const/high16 v0, -0x200000

    and-int/2addr v0, p0

    if-nez v0, :cond_2

    const/4 v0, 0x3

    goto :goto_0

    .line 1208
    :cond_2
    const/high16 v0, -0x10000000

    and-int/2addr v0, p0

    if-nez v0, :cond_3

    const/4 v0, 0x4

    goto :goto_0

    .line 1209
    :cond_3
    const/4 v0, 0x5

    goto :goto_0
.end method

.method public static n(I)I
    .locals 2

    .prologue
    .line 1275
    shl-int/lit8 v0, p0, 0x1

    shr-int/lit8 v1, p0, 0x1f

    xor-int/2addr v0, v1

    return v0
.end method

.method private o(I)V
    .locals 4

    .prologue
    .line 1037
    int-to-byte v0, p1

    iget v1, p0, Lcom/c/b/h;->c:I

    iget v2, p0, Lcom/c/b/h;->b:I

    if-ne v1, v2, :cond_0

    invoke-direct {p0}, Lcom/c/b/h;->d()V

    :cond_0
    iget-object v1, p0, Lcom/c/b/h;->a:[B

    iget v2, p0, Lcom/c/b/h;->c:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/c/b/h;->c:I

    aput-byte v0, v1, v2

    iget v0, p0, Lcom/c/b/h;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/c/b/h;->d:I

    .line 1038
    return-void
.end method


# virtual methods
.method public final a(D)V
    .locals 3

    .prologue
    .line 374
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/c/b/h;->h(J)V

    .line 375
    return-void
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 319
    const/4 v0, 0x4

    const/4 v1, 0x5

    invoke-virtual {p0, v0, v1}, Lcom/c/b/h;->g(II)V

    .line 320
    invoke-virtual {p0, p1}, Lcom/c/b/h;->m(I)V

    .line 321
    return-void
.end method

.method public final a(II)V
    .locals 1

    .prologue
    .line 197
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/c/b/h;->g(II)V

    .line 198
    invoke-virtual {p0, p2}, Lcom/c/b/h;->b(I)V

    .line 199
    return-void
.end method

.method public final a(IJ)V
    .locals 2

    .prologue
    .line 183
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/c/b/h;->g(II)V

    .line 184
    invoke-virtual {p0, p2, p3}, Lcom/c/b/h;->e(J)V

    .line 185
    return-void
.end method

.method public final a(ILcom/c/b/be;)V
    .locals 1

    .prologue
    .line 232
    const/4 v0, 0x3

    invoke-virtual {p0, p1, v0}, Lcom/c/b/h;->g(II)V

    .line 233
    invoke-interface {p2, p0}, Lcom/c/b/be;->a(Lcom/c/b/h;)V

    .line 234
    const/4 v0, 0x4

    invoke-virtual {p0, p1, v0}, Lcom/c/b/h;->g(II)V

    .line 235
    return-void
.end method

.method public final a(ILcom/c/b/f;)V
    .locals 1

    .prologue
    .line 262
    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/c/b/h;->g(II)V

    .line 263
    invoke-virtual {p0, p2}, Lcom/c/b/h;->a(Lcom/c/b/f;)V

    .line 264
    return-void
.end method

.method public final a(IZ)V
    .locals 1

    .prologue
    .line 218
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/c/b/h;->g(II)V

    .line 219
    invoke-virtual {p0, p2}, Lcom/c/b/h;->a(Z)V

    .line 220
    return-void
.end method

.method public final a(J)V
    .locals 1

    .prologue
    .line 384
    invoke-virtual {p0, p1, p2}, Lcom/c/b/h;->e(J)V

    .line 385
    return-void
.end method

.method public final a(Lcom/c/b/be;)V
    .locals 1

    .prologue
    .line 447
    invoke-interface {p1}, Lcom/c/b/be;->b()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/c/b/h;->k(I)V

    .line 448
    invoke-interface {p1, p0}, Lcom/c/b/be;->a(Lcom/c/b/h;)V

    .line 449
    return-void
.end method

.method public final a(Lcom/c/b/f;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 454
    invoke-virtual {p1}, Lcom/c/b/f;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/c/b/h;->k(I)V

    .line 455
    invoke-virtual {p1}, Lcom/c/b/f;->a()I

    move-result v0

    iget v1, p0, Lcom/c/b/h;->b:I

    iget v2, p0, Lcom/c/b/h;->c:I

    sub-int/2addr v1, v2

    if-lt v1, v0, :cond_1

    iget-object v1, p0, Lcom/c/b/h;->a:[B

    iget v2, p0, Lcom/c/b/h;->c:I

    invoke-virtual {p1, v1, v4, v2, v0}, Lcom/c/b/f;->b([BIII)V

    iget v1, p0, Lcom/c/b/h;->c:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/c/b/h;->c:I

    :cond_0
    :goto_0
    iget v1, p0, Lcom/c/b/h;->d:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/c/b/h;->d:I

    .line 456
    return-void

    .line 455
    :cond_1
    iget v1, p0, Lcom/c/b/h;->b:I

    iget v2, p0, Lcom/c/b/h;->c:I

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/c/b/h;->a:[B

    iget v3, p0, Lcom/c/b/h;->c:I

    invoke-virtual {p1, v2, v4, v3, v1}, Lcom/c/b/f;->b([BIII)V

    add-int/lit8 v2, v1, 0x0

    sub-int/2addr v0, v1

    iget v3, p0, Lcom/c/b/h;->b:I

    iput v3, p0, Lcom/c/b/h;->c:I

    iget v3, p0, Lcom/c/b/h;->d:I

    add-int/2addr v1, v3

    iput v1, p0, Lcom/c/b/h;->d:I

    invoke-direct {p0}, Lcom/c/b/h;->d()V

    iget v1, p0, Lcom/c/b/h;->b:I

    if-gt v0, v1, :cond_2

    iget-object v1, p0, Lcom/c/b/h;->a:[B

    invoke-virtual {p1, v1, v2, v4, v0}, Lcom/c/b/f;->b([BIII)V

    iput v0, p0, Lcom/c/b/h;->c:I

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/c/b/h;->e:Ljava/io/OutputStream;

    if-gez v2, :cond_3

    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Source offset < 0: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    if-gez v0, :cond_4

    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Length < 0: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    add-int v3, v2, v0

    invoke-virtual {p1}, Lcom/c/b/f;->a()I

    move-result v4

    if-le v3, v4, :cond_5

    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Source end offset exceeded: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/2addr v0, v2

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    if-lez v0, :cond_0

    invoke-virtual {p1, v1, v2, v0}, Lcom/c/b/f;->a(Ljava/io/OutputStream;II)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 422
    sget-object v0, Lcom/c/b/au;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 423
    array-length v1, v0

    invoke-virtual {p0, v1}, Lcom/c/b/h;->k(I)V

    .line 424
    invoke-virtual {p0, v0}, Lcom/c/b/h;->b([B)V

    .line 425
    return-void
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 414
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-direct {p0, v0}, Lcom/c/b/h;->o(I)V

    .line 415
    return-void

    .line 414
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 969
    iget-object v0, p0, Lcom/c/b/h;->e:Ljava/io/OutputStream;

    if-eqz v0, :cond_0

    .line 970
    invoke-direct {p0}, Lcom/c/b/h;->d()V

    .line 972
    :cond_0
    return-void
.end method

.method public final b(I)V
    .locals 2

    .prologue
    .line 394
    if-ltz p1, :cond_0

    .line 395
    invoke-virtual {p0, p1}, Lcom/c/b/h;->k(I)V

    .line 400
    :goto_0
    return-void

    .line 398
    :cond_0
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lcom/c/b/h;->e(J)V

    goto :goto_0
.end method

.method public final b(II)V
    .locals 1

    .prologue
    .line 302
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/c/b/h;->g(II)V

    .line 303
    invoke-virtual {p0, p2}, Lcom/c/b/h;->k(I)V

    .line 304
    return-void
.end method

.method public final b(IJ)V
    .locals 2

    .prologue
    .line 190
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/c/b/h;->g(II)V

    .line 191
    invoke-virtual {p0, p2, p3}, Lcom/c/b/h;->e(J)V

    .line 192
    return-void
.end method

.method public final b(ILcom/c/b/be;)V
    .locals 1

    .prologue
    .line 254
    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/c/b/h;->g(II)V

    .line 255
    invoke-virtual {p0, p2}, Lcom/c/b/h;->a(Lcom/c/b/be;)V

    .line 256
    return-void
.end method

.method public final b(ILcom/c/b/f;)V
    .locals 3

    .prologue
    const/4 v2, 0x3

    const/4 v1, 0x1

    .line 364
    invoke-virtual {p0, v1, v2}, Lcom/c/b/h;->g(II)V

    .line 365
    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Lcom/c/b/h;->b(II)V

    .line 366
    invoke-virtual {p0, v2, p2}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 367
    const/4 v0, 0x4

    invoke-virtual {p0, v1, v0}, Lcom/c/b/h;->g(II)V

    .line 368
    return-void
.end method

.method public final b(J)V
    .locals 1

    .prologue
    .line 389
    invoke-virtual {p0, p1, p2}, Lcom/c/b/h;->e(J)V

    .line 390
    return-void
.end method

.method public final b([B)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 1047
    array-length v0, p1

    iget v1, p0, Lcom/c/b/h;->b:I

    iget v2, p0, Lcom/c/b/h;->c:I

    sub-int/2addr v1, v2

    if-lt v1, v0, :cond_0

    iget-object v1, p0, Lcom/c/b/h;->a:[B

    iget v2, p0, Lcom/c/b/h;->c:I

    invoke-static {p1, v4, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, p0, Lcom/c/b/h;->c:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/c/b/h;->c:I

    :goto_0
    iget v1, p0, Lcom/c/b/h;->d:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/c/b/h;->d:I

    .line 1048
    return-void

    .line 1047
    :cond_0
    iget v1, p0, Lcom/c/b/h;->b:I

    iget v2, p0, Lcom/c/b/h;->c:I

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/c/b/h;->a:[B

    iget v3, p0, Lcom/c/b/h;->c:I

    invoke-static {p1, v4, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v2, v1, 0x0

    sub-int/2addr v0, v1

    iget v3, p0, Lcom/c/b/h;->b:I

    iput v3, p0, Lcom/c/b/h;->c:I

    iget v3, p0, Lcom/c/b/h;->d:I

    add-int/2addr v1, v3

    iput v1, p0, Lcom/c/b/h;->d:I

    invoke-direct {p0}, Lcom/c/b/h;->d()V

    iget v1, p0, Lcom/c/b/h;->b:I

    if-gt v0, v1, :cond_1

    iget-object v1, p0, Lcom/c/b/h;->a:[B

    invoke-static {p1, v2, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v0, p0, Lcom/c/b/h;->c:I

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/c/b/h;->e:Ljava/io/OutputStream;

    invoke-virtual {v1, p1, v2, v0}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 996
    iget-object v0, p0, Lcom/c/b/h;->e:Ljava/io/OutputStream;

    if-nez v0, :cond_0

    iget v0, p0, Lcom/c/b/h;->b:I

    iget v1, p0, Lcom/c/b/h;->c:I

    sub-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 997
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 996
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1000
    :cond_1
    return-void
.end method

.method public final c(I)V
    .locals 0

    .prologue
    .line 409
    invoke-virtual {p0, p1}, Lcom/c/b/h;->m(I)V

    .line 410
    return-void
.end method

.method public final c(II)V
    .locals 1

    .prologue
    .line 312
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/c/b/h;->g(II)V

    .line 313
    invoke-virtual {p0, p2}, Lcom/c/b/h;->b(I)V

    .line 314
    return-void
.end method

.method public final c(IJ)V
    .locals 2

    .prologue
    .line 326
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/c/b/h;->g(II)V

    .line 327
    invoke-direct {p0, p2, p3}, Lcom/c/b/h;->h(J)V

    .line 328
    return-void
.end method

.method public final c(ILcom/c/b/be;)V
    .locals 3

    .prologue
    const/4 v2, 0x3

    const/4 v1, 0x1

    .line 351
    invoke-virtual {p0, v1, v2}, Lcom/c/b/h;->g(II)V

    .line 352
    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Lcom/c/b/h;->b(II)V

    .line 353
    invoke-virtual {p0, v2, p2}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 354
    const/4 v0, 0x4

    invoke-virtual {p0, v1, v0}, Lcom/c/b/h;->g(II)V

    .line 355
    return-void
.end method

.method public final c(J)V
    .locals 1

    .prologue
    .line 404
    invoke-direct {p0, p1, p2}, Lcom/c/b/h;->h(J)V

    .line 405
    return-void
.end method

.method public final d(I)V
    .locals 0

    .prologue
    .line 488
    invoke-virtual {p0, p1}, Lcom/c/b/h;->k(I)V

    .line 489
    return-void
.end method

.method public final d(J)V
    .locals 1

    .prologue
    .line 506
    invoke-direct {p0, p1, p2}, Lcom/c/b/h;->h(J)V

    .line 507
    return-void
.end method

.method public final e(I)V
    .locals 0

    .prologue
    .line 496
    invoke-virtual {p0, p1}, Lcom/c/b/h;->b(I)V

    .line 497
    return-void
.end method

.method public final e(J)V
    .locals 5

    .prologue
    .line 1215
    :goto_0
    const-wide/16 v0, -0x80

    and-long/2addr v0, p1

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 1216
    long-to-int v0, p1

    invoke-direct {p0, v0}, Lcom/c/b/h;->o(I)V

    .line 1217
    return-void

    .line 1219
    :cond_0
    long-to-int v0, p1

    and-int/lit8 v0, v0, 0x7f

    or-int/lit16 v0, v0, 0x80

    invoke-direct {p0, v0}, Lcom/c/b/h;->o(I)V

    .line 1220
    const/4 v0, 0x7

    ushr-long/2addr p1, v0

    goto :goto_0
.end method

.method public final f(I)V
    .locals 0

    .prologue
    .line 501
    invoke-virtual {p0, p1}, Lcom/c/b/h;->m(I)V

    .line 502
    return-void
.end method

.method public final g(II)V
    .locals 1

    .prologue
    .line 1175
    invoke-static {p1, p2}, Lcom/c/b/cd;->a(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/c/b/h;->k(I)V

    .line 1176
    return-void
.end method

.method public final k(I)V
    .locals 1

    .prologue
    .line 1189
    :goto_0
    and-int/lit8 v0, p1, -0x80

    if-nez v0, :cond_0

    .line 1190
    invoke-direct {p0, p1}, Lcom/c/b/h;->o(I)V

    .line 1191
    return-void

    .line 1193
    :cond_0
    and-int/lit8 v0, p1, 0x7f

    or-int/lit16 v0, v0, 0x80

    invoke-direct {p0, v0}, Lcom/c/b/h;->o(I)V

    .line 1194
    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0
.end method

.method public final m(I)V
    .locals 1

    .prologue
    .line 1241
    and-int/lit16 v0, p1, 0xff

    invoke-direct {p0, v0}, Lcom/c/b/h;->o(I)V

    .line 1242
    shr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lcom/c/b/h;->o(I)V

    .line 1243
    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lcom/c/b/h;->o(I)V

    .line 1244
    shr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0, v0}, Lcom/c/b/h;->o(I)V

    .line 1245
    return-void
.end method
