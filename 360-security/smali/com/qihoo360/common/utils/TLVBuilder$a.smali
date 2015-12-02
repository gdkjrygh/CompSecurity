.class abstract Lcom/qihoo360/common/utils/TLVBuilder$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/common/utils/TLVBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "a"
.end annotation


# instance fields
.field protected a:I

.field final synthetic b:Lcom/qihoo360/common/utils/TLVBuilder;


# direct methods
.method private constructor <init>(Lcom/qihoo360/common/utils/TLVBuilder;)V
    .locals 0

    .prologue
    .line 388
    iput-object p1, p0, Lcom/qihoo360/common/utils/TLVBuilder$a;->b:Lcom/qihoo360/common/utils/TLVBuilder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo360/common/utils/TLVBuilder;Lcom/qihoo360/common/utils/TLVBuilder$a;)V
    .locals 0

    .prologue
    .line 388
    invoke-direct {p0, p1}, Lcom/qihoo360/common/utils/TLVBuilder$a;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 390
    iget v0, p0, Lcom/qihoo360/common/utils/TLVBuilder$a;->a:I

    return v0
.end method

.method public abstract b()Lcom/qihoo360/common/utils/TLVBuilder$DataType;
.end method

.method public abstract c()[B
.end method

.method public abstract d()I
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 402
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "id:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/qihoo360/common/utils/TLVBuilder$a;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "[type:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/qihoo360/common/utils/TLVBuilder$a;->b()Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ";len:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/qihoo360/common/utils/TLVBuilder$a;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ";value("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 403
    invoke-virtual {p0}, Lcom/qihoo360/common/utils/TLVBuilder$a;->c()[B

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo360/common/utils/ByteConvertor;->toHex([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ")]\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 402
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 404
    return-object v0
.end method
