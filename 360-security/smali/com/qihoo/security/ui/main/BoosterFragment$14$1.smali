.class Lcom/qihoo/security/ui/main/BoosterFragment$14$1;
.super Lcom/qihoo/security/opti/trashclear/ui/mainpage/a$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/BoosterFragment$14;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/BoosterFragment$14;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment$14;)V
    .locals 0

    .prologue
    .line 1113
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$14$1;->a:Lcom/qihoo/security/ui/main/BoosterFragment$14;

    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 5

    .prologue
    const/4 v2, 0x4

    .line 1123
    invoke-static {v2}, Lcom/qihoo/security/ui/b/b;->c(I)V

    .line 1124
    const-wide/16 v0, 0x0

    new-array v2, v2, [Landroid/view/View;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment$14$1;->a:Lcom/qihoo/security/ui/main/BoosterFragment$14;

    iget-object v4, v4, Lcom/qihoo/security/ui/main/BoosterFragment$14;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v4}, Lcom/qihoo/security/ui/main/BoosterFragment;->o(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment$14$1;->a:Lcom/qihoo/security/ui/main/BoosterFragment$14;

    iget-object v4, v4, Lcom/qihoo/security/ui/main/BoosterFragment$14;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v4}, Lcom/qihoo/security/ui/main/BoosterFragment;->n(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    iget-object v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment$14$1;->a:Lcom/qihoo/security/ui/main/BoosterFragment$14;

    iget-object v4, v4, Lcom/qihoo/security/ui/main/BoosterFragment$14;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v4}, Lcom/qihoo/security/ui/main/BoosterFragment;->l(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x3

    iget-object v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment$14$1;->a:Lcom/qihoo/security/ui/main/BoosterFragment$14;

    iget-object v4, v4, Lcom/qihoo/security/ui/main/BoosterFragment$14;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v4}, Lcom/qihoo/security/ui/main/BoosterFragment;->m(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/widget/RevealPanel;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/qihoo/security/ui/main/BoosterFragment$14$1;->a:Lcom/qihoo/security/ui/main/BoosterFragment$14;

    iget-object v4, v4, Lcom/qihoo/security/ui/main/BoosterFragment$14;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v4}, Lcom/qihoo/security/ui/main/BoosterFragment;->s(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/nineoldandroids/a/b;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo/security/ui/main/a;->a(J[Landroid/view/View;[Landroid/view/View;Lcom/nineoldandroids/a/b;)J

    .line 1126
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 1117
    const/4 v0, 0x4

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$14$1;->a:Lcom/qihoo/security/ui/main/BoosterFragment$14;

    iget-object v1, v1, Lcom/qihoo/security/ui/main/BoosterFragment$14;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->r(Lcom/qihoo/security/ui/main/BoosterFragment;)Landroid/view/View;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/b/b;->a(ILandroid/view/View;)V

    .line 1118
    return-void
.end method
