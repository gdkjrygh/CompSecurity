.class public Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;
.super Lcom/facebook/base/fragment/FbFragment;
.source "ContactMultipickerFragment.java"


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
.field private Z:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

.field private aa:Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;

.field private ab:Landroid/view/View;

.field private ac:Landroid/view/View;

.field private ad:Lcom/facebook/widget/listview/BetterListView;

.field private ae:Lcom/facebook/contacts/picker/ae;

.field private af:Lcom/facebook/contacts/picker/v;

.field private ag:Lcom/facebook/orca/contacts/picker/z;

.field private ah:Lcom/facebook/orca/contacts/picker/aa;

.field private ai:Z

.field private aj:Lcom/facebook/orca/contacts/divebar/an;

.field private ak:Z

.field private al:Z

.field private b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/facebook/analytics/av;

.field private e:Lcom/facebook/contacts/picker/c;

.field private f:Lcom/facebook/orca/contacts/divebar/ao;

.field private g:Lcom/facebook/orca/contacts/picker/az;

.field private h:Ljava/lang/String;

.field private i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 54
    const-class v0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;

    sput-object v0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 53
    invoke-direct {p0}, Lcom/facebook/base/fragment/FbFragment;-><init>()V

    .line 90
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->al:Z

    return-void
.end method

.method static synthetic R()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 53
    sget-object v0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a:Ljava/lang/Class;

    return-object v0
.end method

.method private T()V
    .locals 2

    .prologue
    .line 201
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ab:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/contacts/picker/e;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/picker/e;-><init>(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 207
    return-void
.end method

.method private U()Z
    .locals 1

    .prologue
    .line 263
    iget-boolean v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->al:Z

    if-nez v0, :cond_0

    .line 264
    const/4 v0, 0x0

    .line 266
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method

.method private V()V
    .locals 3

    .prologue
    .line 271
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ad:Lcom/facebook/widget/listview/BetterListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->setDividerHeight(I)V

    .line 274
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ad:Lcom/facebook/widget/listview/BetterListView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->setBroadcastInteractionChanges(Z)V

    .line 276
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ad:Lcom/facebook/widget/listview/BetterListView;

    new-instance v1, Lcom/facebook/orca/contacts/picker/f;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/picker/f;-><init>(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 292
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ad:Lcom/facebook/widget/listview/BetterListView;

    new-instance v1, Lcom/facebook/orca/contacts/picker/g;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/picker/g;-><init>(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 300
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ad:Lcom/facebook/widget/listview/BetterListView;

    new-instance v1, Lcom/facebook/orca/contacts/picker/ae;

    iget-object v2, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->e:Lcom/facebook/contacts/picker/c;

    invoke-direct {v1, v2}, Lcom/facebook/orca/contacts/picker/ae;-><init>(Lcom/facebook/contacts/picker/c;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 302
    return-void
.end method

.method private W()V
    .locals 4

    .prologue
    .line 458
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->y()Landroid/support/v4/app/ag;

    move-result-object v0

    .line 459
    const/16 v1, 0x3e8

    const/4 v2, 0x0

    new-instance v3, Lcom/facebook/orca/contacts/picker/h;

    invoke-direct {v3, p0}, Lcom/facebook/orca/contacts/picker/h;-><init>(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)V

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/ag;->a(ILandroid/os/Bundle;Landroid/support/v4/app/ah;)Landroid/support/v4/a/c;

    .line 482
    return-void
.end method

.method private a(Lcom/google/common/a/es;Lcom/google/common/a/fi;)Lcom/google/common/a/es;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;",
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/user/UserIdentifierKey;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/picker/ad;",
            ">;"
        }
    .end annotation

    .prologue
    .line 354
    if-nez p1, :cond_1

    .line 355
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 376
    :cond_0
    :goto_0
    return-object v0

    .line 357
    :cond_1
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 358
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ae:Lcom/facebook/contacts/picker/ae;

    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 360
    const/4 v0, 0x0

    move v1, v0

    .line 361
    :goto_1
    const/16 v0, 0x14

    if-ge v1, v0, :cond_2

    invoke-virtual {p1}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 362
    invoke-virtual {p1, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 364
    new-instance v3, Lcom/facebook/user/UserWithIdentifier;

    invoke-virtual {v0}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v4

    invoke-direct {v3, v0, v4}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    .line 366
    invoke-virtual {v0}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserFbidIdentifier;->c()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/common/a/fi;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p0, v3, v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a(Lcom/facebook/user/UserWithIdentifier;Z)Lcom/facebook/contacts/picker/ad;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 361
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 371
    :cond_2
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 372
    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_0

    .line 374
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->b:Ljavax/inject/a;

    return-object v0
.end method

.method private a(Landroid/view/View;Landroid/view/View;)V
    .locals 2

    .prologue
    .line 493
    sget-object v0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a:Ljava/lang/Class;

    const-string v1, "onContactPickerFocusChanged"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 495
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 496
    :goto_0
    if-eqz v0, :cond_0

    .line 497
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->Z:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v1}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->z()Landroid/view/View;

    move-result-object v1

    if-ne v0, v1, :cond_2

    .line 498
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->b()V

    .line 506
    :cond_0
    :goto_1
    return-void

    .line 495
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 500
    :cond_2
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ad:Lcom/facebook/widget/listview/BetterListView;

    if-ne v0, v1, :cond_3

    .line 501
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->b()V

    goto :goto_1

    .line 504
    :cond_3
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/contacts/divebar/an;)V
    .locals 5

    .prologue
    .line 485
    const/4 v0, 0x3

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 486
    sget-object v1, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a:Ljava/lang/Class;

    const-string v2, "onNewContactSuggestionsResult: %s"

    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/Object;

    const/4 v4, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/an;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 488
    :cond_0
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->aj:Lcom/facebook/orca/contacts/divebar/an;

    .line 489
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->P()V

    .line 490
    return-void

    .line 486
    :cond_1
    const-string v0, "null"

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;I)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->f(I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;Lcom/facebook/orca/contacts/divebar/an;)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a(Lcom/facebook/orca/contacts/divebar/an;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)Lcom/facebook/orca/contacts/picker/az;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->g:Lcom/facebook/orca/contacts/picker/az;

    return-object v0
.end method

.method private b(Z)V
    .locals 2

    .prologue
    .line 428
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "click"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "multipicker_list_item"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "contact_multipicker_item"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "is_picked"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 433
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->h:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 434
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 437
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->d:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 438
    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)Lcom/facebook/orca/contacts/picker/ContactPickerFragment;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->Z:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)Lcom/facebook/orca/contacts/divebar/ao;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->f:Lcom/facebook/orca/contacts/divebar/ao;

    return-object v0
.end method

.method private f(I)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 401
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->e:Lcom/facebook/contacts/picker/c;

    if-nez v0, :cond_1

    .line 425
    :cond_0
    :goto_0
    return-void

    .line 405
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->e:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/c;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    .line 409
    instance-of v2, v0, Lcom/facebook/contacts/picker/ag;

    if-eqz v2, :cond_0

    .line 410
    check-cast v0, Lcom/facebook/contacts/picker/ag;

    .line 411
    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->a()Lcom/facebook/user/UserWithIdentifier;

    move-result-object v2

    .line 414
    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->k()Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    .line 416
    :goto_1
    if-eqz v0, :cond_3

    .line 417
    iget-object v3, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->Z:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v3, v2}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->b(Lcom/facebook/user/UserWithIdentifier;)V

    .line 422
    :goto_2
    iput-boolean v1, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ak:Z

    .line 423
    invoke-direct {p0, v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->b(Z)V

    goto :goto_0

    .line 414
    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    .line 419
    :cond_3
    iget-object v3, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->Z:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v3, v2}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->c(Lcom/facebook/user/UserWithIdentifier;)V

    goto :goto_2
.end method


# virtual methods
.method public O()V
    .locals 2

    .prologue
    .line 255
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ac:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 256
    return-void
.end method

.method public P()V
    .locals 2

    .prologue
    .line 331
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->aj:Lcom/facebook/orca/contacts/divebar/an;

    if-nez v0, :cond_0

    .line 342
    :goto_0
    return-void

    .line 334
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->Z:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    .line 336
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->aj:Lcom/facebook/orca/contacts/divebar/an;

    invoke-virtual {v1}, Lcom/facebook/orca/contacts/divebar/an;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a(Lcom/google/common/a/es;Lcom/google/common/a/fi;)Lcom/google/common/a/es;

    move-result-object v0

    .line 340
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->e:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v1, v0}, Lcom/facebook/contacts/picker/c;->a(Lcom/google/common/a/es;)V

    .line 341
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->e:Lcom/facebook/contacts/picker/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/c;->notifyDataSetChanged()V

    goto :goto_0
.end method

.method public Q()Z
    .locals 1

    .prologue
    .line 451
    iget-boolean v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ak:Z

    return v0
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    .line 162
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 163
    sget v0, Lcom/facebook/k;->orca_contact_multipicker:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 164
    sget v0, Lcom/facebook/i;->multipicker_custom_layout:I

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->aa:Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;

    .line 165
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->aa:Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;

    iget v2, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->i:I

    invoke-virtual {v0, v2}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->setMinBottomSizePx(I)V

    .line 166
    sget v0, Lcom/facebook/i;->suggestions_contacts_list:I

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/BetterListView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ad:Lcom/facebook/widget/listview/BetterListView;

    .line 167
    sget v0, Lcom/facebook/i;->multipicker_cover:I

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ab:Landroid/view/View;

    .line 168
    sget v0, Lcom/facebook/i;->suggestions_container:I

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ac:Landroid/view/View;

    .line 169
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->q()Landroid/support/v4/app/q;

    move-result-object v0

    sget v2, Lcom/facebook/i;->multipicker_contact_picker:I

    invoke-virtual {v0, v2}, Landroid/support/v4/app/q;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->Z:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    .line 171
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->Z:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    sget-object v2, Lcom/facebook/orca/contacts/picker/x;->FACEBOOK_LIST:Lcom/facebook/orca/contacts/picker/x;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Lcom/facebook/orca/contacts/picker/x;)V

    .line 173
    return-object v1
.end method

.method public a(Lcom/facebook/user/UserWithIdentifier;Z)Lcom/facebook/contacts/picker/ad;
    .locals 2

    .prologue
    .line 382
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 383
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->g:Lcom/facebook/orca/contacts/picker/az;

    sget-object v1, Lcom/facebook/contacts/picker/ah;->SUGGESTIONS:Lcom/facebook/contacts/picker/ah;

    invoke-virtual {v0, p1, v1, p2}, Lcom/facebook/orca/contacts/picker/az;->a(Lcom/facebook/user/UserWithIdentifier;Lcom/facebook/contacts/picker/ah;Z)Lcom/facebook/contacts/picker/ag;

    move-result-object v0

    .line 389
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->g:Lcom/facebook/orca/contacts/picker/az;

    sget-object v1, Lcom/facebook/contacts/picker/ah;->SUGGESTIONS:Lcom/facebook/contacts/picker/ah;

    invoke-virtual {v0, p1, v1, p2}, Lcom/facebook/orca/contacts/picker/az;->b(Lcom/facebook/user/UserWithIdentifier;Lcom/facebook/contacts/picker/ah;Z)Lcom/facebook/contacts/picker/ag;

    move-result-object v0

    goto :goto_0
.end method

.method public a()Lcom/facebook/orca/contacts/picker/ContactPickerFragment;
    .locals 1

    .prologue
    .line 197
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->Z:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    return-object v0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 94
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/os/Bundle;)V

    .line 96
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->S()Lcom/facebook/inject/t;

    move-result-object v2

    .line 97
    const-class v0, Lcom/facebook/orca/contacts/picker/az;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/picker/az;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->g:Lcom/facebook/orca/contacts/picker/az;

    .line 98
    const-class v0, Ljava/lang/Boolean;

    const-class v1, Lcom/facebook/orca/annotations/ShowPresenceInfoInContactPicker;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->b:Ljavax/inject/a;

    .line 100
    const-class v0, Ljava/lang/Boolean;

    const-class v1, Lcom/facebook/orca/annotations/IsSuggestionsEnabled;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->c:Ljavax/inject/a;

    .line 101
    const-class v0, Landroid/content/res/Resources;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/res/Resources;

    .line 102
    const-class v1, Lcom/facebook/analytics/av;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/av;

    iput-object v1, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->d:Lcom/facebook/analytics/av;

    .line 103
    const-class v1, Lcom/facebook/contacts/picker/c;

    const-class v3, Lcom/facebook/orca/annotations/ForContactMultiPicker;

    invoke-virtual {v2, v1, v3}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/contacts/picker/c;

    iput-object v1, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->e:Lcom/facebook/contacts/picker/c;

    .line 107
    const-class v1, Lcom/facebook/orca/contacts/divebar/ao;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/contacts/divebar/ao;

    iput-object v1, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->f:Lcom/facebook/orca/contacts/divebar/ao;

    .line 109
    new-instance v1, Lcom/facebook/contacts/picker/ae;

    sget v2, Lcom/facebook/o;->contact_multipicker_suggestions_header:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/facebook/contacts/picker/ae;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ae:Lcom/facebook/contacts/picker/ae;

    .line 112
    new-instance v0, Lcom/facebook/orca/contacts/picker/a;

    invoke-direct {v0, p0}, Lcom/facebook/orca/contacts/picker/a;-><init>(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)V

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->af:Lcom/facebook/contacts/picker/v;

    .line 132
    new-instance v0, Lcom/facebook/orca/contacts/picker/b;

    invoke-direct {v0, p0}, Lcom/facebook/orca/contacts/picker/b;-><init>(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)V

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ag:Lcom/facebook/orca/contacts/picker/z;

    .line 144
    new-instance v0, Lcom/facebook/orca/contacts/picker/c;

    invoke-direct {v0, p0}, Lcom/facebook/orca/contacts/picker/c;-><init>(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)V

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ah:Lcom/facebook/orca/contacts/picker/aa;

    .line 153
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->l()Landroid/support/v4/app/i;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/orca/creation/CreateThreadActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 154
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->W()V

    .line 156
    :cond_1
    return-void
.end method

.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 1

    .prologue
    .line 315
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/support/v4/app/Fragment;)V

    .line 317
    instance-of v0, p1, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    if-eqz v0, :cond_0

    .line 318
    check-cast p1, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    .line 319
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->af:Lcom/facebook/contacts/picker/v;

    invoke-virtual {p1, v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Lcom/facebook/contacts/picker/v;)V

    .line 320
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ag:Lcom/facebook/orca/contacts/picker/z;

    invoke-virtual {p1, v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Lcom/facebook/orca/contacts/picker/z;)V

    .line 322
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ah:Lcom/facebook/orca/contacts/picker/aa;

    invoke-virtual {p1, v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Lcom/facebook/orca/contacts/picker/aa;)V

    .line 324
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 210
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->h:Ljava/lang/String;

    .line 211
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 515
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->Z:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->a(Ljava/util/List;)V

    .line 516
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->P()V

    .line 517
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 259
    iput-boolean p1, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->al:Z

    .line 260
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 225
    iget-boolean v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ai:Z

    if-nez v0, :cond_0

    .line 226
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ab:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/TransitionDrawable;

    .line 227
    const/16 v1, 0x12c

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    .line 228
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->T()V

    .line 229
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ai:Z

    .line 231
    :cond_0
    return-void
.end method

.method public c()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 237
    iget-boolean v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ai:Z

    if-eqz v0, :cond_0

    .line 238
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ab:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/TransitionDrawable;

    .line 239
    const/16 v1, 0x12c

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/TransitionDrawable;->reverseTransition(I)V

    .line 240
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ab:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 241
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ab:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setClickable(Z)V

    .line 242
    iput-boolean v2, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ai:Z

    .line 243
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->Z:Lcom/facebook/orca/contacts/picker/ContactPickerFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ContactPickerFragment;->Q()V

    .line 244
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ad:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/BetterListView;->requestFocus()Z

    .line 246
    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    .prologue
    .line 249
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->U()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 250
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ac:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 252
    :cond_0
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 178
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->d(Landroid/os/Bundle;)V

    .line 180
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->V()V

    .line 182
    if-eqz p1, :cond_0

    const-string v0, "multipickerCoverShown"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->b()V

    .line 186
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->z()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/d;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/picker/d;-><init>(Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 194
    return-void
.end method

.method public e(I)V
    .locals 2

    .prologue
    .line 214
    iput p1, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->i:I

    .line 215
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->aa:Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;

    if-eqz v0, :cond_0

    .line 216
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->aa:Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;

    iget v1, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->i:I

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->setMinBottomSizePx(I)V

    .line 217
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->aa:Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/MultipickerCustomLayout;->invalidate()V

    .line 219
    :cond_0
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 306
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->e(Landroid/os/Bundle;)V

    .line 307
    const-string v0, "multipickerCoverShown"

    iget-boolean v1, p0, Lcom/facebook/orca/contacts/picker/ContactMultipickerFragment;->ai:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 311
    return-void
.end method
