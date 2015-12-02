.class public Lcom/facebook/orca/threadlist/t;
.super Lcom/facebook/base/activity/l;
.source "ThreadListActivityDelegate.java"

# interfaces
.implements Lcom/facebook/analytics/d;
.implements Lcom/facebook/b/a/f;
.implements Lcom/facebook/orca/activity/k;


# annotations
.annotation runtime Lcom/facebook/debug/fps/FPSSupport;
.end annotation


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
.field private A:Lcom/facebook/orca/nux/NuxFindingContactsIntroView;

.field private B:Lcom/facebook/orca/nux/NuxScrimView;

.field private C:Lcom/facebook/orca/nux/NuxSmsIntroView;

.field private D:Lcom/facebook/orca/threadview/ThreadViewFragment;

.field private E:Ljava/lang/String;

.field private F:Z

.field private G:Z

.field private b:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

.field private c:Lcom/facebook/analytics/av;

.field private d:Lcom/facebook/orca/d/bf;

.field private e:Lcom/facebook/orca/d/m;

.field private f:Lcom/facebook/orca/d/af;

.field private g:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/facebook/widget/titlebar/a;

.field private i:Lcom/facebook/orca/threadlist/ThreadListFragment;

.field private j:Lcom/facebook/orca/threadlist/VersionUpgradePromoView;

.field private k:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

.field private l:Lcom/facebook/orca/threadlist/SyncDisabledWarningView;

.field private m:Lcom/facebook/widget/ConfirmationView;

.field private n:Lcom/facebook/zero/ui/d;

.field private o:Lcom/facebook/orca/threadlist/f;

.field private p:Lcom/facebook/orca/common/ui/titlebar/a;

.field private q:Lcom/facebook/contacts/upload/c;

.field private r:Landroid/support/v4/a/e;

.field private s:Landroid/content/BroadcastReceiver;

.field private t:Lcom/facebook/b/a/b;

.field private u:Lcom/facebook/orca/common/ui/titlebar/ap;

.field private v:Lcom/facebook/launcherbadges/a;

.field private w:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private x:Lcom/facebook/config/a/a;

.field private y:Lcom/facebook/orca/nux/k;

.field private z:Lcom/facebook/orca/nux/NuxFindingContactsView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 110
    const-class v0, Lcom/facebook/orca/threadlist/s;

    sput-object v0, Lcom/facebook/orca/threadlist/t;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0}, Lcom/facebook/base/activity/l;-><init>()V

    return-void
.end method

.method private A()V
    .locals 2

    .prologue
    .line 444
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->p:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->b()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Landroid/app/Activity;)V

    .line 445
    return-void
.end method

.method private B()V
    .locals 2

    .prologue
    .line 487
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->r()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 488
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->r()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "trigger"

    invoke-static {v0, v1}, Lcom/facebook/orca/intents/e;->a(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 490
    if-eqz v0, :cond_0

    .line 491
    iget-object v1, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Ljava/lang/String;)V

    .line 494
    :cond_0
    return-void
.end method

.method private C()V
    .locals 2

    .prologue
    .line 497
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->t:Lcom/facebook/b/a/b;

    invoke-virtual {v0}, Lcom/facebook/b/a/b;->d()Lcom/google/common/d/a/s;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/threadlist/ae;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/ae;-><init>(Lcom/facebook/orca/threadlist/t;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 509
    return-void
.end method

.method private D()V
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 545
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 566
    :goto_0
    return-void

    .line 549
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->y:Lcom/facebook/orca/nux/k;

    if-eqz v0, :cond_2

    .line 550
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->y:Lcom/facebook/orca/nux/k;

    new-instance v1, Lcom/facebook/orca/threadlist/v;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/v;-><init>(Lcom/facebook/orca/threadlist/t;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/nux/k;->a(Lcom/facebook/orca/nux/t;)V

    .line 558
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->y:Lcom/facebook/orca/nux/k;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/k;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 559
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/t;->e(I)V

    goto :goto_0

    .line 561
    :cond_1
    invoke-virtual {p0, v2}, Lcom/facebook/orca/threadlist/t;->e(I)V

    goto :goto_0

    .line 564
    :cond_2
    invoke-virtual {p0, v2}, Lcom/facebook/orca/threadlist/t;->e(I)V

    goto :goto_0
.end method

.method private E()V
    .locals 3

    .prologue
    .line 764
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->b()Landroid/app/Activity;

    move-result-object v1

    const-class v2, Lcom/facebook/contacts/contactslist/ContactsListActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 765
    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/t;->b(Landroid/content/Intent;)V

    .line 766
    return-void
.end method

.method private F()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 876
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/t;->E:Ljava/lang/String;

    .line 877
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->y:Lcom/facebook/orca/nux/k;

    if-eqz v0, :cond_0

    .line 878
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->y:Lcom/facebook/orca/nux/k;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/nux/k;->a(Z)V

    .line 880
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->p()Landroid/support/v4/app/q;

    move-result-object v0

    .line 881
    invoke-virtual {v0}, Landroid/support/v4/app/q;->c()Z

    move-result v1

    if-nez v1, :cond_1

    .line 904
    :goto_0
    return-void

    .line 891
    :cond_1
    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v1

    .line 892
    sget v2, Lcom/facebook/b;->orca_fade_in:I

    sget v3, Lcom/facebook/b;->orca_fade_out:I

    invoke-virtual {v1, v2, v3}, Landroid/support/v4/app/ad;->a(II)Landroid/support/v4/app/ad;

    .line 893
    iget-object v2, p0, Lcom/facebook/orca/threadlist/t;->i:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-virtual {v1, v2}, Landroid/support/v4/app/ad;->c(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 894
    iget-object v2, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v1, v2}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 895
    invoke-virtual {v1}, Landroid/support/v4/app/ad;->a()I

    .line 896
    invoke-virtual {v0}, Landroid/support/v4/app/q;->b()Z

    .line 897
    invoke-direct {p0, v4}, Lcom/facebook/orca/threadlist/t;->b(Z)V

    .line 900
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/t;->z()V

    .line 901
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->R()V

    .line 903
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->n:Lcom/facebook/zero/ui/d;

    invoke-virtual {v0}, Lcom/facebook/zero/ui/d;->c()V

    goto :goto_0
.end method

.method private G()Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    .line 922
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    if-eqz v0, :cond_0

    move v0, v1

    .line 944
    :goto_0
    return v0

    .line 926
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->p()Landroid/support/v4/app/q;

    move-result-object v2

    .line 927
    const-string v0, "threadViewFragment"

    invoke-virtual {v2, v0}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ThreadViewFragment;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    .line 928
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    if-nez v0, :cond_2

    .line 930
    invoke-virtual {v2}, Landroid/support/v4/app/q;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 931
    const/4 v0, 0x0

    goto :goto_0

    .line 933
    :cond_1
    new-instance v0, Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-direct {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    .line 934
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    iget-object v3, p0, Lcom/facebook/orca/threadlist/t;->h:Lcom/facebook/widget/titlebar/a;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/widget/titlebar/a;)V

    .line 935
    invoke-virtual {v2}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 936
    sget v3, Lcom/facebook/i;->orca_threadlist_fragment_container:I

    iget-object v4, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    const-string v5, "threadViewFragment"

    invoke-virtual {v0, v3, v4, v5}, Landroid/support/v4/app/ad;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 938
    iget-object v3, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0, v3}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 939
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 940
    invoke-virtual {v2}, Landroid/support/v4/app/q;->b()Z

    :goto_1
    move v0, v1

    .line 944
    goto :goto_0

    .line 942
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/t;->h:Lcom/facebook/widget/titlebar/a;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/widget/titlebar/a;)V

    goto :goto_1
.end method

.method private H()V
    .locals 2

    .prologue
    .line 950
    iget-boolean v0, p0, Lcom/facebook/orca/threadlist/t;->F:Z

    if-eqz v0, :cond_0

    .line 952
    invoke-static {}, Landroid/os/Looper;->myQueue()Landroid/os/MessageQueue;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/threadlist/w;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/w;-><init>(Lcom/facebook/orca/threadlist/t;)V

    invoke-virtual {v0, v1}, Landroid/os/MessageQueue;->addIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V

    .line 963
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/t;)Lcom/facebook/orca/nux/k;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->y:Lcom/facebook/orca/nux/k;

    return-object v0
.end method

.method private a(Lcom/facebook/contacts/upload/ContactsUploadState;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/16 v2, 0x8

    .line 512
    invoke-virtual {p1}, Lcom/facebook/contacts/upload/ContactsUploadState;->a()Lcom/facebook/contacts/upload/k;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/upload/k;->FAILED:Lcom/facebook/contacts/upload/k;

    if-ne v0, v1, :cond_0

    .line 513
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->m:Lcom/facebook/widget/ConfirmationView;

    invoke-virtual {v0, v3}, Lcom/facebook/widget/ConfirmationView;->setVisibility(I)V

    .line 514
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->l:Lcom/facebook/orca/threadlist/SyncDisabledWarningView;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadlist/SyncDisabledWarningView;->setVisibility(I)V

    .line 515
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->k:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;->setVisibility(I)V

    .line 526
    :goto_0
    return-void

    .line 517
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->m:Lcom/facebook/widget/ConfirmationView;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/ConfirmationView;->setVisibility(I)V

    .line 518
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->l:Lcom/facebook/orca/threadlist/SyncDisabledWarningView;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/threadlist/SyncDisabledWarningView;->setVisibility(I)V

    .line 519
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->l:Lcom/facebook/orca/threadlist/SyncDisabledWarningView;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/SyncDisabledWarningView;->a()V

    .line 520
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->l:Lcom/facebook/orca/threadlist/SyncDisabledWarningView;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/SyncDisabledWarningView;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 521
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->k:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;->setVisibility(I)V

    goto :goto_0

    .line 523
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->k:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;->setVisibility(I)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/threadlist/ThreadListFragment;)V
    .locals 1

    .prologue
    .line 398
    new-instance v0, Lcom/facebook/orca/threadlist/ad;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadlist/ad;-><init>(Lcom/facebook/orca/threadlist/t;)V

    .line 440
    invoke-virtual {p1, v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Lcom/facebook/orca/threadlist/bc;)V

    .line 441
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/t;Lcom/facebook/contacts/upload/ContactsUploadState;)V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/t;->a(Lcom/facebook/contacts/upload/ContactsUploadState;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/t;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/t;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 809
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->r()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "from_notification"

    invoke-static {v0, v1, v6}, Lcom/facebook/orca/intents/e;->a(Landroid/content/Intent;Ljava/lang/String;Z)Z

    move-result v1

    .line 811
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->r()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "focus_compose"

    invoke-static {v0, v2, v6}, Lcom/facebook/orca/intents/e;->a(Landroid/content/Intent;Ljava/lang/String;Z)Z

    move-result v2

    .line 814
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->b()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadlist/s;

    invoke-interface {v0}, Lcom/facebook/orca/threadlist/s;->c_()Z

    move-result v0

    if-nez v0, :cond_1

    .line 815
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->b()Landroid/app/Activity;

    move-result-object v3

    const-class v4, Lcom/facebook/orca/threadview/ThreadViewActivity;

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 816
    const-string v3, "thread_id"

    invoke-virtual {v0, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 817
    const-string v3, "trigger"

    const-string v4, "inbox"

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 818
    const-string v3, "from_notification"

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 819
    const-string v1, "focus_compose"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 820
    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/t;->b(Landroid/content/Intent;)V

    .line 873
    :cond_0
    :goto_0
    return-void

    .line 824
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/t;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 828
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->p()Landroid/support/v4/app/q;

    move-result-object v0

    .line 830
    invoke-virtual {v0}, Landroid/support/v4/app/q;->c()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 834
    invoke-direct {p0, v7}, Lcom/facebook/orca/threadlist/t;->b(Z)V

    .line 835
    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v3

    .line 836
    sget v4, Lcom/facebook/b;->orca_fade_in:I

    sget v5, Lcom/facebook/b;->orca_fade_out:I

    invoke-virtual {v3, v4, v5}, Landroid/support/v4/app/ad;->a(II)Landroid/support/v4/app/ad;

    .line 837
    iget-object v4, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v3, v4}, Landroid/support/v4/app/ad;->c(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 838
    iget-object v4, p0, Lcom/facebook/orca/threadlist/t;->i:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-virtual {v3, v4}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 839
    invoke-virtual {v3}, Landroid/support/v4/app/ad;->a()I

    .line 840
    invoke-virtual {v0}, Landroid/support/v4/app/q;->b()Z

    .line 841
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->c:Lcom/facebook/analytics/av;

    const-string v3, "tap_conversation_thread"

    invoke-interface {v0, v3}, Lcom/facebook/analytics/av;->a(Ljava/lang/String;)V

    .line 843
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->c:Lcom/facebook/analytics/av;

    const-string v3, "thread_view_module"

    invoke-interface {v0, v3, v7}, Lcom/facebook/analytics/av;->b(Ljava/lang/String;Z)V

    .line 845
    if-eqz v1, :cond_2

    .line 849
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b()V

    .line 850
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->i:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-virtual {v0, v6}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Z)V

    .line 853
    :cond_2
    if-eqz v2, :cond_3

    .line 854
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->c()V

    .line 857
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    const-string v1, "inbox"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Ljava/lang/String;)V

    .line 858
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 860
    iput-object p1, p0, Lcom/facebook/orca/threadlist/t;->E:Ljava/lang/String;

    .line 865
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->u()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b(Z)V

    .line 867
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->n:Lcom/facebook/zero/ui/d;

    invoke-virtual {v0}, Lcom/facebook/zero/ui/d;->d()V

    .line 868
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->y:Lcom/facebook/orca/nux/k;

    if-eqz v0, :cond_4

    .line 869
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->y:Lcom/facebook/orca/nux/k;

    invoke-virtual {v0, v7}, Lcom/facebook/orca/nux/k;->a(Z)V

    .line 872
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->u:Lcom/facebook/orca/common/ui/titlebar/ap;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/ap;->b()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/t;Z)Z
    .locals 0

    .prologue
    .line 106
    iput-boolean p1, p0, Lcom/facebook/orca/threadlist/t;->G:Z

    return p1
.end method

.method static synthetic b(Lcom/facebook/orca/threadlist/t;)V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/t;->F()V

    return-void
.end method

.method private b(Z)V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 535
    if-eqz p1, :cond_0

    .line 536
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->m:Lcom/facebook/widget/ConfirmationView;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/ConfirmationView;->setVisibility(I)V

    .line 537
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->l:Lcom/facebook/orca/threadlist/SyncDisabledWarningView;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/SyncDisabledWarningView;->setVisibility(I)V

    .line 538
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->k:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;->setVisibility(I)V

    .line 542
    :goto_0
    return-void

    .line 540
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->q:Lcom/facebook/contacts/upload/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/upload/c;->b()Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/t;->a(Lcom/facebook/contacts/upload/ContactsUploadState;)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/orca/threadlist/t;)V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/t;->H()V

    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/threadlist/t;)Lcom/facebook/analytics/av;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->c:Lcom/facebook/analytics/av;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/orca/threadlist/t;)Lcom/facebook/contacts/upload/c;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->q:Lcom/facebook/contacts/upload/c;

    return-object v0
.end method

.method static synthetic f(Lcom/facebook/orca/threadlist/t;)Lcom/facebook/orca/common/ui/titlebar/a;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->p:Lcom/facebook/orca/common/ui/titlebar/a;

    return-object v0
.end method

.method static synthetic g(Lcom/facebook/orca/threadlist/t;)Landroid/app/Activity;
    .locals 1

    .prologue
    .line 106
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->b()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method static synthetic h(Lcom/facebook/orca/threadlist/t;)Landroid/app/Activity;
    .locals 1

    .prologue
    .line 106
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->b()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method static synthetic i(Lcom/facebook/orca/threadlist/t;)Z
    .locals 1

    .prologue
    .line 106
    iget-boolean v0, p0, Lcom/facebook/orca/threadlist/t;->F:Z

    return v0
.end method

.method static synthetic y()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 106
    sget-object v0, Lcom/facebook/orca/threadlist/t;->a:Ljava/lang/Class;

    return-object v0
.end method

.method private z()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 372
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->h:Lcom/facebook/widget/titlebar/a;

    sget v1, Lcom/facebook/o;->thread_list_title:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadlist/t;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setTitle(Ljava/lang/String;)V

    .line 373
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->h:Lcom/facebook/widget/titlebar/a;

    invoke-interface {v0, v2}, Lcom/facebook/widget/titlebar/a;->setHasProgressBar(Z)V

    .line 374
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->h:Lcom/facebook/widget/titlebar/a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setHasBackButton(Z)V

    .line 375
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->h:Lcom/facebook/widget/titlebar/a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setCustomTitleView(Landroid/view/View;)V

    .line 377
    invoke-static {}, Lcom/facebook/widget/titlebar/d;->newBuilder()Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/widget/titlebar/e;->a(I)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->s()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/h;->orca_divebar_icon:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/titlebar/e;->a(Landroid/graphics/drawable/Drawable;)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/widget/titlebar/e;->k()Lcom/facebook/widget/titlebar/d;

    move-result-object v0

    .line 381
    iget-object v1, p0, Lcom/facebook/orca/threadlist/t;->h:Lcom/facebook/widget/titlebar/a;

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/widget/titlebar/a;->setButtonSpecs(Ljava/util/List;)V

    .line 383
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->h:Lcom/facebook/widget/titlebar/a;

    new-instance v1, Lcom/facebook/orca/threadlist/ac;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/ac;-><init>(Lcom/facebook/orca/threadlist/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setOnToolbarButtonListener(Lcom/facebook/widget/titlebar/b;)V

    .line 392
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->h:Lcom/facebook/widget/titlebar/a;

    invoke-interface {v0}, Lcom/facebook/widget/titlebar/a;->getTitleBarDivebarButtonOverlay()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 393
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->u:Lcom/facebook/orca/common/ui/titlebar/ap;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/t;->h:Lcom/facebook/widget/titlebar/a;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/ap;->a(Lcom/facebook/widget/titlebar/a;)V

    .line 395
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 908
    invoke-super {p0, p1}, Lcom/facebook/base/activity/l;->a(Landroid/content/res/Configuration;)V

    .line 909
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->p:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->e()V

    .line 910
    return-void
.end method

.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 2

    .prologue
    .line 163
    invoke-super {p0, p1}, Lcom/facebook/base/activity/l;->a(Landroid/support/v4/app/Fragment;)V

    .line 166
    instance-of v0, p1, Lcom/facebook/base/fragment/b;

    if-nez v0, :cond_1

    .line 195
    :cond_0
    :goto_0
    return-void

    .line 172
    :cond_1
    instance-of v0, p1, Lcom/facebook/orca/threadlist/ThreadListFragment;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->j()I

    move-result v0

    sget v1, Lcom/facebook/i;->orca_threadlist_fragment:I

    if-ne v0, v1, :cond_2

    move-object v0, p1

    .line 174
    check-cast v0, Lcom/facebook/base/fragment/b;

    new-instance v1, Lcom/facebook/orca/threadlist/u;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/u;-><init>(Lcom/facebook/orca/threadlist/t;)V

    invoke-interface {v0, v1}, Lcom/facebook/base/fragment/b;->a(Lcom/facebook/base/fragment/c;)V

    .line 186
    check-cast p1, Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/t;->a(Lcom/facebook/orca/threadlist/ThreadListFragment;)V

    goto :goto_0

    .line 187
    :cond_2
    instance-of v0, p1, Lcom/facebook/orca/threadview/ThreadViewFragment;

    if-eqz v0, :cond_0

    .line 188
    check-cast p1, Lcom/facebook/base/fragment/b;

    new-instance v0, Lcom/facebook/orca/threadlist/x;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadlist/x;-><init>(Lcom/facebook/orca/threadlist/t;)V

    invoke-interface {p1, v0}, Lcom/facebook/base/fragment/b;->a(Lcom/facebook/base/fragment/c;)V

    goto :goto_0
.end method

.method public a(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 7

    .prologue
    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 675
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/base/activity/l;->a(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 676
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->i:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->c()Landroid/widget/ListView;

    move-result-object v0

    .line 677
    if-ne p2, v0, :cond_1

    .line 678
    check-cast p3, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 679
    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    .line 680
    iget v1, p3, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-interface {v0, v1}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    .line 681
    instance-of v1, v0, Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v1, :cond_1

    .line 682
    sget v1, Lcom/facebook/o;->thread_context_menu_title:I

    invoke-interface {p1, v1}, Landroid/view/ContextMenu;->setHeaderTitle(I)Landroid/view/ContextMenu;

    .line 683
    sget v1, Lcom/facebook/i;->menu_group_thread_list:I

    sget v2, Lcom/facebook/o;->thread_context_menu_archive_conversation:I

    invoke-interface {p1, v1, v3, v3, v2}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 685
    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 686
    sget v0, Lcom/facebook/i;->menu_group_thread_list:I

    sget v1, Lcom/facebook/o;->thread_context_menu_mark_conversation_as_spam:I

    invoke-interface {p1, v0, v5, v5, v1}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 689
    :cond_0
    sget v0, Lcom/facebook/i;->menu_group_thread_list:I

    sget v1, Lcom/facebook/o;->thread_context_menu_delete_conversation:I

    invoke-interface {p1, v0, v4, v4, v1}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 692
    iget-boolean v0, p0, Lcom/facebook/orca/threadlist/t;->G:Z

    if-eqz v0, :cond_1

    .line 693
    sget v0, Lcom/facebook/i;->menu_group_thread_list:I

    sget v1, Lcom/facebook/o;->thread_context_menu_show_chat_head:I

    invoke-interface {p1, v0, v6, v6, v1}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 698
    :cond_1
    return-void
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 634
    invoke-super {p0, p1}, Lcom/facebook/base/activity/l;->a(Z)V

    .line 635
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 636
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b(Z)V

    .line 638
    :cond_0
    return-void
.end method

.method public a(ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    .line 642
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->w()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 644
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 646
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->c:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "android_button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "back"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 651
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1, p2}, Lcom/facebook/base/activity/l;->a(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    .line 653
    :goto_0
    return v0

    .line 651
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 653
    :cond_3
    invoke-super {p0, p1, p2}, Lcom/facebook/base/activity/l;->a(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public a(Landroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 793
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->d:Lcom/facebook/orca/d/bf;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/d/bf;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Lcom/facebook/base/activity/l;->a(Landroid/view/KeyEvent;)Z

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

.method public a(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 740
    invoke-super {p0, p1}, Lcom/facebook/base/activity/l;->a(Landroid/view/Menu;)Z

    .line 742
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->t()Landroid/view/MenuInflater;

    move-result-object v0

    .line 743
    sget v1, Lcom/facebook/l;->thread_list_menu:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 745
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->g:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 746
    sget v0, Lcom/facebook/i;->goto_contacts_list_menu_item:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->removeItem(I)V

    .line 749
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 2

    .prologue
    .line 754
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    .line 755
    sget v1, Lcom/facebook/i;->goto_contacts_list_menu_item:I

    if-ne v0, v1, :cond_0

    .line 756
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/t;->E()V

    .line 757
    const/4 v0, 0x1

    .line 759
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/base/activity/l;->a(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0
.end method

.method public a_()Z
    .locals 1

    .prologue
    .line 967
    const/4 v0, 0x1

    return v0
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 20

    .prologue
    .line 199
    invoke-super/range {p0 .. p1}, Lcom/facebook/base/activity/l;->b(Landroid/os/Bundle;)V

    .line 200
    sget-object v2, Lcom/facebook/orca/threadlist/t;->a:Ljava/lang/Class;

    const-string v3, "ThreadListActivity.onActivityCreate"

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 202
    const/4 v2, 0x0

    .line 203
    if-eqz p1, :cond_7

    const-string v3, "selectedThreadId"

    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 204
    const-string v2, "selectedThreadId"

    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v3, v2

    .line 207
    :goto_0
    sget v2, Lcom/facebook/k;->orca_thread_list:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadlist/t;->c(I)V

    .line 209
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/orca/threadlist/t;->n()Lcom/facebook/inject/t;

    move-result-object v18

    .line 210
    const-class v2, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/contacts/annotations/IsContactsListEnabled;

    move-object/from16 v0, v18

    invoke-virtual {v0, v2, v4}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->g:Ljavax/inject/a;

    .line 213
    const-class v2, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->b:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    .line 214
    const-class v2, Lcom/facebook/analytics/av;

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/analytics/av;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->c:Lcom/facebook/analytics/av;

    .line 215
    const-class v2, Lcom/facebook/orca/d/bf;

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/d/bf;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->d:Lcom/facebook/orca/d/bf;

    .line 216
    const-class v2, Lcom/facebook/orca/d/m;

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/d/m;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->e:Lcom/facebook/orca/d/m;

    .line 217
    const-class v2, Lcom/facebook/orca/d/af;

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/d/af;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->f:Lcom/facebook/orca/d/af;

    .line 218
    const-class v2, Lcom/facebook/orca/common/ui/titlebar/a;

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/common/ui/titlebar/a;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->p:Lcom/facebook/orca/common/ui/titlebar/a;

    .line 219
    const-class v2, Lcom/facebook/contacts/upload/c;

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/contacts/upload/c;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->q:Lcom/facebook/contacts/upload/c;

    .line 220
    const-class v2, Landroid/support/v4/a/e;

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/v4/a/e;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->r:Landroid/support/v4/a/e;

    .line 221
    const-class v2, Lcom/facebook/b/a/b;

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/b/a/b;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->t:Lcom/facebook/b/a/b;

    .line 222
    const-class v2, Lcom/facebook/orca/common/ui/titlebar/ap;

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/common/ui/titlebar/ap;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->u:Lcom/facebook/orca/common/ui/titlebar/ap;

    .line 224
    const-class v2, Lcom/facebook/config/a/a;

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/config/a/a;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->x:Lcom/facebook/config/a/a;

    .line 225
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/threadlist/t;->x:Lcom/facebook/config/a/a;

    invoke-virtual {v2}, Lcom/facebook/config/a/a;->i()Lcom/facebook/config/a/d;

    move-result-object v2

    sget-object v4, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    if-ne v2, v4, :cond_0

    .line 226
    const-class v2, Lcom/facebook/launcherbadges/a;

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/launcherbadges/a;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->v:Lcom/facebook/launcherbadges/a;

    .line 227
    const-class v2, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/orca/annotations/IsAppIconBadgingEnabled;

    move-object/from16 v0, v18

    invoke-virtual {v0, v2, v4}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->w:Ljavax/inject/a;

    .line 230
    :cond_0
    new-instance v2, Lcom/facebook/orca/threadlist/y;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lcom/facebook/orca/threadlist/y;-><init>(Lcom/facebook/orca/threadlist/t;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->s:Landroid/content/BroadcastReceiver;

    .line 239
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/orca/threadlist/t;->b()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 240
    sget v2, Lcom/facebook/i;->titlebar:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadlist/t;->b(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/facebook/widget/titlebar/a;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->h:Lcom/facebook/widget/titlebar/a;

    .line 241
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/threadlist/t;->x:Lcom/facebook/config/a/a;

    invoke-virtual {v2}, Lcom/facebook/config/a/a;->i()Lcom/facebook/config/a/d;

    move-result-object v2

    sget-object v4, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    if-ne v2, v4, :cond_1

    .line 242
    invoke-static {}, Lcom/facebook/orca/common/ui/titlebar/ap;->a()V

    .line 244
    :cond_1
    invoke-direct/range {p0 .. p0}, Lcom/facebook/orca/threadlist/t;->z()V

    .line 246
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/orca/threadlist/t;->p()Landroid/support/v4/app/q;

    move-result-object v19

    .line 247
    sget v2, Lcom/facebook/i;->orca_threadlist_fragment:I

    move-object/from16 v0, v19

    invoke-virtual {v0, v2}, Landroid/support/v4/app/q;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/threadlist/ThreadListFragment;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->i:Lcom/facebook/orca/threadlist/ThreadListFragment;

    .line 248
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/threadlist/t;->i:Lcom/facebook/orca/threadlist/ThreadListFragment;

    new-instance v4, Lcom/facebook/orca/threadlist/z;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Lcom/facebook/orca/threadlist/z;-><init>(Lcom/facebook/orca/threadlist/t;)V

    invoke-virtual {v2, v4}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Lcom/facebook/orca/threadlist/be;)V

    .line 259
    const-string v2, "threadViewFragment"

    move-object/from16 v0, v19

    invoke-virtual {v0, v2}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/threadview/ThreadViewFragment;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    .line 260
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    if-eqz v2, :cond_2

    .line 261
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/facebook/orca/threadlist/t;->h:Lcom/facebook/widget/titlebar/a;

    invoke-virtual {v2, v4}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/widget/titlebar/a;)V

    .line 264
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/orca/threadlist/t;->r()Landroid/content/Intent;

    move-result-object v2

    .line 265
    const-string v4, "from_notification"

    const/4 v5, 0x0

    invoke-static {v2, v4, v5}, Lcom/facebook/orca/intents/e;->a(Landroid/content/Intent;Ljava/lang/String;Z)Z

    move-result v4

    .line 268
    const-string v5, "thread_id"

    invoke-virtual {v2, v5}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 269
    const-string v3, "thread_id"

    invoke-static {v2, v3}, Lcom/facebook/orca/intents/e;->a(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 270
    const-string v5, "from_notification"

    invoke-virtual {v2, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-object/from16 v17, v3

    .line 275
    :goto_1
    sget v2, Lcom/facebook/i;->thread_list_version_upgrade_promo:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadlist/t;->b(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->j:Lcom/facebook/orca/threadlist/VersionUpgradePromoView;

    .line 276
    sget v2, Lcom/facebook/i;->thread_list_mute_warning:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadlist/t;->b(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->k:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    .line 277
    sget v2, Lcom/facebook/i;->thread_list_sync_disabled_warning:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadlist/t;->b(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/threadlist/SyncDisabledWarningView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->l:Lcom/facebook/orca/threadlist/SyncDisabledWarningView;

    .line 278
    sget v2, Lcom/facebook/i;->thread_list_contacts_upload_failed:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadlist/t;->b(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/facebook/widget/ConfirmationView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->m:Lcom/facebook/widget/ConfirmationView;

    .line 279
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/threadlist/t;->m:Lcom/facebook/widget/ConfirmationView;

    new-instance v3, Lcom/facebook/orca/threadlist/aa;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/facebook/orca/threadlist/aa;-><init>(Lcom/facebook/orca/threadlist/t;)V

    invoke-virtual {v2, v3}, Lcom/facebook/widget/ConfirmationView;->setListener(Lcom/facebook/widget/c;)V

    .line 303
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/threadlist/t;->i:Lcom/facebook/orca/threadlist/ThreadListFragment;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/threadlist/t;->h:Lcom/facebook/widget/titlebar/a;

    invoke-virtual {v2, v3}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Lcom/facebook/widget/titlebar/a;)V

    .line 305
    sget v2, Lcom/facebook/i;->nux_finding_contacts_intro:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadlist/t;->b(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->A:Lcom/facebook/orca/nux/NuxFindingContactsIntroView;

    .line 306
    sget v2, Lcom/facebook/i;->nux_finding_contacts:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadlist/t;->b(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/nux/NuxFindingContactsView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->z:Lcom/facebook/orca/nux/NuxFindingContactsView;

    .line 307
    sget v2, Lcom/facebook/i;->nux_scrim:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadlist/t;->b(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/nux/NuxScrimView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->B:Lcom/facebook/orca/nux/NuxScrimView;

    .line 308
    sget v2, Lcom/facebook/i;->nux_sms_intro:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadlist/t;->b(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/nux/NuxSmsIntroView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->C:Lcom/facebook/orca/nux/NuxSmsIntroView;

    .line 309
    const-class v2, Lcom/facebook/orca/nux/h;

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/nux/h;

    .line 310
    invoke-virtual {v3}, Lcom/facebook/orca/nux/h;->b()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 311
    new-instance v2, Lcom/facebook/orca/nux/k;

    const-class v4, Lcom/facebook/orca/app/g;

    move-object/from16 v0, v18

    invoke-virtual {v0, v4}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/app/g;

    const-class v5, Lcom/facebook/prefs/shared/d;

    move-object/from16 v0, v18

    invoke-virtual {v0, v5}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/prefs/shared/d;

    const-class v6, Ljava/lang/Boolean;

    const-class v7, Lcom/facebook/orca/annotations/ShouldSkipContactImportNux;

    move-object/from16 v0, v18

    invoke-virtual {v0, v6, v7}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v6

    const-class v7, Ljava/lang/Boolean;

    const-class v8, Lcom/facebook/orca/annotations/IsNuxSmsForced;

    move-object/from16 v0, v18

    invoke-virtual {v0, v7, v8}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v7

    const-class v8, Ljava/lang/Boolean;

    const-class v9, Lcom/facebook/orca/annotations/IsSmsNuxSendCliffDisabled;

    move-object/from16 v0, v18

    invoke-virtual {v0, v8, v9}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v8

    const-class v9, Lcom/facebook/orca/sms/af;

    move-object/from16 v0, v18

    invoke-virtual {v0, v9}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/orca/sms/af;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/facebook/orca/threadlist/t;->q:Lcom/facebook/contacts/upload/c;

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/facebook/orca/threadlist/t;->r:Landroid/support/v4/a/e;

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/facebook/orca/threadlist/t;->c:Lcom/facebook/analytics/av;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/orca/threadlist/t;->A:Lcom/facebook/orca/nux/NuxFindingContactsIntroView;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/facebook/orca/threadlist/t;->z:Lcom/facebook/orca/nux/NuxFindingContactsView;

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/facebook/orca/threadlist/t;->B:Lcom/facebook/orca/nux/NuxScrimView;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/facebook/orca/threadlist/t;->C:Lcom/facebook/orca/nux/NuxSmsIntroView;

    move-object/from16 v16, v0

    invoke-direct/range {v2 .. v16}, Lcom/facebook/orca/nux/k;-><init>(Lcom/facebook/orca/nux/h;Lcom/facebook/orca/app/g;Lcom/facebook/prefs/shared/d;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/sms/af;Lcom/facebook/contacts/upload/c;Landroid/support/v4/a/e;Lcom/facebook/analytics/av;Lcom/facebook/orca/nux/NuxFindingContactsIntroView;Lcom/facebook/orca/nux/NuxFindingContactsView;Lcom/facebook/orca/nux/NuxScrimView;Lcom/facebook/orca/nux/NuxSmsIntroView;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->y:Lcom/facebook/orca/nux/k;

    .line 327
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/threadlist/t;->z:Lcom/facebook/orca/nux/NuxFindingContactsView;

    new-instance v3, Lcom/facebook/orca/threadlist/ab;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/facebook/orca/threadlist/ab;-><init>(Lcom/facebook/orca/threadlist/t;)V

    invoke-virtual {v2, v3}, Lcom/facebook/orca/nux/NuxFindingContactsView;->setContentOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 340
    :cond_3
    new-instance v4, Lcom/facebook/orca/threadlist/f;

    const-class v2, Lcom/facebook/prefs/shared/d;

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/prefs/shared/d;

    const-class v3, Lcom/facebook/orca/notify/as;

    move-object/from16 v0, v18

    invoke-virtual {v0, v3}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/notify/as;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/facebook/orca/threadlist/t;->k:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    invoke-direct {v4, v2, v3, v5}, Lcom/facebook/orca/threadlist/f;-><init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/notify/as;Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;)V

    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/facebook/orca/threadlist/t;->o:Lcom/facebook/orca/threadlist/f;

    .line 345
    invoke-direct/range {p0 .. p0}, Lcom/facebook/orca/threadlist/t;->A()V

    .line 347
    const-class v2, Lcom/facebook/zero/ui/d;

    move-object/from16 v0, v18

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/zero/ui/d;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/facebook/orca/threadlist/t;->n:Lcom/facebook/zero/ui/d;

    .line 348
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/threadlist/t;->n:Lcom/facebook/zero/ui/d;

    sget v2, Lcom/facebook/i;->zero_rating_bottom_banner_stub:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadlist/t;->b(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewStub;

    invoke-virtual {v3, v2}, Lcom/facebook/zero/ui/d;->a(Landroid/view/ViewStub;)Lcom/facebook/zero/ui/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/zero/ui/d;->c()V

    .line 353
    if-nez v17, :cond_4

    .line 354
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    if-eqz v2, :cond_4

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v2}, Lcom/facebook/orca/threadview/ThreadViewFragment;->w()Z

    move-result v2

    if-nez v2, :cond_4

    .line 355
    invoke-virtual/range {v19 .. v19}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v2

    .line 356
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v2, v3}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 357
    invoke-virtual {v2}, Landroid/support/v4/app/ad;->a()I

    .line 358
    invoke-virtual/range {v19 .. v19}, Landroid/support/v4/app/q;->b()Z

    .line 363
    :cond_4
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/orca/threadlist/t;->q()Landroid/view/Window;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 365
    if-eqz v17, :cond_5

    .line 366
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lcom/facebook/orca/threadlist/t;->a(Ljava/lang/String;)V

    .line 368
    :cond_5
    return-void

    .line 272
    :cond_6
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/threadlist/t;->i:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-virtual {v2, v4}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Z)V

    move-object/from16 v17, v3

    goto/16 :goto_1

    :cond_7
    move-object v3, v2

    goto/16 :goto_0
.end method

.method public b(Landroid/view/MenuItem;)Z
    .locals 2

    .prologue
    .line 703
    invoke-interface {p1}, Landroid/view/MenuItem;->getGroupId()I

    move-result v0

    sget v1, Lcom/facebook/i;->menu_group_thread_list:I

    if-eq v0, v1, :cond_0

    .line 704
    invoke-super {p0, p1}, Lcom/facebook/base/activity/l;->b(Landroid/view/MenuItem;)Z

    move-result v0

    .line 735
    :goto_0
    return v0

    .line 707
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->i:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->c()Landroid/widget/ListView;

    move-result-object v0

    .line 708
    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 709
    invoke-interface {p1}, Landroid/view/MenuItem;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    check-cast v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 712
    iget-object v0, v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;->targetView:Landroid/view/View;

    .line 713
    instance-of v1, v0, Lcom/facebook/orca/threadlist/q;

    if-eqz v1, :cond_1

    .line 714
    check-cast v0, Lcom/facebook/orca/threadlist/q;

    .line 715
    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/q;->getThreadSummary()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 716
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 735
    :cond_1
    :goto_1
    invoke-super {p0, p1}, Lcom/facebook/base/activity/l;->b(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0

    .line 718
    :pswitch_0
    iget-object v1, p0, Lcom/facebook/orca/threadlist/t;->i:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->d(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 719
    const/4 v0, 0x1

    goto :goto_0

    .line 722
    :pswitch_1
    iget-object v1, p0, Lcom/facebook/orca/threadlist/t;->i:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->b(Lcom/facebook/orca/threads/ThreadSummary;)V

    goto :goto_1

    .line 726
    :pswitch_2
    iget-object v1, p0, Lcom/facebook/orca/threadlist/t;->i:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->c(Lcom/facebook/orca/threads/ThreadSummary;)V

    goto :goto_1

    .line 730
    :pswitch_3
    iget-object v1, p0, Lcom/facebook/orca/threadlist/t;->i:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    goto :goto_1

    .line 716
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public c()Lcom/facebook/orca/common/ui/titlebar/a;
    .locals 1

    .prologue
    .line 918
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->p:Lcom/facebook/orca/common/ui/titlebar/a;

    return-object v0
.end method

.method protected d()V
    .locals 2

    .prologue
    .line 595
    invoke-super {p0}, Lcom/facebook/base/activity/l;->d()V

    .line 596
    sget-object v0, Lcom/facebook/orca/threadlist/t;->a:Ljava/lang/Class;

    const-string v1, "ThreadListActivity.onStop"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 597
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->y:Lcom/facebook/orca/nux/k;

    if-eqz v0, :cond_0

    .line 598
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->y:Lcom/facebook/orca/nux/k;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/k;->b()V

    .line 600
    :cond_0
    return-void
.end method

.method protected d(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 604
    invoke-super {p0, p1}, Lcom/facebook/base/activity/l;->d(Landroid/os/Bundle;)V

    .line 605
    const-string v0, "selectedThreadId"

    iget-object v1, p0, Lcom/facebook/orca/threadlist/t;->E:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 606
    return-void
.end method

.method protected e()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 570
    invoke-super {p0}, Lcom/facebook/base/activity/l;->e()V

    .line 571
    sget-object v0, Lcom/facebook/orca/threadlist/t;->a:Ljava/lang/Class;

    const-string v1, "ThreadListActivity.onPause"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 572
    iput-boolean v2, p0, Lcom/facebook/orca/threadlist/t;->F:Z

    .line 573
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->i:Lcom/facebook/orca/threadlist/ThreadListFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/ThreadListFragment;->a(Lcom/facebook/orca/threadlist/be;)V

    .line 574
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->r:Landroid/support/v4/a/e;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/t;->s:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;)V

    .line 575
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->e:Lcom/facebook/orca/d/m;

    invoke-virtual {v0}, Lcom/facebook/orca/d/m;->a()V

    .line 576
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->f:Lcom/facebook/orca/d/af;

    invoke-virtual {v0}, Lcom/facebook/orca/d/af;->b()V

    .line 578
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->n:Lcom/facebook/zero/ui/d;

    invoke-virtual {v0}, Lcom/facebook/zero/ui/d;->b()V

    .line 580
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->u:Lcom/facebook/orca/common/ui/titlebar/ap;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/ap;->b()V

    .line 584
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->x:Lcom/facebook/config/a/a;

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->i()Lcom/facebook/config/a/d;

    move-result-object v0

    sget-object v1, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->w:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 585
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->v:Lcom/facebook/launcherbadges/a;

    invoke-interface {v0, v2}, Lcom/facebook/launcherbadges/a;->a(I)Lcom/facebook/common/w/q;

    .line 587
    :cond_0
    return-void
.end method

.method protected f()V
    .locals 3

    .prologue
    .line 449
    invoke-super {p0}, Lcom/facebook/base/activity/l;->f()V

    .line 450
    sget-object v0, Lcom/facebook/orca/threadlist/t;->a:Ljava/lang/Class;

    const-string v1, "ThreadListActivity.onResume"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 451
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/threadlist/t;->F:Z

    .line 456
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->b:Lcom/facebook/contacts/database/AddressBookPeriodicRunner;

    invoke-virtual {v0}, Lcom/facebook/contacts/database/AddressBookPeriodicRunner;->b()V

    .line 458
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->j:Lcom/facebook/orca/threadlist/VersionUpgradePromoView;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/VersionUpgradePromoView;->a()V

    .line 459
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->o:Lcom/facebook/orca/threadlist/f;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/f;->a()V

    .line 461
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 463
    iget-object v1, p0, Lcom/facebook/orca/threadlist/t;->r:Landroid/support/v4/a/e;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/t;->s:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 465
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->y:Lcom/facebook/orca/nux/k;

    if-eqz v0, :cond_0

    .line 466
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->y:Lcom/facebook/orca/nux/k;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/k;->a()V

    .line 470
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/t;->D()V

    .line 472
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->n:Lcom/facebook/zero/ui/d;

    invoke-virtual {v0}, Lcom/facebook/zero/ui/d;->a()V

    .line 474
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->w()Z

    move-result v0

    if-nez v0, :cond_1

    .line 475
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->q:Lcom/facebook/contacts/upload/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/upload/c;->b()Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/t;->a(Lcom/facebook/contacts/upload/ContactsUploadState;)V

    .line 477
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/t;->z()V

    .line 482
    :goto_0
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/t;->B()V

    .line 483
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/t;->C()V

    .line 484
    return-void

    .line 479
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->n:Lcom/facebook/zero/ui/d;

    invoke-virtual {v0}, Lcom/facebook/zero/ui/d;->d()V

    goto :goto_0
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 150
    sget-object v0, Lcom/facebook/analytics/f/a;->THREAD_LIST_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method

.method public h()V
    .locals 1

    .prologue
    .line 658
    invoke-super {p0}, Lcom/facebook/base/activity/l;->h()V

    .line 660
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->w()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 661
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d()V

    .line 665
    :cond_0
    :goto_0
    return-void

    .line 662
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->i:Lcom/facebook/orca/threadlist/ThreadListFragment;

    if-eqz v0, :cond_0

    .line 663
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->i:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->b()V

    goto :goto_0
.end method

.method public m()V
    .locals 2

    .prologue
    .line 610
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->p:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 630
    :cond_0
    :goto_0
    return-void

    .line 618
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->p()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 621
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->w()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 622
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->Q()Z

    move-result v0

    if-nez v0, :cond_0

    .line 625
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/t;->F()V

    .line 626
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->c:Lcom/facebook/analytics/av;

    const-string v1, "thread_view_module"

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 628
    :cond_2
    invoke-super {p0}, Lcom/facebook/base/activity/l;->m()V

    goto :goto_0
.end method

.method public o()V
    .locals 2

    .prologue
    .line 155
    invoke-super {p0}, Lcom/facebook/base/activity/l;->o()V

    .line 156
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->q()Landroid/view/Window;

    move-result-object v0

    .line 158
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setFormat(I)V

    .line 159
    return-void
.end method

.method public v()Lcom/facebook/messages/threads/model/ThreadViewSpec;
    .locals 1

    .prologue
    .line 798
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/t;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->O()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    goto :goto_0
.end method

.method public w()Z
    .locals 1

    .prologue
    .line 802
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->D:Lcom/facebook/orca/threadview/ThreadViewFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->E:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public x()Z
    .locals 1

    .prologue
    .line 913
    iget-object v0, p0, Lcom/facebook/orca/threadlist/t;->i:Lcom/facebook/orca/threadlist/ThreadListFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/ThreadListFragment;->c()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
