.class public final Lcom/roidapp/cloudlib/ads/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/ads/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroid/view/ViewGroup;Lcom/bumptech/glide/p;)Landroid/view/View;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 43
    .line 1035
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/j;->c:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/j;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/ads/k;

    .line 44
    :goto_0
    if-eqz v0, :cond_1

    .line 45
    invoke-interface {v0, p0, p1, p2, p3}, Lcom/roidapp/cloudlib/ads/k;->a(Lcom/roidapp/cloudlib/ads/j;Landroid/view/View;Landroid/view/ViewGroup;Lcom/bumptech/glide/p;)Landroid/view/View;

    move-result-object v0

    .line 47
    :goto_1
    return-object v0

    :cond_0
    move-object v0, v1

    .line 1035
    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 47
    goto :goto_1
.end method

.method public final a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 19
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/j;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final a(Lcom/roidapp/cloudlib/ads/k;)V
    .locals 1

    .prologue
    .line 39
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/ads/j;->c:Ljava/lang/ref/WeakReference;

    .line 40
    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 23
    iput-object p1, p0, Lcom/roidapp/cloudlib/ads/j;->a:Ljava/lang/Object;

    .line 24
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 31
    iput-object p1, p0, Lcom/roidapp/cloudlib/ads/j;->b:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/j;->b:Ljava/lang/String;

    return-object v0
.end method
