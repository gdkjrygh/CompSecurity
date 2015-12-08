.class public Lkik/android/chat/fragment/KikGroupMembersListFragment;
.super Lkik/android/chat/fragment/KikIqFragmentBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikGroupMembersListFragment$a;
    }
.end annotation


# instance fields
.field private A:Lcom/kik/g/r;

.field _addButton:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0130
    .end annotation
.end field

.field _groupMembersList:Landroid/widget/ListView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0063
    .end annotation
.end field

.field protected a:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected b:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lkik/a/e/l;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected d:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContactImageLoader"
    .end annotation
.end field

.field protected e:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field f:Lkik/a/d/p;

.field g:Lkik/android/chat/fragment/ProgressDialogFragment;

.field private h:Landroid/view/View;

.field private i:Lkik/a/d/n;

.field private j:Lcom/kik/view/adapters/k;

.field private k:Lcom/kik/view/adapters/ba;

.field private l:Lcom/kik/view/adapters/ba;

.field private m:Lcom/kik/view/adapters/ba;

.field private n:Ljava/util/ArrayList;

.field private o:Ljava/util/ArrayList;

.field private p:Ljava/util/ArrayList;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:Lkik/android/chat/fragment/KikGroupMembersListFragment$a;

.field private x:Lcom/kik/g/i;

.field private y:Lcom/kik/g/i;

.field private z:Lcom/kik/g/r;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 53
    invoke-direct {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;-><init>()V

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->n:Ljava/util/ArrayList;

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->o:Ljava/util/ArrayList;

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->p:Ljava/util/ArrayList;

    .line 90
    new-instance v0, Lkik/android/chat/fragment/KikGroupMembersListFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment$a;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->t:Lkik/android/chat/fragment/KikGroupMembersListFragment$a;

    .line 99
    new-instance v0, Lkik/android/chat/fragment/li;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/li;-><init>(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->x:Lcom/kik/g/i;

    .line 110
    new-instance v0, Lkik/android/chat/fragment/ll;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ll;-><init>(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->y:Lcom/kik/g/i;

    .line 417
    new-instance v0, Lkik/android/chat/fragment/lr;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/lr;-><init>(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->z:Lcom/kik/g/r;

    .line 490
    new-instance v0, Lkik/android/chat/fragment/lt;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/lt;-><init>(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->A:Lcom/kik/g/r;

    .line 561
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikGroupMembersListFragment;Lcom/kik/view/adapters/ba;)Lcom/kik/view/adapters/ba;
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->k:Lcom/kik/view/adapters/ba;

    return-object p1
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lkik/a/d/n;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->i:Lkik/a/d/n;

    return-object v0
.end method

.method private a()V
    .locals 1

    .prologue
    .line 332
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->i:Lkik/a/d/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->i:Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 333
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->J()V

    .line 335
    :cond_0
    new-instance v0, Lkik/android/chat/fragment/lq;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/lq;-><init>(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(Ljava/lang/Runnable;)V

    .line 365
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikGroupMembersListFragment;Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 53
    if-eqz p1, :cond_1

    const v1, 0x7f090148

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(Ljava/lang/String;Z)V

    const-string v1, "KikPickUsersFragment.RESULT_SELECTED_USERS"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    array-length v1, v2

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v4, v2

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_0

    aget-object v0, v2, v1

    check-cast v0, Lcom/kik/cards/util/UserDataParcelable;

    iget-object v0, v0, Lcom/kik/cards/util/UserDataParcelable;->a:Ljava/lang/String;

    iget-object v5, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a:Lkik/a/e/r;

    invoke-interface {v5, v0}, Lkik/a/e/r;->b(Ljava/lang/String;)Lkik/a/d/k;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->c:Lkik/a/e/l;

    iget-object v1, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->i:Lkik/a/d/n;

    invoke-interface {v0, v1, v3}, Lkik/a/e/l;->a(Lkik/a/d/n;Ljava/util/List;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/ln;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ln;-><init>(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    :cond_1
    return-void
.end method

.method private a(ZZ)V
    .locals 10

    .prologue
    const/4 v9, 0x0

    const/4 v8, 0x1

    .line 541
    if-eqz p2, :cond_0

    const v0, 0x7f090294

    move v4, v0

    .line 542
    :goto_0
    if-eqz p2, :cond_2

    const v0, 0x7f090032

    move v1, v0

    .line 543
    :goto_1
    if-eqz p2, :cond_4

    const v0, 0x7f090293

    move v6, v0

    .line 544
    :goto_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->f:Lkik/a/d/p;

    invoke-virtual {v0}, Lkik/a/d/p;->a()Lkik/a/d/k;

    move-result-object v3

    .line 545
    new-instance v2, Lkik/android/chat/fragment/ProgressDialogFragment;

    const v0, 0x7f090148

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v8}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    .line 546
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-direct {v0, v5}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    new-array v5, v8, [Ljava/lang/Object;

    invoke-static {v3}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v9

    invoke-static {v4, v5}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    new-array v4, v8, [Ljava/lang/Object;

    invoke-static {v3}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v9

    invoke-static {v1, v4}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    invoke-virtual {v0, v8}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v7

    new-instance v0, Lkik/android/chat/fragment/lk;

    move-object v1, p0

    move v4, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lkik/android/chat/fragment/lk;-><init>(Lkik/android/chat/fragment/KikGroupMembersListFragment;Lkik/android/chat/fragment/ProgressDialogFragment;Lkik/a/d/k;ZZ)V

    invoke-virtual {v7, v6, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v1, 0x7f090299

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    .line 558
    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v2, "build"

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    .line 559
    return-void

    .line 541
    :cond_0
    if-eqz p1, :cond_1

    const v0, 0x7f0902fa

    move v4, v0

    goto :goto_0

    :cond_1
    const v0, 0x7f090318

    move v4, v0

    goto :goto_0

    .line 542
    :cond_2
    if-eqz p1, :cond_3

    const v0, 0x7f090036

    move v1, v0

    goto :goto_1

    :cond_3
    const v0, 0x7f090037

    move v1, v0

    goto :goto_1

    .line 543
    :cond_4
    if-eqz p1, :cond_5

    const v0, 0x7f0902f9

    move v6, v0

    goto :goto_2

    :cond_5
    const v0, 0x7f090339

    move v6, v0

    goto :goto_2
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikGroupMembersListFragment;Lcom/kik/view/adapters/ba;)Lcom/kik/view/adapters/ba;
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->l:Lcom/kik/view/adapters/ba;

    return-object p1
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a()V

    return-void
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikGroupMembersListFragment;Lcom/kik/view/adapters/ba;)Lcom/kik/view/adapters/ba;
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->m:Lcom/kik/view/adapters/ba;

    return-object p1
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 53
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a:Lkik/a/e/r;

    iget-object v1, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b:Lkik/a/e/v;

    invoke-static {v1}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v5}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->i:Lkik/a/d/n;

    invoke-virtual {v1}, Lkik/a/d/n;->A()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->n:Ljava/util/ArrayList;

    new-instance v2, Lkik/a/d/p;

    sget v3, Lkik/a/d/p$a;->a:I

    invoke-direct {v2, v0, v3}, Lkik/a/d/p;-><init>(Lkik/a/d/k;I)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->i:Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->z()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->n:Ljava/util/ArrayList;

    new-instance v3, Lkik/a/d/p;

    iget-object v4, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a:Lkik/a/e/r;

    invoke-interface {v4, v0, v5}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    sget v4, Lkik/a/d/p$a;->a:I

    invoke-direct {v3, v0, v4}, Lkik/a/d/p;-><init>(Lkik/a/d/k;I)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->p:Ljava/util/ArrayList;

    new-instance v2, Lkik/a/d/p;

    sget v3, Lkik/a/d/p$a;->c:I

    invoke-direct {v2, v0, v3}, Lkik/a/d/p;-><init>(Lkik/a/d/k;I)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->i:Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->y()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->o:Ljava/util/ArrayList;

    new-instance v3, Lkik/a/d/p;

    iget-object v4, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a:Lkik/a/e/r;

    invoke-interface {v4, v0, v5}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    sget v4, Lkik/a/d/p$a;->b:I

    invoke-direct {v3, v0, v4}, Lkik/a/d/p;-><init>(Lkik/a/d/k;I)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->i:Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->x()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->p:Ljava/util/ArrayList;

    new-instance v3, Lkik/a/d/p;

    iget-object v4, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a:Lkik/a/e/r;

    invoke-interface {v4, v0, v5}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    sget v4, Lkik/a/d/p$a;->c:I

    invoke-direct {v3, v0, v4}, Lkik/a/d/p;-><init>(Lkik/a/d/k;I)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    return-void
.end method

.method static synthetic d(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/view/adapters/ba;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->k:Lcom/kik/view/adapters/ba;

    return-object v0
.end method

.method static synthetic e(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->n:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic f(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/view/adapters/ba;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->l:Lcom/kik/view/adapters/ba;

    return-object v0
.end method

.method static synthetic g(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->o:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic h(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/view/adapters/ba;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->m:Lcom/kik/view/adapters/ba;

    return-object v0
.end method

.method static synthetic i(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->p:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic j(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->q:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/view/adapters/k;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->j:Lcom/kik/view/adapters/k;

    return-object v0
.end method

.method static synthetic l(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->r:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic m(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->s:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic n(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Landroid/view/View;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->h:Landroid/view/View;

    return-object v0
.end method

.method static synthetic o(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/g/r;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->A:Lcom/kik/g/r;

    return-object v0
.end method

.method static synthetic p(Lkik/android/chat/fragment/KikGroupMembersListFragment;)Lcom/kik/g/r;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->z:Lcom/kik/g/r;

    return-object v0
.end method


# virtual methods
.method protected final K()I
    .locals 1

    .prologue
    .line 237
    const v0, 0x7f09015c

    return v0
.end method

.method protected final a(Lcom/kik/g/f;)V
    .locals 2

    .prologue
    .line 95
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->c:Lkik/a/e/l;

    invoke-interface {v0}, Lkik/a/e/l;->e()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->x:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 96
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a:Lkik/a/e/r;

    invoke-interface {v0}, Lkik/a/e/r;->c()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->y:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 97
    return-void
.end method

.method protected onAddButtonPressed()V
    .locals 6
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0e0130
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    .line 126
    new-instance v1, Lkik/android/chat/fragment/KikPickUsersFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikPickUsersFragment$a;-><init>()V

    .line 128
    new-instance v2, Ljava/util/ArrayList;

    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->i:Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v3, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->i:Lkik/a/d/n;

    invoke-virtual {v3}, Lkik/a/d/n;->y()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v0, v3

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 131
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->i:Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 132
    iget-object v4, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a:Lkik/a/e/r;

    invoke-interface {v4, v0, v5}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 133
    if-eqz v0, :cond_0

    .line 134
    invoke-virtual {v0}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 137
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->i:Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->y()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 138
    iget-object v4, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a:Lkik/a/e/r;

    invoke-interface {v4, v0, v5}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 139
    if-eqz v0, :cond_2

    .line 140
    invoke-virtual {v0}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 143
    :cond_3
    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->b(Ljava/util/ArrayList;)Lkik/android/chat/fragment/KikPickUsersFragment$a;

    .line 144
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 146
    rsub-int/lit8 v0, v0, 0x32

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikPickUsersFragment$a;->c(I)Lkik/android/chat/fragment/KikPickUsersFragment$a;

    .line 148
    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/lm;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/lm;-><init>(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 155
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 394
    iget-object v2, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->f:Lkik/a/d/p;

    invoke-virtual {v2}, Lkik/a/d/p;->a()Lkik/a/d/k;

    move-result-object v2

    .line 396
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    .line 413
    :goto_0
    iput-object v8, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->f:Lkik/a/d/p;

    move v0, v1

    .line 414
    :goto_1
    return v0

    .line 398
    :pswitch_0
    new-instance v1, Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;-><init>()V

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    goto :goto_1

    .line 401
    :pswitch_1
    iget-object v2, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->f:Lkik/a/d/p;

    invoke-virtual {v2}, Lkik/a/d/p;->a()Lkik/a/d/k;

    move-result-object v2

    new-instance v3, Lkik/android/chat/fragment/ProgressDialogFragment;

    const v4, 0x7f090148

    invoke-static {v4}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v1}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    new-instance v4, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-direct {v4, v5}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    const v5, 0x7f0902f5

    new-array v6, v1, [Ljava/lang/Object;

    invoke-static {v2}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v0

    invoke-static {v5, v6}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v4

    const v5, 0x7f090035

    new-array v6, v1, [Ljava/lang/Object;

    invoke-static {v2}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v0

    invoke-static {v5, v6}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v4, 0x7f0902f4

    new-instance v5, Lkik/android/chat/fragment/lj;

    invoke-direct {v5, p0, v3, v2}, Lkik/android/chat/fragment/lj;-><init>(Lkik/android/chat/fragment/KikGroupMembersListFragment;Lkik/android/chat/fragment/ProgressDialogFragment;Lkik/a/d/k;)V

    invoke-virtual {v0, v4, v5}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    const v2, 0x7f090299

    invoke-virtual {v0, v2, v8}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v2, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v3, "build"

    invoke-virtual {p0, v0, v2, v3}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    goto :goto_0

    .line 404
    :pswitch_2
    invoke-direct {p0, v1, v1}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(ZZ)V

    goto :goto_0

    .line 407
    :pswitch_3
    invoke-direct {p0, v1, v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(ZZ)V

    goto :goto_0

    .line 410
    :pswitch_4
    invoke-direct {p0, v0, v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(ZZ)V

    goto :goto_0

    .line 396
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 243
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V

    .line 244
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->onCreate(Landroid/os/Bundle;)V

    .line 245
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->t:Lkik/android/chat/fragment/KikGroupMembersListFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikGroupMembersListFragment$a;->a(Landroid/os/Bundle;)V

    .line 246
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->t:Lkik/android/chat/fragment/KikGroupMembersListFragment$a;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a:Lkik/a/e/r;

    invoke-interface {v1, v0, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lkik/a/d/k;->t()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a:Lkik/a/e/r;

    invoke-interface {v1, v0, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    check-cast v0, Lkik/a/d/n;

    iput-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->i:Lkik/a/d/n;

    .line 247
    :cond_0
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090028

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->q:Ljava/lang/String;

    .line 248
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f09004e

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->r:Ljava/lang/String;

    .line 249
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f09015c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->s:Ljava/lang/String;

    .line 250
    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 371
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikIqFragmentBase;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 372
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->f:Lkik/a/d/p;

    if-nez v0, :cond_0

    .line 389
    :goto_0
    return-void

    .line 375
    :cond_0
    const v0, 0x7f09035f

    invoke-interface {p1, v2, v2, v2, v0}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 377
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v0

    .line 378
    invoke-virtual {v0}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->f:Lkik/a/d/p;

    invoke-virtual {v1}, Lkik/a/d/p;->a()Lkik/a/d/k;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 379
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->f:Lkik/a/d/p;

    invoke-virtual {v0}, Lkik/a/d/p;->b()I

    move-result v0

    sget v1, Lkik/a/d/p$a;->b:I

    if-ne v0, v1, :cond_2

    .line 380
    const/4 v0, 0x4

    const v1, 0x7f090339

    invoke-interface {p1, v2, v0, v2, v1}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 388
    :cond_1
    :goto_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->f:Lkik/a/d/p;

    invoke-virtual {v0}, Lkik/a/d/p;->a()Lkik/a/d/k;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Landroid/view/ContextMenu;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/ContextMenu;

    goto :goto_0

    .line 382
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->f:Lkik/a/d/p;

    invoke-virtual {v0}, Lkik/a/d/p;->b()I

    move-result v0

    sget v1, Lkik/a/d/p$a;->c:I

    if-ne v0, v1, :cond_1

    .line 383
    const/4 v0, 0x1

    const v1, 0x7f0901d7

    invoke-interface {p1, v2, v0, v2, v1}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 384
    const/4 v0, 0x3

    const v1, 0x7f0901f9

    invoke-interface {p1, v2, v0, v2, v1}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 385
    const/4 v0, 0x2

    const v1, 0x7f09004c

    invoke-interface {p1, v2, v0, v2, v1}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    goto :goto_1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    .line 255
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikIqFragmentBase;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 256
    const v0, 0x7f03000e

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->h:Landroid/view/View;

    .line 257
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->h:Landroid/view/View;

    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 259
    new-instance v0, Lcom/kik/view/adapters/k;

    iget-object v1, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->_groupMembersList:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kik/view/adapters/k;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->j:Lcom/kik/view/adapters/k;

    .line 261
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->_groupMembersList:Landroid/widget/ListView;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->registerForContextMenu(Landroid/view/View;)V

    .line 263
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->_groupMembersList:Landroid/widget/ListView;

    new-instance v1, Lkik/android/chat/fragment/lo;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/lo;-><init>(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 281
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->_groupMembersList:Landroid/widget/ListView;

    new-instance v1, Lkik/android/chat/fragment/lp;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/lp;-><init>(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 288
    new-instance v0, Lkik/android/chat/fragment/ProgressDialogFragment;

    const v1, 0x7f090148

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->g:Lkik/android/chat/fragment/ProgressDialogFragment;

    .line 290
    invoke-direct {p0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a()V

    .line 291
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->_groupMembersList:Landroid/widget/ListView;

    iget-object v1, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->j:Lcom/kik/view/adapters/k;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 292
    iget-object v0, p0, Lkik/android/chat/fragment/KikGroupMembersListFragment;->h:Landroid/view/View;

    return-object v0
.end method
