.class public Lcom/facebook/orca/threadview/ThreadViewMessageFragment;
.super Lcom/facebook/base/fragment/FbFragment;
.source "ThreadViewMessageFragment.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/debug/log/l;


# instance fields
.field private Z:Landroid/os/Handler;

.field private aA:Landroid/view/View;

.field private aB:Lcom/facebook/orca/compose/av;

.field private aC:Lcom/facebook/orca/threadview/ar;

.field private aD:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

.field private aE:Landroid/widget/AbsListView$OnScrollListener;

.field private aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

.field private aG:Lcom/facebook/orca/compose/ap;

.field private aH:Lcom/facebook/common/w/q;

.field private aI:Z

.field private aJ:Lcom/facebook/orca/p/b;

.field private aK:Lcom/facebook/l/x;

.field private aL:Lcom/facebook/orca/p/d;

.field private aM:Lcom/facebook/orca/threads/MessagesCollection;

.field private aN:Lcom/facebook/orca/threads/ThreadSummary;

.field private aO:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation
.end field

.field private aP:Ljava/lang/String;

.field private aQ:Z

.field private aR:Z

.field private aS:Lcom/facebook/zero/ui/l;

.field private aT:Lcom/facebook/orca/dialog/MenuDialogFragment;

.field private aU:Lcom/facebook/orca/dialog/e;

.field private aV:Lcom/facebook/orca/photos/c/a;

.field private aW:Lcom/facebook/orca/threadview/a/c;

.field private aX:Lcom/facebook/messages/model/threads/f;

.field private aY:Landroid/graphics/drawable/Drawable;

.field private aZ:Landroid/graphics/drawable/Drawable;

.field private aa:Lcom/facebook/orca/attachments/a;

.field private ab:Lcom/facebook/orca/share/a;

.field private ac:Lcom/facebook/orca/common/ui/widgets/text/a;

.field private ad:Lcom/facebook/orca/f/p;

.field private ae:Lcom/facebook/analytics/av;

.field private af:Lcom/facebook/orca/d/m;

.field private ag:Lcom/facebook/orca/d/af;

.field private ah:Lcom/facebook/c/s;

.field private ai:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private aj:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private ak:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private al:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;"
        }
    .end annotation
.end field

.field private am:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private an:Lcom/facebook/common/e/h;

.field private ao:Landroid/view/ViewGroup;

.field private ap:Landroid/view/View;

.field private aq:Lcom/facebook/widget/listview/BetterListView;

.field private ar:Lcom/facebook/widget/listview/EmptyListViewItem;

.field private as:Landroid/view/ViewGroup;

.field private at:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

.field private au:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

.field private av:Landroid/widget/ImageView;

.field private aw:Landroid/widget/ImageView;

.field private ax:Lcom/facebook/orca/threadview/w;

.field private ay:Lcom/facebook/orca/threadview/ak;

.field private az:Lcom/facebook/orca/compose/ComposeFragment;

.field private c:Lcom/facebook/widget/animatablelistview/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/widget/animatablelistview/d",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroid/view/inputmethod/InputMethodManager;

.field private e:Lcom/facebook/orca/f/r;

.field private f:Landroid/text/ClipboardManager;

.field private g:Lcom/facebook/orca/threadview/k;

.field private h:Lcom/facebook/widget/listview/l;

.field private i:Lcom/facebook/orca/f/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 115
    const-class v0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    sput-object v0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a:Ljava/lang/Class;

    .line 117
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b:Lcom/facebook/debug/log/l;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 113
    invoke-direct {p0}, Lcom/facebook/base/fragment/FbFragment;-><init>()V

    .line 169
    sget-object v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 170
    sget-object v0, Lcom/facebook/orca/compose/ap;->SHRUNK:Lcom/facebook/orca/compose/ap;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aG:Lcom/facebook/orca/compose/ap;

    .line 175
    sget-object v0, Lcom/facebook/l/x;->a:Lcom/facebook/l/x;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aK:Lcom/facebook/l/x;

    return-void
.end method

.method private Y()V
    .locals 2

    .prologue
    .line 589
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aS:Lcom/facebook/zero/ui/l;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->p()Landroid/support/v4/app/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/zero/ui/l;->a(Landroid/support/v4/app/q;)V

    .line 591
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->p()Landroid/support/v4/app/q;

    move-result-object v0

    const-string v1, "message_menu_dialog"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/dialog/MenuDialogFragment;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aT:Lcom/facebook/orca/dialog/MenuDialogFragment;

    .line 593
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aT:Lcom/facebook/orca/dialog/MenuDialogFragment;

    if-eqz v0, :cond_0

    .line 594
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aT:Lcom/facebook/orca/dialog/MenuDialogFragment;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aU:Lcom/facebook/orca/dialog/e;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/dialog/MenuDialogFragment;->a(Lcom/facebook/orca/dialog/e;)V

    .line 596
    :cond_0
    return-void
.end method

.method private Z()Lcom/facebook/orca/threadview/ac;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 630
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/d;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, v1

    .line 639
    :cond_0
    :goto_0
    return-object v0

    .line 633
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/facebook/widget/animatablelistview/d;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ac;

    .line 634
    sget-object v2, Lcom/facebook/orca/threadview/s;->a:Lcom/facebook/orca/threadview/ac;

    if-eq v0, v2, :cond_0

    sget-object v2, Lcom/facebook/orca/threadview/s;->b:Lcom/facebook/orca/threadview/ac;

    if-eq v0, v2, :cond_0

    sget-object v2, Lcom/facebook/orca/threadview/s;->c:Lcom/facebook/orca/threadview/ac;

    if-eq v0, v2, :cond_0

    move-object v0, v1

    .line 639
    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)Lcom/facebook/c/s;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ah:Lcom/facebook/c/s;

    return-object v0
.end method

.method public static a(Z)Lcom/facebook/orca/threadview/ThreadViewMessageFragment;
    .locals 2

    .prologue
    .line 205
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 206
    const-string v1, "chatStyle"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 208
    new-instance v1, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-direct {v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;-><init>()V

    .line 210
    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->g(Landroid/os/Bundle;)V

    .line 211
    return-object v1
.end method

.method private a(Lcom/facebook/orca/threads/MessagesCollection;Ljava/util/List;Lcom/facebook/orca/threads/ThreadSummary;Z)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/MessagesCollection;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            "Z)",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;"
        }
    .end annotation

    .prologue
    .line 879
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v8

    .line 880
    const/4 v1, 0x0

    .line 881
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ai:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 882
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 883
    new-instance v2, Lcom/facebook/orca/threadview/ad;

    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aX:Lcom/facebook/messages/model/threads/f;

    iget-object v5, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aa:Lcom/facebook/orca/attachments/a;

    invoke-virtual {v5, v0}, Lcom/facebook/orca/attachments/a;->b(Lcom/facebook/messages/model/threads/Message;)Lcom/google/common/a/es;

    move-result-object v5

    iget-object v6, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aa:Lcom/facebook/orca/attachments/a;

    invoke-virtual {v6, v0}, Lcom/facebook/orca/attachments/a;->e(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/attachments/AudioAttachmentData;

    move-result-object v6

    invoke-direct {v2, v0, v4, v5, v6}, Lcom/facebook/orca/threadview/ad;-><init>(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/f;Ljava/util/List;Lcom/facebook/orca/attachments/AudioAttachmentData;)V

    .line 888
    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 890
    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ad;Lcom/facebook/messages/model/threads/Message;)V

    move-object v1, v2

    .line 892
    goto :goto_0

    .line 894
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->g:Lcom/facebook/orca/threadview/k;

    invoke-virtual {v0, p1, p3}, Lcom/facebook/orca/threadview/k;->a(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/ThreadSummary;)Ljava/util/Map;

    move-result-object v9

    .line 898
    const/4 v0, 0x0

    .line 900
    invoke-virtual {p1}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move v2, v0

    move-object v7, v1

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/messages/model/threads/Message;

    .line 901
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/i;

    .line 902
    const/4 v3, 0x0

    .line 903
    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aX:Lcom/facebook/messages/model/threads/f;

    invoke-virtual {v4, v1}, Lcom/facebook/messages/model/threads/f;->b(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v4

    .line 904
    if-eqz v0, :cond_5

    if-eqz v2, :cond_1

    if-nez v4, :cond_5

    .line 906
    :cond_1
    sget-object v5, Lcom/facebook/orca/threadview/cy;->a:[I

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/i;->d()Lcom/facebook/orca/threadview/j;

    move-result-object v6

    invoke-virtual {v6}, Lcom/facebook/orca/threadview/j;->ordinal()I

    move-result v6

    aget v5, v5, v6

    packed-switch v5, :pswitch_data_0

    :goto_2
    move-object v5, v3

    .line 948
    :goto_3
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/i;->d()Lcom/facebook/orca/threadview/j;

    move-result-object v0

    sget-object v3, Lcom/facebook/orca/threadview/j;->SENDER:Lcom/facebook/orca/threadview/j;

    if-ne v0, v3, :cond_3

    :cond_2
    if-eqz v4, :cond_a

    .line 950
    :cond_3
    const/4 v6, 0x1

    .line 953
    :goto_4
    new-instance v0, Lcom/facebook/orca/threadview/ad;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aX:Lcom/facebook/messages/model/threads/f;

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aa:Lcom/facebook/orca/attachments/a;

    invoke-virtual {v3, v1}, Lcom/facebook/orca/attachments/a;->b(Lcom/facebook/messages/model/threads/Message;)Lcom/google/common/a/es;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aa:Lcom/facebook/orca/attachments/a;

    invoke-virtual {v4, v1}, Lcom/facebook/orca/attachments/a;->e(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/attachments/AudioAttachmentData;

    move-result-object v4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/threadview/ad;-><init>(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/f;Ljava/util/List;Lcom/facebook/orca/attachments/AudioAttachmentData;Lcom/facebook/orca/threadview/ae;)V

    .line 959
    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 961
    invoke-direct {p0, v7, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ad;Lcom/facebook/messages/model/threads/Message;)V

    move v2, v6

    move-object v7, v0

    .line 963
    goto :goto_1

    .line 908
    :pswitch_0
    invoke-virtual {p3}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 909
    invoke-virtual {v0}, Lcom/facebook/orca/threadview/i;->a()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/i;->e()J

    move-result-wide v5

    invoke-static {v3, v1, v5, v6}, Lcom/facebook/orca/threadview/ae;->a(Ljava/util/List;Lcom/facebook/messages/model/threads/Message;J)Lcom/facebook/orca/threadview/ae;

    move-result-object v3

    goto :goto_2

    .line 914
    :cond_4
    invoke-virtual {v0}, Lcom/facebook/orca/threadview/i;->a()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p3}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/common/a/es;->size()I

    move-result v5

    invoke-static {v3, v1, v4, v5}, Lcom/facebook/orca/threadview/ae;->a(Ljava/util/List;Lcom/facebook/messages/model/threads/Message;ZI)Lcom/facebook/orca/threadview/ae;

    move-result-object v3

    goto :goto_2

    .line 922
    :pswitch_1
    invoke-virtual {v0}, Lcom/facebook/orca/threadview/i;->b()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v3

    invoke-static {v3, v1}, Lcom/facebook/orca/threadview/ae;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/threadview/ae;

    move-result-object v3

    goto :goto_2

    .line 927
    :pswitch_2
    invoke-virtual {v0}, Lcom/facebook/orca/threadview/i;->c()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v3

    invoke-static {v3, v1}, Lcom/facebook/orca/threadview/ae;->b(Lcom/facebook/messages/model/threads/ParticipantInfo;Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/threadview/ae;

    move-result-object v3

    goto :goto_2

    .line 932
    :cond_5
    if-eqz v4, :cond_b

    if-nez v2, :cond_b

    .line 933
    iget-object v5, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aX:Lcom/facebook/messages/model/threads/f;

    invoke-virtual {v5, v1}, Lcom/facebook/messages/model/threads/f;->a(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v5

    if-eqz v5, :cond_6

    iget-object v5, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aW:Lcom/facebook/orca/threadview/a/c;

    iget-boolean v5, v5, Lcom/facebook/orca/threadview/a/c;->a:Z

    if-eqz v5, :cond_6

    .line 935
    invoke-static {v1}, Lcom/facebook/orca/threadview/ae;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/threadview/ae;

    move-result-object v3

    move-object v5, v3

    goto :goto_3

    .line 936
    :cond_6
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->u()I

    move-result v5

    const/16 v6, 0x385

    if-ne v5, v6, :cond_7

    iget-object v5, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aW:Lcom/facebook/orca/threadview/a/c;

    iget-boolean v5, v5, Lcom/facebook/orca/threadview/a/c;->c:Z

    if-eqz v5, :cond_7

    .line 939
    invoke-static {v1}, Lcom/facebook/orca/threadview/ae;->c(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/threadview/ae;

    move-result-object v3

    move-object v5, v3

    goto/16 :goto_3

    .line 940
    :cond_7
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->u()I

    move-result v5

    if-nez v5, :cond_b

    iget-object v5, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aW:Lcom/facebook/orca/threadview/a/c;

    iget-boolean v5, v5, Lcom/facebook/orca/threadview/a/c;->b:Z

    if-eqz v5, :cond_b

    .line 943
    invoke-static {v1}, Lcom/facebook/orca/threadview/ae;->b(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/threadview/ae;

    move-result-object v3

    move-object v5, v3

    goto/16 :goto_3

    .line 966
    :cond_8
    if-eqz p4, :cond_9

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aK:Lcom/facebook/l/x;

    invoke-virtual {v0}, Lcom/facebook/l/x;->c()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 969
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aJ:Lcom/facebook/orca/p/b;

    invoke-virtual {v0}, Lcom/facebook/orca/p/b;->b()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 970
    new-instance v0, Lcom/facebook/orca/threadview/ai;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aJ:Lcom/facebook/orca/p/b;

    invoke-virtual {v1}, Lcom/facebook/orca/p/b;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/orca/threadview/ai;-><init>(Lcom/facebook/messages/model/threads/ParticipantInfo;)V

    .line 972
    const/4 v1, 0x0

    invoke-interface {v8, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 975
    :cond_9
    return-object v8

    :cond_a
    move v6, v2

    goto/16 :goto_4

    :cond_b
    move-object v5, v3

    goto/16 :goto_3

    .line 906
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a(III)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1247
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aI:Z

    if-eqz v0, :cond_1

    .line 1265
    :cond_0
    :goto_0
    return-void

    .line 1250
    :cond_1
    if-nez p1, :cond_3

    if-lez p2, :cond_3

    if-lez p3, :cond_3

    .line 1251
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/animatablelistview/d;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ac;

    .line 1252
    sget-object v1, Lcom/facebook/orca/threadview/s;->b:Lcom/facebook/orca/threadview/ac;

    if-eq v0, v1, :cond_2

    sget-object v1, Lcom/facebook/orca/threadview/s;->a:Lcom/facebook/orca/threadview/ac;

    if-ne v0, v1, :cond_3

    .line 1257
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aC:Lcom/facebook/orca/threadview/ar;

    if-eqz v0, :cond_0

    .line 1260
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aC:Lcom/facebook/orca/threadview/ar;

    invoke-interface {v0, v2}, Lcom/facebook/orca/threadview/ar;->a(Z)V

    .line 1264
    :cond_3
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->af()V

    goto :goto_0
.end method

.method private a(Landroid/view/View;Landroid/view/View;)V
    .locals 3

    .prologue
    .line 610
    const/4 v1, 0x0

    .line 611
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 612
    :goto_0
    if-eqz v0, :cond_3

    .line 613
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aA:Landroid/view/View;

    if-ne v0, v2, :cond_2

    .line 614
    const/4 v0, 0x1

    .line 620
    :goto_1
    if-eqz v0, :cond_0

    .line 621
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->d()V

    .line 623
    :cond_0
    return-void

    .line 611
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 617
    :cond_2
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1
.end method

.method private a(Lcom/facebook/l/x;)V
    .locals 1

    .prologue
    .line 1315
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aK:Lcom/facebook/l/x;

    if-ne v0, p1, :cond_0

    .line 1319
    :goto_0
    return-void

    .line 1318
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b(Lcom/facebook/l/x;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/messages/model/share/Share;)V
    .locals 4

    .prologue
    .line 1084
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ab:Lcom/facebook/orca/share/a;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/share/a;->a(Lcom/facebook/messages/model/share/Share;)Lcom/facebook/messages/model/share/ShareMedia;

    move-result-object v1

    .line 1085
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/facebook/messages/model/share/ShareMedia;->c()Ljava/lang/String;

    move-result-object v0

    .line 1086
    :goto_0
    const-string v2, "link"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1087
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-virtual {v1}, Lcom/facebook/messages/model/share/ShareMedia;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1088
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b(Landroid/content/Intent;)V

    .line 1110
    :cond_0
    :goto_1
    return-void

    .line 1085
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 1089
    :cond_2
    const-string v2, "photo"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1090
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aa:Lcom/facebook/orca/attachments/a;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/attachments/a;->a(Lcom/facebook/messages/model/share/ShareMedia;)Lcom/facebook/orca/attachments/ImageAttachmentData;

    move-result-object v0

    .line 1091
    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->n()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/facebook/orca/photos/view/PhotoViewActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1092
    const-string v2, "imageData"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1093
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ah:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    goto :goto_1

    .line 1094
    :cond_3
    const-string v2, "video"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1095
    invoke-virtual {v1}, Lcom/facebook/messages/model/share/ShareMedia;->f()Lcom/facebook/messages/model/share/ShareMediaVideo;

    move-result-object v0

    .line 1097
    invoke-virtual {v0}, Lcom/facebook/messages/model/share/ShareMediaVideo;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1099
    invoke-virtual {v0}, Lcom/facebook/messages/model/share/ShareMediaVideo;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://"

    const-string v2, "http://"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 1101
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 1102
    const-string v2, "android.intent.action.VIEW"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1103
    const-string v2, "video/*"

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 1104
    invoke-direct {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b(Landroid/content/Intent;)V

    goto :goto_1

    .line 1106
    :cond_4
    invoke-virtual {p1}, Lcom/facebook/messages/model/share/Share;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1107
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {p1}, Lcom/facebook/messages/model/share/Share;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1108
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b(Landroid/content/Intent;)V

    goto :goto_1
.end method

.method private a(Lcom/facebook/orca/compose/ap;)V
    .locals 1

    .prologue
    .line 691
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ap;)V

    .line 692
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aC:Lcom/facebook/orca/threadview/ar;

    invoke-interface {v0, p1}, Lcom/facebook/orca/threadview/ar;->a(Lcom/facebook/orca/compose/ap;)V

    .line 693
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ao:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->requestLayout()V

    .line 694
    return-void
.end method

.method private a(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 1

    .prologue
    .line 843
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aN:Lcom/facebook/orca/threads/ThreadSummary;

    .line 844
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aN:Lcom/facebook/orca/threads/ThreadSummary;

    .line 845
    if-nez v0, :cond_0

    .line 846
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aa()V

    .line 848
    :cond_0
    return-void
.end method

.method private a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Ljava/util/List;)V
    .locals 7
    .param p1    # Lcom/facebook/orca/threads/ThreadSummary;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/facebook/orca/threads/MessagesCollection;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            "Lcom/facebook/orca/threads/MessagesCollection;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 821
    .line 822
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/facebook/orca/threads/MessagesCollection;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 823
    const/4 v0, 0x0

    .line 824
    if-eqz p3, :cond_0

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 825
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 827
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/orca/threads/MessagesCollection;->c()Lcom/facebook/messages/model/threads/Message;

    move-result-object v2

    .line 828
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v3

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-lez v0, :cond_2

    .line 839
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->b(Z)V

    .line 840
    return-void

    .line 832
    :cond_2
    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    .line 833
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->al:Ljavax/inject/a;

    invoke-interface {v2}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;III)V
    .locals 0

    .prologue
    .line 113
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(III)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 113
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 113
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Lcom/facebook/l/x;)V
    .locals 0

    .prologue
    .line 113
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/l/x;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Lcom/facebook/messages/model/share/Share;)V
    .locals 0

    .prologue
    .line 113
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/messages/model/share/Share;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Lcom/facebook/orca/threadview/ac;)V
    .locals 0

    .prologue
    .line 113
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b(Lcom/facebook/orca/threadview/ac;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Z)V
    .locals 0

    .prologue
    .line 113
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b(Z)V

    return-void
.end method

.method private a(Lcom/facebook/orca/threadview/ac;)V
    .locals 4
    .param p1    # Lcom/facebook/orca/threadview/ac;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v3, 0x0

    .line 643
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->Z()Lcom/facebook/orca/threadview/ac;

    move-result-object v0

    .line 644
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v1}, Lcom/facebook/widget/animatablelistview/d;->a()Lcom/facebook/widget/animatablelistview/k;

    move-result-object v1

    .line 645
    sget-object v2, Lcom/facebook/orca/threadview/s;->a:Lcom/facebook/orca/threadview/ac;

    if-eq v0, v2, :cond_0

    sget-object v2, Lcom/facebook/orca/threadview/s;->b:Lcom/facebook/orca/threadview/ac;

    if-eq v0, v2, :cond_0

    sget-object v2, Lcom/facebook/orca/threadview/s;->c:Lcom/facebook/orca/threadview/ac;

    if-ne v0, v2, :cond_1

    .line 648
    :cond_0
    invoke-virtual {v1, v3}, Lcom/facebook/widget/animatablelistview/k;->a(I)V

    .line 650
    :cond_1
    if-eqz p1, :cond_2

    .line 651
    invoke-virtual {v1, v3, p1}, Lcom/facebook/widget/animatablelistview/k;->a(ILjava/lang/Object;)V

    .line 653
    :cond_2
    invoke-virtual {v1}, Lcom/facebook/widget/animatablelistview/k;->b()V

    .line 654
    return-void
.end method

.method private a(Lcom/facebook/orca/threadview/ad;)V
    .locals 4

    .prologue
    .line 1127
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 1128
    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->n()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/facebook/orca/messageview/MessageViewActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1129
    const-string v2, "android.intent.action.VIEW"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1130
    const-string v2, "thread_id"

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v3}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1131
    const-string v2, "message"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1132
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ad;->d()Lcom/facebook/orca/threadview/ae;

    move-result-object v0

    .line 1135
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ae;->b()Lcom/facebook/orca/threadview/af;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/threadview/af;->GROUP_READ:Lcom/facebook/orca/threadview/af;

    if-ne v2, v3, :cond_0

    .line 1136
    const-string v2, "readers"

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ae;->c()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 1140
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aN:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1141
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/d;->c()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 1142
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->f(I)Ljava/util/ArrayList;

    move-result-object v0

    .line 1144
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 1145
    const-string v2, "other_readers"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 1149
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ah:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 1150
    return-void
.end method

.method private a(Lcom/facebook/orca/threadview/ad;Lcom/facebook/messages/model/threads/Message;)V
    .locals 3

    .prologue
    .line 981
    if-eqz p1, :cond_0

    .line 983
    const-wide/32 v0, 0x36ee80

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2, p2}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(JLcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/Message;)Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/facebook/orca/threadview/ad;->a(Z)V

    .line 988
    :cond_0
    return-void
.end method

.method private a(Lcom/facebook/widget/listview/n;)V
    .locals 4

    .prologue
    .line 1334
    invoke-virtual {p1}, Lcom/facebook/widget/listview/n;->a()Lcom/facebook/widget/listview/o;

    move-result-object v0

    sget-object v1, Lcom/facebook/widget/listview/o;->BOTTOM:Lcom/facebook/widget/listview/o;

    if-ne v0, v1, :cond_1

    .line 1335
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ad()V

    .line 1349
    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->af()V

    .line 1350
    return-void

    .line 1337
    :cond_1
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/d;->getCount()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 1338
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/animatablelistview/d;->getItemId(I)J

    move-result-wide v2

    .line 1339
    invoke-virtual {p1}, Lcom/facebook/widget/listview/n;->b()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 1340
    if-eqz v0, :cond_2

    .line 1341
    if-lez v1, :cond_0

    .line 1342
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v2, v1, v0}, Lcom/facebook/widget/listview/BetterListView;->setSelectionFromTop(II)V

    goto :goto_0

    .line 1337
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1
.end method

.method private a(JLcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/Message;)Z
    .locals 4

    .prologue
    .line 994
    invoke-virtual {p3}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v0

    invoke-virtual {p4}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v2

    sub-long/2addr v0, v2

    cmp-long v0, v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/dialog/MenuDialogItem;Ljava/lang/Integer;)Z
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 1195
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v3}, Lcom/facebook/widget/animatablelistview/d;->getCount()I

    move-result v3

    if-lt v0, v3, :cond_1

    .line 1196
    :cond_0
    sget-object v0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b:Lcom/facebook/debug/log/l;

    sget-object v2, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onMenuItemSelected with invalid index: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;)V

    move v0, v1

    .line 1243
    :goto_0
    return v0

    .line 1200
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/facebook/widget/animatablelistview/d;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    .line 1201
    invoke-virtual {p1}, Lcom/facebook/orca/dialog/MenuDialogItem;->a()I

    move-result v3

    .line 1203
    instance-of v4, v0, Lcom/facebook/orca/threadview/ad;

    if-eqz v4, :cond_5

    .line 1204
    check-cast v0, Lcom/facebook/orca/threadview/ad;

    .line 1205
    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v4

    .line 1207
    if-nez v3, :cond_2

    .line 1208
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ae:Lcom/facebook/analytics/av;

    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v3, "click"

    invoke-direct {v2, v3}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v3, "context_menu_item"

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "MENU_ITEM_COPY"

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 1211
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->f:Landroid/text/ClipboardManager;

    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/Message;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    move v0, v1

    .line 1212
    goto :goto_0

    .line 1213
    :cond_2
    if-ne v3, v1, :cond_3

    .line 1214
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ae:Lcom/facebook/analytics/av;

    new-instance v3, Lcom/facebook/analytics/cb;

    const-string v5, "click"

    invoke-direct {v3, v5}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v5, "context_menu_item"

    invoke-virtual {v3, v5}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v3

    const-string v5, "MENU_ITEM_DELETE"

    invoke-virtual {v3, v5}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v3

    invoke-interface {v0, v3}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 1217
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1218
    const-string v3, "thread_id"

    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v3, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1219
    const-string v3, "message_ids"

    new-array v5, v1, [Ljava/lang/String;

    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v5, v2

    invoke-static {v5}, Lcom/google/common/a/hq;->a([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1221
    new-instance v2, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;

    invoke-direct {v2}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;-><init>()V

    .line 1223
    invoke-virtual {v2, v0}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->g(Landroid/os/Bundle;)V

    .line 1224
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->p()Landroid/support/v4/app/q;

    move-result-object v0

    const-string v3, "delete_message_dialog_tag"

    invoke-virtual {v2, v0, v3}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->a(Landroid/support/v4/app/q;Ljava/lang/String;)V

    move v0, v1

    .line 1225
    goto/16 :goto_0

    .line 1226
    :cond_3
    const/4 v4, 0x2

    if-ne v3, v4, :cond_4

    .line 1227
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ae:Lcom/facebook/analytics/av;

    new-instance v3, Lcom/facebook/analytics/cb;

    const-string v4, "click"

    invoke-direct {v3, v4}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v4, "context_menu_item"

    invoke-virtual {v3, v4}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v3

    const-string v4, "MENU_ITEM_DETAILS"

    invoke-virtual {v3, v4}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 1230
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ad;)V

    move v0, v1

    .line 1231
    goto/16 :goto_0

    .line 1232
    :cond_4
    const/4 v0, 0x3

    if-ne v3, v0, :cond_5

    .line 1233
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ae:Lcom/facebook/analytics/av;

    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v3, "click"

    invoke-direct {v2, v3}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v3, "context_menu_item"

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "MENU_ITEM_SAVE_IMAGE"

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 1237
    invoke-virtual {p1}, Lcom/facebook/orca/dialog/MenuDialogItem;->d()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/attachments/ImageAttachmentData;

    .line 1238
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aV:Lcom/facebook/orca/photos/c/a;

    invoke-virtual {v0}, Lcom/facebook/orca/attachments/ImageAttachmentData;->b()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/orca/attachments/ImageAttachmentData;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/facebook/orca/photos/c/a;->a(Landroid/net/Uri;Ljava/lang/String;)V

    move v0, v1

    .line 1240
    goto/16 :goto_0

    :cond_5
    move v0, v2

    .line 1243
    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Lcom/facebook/orca/dialog/MenuDialogItem;Ljava/lang/Integer;)Z
    .locals 1

    .prologue
    .line 113
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/dialog/MenuDialogItem;Ljava/lang/Integer;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Lcom/facebook/orca/threadview/ac;Landroid/os/Parcelable;)Z
    .locals 1

    .prologue
    .line 113
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ac;Landroid/os/Parcelable;)Z

    move-result v0

    return v0
.end method

.method private a(Lcom/facebook/orca/threadview/ac;Landroid/os/Parcelable;)Z
    .locals 8
    .param p2    # Landroid/os/Parcelable;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v7, 0x0

    .line 1037
    instance-of v0, p1, Lcom/facebook/orca/threadview/ad;

    if-eqz v0, :cond_3

    move-object v0, p1

    .line 1038
    check-cast v0, Lcom/facebook/orca/threadview/ad;

    .line 1039
    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 1041
    new-instance v3, Lcom/facebook/orca/dialog/j;

    invoke-direct {v3}, Lcom/facebook/orca/dialog/j;-><init>()V

    .line 1042
    sget v4, Lcom/facebook/o;->message_context_menu_title:I

    invoke-virtual {v3, v4}, Lcom/facebook/orca/dialog/j;->a(I)Lcom/facebook/orca/dialog/j;

    .line 1044
    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v4}, Lcom/facebook/widget/animatablelistview/d;->c()Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/google/common/a/es;->indexOf(Ljava/lang/Object;)I

    move-result v4

    .line 1045
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 1046
    const-string v6, "message_position"

    invoke-virtual {v5, v6, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1047
    invoke-virtual {v3, v5}, Lcom/facebook/orca/dialog/j;->a(Landroid/os/Parcelable;)Lcom/facebook/orca/dialog/j;

    .line 1049
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->a()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1050
    new-instance v4, Lcom/facebook/orca/dialog/MenuDialogItem;

    sget v5, Lcom/facebook/o;->message_context_menu_copy_message:I

    invoke-direct {v4, v2, v5, v7}, Lcom/facebook/orca/dialog/MenuDialogItem;-><init>(IILandroid/os/Parcelable;)V

    invoke-virtual {v3, v4}, Lcom/facebook/orca/dialog/j;->a(Lcom/facebook/orca/dialog/MenuDialogItem;)Lcom/facebook/orca/dialog/j;

    .line 1054
    :cond_0
    new-instance v2, Lcom/facebook/orca/dialog/MenuDialogItem;

    sget v4, Lcom/facebook/o;->message_context_menu_delete_message:I

    invoke-direct {v2, v1, v4, v7}, Lcom/facebook/orca/dialog/MenuDialogItem;-><init>(IILandroid/os/Parcelable;)V

    invoke-virtual {v3, v2}, Lcom/facebook/orca/dialog/j;->a(Lcom/facebook/orca/dialog/MenuDialogItem;)Lcom/facebook/orca/dialog/j;

    .line 1057
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1058
    new-instance v0, Lcom/facebook/orca/dialog/MenuDialogItem;

    const/4 v2, 0x2

    sget v4, Lcom/facebook/o;->message_context_menu_message_details:I

    invoke-direct {v0, v2, v4, v7}, Lcom/facebook/orca/dialog/MenuDialogItem;-><init>(IILandroid/os/Parcelable;)V

    invoke-virtual {v3, v0}, Lcom/facebook/orca/dialog/j;->a(Lcom/facebook/orca/dialog/MenuDialogItem;)Lcom/facebook/orca/dialog/j;

    .line 1063
    :cond_1
    if-eqz p2, :cond_2

    instance-of v0, p2, Lcom/facebook/orca/attachments/ImageAttachmentData;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/facebook/orca/photos/c/a;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1066
    check-cast p2, Lcom/facebook/orca/attachments/ImageAttachmentData;

    .line 1068
    new-instance v0, Lcom/facebook/orca/dialog/MenuDialogItem;

    const/4 v2, 0x3

    sget v4, Lcom/facebook/o;->message_context_menu_save_image:I

    invoke-direct {v0, v2, v4, p2}, Lcom/facebook/orca/dialog/MenuDialogItem;-><init>(IILandroid/os/Parcelable;)V

    .line 1072
    invoke-virtual {v3, v0}, Lcom/facebook/orca/dialog/j;->a(Lcom/facebook/orca/dialog/MenuDialogItem;)Lcom/facebook/orca/dialog/j;

    .line 1075
    :cond_2
    new-instance v0, Lcom/facebook/orca/dialog/MenuDialogFragment;

    invoke-virtual {v3}, Lcom/facebook/orca/dialog/j;->e()Lcom/facebook/orca/dialog/MenuDialogParams;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/facebook/orca/dialog/MenuDialogFragment;-><init>(Lcom/facebook/orca/dialog/MenuDialogParams;)V

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aT:Lcom/facebook/orca/dialog/MenuDialogFragment;

    .line 1076
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aT:Lcom/facebook/orca/dialog/MenuDialogFragment;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aU:Lcom/facebook/orca/dialog/e;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/dialog/MenuDialogFragment;->a(Lcom/facebook/orca/dialog/e;)V

    .line 1077
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aT:Lcom/facebook/orca/dialog/MenuDialogFragment;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->p()Landroid/support/v4/app/q;

    move-result-object v2

    const-string v3, "message_menu_dialog"

    invoke-virtual {v0, v2, v3}, Lcom/facebook/orca/dialog/MenuDialogFragment;->a(Landroid/support/v4/app/q;Ljava/lang/String;)V

    move v0, v1

    .line 1080
    :goto_0
    return v0

    :cond_3
    move v0, v2

    goto :goto_0
.end method

.method private aa()V
    .locals 3

    .prologue
    .line 851
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 864
    :cond_0
    :goto_0
    return-void

    .line 854
    :cond_1
    const/4 v0, 0x0

    .line 855
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    .line 856
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ad:Lcom/facebook/orca/f/p;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/f/p;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 857
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ad:Lcom/facebook/orca/f/p;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/p;->b(Ljava/lang/String;)Lcom/facebook/orca/compose/MessageDraft;

    move-result-object v0

    .line 861
    :cond_2
    :goto_1
    if-eqz v0, :cond_0

    .line 862
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/MessageDraft;)V

    goto :goto_0

    .line 858
    :cond_3
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aN:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v1, :cond_2

    .line 859
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aN:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->z()Lcom/facebook/orca/compose/MessageDraft;

    move-result-object v0

    goto :goto_1
.end method

.method private ab()V
    .locals 3

    .prologue
    .line 867
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 872
    :goto_0
    return-void

    .line 870
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->c()Lcom/facebook/orca/compose/MessageDraft;

    move-result-object v0

    .line 871
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ad:Lcom/facebook/orca/f/p;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v2}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/facebook/orca/f/p;->a(Ljava/lang/String;Lcom/facebook/orca/compose/MessageDraft;)V

    goto :goto_0
.end method

.method private ac()V
    .locals 4

    .prologue
    .line 1268
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->Q()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->am:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1269
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->send_empty_message:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->b(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 1295
    :cond_0
    :goto_0
    return-void

    .line 1277
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-static {v0}, Lcom/facebook/orca/threadview/dm;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->P()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1280
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->send_attachments_too_large:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->b(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    goto :goto_0

    .line 1287
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->O()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 1288
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->e:Lcom/facebook/orca/f/r;

    const-string v2, "thread_view"

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aP:Ljava/lang/String;

    invoke-virtual {v1, v0, v2, v3}, Lcom/facebook/orca/f/r;->a(Lcom/facebook/messages/model/threads/Message;Ljava/lang/String;Ljava/lang/String;)V

    .line 1289
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ad()V

    .line 1290
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->R()V

    .line 1291
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->T()V

    .line 1292
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aB:Lcom/facebook/orca/compose/av;

    if-eqz v0, :cond_0

    .line 1293
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aB:Lcom/facebook/orca/compose/av;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/av;->a()V

    goto :goto_0
.end method

.method private ad()V
    .locals 4

    .prologue
    .line 1298
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/BetterListView;->getCount()I

    move-result v0

    .line 1299
    if-lez v0, :cond_0

    .line 1300
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v1}, Lcom/facebook/widget/listview/BetterListView;->getLastVisiblePosition()I

    move-result v1

    .line 1301
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v2}, Lcom/facebook/widget/listview/BetterListView;->getChildCount()I

    move-result v2

    .line 1302
    add-int/lit8 v3, v0, -0x1

    if-ge v1, v3, :cond_0

    .line 1305
    sub-int v2, v0, v2

    if-ge v1, v2, :cond_1

    .line 1306
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Lcom/facebook/widget/listview/BetterListView;->setSelection(I)V

    .line 1312
    :cond_0
    :goto_0
    return-void

    .line 1308
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Lcom/facebook/widget/listview/BetterListView;->smoothScrollToPosition(I)V

    goto :goto_0
.end method

.method private ae()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1389
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v1}, Lcom/facebook/widget/animatablelistview/d;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1398
    :cond_0
    :goto_0
    return v0

    .line 1393
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v1}, Lcom/facebook/widget/animatablelistview/d;->d()Lcom/google/common/a/es;

    move-result-object v1

    .line 1394
    invoke-virtual {v1}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 1397
    invoke-virtual {v1}, Lcom/google/common/a/es;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ac;

    .line 1398
    instance-of v0, v0, Lcom/facebook/orca/threadview/ai;

    goto :goto_0
.end method

.method private af()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 1433
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aR:Z

    if-nez v0, :cond_1

    .line 1443
    :cond_0
    :goto_0
    return-void

    .line 1437
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->W()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 1439
    :goto_1
    iget-boolean v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aQ:Z

    if-eq v2, v0, :cond_0

    .line 1440
    iput-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aQ:Z

    .line 1441
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aw:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    :goto_2
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :cond_2
    move v0, v1

    .line 1437
    goto :goto_1

    .line 1441
    :cond_3
    const/16 v1, 0x8

    goto :goto_2
.end method

.method private ag()V
    .locals 6

    .prologue
    .line 1446
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ar:Lcom/facebook/widget/listview/EmptyListViewItem;

    if-nez v0, :cond_0

    .line 1459
    :goto_0
    return-void

    .line 1449
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->e()Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/RecipientInfo;->b()Lcom/facebook/user/Name;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->e()Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/RecipientInfo;->b()Lcom/facebook/user/Name;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/Name;->getFirstName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1453
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ar:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/o;->thread_no_updates:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1456
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ar:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/o;->thread_no_messages_start_conversation:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v5}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->e()Lcom/facebook/user/RecipientInfo;

    move-result-object v5

    invoke-virtual {v5}, Lcom/facebook/user/RecipientInfo;->b()Lcom/facebook/user/Name;

    move-result-object v5

    invoke-virtual {v5}, Lcom/facebook/user/Name;->getFirstName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)Landroid/widget/AbsListView$OnScrollListener;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aE:Landroid/widget/AbsListView$OnScrollListener;

    return-object v0
.end method

.method private b(Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 1322
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    .line 1323
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "tel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 1325
    :goto_0
    if-nez v0, :cond_1

    .line 1326
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aS:Lcom/facebook/zero/ui/l;

    sget-object v1, Lcom/facebook/zero/a/c;->k:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->p()Landroid/support/v4/app/q;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lcom/facebook/zero/ui/l;->a(Lcom/facebook/prefs/shared/ae;Landroid/support/v4/app/q;Landroid/os/Parcelable;)V

    .line 1331
    :goto_1
    return-void

    .line 1323
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 1329
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ah:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->n()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    goto :goto_1
.end method

.method private b(Lcom/facebook/l/x;)V
    .locals 1

    .prologue
    .line 1353
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aK:Lcom/facebook/l/x;

    .line 1354
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b(Z)V

    .line 1355
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Lcom/facebook/orca/threadview/ac;)V
    .locals 0

    .prologue
    .line 113
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c(Lcom/facebook/orca/threadview/ac;)V

    return-void
.end method

.method private b(Lcom/facebook/orca/threadview/ac;)V
    .locals 4

    .prologue
    .line 1014
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aG:Lcom/facebook/orca/compose/ap;

    sget-object v1, Lcom/facebook/orca/compose/ap;->EXPANDED:Lcom/facebook/orca/compose/ap;

    if-ne v0, v1, :cond_1

    .line 1015
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->O()V

    .line 1033
    :cond_0
    :goto_0
    return-void

    .line 1018
    :cond_1
    instance-of v0, p1, Lcom/facebook/orca/threadview/ad;

    if-eqz v0, :cond_2

    .line 1019
    check-cast p1, Lcom/facebook/orca/threadview/ad;

    .line 1020
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 1021
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1022
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ae:Lcom/facebook/analytics/av;

    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v3, "click"

    invoke-direct {v2, v3}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v3, "message"

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "threadid"

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 1027
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ad;)V

    goto :goto_0

    .line 1029
    :cond_2
    sget-object v0, Lcom/facebook/orca/threadview/s;->b:Lcom/facebook/orca/threadview/ac;

    if-eq p1, v0, :cond_3

    sget-object v0, Lcom/facebook/orca/threadview/s;->a:Lcom/facebook/orca/threadview/ac;

    if-ne p1, v0, :cond_0

    .line 1031
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aC:Lcom/facebook/orca/threadview/ar;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/facebook/orca/threadview/ar;->a(Z)V

    goto :goto_0
.end method

.method private b(Z)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1358
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ae()Z

    move-result v3

    .line 1359
    if-nez v3, :cond_1

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aK:Lcom/facebook/l/x;

    invoke-virtual {v2}, Lcom/facebook/l/x;->c()Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v0

    .line 1360
    :goto_0
    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aK:Lcom/facebook/l/x;

    invoke-virtual {v3}, Lcom/facebook/l/x;->c()Z

    move-result v3

    if-nez v3, :cond_2

    .line 1362
    :goto_1
    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    .line 1363
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    new-instance v1, Lcom/facebook/orca/threadview/dg;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/dg;-><init>(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/widget/listview/BetterListView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1386
    :cond_0
    :goto_2
    return-void

    :cond_1
    move v2, v1

    .line 1359
    goto :goto_0

    :cond_2
    move v0, v1

    .line 1360
    goto :goto_1

    .line 1372
    :cond_3
    if-nez v2, :cond_4

    if-eqz v0, :cond_0

    .line 1373
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aM:Lcom/facebook/orca/threads/MessagesCollection;

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aO:Ljava/util/List;

    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aN:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-direct {p0, v0, v3, v4, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threads/MessagesCollection;Ljava/util/List;Lcom/facebook/orca/threads/ThreadSummary;Z)Ljava/util/List;

    move-result-object v0

    .line 1378
    new-instance v1, Lcom/facebook/orca/threadview/dh;

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->an:Lcom/facebook/common/e/h;

    invoke-direct {v1, v3, v4}, Lcom/facebook/orca/threadview/dh;-><init>(Lcom/facebook/widget/animatablelistview/d;Lcom/facebook/common/e/h;)V

    .line 1380
    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aJ:Lcom/facebook/orca/p/b;

    invoke-virtual {v3}, Lcom/facebook/orca/p/b;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v3

    invoke-virtual {v1, v2, v0, v3}, Lcom/facebook/orca/threadview/dh;->a(ZLjava/util/List;Lcom/facebook/messages/model/threads/ParticipantInfo;)V

    goto :goto_2
.end method

.method private c(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 599
    const-string v0, "composeMode"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/ap;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aG:Lcom/facebook/orca/compose/ap;

    .line 600
    const-string v0, "canReplyTo"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/w/q;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aH:Lcom/facebook/common/w/q;

    .line 601
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aG:Lcom/facebook/orca/compose/ap;

    sget-object v1, Lcom/facebook/orca/compose/ap;->SHRUNK:Lcom/facebook/orca/compose/ap;

    if-eq v0, v1, :cond_0

    .line 602
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->d()V

    .line 604
    :cond_0
    const-string v0, "trigger"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 605
    const-string v0, "trigger"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Ljava/lang/String;)V

    .line 607
    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)V
    .locals 0

    .prologue
    .line 113
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ac()V

    return-void
.end method

.method private c(Lcom/facebook/orca/threadview/ac;)V
    .locals 3

    .prologue
    .line 1113
    instance-of v0, p1, Lcom/facebook/orca/threadview/ad;

    if-eqz v0, :cond_0

    .line 1114
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->p()Landroid/support/v4/app/q;

    move-result-object v0

    const-string v1, "resend_dialog"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1124
    :cond_0
    :goto_0
    return-void

    .line 1118
    :cond_1
    check-cast p1, Lcom/facebook/orca/threadview/ad;

    .line 1119
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 1120
    invoke-static {v0}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/mutators/ResendMessageDialogFragment;

    move-result-object v0

    .line 1122
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->p()Landroid/support/v4/app/q;

    move-result-object v1

    const-string v2, "resend_dialog"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->a(Landroid/support/v4/app/q;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private f(I)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1162
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v3

    .line 1163
    add-int/lit8 v0, p1, 0x1

    move v2, v0

    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/d;->getCount()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 1164
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/animatablelistview/d;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    .line 1165
    instance-of v1, v0, Lcom/facebook/orca/threadview/ad;

    if-eqz v1, :cond_2

    .line 1166
    check-cast v0, Lcom/facebook/orca/threadview/ad;

    .line 1167
    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ad;->d()Lcom/facebook/orca/threadview/ae;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ad;->d()Lcom/facebook/orca/threadview/ae;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/ae;->b()Lcom/facebook/orca/threadview/af;

    move-result-object v1

    sget-object v4, Lcom/facebook/orca/threadview/af;->GROUP_READ:Lcom/facebook/orca/threadview/af;

    if-ne v1, v4, :cond_1

    .line 1169
    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ad;->d()Lcom/facebook/orca/threadview/ae;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/ae;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threadview/RowReceiptParticipant;

    .line 1170
    invoke-virtual {v1}, Lcom/facebook/orca/threadview/RowReceiptParticipant;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v5

    invoke-virtual {v5}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v5

    .line 1171
    invoke-interface {v3, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 1172
    invoke-virtual {v1}, Lcom/facebook/orca/threadview/RowReceiptParticipant;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    invoke-interface {v3, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 1176
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->u()I

    move-result v1

    if-nez v1, :cond_2

    .line 1177
    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v1

    .line 1178
    invoke-interface {v3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->i:Lcom/facebook/orca/f/k;

    invoke-virtual {v4}, Lcom/facebook/orca/f/k;->b()Lcom/facebook/user/UserKey;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 1180
    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1163
    :cond_2
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_0

    .line 1185
    :cond_3
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public A()V
    .locals 2

    .prologue
    .line 471
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->A()V

    .line 472
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->z()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aD:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 473
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ax:Lcom/facebook/orca/threadview/w;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/w;->a()V

    .line 474
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ay:Lcom/facebook/orca/threadview/ak;

    if-eqz v0, :cond_0

    .line 475
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ay:Lcom/facebook/orca/threadview/ak;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ak;->a()V

    .line 477
    :cond_0
    return-void
.end method

.method public B()V
    .locals 2

    .prologue
    .line 481
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->B()V

    .line 483
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->z()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aD:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 484
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ab()V

    .line 485
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->Z:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 486
    return-void
.end method

.method public C()V
    .locals 1

    .prologue
    .line 452
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->C()V

    .line 453
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aC:Lcom/facebook/orca/threadview/ar;

    .line 454
    return-void
.end method

.method public O()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 669
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aH:Lcom/facebook/common/w/q;

    sget-object v1, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aG:Lcom/facebook/orca/compose/ap;

    sget-object v1, Lcom/facebook/orca/compose/ap;->SHRUNK:Lcom/facebook/orca/compose/ap;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aA:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1

    .line 680
    :cond_0
    :goto_0
    return-void

    .line 673
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aA:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 674
    sget-object v0, Lcom/facebook/orca/compose/ap;->SHRUNK:Lcom/facebook/orca/compose/ap;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/compose/ap;)V

    .line 675
    sget-object v0, Lcom/facebook/orca/compose/ap;->SHRUNK:Lcom/facebook/orca/compose/ap;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aG:Lcom/facebook/orca/compose/ap;

    .line 676
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ap:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 677
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->d:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ap:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 678
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aY:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 679
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->as:Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_0
.end method

.method P()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 683
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aA:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 684
    sget-object v0, Lcom/facebook/orca/compose/ap;->SHRUNK:Lcom/facebook/orca/compose/ap;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/compose/ap;)V

    .line 685
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ap:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 686
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->d:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ap:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 687
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->as:Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 688
    return-void
.end method

.method public Q()Lcom/facebook/orca/compose/ComposeFragment;
    .locals 1

    .prologue
    .line 697
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    return-object v0
.end method

.method public R()I
    .locals 4

    .prologue
    .line 701
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 702
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->z()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewParent;

    .line 703
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aA:Landroid/view/View;

    const/4 v3, 0x0

    invoke-interface {v0, v2, v1, v3}, Landroid/view/ViewParent;->getChildVisibleRect(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    .line 704
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aA:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    .line 705
    return v0
.end method

.method public T()V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 719
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v1}, Lcom/facebook/widget/listview/BetterListView;->getFirstVisiblePosition()I

    move-result v1

    .line 720
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v2, v0}, Lcom/facebook/widget/listview/BetterListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 721
    if-nez v2, :cond_0

    .line 722
    :goto_0
    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v2, v1, v0}, Lcom/facebook/widget/listview/BetterListView;->setSelectionFromTop(II)V

    .line 723
    return-void

    .line 721
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v0

    goto :goto_0
.end method

.method public U()V
    .locals 1

    .prologue
    .line 1009
    sget-object v0, Lcom/facebook/orca/threadview/s;->b:Lcom/facebook/orca/threadview/ac;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ac;)V

    .line 1010
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aI:Z

    .line 1011
    return-void
.end method

.method public V()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1412
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    if-eqz v0, :cond_0

    .line 1413
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/d;->b()V

    .line 1415
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    if-eqz v0, :cond_1

    .line 1416
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->U()V

    .line 1418
    :cond_1
    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aN:Lcom/facebook/orca/threads/ThreadSummary;

    .line 1419
    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aM:Lcom/facebook/orca/threads/MessagesCollection;

    .line 1420
    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aO:Ljava/util/List;

    .line 1421
    sget-object v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 1422
    sget-object v0, Lcom/facebook/l/x;->a:Lcom/facebook/l/x;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aK:Lcom/facebook/l/x;

    .line 1423
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aJ:Lcom/facebook/orca/p/b;

    if-eqz v0, :cond_2

    .line 1424
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aJ:Lcom/facebook/orca/p/b;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/p/b;->a(Lcom/facebook/orca/threadview/v;)V

    .line 1426
    :cond_2
    return-void
.end method

.method public W()Z
    .locals 1

    .prologue
    .line 1429
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0}, Lcom/facebook/widget/listview/BetterListView;->b()Z

    move-result v0

    return v0
.end method

.method public X()V
    .locals 1

    .prologue
    .line 1462
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->Y()V

    .line 1463
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 218
    sget v0, Lcom/facebook/k;->orca_thread_view_messages_tab:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 2

    .prologue
    .line 513
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b()V

    .line 514
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aJ:Lcom/facebook/orca/p/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/p/b;->a(Z)V

    .line 515
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->V()V

    .line 516
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ab()V

    .line 519
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aG:Lcom/facebook/orca/compose/ap;

    sget-object v1, Lcom/facebook/orca/compose/ap;->EXPANDED:Lcom/facebook/orca/compose/ap;

    if-ne v0, v1, :cond_0

    .line 520
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->O()V

    .line 522
    :cond_0
    return-void
.end method

.method public a(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 0

    .prologue
    .line 709
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aE:Landroid/widget/AbsListView$OnScrollListener;

    .line 710
    return-void
.end method

.method public a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 1

    .prologue
    .line 549
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Z)V

    .line 550
    return-void
.end method

.method public a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Z)V
    .locals 2

    .prologue
    .line 560
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-static {p1, v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 575
    :goto_0
    return-void

    .line 563
    :cond_0
    if-eqz p2, :cond_1

    .line 564
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->V()V

    .line 566
    :cond_1
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    .line 567
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ax:Lcom/facebook/orca/threadview/w;

    if-eqz v0, :cond_2

    .line 568
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ax:Lcom/facebook/orca/threadview/w;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/w;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 570
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    if-eqz v0, :cond_3

    .line 571
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 574
    :cond_3
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ag()V

    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/compose/av;)V
    .locals 1

    .prologue
    .line 578
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aB:Lcom/facebook/orca/compose/av;

    .line 579
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    if-eqz v0, :cond_0

    .line 580
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/av;)V

    .line 582
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/orca/threadview/ar;)V
    .locals 0

    .prologue
    .line 585
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aC:Lcom/facebook/orca/threadview/ar;

    .line 586
    return-void
.end method

.method public a(Lcom/facebook/orca/threadview/cp;)V
    .locals 11

    .prologue
    const/16 v6, 0x8

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 730
    iget-object v0, p1, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aN:Lcom/facebook/orca/threads/ThreadSummary;

    if-ne v0, v1, :cond_1

    iget-object v0, p1, Lcom/facebook/orca/threadview/cp;->b:Lcom/facebook/orca/threads/MessagesCollection;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aM:Lcom/facebook/orca/threads/MessagesCollection;

    if-ne v0, v1, :cond_1

    iget-object v0, p1, Lcom/facebook/orca/threadview/cp;->c:Lcom/google/common/a/es;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aO:Ljava/util/List;

    if-ne v0, v1, :cond_1

    .line 815
    :cond_0
    :goto_0
    return-void

    .line 736
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aN:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_2

    iget-object v0, p1, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aN:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    :cond_2
    move v1, v3

    .line 740
    :goto_1
    iget-object v0, p1, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 741
    iget-object v0, p1, Lcom/facebook/orca/threadview/cp;->b:Lcom/facebook/orca/threads/MessagesCollection;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aM:Lcom/facebook/orca/threads/MessagesCollection;

    .line 742
    iget-object v0, p1, Lcom/facebook/orca/threadview/cp;->c:Lcom/google/common/a/es;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aO:Ljava/util/List;

    .line 744
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aN:Lcom/facebook/orca/threads/ThreadSummary;

    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aM:Lcom/facebook/orca/threads/MessagesCollection;

    iget-object v5, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aO:Ljava/util/List;

    invoke-direct {p0, v0, v4, v5}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Ljava/util/List;)V

    .line 746
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aJ:Lcom/facebook/orca/p/b;

    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ac:Lcom/facebook/orca/common/ui/widgets/text/a;

    iget-object v5, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aN:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v4, v5}, Lcom/facebook/orca/common/ui/widgets/text/a;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threadview/v;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/facebook/orca/p/b;->a(Lcom/facebook/orca/threadview/v;)V

    .line 750
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-static {v0}, Lcom/facebook/orca/threadview/dm;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v5

    .line 751
    if-eqz v5, :cond_5

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aN:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aN:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    if-nez v0, :cond_5

    move v4, v3

    .line 755
    :goto_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aj:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_6

    if-eqz v5, :cond_6

    .line 756
    sget-object v0, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aH:Lcom/facebook/common/w/q;

    .line 765
    :goto_3
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aH:Lcom/facebook/common/w/q;

    sget-object v4, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    if-ne v0, v4, :cond_a

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aA:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-ne v0, v6, :cond_a

    .line 766
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->O()V

    .line 771
    :cond_3
    :goto_4
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->h:Lcom/facebook/widget/listview/l;

    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0, v4}, Lcom/facebook/widget/listview/l;->c(Landroid/widget/ListView;)Lcom/facebook/widget/listview/n;

    move-result-object v5

    .line 773
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aN:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_c

    .line 774
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aM:Lcom/facebook/orca/threads/MessagesCollection;

    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aO:Ljava/util/List;

    iget-object v6, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aN:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-direct {p0, v0, v4, v6, v3}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threads/MessagesCollection;Ljava/util/List;Lcom/facebook/orca/threads/ThreadSummary;Z)Ljava/util/List;

    move-result-object v0

    .line 779
    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aM:Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {v4}, Lcom/facebook/orca/threads/MessagesCollection;->e()Z

    move-result v4

    if-nez v4, :cond_4

    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aM:Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {v4}, Lcom/facebook/orca/threads/MessagesCollection;->d()Z

    move-result v4

    if-nez v4, :cond_4

    .line 781
    iget-boolean v4, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aI:Z

    if-eqz v4, :cond_b

    .line 782
    sget-object v4, Lcom/facebook/orca/threadview/s;->b:Lcom/facebook/orca/threadview/ac;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 803
    :cond_4
    :goto_5
    new-instance v4, Lcom/facebook/orca/threadview/dh;

    iget-object v6, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    iget-object v7, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->an:Lcom/facebook/common/e/h;

    invoke-direct {v4, v6, v7}, Lcom/facebook/orca/threadview/dh;-><init>(Lcom/facebook/widget/animatablelistview/d;Lcom/facebook/common/e/h;)V

    .line 805
    invoke-static {v0}, Lcom/google/common/a/hq;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/orca/threadview/dh;->a(Ljava/util/List;)V

    .line 807
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ar:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v0, v4}, Lcom/facebook/widget/listview/BetterListView;->setEmptyView(Landroid/view/View;)V

    .line 808
    invoke-direct {p0, v5}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/widget/listview/n;)V

    .line 809
    iput-boolean v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aI:Z

    .line 811
    if-eqz v1, :cond_0

    .line 812
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aJ:Lcom/facebook/orca/p/b;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/p/b;->a(Z)V

    .line 813
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aJ:Lcom/facebook/orca/p/b;

    invoke-virtual {v0}, Lcom/facebook/orca/p/b;->c()Lcom/facebook/l/x;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b(Lcom/facebook/l/x;)V

    goto/16 :goto_0

    :cond_5
    move v4, v2

    .line 751
    goto/16 :goto_2

    .line 757
    :cond_6
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ak:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_7

    if-eqz v4, :cond_7

    .line 758
    sget-object v0, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aH:Lcom/facebook/common/w/q;

    goto/16 :goto_3

    .line 759
    :cond_7
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aN:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_9

    .line 760
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aN:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->v()Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    :goto_6
    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aH:Lcom/facebook/common/w/q;

    goto/16 :goto_3

    :cond_8
    sget-object v0, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    goto :goto_6

    .line 762
    :cond_9
    sget-object v0, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aH:Lcom/facebook/common/w/q;

    goto/16 :goto_3

    .line 767
    :cond_a
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aH:Lcom/facebook/common/w/q;

    sget-object v4, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    if-ne v0, v4, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aA:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v6, :cond_3

    .line 768
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->P()V

    goto/16 :goto_4

    .line 784
    :cond_b
    sget-object v4, Lcom/facebook/orca/threadview/s;->a:Lcom/facebook/orca/threadview/ac;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 788
    :cond_c
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aO:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 789
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 790
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ai:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 791
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aO:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 792
    new-instance v7, Lcom/facebook/orca/threadview/ad;

    iget-object v8, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aX:Lcom/facebook/messages/model/threads/f;

    iget-object v9, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aa:Lcom/facebook/orca/attachments/a;

    invoke-virtual {v9, v0}, Lcom/facebook/orca/attachments/a;->b(Lcom/facebook/messages/model/threads/Message;)Lcom/google/common/a/es;

    move-result-object v9

    iget-object v10, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aa:Lcom/facebook/orca/attachments/a;

    invoke-virtual {v10, v0}, Lcom/facebook/orca/attachments/a;->e(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/attachments/AudioAttachmentData;

    move-result-object v10

    invoke-direct {v7, v0, v8, v9, v10}, Lcom/facebook/orca/threadview/ad;-><init>(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/f;Ljava/util/List;Lcom/facebook/orca/attachments/AudioAttachmentData;)V

    .line 797
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_d
    move-object v0, v4

    .line 799
    goto/16 :goto_5

    :cond_e
    move v1, v2

    goto/16 :goto_1
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1402
    iput-object p1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aP:Ljava/lang/String;

    .line 1403
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    if-eqz v0, :cond_0

    .line 1404
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->c(Ljava/lang/String;)V

    .line 1406
    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 529
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->p()Landroid/support/v4/app/q;

    move-result-object v0

    const-string v1, "resend_dialog"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 530
    instance-of v1, v0, Landroid/support/v4/app/DialogFragment;

    if-eqz v1, :cond_0

    .line 531
    check-cast v0, Landroid/support/v4/app/DialogFragment;

    .line 532
    invoke-virtual {v0}, Landroid/support/v4/app/DialogFragment;->a()V

    .line 534
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->p()Landroid/support/v4/app/q;

    move-result-object v0

    const-string v1, "message_menu_dialog"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 535
    instance-of v1, v0, Landroid/support/v4/app/DialogFragment;

    if-eqz v1, :cond_1

    .line 536
    check-cast v0, Landroid/support/v4/app/DialogFragment;

    .line 537
    invoke-virtual {v0}, Landroid/support/v4/app/DialogFragment;->a()V

    .line 539
    :cond_1
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 626
    sget-object v0, Lcom/facebook/orca/threadview/s;->c:Lcom/facebook/orca/threadview/ac;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ac;)V

    .line 627
    return-void
.end method

.method public c(Z)V
    .locals 1

    .prologue
    .line 498
    if-eqz p1, :cond_0

    .line 499
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->af:Lcom/facebook/orca/d/m;

    invoke-virtual {v0}, Lcom/facebook/orca/d/m;->a()V

    .line 500
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ag:Lcom/facebook/orca/d/af;

    invoke-virtual {v0}, Lcom/facebook/orca/d/af;->b()V

    .line 502
    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    .prologue
    .line 657
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aH:Lcom/facebook/common/w/q;

    sget-object v1, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    if-ne v0, v1, :cond_0

    .line 666
    :goto_0
    return-void

    .line 660
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aA:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 661
    sget-object v0, Lcom/facebook/orca/compose/ap;->EXPANDED:Lcom/facebook/orca/compose/ap;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/compose/ap;)V

    .line 662
    sget-object v0, Lcom/facebook/orca/compose/ap;->EXPANDED:Lcom/facebook/orca/compose/ap;

    iput-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aG:Lcom/facebook/orca/compose/ap;

    .line 663
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aZ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/listview/BetterListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 664
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->as:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 665
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ad()V

    goto :goto_0
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 223
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->d(Landroid/os/Bundle;)V

    .line 225
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->S()Lcom/facebook/inject/t;

    move-result-object v2

    .line 226
    const-class v0, Lcom/facebook/orca/threadview/s;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/s;

    .line 227
    const-class v1, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->d:Landroid/view/inputmethod/InputMethodManager;

    .line 228
    const-class v1, Lcom/facebook/orca/f/r;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/f/r;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->e:Lcom/facebook/orca/f/r;

    .line 229
    const-class v1, Landroid/text/ClipboardManager;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/text/ClipboardManager;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->f:Landroid/text/ClipboardManager;

    .line 230
    const-class v1, Lcom/facebook/orca/threadview/k;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threadview/k;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->g:Lcom/facebook/orca/threadview/k;

    .line 232
    const-class v1, Lcom/facebook/orca/p/b;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/p/b;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aJ:Lcom/facebook/orca/p/b;

    .line 233
    const-class v1, Lcom/facebook/orca/f/k;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/f/k;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->i:Lcom/facebook/orca/f/k;

    .line 234
    const-class v1, Lcom/facebook/orca/attachments/a;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/attachments/a;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aa:Lcom/facebook/orca/attachments/a;

    .line 235
    const-class v1, Lcom/facebook/orca/share/a;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/share/a;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ab:Lcom/facebook/orca/share/a;

    .line 236
    const-class v1, Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/common/ui/widgets/text/a;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ac:Lcom/facebook/orca/common/ui/widgets/text/a;

    .line 238
    const-class v1, Lcom/facebook/orca/f/p;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/f/p;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ad:Lcom/facebook/orca/f/p;

    .line 239
    const-class v1, Ljava/lang/String;

    const-class v3, Lcom/facebook/auth/annotations/ViewerContextUserId;

    invoke-virtual {v2, v1, v3}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ai:Ljavax/inject/a;

    .line 240
    const-class v1, Lcom/facebook/analytics/av;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/av;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ae:Lcom/facebook/analytics/av;

    .line 241
    const-class v1, Lcom/facebook/orca/d/m;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/d/m;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->af:Lcom/facebook/orca/d/m;

    .line 242
    const-class v1, Lcom/facebook/orca/d/af;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/d/af;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ag:Lcom/facebook/orca/d/af;

    .line 243
    const-class v1, Lcom/facebook/c/s;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/c/s;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ah:Lcom/facebook/c/s;

    .line 244
    const-class v1, Lcom/facebook/zero/ui/l;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/zero/ui/l;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aS:Lcom/facebook/zero/ui/l;

    .line 245
    const-class v1, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/annotations/IsSmsSendPermitted;

    invoke-virtual {v2, v1, v3}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aj:Ljavax/inject/a;

    .line 246
    const-class v1, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/annotations/IsMmsSendPermitted;

    invoke-virtual {v2, v1, v3}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ak:Ljavax/inject/a;

    .line 247
    const-class v1, Lcom/facebook/user/UserKey;

    const-class v3, Lcom/facebook/auth/annotations/LoggedInUserKey;

    invoke-virtual {v2, v1, v3}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->al:Ljavax/inject/a;

    .line 248
    const-class v1, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/annotations/IsEmptyComposeLikeEnabled;

    invoke-virtual {v2, v1, v3}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->am:Ljavax/inject/a;

    .line 250
    const-class v1, Lcom/facebook/orca/photos/c/a;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/photos/c/a;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aV:Lcom/facebook/orca/photos/c/a;

    .line 251
    const-class v1, Lcom/facebook/orca/threadview/a/a;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threadview/a/a;

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/a/a;->a()Lcom/facebook/orca/threadview/a/c;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aW:Lcom/facebook/orca/threadview/a/c;

    .line 253
    const-class v1, Lcom/facebook/messages/model/threads/f;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/messages/model/threads/f;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aX:Lcom/facebook/messages/model/threads/f;

    .line 254
    const-class v1, Lcom/facebook/common/e/h;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/e/h;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->an:Lcom/facebook/common/e/h;

    .line 256
    sget v1, Lcom/facebook/i;->update_list_container:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->d(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ao:Landroid/view/ViewGroup;

    .line 257
    sget v1, Lcom/facebook/i;->create_dummy_focus_elt:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->d(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ap:Landroid/view/View;

    .line 258
    sget v1, Lcom/facebook/i;->messages_list:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->d(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/listview/BetterListView;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    .line 259
    sget v1, Lcom/facebook/i;->threadview_updates_empty_item:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->d(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/listview/EmptyListViewItem;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ar:Lcom/facebook/widget/listview/EmptyListViewItem;

    .line 260
    sget v1, Lcom/facebook/i;->thread_view_suggestion_popovers:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->d(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->as:Landroid/view/ViewGroup;

    .line 261
    sget v1, Lcom/facebook/i;->thread_view_mute_warning:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->d(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->at:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    .line 262
    sget v1, Lcom/facebook/i;->thread_view_sms_upsell:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->d(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->au:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    .line 263
    sget v1, Lcom/facebook/i;->messages_list_shadow_top:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->d(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->av:Landroid/widget/ImageView;

    .line 264
    sget v1, Lcom/facebook/i;->messages_list_shadow_bottom:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->d(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aw:Landroid/widget/ImageView;

    .line 266
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->q()Landroid/support/v4/app/q;

    move-result-object v1

    sget v3, Lcom/facebook/i;->messages_compose:I

    invoke-virtual {v1, v3}, Landroid/support/v4/app/q;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/compose/ComposeFragment;

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    .line 268
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aB:Lcom/facebook/orca/compose/av;

    if-eqz v1, :cond_0

    .line 269
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aB:Lcom/facebook/orca/compose/av;

    invoke-virtual {v1, v3}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/av;)V

    .line 272
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v1}, Lcom/facebook/orca/compose/ComposeFragment;->z()Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aA:Landroid/view/View;

    .line 274
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aP:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/facebook/orca/compose/ComposeFragment;->c(Ljava/lang/String;)V

    .line 276
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aS:Lcom/facebook/zero/ui/l;

    sget-object v3, Lcom/facebook/zero/a/c;->k:Lcom/facebook/prefs/shared/ae;

    sget v4, Lcom/facebook/o;->zero_external_url_dialog_content:I

    invoke-virtual {p0, v4}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/facebook/orca/threadview/cx;

    invoke-direct {v5, p0}, Lcom/facebook/orca/threadview/cx;-><init>(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)V

    invoke-virtual {v1, v3, v4, v5}, Lcom/facebook/zero/ui/l;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;Lcom/facebook/zero/ui/k;)Lcom/facebook/zero/ui/l;

    .line 290
    new-instance v1, Lcom/facebook/orca/threadview/cz;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/cz;-><init>(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)V

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aU:Lcom/facebook/orca/dialog/e;

    .line 301
    new-instance v1, Lcom/facebook/orca/threadview/da;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/da;-><init>(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/s;->a(Lcom/facebook/orca/threadview/u;)V

    .line 337
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    new-instance v3, Lcom/facebook/orca/threadview/db;

    invoke-direct {v3, p0}, Lcom/facebook/orca/threadview/db;-><init>(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)V

    invoke-virtual {v1, v3}, Lcom/facebook/widget/listview/BetterListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 346
    new-instance v1, Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->n()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v1, v3, v0}, Lcom/facebook/widget/animatablelistview/d;-><init>(Landroid/content/Context;Lcom/facebook/widget/animatablelistview/q;)V

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    .line 347
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v1, v3}, Lcom/facebook/widget/listview/BetterListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 348
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v1, v6}, Lcom/facebook/widget/listview/BetterListView;->setDividerHeight(I)V

    .line 349
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v1, v7}, Lcom/facebook/widget/listview/BetterListView;->setStackFromBottom(Z)V

    .line 350
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v1, v7}, Lcom/facebook/widget/listview/BetterListView;->setTranscriptMode(I)V

    .line 351
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v1, v7}, Lcom/facebook/widget/listview/BetterListView;->setItemsCanFocus(Z)V

    .line 352
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    new-instance v3, Lcom/facebook/orca/threadview/dc;

    invoke-direct {v3, p0}, Lcom/facebook/orca/threadview/dc;-><init>(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)V

    invoke-virtual {v1, v3}, Lcom/facebook/widget/listview/BetterListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 370
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ar:Lcom/facebook/widget/listview/EmptyListViewItem;

    invoke-virtual {v1, v3}, Lcom/facebook/widget/listview/BetterListView;->setEmptyView(Landroid/view/View;)V

    .line 371
    new-instance v1, Lcom/facebook/widget/listview/l;

    invoke-direct {v1}, Lcom/facebook/widget/listview/l;-><init>()V

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->h:Lcom/facebook/widget/listview/l;

    .line 372
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    iget-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c:Lcom/facebook/widget/animatablelistview/d;

    invoke-static {v1, v3}, Lcom/facebook/widget/animatablelistview/l;->a(Lcom/facebook/widget/listview/BetterListView;Lcom/facebook/widget/animatablelistview/d;)Lcom/facebook/widget/animatablelistview/l;

    .line 374
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Landroid/view/View;)V

    .line 375
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v1}, Lcom/facebook/widget/listview/BetterListView;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aY:Landroid/graphics/drawable/Drawable;

    .line 376
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    sget v3, Lcom/facebook/h;->transparent_drawable:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aZ:Landroid/graphics/drawable/Drawable;

    .line 378
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ag()V

    .line 380
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-static {v1}, Lcom/facebook/orca/threadview/dm;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 381
    new-instance v3, Lcom/facebook/orca/threadview/ak;

    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/d;

    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->au:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    invoke-direct {v3, v1, v4}, Lcom/facebook/orca/threadview/ak;-><init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;)V

    iput-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ay:Lcom/facebook/orca/threadview/ak;

    .line 387
    :goto_0
    new-instance v3, Lcom/facebook/orca/threadview/w;

    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v2, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/d;

    const-class v4, Lcom/facebook/orca/notify/as;

    invoke-virtual {v2, v4}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/notify/as;

    iget-object v4, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->at:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    invoke-direct {v3, v1, v2, v4}, Lcom/facebook/orca/threadview/w;-><init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/notify/as;Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;)V

    iput-object v3, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ax:Lcom/facebook/orca/threadview/w;

    .line 391
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->ax:Lcom/facebook/orca/threadview/w;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/threadview/w;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 393
    new-instance v1, Lcom/facebook/orca/threadview/dd;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/dd;-><init>(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)V

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aD:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

    .line 400
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->c()Z

    move-result v1

    if-nez v1, :cond_1

    .line 401
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aF:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 403
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    sget-object v2, Lcom/facebook/orca/compose/ap;->SHRUNK:Lcom/facebook/orca/compose/ap;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ap;)V

    .line 404
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->az:Lcom/facebook/orca/compose/ComposeFragment;

    new-instance v2, Lcom/facebook/orca/threadview/de;

    invoke-direct {v2, p0}, Lcom/facebook/orca/threadview/de;-><init>(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)V

    invoke-virtual {v1, v2}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/an;)V

    .line 411
    new-instance v1, Lcom/facebook/orca/threadview/df;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/df;-><init>(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)V

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aL:Lcom/facebook/orca/p/d;

    .line 417
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aJ:Lcom/facebook/orca/p/b;

    iget-object v2, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aL:Lcom/facebook/orca/p/d;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/p/b;->a(Lcom/facebook/orca/p/d;)V

    .line 418
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->Z:Landroid/os/Handler;

    .line 420
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->k()Landroid/os/Bundle;

    move-result-object v1

    .line 421
    if-eqz v1, :cond_2

    .line 422
    const-string v2, "chatStyle"

    invoke-virtual {v1, v2, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 423
    if-eqz v1, :cond_2

    .line 424
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->z()Landroid/view/View;

    move-result-object v1

    sget v2, Lcom/facebook/i;->message_list_container:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->o()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/facebook/f;->chat_thread_view_message_background:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 427
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->z()Landroid/view/View;

    move-result-object v1

    sget v2, Lcom/facebook/i;->bottom_divider:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 428
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 429
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->o()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/facebook/g;->chat_thread_compose_divider_width:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 431
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->o()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/facebook/f;->chat_thread_view_divider:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 434
    iput-boolean v7, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aR:Z

    .line 435
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->av:Landroid/widget/ImageView;

    sget v2, Lcom/facebook/h;->orca_chat_thread_list_shadow_top:I

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 436
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->av:Landroid/widget/ImageView;

    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 437
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aw:Landroid/widget/ImageView;

    sget v2, Lcom/facebook/h;->orca_chat_thread_list_shadow_bottom:I

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 438
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aw:Landroid/widget/ImageView;

    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 439
    invoke-virtual {v0, v6}, Lcom/facebook/orca/threadview/s;->a(Z)V

    .line 443
    :cond_2
    if-eqz p1, :cond_3

    .line 444
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->c(Landroid/os/Bundle;)V

    .line 447
    :cond_3
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->Y()V

    .line 448
    return-void

    .line 385
    :cond_4
    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->au:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;->setVisibility(I)V

    goto/16 :goto_0
.end method

.method public e(I)V
    .locals 2

    .prologue
    .line 713
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    .line 714
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aq:Lcom/facebook/widget/listview/BetterListView;

    invoke-virtual {v0, p1}, Lcom/facebook/widget/listview/BetterListView;->setOverScrollMode(I)V

    .line 716
    :cond_0
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 490
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->e(Landroid/os/Bundle;)V

    .line 491
    const-string v0, "composeMode"

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aG:Lcom/facebook/orca/compose/ap;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 492
    const-string v0, "canReplyTo"

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aH:Lcom/facebook/common/w/q;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 493
    const-string v0, "trigger"

    iget-object v1, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aP:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 494
    return-void
.end method

.method public f()V
    .locals 2

    .prologue
    .line 458
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->f()V

    .line 459
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aJ:Lcom/facebook/orca/p/b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/p/b;->a(Z)V

    .line 460
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aJ:Lcom/facebook/orca/p/b;

    invoke-virtual {v0}, Lcom/facebook/orca/p/b;->c()Lcom/facebook/l/x;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->b(Lcom/facebook/l/x;)V

    .line 461
    return-void
.end method

.method public g()V
    .locals 2

    .prologue
    .line 465
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->g()V

    .line 466
    iget-object v0, p0, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->aJ:Lcom/facebook/orca/p/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/p/b;->a(Z)V

    .line 467
    return-void
.end method
