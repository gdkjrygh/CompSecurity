.class public Lcom/facebook/fbservice/service/ad;
.super Ljava/lang/Object;
.source "OperationParams.java"


# instance fields
.field private final a:Lcom/facebook/fbservice/service/OperationType;

.field private final b:Landroid/os/Bundle;

.field private final c:Lcom/facebook/fbservice/service/g;


# direct methods
.method public constructor <init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 19
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/fbservice/service/ad;-><init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;Lcom/facebook/fbservice/service/g;)V

    .line 20
    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;Lcom/facebook/fbservice/service/g;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/facebook/fbservice/service/ad;->a:Lcom/facebook/fbservice/service/OperationType;

    .line 24
    iput-object p2, p0, Lcom/facebook/fbservice/service/ad;->b:Landroid/os/Bundle;

    .line 25
    iput-object p3, p0, Lcom/facebook/fbservice/service/ad;->c:Lcom/facebook/fbservice/service/g;

    .line 26
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/OperationType;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/fbservice/service/ad;->a:Lcom/facebook/fbservice/service/OperationType;

    return-object v0
.end method

.method public b()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/fbservice/service/ad;->b:Landroid/os/Bundle;

    return-object v0
.end method

.method public c()Lcom/facebook/fbservice/service/g;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/fbservice/service/ad;->c:Lcom/facebook/fbservice/service/g;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 42
    instance-of v1, p1, Lcom/facebook/fbservice/service/ad;

    if-eqz v1, :cond_0

    .line 43
    check-cast p1, Lcom/facebook/fbservice/service/ad;

    .line 45
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 48
    :cond_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 53
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/fbservice/service/ad;->a:Lcom/facebook/fbservice/service/OperationType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/facebook/fbservice/service/ad;->b:Landroid/os/Bundle;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/common/base/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
