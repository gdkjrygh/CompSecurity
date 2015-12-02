.class public final Lcom/qihoo360/common/unzip/ZipShort;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# instance fields
.field private final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput p1, p0, Lcom/qihoo360/common/unzip/ZipShort;->a:I

    .line 41
    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .prologue
    .line 48
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo360/common/unzip/ZipShort;-><init>([BI)V

    .line 49
    return-void
.end method

.method public constructor <init>([BI)V
    .locals 1

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    invoke-static {p1, p2}, Lcom/qihoo360/common/unzip/ZipShort;->getValue([BI)I

    move-result v0

    iput v0, p0, Lcom/qihoo360/common/unzip/ZipShort;->a:I

    .line 58
    return-void
.end method

.method public static getBytes(I)[B
    .locals 3

    .prologue
    .line 85
    const/4 v0, 0x2

    new-array v0, v0, [B

    .line 86
    const/4 v1, 0x0

    and-int/lit16 v2, p0, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 87
    const/4 v1, 0x1

    const v2, 0xff00

    and-int/2addr v2, p0

    shr-int/lit8 v2, v2, 0x8

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 88
    return-object v0
.end method

.method public static getValue([B)I
    .locals 1

    .prologue
    .line 109
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/qihoo360/common/unzip/ZipShort;->getValue([BI)I

    move-result v0

    return v0
.end method

.method public static getValue([BI)I
    .locals 2

    .prologue
    .line 98
    add-int/lit8 v0, p1, 0x1

    aget-byte v0, p0, v0

    shl-int/lit8 v0, v0, 0x8

    const v1, 0xff00

    and-int/2addr v0, v1

    .line 99
    aget-byte v1, p0, p1

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    .line 100
    return v0
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 137
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 138
    :catch_0
    move-exception v0

    .line 140
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 119
    if-eqz p1, :cond_0

    instance-of v1, p1, Lcom/qihoo360/common/unzip/ZipShort;

    if-nez v1, :cond_1

    .line 122
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget v1, p0, Lcom/qihoo360/common/unzip/ZipShort;->a:I

    check-cast p1, Lcom/qihoo360/common/unzip/ZipShort;

    invoke-virtual {p1}, Lcom/qihoo360/common/unzip/ZipShort;->getValue()I

    move-result v2

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public getBytes()[B
    .locals 4

    .prologue
    .line 65
    const/4 v0, 0x2

    new-array v0, v0, [B

    .line 66
    const/4 v1, 0x0

    iget v2, p0, Lcom/qihoo360/common/unzip/ZipShort;->a:I

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 67
    const/4 v1, 0x1

    iget v2, p0, Lcom/qihoo360/common/unzip/ZipShort;->a:I

    const v3, 0xff00

    and-int/2addr v2, v3

    shr-int/lit8 v2, v2, 0x8

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 68
    return-object v0
.end method

.method public getValue()I
    .locals 1

    .prologue
    .line 76
    iget v0, p0, Lcom/qihoo360/common/unzip/ZipShort;->a:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 131
    iget v0, p0, Lcom/qihoo360/common/unzip/ZipShort;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 146
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "ZipShort value: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/qihoo360/common/unzip/ZipShort;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
