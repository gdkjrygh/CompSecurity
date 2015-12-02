.class Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->getGroupView(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
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
    .line 1390
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iput-object p2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 1394
    move-object v0, p1

    check-cast v0, Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    .line 1395
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v2

    .line 1399
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->a:Ljava/lang/String;

    const-string/jumbo v3, "rom_sys_info"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1400
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    .line 1401
    if-eqz v1, :cond_1

    .line 1402
    iget-boolean v4, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    if-nez v4, :cond_0

    .line 1403
    iget-object v4, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v4, v4, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget v5, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    invoke-static {v4, v5}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->e(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I

    .line 1410
    :cond_0
    :goto_1
    iput-boolean v1, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    goto :goto_0

    .line 1406
    :cond_1
    iget-boolean v4, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    if-eqz v4, :cond_0

    .line 1407
    iget-object v4, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v4, v4, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget v5, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    invoke-static {v4, v5}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I

    goto :goto_1

    .line 1413
    :cond_2
    if-eqz v1, :cond_4

    .line 1414
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    iget v3, v3, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    invoke-static {v0, v3}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->e(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I

    .line 1415
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    const/4 v3, 0x1

    iput-boolean v3, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    .line 1416
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    iget-boolean v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->h:Z

    if-eqz v0, :cond_3

    .line 1417
    const/16 v0, 0x2c2c

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 1431
    :cond_3
    :goto_2
    check-cast p1, Landroid/widget/CheckBox;

    invoke-virtual {p1, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1432
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->notifyDataSetChanged()V

    .line 1433
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v1

    invoke-static {v0, v6, v1, v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;ZII)V

    .line 1434
    return-void

    .line 1420
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;->b:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    iget v3, v3, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    invoke-static {v0, v3}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I

    .line 1421
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    iput-boolean v6, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    .line 1422
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    iget-boolean v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->h:Z

    if-nez v0, :cond_3

    .line 1423
    const/16 v0, 0x2c2b

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    goto :goto_2
.end method
