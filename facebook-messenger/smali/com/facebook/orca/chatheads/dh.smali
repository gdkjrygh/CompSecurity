.class public Lcom/facebook/orca/chatheads/dh;
.super Lcom/facebook/widget/d;
.source "ChatThreadView.java"

# interfaces
.implements Lcom/facebook/orca/threadview/ar;


# static fields
.field public static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/n/g;

.field private static final c:Lcom/facebook/n/g;


# instance fields
.field private A:Landroid/view/View;

.field private B:Landroid/view/View;

.field private C:Landroid/view/ViewGroup;

.field private D:Lcom/facebook/orca/threadview/ThreadTitleView;

.field private E:Lcom/facebook/widget/listview/EmptyListViewItem;

.field private F:Landroid/view/View;

.field private G:Landroid/widget/ImageButton;

.field private H:Lcom/facebook/widget/s;

.field private I:Lcom/facebook/widget/s;

.field private J:I

.field private K:I

.field private L:I

.field private M:I

.field private N:Lcom/facebook/messages/threads/model/ThreadViewSpec;

.field private O:I

.field private P:I

.field private Q:Lcom/facebook/n/c;

.field private R:Lcom/google/common/d/a/ab;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/ab",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private S:Z

.field private T:Z

.field private U:Z

.field private V:Lcom/facebook/orca/chatheads/ek;

.field private W:Z

.field private Z:Z

.field private aa:Z

.field private ab:[J

.field private ac:I

.field private ad:Lcom/actionbarsherlock/widget/a;

.field private ae:Lcom/facebook/orca/chatheads/ef;

.field private af:Lcom/facebook/orca/chatheads/dt;

.field private ag:Lcom/facebook/orca/emoji/ai;

.field private ah:Lcom/facebook/orca/compose/av;

.field private ai:Lcom/facebook/orca/threadview/cp;

.field private aj:Lcom/facebook/common/e/h;

.field private final d:Landroid/support/v4/app/bb;

.field private final e:Lcom/facebook/orca/chatheads/du;

.field private f:Lcom/facebook/orca/f/k;

.field private g:Lcom/facebook/orca/f/o;

.field private h:Lcom/facebook/orca/threadview/cb;

.field private i:Lcom/facebook/orca/threadview/ci;

.field private j:Lcom/facebook/orca/notify/av;

.field private k:Lcom/facebook/orca/prefs/az;

.field private l:Lcom/facebook/orca/d/bf;

.field private m:Lcom/facebook/orca/d/m;

.field private n:Lcom/facebook/orca/d/af;

.field private o:Lcom/facebook/orca/common/ui/widgets/text/a;

.field private p:Lcom/facebook/n/j;

.field private q:Lcom/facebook/common/hardware/q;

.field private r:Lcom/facebook/common/hardware/t;

.field private s:Lcom/facebook/ui/f/a;

.field private t:Lcom/facebook/messages/ipc/k;

.field private u:Lcom/facebook/c/s;

.field private v:Lcom/facebook/b/a/b;

.field private w:Lcom/facebook/orca/common/ui/widgets/a;

.field private x:Lcom/facebook/ui/d/d;

.field private y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

.field private z:Lcom/facebook/orca/emoji/ah;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 87
    const-class v0, Lcom/facebook/orca/chatheads/dh;

    sput-object v0, Lcom/facebook/orca/chatheads/dh;->a:Ljava/lang/Class;

    .line 89
    const-wide v0, 0x4062c00000000000L    # 150.0

    const-wide/high16 v2, 0x4028000000000000L    # 12.0

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/n/g;->a(DD)Lcom/facebook/n/g;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/chatheads/dh;->b:Lcom/facebook/n/g;

    .line 91
    const-wide v0, 0x4050400000000000L    # 65.0

    const-wide/high16 v2, 0x4021000000000000L    # 8.5

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/n/g;->a(DD)Lcom/facebook/n/g;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/chatheads/dh;->c:Lcom/facebook/n/g;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .prologue
    const-wide v3, 0x3f747ae140000000L    # 0.004999999888241291

    const/4 v2, 0x0

    .line 195
    invoke-direct {p0, p1}, Lcom/facebook/widget/d;-><init>(Landroid/content/Context;)V

    .line 101
    new-instance v0, Lcom/facebook/orca/chatheads/du;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/orca/chatheads/du;-><init>(Lcom/facebook/orca/chatheads/dh;Lcom/facebook/orca/chatheads/di;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->e:Lcom/facebook/orca/chatheads/du;

    .line 153
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/dh;->Z:Z

    .line 154
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/dh;->aa:Z

    .line 155
    const/16 v0, 0x12c

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ab:[J

    .line 165
    sget-object v0, Lcom/facebook/orca/threadview/ci;->a:Lcom/facebook/orca/threadview/cp;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    .line 197
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->i()V

    .line 198
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->j()V

    .line 199
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->k()V

    .line 201
    new-instance v0, Lcom/facebook/orca/chatheads/di;

    invoke-direct {v0, p0}, Lcom/facebook/orca/chatheads/di;-><init>(Lcom/facebook/orca/chatheads/dh;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->r:Lcom/facebook/common/hardware/t;

    .line 213
    invoke-static {p0, v2}, Lcom/a/c/a;->e(Landroid/view/View;F)V

    .line 214
    invoke-static {p0, v2}, Lcom/a/c/a;->f(Landroid/view/View;F)V

    .line 215
    invoke-static {p0, v2}, Lcom/a/c/a;->a(Landroid/view/View;F)V

    .line 217
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->p:Lcom/facebook/n/j;

    invoke-virtual {v0}, Lcom/facebook/n/j;->b()Lcom/facebook/n/c;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/chatheads/dh;->b:Lcom/facebook/n/g;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lcom/facebook/n/c;->d(D)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lcom/facebook/n/c;->e(D)Lcom/facebook/n/c;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->e:Lcom/facebook/orca/chatheads/du;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/i;)Lcom/facebook/n/c;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->Q:Lcom/facebook/n/c;

    .line 223
    new-instance v0, Landroid/support/v4/app/bb;

    invoke-direct {v0, p0}, Landroid/support/v4/app/bb;-><init>(Landroid/view/ViewGroup;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->d:Landroid/support/v4/app/bb;

    .line 224
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->d:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->k()V

    .line 227
    new-instance v0, Lcom/facebook/orca/chatheads/dl;

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dh;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/facebook/orca/chatheads/dl;-><init>(Lcom/facebook/orca/chatheads/dh;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->h:Lcom/facebook/orca/threadview/cb;

    .line 259
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/dh;Lcom/actionbarsherlock/widget/a;)Lcom/actionbarsherlock/widget/a;
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dh;->ad:Lcom/actionbarsherlock/widget/a;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/dh;Lcom/google/common/d/a/ab;)Lcom/google/common/d/a/ab;
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dh;->R:Lcom/google/common/d/a/ab;

    return-object p1
.end method

.method static synthetic a(Landroid/view/View;Z)V
    .locals 0

    .prologue
    .line 85
    invoke-static {p0, p1}, Lcom/facebook/orca/chatheads/dh;->b(Landroid/view/View;Z)V

    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;Z)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 1240
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/dh;->S:Z

    if-nez v0, :cond_0

    .line 1251
    :goto_0
    return-void

    .line 1244
    :cond_0
    iget-object v2, p0, Lcom/facebook/orca/chatheads/dh;->w:Lcom/facebook/orca/common/ui/widgets/a;

    if-eqz p2, :cond_1

    const-wide/16 v0, 0x1388

    :goto_1
    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/common/ui/widgets/a;->a(J)V

    .line 1245
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->w:Lcom/facebook/orca/common/ui/widgets/a;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/common/ui/widgets/a;->a(Z)V

    .line 1246
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->w:Lcom/facebook/orca/common/ui/widgets/a;

    const/16 v1, 0x50

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/widgets/a;->a(I)V

    .line 1247
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->w:Lcom/facebook/orca/common/ui/widgets/a;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->D:Lcom/facebook/orca/threadview/ThreadTitleView;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/dh;->x:Lcom/facebook/ui/d/d;

    const/4 v3, 0x0

    invoke-virtual {v2, p1, v3, v4}, Lcom/facebook/ui/d/d;->a(Lcom/facebook/fbservice/service/ServiceException;ZZ)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/common/ui/widgets/d;->WARNING:Lcom/facebook/orca/common/ui/widgets/d;

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/orca/common/ui/widgets/a;->a(Landroid/view/View;Ljava/lang/CharSequence;Lcom/facebook/orca/common/ui/widgets/d;)V

    goto :goto_0

    .line 1244
    :cond_1
    const-wide/16 v0, 0x0

    goto :goto_1
.end method

.method private a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 2

    .prologue
    .line 500
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->af:Lcom/facebook/orca/chatheads/dt;

    if-eqz v0, :cond_0

    .line 501
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->af:Lcom/facebook/orca/chatheads/dt;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->N:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-interface {v0, v1, p1}, Lcom/facebook/orca/chatheads/dt;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 503
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/dh;->setThreadNoResetViews(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 504
    return-void
.end method

.method private a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Z)V
    .locals 1

    .prologue
    .line 515
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->N:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-static {p1, v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 516
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dh;->N:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 517
    sget-object v0, Lcom/facebook/orca/threadview/ci;->a:Lcom/facebook/orca/threadview/cp;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    .line 518
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/dh;->b(Lcom/facebook/messages/threads/model/ThreadViewSpec;Z)V

    .line 519
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->i:Lcom/facebook/orca/threadview/ci;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 520
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->h:Lcom/facebook/orca/threadview/cb;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threadview/cb;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 522
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/dh;->b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 523
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/dh;->b(Z)V

    .line 526
    :cond_0
    if-eqz p2, :cond_1

    .line 527
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->z:Lcom/facebook/orca/emoji/ah;

    invoke-interface {v0}, Lcom/facebook/orca/emoji/ah;->a()V

    .line 528
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->m:Lcom/facebook/orca/d/m;

    invoke-virtual {v0}, Lcom/facebook/orca/d/m;->a()V

    .line 529
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->n:Lcom/facebook/orca/d/af;

    invoke-virtual {v0}, Lcom/facebook/orca/d/af;->b()V

    .line 531
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/dh;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/dh;Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/dh;Lcom/facebook/orca/threadview/cn;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/orca/threadview/cn;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/dh;Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cm;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cm;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/dh;Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cp;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cp;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/dh;Lcom/facebook/user/User;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/user/User;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/dh;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/dh;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 0

    .prologue
    .line 1035
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/dh;->b(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 1036
    return-void
.end method

.method private a(Lcom/facebook/orca/threadview/cn;)V
    .locals 3

    .prologue
    .line 1017
    sget-object v0, Lcom/facebook/orca/threadview/cn;->THREAD_VIEW:Lcom/facebook/orca/threadview/cn;

    if-ne p1, v0, :cond_1

    .line 1018
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->E:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dh;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/o;->thread_loading:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    .line 1019
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->E:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 1023
    :cond_0
    :goto_0
    return-void

    .line 1020
    :cond_1
    sget-object v0, Lcom/facebook/orca/threadview/cn;->MORE_MESSAGES:Lcom/facebook/orca/threadview/cn;

    if-ne p1, v0, :cond_0

    .line 1021
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c()V

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cm;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1055
    sget-object v2, Lcom/facebook/orca/threadview/cn;->THREAD_VIEW:Lcom/facebook/orca/threadview/cn;

    if-ne p1, v2, :cond_3

    .line 1057
    iget-object v2, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    iget-object v2, v2, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    iget-object v2, v2, Lcom/facebook/orca/threadview/cp;->b:Lcom/facebook/orca/threads/MessagesCollection;

    if-nez v2, :cond_2

    .line 1058
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->E:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 1059
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->E:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v3}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    move v0, v1

    .line 1068
    :goto_0
    iget-boolean v1, p2, Lcom/facebook/orca/threadview/cm;->b:Z

    if-eqz v1, :cond_1

    .line 1069
    iget-object v1, p2, Lcom/facebook/orca/threadview/cm;->a:Lcom/facebook/fbservice/service/ServiceException;

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/fbservice/service/ServiceException;Z)V

    .line 1077
    :cond_1
    :goto_1
    return-void

    .line 1063
    :cond_2
    iget-object v2, p0, Lcom/facebook/orca/chatheads/dh;->E:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v2, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 1064
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->E:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v1, v3}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    .line 1065
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->E:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 1066
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->t()V

    goto :goto_0

    .line 1071
    :cond_3
    sget-object v1, Lcom/facebook/orca/threadview/cn;->MORE_MESSAGES:Lcom/facebook/orca/threadview/cn;

    if-ne p1, v1, :cond_1

    .line 1072
    iget-boolean v1, p2, Lcom/facebook/orca/threadview/cm;->b:Z

    if-eqz v1, :cond_4

    .line 1073
    iget-object v1, p2, Lcom/facebook/orca/threadview/cm;->a:Lcom/facebook/fbservice/service/ServiceException;

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/fbservice/service/ServiceException;Z)V

    .line 1075
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->U()V

    goto :goto_1
.end method

.method private a(Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cp;)V
    .locals 2

    .prologue
    .line 1026
    iput-object p2, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    .line 1027
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->af:Lcom/facebook/orca/chatheads/dt;

    if-eqz v0, :cond_0

    .line 1028
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->af:Lcom/facebook/orca/chatheads/dt;

    iget-object v1, p2, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-interface {v0, v1}, Lcom/facebook/orca/chatheads/dt;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 1030
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->E:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 1031
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->t()V

    .line 1032
    return-void
.end method

.method private a(Lcom/facebook/user/User;)V
    .locals 2

    .prologue
    .line 1039
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->E:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 1040
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 764
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->af:Lcom/facebook/orca/chatheads/dt;

    if-eqz v0, :cond_0

    .line 765
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->af:Lcom/facebook/orca/chatheads/dt;

    invoke-interface {v0, p1}, Lcom/facebook/orca/chatheads/dt;->a(Ljava/lang/String;)V

    .line 767
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/dh;)Z
    .locals 1

    .prologue
    .line 85
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/dh;->U:Z

    return v0
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/dh;Z)Z
    .locals 0

    .prologue
    .line 85
    iput-boolean p1, p0, Lcom/facebook/orca/chatheads/dh;->Z:Z

    return p1
.end method

.method private static b(Landroid/view/View;Z)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 452
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    .line 453
    invoke-virtual {p0, p1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 457
    :goto_0
    return-void

    .line 455
    :cond_0
    if-eqz p1, :cond_1

    const/4 v0, 0x2

    :goto_1
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 3

    .prologue
    .line 1146
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1147
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->f:Lcom/facebook/orca/f/k;

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->b(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 1148
    if-eqz v0, :cond_0

    .line 1149
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->D:Lcom/facebook/orca/threadview/ThreadTitleView;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/dh;->o:Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/common/ui/widgets/text/a;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threadview/v;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadview/ThreadTitleView;->setThreadNameViewData(Lcom/facebook/orca/threadview/v;)V

    .line 1160
    :cond_0
    :goto_0
    return-void

    .line 1153
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1154
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->D:Lcom/facebook/orca/threadview/ThreadTitleView;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->o:Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->e()Lcom/facebook/user/RecipientInfo;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/common/ui/widgets/text/a;->a(Lcom/facebook/user/RecipientInfo;)Lcom/facebook/orca/threadview/v;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadTitleView;->setThreadNameViewData(Lcom/facebook/orca/threadview/v;)V

    goto :goto_0

    .line 1158
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->D:Lcom/facebook/orca/threadview/ThreadTitleView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadTitleView;->setThreadNameViewData(Lcom/facebook/orca/threadview/v;)V

    goto :goto_0
.end method

.method private b(Lcom/facebook/messages/threads/model/ThreadViewSpec;Z)V
    .locals 5

    .prologue
    const/4 v4, -0x1

    .line 770
    if-nez p1, :cond_1

    .line 911
    :cond_0
    :goto_0
    return-void

    .line 774
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    if-nez v0, :cond_3

    .line 775
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Z)Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    .line 776
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->ah:Lcom/facebook/orca/compose/av;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/compose/av;)V

    .line 777
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    const-string v1, "chathead"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Ljava/lang/String;)V

    .line 778
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->getSupportFragmentManager()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 779
    sget v1, Lcom/facebook/i;->fragment_container:I

    iget-object v2, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    const-string v3, "threadViewMessageFragment"

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/ad;->b(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 782
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->b()I

    .line 784
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->getSupportFragmentManager()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->b()Z

    .line 786
    sget v0, Lcom/facebook/i;->popup_menu_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/dh;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->G:Landroid/widget/ImageButton;

    .line 787
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->G:Landroid/widget/ImageButton;

    new-instance v1, Lcom/facebook/orca/chatheads/dp;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/dp;-><init>(Lcom/facebook/orca/chatheads/dh;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 794
    new-instance v0, Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dh;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->E:Lcom/facebook/widget/listview/EmptyListViewItem;

    .line 795
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->E:Lcom/facebook/widget/listview/EmptyListViewItem;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 798
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->C:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->E:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 800
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->V:Lcom/facebook/orca/chatheads/ek;

    if-eqz v0, :cond_2

    .line 801
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->V:Lcom/facebook/orca/chatheads/ek;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ek;->d()V

    .line 802
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->V:Lcom/facebook/orca/chatheads/ek;

    .line 804
    :cond_2
    new-instance v0, Lcom/facebook/orca/chatheads/ek;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->z()Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/chatheads/dh;->F:Landroid/view/View;

    sget-object v3, Lcom/facebook/orca/chatheads/en;->UP:Lcom/facebook/orca/chatheads/en;

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/orca/chatheads/ek;-><init>(Landroid/view/View;Landroid/view/View;Lcom/facebook/orca/chatheads/en;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->V:Lcom/facebook/orca/chatheads/ek;

    .line 806
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->V:Lcom/facebook/orca/chatheads/ek;

    new-instance v1, Lcom/facebook/orca/chatheads/dq;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/dq;-><init>(Lcom/facebook/orca/chatheads/dh;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ek;->a(Lcom/facebook/orca/chatheads/em;)V

    .line 843
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->V:Lcom/facebook/orca/chatheads/ek;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ek;->a()V

    .line 845
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ar;)V

    .line 847
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->e(I)V

    .line 848
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    new-instance v1, Lcom/facebook/orca/chatheads/dr;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/dr;-><init>(Lcom/facebook/orca/chatheads/dh;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 885
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->Q()Lcom/facebook/orca/compose/ComposeFragment;

    move-result-object v0

    .line 886
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->z:Lcom/facebook/orca/emoji/ah;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/emoji/ah;)V

    .line 887
    new-instance v1, Lcom/facebook/orca/chatheads/ds;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/ds;-><init>(Lcom/facebook/orca/chatheads/dh;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/am;)V

    .line 902
    :cond_3
    if-eqz p2, :cond_4

    .line 903
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->E:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 904
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a()V

    .line 906
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Z)V

    .line 908
    if-eqz p2, :cond_0

    .line 909
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->B:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    goto/16 :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/dh;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->t()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/dh;Lcom/facebook/orca/threadview/cn;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/dh;->b(Lcom/facebook/orca/threadview/cn;)V

    return-void
.end method

.method private b(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 2

    .prologue
    .line 1140
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->D:Lcom/facebook/orca/threadview/ThreadTitleView;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->o:Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-virtual {v1, p1}, Lcom/facebook/orca/common/ui/widgets/text/a;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threadview/v;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadTitleView;->setThreadNameViewData(Lcom/facebook/orca/threadview/v;)V

    .line 1143
    return-void
.end method

.method private b(Lcom/facebook/orca/threadview/cn;)V
    .locals 2

    .prologue
    .line 1043
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->E:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 1044
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->E:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    .line 1045
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->E:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setVisibility(I)V

    .line 1046
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->N:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_0

    .line 1050
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 1052
    :cond_0
    return-void
.end method

.method private b(Z)V
    .locals 2

    .prologue
    .line 957
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->N:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    if-nez v0, :cond_0

    .line 969
    :goto_0
    return-void

    .line 961
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->x()V

    .line 963
    new-instance v0, Lcom/facebook/orca/threadview/co;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Lcom/facebook/orca/threadview/co;-><init>(ZZ)V

    .line 968
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->i:Lcom/facebook/orca/threadview/ci;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/threadview/co;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/dh;Z)Z
    .locals 0

    .prologue
    .line 85
    iput-boolean p1, p0, Lcom/facebook/orca/chatheads/dh;->aa:Z

    return p1
.end method

.method static synthetic c(Lcom/facebook/orca/chatheads/dh;)J
    .locals 2

    .prologue
    .line 85
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->getLastThreadActionId()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic c(Lcom/facebook/orca/chatheads/dh;Z)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/dh;->setIsScrolledToBottom(Z)V

    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/orca/chatheads/ek;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->V:Lcom/facebook/orca/chatheads/ek;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/orca/chatheads/dh;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->v()V

    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/orca/threadview/ThreadViewMessageFragment;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    return-object v0
.end method

.method static synthetic g(Lcom/facebook/orca/chatheads/dh;)Z
    .locals 1

    .prologue
    .line 85
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/dh;->aa:Z

    return v0
.end method

.method private getLastThreadActionId()J
    .locals 2

    .prologue
    .line 1258
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    .line 1259
    if-nez v0, :cond_0

    .line 1260
    const-wide/16 v0, -0x1

    .line 1263
    :goto_0
    return-wide v0

    :cond_0
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v0

    goto :goto_0
.end method

.method private getSupportFragmentManager()Landroid/support/v4/app/q;
    .locals 1

    .prologue
    .line 760
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->d:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->r()Landroid/support/v4/app/q;

    move-result-object v0

    return-object v0
.end method

.method static synthetic h(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/orca/compose/av;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ah:Lcom/facebook/orca/compose/av;

    return-object v0
.end method

.method private i()V
    .locals 3

    .prologue
    .line 262
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dh;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 263
    const-class v0, Lcom/facebook/orca/f/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->f:Lcom/facebook/orca/f/k;

    .line 264
    const-class v0, Lcom/facebook/orca/f/o;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/o;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->g:Lcom/facebook/orca/f/o;

    .line 265
    const-class v0, Lcom/facebook/orca/threadview/ci;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ci;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->i:Lcom/facebook/orca/threadview/ci;

    .line 266
    const-class v0, Lcom/facebook/orca/notify/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/av;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->j:Lcom/facebook/orca/notify/av;

    .line 267
    const-class v0, Lcom/facebook/orca/prefs/az;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/prefs/az;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->k:Lcom/facebook/orca/prefs/az;

    .line 268
    const-class v0, Lcom/facebook/orca/d/bf;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/bf;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->l:Lcom/facebook/orca/d/bf;

    .line 269
    const-class v0, Lcom/facebook/orca/d/m;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/m;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->m:Lcom/facebook/orca/d/m;

    .line 270
    const-class v0, Lcom/facebook/orca/d/af;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/af;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->n:Lcom/facebook/orca/d/af;

    .line 271
    const-class v0, Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/text/a;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->o:Lcom/facebook/orca/common/ui/widgets/text/a;

    .line 273
    const-class v0, Lcom/facebook/n/j;

    const-class v2, Lcom/facebook/orca/chatheads/annotations/ForChatHeads;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/n/j;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->p:Lcom/facebook/n/j;

    .line 274
    const-class v0, Lcom/facebook/common/hardware/q;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/hardware/q;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->q:Lcom/facebook/common/hardware/q;

    .line 275
    const-class v0, Lcom/facebook/ui/f/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/f/a;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->s:Lcom/facebook/ui/f/a;

    .line 276
    const-class v0, Lcom/facebook/messages/ipc/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/ipc/k;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->t:Lcom/facebook/messages/ipc/k;

    .line 277
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->u:Lcom/facebook/c/s;

    .line 278
    const-class v0, Lcom/facebook/b/a/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/b/a/b;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->v:Lcom/facebook/b/a/b;

    .line 279
    const-class v0, Lcom/facebook/common/e/h;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->aj:Lcom/facebook/common/e/h;

    .line 280
    const-class v0, Lcom/facebook/orca/common/ui/widgets/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/a;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->w:Lcom/facebook/orca/common/ui/widgets/a;

    .line 281
    const-class v0, Lcom/facebook/ui/d/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/d/d;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->x:Lcom/facebook/ui/d/d;

    .line 282
    return-void
.end method

.method static synthetic i(Lcom/facebook/orca/chatheads/dh;)Z
    .locals 1

    .prologue
    .line 85
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/dh;->Z:Z

    return v0
.end method

.method static synthetic j(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/b/a/b;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->v:Lcom/facebook/b/a/b;

    return-object v0
.end method

.method private j()V
    .locals 2

    .prologue
    .line 285
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->i:Lcom/facebook/orca/threadview/ci;

    new-instance v1, Lcom/facebook/orca/chatheads/dm;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/dm;-><init>(Lcom/facebook/orca/chatheads/dh;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/threadview/cl;)V

    .line 316
    return-void
.end method

.method private k()V
    .locals 5

    .prologue
    .line 334
    sget v0, Lcom/facebook/k;->orca_chat_heads_thread_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/dh;->setContentView(I)V

    .line 336
    sget v0, Lcom/facebook/i;->messages_popup_layout:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/dh;->c(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->A:Landroid/view/View;

    .line 337
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->A:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 338
    new-instance v0, Lcom/facebook/widget/s;

    invoke-direct {v0, p0}, Lcom/facebook/widget/s;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->H:Lcom/facebook/widget/s;

    .line 340
    new-instance v0, Lcom/facebook/orca/chatheads/ef;

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dh;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/chatheads/dh;->H:Lcom/facebook/widget/s;

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/chatheads/ef;-><init>(Landroid/content/Context;Lcom/facebook/widget/l;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ae:Lcom/facebook/orca/chatheads/ef;

    .line 343
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dh;->getRootView()Landroid/view/View;

    move-result-object v2

    .line 344
    sget v0, Lcom/facebook/i;->messages_popup_nub:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/dh;->c(I)Landroid/view/View;

    move-result-object v1

    .line 345
    sget v0, Lcom/facebook/i;->thread_title_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/dh;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ThreadTitleView;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->D:Lcom/facebook/orca/threadview/ThreadTitleView;

    .line 346
    sget v0, Lcom/facebook/i;->dummy_focus_elt:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/dh;->c(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->B:Landroid/view/View;

    .line 347
    new-instance v0, Lcom/facebook/widget/s;

    invoke-direct {v0, v1}, Lcom/facebook/widget/s;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->I:Lcom/facebook/widget/s;

    .line 348
    sget v0, Lcom/facebook/i;->fragment_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/dh;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->C:Landroid/view/ViewGroup;

    .line 349
    sget v0, Lcom/facebook/i;->drag_frame:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/dh;->c(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->F:Landroid/view/View;

    .line 351
    sget v0, Lcom/facebook/i;->compose_location_nux:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/dh;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/LocationNuxView;

    .line 352
    sget v1, Lcom/facebook/i;->compose_location_disabled_nux:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/dh;->c(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/compose/LocationDisabledNuxView;

    .line 353
    new-instance v3, Lcom/facebook/orca/compose/av;

    iget-object v4, p0, Lcom/facebook/orca/chatheads/dh;->k:Lcom/facebook/orca/prefs/az;

    invoke-direct {v3, v4}, Lcom/facebook/orca/compose/av;-><init>(Lcom/facebook/orca/prefs/az;)V

    iput-object v3, p0, Lcom/facebook/orca/chatheads/dh;->ah:Lcom/facebook/orca/compose/av;

    .line 354
    iget-object v3, p0, Lcom/facebook/orca/chatheads/dh;->ah:Lcom/facebook/orca/compose/av;

    invoke-virtual {v3, v0, v1}, Lcom/facebook/orca/compose/av;->a(Lcom/facebook/orca/compose/LocationNuxView;Lcom/facebook/orca/compose/LocationDisabledNuxView;)V

    .line 357
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dh;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 358
    sget v1, Lcom/facebook/g;->chat_head_popup_pivot_x_offset:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/chatheads/dh;->J:I

    .line 359
    sget v1, Lcom/facebook/g;->chat_head_popup_pivot_y_offset:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/chatheads/dh;->K:I

    .line 360
    sget v1, Lcom/facebook/g;->chat_head_nub_base_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/chatheads/dh;->L:I

    .line 361
    sget v1, Lcom/facebook/g;->chat_head_nub_base_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/chatheads/dh;->M:I

    .line 363
    new-instance v0, Lcom/facebook/orca/chatheads/dn;

    invoke-direct {v0, p0}, Lcom/facebook/orca/chatheads/dn;-><init>(Lcom/facebook/orca/chatheads/dh;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 369
    return-void
.end method

.method static synthetic k(Lcom/facebook/orca/chatheads/dh;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->w()V

    return-void
.end method

.method private l()V
    .locals 5

    .prologue
    .line 590
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 591
    const-string v0, "Too many calls to render layout."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    const-string v0, "\n\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 595
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 596
    const-string v4, "\n"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 598
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 599
    sget-object v1, Lcom/facebook/orca/chatheads/dh;->a:Ljava/lang/Class;

    invoke-static {v1, v0}, Lcom/facebook/debug/log/f;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 600
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->aj:Lcom/facebook/common/e/h;

    const-string v2, "T2136301:continuous_render_layout_calls"

    invoke-interface {v1, v2, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 601
    return-void
.end method

.method static synthetic l(Lcom/facebook/orca/chatheads/dh;)V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->r()V

    return-void
.end method

.method static synthetic m(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/ui/f/a;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->s:Lcom/facebook/ui/f/a;

    return-object v0
.end method

.method static synthetic n(Lcom/facebook/orca/chatheads/dh;)Lcom/google/common/d/a/ab;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->R:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method private o()V
    .locals 6

    .prologue
    .line 607
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ab:[J

    iget v1, p0, Lcom/facebook/orca/chatheads/dh;->ac:I

    rem-int/lit16 v1, v1, 0x12c

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    aput-wide v2, v0, v1

    .line 610
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ab:[J

    iget v1, p0, Lcom/facebook/orca/chatheads/dh;->ac:I

    rem-int/lit16 v1, v1, 0x12c

    aget-wide v0, v0, v1

    iget-object v2, p0, Lcom/facebook/orca/chatheads/dh;->ab:[J

    iget v3, p0, Lcom/facebook/orca/chatheads/dh;->ac:I

    add-int/lit8 v3, v3, 0x1

    rem-int/lit16 v3, v3, 0x12c

    aget-wide v2, v2, v3

    const-wide/16 v4, 0xa

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 614
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->l()V

    .line 617
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ab:[J

    array-length v1, v0

    .line 618
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 619
    iget-object v2, p0, Lcom/facebook/orca/chatheads/dh;->ab:[J

    const-wide/16 v3, 0x0

    aput-wide v3, v2, v0

    .line 618
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 622
    :cond_0
    iget v0, p0, Lcom/facebook/orca/chatheads/dh;->ac:I

    add-int/lit8 v0, v0, 0x1

    rem-int/lit16 v0, v0, 0x12c

    iput v0, p0, Lcom/facebook/orca/chatheads/dh;->ac:I

    .line 625
    return-void
.end method

.method private p()V
    .locals 2

    .prologue
    .line 716
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->R:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_0

    .line 717
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->R:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->cancel(Z)Z

    .line 718
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->R:Lcom/google/common/d/a/ab;

    .line 720
    :cond_0
    return-void
.end method

.method private q()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 914
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    if-eqz v0, :cond_3

    .line 915
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ar;)V

    .line 917
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->G:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    .line 918
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->G:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 919
    iput-object v2, p0, Lcom/facebook/orca/chatheads/dh;->G:Landroid/widget/ImageButton;

    .line 922
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ad:Lcom/actionbarsherlock/widget/a;

    if-eqz v0, :cond_1

    .line 923
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ad:Lcom/actionbarsherlock/widget/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/widget/a;->c()V

    .line 924
    iput-object v2, p0, Lcom/facebook/orca/chatheads/dh;->ad:Lcom/actionbarsherlock/widget/a;

    .line 927
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->V:Lcom/facebook/orca/chatheads/ek;

    if-eqz v0, :cond_2

    .line 928
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->V:Lcom/facebook/orca/chatheads/ek;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ek;->d()V

    .line 929
    iput-object v2, p0, Lcom/facebook/orca/chatheads/dh;->V:Lcom/facebook/orca/chatheads/ek;

    .line 932
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->Q()Lcom/facebook/orca/compose/ComposeFragment;

    move-result-object v0

    .line 933
    invoke-virtual {v0, v2}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/emoji/ah;)V

    .line 934
    invoke-virtual {v0, v2}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/al;)V

    .line 935
    invoke-virtual {v0, v2}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/am;)V

    .line 937
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->getSupportFragmentManager()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 938
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ad;->a(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 939
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->b()I

    .line 941
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 943
    iput-object v2, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    .line 945
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->getSupportFragmentManager()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->b()Z

    .line 947
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->C:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->E:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 948
    iput-object v2, p0, Lcom/facebook/orca/chatheads/dh;->E:Lcom/facebook/widget/listview/EmptyListViewItem;

    .line 950
    :cond_3
    return-void
.end method

.method private r()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 972
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/dh;->T:Z

    .line 974
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->N:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    if-nez v0, :cond_0

    .line 983
    :goto_0
    return-void

    .line 978
    :cond_0
    new-instance v0, Lcom/facebook/orca/threadview/co;

    invoke-direct {v0, v1, v1}, Lcom/facebook/orca/threadview/co;-><init>(ZZ)V

    .line 982
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->i:Lcom/facebook/orca/threadview/ci;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadview/ci;->a(Lcom/facebook/orca/threadview/co;)V

    goto :goto_0
.end method

.method private s()Z
    .locals 1

    .prologue
    .line 1090
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->q:Lcom/facebook/common/hardware/q;

    invoke-virtual {v0}, Lcom/facebook/common/hardware/q;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->Q:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/dh;->T:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private setIsScrolledToBottom(Z)V
    .locals 2

    .prologue
    .line 485
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/dh;->W:Z

    if-ne p1, v0, :cond_0

    .line 497
    :goto_0
    return-void

    .line 488
    :cond_0
    iput-boolean p1, p0, Lcom/facebook/orca/chatheads/dh;->W:Z

    .line 489
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->F:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 491
    if-nez p1, :cond_1

    .line 492
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->R()I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 496
    :goto_1
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->F:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 494
    :cond_1
    const/4 v1, 0x0

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    goto :goto_1
.end method

.method private setThreadNoResetViews(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 1

    .prologue
    .line 511
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Z)V

    .line 512
    return-void
.end method

.method private t()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1099
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->s()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1100
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/dh;->U:Z

    .line 1125
    :cond_0
    :goto_0
    return-void

    .line 1104
    :cond_1
    iput-boolean v2, p0, Lcom/facebook/orca/chatheads/dh;->U:Z

    .line 1107
    invoke-static {p0, v2}, Lcom/facebook/orca/chatheads/dh;->b(Landroid/view/View;Z)V

    .line 1110
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_2

    .line 1111
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    .line 1112
    invoke-static {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 1113
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Z)V

    .line 1116
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    if-eqz v0, :cond_3

    .line 1117
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/cp;)V

    .line 1119
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_4

    .line 1120
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/dh;->b(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 1122
    :cond_4
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/dh;->S:Z

    if-eqz v0, :cond_0

    .line 1123
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->u()V

    goto :goto_0
.end method

.method private u()V
    .locals 4

    .prologue
    .line 1128
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->N:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1137
    :goto_0
    return-void

    .line 1131
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->f:Lcom/facebook/orca/f/k;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->N:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->a(Ljava/lang/String;)J

    move-result-wide v0

    .line 1132
    iget-object v2, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    iget-object v2, v2, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    iget-object v2, v2, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-lez v0, :cond_1

    .line 1134
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->g:Lcom/facebook/orca/f/o;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    iget-object v1, v1, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/o;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 1136
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->j:Lcom/facebook/orca/notify/av;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->N:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/notify/av;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private v()V
    .locals 3

    .prologue
    .line 1163
    new-instance v0, Lcom/actionbarsherlock/widget/a;

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dh;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/chatheads/dh;->G:Landroid/widget/ImageButton;

    invoke-direct {v0, v1, v2}, Lcom/actionbarsherlock/widget/a;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ad:Lcom/actionbarsherlock/widget/a;

    .line 1164
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ad:Lcom/actionbarsherlock/widget/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/widget/a;->a()Lcom/actionbarsherlock/a/a;

    move-result-object v0

    .line 1165
    new-instance v1, Landroid/view/MenuInflater;

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dh;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/view/MenuInflater;-><init>(Landroid/content/Context;)V

    .line 1166
    new-instance v2, Lcom/facebook/orca/chatheads/a/b;

    invoke-direct {v2, v0}, Lcom/facebook/orca/chatheads/a/b;-><init>(Lcom/actionbarsherlock/a/a;)V

    .line 1168
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->s:Lcom/facebook/ui/f/a;

    invoke-interface {v0, v2, v1}, Lcom/facebook/ui/f/a;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 1169
    sget v0, Lcom/facebook/l;->orca_chat_heads_menu:I

    invoke-virtual {v1, v0, v2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 1171
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ad:Lcom/actionbarsherlock/widget/a;

    new-instance v1, Lcom/facebook/orca/chatheads/dj;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/dj;-><init>(Lcom/facebook/orca/chatheads/dh;)V

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/widget/a;->a(Lcom/actionbarsherlock/widget/c;)V

    .line 1184
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ad:Lcom/actionbarsherlock/widget/a;

    new-instance v1, Lcom/facebook/orca/chatheads/dk;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/dk;-><init>(Lcom/facebook/orca/chatheads/dh;)V

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/widget/a;->a(Lcom/actionbarsherlock/widget/b;)V

    .line 1190
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ad:Lcom/actionbarsherlock/widget/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/widget/a;->b()V

    .line 1191
    return-void
.end method

.method private w()V
    .locals 3

    .prologue
    .line 1195
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->N:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1196
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->t:Lcom/facebook/messages/ipc/k;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->N:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/messages/ipc/k;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 1204
    :goto_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1205
    const/high16 v0, 0x4000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1206
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->u:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dh;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 1207
    return-void

    .line 1197
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->N:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1198
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->N:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->f()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserIdentifier;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1199
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->t:Lcom/facebook/messages/ipc/k;

    invoke-interface {v1, v0}, Lcom/facebook/messages/ipc/k;->b(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0

    .line 1202
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->t:Lcom/facebook/messages/ipc/k;

    invoke-interface {v0}, Lcom/facebook/messages/ipc/k;->a()Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method

.method private x()V
    .locals 1

    .prologue
    .line 1254
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->w:Lcom/facebook/orca/common/ui/widgets/a;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/widgets/a;->a()V

    .line 1255
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 379
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/dh;->S:Z

    if-eqz v0, :cond_1

    .line 402
    :cond_0
    :goto_0
    return-void

    .line 383
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->d:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->m()V

    .line 384
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->d:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->n()V

    .line 386
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->p()V

    .line 388
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->V:Lcom/facebook/orca/chatheads/ek;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ek;->b()V

    .line 390
    iput-boolean v3, p0, Lcom/facebook/orca/chatheads/dh;->S:Z

    .line 392
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->R:Lcom/google/common/d/a/ab;

    .line 393
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->Q:Lcom/facebook/n/c;

    sget-object v1, Lcom/facebook/orca/chatheads/dh;->b:Lcom/facebook/n/g;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    move-result-object v0

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 398
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->u()V

    .line 399
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ai:Lcom/facebook/orca/threadview/cp;

    iget-object v0, v0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    if-nez v0, :cond_0

    .line 400
    invoke-direct {p0, v3}, Lcom/facebook/orca/chatheads/dh;->b(Z)V

    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/compose/ap;)V
    .locals 1

    .prologue
    .line 1011
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ah:Lcom/facebook/orca/compose/av;

    if-eqz v0, :cond_0

    .line 1012
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ah:Lcom/facebook/orca/compose/av;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/compose/av;->a(Lcom/facebook/orca/compose/ap;)V

    .line 1014
    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 1083
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->i:Lcom/facebook/orca/threadview/ci;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threadview/ci;->a(Z)V

    .line 1084
    return-void
.end method

.method public b()Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 408
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/dh;->S:Z

    if-nez v0, :cond_1

    .line 409
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->R:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_0

    .line 410
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->R:Lcom/google/common/d/a/ab;

    .line 442
    :goto_0
    return-object v0

    .line 412
    :cond_0
    invoke-static {v3}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    goto :goto_0

    .line 416
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b()V

    .line 418
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->d:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->o()V

    .line 419
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->d:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->p()V

    .line 420
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ad:Lcom/actionbarsherlock/widget/a;

    if-eqz v0, :cond_2

    .line 421
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ad:Lcom/actionbarsherlock/widget/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/widget/a;->c()V

    .line 424
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->p()V

    .line 426
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/dh;->S:Z

    .line 428
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dh;->e()V

    .line 430
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dh;->R:Lcom/google/common/d/a/ab;

    .line 431
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->Q:Lcom/facebook/n/c;

    sget-object v1, Lcom/facebook/orca/chatheads/dh;->c:Lcom/facebook/n/g;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 436
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->Q:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 437
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->R:Lcom/google/common/d/a/ab;

    invoke-virtual {v0, v3}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 440
    :cond_3
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->x()V

    .line 442
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->R:Lcom/google/common/d/a/ab;

    goto :goto_0
.end method

.method public c()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 460
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    if-eqz v0, :cond_0

    .line 462
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->O()V

    .line 465
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->z:Lcom/facebook/orca/emoji/ah;

    invoke-interface {v0}, Lcom/facebook/orca/emoji/ah;->a()V

    .line 466
    iput-object v1, p0, Lcom/facebook/orca/chatheads/dh;->ah:Lcom/facebook/orca/compose/av;

    .line 467
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->q()V

    .line 468
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dh;->removeAllViewsInLayout()V

    .line 469
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->k()V

    .line 470
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->N:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    if-eqz v0, :cond_1

    .line 472
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->N:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 473
    iput-object v1, p0, Lcom/facebook/orca/chatheads/dh;->N:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 474
    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/dh;->setThread(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 479
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->B:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 480
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->Q()Lcom/facebook/orca/compose/ComposeFragment;

    move-result-object v0

    .line 481
    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->a()V

    .line 482
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 710
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->Q:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->a()V

    .line 711
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->p()V

    .line 712
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ae:Lcom/facebook/orca/chatheads/ef;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ef;->a()V

    .line 713
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 724
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-ne v1, v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    const/16 v2, 0x52

    if-ne v1, v2, :cond_0

    .line 726
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->v()V

    .line 728
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->l:Lcom/facebook/orca/d/bf;

    invoke-virtual {v1, p1}, Lcom/facebook/orca/d/bf;->a(Landroid/view/KeyEvent;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-super {p0, p1}, Lcom/facebook/widget/d;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 734
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-ne v1, v0, :cond_0

    .line 736
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->z:Lcom/facebook/orca/emoji/ah;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->z:Lcom/facebook/orca/emoji/ah;

    invoke-interface {v1}, Lcom/facebook/orca/emoji/ah;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 738
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->z:Lcom/facebook/orca/emoji/ah;

    invoke-interface {v1}, Lcom/facebook/orca/emoji/ah;->a()V

    .line 743
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/widget/d;->dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 576
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ag:Lcom/facebook/orca/emoji/ai;

    if-eqz v0, :cond_0

    .line 579
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ag:Lcom/facebook/orca/emoji/ai;

    invoke-interface {v0, p1}, Lcom/facebook/orca/emoji/ai;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 581
    if-nez v0, :cond_0

    .line 582
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->z:Lcom/facebook/orca/emoji/ah;

    invoke-interface {v0}, Lcom/facebook/orca/emoji/ah;->a()V

    .line 583
    const/4 v0, 0x1

    .line 586
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/widget/d;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public e()V
    .locals 1

    .prologue
    .line 751
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->z:Lcom/facebook/orca/emoji/ah;

    if-eqz v0, :cond_0

    .line 752
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->z:Lcom/facebook/orca/emoji/ah;

    invoke-interface {v0}, Lcom/facebook/orca/emoji/ah;->a()V

    .line 754
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->O()V

    .line 755
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->m:Lcom/facebook/orca/d/m;

    invoke-virtual {v0}, Lcom/facebook/orca/d/m;->a()V

    .line 756
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->n:Lcom/facebook/orca/d/af;

    invoke-virtual {v0}, Lcom/facebook/orca/d/af;->b()V

    .line 757
    return-void
.end method

.method public f()V
    .locals 1

    .prologue
    .line 953
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/dh;->b(Z)V

    .line 954
    return-void
.end method

.method public g()V
    .locals 1

    .prologue
    .line 990
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/dh;->T:Z

    .line 991
    return-void
.end method

.method public getAvailableScreenHeight()I
    .locals 1

    .prologue
    .line 567
    iget v0, p0, Lcom/facebook/orca/chatheads/dh;->O:I

    return v0
.end method

.method public getAvailableScreenWidth()I
    .locals 1

    .prologue
    .line 563
    iget v0, p0, Lcom/facebook/orca/chatheads/dh;->P:I

    return v0
.end method

.method public getDesiredKeyboardWidth()I
    .locals 1

    .prologue
    .line 571
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->C:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    return v0
.end method

.method public getNubTarget()Landroid/graphics/PointF;
    .locals 3

    .prologue
    .line 556
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 557
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->H:Lcom/facebook/widget/s;

    invoke-virtual {v1}, Lcom/facebook/widget/s;->getPivotX()F

    move-result v1

    iget v2, p0, Lcom/facebook/orca/chatheads/dh;->J:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 558
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->H:Lcom/facebook/widget/s;

    invoke-virtual {v1}, Lcom/facebook/widget/s;->getPivotY()F

    move-result v1

    iget v2, p0, Lcom/facebook/orca/chatheads/dh;->K:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 559
    return-object v0
.end method

.method public getThread()Lcom/facebook/messages/threads/model/ThreadViewSpec;
    .locals 1

    .prologue
    .line 534
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->N:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    return-object v0
.end method

.method public getThreadViewSpringyPositioner()Lcom/facebook/orca/chatheads/ef;
    .locals 1

    .prologue
    .line 372
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->ae:Lcom/facebook/orca/chatheads/ef;

    return-object v0
.end method

.method public h()V
    .locals 1

    .prologue
    .line 999
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/dh;->T:Z

    .line 1000
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/dh;->U:Z

    if-eqz v0, :cond_0

    .line 1001
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->t()V

    .line 1003
    :cond_0
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .prologue
    .line 668
    invoke-super {p0}, Lcom/facebook/widget/d;->onAttachedToWindow()V

    .line 670
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->d:Landroid/support/v4/app/bb;

    if-eqz v0, :cond_0

    .line 671
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->d:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->l()V

    .line 674
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->h:Lcom/facebook/orca/threadview/cb;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/cb;->a()V

    .line 675
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->h:Lcom/facebook/orca/threadview/cb;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/cb;->a(Z)V

    .line 676
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->q:Lcom/facebook/common/hardware/q;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->r:Lcom/facebook/common/hardware/t;

    invoke-virtual {v0, v1}, Lcom/facebook/common/hardware/q;->a(Lcom/facebook/common/hardware/t;)V

    .line 677
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 681
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->h:Lcom/facebook/orca/threadview/cb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/cb;->a(Z)V

    .line 682
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->h:Lcom/facebook/orca/threadview/cb;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/cb;->b()V

    .line 683
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->x()V

    .line 684
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->q:Lcom/facebook/common/hardware/q;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->r:Lcom/facebook/common/hardware/t;

    invoke-virtual {v0, v1}, Lcom/facebook/common/hardware/q;->b(Lcom/facebook/common/hardware/t;)V

    .line 686
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    if-eqz v0, :cond_0

    .line 687
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 689
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->Q()Lcom/facebook/orca/compose/ComposeFragment;

    move-result-object v0

    .line 690
    invoke-virtual {v0, v2}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/emoji/ah;)V

    .line 691
    invoke-virtual {v0, v2}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/al;)V

    .line 692
    invoke-virtual {v0, v2}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/am;)V

    .line 695
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->V:Lcom/facebook/orca/chatheads/ek;

    if-eqz v0, :cond_1

    .line 696
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->V:Lcom/facebook/orca/chatheads/ek;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ek;->d()V

    .line 699
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->d:Landroid/support/v4/app/bb;

    if-eqz v0, :cond_2

    .line 700
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->d:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->q()V

    .line 703
    :cond_2
    invoke-super {p0}, Lcom/facebook/widget/d;->onDetachedFromWindow()V

    .line 704
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 629
    invoke-super/range {p0 .. p5}, Lcom/facebook/widget/d;->onLayout(ZIIII)V

    .line 631
    const/4 v1, 0x0

    .line 635
    iget v2, p0, Lcom/facebook/orca/chatheads/dh;->O:I

    if-eq v2, p5, :cond_2

    iget v2, p0, Lcom/facebook/orca/chatheads/dh;->P:I

    if-eq v2, p4, :cond_2

    .line 636
    iput p5, p0, Lcom/facebook/orca/chatheads/dh;->O:I

    .line 637
    iput p4, p0, Lcom/facebook/orca/chatheads/dh;->P:I

    .line 649
    :goto_0
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/dh;->o()V

    .line 651
    if-nez v0, :cond_0

    if-eqz p1, :cond_1

    .line 654
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/facebook/orca/chatheads/do;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/do;-><init>(Lcom/facebook/orca/chatheads/dh;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 664
    :cond_1
    return-void

    .line 639
    :cond_2
    iget v2, p0, Lcom/facebook/orca/chatheads/dh;->O:I

    if-le p5, v2, :cond_3

    .line 640
    iput p5, p0, Lcom/facebook/orca/chatheads/dh;->O:I

    goto :goto_0

    .line 642
    :cond_3
    iget v2, p0, Lcom/facebook/orca/chatheads/dh;->P:I

    if-le p4, v2, :cond_4

    .line 643
    iput p4, p0, Lcom/facebook/orca/chatheads/dh;->P:I

    goto :goto_0

    :cond_4
    move v0, v1

    goto :goto_0
.end method

.method public setEmojiKeyboardWindowControl(Lcom/facebook/orca/emoji/ah;)V
    .locals 2

    .prologue
    .line 320
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dh;->z:Lcom/facebook/orca/emoji/ah;

    .line 322
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    if-eqz v0, :cond_0

    .line 323
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->y:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->Q()Lcom/facebook/orca/compose/ComposeFragment;

    move-result-object v0

    .line 324
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dh;->z:Lcom/facebook/orca/emoji/ah;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/emoji/ah;)V

    .line 326
    :cond_0
    return-void
.end method

.method public setEmojiKeyboardWindowControlListener(Lcom/facebook/orca/emoji/ai;)V
    .locals 0

    .prologue
    .line 330
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dh;->ag:Lcom/facebook/orca/emoji/ai;

    .line 331
    return-void
.end method

.method public setListener(Lcom/facebook/orca/chatheads/dt;)V
    .locals 0

    .prologue
    .line 747
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dh;->af:Lcom/facebook/orca/chatheads/dt;

    .line 748
    return-void
.end method

.method public setNubTarget(Landroid/graphics/PointF;)V
    .locals 4

    .prologue
    .line 543
    iget v0, p0, Lcom/facebook/orca/chatheads/dh;->L:I

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    iget v1, p1, Landroid/graphics/PointF;->x:F

    mul-float/2addr v0, v1

    .line 544
    iget v1, p0, Lcom/facebook/orca/chatheads/dh;->M:I

    int-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    iget v2, p1, Landroid/graphics/PointF;->y:F

    mul-float/2addr v1, v2

    .line 545
    iget-object v2, p0, Lcom/facebook/orca/chatheads/dh;->I:Lcom/facebook/widget/s;

    iget v3, p0, Lcom/facebook/orca/chatheads/dh;->L:I

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    sub-float/2addr v0, v3

    invoke-virtual {v2, v0}, Lcom/facebook/widget/s;->setTranslationX(F)V

    .line 546
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->I:Lcom/facebook/widget/s;

    iget v2, p0, Lcom/facebook/orca/chatheads/dh;->M:I

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/facebook/widget/s;->setTranslationY(F)V

    .line 548
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->H:Lcom/facebook/widget/s;

    iget v1, p1, Landroid/graphics/PointF;->x:F

    iget v2, p0, Lcom/facebook/orca/chatheads/dh;->J:I

    int-to-float v2, v2

    add-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/facebook/widget/s;->setPivotX(F)V

    .line 549
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dh;->H:Lcom/facebook/widget/s;

    iget v1, p1, Landroid/graphics/PointF;->y:F

    iget v2, p0, Lcom/facebook/orca/chatheads/dh;->K:I

    int-to-float v2, v2

    add-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/facebook/widget/s;->setPivotY(F)V

    .line 550
    return-void
.end method

.method public setThread(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 1

    .prologue
    .line 507
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Z)V

    .line 508
    return-void
.end method
