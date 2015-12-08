.class public abstract Lkik/android/chat/fragment/ConversationsBaseFragment;
.super Lkik/android/chat/fragment/KikIqFragmentBase;
.source "SourceFile"


# instance fields
.field private A:Lcom/kik/g/i;

.field private B:Lcom/kik/g/i;

.field private C:Lcom/kik/g/i;

.field private D:Lcom/kik/g/i;

.field protected a:Lkik/a/e/i;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected b:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected d:Lkik/a/e/l;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected e:Lkik/a/e/n;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected f:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected g:Lcom/kik/l/ab;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected h:Lkik/android/chat/fragment/ProgressDialogFragment;

.field protected i:Z

.field protected j:Landroid/widget/ListView;

.field protected k:Landroid/view/View;

.field private final l:I

.field private final m:I

.field private final n:I

.field private final o:I

.field private final p:Landroid/os/Handler;

.field private q:Lkik/a/d/f;

.field private r:Landroid/view/ContextMenu;

.field private s:I

.field private t:Z

.field private x:Lcom/kik/g/i;

.field private y:Lcom/kik/g/i;

.field private z:Lcom/kik/g/i;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 44
    invoke-direct {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;-><init>()V

    .line 55
    const/4 v0, 0x2

    iput v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->l:I

    .line 56
    const/4 v0, 0x3

    iput v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->m:I

    .line 57
    const/4 v0, 0x4

    iput v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->n:I

    .line 58
    const/4 v0, 0x5

    iput v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->o:I

    .line 70
    iput-boolean v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->i:Z

    .line 72
    new-instance v0, Lkik/android/chat/fragment/ae;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ae;-><init>(Lkik/android/chat/fragment/ConversationsBaseFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->p:Landroid/os/Handler;

    .line 122
    iput-object v2, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->q:Lkik/a/d/f;

    .line 123
    iput-object v2, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->r:Landroid/view/ContextMenu;

    .line 124
    iput v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->s:I

    .line 125
    iput-boolean v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->t:Z

    .line 127
    new-instance v0, Lkik/android/chat/fragment/aj;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/aj;-><init>(Lkik/android/chat/fragment/ConversationsBaseFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->x:Lcom/kik/g/i;

    .line 144
    new-instance v0, Lkik/android/chat/fragment/ak;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ak;-><init>(Lkik/android/chat/fragment/ConversationsBaseFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->y:Lcom/kik/g/i;

    .line 166
    new-instance v0, Lkik/android/chat/fragment/al;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/al;-><init>(Lkik/android/chat/fragment/ConversationsBaseFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->z:Lcom/kik/g/i;

    .line 184
    new-instance v0, Lkik/android/chat/fragment/am;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/am;-><init>(Lkik/android/chat/fragment/ConversationsBaseFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->A:Lcom/kik/g/i;

    .line 193
    new-instance v0, Lkik/android/chat/fragment/an;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/an;-><init>(Lkik/android/chat/fragment/ConversationsBaseFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->B:Lcom/kik/g/i;

    .line 205
    new-instance v0, Lkik/android/chat/fragment/ao;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ao;-><init>(Lkik/android/chat/fragment/ConversationsBaseFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->C:Lcom/kik/g/i;

    .line 214
    new-instance v0, Lkik/android/chat/fragment/ap;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ap;-><init>(Lkik/android/chat/fragment/ConversationsBaseFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->D:Lcom/kik/g/i;

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/ConversationsBaseFragment;I)I
    .locals 0

    .prologue
    .line 44
    iput p1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->s:I

    return p1
.end method

.method static synthetic a(Lkik/android/chat/fragment/ConversationsBaseFragment;)Z
    .locals 1

    .prologue
    .line 44
    iget-boolean v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->t:Z

    return v0
.end method

.method static synthetic b(Lkik/android/chat/fragment/ConversationsBaseFragment;)Z
    .locals 1

    .prologue
    .line 44
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->t:Z

    return v0
.end method

.method static synthetic c(Lkik/android/chat/fragment/ConversationsBaseFragment;)I
    .locals 1

    .prologue
    .line 44
    iget v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->s:I

    return v0
.end method

.method static synthetic d(Lkik/android/chat/fragment/ConversationsBaseFragment;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->p:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 323
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->j:Landroid/widget/ListView;

    if-nez v0, :cond_1

    .line 332
    :cond_0
    :goto_0
    return-void

    .line 326
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v0

    .line 327
    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getLastVisiblePosition()I

    move-result v1

    .line 328
    if-gt v0, p1, :cond_2

    if-ge v1, p1, :cond_0

    .line 329
    :cond_2
    sub-int v0, v1, v0

    div-int/lit8 v0, v0, 0x2

    sub-int v0, p1, v0

    .line 330
    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->j:Landroid/widget/ListView;

    if-gez v0, :cond_3

    const/4 v0, 0x0

    :cond_3
    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setSelection(I)V

    goto :goto_0
.end method

.method protected final a(Landroid/view/ContextMenu;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 9

    .prologue
    const/4 v2, 0x2

    const/4 v3, 0x1

    const v8, 0x7f0902a5

    const/4 v7, 0x4

    const/4 v6, 0x0

    .line 433
    iput-object p1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->r:Landroid/view/ContextMenu;

    .line 434
    check-cast p2, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 435
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    iget v1, p2, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-interface {v0, v1}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    iput-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->q:Lkik/a/d/f;

    .line 437
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->q:Lkik/a/d/f;

    if-nez v0, :cond_0

    .line 485
    :goto_0
    return-void

    .line 442
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->q:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->n()Z

    move-result v4

    .line 443
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->b:Lkik/a/e/r;

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->q:Lkik/a/d/f;

    invoke-virtual {v1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    .line 444
    instance-of v0, v1, Lkik/a/d/n;

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v0, v1

    .line 445
    check-cast v0, Lkik/a/d/n;

    iget-object v5, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->b:Lkik/a/e/r;

    invoke-static {v0, v5}, Lkik/android/util/cq;->a(Lkik/a/d/n;Lkik/a/e/r;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Landroid/view/ContextMenu;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/ContextMenu;

    .line 450
    :goto_1
    instance-of v0, v1, Lkik/a/d/n;

    if-eqz v0, :cond_6

    .line 451
    const/4 v0, 0x6

    const v1, 0x7f090018

    invoke-interface {p1, v6, v0, v6, v1}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 452
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->q:Lkik/a/d/f;

    invoke-interface {v0, v1}, Lkik/a/e/i;->a(Lkik/a/d/f;)I

    move-result v0

    if-ne v0, v2, :cond_3

    .line 453
    const v0, 0x7f0900f6

    invoke-interface {p1, v6, v6, v6, v0}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 454
    invoke-interface {p1, v6, v7, v6, v8}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    goto :goto_0

    .line 448
    :cond_1
    invoke-virtual {v1}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const v0, 0x7f090202

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ConversationsBaseFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-interface {p1, v0}, Landroid/view/ContextMenu;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/ContextMenu;

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 457
    :cond_3
    if-eqz v4, :cond_4

    :goto_3
    if-eqz v4, :cond_5

    const v0, 0x7f09001d

    :goto_4
    invoke-interface {p1, v6, v2, v6, v0}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 463
    invoke-interface {p1, v6, v7, v6, v8}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    goto :goto_0

    :cond_4
    move v2, v3

    .line 457
    goto :goto_3

    :cond_5
    const v0, 0x7f090019

    goto :goto_4

    .line 467
    :cond_6
    const/4 v0, 0x5

    const v5, 0x7f090017

    invoke-interface {p1, v6, v0, v6, v5}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 468
    invoke-virtual {v1}, Lkik/a/d/k;->l()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 469
    if-eqz v4, :cond_7

    move v1, v2

    :goto_5
    if-eqz v4, :cond_8

    const v0, 0x7f09001d

    :goto_6
    invoke-interface {p1, v6, v1, v6, v0}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 475
    invoke-interface {p1, v6, v7, v6, v8}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    goto/16 :goto_0

    :cond_7
    move v1, v3

    .line 469
    goto :goto_5

    :cond_8
    const v0, 0x7f090019

    goto :goto_6

    .line 478
    :cond_9
    invoke-virtual {v1}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->c:Lkik/a/e/v;

    invoke-static {v1}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v1

    invoke-virtual {v1}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/a/d/j;->a(Lkik/a/d/j;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 479
    const/4 v0, 0x3

    const-string v1, "Block and Report"

    invoke-interface {p1, v6, v0, v6, v1}, Landroid/view/ContextMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 481
    :cond_a
    const v0, 0x7f0900f6

    invoke-interface {p1, v6, v6, v6, v0}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    .line 482
    invoke-interface {p1, v6, v7, v6, v8}, Landroid/view/ContextMenu;->add(IIII)Landroid/view/MenuItem;

    goto/16 :goto_0
.end method

.method protected a(Landroid/widget/AbsListView;III)V
    .locals 0

    .prologue
    .line 290
    return-void
.end method

.method protected final a(Lcom/kik/g/f;)V
    .locals 3

    .prologue
    .line 249
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->a(Lcom/kik/g/f;)V

    .line 250
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->e()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->z:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 251
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->f()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->z:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 252
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->b()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->D:Lcom/kik/g/i;

    new-instance v2, Lcom/kik/g/o;

    invoke-direct {v2}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {p1, v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    .line 253
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->c()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->A:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 254
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->d()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->B:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 255
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->i()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->D:Lcom/kik/g/i;

    new-instance v2, Lcom/kik/g/o;

    invoke-direct {v2}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {p1, v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    .line 256
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->k()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->D:Lcom/kik/g/i;

    new-instance v2, Lcom/kik/g/o;

    invoke-direct {v2}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {p1, v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    .line 257
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->c:Lkik/a/e/v;

    invoke-interface {v0}, Lkik/a/e/v;->c()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->C:Lcom/kik/g/i;

    new-instance v2, Lcom/kik/g/o;

    invoke-direct {v2}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {p1, v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    .line 258
    return-void
.end method

.method protected a(Lkik/a/d/f;)V
    .locals 1

    .prologue
    .line 294
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lkik/android/chat/fragment/ConversationsBaseFragment;->a(Lkik/a/d/f;Z)V

    .line 295
    return-void
.end method

.method protected final a(Lkik/a/d/f;Z)V
    .locals 2

    .prologue
    .line 299
    if-eqz p1, :cond_0

    .line 300
    new-instance v0, Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatFragment$a;-><init>()V

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->d:Lkik/a/e/l;

    invoke-virtual {v0, p1, v1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Lkik/a/d/f;Lkik/a/e/l;)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lkik/android/chat/fragment/KikChatFragment$a;->c(Z)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/chat/fragment/ConversationsBaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/af;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/fragment/af;-><init>(Lkik/android/chat/fragment/ConversationsBaseFragment;Lkik/a/d/f;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 319
    :cond_0
    return-void
.end method

.method protected final b(Lcom/kik/g/f;)V
    .locals 3

    .prologue
    .line 233
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->b(Lcom/kik/g/f;)V

    .line 234
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->b:Lkik/a/e/r;

    invoke-interface {v0}, Lkik/a/e/r;->c()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->C:Lcom/kik/g/i;

    new-instance v2, Lcom/kik/g/o;

    invoke-direct {v2}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {p1, v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    .line 235
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->d:Lkik/a/e/l;

    invoke-interface {v0}, Lkik/a/e/l;->e()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->C:Lcom/kik/g/i;

    new-instance v2, Lcom/kik/g/o;

    invoke-direct {v2}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {p1, v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    .line 237
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->b()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->D:Lcom/kik/g/i;

    new-instance v2, Lcom/kik/g/o;

    invoke-direct {v2}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {p1, v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    .line 238
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->e()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->y:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 239
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->f()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->y:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 240
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->o()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->x:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 241
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->g()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->C:Lcom/kik/g/i;

    new-instance v2, Lcom/kik/g/o;

    invoke-direct {v2}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {p1, v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    .line 242
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->h()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->D:Lcom/kik/g/i;

    new-instance v2, Lcom/kik/g/o;

    invoke-direct {v2}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {p1, v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    .line 243
    invoke-static {}, Lcom/kik/android/c/f;->c()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->C:Lcom/kik/g/i;

    new-instance v2, Lcom/kik/g/o;

    invoke-direct {v2}, Lcom/kik/g/o;-><init>()V

    invoke-virtual {p1, v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/as;)Lcom/kik/g/i;

    .line 244
    return-void
.end method

.method public abstract b(Lkik/a/d/f;)V
.end method

.method public abstract b(Z)V
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 12

    .prologue
    const/4 v7, 0x1

    const/4 v3, 0x0

    .line 339
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->q:Lkik/a/d/f;

    .line 340
    const/4 v1, 0x0

    iput-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->q:Lkik/a/d/f;

    .line 344
    if-nez v0, :cond_9

    .line 345
    invoke-interface {p1}, Landroid/view/MenuItem;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    check-cast v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    .line 347
    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v1

    iget v2, v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    if-gt v1, v2, :cond_0

    move v0, v3

    .line 428
    :goto_0
    return v0

    .line 351
    :cond_0
    iget-object v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->j:Landroid/widget/ListView;

    iget v0, v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;->position:I

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    move-object v2, v0

    .line 355
    :goto_1
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->b:Lkik/a/e/r;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v7}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    .line 357
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :cond_1
    :goto_2
    move v0, v7

    .line 428
    goto :goto_0

    .line 359
    :pswitch_0
    invoke-virtual {v1, v3}, Lkik/a/d/k;->h(Z)V

    .line 360
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->b:Lkik/a/e/r;

    invoke-interface {v0, v1}, Lkik/a/e/r;->a(Lkik/a/d/k;)V

    .line 361
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/i;->b(Ljava/lang/String;)V

    .line 362
    invoke-virtual {p0, v3}, Lkik/android/chat/fragment/ConversationsBaseFragment;->b(Z)V

    goto :goto_2

    .line 365
    :pswitch_1
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/i;->c(Ljava/lang/String;)V

    .line 366
    invoke-virtual {p0, v3}, Lkik/android/chat/fragment/ConversationsBaseFragment;->b(Z)V

    goto :goto_2

    .line 369
    :pswitch_2
    invoke-virtual {v2}, Lkik/a/d/f;->n()Z

    move-result v0

    if-nez v0, :cond_1

    .line 370
    new-instance v4, Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->k:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v4, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    const v0, 0x7f09016a

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v5

    new-array v6, v7, [Ljava/lang/Object;

    instance-of v0, v1, Lkik/a/d/n;

    if-eqz v0, :cond_2

    const v0, 0x7f09012c

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ConversationsBaseFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_3
    aput-object v0, v6, v3

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const v3, 0x7f090167

    invoke-static {v3}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v3, 0x7f090165

    invoke-static {v3}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v3, 0x7f090166

    invoke-static {v3}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-array v3, v3, [Ljava/lang/CharSequence;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/CharSequence;

    new-instance v3, Lkik/android/chat/fragment/ai;

    invoke-direct {v3, p0, v1, v2}, Lkik/android/chat/fragment/ai;-><init>(Lkik/android/chat/fragment/ConversationsBaseFragment;Lkik/a/d/k;Lkik/a/d/f;)V

    invoke-virtual {v4, v0, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->a([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    iget-object v0, v4, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v2, "dialog"

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/ConversationsBaseFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_2
    invoke-static {v1}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 374
    :pswitch_3
    invoke-virtual {v2}, Lkik/a/d/f;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 375
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->f:Lcom/kik/android/a;

    const-string v4, "Unmuted"

    invoke-virtual {v0, v4}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v4, "Is Verified"

    invoke-virtual {v1}, Lkik/a/d/k;->i()Z

    move-result v5

    invoke-virtual {v0, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v4, "Source"

    const-string v5, "Chat List"

    invoke-virtual {v0, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v4

    const-string v5, "Duration"

    invoke-virtual {v2}, Lkik/a/d/f;->p()J

    move-result-wide v8

    const-wide/16 v10, -0x1

    cmp-long v0, v8, v10

    if-nez v0, :cond_3

    const-string v0, "Forever"

    :goto_4
    invoke-virtual {v4, v5, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v4, "Is Group"

    instance-of v5, v1, Lkik/a/d/n;

    invoke-virtual {v0, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v4

    const-string v5, "Participants Count"

    instance-of v0, v1, Lkik/a/d/n;

    if-eqz v0, :cond_4

    check-cast v1, Lkik/a/d/n;

    invoke-virtual {v1}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    :goto_5
    invoke-virtual {v4, v5, v0, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 382
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-virtual {v2}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/i;->d(Ljava/lang/String;)V

    .line 383
    invoke-virtual {p0, v3}, Lkik/android/chat/fragment/ConversationsBaseFragment;->b(Z)V

    goto/16 :goto_2

    .line 375
    :cond_3
    const-string v0, "Limited Time Duration"

    goto :goto_4

    :cond_4
    const-wide/16 v0, 0x1

    goto :goto_5

    .line 387
    :pswitch_4
    new-instance v0, Lkik/android/widget/cp;

    invoke-virtual {v2}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->k:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "Conversation List Screen"

    iget-object v5, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->f:Lcom/kik/android/a;

    iget-object v6, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    invoke-direct/range {v0 .. v6}, Lkik/android/widget/cp;-><init>(Lkik/a/d/k;Ljava/util/Vector;Landroid/content/Context;Ljava/lang/String;Lcom/kik/android/a;Lkik/a/e/i;)V

    .line 389
    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v2, "dialog"

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/ConversationsBaseFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 392
    :pswitch_5
    instance-of v0, v1, Lkik/a/d/n;

    if-eqz v0, :cond_6

    .line 393
    check-cast v1, Lkik/a/d/n;

    invoke-virtual {v1}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v0

    .line 394
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 395
    iget-object v3, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->b:Lkik/a/e/r;

    invoke-interface {v3, v0, v7}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 396
    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v3

    if-nez v3, :cond_5

    .line 397
    iget-object v3, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->b:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v0

    invoke-interface {v3, v0}, Lkik/a/e/r;->a(Lkik/a/d/j;)Lcom/kik/g/p;

    goto :goto_6

    .line 402
    :cond_6
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->b:Lkik/a/e/r;

    invoke-virtual {v1}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/r;->a(Lkik/a/d/j;)Lcom/kik/g/p;

    .line 405
    :cond_7
    invoke-virtual {p0}, Lkik/android/chat/fragment/ConversationsBaseFragment;->w()V

    .line 406
    invoke-virtual {p0, v2, v7}, Lkik/android/chat/fragment/ConversationsBaseFragment;->a(Lkik/a/d/f;Z)V

    goto/16 :goto_2

    .line 410
    :pswitch_6
    new-instance v0, Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;-><init>()V

    .line 411
    iget-object v2, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->c:Lkik/a/e/v;

    invoke-static {v2}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v2

    .line 412
    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v2}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 415
    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->b()Lkik/android/chat/fragment/KikChatInfoFragment$a;

    .line 417
    :cond_8
    iget-boolean v2, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->i:Z

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Z)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    .line 418
    invoke-virtual {v1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->d(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    .line 419
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/ConversationsBaseFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/ah;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ah;-><init>(Lkik/android/chat/fragment/ConversationsBaseFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto/16 :goto_2

    :cond_9
    move-object v2, v0

    goto/16 :goto_1

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_6
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 226
    invoke-virtual {p0}, Lkik/android/chat/fragment/ConversationsBaseFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/ConversationsBaseFragment;)V

    .line 227
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->onCreate(Landroid/os/Bundle;)V

    .line 228
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .prologue
    .line 263
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onDestroy()V

    .line 264
    return-void
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 499
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onPause()V

    .line 501
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->r:Landroid/view/ContextMenu;

    if-eqz v0, :cond_0

    .line 502
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->r:Landroid/view/ContextMenu;

    invoke-interface {v0}, Landroid/view/ContextMenu;->close()V

    .line 503
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->r:Landroid/view/ContextMenu;

    .line 505
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->t:Z

    .line 506
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 490
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onResume()V

    .line 493
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->p:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 494
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 268
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->j:Landroid/widget/ListView;

    if-nez v0, :cond_0

    .line 269
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "A conversation screen must have set the _conversationList during view creation"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 271
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->j:Landroid/widget/ListView;

    new-instance v1, Lkik/android/chat/fragment/aq;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/aq;-><init>(Lkik/android/chat/fragment/ConversationsBaseFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 284
    invoke-super {p0, p1, p2}, Lkik/android/chat/fragment/KikIqFragmentBase;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 285
    return-void
.end method

.method public onViewStateRestored(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 529
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->onViewStateRestored(Landroid/os/Bundle;)V

    .line 532
    iget-boolean v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->t:Z

    if-eqz v0, :cond_1

    .line 533
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->j:Landroid/widget/ListView;

    if-eqz v0, :cond_0

    .line 534
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 535
    iget-object v0, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->requestFocus()Z

    .line 538
    :cond_0
    iput-boolean v1, p0, Lkik/android/chat/fragment/ConversationsBaseFragment;->t:Z

    .line 540
    :cond_1
    return-void
.end method
