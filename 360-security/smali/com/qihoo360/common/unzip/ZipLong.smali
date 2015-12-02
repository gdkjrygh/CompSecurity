.class public final Lcom/qihoo360/common/unzip/ZipLong;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final AED_SIG:Lcom/qihoo360/common/unzip/ZipLong;

.field public static final CFH_SIG:Lcom/qihoo360/common/unzip/ZipLong;

.field public static final DD_SIG:Lcom/qihoo360/common/unzip/ZipLong;

.field public static final LFH_SIG:Lcom/qihoo360/common/unzip/ZipLong;

.field public static final SINGLE_SEGMENT_SPLIT_MARKER:Lcom/qihoo360/common/unzip/ZipLong;

.field static final a:Lcom/qihoo360/common/unzip/ZipLong;


# instance fields
.field private final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 47
    new-instance v0, Lcom/qihoo360/common/unzip/ZipLong;

    const-wide/32 v2, 0x2014b50    # 1.6619997E-316

    invoke-direct {v0, v2, v3}, Lcom/qihoo360/common/unzip/ZipLong;-><init>(J)V

    sput-object v0, Lcom/qihoo360/common/unzip/ZipLong;->CFH_SIG:Lcom/qihoo360/common/unzip/ZipLong;

    .line 50
    new-instance v0, Lcom/qihoo360/common/unzip/ZipLong;

    const-wide/32 v2, 0x4034b50

    invoke-direct {v0, v2, v3}, Lcom/qihoo360/common/unzip/ZipLong;-><init>(J)V

    sput-object v0, Lcom/qihoo360/common/unzip/ZipLong;->LFH_SIG:Lcom/qihoo360/common/unzip/ZipLong;

    .line 60
    new-instance v0, Lcom/qihoo360/common/unzip/ZipLong;

    const-wide/32 v2, 0x8074b50

    invoke-direct {v0, v2, v3}, Lcom/qihoo360/common/unzip/ZipLong;-><init>(J)V

    sput-object v0, Lcom/qihoo360/common/unzip/ZipLong;->DD_SIG:Lcom/qihoo360/common/unzip/ZipLong;

    .line 67
    new-instance v0, Lcom/qihoo360/common/unzip/ZipLong;

    const-wide v2, 0xffffffffL

    invoke-direct {v0, v2, v3}, Lcom/qihoo360/common/unzip/ZipLong;-><init>(J)V

    sput-object v0, Lcom/qihoo360/common/unzip/ZipLong;->a:Lcom/qihoo360/common/unzip/ZipLong;

    .line 78
    new-instance v0, Lcom/qihoo360/common/unzip/ZipLong;

    const-wide/32 v2, 0x30304b50

    invoke-direct {v0, v2, v3}, Lcom/qihoo360/common/unzip/ZipLong;-><init>(J)V

    .line 77
    sput-object v0, Lcom/qihoo360/common/unzip/ZipLong;->SINGLE_SEGMENT_SPLIT_MARKER:Lcom/qihoo360/common/unzip/ZipLong;

    .line 84
    new-instance v0, Lcom/qihoo360/common/unzip/ZipLong;

    const-wide/32 v2, 0x8064b50

    invoke-direct {v0, v2, v3}, Lcom/qihoo360/common/unzip/ZipLong;-><init>(J)V

    sput-object v0, Lcom/qihoo360/common/unzip/ZipLong;->AED_SIG:Lcom/qihoo360/common/unzip/ZipLong;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-wide p1, p0, Lcom/qihoo360/common/unzip/ZipLong;->b:J

    .line 92
    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .prologue
    .line 99
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo360/common/unzip/ZipLong;-><init>([BI)V

    .line 100
    return-void
.end method

.method public constructor <init>([BI)V
    .locals 2

    .prologue
    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    invoke-static {p1, p2}, Lcom/qihoo360/common/unzip/ZipLong;->getValue([BI)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo360/common/unzip/ZipLong;->b:J

    .line 109
    return-void
.end method

.method public static getBytes(J)[B
    .locals 6

    .prologue
    .line 133
    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 134
    const/4 v1, 0x0

    const-wide/16 v2, 0xff

    and-long/2addr v2, p0

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 135
    const/4 v1, 0x1

    const-wide/32 v2, 0xff00

    and-long/2addr v2, p0

    const/16 v4, 0x8

    shr-long/2addr v2, v4

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 136
    const/4 v1, 0x2

    const-wide/32 v2, 0xff0000

    and-long/2addr v2, p0

    const/16 v4, 0x10

    shr-long/2addr v2, v4

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 137
    const/4 v1, 0x3

    const-wide v2, 0xff000000L

    and-long/2addr v2, p0

    const/16 v4, 0x18

    shr-long/2addr v2, v4

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 138
    return-object v0
.end method

.method public static getValue([B)J
    .locals 2

    .prologue
    .line 161
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/qihoo360/common/unzip/ZipLong;->getValue([BI)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getValue([BI)J
    .locals 4

    .prologue
    .line 148
    add-int/lit8 v0, p1, 0x3

    aget-byte v0, p0, v0

    shl-int/lit8 v0, v0, 0x18

    int-to-long v0, v0

    const-wide v2, 0xff000000L

    and-long/2addr v0, v2

    .line 149
    add-int/lit8 v2, p1, 0x2

    aget-byte v2, p0, v2

    shl-int/lit8 v2, v2, 0x10

    const/high16 v3, 0xff0000

    and-int/2addr v2, v3

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 150
    add-int/lit8 v2, p1, 0x1

    aget-byte v2, p0, v2

    shl-int/lit8 v2, v2, 0x8

    const v3, 0xff00

    and-int/2addr v2, v3

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 151
    aget-byte v2, p0, p1

    and-int/lit16 v2, v2, 0xff

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 152
    return-wide v0
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 189
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 190
    :catch_0
    move-exception v0

    .line 192
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 171
    if-eqz p1, :cond_0

    instance-of v1, p1, Lcom/qihoo360/common/unzip/ZipLong;

    if-nez v1, :cond_1

    .line 174
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-wide v2, p0, Lcom/qihoo360/common/unzip/ZipLong;->b:J

    check-cast p1, Lcom/qihoo360/common/unzip/ZipLong;

    invoke-virtual {p1}, Lcom/qihoo360/common/unzip/ZipLong;->getValue()J

    move-result-wide v4

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public getBytes()[B
    .locals 2

    .prologue
    .line 116
    iget-wide v0, p0, Lcom/qihoo360/common/unzip/ZipLong;->b:J

    invoke-static {v0, v1}, Lcom/qihoo360/common/unzip/ZipLong;->getBytes(J)[B

    move-result-object v0

    return-object v0
.end method

.method public getValue()J
    .locals 2

    .prologue
    .line 124
    iget-wide v0, p0, Lcom/qihoo360/common/unzip/ZipLong;->b:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 183
    iget-wide v0, p0, Lcom/qihoo360/common/unzip/ZipLong;->b:J

    long-to-int v0, v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 198
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "ZipLong value: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lcom/qihoo360/common/unzip/ZipLong;->b:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
