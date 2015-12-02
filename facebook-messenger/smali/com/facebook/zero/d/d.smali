.class Lcom/facebook/zero/d/d;
.super Ljava/lang/Object;
.source "ZeroTokenManager.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/fbservice/service/OperationResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/zero/d/a;


# direct methods
.method constructor <init>(Lcom/facebook/zero/d/a;)V
    .locals 0

    .prologue
    .line 282
    iput-object p1, p0, Lcom/facebook/zero/d/d;->a:Lcom/facebook/zero/d/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 3

    .prologue
    .line 285
    iget-object v1, p0, Lcom/facebook/zero/d/d;->a:Lcom/facebook/zero/d/a;

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->g()Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "result"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/ui/CarrierBottomBannerData;

    invoke-static {v1, v0}, Lcom/facebook/zero/d/a;->a(Lcom/facebook/zero/d/a;Lcom/facebook/zero/ui/CarrierBottomBannerData;)V

    .line 287
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 282
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/zero/d/d;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 291
    return-void
.end method
