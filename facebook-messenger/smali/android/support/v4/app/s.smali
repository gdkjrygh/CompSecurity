.class final Landroid/support/v4/app/s;
.super Landroid/support/v4/app/q;
.source "FragmentManager.java"


# static fields
.field static final A:Landroid/view/animation/Interpolator;

.field static final B:Landroid/view/animation/Interpolator;

.field static final C:Landroid/view/animation/Interpolator;

.field static a:Z

.field static final b:Z

.field static final z:Landroid/view/animation/Interpolator;


# instance fields
.field c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field d:[Ljava/lang/Runnable;

.field e:Z

.field f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/b;",
            ">;"
        }
    .end annotation
.end field

.field j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/b;",
            ">;"
        }
    .end annotation
.end field

.field l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/r;",
            ">;"
        }
    .end annotation
.end field

.field n:I

.field o:Landroid/support/v4/app/p;

.field p:Landroid/support/v4/app/o;

.field q:Landroid/support/v4/app/Fragment;

.field r:Z

.field s:Z

.field t:Z

.field u:Ljava/lang/String;

.field v:Z

.field w:Landroid/os/Bundle;

.field x:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field

.field y:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/high16 v4, 0x40200000    # 2.5f

    const/high16 v3, 0x3fc00000    # 1.5f

    .line 391
    sput-boolean v0, Landroid/support/v4/app/s;->a:Z

    .line 394
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    sput-boolean v0, Landroid/support/v4/app/s;->b:Z

    .line 756
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0, v4}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    sput-object v0, Landroid/support/v4/app/s;->z:Landroid/view/animation/Interpolator;

    .line 757
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0, v3}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    sput-object v0, Landroid/support/v4/app/s;->A:Landroid/view/animation/Interpolator;

    .line 758
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0, v4}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    sput-object v0, Landroid/support/v4/app/s;->B:Landroid/view/animation/Interpolator;

    .line 759
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0, v3}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    sput-object v0, Landroid/support/v4/app/s;->C:Landroid/view/animation/Interpolator;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 390
    invoke-direct {p0}, Landroid/support/v4/app/q;-><init>()V

    .line 417
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v4/app/s;->n:I

    .line 429
    iput-object v1, p0, Landroid/support/v4/app/s;->w:Landroid/os/Bundle;

    .line 430
    iput-object v1, p0, Landroid/support/v4/app/s;->x:Landroid/util/SparseArray;

    .line 432
    new-instance v0, Landroid/support/v4/app/t;

    invoke-direct {v0, p0}, Landroid/support/v4/app/t;-><init>(Landroid/support/v4/app/s;)V

    iput-object v0, p0, Landroid/support/v4/app/s;->y:Ljava/lang/Runnable;

    return-void
.end method

.method static a(Landroid/content/Context;FF)Landroid/view/animation/Animation;
    .locals 3

    .prologue
    .line 779
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, p1, p2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 780
    sget-object v1, Landroid/support/v4/app/s;->A:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 781
    const-wide/16 v1, 0xdc

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 782
    return-object v0
.end method

.method static a(Landroid/content/Context;FFFF)Landroid/view/animation/Animation;
    .locals 10

    .prologue
    .line 765
    new-instance v9, Landroid/view/animation/AnimationSet;

    const/4 v0, 0x0

    invoke-direct {v9, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 766
    new-instance v0, Landroid/view/animation/ScaleAnimation;

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    move v1, p1

    move v2, p2

    move v3, p1

    move v4, p2

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    .line 768
    sget-object v1, Landroid/support/v4/app/s;->z:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 769
    const-wide/16 v1, 0xdc

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 770
    invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 771
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, p3, p4}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 772
    sget-object v1, Landroid/support/v4/app/s;->A:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 773
    const-wide/16 v1, 0xdc

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 774
    invoke-virtual {v9, v0}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 775
    return-object v9
.end method

.method private a(Ljava/lang/RuntimeException;)V
    .locals 5

    .prologue
    .line 479
    const-string v0, "FragmentManager"

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 480
    const-string v0, "FragmentManager"

    const-string v1, "Activity state:"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 481
    new-instance v0, Landroid/support/v4/c/b;

    const-string v1, "FragmentManager"

    invoke-direct {v0, v1}, Landroid/support/v4/c/b;-><init>(Ljava/lang/String;)V

    .line 482
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 483
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    if-eqz v0, :cond_0

    .line 485
    :try_start_0
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    const-string v2, "  "

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/String;

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/support/v4/app/p;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 496
    :goto_0
    throw p1

    .line 486
    :catch_0
    move-exception v0

    .line 487
    const-string v1, "FragmentManager"

    const-string v2, "Failed dumping state"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 491
    :cond_0
    :try_start_1
    const-string v0, "  "

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/String;

    invoke-virtual {p0, v0, v2, v1, v3}, Landroid/support/v4/app/s;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 492
    :catch_1
    move-exception v0

    .line 493
    const-string v1, "FragmentManager"

    const-string v2, "Failed dumping state"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static b(IZ)I
    .locals 1

    .prologue
    .line 2092
    const/4 v0, -0x1

    .line 2093
    sparse-switch p0, :sswitch_data_0

    .line 2104
    :goto_0
    return v0

    .line 2095
    :sswitch_0
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    goto :goto_0

    .line 2098
    :sswitch_1
    if-eqz p1, :cond_1

    const/4 v0, 0x3

    goto :goto_0

    :cond_1
    const/4 v0, 0x4

    goto :goto_0

    .line 2101
    :sswitch_2
    if-eqz p1, :cond_2

    const/4 v0, 0x5

    goto :goto_0

    :cond_2
    const/4 v0, 0x6

    goto :goto_0

    .line 2093
    nop

    :sswitch_data_0
    .sparse-switch
        0x1001 -> :sswitch_0
        0x1003 -> :sswitch_2
        0x2002 -> :sswitch_1
    .end sparse-switch
.end method

.method public static e(I)I
    .locals 1

    .prologue
    .line 2068
    const/4 v0, 0x0

    .line 2069
    sparse-switch p0, :sswitch_data_0

    .line 2080
    :goto_0
    return v0

    .line 2071
    :sswitch_0
    const/16 v0, 0x2002

    .line 2072
    goto :goto_0

    .line 2074
    :sswitch_1
    const/16 v0, 0x1001

    .line 2075
    goto :goto_0

    .line 2077
    :sswitch_2
    const/16 v0, 0x1003

    goto :goto_0

    .line 2069
    :sswitch_data_0
    .sparse-switch
        0x1001 -> :sswitch_0
        0x1003 -> :sswitch_2
        0x2002 -> :sswitch_1
    .end sparse-switch
.end method

.method private w()V
    .locals 3

    .prologue
    .line 1380
    iget-boolean v0, p0, Landroid/support/v4/app/s;->s:Z

    if-eqz v0, :cond_0

    .line 1381
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can not perform this action after onSaveInstanceState"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1384
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/s;->u:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 1385
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can not perform this action inside of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v4/app/s;->u:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1388
    :cond_1
    return-void
.end method


# virtual methods
.method public a(Landroid/support/v4/app/b;)I
    .locals 4

    .prologue
    .line 1410
    monitor-enter p0

    .line 1411
    :try_start_0
    iget-object v0, p0, Landroid/support/v4/app/s;->l:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/app/s;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_3

    .line 1412
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/s;->k:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 1413
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/s;->k:Ljava/util/ArrayList;

    .line 1415
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/s;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 1416
    sget-boolean v1, Landroid/support/v4/app/s;->a:Z

    if-eqz v1, :cond_2

    const-string v1, "FragmentManager"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Setting back stack index "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1417
    :cond_2
    iget-object v1, p0, Landroid/support/v4/app/s;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1418
    monitor-exit p0

    .line 1424
    :goto_0
    return v0

    .line 1421
    :cond_3
    iget-object v0, p0, Landroid/support/v4/app/s;->l:Ljava/util/ArrayList;

    iget-object v1, p0, Landroid/support/v4/app/s;->l:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 1422
    sget-boolean v1, Landroid/support/v4/app/s;->a:Z

    if-eqz v1, :cond_4

    const-string v1, "FragmentManager"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Adding back stack index "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " with "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1423
    :cond_4
    iget-object v1, p0, Landroid/support/v4/app/s;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1424
    monitor-exit p0

    goto :goto_0

    .line 1426
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(I)Landroid/support/v4/app/Fragment;
    .locals 3

    .prologue
    .line 1319
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 1321
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_2

    .line 1322
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 1323
    if-eqz v0, :cond_1

    iget v2, v0, Landroid/support/v4/app/Fragment;->G:I

    if-ne v2, p1, :cond_1

    .line 1337
    :cond_0
    :goto_1
    return-object v0

    .line 1321
    :cond_1
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 1328
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    .line 1330
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_2
    if-ltz v1, :cond_4

    .line 1331
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 1332
    if-eqz v0, :cond_3

    iget v2, v0, Landroid/support/v4/app/Fragment;->G:I

    if-eq v2, p1, :cond_0

    .line 1330
    :cond_3
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_2

    .line 1337
    :cond_4
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public a(Landroid/os/Bundle;Ljava/lang/String;)Landroid/support/v4/app/Fragment;
    .locals 5

    .prologue
    const/4 v0, -0x1

    .line 599
    invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 600
    if-ne v1, v0, :cond_1

    .line 601
    const/4 v0, 0x0

    .line 612
    :cond_0
    :goto_0
    return-object v0

    .line 603
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_2

    .line 604
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Fragement no longer exists for key "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": index "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Landroid/support/v4/app/s;->a(Ljava/lang/RuntimeException;)V

    .line 607
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 608
    if-nez v0, :cond_0

    .line 609
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Fragement no longer exists for key "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": index "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v2}, Landroid/support/v4/app/s;->a(Ljava/lang/RuntimeException;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
    .locals 3

    .prologue
    .line 1341
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    .line 1343
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_2

    .line 1344
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 1345
    if-eqz v0, :cond_1

    iget-object v2, v0, Landroid/support/v4/app/Fragment;->I:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1359
    :cond_0
    :goto_1
    return-object v0

    .line 1343
    :cond_1
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 1350
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    .line 1352
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_2
    if-ltz v1, :cond_4

    .line 1353
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 1354
    if-eqz v0, :cond_3

    iget-object v2, v0, Landroid/support/v4/app/Fragment;->I:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1352
    :cond_3
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_2

    .line 1359
    :cond_4
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public a()Landroid/support/v4/app/ad;
    .locals 1

    .prologue
    .line 501
    new-instance v0, Landroid/support/v4/app/b;

    invoke-direct {v0, p0}, Landroid/support/v4/app/b;-><init>(Landroid/support/v4/app/s;)V

    return-object v0
.end method

.method a(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;
    .locals 6

    .prologue
    const v5, 0x3f79999a    # 0.975f

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    .line 787
    iget v0, p1, Landroid/support/v4/app/Fragment;->Q:I

    invoke-virtual {p1, p2, p3, v0}, Landroid/support/v4/app/Fragment;->a(IZI)Landroid/view/animation/Animation;

    move-result-object v0

    .line 789
    if-eqz v0, :cond_1

    .line 842
    :cond_0
    :goto_0
    return-object v0

    .line 793
    :cond_1
    iget v0, p1, Landroid/support/v4/app/Fragment;->Q:I

    if-eqz v0, :cond_2

    .line 794
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->a()Landroid/content/Context;

    move-result-object v0

    iget v2, p1, Landroid/support/v4/app/Fragment;->Q:I

    invoke-static {v0, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 796
    if-nez v0, :cond_0

    .line 801
    :cond_2
    if-nez p2, :cond_3

    move-object v0, v1

    .line 802
    goto :goto_0

    .line 805
    :cond_3
    invoke-static {p2, p3}, Landroid/support/v4/app/s;->b(IZ)I

    move-result v0

    .line 806
    if-gez v0, :cond_4

    move-object v0, v1

    .line 807
    goto :goto_0

    .line 810
    :cond_4
    packed-switch v0, :pswitch_data_0

    .line 825
    if-nez p4, :cond_5

    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->c()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 826
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->c()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget p4, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 828
    :cond_5
    if-nez p4, :cond_6

    move-object v0, v1

    .line 829
    goto :goto_0

    .line 812
    :pswitch_0
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->a()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x3f900000    # 1.125f

    invoke-static {v0, v1, v3, v4, v3}, Landroid/support/v4/app/s;->a(Landroid/content/Context;FFFF)Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0

    .line 814
    :pswitch_1
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v3, v5, v3, v4}, Landroid/support/v4/app/s;->a(Landroid/content/Context;FFFF)Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0

    .line 816
    :pswitch_2
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v5, v3, v4, v3}, Landroid/support/v4/app/s;->a(Landroid/content/Context;FFFF)Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0

    .line 818
    :pswitch_3
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->a()Landroid/content/Context;

    move-result-object v0

    const v1, 0x3f89999a    # 1.075f

    invoke-static {v0, v3, v1, v3, v4}, Landroid/support/v4/app/s;->a(Landroid/content/Context;FFFF)Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0

    .line 820
    :pswitch_4
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4, v3}, Landroid/support/v4/app/s;->a(Landroid/content/Context;FF)Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0

    .line 822
    :pswitch_5
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v3, v4}, Landroid/support/v4/app/s;->a(Landroid/content/Context;FF)Landroid/view/animation/Animation;

    move-result-object v0

    goto/16 :goto_0

    :cond_6
    move-object v0, v1

    .line 842
    goto/16 :goto_0

    .line 810
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public a(II)V
    .locals 3

    .prologue
    .line 543
    if-gez p1, :cond_0

    .line 544
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bad id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 546
    :cond_0
    new-instance v0, Landroid/support/v4/app/w;

    invoke-direct {v0, p0, p1, p2}, Landroid/support/v4/app/w;-><init>(Landroid/support/v4/app/s;II)V

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/s;->a(Ljava/lang/Runnable;Z)V

    .line 551
    return-void
.end method

.method a(IIIZ)V
    .locals 8

    .prologue
    const/4 v5, 0x0

    .line 1122
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    .line 1123
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No activity"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1126
    :cond_0
    if-nez p4, :cond_2

    iget v0, p0, Landroid/support/v4/app/s;->n:I

    if-ne v0, p1, :cond_2

    .line 1152
    :cond_1
    :goto_0
    return-void

    .line 1130
    :cond_2
    iput p1, p0, Landroid/support/v4/app/s;->n:I

    .line 1131
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    move v6, v5

    move v7, v5

    .line 1133
    :goto_1
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 1134
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/app/Fragment;

    .line 1135
    if-eqz v1, :cond_5

    move-object v0, p0

    move v2, p1

    move v3, p2

    move v4, p3

    .line 1136
    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/s;->a(Landroid/support/v4/app/Fragment;IIIZ)V

    .line 1137
    iget-object v0, v1, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    if-eqz v0, :cond_5

    .line 1138
    iget-object v0, v1, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    invoke-virtual {v0}, Landroid/support/v4/app/ai;->a()Z

    move-result v0

    or-int/2addr v7, v0

    move v1, v7

    .line 1133
    :goto_2
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    move v7, v1

    goto :goto_1

    .line 1143
    :cond_3
    if-nez v7, :cond_4

    .line 1144
    invoke-virtual {p0}, Landroid/support/v4/app/s;->g()V

    .line 1147
    :cond_4
    iget-boolean v0, p0, Landroid/support/v4/app/s;->r:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    if-eqz v0, :cond_1

    iget v0, p0, Landroid/support/v4/app/s;->n:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 1148
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->j()V

    .line 1149
    iput-boolean v5, p0, Landroid/support/v4/app/s;->r:Z

    goto :goto_0

    :cond_5
    move v1, v7

    goto :goto_2
.end method

.method public a(ILandroid/support/v4/app/b;)V
    .locals 4

    .prologue
    .line 1430
    monitor-enter p0

    .line 1431
    :try_start_0
    iget-object v0, p0, Landroid/support/v4/app/s;->k:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 1432
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/s;->k:Ljava/util/ArrayList;

    .line 1434
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/s;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 1435
    if-ge p1, v0, :cond_2

    .line 1436
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Setting back stack index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1437
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/s;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1451
    :goto_0
    monitor-exit p0

    .line 1452
    return-void

    .line 1439
    :cond_2
    :goto_1
    if-ge v0, p1, :cond_5

    .line 1440
    iget-object v1, p0, Landroid/support/v4/app/s;->k:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1441
    iget-object v1, p0, Landroid/support/v4/app/s;->l:Ljava/util/ArrayList;

    if-nez v1, :cond_3

    .line 1442
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroid/support/v4/app/s;->l:Ljava/util/ArrayList;

    .line 1444
    :cond_3
    sget-boolean v1, Landroid/support/v4/app/s;->a:Z

    if-eqz v1, :cond_4

    const-string v1, "FragmentManager"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Adding available back stack index "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1445
    :cond_4
    iget-object v1, p0, Landroid/support/v4/app/s;->l:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1446
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1448
    :cond_5
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_6

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Adding back stack index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1449
    :cond_6
    iget-object v0, p0, Landroid/support/v4/app/s;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1451
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method a(IZ)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 1118
    invoke-virtual {p0, p1, v0, v0, p2}, Landroid/support/v4/app/s;->a(IIIZ)V

    .line 1119
    return-void
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 1960
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 1961
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 1962
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 1963
    if-eqz v0, :cond_0

    .line 1964
    invoke-virtual {v0, p1}, Landroid/support/v4/app/Fragment;->a(Landroid/content/res/Configuration;)V

    .line 1961
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1968
    :cond_1
    return-void
.end method

.method public a(Landroid/os/Bundle;Ljava/lang/String;Landroid/support/v4/app/Fragment;)V
    .locals 3

    .prologue
    .line 590
    iget v0, p3, Landroid/support/v4/app/Fragment;->o:I

    if-gez v0, :cond_0

    .line 591
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not currently in the FragmentManager"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Landroid/support/v4/app/s;->a(Ljava/lang/RuntimeException;)V

    .line 594
    :cond_0
    iget v0, p3, Landroid/support/v4/app/Fragment;->o:I

    invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 595
    return-void
.end method

.method a(Landroid/os/Parcelable;Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcelable;",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/Fragment;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v7, 0x0

    const/4 v2, 0x0

    .line 1787
    if-nez p1, :cond_1

    .line 1895
    :cond_0
    :goto_0
    return-void

    .line 1788
    :cond_1
    check-cast p1, Landroid/support/v4/app/FragmentManagerState;

    .line 1789
    iget-object v0, p1, Landroid/support/v4/app/FragmentManagerState;->a:[Landroid/support/v4/app/FragmentState;

    if-eqz v0, :cond_0

    .line 1793
    if-eqz p2, :cond_4

    move v1, v2

    .line 1794
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 1795
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 1796
    sget-boolean v3, Landroid/support/v4/app/s;->a:Z

    if-eqz v3, :cond_2

    const-string v3, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "restoreAllState: re-attaching retained "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1797
    :cond_2
    iget-object v3, p1, Landroid/support/v4/app/FragmentManagerState;->a:[Landroid/support/v4/app/FragmentState;

    iget v4, v0, Landroid/support/v4/app/Fragment;->o:I

    aget-object v3, v3, v4

    .line 1798
    iput-object v0, v3, Landroid/support/v4/app/FragmentState;->l:Landroid/support/v4/app/Fragment;

    .line 1799
    iput-object v7, v0, Landroid/support/v4/app/Fragment;->n:Landroid/util/SparseArray;

    .line 1800
    iput v2, v0, Landroid/support/v4/app/Fragment;->B:I

    .line 1801
    iput-boolean v2, v0, Landroid/support/v4/app/Fragment;->z:Z

    .line 1802
    iput-boolean v2, v0, Landroid/support/v4/app/Fragment;->v:Z

    .line 1803
    iput-object v7, v0, Landroid/support/v4/app/Fragment;->s:Landroid/support/v4/app/Fragment;

    .line 1804
    iget-object v4, v3, Landroid/support/v4/app/FragmentState;->k:Landroid/os/Bundle;

    if-eqz v4, :cond_3

    .line 1805
    iget-object v4, v3, Landroid/support/v4/app/FragmentState;->k:Landroid/os/Bundle;

    iget-object v5, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v5}, Landroid/support/v4/app/p;->a()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 1807
    iget-object v3, v3, Landroid/support/v4/app/FragmentState;->k:Landroid/os/Bundle;

    const-string v4, "android:view_state"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v3

    iput-object v3, v0, Landroid/support/v4/app/Fragment;->n:Landroid/util/SparseArray;

    .line 1794
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 1815
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->a:[Landroid/support/v4/app/FragmentState;

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    .line 1816
    iget-object v0, p0, Landroid/support/v4/app/s;->h:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    .line 1817
    iget-object v0, p0, Landroid/support/v4/app/s;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :cond_5
    move v0, v2

    .line 1819
    :goto_2
    iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->a:[Landroid/support/v4/app/FragmentState;

    array-length v1, v1

    if-ge v0, v1, :cond_a

    .line 1820
    iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->a:[Landroid/support/v4/app/FragmentState;

    aget-object v1, v1, v0

    .line 1821
    if-eqz v1, :cond_7

    .line 1822
    iget-object v3, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    iget-object v4, p0, Landroid/support/v4/app/s;->q:Landroid/support/v4/app/Fragment;

    invoke-virtual {v1, v3, v4}, Landroid/support/v4/app/FragmentState;->a(Landroid/support/v4/app/p;Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    .line 1823
    sget-boolean v4, Landroid/support/v4/app/s;->a:Z

    if-eqz v4, :cond_6

    const-string v4, "FragmentManager"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "restoreAllState: active #"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ": "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1824
    :cond_6
    iget-object v4, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1828
    iput-object v7, v1, Landroid/support/v4/app/FragmentState;->l:Landroid/support/v4/app/Fragment;

    .line 1819
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1830
    :cond_7
    iget-object v1, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1831
    iget-object v1, p0, Landroid/support/v4/app/s;->h:Ljava/util/ArrayList;

    if-nez v1, :cond_8

    .line 1832
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroid/support/v4/app/s;->h:Ljava/util/ArrayList;

    .line 1834
    :cond_8
    sget-boolean v1, Landroid/support/v4/app/s;->a:Z

    if-eqz v1, :cond_9

    const-string v1, "FragmentManager"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "restoreAllState: avail #"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1835
    :cond_9
    iget-object v1, p0, Landroid/support/v4/app/s;->h:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 1840
    :cond_a
    if-eqz p2, :cond_d

    move v3, v2

    .line 1841
    :goto_4
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_d

    .line 1842
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 1843
    iget v1, v0, Landroid/support/v4/app/Fragment;->t:I

    if-ltz v1, :cond_b

    .line 1844
    iget v1, v0, Landroid/support/v4/app/Fragment;->t:I

    iget-object v4, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_c

    .line 1845
    iget-object v1, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    iget v4, v0, Landroid/support/v4/app/Fragment;->t:I

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/app/Fragment;

    iput-object v1, v0, Landroid/support/v4/app/Fragment;->s:Landroid/support/v4/app/Fragment;

    .line 1841
    :cond_b
    :goto_5
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_4

    .line 1847
    :cond_c
    const-string v1, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Re-attaching retained fragment "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " target no longer exists: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, v0, Landroid/support/v4/app/Fragment;->t:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1849
    iput-object v7, v0, Landroid/support/v4/app/Fragment;->s:Landroid/support/v4/app/Fragment;

    goto :goto_5

    .line 1856
    :cond_d
    iget-object v0, p1, Landroid/support/v4/app/FragmentManagerState;->b:[I

    if-eqz v0, :cond_11

    .line 1857
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->b:[I

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    move v1, v2

    .line 1858
    :goto_6
    iget-object v0, p1, Landroid/support/v4/app/FragmentManagerState;->b:[I

    array-length v0, v0

    if-ge v1, v0, :cond_12

    .line 1859
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    iget-object v3, p1, Landroid/support/v4/app/FragmentManagerState;->b:[I

    aget v3, v3, v1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 1860
    if-nez v0, :cond_e

    .line 1861
    new-instance v3, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "No instantiated fragment for index #"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v5, p1, Landroid/support/v4/app/FragmentManagerState;->b:[I

    aget v5, v5, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v3}, Landroid/support/v4/app/s;->a(Ljava/lang/RuntimeException;)V

    .line 1864
    :cond_e
    const/4 v3, 0x1

    iput-boolean v3, v0, Landroid/support/v4/app/Fragment;->v:Z

    .line 1865
    sget-boolean v3, Landroid/support/v4/app/s;->a:Z

    if-eqz v3, :cond_f

    const-string v3, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "restoreAllState: added #"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ": "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1866
    :cond_f
    iget-object v3, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    .line 1867
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already added!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1869
    :cond_10
    iget-object v3, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1858
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_6

    .line 1872
    :cond_11
    iput-object v7, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    .line 1876
    :cond_12
    iget-object v0, p1, Landroid/support/v4/app/FragmentManagerState;->c:[Landroid/support/v4/app/BackStackState;

    if-eqz v0, :cond_15

    .line 1877
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->c:[Landroid/support/v4/app/BackStackState;

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    move v0, v2

    .line 1878
    :goto_7
    iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->c:[Landroid/support/v4/app/BackStackState;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 1879
    iget-object v1, p1, Landroid/support/v4/app/FragmentManagerState;->c:[Landroid/support/v4/app/BackStackState;

    aget-object v1, v1, v0

    invoke-virtual {v1, p0}, Landroid/support/v4/app/BackStackState;->a(Landroid/support/v4/app/s;)Landroid/support/v4/app/b;

    move-result-object v1

    .line 1880
    sget-boolean v3, Landroid/support/v4/app/s;->a:Z

    if-eqz v3, :cond_13

    .line 1881
    const-string v3, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "restoreAllState: back stack #"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " (index "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, v1, Landroid/support/v4/app/b;->o:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "): "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1883
    new-instance v3, Landroid/support/v4/c/b;

    const-string v4, "FragmentManager"

    invoke-direct {v3, v4}, Landroid/support/v4/c/b;-><init>(Ljava/lang/String;)V

    .line 1884
    new-instance v4, Ljava/io/PrintWriter;

    invoke-direct {v4, v3}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 1885
    const-string v3, "  "

    invoke-virtual {v1, v3, v4, v2}, Landroid/support/v4/app/b;->a(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 1887
    :cond_13
    iget-object v3, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1888
    iget v3, v1, Landroid/support/v4/app/b;->o:I

    if-ltz v3, :cond_14

    .line 1889
    iget v3, v1, Landroid/support/v4/app/b;->o:I

    invoke-virtual {p0, v3, v1}, Landroid/support/v4/app/s;->a(ILandroid/support/v4/app/b;)V

    .line 1878
    :cond_14
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    .line 1893
    :cond_15
    iput-object v7, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    goto/16 :goto_0
.end method

.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 846
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->U:Z

    if-eqz v0, :cond_0

    .line 847
    iget-boolean v0, p0, Landroid/support/v4/app/s;->e:Z

    if-eqz v0, :cond_1

    .line 849
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/s;->v:Z

    .line 855
    :cond_0
    :goto_0
    return-void

    .line 852
    :cond_1
    iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->U:Z

    .line 853
    iget v2, p0, Landroid/support/v4/app/s;->n:I

    move-object v0, p0

    move-object v1, p1

    move v4, v3

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/s;->a(Landroid/support/v4/app/Fragment;IIIZ)V

    goto :goto_0
.end method

.method public a(Landroid/support/v4/app/Fragment;II)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v5, 0x0

    .line 1223
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "remove: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " nesting="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/support/v4/app/Fragment;->B:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1224
    :cond_0
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->i()Z

    move-result v0

    if-nez v0, :cond_5

    move v0, v1

    .line 1225
    :goto_0
    iget-boolean v2, p1, Landroid/support/v4/app/Fragment;->K:Z

    if-eqz v2, :cond_1

    if-eqz v0, :cond_4

    .line 1226
    :cond_1
    iget-object v2, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    if-eqz v2, :cond_2

    .line 1227
    iget-object v2, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1229
    :cond_2
    iget-boolean v2, p1, Landroid/support/v4/app/Fragment;->N:Z

    if-eqz v2, :cond_3

    iget-boolean v2, p1, Landroid/support/v4/app/Fragment;->O:Z

    if-eqz v2, :cond_3

    .line 1230
    iput-boolean v1, p0, Landroid/support/v4/app/s;->r:Z

    .line 1232
    :cond_3
    iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->v:Z

    .line 1233
    iput-boolean v1, p1, Landroid/support/v4/app/Fragment;->w:Z

    .line 1234
    if-eqz v0, :cond_6

    move v2, v5

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/s;->a(Landroid/support/v4/app/Fragment;IIIZ)V

    .line 1237
    :cond_4
    return-void

    :cond_5
    move v0, v5

    .line 1224
    goto :goto_0

    :cond_6
    move v2, v1

    .line 1234
    goto :goto_1
.end method

.method a(Landroid/support/v4/app/Fragment;IIIZ)V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v6, 0x3

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v7, 0x0

    .line 860
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->v:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->K:Z

    if-eqz v0, :cond_1

    :cond_0
    if-le p2, v5, :cond_1

    move p2, v5

    .line 863
    :cond_1
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->w:Z

    if-eqz v0, :cond_2

    iget v0, p1, Landroid/support/v4/app/Fragment;->j:I

    if-le p2, v0, :cond_2

    .line 865
    iget p2, p1, Landroid/support/v4/app/Fragment;->j:I

    .line 869
    :cond_2
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->U:Z

    if-eqz v0, :cond_3

    iget v0, p1, Landroid/support/v4/app/Fragment;->j:I

    if-ge v0, v8, :cond_3

    if-le p2, v6, :cond_3

    move p2, v6

    .line 872
    :cond_3
    iget v0, p1, Landroid/support/v4/app/Fragment;->j:I

    if-ge v0, p2, :cond_1d

    .line 876
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->y:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->z:Z

    if-nez v0, :cond_4

    .line 1111
    :goto_0
    return-void

    .line 879
    :cond_4
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->k:Landroid/view/View;

    if-eqz v0, :cond_5

    .line 884
    iput-object v7, p1, Landroid/support/v4/app/Fragment;->k:Landroid/view/View;

    .line 885
    iget v2, p1, Landroid/support/v4/app/Fragment;->l:I

    move-object v0, p0

    move-object v1, p1

    move v4, v3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/s;->a(Landroid/support/v4/app/Fragment;IIIZ)V

    .line 887
    :cond_5
    iget v0, p1, Landroid/support/v4/app/Fragment;->j:I

    packed-switch v0, :pswitch_data_0

    .line 1110
    :cond_6
    :goto_1
    iput p2, p1, Landroid/support/v4/app/Fragment;->j:I

    goto :goto_0

    .line 889
    :pswitch_0
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_7

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "moveto CREATED: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 890
    :cond_7
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    if-eqz v0, :cond_9

    .line 891
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    const-string v1, "android:view_state"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v0

    iput-object v0, p1, Landroid/support/v4/app/Fragment;->n:Landroid/util/SparseArray;

    .line 893
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    const-string v1, "android:target_state"

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/s;->a(Landroid/os/Bundle;Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    iput-object v0, p1, Landroid/support/v4/app/Fragment;->s:Landroid/support/v4/app/Fragment;

    .line 895
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->s:Landroid/support/v4/app/Fragment;

    if-eqz v0, :cond_8

    .line 896
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    const-string v1, "android:target_req_state"

    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p1, Landroid/support/v4/app/Fragment;->u:I

    .line 899
    :cond_8
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    const-string v1, "android:user_visible_hint"

    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p1, Landroid/support/v4/app/Fragment;->V:Z

    .line 901
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->V:Z

    if-nez v0, :cond_9

    .line 902
    iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->U:Z

    .line 903
    if-le p2, v6, :cond_9

    move p2, v6

    .line 908
    :cond_9
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    iput-object v0, p1, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    .line 909
    iget-object v0, p0, Landroid/support/v4/app/s;->q:Landroid/support/v4/app/Fragment;

    iput-object v0, p1, Landroid/support/v4/app/Fragment;->F:Landroid/support/v4/app/Fragment;

    .line 910
    iget-object v0, p0, Landroid/support/v4/app/s;->q:Landroid/support/v4/app/Fragment;

    if-eqz v0, :cond_a

    iget-object v0, p0, Landroid/support/v4/app/s;->q:Landroid/support/v4/app/Fragment;

    iget-object v0, v0, Landroid/support/v4/app/Fragment;->E:Landroid/support/v4/app/s;

    :goto_2
    iput-object v0, p1, Landroid/support/v4/app/Fragment;->C:Landroid/support/v4/app/s;

    .line 912
    iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->P:Z

    .line 913
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/v4/app/Fragment;->a(Landroid/content/Context;)V

    .line 914
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->P:Z

    if-nez v0, :cond_b

    .line 915
    new-instance v0, Landroid/support/v4/app/ba;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onAttach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/ba;-><init>(Ljava/lang/String;)V

    throw v0

    .line 910
    :cond_a
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->g()Landroid/support/v4/app/s;

    move-result-object v0

    goto :goto_2

    .line 918
    :cond_b
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->F:Landroid/support/v4/app/Fragment;

    if-nez v0, :cond_1a

    .line 919
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/p;->a(Landroid/support/v4/app/Fragment;)V

    .line 924
    :goto_3
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->M:Z

    if-nez v0, :cond_c

    .line 925
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/support/v4/app/Fragment;->i(Landroid/os/Bundle;)V

    .line 927
    :cond_c
    iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->M:Z

    .line 928
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->y:Z

    if-eqz v0, :cond_e

    .line 932
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/support/v4/app/Fragment;->b(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p1, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    invoke-virtual {p1, v0, v7, v1}, Landroid/support/v4/app/Fragment;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    .line 934
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    if-eqz v0, :cond_1b

    .line 935
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    iput-object v0, p1, Landroid/support/v4/app/Fragment;->T:Landroid/view/View;

    .line 936
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    invoke-static {v0}, Landroid/support/v4/app/ak;->a(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v0

    iput-object v0, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    .line 937
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->J:Z

    if-eqz v0, :cond_d

    iget-object v0, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 938
    :cond_d
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    iget-object v1, p1, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/Fragment;->a(Landroid/view/View;Landroid/os/Bundle;)V

    .line 944
    :cond_e
    :goto_4
    :pswitch_1
    if-le p2, v5, :cond_16

    .line 945
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_f

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "moveto ACTIVITY_CREATED: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 946
    :cond_f
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->y:Z

    if-nez v0, :cond_14

    .line 948
    iget v0, p1, Landroid/support/v4/app/Fragment;->H:I

    if-eqz v0, :cond_30

    .line 949
    iget-object v0, p0, Landroid/support/v4/app/s;->p:Landroid/support/v4/app/o;

    iget v1, p1, Landroid/support/v4/app/Fragment;->H:I

    invoke-interface {v0, v1}, Landroid/support/v4/app/o;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 950
    if-nez v0, :cond_10

    iget-boolean v1, p1, Landroid/support/v4/app/Fragment;->A:Z

    if-nez v1, :cond_10

    .line 951
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No view found for id 0x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/support/v4/app/Fragment;->H:I

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->o()Landroid/content/res/Resources;

    move-result-object v3

    iget v4, p1, Landroid/support/v4/app/Fragment;->H:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ") for fragment "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1}, Landroid/support/v4/app/s;->a(Ljava/lang/RuntimeException;)V

    .line 958
    :cond_10
    :goto_5
    iput-object v0, p1, Landroid/support/v4/app/Fragment;->R:Landroid/view/ViewGroup;

    .line 959
    iget-object v1, p1, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    invoke-virtual {p1, v1}, Landroid/support/v4/app/Fragment;->b(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v1

    iget-object v2, p1, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    invoke-virtual {p1, v1, v0, v2}, Landroid/support/v4/app/Fragment;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v1

    iput-object v1, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    .line 961
    iget-object v1, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    if-eqz v1, :cond_1c

    .line 962
    iget-object v1, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    iput-object v1, p1, Landroid/support/v4/app/Fragment;->T:Landroid/view/View;

    .line 963
    iget-object v1, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    invoke-static {v1}, Landroid/support/v4/app/ak;->a(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v1

    iput-object v1, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    .line 964
    if-eqz v0, :cond_12

    .line 965
    invoke-virtual {p0, p1, p3, v5, p4}, Landroid/support/v4/app/s;->a(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;

    move-result-object v1

    .line 967
    if-eqz v1, :cond_11

    .line 968
    iget-object v2, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 970
    :cond_11
    iget-object v1, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 972
    :cond_12
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->J:Z

    if-eqz v0, :cond_13

    iget-object v0, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 973
    :cond_13
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    iget-object v1, p1, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/Fragment;->a(Landroid/view/View;Landroid/os/Bundle;)V

    .line 979
    :cond_14
    :goto_6
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/support/v4/app/Fragment;->j(Landroid/os/Bundle;)V

    .line 980
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    if-eqz v0, :cond_15

    .line 981
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/support/v4/app/Fragment;->f(Landroid/os/Bundle;)V

    .line 983
    :cond_15
    iput-object v7, p1, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    .line 987
    :cond_16
    :pswitch_2
    if-le p2, v6, :cond_18

    .line 988
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_17

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "moveto STARTED: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 989
    :cond_17
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->G()V

    .line 992
    :cond_18
    :pswitch_3
    if-le p2, v8, :cond_6

    .line 993
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_19

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "moveto RESUMED: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 994
    :cond_19
    iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->x:Z

    .line 995
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->H()V

    .line 996
    iput-object v7, p1, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    .line 997
    iput-object v7, p1, Landroid/support/v4/app/Fragment;->n:Landroid/util/SparseArray;

    goto/16 :goto_1

    .line 921
    :cond_1a
    iget-object v0, p0, Landroid/support/v4/app/s;->q:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/Fragment;->a(Landroid/support/v4/app/Fragment;)V

    goto/16 :goto_3

    .line 940
    :cond_1b
    iput-object v7, p1, Landroid/support/v4/app/Fragment;->T:Landroid/view/View;

    goto/16 :goto_4

    .line 975
    :cond_1c
    iput-object v7, p1, Landroid/support/v4/app/Fragment;->T:Landroid/view/View;

    goto :goto_6

    .line 1000
    :cond_1d
    iget v0, p1, Landroid/support/v4/app/Fragment;->j:I

    if-le v0, p2, :cond_6

    .line 1001
    iget v0, p1, Landroid/support/v4/app/Fragment;->j:I

    packed-switch v0, :pswitch_data_1

    goto/16 :goto_1

    .line 1064
    :cond_1e
    :goto_7
    :pswitch_4
    if-ge p2, v5, :cond_6

    .line 1065
    iget-boolean v0, p0, Landroid/support/v4/app/s;->t:Z

    if-eqz v0, :cond_1f

    .line 1066
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->k:Landroid/view/View;

    if-eqz v0, :cond_1f

    .line 1073
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->k:Landroid/view/View;

    .line 1074
    iput-object v7, p1, Landroid/support/v4/app/Fragment;->k:Landroid/view/View;

    .line 1075
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 1078
    :cond_1f
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->k:Landroid/view/View;

    if-eqz v0, :cond_2a

    .line 1083
    iput p2, p1, Landroid/support/v4/app/Fragment;->l:I

    move p2, v5

    .line 1084
    goto/16 :goto_1

    .line 1003
    :pswitch_5
    const/4 v0, 0x5

    if-ge p2, v0, :cond_21

    .line 1004
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_20

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "movefrom RESUMED: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1005
    :cond_20
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->J()V

    .line 1006
    iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->x:Z

    .line 1009
    :cond_21
    :pswitch_6
    if-ge p2, v8, :cond_23

    .line 1010
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_22

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "movefrom STARTED: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1011
    :cond_22
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->K()V

    .line 1014
    :cond_23
    :pswitch_7
    if-ge p2, v6, :cond_25

    .line 1015
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_24

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "movefrom STOPPED: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1016
    :cond_24
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->L()V

    .line 1019
    :cond_25
    :pswitch_8
    const/4 v0, 0x2

    if-ge p2, v0, :cond_1e

    .line 1020
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_26

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "movefrom ACTIVITY_CREATED: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1021
    :cond_26
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    if-eqz v0, :cond_27

    .line 1024
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->f()Z

    move-result v0

    if-nez v0, :cond_27

    iget-object v0, p1, Landroid/support/v4/app/Fragment;->n:Landroid/util/SparseArray;

    if-nez v0, :cond_27

    .line 1025
    invoke-virtual {p0, p1}, Landroid/support/v4/app/s;->e(Landroid/support/v4/app/Fragment;)V

    .line 1028
    :cond_27
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->M()V

    .line 1029
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    if-eqz v0, :cond_29

    iget-object v0, p1, Landroid/support/v4/app/Fragment;->R:Landroid/view/ViewGroup;

    if-eqz v0, :cond_29

    .line 1031
    iget v0, p0, Landroid/support/v4/app/s;->n:I

    if-lez v0, :cond_2f

    iget-boolean v0, p0, Landroid/support/v4/app/s;->t:Z

    if-nez v0, :cond_2f

    .line 1032
    invoke-virtual {p0, p1, p3, v3, p4}, Landroid/support/v4/app/s;->a(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;

    move-result-object v0

    .line 1035
    :goto_8
    if-eqz v0, :cond_28

    .line 1037
    iget-object v1, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    iput-object v1, p1, Landroid/support/v4/app/Fragment;->k:Landroid/view/View;

    .line 1038
    iput p2, p1, Landroid/support/v4/app/Fragment;->l:I

    .line 1039
    new-instance v1, Landroid/support/v4/app/x;

    invoke-direct {v1, p0, p1}, Landroid/support/v4/app/x;-><init>(Landroid/support/v4/app/s;Landroid/support/v4/app/Fragment;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1055
    iget-object v1, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1057
    :cond_28
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->R:Landroid/view/ViewGroup;

    iget-object v1, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1059
    :cond_29
    iput-object v7, p1, Landroid/support/v4/app/Fragment;->R:Landroid/view/ViewGroup;

    .line 1060
    iput-object v7, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    .line 1061
    iput-object v7, p1, Landroid/support/v4/app/Fragment;->T:Landroid/view/View;

    goto/16 :goto_7

    .line 1086
    :cond_2a
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_2b

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "movefrom CREATED: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1087
    :cond_2b
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->M:Z

    if-nez v0, :cond_2c

    .line 1088
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->N()V

    .line 1091
    :cond_2c
    iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->P:Z

    .line 1092
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->e()V

    .line 1093
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->P:Z

    if-nez v0, :cond_2d

    .line 1094
    new-instance v0, Landroid/support/v4/app/ba;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not call through to super.onDetach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/ba;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1097
    :cond_2d
    if-nez p5, :cond_6

    .line 1098
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->M:Z

    if-nez v0, :cond_2e

    .line 1099
    invoke-virtual {p0, p1}, Landroid/support/v4/app/s;->d(Landroid/support/v4/app/Fragment;)V

    goto/16 :goto_1

    .line 1101
    :cond_2e
    iput-object v7, p1, Landroid/support/v4/app/Fragment;->D:Landroid/support/v4/app/p;

    .line 1102
    iput-object v7, p1, Landroid/support/v4/app/Fragment;->C:Landroid/support/v4/app/s;

    goto/16 :goto_1

    :cond_2f
    move-object v0, v7

    goto/16 :goto_8

    :cond_30
    move-object v0, v7

    goto/16 :goto_5

    .line 887
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_3
    .end packed-switch

    .line 1001
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_4
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method public a(Landroid/support/v4/app/Fragment;Z)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 1201
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 1202
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    .line 1204
    :cond_0
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "add: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1205
    :cond_1
    invoke-virtual {p0, p1}, Landroid/support/v4/app/s;->c(Landroid/support/v4/app/Fragment;)V

    .line 1206
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->K:Z

    if-nez v0, :cond_4

    .line 1207
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1208
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment already added: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1210
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1211
    iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->v:Z

    .line 1212
    const/4 v0, 0x0

    iput-boolean v0, p1, Landroid/support/v4/app/Fragment;->w:Z

    .line 1213
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->N:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->O:Z

    if-eqz v0, :cond_3

    .line 1214
    iput-boolean v3, p0, Landroid/support/v4/app/s;->r:Z

    .line 1216
    :cond_3
    if-eqz p2, :cond_4

    .line 1217
    invoke-virtual {p0, p1}, Landroid/support/v4/app/s;->b(Landroid/support/v4/app/Fragment;)V

    .line 1220
    :cond_4
    return-void
.end method

.method public a(Landroid/support/v4/app/p;Landroid/support/v4/app/o;Landroid/support/v4/app/Fragment;)V
    .locals 2

    .prologue
    .line 1899
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already attached"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1900
    :cond_0
    iput-object p1, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    .line 1901
    iput-object p2, p0, Landroid/support/v4/app/s;->p:Landroid/support/v4/app/o;

    .line 1902
    iput-object p3, p0, Landroid/support/v4/app/s;->q:Landroid/support/v4/app/Fragment;

    .line 1903
    return-void
.end method

.method public a(Ljava/lang/Runnable;Z)V
    .locals 2

    .prologue
    .line 1391
    if-nez p2, :cond_0

    .line 1392
    invoke-direct {p0}, Landroid/support/v4/app/s;->w()V

    .line 1394
    :cond_0
    monitor-enter p0

    .line 1395
    :try_start_0
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    if-nez v0, :cond_1

    .line 1396
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "FragmentHost has been destroyed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1406
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1398
    :cond_1
    :try_start_1
    iget-object v0, p0, Landroid/support/v4/app/s;->c:Ljava/util/ArrayList;

    if-nez v0, :cond_2

    .line 1399
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/s;->c:Ljava/util/ArrayList;

    .line 1401
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1402
    iget-object v0, p0, Landroid/support/v4/app/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 1403
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->b()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/app/s;->y:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1404
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->b()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/app/s;->y:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1406
    :cond_3
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1407
    return-void
.end method

.method public a(Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 527
    new-instance v0, Landroid/support/v4/app/v;

    invoke-direct {v0, p0, p1, p2}, Landroid/support/v4/app/v;-><init>(Landroid/support/v4/app/s;Ljava/lang/String;I)V

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/s;->a(Ljava/lang/Runnable;Z)V

    .line 532
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 645
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "    "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 648
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 649
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 650
    if-lez v4, :cond_1

    .line 651
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Active Fragments in "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 652
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 653
    const-string v0, ":"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    .line 654
    :goto_0
    if-ge v2, v4, :cond_1

    .line 655
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 656
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 657
    const-string v5, ": "

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 658
    if-eqz v0, :cond_0

    .line 659
    invoke-virtual {v0, v3, p2, p3, p4}, Landroid/support/v4/app/Fragment;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 654
    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 665
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 666
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 667
    if-lez v4, :cond_2

    .line 668
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Added Fragments:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    .line 669
    :goto_1
    if-ge v2, v4, :cond_2

    .line 670
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 671
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 672
    const-string v5, ": "

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 669
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 677
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/s;->j:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 678
    iget-object v0, p0, Landroid/support/v4/app/s;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 679
    if-lez v4, :cond_3

    .line 680
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Fragments Created Menus:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    .line 681
    :goto_2
    if-ge v2, v4, :cond_3

    .line 682
    iget-object v0, p0, Landroid/support/v4/app/s;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 683
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 684
    const-string v5, ": "

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 681
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    .line 689
    :cond_3
    iget-object v0, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    .line 690
    iget-object v0, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 691
    if-lez v4, :cond_4

    .line 692
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Back Stack:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    .line 693
    :goto_3
    if-ge v2, v4, :cond_4

    .line 694
    iget-object v0, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/b;

    .line 695
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 696
    const-string v5, ": "

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/support/v4/app/b;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 697
    invoke-virtual {v0, v3, p2, p3, p4}, Landroid/support/v4/app/b;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 693
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_3

    .line 702
    :cond_4
    monitor-enter p0

    .line 703
    :try_start_0
    iget-object v0, p0, Landroid/support/v4/app/s;->k:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    .line 704
    iget-object v0, p0, Landroid/support/v4/app/s;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 705
    if-lez v3, :cond_5

    .line 706
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Back Stack Indices:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    .line 707
    :goto_4
    if-ge v2, v3, :cond_5

    .line 708
    iget-object v0, p0, Landroid/support/v4/app/s;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/b;

    .line 709
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v4, "  #"

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    .line 710
    const-string v4, ": "

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 707
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_4

    .line 715
    :cond_5
    iget-object v0, p0, Landroid/support/v4/app/s;->l:Ljava/util/ArrayList;

    if-eqz v0, :cond_6

    iget-object v0, p0, Landroid/support/v4/app/s;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 716
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAvailBackStackIndices: "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 717
    iget-object v0, p0, Landroid/support/v4/app/s;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 719
    :cond_6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 721
    iget-object v0, p0, Landroid/support/v4/app/s;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_7

    .line 722
    iget-object v0, p0, Landroid/support/v4/app/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 723
    if-lez v2, :cond_7

    .line 724
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Pending Actions:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 725
    :goto_5
    if-ge v1, v2, :cond_7

    .line 726
    iget-object v0, p0, Landroid/support/v4/app/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 727
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 728
    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 725
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_5

    .line 719
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 733
    :cond_7
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "FragmentManager misc state:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 734
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mActivity="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 735
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mContainer="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/s;->p:Landroid/support/v4/app/o;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 736
    iget-object v0, p0, Landroid/support/v4/app/s;->q:Landroid/support/v4/app/Fragment;

    if-eqz v0, :cond_8

    .line 737
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mParent="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/app/s;->q:Landroid/support/v4/app/Fragment;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 739
    :cond_8
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mCurState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v4/app/s;->n:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    .line 740
    const-string v0, " mStateSaved="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/s;->s:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    .line 741
    const-string v0, " mDestroyed="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v4/app/s;->t:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 742
    iget-boolean v0, p0, Landroid/support/v4/app/s;->r:Z

    if-eqz v0, :cond_9

    .line 743
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mNeedMenuInvalidate="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 744
    iget-boolean v0, p0, Landroid/support/v4/app/s;->r:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 746
    :cond_9
    iget-object v0, p0, Landroid/support/v4/app/s;->u:Ljava/lang/String;

    if-eqz v0, :cond_a

    .line 747
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mNoTransactionsBecause="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 748
    iget-object v0, p0, Landroid/support/v4/app/s;->u:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 750
    :cond_a
    iget-object v0, p0, Landroid/support/v4/app/s;->h:Ljava/util/ArrayList;

    if-eqz v0, :cond_b

    iget-object v0, p0, Landroid/support/v4/app/s;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_b

    .line 751
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  mAvailIndices: "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 752
    iget-object v0, p0, Landroid/support/v4/app/s;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 754
    :cond_b
    return-void
.end method

.method a(Landroid/os/Handler;Ljava/lang/String;II)Z
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 1538
    iget-object v0, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 1597
    :cond_0
    :goto_0
    return v3

    .line 1541
    :cond_1
    if-nez p2, :cond_2

    if-gez p3, :cond_2

    and-int/lit8 v0, p4, 0x1

    if-nez v0, :cond_2

    .line 1542
    iget-object v0, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 1543
    if-ltz v0, :cond_0

    .line 1546
    iget-object v1, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/b;

    .line 1547
    invoke-virtual {v0, v2}, Landroid/support/v4/app/b;->b(Z)V

    .line 1548
    invoke-virtual {p0}, Landroid/support/v4/app/s;->i()V

    :goto_1
    move v3, v2

    .line 1597
    goto :goto_0

    .line 1550
    :cond_2
    const/4 v0, -0x1

    .line 1551
    if-nez p2, :cond_3

    if-ltz p3, :cond_a

    .line 1554
    :cond_3
    iget-object v0, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    .line 1555
    :goto_2
    if-ltz v1, :cond_4

    .line 1556
    iget-object v0, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/b;

    .line 1557
    if-eqz p2, :cond_7

    invoke-virtual {v0}, Landroid/support/v4/app/b;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 1565
    :cond_4
    if-ltz v1, :cond_0

    .line 1568
    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_9

    .line 1569
    add-int/lit8 v1, v1, -0x1

    .line 1571
    :goto_3
    if-ltz v1, :cond_9

    .line 1572
    iget-object v0, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/b;

    .line 1573
    if-eqz p2, :cond_5

    invoke-virtual {v0}, Landroid/support/v4/app/b;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    if-ltz p3, :cond_9

    iget v0, v0, Landroid/support/v4/app/b;->o:I

    if-ne p3, v0, :cond_9

    .line 1575
    :cond_6
    add-int/lit8 v1, v1, -0x1

    .line 1576
    goto :goto_3

    .line 1560
    :cond_7
    if-ltz p3, :cond_8

    iget v0, v0, Landroid/support/v4/app/b;->o:I

    if-eq p3, v0, :cond_4

    .line 1563
    :cond_8
    add-int/lit8 v1, v1, -0x1

    .line 1564
    goto :goto_2

    :cond_9
    move v0, v1

    .line 1582
    :cond_a
    iget-object v1, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-eq v0, v1, :cond_0

    .line 1585
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1587
    iget-object v1, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_4
    if-le v1, v0, :cond_b

    .line 1588
    iget-object v4, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1587
    add-int/lit8 v1, v1, -0x1

    goto :goto_4

    .line 1590
    :cond_b
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v6, v0, -0x1

    move v4, v3

    .line 1591
    :goto_5
    if-gt v4, v6, :cond_e

    .line 1592
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_c

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Popping back stack state: "

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1593
    :cond_c
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/b;

    if-ne v4, v6, :cond_d

    move v1, v2

    :goto_6
    invoke-virtual {v0, v1}, Landroid/support/v4/app/b;->b(Z)V

    .line 1591
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_5

    :cond_d
    move v1, v3

    .line 1593
    goto :goto_6

    .line 1595
    :cond_e
    invoke-virtual {p0}, Landroid/support/v4/app/s;->i()V

    goto/16 :goto_1
.end method

.method public a(Landroid/view/Menu;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 2014
    .line 2015
    iget-object v1, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    move v1, v0

    move v2, v0

    .line 2016
    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 2017
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 2018
    if-eqz v0, :cond_0

    .line 2019
    invoke-virtual {v0, p1}, Landroid/support/v4/app/Fragment;->c(Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2020
    const/4 v2, 0x1

    .line 2016
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    move v2, v0

    .line 2025
    :cond_2
    return v2
.end method

.method public a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 1982
    .line 1983
    const/4 v1, 0x0

    .line 1984
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    move v3, v4

    move v2, v4

    .line 1985
    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_3

    .line 1986
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 1987
    if-eqz v0, :cond_1

    .line 1988
    invoke-virtual {v0, p1, p2}, Landroid/support/v4/app/Fragment;->b(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 1989
    const/4 v2, 0x1

    .line 1990
    if-nez v1, :cond_0

    .line 1991
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1993
    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    move v0, v2

    .line 1985
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move v2, v0

    goto :goto_0

    :cond_2
    move v2, v4

    .line 1999
    :cond_3
    iget-object v0, p0, Landroid/support/v4/app/s;->j:Ljava/util/ArrayList;

    if-eqz v0, :cond_6

    .line 2000
    :goto_1
    iget-object v0, p0, Landroid/support/v4/app/s;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_6

    .line 2001
    iget-object v0, p0, Landroid/support/v4/app/s;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 2002
    if-eqz v1, :cond_4

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 2003
    :cond_4
    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->E()V

    .line 2000
    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 2008
    :cond_6
    iput-object v1, p0, Landroid/support/v4/app/s;->j:Ljava/util/ArrayList;

    .line 2010
    return v2
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 2029
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    move v1, v2

    .line 2030
    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 2031
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 2032
    if-eqz v0, :cond_1

    .line 2033
    invoke-virtual {v0, p1}, Landroid/support/v4/app/Fragment;->c(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2034
    const/4 v2, 0x1

    .line 2039
    :cond_0
    return v2

    .line 2030
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public b(I)I
    .locals 2

    .prologue
    .line 447
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 456
    :cond_0
    return p1

    .line 451
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 452
    if-eqz v0, :cond_2

    .line 453
    invoke-virtual {v0, p1}, Landroid/support/v4/app/Fragment;->b(I)I

    move-result p1

    goto :goto_0
.end method

.method b(Landroid/support/v4/app/Fragment;)V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 1114
    iget v2, p0, Landroid/support/v4/app/s;->n:I

    move-object v0, p0

    move-object v1, p1

    move v4, v3

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/s;->a(Landroid/support/v4/app/Fragment;IIIZ)V

    .line 1115
    return-void
.end method

.method public b(Landroid/support/v4/app/Fragment;II)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 1240
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "hide: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1241
    :cond_0
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->J:Z

    if-nez v0, :cond_4

    .line 1242
    iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->J:Z

    .line 1243
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 1244
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, p3}, Landroid/support/v4/app/s;->a(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;

    move-result-object v0

    .line 1246
    if-eqz v0, :cond_1

    .line 1247
    iget-object v1, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1249
    :cond_1
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1251
    :cond_2
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->v:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->N:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->O:Z

    if-eqz v0, :cond_3

    .line 1252
    iput-boolean v3, p0, Landroid/support/v4/app/s;->r:Z

    .line 1254
    :cond_3
    invoke-virtual {p1, v3}, Landroid/support/v4/app/Fragment;->c(Z)V

    .line 1256
    :cond_4
    return-void
.end method

.method b(Landroid/support/v4/app/b;)V
    .locals 1

    .prologue
    .line 1530
    iget-object v0, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 1531
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    .line 1533
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1534
    invoke-virtual {p0}, Landroid/support/v4/app/s;->i()V

    .line 1535
    return-void
.end method

.method public b(Landroid/view/Menu;)V
    .locals 2

    .prologue
    .line 2057
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 2058
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 2059
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 2060
    if-eqz v0, :cond_0

    .line 2061
    invoke-virtual {v0, p1}, Landroid/support/v4/app/Fragment;->d(Landroid/view/Menu;)V

    .line 2058
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 2065
    :cond_1
    return-void
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 506
    invoke-virtual {p0}, Landroid/support/v4/app/s;->h()Z

    move-result v0

    return v0
.end method

.method public b(Landroid/view/MenuItem;)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 2043
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    move v1, v2

    .line 2044
    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 2045
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 2046
    if-eqz v0, :cond_1

    .line 2047
    invoke-virtual {v0, p1}, Landroid/support/v4/app/Fragment;->d(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2048
    const/4 v2, 0x1

    .line 2053
    :cond_0
    return v2

    .line 2044
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public c(I)Landroid/support/v4/app/Fragment;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 466
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    move-object v0, v1

    .line 475
    :goto_0
    return-object v0

    .line 470
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 471
    if-eqz v0, :cond_1

    iget v3, v0, Landroid/support/v4/app/Fragment;->p:I

    if-lt v3, p1, :cond_1

    .line 472
    invoke-virtual {v0, p1}, Landroid/support/v4/app/Fragment;->c(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    .line 475
    goto :goto_0
.end method

.method c(Landroid/support/v4/app/Fragment;)V
    .locals 3

    .prologue
    .line 1166
    iget v0, p1, Landroid/support/v4/app/Fragment;->o:I

    if-ltz v0, :cond_1

    .line 1182
    :cond_0
    :goto_0
    return-void

    .line 1170
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/s;->h:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v4/app/s;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_4

    .line 1171
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    .line 1172
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    .line 1174
    :cond_3
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Landroid/support/v4/app/s;->q:Landroid/support/v4/app/Fragment;

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/Fragment;->a(ILandroid/support/v4/app/Fragment;)V

    .line 1175
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1181
    :goto_1
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Allocated fragment index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 1178
    :cond_4
    iget-object v0, p0, Landroid/support/v4/app/s;->h:Ljava/util/ArrayList;

    iget-object v1, p0, Landroid/support/v4/app/s;->h:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Landroid/support/v4/app/s;->q:Landroid/support/v4/app/Fragment;

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/app/Fragment;->a(ILandroid/support/v4/app/Fragment;)V

    .line 1179
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    iget v1, p1, Landroid/support/v4/app/Fragment;->o:I

    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1
.end method

.method public c(Landroid/support/v4/app/Fragment;II)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 1259
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "show: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1260
    :cond_0
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->J:Z

    if-eqz v0, :cond_4

    .line 1261
    iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->J:Z

    .line 1262
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 1263
    invoke-virtual {p0, p1, p2, v4, p3}, Landroid/support/v4/app/s;->a(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;

    move-result-object v0

    .line 1265
    if-eqz v0, :cond_1

    .line 1266
    iget-object v1, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1268
    :cond_1
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1270
    :cond_2
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->v:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->N:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->O:Z

    if-eqz v0, :cond_3

    .line 1271
    iput-boolean v4, p0, Landroid/support/v4/app/s;->r:Z

    .line 1273
    :cond_3
    invoke-virtual {p1, v3}, Landroid/support/v4/app/Fragment;->c(Z)V

    .line 1275
    :cond_4
    return-void
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 1364
    iget-boolean v0, p0, Landroid/support/v4/app/s;->s:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/app/s;->u:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 511
    new-instance v0, Landroid/support/v4/app/u;

    invoke-direct {v0, p0}, Landroid/support/v4/app/u;-><init>(Landroid/support/v4/app/s;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/s;->a(Ljava/lang/Runnable;Z)V

    .line 516
    return-void
.end method

.method public d(I)V
    .locals 3

    .prologue
    .line 1455
    monitor-enter p0

    .line 1456
    :try_start_0
    iget-object v0, p0, Landroid/support/v4/app/s;->k:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1457
    iget-object v0, p0, Landroid/support/v4/app/s;->l:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 1458
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/s;->l:Ljava/util/ArrayList;

    .line 1460
    :cond_0
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Freeing back stack index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1461
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/s;->l:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1462
    monitor-exit p0

    .line 1463
    return-void

    .line 1462
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method d(Landroid/support/v4/app/Fragment;)V
    .locals 3

    .prologue
    .line 1185
    iget v0, p1, Landroid/support/v4/app/Fragment;->o:I

    if-gez v0, :cond_0

    .line 1198
    :goto_0
    return-void

    .line 1189
    :cond_0
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Freeing fragment index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1190
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    iget v1, p1, Landroid/support/v4/app/Fragment;->o:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1191
    const/4 v0, -0x1

    iput v0, p1, Landroid/support/v4/app/Fragment;->p:I

    .line 1192
    iget-object v0, p0, Landroid/support/v4/app/s;->h:Ljava/util/ArrayList;

    if-nez v0, :cond_2

    .line 1193
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/s;->h:Ljava/util/ArrayList;

    .line 1195
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/s;->h:Ljava/util/ArrayList;

    iget v1, p1, Landroid/support/v4/app/Fragment;->o:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1196
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    iget-object v1, p1, Landroid/support/v4/app/Fragment;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/p;->a(Ljava/lang/String;)V

    .line 1197
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->D()V

    goto :goto_0
.end method

.method public d(Landroid/support/v4/app/Fragment;II)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v2, 0x1

    .line 1278
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "detach: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1279
    :cond_0
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->K:Z

    if-nez v0, :cond_4

    .line 1280
    iput-boolean v2, p1, Landroid/support/v4/app/Fragment;->K:Z

    .line 1281
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->v:Z

    if-eqz v0, :cond_4

    .line 1283
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 1284
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "remove from detach: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1285
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1287
    :cond_2
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->N:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->O:Z

    if-eqz v0, :cond_3

    .line 1288
    iput-boolean v2, p0, Landroid/support/v4/app/s;->r:Z

    .line 1290
    :cond_3
    iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->v:Z

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    .line 1291
    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/s;->a(Landroid/support/v4/app/Fragment;IIIZ)V

    .line 1294
    :cond_4
    return-void
.end method

.method e(Landroid/support/v4/app/Fragment;)V
    .locals 2

    .prologue
    .line 1620
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->T:Landroid/view/View;

    if-nez v0, :cond_1

    .line 1633
    :cond_0
    :goto_0
    return-void

    .line 1623
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/s;->x:Landroid/util/SparseArray;

    if-nez v0, :cond_2

    .line 1624
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/s;->x:Landroid/util/SparseArray;

    .line 1628
    :goto_1
    iget-object v0, p1, Landroid/support/v4/app/Fragment;->T:Landroid/view/View;

    iget-object v1, p0, Landroid/support/v4/app/s;->x:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 1629
    iget-object v0, p0, Landroid/support/v4/app/s;->x:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1630
    iget-object v0, p0, Landroid/support/v4/app/s;->x:Landroid/util/SparseArray;

    iput-object v0, p1, Landroid/support/v4/app/Fragment;->n:Landroid/util/SparseArray;

    .line 1631
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/app/s;->x:Landroid/util/SparseArray;

    goto :goto_0

    .line 1626
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/s;->x:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    goto :goto_1
.end method

.method public e(Landroid/support/v4/app/Fragment;II)V
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 1297
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "attach: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1298
    :cond_0
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->K:Z

    if-eqz v0, :cond_5

    .line 1299
    iput-boolean v5, p1, Landroid/support/v4/app/Fragment;->K:Z

    .line 1300
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->v:Z

    if-nez v0, :cond_5

    .line 1301
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 1302
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    .line 1304
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1305
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment already added: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1307
    :cond_2
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_3

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "add from attach: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1308
    :cond_3
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1309
    iput-boolean v3, p1, Landroid/support/v4/app/Fragment;->v:Z

    .line 1310
    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->N:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p1, Landroid/support/v4/app/Fragment;->O:Z

    if-eqz v0, :cond_4

    .line 1311
    iput-boolean v3, p0, Landroid/support/v4/app/s;->r:Z

    .line 1313
    :cond_4
    iget v2, p0, Landroid/support/v4/app/s;->n:I

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/s;->a(Landroid/support/v4/app/Fragment;IIIZ)V

    .line 1316
    :cond_5
    return-void
.end method

.method public e()Z
    .locals 4

    .prologue
    .line 520
    invoke-direct {p0}, Landroid/support/v4/app/s;->w()V

    .line 521
    invoke-virtual {p0}, Landroid/support/v4/app/s;->b()Z

    .line 522
    iget-object v0, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->b()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/support/v4/app/s;->a(Landroid/os/Handler;Ljava/lang/String;II)Z

    move-result v0

    return v0
.end method

.method public f()I
    .locals 1

    .prologue
    .line 565
    iget-object v0, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method f(Landroid/support/v4/app/Fragment;)Landroid/os/Bundle;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 1636
    .line 1638
    iget-object v0, p0, Landroid/support/v4/app/s;->w:Landroid/os/Bundle;

    if-nez v0, :cond_0

    .line 1639
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Landroid/support/v4/app/s;->w:Landroid/os/Bundle;

    .line 1641
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/s;->w:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/support/v4/app/Fragment;->k(Landroid/os/Bundle;)V

    .line 1642
    iget-object v0, p0, Landroid/support/v4/app/s;->w:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 1643
    iget-object v0, p0, Landroid/support/v4/app/s;->w:Landroid/os/Bundle;

    .line 1644
    iput-object v1, p0, Landroid/support/v4/app/s;->w:Landroid/os/Bundle;

    .line 1647
    :goto_0
    iget-object v1, p1, Landroid/support/v4/app/Fragment;->S:Landroid/view/View;

    if-eqz v1, :cond_1

    .line 1648
    invoke-virtual {p0, p1}, Landroid/support/v4/app/s;->e(Landroid/support/v4/app/Fragment;)V

    .line 1650
    :cond_1
    iget-object v1, p1, Landroid/support/v4/app/Fragment;->n:Landroid/util/SparseArray;

    if-eqz v1, :cond_3

    .line 1651
    if-nez v0, :cond_2

    .line 1652
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1654
    :cond_2
    const-string v1, "android:view_state"

    iget-object v2, p1, Landroid/support/v4/app/Fragment;->n:Landroid/util/SparseArray;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 1657
    :cond_3
    iget-boolean v1, p1, Landroid/support/v4/app/Fragment;->V:Z

    if-nez v1, :cond_5

    .line 1658
    if-nez v0, :cond_4

    .line 1659
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1662
    :cond_4
    const-string v1, "android:user_visible_hint"

    iget-boolean v2, p1, Landroid/support/v4/app/Fragment;->V:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1665
    :cond_5
    return-object v0

    :cond_6
    move-object v0, v1

    goto :goto_0
.end method

.method g()V
    .locals 2

    .prologue
    .line 1155
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 1163
    :cond_0
    return-void

    .line 1157
    :cond_1
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 1158
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 1159
    if-eqz v0, :cond_2

    .line 1160
    invoke-virtual {p0, v0}, Landroid/support/v4/app/s;->a(Landroid/support/v4/app/Fragment;)V

    .line 1157
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public h()Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v2, 0x0

    .line 1469
    iget-boolean v1, p0, Landroid/support/v4/app/s;->e:Z

    if-eqz v1, :cond_0

    .line 1470
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Recursive entry to executePendingTransactions"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1473
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    iget-object v3, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v3}, Landroid/support/v4/app/p;->b()Landroid/os/Handler;

    move-result-object v3

    invoke-virtual {v3}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v3

    if-eq v1, v3, :cond_1

    .line 1474
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must be called from main thread of process"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move v1, v2

    .line 1482
    :goto_0
    monitor-enter p0

    .line 1483
    :try_start_0
    iget-object v3, p0, Landroid/support/v4/app/s;->c:Ljava/util/ArrayList;

    if-eqz v3, :cond_2

    iget-object v3, p0, Landroid/support/v4/app/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-nez v3, :cond_4

    .line 1484
    :cond_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1505
    iget-boolean v0, p0, Landroid/support/v4/app/s;->v:Z

    if-eqz v0, :cond_9

    move v3, v2

    move v4, v2

    .line 1507
    :goto_1
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_8

    .line 1508
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 1509
    if-eqz v0, :cond_3

    iget-object v5, v0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    if-eqz v5, :cond_3

    .line 1510
    iget-object v0, v0, Landroid/support/v4/app/Fragment;->W:Landroid/support/v4/app/ai;

    invoke-virtual {v0}, Landroid/support/v4/app/ai;->a()Z

    move-result v0

    or-int/2addr v4, v0

    .line 1507
    :cond_3
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 1487
    :cond_4
    :try_start_1
    iget-object v1, p0, Landroid/support/v4/app/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 1488
    iget-object v1, p0, Landroid/support/v4/app/s;->d:[Ljava/lang/Runnable;

    if-eqz v1, :cond_5

    iget-object v1, p0, Landroid/support/v4/app/s;->d:[Ljava/lang/Runnable;

    array-length v1, v1

    if-ge v1, v3, :cond_6

    .line 1489
    :cond_5
    new-array v1, v3, [Ljava/lang/Runnable;

    iput-object v1, p0, Landroid/support/v4/app/s;->d:[Ljava/lang/Runnable;

    .line 1491
    :cond_6
    iget-object v1, p0, Landroid/support/v4/app/s;->c:Ljava/util/ArrayList;

    iget-object v4, p0, Landroid/support/v4/app/s;->d:[Ljava/lang/Runnable;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1492
    iget-object v1, p0, Landroid/support/v4/app/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1493
    iget-object v1, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-virtual {v1}, Landroid/support/v4/app/p;->b()Landroid/os/Handler;

    move-result-object v1

    iget-object v4, p0, Landroid/support/v4/app/s;->y:Ljava/lang/Runnable;

    invoke-virtual {v1, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1494
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1496
    iput-boolean v0, p0, Landroid/support/v4/app/s;->e:Z

    move v1, v2

    .line 1497
    :goto_2
    if-ge v1, v3, :cond_7

    .line 1498
    iget-object v4, p0, Landroid/support/v4/app/s;->d:[Ljava/lang/Runnable;

    aget-object v4, v4, v1

    invoke-interface {v4}, Ljava/lang/Runnable;->run()V

    .line 1499
    iget-object v4, p0, Landroid/support/v4/app/s;->d:[Ljava/lang/Runnable;

    const/4 v5, 0x0

    aput-object v5, v4, v1

    .line 1497
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 1494
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 1501
    :cond_7
    iput-boolean v2, p0, Landroid/support/v4/app/s;->e:Z

    move v1, v0

    .line 1503
    goto :goto_0

    .line 1513
    :cond_8
    if-nez v4, :cond_9

    .line 1514
    iput-boolean v2, p0, Landroid/support/v4/app/s;->v:Z

    .line 1515
    invoke-virtual {p0}, Landroid/support/v4/app/s;->g()V

    .line 1518
    :cond_9
    return v1
.end method

.method i()V
    .locals 2

    .prologue
    .line 1522
    iget-object v0, p0, Landroid/support/v4/app/s;->m:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 1523
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/s;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 1524
    iget-object v0, p0, Landroid/support/v4/app/s;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/r;

    invoke-interface {v0}, Landroid/support/v4/app/r;->a()V

    .line 1523
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1527
    :cond_0
    return-void
.end method

.method j()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/Fragment;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1601
    const/4 v1, 0x0

    .line 1602
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 1603
    const/4 v0, 0x0

    move v3, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_3

    .line 1604
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 1605
    if-eqz v0, :cond_1

    iget-boolean v2, v0, Landroid/support/v4/app/Fragment;->L:Z

    if-eqz v2, :cond_1

    .line 1606
    if-nez v1, :cond_0

    .line 1607
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1609
    :cond_0
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1610
    const/4 v2, 0x1

    iput-boolean v2, v0, Landroid/support/v4/app/Fragment;->M:Z

    .line 1611
    iget-object v2, v0, Landroid/support/v4/app/Fragment;->s:Landroid/support/v4/app/Fragment;

    if-eqz v2, :cond_2

    iget-object v2, v0, Landroid/support/v4/app/Fragment;->s:Landroid/support/v4/app/Fragment;

    iget v2, v2, Landroid/support/v4/app/Fragment;->o:I

    :goto_1
    iput v2, v0, Landroid/support/v4/app/Fragment;->t:I

    .line 1612
    sget-boolean v2, Landroid/support/v4/app/s;->a:Z

    if-eqz v2, :cond_1

    const-string v2, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "retainNonConfig: keeping retained "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1603
    :cond_1
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 1611
    :cond_2
    const/4 v2, -0x1

    goto :goto_1

    .line 1616
    :cond_3
    return-object v1
.end method

.method k()Landroid/os/Parcelable;
    .locals 11

    .prologue
    const/4 v1, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 1671
    invoke-virtual {p0}, Landroid/support/v4/app/s;->h()Z

    .line 1673
    sget-boolean v0, Landroid/support/v4/app/s;->b:Z

    if-eqz v0, :cond_0

    .line 1683
    iput-boolean v1, p0, Landroid/support/v4/app/s;->s:Z

    .line 1686
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 1781
    :cond_1
    :goto_0
    return-object v3

    .line 1691
    :cond_2
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 1692
    new-array v7, v6, [Landroid/support/v4/app/FragmentState;

    move v5, v4

    move v2, v4

    .line 1694
    :goto_1
    if-ge v5, v6, :cond_9

    .line 1695
    iget-object v0, p0, Landroid/support/v4/app/s;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 1696
    if-eqz v0, :cond_11

    .line 1697
    iget v2, v0, Landroid/support/v4/app/Fragment;->o:I

    if-gez v2, :cond_3

    .line 1698
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Failure saving state: active "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " has cleared index: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    iget v9, v0, Landroid/support/v4/app/Fragment;->o:I

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v2, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v2}, Landroid/support/v4/app/s;->a(Ljava/lang/RuntimeException;)V

    .line 1705
    :cond_3
    new-instance v2, Landroid/support/v4/app/FragmentState;

    invoke-direct {v2, v0}, Landroid/support/v4/app/FragmentState;-><init>(Landroid/support/v4/app/Fragment;)V

    .line 1706
    aput-object v2, v7, v5

    .line 1708
    iget v8, v0, Landroid/support/v4/app/Fragment;->j:I

    if-lez v8, :cond_8

    iget-object v8, v2, Landroid/support/v4/app/FragmentState;->k:Landroid/os/Bundle;

    if-nez v8, :cond_8

    .line 1709
    invoke-virtual {p0, v0}, Landroid/support/v4/app/s;->f(Landroid/support/v4/app/Fragment;)Landroid/os/Bundle;

    move-result-object v8

    iput-object v8, v2, Landroid/support/v4/app/FragmentState;->k:Landroid/os/Bundle;

    .line 1711
    iget-object v8, v0, Landroid/support/v4/app/Fragment;->s:Landroid/support/v4/app/Fragment;

    if-eqz v8, :cond_6

    .line 1712
    iget-object v8, v0, Landroid/support/v4/app/Fragment;->s:Landroid/support/v4/app/Fragment;

    iget v8, v8, Landroid/support/v4/app/Fragment;->o:I

    if-gez v8, :cond_4

    .line 1713
    new-instance v8, Ljava/lang/IllegalStateException;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Failure saving state: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " has target not in fragment manager: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    iget-object v10, v0, Landroid/support/v4/app/Fragment;->s:Landroid/support/v4/app/Fragment;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v8}, Landroid/support/v4/app/s;->a(Ljava/lang/RuntimeException;)V

    .line 1717
    :cond_4
    iget-object v8, v2, Landroid/support/v4/app/FragmentState;->k:Landroid/os/Bundle;

    if-nez v8, :cond_5

    .line 1718
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    iput-object v8, v2, Landroid/support/v4/app/FragmentState;->k:Landroid/os/Bundle;

    .line 1720
    :cond_5
    iget-object v8, v2, Landroid/support/v4/app/FragmentState;->k:Landroid/os/Bundle;

    const-string v9, "android:target_state"

    iget-object v10, v0, Landroid/support/v4/app/Fragment;->s:Landroid/support/v4/app/Fragment;

    invoke-virtual {p0, v8, v9, v10}, Landroid/support/v4/app/s;->a(Landroid/os/Bundle;Ljava/lang/String;Landroid/support/v4/app/Fragment;)V

    .line 1722
    iget v8, v0, Landroid/support/v4/app/Fragment;->u:I

    if-eqz v8, :cond_6

    .line 1723
    iget-object v8, v2, Landroid/support/v4/app/FragmentState;->k:Landroid/os/Bundle;

    const-string v9, "android:target_req_state"

    iget v10, v0, Landroid/support/v4/app/Fragment;->u:I

    invoke-virtual {v8, v9, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1733
    :cond_6
    :goto_2
    sget-boolean v8, Landroid/support/v4/app/s;->a:Z

    if-eqz v8, :cond_7

    const-string v8, "FragmentManager"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Saved state of "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v9, ": "

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, v2, Landroid/support/v4/app/FragmentState;->k:Landroid/os/Bundle;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    move v0, v1

    .line 1694
    :goto_3
    add-int/lit8 v2, v5, 0x1

    move v5, v2

    move v2, v0

    goto/16 :goto_1

    .line 1730
    :cond_8
    iget-object v8, v0, Landroid/support/v4/app/Fragment;->m:Landroid/os/Bundle;

    iput-object v8, v2, Landroid/support/v4/app/FragmentState;->k:Landroid/os/Bundle;

    goto :goto_2

    .line 1738
    :cond_9
    if-nez v2, :cond_a

    .line 1739
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "FragmentManager"

    const-string v1, "saveAllState: no fragments!"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 1747
    :cond_a
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_d

    .line 1748
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 1749
    if-lez v5, :cond_d

    .line 1750
    new-array v1, v5, [I

    move v2, v4

    .line 1751
    :goto_4
    if-ge v2, v5, :cond_e

    .line 1752
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    iget v0, v0, Landroid/support/v4/app/Fragment;->o:I

    aput v0, v1, v2

    .line 1753
    aget v0, v1, v2

    if-gez v0, :cond_b

    .line 1754
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Failure saving state: active "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v8, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v8, " has cleared index: "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    aget v8, v1, v2

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Landroid/support/v4/app/s;->a(Ljava/lang/RuntimeException;)V

    .line 1758
    :cond_b
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_c

    const-string v0, "FragmentManager"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "saveAllState: adding fragment #"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v8, ": "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v8, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1751
    :cond_c
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_4

    :cond_d
    move-object v1, v3

    .line 1765
    :cond_e
    iget-object v0, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_10

    .line 1766
    iget-object v0, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 1767
    if-lez v5, :cond_10

    .line 1768
    new-array v3, v5, [Landroid/support/v4/app/BackStackState;

    move v2, v4

    .line 1769
    :goto_5
    if-ge v2, v5, :cond_10

    .line 1770
    new-instance v4, Landroid/support/v4/app/BackStackState;

    iget-object v0, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/b;

    invoke-direct {v4, p0, v0}, Landroid/support/v4/app/BackStackState;-><init>(Landroid/support/v4/app/s;Landroid/support/v4/app/b;)V

    aput-object v4, v3, v2

    .line 1771
    sget-boolean v0, Landroid/support/v4/app/s;->a:Z

    if-eqz v0, :cond_f

    const-string v0, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "saveAllState: adding back stack #"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, ": "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v6, p0, Landroid/support/v4/app/s;->i:Ljava/util/ArrayList;

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1769
    :cond_f
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_5

    .line 1777
    :cond_10
    new-instance v0, Landroid/support/v4/app/FragmentManagerState;

    invoke-direct {v0}, Landroid/support/v4/app/FragmentManagerState;-><init>()V

    .line 1778
    iput-object v7, v0, Landroid/support/v4/app/FragmentManagerState;->a:[Landroid/support/v4/app/FragmentState;

    .line 1779
    iput-object v1, v0, Landroid/support/v4/app/FragmentManagerState;->b:[I

    .line 1780
    iput-object v3, v0, Landroid/support/v4/app/FragmentManagerState;->c:[Landroid/support/v4/app/BackStackState;

    move-object v3, v0

    .line 1781
    goto/16 :goto_0

    :cond_11
    move v0, v2

    goto/16 :goto_3
.end method

.method public l()V
    .locals 1

    .prologue
    .line 1906
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/s;->s:Z

    .line 1907
    return-void
.end method

.method public m()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1910
    iput-boolean v1, p0, Landroid/support/v4/app/s;->s:Z

    .line 1911
    const/4 v0, 0x1

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/s;->a(IZ)V

    .line 1912
    return-void
.end method

.method public n()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1915
    iput-boolean v1, p0, Landroid/support/v4/app/s;->s:Z

    .line 1916
    const/4 v0, 0x2

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/s;->a(IZ)V

    .line 1917
    return-void
.end method

.method public o()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1920
    iput-boolean v1, p0, Landroid/support/v4/app/s;->s:Z

    .line 1921
    const/4 v0, 0x4

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/s;->a(IZ)V

    .line 1922
    return-void
.end method

.method public p()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1925
    iput-boolean v1, p0, Landroid/support/v4/app/s;->s:Z

    .line 1926
    const/4 v0, 0x5

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/s;->a(IZ)V

    .line 1927
    return-void
.end method

.method public q()V
    .locals 2

    .prologue
    .line 1930
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/s;->a(IZ)V

    .line 1931
    return-void
.end method

.method public r()V
    .locals 2

    .prologue
    .line 1937
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/s;->s:Z

    .line 1939
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/s;->a(IZ)V

    .line 1940
    return-void
.end method

.method public s()V
    .locals 2

    .prologue
    .line 1943
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/s;->a(IZ)V

    .line 1944
    return-void
.end method

.method public t()V
    .locals 2

    .prologue
    .line 1947
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/app/s;->a(IZ)V

    .line 1948
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 630
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 631
    const-string v1, "FragmentManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 632
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 633
    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 634
    iget-object v1, p0, Landroid/support/v4/app/s;->q:Landroid/support/v4/app/Fragment;

    if-eqz v1, :cond_0

    .line 635
    iget-object v1, p0, Landroid/support/v4/app/s;->q:Landroid/support/v4/app/Fragment;

    invoke-static {v1, v0}, Landroid/support/v4/c/a;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 639
    :goto_0
    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 640
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 637
    :cond_0
    iget-object v1, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    invoke-static {v1, v0}, Landroid/support/v4/c/a;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    goto :goto_0
.end method

.method public u()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 1951
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/s;->t:Z

    .line 1952
    invoke-virtual {p0}, Landroid/support/v4/app/s;->h()Z

    .line 1953
    invoke-virtual {p0, v2, v2}, Landroid/support/v4/app/s;->a(IZ)V

    .line 1954
    iput-object v1, p0, Landroid/support/v4/app/s;->o:Landroid/support/v4/app/p;

    .line 1955
    iput-object v1, p0, Landroid/support/v4/app/s;->p:Landroid/support/v4/app/o;

    .line 1956
    iput-object v1, p0, Landroid/support/v4/app/s;->q:Landroid/support/v4/app/Fragment;

    .line 1957
    return-void
.end method

.method public v()V
    .locals 2

    .prologue
    .line 1971
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 1972
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 1973
    iget-object v0, p0, Landroid/support/v4/app/s;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 1974
    if-eqz v0, :cond_0

    .line 1975
    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->I()V

    .line 1972
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1979
    :cond_1
    return-void
.end method
