.class public Lcom/qihoo/security/ui/main/HomeActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/qihoo/security/ui/main/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/main/HomeActivity$4;
    }
.end annotation


# static fields
.field private static final ab:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field A:Lcom/qihoo/security/ui/b/a$f;

.field B:Landroid/view/View;

.field C:Landroid/view/View;

.field D:Landroid/view/View;

.field private E:Lcom/qihoo/security/widget/TabPageIndicator;

.field private F:Lcom/qihoo/security/widget/QihooViewPager;

.field private G:Lcom/qihoo/security/ui/fragment/a;

.field private H:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

.field private I:Lcom/qihoo/security/v7/MaterialMenuView;

.field private J:Lcom/qihoo/security/v7/ColorChangeBackgroundView;

.field private K:Landroid/widget/ImageView;

.field private L:Z

.field private M:J

.field private N:Z

.field private O:Landroid/os/Bundle;

.field private P:J

.field private Q:Lcom/qihoo360/mobilesafe/b/e;

.field private R:Landroid/view/Menu;

.field private S:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

.field private T:Ljava/util/concurrent/ExecutorService;

.field private final U:[B

.field private V:I

.field private W:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/qihoo/security/ui/main/c$a;",
            ">;>;"
        }
    .end annotation
.end field

.field private X:Landroid/view/MenuItem;

.field private final Y:Landroid/content/BroadcastReceiver;

.field private final Z:Landroid/os/Handler;

.field private final aa:Landroid/os/Handler;

.field private ac:Z

.field public y:I

.field z:Lcom/qihoo/security/ui/main/FragmentsObservable;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 440
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/main/HomeActivity;->ab:Landroid/util/SparseArray;

    .line 443
    sget-object v0, Lcom/qihoo/security/ui/main/HomeActivity;->ab:Landroid/util/SparseArray;

    const v1, 0x19ab0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 444
    sget-object v0, Lcom/qihoo/security/ui/main/HomeActivity;->ab:Landroid/util/SparseArray;

    const v1, 0x19ab1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 445
    sget-object v0, Lcom/qihoo/security/ui/main/HomeActivity;->ab:Landroid/util/SparseArray;

    const v1, 0x19ab2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 447
    sget-object v0, Lcom/qihoo/security/ui/main/HomeActivity;->ab:Landroid/util/SparseArray;

    const v1, 0x19ab3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 448
    sget-object v0, Lcom/qihoo/security/ui/main/HomeActivity;->ab:Landroid/util/SparseArray;

    const v1, 0x19ab4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 449
    sget-object v0, Lcom/qihoo/security/ui/main/HomeActivity;->ab:Landroid/util/SparseArray;

    const v1, 0x19ab5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 451
    sget-object v0, Lcom/qihoo/security/ui/main/HomeActivity;->ab:Landroid/util/SparseArray;

    const v1, 0x19ab6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 452
    sget-object v0, Lcom/qihoo/security/ui/main/HomeActivity;->ab:Landroid/util/SparseArray;

    const v1, 0x19ab7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 453
    sget-object v0, Lcom/qihoo/security/ui/main/HomeActivity;->ab:Landroid/util/SparseArray;

    const v1, 0x19ab8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 454
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    const/4 v1, 0x0

    .line 96
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 113
    iput-wide v2, p0, Lcom/qihoo/security/ui/main/HomeActivity;->M:J

    .line 115
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->N:Z

    .line 163
    iput v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->y:I

    .line 166
    iput-wide v2, p0, Lcom/qihoo/security/ui/main/HomeActivity;->P:J

    .line 177
    new-array v0, v1, [B

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->U:[B

    .line 182
    iput v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->V:I

    .line 187
    new-instance v0, Lcom/qihoo/security/ui/main/HomeActivity$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/main/HomeActivity$1;-><init>(Lcom/qihoo/security/ui/main/HomeActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->Y:Landroid/content/BroadcastReceiver;

    .line 228
    new-instance v0, Lcom/qihoo/security/ui/main/HomeActivity$5;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/main/HomeActivity$5;-><init>(Lcom/qihoo/security/ui/main/HomeActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->Z:Landroid/os/Handler;

    .line 320
    new-instance v0, Lcom/qihoo/security/ui/main/HomeActivity$7;

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->e()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/ui/main/HomeActivity$7;-><init>(Lcom/qihoo/security/ui/main/HomeActivity;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->aa:Landroid/os/Handler;

    return-void
.end method

.method private A()V
    .locals 4

    .prologue
    .line 1242
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->aa:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/ui/main/HomeActivity$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/main/HomeActivity$2;-><init>(Lcom/qihoo/security/ui/main/HomeActivity;)V

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1265
    return-void
.end method

.method private a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I
    .locals 2

    .prologue
    .line 651
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne p1, v0, :cond_0

    .line 652
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080058

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 656
    :goto_0
    return v0

    .line 653
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne p1, v0, :cond_1

    .line 654
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080057

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0

    .line 656
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080056

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    goto :goto_0
.end method

.method private a(J)V
    .locals 7

    .prologue
    .line 431
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 432
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 434
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v2, "alarm"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    .line 436
    const/4 v2, 0x3

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    add-long/2addr v4, p1

    invoke-virtual {v0, v2, v4, v5, v1}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 438
    return-void
.end method

.method private final a(Landroid/view/View;ZZLcom/nineoldandroids/a/a$a;)V
    .locals 11

    .prologue
    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v8, 0x0

    const/4 v1, 0x0

    .line 1181
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->B:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    .line 1182
    new-instance v4, Lcom/qihoo/security/ui/main/HomeActivity$12;

    invoke-direct {v4, p0, p3, p2, p4}, Lcom/qihoo/security/ui/main/HomeActivity$12;-><init>(Lcom/qihoo/security/ui/main/HomeActivity;ZZLcom/nineoldandroids/a/a$a;)V

    .line 1195
    if-eqz p3, :cond_0

    const/16 v0, 0xc8

    :goto_0
    int-to-long v6, v0

    .line 1196
    new-instance v5, Lcom/nineoldandroids/a/c;

    invoke-direct {v5}, Lcom/nineoldandroids/a/c;-><init>()V

    .line 1199
    if-eqz p2, :cond_1

    .line 1200
    new-array v2, v10, [F

    aput v8, v2, v1

    neg-int v0, v3

    int-to-float v0, v0

    aput v0, v2, v9

    .line 1201
    new-array v0, v10, [F

    int-to-float v3, v3

    aput v3, v0, v1

    aput v8, v0, v9

    move-object v1, v2

    .line 1207
    :goto_1
    iget-object v2, p0, Lcom/qihoo/security/ui/main/HomeActivity;->E:Lcom/qihoo/security/widget/TabPageIndicator;

    const-string/jumbo v3, "translationY"

    invoke-static {v2, v3, v1}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v1

    .line 1208
    invoke-virtual {v1, v6, v7}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 1209
    iget-object v2, p0, Lcom/qihoo/security/ui/main/HomeActivity;->C:Landroid/view/View;

    const-string/jumbo v3, "translationY"

    invoke-static {v2, v3, v0}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 1210
    invoke-virtual {v5, v1}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/nineoldandroids/a/c$b;->a(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    .line 1211
    invoke-virtual {v5, v4}, Lcom/nineoldandroids/a/c;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 1212
    invoke-virtual {v5, v6, v7}, Lcom/nineoldandroids/a/c;->c(J)Lcom/nineoldandroids/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nineoldandroids/a/c;->a()V

    .line 1213
    return-void

    :cond_0
    move v0, v1

    .line 1195
    goto :goto_0

    .line 1203
    :cond_1
    new-array v2, v10, [F

    neg-int v0, v3

    int-to-float v0, v0

    aput v0, v2, v1

    aput v8, v2, v9

    .line 1204
    new-array v0, v10, [F

    aput v8, v0, v1

    int-to-float v1, v3

    aput v1, v0, v9

    move-object v1, v2

    goto :goto_1
.end method

.method static synthetic a(Lcom/qihoo/security/ui/main/HomeActivity;)V
    .locals 0

    .prologue
    .line 96
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->q()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/main/HomeActivity;I)V
    .locals 0

    .prologue
    .line 96
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->e(I)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/main/HomeActivity;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    .line 96
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/main/HomeActivity;ZZLcom/nineoldandroids/a/a$a;Lcom/nineoldandroids/a/a;)V
    .locals 0

    .prologue
    .line 96
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/qihoo/security/ui/main/HomeActivity;->b(ZZLcom/nineoldandroids/a/a$a;Lcom/nineoldandroids/a/a;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/main/HomeActivity;[I)V
    .locals 0

    .prologue
    .line 96
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->a([I)V

    return-void
.end method

.method private final a(ZZLcom/nineoldandroids/a/a$a;Lcom/nineoldandroids/a/a;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1142
    if-eqz p1, :cond_0

    .line 1143
    if-eqz p2, :cond_2

    const/4 v0, 0x6

    :goto_0
    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->B:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/b/b;->a(ILandroid/view/View;)V

    .line 1147
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->B:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1148
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->D:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1149
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->C:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1150
    if-eqz p3, :cond_1

    .line 1151
    invoke-interface {p3, p4}, Lcom/nineoldandroids/a/a$a;->a(Lcom/nineoldandroids/a/a;)V

    .line 1153
    :cond_1
    return-void

    .line 1143
    :cond_2
    const/4 v0, 0x7

    goto :goto_0
.end method

.method private a([I)V
    .locals 2

    .prologue
    .line 678
    if-eqz p1, :cond_0

    .line 679
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->J:Lcom/qihoo/security/v7/ColorChangeBackgroundView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->a([I)V

    .line 680
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->J:Lcom/qihoo/security/v7/ColorChangeBackgroundView;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->F:Lcom/qihoo/security/widget/QihooViewPager;

    invoke-virtual {v1}, Lcom/qihoo/security/widget/QihooViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->setCurrentItem(I)V

    .line 682
    :cond_0
    return-void
.end method

.method private b(Landroid/view/Menu;II)V
    .locals 4

    .prologue
    .line 721
    if-eqz p1, :cond_1

    .line 722
    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    .line 723
    const v0, 0x7f030024

    invoke-static {v2, v0}, Landroid/support/v4/view/j;->b(Landroid/view/MenuItem;I)Landroid/view/MenuItem;

    .line 724
    invoke-static {v2}, Landroid/support/v4/view/j;->a(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 725
    const v1, 0x7f0b007c

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 726
    const v3, 0x7f0b007d

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->K:Landroid/widget/ImageView;

    .line 727
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->K:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 728
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->w()V

    .line 733
    :cond_0
    invoke-virtual {v1, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 734
    new-instance v0, Lcom/qihoo/security/ui/main/HomeActivity$11;

    invoke-direct {v0, p0, v2}, Lcom/qihoo/security/ui/main/HomeActivity$11;-><init>(Lcom/qihoo/security/ui/main/HomeActivity;Landroid/view/MenuItem;)V

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 741
    :cond_1
    return-void
.end method

.method private b(Landroid/view/View;ZZLcom/nineoldandroids/a/a$a;)V
    .locals 2

    .prologue
    .line 1217
    if-eqz p2, :cond_2

    .line 1218
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->I:Lcom/qihoo/security/v7/MaterialMenuView;

    if-eqz v0, :cond_0

    .line 1219
    if-eqz p3, :cond_1

    .line 1220
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->I:Lcom/qihoo/security/v7/MaterialMenuView;

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/v7/MaterialMenuView;->a(Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;)V

    .line 1235
    :cond_0
    :goto_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Landroid/view/View;ZZLcom/nineoldandroids/a/a$a;)V

    .line 1236
    return-void

    .line 1222
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->I:Lcom/qihoo/security/v7/MaterialMenuView;

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/v7/MaterialMenuView;->setState(Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;)V

    goto :goto_0

    .line 1227
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->I:Lcom/qihoo/security/v7/MaterialMenuView;

    if-eqz v0, :cond_0

    .line 1228
    if-eqz p3, :cond_3

    .line 1229
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->I:Lcom/qihoo/security/v7/MaterialMenuView;

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->BURGER:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/v7/MaterialMenuView;->a(Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;)V

    goto :goto_0

    .line 1231
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->I:Lcom/qihoo/security/v7/MaterialMenuView;

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->BURGER:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/v7/MaterialMenuView;->setState(Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;)V

    goto :goto_0
.end method

.method private b(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V
    .locals 3

    .prologue
    .line 581
    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->o()I

    move-result v0

    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 586
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->Q:Lcom/qihoo360/mobilesafe/b/e;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/b/e;->a()V

    .line 587
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->Q:Lcom/qihoo360/mobilesafe/b/e;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->J:Lcom/qihoo/security/v7/ColorChangeBackgroundView;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->getCurrentColor()I

    move-result v1

    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/e;->a(II)V

    .line 589
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->Q:Lcom/qihoo360/mobilesafe/b/e;

    new-instance v1, Lcom/qihoo/security/ui/main/HomeActivity$10;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/main/HomeActivity$10;-><init>(Lcom/qihoo/security/ui/main/HomeActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/e;->a(Lcom/qihoo360/mobilesafe/b/e$a;)V

    .line 619
    :goto_0
    return-void

    .line 615
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->Q:Lcom/qihoo360/mobilesafe/b/e;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/b/e;->a()V

    .line 616
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->u()V

    .line 617
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->f(I)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/ui/main/HomeActivity;)V
    .locals 0

    .prologue
    .line 96
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->A()V

    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/ui/main/HomeActivity;I)V
    .locals 0

    .prologue
    .line 96
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->c(I)V

    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/ui/main/HomeActivity;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    .line 96
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->b(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/ui/main/HomeActivity;ZZLcom/nineoldandroids/a/a$a;Lcom/nineoldandroids/a/a;)V
    .locals 0

    .prologue
    .line 96
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/qihoo/security/ui/main/HomeActivity;->a(ZZLcom/nineoldandroids/a/a$a;Lcom/nineoldandroids/a/a;)V

    return-void
.end method

.method private final b(ZZLcom/nineoldandroids/a/a$a;Lcom/nineoldandroids/a/a;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 1157
    if-eqz p1, :cond_0

    .line 1158
    if-eqz p2, :cond_3

    const/4 v0, 0x6

    :goto_0
    invoke-static {v0}, Lcom/qihoo/security/ui/b/b;->c(I)V

    .line 1162
    :cond_0
    if-eqz p2, :cond_4

    .line 1163
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->B:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1167
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->D:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1169
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->I:Lcom/qihoo/security/v7/MaterialMenuView;

    if-eqz v0, :cond_1

    .line 1170
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->I:Lcom/qihoo/security/v7/MaterialMenuView;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/v7/MaterialMenuView;->setEnabled(Z)V

    .line 1173
    :cond_1
    iput-boolean v2, p0, Lcom/qihoo/security/ui/main/HomeActivity;->N:Z

    .line 1174
    if-eqz p3, :cond_2

    .line 1175
    invoke-interface {p3, p4}, Lcom/nineoldandroids/a/a$a;->b(Lcom/nineoldandroids/a/a;)V

    .line 1177
    :cond_2
    return-void

    .line 1158
    :cond_3
    const/4 v0, 0x7

    goto :goto_0

    .line 1165
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->C:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1
.end method

.method private b(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)Z
    .locals 1

    .prologue
    .line 1030
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->S:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne v0, p1, :cond_0

    .line 1031
    const/4 v0, 0x0

    .line 1034
    :goto_0
    return v0

    .line 1033
    :cond_0
    iput-object p1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->S:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    .line 1034
    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic c(Lcom/qihoo/security/ui/main/HomeActivity;)Lcom/qihoo/security/v7/ColorChangeBackgroundView;
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->J:Lcom/qihoo/security/v7/ColorChangeBackgroundView;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/ui/main/HomeActivity;I)V
    .locals 0

    .prologue
    .line 96
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->f(I)V

    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/ui/main/HomeActivity;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    .line 96
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private c(Landroid/content/Intent;)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 928
    .line 930
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->I:Lcom/qihoo/security/v7/MaterialMenuView;

    invoke-virtual {v0}, Lcom/qihoo/security/v7/MaterialMenuView;->getState()Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    move-result-object v3

    .line 931
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    if-eq v3, v0, :cond_2

    move v0, v1

    .line 934
    :goto_0
    const-string/jumbo v4, "reset_main_page"

    invoke-virtual {p1, v4, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    .line 935
    if-eqz v4, :cond_0

    .line 937
    sget-object v4, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    if-ne v3, v4, :cond_0

    .line 938
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->p()Lcom/qihoo/security/ui/main/BaseHomeFragment;

    move-result-object v3

    .line 939
    if-eqz v3, :cond_0

    .line 941
    :try_start_0
    invoke-virtual {v3}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 956
    :goto_1
    return v1

    .line 942
    :catch_0
    move-exception v0

    .line 943
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move v1, v2

    .line 944
    goto :goto_1

    .line 951
    :cond_0
    const-string/jumbo v3, "from_notify"

    invoke-virtual {p1, v3, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    .line 952
    if-eqz v2, :cond_1

    .line 953
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->j()V

    goto :goto_1

    :cond_1
    move v1, v0

    goto :goto_1

    :cond_2
    move v0, v2

    goto :goto_0
.end method

.method private c(Z)Z
    .locals 4

    .prologue
    .line 902
    const/4 v0, 0x0

    .line 903
    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->I:Lcom/qihoo/security/v7/MaterialMenuView;

    if-eqz v1, :cond_0

    .line 904
    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->I:Lcom/qihoo/security/v7/MaterialMenuView;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/MaterialMenuView;->getState()Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    move-result-object v1

    .line 905
    sget-object v2, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    if-ne v1, v2, :cond_1

    .line 906
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->p()Lcom/qihoo/security/ui/main/BaseHomeFragment;

    move-result-object v1

    .line 907
    if-eqz v1, :cond_0

    .line 908
    const/4 v0, 0x1

    .line 909
    invoke-virtual {v1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->c()V

    .line 919
    :cond_0
    :goto_0
    return v0

    .line 911
    :cond_1
    if-eqz p1, :cond_0

    .line 915
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/qihoo/security/ui/main/HomeActivity;->p:Landroid/content/Context;

    const-class v3, Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v1}, Lcom/qihoo/security/ui/main/HomeActivity;->startActivity(Landroid/content/Intent;)V

    .line 916
    const v1, 0x7f040012

    const v2, 0x7f040008

    invoke-virtual {p0, v1, v2}, Lcom/qihoo/security/ui/main/HomeActivity;->overridePendingTransition(II)V

    goto :goto_0
.end method

.method static synthetic d(Lcom/qihoo/security/ui/main/HomeActivity;)Landroid/support/v7/app/ActionBar;
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->r:Landroid/support/v7/app/ActionBar;

    return-object v0
.end method

.method private d(Z)V
    .locals 1

    .prologue
    .line 1129
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->F:Lcom/qihoo/security/widget/QihooViewPager;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/QihooViewPager;->setCanScroll(Z)V

    .line 1130
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->E:Lcom/qihoo/security/widget/TabPageIndicator;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/widget/TabPageIndicator;->setCanClick(Z)V

    .line 1131
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->I:Lcom/qihoo/security/v7/MaterialMenuView;

    if-eqz v0, :cond_0

    .line 1132
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->I:Lcom/qihoo/security/v7/MaterialMenuView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/v7/MaterialMenuView;->setEnabled(Z)V

    .line 1135
    :cond_0
    iput-boolean p1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->N:Z

    .line 1136
    return-void
.end method

.method private e(I)V
    .locals 3

    .prologue
    .line 705
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/fragment/a;->b()I

    move-result v0

    if-lez v0, :cond_2

    .line 706
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/fragment/a;->b()I

    move-result v1

    .line 707
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_2

    .line 708
    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->d(I)Lcom/qihoo/security/ui/main/BaseHomeFragment;

    move-result-object v2

    .line 709
    if-eqz v2, :cond_0

    .line 710
    if-ne v0, p1, :cond_1

    .line 711
    invoke-virtual {v2}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a()V

    .line 707
    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 713
    :cond_1
    invoke-virtual {v2}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->h()V

    goto :goto_1

    .line 718
    :cond_2
    return-void
.end method

.method static synthetic e(Lcom/qihoo/security/ui/main/HomeActivity;)[I
    .locals 1

    .prologue
    .line 96
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->v()[I

    move-result-object v0

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/ui/main/HomeActivity;)Lcom/qihoo/security/widget/QihooViewPager;
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->F:Lcom/qihoo/security/widget/QihooViewPager;

    return-object v0
.end method

.method private f(I)V
    .locals 3

    .prologue
    .line 1339
    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->U:[B

    monitor-enter v1

    .line 1340
    :try_start_0
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->T:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->T:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1341
    :cond_0
    monitor-exit v1

    .line 1361
    :goto_0
    return-void

    .line 1343
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->T:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lcom/qihoo/security/ui/main/HomeActivity$3;

    invoke-direct {v2, p0, p1}, Lcom/qihoo/security/ui/main/HomeActivity$3;-><init>(Lcom/qihoo/security/ui/main/HomeActivity;I)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1360
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic g(Lcom/qihoo/security/ui/main/HomeActivity;)V
    .locals 0

    .prologue
    .line 96
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->u()V

    return-void
.end method

.method static synthetic h(Lcom/qihoo/security/ui/main/HomeActivity;)Ljava/util/List;
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->W:Ljava/util/List;

    return-object v0
.end method

.method private q()V
    .locals 3

    .prologue
    .line 218
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    .line 219
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/v5/a;->b(Landroid/content/Context;)Z

    move-result v0

    .line 220
    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->I:Lcom/qihoo/security/v7/MaterialMenuView;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/MaterialMenuView;->getState()Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    move-result-object v1

    sget-object v2, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->BURGER:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    if-ne v1, v2, :cond_1

    .line 221
    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->b(Z)V

    .line 226
    :cond_0
    :goto_0
    return-void

    .line 223
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->b(Z)V

    goto :goto_0
.end method

.method private r()V
    .locals 3

    .prologue
    .line 459
    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->U:[B

    monitor-enter v1

    .line 460
    :try_start_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->T:Ljava/util/concurrent/ExecutorService;

    .line 461
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 462
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->W:Ljava/util/List;

    .line 463
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 464
    if-eqz v0, :cond_0

    .line 465
    const-string/jumbo v1, "fragment_index"

    iget v2, p0, Lcom/qihoo/security/ui/main/HomeActivity;->y:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->y:I

    .line 466
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->O:Landroid/os/Bundle;

    .line 469
    :cond_0
    return-void

    .line 461
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private s()V
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v7, 0x1

    .line 505
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->A:Lcom/qihoo/security/ui/b/a$f;

    const v2, 0x7f0b0071

    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/QihooViewPager;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->F:Lcom/qihoo/security/widget/QihooViewPager;

    .line 506
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->F:Lcom/qihoo/security/widget/QihooViewPager;

    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Lcom/qihoo/security/widget/QihooViewPager;->setOffscreenPageLimit(I)V

    .line 507
    new-instance v0, Lcom/qihoo/security/ui/fragment/a;

    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->e()Landroid/support/v4/app/f;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/qihoo/security/ui/fragment/a;-><init>(Landroid/support/v4/app/f;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    .line 509
    iget-object v2, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    iget-object v3, p0, Lcom/qihoo/security/ui/main/HomeActivity;->p:Landroid/content/Context;

    const v4, 0x7f0c00a8

    const-class v5, Lcom/qihoo/security/ui/main/BoosterFragment;

    iget v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->y:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->O:Landroid/os/Bundle;

    :goto_0
    invoke-virtual {v2, v3, v4, v5, v0}, Lcom/qihoo/security/ui/fragment/a;->a(Landroid/content/Context;ILjava/lang/Class;Landroid/os/Bundle;)V

    .line 512
    iget-object v2, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    iget-object v3, p0, Lcom/qihoo/security/ui/main/HomeActivity;->p:Landroid/content/Context;

    const v4, 0x7f0c00a9

    const-class v5, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    iget v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->y:I

    if-ne v0, v7, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->O:Landroid/os/Bundle;

    :goto_1
    invoke-virtual {v2, v3, v4, v5, v0}, Lcom/qihoo/security/ui/fragment/a;->a(Landroid/content/Context;ILjava/lang/Class;Landroid/os/Bundle;)V

    .line 515
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    iget-object v2, p0, Lcom/qihoo/security/ui/main/HomeActivity;->p:Landroid/content/Context;

    const v3, 0x7f0c00aa

    const-class v4, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    iget v5, p0, Lcom/qihoo/security/ui/main/HomeActivity;->y:I

    const/4 v6, 0x2

    if-ne v5, v6, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->O:Landroid/os/Bundle;

    :cond_0
    invoke-virtual {v0, v2, v3, v4, v1}, Lcom/qihoo/security/ui/fragment/a;->a(Landroid/content/Context;ILjava/lang/Class;Landroid/os/Bundle;)V

    .line 519
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->F:Lcom/qihoo/security/widget/QihooViewPager;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/QihooViewPager;->setAdapter(Landroid/support/v4/view/o;)V

    .line 520
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->A:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b0070

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/TabPageIndicator;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->E:Lcom/qihoo/security/widget/TabPageIndicator;

    .line 521
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->A:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b006c

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/v7/ColorChangeBackgroundView;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->J:Lcom/qihoo/security/v7/ColorChangeBackgroundView;

    .line 522
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->A:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b006e

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->B:Landroid/view/View;

    .line 523
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->A:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b0072

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->D:Landroid/view/View;

    .line 524
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->A:Lcom/qihoo/security/ui/b/a$f;

    const v1, 0x7f0b006f

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a$f;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->C:Landroid/view/View;

    .line 525
    new-instance v0, Lcom/qihoo/security/ui/main/HomeActivity$8;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/main/HomeActivity$8;-><init>(Lcom/qihoo/security/ui/main/HomeActivity;)V

    .line 541
    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->E:Lcom/qihoo/security/widget/TabPageIndicator;

    iget-object v2, p0, Lcom/qihoo/security/ui/main/HomeActivity;->F:Lcom/qihoo/security/widget/QihooViewPager;

    iget v3, p0, Lcom/qihoo/security/ui/main/HomeActivity;->y:I

    invoke-virtual {v1, v2, v0, v3}, Lcom/qihoo/security/widget/TabPageIndicator;->a(Landroid/support/v4/view/ViewPager;Lcom/qihoo/security/widget/c;I)V

    .line 542
    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->E:Lcom/qihoo/security/widget/TabPageIndicator;

    invoke-virtual {v1, v7}, Lcom/qihoo/security/widget/TabPageIndicator;->setTabSmoothScroll(Z)V

    .line 543
    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->J:Lcom/qihoo/security/v7/ColorChangeBackgroundView;

    new-array v2, v7, [I

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    invoke-virtual {v4}, Lcom/qihoo/security/ui/fragment/a;->b()I

    move-result v4

    aput v4, v2, v3

    invoke-virtual {v1, v0, v2}, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->a(Lcom/qihoo/security/widget/c;[I)V

    .line 544
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->E:Lcom/qihoo/security/widget/TabPageIndicator;

    new-instance v1, Lcom/qihoo/security/ui/main/HomeActivity$9;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/main/HomeActivity$9;-><init>(Lcom/qihoo/security/ui/main/HomeActivity;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/TabPageIndicator;->setOnTabItemClickListener(Lcom/qihoo/security/widget/TabPageIndicator$b;)V

    .line 553
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->t()V

    .line 554
    return-void

    :cond_1
    move-object v0, v1

    .line 509
    goto/16 :goto_0

    :cond_2
    move-object v0, v1

    .line 512
    goto/16 :goto_1
.end method

.method private t()V
    .locals 4

    .prologue
    .line 561
    new-instance v0, Lcom/qihoo/security/ui/main/FragmentsObservable;

    invoke-direct {v0}, Lcom/qihoo/security/ui/main/FragmentsObservable;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->z:Lcom/qihoo/security/ui/main/FragmentsObservable;

    .line 563
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/fragment/a;->b()I

    move-result v0

    if-lez v0, :cond_1

    .line 564
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/fragment/a;->b()I

    move-result v1

    .line 566
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 567
    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->d(I)Lcom/qihoo/security/ui/main/BaseHomeFragment;

    move-result-object v2

    .line 572
    if-eqz v2, :cond_0

    .line 573
    iget-object v3, p0, Lcom/qihoo/security/ui/main/HomeActivity;->z:Lcom/qihoo/security/ui/main/FragmentsObservable;

    invoke-virtual {v3, v2}, Lcom/qihoo/security/ui/main/FragmentsObservable;->addObserver(Ljava/util/Observer;)V

    .line 574
    iget-object v3, p0, Lcom/qihoo/security/ui/main/HomeActivity;->z:Lcom/qihoo/security/ui/main/FragmentsObservable;

    invoke-virtual {v2, v3}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Lcom/qihoo/security/ui/main/FragmentsObservable;)V

    .line 566
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 578
    :cond_1
    return-void
.end method

.method private u()V
    .locals 2

    .prologue
    .line 642
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->v()[I

    move-result-object v0

    .line 643
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->a([I)V

    .line 644
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->J:Lcom/qihoo/security/v7/ColorChangeBackgroundView;

    invoke-virtual {v1}, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->getCurrentColor()I

    move-result v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->b(Landroid/graphics/drawable/Drawable;)V

    .line 645
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    .line 646
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Landroid/graphics/drawable/Drawable;)V

    .line 648
    :cond_0
    return-void
.end method

.method private v()[I
    .locals 4

    .prologue
    .line 661
    const/4 v0, 0x0

    .line 662
    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    invoke-virtual {v1}, Lcom/qihoo/security/ui/fragment/a;->b()I

    move-result v1

    if-lez v1, :cond_1

    .line 663
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/fragment/a;->b()I

    move-result v2

    .line 664
    new-array v0, v2, [I

    .line 666
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 667
    invoke-virtual {p0, v1}, Lcom/qihoo/security/ui/main/HomeActivity;->d(I)Lcom/qihoo/security/ui/main/BaseHomeFragment;

    move-result-object v3

    .line 668
    if-eqz v3, :cond_0

    .line 669
    invoke-virtual {v3}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->g()Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v3

    aput v3, v0, v1

    .line 666
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 674
    :cond_1
    return-object v0
.end method

.method private w()V
    .locals 2

    .prologue
    .line 744
    invoke-static {}, Lcom/qihoo/security/appbox/core/d;->a()Lcom/qihoo/security/appbox/core/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/core/d;->d()Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->L:Z

    .line 745
    invoke-static {}, Lcom/qihoo/security/appbox/core/d;->a()Lcom/qihoo/security/appbox/core/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/core/d;->c()I

    move-result v0

    .line 748
    const-string/jumbo v1, "last_get_red_dot_show_rule_value"

    invoke-static {p0, v1, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 750
    iget-boolean v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->L:Z

    if-eqz v0, :cond_0

    .line 751
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->K:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 755
    :goto_0
    return-void

    .line 753
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->K:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method private x()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 767
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->R:Landroid/view/Menu;

    if-eqz v0, :cond_0

    .line 769
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->R:Landroid/view/Menu;

    const v1, 0x7f0b0253

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    .line 770
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 775
    :cond_0
    :goto_0
    invoke-virtual {p0, v2}, Lcom/qihoo/security/ui/main/HomeActivity;->b(Z)V

    .line 776
    return-void

    .line 771
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private y()V
    .locals 2

    .prologue
    .line 779
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->R:Landroid/view/Menu;

    if-eqz v0, :cond_0

    .line 781
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->R:Landroid/view/Menu;

    const v1, 0x7f0b0253

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    .line 782
    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 786
    :cond_0
    :goto_0
    invoke-static {p0}, Lcom/qihoo/security/v5/a;->b(Landroid/content/Context;)Z

    move-result v0

    .line 787
    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->b(Z)V

    .line 788
    return-void

    .line 783
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private z()V
    .locals 3

    .prologue
    .line 963
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->F:Lcom/qihoo/security/widget/QihooViewPager;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    if-eqz v0, :cond_1

    .line 964
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/fragment/a;->b()I

    move-result v1

    .line 965
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 966
    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->d(I)Lcom/qihoo/security/ui/main/BaseHomeFragment;

    move-result-object v2

    .line 967
    if-eqz v2, :cond_0

    .line 968
    invoke-virtual {v2}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->i()V

    .line 965
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 972
    :cond_1
    return-void
.end method


# virtual methods
.method public a(IZ)V
    .locals 1

    .prologue
    .line 501
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->F:Lcom/qihoo/security/widget/QihooViewPager;

    invoke-virtual {v0, p1, p2}, Lcom/qihoo/security/widget/QihooViewPager;->a(IZ)V

    .line 502
    return-void
.end method

.method public a(Lcom/nineoldandroids/a/a$a;)V
    .locals 1

    .prologue
    .line 1112
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Lcom/nineoldandroids/a/a$a;Z)V

    .line 1113
    return-void
.end method

.method public a(Lcom/nineoldandroids/a/a$a;Z)V
    .locals 2

    .prologue
    .line 1095
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->d(Z)V

    .line 1096
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->E:Lcom/qihoo/security/widget/TabPageIndicator;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, p2, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->b(Landroid/view/View;ZZLcom/nineoldandroids/a/a$a;)V

    .line 1097
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->x()V

    .line 1098
    return-void
.end method

.method public a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V
    .locals 1

    .prologue
    .line 1021
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->b(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p2, :cond_1

    .line 1022
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/ui/main/HomeActivity;->b(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 1024
    :cond_1
    return-void
.end method

.method public a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V
    .locals 5

    .prologue
    .line 1284
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/app/BaseActivity;->a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V

    .line 1285
    invoke-static {}, Lcom/qihoo/security/profile/j;->a()Lcom/qihoo/security/profile/j;

    move-result-object v0

    const/4 v1, -0x1

    const/4 v2, 0x5

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "frag:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/qihoo/security/ui/main/HomeActivity;->F:Lcom/qihoo/security/widget/QihooViewPager;

    invoke-virtual {v4}, Lcom/qihoo/security/widget/QihooViewPager;->getCurrentItem()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/profile/j;->a(IILjava/lang/String;)V

    .line 1290
    sget-object v0, Lcom/qihoo/security/ui/main/HomeActivity$4;->a:[I

    invoke-virtual {p1}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 1314
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 1292
    :pswitch_1
    if-eqz p2, :cond_0

    .line 1293
    const-string/jumbo v0, "index"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/main/HomeActivity;->a(IZ)V

    goto :goto_0

    .line 1301
    :pswitch_2
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->p()Lcom/qihoo/security/ui/main/BaseHomeFragment;

    move-result-object v0

    .line 1302
    if-eqz v0, :cond_0

    .line 1303
    invoke-virtual {v0, p1, p2}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V

    goto :goto_0

    .line 1290
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public declared-synchronized a(Lcom/qihoo/security/ui/main/c$a;)V
    .locals 3

    .prologue
    .line 623
    monitor-enter p0

    if-nez p1, :cond_1

    .line 639
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 627
    :cond_1
    const/4 v1, 0x0

    .line 628
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 629
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/main/c$a;

    .line 630
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 631
    const/4 v0, 0x1

    .line 635
    :goto_1
    if-nez v0, :cond_0

    .line 636
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->W:Ljava/util/List;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 623
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_3
    move v0, v1

    goto :goto_1
.end method

.method public a(Landroid/support/v4/app/Fragment;)Z
    .locals 1

    .prologue
    .line 1042
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->F:Lcom/qihoo/security/widget/QihooViewPager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    if-eqz v0, :cond_0

    .line 1043
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->p()Lcom/qihoo/security/ui/main/BaseHomeFragment;

    move-result-object v0

    .line 1044
    if-ne p1, v0, :cond_0

    .line 1046
    const/4 v0, 0x1

    .line 1049
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a_(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1335
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->b(Ljava/lang/String;)V

    .line 1336
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a$a;)V
    .locals 1

    .prologue
    .line 1120
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->b(Lcom/nineoldandroids/a/a$a;Z)V

    .line 1121
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a$a;Z)V
    .locals 2

    .prologue
    .line 1102
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->d(Z)V

    .line 1103
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->E:Lcom/qihoo/security/widget/TabPageIndicator;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p2, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->b(Landroid/view/View;ZZLcom/nineoldandroids/a/a$a;)V

    .line 1104
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->y()V

    .line 1105
    return-void
.end method

.method public b_(I)V
    .locals 2

    .prologue
    .line 1317
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->R:Landroid/view/Menu;

    if-eqz v0, :cond_0

    .line 1318
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->X:Landroid/view/MenuItem;

    if-eqz v0, :cond_0

    .line 1319
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->X:Landroid/view/MenuItem;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 1320
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->R:Landroid/view/Menu;

    const v1, 0x7f0b0254

    invoke-virtual {p0, v0, v1, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Landroid/view/Menu;II)V

    .line 1323
    :cond_0
    return-void
.end method

.method public c_()V
    .locals 1

    .prologue
    .line 1090
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->d(Z)V

    .line 1091
    return-void
.end method

.method public d(I)Lcom/qihoo/security/ui/main/BaseHomeFragment;
    .locals 2

    .prologue
    .line 1073
    const/4 v1, 0x0

    .line 1075
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/fragment/a;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 1076
    check-cast v0, Lcom/qihoo/security/ui/main/BaseHomeFragment;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1082
    :goto_0
    return-object v0

    .line 1077
    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0
.end method

.method public d_()V
    .locals 2

    .prologue
    .line 1327
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->R:Landroid/view/Menu;

    if-eqz v0, :cond_0

    .line 1328
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->X:Landroid/view/MenuItem;

    if-eqz v0, :cond_0

    .line 1329
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->X:Landroid/view/MenuItem;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 1332
    :cond_0
    return-void
.end method

.method protected i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 98
    const-string/jumbo v0, "hm"

    return-object v0
.end method

.method protected j()V
    .locals 2

    .prologue
    .line 490
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 491
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    .line 492
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Landroid/graphics/drawable/Drawable;)V

    .line 494
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->q:Lcom/qihoo/security/v7/MaterialMenuView;

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->I:Lcom/qihoo/security/v7/MaterialMenuView;

    .line 495
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->BURGER:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;)V

    .line 496
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01d3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->b(Ljava/lang/String;)V

    .line 498
    :cond_0
    return-void
.end method

.method protected n()V
    .locals 1

    .prologue
    .line 836
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->c(Z)Z

    .line 837
    return-void
.end method

.method public o()I
    .locals 1

    .prologue
    .line 691
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->J:Lcom/qihoo/security/v7/ColorChangeBackgroundView;

    invoke-virtual {v0}, Lcom/qihoo/security/v7/ColorChangeBackgroundView;->getCurrentColor()I

    move-result v0

    .line 692
    if-nez v0, :cond_0

    .line 693
    sget-object v0, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v0

    .line 695
    :cond_0
    return v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 1269
    invoke-super {p0, p1, p2, p3}, Lcom/qihoo/security/app/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 1273
    packed-switch p2, :pswitch_data_0

    .line 1280
    :goto_0
    return-void

    .line 1275
    :pswitch_0
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->p()Lcom/qihoo/security/ui/main/BaseHomeFragment;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0

    .line 1273
    nop

    :pswitch_data_0
    .packed-switch 0xc8
        :pswitch_0
    .end packed-switch
.end method

.method public onBackPressed()V
    .locals 10

    .prologue
    const-wide/16 v8, 0xbb8

    const-wide/16 v6, 0x12c

    const/4 v4, 0x1

    .line 856
    iget-boolean v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->N:Z

    if-nez v0, :cond_1

    .line 893
    :cond_0
    :goto_0
    return-void

    .line 860
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->p()Lcom/qihoo/security/ui/main/BaseHomeFragment;

    move-result-object v0

    .line 861
    if-eqz v0, :cond_2

    .line 862
    invoke-virtual {v0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->b()Z

    move-result v0

    .line 864
    if-nez v0, :cond_0

    .line 869
    :cond_2
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->c(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 875
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/qihoo/security/ui/main/HomeActivity;->M:J

    sub-long/2addr v0, v2

    .line 876
    cmp-long v2, v0, v8

    if-lez v2, :cond_3

    .line 877
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->M:J

    .line 878
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v1, 0x7f0c00ae

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 879
    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->Z:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 880
    iput v4, v1, Landroid/os/Message;->what:I

    .line 881
    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 882
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->Z:Landroid/os/Handler;

    invoke-virtual {v0, v1, v6, v7}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 883
    :cond_3
    cmp-long v2, v0, v6

    if-lez v2, :cond_4

    cmp-long v0, v0, v8

    if-gtz v0, :cond_4

    .line 885
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/b/q;->cancel()V

    .line 886
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->z()V

    .line 887
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onBackPressed()V

    goto :goto_0

    .line 889
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->Z:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 890
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->z()V

    .line 891
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onBackPressed()V

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 841
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 851
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const v5, 0x7f03001d

    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 246
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 247
    iget v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->V:I

    if-ne v0, v4, :cond_0

    .line 318
    :goto_0
    return-void

    .line 250
    :cond_0
    iput v3, p0, Lcom/qihoo/security/ui/main/HomeActivity;->V:I

    .line 251
    invoke-static {p0}, Lcom/qihoo/security/app/a;->a(Landroid/content/Context;)Lcom/qihoo/security/app/a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/qihoo/security/app/a;->a(Z)V

    .line 252
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "clear_default_pre_is_need_run"

    invoke-static {v0, v1, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 254
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 255
    const-string/jumbo v1, "com.qihoo.security.action.function.LANGUAGE_AUTO_DOWN_FINISH"

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 257
    const-wide/16 v0, 0xc8

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/ui/main/HomeActivity;->a(J)V

    .line 258
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->finish()V

    goto :goto_0

    .line 262
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->p:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 264
    invoke-static {}, Lcom/qihoo/security/ui/b/a;->a()Lcom/qihoo/security/ui/b/a;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/qihoo/security/ui/b/a;->b(I)Lcom/qihoo/security/ui/b/a$f;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->A:Lcom/qihoo/security/ui/b/a$f;

    .line 265
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->A:Lcom/qihoo/security/ui/b/a$f;

    if-nez v0, :cond_4

    .line 269
    new-instance v0, Lcom/qihoo/security/ui/main/HomeActivity$6;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/main/HomeActivity$6;-><init>(Lcom/qihoo/security/ui/main/HomeActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->A:Lcom/qihoo/security/ui/b/a$f;

    .line 275
    invoke-virtual {p0, v5}, Lcom/qihoo/security/ui/main/HomeActivity;->setContentView(I)V

    .line 282
    :goto_1
    invoke-static {}, Lcom/qihoo/security/a;->d()V

    .line 284
    iput-boolean v3, p0, Lcom/qihoo/security/ui/main/HomeActivity;->v:Z

    .line 285
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->r()V

    .line 287
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->s()V

    .line 288
    new-instance v0, Lcom/qihoo360/mobilesafe/b/e;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/b/e;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->Q:Lcom/qihoo360/mobilesafe/b/e;

    .line 290
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->m()V

    .line 292
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/g;->a(Landroid/content/Context;)Landroid/support/v4/content/g;

    move-result-object v0

    .line 293
    new-instance v1, Landroid/content/IntentFilter;

    const-string/jumbo v2, "com.qihoo.security.FINISH_MAIN_SCREEN"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 294
    const-string/jumbo v2, "com.qihoo.security.REBOOT_MAIN_SCREEN"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 295
    const-string/jumbo v2, "com.qihoo.security.RESET_MAIN_SCREEN"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 296
    const-string/jumbo v2, "com.qihoo.security.v5.APPVersionRedPointHelper.HasNewVersion"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 297
    const-string/jumbo v2, "com.qihoo.security.v5.APPVersionRedPointHelper.ClickedReadPoint"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 298
    iget-object v2, p0, Lcom/qihoo/security/ui/main/HomeActivity;->Y:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v2, v1}, Landroid/support/v4/content/g;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 301
    const/16 v0, 0x2716

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 303
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->P:J

    .line 305
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/locale/c;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 306
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->Z:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->Z:Landroid/os/Handler;

    const/16 v2, 0x65

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x320

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 310
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/a;->g(Landroid/content/Context;)V

    .line 312
    invoke-static {p0}, Lcom/qihoo/security/adv/a/c;->a(Landroid/content/Context;)V

    .line 313
    const-string/jumbo v0, "55"

    const-string/jumbo v1, "179046299094879_179857549013754"

    invoke-static {p0, v0, v1}, Lcom/mobvista/sdk/m/core/MobvistaAd;->newAdWallController(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->H:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    .line 314
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->H:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    if-eqz v0, :cond_3

    .line 315
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->H:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->preloadWall()V

    .line 317
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->aa:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    .line 277
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->A:Lcom/qihoo/security/ui/b/a$f;

    iget-object v0, v0, Lcom/qihoo/security/ui/b/a$f;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->setContentView(Landroid/view/View;)V

    goto/16 :goto_1
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 759
    iput-object p1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->R:Landroid/view/Menu;

    .line 760
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f100002

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 761
    const v0, 0x7f0b0254

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->X:Landroid/view/MenuItem;

    .line 762
    const v0, 0x7f0b0253

    const v1, 0x7f020046

    invoke-direct {p0, p1, v0, v1}, Lcom/qihoo/security/ui/main/HomeActivity;->b(Landroid/view/Menu;II)V

    .line 763
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onDestroy()V
    .locals 6

    .prologue
    .line 976
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onDestroy()V

    .line 979
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->H:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    if-eqz v0, :cond_0

    .line 980
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->H:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->release()V

    .line 982
    :cond_0
    monitor-enter p0

    .line 983
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 984
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 986
    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->U:[B

    monitor-enter v1

    .line 987
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->T:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 988
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->T:Ljava/util/concurrent/ExecutorService;

    .line 989
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 992
    invoke-static {p0}, Lcom/qihoo/security/support/a;->a(Landroid/content/Context;)V

    .line 998
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/g;->a(Landroid/content/Context;)Landroid/support/v4/content/g;

    move-result-object v0

    .line 999
    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->Y:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/g;->a(Landroid/content/BroadcastReceiver;)V

    .line 1002
    const/16 v0, 0x2715

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/qihoo/security/ui/main/HomeActivity;->P:J

    sub-long/2addr v2, v4

    long-to-int v1, v2

    div-int/lit16 v1, v1, 0x3e8

    invoke-static {v0, v1}, Lcom/qihoo/security/support/b;->b(II)V

    .line 1004
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "first_time_in_this_open"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 1006
    invoke-static {}, Lcom/qihoo/security/recommend/RecommendHelper;->a()Lcom/qihoo/security/recommend/RecommendHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/recommend/RecommendHelper;->c()V

    .line 1007
    return-void

    .line 984
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 989
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 792
    .line 799
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/app/BaseActivity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 366
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 371
    iget v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->V:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 418
    :cond_0
    :goto_0
    return-void

    .line 374
    :cond_1
    const/4 v0, 0x2

    iput v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->V:I

    .line 376
    const-string/jumbo v0, "set_intent"

    invoke-virtual {p1, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 377
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->setIntent(Landroid/content/Intent;)V

    .line 380
    :cond_2
    const-string/jumbo v0, "com.qihoo.security.action.function.LANGUAGE_AUTO_DOWN_FINISH"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 382
    const-wide/16 v0, 0xc8

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/ui/main/HomeActivity;->a(J)V

    .line 383
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->finish()V

    goto :goto_0

    .line 387
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->p:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 389
    const-string/jumbo v0, "fragment_index"

    iget v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->y:I

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 390
    const-string/jumbo v1, "jump_result_page"

    invoke-virtual {p1, v1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    .line 391
    if-ltz v0, :cond_6

    iget-object v2, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    invoke-virtual {v2}, Lcom/qihoo/security/ui/fragment/a;->b()I

    move-result v2

    if-ge v0, v2, :cond_6

    .line 392
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/HomeActivity;->c(Landroid/content/Intent;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 393
    iget v2, p0, Lcom/qihoo/security/ui/main/HomeActivity;->y:I

    if-eq v2, v0, :cond_4

    .line 394
    iget-object v2, p0, Lcom/qihoo/security/ui/main/HomeActivity;->F:Lcom/qihoo/security/widget/QihooViewPager;

    invoke-virtual {v2, v0, v3}, Lcom/qihoo/security/widget/QihooViewPager;->a(IZ)V

    .line 396
    :cond_4
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->p()Lcom/qihoo/security/ui/main/BaseHomeFragment;

    move-result-object v0

    .line 398
    if-eqz v0, :cond_6

    .line 399
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 400
    if-eqz v1, :cond_5

    .line 401
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->j()V

    .line 403
    :cond_5
    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Landroid/os/Bundle;)V

    .line 404
    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Landroid/content/Intent;)V

    .line 411
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->K:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 415
    const-string/jumbo v0, "is_from_appbox_shortcut"

    invoke-virtual {p1, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 416
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->w()V

    goto :goto_0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 4

    .prologue
    .line 804
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 831
    :cond_0
    :goto_0
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    :goto_1
    return v0

    .line 806
    :sswitch_0
    const/4 v0, 0x1

    goto :goto_1

    .line 808
    :sswitch_1
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 809
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "click_home_appbox_timestamp"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 811
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->K:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 815
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->p:Landroid/content/Context;

    iget-boolean v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->L:Z

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/a;->a(Landroid/content/Context;Z)V

    .line 816
    const/16 v0, 0x6595

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 818
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->z:Lcom/qihoo/security/ui/main/FragmentsObservable;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/FragmentsObservable;->a(Lcom/qihoo/security/ui/main/FragmentsObservable;)V

    goto :goto_0

    .line 822
    :sswitch_2
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 823
    const/16 v0, 0x2b69

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 824
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/HomeActivity;->p:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/gamebooster/GamesBoostSettingListActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 804
    nop

    :sswitch_data_0
    .sparse-switch
        0x102002c -> :sswitch_0
        0x7f0b0253 -> :sswitch_1
        0x7f0b0254 -> :sswitch_2
    .end sparse-switch
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 360
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onPause()V

    .line 361
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->V:I

    .line 362
    return-void
.end method

.method protected onPostResume()V
    .locals 1

    .prologue
    .line 484
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onPostResume()V

    .line 485
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->ac:Z

    .line 486
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 476
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->ac:Z

    .line 477
    return-void
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 352
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onStart()V

    .line 353
    invoke-direct {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->q()V

    .line 354
    return-void
.end method

.method protected onStop()V
    .locals 0

    .prologue
    .line 422
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onStop()V

    .line 423
    return-void
.end method

.method public p()Lcom/qihoo/security/ui/main/BaseHomeFragment;
    .locals 1

    .prologue
    .line 1058
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->F:Lcom/qihoo/security/widget/QihooViewPager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->G:Lcom/qihoo/security/ui/fragment/a;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/HomeActivity;->e()Landroid/support/v4/app/f;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1059
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity;->F:Lcom/qihoo/security/widget/QihooViewPager;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/QihooViewPager;->getCurrentItem()I

    move-result v0

    .line 1060
    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/HomeActivity;->d(I)Lcom/qihoo/security/ui/main/BaseHomeFragment;

    move-result-object v0

    .line 1063
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
