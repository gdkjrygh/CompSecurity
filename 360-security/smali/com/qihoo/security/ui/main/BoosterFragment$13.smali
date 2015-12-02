.class Lcom/qihoo/security/ui/main/BoosterFragment$13;
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
    .line 1030
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$13;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-direct {p0}, Lcom/qihoo/security/booster/widget/DialView/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 1035
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$13;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    new-instance v1, Lcom/qihoo/security/ui/main/BoosterFragment$13$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/main/BoosterFragment$13$1;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment$13;)V

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment;Lcom/nineoldandroids/a/a$a;)Z

    move-result v0

    .line 1071
    if-nez v0, :cond_0

    .line 1073
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$13;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->m(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/ui/main/BoosterFragment$13$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/main/BoosterFragment$13$2;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment$13;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RevealPanel;->setCallback(Lcom/qihoo/security/widget/RevealRippleLayout$a;)V

    .line 1080
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$13;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->l(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1081
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$13;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->l(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->e()V

    .line 1082
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$13;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->p(Lcom/qihoo/security/ui/main/BoosterFragment;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/ui/main/BoosterFragment$13$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/main/BoosterFragment$13$3;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment$13;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1094
    :cond_0
    :goto_0
    return-void

    .line 1088
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$13;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->m(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1089
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$13;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->m(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/widget/RevealPanel;->e()V

    goto :goto_0

    .line 1091
    :cond_2
    new-array v0, v2, [Landroid/view/View;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$13;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->n(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v1

    aput-object v1, v0, v3

    new-array v1, v2, [Landroid/view/View;

    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment$13;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v2}, Lcom/qihoo/security/ui/main/BoosterFragment;->o(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/a;->a([Landroid/view/View;[Landroid/view/View;)J

    goto :goto_0
.end method
