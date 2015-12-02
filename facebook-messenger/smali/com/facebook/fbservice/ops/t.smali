.class Lcom/facebook/fbservice/ops/t;
.super Ljava/lang/Object;
.source "DefaultBlueServiceOperationFactory.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/ops/r;


# direct methods
.method constructor <init>(Lcom/facebook/fbservice/ops/r;)V
    .locals 0

    .prologue
    .line 412
    iput-object p1, p0, Lcom/facebook/fbservice/ops/t;->a:Lcom/facebook/fbservice/ops/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 415
    iget-object v0, p0, Lcom/facebook/fbservice/ops/t;->a:Lcom/facebook/fbservice/ops/r;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/r;->g(Lcom/facebook/fbservice/ops/r;)V

    .line 416
    return-void
.end method
