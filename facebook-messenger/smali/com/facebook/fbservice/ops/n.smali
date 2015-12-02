.class public Lcom/facebook/fbservice/ops/n;
.super Lcom/google/common/d/a/a;
.source "BlueServiceOperationFactory.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/d/a/a",
        "<",
        "Lcom/facebook/fbservice/service/OperationResult;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lcom/facebook/fbservice/ops/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Lcom/google/common/d/a/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/ops/l;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/fbservice/ops/n;->a:Lcom/facebook/fbservice/ops/l;

    return-object v0
.end method

.method public a(Lcom/facebook/fbservice/ops/l;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/facebook/fbservice/ops/n;->a:Lcom/facebook/fbservice/ops/l;

    .line 56
    return-void
.end method
