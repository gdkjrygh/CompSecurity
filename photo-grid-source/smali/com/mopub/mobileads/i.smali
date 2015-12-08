.class final Lcom/mopub/mobileads/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/mopub/mobileads/AdViewController;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/AdViewController;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 548
    iput-object p1, p0, Lcom/mopub/mobileads/i;->b:Lcom/mopub/mobileads/AdViewController;

    iput-object p2, p0, Lcom/mopub/mobileads/i;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 551
    iget-object v0, p0, Lcom/mopub/mobileads/i;->b:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->getMoPubView()Lcom/mopub/mobileads/MoPubView;

    move-result-object v0

    .line 552
    if-nez v0, :cond_0

    .line 559
    :goto_0
    return-void

    .line 555
    :cond_0
    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubView;->removeAllViews()V

    .line 557
    :try_start_0
    iget-object v1, p0, Lcom/mopub/mobileads/i;->a:Landroid/view/View;

    iget-object v2, p0, Lcom/mopub/mobileads/i;->b:Lcom/mopub/mobileads/AdViewController;

    iget-object v3, p0, Lcom/mopub/mobileads/i;->a:Landroid/view/View;

    invoke-static {v2, v3}, Lcom/mopub/mobileads/AdViewController;->a(Lcom/mopub/mobileads/AdViewController;Landroid/view/View;)Landroid/widget/FrameLayout$LayoutParams;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mopub/mobileads/MoPubView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 559
    :catch_0
    move-exception v0

    goto :goto_0
.end method
