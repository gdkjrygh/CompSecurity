.class Lcom/qihoo/security/ui/result/view/BaseResultFragment$8;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/result/view/BaseResultFragment;->v()V
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
    .line 694
    iput-object p1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$8;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 697
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$8;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->n()V

    .line 699
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$8;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->i(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$8;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->j(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 700
    invoke-static {}, Lcom/qihoo/security/adv/AdvDataManager;->a()Lcom/qihoo/security/adv/AdvDataManager;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Show:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    iget-object v2, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$8;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-static {v2}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->i(Lcom/qihoo/security/ui/result/view/BaseResultFragment;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;Ljava/util/List;)V

    .line 701
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$8;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    invoke-static {v0, v3}, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Lcom/qihoo/security/ui/result/view/BaseResultFragment;Ljava/util/List;)Ljava/util/List;

    .line 703
    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$8;->a:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    iget-object v2, v2, Lcom/qihoo/security/ui/result/view/BaseResultFragment;->r:Landroid/view/View;

    aput-object v2, v0, v1

    invoke-static {v3, v0}, Lcom/qihoo/security/ui/main/a;->a([Landroid/view/View;[Landroid/view/View;)J

    .line 704
    return-void
.end method
