.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->getGroupView(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

.field final synthetic b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;)V
    .locals 0

    .prologue
    .line 1537
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iput-object p2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 1541
    move-object v0, p1

    check-cast v0, Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    .line 1542
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v2

    .line 1546
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    const-string/jumbo v3, "rom_sys_info"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1547
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    .line 1548
    if-eqz v1, :cond_1

    .line 1549
    iget-boolean v4, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    if-nez v4, :cond_0

    .line 1550
    iget-object v4, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v4, v4, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget v5, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    invoke-static {v4, v5}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->e(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;I)I

    .line 1557
    :cond_0
    :goto_1
    iput-boolean v1, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    goto :goto_0

    .line 1553
    :cond_1
    iget-boolean v4, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    if-eqz v4, :cond_0

    .line 1554
    iget-object v4, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v4, v4, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget v5, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    invoke-static {v4, v5}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;I)I

    goto :goto_1

    .line 1560
    :cond_2
    if-eqz v1, :cond_4

    .line 1561
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    iget v3, v3, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    invoke-static {v0, v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->e(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;I)I

    .line 1562
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    const/4 v3, 0x1

    iput-boolean v3, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    .line 1563
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    iget-boolean v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->h:Z

    if-eqz v0, :cond_3

    .line 1564
    const/16 v0, 0x2b0b

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 1580
    :cond_3
    :goto_2
    check-cast p1, Landroid/widget/CheckBox;

    invoke-virtual {p1, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1581
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->notifyDataSetChanged()V

    .line 1582
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v1

    invoke-static {v0, v6, v1, v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;ZII)V

    .line 1583
    return-void

    .line 1568
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    iget v3, v3, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    invoke-static {v0, v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;I)I

    .line 1569
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    iput-boolean v6, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    .line 1570
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$1;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    iget-boolean v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->h:Z

    if-nez v0, :cond_3

    .line 1571
    const/16 v0, 0x2b0a

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    goto :goto_2
.end method
