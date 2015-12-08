.class final Lcom/mopub/mraid/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/mopub/mraid/s;


# direct methods
.method constructor <init>(Lcom/mopub/mraid/s;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 407
    iput-object p1, p0, Lcom/mopub/mraid/t;->b:Lcom/mopub/mraid/s;

    iput-object p2, p0, Lcom/mopub/mraid/t;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 1

    .prologue
    .line 410
    iget-object v0, p0, Lcom/mopub/mraid/t;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 412
    :try_start_0
    iget-object v0, p0, Lcom/mopub/mraid/t;->b:Lcom/mopub/mraid/s;

    iget-object v0, v0, Lcom/mopub/mraid/s;->a:Lcom/mopub/mraid/r;

    invoke-static {v0}, Lcom/mopub/mraid/r;->b(Lcom/mopub/mraid/r;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 414
    :goto_0
    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method
