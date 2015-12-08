.class final Lcom/mopub/mraid/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/mopub/mraid/r;


# direct methods
.method constructor <init>(Lcom/mopub/mraid/r;)V
    .locals 0

    .prologue
    .line 394
    iput-object p1, p0, Lcom/mopub/mraid/s;->a:Lcom/mopub/mraid/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 397
    iget-object v0, p0, Lcom/mopub/mraid/s;->a:Lcom/mopub/mraid/r;

    invoke-static {v0}, Lcom/mopub/mraid/r;->a(Lcom/mopub/mraid/r;)[Landroid/view/View;

    move-result-object v1

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_2

    aget-object v3, v1, v0

    .line 399
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v4

    if-gtz v4, :cond_0

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v4

    if-lez v4, :cond_1

    .line 400
    :cond_0
    iget-object v3, p0, Lcom/mopub/mraid/s;->a:Lcom/mopub/mraid/r;

    invoke-static {v3}, Lcom/mopub/mraid/r;->b(Lcom/mopub/mraid/r;)V

    .line 397
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 407
    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v4

    new-instance v5, Lcom/mopub/mraid/t;

    invoke-direct {v5, p0, v3}, Lcom/mopub/mraid/t;-><init>(Lcom/mopub/mraid/s;Landroid/view/View;)V

    invoke-virtual {v4, v5}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto :goto_1

    .line 418
    :cond_2
    return-void
.end method
