.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;
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
    .line 588
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 591
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    move-result-object v0

    if-nez v0, :cond_0

    .line 653
    :goto_0
    return-void

    .line 594
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 595
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-virtual {v0, v5}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->dismissDialog(I)V

    goto :goto_0

    .line 598
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0, v5}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;Z)Z

    .line 599
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->c(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->d(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->b(II)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;

    move-result-object v0

    .line 602
    if-eqz v0, :cond_4

    .line 603
    const/16 v1, 0x2b0d

    invoke-static {v1}, Lcom/qihoo/security/support/b;->c(I)V

    .line 605
    iget-object v1, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->a:Ljava/lang/String;

    .line 606
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->g(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Ljava/util/HashMap;

    move-result-object v2

    iget v3, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 609
    new-instance v3, Lcom/qihoo360/mobilesafe/service/KillBean;

    invoke-direct {v3}, Lcom/qihoo360/mobilesafe/service/KillBean;-><init>()V

    .line 610
    iget v4, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    iput v4, v3, Lcom/qihoo360/mobilesafe/service/KillBean;->memory:I

    .line 611
    iput-object v1, v3, Lcom/qihoo360/mobilesafe/service/KillBean;->packageName:Ljava/lang/String;

    .line 612
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 613
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->h(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 615
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->d()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 617
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->h(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v1

    invoke-interface {v1, v2}, Lcom/qihoo360/mobilesafe/core/c/c;->a(Ljava/util/List;)V

    .line 625
    :goto_1
    invoke-static {v2}, Lcom/qihoo/security/service/ProcessClearService;->b(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 639
    :cond_2
    :goto_2
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->e(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->d(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$a;->a(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;)V

    .line 643
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v1

    .line 644
    iget-boolean v2, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->c:Z

    if-eqz v2, :cond_3

    .line 645
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v3

    iget v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$b;->d:I

    sub-int v0, v3, v0

    invoke-static {v2, v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->c(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;I)I

    .line 649
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)I

    move-result v2

    invoke-static {v0, v5, v2, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;ZII)V

    .line 652
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-virtual {v0, v5}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->dismissDialog(I)V

    goto/16 :goto_0

    .line 620
    :cond_5
    :try_start_1
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    const/4 v3, 0x1

    invoke-static {v1, v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;Z)Z

    .line 622
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->h(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v1

    invoke-interface {v1, v2}, Lcom/qihoo360/mobilesafe/core/c/c;->b(Ljava/util/List;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 632
    :catch_0
    move-exception v1

    goto :goto_2
.end method
