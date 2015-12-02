.class Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/appbox/b/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;)V
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 58
    return-void
.end method

.method public a(ILjava/lang/String;)V
    .locals 3

    .prologue
    .line 80
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    iget-object v0, v0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->r:Landroid/content/Context;

    const-string/jumbo v1, "message"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 81
    return-void
.end method

.method public a(Lcom/qihoo/security/appbox/core/AppBoxResponse;)V
    .locals 2

    .prologue
    .line 65
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_1

    .line 76
    :cond_0
    :goto_0
    return-void

    .line 71
    :cond_1
    iget-object v0, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->faceBookItems:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment$1;->a:Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;

    iget-object v1, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->faceBookItems:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;->a(Lcom/qihoo/security/appbox/ui/fragment/PickersFragment;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    goto :goto_0
.end method

.method public b()V
    .locals 0

    .prologue
    .line 88
    return-void
.end method
