.class Lcom/qihoo/security/ui/main/BoosterFragment$5;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/BoosterFragment;->b(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/app/f;

.field final synthetic b:Lcom/qihoo/security/ui/main/BoosterFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment;Landroid/support/v4/app/f;)V
    .locals 0

    .prologue
    .line 1518
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$5;->b:Lcom/qihoo/security/ui/main/BoosterFragment;

    iput-object p2, p0, Lcom/qihoo/security/ui/main/BoosterFragment$5;->a:Landroid/support/v4/app/f;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 3

    .prologue
    .line 1521
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$5;->b:Lcom/qihoo/security/ui/main/BoosterFragment;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$5;->a:Landroid/support/v4/app/f;

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment;Landroid/support/v4/app/f;)V

    .line 1523
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$5;->a:Landroid/support/v4/app/f;

    const-string/jumbo v1, "booster_result_fragment"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/f;->a(Ljava/lang/String;I)V

    .line 1524
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$5;->b:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->d_()V

    .line 1525
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$5;->b:Lcom/qihoo/security/ui/main/BoosterFragment;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$5;->b:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->x(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c01d3

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a_(Ljava/lang/String;)V

    .line 1526
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$5;->b:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->n()V

    .line 1527
    return-void
.end method
