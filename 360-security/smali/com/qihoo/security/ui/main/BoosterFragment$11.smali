.class Lcom/qihoo/security/ui/main/BoosterFragment$11;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/BoosterFragment;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/BoosterFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V
    .locals 0

    .prologue
    .line 832
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$11;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    .line 836
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 839
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$11;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment;)J

    move-result-wide v0

    const-wide/16 v4, -0x1

    cmp-long v0, v0, v4

    if-nez v0, :cond_0

    .line 840
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$11;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->b(Lcom/qihoo/security/ui/main/BoosterFragment;)J

    move-result-wide v0

    .line 852
    :goto_0
    const-string/jumbo v3, "free_memory_kb"

    invoke-virtual {v2, v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 853
    const-string/jumbo v0, "exam_status"

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$11;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->c(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 854
    const-string/jumbo v0, "battery_power"

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$11;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->d(Lcom/qihoo/security/ui/main/BoosterFragment;)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 855
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$11;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 856
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$11;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v2, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 857
    const/16 v0, 0x2b07

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 858
    return-void

    .line 842
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$11;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment;)J

    move-result-wide v0

    goto :goto_0
.end method
