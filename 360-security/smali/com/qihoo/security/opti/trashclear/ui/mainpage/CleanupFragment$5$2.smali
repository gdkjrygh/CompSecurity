.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;)V
    .locals 0

    .prologue
    .line 1455
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .prologue
    const-wide/32 v10, 0x1400000

    const-wide/16 v4, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x1

    const/4 v1, 0x0

    .line 1459
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1510
    :cond_0
    :goto_0
    return-void

    .line 1462
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1463
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v2, "clear_default_pre_last_data"

    invoke-static {v0, v2, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    .line 1468
    cmp-long v0, v2, v4

    if-lez v0, :cond_3

    cmp-long v0, v2, v10

    if-gtz v0, :cond_3

    .line 1469
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0, v7}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)Z

    .line 1471
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_7

    .line 1472
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    .line 1474
    :goto_1
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v4, v4, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v4}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->n(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/ui/main/b;

    move-result-object v4

    iget-object v5, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v5, v5, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v5}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v5

    invoke-virtual {v4, v0, v1, v5, v1}, Lcom/qihoo/security/ui/main/b;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;Landroid/view/View;Lcom/nineoldandroids/a/a$a;)V

    .line 1476
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->P(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v4, 0x7f0c0057

    invoke-virtual {v1, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1478
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Ljava/lang/String;)V

    .line 1479
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "sp_key_clear_show_prescan"

    invoke-static {v0, v1, v7}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 1508
    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;J)V

    goto/16 :goto_0

    .line 1480
    :cond_3
    cmp-long v0, v2, v10

    if-lez v0, :cond_4

    .line 1481
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0, v7}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)Z

    .line 1483
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_6

    .line 1484
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    .line 1486
    :goto_3
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v4, v4, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v4}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->n(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/ui/main/b;

    move-result-object v4

    iget-object v5, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v5, v5, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v5}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v5

    invoke-virtual {v4, v0, v1, v5, v1}, Lcom/qihoo/security/ui/main/b;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;Landroid/view/View;Lcom/nineoldandroids/a/a$a;)V

    .line 1489
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2, v3, v7}, Lcom/qihoo/security/opti/b/d;->a(Landroid/content/Context;JZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "+ "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1492
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v1

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v4, v4, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v4}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->Q(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/d;

    move-result-object v4

    const v5, 0x7f0c0056

    new-array v6, v7, [Ljava/lang/Object;

    aput-object v0, v6, v8

    invoke-virtual {v4, v5, v6}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 1494
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Ljava/lang/String;)V

    .line 1495
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "sp_key_clear_show_prescan"

    invoke-static {v0, v1, v7}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    goto/16 :goto_2

    .line 1497
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0, v8}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)Z

    .line 1499
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_5

    .line 1500
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    .line 1502
    :goto_4
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v4, v4, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v4}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v4

    invoke-virtual {v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getVisibility()I

    move-result v4

    if-nez v4, :cond_2

    .line 1503
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v4, v4, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v4}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->n(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/ui/main/b;

    move-result-object v4

    iget-object v5, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;

    iget-object v5, v5, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$5;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v5}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v5

    invoke-virtual {v4, v5, v1, v0, v1}, Lcom/qihoo/security/ui/main/b;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;Landroid/view/View;Lcom/nineoldandroids/a/a$a;)V

    goto/16 :goto_2

    :cond_5
    move-object v0, v1

    goto :goto_4

    :cond_6
    move-object v0, v1

    goto/16 :goto_3

    :cond_7
    move-object v0, v1

    goto/16 :goto_1
.end method
