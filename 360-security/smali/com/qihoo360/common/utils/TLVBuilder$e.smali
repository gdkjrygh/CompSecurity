.class Lcom/qihoo360/common/utils/TLVBuilder$e;
.super Lcom/qihoo360/common/utils/TLVBuilder$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/common/utils/TLVBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field final synthetic c:Lcom/qihoo360/common/utils/TLVBuilder;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/qihoo360/common/utils/TLVBuilder;ILjava/lang/String;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 416
    iput-object p1, p0, Lcom/qihoo360/common/utils/TLVBuilder$e;->c:Lcom/qihoo360/common/utils/TLVBuilder;

    invoke-direct {p0, p1, v0}, Lcom/qihoo360/common/utils/TLVBuilder$a;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;Lcom/qihoo360/common/utils/TLVBuilder$a;)V

    .line 409
    iput-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$e;->d:Ljava/lang/String;

    .line 417
    iput p2, p0, Lcom/qihoo360/common/utils/TLVBuilder$e;->a:I

    .line 418
    iput-object p3, p0, Lcom/qihoo360/common/utils/TLVBuilder$e;->d:Ljava/lang/String;

    .line 419
    return-void
.end method

.method public constructor <init>(Lcom/qihoo360/common/utils/TLVBuilder;I[B)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 421
    iput-object p1, p0, Lcom/qihoo360/common/utils/TLVBuilder$e;->c:Lcom/qihoo360/common/utils/TLVBuilder;

    invoke-direct {p0, p1, v0}, Lcom/qihoo360/common/utils/TLVBuilder$a;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;Lcom/qihoo360/common/utils/TLVBuilder$a;)V

    .line 409
    iput-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$e;->d:Ljava/lang/String;

    .line 422
    iput p2, p0, Lcom/qihoo360/common/utils/TLVBuilder$e;->a:I

    .line 423
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p3}, Ljava/lang/String;-><init>([B)V

    iput-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$e;->d:Ljava/lang/String;

    .line 424
    return-void
.end method


# virtual methods
.method public b()Lcom/qihoo360/common/utils/TLVBuilder$DataType;
    .locals 1

    .prologue
    .line 439
    sget-object v0, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_STRING:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    return-object v0
.end method

.method public c()[B
    .locals 1

    .prologue
    .line 444
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$e;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 445
    const/4 v0, 0x0

    .line 447
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$e;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    goto :goto_0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 427
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$e;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 428
    const/4 v0, 0x0

    .line 430
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$e;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v0, v0

    goto :goto_0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 434
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$e;->d:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 413
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "TLVItemString [mString="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/qihoo360/common/utils/TLVBuilder$e;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", mId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo360/common/utils/TLVBuilder$e;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
