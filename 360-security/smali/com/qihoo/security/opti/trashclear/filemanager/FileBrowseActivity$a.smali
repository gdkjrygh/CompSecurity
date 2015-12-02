.class Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;
.super Landroid/widget/BaseAdapter;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

.field private final b:Lcom/qihoo/security/opti/trashclear/filemanager/a;

.field private final c:Lcom/qihoo/security/opti/trashclear/filemanager/b;

.field private final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/opti/trashclear/filemanager/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;Ljava/util/ArrayList;Lcom/qihoo/security/opti/trashclear/filemanager/a;Lcom/qihoo/security/opti/trashclear/filemanager/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/opti/trashclear/filemanager/d;",
            ">;",
            "Lcom/qihoo/security/opti/trashclear/filemanager/a;",
            "Lcom/qihoo/security/opti/trashclear/filemanager/b;",
            ")V"
        }
    .end annotation

    .prologue
    .line 508
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 509
    iput-object p3, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->b:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    .line 510
    iput-object p4, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->c:Lcom/qihoo/security/opti/trashclear/filemanager/b;

    .line 511
    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->d:Ljava/util/ArrayList;

    .line 512
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 516
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 521
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 526
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    .prologue
    const/4 v2, 0x0

    const v8, 0x7f020132

    const/16 v7, 0x8

    const/4 v6, 0x0

    .line 531
    .line 532
    if-nez p2, :cond_3

    .line 533
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->o(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030098

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 534
    new-instance v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-direct {v1, v0, v2}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;)V

    .line 535
    const v0, 0x7f0b01ff

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->g:Landroid/widget/CheckBox;

    .line 536
    const v0, 0x7f0b01fe

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->h:Landroid/widget/FrameLayout;

    .line 537
    const v0, 0x7f0b01fc

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 538
    const v0, 0x7f0b01f8

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->f:Landroid/widget/ImageView;

    .line 539
    const v0, 0x7f0b01f7

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->e:Landroid/widget/ImageView;

    .line 540
    const v0, 0x7f0b01fa

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->a:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 541
    const v0, 0x7f0b01fb

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 542
    const v0, 0x7f0b01fd

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 543
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v0, v1

    .line 547
    :goto_0
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->b:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-virtual {v1, p1}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->a(I)Lcom/qihoo/security/opti/trashclear/filemanager/d;

    move-result-object v1

    .line 551
    if-eqz v1, :cond_2

    .line 552
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->a:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v3, v1, Lcom/qihoo/security/opti/trashclear/filemanager/d;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 553
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->o(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Landroid/content/Context;

    move-result-object v3

    iget-wide v4, v1, Lcom/qihoo/security/opti/trashclear/filemanager/d;->f:J

    invoke-static {v3, v4, v5}, Lcom/qihoo/security/opti/trashclear/filemanager/e;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 555
    iget-boolean v2, v1, Lcom/qihoo/security/opti/trashclear/filemanager/d;->d:Z

    if-eqz v2, :cond_5

    .line 556
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->i(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 557
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v2, v7}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 558
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 566
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->f:Landroid/widget/ImageView;

    invoke-virtual {v2, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 580
    :goto_1
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->i(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 581
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->h:Landroid/widget/FrameLayout;

    invoke-virtual {v2, v6}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 584
    :cond_0
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->g:Landroid/widget/CheckBox;

    new-instance v3, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a$1;

    invoke-direct {v3, p0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a$1;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;Lcom/qihoo/security/opti/trashclear/filemanager/d;)V

    invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 600
    iget-boolean v2, v1, Lcom/qihoo/security/opti/trashclear/filemanager/d;->g:Z

    if-eqz v2, :cond_6

    .line 601
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->g:Landroid/widget/CheckBox;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 602
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->i(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 603
    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->g:Landroid/widget/CheckBox;

    const v2, 0x7f02006c

    invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setButtonDrawable(I)V

    .line 611
    :cond_1
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->b:Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->d()Ljava/lang/String;

    move-result-object v0

    .line 612
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-virtual {v2}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f080050

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 613
    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/filemanager/d;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 614
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f08004f

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 615
    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 620
    :cond_2
    :goto_3
    return-object p2

    .line 545
    :cond_3
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;

    goto/16 :goto_0

    .line 568
    :cond_4
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v2, v7}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 569
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v2, v6}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 570
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, v1, Lcom/qihoo/security/opti/trashclear/filemanager/d;->e:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 571
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->e:Landroid/widget/ImageView;

    invoke-virtual {v2, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 572
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->f:Landroid/widget/ImageView;

    invoke-virtual {v2, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_1

    .line 575
    :cond_5
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v2, v7}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 576
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v2, v6}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 577
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-wide v4, v1, Lcom/qihoo/security/opti/trashclear/filemanager/d;->c:J

    invoke-static {v4, v5}, Lcom/qihoo/security/opti/trashclear/filemanager/e;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 578
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->c:Lcom/qihoo/security/opti/trashclear/filemanager/b;

    iget-object v3, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->f:Landroid/widget/ImageView;

    iget-object v4, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->e:Landroid/widget/ImageView;

    invoke-virtual {v2, v1, v3, v4}, Lcom/qihoo/security/opti/trashclear/filemanager/b;->a(Lcom/qihoo/security/opti/trashclear/filemanager/d;Landroid/widget/ImageView;Landroid/widget/ImageView;)V

    goto/16 :goto_1

    .line 606
    :cond_6
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->g:Landroid/widget/CheckBox;

    invoke-virtual {v2, v6}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 607
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->i(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 608
    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$c;->g:Landroid/widget/CheckBox;

    const v2, 0x7f02006d

    invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setButtonDrawable(I)V

    goto/16 :goto_2

    .line 617
    :cond_7
    invoke-virtual {p2, v2}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_3
.end method
