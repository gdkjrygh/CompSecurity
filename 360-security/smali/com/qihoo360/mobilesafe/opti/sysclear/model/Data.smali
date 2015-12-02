.class public Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getPackage_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;"
        }
    .end annotation

    .prologue
    .line 50
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->e:Ljava/util/List;

    return-object v0
.end method

.method public getProcess_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;"
        }
    .end annotation

    .prologue
    .line 26
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->b:Ljava/util/List;

    return-object v0
.end method

.method public getSharedUserId_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;"
        }
    .end annotation

    .prologue
    .line 34
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->c:Ljava/util/List;

    return-object v0
.end method

.method public getSuper_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;"
        }
    .end annotation

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->d:Ljava/util/List;

    return-object v0
.end method

.method public getSystem_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;"
        }
    .end annotation

    .prologue
    .line 18
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->a:Ljava/util/List;

    return-object v0
.end method

.method public setPackage_(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 54
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->e:Ljava/util/List;

    .line 55
    return-void
.end method

.method public setProcess_(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 30
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->b:Ljava/util/List;

    .line 31
    return-void
.end method

.method public setSharedUserId_(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 38
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->c:Ljava/util/List;

    .line 39
    return-void
.end method

.method public setSuper_(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 46
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->d:Ljava/util/List;

    .line 47
    return-void
.end method

.method public setSystem_(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/sysclear/model/Item;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 22
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->a:Ljava/util/List;

    .line 23
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .prologue
    .line 59
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->a:Ljava/util/List;

    if-nez v0, :cond_0

    const-string/jumbo v0, ""

    .line 60
    :goto_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->b:Ljava/util/List;

    if-nez v1, :cond_1

    const-string/jumbo v1, ""

    .line 61
    :goto_1
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->c:Ljava/util/List;

    if-nez v2, :cond_2

    const-string/jumbo v2, ""

    .line 62
    :goto_2
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->d:Ljava/util/List;

    if-nez v3, :cond_3

    const-string/jumbo v3, ""

    .line 63
    :goto_3
    iget-object v4, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->e:Ljava/util/List;

    if-nez v4, :cond_4

    const-string/jumbo v4, ""

    .line 64
    :goto_4
    new-instance v5, Ljava/lang/StringBuilder;

    const-string/jumbo v6, "system:"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v5, "\nprocess:"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "\nsharedUserId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "\nsuperStr:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 65
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "\npackageStr:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 59
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 60
    :cond_1
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->b:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 61
    :cond_2
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->c:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    .line 62
    :cond_3
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->d:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    .line 63
    :cond_4
    iget-object v4, p0, Lcom/qihoo360/mobilesafe/opti/sysclear/model/Data;->e:Ljava/util/List;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_4
.end method
