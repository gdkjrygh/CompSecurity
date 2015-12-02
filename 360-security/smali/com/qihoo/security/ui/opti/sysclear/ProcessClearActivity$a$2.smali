.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->getChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
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
    .line 1641
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iput-object p2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 1645
    move-object v0, p1

    check-cast v0, Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    .line 1646
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v1

    .line 1647
    if-eqz v0, :cond_2

    .line 1648
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    iget v3, v3, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    invoke-static {v2, v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->e(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;I)I

    .line 1650
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    const/4 v3, 0x1

    iput-boolean v3, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    .line 1651
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    iget-boolean v2, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->h:Z

    if-eqz v2, :cond_0

    .line 1652
    const/16 v2, 0x2b0b

    invoke-static {v2}, Lcom/qihoo/security/support/b;->c(I)V

    .line 1664
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    iget-boolean v2, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->h:Z

    if-eqz v2, :cond_1

    .line 1665
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    iput-boolean v4, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->h:Z

    .line 1667
    :cond_1
    check-cast p1, Landroid/widget/CheckBox;

    invoke-virtual {p1, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1672
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v2

    invoke-static {v0, v4, v2, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;ZII)V

    .line 1673
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->notifyDataSetChanged()V

    .line 1675
    return-void

    .line 1656
    :cond_2
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;->b:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    iget v3, v3, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    invoke-static {v2, v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;I)I

    .line 1658
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    iput-boolean v4, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    .line 1659
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    iget-boolean v2, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->h:Z

    if-nez v2, :cond_0

    .line 1660
    const/16 v2, 0x2b0a

    invoke-static {v2}, Lcom/qihoo/security/support/b;->c(I)V

    goto :goto_0
.end method
