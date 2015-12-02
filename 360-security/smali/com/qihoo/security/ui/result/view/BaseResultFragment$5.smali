.class Lcom/qihoo/security/ui/result/view/BaseResultFragment$5;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/result/view/BaseResultFragment;->b(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

.field final synthetic b:Landroid/os/Bundle;

.field final synthetic c:Lcom/qihoo/security/ui/result/view/BaseResultFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/result/view/BaseResultFragment;Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 576
    iput-object p1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$5;->c:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    iput-object p2, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$5;->a:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    iput-object p3, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$5;->b:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 580
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$5;->c:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->f(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)Lcom/qihoo/security/ui/fragment/BaseFragment$b;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$5;->a:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    iget-object v2, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$5;->b:Landroid/os/Bundle;

    invoke-interface {v0, v1, v2}, Lcom/qihoo/security/ui/fragment/BaseFragment$b;->a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V

    .line 582
    return-void
.end method
