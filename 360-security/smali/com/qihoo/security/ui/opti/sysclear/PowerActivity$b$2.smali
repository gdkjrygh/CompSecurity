.class Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->getChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

.field final synthetic b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;)V
    .locals 0

    .prologue
    .line 1482
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iput-object p2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 1486
    move-object v0, p1

    check-cast v0, Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    .line 1487
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v1

    .line 1488
    if-eqz v0, :cond_2

    .line 1489
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v2, v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    iget v3, v3, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    invoke-static {v2, v3}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->e(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I

    .line 1491
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    const/4 v3, 0x1

    iput-boolean v3, v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    .line 1492
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    iget-boolean v2, v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->h:Z

    if-eqz v2, :cond_0

    .line 1493
    const/16 v2, 0x2c2c

    invoke-static {v2}, Lcom/qihoo/security/support/b;->c(I)V

    .line 1503
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    iget-boolean v2, v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->h:Z

    if-eqz v2, :cond_1

    .line 1504
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    iput-boolean v4, v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->h:Z

    .line 1506
    :cond_1
    check-cast p1, Landroid/widget/CheckBox;

    invoke-virtual {p1, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1510
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v2, v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v2

    invoke-static {v0, v4, v2, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;ZII)V

    .line 1511
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->notifyDataSetChanged()V

    .line 1513
    return-void

    .line 1496
    :cond_2
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v2, v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    iget v3, v3, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    invoke-static {v2, v3}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I

    .line 1498
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    iput-boolean v4, v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    .line 1499
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$2;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    iget-boolean v2, v2, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->h:Z

    if-nez v2, :cond_0

    .line 1500
    const/16 v2, 0x2c2b

    invoke-static {v2}, Lcom/qihoo/security/support/b;->c(I)V

    goto :goto_0
.end method
