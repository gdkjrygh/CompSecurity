.class Lcom/qihoo/security/ui/result/view/BaseResultFragment$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/result/view/BaseResultFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)V
    .locals 0

    .prologue
    .line 244
    iput-object p1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$3;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    .prologue
    .line 247
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$3;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->l:Lcom/qihoo/security/ui/result/view/ResultScrollView;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 248
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$3;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->l:Lcom/qihoo/security/ui/result/view/ResultScrollView;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/view/ResultScrollView;->getHeight()I

    move-result v0

    .line 252
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$3;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-static {v1}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->c(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)I

    move-result v1

    if-eq v1, v0, :cond_0

    .line 253
    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$3;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-static {v1, v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Lcom/qihoo/security/ui/result/view/BaseResultFragment;I)I

    .line 254
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$3;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->d(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)V

    .line 256
    :cond_0
    return-void
.end method
