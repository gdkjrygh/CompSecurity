.class public Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;
.super Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$l;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$1;,
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;,
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;,
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;,
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;
    }
.end annotation


# instance fields
.field a:Landroid/view/ViewGroup;

.field b:I

.field c:Landroid/view/View;

.field private d:Z

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .prologue
    .line 53
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$l;-><init>(Landroid/content/Context;)V

    .line 100
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->d:Z

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->e:Ljava/util/List;

    .line 54
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a:Landroid/view/ViewGroup;

    .line 55
    return-void
.end method

.method public static a(Ljava/lang/String;)J
    .locals 6

    .prologue
    const-wide/16 v0, 0x0

    .line 757
    if-nez p0, :cond_0

    .line 766
    :goto_0
    return-wide v0

    .line 761
    :cond_0
    :try_start_0
    new-instance v2, Landroid/os/StatFs;

    invoke-direct {v2, p0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 762
    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockSize()I

    move-result v3

    int-to-long v4, v3

    .line 763
    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockCount()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    int-to-long v0, v0

    .line 764
    mul-long/2addr v0, v4

    goto :goto_0

    .line 765
    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method private a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v0, 0x0

    const v4, 0x7f0b00c9

    const v3, 0x7f0b00c8

    .line 148
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->c:Landroid/view/View;

    if-nez v1, :cond_0

    .line 179
    :goto_0
    return-object v0

    .line 152
    :cond_0
    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$1;->b:[I

    invoke-virtual {p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 154
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->c:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 156
    :pswitch_1
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->SYSTEM:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    if-ne p2, v0, :cond_1

    .line 157
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->c:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 159
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->c:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 162
    :pswitch_2
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->EXTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    if-ne p2, v0, :cond_2

    .line 163
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->c:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 165
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->c:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 168
    :pswitch_3
    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$1;->a:[I

    invoke-virtual {p2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_1

    goto :goto_0

    .line 170
    :pswitch_4
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->c:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 172
    :pswitch_5
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->c:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 152
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    .line 168
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public static a(Landroid/content/Context;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v9, 0x0

    const/4 v8, 0x1

    .line 396
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 398
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v4

    .line 401
    invoke-static {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->b(Landroid/content/Context;)Z

    move-result v0

    .line 408
    if-nez v0, :cond_0

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 409
    :cond_0
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;

    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->SYSTEM:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    invoke-direct {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;)V

    .line 410
    invoke-static {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->e(Landroid/content/Context;)J

    move-result-wide v6

    iput-wide v6, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->b:J

    .line 411
    invoke-static {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->f(Landroid/content/Context;)J

    move-result-wide v6

    iput-wide v6, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c:J

    .line 412
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 415
    :cond_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_2

    move-object v0, v3

    .line 448
    :goto_0
    return-object v0

    .line 419
    :cond_2
    new-instance v5, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;

    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->INTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    invoke-direct {v5, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;)V

    .line 420
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 421
    const/4 v2, 0x0

    .line 423
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, v8, :cond_5

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 424
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 425
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 431
    :goto_1
    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->b(Ljava/lang/String;)J

    move-result-wide v6

    iput-wide v6, v5, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->b:J

    .line 432
    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a(Ljava/lang/String;)J

    move-result-wide v6

    iput-wide v6, v5, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c:J

    .line 436
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 438
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v8, :cond_3

    .line 439
    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;

    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->EXTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    invoke-direct {v2, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;)V

    .line 440
    if-nez v1, :cond_4

    .line 441
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 443
    :goto_2
    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->b(Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->b:J

    .line 444
    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c:J

    .line 445
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    move-object v0, v3

    .line 448
    goto :goto_0

    :cond_4
    move-object v0, v1

    goto :goto_2

    :cond_5
    move-object v1, v2

    goto :goto_1
.end method

.method public static a(Landroid/content/Context;Ljava/util/List;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;",
            "Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 679
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 681
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->d()[Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    move-result-object v4

    .line 682
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v0, v4

    if-ge v1, v0, :cond_1

    .line 684
    aget-object v5, v4, v1

    .line 686
    const/4 v2, 0x0

    .line 688
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;

    .line 689
    iget-object v7, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    if-ne v7, v5, :cond_0

    .line 694
    :goto_1
    invoke-virtual {v3, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 696
    :cond_1
    return-object v3

    :cond_2
    move-object v0, v2

    goto :goto_1
.end method

.method private a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 80
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->c:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 81
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->c:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 83
    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->e()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 84
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a:Landroid/view/ViewGroup;

    invoke-virtual {v1, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 85
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->c:Landroid/view/View;

    .line 86
    return-void
.end method

.method public static a(JJ)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const-wide/32 v4, 0xf4240

    .line 507
    cmp-long v1, p0, p2

    if-nez v1, :cond_1

    .line 521
    :cond_0
    :goto_0
    return v0

    .line 513
    :cond_1
    cmp-long v1, p0, v4

    if-gez v1, :cond_2

    cmp-long v1, p2, v4

    if-ltz v1, :cond_0

    .line 516
    :cond_2
    div-long v2, p0, v4

    .line 517
    div-long v4, p2, v4

    .line 521
    cmp-long v1, v2, v4

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;)J
    .locals 6

    .prologue
    const-wide/16 v0, 0x0

    .line 779
    if-nez p0, :cond_0

    .line 788
    :goto_0
    return-wide v0

    .line 783
    :cond_0
    :try_start_0
    new-instance v2, Landroid/os/StatFs;

    invoke-direct {v2, p0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 784
    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockSize()I

    move-result v3

    int-to-long v4, v3

    .line 785
    invoke-virtual {v2}, Landroid/os/StatFs;->getAvailableBlocks()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    int-to-long v0, v0

    .line 786
    mul-long/2addr v0, v4

    goto :goto_0

    .line 787
    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method private b(I)Landroid/view/View;
    .locals 2

    .prologue
    .line 96
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 97
    return-object v0
.end method

.method public static b(Landroid/content/Context;Ljava/util/List;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;",
            ">;)",
            "Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;"
        }
    .end annotation

    .prologue
    .line 897
    .line 898
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    .line 900
    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    .line 901
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->SYSTEM_INTERNAL_EXTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    .line 912
    :goto_0
    return-object v0

    .line 904
    :cond_0
    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    .line 905
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->INTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    goto :goto_0

    .line 907
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;

    .line 908
    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    sget-object v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->EXTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    if-ne v0, v2, :cond_2

    .line 909
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->INTERNAL_EXTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    goto :goto_0

    .line 912
    :cond_3
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->INTERNAL_SYSTEM:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 539
    invoke-static {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->c(Landroid/content/Context;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;

    move-result-object v2

    .line 540
    invoke-static {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->d(Landroid/content/Context;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;

    move-result-object v3

    .line 547
    iget-wide v4, v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c:J

    iget-wide v6, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c:J

    invoke-static {v4, v5, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a(JJ)Z

    move-result v4

    if-nez v4, :cond_0

    iget-wide v4, v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->b:J

    iget-wide v6, v3, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->b:J

    invoke-static {v4, v5, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a(JJ)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c()J

    move-result-wide v4

    invoke-virtual {v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c()J

    move-result-wide v2

    invoke-static {v4, v5, v2, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    move v2, v1

    .line 555
    :goto_0
    if-ne v2, v0, :cond_2

    :goto_1
    return v0

    :cond_1
    move v2, v0

    .line 552
    goto :goto_0

    :cond_2
    move v0, v1

    .line 555
    goto :goto_1
.end method

.method public static c(Landroid/content/Context;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;
    .locals 4

    .prologue
    .line 560
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;

    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->SYSTEM:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    invoke-direct {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;)V

    .line 561
    invoke-static {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->e(Landroid/content/Context;)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->b:J

    .line 562
    invoke-static {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->f(Landroid/content/Context;)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c:J

    .line 563
    return-object v0
.end method

.method private static c(Ljava/lang/String;)Z
    .locals 11

    .prologue
    const/4 v10, 0x4

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 585
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 645
    :goto_0
    return v0

    .line 590
    :cond_0
    :try_start_0
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    new-instance v4, Ljava/io/FileInputStream;

    new-instance v5, Ljava/io/File;

    const-string/jumbo v6, "/proc/self/mountinfo"

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v4, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 593
    :cond_1
    :goto_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 597
    const-string/jumbo v4, "uid=1000"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string/jumbo v4, "gid=1015"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string/jumbo v4, "asec"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 598
    const-string/jumbo v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 599
    if-eqz v3, :cond_1

    array-length v4, v3

    if-lt v4, v10, :cond_1

    .line 600
    const/4 v4, 0x4

    aget-object v4, v3, v4

    .line 604
    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 605
    const/4 v4, 0x2

    aget-object v3, v3, v4

    const-string/jumbo v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 606
    const/4 v4, 0x0

    aget-object v4, v3, v4

    .line 607
    const/4 v5, 0x1

    aget-object v3, v3, v5

    .line 611
    new-instance v5, Ljava/io/BufferedReader;

    new-instance v6, Ljava/io/InputStreamReader;

    new-instance v7, Ljava/io/FileInputStream;

    new-instance v8, Ljava/io/File;

    const-string/jumbo v9, "/proc/partitions"

    invoke-direct {v8, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v7, v8}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v6, v7}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v5, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 614
    :cond_2
    invoke-virtual {v5}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    .line 615
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    .line 619
    const-string/jumbo v7, "\\s+"

    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 625
    array-length v7, v6

    if-lt v7, v10, :cond_2

    const/4 v7, 0x0

    aget-object v7, v6, v7

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/4 v7, 0x1

    aget-object v7, v6, v7

    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/4 v7, 0x3

    aget-object v6, v6, v7

    const-string/jumbo v7, "mmcblk0"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v0, v1

    .line 630
    goto/16 :goto_0

    .line 633
    :cond_3
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_1

    .line 639
    :catch_0
    move-exception v1

    .line 640
    invoke-virtual {v1}, Ljava/io/FileNotFoundException;->printStackTrace()V

    goto/16 :goto_0

    .line 638
    :cond_4
    :try_start_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_0

    .line 641
    :catch_1
    move-exception v1

    .line 642
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_0
.end method

.method public static d(Landroid/content/Context;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;
    .locals 4

    .prologue
    .line 567
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    .line 568
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gtz v1, :cond_0

    .line 569
    invoke-static {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->c(Landroid/content/Context;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;

    move-result-object v0

    .line 580
    :goto_0
    return-object v0

    .line 571
    :cond_0
    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;

    sget-object v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->INTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    invoke-direct {v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;)V

    .line 572
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 577
    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->b(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->b:J

    .line 578
    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c:J

    move-object v0, v1

    .line 580
    goto :goto_0
.end method

.method public static d()[Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;
    .locals 3

    .prologue
    .line 649
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    const/4 v1, 0x0

    sget-object v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->SYSTEM:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->INTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->EXTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method private static e(Landroid/content/Context;)J
    .locals 4

    .prologue
    .line 798
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v0

    .line 799
    new-instance v1, Landroid/os/StatFs;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 800
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v2, v0

    .line 801
    invoke-virtual {v1}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v0, v0

    .line 802
    mul-long/2addr v0, v2

    return-wide v0
.end method

.method private e()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 89
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 92
    return-object v0
.end method

.method private static f(Landroid/content/Context;)J
    .locals 4

    .prologue
    .line 811
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v0

    .line 812
    new-instance v1, Landroid/os/StatFs;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 813
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v2, v0

    .line 814
    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCount()I

    move-result v0

    int-to-long v0, v0

    .line 815
    mul-long/2addr v0, v2

    return-wide v0
.end method

.method private declared-synchronized f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 109
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->d:Z

    if-eqz v0, :cond_1

    .line 110
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->e:Ljava/util/List;

    .line 111
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->d:Z

    .line 113
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->e:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 109
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .prologue
    .line 69
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-le v0, v1, :cond_0

    .line 70
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->b:I

    if-ne v0, p1, :cond_0

    .line 77
    :goto_0
    return-void

    .line 74
    :cond_0
    iput p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->b:I

    .line 75
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->b(I)Landroid/view/View;

    move-result-object v0

    .line 76
    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a(Landroid/view/View;)V

    goto :goto_0
.end method

.method public a(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 185
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a(Landroid/content/Context;Ljava/util/List;)Ljava/util/Map;

    move-result-object v4

    .line 187
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->d()[Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    move-result-object v5

    .line 189
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->b(Landroid/content/Context;Ljava/util/List;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    move-result-object v6

    move v2, v3

    .line 195
    :goto_0
    array-length v0, v5

    if-ge v2, v0, :cond_4

    .line 196
    aget-object v7, v5, v2

    .line 197
    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;

    .line 199
    if-nez v0, :cond_1

    .line 195
    :cond_0
    :goto_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 207
    :cond_1
    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->SYSTEM_INTERNAL_EXTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    if-ne v1, v6, :cond_2

    .line 209
    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->INTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    if-ne v7, v1, :cond_3

    .line 210
    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->EXTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;

    .line 211
    iget-wide v8, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->b:J

    iget-wide v10, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->b:J

    add-long/2addr v8, v10

    iput-wide v8, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->b:J

    .line 212
    iget-wide v8, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c:J

    iget-wide v10, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c:J

    add-long/2addr v8, v10

    iput-wide v8, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c:J

    .line 217
    :cond_2
    invoke-direct {p0, v6, v7}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;)Landroid/view/View;

    move-result-object v1

    .line 218
    if-eqz v1, :cond_0

    .line 227
    new-instance v7, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v7, v8}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;-><init>(Landroid/content/Context;)V

    .line 228
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 229
    invoke-virtual {v7, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->a(Landroid/view/View;)V

    .line 230
    invoke-virtual {v7, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$b;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;)V

    goto :goto_1

    .line 213
    :cond_3
    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->EXTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    if-ne v7, v1, :cond_2

    goto :goto_1

    .line 233
    :cond_4
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 103
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->d:Z

    .line 104
    return-void
.end method

.method public c()V
    .locals 6

    .prologue
    const v0, 0x7f030038

    const/4 v5, 0x2

    .line 132
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->f()Ljava/util/List;

    move-result-object v2

    .line 133
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    .line 134
    const v1, 0x7f030037

    .line 135
    const/4 v4, 0x3

    if-ne v3, v4, :cond_3

    .line 140
    :cond_0
    :goto_0
    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a(I)V

    .line 141
    if-eq v3, v5, :cond_1

    const/4 v0, 0x1

    if-ne v3, v0, :cond_2

    .line 142
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;

    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;->SYSTEM:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    iput-object v1, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    .line 144
    :cond_2
    invoke-virtual {p0, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;->a(Ljava/util/List;)V

    .line 145
    return-void

    .line 137
    :cond_3
    if-eq v3, v5, :cond_0

    move v0, v1

    goto :goto_0
.end method
