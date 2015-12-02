.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->onCreateDialog(I)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)V
    .locals 0

    .prologue
    .line 541
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 544
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    move-result-object v0

    if-nez v0, :cond_0

    .line 582
    :goto_0
    return-void

    .line 548
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 549
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-virtual {v0, v5}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->dismissDialog(I)V

    goto :goto_0

    .line 552
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0, v5}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;Z)Z

    .line 553
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->c(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->d(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b(II)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    move-result-object v0

    .line 555
    if-eqz v0, :cond_3

    .line 556
    const/16 v1, 0x2b0f

    invoke-static {v1}, Lcom/qihoo/security/support/b;->c(I)V

    .line 558
    iget-object v1, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    .line 559
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-virtual {v2, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->c(Ljava/lang/String;)V

    .line 560
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->e(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->d(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;)V

    .line 564
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v1

    .line 565
    iget-boolean v2, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    if-eqz v2, :cond_2

    .line 566
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v3

    iget v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    sub-int v0, v3, v0

    invoke-static {v2, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->c(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;I)I

    .line 570
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v2

    invoke-static {v0, v6, v2, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;ZII)V

    .line 572
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->o:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c00ba

    new-array v3, v5, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(Ljava/lang/CharSequence;)V

    .line 580
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$3;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-virtual {v0, v5}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->dismissDialog(I)V

    goto/16 :goto_0
.end method
