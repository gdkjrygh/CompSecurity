.class Lcom/qihoo/security/ui/result/view/ResultScrollView$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/result/view/ResultScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/result/view/ResultScrollView;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/result/view/ResultScrollView;)V
    .locals 0

    .prologue
    .line 152
    iput-object p1, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView$3;->a:Lcom/qihoo/security/ui/result/view/ResultScrollView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 155
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView$3;->a:Lcom/qihoo/security/ui/result/view/ResultScrollView;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/qihoo/security/ui/result/view/ResultScrollView$3;->a:Lcom/qihoo/security/ui/result/view/ResultScrollView;

    invoke-static {v2}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->a(Lcom/qihoo/security/ui/result/view/ResultScrollView;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->smoothScrollTo(II)V

    .line 156
    return-void
.end method
