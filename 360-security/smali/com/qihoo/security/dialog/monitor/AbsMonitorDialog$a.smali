.class Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;
.super Landroid/widget/BaseAdapter;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

.field private final b:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)V
    .locals 1

    .prologue
    .line 438
    iput-object p1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 439
    invoke-static {p1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->i(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->b:Landroid/view/LayoutInflater;

    .line 440
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 444
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->j(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->j(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 450
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->j(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 455
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->j(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11

    .prologue
    const/4 v10, 0x0

    const/4 v3, 0x1

    const/4 v9, 0x0

    const/16 v8, 0x8

    .line 461
    if-nez p2, :cond_1

    .line 462
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->b:Landroid/view/LayoutInflater;

    const v1, 0x7f030076

    invoke-virtual {v0, v1, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 463
    new-instance v1, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;

    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-direct {v1, v0, v10}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;-><init>(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$1;)V

    .line 464
    const v0, 0x7f0b018c

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v1, v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->a(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 465
    const v0, 0x7f0b018d

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-static {v1, v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->a(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;Lcom/qihoo/security/locale/widget/LocaleTextView;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 466
    const v0, 0x7f0b018e

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-static {v1, v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->b(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;Lcom/qihoo/security/locale/widget/LocaleTextView;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 467
    const v0, 0x7f0b0190

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-static {v1, v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->c(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;Lcom/qihoo/security/locale/widget/LocaleTextView;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 468
    const v0, 0x7f0b0192

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-static {v1, v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->d(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;Lcom/qihoo/security/locale/widget/LocaleTextView;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 469
    const v0, 0x7f0b0191

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-static {v1, v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->e(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;Lcom/qihoo/security/locale/widget/LocaleTextView;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 470
    const v0, 0x7f0b0193

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-static {v1, v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->f(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;Lcom/qihoo/security/locale/widget/LocaleTextView;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 471
    const v0, 0x7f0b018f

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    invoke-static {v1, v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->a(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;Landroid/widget/CheckBox;)Landroid/widget/CheckBox;

    .line 472
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 476
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->j(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 477
    iget-object v2, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v2}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->j(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    .line 479
    if-ne v2, v3, :cond_2

    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isMalware()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 480
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->a(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v2

    invoke-virtual {v2, v9}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 481
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->b(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Landroid/widget/CheckBox;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 487
    :goto_1
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->c(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Landroid/widget/ImageView;

    move-result-object v2

    iget-object v4, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v4}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->k(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;

    move-result-object v4

    iget-object v5, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    iget-object v6, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->filePath:Ljava/lang/String;

    iget-boolean v7, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isInstalled:Z

    invoke-static {v4, v5, v6, v7}, Lcom/qihoo360/mobilesafe/b/a;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 488
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->d(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v2

    iget-object v4, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v4}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->l(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;

    move-result-object v4

    iget-object v5, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    iget-object v6, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->filePath:Ljava/lang/String;

    iget-boolean v7, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isInstalled:Z

    invoke-static {v4, v5, v6, v7}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 489
    iget v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->maliceRank:I

    .line 490
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isTrojan()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 491
    const/4 v2, 0x3

    .line 498
    :cond_0
    :goto_2
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isWarning()Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v4, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v4}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->m(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v0}, Lcom/qihoo/security/malware/db/c;->a(Landroid/content/Context;Lcom/qihoo/security/malware/vo/MaliciousInfo;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 499
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->e(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v4

    invoke-virtual {v4, v9}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 505
    :goto_3
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->f(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v4

    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->getVirusSummaryOfDialog()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    .line 506
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->e(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v4

    invoke-virtual {v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroid/text/TextPaint;->setFlags(I)V

    .line 507
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->f(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v4

    new-instance v5, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$1;

    invoke-direct {v5, p0, v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$1;-><init>(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;Lcom/qihoo/security/malware/vo/MaliciousInfo;)V

    invoke-virtual {v4, v5}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 515
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->e(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v4

    new-instance v5, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$2;

    invoke-direct {v5, p0, v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$2;-><init>(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;Lcom/qihoo/security/malware/vo/MaliciousInfo;)V

    invoke-virtual {v4, v5}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 531
    iget-object v4, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v4}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->q(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lcom/qihoo/security/malware/b;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    .line 532
    iget-object v5, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v5}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->r(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Lcom/qihoo/security/malware/b;->b(Landroid/content/Context;I)I

    move-result v2

    .line 533
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->g(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v5

    invoke-virtual {v5, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 534
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->g(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 535
    iget-object v2, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v2}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->s(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;

    move-result-object v2

    iget v4, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->behavior:I

    const-string/jumbo v5, ";"

    invoke-static {v2, v4, v5}, Lcom/qihoo/security/malware/b;->a(Landroid/content/Context;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 536
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_6

    .line 537
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->h(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 538
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->h(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v2

    invoke-virtual {v2, v8}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 542
    :goto_4
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->b(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Landroid/widget/CheckBox;

    move-result-object v2

    invoke-virtual {v2, v10}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 543
    iget-object v2, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-static {v2}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->g(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;

    move-result-object v2

    iget v4, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 544
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->b(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Landroid/widget/CheckBox;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 548
    :goto_5
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->b(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Landroid/widget/CheckBox;

    move-result-object v1

    new-instance v2, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$3;

    invoke-direct {v2, p0, v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a$3;-><init>(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;Lcom/qihoo/security/malware/vo/MaliciousInfo;)V

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 560
    return-object p2

    .line 474
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;

    move-object v1, v0

    goto/16 :goto_0

    .line 483
    :cond_2
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->a(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v2

    invoke-virtual {v2, v8}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 484
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->b(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Landroid/widget/CheckBox;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto/16 :goto_1

    .line 492
    :cond_3
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isDanger()Z

    move-result v4

    if-eqz v4, :cond_4

    move v2, v3

    .line 493
    goto/16 :goto_2

    .line 494
    :cond_4
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isWarning()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 495
    const/4 v2, 0x2

    goto/16 :goto_2

    .line 501
    :cond_5
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->e(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto/16 :goto_3

    .line 540
    :cond_6
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->h(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v2

    invoke-virtual {v2, v8}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_4

    .line 546
    :cond_7
    invoke-static {v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;->b(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;)Landroid/widget/CheckBox;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_5
.end method
