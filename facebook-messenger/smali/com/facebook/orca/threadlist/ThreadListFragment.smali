.class public Lcom/facebook/orca/threadlist/ThreadListFragment;
.super Lcom/facebook/base/fragment/FbFragment;
.source "ThreadListFragment.java"

# interfaces
.implements Lcom/facebook/base/fragment/b;


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
.field private Z:Landroid/media/AudioManager;

.field private aA:Lcom/google/common/base/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Supplier",
            "<",
            "Lcom/facebook/orca/threadlist/q;",
            ">;"
        }
    .end annotation
.end field

.field private aB:Z

.field private aC:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/threads/FolderType;",
            ">;"
        }
    .end annotation
.end field

.field private aD:Lcom/facebook/orca/threads/FolderName;

.field private aE:Lcom/facebook/base/broadcast/q;

.field private aF:Lcom/facebook/orca/threadlist/bm;

.field private aG:J

.field private aH:Lcom/facebook/orca/threadlist/be;

.field private aI:I

.field private aJ:J

.field private aK:Lcom/facebook/fbservice/service/t;

.field private aL:Lcom/facebook/orca/threadview/do;

.field private aM:Lcom/facebook/base/fragment/c;

.field private aN:Ljava/lang/String;

.field private aO:Lcom/facebook/analytics/av;

.field private aP:Lcom/facebook/analytics/cg;

.field private aQ:Z

.field private aR:Landroid/os/Handler;

.field private aS:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private aT:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private aU:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private aa:Lcom/facebook/widget/titlebar/a;

.field private ab:Lcom/facebook/fbservice/ops/k;

.field private ac:Lcom/facebook/orca/threadlist/bf;

.field private ad:Lcom/facebook/orca/threads/q;

.field private ae:Landroid/support/v4/a/e;

.field private af:Lcom/facebook/orca/contacts/divebar/ao;

.field private ag:Lcom/facebook/c/s;

.field private ah:Lcom/facebook/auth/viewercontext/ViewerContext;

.field private ai:Lcom/facebook/b/a/b;

.field private aj:Lcom/facebook/orca/threadlist/i;

.field private ak:Lcom/facebook/orca/threadlist/c;

.field private al:Landroid/view/View;

.field private am:Landroid/view/View;

.field private an:Landroid/view/View;

.field private ao:Landroid/view/View;

.field private ap:Landroid/view/View;

.field private aq:Landroid/view/View;

.field private ar:Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;

.field private as:Lcom/facebook/orca/threadlist/bc;

.field private at:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private au:Landroid/support/v4/app/ah;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/app/ah",
            "<",
            "Lcom/facebook/orca/contacts/divebar/an;",
            ">;"
        }
    .end annotation
.end field

.field private av:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private aw:Lcom/facebook/widget/refreshablelistview/b;

.field private ax:Lcom/facebook/widget/listview/BetterListView;

.field private ay:Lcom/facebook/widget/listview/EmptyListViewItem;

.field private az:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

.field private b:Lcom/facebook/orca/f/k;

.field private c:Lcom/facebook/orca/notify/av;

.field private d:Lcom/facebook/orca/threadlist/af;

.field private e:Lcom/facebook/orca/f/b;

.field private f:Lcom/facebook/orca/f/x;

.field private g:Lcom/facebook/orca/common/ui/widgets/a;

.field private h:Lcom/facebook/ui/d/d;

.field private i:Lcom/facebook/orca/prefs/az;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 133
    const-class v0, Lcom/facebook/orca/threadlist/ThreadListFragment;

    sput-object v0, Lcom/facebook/orca/threadlist/ThreadListFragment;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 106
    invoke-direct {p0}, Lcom/facebook/base/fragment/FbFragment;-><init>()V

    .line 173
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->at:Lcom/google/common/a/es;

    .line 185
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aB:Z

    .line 191
    sget-object v0, Lcom/facebook/orca/threadlist/bf;->a:Lcom/facebook/orca/threadlist/bm;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aF:Lcom/facebook/orca/threadlist/bm;

    .line 192
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aG:J

    .line 196
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aI:I

    .line 907
    return-void
.end method

.method private O()V
    .locals 4

    .prologue
    .line 478
    new-instance v0, Lcom/facebook/orca/threadlist/ba;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadlist/ba;-><init>(Lcom/facebook/orca/threadlist/ThreadListFragment;)V

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->au:Landroid/support/v4/app/ah;

    .line 496
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->Q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 497
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->y()Landroid/support/v4/app/ag;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->au:Landroid/support/v4/app/ah;

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/ag;->a(ILandroid/os/Bundle;Landroid/support/v4/app/ah;)Landroid/support/v4/a/c;

    .line 499
    :cond_0
    return-void
.end method

.method private P()V
    .locals 2

    .prologue
    .line 567
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->y()Landroid/support/v4/app/ag;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ag;->a(I)Landroid/support/v4/a/c;

    move-result-object v0

    .line 568
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/support/v4/a/c;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 569
    invoke-virtual {v0}, Landroid/support/v4/a/c;->o()V

    .line 571
    :cond_0
    return-void
.end method

.method private Q()Z
    .locals 2

    .prologue
    .line 577
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->az:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->at:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    const/4 v1, 0x6

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private R()V
    .locals 1

    .prologue
    .line 669
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->b(Z)V

    .line 670
    return-void
.end method

.method private T()V
    .locals 1

    .prologue
    .line 673
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->b(Z)V

    .line 674
    return-void
.end method

.method private U()V
    .locals 1

    .prologue
    .line 729
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aF:Lcom/facebook/orca/threadlist/bm;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/bm;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 730
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aH:Lcom/facebook/orca/threadlist/be;

    if-eqz v0, :cond_0

    .line 731
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aH:Lcom/facebook/orca/threadlist/be;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/be;->a()V

    .line 733
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->V()V

    .line 747
    :cond_1
    :goto_0
    return-void

    .line 738
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ac:Lcom/facebook/orca/threadlist/bf;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/bf;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 743
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aH:Lcom/facebook/orca/threadlist/be;

    if-eqz v0, :cond_3

    .line 744
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aH:Lcom/facebook/orca/threadlist/be;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/be;->a()V

    .line 746
    :cond_3
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->V()V

    goto :goto_0
.end method

.method private V()V
    .locals 5

    .prologue
    const/16 v1, 0x8

    const/4 v2, 0x0

    .line 751
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aF:Lcom/facebook/orca/threadlist/bm;

    iget-object v0, v0, Lcom/facebook/orca/threadlist/bm;->a:Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadsCollection;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 752
    sget-object v0, Lcom/facebook/orca/threadlist/ak;->NONE:Lcom/facebook/orca/threadlist/ak;

    .line 759
    :goto_0
    iget-object v3, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ay:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v3, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 760
    iget-object v3, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->az:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    iget-object v4, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aF:Lcom/facebook/orca/threadlist/bm;

    invoke-virtual {v4}, Lcom/facebook/orca/threadlist/bm;->a()Z

    move-result v4

    if-eqz v4, :cond_0

    move v1, v2

    :cond_0
    invoke-virtual {v3, v1}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->setVisibility(I)V

    .line 761
    iget-object v1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->d:Lcom/facebook/orca/threadlist/af;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadlist/af;->a(Lcom/facebook/orca/threadlist/ak;)V

    .line 762
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->d:Lcom/facebook/orca/threadlist/af;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aF:Lcom/facebook/orca/threadlist/bm;

    iget-object v1, v1, Lcom/facebook/orca/threadlist/bm;->a:Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadsCollection;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/af;->a(Lcom/google/common/a/es;)V

    .line 763
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->d:Lcom/facebook/orca/threadlist/af;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/af;->notifyDataSetChanged()V

    .line 764
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aw:Lcom/facebook/widget/refreshablelistview/b;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aF:Lcom/facebook/orca/threadlist/bm;

    iget-wide v3, v1, Lcom/facebook/orca/threadlist/bm;->b:J

    invoke-interface {v0, v3, v4}, Lcom/facebook/widget/refreshablelistview/b;->setLastLoadedTime(J)V

    .line 765
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    new-instance v1, Lcom/facebook/orca/threadlist/bb;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/bb;-><init>(Lcom/facebook/orca/threadlist/ThreadListFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->post(Ljava/lang/Runnable;)Z

    .line 771
    iput-boolean v2, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aB:Z

    .line 772
    return-void

    .line 753
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aB:Z

    if-eqz v0, :cond_2

    .line 754
    sget-object v0, Lcom/facebook/orca/threadlist/ak;->LOAD_MORE:Lcom/facebook/orca/threadlist/ak;

    goto :goto_0

    .line 756
    :cond_2
    sget-object v0, Lcom/facebook/orca/threadlist/ak;->LOAD_MORE_PLACEHOLDER:Lcom/facebook/orca/threadlist/ak;

    goto :goto_0
.end method

.method private W()V
    .locals 5

    .prologue
    .line 819
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ah:Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/ViewerContext;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 835
    :goto_0
    return-void

    .line 822
    :cond_0
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v2

    .line 823
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/BetterListView;->getFirstVisiblePosition()I

    move-result v0

    .line 824
    iget-object v1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v1}, Lcom/facebook/widget/listview/BetterListView;->getLastVisiblePosition()I

    move-result v3

    move v1, v0

    .line 825
    :goto_1
    if-gt v1, v3, :cond_2

    .line 826
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->d:Lcom/facebook/orca/threadlist/af;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/af;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    .line 827
    instance-of v4, v0, Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v4, :cond_1

    .line 828
    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 829
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 825
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 832
    :cond_2
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.orca.THREADS_SHOWN_IN_LIST"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 833
    const-string v1, "threads"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 834
    iget-object v1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ae:Landroid/support/v4/a/e;

    invoke-virtual {v1, v0}, Landroid/support/v4/a/e;->a(Landroid/content/Intent;)Z

    goto :goto_0
.end method

.method private X()V
    .locals 6

    .prologue
    .line 867
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->av:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_1

    .line 901
    :cond_0
    :goto_0
    return-void

    .line 871
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->b:Lcom/facebook/orca/f/k;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aD:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/FolderCounts;

    move-result-object v0

    .line 872
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/FolderCounts;->b()I

    move-result v0

    if-eqz v0, :cond_0

    .line 876
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 877
    iget-wide v2, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aG:J

    sub-long v2, v0, v2

    const-wide/32 v4, 0xea60

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    .line 883
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 884
    const-string v3, "folderName"

    iget-object v4, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aD:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 885
    iget-object v3, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ab:Lcom/facebook/fbservice/ops/k;

    sget-object v4, Lcom/facebook/orca/server/aq;->s:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v3, v4, v2}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v2

    invoke-interface {v2}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->av:Lcom/google/common/d/a/s;

    .line 888
    iget-object v2, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->av:Lcom/google/common/d/a/s;

    new-instance v3, Lcom/facebook/orca/threadlist/as;

    invoke-direct {v3, p0}, Lcom/facebook/orca/threadlist/as;-><init>(Lcom/facebook/orca/threadlist/ThreadListFragment;)V

    invoke-static {v2, v3}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 900
    iput-wide v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aG:J

    goto :goto_0
.end method

.method private Y()V
    .locals 2

    .prologue
    .line 929
    iget-boolean v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aB:Z

    if-eqz v0, :cond_1

    .line 940
    :cond_0
    :goto_0
    return-void

    .line 932
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->d:Lcom/facebook/orca/threadlist/af;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/af;->getCount()I

    move-result v0

    .line 933
    if-lez v0, :cond_0

    iget v1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aI:I

    if-ne v1, v0, :cond_0

    .line 934
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->d:Lcom/facebook/orca/threadlist/af;

    iget v1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aI:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/af;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    .line 935
    sget-object v1, Lcom/facebook/orca/threadlist/af;->d:Ljava/lang/Object;

    if-eq v0, v1, :cond_2

    sget-object v1, Lcom/facebook/orca/threadlist/af;->c:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    .line 937
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ac:Lcom/facebook/orca/threadlist/bf;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/bf;->e()V

    goto :goto_0
.end method

.method private Z()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1004
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1005
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aN:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1006
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aN:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1009
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->n()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/analytics/d;

    if-eqz v0, :cond_2

    .line 1010
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 1011
    const-string v0, "_"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1013
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->n()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/d;

    invoke-interface {v0}, Lcom/facebook/analytics/d;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/analytics/f/a;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1014
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1017
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/ThreadListFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 106
    iput-object p1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->av:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/ThreadListFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 106
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->aa()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/fbservice/c/b;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 979
    const/4 v3, 0x0

    .line 980
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->n()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/base/activity/h;

    if-eqz v0, :cond_0

    .line 981
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->n()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/activity/h;

    invoke-interface {v0}, Lcom/facebook/base/activity/h;->h()Ljava/lang/String;

    move-result-object v3

    .line 984
    :cond_0
    sget-object v1, Lcom/facebook/analytics/ch;->UNDEFINED:Lcom/facebook/analytics/ch;

    .line 986
    sget-object v0, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    if-ne p1, v0, :cond_2

    .line 987
    sget-object v1, Lcom/facebook/analytics/ch;->NETWORK_DATA:Lcom/facebook/analytics/ch;

    .line 996
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aP:Lcom/facebook/analytics/cg;

    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->Z()Ljava/lang/String;

    move-result-object v2

    const-wide/16 v4, -0x1

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/analytics/cg;->a(Lcom/facebook/analytics/ch;Ljava/lang/String;Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 998
    const-string v1, "load_type"

    invoke-virtual {v0, v1, p2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 1000
    iget-object v1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aO:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 1001
    return-void

    .line 988
    :cond_2
    sget-object v0, Lcom/facebook/fbservice/c/b;->FROM_CACHE_STALE:Lcom/facebook/fbservice/c/b;

    if-eq p1, v0, :cond_3

    sget-object v0, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

    if-eq p1, v0, :cond_3

    sget-object v0, Lcom/facebook/fbservice/c/b;->FROM_CACHE_INCOMPLETE:Lcom/facebook/fbservice/c/b;

    if-ne p1, v0, :cond_4

    .line 991
    :cond_3
    sget-object v1, Lcom/facebook/analytics/ch;->LOCAL_DATA:Lcom/facebook/analytics/ch;

    goto :goto_0

    .line 992
    :cond_4
    sget-object v0, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-ne p1, v0, :cond_1

    .line 993
    sget-object v1, Lcom/facebook/analytics/ch;->NO_DATA:Lcom/facebook/analytics/ch;

    goto :goto_0
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 719
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    const/16 v1, 0x50

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/widgets/a;->a(I)V

    .line 720
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    const-wide/16 v1, 0x1388

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/common/ui/widgets/a;->a(J)V

    .line 721
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/common/ui/widgets/a;->a(Z)V

    .line 722
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    sget v1, Lcom/facebook/i;->error_toast_dock:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadlist/ThreadListFragment;->d(I)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->h:Lcom/facebook/ui/d/d;

    const/4 v3, 0x0

    invoke-virtual {v2, p1, v3, v4}, Lcom/facebook/ui/d/d;->a(Lcom/facebook/fbservice/service/ServiceException;ZZ)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/common/ui/widgets/d;->WARNING:Lcom/facebook/orca/common/ui/widgets/d;

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/orca/common/ui/widgets/a;->a(Landroid/view/View;Ljava/lang/CharSequence;Lcom/facebook/orca/common/ui/widgets/d;)V

    .line 726
    return-void
.end method

.method private a(Lcom/facebook/orca/contacts/divebar/an;)V
    .locals 8

    .prologue
    const/4 v0, 0x1

    .line 523
    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->at:Lcom/google/common/a/es;

    invoke-virtual {v1}, Lcom/google/common/a/es;->size()I

    move-result v1

    const/4 v2, 0x6

    if-lt v1, v2, :cond_1

    .line 564
    :cond_0
    :goto_0
    return-void

    .line 527
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->a()Lcom/google/common/a/es;

    move-result-object v2

    .line 528
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->c()Lcom/google/common/a/es;

    move-result-object v3

    .line 529
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->d()Lcom/google/common/a/es;

    move-result-object v4

    .line 534
    const/4 v1, 0x0

    .line 536
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 537
    invoke-static {}, Lcom/google/common/a/fi;->e()Lcom/google/common/a/fk;

    move-result-object v6

    .line 539
    iget-object v7, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->at:Lcom/google/common/a/es;

    invoke-direct {p0, v5, v7, v6}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Ljava/util/Set;Ljava/lang/Iterable;Lcom/google/common/a/fk;)V

    .line 541
    if-eqz v2, :cond_2

    .line 543
    invoke-direct {p0, v5, v2, v6}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Ljava/util/Set;Ljava/lang/Iterable;Lcom/google/common/a/fk;)V

    move v1, v0

    .line 545
    :cond_2
    if-eqz v3, :cond_3

    .line 547
    invoke-direct {p0, v5, v3, v6}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Ljava/util/Set;Ljava/lang/Iterable;Lcom/google/common/a/fk;)V

    move v1, v0

    .line 549
    :cond_3
    if-eqz v4, :cond_4

    .line 551
    invoke-direct {p0, v5, v4, v6}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Ljava/util/Set;Ljava/lang/Iterable;Lcom/google/common/a/fk;)V

    .line 554
    :goto_1
    if-eqz v0, :cond_0

    .line 558
    invoke-virtual {v6}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->h()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->at:Lcom/google/common/a/es;

    .line 559
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->az:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->at:Lcom/google/common/a/es;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->setSuggestedContacts(Lcom/google/common/a/es;)V

    .line 561
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->Q()Z

    move-result v0

    if-nez v0, :cond_0

    .line 562
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->P()V

    goto :goto_0

    :cond_4
    move v0, v1

    goto :goto_1
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/ThreadListFragment;I)V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/ThreadListFragment;->e(I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/ThreadListFragment;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/ThreadListFragment;->b(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/ThreadListFragment;Lcom/facebook/orca/contacts/divebar/an;)V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Lcom/facebook/orca/contacts/divebar/an;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/ThreadListFragment;Lcom/facebook/orca/threadlist/bk;)V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Lcom/facebook/orca/threadlist/bk;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/ThreadListFragment;Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bj;)V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bj;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/ThreadListFragment;Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bm;)V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bm;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/ThreadListFragment;Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/ThreadListFragment;->e(Lcom/facebook/orca/threads/ThreadSummary;)V

    return-void
.end method

.method private a(Lcom/facebook/orca/threadlist/bj;)V
    .locals 7

    .prologue
    .line 1052
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 1053
    iget-object v2, p1, Lcom/facebook/orca/threadlist/bj;->a:Lcom/facebook/fbservice/service/ServiceException;

    invoke-virtual {v2}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v2

    .line 1055
    iget-wide v3, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aJ:J

    sub-long v3, v0, v3

    const-wide/32 v5, 0x493e0

    cmp-long v3, v3, v5

    if-gez v3, :cond_1

    iget-object v3, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aK:Lcom/facebook/fbservice/service/t;

    if-ne v3, v2, :cond_1

    iget-boolean v3, p1, Lcom/facebook/orca/threadlist/bj;->b:Z

    if-nez v3, :cond_1

    .line 1068
    :cond_0
    :goto_0
    return-void

    .line 1061
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->v()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1065
    iget-object v3, p1, Lcom/facebook/orca/threadlist/bj;->a:Lcom/facebook/fbservice/service/ServiceException;

    invoke-direct {p0, v3}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    .line 1066
    iput-wide v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aJ:J

    .line 1067
    iput-object v2, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aK:Lcom/facebook/fbservice/service/t;

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/threadlist/bk;)V
    .locals 3

    .prologue
    .line 943
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/widgets/a;->a()V

    .line 944
    sget-object v0, Lcom/facebook/orca/threadlist/bk;->THREAD_LIST:Lcom/facebook/orca/threadlist/bk;

    if-ne p1, v0, :cond_3

    .line 945
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aF:Lcom/facebook/orca/threadlist/bm;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/bm;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 946
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ay:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/o;->thread_list_loading:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    .line 947
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ay:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 948
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ay:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 950
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->az:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->setVisibility(I)V

    .line 951
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ac:Lcom/facebook/orca/threadlist/bf;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/bf;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 952
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aw:Lcom/facebook/widget/refreshablelistview/b;

    invoke-interface {v0}, Lcom/facebook/widget/refreshablelistview/b;->a()V

    .line 954
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->ab()V

    .line 959
    :cond_2
    :goto_0
    return-void

    .line 955
    :cond_3
    sget-object v0, Lcom/facebook/orca/threadlist/bk;->MORE_THREADS:Lcom/facebook/orca/threadlist/bk;

    if-ne p1, v0, :cond_2

    .line 956
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->d:Lcom/facebook/orca/threadlist/af;

    sget-object v1, Lcom/facebook/orca/threadlist/ak;->LOADING:Lcom/facebook/orca/threadlist/ak;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/af;->a(Lcom/facebook/orca/threadlist/ak;)V

    .line 957
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->d:Lcom/facebook/orca/threadlist/af;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/af;->notifyDataSetChanged()V

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bj;)V
    .locals 2

    .prologue
    .line 1029
    sget-object v0, Lcom/facebook/orca/threadlist/bk;->THREAD_LIST:Lcom/facebook/orca/threadlist/bk;

    if-ne p1, v0, :cond_1

    .line 1030
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aw:Lcom/facebook/widget/refreshablelistview/b;

    invoke-interface {v0}, Lcom/facebook/widget/refreshablelistview/b;->b()V

    .line 1031
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->ac()V

    .line 1032
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ay:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    .line 1033
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ay:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 1034
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->az:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->setVisibility(I)V

    .line 1035
    invoke-direct {p0, p2}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Lcom/facebook/orca/threadlist/bj;)V

    .line 1041
    :cond_0
    :goto_0
    return-void

    .line 1036
    :cond_1
    sget-object v0, Lcom/facebook/orca/threadlist/bk;->MORE_THREADS:Lcom/facebook/orca/threadlist/bk;

    if-ne p1, v0, :cond_0

    .line 1037
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aB:Z

    .line 1038
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->d:Lcom/facebook/orca/threadlist/af;

    sget-object v1, Lcom/facebook/orca/threadlist/ak;->LOAD_MORE:Lcom/facebook/orca/threadlist/ak;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/af;->a(Lcom/facebook/orca/threadlist/ak;)V

    .line 1039
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->d:Lcom/facebook/orca/threadlist/af;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/af;->notifyDataSetChanged()V

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bm;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 962
    iput-object p2, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aF:Lcom/facebook/orca/threadlist/bm;

    .line 963
    sget-object v0, Lcom/facebook/orca/threadlist/bk;->MORE_THREADS:Lcom/facebook/orca/threadlist/bk;

    if-ne p1, v0, :cond_0

    .line 964
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0, v1, v1}, Lcom/facebook/widget/listview/BetterListView;->smoothScrollBy(II)V

    .line 966
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->U()V

    .line 968
    iget-object v0, p2, Lcom/facebook/orca/threadlist/bm;->d:Lcom/facebook/fbservice/c/b;

    invoke-virtual {p1}, Lcom/facebook/orca/threadlist/bk;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Lcom/facebook/fbservice/c/b;Ljava/lang/String;)V

    .line 969
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 706
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/BetterListView;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 708
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 709
    instance-of v2, v0, Lcom/facebook/orca/threadlist/q;

    if-eqz v2, :cond_0

    .line 710
    check-cast v0, Lcom/facebook/orca/threadlist/q;

    .line 711
    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/q;->getThreadId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 712
    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/q;->a()V

    .line 706
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 716
    :cond_1
    return-void
.end method

.method private a(Ljava/util/Set;Ljava/lang/Iterable;Lcom/google/common/a/fk;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Iterable",
            "<",
            "Lcom/facebook/user/User;",
            ">;",
            "Lcom/google/common/a/fk",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 511
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 512
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/user/UserKey;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 513
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/user/UserKey;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 514
    invoke-virtual {p3, v0}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    goto :goto_0

    .line 517
    :cond_1
    return-void
.end method

.method private aa()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1021
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aN:Ljava/lang/String;

    const-string v1, "messages_jewel"

    if-ne v0, v1, :cond_0

    .line 1022
    const-string v0, "tap_messages_jewel"

    .line 1025
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "tap_conversation_thread"

    goto :goto_0
.end method

.method private ab()V
    .locals 2

    .prologue
    .line 1087
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aa:Lcom/facebook/widget/titlebar/a;

    if-nez v0, :cond_1

    .line 1094
    :cond_0
    :goto_0
    return-void

    .line 1090
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ac:Lcom/facebook/orca/threadlist/bf;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/bf;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ac:Lcom/facebook/orca/threadlist/bf;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/bf;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1092
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aa:Lcom/facebook/widget/titlebar/a;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->a(Z)V

    goto :goto_0
.end method

.method private ac()V
    .locals 2

    .prologue
    .line 1100
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aa:Lcom/facebook/widget/titlebar/a;

    if-eqz v0, :cond_0

    .line 1101
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aa:Lcom/facebook/widget/titlebar/a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->a(Z)V

    .line 1103
    :cond_0
    return-void
.end method

.method private ad()V
    .locals 3

    .prologue
    .line 1163
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->ag()Landroid/content/Intent;

    move-result-object v0

    .line 1164
    const-string v1, "trigger"

    const-string v2, "context_menu_thread_list_group_button"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1165
    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Landroid/content/Intent;)V

    .line 1166
    return-void
.end method

.method private ae()V
    .locals 3

    .prologue
    .line 1169
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->ag()Landroid/content/Intent;

    move-result-object v0

    .line 1170
    const-string v1, "trigger"

    const-string v2, "context_menu_thread_list_message_button"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1171
    const-string v1, "disable_create_thread_suggestions"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1172
    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Landroid/content/Intent;)V

    .line 1173
    return-void
.end method

.method private af()V
    .locals 3

    .prologue
    .line 1176
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->l()Landroid/support/v4/app/i;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Landroid/content/Intent;)V

    .line 1177
    return-void
.end method

.method private ag()Landroid/content/Intent;
    .locals 3

    .prologue
    .line 1180
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->l()Landroid/support/v4/app/i;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1181
    sget-object v1, Lcom/facebook/orca/creation/CreateThreadActivity;->r:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1182
    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/threadlist/ThreadListFragment;I)I
    .locals 0

    .prologue
    .line 106
    iput p1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aI:I

    return p1
.end method

.method static synthetic b(Lcom/facebook/orca/threadlist/ThreadListFragment;)Lcom/facebook/analytics/av;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aO:Lcom/facebook/analytics/av;

    return-object v0
.end method

.method private b(Landroid/content/Intent;)V
    .locals 4

    .prologue
    const-wide/16 v2, -0x1

    .line 285
    const-string v0, "com.facebook.orca.ACTION_SMS_ENABLED_CHANGED"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 286
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->R()V

    .line 309
    :cond_0
    :goto_0
    return-void

    .line 287
    :cond_1
    const-string v0, "com.facebook.orca.ACTION_READ_THREAD_FOR_UI"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 288
    const-string v0, "threadid"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 289
    if-eqz v0, :cond_0

    .line 290
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 292
    :cond_2
    const-string v0, "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 293
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->R()V

    goto :goto_0

    .line 294
    :cond_3
    const-string v0, "com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 295
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->Q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 296
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->y()Landroid/support/v4/app/ag;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->au:Landroid/support/v4/app/ah;

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/ag;->b(ILandroid/os/Bundle;Landroid/support/v4/app/ah;)Landroid/support/v4/a/c;

    goto :goto_0

    .line 302
    :cond_4
    const-string v0, "actionid"

    invoke-virtual {p1, v0, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    .line 303
    cmp-long v2, v0, v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aF:Lcom/facebook/orca/threadlist/bm;

    invoke-virtual {v2}, Lcom/facebook/orca/threadlist/bm;->a()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 304
    :cond_5
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->R()V

    goto :goto_0

    .line 305
    :cond_6
    iget-object v2, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aF:Lcom/facebook/orca/threadlist/bm;

    iget-wide v2, v2, Lcom/facebook/orca/threadlist/bm;->c:J

    cmp-long v0, v2, v0

    if-gez v0, :cond_0

    .line 306
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->R()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/threadlist/ThreadListFragment;Lcom/facebook/orca/threadlist/bk;)V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/ThreadListFragment;->b(Lcom/facebook/orca/threadlist/bk;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/threadlist/ThreadListFragment;Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bj;)V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadlist/ThreadListFragment;->b(Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bj;)V

    return-void
.end method

.method private b(Lcom/facebook/orca/threadlist/bk;)V
    .locals 1

    .prologue
    .line 972
    sget-object v0, Lcom/facebook/orca/threadlist/bk;->THREAD_LIST:Lcom/facebook/orca/threadlist/bk;

    if-ne p1, v0, :cond_0

    .line 973
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aw:Lcom/facebook/widget/refreshablelistview/b;

    invoke-interface {v0}, Lcom/facebook/widget/refreshablelistview/b;->b()V

    .line 974
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->ac()V

    .line 976
    :cond_0
    return-void
.end method

.method private b(Lcom/facebook/orca/threadlist/bk;Lcom/facebook/orca/threadlist/bj;)V
    .locals 1

    .prologue
    .line 1046
    sget-object v0, Lcom/facebook/orca/threadlist/bk;->THREAD_LIST:Lcom/facebook/orca/threadlist/bk;

    if-ne p1, v0, :cond_0

    .line 1047
    invoke-direct {p0, p2}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Lcom/facebook/orca/threadlist/bj;)V

    .line 1049
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 806
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "click"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "thread"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 810
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->Z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 811
    iget-object v1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aO:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 812
    return-void
.end method

.method private b(Z)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 678
    if-eqz p1, :cond_0

    .line 679
    new-instance v0, Lcom/facebook/orca/threadlist/bl;

    invoke-direct {v0, v2, v2}, Lcom/facebook/orca/threadlist/bl;-><init>(ZZ)V

    move-object v1, v0

    .line 689
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aC:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderType;

    invoke-static {v0}, Lcom/facebook/orca/threads/FolderName;->a(Lcom/facebook/orca/threads/FolderType;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aD:Lcom/facebook/orca/threads/FolderName;

    .line 690
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ac:Lcom/facebook/orca/threadlist/bf;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aD:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/orca/threads/FolderName;)V

    .line 691
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ac:Lcom/facebook/orca/threadlist/bf;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/orca/threadlist/bl;)V

    .line 692
    return-void

    .line 684
    :cond_0
    new-instance v0, Lcom/facebook/orca/threadlist/bl;

    invoke-direct {v0, v1, v1}, Lcom/facebook/orca/threadlist/bl;-><init>(ZZ)V

    move-object v1, v0

    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/orca/threadlist/ThreadListFragment;)Landroid/media/AudioManager;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->Z:Landroid/media/AudioManager;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1157
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aO:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "opt_menu_item"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 1160
    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/threadlist/ThreadListFragment;)Lcom/facebook/orca/threadlist/bc;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->as:Lcom/facebook/orca/threadlist/bc;

    return-object v0
.end method

.method static synthetic d()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 106
    sget-object v0, Lcom/facebook/orca/threadlist/ThreadListFragment;->a:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/orca/threadlist/ThreadListFragment;)Lcom/facebook/orca/contacts/divebar/ao;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->af:Lcom/facebook/orca/contacts/divebar/ao;

    return-object v0
.end method

.method private e(I)V
    .locals 4

    .prologue
    .line 775
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->d:Lcom/facebook/orca/threadlist/af;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threadlist/af;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    .line 776
    instance-of v1, v0, Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v1, :cond_1

    .line 777
    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 779
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 780
    const-string v2, "thread_id"

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 781
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->b(Ljava/lang/String;)V

    .line 782
    const-string v0, "trigger"

    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->Z()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 783
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aM:Lcom/facebook/base/fragment/c;

    invoke-interface {v0, p0, v1}, Lcom/facebook/base/fragment/c;->a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    .line 787
    :cond_0
    :goto_0
    return-void

    .line 784
    :cond_1
    sget-object v1, Lcom/facebook/orca/threadlist/af;->d:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    .line 785
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ac:Lcom/facebook/orca/threadlist/bf;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/bf;->e()V

    goto :goto_0
.end method

.method private e(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 1

    .prologue
    .line 862
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->f:Lcom/facebook/orca/f/x;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/x;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 863
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->V()V

    .line 864
    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/threadlist/ThreadListFragment;)V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->W()V

    return-void
.end method

.method static synthetic g(Lcom/facebook/orca/threadlist/ThreadListFragment;)Lcom/facebook/b/a/b;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ai:Lcom/facebook/b/a/b;

    return-object v0
.end method

.method static synthetic h(Lcom/facebook/orca/threadlist/ThreadListFragment;)V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->Y()V

    return-void
.end method

.method static synthetic i(Lcom/facebook/orca/threadlist/ThreadListFragment;)Lcom/facebook/orca/threadlist/be;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aH:Lcom/facebook/orca/threadlist/be;

    return-object v0
.end method


# virtual methods
.method public A()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 595
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->A()V

    .line 596
    sget-object v0, Lcom/facebook/orca/threadlist/ThreadListFragment;->a:Ljava/lang/Class;

    const-string v1, "ThreadListFragment.onResume"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 598
    iget-boolean v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aQ:Z

    if-eqz v0, :cond_2

    .line 602
    iput-boolean v3, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aQ:Z

    .line 603
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->w()Z

    move-result v0

    if-nez v0, :cond_0

    .line 605
    sget-object v0, Lcom/facebook/orca/threadlist/ThreadListFragment;->a:Ljava/lang/Class;

    const-string v1, "clear all notifications"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 606
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->c:Lcom/facebook/orca/notify/av;

    invoke-virtual {v0}, Lcom/facebook/orca/notify/av;->b()V

    .line 608
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->T()V

    .line 613
    :goto_0
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->Q()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 615
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->y()Landroid/support/v4/app/ag;

    move-result-object v0

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->au:Landroid/support/v4/app/ah;

    invoke-virtual {v0, v3, v1, v2}, Landroid/support/v4/app/ag;->b(ILandroid/os/Bundle;Landroid/support/v4/app/ah;)Landroid/support/v4/a/c;

    .line 623
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->az:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 624
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->az:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->b()V

    .line 628
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aE:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->a()V

    .line 629
    return-void

    .line 610
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->R()V

    goto :goto_0

    .line 620
    :cond_3
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->P()V

    goto :goto_1
.end method

.method public B()V
    .locals 2

    .prologue
    .line 633
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->B()V

    .line 634
    sget-object v0, Lcom/facebook/orca/threadlist/ThreadListFragment;->a:Ljava/lang/Class;

    const-string v1, "ThreadListFragment.onPause"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 635
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/widgets/a;->a()V

    .line 636
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aE:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->b()V

    .line 637
    return-void
.end method

.method public C()V
    .locals 1

    .prologue
    .line 583
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->C()V

    .line 584
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    if-eqz v0, :cond_0

    .line 585
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/widgets/a;->a()V

    .line 587
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ac:Lcom/facebook/orca/threadlist/bf;

    if-eqz v0, :cond_1

    .line 588
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ac:Lcom/facebook/orca/threadlist/bf;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/bf;->a()V

    .line 590
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aE:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->b()V

    .line 591
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 316
    sget v0, Lcom/facebook/k;->orca_thread_list_fragment:I

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 317
    sget v0, Lcom/facebook/i;->threadlist_container:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/refreshablelistview/b;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aw:Lcom/facebook/widget/refreshablelistview/b;

    .line 319
    sget v0, Lcom/facebook/i;->thread_list:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/BetterListView;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    .line 320
    sget v0, Lcom/facebook/i;->thread_list_loading_view:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/EmptyListViewItem;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ay:Lcom/facebook/widget/listview/EmptyListViewItem;

    .line 321
    sget v0, Lcom/facebook/i;->thread_list_empty_item:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->az:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    .line 322
    sget v0, Lcom/facebook/i;->publisher:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aq:Landroid/view/View;

    .line 323
    sget v0, Lcom/facebook/k;->threadlist_publisher_placeholder:I

    iget-object v2, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {p1, v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 324
    iget-object v2, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v2, v0}, Lcom/facebook/widget/listview/BetterListView;->addHeaderView(Landroid/view/View;)V

    .line 325
    sget v0, Lcom/facebook/i;->message_button:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->al:Landroid/view/View;

    .line 326
    sget v0, Lcom/facebook/i;->group_button:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->am:Landroid/view/View;

    .line 327
    sget v0, Lcom/facebook/i;->broadcast_button:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ap:Landroid/view/View;

    .line 328
    sget v0, Lcom/facebook/i;->group_broadcast_divider:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->an:Landroid/view/View;

    .line 329
    sget v0, Lcom/facebook/i;->message_group_divider:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ao:Landroid/view/View;

    .line 330
    sget v0, Lcom/facebook/i;->install_messenger_chat_head_promo_view:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ar:Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;

    .line 332
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aj:Lcom/facebook/orca/threadlist/i;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    iget-object v3, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aq:Landroid/view/View;

    iget-object v4, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aq:Landroid/view/View;

    invoke-virtual {v0, v2, v3, v4}, Lcom/facebook/orca/threadlist/i;->a(Lcom/facebook/widget/listview/BetterListView;Landroid/view/View;Landroid/view/View;)V

    .line 333
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    check-cast v0, Lcom/facebook/orca/threadlist/bo;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aj:Lcom/facebook/orca/threadlist/i;

    invoke-interface {v0, v2}, Lcom/facebook/orca/threadlist/bo;->setPublisherController(Lcom/facebook/orca/threadlist/i;)V

    .line 334
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Landroid/view/View;)V

    .line 335
    return-object v1
.end method

.method a()V
    .locals 0

    .prologue
    .line 656
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->T()V

    .line 657
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 220
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/os/Bundle;)V

    .line 222
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 223
    const-class v0, Lcom/facebook/orca/f/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->b:Lcom/facebook/orca/f/k;

    .line 224
    const-class v0, Lcom/facebook/orca/notify/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/av;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->c:Lcom/facebook/orca/notify/av;

    .line 225
    const-class v0, Lcom/facebook/orca/threadlist/af;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadlist/af;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->d:Lcom/facebook/orca/threadlist/af;

    .line 226
    const-class v0, Lcom/facebook/orca/f/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/b;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->e:Lcom/facebook/orca/f/b;

    .line 227
    const-class v0, Lcom/facebook/orca/f/x;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/x;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->f:Lcom/facebook/orca/f/x;

    .line 228
    const-class v0, Lcom/facebook/orca/common/ui/widgets/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/a;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    .line 229
    const-class v0, Lcom/facebook/ui/d/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/d/d;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->h:Lcom/facebook/ui/d/d;

    .line 230
    const-class v0, Lcom/facebook/orca/prefs/az;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/prefs/az;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->i:Lcom/facebook/orca/prefs/az;

    .line 231
    const-class v0, Landroid/media/AudioManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->Z:Landroid/media/AudioManager;

    .line 232
    const-class v0, Lcom/facebook/orca/threads/FolderType;

    const-class v2, Lcom/facebook/orca/annotations/CurrentFolder;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aC:Ljavax/inject/a;

    .line 233
    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/k;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ab:Lcom/facebook/fbservice/ops/k;

    .line 234
    const-class v0, Lcom/facebook/orca/threadview/do;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/do;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aL:Lcom/facebook/orca/threadview/do;

    .line 235
    const-class v0, Lcom/facebook/orca/threadlist/bf;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadlist/bf;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ac:Lcom/facebook/orca/threadlist/bf;

    .line 236
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->S()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v2, Lcom/facebook/orca/threads/q;

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/q;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ad:Lcom/facebook/orca/threads/q;

    .line 237
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aO:Lcom/facebook/analytics/av;

    .line 238
    new-instance v0, Lcom/facebook/analytics/cg;

    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/facebook/analytics/cg;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aP:Lcom/facebook/analytics/cg;

    .line 239
    const-class v0, Landroid/support/v4/a/e;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/e;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ae:Landroid/support/v4/a/e;

    .line 240
    const-class v0, Lcom/facebook/orca/contacts/divebar/ao;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/ao;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->af:Lcom/facebook/orca/contacts/divebar/ao;

    .line 241
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ag:Lcom/facebook/c/s;

    .line 242
    const-class v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ah:Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 243
    const-class v0, Lcom/facebook/b/a/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/b/a/b;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ai:Lcom/facebook/b/a/b;

    .line 244
    const-class v0, Lcom/facebook/orca/threadlist/i;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadlist/i;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aj:Lcom/facebook/orca/threadlist/i;

    .line 245
    const-class v0, Lcom/facebook/orca/threadlist/c;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadlist/c;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ak:Lcom/facebook/orca/threadlist/c;

    .line 246
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsBroadcastEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aS:Ljavax/inject/a;

    .line 248
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/ShowThirdButtonInThreadList;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aT:Ljavax/inject/a;

    .line 250
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/WillShowInstallMessengerChatHeadPromo;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aU:Ljavax/inject/a;

    .line 253
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aR:Landroid/os/Handler;

    .line 255
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aA:Lcom/google/common/base/Supplier;

    if-eqz v0, :cond_0

    .line 256
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->d:Lcom/facebook/orca/threadlist/af;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aA:Lcom/google/common/base/Supplier;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadlist/af;->a(Lcom/google/common/base/Supplier;)V

    .line 259
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->n()Landroid/content/Context;

    move-result-object v0

    .line 261
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 262
    const-string v3, "com.facebook.orca.ACTION_THREAD_UPDATED_FOR_UI"

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 263
    const-string v3, "com.facebook.orca.ACTION_READ_THREAD_FOR_UI"

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 264
    const-string v3, "com.facebook.orca.ACTION_REMOVED_THREAD_FOR_UI"

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 265
    const-string v3, "com.facebook.orca.ACTION_SMS_ENABLED_CHANGED"

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 266
    const-string v3, "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED"

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 267
    const-string v3, "com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED"

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 268
    new-instance v3, Lcom/facebook/orca/threadlist/ao;

    invoke-direct {v3, p0, v0, v2}, Lcom/facebook/orca/threadlist/ao;-><init>(Lcom/facebook/orca/threadlist/ThreadListFragment;Landroid/content/Context;Landroid/content/IntentFilter;)V

    iput-object v3, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aE:Lcom/facebook/base/broadcast/q;

    .line 275
    const-class v0, Lcom/facebook/orca/a/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/a/d;

    .line 277
    sget-object v1, Lcom/facebook/orca/threadlist/ThreadListFragment;->a:Ljava/lang/Class;

    const-string v2, "checking group name upsell type"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 278
    invoke-virtual {v0}, Lcom/facebook/orca/a/d;->c()Lcom/facebook/orca/a/g;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/a/g;->UNINITIALIZED:Lcom/facebook/orca/a/g;

    if-ne v1, v2, :cond_1

    .line 279
    sget-object v1, Lcom/facebook/orca/threadlist/ThreadListFragment;->a:Ljava/lang/Class;

    const-string v2, "initializing group name upsell types"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 280
    invoke-virtual {v0}, Lcom/facebook/orca/a/d;->b()V

    .line 282
    :cond_1
    return-void
.end method

.method public a(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 3

    .prologue
    .line 1107
    invoke-super {p0, p1, p2}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 1108
    sget v0, Lcom/facebook/l;->thread_list_fragment_menu:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 1109
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ak:Lcom/facebook/orca/threadlist/c;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/c;->a()Lcom/facebook/orca/threadlist/e;

    move-result-object v1

    .line 1111
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ak:Lcom/facebook/orca/threadlist/c;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/c;->b()V

    .line 1113
    iget-object v0, v1, Lcom/facebook/orca/threadlist/e;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/common/base/Strings;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1114
    sget v0, Lcom/facebook/i;->send_message:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v2, v1, Lcom/facebook/orca/threadlist/e;->a:Ljava/lang/String;

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 1119
    :goto_0
    iget-object v0, v1, Lcom/facebook/orca/threadlist/e;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/common/base/Strings;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1120
    sget v0, Lcom/facebook/i;->create_group:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v2, v1, Lcom/facebook/orca/threadlist/e;->b:Ljava/lang/String;

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 1125
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aS:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, v1, Lcom/facebook/orca/threadlist/e;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/common/base/Strings;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1126
    sget v0, Lcom/facebook/i;->broadcast:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, v1, Lcom/facebook/orca/threadlist/e;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 1130
    :goto_2
    return-void

    .line 1116
    :cond_0
    sget v0, Lcom/facebook/i;->send_message:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->removeItem(I)V

    goto :goto_0

    .line 1122
    :cond_1
    sget v0, Lcom/facebook/i;->create_group:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->removeItem(I)V

    goto :goto_1

    .line 1128
    :cond_2
    sget v0, Lcom/facebook/i;->broadcast:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->removeItem(I)V

    goto :goto_2
.end method

.method public a(Lcom/facebook/base/fragment/c;)V
    .locals 0

    .prologue
    .line 648
    iput-object p1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aM:Lcom/facebook/base/fragment/c;

    .line 649
    return-void
.end method

.method public a(Lcom/facebook/orca/threadlist/bc;)V
    .locals 0

    .prologue
    .line 474
    iput-object p1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->as:Lcom/facebook/orca/threadlist/bc;

    .line 475
    return-void
.end method

.method public a(Lcom/facebook/orca/threadlist/be;)V
    .locals 0

    .prologue
    .line 904
    iput-object p1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aH:Lcom/facebook/orca/threadlist/be;

    .line 905
    return-void
.end method

.method public a(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 4

    .prologue
    .line 790
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.MAIN"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 791
    const-string v1, "android.intent.category.HOME"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 792
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 793
    iget-object v1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ag:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 796
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aR:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 797
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aR:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/orca/threadlist/ap;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/threadlist/ap;-><init>(Lcom/facebook/orca/threadlist/ThreadListFragment;Lcom/facebook/orca/threads/ThreadSummary;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 803
    return-void
.end method

.method public a(Lcom/facebook/widget/titlebar/a;)V
    .locals 0

    .prologue
    .line 1080
    iput-object p1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aa:Lcom/facebook/widget/titlebar/a;

    .line 1081
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 643
    iput-boolean p1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aQ:Z

    .line 644
    return-void
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 1134
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    .line 1135
    sget v2, Lcom/facebook/i;->refresh:I

    if-ne v1, v2, :cond_0

    .line 1136
    const-string v1, "refresh"

    invoke-direct {p0, v1}, Lcom/facebook/orca/threadlist/ThreadListFragment;->c(Ljava/lang/String;)V

    .line 1137
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a()V

    .line 1152
    :goto_0
    return v0

    .line 1139
    :cond_0
    sget v2, Lcom/facebook/i;->create_group:I

    if-ne v1, v2, :cond_1

    .line 1140
    const-string v1, "create group"

    invoke-direct {p0, v1}, Lcom/facebook/orca/threadlist/ThreadListFragment;->c(Ljava/lang/String;)V

    .line 1141
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->ad()V

    goto :goto_0

    .line 1143
    :cond_1
    sget v2, Lcom/facebook/i;->send_message:I

    if-ne v1, v2, :cond_2

    .line 1144
    const-string v1, "send message"

    invoke-direct {p0, v1}, Lcom/facebook/orca/threadlist/ThreadListFragment;->c(Ljava/lang/String;)V

    .line 1145
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->ae()V

    goto :goto_0

    .line 1147
    :cond_2
    sget v2, Lcom/facebook/i;->broadcast:I

    if-ne v1, v2, :cond_3

    .line 1148
    const-string v1, "broadcast"

    invoke-direct {p0, v1}, Lcom/facebook/orca/threadlist/ThreadListFragment;->c(Ljava/lang/String;)V

    .line 1149
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->af()V

    goto :goto_0

    .line 1152
    :cond_3
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0
.end method

.method b()V
    .locals 1

    .prologue
    .line 660
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->c:Lcom/facebook/orca/notify/av;

    invoke-virtual {v0}, Lcom/facebook/orca/notify/av;->b()V

    .line 661
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->X()V

    .line 662
    return-void
.end method

.method b(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 1

    .prologue
    .line 838
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->e:Lcom/facebook/orca/f/b;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/b;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 839
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->V()V

    .line 840
    return-void
.end method

.method public c()Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 1071
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    return-object v0
.end method

.method c(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 3

    .prologue
    .line 843
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->n()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/facebook/o;->menu_mark_as_spam_confirm:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/facebook/o;->dialog_yes:I

    new-instance v2, Lcom/facebook/orca/threadlist/ar;

    invoke-direct {v2, p0, p1}, Lcom/facebook/orca/threadlist/ar;-><init>(Lcom/facebook/orca/threadlist/ThreadListFragment;Lcom/facebook/orca/threads/ThreadSummary;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/facebook/o;->dialog_no:I

    new-instance v2, Lcom/facebook/orca/threadlist/aq;

    invoke-direct {v2, p0}, Lcom/facebook/orca/threadlist/aq;-><init>(Lcom/facebook/orca/threadlist/ThreadListFragment;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 859
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    const/16 v3, 0x8

    .line 340
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->d(Landroid/os/Bundle;)V

    .line 341
    sget-object v0, Lcom/facebook/orca/threadlist/ThreadListFragment;->a:Ljava/lang/Class;

    const-string v1, "ThreadListFragment.onActivityCreated"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 343
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->d:Lcom/facebook/orca/threadlist/af;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 344
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0, v5}, Lcom/facebook/widget/listview/BetterListView;->setDividerHeight(I)V

    .line 345
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0, v4}, Lcom/facebook/widget/listview/BetterListView;->setItemsCanFocus(Z)V

    .line 346
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0, v4}, Lcom/facebook/widget/listview/BetterListView;->setBroadcastInteractionChanges(Z)V

    .line 347
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/BetterListView;->c()V

    .line 348
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    new-instance v1, Lcom/facebook/orca/threadlist/at;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/at;-><init>(Lcom/facebook/orca/threadlist/ThreadListFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 360
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aw:Lcom/facebook/widget/refreshablelistview/b;

    new-instance v1, Lcom/facebook/orca/threadlist/au;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/au;-><init>(Lcom/facebook/orca/threadlist/ThreadListFragment;)V

    invoke-interface {v0, v1}, Lcom/facebook/widget/refreshablelistview/b;->setOnRefreshListener(Lcom/facebook/widget/refreshablelistview/c;)V

    .line 387
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ax:Lcom/facebook/widget/listview/BetterListView;

    new-instance v1, Lcom/facebook/orca/threadlist/bd;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/threadlist/bd;-><init>(Lcom/facebook/orca/threadlist/ThreadListFragment;Lcom/facebook/orca/threadlist/ao;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->a(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 389
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ac:Lcom/facebook/orca/threadlist/bf;

    new-instance v1, Lcom/facebook/orca/threadlist/aw;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/aw;-><init>(Lcom/facebook/orca/threadlist/ThreadListFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/bf;->a(Lcom/facebook/orca/threadlist/bi;)V

    .line 418
    invoke-virtual {p0, v4}, Lcom/facebook/orca/threadlist/ThreadListFragment;->d(Z)V

    .line 421
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ah:Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/ViewerContext;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 422
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->az:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    invoke-virtual {v0, v5}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->setStartConversationTextVisibility(Z)V

    .line 423
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->az:Lcom/facebook/orca/threadlist/ThreadListEmptyView;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->a()V

    .line 424
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aq:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 427
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->O()V

    .line 429
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->al:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/threadlist/ax;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/ax;-><init>(Lcom/facebook/orca/threadlist/ThreadListFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 438
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->am:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/threadlist/ay;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/ay;-><init>(Lcom/facebook/orca/threadlist/ThreadListFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 448
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ap:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/threadlist/az;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/az;-><init>(Lcom/facebook/orca/threadlist/ThreadListFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 457
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aS:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    .line 459
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ap:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 460
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->an:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 467
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aU:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 468
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ar:Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;

    invoke-virtual {v0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->a()V

    .line 470
    :cond_2
    return-void

    .line 461
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->aT:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 463
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->al:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 464
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListFragment;->ao:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method public d(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 3

    .prologue
    .line 1191
    if-nez p1, :cond_0

    .line 1198
    :goto_0
    return-void

    .line 1195
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->a(Ljava/lang/String;)Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;

    move-result-object v0

    .line 1197
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->p()Landroid/support/v4/app/q;

    move-result-object v1

    const-string v2, "deleteThreadDialog"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->a(Landroid/support/v4/app/q;Ljava/lang/String;)V

    goto :goto_0
.end method
