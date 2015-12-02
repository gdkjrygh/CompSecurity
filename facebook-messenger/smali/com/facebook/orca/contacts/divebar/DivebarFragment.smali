.class public Lcom/facebook/orca/contacts/divebar/DivebarFragment;
.super Lcom/facebook/base/fragment/FbFragment;
.source "DivebarFragment.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private Z:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private aA:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private aB:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private aC:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation
.end field

.field private aD:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation
.end field

.field private aE:J

.field private aF:J

.field private aG:I

.field private aH:Lcom/facebook/orca/contacts/divebar/z;

.field private aI:Z

.field private aJ:Lcom/facebook/base/broadcast/j;

.field private aK:Lcom/facebook/base/broadcast/l;

.field private aL:Lcom/facebook/orca/contacts/divebar/y;

.field private aa:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private ab:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private ac:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private ad:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private ae:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private af:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private ag:Lcom/facebook/c/s;

.field private ah:Lcom/facebook/analytics/av;

.field private ai:Lcom/facebook/fbservice/ops/k;

.field private aj:Lcom/facebook/prefs/shared/d;

.field private ak:Lcom/facebook/contacts/upload/c;

.field private al:Lcom/facebook/auth/b/b;

.field private am:Lcom/facebook/common/time/a;

.field private an:Lcom/facebook/orca/threadlist/bf;

.field private ao:Lcom/facebook/orca/contacts/divebar/bs;

.field private ap:Lcom/facebook/orca/contacts/divebar/aa;

.field private aq:Lcom/facebook/orca/contacts/divebar/ap;

.field private ar:Lcom/facebook/orca/contacts/divebar/be;

.field private as:Lcom/facebook/contacts/picker/c;

.field private at:Lcom/facebook/orca/contacts/divebar/bl;

.field private au:Lcom/facebook/contacts/picker/v;

.field private av:Z

.field private aw:Z

.field private ax:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private ay:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private az:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

.field private c:Lcom/facebook/l/k;

.field private d:Lcom/facebook/contacts/a/c;

.field private e:Lcom/facebook/orca/contacts/divebar/e;

.field private f:Lcom/facebook/contacts/a/d;

.field private g:Lcom/facebook/orca/contacts/picker/az;

.field private h:Lcom/facebook/orca/contacts/divebar/ao;

.field private i:Lcom/facebook/contacts/picker/bd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 94
    const-class v0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    sput-object v0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 92
    invoke-direct {p0}, Lcom/facebook/base/fragment/FbFragment;-><init>()V

    .line 146
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aE:J

    .line 148
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aG:I

    .line 261
    return-void
.end method

.method private O()V
    .locals 3

    .prologue
    .line 405
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->y()Landroid/support/v4/app/ag;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ag;->a(I)Landroid/support/v4/a/c;

    move-result-object v0

    .line 406
    if-eqz v0, :cond_0

    .line 407
    sget-object v1, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a:Ljava/lang/Class;

    const-string v2, "stopping DivebarLoader"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 410
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/a/c;->b(Ljava/lang/Object;)V

    .line 411
    invoke-virtual {v0}, Landroid/support/v4/a/c;->k()V

    .line 413
    :cond_0
    return-void
.end method

.method private P()Landroid/support/v4/app/ah;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/support/v4/app/ah",
            "<",
            "Lcom/facebook/orca/contacts/divebar/an;",
            ">;"
        }
    .end annotation

    .prologue
    .line 447
    new-instance v0, Lcom/facebook/orca/contacts/divebar/u;

    invoke-direct {v0, p0}, Lcom/facebook/orca/contacts/divebar/u;-><init>(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)V

    return-object v0
.end method

.method private Q()I
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 469
    .line 470
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/util/List;

    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ax:Ljava/util/List;

    aput-object v1, v0, v2

    const/4 v1, 0x1

    iget-object v3, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ay:Ljava/util/List;

    aput-object v3, v0, v1

    const/4 v1, 0x2

    iget-object v3, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->az:Ljava/util/List;

    aput-object v3, v0, v1

    const/4 v1, 0x3

    iget-object v3, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aA:Ljava/util/List;

    aput-object v3, v0, v1

    const/4 v1, 0x4

    iget-object v3, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aB:Ljava/util/List;

    aput-object v3, v0, v1

    const/4 v1, 0x5

    iget-object v3, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aD:Ljava/util/List;

    aput-object v3, v0, v1

    invoke-static {v0}, Lcom/google/common/a/hq;->a([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    .line 478
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v2

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 479
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_1
    add-int/2addr v0, v1

    move v1, v0

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_1

    .line 481
    :cond_1
    return v1
.end method

.method private R()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 485
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ax:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ay:Ljava/util/List;

    if-eqz v0, :cond_2

    move v0, v1

    .line 486
    :goto_0
    iget-boolean v3, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aI:Z

    if-eqz v3, :cond_3

    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->Q()I

    move-result v3

    if-nez v3, :cond_3

    move v3, v1

    .line 487
    :goto_1
    if-eqz v0, :cond_0

    if-eqz v3, :cond_1

    :cond_0
    move v2, v1

    :cond_1
    return v2

    :cond_2
    move v0, v2

    .line 485
    goto :goto_0

    :cond_3
    move v3, v2

    .line 486
    goto :goto_1
.end method

.method private T()V
    .locals 6

    .prologue
    const/4 v1, 0x1

    .line 542
    const/4 v0, 0x0

    .line 544
    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->f:Lcom/facebook/contacts/a/d;

    invoke-virtual {v2}, Lcom/facebook/contacts/a/d;->c()J

    move-result-wide v2

    .line 545
    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_0

    iget-wide v4, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aE:J

    cmp-long v4, v2, v4

    if-eqz v4, :cond_0

    .line 546
    iget-object v4, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->f:Lcom/facebook/contacts/a/d;

    invoke-virtual {v4}, Lcom/facebook/contacts/a/d;->b()Lcom/google/common/a/es;

    move-result-object v4

    .line 547
    if-eqz v4, :cond_0

    .line 548
    invoke-static {v4}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ax:Ljava/util/List;

    .line 550
    iput-wide v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aE:J

    move v0, v1

    .line 554
    :cond_0
    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ak:Lcom/facebook/contacts/upload/c;

    invoke-virtual {v2}, Lcom/facebook/contacts/upload/c;->b()Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a(Lcom/facebook/contacts/upload/ContactsUploadState;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 558
    :goto_0
    if-eqz v1, :cond_1

    .line 559
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->W()V

    .line 561
    :cond_1
    return-void

    :cond_2
    move v1, v0

    goto :goto_0
.end method

.method private U()V
    .locals 4

    .prologue
    .line 586
    sget-object v0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a:Ljava/lang/Class;

    const-string v1, "loadFriends"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 587
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->V()V

    .line 588
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->y()Landroid/support/v4/app/ag;

    move-result-object v0

    .line 589
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->P()Landroid/support/v4/app/ah;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/ag;->a(ILandroid/os/Bundle;Landroid/support/v4/app/ah;)Landroid/support/v4/a/c;

    .line 594
    return-void
.end method

.method private V()V
    .locals 2

    .prologue
    .line 597
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aF:J

    .line 598
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aG:I

    .line 599
    return-void
.end method

.method private W()V
    .locals 15

    .prologue
    .line 676
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ao:Lcom/facebook/orca/contacts/divebar/bs;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/bs;->c()V

    .line 678
    iget-object v3, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ax:Ljava/util/List;

    .line 679
    iget-object v4, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ay:Ljava/util/List;

    .line 680
    iget-object v5, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->az:Ljava/util/List;

    .line 681
    iget-object v6, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aA:Ljava/util/List;

    .line 682
    iget-object v7, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aB:Ljava/util/List;

    .line 683
    iget-object v8, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aD:Ljava/util/List;

    .line 685
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v9

    .line 687
    iget-boolean v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->av:Z

    if-eqz v0, :cond_0

    .line 688
    sget-object v0, Lcom/facebook/orca/contacts/picker/ar;->c:Lcom/facebook/contacts/picker/ad;

    invoke-virtual {v9, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 691
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->R()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 692
    sget-object v0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a:Ljava/lang/Class;

    const-string v1, "Top friends not loaded; not showing any users in list."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 693
    invoke-virtual {v9}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 694
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ar:Lcom/facebook/orca/contacts/divebar/be;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/contacts/divebar/be;->a(Lcom/google/common/a/es;)V

    .line 699
    iget-boolean v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->av:Z

    if-nez v0, :cond_1

    .line 700
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ar:Lcom/facebook/orca/contacts/divebar/be;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/be;->d()V

    .line 948
    :cond_1
    :goto_0
    return-void

    .line 705
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aq:Lcom/facebook/orca/contacts/divebar/ap;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/ap;->a()Lcom/google/common/base/Optional;

    move-result-object v0

    .line 706
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 707
    invoke-virtual {v0}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 710
    :cond_3
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v10

    .line 712
    iget-boolean v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aw:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aC:Ljava/util/List;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aC:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 713
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->n()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/facebook/o;->contact_picker_recents_header:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 715
    new-instance v1, Lcom/facebook/contacts/picker/ae;

    invoke-direct {v1, v0}, Lcom/facebook/contacts/picker/ae;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 716
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    const/4 v0, 0x4

    if-ge v1, v0, :cond_4

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aC:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 717
    new-instance v2, Lcom/facebook/orca/contacts/picker/ad;

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aC:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    invoke-direct {v2, v0}, Lcom/facebook/orca/contacts/picker/ad;-><init>(Lcom/facebook/orca/threads/ThreadSummary;)V

    invoke-virtual {v9, v2}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 716
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 724
    :cond_4
    if-eqz v3, :cond_7

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_7

    const/4 v0, 0x1

    move v1, v0

    .line 725
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    const/4 v0, 0x1

    move v2, v0

    .line 727
    :goto_3
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ae:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ap:Lcom/facebook/orca/contacts/divebar/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/aa;->b()Z

    move-result v0

    if-nez v0, :cond_5

    .line 729
    new-instance v0, Lcom/facebook/contacts/picker/ae;

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->n()Landroid/content/Context;

    move-result-object v11

    sget v12, Lcom/facebook/o;->contact_picker_groups_header:I

    invoke-virtual {v11, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v0, v11}, Lcom/facebook/contacts/picker/ae;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 732
    invoke-direct {p0, v8, v9}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a(Ljava/util/List;Lcom/google/common/a/et;)I

    move-result v0

    .line 733
    if-lez v0, :cond_9

    .line 734
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->X()V

    .line 740
    :cond_5
    :goto_4
    if-nez v1, :cond_6

    if-eqz v2, :cond_a

    .line 741
    :cond_6
    sget-object v0, Lcom/facebook/orca/contacts/picker/ar;->b:Lcom/facebook/contacts/picker/ad;

    invoke-virtual {v9, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 742
    if-eqz v3, :cond_a

    .line 743
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 744
    new-instance v11, Lcom/facebook/user/UserWithIdentifier;

    invoke-virtual {v0}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v12

    invoke-direct {v11, v0, v12}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    .line 746
    iget-object v12, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->g:Lcom/facebook/orca/contacts/picker/az;

    sget-object v13, Lcom/facebook/contacts/picker/ah;->FAVORITES:Lcom/facebook/contacts/picker/ah;

    invoke-virtual {v12, v11, v13}, Lcom/facebook/orca/contacts/picker/az;->b(Lcom/facebook/user/UserWithIdentifier;Lcom/facebook/contacts/picker/ah;)Lcom/facebook/contacts/picker/ag;

    move-result-object v11

    invoke-virtual {v9, v11}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 750
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 724
    :cond_7
    const/4 v0, 0x0

    move v1, v0

    goto :goto_2

    .line 725
    :cond_8
    const/4 v0, 0x0

    move v2, v0

    goto :goto_3

    .line 736
    :cond_9
    sget-object v0, Lcom/facebook/orca/contacts/picker/ar;->g:Lcom/facebook/contacts/picker/ad;

    invoke-virtual {v9, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_4

    .line 755
    :cond_a
    if-eqz v1, :cond_b

    if-eqz v2, :cond_b

    .line 756
    new-instance v0, Lcom/facebook/contacts/picker/af;

    invoke-direct {v0}, Lcom/facebook/contacts/picker/af;-><init>()V

    invoke-virtual {v9, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 759
    :cond_b
    const/4 v0, 0x0

    move v1, v0

    :goto_6
    const/16 v0, 0xf

    if-ge v1, v0, :cond_d

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_d

    .line 761
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 762
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-interface {v10, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 760
    :goto_7
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_6

    .line 766
    :cond_c
    new-instance v2, Lcom/facebook/user/UserWithIdentifier;

    invoke-virtual {v0}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v8

    invoke-direct {v2, v0, v8}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    .line 768
    iget-object v8, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->g:Lcom/facebook/orca/contacts/picker/az;

    sget-object v11, Lcom/facebook/contacts/picker/ah;->TOP_FRIENDS:Lcom/facebook/contacts/picker/ah;

    invoke-virtual {v8, v2, v11}, Lcom/facebook/orca/contacts/picker/az;->b(Lcom/facebook/user/UserWithIdentifier;Lcom/facebook/contacts/picker/ah;)Lcom/facebook/contacts/picker/ag;

    move-result-object v2

    invoke-virtual {v9, v2}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 772
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 796
    :cond_d
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 797
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v2

    .line 798
    invoke-static {}, Lcom/google/common/a/hq;->b()Ljava/util/LinkedList;

    move-result-object v8

    .line 800
    if-eqz v5, :cond_e

    .line 801
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ab:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 802
    invoke-interface {v1, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 808
    :cond_e
    :goto_8
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_12

    .line 809
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->i:Lcom/facebook/contacts/picker/bd;

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 810
    const/4 v0, 0x0

    .line 811
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move v1, v0

    :cond_f
    :goto_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 812
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v12

    invoke-interface {v10, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_f

    .line 815
    if-nez v1, :cond_10

    .line 816
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->n()Landroid/content/Context;

    move-result-object v1

    sget v12, Lcom/facebook/o;->contact_picker_online_friends_header:I

    invoke-virtual {v1, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 818
    new-instance v12, Lcom/facebook/contacts/picker/ae;

    invoke-direct {v12, v1}, Lcom/facebook/contacts/picker/ae;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v12}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 819
    const/4 v1, 0x1

    .line 821
    :cond_10
    new-instance v12, Lcom/facebook/user/UserWithIdentifier;

    invoke-virtual {v0}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v13

    invoke-direct {v12, v0, v13}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    .line 824
    iget-object v13, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->g:Lcom/facebook/orca/contacts/picker/az;

    sget-object v14, Lcom/facebook/contacts/picker/ah;->UNKNOWN:Lcom/facebook/contacts/picker/ah;

    invoke-virtual {v13, v12, v14}, Lcom/facebook/orca/contacts/picker/az;->b(Lcom/facebook/user/UserWithIdentifier;Lcom/facebook/contacts/picker/ah;)Lcom/facebook/contacts/picker/ag;

    move-result-object v12

    invoke-virtual {v9, v12}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 828
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 804
    :cond_11
    invoke-interface {v2, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_8

    .line 832
    :cond_12
    if-eqz v6, :cond_13

    .line 833
    invoke-interface {v2, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 836
    :cond_13
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_16

    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->Y()Z

    move-result v0

    if-nez v0, :cond_16

    .line 838
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->i:Lcom/facebook/contacts/picker/bd;

    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 839
    const/4 v0, 0x0

    .line 840
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v1, v0

    :cond_14
    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 841
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_14

    .line 844
    if-nez v1, :cond_15

    .line 845
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->n()Landroid/content/Context;

    move-result-object v1

    sget v11, Lcom/facebook/o;->contact_picker_more_friends_header:I

    invoke-virtual {v1, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 847
    new-instance v11, Lcom/facebook/contacts/picker/ae;

    invoke-direct {v11, v1}, Lcom/facebook/contacts/picker/ae;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v11}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 848
    const/4 v1, 0x1

    .line 850
    :cond_15
    new-instance v11, Lcom/facebook/user/UserWithIdentifier;

    invoke-virtual {v0}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v12

    invoke-direct {v11, v0, v12}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    .line 853
    iget-object v12, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->g:Lcom/facebook/orca/contacts/picker/az;

    sget-object v13, Lcom/facebook/contacts/picker/ah;->UNKNOWN:Lcom/facebook/contacts/picker/ah;

    invoke-virtual {v12, v11, v13}, Lcom/facebook/orca/contacts/picker/az;->b(Lcom/facebook/user/UserWithIdentifier;Lcom/facebook/contacts/picker/ah;)Lcom/facebook/contacts/picker/ag;

    move-result-object v11

    invoke-virtual {v9, v11}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 857
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 862
    :cond_16
    if-eqz v7, :cond_1b

    .line 863
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->Y()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 864
    invoke-interface {v7, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 867
    :cond_17
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->i:Lcom/facebook/contacts/picker/bd;

    invoke-static {v7, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 868
    const/4 v0, 0x0

    .line 869
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :cond_18
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 870
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v6

    invoke-interface {v10, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_18

    .line 875
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->Y()Z

    move-result v6

    if-eqz v6, :cond_19

    iget-object v6, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->c:Lcom/facebook/l/k;

    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v11

    invoke-virtual {v6, v11}, Lcom/facebook/l/k;->a(Lcom/facebook/user/UserKey;)Z

    move-result v6

    if-nez v6, :cond_19

    iget-object v6, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->c:Lcom/facebook/l/k;

    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v11

    invoke-virtual {v6, v11}, Lcom/facebook/l/k;->b(Lcom/facebook/user/UserKey;)Lcom/facebook/l/x;

    move-result-object v6

    invoke-virtual {v6}, Lcom/facebook/l/x;->b()Z

    move-result v6

    if-nez v6, :cond_19

    .line 878
    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_b

    .line 882
    :cond_19
    if-nez v1, :cond_1a

    .line 883
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->n()Landroid/content/Context;

    move-result-object v1

    sget v6, Lcom/facebook/o;->contact_picker_other_contacts_header:I

    invoke-virtual {v1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 885
    new-instance v6, Lcom/facebook/contacts/picker/ae;

    invoke-direct {v6, v1}, Lcom/facebook/contacts/picker/ae;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v6}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 886
    const/4 v1, 0x1

    .line 889
    :cond_1a
    new-instance v6, Lcom/facebook/user/UserWithIdentifier;

    invoke-virtual {v0}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v11

    invoke-direct {v6, v0, v11}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    .line 892
    iget-object v11, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->g:Lcom/facebook/orca/contacts/picker/az;

    sget-object v12, Lcom/facebook/contacts/picker/ah;->ACTIVE_FRIENDS:Lcom/facebook/contacts/picker/ah;

    invoke-virtual {v11, v6, v12}, Lcom/facebook/orca/contacts/picker/az;->b(Lcom/facebook/user/UserWithIdentifier;Lcom/facebook/contacts/picker/ah;)Lcom/facebook/contacts/picker/ag;

    move-result-object v6

    invoke-virtual {v9, v6}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 896
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_b

    .line 902
    :cond_1b
    if-eqz v8, :cond_1e

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ao:Lcom/facebook/orca/contacts/divebar/bs;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/bs;->b()Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 904
    const/4 v0, 0x0

    .line 905
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :cond_1c
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 906
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v6

    invoke-interface {v10, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1c

    .line 910
    if-nez v1, :cond_1d

    .line 911
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->n()Landroid/content/Context;

    move-result-object v1

    sget v6, Lcom/facebook/o;->contact_picker_offline_contacts_header:I

    invoke-virtual {v1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 913
    new-instance v6, Lcom/facebook/contacts/picker/ae;

    invoke-direct {v6, v1}, Lcom/facebook/contacts/picker/ae;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v6}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 914
    const/4 v1, 0x1

    .line 917
    :cond_1d
    new-instance v6, Lcom/facebook/user/UserWithIdentifier;

    invoke-virtual {v0}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v8

    invoke-direct {v6, v0, v8}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    .line 919
    iget-object v8, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->g:Lcom/facebook/orca/contacts/picker/az;

    sget-object v11, Lcom/facebook/contacts/picker/ah;->ACTIVE_FRIENDS:Lcom/facebook/contacts/picker/ah;

    invoke-virtual {v8, v6, v11}, Lcom/facebook/orca/contacts/picker/az;->b(Lcom/facebook/user/UserWithIdentifier;Lcom/facebook/contacts/picker/ah;)Lcom/facebook/contacts/picker/ag;

    move-result-object v6

    invoke-virtual {v9, v6}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 923
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 928
    :cond_1e
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->Z:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 929
    new-instance v0, Lcom/facebook/orca/contacts/picker/ag;

    invoke-direct {v0}, Lcom/facebook/orca/contacts/picker/ag;-><init>()V

    new-instance v1, Lcom/facebook/orca/contacts/divebar/v;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/divebar/v;-><init>(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/picker/ag;->a(Lcom/facebook/orca/contacts/picker/aj;)Lcom/facebook/orca/contacts/picker/ag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ag;->a()Lcom/facebook/orca/contacts/picker/af;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 939
    :cond_1f
    invoke-virtual {v9}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 940
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ar:Lcom/facebook/orca/contacts/divebar/be;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/contacts/divebar/be;->a(Lcom/google/common/a/es;)V

    .line 942
    if-eqz v3, :cond_20

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    move v1, v0

    :goto_d
    if-eqz v4, :cond_21

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    :goto_e
    add-int/2addr v1, v0

    if-eqz v5, :cond_22

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    :goto_f
    add-int/2addr v1, v0

    if-eqz v7, :cond_23

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    :goto_10
    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->e(I)V

    goto/16 :goto_0

    :cond_20
    const/4 v0, 0x0

    move v1, v0

    goto :goto_d

    :cond_21
    const/4 v0, 0x0

    goto :goto_e

    :cond_22
    const/4 v0, 0x0

    goto :goto_f

    :cond_23
    const/4 v0, 0x0

    goto :goto_10
.end method

.method private X()V
    .locals 2

    .prologue
    .line 972
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "view"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->af()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "divebar"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "list_section"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "group_conversations_section"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 978
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ah:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 979
    return-void
.end method

.method private Y()Z
    .locals 1

    .prologue
    .line 982
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ao:Lcom/facebook/orca/contacts/divebar/bs;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/bs;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ao:Lcom/facebook/orca/contacts/divebar/bs;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/bs;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private Z()V
    .locals 4

    .prologue
    .line 987
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "click"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->af()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "divebar"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "button"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "orca_divebar_fragment_invite_friends_clicked"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    .line 993
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ac:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ad:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 994
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aa()Landroid/content/Intent;

    move-result-object v0

    .line 995
    const-string v2, "composer_type"

    const-string v3, "orca_composer"

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 996
    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ag:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->n()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 1003
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ah:Lcom/facebook/analytics/av;

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 1004
    return-void

    .line 998
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ab()Landroid/content/Intent;

    move-result-object v0

    .line 999
    const-string v2, "composer_type"

    const-string v3, "native_composer"

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 1000
    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ag:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->n()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/DivebarFragment;I)I
    .locals 0

    .prologue
    .line 92
    iput p1, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aG:I

    return p1
.end method

.method private a(Ljava/util/List;Lcom/google/common/a/et;)I
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;",
            "Lcom/google/common/a/et",
            "<",
            "Lcom/facebook/contacts/picker/ad;",
            ">;)I"
        }
    .end annotation

    .prologue
    const/4 v4, 0x3

    const/4 v0, 0x0

    .line 953
    if-nez p1, :cond_0

    .line 968
    :goto_0
    return v0

    .line 957
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 958
    if-lt v1, v4, :cond_2

    :cond_1
    move v0, v1

    .line 968
    goto :goto_0

    .line 962
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/common/a/es;->size()I

    move-result v3

    if-lt v3, v4, :cond_3

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->w()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 963
    new-instance v3, Lcom/facebook/orca/contacts/picker/ad;

    invoke-direct {v3, v0}, Lcom/facebook/orca/contacts/picker/ad;-><init>(Lcom/facebook/orca/threads/ThreadSummary;)V

    invoke-virtual {p2, v3}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 964
    add-int/lit8 v1, v1, 0x1

    move v0, v1

    :goto_2
    move v1, v0

    goto :goto_1

    :cond_3
    move v0, v1

    goto :goto_2
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/DivebarFragment;J)J
    .locals 0

    .prologue
    .line 92
    iput-wide p1, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aF:J

    return-wide p1
.end method

.method public static a(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)Lcom/facebook/orca/contacts/divebar/DivebarFragment;
    .locals 1

    .prologue
    .line 165
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a(Lcom/facebook/contacts/picker/ContactPickerColorScheme;Z)Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/facebook/contacts/picker/ContactPickerColorScheme;Z)Lcom/facebook/orca/contacts/divebar/DivebarFragment;
    .locals 2

    .prologue
    .line 171
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 172
    const-string v1, "PARAM_COLOR_SCHEME"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 173
    const-string v1, "PARAM_SHOW_RECENT_THREADS"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 174
    new-instance v1, Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    invoke-direct {v1}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;-><init>()V

    .line 175
    invoke-virtual {v1, v0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->g(Landroid/os/Bundle;)V

    .line 176
    return-object v1
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)Lcom/facebook/orca/contacts/picker/az;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->g:Lcom/facebook/orca/contacts/picker/az;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/DivebarFragment;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->b(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/DivebarFragment;Lcom/facebook/orca/contacts/divebar/an;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a(Lcom/facebook/orca/contacts/divebar/an;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/DivebarFragment;Lcom/facebook/orca/threadlist/bm;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a(Lcom/facebook/orca/threadlist/bm;)V

    return-void
.end method

.method private a(Lcom/facebook/orca/contacts/divebar/an;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    .line 602
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->s()Z

    move-result v0

    if-nez v0, :cond_1

    .line 668
    :cond_0
    :goto_0
    return-void

    .line 607
    :cond_1
    if-eqz p1, :cond_0

    .line 612
    iget v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aG:I

    if-eqz v0, :cond_2

    iget-wide v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aF:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aF:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x7d0

    cmp-long v0, v2, v4

    if-gez v0, :cond_2

    .line 615
    sget-object v0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a:Ljava/lang/Class;

    const-string v1, "Skipping list udpate. user is interacting with list"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 619
    :cond_2
    const/4 v0, 0x0

    .line 621
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->g()Z

    move-result v2

    iput-boolean v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aI:Z

    .line 624
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->b()Lcom/google/common/a/es;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 625
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ay:Ljava/util/List;

    move v0, v1

    .line 629
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->c()Lcom/google/common/a/es;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 630
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->c()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->az:Ljava/util/List;

    move v0, v1

    .line 634
    :cond_4
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->a()Lcom/google/common/a/es;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 635
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->a()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ax:Ljava/util/List;

    move v0, v1

    .line 639
    :cond_5
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->e()Lcom/google/common/a/es;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 640
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->e()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aA:Ljava/util/List;

    move v0, v1

    .line 644
    :cond_6
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->d()Lcom/google/common/a/es;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 645
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aB:Ljava/util/List;

    move v0, v1

    .line 649
    :cond_7
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->f()Lcom/google/common/a/es;

    move-result-object v2

    if-eqz v2, :cond_b

    .line 650
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->f()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aD:Ljava/util/List;

    .line 654
    :goto_1
    if-nez v1, :cond_8

    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->g()Z

    move-result v0

    if-nez v0, :cond_9

    .line 655
    :cond_8
    sget-object v0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a:Ljava/lang/Class;

    const-string v1, "updating list with new result from loader"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 656
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->W()V

    .line 659
    :cond_9
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ay:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->az:Ljava/util/List;

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aA:Ljava/util/List;

    if-eqz v0, :cond_0

    :cond_a
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 665
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->O()V

    .line 666
    sget-object v0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Stopped loader with new result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_b
    move v1, v0

    goto :goto_1
.end method

.method private a(Lcom/facebook/orca/threadlist/bm;)V
    .locals 1

    .prologue
    .line 671
    iget-object v0, p1, Lcom/facebook/orca/threadlist/bm;->a:Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadsCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aC:Ljava/util/List;

    .line 672
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->W()V

    .line 673
    return-void
.end method

.method private a(Lcom/facebook/contacts/upload/ContactsUploadState;)Z
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 1083
    .line 1085
    invoke-virtual {p1}, Lcom/facebook/contacts/upload/ContactsUploadState;->a()Lcom/facebook/contacts/upload/k;

    move-result-object v0

    .line 1086
    sget-object v3, Lcom/facebook/contacts/upload/k;->STARTED:Lcom/facebook/contacts/upload/k;

    if-eq v0, v3, :cond_0

    sget-object v3, Lcom/facebook/contacts/upload/k;->RUNNING:Lcom/facebook/contacts/upload/k;

    if-ne v0, v3, :cond_1

    :cond_0
    move v0, v2

    .line 1090
    :goto_0
    iget-boolean v3, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->av:Z

    if-eq v0, v3, :cond_2

    .line 1091
    iput-boolean v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->av:Z

    .line 1095
    :goto_1
    return v2

    :cond_1
    move v0, v1

    .line 1086
    goto :goto_0

    :cond_2
    move v2, v1

    goto :goto_1
.end method

.method private aa()Landroid/content/Intent;
    .locals 4

    .prologue
    .line 1007
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->n()Landroid/content/Context;

    move-result-object v0

    .line 1008
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1009
    const-string v2, "show_composer"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1010
    const-string v2, "composer_initial_text"

    sget v3, Lcom/facebook/o;->invite_friends_default_text:I

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1013
    return-object v1
.end method

.method private ab()Landroid/content/Intent;
    .locals 4

    .prologue
    .line 1017
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    const-string v2, "sms:"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1018
    const-string v1, "vnd.android-dir/mms-sms"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1019
    const-string v1, "sms_body"

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->n()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/facebook/o;->invite_friends_default_text:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1021
    return-object v0
.end method

.method private ac()V
    .locals 3

    .prologue
    .line 1050
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1051
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ai:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/contacts/server/d;->n:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    .line 1053
    return-void
.end method

.method private ad()V
    .locals 4

    .prologue
    .line 1059
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aj:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 1060
    sget-object v1, Lcom/facebook/orca/prefs/o;->G:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    .line 1061
    sget-object v1, Lcom/facebook/orca/prefs/o;->H:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->am:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 1062
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 1063
    return-void
.end method

.method private ae()V
    .locals 4

    .prologue
    .line 1069
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aj:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/o;->F:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v0

    .line 1072
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aj:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    .line 1073
    sget-object v2, Lcom/facebook/orca/prefs/o;->F:Lcom/facebook/prefs/shared/ae;

    add-int/lit8 v0, v0, 0x1

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    .line 1074
    sget-object v0, Lcom/facebook/orca/prefs/o;->E:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->am:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-interface {v1, v0, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 1075
    invoke-interface {v1}, Lcom/facebook/prefs/shared/e;->a()V

    .line 1076
    return-void
.end method

.method private af()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1099
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->n()Landroid/content/Context;

    move-result-object v0

    .line 1100
    instance-of v1, v0, Lcom/facebook/base/activity/h;

    if-eqz v1, :cond_0

    .line 1101
    check-cast v0, Lcom/facebook/base/activity/h;

    invoke-interface {v0}, Lcom/facebook/base/activity/h;->h()Ljava/lang/String;

    move-result-object v0

    .line 1103
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)Lcom/facebook/orca/contacts/divebar/ao;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->h:Lcom/facebook/orca/contacts/divebar/ao;

    return-object v0
.end method

.method private b(Landroid/content/Intent;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 416
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 417
    const/4 v0, 0x0

    .line 418
    const-string v3, "com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 419
    sget-object v2, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a:Ljava/lang/Class;

    const-string v3, "CONTACTS_UPLOAD_STATE_CHANGED"

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 420
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->u()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 421
    const-string v0, "state"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/upload/ContactsUploadState;

    .line 424
    invoke-direct {p0, v0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a(Lcom/facebook/contacts/upload/ContactsUploadState;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 425
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->W()V

    :cond_0
    move v0, v1

    .line 441
    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    .line 442
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a()V

    .line 444
    :cond_2
    return-void

    .line 430
    :cond_3
    const-string v3, "com.facebook.orca.presence.PRESENCE_MANAGER_SETTINGS_CHANGED"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 431
    sget-object v0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a:Ljava/lang/Class;

    const-string v2, "PRESENCE_MANAGER_SETTINGS_CHANGED"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    move v0, v1

    .line 432
    goto :goto_0

    .line 433
    :cond_4
    sget-object v3, Lcom/facebook/backgroundlocation/status/d;->a:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 434
    sget-object v0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a:Ljava/lang/Class;

    const-string v2, "BackgroundLocationStatusManager settings changed"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    move v0, v1

    .line 435
    goto :goto_0

    .line 436
    :cond_5
    const-string v1, "com.facebook.orca.contacts.divebar.GROUP_MEGAPHONE_DISMISSED"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 437
    sget-object v1, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a:Ljava/lang/Class;

    const-string v2, "ACTION_GROUP_MEGAPHONE_DISMISSED"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 438
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->W()V

    goto :goto_0
.end method

.method static synthetic c()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 92
    sget-object v0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->Z()V

    return-void
.end method

.method private d()Lcom/facebook/contacts/picker/ContactPickerColorScheme;
    .locals 2

    .prologue
    .line 270
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "PARAM_COLOR_SCHEME"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 271
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "PARAM_COLOR_SCHEME"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    .line 275
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DIVEBAR_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    goto :goto_0
.end method

.method static synthetic d(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ad()V

    return-void
.end method

.method private e(I)V
    .locals 3

    .prologue
    .line 1026
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aj:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/contacts/upload/a;->c:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1028
    new-instance v0, Lcom/facebook/orca/contacts/divebar/w;

    invoke-direct {v0, p0}, Lcom/facebook/orca/contacts/divebar/w;-><init>(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)V

    .line 1037
    new-instance v1, Lcom/facebook/orca/contacts/divebar/x;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/divebar/x;-><init>(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)V

    .line 1045
    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ar:Lcom/facebook/orca/contacts/divebar/be;

    invoke-virtual {v2, v0, v1, p1}, Lcom/facebook/orca/contacts/divebar/be;->a(Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;I)V

    .line 1047
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ac()V

    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)Lcom/facebook/orca/contacts/divebar/be;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ar:Lcom/facebook/orca/contacts/divebar/be;

    return-object v0
.end method

.method static synthetic g(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ae()V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    .prologue
    .line 523
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->A()V

    .line 525
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->T()V

    .line 527
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aH:Lcom/facebook/orca/contacts/divebar/z;

    if-eqz v0, :cond_0

    .line 528
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aH:Lcom/facebook/orca/contacts/divebar/z;

    invoke-interface {v0}, Lcom/facebook/orca/contacts/divebar/z;->b()V

    .line 530
    :cond_0
    return-void
.end method

.method public B()V
    .locals 1

    .prologue
    .line 534
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->B()V

    .line 536
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aH:Lcom/facebook/orca/contacts/divebar/z;

    if-eqz v0, :cond_0

    .line 537
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aH:Lcom/facebook/orca/contacts/divebar/z;

    invoke-interface {v0}, Lcom/facebook/orca/contacts/divebar/z;->a()V

    .line 539
    :cond_0
    return-void
.end method

.method public C()V
    .locals 1

    .prologue
    .line 394
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->C()V

    .line 395
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->O()V

    .line 396
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->an:Lcom/facebook/orca/threadlist/bf;

    if-eqz v0, :cond_0

    .line 397
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->an:Lcom/facebook/orca/threadlist/bf;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/bf;->a()V

    .line 399
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aK:Lcom/facebook/base/broadcast/l;

    if-eqz v0, :cond_1

    .line 400
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aK:Lcom/facebook/base/broadcast/l;

    invoke-interface {v0}, Lcom/facebook/base/broadcast/l;->c()V

    .line 402
    :cond_1
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .prologue
    .line 282
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 283
    const-class v0, Lcom/facebook/contacts/picker/c;

    const-class v2, Lcom/facebook/orca/annotations/ForDivebarList;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/c;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->as:Lcom/facebook/contacts/picker/c;

    .line 285
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->as:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/c;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->au:Lcom/facebook/contacts/picker/v;

    invoke-interface {v0, v2}, Lcom/facebook/contacts/picker/u;->a(Lcom/facebook/contacts/picker/v;)V

    .line 286
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->as:Lcom/facebook/contacts/picker/c;

    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->d()Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/picker/c;->a(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V

    .line 287
    new-instance v0, Lcom/facebook/orca/contacts/divebar/be;

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->n()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->as:Lcom/facebook/contacts/picker/c;

    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->d()Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    move-result-object v4

    invoke-direct {v0, v2, v3, v4}, Lcom/facebook/orca/contacts/divebar/be;-><init>(Landroid/content/Context;Lcom/facebook/contacts/picker/c;Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ar:Lcom/facebook/orca/contacts/divebar/be;

    .line 288
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ar:Lcom/facebook/orca/contacts/divebar/be;

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->at:Lcom/facebook/orca/contacts/divebar/bl;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/contacts/divebar/be;->setContactPickerViewListener(Lcom/facebook/orca/contacts/divebar/bl;)V

    .line 289
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ar:Lcom/facebook/orca/contacts/divebar/be;

    new-instance v2, Lcom/facebook/orca/contacts/divebar/s;

    invoke-direct {v2, p0}, Lcom/facebook/orca/contacts/divebar/s;-><init>(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)V

    invoke-virtual {v0, v2}, Lcom/facebook/orca/contacts/divebar/be;->setOnContactListScrollListener(Lcom/facebook/contacts/picker/ap;)V

    .line 298
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aq:Lcom/facebook/orca/contacts/divebar/ap;

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->at:Lcom/facebook/orca/contacts/divebar/bl;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/contacts/divebar/ap;->a(Lcom/facebook/orca/contacts/divebar/bl;)V

    .line 300
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ar:Lcom/facebook/orca/contacts/divebar/be;

    sget v2, Lcom/facebook/o;->name_or_phone_search_hint:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/contacts/divebar/be;->setSearchHint(Ljava/lang/String;)V

    .line 302
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsDivebarMoreMobileFriendsEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aa:Ljavax/inject/a;

    .line 304
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsDivebarMoreMobileFriendsNewSectionEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ab:Ljavax/inject/a;

    .line 306
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ar:Lcom/facebook/orca/contacts/divebar/be;

    return-object v0
.end method

.method public a()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 491
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->al:Lcom/facebook/auth/b/b;

    invoke-interface {v0}, Lcom/facebook/auth/b/b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->al:Lcom/facebook/auth/b/b;

    invoke-interface {v0}, Lcom/facebook/auth/b/b;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 519
    :cond_0
    :goto_0
    return-void

    .line 495
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->R()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 497
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ar:Lcom/facebook/orca/contacts/divebar/be;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/be;->d()V

    .line 500
    :cond_2
    iget-boolean v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aw:Z

    if-eqz v0, :cond_3

    .line 501
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->an:Lcom/facebook/orca/threadlist/bf;

    sget-object v1, Lcom/facebook/orca/threads/FolderName;->b:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/orca/threads/FolderName;)V

    .line 502
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->an:Lcom/facebook/orca/threadlist/bf;

    new-instance v1, Lcom/facebook/orca/threadlist/bl;

    invoke-direct {v1, v3, v3}, Lcom/facebook/orca/threadlist/bl;-><init>(ZZ)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/orca/threadlist/bl;)V

    .line 507
    :cond_3
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->y()Landroid/support/v4/app/ag;

    move-result-object v0

    .line 509
    invoke-virtual {v0, v3}, Landroid/support/v4/app/ag;->a(I)Landroid/support/v4/a/c;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 510
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->O()V

    .line 511
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->V()V

    .line 513
    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->P()Landroid/support/v4/app/ah;

    move-result-object v2

    invoke-virtual {v0, v3, v1, v2}, Landroid/support/v4/app/ag;->b(ILandroid/os/Bundle;Landroid/support/v4/app/ah;)Landroid/support/v4/a/c;

    goto :goto_0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 185
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/os/Bundle;)V

    .line 187
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 189
    const-class v0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->b:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    .line 190
    const-class v0, Lcom/facebook/l/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/l/k;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->c:Lcom/facebook/l/k;

    .line 191
    const-class v0, Lcom/facebook/contacts/a/c;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/a/c;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->d:Lcom/facebook/contacts/a/c;

    .line 192
    const-class v0, Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/e;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->e:Lcom/facebook/orca/contacts/divebar/e;

    .line 193
    const-class v0, Lcom/facebook/orca/contacts/divebar/ao;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/ao;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->h:Lcom/facebook/orca/contacts/divebar/ao;

    .line 194
    const-class v0, Lcom/facebook/contacts/a/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/a/d;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->f:Lcom/facebook/contacts/a/d;

    .line 195
    const-class v0, Lcom/facebook/orca/contacts/picker/az;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/picker/az;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->g:Lcom/facebook/orca/contacts/picker/az;

    .line 196
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsPartialAccount;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->Z:Ljavax/inject/a;

    .line 197
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsClientSmsEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ac:Ljavax/inject/a;

    .line 198
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsSmsReadPermitted;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ad:Ljavax/inject/a;

    .line 199
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/ShowGroupsSectionInDivebar;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ae:Ljavax/inject/a;

    .line 203
    const-class v0, Lcom/facebook/contacts/upload/c;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/upload/c;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ak:Lcom/facebook/contacts/upload/c;

    .line 204
    new-instance v0, Lcom/facebook/contacts/picker/bd;

    invoke-direct {v0}, Lcom/facebook/contacts/picker/bd;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->i:Lcom/facebook/contacts/picker/bd;

    .line 205
    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/k;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ai:Lcom/facebook/fbservice/ops/k;

    .line 206
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aj:Lcom/facebook/prefs/shared/d;

    .line 207
    const-class v0, Lcom/facebook/common/time/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->am:Lcom/facebook/common/time/a;

    .line 208
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ag:Lcom/facebook/c/s;

    .line 209
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ah:Lcom/facebook/analytics/av;

    .line 210
    const-class v0, Lcom/facebook/auth/b/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/b/b;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->al:Lcom/facebook/auth/b/b;

    .line 211
    const-class v0, Lcom/facebook/orca/threadlist/bf;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadlist/bf;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->an:Lcom/facebook/orca/threadlist/bf;

    .line 212
    const-class v0, Lcom/facebook/orca/contacts/divebar/bs;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/bs;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ao:Lcom/facebook/orca/contacts/divebar/bs;

    .line 213
    const-class v0, Lcom/facebook/orca/contacts/divebar/aa;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/aa;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ap:Lcom/facebook/orca/contacts/divebar/aa;

    .line 215
    const-class v0, Lcom/facebook/orca/contacts/divebar/ap;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/ap;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aq:Lcom/facebook/orca/contacts/divebar/ap;

    .line 216
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/contacts/annotations/IsChatContextEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->af:Ljavax/inject/a;

    .line 219
    new-instance v0, Lcom/facebook/orca/contacts/divebar/r;

    invoke-direct {v0, p0}, Lcom/facebook/orca/contacts/divebar/r;-><init>(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)V

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->au:Lcom/facebook/contacts/picker/v;

    .line 235
    new-instance v0, Lcom/facebook/orca/contacts/divebar/y;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/facebook/orca/contacts/divebar/y;-><init>(Lcom/facebook/orca/contacts/divebar/DivebarFragment;Lcom/facebook/orca/contacts/divebar/r;)V

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aL:Lcom/facebook/orca/contacts/divebar/y;

    .line 237
    const-class v0, Lcom/facebook/base/broadcast/j;

    const-class v2, Lcom/facebook/base/broadcast/LocalBroadcast;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/broadcast/j;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aJ:Lcom/facebook/base/broadcast/j;

    .line 241
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aJ:Lcom/facebook/base/broadcast/j;

    invoke-interface {v0}, Lcom/facebook/base/broadcast/j;->a()Lcom/facebook/base/broadcast/k;

    move-result-object v0

    sget-object v1, Lcom/facebook/backgroundlocation/status/d;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aL:Lcom/facebook/orca/contacts/divebar/y;

    invoke-interface {v0, v1, v2}, Lcom/facebook/base/broadcast/k;->a(Ljava/lang/String;Lcom/facebook/c/b;)Lcom/facebook/base/broadcast/k;

    move-result-object v0

    const-string v1, "com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED"

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aL:Lcom/facebook/orca/contacts/divebar/y;

    invoke-interface {v0, v1, v2}, Lcom/facebook/base/broadcast/k;->a(Ljava/lang/String;Lcom/facebook/c/b;)Lcom/facebook/base/broadcast/k;

    move-result-object v0

    const-string v1, "com.facebook.orca.presence.PRESENCE_MANAGER_SETTINGS_CHANGED"

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aL:Lcom/facebook/orca/contacts/divebar/y;

    invoke-interface {v0, v1, v2}, Lcom/facebook/base/broadcast/k;->a(Ljava/lang/String;Lcom/facebook/c/b;)Lcom/facebook/base/broadcast/k;

    move-result-object v0

    const-string v1, "com.facebook.orca.contacts.divebar.GROUP_MEGAPHONE_DISMISSED"

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aL:Lcom/facebook/orca/contacts/divebar/y;

    invoke-interface {v0, v1, v2}, Lcom/facebook/base/broadcast/k;->a(Ljava/lang/String;Lcom/facebook/c/b;)Lcom/facebook/base/broadcast/k;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/base/broadcast/k;->a()Lcom/facebook/base/broadcast/l;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aK:Lcom/facebook/base/broadcast/l;

    .line 256
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aK:Lcom/facebook/base/broadcast/l;

    invoke-interface {v0}, Lcom/facebook/base/broadcast/l;->b()V

    .line 258
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aq:Lcom/facebook/orca/contacts/divebar/ap;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/contacts/divebar/ap;->a(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)V

    .line 259
    return-void
.end method

.method public a(Lcom/facebook/orca/contacts/divebar/bl;)V
    .locals 2

    .prologue
    .line 564
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->at:Lcom/facebook/orca/contacts/divebar/bl;

    .line 565
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ar:Lcom/facebook/orca/contacts/divebar/be;

    if-eqz v0, :cond_0

    .line 566
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ar:Lcom/facebook/orca/contacts/divebar/be;

    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->at:Lcom/facebook/orca/contacts/divebar/bl;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/divebar/be;->setContactPickerViewListener(Lcom/facebook/orca/contacts/divebar/bl;)V

    .line 568
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aq:Lcom/facebook/orca/contacts/divebar/ap;

    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->at:Lcom/facebook/orca/contacts/divebar/bl;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/divebar/ap;->a(Lcom/facebook/orca/contacts/divebar/bl;)V

    .line 569
    return-void
.end method

.method public a(Lcom/facebook/orca/contacts/divebar/z;)V
    .locals 0

    .prologue
    .line 180
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aH:Lcom/facebook/orca/contacts/divebar/z;

    .line 181
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 572
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ar:Lcom/facebook/orca/contacts/divebar/be;

    if-eqz v0, :cond_0

    .line 573
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ar:Lcom/facebook/orca/contacts/divebar/be;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/contacts/divebar/be;->setSearchBoxText(Ljava/lang/String;)V

    .line 575
    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 1079
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ar:Lcom/facebook/orca/contacts/divebar/be;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/be;->a()V

    .line 1080
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 311
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->d(Landroid/os/Bundle;)V

    .line 313
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ao:Lcom/facebook/orca/contacts/divebar/bs;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/bs;->c()V

    .line 318
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->b:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-virtual {v0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->a()V

    .line 322
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->an:Lcom/facebook/orca/threadlist/bf;

    new-instance v1, Lcom/facebook/orca/contacts/divebar/t;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/divebar/t;-><init>(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/orca/threadlist/bi;)V

    .line 350
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "PARAM_SHOW_RECENT_THREADS"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aw:Z

    .line 352
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->f:Lcom/facebook/contacts/a/d;

    invoke-virtual {v0}, Lcom/facebook/contacts/a/d;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 353
    if-eqz v0, :cond_0

    .line 354
    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ax:Ljava/util/List;

    .line 357
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->e:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/e;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 358
    if-eqz v0, :cond_1

    .line 359
    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ay:Ljava/util/List;

    .line 362
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->e:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/e;->e()Lcom/google/common/a/es;

    move-result-object v0

    .line 363
    if-eqz v0, :cond_2

    .line 364
    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->az:Ljava/util/List;

    .line 367
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aa:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 368
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->e:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/e;->f()Lcom/google/common/a/es;

    move-result-object v0

    .line 369
    if-eqz v0, :cond_3

    .line 370
    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aA:Ljava/util/List;

    .line 374
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->e:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/e;->c()Lcom/google/common/a/es;

    move-result-object v0

    .line 375
    if-eqz v0, :cond_4

    .line 376
    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aB:Ljava/util/List;

    .line 379
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->e:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/e;->g()Lcom/google/common/a/es;

    move-result-object v0

    .line 380
    if-eqz v0, :cond_5

    .line 381
    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aD:Ljava/util/List;

    .line 385
    :cond_5
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->ar:Lcom/facebook/orca/contacts/divebar/be;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/be;->d()V

    .line 386
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->W()V

    .line 387
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->U()V

    .line 389
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->aK:Lcom/facebook/base/broadcast/l;

    invoke-interface {v0}, Lcom/facebook/base/broadcast/l;->b()V

    .line 390
    return-void
.end method
