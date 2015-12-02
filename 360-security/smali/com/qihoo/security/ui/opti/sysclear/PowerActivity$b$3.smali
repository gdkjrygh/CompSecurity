.class Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)V
    .locals 0

    .prologue
    .line 1540
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 10

    .prologue
    const/4 v8, 0x0

    .line 1543
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ExpandableListView;->getChildCount()I

    move-result v9

    .line 1544
    new-instance v1, Lcom/qihoo/security/a/a/a;

    const/4 v2, 0x2

    const/4 v3, 0x3

    const-wide/16 v4, 0x14

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->r(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v6

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->s(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v7

    invoke-direct/range {v1 .. v7}, Lcom/qihoo/security/a/a/a;-><init>(IIJII)V

    .line 1548
    if-lez v9, :cond_2

    move v0, v8

    .line 1549
    :goto_0
    if-ge v0, v9, :cond_0

    .line 1550
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v2, v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/widget/ExpandableListView;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/widget/ExpandableListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1551
    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1552
    invoke-virtual {v1, v2}, Lcom/qihoo/security/a/a/a;->a(Landroid/view/View;)V

    .line 1549
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1554
    :cond_0
    new-instance v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$3$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$3$1;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$3;)V

    invoke-virtual {v1, v0}, Lcom/qihoo/security/a/a/a;->a(Lcom/qihoo/security/a/a/a$a;)V

    .line 1563
    invoke-virtual {v1}, Lcom/qihoo/security/a/a/a;->a()I

    move-result v0

    if-eqz v0, :cond_1

    .line 1564
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v2, v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v2

    invoke-static {v0, v8, v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;II)V

    .line 1565
    invoke-virtual {v1}, Lcom/qihoo/security/a/a/a;->b()V

    .line 1566
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/widget/ExpandableListView;->setEnabled(Z)V

    .line 1574
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/widget/ExpandableListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ExpandableListView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 1575
    return-void

    .line 1572
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v1

    invoke-static {v0, v8, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;II)V

    goto :goto_1
.end method
