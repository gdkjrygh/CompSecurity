.class Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->onCreateDialog(I)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)V
    .locals 0

    .prologue
    .line 499
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 502
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    move-result-object v0

    if-nez v0, :cond_0

    .line 531
    :goto_0
    return-void

    .line 506
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 507
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-virtual {v0, v5}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->dismissDialog(I)V

    goto :goto_0

    .line 510
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0, v5}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Z)Z

    .line 511
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->c(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->d(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b(II)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    move-result-object v0

    .line 513
    if-eqz v0, :cond_3

    .line 514
    const/16 v1, 0x2c30

    invoke-static {v1}, Lcom/qihoo/security/support/b;->c(I)V

    .line 515
    iget-object v1, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->a:Ljava/lang/String;

    .line 516
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-virtual {v2, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->c(Ljava/lang/String;)V

    .line 517
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->e(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v3}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->d(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;)V

    .line 520
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v1

    .line 521
    iget-boolean v2, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    if-eqz v2, :cond_2

    .line 522
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v3}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v3

    iget v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    sub-int v0, v3, v0

    invoke-static {v2, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->c(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I

    .line 525
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v2

    invoke-static {v0, v6, v2, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;ZII)V

    .line 526
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->o:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c00ba

    new-array v3, v5, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(Ljava/lang/CharSequence;)V

    .line 529
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-virtual {v0, v5}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->dismissDialog(I)V

    goto/16 :goto_0
.end method
