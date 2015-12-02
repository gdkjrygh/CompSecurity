.class public Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/mobilesafe/b/e$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$4;,
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:Landroid/view/MenuItem;

.field private C:Landroid/view/MenuItem;

.field private D:Lcom/qihoo/security/enginehelper/clean/a;

.field private E:Lcom/qihoo/security/opti/trashclear/ui/h;

.field private F:Lcom/qihoo/security/opti/trashclear/ui/e;

.field private G:I

.field private H:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

.field private I:Z

.field private J:Z

.field private final K:Z

.field private L:I

.field private M:Lcom/qihoo360/mobilesafe/b/e;

.field private N:Z

.field private O:J

.field private final P:I

.field private final Q:I

.field private final R:I

.field private final S:I

.field private final T:Landroid/os/Handler;

.field private final U:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

.field private y:J

.field private final z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 45
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 48
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->y:J

    .line 50
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->z:Ljava/lang/String;

    .line 51
    iput-boolean v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->A:Z

    .line 57
    iput-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->E:Lcom/qihoo/security/opti/trashclear/ui/h;

    .line 58
    iput-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->F:Lcom/qihoo/security/opti/trashclear/ui/e;

    .line 59
    iput v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->G:I

    .line 60
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->H:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 61
    iput-boolean v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->I:Z

    .line 62
    iput-boolean v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->J:Z

    .line 63
    iput-boolean v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->K:Z

    .line 71
    iput v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->L:I

    .line 72
    iput-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->M:Lcom/qihoo360/mobilesafe/b/e;

    .line 73
    iput-boolean v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->N:Z

    .line 185
    iput v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->P:I

    .line 186
    iput v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->Q:I

    .line 187
    const/4 v0, 0x2

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->R:I

    .line 188
    const/4 v0, 0x3

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->S:I

    .line 190
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$2;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->T:Landroid/os/Handler;

    .line 569
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$3;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->U:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

    .line 631
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;I)I
    .locals 0

    .prologue
    .line 45
    iput p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->L:I

    return p1
.end method

.method public static a(ZLcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)Landroid/os/Bundle;
    .locals 4

    .prologue
    const/4 v0, 0x2

    .line 550
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 551
    const-string/jumbo v2, "bundle_is_deep"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 553
    sget-object v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$4;->a:[I

    invoke-virtual {p1}, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 564
    :goto_0
    :pswitch_0
    const-string/jumbo v2, "bundle_status"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 565
    const-string/jumbo v0, "bundle_is_scan_cancled"

    invoke-virtual {v1, v0, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 566
    return-object v1

    .line 555
    :pswitch_1
    const/4 v0, 0x0

    .line 556
    goto :goto_0

    .line 558
    :pswitch_2
    const/4 v0, 0x1

    .line 559
    goto :goto_0

    .line 553
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/opti/trashclear/ui/e;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->F:Lcom/qihoo/security/opti/trashclear/ui/e;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;Lcom/qihoo/security/opti/trashclear/ui/e;)Lcom/qihoo/security/opti/trashclear/ui/e;
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->F:Lcom/qihoo/security/opti/trashclear/ui/e;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->H:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    return-object p1
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I
    .locals 1

    .prologue
    .line 45
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->b(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v0

    return v0
.end method

.method private b(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I
    .locals 2

    .prologue
    .line 353
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne p1, v0, :cond_0

    .line 354
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080058

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 358
    :goto_0
    return v0

    .line 355
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne p1, v0, :cond_1

    .line 356
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080057

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0

    .line 358
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080056

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)J
    .locals 2

    .prologue
    .line 45
    iget-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->O:J

    return-wide v0
.end method

.method static synthetic c(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->T:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)I
    .locals 1

    .prologue
    .line 45
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->G:I

    return v0
.end method

.method private d(I)V
    .locals 1

    .prologue
    .line 316
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Landroid/graphics/drawable/Drawable;)V

    .line 317
    invoke-virtual {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->c(I)V

    .line 319
    return-void
.end method

.method static synthetic e(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->H:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/opti/trashclear/ui/h;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->E:Lcom/qihoo/security/opti/trashclear/ui/h;

    return-object v0
.end method

.method static synthetic g(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo360/mobilesafe/b/e;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->M:Lcom/qihoo360/mobilesafe/b/e;

    return-object v0
.end method

.method static synthetic h(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->s()V

    return-void
.end method

.method static synthetic i(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Z
    .locals 1

    .prologue
    .line 45
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->I:Z

    return v0
.end method

.method static synthetic j(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)J
    .locals 2

    .prologue
    .line 45
    iget-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->y:J

    return-wide v0
.end method

.method static synthetic k(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)Lcom/qihoo/security/enginehelper/clean/a;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->D:Lcom/qihoo/security/enginehelper/clean/a;

    return-object v0
.end method

.method static synthetic l(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->t()V

    return-void
.end method

.method private q()V
    .locals 2

    .prologue
    .line 117
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->H:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V

    .line 121
    new-instance v0, Lcom/qihoo360/mobilesafe/b/e;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->H:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-direct {p0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->b(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v1

    invoke-direct {v0, v1}, Lcom/qihoo360/mobilesafe/b/e;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->M:Lcom/qihoo360/mobilesafe/b/e;

    .line 122
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->M:Lcom/qihoo360/mobilesafe/b/e;

    invoke-virtual {v0, p0}, Lcom/qihoo360/mobilesafe/b/e;->a(Lcom/qihoo360/mobilesafe/b/e$a;)V

    .line 124
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->r()V

    .line 125
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->u()V

    .line 126
    return-void
.end method

.method private r()V
    .locals 2

    .prologue
    .line 129
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->G:I

    if-nez v0, :cond_0

    .line 130
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0254

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->b(Ljava/lang/String;)V

    .line 134
    :goto_0
    return-void

    .line 132
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0250

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private s()V
    .locals 4

    .prologue
    .line 137
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    :goto_0
    return-void

    .line 140
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Landroid/content/Context;)Lcom/qihoo/security/enginehelper/clean/a;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->D:Lcom/qihoo/security/enginehelper/clean/a;

    .line 141
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->D:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a;->e()V

    .line 146
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->E:Lcom/qihoo/security/opti/trashclear/ui/h;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->D:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->setTrashClearEngine(Lcom/qihoo/security/enginehelper/clean/a;)V

    .line 147
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->D:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a;->d()Lcom/qihoo/security/opti/trashclear/ui/e;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->F:Lcom/qihoo/security/opti/trashclear/ui/e;

    .line 148
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->F:Lcom/qihoo/security/opti/trashclear/ui/e;

    if-nez v0, :cond_1

    .line 149
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->y:J

    .line 150
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->T:Landroid/os/Handler;

    const/4 v1, 0x3

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 153
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->t()V

    goto :goto_0
.end method

.method private t()V
    .locals 1

    .prologue
    .line 157
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$1;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;)V

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$1;->start()V

    .line 183
    return-void
.end method

.method private u()V
    .locals 2

    .prologue
    .line 297
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/ui/h;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->E:Lcom/qihoo/security/opti/trashclear/ui/h;

    .line 298
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->E:Lcom/qihoo/security/opti/trashclear/ui/h;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->H:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->setExamStatus(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V

    .line 299
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->E:Lcom/qihoo/security/opti/trashclear/ui/h;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->U:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->setClearCallBack(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity$a;)V

    .line 300
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->E:Lcom/qihoo/security/opti/trashclear/ui/h;

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->G:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->setViewType(I)V

    .line 301
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->E:Lcom/qihoo/security/opti/trashclear/ui/h;

    const v1, 0x7f0b00ea

    invoke-virtual {p0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/h;->setListViewAndListener(Landroid/view/View;)V

    .line 302
    return-void
.end method

.method private v()V
    .locals 0

    .prologue
    .line 539
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->finish()V

    .line 540
    return-void
.end method


# virtual methods
.method public a(FFZZ)V
    .locals 3

    .prologue
    .line 331
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 332
    const-string/jumbo v0, "cleanSize"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;F)Landroid/content/Intent;

    .line 333
    const-string/jumbo v2, "isDeep"

    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->G:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 334
    const-string/jumbo v0, "isCancel"

    invoke-virtual {v1, v0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 336
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->setResult(ILandroid/content/Intent;)V

    .line 338
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->v()V

    .line 339
    return-void

    .line 333
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 653
    return-void
.end method

.method public a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V
    .locals 1

    .prologue
    .line 348
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->b(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v0

    .line 349
    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->d(I)V

    .line 350
    return-void
.end method

.method public c(Z)V
    .locals 2

    .prologue
    .line 430
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->B:Landroid/view/MenuItem;

    if-eqz v0, :cond_0

    .line 431
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->B:Landroid/view/MenuItem;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 433
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->C:Landroid/view/MenuItem;

    if-eqz v0, :cond_1

    .line 435
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->C:Landroid/view/MenuItem;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 437
    :cond_1
    return-void
.end method

.method protected j()V
    .locals 2

    .prologue
    .line 306
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 307
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01d3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->b(Ljava/lang/String;)V

    .line 309
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->H:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V

    .line 313
    return-void
.end method

.method protected o()Z
    .locals 1

    .prologue
    .line 477
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->G:I

    if-nez v0, :cond_0

    const/16 v0, 0x4788

    :goto_0
    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 482
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->E:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->a()V

    .line 483
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->p()V

    .line 484
    const/4 v0, 0x1

    return v0

    .line 477
    :cond_0
    const/16 v0, 0x4787

    goto :goto_0
.end method

.method public onBackPressed()V
    .locals 1

    .prologue
    .line 323
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 328
    :goto_0
    return-void

    .line 326
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->p()V

    .line 327
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onBackPressed()V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 78
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 79
    const v0, 0x7f030040

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->setContentView(I)V

    .line 81
    const/16 v0, 0x4786

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 83
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 84
    if-eqz v0, :cond_1

    .line 85
    const-string/jumbo v1, "bundle_is_deep"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    .line 86
    const-string/jumbo v2, "bundle_status"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 87
    const-string/jumbo v3, "memorySize"

    const-wide/16 v4, 0x0

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->O:J

    .line 88
    const-string/jumbo v3, "bundle_is_scan_cancled"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    .line 89
    packed-switch v2, :pswitch_data_0

    .line 100
    :goto_0
    if-eqz v1, :cond_0

    .line 102
    invoke-static {}, Lcom/qihoo/security/ui/result/f;->a()Lcom/qihoo/security/ui/result/f;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/qihoo/security/ui/result/f;->a(I)V

    .line 103
    const/4 v1, 0x0

    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->G:I

    .line 104
    iput-boolean v6, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->J:Z

    .line 105
    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->H:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 108
    :cond_0
    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->I:Z

    .line 110
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->q()V

    .line 112
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->T:Landroid/os/Handler;

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v6, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 113
    invoke-static {}, Lcom/qihoo/security/service/ProcessClearService;->a()V

    .line 114
    return-void

    .line 91
    :pswitch_0
    sget-object v2, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    iput-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->H:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    goto :goto_0

    .line 94
    :pswitch_1
    sget-object v2, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    iput-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->H:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    goto :goto_0

    .line 97
    :pswitch_2
    sget-object v2, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    iput-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->H:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    goto :goto_0

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 364
    new-instance v0, Lcom/qihoo/security/locale/widget/a;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->p:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/locale/widget/a;-><init>(Landroid/content/Context;)V

    .line 365
    const/high16 v1, 0x7f100000

    invoke-virtual {v0, v1, p1}, Lcom/qihoo/security/locale/widget/a;->inflate(ILandroid/view/Menu;)V

    .line 366
    const v0, 0x7f0b0250

    const v1, 0x7f020066

    invoke-virtual {p0, p1, v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->a(Landroid/view/Menu;II)V

    .line 368
    invoke-interface {p1}, Landroid/view/Menu;->hasVisibleItems()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 369
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->B:Landroid/view/MenuItem;

    .line 370
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->c(Z)V

    .line 376
    :cond_0
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 519
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onDestroy()V

    .line 524
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->D:Lcom/qihoo/security/enginehelper/clean/a;

    if-eqz v0, :cond_0

    .line 525
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->D:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-virtual {v0}, Lcom/qihoo/security/enginehelper/clean/a;->f()V

    .line 527
    :cond_0
    invoke-static {}, Lcom/qihoo/security/service/ProcessClearService;->b()V

    .line 528
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 493
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 494
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 495
    const/4 v0, 0x1

    .line 498
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/app/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .prologue
    .line 446
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 463
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    :goto_0
    return v0

    .line 451
    :pswitch_0
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->A:Z

    if-eqz v0, :cond_0

    .line 452
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->A:Z

    .line 453
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->p:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/opti/trashclear/ui/ClearWhiteListActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v1, 0x65

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 459
    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    .line 446
    nop

    :pswitch_data_0
    .packed-switch 0x7f0b0250
        :pswitch_0
    .end packed-switch
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 503
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onResume()V

    .line 507
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->A:Z

    .line 508
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->N:Z

    if-nez v0, :cond_1

    .line 509
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->E:Lcom/qihoo/security/opti/trashclear/ui/h;

    if-eqz v0, :cond_0

    .line 510
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->E:Lcom/qihoo/security/opti/trashclear/ui/h;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/h;->b()V

    .line 515
    :cond_0
    :goto_0
    return-void

    .line 513
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->N:Z

    goto :goto_0
.end method

.method public p()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 531
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 532
    const-string/jumbo v3, "isDeep"

    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->G:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 534
    invoke-virtual {p0, v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->setResult(ILandroid/content/Intent;)V

    .line 535
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->v()V

    .line 536
    return-void

    :cond_0
    move v0, v1

    .line 532
    goto :goto_0
.end method

.method public setColor(I)V
    .locals 0

    .prologue
    .line 647
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/ClearListActivity;->d(I)V

    .line 648
    return-void
.end method
