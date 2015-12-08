.class final Lcom/mopub/mobileads/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/mopub/mobileads/BaseHtmlWebView;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/BaseHtmlWebView;Z)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/mopub/mobileads/k;->b:Lcom/mopub/mobileads/BaseHtmlWebView;

    iput-boolean p2, p0, Lcom/mopub/mobileads/k;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    .line 65
    iget-object v0, p0, Lcom/mopub/mobileads/k;->b:Lcom/mopub/mobileads/BaseHtmlWebView;

    invoke-static {v0}, Lcom/mopub/mobileads/BaseHtmlWebView;->a(Lcom/mopub/mobileads/BaseHtmlWebView;)Lcom/mopub/mobileads/ViewGestureDetector;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/mopub/mobileads/ViewGestureDetector;->sendTouchEvent(Landroid/view/MotionEvent;)V

    .line 68
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/mopub/mobileads/k;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
