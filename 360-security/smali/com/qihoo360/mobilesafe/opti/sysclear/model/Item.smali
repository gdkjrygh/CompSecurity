.class public Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCategory()I
    .locals 1

    .prologue
    .line 31
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->c:I

    return v0
.end method

.method public getFlag()I
    .locals 1

    .prologue
    .line 23
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->b:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->a:Ljava/lang/String;

    return-object v0
.end method

.method public setCategory(I)V
    .locals 0

    .prologue
    .line 35
    iput p1, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->c:I

    .line 36
    return-void
.end method

.method public setFlag(I)V
    .locals 0

    .prologue
    .line 27
    iput p1, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->b:I

    .line 28
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 19
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->a:Ljava/lang/String;

    .line 20
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "name="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "  flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "  category="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
