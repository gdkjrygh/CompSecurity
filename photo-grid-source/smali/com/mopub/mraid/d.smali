.class final Lcom/mopub/mraid/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/mopub/mobileads/ViewGestureDetector;

.field final synthetic b:Lcom/mopub/mraid/MraidBridge;


# direct methods
.method constructor <init>(Lcom/mopub/mraid/MraidBridge;Lcom/mopub/mobileads/ViewGestureDetector;)V
    .locals 0

    .prologue
    .line 160
    iput-object p1, p0, Lcom/mopub/mraid/d;->b:Lcom/mopub/mraid/MraidBridge;

    iput-object p2, p0, Lcom/mopub/mraid/d;->a:Lcom/mopub/mobileads/ViewGestureDetector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 163
    iget-object v0, p0, Lcom/mopub/mraid/d;->a:Lcom/mopub/mobileads/ViewGestureDetector;

    invoke-virtual {v0, p2}, Lcom/mopub/mobileads/ViewGestureDetector;->sendTouchEvent(Landroid/view/MotionEvent;)V

    .line 165
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 173
    :cond_0
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 168
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    .line 169
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    goto :goto_0

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
