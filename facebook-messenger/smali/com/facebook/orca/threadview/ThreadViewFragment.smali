.class public Lcom/facebook/orca/threadview/ThreadViewFragment;
.super Lcom/facebook/base/fragment/FbFragment;
.source "ThreadViewFragment.java"

# interfaces
.implements Lcom/facebook/analytics/d;
.implements Lcom/facebook/base/fragment/b;
.implements Lcom/facebook/orca/threadview/ar;


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
.field private Z:Lcom/facebook/orca/notify/as;

.field private aA:Lcom/facebook/orca/compose/LocationDisabledNuxView;

.field private aB:Landroid/view/View;

.field private aC:Landroid/widget/EditText;

.field private aD:Landroid/view/View;

.field private aE:Landroid/widget/Button;

.field private aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

.field private aG:Lcom/facebook/zero/ui/l;

.field private aH:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/widget/titlebar/d;",
            ">;"
        }
    .end annotation
.end field

.field private aI:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/widget/titlebar/d;",
            ">;"
        }
    .end annotation
.end field

.field private aJ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/widget/titlebar/d;",
            ">;"
        }
    .end annotation
.end field

.field private aK:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/widget/titlebar/d;",
            ">;"
        }
    .end annotation
.end field

.field private aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

.field private aM:Lcom/facebook/orca/threadview/ThreadViewMapFragment;

.field private aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

.field private aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

.field private aP:Z

.field private aQ:Z

.field private aR:Z

.field private aS:Z

.field private aT:Z

.field private aU:Z

.field private aV:Lcom/facebook/orca/threadview/ca;

.field private aW:Lcom/facebook/orca/threadview/cp;

.field private aX:Z

.field private aY:Z

.field private aZ:Lcom/facebook/orca/compose/ai;

.field private aa:Lcom/facebook/orca/f/b;

.field private ab:Lcom/facebook/orca/f/x;

.field private ac:Lcom/facebook/orca/f/o;

.field private ad:Lcom/facebook/analytics/av;

.field private ae:Lcom/facebook/orca/threads/q;

.field private af:Lcom/facebook/orca/prefs/az;

.field private ag:Lcom/facebook/orca/d/m;

.field private ah:Lcom/facebook/orca/d/af;

.field private ai:Lcom/facebook/config/a/a;

.field private aj:Lcom/facebook/orca/threadview/cb;

.field private ak:Lcom/facebook/fbservice/ops/k;

.field private al:Lcom/facebook/orca/threadview/dn;

.field private am:Lcom/facebook/orca/common/ui/widgets/text/a;

.field private an:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private ao:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private ap:Lcom/facebook/orca/nux/ThreadTitleNuxView;

.field private aq:Lcom/facebook/orca/nux/u;

.field private ar:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private as:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private at:Lcom/facebook/widget/titlebar/a;

.field private au:Lcom/facebook/widget/listview/EmptyListViewItem;

.field private av:Lcom/facebook/orca/threadview/ThreadAlertRateLimitView;

.field private aw:Lcom/facebook/orca/threadview/upsell/a;

.field private ax:Lcom/facebook/c/s;

.field private ay:Lcom/facebook/orca/compose/av;

.field private az:Lcom/facebook/orca/compose/LocationNuxView;

.field private b:Lcom/facebook/orca/threadview/ci;

.field private ba:Z

.field private bb:Lcom/facebook/base/fragment/c;

.field private bc:F

.field private bd:F

.field private c:Lcom/facebook/orca/f/k;

.field private d:Lcom/facebook/orca/notify/av;

.field private e:Lcom/facebook/prefs/shared/d;

.field private f:Landroid/support/v4/app/q;

.field private g:Lcom/facebook/orca/common/ui/widgets/a;

.field private h:Lcom/facebook/ui/d/d;

.field private i:Landroid/view/inputmethod/InputMethodManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 133
    const-class v0, Lcom/facebook/orca/threadview/ThreadViewFragment;

    sput-object v0, Lcom/facebook/orca/threadview/ThreadViewFragment;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 130
    invoke-direct {p0}, Lcom/facebook/base/fragment/FbFragment;-><init>()V

    .line 186
    sget-object v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 208
    sget-object v0, Lcom/facebook/orca/threadview/ci;->a:Lcom/facebook/orca/threadview/cp;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    return-void
.end method

.method static synthetic U()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 130
    sget-object v0, Lcom/facebook/orca/threadview/ThreadViewFragment;->a:Ljava/lang/Class;

    return-object v0
.end method

.method private V()V
    .locals 3

    .prologue
    .line 413
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 414
    const-class v0, Lcom/facebook/orca/threadview/ci;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ci;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->b:Lcom/facebook/orca/threadview/ci;

    .line 415
    const-class v0, Lcom/facebook/orca/f/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->c:Lcom/facebook/orca/f/k;

    .line 416
    const-class v0, Lcom/facebook/orca/notify/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/av;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->d:Lcom/facebook/orca/notify/av;

    .line 417
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->e:Lcom/facebook/prefs/shared/d;

    .line 418
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->q()Landroid/support/v4/app/q;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    .line 419
    const-class v0, Lcom/facebook/orca/common/ui/widgets/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/a;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    .line 420
    const-class v0, Lcom/facebook/ui/d/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/d/d;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->h:Lcom/facebook/ui/d/d;

    .line 421
    const-class v0, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->i:Landroid/view/inputmethod/InputMethodManager;

    .line 422
    const-class v0, Lcom/facebook/orca/notify/as;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/as;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->Z:Lcom/facebook/orca/notify/as;

    .line 423
    const-class v0, Lcom/facebook/orca/f/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/b;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aa:Lcom/facebook/orca/f/b;

    .line 424
    const-class v0, Lcom/facebook/orca/f/x;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/x;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ab:Lcom/facebook/orca/f/x;

    .line 425
    const-class v0, Lcom/facebook/orca/f/o;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/o;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ac:Lcom/facebook/orca/f/o;

    .line 426
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ad:Lcom/facebook/analytics/av;

    .line 427
    const-class v0, Lcom/facebook/orca/threads/q;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/q;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ae:Lcom/facebook/orca/threads/q;

    .line 428
    const-class v0, Lcom/facebook/orca/threadview/dn;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/dn;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->al:Lcom/facebook/orca/threadview/dn;

    .line 429
    const-class v0, Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/text/a;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->am:Lcom/facebook/orca/common/ui/widgets/text/a;

    .line 431
    const-class v0, Lcom/facebook/orca/prefs/az;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/prefs/az;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->af:Lcom/facebook/orca/prefs/az;

    .line 432
    const-class v0, Lcom/facebook/orca/d/m;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/m;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ag:Lcom/facebook/orca/d/m;

    .line 433
    const-class v0, Lcom/facebook/orca/d/af;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/af;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ah:Lcom/facebook/orca/d/af;

    .line 434
    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/k;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ak:Lcom/facebook/fbservice/ops/k;

    .line 435
    const-class v0, Lcom/facebook/config/a/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/a;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ai:Lcom/facebook/config/a/a;

    .line 436
    const-class v0, Lcom/facebook/orca/a/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->an:Ljavax/inject/a;

    .line 437
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsThreadviewDivebarButtonEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ao:Ljavax/inject/a;

    .line 439
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ax:Lcom/facebook/c/s;

    .line 440
    const-class v0, Lcom/facebook/zero/ui/l;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/ui/l;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aG:Lcom/facebook/zero/ui/l;

    .line 441
    return-void
.end method

.method private W()V
    .locals 7

    .prologue
    .line 444
    sget v0, Lcom/facebook/i;->threadview_empty_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/EmptyListViewItem;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->au:Lcom/facebook/widget/listview/EmptyListViewItem;

    .line 445
    sget v0, Lcom/facebook/i;->compose_location_nux:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/LocationNuxView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->az:Lcom/facebook/orca/compose/LocationNuxView;

    .line 446
    sget v0, Lcom/facebook/i;->compose_location_disabled_nux:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/LocationDisabledNuxView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aA:Lcom/facebook/orca/compose/LocationDisabledNuxView;

    .line 447
    sget v0, Lcom/facebook/i;->thread_view_rate_limit_popup:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ThreadAlertRateLimitView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->av:Lcom/facebook/orca/threadview/ThreadAlertRateLimitView;

    .line 448
    sget v0, Lcom/facebook/i;->merged_threads_upsell_intro:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/facebook/widget/ConfirmationView;

    .line 449
    sget v0, Lcom/facebook/i;->merged_threads_upsell_contact:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/threadview/upsell/UpsellContactView;

    .line 451
    new-instance v0, Lcom/facebook/orca/threadview/upsell/a;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->y()Landroid/support/v4/app/ag;

    move-result-object v2

    iget-object v5, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->e:Lcom/facebook/prefs/shared/d;

    iget-object v6, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ax:Lcom/facebook/c/s;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/threadview/upsell/a;-><init>(Landroid/content/Context;Landroid/support/v4/app/ag;Lcom/facebook/widget/ConfirmationView;Lcom/facebook/orca/threadview/upsell/UpsellContactView;Lcom/facebook/prefs/shared/d;Lcom/facebook/c/s;)V

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aw:Lcom/facebook/orca/threadview/upsell/a;

    .line 460
    sget v0, Lcom/facebook/i;->cancel_group_name_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aD:Landroid/view/View;

    .line 461
    sget v0, Lcom/facebook/i;->group_name_layout:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aB:Landroid/view/View;

    .line 462
    sget v0, Lcom/facebook/i;->group_name_edit:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aC:Landroid/widget/EditText;

    .line 463
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->X()V

    .line 465
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aD:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/threadview/bu;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/bu;-><init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 481
    sget v0, Lcom/facebook/i;->save_group_name_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aE:Landroid/widget/Button;

    .line 482
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aE:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/threadview/bv;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/bv;-><init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 494
    return-void
.end method

.method private X()V
    .locals 2

    .prologue
    .line 497
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aC:Landroid/widget/EditText;

    new-instance v1, Lcom/facebook/orca/threadview/bw;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/bw;-><init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 512
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aC:Landroid/widget/EditText;

    new-instance v1, Lcom/facebook/orca/threadview/bx;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/bx;-><init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 518
    return-void
.end method

.method private Y()V
    .locals 5

    .prologue
    const/16 v3, 0x8

    const/4 v4, 0x0

    const/4 v1, 0x0

    .line 525
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aC:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->c(Ljava/lang/CharSequence;)Z

    move-result v2

    .line 528
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aC:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz v2, :cond_0

    .line 530
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aD:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 531
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aE:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setVisibility(I)V

    .line 546
    :goto_0
    return-void

    .line 534
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aD:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 535
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aE:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 538
    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aE:Landroid/widget/Button;

    if-nez v2, :cond_1

    const/4 v0, 0x1

    :goto_1
    invoke-virtual {v3, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 540
    if-eqz v2, :cond_2

    .line 541
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aE:Landroid/widget/Button;

    iget v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->bd:F

    iget v3, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->bc:F

    invoke-virtual {v0, v2, v4, v3, v1}, Landroid/widget/Button;->setShadowLayer(FFFI)V

    goto :goto_0

    :cond_1
    move v0, v1

    .line 538
    goto :goto_1

    .line 543
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aE:Landroid/widget/Button;

    iget v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->bd:F

    iget v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->bc:F

    sget v3, Lcom/facebook/f;->composer_button_shadow:I

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/widget/Button;->setShadowLayer(FFFI)V

    goto :goto_0
.end method

.method private Z()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 580
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->at:Lcom/facebook/widget/titlebar/a;

    if-nez v0, :cond_0

    .line 659
    :goto_0
    return-void

    .line 583
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    .line 584
    invoke-static {}, Lcom/facebook/widget/titlebar/d;->newBuilder()Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/facebook/widget/titlebar/e;->a(I)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    sget v2, Lcom/facebook/h;->orca_info_button:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/widget/titlebar/e;->a(Landroid/graphics/drawable/Drawable;)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    const-string v2, "back_side_button"

    invoke-virtual {v0, v2}, Lcom/facebook/widget/titlebar/e;->a(Ljava/lang/String;)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/widget/titlebar/e;->k()Lcom/facebook/widget/titlebar/d;

    move-result-object v2

    .line 589
    invoke-static {}, Lcom/facebook/widget/titlebar/d;->newBuilder()Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Lcom/facebook/widget/titlebar/e;->a(I)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->o()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/facebook/o;->contact_card_edit:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/widget/titlebar/e;->b(Ljava/lang/String;)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    const-string v3, "edit_contact_button"

    invoke-virtual {v0, v3}, Lcom/facebook/widget/titlebar/e;->a(Ljava/lang/String;)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/widget/titlebar/e;->k()Lcom/facebook/widget/titlebar/d;

    move-result-object v3

    .line 594
    invoke-static {}, Lcom/facebook/widget/titlebar/d;->newBuilder()Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    const/4 v4, 0x3

    invoke-virtual {v0, v4}, Lcom/facebook/widget/titlebar/e;->a(I)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->o()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/facebook/o;->contact_card_done:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/facebook/widget/titlebar/e;->b(Ljava/lang/String;)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    const-string v4, "edit_done_contact_button"

    invoke-virtual {v0, v4}, Lcom/facebook/widget/titlebar/e;->a(Ljava/lang/String;)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/widget/titlebar/e;->k()Lcom/facebook/widget/titlebar/d;

    move-result-object v4

    .line 600
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ao:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->l()Landroid/support/v4/app/i;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/orca/activity/k;

    if-eqz v0, :cond_1

    .line 602
    invoke-static {}, Lcom/facebook/widget/titlebar/d;->newBuilder()Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    const/4 v5, 0x4

    invoke-virtual {v0, v5}, Lcom/facebook/widget/titlebar/e;->a(I)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    sget v5, Lcom/facebook/h;->orca_divebar_icon:I

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/titlebar/e;->a(Landroid/graphics/drawable/Drawable;)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    const-string v1, "divebar_button"

    invoke-virtual {v0, v1}, Lcom/facebook/widget/titlebar/e;->a(Ljava/lang/String;)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/widget/titlebar/e;->k()Lcom/facebook/widget/titlebar/d;

    move-result-object v0

    .line 608
    invoke-static {v2, v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aH:Ljava/util/List;

    .line 612
    :goto_1
    invoke-static {v3}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aI:Ljava/util/List;

    .line 613
    invoke-static {v4}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aJ:Ljava/util/List;

    .line 614
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aK:Ljava/util/List;

    .line 616
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->at:Lcom/facebook/widget/titlebar/a;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aH:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setButtonSpecs(Ljava/util/List;)V

    .line 617
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->at:Lcom/facebook/widget/titlebar/a;

    new-instance v1, Lcom/facebook/orca/threadview/by;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/by;-><init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setOnToolbarButtonListener(Lcom/facebook/widget/titlebar/b;)V

    .line 655
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->at:Lcom/facebook/widget/titlebar/a;

    sget v1, Lcom/facebook/o;->thread_list_view_updating:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setTitle(Ljava/lang/String;)V

    .line 656
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->at:Lcom/facebook/widget/titlebar/a;

    invoke-interface {v0, v6}, Lcom/facebook/widget/titlebar/a;->setHasProgressBar(Z)V

    .line 657
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->at:Lcom/facebook/widget/titlebar/a;

    invoke-interface {v0, v6}, Lcom/facebook/widget/titlebar/a;->setHasBackButton(Z)V

    .line 658
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->al:Lcom/facebook/orca/threadview/dn;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->at:Lcom/facebook/widget/titlebar/a;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/dn;->a(Lcom/facebook/widget/titlebar/a;)V

    goto/16 :goto_0

    .line 610
    :cond_1
    invoke-static {v2}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aH:Ljava/util/List;

    goto :goto_1
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ar:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method private a(Lcom/facebook/analytics/cb;)V
    .locals 1

    .prologue
    .line 1848
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    .line 1849
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0, p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Lcom/facebook/analytics/cb;)V

    .line 1851
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ad:Lcom/facebook/analytics/av;

    invoke-interface {v0, p1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 1852
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 1609
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->aj()V

    .line 1610
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 1616
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/ui/d/a;->a(Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 1620
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;Z)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 1398
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    const-wide/16 v1, 0x1388

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/common/ui/widgets/a;->a(J)V

    .line 1399
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/common/ui/widgets/a;->a(Z)V

    .line 1401
    if-eqz p2, :cond_0

    .line 1402
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->Q()Lcom/facebook/orca/compose/ComposeFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->z()Landroid/view/View;

    move-result-object v0

    .line 1403
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    const/16 v2, 0x30

    invoke-virtual {v1, v2}, Lcom/facebook/orca/common/ui/widgets/a;->a(I)V

    .line 1408
    :goto_0
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->h:Lcom/facebook/ui/d/d;

    const/4 v3, 0x0

    invoke-virtual {v2, p1, v3, v4}, Lcom/facebook/ui/d/d;->a(Lcom/facebook/fbservice/service/ServiceException;ZZ)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/common/ui/widgets/d;->WARNING:Lcom/facebook/orca/common/ui/widgets/d;

    invoke-virtual {v1, v0, v2, v3}, Lcom/facebook/orca/common/ui/widgets/a;->a(Landroid/view/View;Ljava/lang/CharSequence;Lcom/facebook/orca/common/ui/widgets/d;)V

    .line 1412
    return-void

    .line 1405
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->at:Lcom/facebook/widget/titlebar/a;

    check-cast v0, Landroid/view/View;

    .line 1406
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    const/16 v2, 0x50

    invoke-virtual {v1, v2}, Lcom/facebook/orca/common/ui/widgets/a;->a(I)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Z)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 701
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 702
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 703
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aX:Z

    if-nez v0, :cond_0

    .line 731
    :goto_0
    return-void

    .line 708
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    sget-object v1, Lcom/facebook/orca/threadview/ca;->MESSAGES:Lcom/facebook/orca/threadview/ca;

    if-ne v0, v1, :cond_1

    .line 709
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aC:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 710
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aB:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 714
    :cond_1
    if-eqz p2, :cond_2

    .line 715
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->V()V

    .line 716
    iput-boolean v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aQ:Z

    .line 717
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->au:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 718
    sget-object v0, Lcom/facebook/orca/threadview/ci;->a:Lcom/facebook/orca/threadview/cp;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    .line 719
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    if-eqz v0, :cond_2

    .line 720
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->U()V

    .line 725
    :cond_2
    invoke-direct {p0, p2}, Lcom/facebook/orca/threadview/ThreadViewFragment;->e(Z)V

    .line 728
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ai()V

    .line 729
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->av()V

    .line 730
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->x()V

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;)V
    .locals 3

    .prologue
    .line 1352
    if-nez p1, :cond_1

    .line 1368
    :cond_0
    :goto_0
    return-void

    .line 1355
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    .line 1356
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->c:Lcom/facebook/orca/f/k;

    invoke-virtual {v1}, Lcom/facebook/orca/f/k;->a()Lcom/facebook/user/User;

    move-result-object v1

    .line 1357
    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 1361
    new-instance v2, Lcom/facebook/orca/threadview/bk;

    invoke-direct {v2, p0, v0, v1}, Lcom/facebook/orca/threadview/bk;-><init>(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/user/User;)V

    invoke-virtual {p1, v2}, Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;->a(Lcom/facebook/orca/mutators/h;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 1

    .prologue
    .line 1296
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->al:Lcom/facebook/orca/threadview/dn;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threadview/dn;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 1297
    return-void
.end method

.method private a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/user/User;)V
    .locals 4

    .prologue
    .line 1996
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->as:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    .line 2031
    :goto_0
    return-void

    .line 2001
    :cond_0
    new-instance v0, Lcom/facebook/orca/server/RemoveMemberParams;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/server/RemoveMemberParams;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2002
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 2003
    const-string v2, "removeMemberParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 2004
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ak:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->o:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v0, v2, v1}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    .line 2006
    new-instance v1, Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/facebook/o;->thread_leave_progress:I

    invoke-direct {v1, v2, v3}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    invoke-interface {v0, v1}, Lcom/facebook/fbservice/ops/m;->a(Lcom/facebook/fbservice/ops/ab;)Lcom/facebook/fbservice/ops/m;

    .line 2008
    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->as:Lcom/google/common/d/a/s;

    .line 2010
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "leave_conversation"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/analytics/cb;)V

    .line 2012
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->as:Lcom/google/common/d/a/s;

    new-instance v1, Lcom/facebook/orca/threadview/bp;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/bp;-><init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewFragment;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ai()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/analytics/cb;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/analytics/cb;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/user/User;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/user/User;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threadview/ca;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ca;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threadview/cn;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/cn;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cm;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cm;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cp;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cp;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/user/User;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/user/User;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->e(Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/facebook/orca/threadview/ca;)V
    .locals 7

    .prologue
    .line 1751
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    sget-object v1, Lcom/facebook/orca/threadview/ca;->MESSAGES:Lcom/facebook/orca/threadview/ca;

    if-ne v0, v1, :cond_0

    .line 1752
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->O()V

    .line 1755
    :cond_0
    sget-object v0, Lcom/facebook/orca/threadview/br;->a:[I

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ca;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 1773
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cannot transition to that state"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1759
    :pswitch_0
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->af()V

    .line 1760
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->aa()V

    .line 1761
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    .line 1776
    :goto_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b(Lcom/facebook/orca/threadview/ca;)V

    .line 1779
    sget-object v1, Lcom/facebook/orca/threadview/ca;->MESSAGES:Lcom/facebook/orca/threadview/ca;

    if-eq p1, v1, :cond_1

    .line 1780
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->X()V

    .line 1784
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ao()V

    .line 1786
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->as()Landroid/support/v4/app/Fragment;

    move-result-object v1

    .line 1788
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    invoke-virtual {v2}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v2

    .line 1789
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/support/v4/app/ad;->a(Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 1790
    sget v3, Lcom/facebook/b;->in_from_right:I

    sget v4, Lcom/facebook/b;->out_to_left:I

    sget v5, Lcom/facebook/b;->in_from_left:I

    sget v6, Lcom/facebook/b;->out_to_right:I

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/support/v4/app/ad;->a(IIII)Landroid/support/v4/app/ad;

    .line 1801
    invoke-virtual {v2, v1}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 1802
    invoke-virtual {v2, v0}, Landroid/support/v4/app/ad;->c(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 1803
    invoke-virtual {v2}, Landroid/support/v4/app/ad;->a()I

    .line 1805
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    .line 1806
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v1, v1, Lcom/facebook/orca/threadview/cp;->b:Lcom/facebook/orca/threads/MessagesCollection;

    .line 1807
    sget-object v2, Lcom/facebook/orca/threadview/ca;->MAP:Lcom/facebook/orca/threadview/ca;

    if-ne p1, v2, :cond_3

    .line 1808
    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    .line 1809
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ah()V

    .line 1810
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aM:Lcom/facebook/orca/threadview/ThreadViewMapFragment;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/google/common/a/es;)V

    .line 1819
    :cond_2
    :goto_1
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    .line 1820
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->x()V

    .line 1821
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->aq()V

    .line 1822
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->au()V

    .line 1824
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ad:Lcom/facebook/analytics/av;

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ca;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/analytics/av;->c(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 1826
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/analytics/cb;)V

    .line 1827
    return-void

    .line 1764
    :pswitch_1
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ag()V

    .line 1765
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 1766
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    goto :goto_0

    .line 1769
    :pswitch_2
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ah()V

    .line 1770
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aM:Lcom/facebook/orca/threadview/ThreadViewMapFragment;

    goto :goto_0

    .line 1812
    :cond_3
    sget-object v0, Lcom/facebook/orca/threadview/ca;->CONTACTCARD:Lcom/facebook/orca/threadview/ca;

    if-ne p1, v0, :cond_4

    .line 1813
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->af()V

    .line 1814
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->R()V

    goto :goto_1

    .line 1815
    :cond_4
    sget-object v0, Lcom/facebook/orca/threadview/ca;->GROUP_CONTACTCARD:Lcom/facebook/orca/threadview/ca;

    if-ne p1, v0, :cond_2

    .line 1816
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ag()V

    .line 1817
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;->b()V

    goto :goto_1

    .line 1755
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a(Lcom/facebook/orca/threadview/cn;)V
    .locals 3

    .prologue
    .line 1275
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/widgets/a;->a()V

    .line 1276
    sget-object v0, Lcom/facebook/orca/threadview/cn;->THREAD_VIEW:Lcom/facebook/orca/threadview/cn;

    if-ne p1, v0, :cond_0

    .line 1277
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->au:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/o;->thread_loading:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    .line 1278
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->au:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 1279
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->am()V

    .line 1283
    :goto_0
    return-void

    .line 1281
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c()V

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cm;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 1320
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1343
    :cond_0
    :goto_0
    return-void

    .line 1324
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->an()V

    .line 1325
    sget-object v0, Lcom/facebook/orca/threadview/cn;->THREAD_VIEW:Lcom/facebook/orca/threadview/cn;

    if-ne p1, v0, :cond_4

    .line 1326
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->b:Lcom/facebook/orca/threads/MessagesCollection;

    if-nez v0, :cond_3

    .line 1327
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->au:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 1328
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->au:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    .line 1334
    :goto_1
    iget-boolean v0, p2, Lcom/facebook/orca/threadview/cm;->b:Z

    if-eqz v0, :cond_0

    .line 1335
    iget-object v0, p2, Lcom/facebook/orca/threadview/cm;->a:Lcom/facebook/fbservice/service/ServiceException;

    invoke-direct {p0, v0, v2}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/fbservice/service/ServiceException;Z)V

    goto :goto_0

    .line 1331
    :cond_3
    invoke-direct {p0, v2}, Lcom/facebook/orca/threadview/ThreadViewFragment;->f(Z)V

    .line 1332
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->aq()V

    goto :goto_1

    .line 1338
    :cond_4
    iget-boolean v0, p2, Lcom/facebook/orca/threadview/cm;->b:Z

    if-eqz v0, :cond_5

    .line 1339
    iget-object v0, p2, Lcom/facebook/orca/threadview/cm;->a:Lcom/facebook/fbservice/service/ServiceException;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/fbservice/service/ServiceException;Z)V

    .line 1341
    :cond_5
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->U()V

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cp;)V
    .locals 1

    .prologue
    .line 1286
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1293
    :goto_0
    return-void

    .line 1290
    :cond_0
    iput-object p2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    .line 1291
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->au:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/EmptyListViewItem;->a()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->f(Z)V

    .line 1292
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->aq()V

    goto :goto_0
.end method

.method private a(Lcom/facebook/user/User;)V
    .locals 2

    .prologue
    .line 1300
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->am:Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/common/ui/widgets/text/a;->a(Lcom/facebook/user/User;)Lcom/facebook/orca/threadview/v;

    move-result-object v0

    .line 1302
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->al:Lcom/facebook/orca/threadview/dn;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadview/dn;->a(Lcom/facebook/orca/threadview/v;)V

    .line 1303
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->au:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/EmptyListViewItem;->a()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->f(Z)V

    .line 1304
    return-void
.end method

.method private a(Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 763
    invoke-static {p1}, Lcom/facebook/orca/prefs/n;->d(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    .line 764
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->e:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    invoke-interface {v1, v0, p2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 765
    return-void
.end method

.method private aa()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 829
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 830
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->e()Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    .line 831
    invoke-virtual {v0}, Lcom/facebook/user/RecipientInfo;->a()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/UserKey;->a(Lcom/facebook/user/UserIdentifier;)Lcom/facebook/user/UserKey;

    move-result-object v0

    .line 832
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/user/UserKey;Z)V

    .line 841
    :cond_0
    :goto_0
    return-void

    .line 834
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    .line 835
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ae:Lcom/facebook/orca/threads/q;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threads/q;->b(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v0

    .line 837
    if-eqz v0, :cond_0

    .line 838
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/user/UserKey;Z)V

    goto :goto_0
.end method

.method private ab()V
    .locals 4

    .prologue
    .line 867
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 879
    :cond_0
    :goto_0
    return-void

    .line 870
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v0

    .line 871
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->Z:Lcom/facebook/orca/notify/as;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/notify/as;->a(Ljava/lang/String;)Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v1

    .line 872
    invoke-virtual {v1}, Lcom/facebook/orca/notify/NotificationSetting;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 875
    invoke-static {v0}, Lcom/facebook/orca/prefs/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    .line 876
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->e:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    .line 877
    sget-object v2, Lcom/facebook/orca/notify/NotificationSetting;->a:Lcom/facebook/orca/notify/NotificationSetting;

    invoke-virtual {v2}, Lcom/facebook/orca/notify/NotificationSetting;->d()J

    move-result-wide v2

    invoke-interface {v1, v0, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 878
    invoke-interface {v1}, Lcom/facebook/prefs/shared/e;->a()V

    goto :goto_0
.end method

.method private ac()V
    .locals 2

    .prologue
    .line 948
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aQ:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aU:Z

    if-nez v0, :cond_1

    .line 959
    :cond_0
    :goto_0
    return-void

    .line 951
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ba:Z

    if-eqz v0, :cond_0

    .line 952
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ba:Z

    .line 953
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->m()Landroid/support/v4/app/p;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/p;->c()Landroid/view/Window;

    move-result-object v0

    .line 954
    if-eqz v0, :cond_2

    .line 955
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 957
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ad()V

    goto :goto_0
.end method

.method private ad()V
    .locals 1

    .prologue
    .line 1045
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    if-eqz v0, :cond_0

    .line 1046
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->d()V

    .line 1047
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->Q()Lcom/facebook/orca/compose/ComposeFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->b()V

    .line 1049
    :cond_0
    return-void
.end method

.method private ae()Lcom/facebook/orca/threads/ThreadSummary;
    .locals 2

    .prologue
    .line 1073
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1074
    const/4 v0, 0x0

    .line 1082
    :cond_0
    :goto_0
    return-object v0

    .line 1078
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    .line 1079
    if-nez v0, :cond_0

    .line 1082
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->c:Lcom/facebook/orca/f/k;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->b(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    goto :goto_0
.end method

.method private af()V
    .locals 4

    .prologue
    .line 1094
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aR:Z

    if-eqz v0, :cond_0

    .line 1147
    :goto_0
    return-void

    .line 1099
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    const-string v1, "contactCard"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/contactcard/ContactCardFragment;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    .line 1100
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    if-nez v0, :cond_1

    .line 1101
    new-instance v0, Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-direct {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    .line 1102
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 1103
    sget v1, Lcom/facebook/i;->thread_view_content_container:I

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    const-string v3, "contactCard"

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/ad;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 1105
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 1106
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 1107
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    invoke-virtual {v0}, Landroid/support/v4/app/q;->b()Z

    .line 1108
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->U()V

    .line 1111
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    new-instance v1, Lcom/facebook/orca/threadview/bz;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/bz;-><init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/contacts/contactcard/x;)V

    .line 1146
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aR:Z

    goto :goto_0
.end method

.method private ag()V
    .locals 4

    .prologue
    .line 1150
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aS:Z

    if-eqz v0, :cond_0

    .line 1152
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 1221
    :goto_0
    return-void

    .line 1157
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    const-string v1, "groupContactCard"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    .line 1159
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    if-nez v0, :cond_1

    .line 1160
    new-instance v0, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    invoke-direct {v0}, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    .line 1161
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 1162
    sget v1, Lcom/facebook/i;->thread_view_content_container:I

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    const-string v3, "groupContactCard"

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/ad;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 1165
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 1166
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 1168
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    invoke-virtual {v0}, Landroid/support/v4/app/q;->b()Z

    .line 1169
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 1170
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    new-instance v1, Lcom/facebook/orca/threadview/bj;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/bj;-><init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;->a(Lcom/facebook/contacts/contactcard/ai;)V

    .line 1220
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aS:Z

    goto :goto_0
.end method

.method private ah()V
    .locals 4

    .prologue
    .line 1224
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aT:Z

    if-eqz v0, :cond_0

    .line 1242
    :goto_0
    return-void

    .line 1227
    :cond_0
    invoke-static {}, Lcom/facebook/orca/threadview/cw;->a()Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 1230
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    const-string v1, "mapForContactCard"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aM:Lcom/facebook/orca/threadview/ThreadViewMapFragment;

    .line 1232
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aM:Lcom/facebook/orca/threadview/ThreadViewMapFragment;

    if-nez v0, :cond_1

    .line 1233
    new-instance v0, Lcom/facebook/orca/threadview/ThreadViewMapFragment;

    invoke-direct {v0}, Lcom/facebook/orca/threadview/ThreadViewMapFragment;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aM:Lcom/facebook/orca/threadview/ThreadViewMapFragment;

    .line 1234
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 1235
    sget v1, Lcom/facebook/i;->thread_view_content_container:I

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aM:Lcom/facebook/orca/threadview/ThreadViewMapFragment;

    const-string v3, "mapForContactCard"

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/ad;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 1238
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aM:Lcom/facebook/orca/threadview/ThreadViewMapFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 1239
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 1241
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aT:Z

    goto :goto_0
.end method

.method private ai()V
    .locals 1

    .prologue
    .line 1245
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->g(Z)V

    .line 1246
    return-void
.end method

.method private aj()V
    .locals 1

    .prologue
    .line 1249
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->g(Z)V

    .line 1250
    return-void
.end method

.method private ak()V
    .locals 3

    .prologue
    .line 1346
    new-instance v0, Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;

    invoke-direct {v0}, Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;-><init>()V

    .line 1347
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;)V

    .line 1348
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->p()Landroid/support/v4/app/q;

    move-result-object v1

    const-string v2, "leaveThreadDialog"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;->a(Landroid/support/v4/app/q;Ljava/lang/String;)V

    .line 1349
    return-void
.end method

.method private al()V
    .locals 3

    .prologue
    .line 1371
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    .line 1372
    if-nez v0, :cond_0

    .line 1379
    :goto_0
    return-void

    .line 1376
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->a(Ljava/lang/String;)Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;

    move-result-object v0

    .line 1378
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->p()Landroid/support/v4/app/q;

    move-result-object v1

    const-string v2, "deleteThreadDialog"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->a(Landroid/support/v4/app/q;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private am()V
    .locals 2

    .prologue
    .line 1385
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->b:Lcom/facebook/orca/threadview/ci;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ci;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1386
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->al:Lcom/facebook/orca/threadview/dn;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/dn;->a(Z)V

    .line 1388
    :cond_0
    return-void
.end method

.method private an()V
    .locals 2

    .prologue
    .line 1394
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->al:Lcom/facebook/orca/threadview/dn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/dn;->a(Z)V

    .line 1395
    return-void
.end method

.method private ao()V
    .locals 7

    .prologue
    const/16 v4, 0x8

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 1448
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    sget-object v1, Lcom/facebook/orca/threadview/ca;->MESSAGES:Lcom/facebook/orca/threadview/ca;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->an:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/a/a;

    invoke-virtual {v0}, Lcom/facebook/orca/a/a;->a()Lcom/facebook/orca/a/b;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/a/b;->NONE:Lcom/facebook/orca/a/b;

    if-ne v0, v1, :cond_1

    .line 1452
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aB:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1474
    :goto_0
    return-void

    .line 1456
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-static {v0}, Lcom/facebook/orca/threadview/dm;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v0

    if-nez v0, :cond_2

    move v1, v2

    .line 1460
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->an:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/a/a;

    invoke-virtual {v0}, Lcom/facebook/orca/a/a;->a()Lcom/facebook/orca/a/b;

    move-result-object v0

    .line 1461
    iget-object v5, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v5}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v5

    .line 1462
    sget-object v6, Lcom/facebook/orca/a/b;->NEW_THREAD:Lcom/facebook/orca/a/b;

    if-ne v0, v6, :cond_4

    .line 1463
    if-eqz v1, :cond_3

    invoke-direct {p0, v5}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ap()Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v2

    .line 1471
    :goto_2
    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b(Lcom/facebook/orca/threads/ThreadSummary;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1473
    :goto_3
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aB:Landroid/view/View;

    if-eqz v2, :cond_7

    :goto_4
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_2
    move v1, v3

    .line 1456
    goto :goto_1

    :cond_3
    move v0, v3

    .line 1463
    goto :goto_2

    .line 1465
    :cond_4
    sget-object v6, Lcom/facebook/orca/a/b;->ANY_THREAD:Lcom/facebook/orca/a/b;

    if-ne v0, v6, :cond_8

    .line 1466
    if-eqz v1, :cond_5

    invoke-direct {p0, v5}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-direct {p0, v5}, Lcom/facebook/orca/threadview/ThreadViewFragment;->c(Ljava/lang/String;)I

    move-result v1

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->an:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/a/a;

    invoke-virtual {v0}, Lcom/facebook/orca/a/a;->b()I

    move-result v0

    if-ge v1, v0, :cond_5

    move v0, v2

    goto :goto_2

    :cond_5
    move v0, v3

    goto :goto_2

    :cond_6
    move v2, v3

    .line 1471
    goto :goto_3

    :cond_7
    move v3, v4

    .line 1473
    goto :goto_4

    :cond_8
    move v0, v1

    goto :goto_2
.end method

.method private ap()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1499
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    if-nez v2, :cond_0

    .line 1505
    :goto_0
    return v1

    .line 1503
    :cond_0
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v2, v2, Lcom/facebook/orca/threadview/cp;->b:Lcom/facebook/orca/threads/MessagesCollection;

    .line 1504
    if-nez v2, :cond_1

    move v2, v1

    .line 1505
    :goto_1
    if-ne v2, v0, :cond_2

    :goto_2
    move v1, v0

    goto :goto_0

    .line 1504
    :cond_1
    invoke-virtual {v2}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/common/a/es;->size()I

    move-result v2

    goto :goto_1

    :cond_2
    move v0, v1

    .line 1505
    goto :goto_2
.end method

.method private aq()V
    .locals 4

    .prologue
    .line 1512
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1565
    :cond_0
    :goto_0
    return-void

    .line 1516
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    .line 1517
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v1, v1, Lcom/facebook/orca/threadview/cp;->b:Lcom/facebook/orca/threads/MessagesCollection;

    .line 1522
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/facebook/orca/threads/MessagesCollection;->c()Lcom/facebook/messages/model/threads/Message;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 1523
    invoke-virtual {v1}, Lcom/facebook/orca/threads/MessagesCollection;->c()Lcom/facebook/messages/model/threads/Message;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    .line 1524
    invoke-static {v2}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v2

    .line 1525
    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v3, v2}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 1528
    :cond_2
    if-eqz v0, :cond_4

    .line 1530
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ao()V

    .line 1532
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->al:Lcom/facebook/orca/threadview/dn;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/threadview/dn;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 1533
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n()Landroid/content/Context;

    move-result-object v2

    instance-of v2, v2, Landroid/app/Activity;

    if-eqz v2, :cond_3

    .line 1534
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aw:Lcom/facebook/orca/threadview/upsell/a;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/threadview/upsell/a;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 1536
    :cond_3
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v2}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->v()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1537
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->aa()V

    .line 1541
    :cond_4
    sget-object v2, Lcom/facebook/orca/threadview/br;->a:[I

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    invoke-virtual {v3}, Lcom/facebook/orca/threadview/ca;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 1543
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    if-eqz v0, :cond_0

    .line 1544
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    sget-object v1, Lcom/facebook/orca/threadview/ci;->a:Lcom/facebook/orca/threadview/cp;

    if-eq v0, v1, :cond_0

    .line 1545
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/cp;)V

    goto :goto_0

    .line 1550
    :pswitch_1
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    if-eqz v2, :cond_0

    .line 1551
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;)V

    goto :goto_0

    .line 1555
    :pswitch_2
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    if-eqz v2, :cond_0

    .line 1556
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;)V

    goto/16 :goto_0

    .line 1560
    :pswitch_3
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aM:Lcom/facebook/orca/threadview/ThreadViewMapFragment;

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    .line 1561
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aM:Lcom/facebook/orca/threadview/ThreadViewMapFragment;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/google/common/a/es;)V

    goto/16 :goto_0

    .line 1541
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private ar()V
    .locals 2

    .prologue
    .line 1686
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    invoke-virtual {v0}, Landroid/support/v4/app/q;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1702
    :cond_0
    :goto_0
    return-void

    .line 1691
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    invoke-virtual {v0}, Landroid/support/v4/app/q;->f()I

    move-result v0

    if-lez v0, :cond_2

    .line 1692
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    invoke-virtual {v0}, Landroid/support/v4/app/q;->e()Z

    goto :goto_1

    .line 1695
    :cond_2
    sget-object v0, Lcom/facebook/orca/threadview/ca;->MESSAGES:Lcom/facebook/orca/threadview/ca;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    .line 1696
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->x()V

    .line 1699
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->bb:Lcom/facebook/base/fragment/c;

    if-eqz v0, :cond_0

    .line 1700
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->bb:Lcom/facebook/base/fragment/c;

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Lcom/facebook/base/fragment/c;->a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    goto :goto_0
.end method

.method private as()Landroid/support/v4/app/Fragment;
    .locals 1

    .prologue
    .line 1855
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aM:Lcom/facebook/orca/threadview/ThreadViewMapFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aM:Lcom/facebook/orca/threadview/ThreadViewMapFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1856
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aM:Lcom/facebook/orca/threadview/ThreadViewMapFragment;

    .line 1864
    :goto_0
    return-object v0

    .line 1857
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1858
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    goto :goto_0

    .line 1859
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->v()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1860
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    goto :goto_0

    .line 1861
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->v()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1862
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    goto :goto_0

    .line 1864
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private at()V
    .locals 1

    .prologue
    .line 1868
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aM:Lcom/facebook/orca/threadview/ThreadViewMapFragment;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aM:Lcom/facebook/orca/threadview/ThreadViewMapFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMapFragment;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1869
    sget-object v0, Lcom/facebook/orca/threadview/ca;->MAP:Lcom/facebook/orca/threadview/ca;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    .line 1877
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->x()V

    .line 1878
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b(Lcom/facebook/orca/threadview/ca;)V

    .line 1879
    return-void

    .line 1870
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;->v()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1871
    sget-object v0, Lcom/facebook/orca/threadview/ca;->GROUP_CONTACTCARD:Lcom/facebook/orca/threadview/ca;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    goto :goto_0

    .line 1872
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->v()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1873
    sget-object v0, Lcom/facebook/orca/threadview/ca;->CONTACTCARD:Lcom/facebook/orca/threadview/ca;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    goto :goto_0

    .line 1874
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1875
    sget-object v0, Lcom/facebook/orca/threadview/ca;->MESSAGES:Lcom/facebook/orca/threadview/ca;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    goto :goto_0
.end method

.method private au()V
    .locals 2

    .prologue
    .line 1882
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->at:Lcom/facebook/widget/titlebar/a;

    if-nez v0, :cond_0

    .line 1909
    :goto_0
    return-void

    .line 1885
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ai:Lcom/facebook/config/a/a;

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->i()Lcom/facebook/config/a/d;

    move-result-object v0

    sget-object v1, Lcom/facebook/config/a/d;->PAA:Lcom/facebook/config/a/d;

    if-ne v0, v1, :cond_1

    .line 1886
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->at:Lcom/facebook/widget/titlebar/a;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aK:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setButtonSpecs(Ljava/util/List;)V

    goto :goto_0

    .line 1889
    :cond_1
    sget-object v0, Lcom/facebook/orca/threadview/br;->a:[I

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/ca;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1891
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->at:Lcom/facebook/widget/titlebar/a;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aH:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setButtonSpecs(Ljava/util/List;)V

    goto :goto_0

    .line 1894
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1895
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->P()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1896
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->at:Lcom/facebook/widget/titlebar/a;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aJ:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setButtonSpecs(Ljava/util/List;)V

    goto :goto_0

    .line 1898
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->at:Lcom/facebook/widget/titlebar/a;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aI:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setButtonSpecs(Ljava/util/List;)V

    goto :goto_0

    .line 1901
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->at:Lcom/facebook/widget/titlebar/a;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aK:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setButtonSpecs(Ljava/util/List;)V

    goto :goto_0

    .line 1906
    :pswitch_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->at:Lcom/facebook/widget/titlebar/a;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aK:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setButtonSpecs(Ljava/util/List;)V

    goto :goto_0

    .line 1889
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method private av()V
    .locals 5

    .prologue
    .line 1912
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aU:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aP:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    sget-object v1, Lcom/facebook/orca/threadview/ci;->a:Lcom/facebook/orca/threadview/cp;

    if-ne v0, v1, :cond_1

    .line 1924
    :cond_0
    :goto_0
    return-void

    .line 1919
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->c:Lcom/facebook/orca/f/k;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->a(Ljava/lang/String;)J

    move-result-wide v0

    .line 1920
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v2, v2, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    .line 1921
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v3

    cmp-long v0, v3, v0

    if-lez v0, :cond_0

    .line 1922
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ac:Lcom/facebook/orca/f/o;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/f/o;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    goto :goto_0
.end method

.method private aw()V
    .locals 4

    .prologue
    .line 2050
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ap:Lcom/facebook/orca/nux/ThreadTitleNuxView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aq:Lcom/facebook/orca/nux/u;

    if-eqz v0, :cond_0

    .line 2070
    :goto_0
    return-void

    .line 2056
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/orca/threadview/ThreadViewActivity;

    if-eqz v0, :cond_1

    .line 2057
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    sget v1, Lcom/facebook/i;->thread_title_nux:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/nux/ThreadTitleNuxView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ap:Lcom/facebook/orca/nux/ThreadTitleNuxView;

    .line 2069
    :goto_1
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->S()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/nux/u;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/nux/u;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aq:Lcom/facebook/orca/nux/u;

    goto :goto_0

    .line 2060
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 2061
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    sget v2, Lcom/facebook/i;->thread_list_overlay_container:I

    invoke-virtual {v0, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 2063
    sget v2, Lcom/facebook/k;->orca_thread_view_nux:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/nux/ThreadTitleNuxView;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ap:Lcom/facebook/orca/nux/ThreadTitleNuxView;

    .line 2067
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ap:Lcom/facebook/orca/nux/ThreadTitleNuxView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_1
.end method

.method private ax()V
    .locals 3

    .prologue
    .line 2073
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2078
    :goto_0
    return-void

    .line 2076
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->aw()V

    .line 2077
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aq:Lcom/facebook/orca/nux/u;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ap:Lcom/facebook/orca/nux/ThreadTitleNuxView;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/nux/u;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/orca/nux/ThreadTitleNuxView;)V

    goto :goto_0
.end method

.method private ay()J
    .locals 2

    .prologue
    .line 2087
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    .line 2088
    if-nez v0, :cond_0

    .line 2089
    const-wide/16 v0, -0x1

    .line 2092
    :goto_0
    return-wide v0

    :cond_0
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v0

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/ThreadViewFragment;)J
    .locals 2

    .prologue
    .line 130
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ay()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->as:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method private b(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 2037
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/ui/d/a;->a(Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/ui/d/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/threadview/bq;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/bq;-><init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(Landroid/content/DialogInterface$OnClickListener;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 2047
    return-void
.end method

.method private b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 1

    .prologue
    .line 690
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Z)V

    .line 691
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(Lcom/facebook/orca/threads/ThreadSummary;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threadview/cn;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b(Lcom/facebook/orca/threadview/cn;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/ThreadViewFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b(Ljava/lang/String;)V

    return-void
.end method

.method private b(Lcom/facebook/orca/threadview/ca;)V
    .locals 2

    .prologue
    .line 1830
    const/4 v0, 0x0

    .line 1831
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Lcom/facebook/orca/activity/k;

    if-eqz v1, :cond_0

    .line 1832
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/activity/k;

    invoke-interface {v0}, Lcom/facebook/orca/activity/k;->c()Lcom/facebook/orca/common/ui/titlebar/a;

    move-result-object v0

    .line 1835
    :cond_0
    if-nez v0, :cond_1

    .line 1844
    :goto_0
    return-void

    .line 1839
    :cond_1
    sget-object v1, Lcom/facebook/orca/threadview/ca;->MAP:Lcom/facebook/orca/threadview/ca;

    if-ne v1, p1, :cond_2

    .line 1840
    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->m()V

    goto :goto_0

    .line 1842
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->n()V

    goto :goto_0
.end method

.method private b(Lcom/facebook/orca/threadview/cn;)V
    .locals 2

    .prologue
    .line 1307
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->au:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 1308
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->au:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    .line 1309
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->an()V

    .line 1311
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_0

    .line 1315
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 1317
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 553
    invoke-static {p1}, Lcom/facebook/common/w/n;->c(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v2, "Should not be called with an empty or null groupName"

    invoke-static {v0, v2}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 556
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    .line 557
    if-nez v0, :cond_1

    .line 568
    :goto_1
    return-void

    .line 553
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 561
    :cond_1
    new-instance v2, Lcom/facebook/orca/server/an;

    invoke-direct {v2}, Lcom/facebook/orca/server/an;-><init>()V

    .line 562
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/orca/server/an;->a(Ljava/lang/String;)Lcom/facebook/orca/server/an;

    .line 563
    invoke-virtual {v2, v1}, Lcom/facebook/orca/server/an;->a(Z)Lcom/facebook/orca/server/an;

    .line 564
    invoke-virtual {v2, p1}, Lcom/facebook/orca/server/an;->b(Ljava/lang/String;)Lcom/facebook/orca/server/an;

    .line 565
    invoke-virtual {v2}, Lcom/facebook/orca/server/an;->h()Lcom/facebook/orca/server/ModifyThreadParams;

    move-result-object v0

    .line 567
    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/server/ModifyThreadParams;)V

    goto :goto_1
.end method

.method private b(Lcom/facebook/orca/threads/ThreadSummary;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 1481
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->c:Lcom/facebook/orca/f/k;

    invoke-virtual {v0}, Lcom/facebook/orca/f/k;->b()Lcom/facebook/user/UserKey;

    move-result-object v2

    .line 1483
    if-nez v2, :cond_0

    move v0, v1

    .line 1492
    :goto_0
    return v0

    .line 1486
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 1487
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/user/UserKey;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1488
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    .line 1492
    goto :goto_0
.end method

.method private c(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 740
    invoke-static {p1}, Lcom/facebook/orca/prefs/n;->d(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    .line 741
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->e:Lcom/facebook/prefs/shared/d;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v0

    return v0
.end method

.method private c(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 3

    .prologue
    .line 1974
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/facebook/o;->menu_mark_as_spam_confirm:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/facebook/o;->dialog_yes:I

    new-instance v2, Lcom/facebook/orca/threadview/bo;

    invoke-direct {v2, p0, p1}, Lcom/facebook/orca/threadview/bo;-><init>(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/orca/threads/ThreadSummary;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/facebook/o;->dialog_no:I

    new-instance v2, Lcom/facebook/orca/threadview/bn;

    invoke-direct {v2, p0}, Lcom/facebook/orca/threadview/bn;-><init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1988
    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/threadview/ThreadViewFragment;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ar()V

    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/contacts/contactcard/ContactCardFragment;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    return-object v0
.end method

.method private d(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 1

    .prologue
    .line 1991
    const-string v0, "mark_as_spam"

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->f(Ljava/lang/String;)V

    .line 1992
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ab:Lcom/facebook/orca/f/x;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/x;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 1993
    return-void
.end method

.method private d(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 750
    invoke-static {p1}, Lcom/facebook/orca/prefs/n;->d(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v1

    .line 751
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->e:Lcom/facebook/prefs/shared/d;

    invoke-interface {v2, v1, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 752
    const/4 v0, 0x1

    .line 754
    :cond_0
    return v0
.end method

.method static synthetic e(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/contacts/contactcard/GroupContactCardFragment;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    return-object v0
.end method

.method private e(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 773
    invoke-static {p1}, Lcom/facebook/orca/prefs/n;->d(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    .line 774
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->e:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    const/4 v2, -0x1

    invoke-interface {v1, v0, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 776
    return-void
.end method

.method private e(Z)V
    .locals 3

    .prologue
    .line 785
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 786
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->b:Lcom/facebook/orca/threadview/ci;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 790
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->w()Z

    move-result v0

    if-nez v0, :cond_1

    .line 791
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->Z()V

    .line 792
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->au()V

    .line 795
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 796
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->al:Lcom/facebook/orca/threadview/dn;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->am:Lcom/facebook/orca/common/ui/widgets/text/a;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v2}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->e()Lcom/facebook/user/RecipientInfo;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/common/ui/widgets/text/a;->a(Lcom/facebook/user/RecipientInfo;)Lcom/facebook/orca/threadview/v;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/dn;->a(Lcom/facebook/orca/threadview/v;)V

    .line 800
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0, v1, p1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Z)V

    .line 801
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->av:Lcom/facebook/orca/threadview/ThreadAlertRateLimitView;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadAlertRateLimitView;->setThread(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 802
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aj:Lcom/facebook/orca/threadview/cb;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/cb;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 804
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ab()V

    .line 806
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ax()V

    .line 807
    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/threadview/ThreadViewFragment;)Landroid/view/View;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aB:Landroid/view/View;

    return-object v0
.end method

.method private f(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1015
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "click"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "opt_menu_item"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 1018
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/analytics/cb;)V

    .line 1019
    return-void
.end method

.method private f(Z)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 1052
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aQ:Z

    if-eqz v0, :cond_0

    .line 1070
    :goto_0
    return-void

    .line 1055
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->au:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 1057
    if-eqz p1, :cond_1

    .line 1058
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 1059
    const-wide/16 v1, 0x190

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 1060
    invoke-virtual {v0, v3}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    .line 1061
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 1062
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->z()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    .line 1064
    :cond_1
    iput-boolean v3, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aQ:Z

    .line 1065
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aZ:Lcom/facebook/orca/compose/ai;

    if-eqz v0, :cond_2

    .line 1066
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->d()V

    .line 1067
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->Q()Lcom/facebook/orca/compose/ComposeFragment;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aZ:Lcom/facebook/orca/compose/ai;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ai;)V

    .line 1069
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ac()V

    goto :goto_0
.end method

.method static synthetic g(Lcom/facebook/orca/threadview/ThreadViewFragment;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aC:Landroid/widget/EditText;

    return-object v0
.end method

.method private g(Z)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 1254
    if-eqz p1, :cond_1

    .line 1255
    new-instance v0, Lcom/facebook/orca/threadview/co;

    invoke-direct {v0, v2, v2}, Lcom/facebook/orca/threadview/co;-><init>(ZZ)V

    .line 1268
    :goto_0
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1269
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->b:Lcom/facebook/orca/threadview/ci;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 1270
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->b:Lcom/facebook/orca/threadview/ci;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/threadview/co;)V

    .line 1272
    :cond_0
    return-void

    .line 1260
    :cond_1
    new-instance v0, Lcom/facebook/orca/threadview/co;

    invoke-direct {v0, v1, v1}, Lcom/facebook/orca/threadview/co;-><init>(ZZ)V

    goto :goto_0
.end method

.method static synthetic h(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/messages/threads/model/ThreadViewSpec;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    return-object v0
.end method

.method static synthetic i(Lcom/facebook/orca/threadview/ThreadViewFragment;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->Y()V

    return-void
.end method

.method static synthetic j(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/orca/threadview/ca;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    return-object v0
.end method

.method static synthetic k(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/orca/threads/ThreadSummary;
    .locals 1

    .prologue
    .line 130
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ae()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    return-object v0
.end method

.method static synthetic l(Lcom/facebook/orca/threadview/ThreadViewFragment;)Lcom/facebook/zero/ui/l;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aG:Lcom/facebook/zero/ui/l;

    return-object v0
.end method

.method static synthetic m(Lcom/facebook/orca/threadview/ThreadViewFragment;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->au()V

    return-void
.end method

.method static synthetic n(Lcom/facebook/orca/threadview/ThreadViewFragment;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->aj()V

    return-void
.end method

.method static synthetic o(Lcom/facebook/orca/threadview/ThreadViewFragment;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->af()V

    return-void
.end method

.method static synthetic p(Lcom/facebook/orca/threadview/ThreadViewFragment;)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ak()V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 2

    .prologue
    .line 895
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->A()V

    .line 896
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aP:Z

    .line 901
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 923
    :cond_0
    :goto_0
    return-void

    .line 905
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aY:Z

    if-eqz v0, :cond_3

    .line 907
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aY:Z

    .line 908
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->aj()V

    .line 912
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 913
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->d:Lcom/facebook/orca/notify/av;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/notify/av;->b(Ljava/lang/String;)V

    .line 915
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->av()V

    .line 918
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->p()Landroid/support/v4/app/q;

    move-result-object v0

    const-string v1, "leaveThreadDialog"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;

    .line 920
    if-eqz v0, :cond_0

    .line 921
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;)V

    goto :goto_0

    .line 910
    :cond_3
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ai()V

    goto :goto_1
.end method

.method public B()V
    .locals 1

    .prologue
    .line 927
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->B()V

    .line 928
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aP:Z

    .line 929
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/widgets/a;->a()V

    .line 930
    return-void
.end method

.method public C()V
    .locals 1

    .prologue
    .line 934
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->C()V

    .line 935
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aj:Lcom/facebook/orca/threadview/cb;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/cb;->b()V

    .line 936
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    if-eqz v0, :cond_0

    .line 937
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->g:Lcom/facebook/orca/common/ui/widgets/a;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/widgets/a;->a()V

    .line 939
    :cond_0
    return-void
.end method

.method public O()Lcom/facebook/messages/threads/model/ThreadViewSpec;
    .locals 1

    .prologue
    .line 1041
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    return-object v0
.end method

.method public P()V
    .locals 3

    .prologue
    .line 1568
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->i:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aC:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 1569
    return-void
.end method

.method public Q()Z
    .locals 5

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 1629
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    sget-object v3, Lcom/facebook/orca/threadview/ca;->MESSAGES:Lcom/facebook/orca/threadview/ca;

    if-ne v0, v3, :cond_0

    .line 1630
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->P()V

    .line 1632
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v3

    .line 1634
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_0

    if-eqz v3, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->an:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/a/a;

    invoke-virtual {v0}, Lcom/facebook/orca/a/a;->a()Lcom/facebook/orca/a/b;

    move-result-object v0

    sget-object v4, Lcom/facebook/orca/a/b;->ANY_THREAD:Lcom/facebook/orca/a/b;

    if-ne v0, v4, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, v3}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, v3}, Lcom/facebook/orca/threadview/ThreadViewFragment;->c(Ljava/lang/String;)I

    move-result v4

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->an:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/a/a;

    invoke-virtual {v0}, Lcom/facebook/orca/a/a;->b()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 1647
    sget-object v0, Lcom/facebook/orca/threadview/ThreadViewFragment;->a:Ljava/lang/Class;

    const-string v4, "Incremented thread show times"

    invoke-static {v0, v4}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 1648
    invoke-direct {p0, v3}, Lcom/facebook/orca/threadview/ThreadViewFragment;->c(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v3, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Ljava/lang/String;I)V

    .line 1654
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    sget-object v3, Lcom/facebook/orca/threadview/ca;->CONTACTCARD:Lcom/facebook/orca/threadview/ca;

    if-ne v0, v3, :cond_2

    .line 1655
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->P()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1656
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->d()V

    .line 1678
    :goto_0
    return v1

    .line 1659
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/ContactCardFragment;->Q()V

    .line 1666
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    invoke-virtual {v0}, Landroid/support/v4/app/q;->c()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1667
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    invoke-virtual {v0}, Landroid/support/v4/app/q;->f()I

    move-result v0

    if-lez v0, :cond_3

    move v0, v1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_1

    .line 1670
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    invoke-virtual {v0}, Landroid/support/v4/app/q;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1672
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->at()V

    .line 1673
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->au()V

    .line 1674
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->aq()V

    goto :goto_0

    :cond_5
    move v1, v2

    .line 1678
    goto :goto_0
.end method

.method public R()V
    .locals 2

    .prologue
    .line 1710
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->al:Lcom/facebook/orca/threadview/dn;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/dn;->a()V

    .line 1711
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aq:Lcom/facebook/orca/nux/u;

    if-eqz v0, :cond_0

    .line 1712
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aq:Lcom/facebook/orca/nux/u;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/u;->b()V

    .line 1715
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a()V

    .line 1718
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->b:Lcom/facebook/orca/threadview/ci;

    if-eqz v0, :cond_1

    .line 1719
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->b:Lcom/facebook/orca/threadview/ci;

    sget-object v1, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 1724
    :cond_1
    sget-object v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 1725
    sget-object v0, Lcom/facebook/orca/threadview/ci;->a:Lcom/facebook/orca/threadview/cp;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    .line 1726
    return-void
.end method

.method T()V
    .locals 4

    .prologue
    .line 1736
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->z()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/threadview/bm;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/bm;-><init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1742
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 282
    sget v0, Lcom/facebook/k;->orca_thread_view_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 229
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/os/Bundle;)V

    .line 232
    new-instance v0, Lcom/facebook/orca/threadview/bi;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/facebook/orca/threadview/bi;-><init>(Lcom/facebook/orca/threadview/ThreadViewFragment;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aj:Lcom/facebook/orca/threadview/cb;

    .line 271
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->S()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/a/d;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/a/d;

    .line 273
    sget-object v1, Lcom/facebook/orca/threadview/ThreadViewFragment;->a:Ljava/lang/Class;

    const-string v2, "checking group name upsell type"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 274
    invoke-virtual {v0}, Lcom/facebook/orca/a/d;->c()Lcom/facebook/orca/a/g;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/a/g;->UNINITIALIZED:Lcom/facebook/orca/a/g;

    if-ne v1, v2, :cond_0

    .line 275
    sget-object v1, Lcom/facebook/orca/threadview/ThreadViewFragment;->a:Ljava/lang/Class;

    const-string v2, "initializing group name upsell types"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 276
    invoke-virtual {v0}, Lcom/facebook/orca/a/d;->b()V

    .line 278
    :cond_0
    return-void
.end method

.method public a(Landroid/view/Menu;)V
    .locals 2

    .prologue
    .line 973
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/view/Menu;)V

    .line 974
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    sget-object v1, Lcom/facebook/orca/threadview/ca;->MESSAGES:Lcom/facebook/orca/threadview/ca;

    if-ne v0, v1, :cond_0

    .line 975
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-static {v0}, Lcom/facebook/orca/threadview/dm;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 976
    sget v0, Lcom/facebook/i;->mark_as_spam:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->removeItem(I)V

    .line 979
    :cond_0
    return-void
.end method

.method public a(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 2

    .prologue
    .line 963
    invoke-super {p0, p1, p2}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 966
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    sget-object v1, Lcom/facebook/orca/threadview/ca;->MESSAGES:Lcom/facebook/orca/threadview/ca;

    if-ne v0, v1, :cond_0

    .line 967
    sget v0, Lcom/facebook/l;->thread_view_fragment_menu:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 969
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/base/fragment/c;)V
    .locals 0

    .prologue
    .line 663
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->bb:Lcom/facebook/base/fragment/c;

    .line 664
    return-void
.end method

.method public a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 1

    .prologue
    .line 679
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Z)V

    .line 680
    return-void
.end method

.method public a(Lcom/facebook/orca/compose/ai;)V
    .locals 0

    .prologue
    .line 856
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aZ:Lcom/facebook/orca/compose/ai;

    .line 857
    return-void
.end method

.method public a(Lcom/facebook/orca/compose/ap;)V
    .locals 1

    .prologue
    .line 1730
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ay:Lcom/facebook/orca/compose/av;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/compose/av;->a(Lcom/facebook/orca/compose/ap;)V

    .line 1731
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->av:Lcom/facebook/orca/threadview/ThreadAlertRateLimitView;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threadview/ThreadAlertRateLimitView;->setComposeMode(Lcom/facebook/orca/compose/ap;)V

    .line 1732
    return-void
.end method

.method public a(Lcom/facebook/orca/server/ModifyThreadParams;)V
    .locals 4

    .prologue
    .line 1572
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ar:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    .line 1602
    :goto_0
    return-void

    .line 1576
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1577
    const-string v1, "modifyThreadParams"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1578
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ak:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->v:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    .line 1580
    new-instance v1, Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/facebook/o;->thread_view_saving_progress:I

    invoke-direct {v1, v2, v3}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    invoke-interface {v0, v1}, Lcom/facebook/fbservice/ops/m;->a(Lcom/facebook/fbservice/ops/ab;)Lcom/facebook/fbservice/ops/m;

    .line 1583
    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ar:Lcom/google/common/d/a/s;

    .line 1584
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ar:Lcom/google/common/d/a/s;

    new-instance v1, Lcom/facebook/orca/threadview/bl;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/bl;-><init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method public a(Lcom/facebook/widget/titlebar/a;)V
    .locals 0

    .prologue
    .line 576
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->at:Lcom/facebook/widget/titlebar/a;

    .line 577
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 2081
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    if-eqz v0, :cond_0

    .line 2082
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Ljava/lang/String;)V

    .line 2084
    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 1419
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->b:Lcom/facebook/orca/threadview/ci;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threadview/ci;->a(Z)V

    .line 1420
    return-void
.end method

.method public a(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 1022
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 1023
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x1f

    if-ne v0, v1, :cond_0

    .line 1024
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ad()V

    .line 1025
    const/4 v0, 0x1

    .line 1029
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 983
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    .line 984
    sget v2, Lcom/facebook/i;->refresh:I

    if-ne v1, v2, :cond_1

    .line 985
    const-string v1, "refresh"

    invoke-direct {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->f(Ljava/lang/String;)V

    .line 986
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->aj()V

    .line 1009
    :cond_0
    :goto_0
    return v0

    .line 989
    :cond_1
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aW:Lcom/facebook/orca/threadview/cp;

    iget-object v2, v2, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    .line 990
    sget v3, Lcom/facebook/i;->archive:I

    if-ne v1, v3, :cond_2

    .line 991
    if-eqz v2, :cond_0

    .line 992
    const-string v1, "archive"

    invoke-direct {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->f(Ljava/lang/String;)V

    .line 993
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aa:Lcom/facebook/orca/f/b;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/f/b;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    goto :goto_0

    .line 996
    :cond_2
    sget v3, Lcom/facebook/i;->mark_as_spam:I

    if-ne v1, v3, :cond_3

    .line 997
    if-eqz v2, :cond_0

    .line 998
    const-string v1, "mark_as_spam"

    invoke-direct {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->f(Ljava/lang/String;)V

    .line 999
    invoke-direct {p0, v2}, Lcom/facebook/orca/threadview/ThreadViewFragment;->c(Lcom/facebook/orca/threads/ThreadSummary;)V

    goto :goto_0

    .line 1002
    :cond_3
    sget v3, Lcom/facebook/i;->delete:I

    if-ne v1, v3, :cond_4

    .line 1003
    if-eqz v2, :cond_0

    .line 1004
    const-string v1, "delete"

    invoke-direct {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->f(Ljava/lang/String;)V

    .line 1005
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->al()V

    goto :goto_0

    .line 1009
    :cond_4
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 847
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aY:Z

    .line 848
    return-void
.end method

.method public b(Z)V
    .locals 0

    .prologue
    .line 942
    iput-boolean p1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aU:Z

    .line 943
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->av()V

    .line 944
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ac()V

    .line 945
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 863
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ba:Z

    .line 864
    return-void
.end method

.method public c(Z)V
    .locals 1

    .prologue
    .line 811
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->c(Z)V

    .line 812
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->u()Z

    move-result v0

    if-nez v0, :cond_1

    .line 826
    :cond_0
    :goto_0
    return-void

    .line 815
    :cond_1
    if-nez p1, :cond_2

    .line 816
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->Z()V

    .line 817
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->au()V

    goto :goto_0

    .line 819
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ag:Lcom/facebook/orca/d/m;

    if-eqz v0, :cond_3

    .line 820
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ag:Lcom/facebook/orca/d/m;

    invoke-virtual {v0}, Lcom/facebook/orca/d/m;->a()V

    .line 822
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ah:Lcom/facebook/orca/d/af;

    if-eqz v0, :cond_0

    .line 823
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ah:Lcom/facebook/orca/d/af;

    invoke-virtual {v0}, Lcom/facebook/orca/d/af;->b()V

    goto :goto_0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 1034
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->d:Lcom/facebook/orca/notify/av;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1035
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->d:Lcom/facebook/orca/notify/av;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/notify/av;->b(Ljava/lang/String;)V

    .line 1036
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->av()V

    .line 1038
    :cond_0
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 287
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 288
    sget-object v0, Lcom/facebook/orca/threadview/ThreadViewFragment;->a:Ljava/lang/Class;

    const-string v1, "thread spec wasn\'t set before fragment was attached to activity!"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 291
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->n()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->bc:F

    .line 292
    iget v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->bc:F

    iput v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->bd:F

    .line 294
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->V()V

    .line 295
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->W()V

    .line 299
    sget v0, Lcom/facebook/i;->thread_view_overlay_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/OverlayLayout;

    .line 300
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, -0x1

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/OverlayLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 302
    new-instance v0, Lcom/facebook/orca/compose/av;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->af:Lcom/facebook/orca/prefs/az;

    invoke-direct {v0, v1}, Lcom/facebook/orca/compose/av;-><init>(Lcom/facebook/orca/prefs/az;)V

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ay:Lcom/facebook/orca/compose/av;

    .line 303
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ay:Lcom/facebook/orca/compose/av;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->az:Lcom/facebook/orca/compose/LocationNuxView;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aA:Lcom/facebook/orca/compose/LocationDisabledNuxView;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/compose/av;->a(Lcom/facebook/orca/compose/LocationNuxView;Lcom/facebook/orca/compose/LocationDisabledNuxView;)V

    .line 305
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    sget v1, Lcom/facebook/i;->orca_threadview_fragment:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    .line 308
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->ay:Lcom/facebook/orca/compose/av;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/compose/av;)V

    .line 309
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aL:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ar;)V

    .line 311
    if-eqz p1, :cond_4

    const-string v0, "state"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 312
    const-class v0, Lcom/facebook/orca/threadview/ca;

    const-string v1, "state"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ca;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    .line 319
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    const-string v1, "groupContactCard"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 320
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ag()V

    .line 321
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    sget-object v1, Lcom/facebook/orca/threadview/ca;->GROUP_CONTACTCARD:Lcom/facebook/orca/threadview/ca;

    if-eq v0, v1, :cond_1

    .line 322
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/GroupContactCardFragment;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 323
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 324
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aO:Lcom/facebook/contacts/contactcard/GroupContactCardFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 325
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 328
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    const-string v1, "contactCard"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 329
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->af()V

    .line 330
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    sget-object v1, Lcom/facebook/orca/threadview/ca;->CONTACTCARD:Lcom/facebook/orca/threadview/ca;

    if-eq v0, v1, :cond_2

    .line 331
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->aa()V

    .line 332
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 333
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aN:Lcom/facebook/contacts/contactcard/ContactCardFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 334
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 337
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    const-string v1, "mapForContactCard"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 338
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->ah()V

    .line 339
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    sget-object v1, Lcom/facebook/orca/threadview/ca;->MAP:Lcom/facebook/orca/threadview/ca;

    if-eq v0, v1, :cond_3

    .line 340
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->f:Landroid/support/v4/app/q;

    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 341
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aM:Lcom/facebook/orca/threadview/ThreadViewMapFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 342
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 346
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b(Lcom/facebook/orca/threadview/ca;)V

    .line 348
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->b:Lcom/facebook/orca/threadview/ci;

    new-instance v1, Lcom/facebook/orca/threadview/bs;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/bs;-><init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/threadview/cl;)V

    .line 379
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aj:Lcom/facebook/orca/threadview/cb;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/cb;->a()V

    .line 381
    iput-boolean v3, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aX:Z

    .line 383
    invoke-direct {p0, v3}, Lcom/facebook/orca/threadview/ThreadViewFragment;->e(Z)V

    .line 384
    invoke-virtual {p0, v3}, Lcom/facebook/orca/threadview/ThreadViewFragment;->d(Z)V

    .line 386
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aG:Lcom/facebook/zero/ui/l;

    sget-object v1, Lcom/facebook/zero/a/c;->h:Lcom/facebook/prefs/shared/ae;

    sget v2, Lcom/facebook/o;->zero_show_map_dialog_content:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/facebook/orca/threadview/bt;

    invoke-direct {v3, p0}, Lcom/facebook/orca/threadview/bt;-><init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/zero/ui/l;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;Lcom/facebook/zero/ui/k;)Lcom/facebook/zero/ui/l;

    .line 405
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aG:Lcom/facebook/zero/ui/l;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->p()Landroid/support/v4/app/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/zero/ui/l;->a(Landroid/support/v4/app/q;)V

    .line 409
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->d(Landroid/os/Bundle;)V

    .line 410
    return-void

    .line 314
    :cond_4
    sget-object v0, Lcom/facebook/orca/threadview/ca;->MESSAGES:Lcom/facebook/orca/threadview/ca;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    goto/16 :goto_0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 668
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->e(Landroid/os/Bundle;)V

    .line 669
    const-string v0, "state"

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aV:Lcom/facebook/orca/threadview/ca;

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/ca;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 670
    return-void
.end method

.method public f()V
    .locals 2

    .prologue
    .line 883
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->f()V

    .line 884
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aj:Lcom/facebook/orca/threadview/cb;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/cb;->a(Z)V

    .line 885
    return-void
.end method

.method public g()V
    .locals 2

    .prologue
    .line 889
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->g()V

    .line 890
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewFragment;->aj:Lcom/facebook/orca/threadview/cb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/cb;->a(Z)V

    .line 891
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 224
    sget-object v0, Lcom/facebook/analytics/f/a;->THREAD_VIEW_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
