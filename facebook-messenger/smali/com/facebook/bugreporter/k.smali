.class Lcom/facebook/bugreporter/k;
.super Ljava/lang/Object;
.source "BugReporter.java"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field final synthetic a:Lcom/google/common/d/a/s;

.field final synthetic b:Lcom/facebook/bugreporter/g;


# direct methods
.method constructor <init>(Lcom/facebook/bugreporter/g;Lcom/google/common/d/a/s;)V
    .locals 0

    .prologue
    .line 353
    iput-object p1, p0, Lcom/facebook/bugreporter/k;->b:Lcom/facebook/bugreporter/g;

    iput-object p2, p0, Lcom/facebook/bugreporter/k;->a:Lcom/google/common/d/a/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 357
    iget-object v0, p0, Lcom/facebook/bugreporter/k;->a:Lcom/google/common/d/a/s;

    invoke-interface {v0}, Lcom/google/common/d/a/s;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    .line 358
    iget-object v0, p0, Lcom/facebook/bugreporter/k;->a:Lcom/google/common/d/a/s;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/common/d/a/s;->cancel(Z)Z

    .line 360
    :cond_0
    return-void
.end method
