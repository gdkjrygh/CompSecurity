.class Lcom/qihoo/security/ui/result/view/BoostResultFragment$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/result/view/BoostResultFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/result/view/BoostResultFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/result/view/BoostResultFragment;)V
    .locals 0

    .prologue
    .line 104
    iput-object p1, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment$1;->a:Lcom/qihoo/security/ui/result/view/BoostResultFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    .prologue
    .line 108
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment$1;->a:Lcom/qihoo/security/ui/result/view/BoostResultFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->a(Lcom/qihoo/security/ui/result/view/BoostResultFragment;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 109
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment$1;->a:Lcom/qihoo/security/ui/result/view/BoostResultFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->b(Lcom/qihoo/security/ui/result/view/BoostResultFragment;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendEmptyMessage(I)Z

    .line 110
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BoostResultFragment$1;->a:Lcom/qihoo/security/ui/result/view/BoostResultFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/view/BoostResultFragment;->o()V

    .line 111
    return-void
.end method
