.class Lcom/qihoo360/common/utils/TLVBuilder$c;
.super Lcom/qihoo360/common/utils/TLVBuilder$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/common/utils/TLVBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic c:Lcom/qihoo360/common/utils/TLVBuilder;

.field private d:I


# direct methods
.method public constructor <init>(Lcom/qihoo360/common/utils/TLVBuilder;II)V
    .locals 1

    .prologue
    .line 459
    iput-object p1, p0, Lcom/qihoo360/common/utils/TLVBuilder$c;->c:Lcom/qihoo360/common/utils/TLVBuilder;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo360/common/utils/TLVBuilder$a;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;Lcom/qihoo360/common/utils/TLVBuilder$a;)V

    .line 452
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$c;->d:I

    .line 460
    iput p2, p0, Lcom/qihoo360/common/utils/TLVBuilder$c;->a:I

    .line 461
    iput p3, p0, Lcom/qihoo360/common/utils/TLVBuilder$c;->d:I

    .line 462
    return-void
.end method

.method public constructor <init>(Lcom/qihoo360/common/utils/TLVBuilder;I[B)V
    .locals 1

    .prologue
    .line 464
    iput-object p1, p0, Lcom/qihoo360/common/utils/TLVBuilder$c;->c:Lcom/qihoo360/common/utils/TLVBuilder;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo360/common/utils/TLVBuilder$a;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;Lcom/qihoo360/common/utils/TLVBuilder$a;)V

    .line 452
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$c;->d:I

    .line 465
    iput p2, p0, Lcom/qihoo360/common/utils/TLVBuilder$c;->a:I

    .line 466
    invoke-static {p3}, Lcom/qihoo360/common/utils/ByteConvertor;->toInt([B)I

    move-result v0

    iput v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$c;->d:I

    .line 467
    return-void
.end method


# virtual methods
.method public b()Lcom/qihoo360/common/utils/TLVBuilder$DataType;
    .locals 1

    .prologue
    .line 476
    sget-object v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_INT:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    return-object v0
.end method

.method public c()[B
    .locals 1

    .prologue
    .line 481
    iget v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$c;->d:I

    invoke-static {v0}, Lcom/qihoo360/common/utils/ByteConvertor;->toBytes(I)[B

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 471
    const/4 v0, 0x4

    return v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 485
    iget v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$c;->d:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 456
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "TLVItemInt [mInt="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/qihoo360/common/utils/TLVBuilder$c;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", mId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo360/common/utils/TLVBuilder$c;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
