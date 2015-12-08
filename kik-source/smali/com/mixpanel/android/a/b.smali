.class public final Lcom/mixpanel/android/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:[C

.field private static b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/16 v5, 0x40

    const/4 v1, 0x0

    .line 23
    new-array v0, v5, [C

    sput-object v0, Lcom/mixpanel/android/a/b;->a:[C

    .line 26
    const/16 v0, 0x41

    move v2, v1

    :goto_0
    const/16 v3, 0x5a

    if-gt v0, v3, :cond_0

    sget-object v4, Lcom/mixpanel/android/a/b;->a:[C

    add-int/lit8 v3, v2, 0x1

    aput-char v0, v4, v2

    add-int/lit8 v0, v0, 0x1

    int-to-char v0, v0

    move v2, v3

    goto :goto_0

    .line 27
    :cond_0
    const/16 v0, 0x61

    :goto_1
    const/16 v3, 0x7a

    if-gt v0, v3, :cond_1

    sget-object v4, Lcom/mixpanel/android/a/b;->a:[C

    add-int/lit8 v3, v2, 0x1

    aput-char v0, v4, v2

    add-int/lit8 v0, v0, 0x1

    int-to-char v0, v0

    move v2, v3

    goto :goto_1

    .line 28
    :cond_1
    const/16 v0, 0x30

    :goto_2
    const/16 v3, 0x39

    if-gt v0, v3, :cond_2

    sget-object v4, Lcom/mixpanel/android/a/b;->a:[C

    add-int/lit8 v3, v2, 0x1

    aput-char v0, v4, v2

    add-int/lit8 v0, v0, 0x1

    int-to-char v0, v0

    move v2, v3

    goto :goto_2

    .line 29
    :cond_2
    sget-object v0, Lcom/mixpanel/android/a/b;->a:[C

    add-int/lit8 v3, v2, 0x1

    const/16 v4, 0x2b

    aput-char v4, v0, v2

    sget-object v0, Lcom/mixpanel/android/a/b;->a:[C

    const/16 v2, 0x2f

    aput-char v2, v0, v3

    .line 32
    const/16 v0, 0x80

    new-array v0, v0, [B

    sput-object v0, Lcom/mixpanel/android/a/b;->b:[B

    move v0, v1

    .line 34
    :goto_3
    sget-object v2, Lcom/mixpanel/android/a/b;->b:[B

    array-length v2, v2

    if-ge v0, v2, :cond_3

    sget-object v2, Lcom/mixpanel/android/a/b;->b:[B

    const/4 v3, -0x1

    aput-byte v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 35
    :cond_3
    :goto_4
    if-ge v1, v5, :cond_4

    sget-object v0, Lcom/mixpanel/android/a/b;->b:[B

    sget-object v2, Lcom/mixpanel/android/a/b;->a:[C

    aget-char v2, v2, v1

    int-to-byte v3, v1

    aput-byte v3, v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_4
    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 44
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v2, v1

    invoke-static {v1, v2}, Lcom/mixpanel/android/a/b;->a([BI)[C

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method private static a([BI)[C
    .locals 12

    .prologue
    const/16 v3, 0x3d

    const/4 v1, 0x0

    .line 63
    mul-int/lit8 v0, p1, 0x4

    add-int/lit8 v0, v0, 0x2

    div-int/lit8 v6, v0, 0x3

    .line 64
    add-int/lit8 v0, p1, 0x2

    div-int/lit8 v0, v0, 0x3

    mul-int/lit8 v0, v0, 0x4

    .line 65
    new-array v7, v0, [C

    move v5, v1

    move v2, v1

    .line 68
    :goto_0
    if-ge v2, p1, :cond_4

    .line 69
    add-int/lit8 v0, v2, 0x1

    aget-byte v2, p0, v2

    and-int/lit16 v8, v2, 0xff

    .line 70
    if-ge v0, p1, :cond_0

    add-int/lit8 v2, v0, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    move v4, v0

    move v0, v2

    .line 71
    :goto_1
    if-ge v0, p1, :cond_1

    add-int/lit8 v2, v0, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    .line 72
    :goto_2
    ushr-int/lit8 v9, v8, 0x2

    .line 73
    and-int/lit8 v8, v8, 0x3

    shl-int/lit8 v8, v8, 0x4

    ushr-int/lit8 v10, v4, 0x4

    or-int/2addr v8, v10

    .line 74
    and-int/lit8 v4, v4, 0xf

    shl-int/lit8 v4, v4, 0x2

    ushr-int/lit8 v10, v0, 0x6

    or-int/2addr v4, v10

    .line 75
    and-int/lit8 v10, v0, 0x3f

    .line 76
    add-int/lit8 v0, v5, 0x1

    sget-object v11, Lcom/mixpanel/android/a/b;->a:[C

    aget-char v9, v11, v9

    aput-char v9, v7, v5

    .line 77
    add-int/lit8 v5, v0, 0x1

    sget-object v9, Lcom/mixpanel/android/a/b;->a:[C

    aget-char v8, v9, v8

    aput-char v8, v7, v0

    .line 78
    if-ge v5, v6, :cond_2

    sget-object v0, Lcom/mixpanel/android/a/b;->a:[C

    aget-char v0, v0, v4

    :goto_3
    aput-char v0, v7, v5

    add-int/lit8 v4, v5, 0x1

    .line 79
    if-ge v4, v6, :cond_3

    sget-object v0, Lcom/mixpanel/android/a/b;->a:[C

    aget-char v0, v0, v10

    :goto_4
    aput-char v0, v7, v4

    add-int/lit8 v0, v4, 0x1

    move v5, v0

    goto :goto_0

    :cond_0
    move v4, v1

    .line 70
    goto :goto_1

    :cond_1
    move v2, v0

    move v0, v1

    .line 71
    goto :goto_2

    :cond_2
    move v0, v3

    .line 78
    goto :goto_3

    :cond_3
    move v0, v3

    .line 79
    goto :goto_4

    .line 80
    :cond_4
    return-object v7
.end method
