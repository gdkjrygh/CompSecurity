.class public Lcom/facebook/orca/camera/x;
.super Landroid/app/Activity;
.source "MonitoredActivity.java"


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/facebook/orca/camera/z;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/camera/x;->a:Ljava/util/ArrayList;

    .line 36
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/camera/z;)V
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/orca/camera/x;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    :goto_0
    return-void

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/camera/x;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public b(Lcom/facebook/orca/camera/z;)V
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/facebook/orca/camera/x;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 57
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 61
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 62
    iget-object v0, p0, Lcom/facebook/orca/camera/x;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/z;

    .line 63
    invoke-interface {v0, p0}, Lcom/facebook/orca/camera/z;->a(Lcom/facebook/orca/camera/x;)V

    goto :goto_0

    .line 65
    :cond_0
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 69
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 70
    iget-object v0, p0, Lcom/facebook/orca/camera/x;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/z;

    .line 71
    invoke-interface {v0, p0}, Lcom/facebook/orca/camera/z;->b(Lcom/facebook/orca/camera/x;)V

    goto :goto_0

    .line 73
    :cond_0
    return-void
.end method

.method protected onStart()V
    .locals 2

    .prologue
    .line 77
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 78
    iget-object v0, p0, Lcom/facebook/orca/camera/x;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/z;

    .line 79
    invoke-interface {v0, p0}, Lcom/facebook/orca/camera/z;->c(Lcom/facebook/orca/camera/x;)V

    goto :goto_0

    .line 81
    :cond_0
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 85
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 86
    iget-object v0, p0, Lcom/facebook/orca/camera/x;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/z;

    .line 87
    invoke-interface {v0, p0}, Lcom/facebook/orca/camera/z;->d(Lcom/facebook/orca/camera/x;)V

    goto :goto_0

    .line 89
    :cond_0
    return-void
.end method
