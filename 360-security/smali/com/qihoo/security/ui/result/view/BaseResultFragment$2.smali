.class Lcom/qihoo/security/ui/result/view/BaseResultFragment$2;
.super Lcom/qihoo/security/alasticbutton/a;
.source "360Security"


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
    .line 201
    iput-object p1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$2;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-direct {p0}, Lcom/qihoo/security/alasticbutton/a;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 0

    .prologue
    .line 209
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 213
    invoke-static {}, Lcom/qihoo/security/ui/b/b;->a()V

    .line 216
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$2;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)V

    .line 218
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$2;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->d()V

    .line 219
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$2;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->b(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)V

    .line 220
    return-void
.end method

.method public f()V
    .locals 3

    .prologue
    .line 204
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$2;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    sget-object v1, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->RESULT_ACTION_FINISH:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->b(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V

    .line 205
    return-void
.end method
