.class Lcom/qihoo/security/opti/trashclear/ui/h$5;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/h;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/h;)V
    .locals 0

    .prologue
    .line 1495
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 9

    .prologue
    const/4 v4, 0x4

    const-wide/16 v6, 0xa

    const/4 v8, 0x1

    const/16 v3, 0x8

    const/4 v1, 0x0

    .line 1499
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 1736
    :cond_0
    :goto_0
    return-void

    .line 1502
    :pswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    .line 1503
    const-string/jumbo v1, "targetSize"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 1504
    const-string/jumbo v1, "initSize"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 1505
    div-long v0, v2, v6

    iget v6, p1, Landroid/os/Message;->arg1:I

    int-to-long v6, v6

    mul-long/2addr v0, v6

    add-long/2addr v0, v4

    .line 1514
    iget v6, p1, Landroid/os/Message;->arg1:I

    const/16 v7, 0xa

    if-ne v6, v7, :cond_1

    .line 1515
    add-long v0, v4, v2

    .line 1520
    :cond_1
    iget-object v6, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v6, v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/h;J)V

    .line 1521
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    .line 1522
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->f(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 1523
    const/16 v1, 0xc

    iput v1, v0, Landroid/os/Message;->what:I

    .line 1524
    iget v1, p1, Landroid/os/Message;->arg1:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 1525
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1526
    const-string/jumbo v6, "targetSize"

    invoke-virtual {v1, v6, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1527
    const-string/jumbo v2, "initSize"

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1528
    invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 1529
    const/16 v1, 0xc

    iput v1, v0, Landroid/os/Message;->what:I

    .line 1530
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->f(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/os/Handler;

    move-result-object v1

    const-wide/16 v2, 0x3c

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 1535
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->g(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1536
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->h(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 1537
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->i(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    goto :goto_0

    .line 1540
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->j(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->j(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->getCount()I

    move-result v0

    if-gtz v0, :cond_3

    .line 1541
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->g(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    :cond_3
    move v0, v1

    .line 1547
    :goto_1
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->i(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/widget/ListView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/ListView;->getChildCount()I

    move-result v2

    if-ge v0, v2, :cond_4

    .line 1548
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->i(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/widget/ListView;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1549
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->k(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/a/a/a;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/h;->i(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/widget/ListView;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/qihoo/security/a/a/a;->a(Landroid/view/View;)V

    .line 1547
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1554
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->k(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/a/a/a;

    move-result-object v0

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/h$5$1;

    invoke-direct {v2, p0}, Lcom/qihoo/security/opti/trashclear/ui/h$5$1;-><init>(Lcom/qihoo/security/opti/trashclear/ui/h$5;)V

    invoke-virtual {v0, v2}, Lcom/qihoo/security/a/a/a;->a(Lcom/qihoo/security/a/a/a$a;)V

    .line 1572
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->k(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/a/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/a/a/a;->b()V

    .line 1573
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->i(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEnabled(Z)V

    .line 1575
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->f(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    .line 1582
    :goto_2
    :pswitch_3
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->i(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_5

    .line 1584
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->n(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/a/a/a;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->i(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/widget/ListView;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/qihoo/security/a/a/a;->a(Landroid/view/View;)V

    .line 1582
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 1590
    :cond_5
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    .line 1591
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->n(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/a/a/a;

    move-result-object v1

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/h$5$2;

    invoke-direct {v2, p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/h$5$2;-><init>(Lcom/qihoo/security/opti/trashclear/ui/h$5;Ljava/lang/Long;)V

    invoke-virtual {v1, v2}, Lcom/qihoo/security/a/a/a;->a(Lcom/qihoo/security/a/a/a$a;)V

    .line 1610
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->l(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 1614
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->n(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/a/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/a/a/a;->b()V

    goto/16 :goto_0

    .line 1620
    :pswitch_4
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->j(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1621
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->j(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->notifyDataSetChanged()V

    .line 1622
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->o(Lcom/qihoo/security/opti/trashclear/ui/h;)V

    goto/16 :goto_0

    .line 1635
    :pswitch_5
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/16 v2, 0xa

    if-ge v0, v2, :cond_6

    .line 1636
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->p(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->c(Lcom/qihoo/security/opti/trashclear/ui/h;)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/e;->d(I)J

    move-result-wide v2

    div-long/2addr v2, v6

    iget v0, p1, Landroid/os/Message;->arg1:I

    int-to-long v4, v0

    mul-long/2addr v2, v4

    .line 1637
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->p(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v0

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v4}, Lcom/qihoo/security/opti/trashclear/ui/h;->c(Lcom/qihoo/security/opti/trashclear/ui/h;)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    move-result-wide v4

    div-long/2addr v4, v6

    iget v0, p1, Landroid/os/Message;->arg1:I

    int-to-long v6, v0

    mul-long/2addr v4, v6

    .line 1638
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 1639
    const/4 v4, 0x3

    iput v4, v0, Landroid/os/Message;->what:I

    .line 1640
    iget v4, p1, Landroid/os/Message;->arg1:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v0, Landroid/os/Message;->arg1:I

    .line 1641
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v4}, Lcom/qihoo/security/opti/trashclear/ui/h;->f(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/os/Handler;

    move-result-object v4

    const-wide/16 v6, 0x32

    invoke-virtual {v4, v0, v6, v7}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1656
    :goto_3
    invoke-static {v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(J)[Ljava/lang/String;

    move-result-object v0

    .line 1657
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->q(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/widget/ShadowTextView;

    move-result-object v2

    aget-object v3, v0, v1

    invoke-virtual {v2, v3}, Lcom/qihoo/security/widget/ShadowTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1658
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->r(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 1659
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->s(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 1660
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->r(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v1

    aget-object v0, v0, v8

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1643
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->p(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->c(Lcom/qihoo/security/opti/trashclear/ui/h;)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/e;->d(I)J

    move-result-wide v2

    .line 1644
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->p(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v0

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v4}, Lcom/qihoo/security/opti/trashclear/ui/h;->c(Lcom/qihoo/security/opti/trashclear/ui/h;)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    goto :goto_3

    .line 1664
    :pswitch_6
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->t(Lcom/qihoo/security/opti/trashclear/ui/h;)V

    goto/16 :goto_0

    .line 1667
    :pswitch_7
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->i(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    goto/16 :goto_0

    .line 1673
    :pswitch_8
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->c(Lcom/qihoo/security/opti/trashclear/ui/h;)I

    move-result v0

    if-eqz v0, :cond_7

    .line 1674
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->p(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->c(Lcom/qihoo/security/opti/trashclear/ui/h;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/e;->c(I)J

    move-result-wide v2

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->p(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v1

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v4}, Lcom/qihoo/security/opti/trashclear/ui/h;->c(Lcom/qihoo/security/opti/trashclear/ui/h;)I

    move-result v4

    invoke-virtual {v1, v4}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-float v1, v2

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;->a(F)I

    move-result v1

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;->a(I)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 1684
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->u(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v0

    .line 1685
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->setAllBgColor(I)V

    .line 1686
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->v(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->u(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V

    goto/16 :goto_0

    .line 1688
    :cond_7
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v0

    .line 1689
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->setAllBgColor(I)V

    .line 1690
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->v(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-interface {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V

    goto/16 :goto_0

    .line 1694
    :pswitch_9
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->p(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->c(Lcom/qihoo/security/opti/trashclear/ui/h;)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    .line 1695
    iget v0, p1, Landroid/os/Message;->arg1:I

    if-le v0, v8, :cond_8

    .line 1696
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->p(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->c(Lcom/qihoo/security/opti/trashclear/ui/h;)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    move-result-wide v2

    div-long/2addr v2, v6

    iget v0, p1, Landroid/os/Message;->arg1:I

    int-to-long v4, v0

    mul-long/2addr v2, v4

    .line 1697
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 1698
    const/4 v4, 0x7

    iput v4, v0, Landroid/os/Message;->what:I

    .line 1699
    iget v4, p1, Landroid/os/Message;->arg1:I

    add-int/lit8 v4, v4, -0x1

    iput v4, v0, Landroid/os/Message;->arg1:I

    .line 1700
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v4}, Lcom/qihoo/security/opti/trashclear/ui/h;->f(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/os/Handler;

    move-result-object v4

    const-wide/16 v6, 0x32

    invoke-virtual {v4, v0, v6, v7}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1704
    :goto_4
    invoke-static {v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(J)[Ljava/lang/String;

    move-result-object v0

    .line 1705
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->q(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/widget/ShadowTextView;

    move-result-object v2

    aget-object v3, v0, v1

    invoke-virtual {v2, v3}, Lcom/qihoo/security/widget/ShadowTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1706
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->r(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 1707
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->s(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 1708
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->r(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v1

    aget-object v0, v0, v8

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1702
    :cond_8
    const-wide/16 v2, 0x0

    goto :goto_4

    .line 1711
    :pswitch_a
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->w(Lcom/qihoo/security/opti/trashclear/ui/h;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/h;Ljava/util/List;)V

    goto/16 :goto_0

    .line 1714
    :pswitch_b
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->x(Lcom/qihoo/security/opti/trashclear/ui/h;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1718
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-static {v2, v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/h;Ljava/lang/Long;)V

    .line 1719
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(Lcom/qihoo/security/opti/trashclear/ui/h;Z)Z

    .line 1720
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/h;Z)Z

    goto/16 :goto_0

    .line 1723
    :pswitch_c
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->l(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 1724
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->i(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setVisibility(I)V

    .line 1725
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->h(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 1726
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->m(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    const v1, 0x7f0c0150

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 1727
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->g(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1728
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h$5;->a:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->m(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setEnabled(Z)V

    goto/16 :goto_0

    .line 1499
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_c
    .end packed-switch
.end method
