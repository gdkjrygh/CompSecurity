.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;J)V
    .locals 0

    .prologue
    .line 441
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iput-wide p2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .prologue
    const-wide/32 v8, 0x1400000

    const/4 v7, 0x0

    const/4 v6, 0x1

    const/4 v1, 0x0

    .line 445
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v2, "clear_default_pre_last_data"

    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->a:J

    invoke-static {v0, v2, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 446
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 491
    :cond_0
    :goto_0
    return-void

    .line 449
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 450
    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->a:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_3

    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->a:J

    cmp-long v0, v2, v8

    if-gtz v0, :cond_3

    .line 451
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0, v6}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)Z

    .line 453
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_7

    .line 454
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    .line 456
    :goto_1
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->n(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/ui/main/b;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v3, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v3, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v3

    invoke-virtual {v2, v0, v1, v3, v1}, Lcom/qihoo/security/ui/main/b;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;Landroid/view/View;Lcom/nineoldandroids/a/a$a;)V

    .line 457
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->o(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c0057

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 460
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Ljava/lang/String;)V

    .line 461
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "sp_key_clear_show_prescan"

    invoke-static {v0, v1, v6}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 489
    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->a:J

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;J)V

    goto/16 :goto_0

    .line 462
    :cond_3
    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->a:J

    cmp-long v0, v2, v8

    if-lez v0, :cond_4

    .line 463
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0, v6}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)Z

    .line 465
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_6

    .line 466
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    .line 468
    :goto_3
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->n(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/ui/main/b;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v3, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v3, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v3

    invoke-virtual {v2, v0, v1, v3, v1}, Lcom/qihoo/security/ui/main/b;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;Landroid/view/View;Lcom/nineoldandroids/a/a$a;)V

    .line 469
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->a:J

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "+ "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 472
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->p(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/d;

    move-result-object v2

    const v3, 0x7f0c0056

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v0, v4, v7

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 475
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Ljava/lang/String;)V

    .line 476
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->k(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "sp_key_clear_show_prescan"

    invoke-static {v0, v1, v6}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    goto/16 :goto_2

    .line 478
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0, v7}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;Z)Z

    .line 480
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_5

    .line 481
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->l(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    .line 483
    :goto_4
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getVisibility()I

    move-result v2

    if-nez v2, :cond_2

    .line 484
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->n(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/ui/main/b;

    move-result-object v2

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;

    iget-object v3, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19$1;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;

    iget-object v3, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$19;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->m(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v3

    invoke-virtual {v2, v3, v1, v0, v1}, Lcom/qihoo/security/ui/main/b;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;Landroid/view/View;Lcom/nineoldandroids/a/a$a;)V

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
