.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Z

.field final synthetic c:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

.field final synthetic d:I

.field final synthetic e:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;Landroid/view/View;ZLcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;I)V
    .locals 0

    .prologue
    .line 1820
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->e:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iput-object p2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->a:Landroid/view/View;

    iput-boolean p3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->b:Z

    iput-object p4, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->c:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    iput p5, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->d:I

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1824
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->e:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setEnabled(Z)V

    .line 1825
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->e:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1826
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 1828
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->a:Landroid/view/View;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v1, v2}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 1829
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->a:Landroid/view/View;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/nineoldandroids/b/a;->d(Landroid/view/View;F)V

    .line 1830
    iput v3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1831
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1834
    iget-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->b:Z

    if-eqz v0, :cond_0

    .line 1835
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->e:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->c(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)I

    .line 1837
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->c:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    iget-boolean v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->h:Z

    if-nez v0, :cond_1

    .line 1838
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->e:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->d(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)I

    .line 1840
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->c:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    iget v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->j:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_2

    .line 1841
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->e:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->e(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)I

    .line 1844
    :cond_2
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->d:I

    if-ltz v0, :cond_5

    .line 1845
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->e:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->c:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 1846
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->e:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->c:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;)V

    .line 1852
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->e:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->notifyDataSetChanged()V

    .line 1853
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->e:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0, v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;Z)Z

    .line 1855
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->e:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->g(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)V

    .line 1857
    :cond_4
    return-void

    .line 1848
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->e:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->e:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 1849
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->e:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$6;->c:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method
