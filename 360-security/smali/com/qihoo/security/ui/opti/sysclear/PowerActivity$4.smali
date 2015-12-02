.class Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;
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
    .line 537
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 540
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    move-result-object v0

    if-nez v0, :cond_0

    .line 592
    :goto_0
    return-void

    .line 543
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 544
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-virtual {v0, v5}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->dismissDialog(I)V

    goto :goto_0

    .line 547
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0, v5}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Z)Z

    .line 548
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->c(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->d(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->b(II)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;

    move-result-object v0

    .line 551
    if-eqz v0, :cond_4

    .line 552
    const/16 v1, 0x2c2e

    invoke-static {v1}, Lcom/qihoo/security/support/b;->c(I)V

    .line 553
    iget-object v1, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->a:Ljava/lang/String;

    .line 554
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->g(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Ljava/util/HashMap;

    move-result-object v2

    iget v3, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 555
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 556
    new-instance v3, Lcom/qihoo360/mobilesafe/service/KillBean;

    invoke-direct {v3}, Lcom/qihoo360/mobilesafe/service/KillBean;-><init>()V

    .line 557
    iget v4, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    iput v4, v3, Lcom/qihoo360/mobilesafe/service/KillBean;->memory:I

    .line 558
    iput-object v1, v3, Lcom/qihoo360/mobilesafe/service/KillBean;->packageName:Ljava/lang/String;

    .line 559
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 560
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->h(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 562
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->c()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 564
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->h(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v1

    invoke-interface {v1, v2}, Lcom/qihoo360/mobilesafe/core/c/c;->a(Ljava/util/List;)V

    .line 571
    :goto_1
    invoke-static {v2}, Lcom/qihoo/security/service/ProcessClearService;->b(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 582
    :cond_2
    :goto_2
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->e(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v3}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->d(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$b;->a(Landroid/view/View;ILcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;)V

    .line 584
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v1

    .line 585
    iget-boolean v2, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->c:Z

    if-eqz v2, :cond_3

    .line 586
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v3}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v3

    iget v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$c;->d:I

    sub-int v0, v3, v0

    invoke-static {v2, v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->c(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;I)I

    .line 589
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)I

    move-result v2

    invoke-static {v0, v5, v2, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;ZII)V

    .line 591
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-virtual {v0, v5}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->dismissDialog(I)V

    goto/16 :goto_0

    .line 566
    :cond_5
    :try_start_1
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    const/4 v3, 0x1

    invoke-static {v1, v3}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Z)Z

    .line 568
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$4;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->h(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v1

    invoke-interface {v1, v2}, Lcom/qihoo360/mobilesafe/core/c/c;->b(Ljava/util/List;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 576
    :catch_0
    move-exception v1

    goto :goto_2
.end method
