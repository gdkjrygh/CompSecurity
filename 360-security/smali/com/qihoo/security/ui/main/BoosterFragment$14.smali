.class Lcom/qihoo/security/ui/main/BoosterFragment$14;
.super Lcom/qihoo/security/booster/widget/DialView/a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment$e;)V
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
    .line 1100
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$14;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-direct {p0}, Lcom/qihoo/security/booster/widget/DialView/a;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    .prologue
    .line 1104
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$14;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->q(Lcom/qihoo/security/ui/main/BoosterFragment;)V

    .line 1105
    return-void
.end method

.method public c()V
    .locals 4

    .prologue
    .line 1111
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$14;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 1112
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$14;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->f(Lcom/qihoo/security/ui/main/BoosterFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/app/a;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x96

    :goto_0
    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment$14;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v2}, Lcom/qihoo/security/ui/main/BoosterFragment;->r(Lcom/qihoo/security/ui/main/BoosterFragment;)Landroid/view/View;

    move-result-object v2

    new-instance v3, Lcom/qihoo/security/ui/main/BoosterFragment$14$1;

    invoke-direct {v3, p0}, Lcom/qihoo/security/ui/main/BoosterFragment$14$1;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment$14;)V

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo/security/ui/main/a;->a(JLandroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/mainpage/a$a;)V

    .line 1128
    return-void

    .line 1112
    :cond_0
    const-wide/16 v0, 0x12c

    goto :goto_0
.end method
