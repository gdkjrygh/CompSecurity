.class Lcom/facebook/base/activity/j;
.super Ljava/lang/Object;
.source "FbFragmentActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/common/d/e;

.field final synthetic b:Lcom/facebook/base/activity/i;


# direct methods
.method constructor <init>(Lcom/facebook/base/activity/i;Lcom/facebook/common/d/e;)V
    .locals 0

    .prologue
    .line 352
    iput-object p1, p0, Lcom/facebook/base/activity/j;->b:Lcom/facebook/base/activity/i;

    iput-object p2, p0, Lcom/facebook/base/activity/j;->a:Lcom/facebook/common/d/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 355
    iget-object v0, p0, Lcom/facebook/base/activity/j;->a:Lcom/facebook/common/d/e;

    invoke-interface {v0}, Lcom/facebook/common/d/e;->a()V

    .line 356
    return-void
.end method
