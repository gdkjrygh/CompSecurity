.class Lcom/facebook/orca/k/f;
.super Ljava/lang/Object;
.source "LocationServiceHandler.java"

# interfaces
.implements Lcom/google/common/base/Function;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/base/Function",
        "<",
        "Landroid/location/Location;",
        "Lcom/facebook/fbservice/service/OperationResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/k/e;


# direct methods
.method constructor <init>(Lcom/facebook/orca/k/e;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/facebook/orca/k/f;->a:Lcom/facebook/orca/k/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/location/Location;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1
    .param p1    # Landroid/location/Location;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 58
    invoke-static {p1}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 55
    check-cast p1, Landroid/location/Location;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/k/f;->a(Landroid/location/Location;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method
