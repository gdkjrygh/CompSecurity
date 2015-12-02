.class Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

.field final synthetic c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;ILcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V
    .locals 0

    .prologue
    .line 484
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iput p2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    iput-object p3, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->b:Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 489
    :try_start_0
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->c(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 490
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;Z)Z

    .line 491
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->d(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->d(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 492
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->d(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 497
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 503
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v2

    const/4 v3, 0x2

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->b:Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/enginehelper/clean/a;->a(ILcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V

    .line 505
    :cond_0
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->d(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->d(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 506
    :cond_1
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    move v2, v0

    .line 508
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 509
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    .line 510
    if-eqz v0, :cond_23

    iget v3, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_23

    .line 512
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 508
    :goto_1
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move-object v1, v0

    goto :goto_0

    .line 521
    :cond_2
    if-eqz v1, :cond_4

    .line 522
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 523
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 673
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->notifyDataSetChanged()V

    .line 680
    :cond_3
    :goto_3
    return-void

    .line 525
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_2

    .line 675
    :catch_0
    move-exception v0

    goto :goto_3

    .line 528
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_2

    .line 531
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_2

    .line 533
    :cond_7
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->f(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_f

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->f(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 534
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->f(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 539
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 545
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v2

    const/4 v3, 0x4

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->b:Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/enginehelper/clean/a;->a(ILcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V

    .line 548
    :cond_8
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->f(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_9

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->f(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_e

    .line 549
    :cond_9
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_d

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_d

    move v2, v0

    .line 551
    :goto_4
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_a

    .line 552
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    .line 553
    if-eqz v0, :cond_22

    iget v3, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    const/4 v4, -0x2

    if-ne v3, v4, :cond_22

    .line 551
    :goto_5
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move-object v1, v0

    goto :goto_4

    .line 562
    :cond_a
    if-eqz v1, :cond_c

    .line 563
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 564
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 565
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    if-le v1, v0, :cond_b

    .line 566
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto/16 :goto_2

    .line 568
    :cond_b
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto/16 :goto_2

    .line 571
    :cond_c
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto/16 :goto_2

    .line 574
    :cond_d
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto/16 :goto_2

    .line 577
    :cond_e
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto/16 :goto_2

    .line 579
    :cond_f
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->g(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_17

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->g(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    .line 580
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->g(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 585
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v2

    if-eqz v2, :cond_10

    .line 591
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v2

    const/4 v3, 0x3

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->b:Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/enginehelper/clean/a;->a(ILcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V

    .line 593
    :cond_10
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->g(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_11

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->g(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_16

    .line 594
    :cond_11
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_15

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_15

    move v2, v0

    .line 596
    :goto_6
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_12

    .line 597
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    .line 598
    if-eqz v0, :cond_21

    iget v3, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    const/4 v4, -0x3

    if-ne v3, v4, :cond_21

    .line 596
    :goto_7
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move-object v1, v0

    goto :goto_6

    .line 607
    :cond_12
    if-eqz v1, :cond_14

    .line 608
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 609
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 610
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    if-le v1, v0, :cond_13

    .line 611
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto/16 :goto_2

    .line 613
    :cond_13
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto/16 :goto_2

    .line 616
    :cond_14
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto/16 :goto_2

    .line 619
    :cond_15
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto/16 :goto_2

    .line 622
    :cond_16
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto/16 :goto_2

    .line 624
    :cond_17
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->h(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1f

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->h(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1f

    .line 625
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->h(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 630
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v2

    if-eqz v2, :cond_18

    .line 636
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->e(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v2

    const/16 v3, 0x3e9

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->b:Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/enginehelper/clean/a;->a(ILcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V

    .line 639
    :cond_18
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->h(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_19

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;->h(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1e

    .line 640
    :cond_19
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1d

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1d

    move v2, v0

    .line 642
    :goto_8
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1a

    .line 643
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    .line 644
    if-eqz v0, :cond_20

    iget v3, v0, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->type:I

    const/4 v4, -0x4

    if-ne v3, v4, :cond_20

    .line 642
    :goto_9
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    move-object v1, v0

    goto :goto_8

    .line 653
    :cond_1a
    if-eqz v1, :cond_1c

    .line 654
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 655
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 656
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    if-le v1, v0, :cond_1b

    .line 657
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto/16 :goto_2

    .line 659
    :cond_1b
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto/16 :goto_2

    .line 662
    :cond_1c
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto/16 :goto_2

    .line 665
    :cond_1d
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto/16 :goto_2

    .line 668
    :cond_1e
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto/16 :goto_2

    .line 671
    :cond_1f
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->c:Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;->a(Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity$a$1;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :cond_20
    move-object v0, v1

    goto :goto_9

    :cond_21
    move-object v0, v1

    goto/16 :goto_7

    :cond_22
    move-object v0, v1

    goto/16 :goto_5

    :cond_23
    move-object v0, v1

    goto/16 :goto_1
.end method
