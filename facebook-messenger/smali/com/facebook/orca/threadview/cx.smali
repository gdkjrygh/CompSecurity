.class Lcom/facebook/orca/threadview/cx;
.super Ljava/lang/Object;
.source "ThreadViewMessageFragment.java"

# interfaces
.implements Lcom/facebook/zero/ui/k;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)V
    .locals 0

    .prologue
    .line 279
    iput-object p1, p0, Lcom/facebook/orca/threadview/cx;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcelable;)V
    .locals 2

    .prologue
    .line 282
    iget-object v0, p0, Lcom/facebook/orca/threadview/cx;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)Lcom/facebook/c/s;

    move-result-object v0

    check-cast p1, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/threadview/cx;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->n()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 283
    return-void
.end method

.method public b(Landroid/os/Parcelable;)V
    .locals 0

    .prologue
    .line 287
    return-void
.end method
