.class public Landroid_src/mms/e/u;
.super Ljava/lang/Object;
.source "QuotedPrintable.java"


# static fields
.field private static a:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const/16 v0, 0x3d

    sput-byte v0, Landroid_src/mms/e/u;->a:B

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a([B)[B
    .locals 7

    .prologue
    const/4 v6, -0x1

    const/4 v1, 0x0

    .line 40
    if-nez p0, :cond_0

    move-object v0, v1

    .line 66
    :goto_0
    return-object v0

    .line 43
    :cond_0
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 44
    const/4 v0, 0x0

    :goto_1
    array-length v3, p0

    if-ge v0, v3, :cond_5

    .line 45
    aget-byte v3, p0, v0

    .line 46
    sget-byte v4, Landroid_src/mms/e/u;->a:B

    if-ne v3, v4, :cond_4

    .line 48
    const/16 v3, 0xd

    add-int/lit8 v4, v0, 0x1

    :try_start_0
    aget-byte v4, p0, v4

    int-to-char v4, v4

    if-ne v3, v4, :cond_1

    const/16 v3, 0xa

    add-int/lit8 v4, v0, 0x2

    aget-byte v4, p0, v4

    int-to-char v4, v4

    if-ne v3, v4, :cond_1

    .line 50
    add-int/lit8 v0, v0, 0x2

    .line 44
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 53
    :cond_1
    add-int/lit8 v0, v0, 0x1

    aget-byte v3, p0, v0

    int-to-char v3, v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Character;->digit(CI)I

    move-result v3

    .line 54
    add-int/lit8 v0, v0, 0x1

    aget-byte v4, p0, v0

    int-to-char v4, v4

    const/16 v5, 0x10

    invoke-static {v4, v5}, Ljava/lang/Character;->digit(CI)I

    move-result v4

    .line 55
    if-eq v3, v6, :cond_2

    if-ne v4, v6, :cond_3

    :cond_2
    move-object v0, v1

    .line 56
    goto :goto_0

    .line 58
    :cond_3
    shl-int/lit8 v3, v3, 0x4

    add-int/2addr v3, v4

    int-to-char v3, v3

    invoke-virtual {v2, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 59
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 60
    goto :goto_0

    .line 63
    :cond_4
    invoke-virtual {v2, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_2

    .line 66
    :cond_5
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    goto :goto_0
.end method
