.class public final Lorg/a/a/a/a/a;
.super Ljava/io/OutputStream;
.source "SourceFile"


# static fields
.field private static final a:[B


# instance fields
.field private b:Ljava/util/List;

.field private c:I

.field private d:I

.field private e:[B

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lorg/a/a/a/a/a;->a:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 71
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/a/a/a/a/a;-><init>(B)V

    .line 72
    return-void
.end method

.method private constructor <init>(B)V
    .locals 1

    .prologue
    .line 81
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/a/a/a/a/a;->b:Ljava/util/List;

    .line 82
    const/16 v0, 0x400

    invoke-direct {p0, v0}, Lorg/a/a/a/a/a;->b(I)V

    .line 87
    return-void
.end method

.method private a(I)[B
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lorg/a/a/a/a/a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method private b(I)V
    .locals 2

    .prologue
    .line 107
    iget v0, p0, Lorg/a/a/a/a/a;->c:I

    iget-object v1, p0, Lorg/a/a/a/a/a;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_0

    .line 109
    iget v0, p0, Lorg/a/a/a/a/a;->d:I

    iget-object v1, p0, Lorg/a/a/a/a/a;->e:[B

    array-length v1, v1

    add-int/2addr v0, v1

    iput v0, p0, Lorg/a/a/a/a/a;->d:I

    .line 111
    iget v0, p0, Lorg/a/a/a/a/a;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/a/a/a/a/a;->c:I

    .line 112
    iget v0, p0, Lorg/a/a/a/a/a;->c:I

    invoke-direct {p0, v0}, Lorg/a/a/a/a/a;->a(I)[B

    move-result-object v0

    iput-object v0, p0, Lorg/a/a/a/a/a;->e:[B

    .line 130
    :goto_0
    return-void

    .line 116
    :cond_0
    iget-object v0, p0, Lorg/a/a/a/a/a;->e:[B

    if-nez v0, :cond_1

    .line 117
    const/4 v0, 0x0

    iput v0, p0, Lorg/a/a/a/a/a;->d:I

    .line 126
    :goto_1
    iget v0, p0, Lorg/a/a/a/a/a;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/a/a/a/a/a;->c:I

    .line 127
    new-array v0, p1, [B

    iput-object v0, p0, Lorg/a/a/a/a/a;->e:[B

    .line 128
    iget-object v0, p0, Lorg/a/a/a/a/a;->b:Ljava/util/List;

    iget-object v1, p0, Lorg/a/a/a/a/a;->e:[B

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 120
    :cond_1
    iget-object v0, p0, Lorg/a/a/a/a/a;->e:[B

    array-length v0, v0

    shl-int/lit8 v0, v0, 0x1

    iget v1, p0, Lorg/a/a/a/a/a;->d:I

    sub-int v1, p1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 123
    iget v0, p0, Lorg/a/a/a/a/a;->d:I

    iget-object v1, p0, Lorg/a/a/a/a/a;->e:[B

    array-length v1, v1

    add-int/2addr v0, v1

    iput v0, p0, Lorg/a/a/a/a/a;->d:I

    goto :goto_1
.end method


# virtual methods
.method public final declared-synchronized a()[B
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 233
    monitor-enter p0

    :try_start_0
    iget v2, p0, Lorg/a/a/a/a/a;->f:I

    .line 234
    if-nez v2, :cond_1

    .line 235
    sget-object v0, Lorg/a/a/a/a/a;->a:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 249
    :cond_0
    monitor-exit p0

    return-object v0

    .line 237
    :cond_1
    :try_start_1
    new-array v0, v2, [B

    move v3, v2

    move v2, v1

    .line 239
    :goto_0
    iget-object v4, p0, Lorg/a/a/a/a/a;->b:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_0

    .line 240
    invoke-direct {p0, v1}, Lorg/a/a/a/a/a;->a(I)[B

    move-result-object v4

    .line 241
    array-length v5, v4

    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 242
    const/4 v6, 0x0

    invoke-static {v4, v6, v0, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 243
    add-int/2addr v2, v5

    .line 244
    sub-int/2addr v3, v5

    .line 245
    if-eqz v3, :cond_0

    .line 246
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 233
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final close()V
    .locals 0

    .prologue
    .line 192
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 258
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Lorg/a/a/a/a/a;->a()[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    return-object v0
.end method

.method public final declared-synchronized write(I)V
    .locals 3

    .prologue
    .line 166
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lorg/a/a/a/a/a;->f:I

    iget v1, p0, Lorg/a/a/a/a/a;->d:I

    sub-int/2addr v0, v1

    .line 167
    iget-object v1, p0, Lorg/a/a/a/a/a;->e:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    .line 168
    iget v0, p0, Lorg/a/a/a/a/a;->f:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lorg/a/a/a/a/a;->b(I)V

    .line 169
    const/4 v0, 0x0

    .line 171
    :cond_0
    iget-object v1, p0, Lorg/a/a/a/a/a;->e:[B

    int-to-byte v2, p1

    aput-byte v2, v1, v0

    .line 172
    iget v0, p0, Lorg/a/a/a/a/a;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/a/a/a/a/a;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    monitor-exit p0

    return-void

    .line 166
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final write([BII)V
    .locals 6

    .prologue
    .line 136
    if-ltz p2, :cond_0

    array-length v0, p1

    if-gt p2, v0, :cond_0

    if-ltz p3, :cond_0

    add-int v0, p2, p3

    array-length v1, p1

    if-gt v0, v1, :cond_0

    add-int v0, p2, p3

    if-gez v0, :cond_1

    .line 141
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    .line 142
    :cond_1
    if-nez p3, :cond_2

    .line 159
    :goto_0
    return-void

    .line 145
    :cond_2
    monitor-enter p0

    .line 146
    :try_start_0
    iget v0, p0, Lorg/a/a/a/a/a;->f:I

    add-int v2, v0, p3

    .line 148
    iget v0, p0, Lorg/a/a/a/a/a;->f:I

    iget v1, p0, Lorg/a/a/a/a/a;->d:I

    sub-int/2addr v0, v1

    move v1, p3

    .line 149
    :cond_3
    :goto_1
    if-lez v1, :cond_4

    .line 150
    iget-object v3, p0, Lorg/a/a/a/a/a;->e:[B

    array-length v3, v3

    sub-int/2addr v3, v0

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 151
    add-int v4, p2, p3

    sub-int/2addr v4, v1

    iget-object v5, p0, Lorg/a/a/a/a/a;->e:[B

    invoke-static {p1, v4, v5, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 152
    sub-int/2addr v1, v3

    .line 153
    if-lez v1, :cond_3

    .line 154
    invoke-direct {p0, v2}, Lorg/a/a/a/a/a;->b(I)V

    .line 155
    const/4 v0, 0x0

    goto :goto_1

    .line 158
    :cond_4
    iput v2, p0, Lorg/a/a/a/a/a;->f:I

    .line 159
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
