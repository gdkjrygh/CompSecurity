.class public Lcom/qihoo/security/opti/trashclear/ui/h;
.super Landroid/widget/FrameLayout;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/AbsListView$OnScrollListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lcom/qihoo360/mobilesafe/b/e$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/ui/h$a;
    }
.end annotation


# instance fields
.field private A:I

.field private B:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

.field private C:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

.field private D:Z

.field private E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private F:Lcom/qihoo360/mobilesafe/b/e;

.field private G:Z

.field private final H:I

.field private final I:I

.field private final J:I

.field private final K:I

.field private final L:I

.field private final M:I

.field private final N:I

.field private final O:I

.field private final P:I

.field private final Q:I

.field private final R:I

.field private final S:I

.field private final T:I

.field private final U:Landroid/os/Handler;

.field private V:Lcom/qihoo/security/opti/trashclear/ui/b;

.field private W:Lcom/qihoo/security/opti/trashclear/ui/c;

.field private Z:Lcom/qihoo/security/opti/trashclear/ui/b;

.field private a:Lcom/qihoo/security/widget/ShadowTextView;

.field private b:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private c:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private d:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private e:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private f:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private g:Lcom/qihoo/security/locale/d;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/widget/ListView;

.field private j:Landroid/widget/FrameLayout;

.field private k:Landroid/view/View;

.field private l:Landroid/content/Context;

.field private m:Lcom/qihoo/security/enginehelper/clean/a;

.field private n:I

.field private o:Lcom/qihoo/security/opti/trashclear/ui/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Landroid/view/LayoutInflater;

.field private q:Landroid/view/View;

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private t:Lcom/qihoo/security/opti/trashclear/ui/e;

.field private u:Z

.field private v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

.field private w:Z

.field private x:Lcom/qihoo/security/a/a/a;

.field private y:Lcom/qihoo/security/a/a/a;

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 112
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 65
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->a:Lcom/qihoo/security/widget/ShadowTextView;

    .line 66
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 67
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 68
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    .line 70
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->h:Landroid/widget/LinearLayout;

    .line 73
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->k:Landroid/view/View;

    .line 74
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    .line 75
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->m:Lcom/qihoo/security/enginehelper/clean/a;

    .line 77
    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->n:I

    .line 78
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 82
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    .line 83
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->s:Ljava/util/List;

    .line 84
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    .line 86
    iput-boolean v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->u:Z

    .line 88
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    .line 89
    iput-boolean v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->w:Z

    .line 100
    iput-boolean v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->z:Z

    .line 101
    sget v0, Lcom/qihoo/security/opti/trashclear/ui/e;->a:I

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    .line 102
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->B:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

    .line 103
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->C:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 104
    iput-boolean v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->D:Z

    .line 106
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->E:Ljava/util/List;

    .line 108
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->F:Lcom/qihoo360/mobilesafe/b/e;

    .line 109
    iput-boolean v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->G:Z

    .line 1481
    iput v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->H:I

    .line 1482
    const/4 v0, 0x2

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->I:I

    .line 1483
    const/4 v0, 0x3

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->J:I

    .line 1484
    const/4 v0, 0x4

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->K:I

    .line 1485
    const/4 v0, 0x5

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->L:I

    .line 1486
    const/4 v0, 0x6

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->M:I

    .line 1487
    const/4 v0, 0x7

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->N:I

    .line 1488
    const/16 v0, 0x8

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->O:I

    .line 1489
    const/16 v0, 0x9

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->P:I

    .line 1490
    const/16 v0, 0xa

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->Q:I

    .line 1491
    const/16 v0, 0xb

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->R:I

    .line 1492
    const/16 v0, 0xc

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->S:I

    .line 1493
    const/16 v0, 0xd

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->T:I

    .line 1495
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/h$5;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/h$5;-><init>(Lcom/qihoo/security/opti/trashclear/ui/h;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    .line 113
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    .line 114
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    .line 115
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    const-string/jumbo v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->p:Landroid/view/LayoutInflater;

    .line 116
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a;->c(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->z:Z

    .line 121
    return-void
.end method

.method private a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I
    .locals 2

    .prologue
    .line 2705
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne p1, v0, :cond_0

    .line 2706
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/h;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080058

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 2710
    :goto_0
    return v0

    .line 2707
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne p1, v0, :cond_1

    .line 2708
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/h;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080057

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0

    .line 2710
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/h;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080056

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;
    .locals 0

    .prologue
    .line 61
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->C:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    return-object p1
.end method

.method private a(ILcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;ILcom/qihoo/security/opti/trashclear/ui/i;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            "I",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 2421
    invoke-interface {p4}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    .line 2422
    iget v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    packed-switch v1, :pswitch_data_0

    .line 2561
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 2424
    :pswitch_1
    if-ne p1, v5, :cond_4

    .line 2425
    iput p1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 2426
    invoke-interface {p4}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p4}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 2427
    if-eqz p5, :cond_0

    .line 2428
    invoke-direct {p0, p4, p1}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(Lcom/qihoo/security/opti/trashclear/ui/i;I)V

    goto :goto_0

    .line 2431
    :cond_1
    iget-object v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->oraginalData:Ljava/util/List;

    .line 2432
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 2433
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 2434
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->rootTitle:Ljava/lang/String;

    .line 2435
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v3, v4, v5, v2, v5}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(IILjava/lang/String;I)V

    .line 2437
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v2, v3, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 2439
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v2, v3, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->c(ILjava/lang/Object;)V

    .line 2440
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v2, v3, p2}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(ILcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 2442
    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v2, :cond_2

    .line 2443
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->E:Ljava/util/List;

    invoke-interface {v2, p4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 2444
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->E:Ljava/util/List;

    invoke-interface {v2, p4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 2448
    :cond_2
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    move-result-wide v2

    iget-wide v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    neg-long v4, v4

    invoke-direct {p0, v2, v3, v4, v5}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(JJ)V

    .line 2449
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    iget-wide v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    invoke-virtual {v2, v3, p3, v4, v5}, Lcom/qihoo/security/opti/trashclear/ui/e;->b(IIJ)V

    .line 2451
    :cond_3
    iput-boolean v6, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    goto :goto_0

    .line 2454
    :cond_4
    if-nez p1, :cond_0

    .line 2455
    iput p1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 2456
    invoke-interface {p4}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-interface {p4}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_5

    .line 2458
    if-eqz p5, :cond_0

    .line 2459
    invoke-direct {p0, p4, p1}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(Lcom/qihoo/security/opti/trashclear/ui/i;I)V

    goto/16 :goto_0

    .line 2462
    :cond_5
    iget-object v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->oraginalData:Ljava/util/List;

    .line 2463
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->rootTitle:Ljava/lang/String;

    .line 2464
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_0

    .line 2465
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 2466
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v3, v4, v6, v2, v5}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(IILjava/lang/String;I)V

    .line 2467
    iput-boolean v5, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    .line 2468
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v2, v3, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(ILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 2469
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v2, v3, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->b(ILjava/lang/Object;)V

    .line 2470
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v1, v2, p2}, Lcom/qihoo/security/opti/trashclear/ui/e;->b(ILcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 2471
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v1, :cond_6

    .line 2472
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->E:Ljava/util/List;

    invoke-interface {v1, p4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 2473
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->E:Ljava/util/List;

    invoke-interface {v1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2477
    :cond_6
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    move-result-wide v2

    iget-wide v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    invoke-direct {p0, v2, v3, v4, v5}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(JJ)V

    .line 2478
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    iget-wide v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    invoke-virtual {v1, v2, p3, v4, v5}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(IIJ)V

    goto/16 :goto_0

    .line 2485
    :pswitch_2
    if-ne p1, v5, :cond_0

    .line 2486
    iput p1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 2487
    invoke-interface {p4}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-interface {p4}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_7

    .line 2488
    if-eqz p5, :cond_0

    .line 2489
    invoke-direct {p0, p4, p1}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(Lcom/qihoo/security/opti/trashclear/ui/i;I)V

    goto/16 :goto_0

    .line 2492
    :cond_7
    iget-object v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->oraginalData:Ljava/util/List;

    .line 2493
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 2494
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 2495
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->rootTitle:Ljava/lang/String;

    .line 2496
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v3, v4, v5, v2, v5}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(IILjava/lang/String;I)V

    .line 2498
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v2, v3, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 2500
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v2, v3, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->c(ILjava/lang/Object;)V

    .line 2501
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v2, v3, p2}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(ILcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 2503
    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v2, :cond_8

    .line 2504
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->E:Ljava/util/List;

    invoke-interface {v2, p4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 2505
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->E:Ljava/util/List;

    invoke-interface {v2, p4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 2509
    :cond_8
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    move-result-wide v2

    iget-wide v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    neg-long v4, v4

    invoke-direct {p0, v2, v3, v4, v5}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(JJ)V

    .line 2510
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    iget-wide v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    invoke-virtual {v2, v3, p3, v4, v5}, Lcom/qihoo/security/opti/trashclear/ui/e;->b(IIJ)V

    .line 2512
    :cond_9
    iput-boolean v6, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    goto/16 :goto_0

    .line 2518
    :pswitch_3
    if-nez p1, :cond_0

    .line 2519
    iput p1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 2520
    invoke-interface {p4}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-interface {p4}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_a

    .line 2522
    if-eqz p5, :cond_0

    .line 2523
    invoke-direct {p0, p4, p1}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(Lcom/qihoo/security/opti/trashclear/ui/i;I)V

    goto/16 :goto_0

    .line 2526
    :cond_a
    iget-object v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->oraginalData:Ljava/util/List;

    .line 2527
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->rootTitle:Ljava/lang/String;

    .line 2528
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_0

    .line 2529
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 2530
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v3, v4, v6, v2, v5}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(IILjava/lang/String;I)V

    .line 2531
    iput-boolean v5, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    .line 2532
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v2, v3, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(ILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 2533
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v2, v3, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->b(ILjava/lang/Object;)V

    .line 2534
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v1, v2, p2}, Lcom/qihoo/security/opti/trashclear/ui/e;->b(ILcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 2535
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v1, :cond_b

    .line 2536
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->E:Ljava/util/List;

    invoke-interface {v1, p4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 2537
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->E:Ljava/util/List;

    invoke-interface {v1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2541
    :cond_b
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    move-result-wide v2

    iget-wide v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    invoke-direct {p0, v2, v3, v4, v5}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(JJ)V

    .line 2542
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    iget-wide v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    invoke-virtual {v1, v2, p3, v4, v5}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(IIJ)V

    goto/16 :goto_0

    .line 2550
    :pswitch_4
    invoke-interface {p4}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2551
    iput p1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 2552
    if-eqz p5, :cond_0

    .line 2553
    invoke-direct {p0, p4, p1}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(Lcom/qihoo/security/opti/trashclear/ui/i;I)V

    goto/16 :goto_0

    .line 2422
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method private a(JJ)V
    .locals 5

    .prologue
    const/16 v3, 0xc

    .line 622
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 623
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 624
    const-string/jumbo v2, "targetSize"

    invoke-virtual {v1, v2, p3, p4}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 625
    const-string/jumbo v2, "initSize"

    invoke-virtual {v1, v2, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 626
    const/4 v2, 0x0

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 627
    invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 628
    iput v3, v0, Landroid/os/Message;->what:I

    .line 629
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 630
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 631
    return-void
.end method

.method private a(Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;II)V
    .locals 4

    .prologue
    .line 2293
    .line 2294
    if-nez p3, :cond_1

    .line 2295
    const-string/jumbo v0, "1"

    move-object v1, v0

    .line 2299
    :goto_0
    const-string/jumbo v2, ""

    .line 2300
    const/4 v0, 0x3

    if-ne p2, v0, :cond_3

    .line 2301
    iget-object v0, p1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->oraginalData:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 2302
    iget-object v0, p1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->oraginalData:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 2303
    if-eqz v0, :cond_3

    .line 2304
    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    .line 2308
    :goto_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2309
    iget-object v0, p1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->pkgName:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 2310
    iget-object v0, p1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->pkgName:Ljava/lang/String;

    .line 2316
    :cond_0
    :goto_2
    const/16 v2, 0x4657

    invoke-static {v2, v1, v0}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 2317
    return-void

    .line 2297
    :cond_1
    const-string/jumbo v0, "0"

    move-object v1, v0

    goto :goto_0

    .line 2312
    :cond_2
    iget-object v0, p1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object v0, v2

    goto :goto_1
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/h;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/h;->g()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/h;J)V
    .locals 1

    .prologue
    .line 61
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(J)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/h;->e(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/opti/trashclear/ui/i;II)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/i;II)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/opti/trashclear/ui/i;ZZ)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/i;ZZ)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/h;Ljava/lang/Long;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Ljava/lang/Long;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/h;Ljava/lang/String;ILjava/util/List;Z)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Ljava/lang/String;ILjava/util/List;Z)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/h;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Ljava/util/List;)V

    return-void
.end method

.method private a(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 889
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 893
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    .line 894
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_1

    .line 895
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 896
    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 905
    :cond_0
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 906
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->s:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 907
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->s:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 911
    :cond_1
    return-void
.end method

.method private a(Lcom/qihoo/security/opti/trashclear/ui/i;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;I)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    .line 2347
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v2

    .line 2348
    invoke-interface {v2}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    .line 2349
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    .line 2350
    if-lt v3, v1, :cond_3

    .line 2352
    new-instance v4, Lcom/qihoo/security/opti/trashclear/ui/h$a;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lcom/qihoo/security/opti/trashclear/ui/h$a;-><init>(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/opti/trashclear/ui/h$1;)V

    .line 2353
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 2354
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    .line 2355
    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 2357
    :pswitch_1
    iget v0, v4, Lcom/qihoo/security/opti/trashclear/ui/h$a;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v4, Lcom/qihoo/security/opti/trashclear/ui/h$a;->b:I

    goto :goto_0

    .line 2360
    :pswitch_2
    iget v0, v4, Lcom/qihoo/security/opti/trashclear/ui/h$a;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v4, Lcom/qihoo/security/opti/trashclear/ui/h$a;->c:I

    goto :goto_0

    .line 2363
    :pswitch_3
    iget v0, v4, Lcom/qihoo/security/opti/trashclear/ui/h$a;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v4, Lcom/qihoo/security/opti/trashclear/ui/h$a;->d:I

    goto :goto_0

    .line 2366
    :pswitch_4
    iget v0, v4, Lcom/qihoo/security/opti/trashclear/ui/h$a;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v4, Lcom/qihoo/security/opti/trashclear/ui/h$a;->a:I

    goto :goto_0

    .line 2370
    :cond_0
    iget v0, v4, Lcom/qihoo/security/opti/trashclear/ui/h$a;->b:I

    if-eq v0, v3, :cond_1

    iget v0, v4, Lcom/qihoo/security/opti/trashclear/ui/h$a;->b:I

    if-lez v0, :cond_5

    iget v0, v4, Lcom/qihoo/security/opti/trashclear/ui/h$a;->b:I

    iget v5, v4, Lcom/qihoo/security/opti/trashclear/ui/h$a;->a:I

    add-int/2addr v0, v5

    if-ne v0, v3, :cond_5

    .line 2372
    :cond_1
    const/4 v0, 0x0

    move v1, v0

    .line 2381
    :cond_2
    :goto_1
    invoke-interface {v2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 2383
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 2384
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v3, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    invoke-interface {v2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2385
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 2386
    invoke-direct {p0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(I)V

    .line 2391
    :cond_3
    invoke-interface {v2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 2392
    invoke-direct {p0, v2, p2}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/i;I)V

    .line 2394
    :cond_4
    return-void

    .line 2373
    :cond_5
    iget v0, v4, Lcom/qihoo/security/opti/trashclear/ui/h$a;->c:I

    if-eq v0, v3, :cond_2

    iget v0, v4, Lcom/qihoo/security/opti/trashclear/ui/h$a;->c:I

    if-lez v0, :cond_6

    iget v0, v4, Lcom/qihoo/security/opti/trashclear/ui/h$a;->c:I

    iget v5, v4, Lcom/qihoo/security/opti/trashclear/ui/h$a;->a:I

    add-int/2addr v0, v5

    if-eq v0, v3, :cond_2

    .line 2376
    :cond_6
    iget v0, v4, Lcom/qihoo/security/opti/trashclear/ui/h$a;->a:I

    if-ne v0, v3, :cond_7

    .line 2377
    const/4 v0, 0x3

    move v1, v0

    goto :goto_1

    .line 2379
    :cond_7
    const/4 v0, 0x4

    move v1, v0

    goto :goto_1

    .line 2355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method private a(Lcom/qihoo/security/opti/trashclear/ui/i;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;II)V"
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    .line 2253
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    .line 2258
    iget v3, v2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    .line 2260
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v1, v3}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(II)V

    .line 2263
    packed-switch p3, :pswitch_data_0

    :pswitch_0
    move v1, p3

    .line 2275
    :goto_0
    invoke-direct {p0, v2, p2, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;II)V

    move-object v0, p0

    move-object v4, p1

    .line 2278
    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(ILcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;ILcom/qihoo/security/opti/trashclear/ui/i;Z)V

    .line 2280
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2281
    invoke-direct {p0, p1, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(Lcom/qihoo/security/opti/trashclear/ui/i;I)V

    .line 2284
    :cond_0
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2285
    invoke-direct {p0, p1, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/i;I)V

    .line 2289
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 2290
    :pswitch_1
    return-void

    .line 2266
    :pswitch_2
    const/4 v1, 0x1

    .line 2267
    goto :goto_0

    :pswitch_3
    move v1, v5

    .line 2270
    goto :goto_0

    .line 2263
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a(Lcom/qihoo/security/opti/trashclear/ui/i;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            "Z)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x2

    const/4 v2, -0x1

    .line 736
    const/4 v1, 0x0

    .line 737
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 738
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    if-eq v0, v2, :cond_2

    .line 739
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    .line 742
    :goto_0
    if-eqz p3, :cond_1

    .line 743
    iget v1, p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    if-eq v1, v3, :cond_0

    .line 744
    add-int/lit8 v1, v0, -0x1

    .line 745
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    if-eq v0, v2, :cond_0

    .line 746
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    .line 757
    :cond_0
    :goto_1
    return-void

    .line 750
    :cond_1
    iget v1, p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    if-eq v1, v3, :cond_0

    .line 751
    add-int/lit8 v1, v0, 0x1

    .line 752
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    if-eq v0, v2, :cond_0

    .line 753
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method private a(Lcom/qihoo/security/opti/trashclear/ui/i;ZZ)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;ZZ)V"
        }
    .end annotation

    .prologue
    .line 1287
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    .line 1288
    if-eqz v0, :cond_6

    .line 1289
    iget v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 1290
    iget-object v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->oraginalData:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 1291
    const/4 v2, 0x0

    .line 1292
    iget v3, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    const/4 v4, -0x1

    if-eq v3, v4, :cond_13

    .line 1293
    iget v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    move v3, v2

    .line 1296
    :goto_0
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v4, v2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->level:I

    .line 1298
    if-eqz v1, :cond_5

    .line 1301
    iput-boolean p2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isInWhiteList:Z

    .line 1302
    if-eqz p2, :cond_7

    .line 1303
    const/4 v2, 0x3

    .line 1314
    :goto_1
    iput v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 1315
    iget-object v5, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->rootTitle:Ljava/lang/String;

    .line 1318
    iget-wide v6, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    .line 1319
    if-nez v2, :cond_a

    .line 1320
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v8, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-virtual {v2, v8, v9, v5, v10}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(IILjava/lang/String;I)V

    .line 1322
    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    const/4 v5, 0x1

    if-ne v2, v5, :cond_9

    .line 1323
    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    .line 1327
    :goto_2
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v5, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v2, v5, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(ILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1328
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v5, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v2, v5, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->b(ILjava/lang/Object;)V

    .line 1329
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v5, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v2, v5, v0}, Lcom/qihoo/security/opti/trashclear/ui/e;->b(ILcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 1331
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    move-result-wide v8

    invoke-direct {p0, v8, v9, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(JJ)V

    .line 1332
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v2, v3, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(IIJ)V

    .line 1334
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v2, p1}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(ILcom/qihoo/security/opti/trashclear/ui/i;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1335
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v2, p1}, Lcom/qihoo/security/opti/trashclear/ui/e;->c(ILcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 1337
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->s:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1338
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->s:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 1374
    :cond_2
    :goto_3
    if-eqz p2, :cond_3

    .line 1375
    iget-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    invoke-static {v0}, Lcom/qihoo/security/support/b;->a(Ljava/lang/String;)V

    .line 1382
    :cond_3
    if-eqz p3, :cond_4

    .line 1383
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->m:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->b(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    .line 1386
    :cond_4
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/h;->d(Lcom/qihoo/security/opti/trashclear/ui/i;)I

    move-result v2

    .line 1388
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 1390
    const/4 v0, 0x3

    if-ne v4, v0, :cond_12

    .line 1391
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->d(Lcom/qihoo/security/opti/trashclear/ui/i;)I

    move-result v2

    .line 1392
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 1395
    const/4 v1, 0x0

    .line 1397
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v3, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 1400
    :goto_4
    if-eqz v0, :cond_5

    .line 1401
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 1403
    invoke-direct {p0, v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(I)V

    .line 1423
    :cond_5
    :goto_5
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1426
    :cond_6
    return-void

    .line 1305
    :cond_7
    iget v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    const/4 v5, 0x2

    if-ne v2, v5, :cond_8

    .line 1306
    const/4 v2, 0x0

    goto/16 :goto_1

    .line 1308
    :cond_8
    const/4 v2, 0x1

    goto/16 :goto_1

    .line 1325
    :cond_9
    const/4 v2, 0x0

    iput-boolean v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    goto/16 :goto_2

    .line 1342
    :cond_a
    iget-object v8, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v9, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v8, v9, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(ILjava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    .line 1343
    iget-object v8, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v9, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v8, v9, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->c(ILjava/lang/Object;)V

    .line 1344
    iget-object v8, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v9, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v8, v9, v0}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(ILcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 1345
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v8, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v8}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    move-result-wide v8

    neg-long v10, v6

    invoke-direct {p0, v8, v9, v10, v11}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(JJ)V

    .line 1346
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v8, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v8, v3, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/e;->b(IIJ)V

    .line 1348
    :cond_b
    const/4 v0, 0x1

    if-ne v2, v0, :cond_e

    .line 1349
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v2, p1}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(ILcom/qihoo/security/opti/trashclear/ui/i;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1350
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v2, p1}, Lcom/qihoo/security/opti/trashclear/ui/e;->c(ILcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 1352
    :cond_c
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->s:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1353
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->s:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 1367
    :cond_d
    :goto_6
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_11

    .line 1368
    const/4 v0, 0x1

    iput-boolean v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    goto/16 :goto_3

    .line 1356
    :cond_e
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v2, p1}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(ILcom/qihoo/security/opti/trashclear/ui/i;)Z

    move-result v0

    if-nez v0, :cond_f

    .line 1357
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v2, p1}, Lcom/qihoo/security/opti/trashclear/ui/e;->b(ILcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 1359
    :cond_f
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->s:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    .line 1360
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->s:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1362
    :cond_10
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_d

    .line 1363
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    const/4 v3, 0x1

    const/4 v6, 0x1

    invoke-virtual {v0, v2, v3, v5, v6}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(IILjava/lang/String;I)V

    goto :goto_6

    .line 1370
    :cond_11
    const/4 v0, 0x0

    iput-boolean v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    goto/16 :goto_3

    .line 1398
    :catch_0
    move-exception v0

    move v0, v1

    goto/16 :goto_4

    .line 1405
    :cond_12
    const/4 v0, 0x2

    if-ne v4, v0, :cond_5

    .line 1408
    const/4 v1, 0x0

    .line 1410
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v3, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    .line 1413
    :goto_7
    if-eqz v0, :cond_5

    .line 1414
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 1415
    invoke-direct {p0, v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(I)V

    goto/16 :goto_5

    .line 1411
    :catch_1
    move-exception v0

    move v0, v1

    goto :goto_7

    :cond_13
    move v3, v2

    goto/16 :goto_0
.end method

.method private a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1745
    if-nez p1, :cond_1

    .line 1969
    :cond_0
    :goto_0
    return-void

    .line 1751
    :cond_1
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v3, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->rootTitle:Ljava/lang/String;

    .line 1752
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v7, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    .line 1753
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v8, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->level:I

    .line 1754
    const/4 v0, 0x1

    .line 1755
    const/4 v1, 0x3

    if-ne v8, v1, :cond_9

    .line 1756
    const/4 v0, 0x3

    move v6, v0

    .line 1760
    :goto_1
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    .line 1761
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v1, v2, v0}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(II)V

    .line 1769
    instance-of v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    if-eqz v0, :cond_0

    .line 1772
    invoke-virtual {p1}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clone()Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    move-result-object v9

    .line 1774
    iget-boolean v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    .line 1775
    iget-wide v4, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    .line 1777
    invoke-static {p1}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    .line 1779
    const/4 v1, 0x1

    iput-boolean v1, v9, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    .line 1780
    if-eqz v0, :cond_2

    .line 1782
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    move-result-wide v0

    neg-long v10, v4

    invoke-direct {p0, v0, v1, v10, v11}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(JJ)V

    .line 1783
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v1, v7, v4, v5}, Lcom/qihoo/security/opti/trashclear/ui/e;->b(IIJ)V

    .line 1785
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(IILjava/lang/String;J)V

    .line 1787
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    const-string/jumbo v1, "last_trash_clear_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    invoke-static {v0, v1, v10, v11}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 1788
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    invoke-static {v0, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;J)V

    .line 1789
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    const-string/jumbo v1, "first_time_in_this_open"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 1791
    const/16 v0, 0x4658

    iget-object v1, v9, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    const-string/jumbo v2, ""

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 1797
    :try_start_0
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v0, :cond_3

    .line 1798
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->E:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1799
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->E:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 1803
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1804
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1806
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->getCount()I

    move-result v1

    if-ne v1, v6, :cond_a

    .line 1807
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->B:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

    invoke-interface {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;->b(Ljava/util/List;)V

    .line 1809
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo/security/opti/b/d;->b(Landroid/content/Context;)J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;J)V

    .line 1814
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->B:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/e;->c(I)J

    move-result-wide v2

    long-to-float v1, v2

    long-to-float v2, v4

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;->a(FFZ)V

    .line 1816
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/h;->c()V

    .line 1817
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->s:Ljava/util/List;

    .line 1818
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 1852
    :catch_0
    move-exception v0

    .line 1865
    :goto_2
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 1867
    if-lez v1, :cond_7

    .line 1869
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_4

    .line 1870
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    .line 1872
    iget v2, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_4

    .line 1873
    add-int/lit8 v2, v0, -0x1

    .line 1874
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    const/4 v3, -0x1

    if-eq v0, v3, :cond_4

    .line 1875
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    .line 1880
    :cond_4
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 1881
    const/4 v2, 0x1

    if-le v1, v2, :cond_e

    add-int/lit8 v2, v1, -0x1

    if-ne v0, v2, :cond_e

    .line 1882
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    add-int/lit8 v2, v1, -0x2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    const/4 v2, 0x1

    iput v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->lineType:I

    .line 1883
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    add-int/lit8 v1, v1, -0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    const/4 v1, 0x0

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->downShadowType:I

    .line 1903
    :cond_5
    :goto_3
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-wide v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    .line 1904
    sub-long v2, v0, v4

    .line 1905
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput-wide v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    .line 1907
    const/4 v0, 0x3

    if-ne v8, v0, :cond_6

    .line 1908
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-wide v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    .line 1909
    sub-long v2, v0, v4

    .line 1910
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput-wide v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    .line 1912
    :cond_6
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    const/4 v1, 0x3

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 1913
    invoke-direct {p0, p2}, Lcom/qihoo/security/opti/trashclear/ui/h;->d(Lcom/qihoo/security/opti/trashclear/ui/i;)I

    move-result v4

    .line 1915
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 1917
    const/4 v0, 0x3

    if-ne v8, v0, :cond_10

    .line 1918
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->d(Lcom/qihoo/security/opti/trashclear/ui/i;)I

    move-result v4

    .line 1919
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 1921
    const/4 v1, 0x0

    .line 1923
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v5, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    .line 1926
    :goto_4
    if-eqz v0, :cond_7

    .line 1927
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 1928
    invoke-direct {p0, v4}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(I)V

    .line 1929
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->k:Landroid/view/View;

    const v1, 0x7f0b00e4

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    long-to-float v1, v2

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/b/s;->a(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    .line 1947
    :cond_7
    :goto_5
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 1949
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    .line 1950
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->getCount()I

    move-result v1

    if-eqz v1, :cond_0

    .line 1953
    if-eqz v0, :cond_8

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-gtz v1, :cond_8

    .line 1957
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 1961
    :cond_8
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->getCount()I

    move-result v0

    if-nez v0, :cond_11

    .line 1962
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/h;->j()V

    goto/16 :goto_0

    .line 1757
    :cond_9
    const/4 v1, 0x2

    if-ne v8, v1, :cond_12

    .line 1758
    const/4 v0, 0x2

    move v6, v0

    goto/16 :goto_1

    .line 1821
    :cond_a
    :try_start_2
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->B:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

    invoke-interface {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;->b(Ljava/util/List;)V

    .line 1823
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo/security/opti/b/d;->b(Landroid/content/Context;)J

    move-result-wide v10

    invoke-static {v0, v10, v11}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;J)V

    .line 1824
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_b

    .line 1825
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->c(I)J

    move-result-wide v0

    long-to-float v0, v0

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;->a(F)I

    move-result v0

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/a;->a(I)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v0

    .line 1827
    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->setBackgroundExamStatus(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V

    .line 1828
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->B:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

    invoke-interface {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V

    .line 1833
    :cond_b
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v1, p1}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(ILcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    .line 1834
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v1, p1}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(ILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1835
    if-eqz v7, :cond_d

    .line 1836
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v1, p1}, Lcom/qihoo/security/opti/trashclear/ui/e;->c(ILjava/lang/Object;)V

    .line 1837
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    invoke-virtual {v1, v2, v0}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(ILcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    .line 1850
    :cond_c
    :goto_6
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    const/4 v2, 0x1

    const/4 v6, 0x1

    invoke-virtual {v0, v1, v2, v3, v6}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(IILjava/lang/String;I)V

    goto/16 :goto_2

    .line 1839
    :cond_d
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    .line 1840
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c020d

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 1841
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v1, p1}, Lcom/qihoo/security/opti/trashclear/ui/e;->c(ILjava/lang/Object;)V

    .line 1842
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    invoke-virtual {v1, v2, v0}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(ILcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_6

    .line 1884
    :cond_e
    const/4 v0, 0x1

    if-eq v1, v0, :cond_f

    .line 1885
    const/4 v0, 0x3

    if-ne v8, v0, :cond_5

    .line 1886
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 1887
    add-int/lit8 v1, v1, -0x2

    .line 1888
    if-ge v1, v0, :cond_5

    .line 1889
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    const/4 v2, 0x1

    iput v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->lineType:I

    .line 1890
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    const/4 v1, 0x0

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->downShadowType:I

    goto/16 :goto_3

    .line 1893
    :cond_f
    const/4 v0, 0x1

    if-ne v1, v0, :cond_5

    .line 1894
    const/4 v0, 0x3

    if-ne v8, v0, :cond_5

    .line 1895
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 1896
    add-int/lit8 v1, v0, -0x2

    .line 1897
    if-ltz v1, :cond_5

    .line 1898
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    const/4 v2, 0x1

    iput v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->lineType:I

    .line 1899
    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    const/4 v1, 0x0

    iput v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->downShadowType:I

    goto/16 :goto_3

    .line 1924
    :catch_1
    move-exception v0

    move v0, v1

    goto/16 :goto_4

    .line 1932
    :cond_10
    const/4 v0, 0x2

    if-ne v8, v0, :cond_7

    .line 1934
    const/4 v1, 0x0

    .line 1936
    :try_start_3
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v5, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    invoke-interface {p2}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    move-result v0

    .line 1939
    :goto_7
    if-eqz v0, :cond_7

    .line 1940
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 1941
    invoke-direct {p0, v4}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(I)V

    .line 1942
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->k:Landroid/view/View;

    const v1, 0x7f0b00e4

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    long-to-float v1, v2

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/b/s;->a(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    .line 1937
    :catch_2
    move-exception v0

    move v0, v1

    goto :goto_7

    .line 1965
    :cond_11
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1967
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c001d

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v6, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v5, v6}, Lcom/qihoo/security/opti/trashclear/ui/e;->c(I)J

    move-result-wide v6

    long-to-float v5, v6

    invoke-static {v5}, Lcom/qihoo360/mobilesafe/b/s;->a(F)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    :cond_12
    move v6, v0

    goto/16 :goto_1
.end method

.method private a(Ljava/lang/Long;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 474
    if-nez p1, :cond_0

    .line 475
    const-wide/16 v0, 0x0

    .line 479
    :goto_0
    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v2, :cond_2

    .line 480
    iput-boolean v6, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->D:Z

    .line 482
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->E:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 483
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 494
    :goto_1
    iput-boolean v6, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->w:Z

    .line 495
    return-void

    .line 477
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0

    .line 486
    :cond_1
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->B:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v3, v4}, Lcom/qihoo/security/opti/trashclear/ui/e;->c(I)J

    move-result-wide v4

    sub-long/2addr v4, v0

    long-to-float v3, v4

    long-to-float v0, v0

    invoke-interface {v2, v3, v0, v6}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;->a(FFZ)V

    .line 488
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->x:Lcom/qihoo/security/a/a/a;

    invoke-virtual {v0, v7}, Lcom/qihoo/security/a/a/a;->a(Z)V

    goto :goto_1

    .line 491
    :cond_2
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->B:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v3, v4}, Lcom/qihoo/security/opti/trashclear/ui/e;->c(I)J

    move-result-wide v4

    sub-long/2addr v4, v0

    long-to-float v3, v4

    long-to-float v0, v0

    invoke-interface {v2, v3, v0, v6}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;->a(FFZ)V

    .line 492
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->x:Lcom/qihoo/security/a/a/a;

    invoke-virtual {v0, v7}, Lcom/qihoo/security/a/a/a;->a(Z)V

    goto :goto_1
.end method

.method private a(Ljava/lang/String;ILjava/util/List;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;>;Z)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 767
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v4

    move v2, v3

    .line 768
    :goto_0
    if-ge v2, v4, :cond_1

    .line 769
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 770
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->oraginalData:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 772
    instance-of v5, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    if-eqz v5, :cond_0

    .line 774
    iget-object v5, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 776
    iget-object v5, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->m:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v5, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Z

    move-result v5

    .line 782
    invoke-direct {p0, v0, v5, v3}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/i;ZZ)V

    .line 783
    if-eqz p4, :cond_0

    .line 784
    invoke-direct {p0, v0, v1, v5}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/i;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Z)V

    .line 768
    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 789
    :cond_1
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 505
    .line 506
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    move-result-wide v8

    .line 507
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->c(I)J

    move-result-wide v10

    .line 509
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v0, :cond_3

    .line 510
    const/4 v0, 0x0

    .line 514
    :goto_0
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v1, v2, v0, v8, v9}, Lcom/qihoo/security/opti/trashclear/ui/e;->b(IIJ)V

    .line 515
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_0
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 517
    invoke-interface {v6}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-wide v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    .line 518
    invoke-interface {v6}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v3, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->rootTitle:Ljava/lang/String;

    .line 519
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 520
    invoke-interface {v6}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v3, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    .line 522
    :cond_1
    invoke-interface {v6}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->isExpand:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 523
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(IILjava/lang/String;J)V

    .line 524
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v4, v5}, Lcom/qihoo/security/opti/trashclear/ui/e;->b(IIJ)V

    .line 527
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0, v6}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 528
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 530
    invoke-interface {v6}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v1

    .line 531
    if-eqz v1, :cond_0

    .line 532
    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_4

    .line 534
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 536
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 544
    :goto_2
    invoke-interface {v6}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v1

    .line 545
    if-eqz v1, :cond_0

    .line 553
    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_5

    .line 555
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 556
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 512
    :cond_3
    const/4 v0, 0x1

    goto/16 :goto_0

    .line 538
    :cond_4
    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    const/4 v2, 0x1

    iput v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 539
    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-wide v2, v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    sub-long/2addr v2, v4

    iput-wide v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    goto :goto_2

    .line 558
    :cond_5
    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    const/4 v2, 0x1

    iput v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 559
    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-wide v2, v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    sub-long/2addr v2, v4

    iput-wide v2, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    goto/16 :goto_1

    .line 571
    :cond_6
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/h;->a()V

    .line 572
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->i:Landroid/widget/ListView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 573
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->B:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

    long-to-float v1, v10

    long-to-float v2, v8

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;->a(FFZ)V

    .line 574
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->x:Lcom/qihoo/security/a/a/a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/a/a/a;->a(Z)V

    .line 575
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->getCount()I

    move-result v0

    if-nez v0, :cond_7

    .line 578
    :cond_7
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/h;Z)Z
    .locals 0

    .prologue
    .line 61
    iput-boolean p1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->G:Z

    return p1
.end method

.method public static a(J)[Ljava/lang/String;
    .locals 2

    .prologue
    .line 2659
    long-to-float v0, p0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/s;->b(F)[Ljava/lang/String;

    move-result-object v0

    .line 2663
    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I
    .locals 1

    .prologue
    .line 61
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/i;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    return-object v0
.end method

.method private b(I)V
    .locals 2

    .prologue
    .line 2240
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2241
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    if-eqz v0, :cond_0

    .line 2242
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->k:Landroid/view/View;

    invoke-virtual {v0, v1, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Landroid/view/View;I)V

    .line 2245
    :cond_0
    return-void
.end method

.method private b(J)V
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 634
    invoke-static {p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(J)[Ljava/lang/String;

    move-result-object v0

    .line 635
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->a:Lcom/qihoo/security/widget/ShadowTextView;

    aget-object v2, v0, v3

    invoke-virtual {v1, v2}, Lcom/qihoo/security/widget/ShadowTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 636
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 637
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 638
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v2, 0x1

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 642
    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/h;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    return-void
.end method

.method private b(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 922
    if-nez p1, :cond_1

    .line 959
    :cond_0
    :goto_0
    return-void

    .line 925
    :cond_1
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->isExpand:I

    .line 926
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 930
    packed-switch v0, :pswitch_data_0

    .line 951
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 952
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    if-eqz v0, :cond_0

    .line 956
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->k:Landroid/view/View;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 932
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_1

    .line 935
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_1

    .line 942
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->W:Lcom/qihoo/security/opti/trashclear/ui/c;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->W:Lcom/qihoo/security/opti/trashclear/ui/c;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/c;->isShowing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 943
    :cond_3
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 944
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/h;->c(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_1

    .line 930
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private b(Lcom/qihoo/security/opti/trashclear/ui/i;I)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;I)V"
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    .line 2403
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    .line 2404
    iget v3, v2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    .line 2405
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    .line 2406
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 2407
    if-lt v1, v5, :cond_0

    .line 2408
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/qihoo/security/opti/trashclear/ui/i;

    move-object v0, p0

    move v1, p2

    .line 2409
    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(ILcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;ILcom/qihoo/security/opti/trashclear/ui/i;Z)V

    goto :goto_0

    .line 2412
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/ui/h;Z)Z
    .locals 0

    .prologue
    .line 61
    iput-boolean p1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->w:Z

    return p1
.end method

.method static synthetic c(Lcom/qihoo/security/opti/trashclear/ui/h;)I
    .locals 1

    .prologue
    .line 61
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    return v0
.end method

.method private c(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 972
    invoke-interface/range {p1 .. p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    .line 973
    if-eqz v7, :cond_0

    .line 975
    iget v2, v7, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->level:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 1278
    :cond_0
    :goto_0
    return-void

    .line 979
    :cond_1
    invoke-interface/range {p1 .. p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v2

    invoke-interface {v2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v14, v2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    .line 980
    iget-object v8, v7, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    .line 982
    iget-object v2, v7, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->oraginalData:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 984
    const/4 v3, 0x0

    .line 985
    const/4 v5, 0x0

    .line 986
    iget v2, v7, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    const/4 v6, -0x1

    if-eq v2, v6, :cond_3

    .line 987
    iget v5, v7, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    .line 988
    const/4 v2, 0x1

    if-eq v5, v2, :cond_2

    const/4 v2, 0x2

    if-eq v5, v2, :cond_2

    move-object/from16 v0, p0

    iget v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v2, :cond_c

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v6, 0x7f0c000e

    invoke-virtual {v2, v6}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const/4 v2, 0x3

    if-ne v5, v2, :cond_3

    .line 995
    :cond_2
    const/4 v2, 0x1

    move v3, v2

    .line 1001
    :cond_3
    const-string/jumbo v9, ""

    .line 1002
    const-string/jumbo v2, ""

    .line 1003
    const-string/jumbo v12, ""

    .line 1004
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 1006
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->m:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v2, v4}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Z

    move-result v16

    .line 1008
    const/4 v2, 0x3

    if-ne v5, v2, :cond_2a

    .line 1009
    iget-object v2, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    if-eqz v2, :cond_2a

    iget-object v2, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v6, "src"

    invoke-virtual {v2, v6}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2a

    .line 1010
    iget-object v2, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v6, "src"

    invoke-virtual {v2, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1011
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_2a

    move-object v6, v2

    .line 1017
    :goto_2
    iget v2, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    packed-switch v2, :pswitch_data_0

    move-object v2, v9

    .line 1071
    :goto_3
    const/4 v9, 0x1

    if-ne v5, v9, :cond_18

    .line 1072
    const/4 v13, 0x0

    .line 1078
    :goto_4
    if-nez v5, :cond_29

    iget v9, v7, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->level:I

    const/4 v10, 0x3

    if-ne v9, v10, :cond_29

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v10, 0x7f0c020d

    invoke-virtual {v9, v10}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v14, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_29

    .line 1080
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->z:Z

    if-eqz v2, :cond_0

    .line 1083
    iget v2, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    const/4 v9, 0x2

    if-ne v2, v9, :cond_19

    .line 1084
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v10, 0x7f0c0247

    const/4 v11, 0x1

    new-array v11, v11, [Ljava/lang/Object;

    const/16 v17, 0x0

    aput-object v6, v11, v17

    invoke-virtual {v9, v10, v11}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v10, 0x7f0c0240

    invoke-virtual {v9, v10}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v10, v2

    .line 1095
    :goto_5
    iget-object v2, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    if-eqz v2, :cond_1a

    .line 1096
    iget-object v2, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    invoke-static {v2, v9}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1120
    :cond_4
    :goto_6
    const/4 v2, 0x1

    if-eq v5, v2, :cond_5

    const/4 v2, 0x2

    if-ne v5, v2, :cond_1d

    .line 1121
    :cond_5
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v9, 0x7f0c0237

    const/4 v11, 0x2

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v12, 0x0

    iget-wide v0, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->count:J

    move-wide/from16 v18, v0

    invoke-static/range {v18 .. v19}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v17

    aput-object v17, v11, v12

    const/4 v12, 0x1

    iget-wide v0, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    move-wide/from16 v18, v0

    move-wide/from16 v0, v18

    long-to-float v0, v0

    move/from16 v17, v0

    invoke-static/range {v17 .. v17}, Lcom/qihoo360/mobilesafe/b/s;->a(F)Ljava/lang/String;

    move-result-object v17

    aput-object v17, v11, v12

    invoke-virtual {v2, v9, v11}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    move-object v11, v2

    .line 1127
    :goto_7
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v9, 0x7f0c005e

    invoke-virtual {v2, v9}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_27

    .line 1129
    const/4 v9, 0x0

    .line 1132
    :goto_8
    const/4 v2, 0x3

    if-ne v5, v2, :cond_26

    .line 1133
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 1134
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0245

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 1136
    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v6, 0x7f0c0236

    invoke-virtual {v3, v6}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "."

    invoke-virtual {v8, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v8, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1138
    const/16 v3, 0x12

    invoke-static {v8, v3, v2}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1139
    const/4 v2, 0x0

    move-object v12, v6

    .line 1142
    :goto_9
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v6, 0x7f0c005e

    invoke-virtual {v3, v6}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    if-nez v5, :cond_8

    iget v3, v7, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->level:I

    const/4 v6, 0x2

    if-ne v3, v6, :cond_8

    .line 1144
    :cond_7
    if-nez v5, :cond_1e

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v6, 0x7f0c020e

    invoke-virtual {v3, v6}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1e

    .line 1146
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0245

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 1147
    const/4 v2, 0x0

    .line 1153
    :cond_8
    :goto_a
    move-object/from16 v0, p0

    iget v3, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v3, :cond_1f

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v6, 0x7f0c000e

    invoke-virtual {v3, v6}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    :goto_b
    invoke-virtual {v14, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_25

    .line 1156
    const/4 v3, 0x0

    .line 1157
    iget-object v6, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    if-eqz v6, :cond_9

    iget-object v6, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v8, "apkVersionName"

    invoke-virtual {v6, v8}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 1158
    iget-object v3, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v6, "apkVersionName"

    invoke-virtual {v3, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1160
    :cond_9
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_a

    .line 1161
    const-string/jumbo v3, "0.1.0"

    .line 1163
    :cond_a
    iget v6, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    const/16 v8, 0x8

    if-ne v6, v8, :cond_20

    .line 1164
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v10, 0x7f0c0242

    invoke-virtual {v8, v10}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string/jumbo v8, "\n"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v6, "\n"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v8, 0x7f0c0011

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v13, 0x0

    aput-object v3, v10, v13

    invoke-virtual {v6, v8, v10}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1173
    :goto_c
    const/4 v10, 0x0

    move-object v13, v2

    move-object v14, v10

    .line 1176
    :goto_d
    new-instance v8, Lcom/qihoo/security/opti/trashclear/ui/c;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/h$4;

    move-object/from16 v3, p0

    move-object/from16 v6, p1

    invoke-direct/range {v2 .. v7}, Lcom/qihoo/security/opti/trashclear/ui/h$4;-><init>(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;ILcom/qihoo/security/opti/trashclear/ui/i;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)V

    if-eqz v5, :cond_22

    const/4 v3, 0x1

    :goto_e
    move-object/from16 v0, p1

    invoke-direct {v8, v10, v0, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/c;-><init>(Landroid/content/Context;Lcom/qihoo/security/opti/trashclear/ui/i;Lcom/qihoo/security/opti/trashclear/ui/c$a;Z)V

    move-object/from16 v0, p0

    iput-object v8, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->W:Lcom/qihoo/security/opti/trashclear/ui/c;

    .line 1261
    const-string/jumbo v2, ""

    .line 1262
    move-object/from16 v0, p0

    iget v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_23

    move-object v3, v12

    .line 1267
    :goto_f
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->W:Lcom/qihoo/security/opti/trashclear/ui/c;

    if-nez v16, :cond_24

    const/4 v8, 0x1

    :goto_10
    const/4 v10, 0x0

    move-object v4, v14

    move-object v5, v13

    move-object v6, v15

    move-object v7, v11

    invoke-virtual/range {v2 .. v10}, Lcom/qihoo/security/opti/trashclear/ui/c;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;Ljava/lang/CharSequence;ZZZ)V

    .line 1269
    move-object/from16 v0, p0

    iget v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v2, :cond_b

    .line 1271
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->W:Lcom/qihoo/security/opti/trashclear/ui/c;

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v3

    const v4, 0x7f0c022e

    invoke-virtual {v3, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v4

    const v5, 0x7f0c014f

    invoke-virtual {v4, v5}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/opti/trashclear/ui/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1275
    :cond_b
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->W:Lcom/qihoo/security/opti/trashclear/ui/c;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/c;->setCancelable(Z)V

    .line 1276
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->W:Lcom/qihoo/security/opti/trashclear/ui/c;

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/b/d;->a(Landroid/app/Dialog;)V

    goto/16 :goto_0

    .line 988
    :cond_c
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v6, 0x7f0c000d

    invoke-virtual {v2, v6}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_1

    .line 1019
    :pswitch_0
    iget-object v2, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearAdvice:Ljava/lang/String;

    if-nez v2, :cond_10

    .line 1020
    const/4 v2, 0x1

    if-eq v5, v2, :cond_d

    const/4 v2, 0x2

    if-eq v5, v2, :cond_d

    const/4 v2, 0x3

    if-ne v5, v2, :cond_e

    .line 1023
    :cond_d
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v9, 0x7f0c023f

    invoke-virtual {v2, v9}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 1026
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    const v10, 0x7f080018

    invoke-static {v9, v2, v10, v2}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    goto/16 :goto_3

    .line 1027
    :cond_e
    const/4 v2, 0x3

    if-ne v5, v2, :cond_f

    .line 1028
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v9, 0x7f0c0245

    invoke-virtual {v2, v9}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_3

    .line 1030
    :cond_f
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v9, 0x7f0c022c

    invoke-virtual {v2, v9}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_3

    .line 1035
    :cond_10
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    iget-object v9, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearAdvice:Ljava/lang/String;

    invoke-static {v2, v9}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    goto/16 :goto_3

    .line 1039
    :pswitch_1
    iget-object v2, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearAdvice:Ljava/lang/String;

    if-nez v2, :cond_14

    .line 1040
    const/4 v2, 0x1

    if-eq v5, v2, :cond_11

    const/4 v2, 0x2

    if-eq v5, v2, :cond_11

    const/4 v2, 0x3

    if-ne v5, v2, :cond_12

    .line 1043
    :cond_11
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v9, 0x7f0c023f

    invoke-virtual {v2, v9}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 1045
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v10, 0x7f0c023f

    invoke-virtual {v9, v10}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v9

    .line 1046
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    const v11, 0x7f080018

    invoke-static {v10, v9, v11, v2}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    goto/16 :goto_3

    .line 1047
    :cond_12
    const/4 v2, 0x3

    if-ne v5, v2, :cond_13

    .line 1048
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v9, 0x7f0c0245

    invoke-virtual {v2, v9}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_3

    .line 1050
    :cond_13
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v9, 0x7f0c022b

    invoke-virtual {v2, v9}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_3

    .line 1053
    :cond_14
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    iget-object v9, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearAdvice:Ljava/lang/String;

    invoke-static {v2, v9}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    goto/16 :goto_3

    .line 1057
    :pswitch_2
    iget-object v2, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearAdvice:Ljava/lang/String;

    if-nez v2, :cond_17

    .line 1059
    const/4 v2, 0x1

    if-eq v5, v2, :cond_15

    const/4 v2, 0x2

    if-ne v5, v2, :cond_16

    .line 1061
    :cond_15
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v9, 0x7f0c0240

    invoke-virtual {v2, v9}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_3

    .line 1063
    :cond_16
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v10, 0x7f0c0247

    const/4 v11, 0x1

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v13, 0x0

    aput-object v6, v11, v13

    invoke-virtual {v9, v10, v11}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v10, 0x7f0c0240

    invoke-virtual {v9, v10}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_3

    .line 1067
    :cond_17
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v9, 0x7f0c0240

    invoke-virtual {v2, v9}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_3

    .line 1074
    :cond_18
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v11, 0x7f0c022d

    invoke-virtual {v10, v11}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    iget-wide v10, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    long-to-float v10, v10

    invoke-static {v10}, Lcom/qihoo360/mobilesafe/b/s;->a(F)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    goto/16 :goto_4

    .line 1087
    :cond_19
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v9, 0x7f0c0241

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v6, v10, v11

    invoke-virtual {v2, v9, v10}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 1089
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v11, 0x7f0c0247

    const/16 v17, 0x1

    move/from16 v0, v17

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    aput-object v6, v17, v18

    move-object/from16 v0, v17

    invoke-virtual {v10, v11, v0}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 1091
    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    const v11, 0x7f080018

    invoke-static {v10, v9, v11, v2}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    move-object v10, v2

    goto/16 :goto_5

    .line 1097
    :cond_1a
    iget-object v2, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v9, "multiPathList"

    invoke-virtual {v2, v9}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1099
    iget-object v2, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v9, "multiPathList"

    invoke-virtual {v2, v9}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    .line 1100
    const-string/jumbo v11, ""

    .line 1102
    const/4 v9, 0x0

    .line 1103
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_11
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1c

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1104
    const/16 v18, 0x1e

    move/from16 v0, v18

    if-ge v9, v0, :cond_1b

    .line 1105
    add-int/lit8 v9, v9, 0x1

    .line 1110
    new-instance v18, Ljava/lang/StringBuilder;

    invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v18

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v11, "\n"

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v11, v2

    .line 1111
    goto :goto_11

    .line 1107
    :cond_1b
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v9, "......"

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v9, "\n"

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 1116
    :cond_1c
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    invoke-static {v11, v2}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 1117
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v11, "\n"

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    .line 1123
    :cond_1d
    const/4 v2, 0x3

    if-ne v5, v2, :cond_28

    .line 1124
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v9, 0x7f0c0244

    invoke-virtual {v2, v9}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    move-object v11, v2

    goto/16 :goto_7

    .line 1149
    :cond_1e
    const/4 v10, 0x0

    goto/16 :goto_a

    .line 1153
    :cond_1f
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v6, 0x7f0c000d

    invoke-virtual {v3, v6}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_b

    .line 1166
    :cond_20
    iget v6, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    const/4 v8, 0x6

    if-ne v6, v8, :cond_21

    .line 1167
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v10, 0x7f0c0243

    invoke-virtual {v8, v10}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string/jumbo v8, "\n"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v6, "\n"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v8, 0x7f0c0011

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v13, 0x0

    aput-object v3, v10, v13

    invoke-virtual {v6, v8, v10}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_c

    .line 1170
    :cond_21
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v6, "\n"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v8, 0x7f0c0011

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v13, 0x0

    aput-object v3, v10, v13

    invoke-virtual {v6, v8, v10}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_c

    .line 1176
    :cond_22
    const/4 v3, 0x0

    goto/16 :goto_e

    .line 1265
    :cond_23
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0252

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_f

    .line 1267
    :cond_24
    const/4 v8, 0x0

    goto/16 :goto_10

    :cond_25
    move-object v13, v2

    move-object v14, v10

    goto/16 :goto_d

    :cond_26
    move-object v2, v13

    move-object v12, v6

    goto/16 :goto_9

    :cond_27
    move v9, v3

    goto/16 :goto_8

    :cond_28
    move-object v11, v12

    goto/16 :goto_7

    :cond_29
    move-object v10, v2

    goto/16 :goto_5

    :cond_2a
    move-object v6, v8

    goto/16 :goto_2

    .line 1017
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private d(Lcom/qihoo/security/opti/trashclear/ui/i;)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;)I"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v1, 0x1

    .line 1435
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v8

    .line 1437
    if-lez v8, :cond_a

    .line 1438
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 1441
    :goto_0
    if-le v8, v1, :cond_9

    .line 1442
    if-ne v4, v5, :cond_8

    move v0, v1

    :goto_1
    move v7, v1

    move v3, v0

    .line 1445
    :goto_2
    if-ge v7, v8, :cond_7

    .line 1446
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 1447
    if-eq v5, v0, :cond_5

    .line 1448
    if-ne v0, v1, :cond_2

    .line 1449
    if-nez v4, :cond_1

    move v0, v6

    .line 1471
    :goto_3
    if-eqz v3, :cond_0

    if-ne v3, v8, :cond_0

    move v0, v5

    .line 1474
    :cond_0
    return v0

    .line 1452
    :cond_1
    if-ne v4, v5, :cond_6

    move v0, v3

    move v3, v1

    .line 1445
    :goto_4
    add-int/lit8 v4, v7, 0x1

    move v7, v4

    move v4, v3

    move v3, v0

    goto :goto_2

    .line 1455
    :cond_2
    if-ne v0, v6, :cond_3

    move v0, v6

    .line 1457
    goto :goto_3

    .line 1459
    :cond_3
    if-ne v4, v1, :cond_4

    move v0, v6

    .line 1461
    goto :goto_3

    .line 1462
    :cond_4
    if-ne v4, v5, :cond_6

    move v0, v3

    move v3, v2

    .line 1463
    goto :goto_4

    .line 1467
    :cond_5
    add-int/lit8 v0, v3, 0x1

    move v3, v4

    goto :goto_4

    :cond_6
    move v0, v3

    move v3, v4

    goto :goto_4

    :cond_7
    move v0, v4

    goto :goto_3

    :cond_8
    move v0, v2

    goto :goto_1

    :cond_9
    move v3, v2

    move v0, v4

    goto :goto_3

    :cond_a
    move v4, v5

    goto :goto_0
.end method

.method private d()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 239
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 243
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 244
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_3

    .line 245
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v0, :cond_2

    .line 247
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->level:I

    if-eq v0, v4, :cond_1

    .line 244
    :cond_0
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 250
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->isExpand:I

    if-eq v0, v4, :cond_0

    .line 253
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 255
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    if-ne v4, v0, :cond_0

    .line 256
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->level:I

    if-ne v0, v4, :cond_0

    .line 259
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->isExpand:I

    if-eq v0, v4, :cond_0

    .line 262
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 266
    :cond_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 267
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 268
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 269
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->d()Z

    move-result v2

    if-nez v2, :cond_4

    .line 270
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v2, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_2

    .line 276
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 277
    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/opti/trashclear/ui/h;)Z
    .locals 1

    .prologue
    .line 61
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->z:Z

    return v0
.end method

.method static synthetic e(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    return-object v0
.end method

.method private e()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 307
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->i:Landroid/widget/ListView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->i:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getChildCount()I

    move-result v0

    if-lez v0, :cond_2

    .line 308
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 309
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    if-nez v0, :cond_0

    .line 310
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(I)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 312
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    if-eqz v0, :cond_1

    .line 313
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->j:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 314
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->k:Landroid/view/View;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 320
    :cond_1
    :goto_0
    return-void

    .line 318
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->j:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method private e(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v10, 0x2

    const v12, 0x7f080018

    const v11, 0x7f0c023e

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 1982
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    .line 1983
    iget v6, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->level:I

    .line 1984
    iget v5, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    .line 1985
    iget v7, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->checkStatus:I

    .line 1989
    if-ne v7, v3, :cond_29

    .line 1990
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-ne v1, v3, :cond_1

    .line 1991
    invoke-direct {p0, p1, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/i;II)V

    .line 2236
    :cond_0
    :goto_0
    return-void

    .line 1994
    :cond_1
    if-ne v6, v10, :cond_13

    .line 1995
    iget-object v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->oraginalData:Ljava/util/List;

    .line 1996
    iget-object v8, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    .line 1997
    iget v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    const/4 v9, -0x1

    if-ne v1, v9, :cond_3

    const/4 v1, 0x3

    if-eq v5, v1, :cond_3

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_12

    :cond_2
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iget v1, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    if-eq v1, v10, :cond_12

    .line 2000
    :cond_3
    if-nez v5, :cond_5

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iget v1, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    if-ne v1, v10, :cond_5

    .line 2007
    invoke-direct {p0, p1, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/i;II)V

    goto :goto_0

    .line 2010
    :cond_5
    iget v9, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    .line 2015
    if-gtz v9, :cond_7

    const/4 v1, 0x3

    if-eq v5, v1, :cond_7

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_11

    :cond_6
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iget v1, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    if-eq v1, v10, :cond_11

    .line 2019
    :cond_7
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->V:Lcom/qihoo/security/opti/trashclear/ui/b;

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->V:Lcom/qihoo/security/opti/trashclear/ui/b;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/b;->isShowing()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2020
    :cond_8
    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/b;

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    new-instance v10, Lcom/qihoo/security/opti/trashclear/ui/h$6;

    invoke-direct {v10, p0, p1, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/h$6;-><init>(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/opti/trashclear/ui/i;II)V

    invoke-direct {v1, v4, v10}, Lcom/qihoo/security/opti/trashclear/ui/b;-><init>(Landroid/content/Context;Lcom/qihoo/security/opti/trashclear/ui/b$a;)V

    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->V:Lcom/qihoo/security/opti/trashclear/ui/b;

    .line 2029
    iget-object v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    .line 2030
    const-string/jumbo v1, ""

    .line 2032
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v1, :cond_b

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v6, 0x7f0c000e

    invoke-virtual {v1, v6}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v6, 0x7f0c005e

    invoke-virtual {v1, v6}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 2036
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c0231

    new-array v6, v3, [Ljava/lang/Object;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v2

    invoke-virtual {v1, v5, v6}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0232

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    invoke-virtual {v1, v11}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2040
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c0232

    invoke-virtual {v2, v5}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v12, v2}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    move-object v1, v0

    move-object v2, v4

    move v0, v3

    .line 2078
    :goto_2
    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v3, :cond_a

    .line 2079
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0252

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 2081
    :cond_a
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->V:Lcom/qihoo/security/opti/trashclear/ui/b;

    invoke-virtual {v3, v2, v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/b;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)V

    .line 2082
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->V:Lcom/qihoo/security/opti/trashclear/ui/b;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->a(Landroid/app/Dialog;)V

    goto/16 :goto_0

    .line 2032
    :cond_b
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v6, 0x7f0c000d

    invoke-virtual {v1, v6}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 2043
    :cond_c
    const/4 v1, 0x3

    if-ne v5, v1, :cond_d

    .line 2045
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c0236

    invoke-virtual {v1, v5}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2046
    const/16 v5, 0x12

    invoke-static {v4, v5, v1}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2047
    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->bigFileFrom:Ljava/lang/String;

    .line 2048
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c023c

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v2

    invoke-virtual {v4, v5, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 2050
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c023b

    invoke-virtual {v4, v5}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    invoke-virtual {v4, v11}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 2054
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    invoke-static {v4, v3, v12, v0}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    move v13, v2

    move-object v2, v1

    move-object v1, v0

    move v0, v13

    .line 2055
    goto :goto_2

    :cond_d
    if-nez v5, :cond_10

    .line 2056
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_f

    .line 2057
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0245

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    invoke-virtual {v1, v11}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    move-object v2, v4

    move v0, v3

    .line 2060
    goto/16 :goto_2

    .line 2063
    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c0231

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v3, v2

    invoke-virtual {v1, v5, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0232

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    invoke-virtual {v1, v11}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2067
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c0232

    invoke-virtual {v3, v5}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v12, v3}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    move-object v1, v0

    move v0, v2

    move-object v2, v4

    .line 2069
    goto/16 :goto_2

    .line 2071
    :cond_10
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c023c

    new-array v5, v3, [Ljava/lang/Object;

    aput-object v4, v5, v2

    invoke-virtual {v0, v1, v5}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 2073
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v6, 0x7f0c023d

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v2

    invoke-virtual {v5, v6, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    invoke-virtual {v3, v11}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2075
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    invoke-static {v3, v1, v12, v0}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    move-object v1, v0

    move v0, v2

    move-object v2, v4

    goto/16 :goto_2

    .line 2085
    :cond_11
    invoke-direct {p0, p1, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/i;II)V

    goto/16 :goto_0

    .line 2088
    :cond_12
    invoke-direct {p0, p1, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/i;II)V

    goto/16 :goto_0

    .line 2090
    :cond_13
    if-ne v6, v3, :cond_17

    .line 2091
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v8

    move v5, v2

    move v4, v2

    .line 2093
    :goto_3
    if-ge v5, v8, :cond_14

    .line 2094
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    .line 2095
    iget v1, v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    const/4 v9, -0x1

    if-eq v1, v9, :cond_2a

    .line 2096
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v1, v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->keepCount:I

    add-int/2addr v1, v4

    .line 2093
    :goto_4
    add-int/lit8 v4, v5, 0x1

    move v5, v4

    move v4, v1

    goto :goto_3

    .line 2102
    :cond_14
    if-lez v4, :cond_16

    .line 2103
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->V:Lcom/qihoo/security/opti/trashclear/ui/b;

    if-eqz v1, :cond_15

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->V:Lcom/qihoo/security/opti/trashclear/ui/b;

    invoke-virtual {v1}, Lcom/qihoo/security/opti/trashclear/ui/b;->isShowing()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2104
    :cond_15
    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/b;

    iget-object v5, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    new-instance v8, Lcom/qihoo/security/opti/trashclear/ui/h$7;

    invoke-direct {v8, p0, p1, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/h$7;-><init>(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/opti/trashclear/ui/i;II)V

    invoke-direct {v1, v5, v8}, Lcom/qihoo/security/opti/trashclear/ui/b;-><init>(Landroid/content/Context;Lcom/qihoo/security/opti/trashclear/ui/b$a;)V

    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->V:Lcom/qihoo/security/opti/trashclear/ui/b;

    .line 2113
    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    .line 2114
    const-string/jumbo v1, ""

    .line 2115
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v6, 0x7f0c0231

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v2

    invoke-virtual {v5, v6, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v4, 0x7f0c0232

    invoke-virtual {v3, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    invoke-virtual {v3, v11}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2118
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c0232

    invoke-virtual {v4, v5}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v1, v12, v4}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 2120
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->V:Lcom/qihoo/security/opti/trashclear/ui/b;

    invoke-virtual {v3, v0, v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/b;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)V

    .line 2121
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->V:Lcom/qihoo/security/opti/trashclear/ui/b;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->a(Landroid/app/Dialog;)V

    goto/16 :goto_0

    .line 2124
    :cond_16
    invoke-direct {p0, p1, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/i;II)V

    goto/16 :goto_0

    .line 2126
    :cond_17
    const/4 v1, 0x3

    if-ne v6, v1, :cond_28

    .line 2127
    iget-object v1, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->oraginalData:Ljava/util/List;

    .line 2128
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_0

    .line 2129
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 2130
    iget v4, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    .line 2131
    if-ne v4, v10, :cond_18

    const/4 v8, 0x3

    if-eq v5, v8, :cond_18

    if-nez v5, :cond_27

    iget-boolean v8, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->z:Z

    if-eqz v8, :cond_27

    if-eq v4, v10, :cond_27

    .line 2134
    :cond_18
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->V:Lcom/qihoo/security/opti/trashclear/ui/b;

    if-eqz v4, :cond_19

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->V:Lcom/qihoo/security/opti/trashclear/ui/b;

    invoke-virtual {v4}, Lcom/qihoo/security/opti/trashclear/ui/b;->isShowing()Z

    move-result v4

    if-nez v4, :cond_0

    .line 2135
    :cond_19
    new-instance v4, Lcom/qihoo/security/opti/trashclear/ui/b;

    iget-object v8, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    new-instance v9, Lcom/qihoo/security/opti/trashclear/ui/h$8;

    invoke-direct {v9, p0, p1, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/h$8;-><init>(Lcom/qihoo/security/opti/trashclear/ui/h;Lcom/qihoo/security/opti/trashclear/ui/i;II)V

    invoke-direct {v4, v8, v9}, Lcom/qihoo/security/opti/trashclear/ui/b;-><init>(Landroid/content/Context;Lcom/qihoo/security/opti/trashclear/ui/b$a;)V

    iput-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->V:Lcom/qihoo/security/opti/trashclear/ui/b;

    .line 2144
    iget-object v4, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    .line 2146
    const-string/jumbo v6, ""

    .line 2147
    const/4 v6, 0x3

    if-ne v5, v6, :cond_1c

    .line 2149
    iget-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    if-eqz v0, :cond_1a

    iget-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v2, "src"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 2150
    iget-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v2, "src"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2151
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1a

    .line 2155
    :cond_1a
    iget-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearAdvice:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 2156
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0236

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "."

    invoke-virtual {v4, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v4, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2158
    const/16 v1, 0x12

    invoke-static {v4, v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 2159
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0245

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    invoke-virtual {v1, v11}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2221
    :goto_5
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0252

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2223
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->V:Lcom/qihoo/security/opti/trashclear/ui/b;

    invoke-virtual {v2, v1, v0, v3}, Lcom/qihoo/security/opti/trashclear/ui/b;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)V

    .line 2224
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->V:Lcom/qihoo/security/opti/trashclear/ui/b;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->a(Landroid/app/Dialog;)V

    goto/16 :goto_0

    .line 2163
    :cond_1b
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    iget-object v1, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearAdvice:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_5

    .line 2165
    :cond_1c
    if-nez v5, :cond_23

    .line 2166
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v1

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v5, v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    .line 2167
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v1, :cond_1f

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v6, 0x7f0c000e

    invoke-virtual {v1, v6}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    :goto_6
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_22

    .line 2170
    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->oraginalData:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 2171
    const/4 v1, 0x0

    .line 2172
    iget-object v4, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    if-eqz v4, :cond_1d

    iget-object v4, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v5, "apkVersionName"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1d

    .line 2174
    iget-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v4, "apkVersionName"

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2176
    :cond_1d
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1e

    .line 2177
    const-string/jumbo v1, "0.1.0"

    .line 2179
    :cond_1e
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v6, 0x7f0c022d

    invoke-virtual {v5, v6}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-wide v6, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    long-to-float v5, v6

    invoke-static {v5}, Lcom/qihoo360/mobilesafe/b/s;->a(F)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 2181
    iget v5, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    const/16 v6, 0x8

    if-ne v5, v6, :cond_20

    .line 2182
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0242

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    invoke-virtual {v1, v11}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_5

    .line 2167
    :cond_1f
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v6, 0x7f0c000d

    invoke-virtual {v1, v6}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_6

    .line 2184
    :cond_20
    iget v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    const/4 v5, 0x6

    if-ne v0, v5, :cond_21

    .line 2185
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0243

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    invoke-virtual {v1, v11}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_5

    .line 2188
    :cond_21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v4, "\n"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c0011

    new-array v6, v3, [Ljava/lang/Object;

    aput-object v1, v6, v2

    invoke-virtual {v4, v5, v6}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_5

    .line 2192
    :cond_22
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c023c

    new-array v5, v3, [Ljava/lang/Object;

    aput-object v4, v5, v2

    invoke-virtual {v0, v1, v5}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 2194
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c023d

    new-array v6, v3, [Ljava/lang/Object;

    aput-object v0, v6, v2

    invoke-virtual {v4, v5, v6}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    invoke-virtual {v2, v11}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2197
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    invoke-static {v2, v1, v12, v0}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    goto/16 :goto_5

    .line 2199
    :cond_23
    if-eq v5, v3, :cond_24

    if-ne v5, v10, :cond_26

    .line 2201
    :cond_24
    iget-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearAdvice:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_25

    .line 2202
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c023f

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2204
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    invoke-virtual {v2, v11}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2206
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    invoke-static {v2, v1, v12, v0}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    goto/16 :goto_5

    .line 2209
    :cond_25
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearAdvice:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    invoke-virtual {v2, v11}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/g;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    goto/16 :goto_5

    .line 2213
    :cond_26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c022f

    new-array v6, v3, [Ljava/lang/Object;

    aput-object v4, v6, v2

    invoke-virtual {v1, v5, v6}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0230

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    invoke-virtual {v1, v11}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2217
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v4, 0x7f0c0230

    invoke-virtual {v2, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v12, v2}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    goto/16 :goto_5

    .line 2227
    :cond_27
    invoke-direct {p0, p1, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/i;II)V

    goto/16 :goto_0

    .line 2231
    :cond_28
    invoke-direct {p0, p1, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/i;II)V

    goto/16 :goto_0

    .line 2234
    :cond_29
    invoke-direct {p0, p1, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/i;II)V

    goto/16 :goto_0

    :cond_2a
    move v1, v4

    goto/16 :goto_4
.end method

.method static synthetic f(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    return-object v0
.end method

.method private f(Lcom/qihoo/security/opti/trashclear/ui/i;)Lcom/qihoo/security/opti/trashclear/ui/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;)",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 2643
    if-nez p1, :cond_1

    .line 2644
    const/4 p1, 0x0

    .line 2648
    :cond_0
    :goto_0
    return-object p1

    .line 2645
    :cond_1
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2648
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->f(Lcom/qihoo/security/opti/trashclear/ui/i;)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object p1

    goto :goto_0
.end method

.method private f()V
    .locals 6

    .prologue
    .line 377
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->Z:Lcom/qihoo/security/opti/trashclear/ui/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->Z:Lcom/qihoo/security/opti/trashclear/ui/b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/b;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 378
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0214

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 379
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    move-result-wide v2

    .line 380
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v5, 0x7f0c022d

    invoke-virtual {v4, v5}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    long-to-float v2, v2

    invoke-static {v2}, Lcom/qihoo360/mobilesafe/b/s;->a(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 382
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v4, 0x7f0c023f

    invoke-virtual {v3, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 384
    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/b;

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    new-instance v4, Lcom/qihoo/security/opti/trashclear/ui/h$1;

    invoke-direct {v4, p0}, Lcom/qihoo/security/opti/trashclear/ui/h$1;-><init>(Lcom/qihoo/security/opti/trashclear/ui/h;)V

    invoke-direct {v2, v3, v4}, Lcom/qihoo/security/opti/trashclear/ui/b;-><init>(Landroid/content/Context;Lcom/qihoo/security/opti/trashclear/ui/b$a;)V

    iput-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->Z:Lcom/qihoo/security/opti/trashclear/ui/b;

    .line 392
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->Z:Lcom/qihoo/security/opti/trashclear/ui/b;

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v1, v3}, Lcom/qihoo/security/opti/trashclear/ui/b;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)V

    .line 394
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->Z:Lcom/qihoo/security/opti/trashclear/ui/b;

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c0234

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v2

    const v3, 0x7f0c014f

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->Z:Lcom/qihoo/security/opti/trashclear/ui/b;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->a(Landroid/app/Dialog;)V

    .line 399
    :cond_1
    return-void
.end method

.method static synthetic g(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/view/View;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->q:Landroid/view/View;

    return-object v0
.end method

.method private g()V
    .locals 12

    .prologue
    const-wide/16 v10, 0x64

    const/16 v8, 0x478d

    const/4 v1, 0x1

    .line 409
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/e;->f(I)Ljava/util/List;

    move-result-object v3

    .line 410
    const/4 v2, 0x0

    .line 411
    if-eqz v3, :cond_4

    .line 412
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 413
    iget v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    const/16 v5, 0x25

    if-ne v0, v5, :cond_0

    move v0, v1

    .line 419
    :goto_0
    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/e;->b()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_3

    .line 420
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    invoke-virtual {v2}, Lcom/qihoo/security/opti/trashclear/ui/e;->b()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v8, v0, v2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 428
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    const-string/jumbo v2, "last_trash_clear_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v0, v2, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 429
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v2, v4}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    move-result-wide v4

    invoke-static {v0, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;J)V

    .line 430
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    const-string/jumbo v2, "first_time_in_this_open"

    invoke-static {v0, v2, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 432
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->B:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

    invoke-interface {v0, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;->a(Ljava/util/List;)V

    .line 434
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    invoke-static {v2}, Lcom/qihoo/security/opti/b/d;->b(Landroid/content/Context;)J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;J)V

    .line 442
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    move-result-wide v2

    .line 444
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-eqz v0, :cond_1

    .line 445
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 447
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0xb

    if-gt v0, v4, :cond_2

    .line 452
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Ljava/lang/Long;)V

    .line 453
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setEnabled(Z)V

    .line 456
    :cond_2
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 457
    const/4 v4, 0x7

    iput v4, v0, Landroid/os/Message;->what:I

    .line 458
    const/16 v4, 0xa

    iput v4, v0, Landroid/os/Message;->arg1:I

    .line 459
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    invoke-virtual {v4, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 460
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v1, v5}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1, v10, v11}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 461
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-virtual {v0, v1, v10, v11}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 462
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    const/16 v4, 0x9

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 464
    return-void

    .line 424
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    move-result-wide v4

    invoke-static {v8, v4, v5}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto/16 :goto_1

    :cond_4
    move v0, v2

    goto/16 :goto_0
.end method

.method static synthetic h(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method private h()V
    .locals 5

    .prologue
    const/16 v4, 0xb

    const/16 v3, 0x8

    const/4 v2, 0x4

    .line 586
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/h;->k()V

    .line 593
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->getCount()I

    move-result v0

    if-eqz v0, :cond_0

    .line 594
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->i:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setVisibility(I)V

    .line 595
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->i:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 598
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/h;->d()V

    .line 599
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/h;->i()V

    .line 601
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v0, v4, :cond_1

    .line 605
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->q:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 606
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 607
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 608
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setEnabled(Z)V

    .line 613
    :goto_0
    return-void

    .line 611
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->j:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 612
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0
.end method

.method static synthetic i(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->i:Landroid/widget/ListView;

    return-object v0
.end method

.method private i()V
    .locals 9

    .prologue
    const v8, 0x7f0c001d

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 652
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v0, :cond_0

    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 654
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->i:Landroid/widget/ListView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 655
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v6}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 656
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c024f

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    .line 657
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    new-array v2, v7, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v3, v4}, Lcom/qihoo/security/opti/trashclear/ui/e;->c(I)J

    move-result-wide v4

    long-to-float v3, v4

    invoke-static {v3}, Lcom/qihoo360/mobilesafe/b/s;->a(F)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v6

    invoke-virtual {v1, v8, v2}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 661
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->d(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(J)[Ljava/lang/String;

    move-result-object v0

    .line 662
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->a:Lcom/qihoo/security/widget/ShadowTextView;

    aget-object v2, v0, v6

    invoke-virtual {v1, v2}, Lcom/qihoo/security/widget/ShadowTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 663
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, v6}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 664
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, v6}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 665
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    aget-object v0, v0, v7

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 667
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    new-array v2, v7, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v3, v4}, Lcom/qihoo/security/opti/trashclear/ui/e;->c(I)J

    move-result-wide v4

    long-to-float v3, v4

    invoke-static {v3}, Lcom/qihoo360/mobilesafe/b/s;->a(F)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v6

    invoke-virtual {v1, v8, v2}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 673
    return-void
.end method

.method static synthetic j(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    return-object v0
.end method

.method private j()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    .line 797
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    if-nez v0, :cond_1

    .line 822
    :cond_0
    :goto_0
    return-void

    .line 800
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 801
    if-eqz v2, :cond_0

    .line 804
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    if-ge v1, v2, :cond_3

    .line 805
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->getCount()I

    move-result v0

    if-le v0, v1, :cond_3

    .line 809
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(I)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 810
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v3, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(I)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 812
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    if-eqz v0, :cond_2

    .line 813
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iput v5, v0, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->isExpand:I

    .line 814
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->k:Landroid/view/View;

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-virtual {v0, v3, v4}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 804
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 821
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0
.end method

.method static synthetic k(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/a/a/a;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->y:Lcom/qihoo/security/a/a/a;

    return-object v0
.end method

.method private k()V
    .locals 3

    .prologue
    .line 833
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    if-nez v0, :cond_0

    .line 834
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    .line 836
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->s:Ljava/util/List;

    if-nez v0, :cond_1

    .line 837
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->s:Ljava/util/List;

    .line 844
    :cond_1
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    .line 845
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b(I)V

    .line 847
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->getCount()I

    move-result v0

    if-nez v0, :cond_3

    .line 880
    :cond_2
    :goto_0
    return-void

    .line 850
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/h$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/ui/h$2;-><init>(Lcom/qihoo/security/opti/trashclear/ui/h;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Lcom/qihoo/security/opti/trashclear/ui/a$c;)V

    .line 859
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/h$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/ui/h$3;-><init>(Lcom/qihoo/security/opti/trashclear/ui/h;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Lcom/qihoo/security/opti/trashclear/ui/a$d;)V

    .line 868
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->getCount()I

    move-result v1

    .line 869
    const/4 v0, 0x0

    :goto_1
    if-ge v0, v1, :cond_4

    .line 870
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v2, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(I)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v2

    .line 871
    invoke-direct {p0, v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 869
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 874
    :cond_4
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->D:Z

    if-eqz v0, :cond_2

    .line 875
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/h;->b()V

    goto :goto_0
.end method

.method static synthetic l(Lcom/qihoo/security/opti/trashclear/ui/h;)Landroid/widget/FrameLayout;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->j:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method static synthetic m(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method static synthetic n(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/a/a/a;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->x:Lcom/qihoo/security/a/a/a;

    return-object v0
.end method

.method static synthetic o(Lcom/qihoo/security/opti/trashclear/ui/h;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/h;->e()V

    return-void
.end method

.method static synthetic p(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/e;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    return-object v0
.end method

.method static synthetic q(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/widget/ShadowTextView;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->a:Lcom/qihoo/security/widget/ShadowTextView;

    return-object v0
.end method

.method static synthetic r(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method static synthetic s(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method static synthetic t(Lcom/qihoo/security/opti/trashclear/ui/h;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/h;->h()V

    return-void
.end method

.method static synthetic u(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->C:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    return-object v0
.end method

.method static synthetic v(Lcom/qihoo/security/opti/trashclear/ui/h;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->B:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

    return-object v0
.end method

.method static synthetic w(Lcom/qihoo/security/opti/trashclear/ui/h;)Ljava/util/List;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->E:Ljava/util/List;

    return-object v0
.end method

.method static synthetic x(Lcom/qihoo/security/opti/trashclear/ui/h;)Z
    .locals 1

    .prologue
    .line 61
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->G:Z

    return v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 286
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v0, :cond_1

    .line 287
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->j:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 288
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    if-eqz v0, :cond_1

    .line 289
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 290
    const/4 v3, 0x1

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v1, v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->level:I

    if-ne v3, v1, :cond_0

    .line 291
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 292
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 298
    :cond_1
    return-void
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 2722
    return-void
.end method

.method public b()V
    .locals 11

    .prologue
    const/4 v10, 0x1

    const/4 v5, 0x0

    .line 682
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v10}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setEnabled(Z)V

    .line 683
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->u:Z

    if-nez v0, :cond_6

    .line 687
    iput-boolean v10, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->u:Z

    .line 688
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->s:Ljava/util/List;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 689
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    .line 693
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 694
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->s:Ljava/util/List;

    invoke-interface {v7, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move v4, v5

    .line 695
    :goto_0
    if-ge v4, v6, :cond_5

    .line 696
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 697
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->oraginalData:Ljava/util/List;

    if-nez v1, :cond_1

    .line 695
    :cond_0
    :goto_1
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_0

    .line 700
    :cond_1
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->oraginalData:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 701
    const-string/jumbo v2, ""

    .line 703
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget v8, v2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->TrashType:I

    .line 705
    iget-object v9, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    .line 706
    const-string/jumbo v2, ""

    .line 707
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 708
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v2

    invoke-interface {v2}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    move-object v3, v2

    .line 710
    :goto_2
    const/4 v2, 0x2

    if-eq v8, v2, :cond_2

    if-eq v8, v10, :cond_2

    const/4 v2, 0x3

    if-ne v8, v2, :cond_3

    .line 712
    :cond_2
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    .line 713
    invoke-direct {p0, v9, v8, v0, v10}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Ljava/lang/String;ILjava/util/List;Z)V

    goto :goto_1

    .line 714
    :cond_3
    iget v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v8, 0x7f0c000e

    invoke-virtual {v2, v8}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    :goto_3
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 718
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->m:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v2, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Z

    move-result v2

    invoke-direct {p0, v0, v2, v5}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/i;ZZ)V

    .line 720
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->m:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v2, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Z

    move-result v2

    invoke-direct {p0, v0, v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/opti/trashclear/ui/i;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Z)V

    goto :goto_1

    .line 714
    :cond_4
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v8, 0x7f0c000d

    invoke-virtual {v2, v8}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    .line 726
    :cond_5
    iput-boolean v5, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->u:Z

    .line 728
    :cond_6
    return-void

    :cond_7
    move-object v3, v2

    goto :goto_2
.end method

.method public c()V
    .locals 0

    .prologue
    .line 1478
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/h;->j()V

    .line 1479
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 324
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 374
    :cond_0
    :goto_0
    return-void

    .line 327
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 329
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0150

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 330
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->B:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;->a()V

    goto :goto_0

    .line 334
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    if-eqz v0, :cond_0

    .line 338
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->getCount()I

    move-result v0

    if-nez v0, :cond_4

    .line 339
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->B:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

    invoke-interface {v0, v3, v3, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;->a(FFZ)V

    .line 340
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c024a

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 343
    :cond_4
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-ne v0, v2, :cond_5

    .line 344
    const/16 v0, 0x4653

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 353
    :cond_5
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x1007

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 354
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x100e

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 356
    iput-boolean v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->w:Z

    .line 357
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->b(I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->b(I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/e;->e(I)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_7

    .line 360
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v0, :cond_6

    .line 362
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/h;->f()V

    goto/16 :goto_0

    .line 365
    :cond_6
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/h;->g()V

    goto/16 :goto_0

    .line 368
    :cond_7
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c0213

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto/16 :goto_0

    .line 327
    nop

    :pswitch_data_0
    .packed-switch 0x7f0b00f6
        :pswitch_0
    .end packed-switch
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 964
    return-void
.end method

.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 2585
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->getCount()I

    move-result v0

    if-lt p2, v0, :cond_1

    .line 2640
    :cond_0
    :goto_0
    return-void

    .line 2589
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 2590
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->w:Z

    if-nez v0, :cond_0

    .line 2594
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(I)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    .line 2595
    if-eqz v0, :cond_0

    .line 2602
    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->f(Lcom/qihoo/security/opti/trashclear/ui/i;)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v3

    .line 2603
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    if-eq v0, v3, :cond_2

    .line 2604
    iput-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 2605
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->k:Landroid/view/View;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/h$9;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/ui/h$9;-><init>(Lcom/qihoo/security/opti/trashclear/ui/h;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2612
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->k:Landroid/view/View;

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->o:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-virtual {v0, v1, v4}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 2616
    :cond_2
    const/4 v0, 0x1

    move v1, v2

    :goto_1
    if-ge v0, p3, :cond_3

    .line 2617
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    add-int v5, p2, v0

    invoke-virtual {v4, v5}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->a(I)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/qihoo/security/opti/trashclear/ui/h;->f(Lcom/qihoo/security/opti/trashclear/ui/i;)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v4

    .line 2618
    if-ne v3, v4, :cond_3

    .line 2616
    add-int/lit8 v1, v0, 0x1

    move v6, v1

    move v1, v0

    move v0, v6

    goto :goto_1

    .line 2624
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->i:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getHeight()I

    move-result v0

    .line 2625
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->i:Landroid/widget/ListView;

    invoke-virtual {v3, v1}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 2626
    if-eqz v1, :cond_5

    .line 2627
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v0

    move v1, v0

    .line 2629
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->j:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v3

    .line 2630
    if-ge v1, v3, :cond_4

    .line 2631
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->j:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 2632
    sub-int/2addr v1, v3

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 2633
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->j:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 2635
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->j:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 2636
    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 2637
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->j:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    :cond_5
    move v1, v0

    goto :goto_2
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 2

    .prologue
    .line 2565
    const/4 v0, -0x1

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->n:I

    if-ne v0, v1, :cond_0

    .line 2569
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/h;->e()V

    .line 2571
    :cond_0
    iput p2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->n:I

    .line 2575
    return-void
.end method

.method public setAllBgColor(I)V
    .locals 1

    .prologue
    .line 2695
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->F:Lcom/qihoo360/mobilesafe/b/e;

    invoke-virtual {v0, p1}, Lcom/qihoo360/mobilesafe/b/e;->a(I)V

    .line 2696
    return-void
.end method

.method public setBackgroundExamStatus(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V
    .locals 2

    .prologue
    .line 2673
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v0

    .line 2675
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->F:Lcom/qihoo360/mobilesafe/b/e;

    invoke-virtual {v1, v0}, Lcom/qihoo360/mobilesafe/b/e;->a(I)V

    .line 2676
    return-void
.end method

.method public setClearCallBack(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->B:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

    .line 125
    return-void
.end method

.method public setColor(I)V
    .locals 1

    .prologue
    .line 2716
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 2717
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-static {v0, p1}, Lcom/qihoo360/mobilesafe/b/c;->a(Landroid/view/View;I)V

    .line 2718
    return-void
.end method

.method public setData(Lcom/qihoo/security/opti/trashclear/ui/e;)V
    .locals 2

    .prologue
    .line 195
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->t:Lcom/qihoo/security/opti/trashclear/ui/e;

    .line 197
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/e;->a(I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    .line 204
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 206
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 220
    :goto_0
    return-void

    .line 210
    :cond_0
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v0, :cond_1

    .line 211
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->C:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 212
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->E:Ljava/util/List;

    .line 215
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 216
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 217
    const/4 v1, 0x3

    iput v1, v0, Landroid/os/Message;->what:I

    .line 218
    const/4 v1, 0x0

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 219
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->U:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method

.method public setExamStatus(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V
    .locals 0

    .prologue
    .line 2685
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->C:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 2686
    return-void
.end method

.method public setListViewAndListener(Landroid/view/View;)V
    .locals 8

    .prologue
    const/4 v4, 0x4

    const/4 v3, 0x0

    const/4 v2, 0x3

    .line 133
    const v0, 0x7f0b00f6

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 134
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0214

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 135
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setEnabled(Z)V

    .line 136
    const v0, 0x7f0b00ec

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ShadowTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->a:Lcom/qihoo/security/widget/ShadowTextView;

    .line 137
    const v0, 0x7f0b00ed

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 138
    const v0, 0x7f0b00ee

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 139
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    if-nez v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const v1, 0x7f0c0253

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(I)V

    .line 143
    :cond_0
    const v0, 0x7f0b009b

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->q:Landroid/view/View;

    .line 144
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->q:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 146
    const v0, 0x7f0b00ef

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 147
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    const v0, 0x7f0b00f2

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->i:Landroid/widget/ListView;

    .line 149
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->i:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 150
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->i:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 151
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->i:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 152
    const v0, 0x7f0b00f3

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 153
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->g:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c024a

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->i:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 155
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 156
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->i:Landroid/widget/ListView;

    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setVisibility(I)V

    .line 157
    const v0, 0x7f0b00eb

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->h:Landroid/widget/LinearLayout;

    .line 159
    const v0, 0x7f0b00f4

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->j:Landroid/widget/FrameLayout;

    .line 160
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->p:Landroid/view/LayoutInflater;

    const v1, 0x7f030042

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->j:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->k:Landroid/view/View;

    .line 163
    new-instance v1, Lcom/qihoo/security/a/a/a;

    const-wide/16 v4, 0x1e

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;)I

    move-result v6

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/a;->b(Landroid/content/Context;)I

    move-result v7

    move v3, v2

    invoke-direct/range {v1 .. v7}, Lcom/qihoo/security/a/a/a;-><init>(IIJII)V

    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->x:Lcom/qihoo/security/a/a/a;

    .line 165
    new-instance v0, Lcom/qihoo/security/a/a/a;

    const/4 v1, 0x2

    const-wide/16 v3, 0x46

    iget-object v5, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    invoke-static {v5}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;)I

    move-result v5

    iget-object v6, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->l:Landroid/content/Context;

    invoke-static {v6}, Lcom/qihoo360/mobilesafe/b/a;->b(Landroid/content/Context;)I

    move-result v6

    invoke-direct/range {v0 .. v6}, Lcom/qihoo/security/a/a/a;-><init>(IIJII)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->y:Lcom/qihoo/security/a/a/a;

    .line 168
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->C:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v0

    .line 169
    new-instance v1, Lcom/qihoo360/mobilesafe/b/e;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->C:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-direct {p0, v2}, Lcom/qihoo/security/opti/trashclear/ui/h;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v2

    invoke-direct {v1, v2}, Lcom/qihoo360/mobilesafe/b/e;-><init>(I)V

    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->F:Lcom/qihoo360/mobilesafe/b/e;

    .line 170
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->F:Lcom/qihoo360/mobilesafe/b/e;

    invoke-virtual {v1, p0}, Lcom/qihoo360/mobilesafe/b/e;->a(Lcom/qihoo360/mobilesafe/b/e$a;)V

    .line 171
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 172
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-static {v1, v0}, Lcom/qihoo360/mobilesafe/b/c;->a(Landroid/view/View;I)V

    .line 173
    return-void
.end method

.method public setTrashClearEngine(Lcom/qihoo/security/enginehelper/clean/a;)V
    .locals 0

    .prologue
    .line 182
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->m:Lcom/qihoo/security/enginehelper/clean/a;

    .line 183
    return-void
.end method

.method public setViewType(I)V
    .locals 1

    .prologue
    .line 226
    iput p1, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->A:I

    .line 227
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    if-eqz v0, :cond_0

    .line 228
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/h;->v:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/b;->b(I)V

    .line 230
    :cond_0
    return-void
.end method
