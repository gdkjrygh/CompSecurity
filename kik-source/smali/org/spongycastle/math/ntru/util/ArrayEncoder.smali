.class public Lorg/spongycastle/math/ntru/util/ArrayEncoder;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[I

.field private static final b:[I

.field private static final c:[I

.field private static final d:[I

.field private static final e:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/16 v2, 0x8

    const/16 v1, 0x9

    .line 32
    new-array v0, v2, [I

    fill-array-data v0, :array_0

    sput-object v0, Lorg/spongycastle/math/ntru/util/ArrayEncoder;->a:[I

    .line 33
    new-array v0, v2, [I

    fill-array-data v0, :array_1

    sput-object v0, Lorg/spongycastle/math/ntru/util/ArrayEncoder;->b:[I

    .line 53
    new-array v0, v1, [I

    fill-array-data v0, :array_2

    sput-object v0, Lorg/spongycastle/math/ntru/util/ArrayEncoder;->c:[I

    .line 54
    new-array v0, v1, [I

    fill-array-data v0, :array_3

    sput-object v0, Lorg/spongycastle/math/ntru/util/ArrayEncoder;->d:[I

    .line 55
    new-array v0, v1, [I

    fill-array-data v0, :array_4

    sput-object v0, Lorg/spongycastle/math/ntru/util/ArrayEncoder;->e:[I

    return-void

    .line 32
    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x1
        0x1
        0x1
        -0x1
        -0x1
    .end array-data

    .line 33
    :array_1
    .array-data 4
        0x0
        0x1
        -0x1
        0x0
        0x1
        -0x1
        0x0
        0x1
    .end array-data

    .line 53
    :array_2
    .array-data 4
        0x1
        0x1
        0x1
        0x0
        0x0
        0x0
        0x1
        0x0
        0x1
    .end array-data

    .line 54
    :array_3
    .array-data 4
        0x1
        0x1
        0x1
        0x1
        0x0
        0x0
        0x0
        0x1
        0x0
    .end array-data

    .line 55
    :array_4
    .array-data 4
        0x1
        0x0
        0x1
        0x0
        0x0
        0x1
        0x1
        0x1
        0x0
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([I)[B
    .locals 10

    .prologue
    const/4 v9, 0x3

    const/4 v1, 0x0

    .line 183
    array-length v0, p0

    mul-int/lit8 v0, v0, 0x3

    add-int/lit8 v0, v0, 0x1

    div-int/lit8 v0, v0, 0x2

    .line 184
    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    .line 185
    new-array v5, v0, [B

    move v0, v1

    move v2, v1

    move v3, v1

    .line 188
    :cond_0
    array-length v4, p0

    div-int/lit8 v4, v4, 0x2

    mul-int/lit8 v4, v4, 0x2

    if-ge v0, v4, :cond_3

    .line 190
    add-int/lit8 v4, v0, 0x1

    aget v0, p0, v0

    add-int/lit8 v6, v0, 0x1

    .line 191
    add-int/lit8 v0, v4, 0x1

    aget v4, p0, v4

    add-int/lit8 v4, v4, 0x1

    .line 192
    if-nez v6, :cond_1

    if-nez v4, :cond_1

    .line 194
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Illegal encoding!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 196
    :cond_1
    mul-int/lit8 v6, v6, 0x3

    add-int/2addr v4, v6

    .line 197
    new-array v6, v9, [I

    sget-object v7, Lorg/spongycastle/math/ntru/util/ArrayEncoder;->c:[I

    aget v7, v7, v4

    aput v7, v6, v1

    const/4 v7, 0x1

    sget-object v8, Lorg/spongycastle/math/ntru/util/ArrayEncoder;->d:[I

    aget v8, v8, v4

    aput v8, v6, v7

    const/4 v7, 0x2

    sget-object v8, Lorg/spongycastle/math/ntru/util/ArrayEncoder;->e:[I

    aget v4, v8, v4

    aput v4, v6, v7

    move v4, v1

    .line 198
    :goto_0
    if-ge v4, v9, :cond_0

    .line 200
    aget-byte v7, v5, v2

    aget v8, v6, v4

    shl-int/2addr v8, v3

    or-int/2addr v7, v8

    int-to-byte v7, v7

    aput-byte v7, v5, v2

    .line 201
    const/4 v7, 0x7

    if-ne v3, v7, :cond_2

    .line 204
    add-int/lit8 v2, v2, 0x1

    move v3, v1

    .line 198
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 208
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 212
    :cond_3
    return-object v5
.end method

.method public static a([II)[B
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 68
    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v0

    rsub-int/lit8 v5, v0, 0x1f

    .line 69
    array-length v0, p0

    mul-int/2addr v0, v5

    .line 70
    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v0, v0, 0x8

    .line 71
    new-array v6, v0, [B

    move v0, v1

    move v2, v1

    move v3, v1

    .line 74
    :goto_0
    array-length v4, p0

    if-ge v0, v4, :cond_2

    move v4, v1

    .line 76
    :goto_1
    if-ge v4, v5, :cond_1

    .line 78
    aget v7, p0, v0

    shr-int/2addr v7, v4

    and-int/lit8 v7, v7, 0x1

    .line 79
    aget-byte v8, v6, v2

    shl-int/2addr v7, v3

    or-int/2addr v7, v8

    int-to-byte v7, v7

    aput-byte v7, v6, v2

    .line 80
    const/4 v7, 0x7

    if-ne v3, v7, :cond_0

    .line 83
    add-int/lit8 v2, v2, 0x1

    move v3, v1

    .line 76
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 87
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 74
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 91
    :cond_2
    return-object v6
.end method

.method public static a([BI)[I
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 153
    new-array v2, p1, [I

    move v1, v0

    .line 155
    :cond_0
    array-length v3, p0

    mul-int/lit8 v3, v3, 0x8

    if-ge v0, v3, :cond_1

    .line 157
    add-int/lit8 v3, v0, 0x1

    invoke-static {p0, v0}, Lorg/spongycastle/math/ntru/util/ArrayEncoder;->b([BI)I

    move-result v4

    .line 158
    add-int/lit8 v5, v3, 0x1

    invoke-static {p0, v3}, Lorg/spongycastle/math/ntru/util/ArrayEncoder;->b([BI)I

    move-result v3

    .line 159
    add-int/lit8 v0, v5, 0x1

    invoke-static {p0, v5}, Lorg/spongycastle/math/ntru/util/ArrayEncoder;->b([BI)I

    move-result v5

    .line 160
    mul-int/lit8 v4, v4, 0x4

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v3, v4

    add-int/2addr v3, v5

    .line 161
    add-int/lit8 v4, v1, 0x1

    sget-object v5, Lorg/spongycastle/math/ntru/util/ArrayEncoder;->a:[I

    aget v5, v5, v3

    aput v5, v2, v1

    .line 162
    add-int/lit8 v1, v4, 0x1

    sget-object v5, Lorg/spongycastle/math/ntru/util/ArrayEncoder;->b:[I

    aget v3, v5, v3

    aput v3, v2, v4

    .line 164
    add-int/lit8 v3, p1, -0x2

    if-le v1, v3, :cond_0

    .line 166
    :cond_1
    return-object v2
.end method

.method public static a([BII)[I
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 106
    new-array v2, p1, [I

    .line 107
    invoke-static {p2}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v1

    rsub-int/lit8 v3, v1, 0x1f

    .line 108
    mul-int v4, p1, v3

    move v1, v0

    .line 110
    :goto_0
    if-ge v1, v4, :cond_1

    .line 112
    if-lez v1, :cond_0

    rem-int v5, v1, v3

    if-nez v5, :cond_0

    .line 114
    add-int/lit8 v0, v0, 0x1

    .line 116
    :cond_0
    invoke-static {p0, v1}, Lorg/spongycastle/math/ntru/util/ArrayEncoder;->b([BI)I

    move-result v5

    .line 117
    aget v6, v2, v0

    rem-int v7, v1, v3

    shl-int/2addr v5, v7

    add-int/2addr v5, v6

    aput v5, v2, v0

    .line 110
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 119
    :cond_1
    return-object v2
.end method

.method private static b([BI)I
    .locals 2

    .prologue
    .line 288
    div-int/lit8 v0, p1, 0x8

    .line 289
    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    .line 290
    rem-int/lit8 v1, p1, 0x8

    shr-int/2addr v0, v1

    and-int/lit8 v0, v0, 0x1

    return v0
.end method
