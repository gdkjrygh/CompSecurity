.class Lcom/qihoo360/common/utils/TLVBuilder$d;
.super Lcom/qihoo360/common/utils/TLVBuilder$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/common/utils/TLVBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic c:Lcom/qihoo360/common/utils/TLVBuilder;

.field private d:J


# direct methods
.method public constructor <init>(Lcom/qihoo360/common/utils/TLVBuilder;IJ)V
    .locals 3

    .prologue
    .line 497
    iput-object p1, p0, Lcom/qihoo360/common/utils/TLVBuilder$d;->c:Lcom/qihoo360/common/utils/TLVBuilder;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo360/common/utils/TLVBuilder$a;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;Lcom/qihoo360/common/utils/TLVBuilder$a;)V

    .line 490
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$d;->d:J

    .line 498
    iput p2, p0, Lcom/qihoo360/common/utils/TLVBuilder$d;->a:I

    .line 499
    iput-wide p3, p0, Lcom/qihoo360/common/utils/TLVBuilder$d;->d:J

    .line 500
    return-void
.end method

.method public constructor <init>(Lcom/qihoo360/common/utils/TLVBuilder;I[B)V
    .locals 2

    .prologue
    .line 502
    iput-object p1, p0, Lcom/qihoo360/common/utils/TLVBuilder$d;->c:Lcom/qihoo360/common/utils/TLVBuilder;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo360/common/utils/TLVBuilder$a;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;Lcom/qihoo360/common/utils/TLVBuilder$a;)V

    .line 490
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$d;->d:J

    .line 503
    iput p2, p0, Lcom/qihoo360/common/utils/TLVBuilder$d;->a:I

    .line 504
    invoke-static {p3}, Lcom/qihoo360/common/utils/ByteConvertor;->toLong([B)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$d;->d:J

    .line 505
    return-void
.end method


# virtual methods
.method public b()Lcom/qihoo360/common/utils/TLVBuilder$DataType;
    .locals 1

    .prologue
    .line 514
    sget-object v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_LONG:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    return-object v0
.end method

.method public c()[B
    .locals 2

    .prologue
    .line 519
    iget-wide v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$d;->d:J

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/ByteConvertor;->toBytes(J)[B

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 509
    const/16 v0, 0x8

    return v0
.end method

.method public e()J
    .locals 2

    .prologue
    .line 523
    iget-wide v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$d;->d:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 494
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "TLVItemLong [mLong="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lcom/qihoo360/common/utils/TLVBuilder$d;->d:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", mId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo360/common/utils/TLVBuilder$d;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
