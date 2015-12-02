.class Lcom/qihoo/security/ui/main/BoosterFragment$13$1$1;
.super Lcom/qihoo/security/widget/RevealRippleLayout$b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/BoosterFragment$13$1;->b(Lcom/nineoldandroids/a/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/BoosterFragment$13$1;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment$13$1;)V
    .locals 0

    .prologue
    .line 1039
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$13$1$1;->a:Lcom/qihoo/security/ui/main/BoosterFragment$13$1;

    invoke-direct {p0}, Lcom/qihoo/security/widget/RevealRippleLayout$b;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 1043
    new-array v0, v2, [Landroid/view/View;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$13$1$1;->a:Lcom/qihoo/security/ui/main/BoosterFragment$13$1;

    iget-object v1, v1, Lcom/qihoo/security/ui/main/BoosterFragment$13$1;->a:Lcom/qihoo/security/ui/main/BoosterFragment$13;

    iget-object v1, v1, Lcom/qihoo/security/ui/main/BoosterFragment$13;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->n(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v1

    aput-object v1, v0, v3

    new-array v1, v2, [Landroid/view/View;

    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment$13$1$1;->a:Lcom/qihoo/security/ui/main/BoosterFragment$13$1;

    iget-object v2, v2, Lcom/qihoo/security/ui/main/BoosterFragment$13$1;->a:Lcom/qihoo/security/ui/main/BoosterFragment$13;

    iget-object v2, v2, Lcom/qihoo/security/ui/main/BoosterFragment$13;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v2}, Lcom/qihoo/security/ui/main/BoosterFragment;->o(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/a;->a([Landroid/view/View;[Landroid/view/View;)J

    .line 1049
    return-void
.end method
