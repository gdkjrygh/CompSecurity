.class Lcom/qihoo360/common/utils/TLVBuilder$b;
.super Lcom/qihoo360/common/utils/TLVBuilder$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/common/utils/TLVBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic c:Lcom/qihoo360/common/utils/TLVBuilder;

.field private d:[B


# direct methods
.method public constructor <init>(Lcom/qihoo360/common/utils/TLVBuilder;I[B)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 535
    iput-object p1, p0, Lcom/qihoo360/common/utils/TLVBuilder$b;->c:Lcom/qihoo360/common/utils/TLVBuilder;

    invoke-direct {p0, p1, v0}, Lcom/qihoo360/common/utils/TLVBuilder$a;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;Lcom/qihoo360/common/utils/TLVBuilder$a;)V

    .line 528
    iput-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$b;->d:[B

    .line 536
    iput p2, p0, Lcom/qihoo360/common/utils/TLVBuilder$b;->a:I

    .line 537
    iput-object p3, p0, Lcom/qihoo360/common/utils/TLVBuilder$b;->d:[B

    .line 538
    return-void
.end method


# virtual methods
.method public b()Lcom/qihoo360/common/utils/TLVBuilder$DataType;
    .locals 1

    .prologue
    .line 553
    sget-object v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_BYTES:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    return-object v0
.end method

.method public c()[B
    .locals 1

    .prologue
    .line 558
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$b;->d:[B

    if-nez v0, :cond_0

    .line 559
    const/4 v0, 0x0

    .line 561
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$b;->d:[B

    goto :goto_0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 541
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$b;->d:[B

    if-nez v0, :cond_0

    .line 542
    const/4 v0, 0x0

    .line 544
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$b;->d:[B

    array-length v0, v0

    goto :goto_0
.end method

.method public e()[B
    .locals 1

    .prologue
    .line 548
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$b;->d:[B

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 532
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "TLVItemBytes [mBytes="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/qihoo360/common/utils/TLVBuilder$b;->d:[B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", mId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo360/common/utils/TLVBuilder$b;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
