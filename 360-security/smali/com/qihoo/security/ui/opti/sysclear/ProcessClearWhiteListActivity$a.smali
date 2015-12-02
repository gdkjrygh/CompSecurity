.class public Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;
.super Landroid/widget/BaseAdapter;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

.field private final b:Landroid/view/LayoutInflater;

.field private final c:Z


# direct methods
.method public constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/a/c$a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 498
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    .line 499
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 496
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->c:Z

    .line 500
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->b:Landroid/view/LayoutInflater;

    .line 501
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/a/c$a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 504
    if-eqz p1, :cond_0

    .line 505
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->k(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    .line 529
    :cond_0
    return-void

    .line 508
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 509
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->k(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 510
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 511
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 512
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->m(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/a/c$a;

    .line 513
    iget-boolean v2, v0, Lcom/qihoo/security/opti/a/c$a;->c:Z

    if-eqz v2, :cond_2

    .line 514
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 516
    :cond_2
    iget-object v2, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->k(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method


# virtual methods
.method public a(I)Lcom/qihoo/security/opti/a/c$a;
    .locals 1

    .prologue
    .line 549
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->k(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/a/c$a;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/a/c$a;

    goto :goto_0
.end method

.method public a(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/a/c$a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 558
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 559
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 560
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 561
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/a/c$a;

    .line 562
    iget-boolean v4, v0, Lcom/qihoo/security/opti/a/c$a;->d:Z

    if-eqz v4, :cond_0

    .line 563
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 565
    :cond_0
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 568
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 569
    invoke-interface {p1, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 570
    invoke-interface {p1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 571
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->b(Ljava/util/List;)V

    .line 572
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 573
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 574
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->notifyDataSetChanged()V

    .line 576
    :cond_2
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 534
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->k(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    .line 535
    :cond_0
    const/4 v0, 0x0

    .line 544
    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->k(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 494
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a(I)Lcom/qihoo/security/opti/a/c$a;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 554
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .prologue
    const/16 v5, 0x8

    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 581
    .line 582
    if-nez p2, :cond_1

    .line 583
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f03009c

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 584
    new-instance v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;

    invoke-direct {v2, v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;)V

    .line 585
    new-instance v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;

    invoke-direct {v1, p0, v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$1;)V

    .line 586
    const v0, 0x7f0b020b

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->a:Landroid/widget/ImageView;

    .line 587
    const v0, 0x7f0b020c

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 588
    const v0, 0x7f0b020d

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 589
    const v0, 0x7f0b020e

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->d:Landroid/widget/ImageView;

    .line 590
    iget-object v0, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 591
    const v0, 0x7f0b020f

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->e:Landroid/widget/ImageView;

    .line 592
    iget-object v0, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 593
    invoke-virtual {p2, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 594
    iget-object v0, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->d:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getId()I

    move-result v0

    invoke-virtual {p2, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 600
    :goto_0
    invoke-virtual {v1, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;->a(I)V

    .line 606
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->k(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/a/c$a;

    move-object v1, v0

    .line 609
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 610
    iget-object v0, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 611
    iget-object v0, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 612
    iget-boolean v0, v1, Lcom/qihoo/security/opti/a/c$a;->c:Z

    if-eqz v0, :cond_3

    .line 613
    iget-object v0, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->e:Landroid/widget/ImageView;

    const v4, 0x7f020055

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 632
    :goto_2
    iget-object v0, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v4, v1, Lcom/qihoo/security/opti/a/c$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 633
    iget-boolean v0, v1, Lcom/qihoo/security/opti/a/c$a;->d:Z

    if-eqz v0, :cond_5

    .line 634
    iget-object v0, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v4, 0x7f0c00be

    invoke-virtual {v0, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 640
    :goto_3
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->n(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/Map;

    move-result-object v0

    iget-object v4, v1, Lcom/qihoo/security/opti/a/c$a;->a:Ljava/lang/String;

    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 641
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->n(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/Map;

    move-result-object v0

    iget-object v4, v1, Lcom/qihoo/security/opti/a/c$a;->a:Ljava/lang/String;

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 642
    if-eqz v0, :cond_6

    .line 643
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 646
    :goto_4
    if-nez v0, :cond_0

    .line 647
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    iget-object v3, v1, Lcom/qihoo/security/opti/a/c$a;->a:Ljava/lang/String;

    invoke-static {v0, v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 648
    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->n(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/Map;

    move-result-object v3

    iget-object v1, v1, Lcom/qihoo/security/opti/a/c$a;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/ref/SoftReference;

    invoke-direct {v4, v0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 650
    :cond_0
    iget-object v1, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->a:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 652
    iget-object v0, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->d:Landroid/widget/ImageView;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 664
    return-object p2

    .line 596
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;

    .line 597
    iget-object v1, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->d:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getId()I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a$a;

    move-object v2, v0

    goto/16 :goto_0

    .line 606
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/a/c$a;

    move-object v1, v0

    goto/16 :goto_1

    .line 615
    :cond_3
    iget-object v0, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->e:Landroid/widget/ImageView;

    const v4, 0x7f020054

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_2

    .line 618
    :cond_4
    iget-object v0, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 619
    iget-object v0, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_2

    .line 636
    :cond_5
    iget-object v0, v2, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$b;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v4, 0x7f0c00bf

    invoke-virtual {v0, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    goto/16 :goto_3

    :cond_6
    move-object v0, v3

    goto :goto_4
.end method
