.class Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Z

.field final synthetic c:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

.field final synthetic d:I

.field final synthetic e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;Landroid/view/View;ZLcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;I)V
    .locals 0

    .prologue
    .line 1621
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iput-object p2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->a:Landroid/view/View;

    iput-boolean p3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->b:Z

    iput-object p4, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->c:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    iput p5, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->d:I

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1625
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setEnabled(Z)V

    .line 1626
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1627
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 1628
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->a:Landroid/view/View;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v1, v2}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 1629
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->a:Landroid/view/View;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nineoldandroids/b/a;->d(Landroid/view/View;F)V

    .line 1630
    iput v3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1631
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1634
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->b:Z

    if-eqz v0, :cond_0

    .line 1635
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)I

    .line 1637
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->c:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    iget-boolean v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->h:Z

    if-nez v0, :cond_1

    .line 1638
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)I

    .line 1641
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->c:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    iget v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->j:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_2

    .line 1642
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->d(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)I

    .line 1645
    :cond_2
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->d:I

    if-ltz v0, :cond_5

    .line 1646
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->c:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 1647
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->c:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;)V

    .line 1653
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->notifyDataSetChanged()V

    .line 1654
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0, v3}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Z)Z

    .line 1656
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)V

    .line 1658
    :cond_4
    return-void

    .line 1649
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->e(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->e(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 1650
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->e:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->e(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$5;->c:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method
