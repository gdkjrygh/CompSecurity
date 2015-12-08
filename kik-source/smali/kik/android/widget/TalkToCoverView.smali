.class public Lkik/android/widget/TalkToCoverView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field _acceptButton:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01e4
    .end annotation
.end field

.field _deleteButton:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e01e3
    .end annotation
.end field

.field protected a:Lcom/kik/android/a;

.field protected b:Lkik/a/e/w;

.field protected c:Lkik/a/e/r;

.field protected d:Lkik/a/e/i;

.field protected e:Lkik/a/e/f;

.field private f:Landroid/view/View;

.field private g:Landroid/content/Context;

.field private h:Lkik/a/d/k;

.field private i:Lkik/android/chat/fragment/KikScopedDialogFragment;

.field private j:Ljava/util/ArrayList;

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Lkik/a/d/f;

.field private o:Lkik/a/e/i;

.field private p:Landroid/view/View;

.field private q:I

.field private r:Lcom/kik/g/k;

.field private s:Lkik/a/d/aa;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    .line 228
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkik/android/widget/TalkToCoverView;->j:Ljava/util/ArrayList;

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/TalkToCoverView;->l:Z

    .line 49
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/TalkToCoverView;->m:Z

    .line 54
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lkik/android/widget/TalkToCoverView;->r:Lcom/kik/g/k;

    .line 229
    iput-object p1, p0, Lkik/android/widget/TalkToCoverView;->g:Landroid/content/Context;

    .line 230
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03009d

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/TalkToCoverView;->f:Landroid/view/View;

    .line 231
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->f:Landroid/view/View;

    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 232
    return-void
.end method

.method static synthetic a(Lkik/android/widget/TalkToCoverView;)V
    .locals 4

    .prologue
    .line 41
    invoke-virtual {p0}, Lkik/android/widget/TalkToCoverView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/KikDialogFragment;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikDialogFragment;-><init>()V

    const v2, 0x7f0902cd

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment;->a(Ljava/lang/String;)V

    const v2, 0x7f090034

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment;->b(Ljava/lang/String;)V

    const v2, 0x7f090326

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lkik/android/widget/eb;

    invoke-direct {v3, p0}, Lkik/android/widget/eb;-><init>(Lkik/android/widget/TalkToCoverView;)V

    invoke-virtual {v1, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    const v2, 0x7f0902e0

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkik/android/chat/fragment/KikDialogFragment;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->i:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    return-void
.end method

.method static synthetic b(Lkik/android/widget/TalkToCoverView;)V
    .locals 3

    .prologue
    .line 41
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->a:Lcom/kik/android/a;

    const-string v1, "Chat Screen Delete Clicked"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Result"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->d:Lkik/a/e/i;

    iget-object v1, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    invoke-virtual {v1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/i;->b(Ljava/lang/String;)V

    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 349
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lkik/android/widget/TalkToCoverView;->setVisibility(I)V

    .line 350
    iput-boolean v1, p0, Lkik/android/widget/TalkToCoverView;->k:Z

    .line 351
    iput-boolean v1, p0, Lkik/android/widget/TalkToCoverView;->l:Z

    .line 352
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->p:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 353
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->p:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 354
    iget v1, p0, Lkik/android/widget/TalkToCoverView;->q:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 355
    iget-object v1, p0, Lkik/android/widget/TalkToCoverView;->p:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 357
    :cond_0
    return-void
.end method

.method static synthetic c(Lkik/android/widget/TalkToCoverView;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 41
    invoke-virtual {p0}, Lkik/android/widget/TalkToCoverView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/KikDialogFragment;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikDialogFragment;-><init>()V

    const v2, 0x7f09003b

    new-array v3, v6, [Ljava/lang/Object;

    iget-object v4, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    invoke-virtual {v4}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment;->a(Ljava/lang/String;)V

    const v2, 0x7f090055

    new-array v3, v6, [Ljava/lang/Object;

    iget-object v4, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    invoke-virtual {v4}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment;->b(Ljava/lang/String;)V

    const v2, 0x7f090296

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lkik/android/widget/dz;

    invoke-direct {v3, p0}, Lkik/android/widget/dz;-><init>(Lkik/android/widget/TalkToCoverView;)V

    invoke-virtual {v1, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    const v2, 0x7f090299

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lkik/android/widget/ea;

    invoke-direct {v2, p0}, Lkik/android/widget/ea;-><init>(Lkik/android/widget/TalkToCoverView;)V

    invoke-virtual {v1, v0, v2}, Lkik/android/chat/fragment/KikDialogFragment;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->i:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    return-void
.end method

.method static synthetic d(Lkik/android/widget/TalkToCoverView;)V
    .locals 7

    .prologue
    .line 41
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    instance-of v0, v0, Lkik/a/d/n;

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lkik/android/widget/TalkToCoverView;->getResources()Landroid/content/res/Resources;

    new-instance v0, Lkik/android/widget/cp;

    iget-object v1, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    iget-object v2, p0, Lkik/android/widget/TalkToCoverView;->n:Lkik/a/d/f;

    invoke-virtual {v2}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v2

    iget-object v3, p0, Lkik/android/widget/TalkToCoverView;->g:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "Chat Screen"

    iget-object v5, p0, Lkik/android/widget/TalkToCoverView;->a:Lcom/kik/android/a;

    iget-object v6, p0, Lkik/android/widget/TalkToCoverView;->o:Lkik/a/e/i;

    invoke-direct/range {v0 .. v6}, Lkik/android/widget/cp;-><init>(Lkik/a/d/k;Ljava/util/Vector;Landroid/content/Context;Ljava/lang/String;Lcom/kik/android/a;Lkik/a/e/i;)V

    iget-object v1, p0, Lkik/android/widget/TalkToCoverView;->i:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-virtual {v0}, Lkik/android/widget/cp;->a()Lkik/android/chat/fragment/KikDialogFragment;

    move-result-object v0

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    goto :goto_0
.end method

.method static synthetic e(Lkik/android/widget/TalkToCoverView;)Lkik/a/d/k;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    return-object v0
.end method

.method static synthetic f(Lkik/android/widget/TalkToCoverView;)Landroid/view/View;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->f:Landroid/view/View;

    return-object v0
.end method

.method static synthetic g(Lkik/android/widget/TalkToCoverView;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->g:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic h(Lkik/android/widget/TalkToCoverView;)V
    .locals 4

    .prologue
    .line 41
    iget-boolean v0, p0, Lkik/android/widget/TalkToCoverView;->k:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/kik/android/a/b;

    invoke-virtual {p0}, Lkik/android/widget/TalkToCoverView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d0028

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/kik/android/a/b;-><init>(Landroid/view/View;II)V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Lcom/kik/android/a/b;->setDuration(J)V

    new-instance v1, Lkik/android/widget/ed;

    invoke-direct {v1, p0}, Lkik/android/widget/ed;-><init>(Lkik/android/widget/TalkToCoverView;)V

    invoke-virtual {v0, v1}, Lcom/kik/android/a/b;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {p0, v0}, Lkik/android/widget/TalkToCoverView;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_0
    return-void
.end method

.method static synthetic i(Lkik/android/widget/TalkToCoverView;)Z
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/TalkToCoverView;->k:Z

    return v0
.end method

.method static synthetic j(Lkik/android/widget/TalkToCoverView;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lkik/android/widget/TalkToCoverView;->c()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 236
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->r:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/kik/android/a;Lkik/a/e/w;Lkik/a/e/r;Lkik/a/e/i;Lkik/a/e/f;)V
    .locals 0

    .prologue
    .line 150
    iput-object p1, p0, Lkik/android/widget/TalkToCoverView;->a:Lcom/kik/android/a;

    .line 151
    iput-object p2, p0, Lkik/android/widget/TalkToCoverView;->b:Lkik/a/e/w;

    .line 152
    iput-object p3, p0, Lkik/android/widget/TalkToCoverView;->c:Lkik/a/e/r;

    .line 153
    iput-object p4, p0, Lkik/android/widget/TalkToCoverView;->d:Lkik/a/e/i;

    .line 154
    iput-object p5, p0, Lkik/android/widget/TalkToCoverView;->e:Lkik/a/e/f;

    .line 155
    return-void
.end method

.method public final a(Lkik/a/d/k;Landroid/view/View;Lkik/a/d/f;Lkik/a/e/i;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 246
    iput-object p3, p0, Lkik/android/widget/TalkToCoverView;->n:Lkik/a/d/f;

    .line 247
    iput-object p4, p0, Lkik/android/widget/TalkToCoverView;->o:Lkik/a/e/i;

    .line 248
    iput-object p2, p0, Lkik/android/widget/TalkToCoverView;->p:Landroid/view/View;

    .line 249
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->p:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->p:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 250
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->p:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v0, p0, Lkik/android/widget/TalkToCoverView;->q:I

    .line 252
    :cond_0
    iput-object p1, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    .line 253
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    instance-of v0, v0, Lkik/a/d/n;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v4, p0, Lkik/android/widget/TalkToCoverView;->c:Lkik/a/e/r;

    invoke-interface {v4, v0, v1}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, p0, Lkik/android/widget/TalkToCoverView;->j:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->j:Ljava/util/ArrayList;

    iget-object v3, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    :cond_3
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->I()Z

    move-result v0

    if-nez v0, :cond_8

    :cond_4
    iget-boolean v0, p0, Lkik/android/widget/TalkToCoverView;->m:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->n:Lkik/a/d/f;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->d:Lkik/a/e/i;

    iget-object v3, p0, Lkik/android/widget/TalkToCoverView;->n:Lkik/a/d/f;

    invoke-interface {v0, v3}, Lkik/a/e/i;->a(Lkik/a/d/f;)I

    move-result v0

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_5
    move v0, v2

    :goto_1
    if-nez v0, :cond_9

    .line 255
    invoke-direct {p0}, Lkik/android/widget/TalkToCoverView;->c()V

    .line 260
    :cond_6
    :goto_2
    return-void

    .line 254
    :cond_7
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_8

    move v0, v1

    goto :goto_1

    :cond_8
    move v0, v2

    goto :goto_1

    .line 258
    :cond_9
    invoke-virtual {p0, v2}, Lkik/android/widget/TalkToCoverView;->setVisibility(I)V

    iput-boolean v2, p0, Lkik/android/widget/TalkToCoverView;->k:Z

    iput-boolean v1, p0, Lkik/android/widget/TalkToCoverView;->l:Z

    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->p:Landroid/view/View;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->p:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/widget/TalkToCoverView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d0028

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v1, p0, Lkik/android/widget/TalkToCoverView;->p:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_2
.end method

.method public final a(Lkik/android/chat/fragment/KikScopedDialogFragment;)V
    .locals 0

    .prologue
    .line 241
    iput-object p1, p0, Lkik/android/widget/TalkToCoverView;->i:Lkik/android/chat/fragment/KikScopedDialogFragment;

    .line 242
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 159
    iput-boolean p1, p0, Lkik/android/widget/TalkToCoverView;->m:Z

    .line 160
    return-void
.end method

.method protected acceptContact()V
    .locals 5
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0e01e4
        }
    .end annotation

    .prologue
    .line 68
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->j:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 85
    :goto_0
    return-void

    .line 71
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lkik/android/widget/TalkToCoverView;->j:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 72
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 73
    if-eqz v0, :cond_1

    .line 74
    iget-object v1, p0, Lkik/android/widget/TalkToCoverView;->n:Lkik/a/d/f;

    invoke-virtual {v1}, Lkik/a/d/f;->f()Lkik/a/d/s;

    move-result-object v1

    .line 75
    if-eqz v1, :cond_2

    .line 76
    iget-object v3, p0, Lkik/android/widget/TalkToCoverView;->c:Lkik/a/e/r;

    const-class v4, Lkik/a/d/a/d;

    invoke-static {v1, v4}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/d;

    invoke-interface {v3, v1}, Lkik/a/e/r;->a(Lkik/a/d/a/d;)Lcom/kik/g/p;

    .line 81
    :goto_2
    iget-object v1, p0, Lkik/android/widget/TalkToCoverView;->r:Lcom/kik/g/k;

    invoke-virtual {v1, v0}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    goto :goto_1

    .line 79
    :cond_2
    iget-object v1, p0, Lkik/android/widget/TalkToCoverView;->c:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v3

    invoke-interface {v1, v3}, Lkik/a/e/r;->a(Lkik/a/d/j;)Lcom/kik/g/p;

    goto :goto_2

    .line 84
    :cond_3
    new-instance v0, Lkik/android/widget/ec;

    invoke-direct {v0, p0}, Lkik/android/widget/ec;-><init>(Lkik/android/widget/TalkToCoverView;)V

    const-wide/16 v2, 0xa

    invoke-virtual {p0, v0, v2, v3}, Lkik/android/widget/TalkToCoverView;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 294
    iget-boolean v0, p0, Lkik/android/widget/TalkToCoverView;->l:Z

    return v0
.end method

.method protected deleteConversation()V
    .locals 7
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0e01e3
        }
    .end annotation

    .prologue
    const v6, 0x7f0902a9

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 90
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->i:Lkik/android/chat/fragment/KikScopedDialogFragment;

    if-nez v0, :cond_1

    .line 145
    :cond_0
    :goto_0
    return-void

    .line 93
    :cond_1
    invoke-virtual {p0}, Lkik/android/widget/TalkToCoverView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 94
    new-instance v2, Lkik/android/chat/fragment/KikDialogFragment;

    invoke-direct {v2}, Lkik/android/chat/fragment/KikDialogFragment;-><init>()V

    .line 95
    const v0, 0x7f090133

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lkik/android/chat/fragment/KikDialogFragment;->a(Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    instance-of v0, v0, Lkik/a/d/n;

    if-eqz v0, :cond_2

    .line 97
    new-array v0, v5, [Ljava/lang/CharSequence;

    const v3, 0x7f0902cc

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v4

    new-instance v1, Lkik/android/widget/dx;

    invoke-direct {v1, p0}, Lkik/android/widget/dx;-><init>(Lkik/android/widget/TalkToCoverView;)V

    invoke-virtual {v2, v0, v1}, Lkik/android/chat/fragment/KikDialogFragment;->a([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 144
    :goto_1
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->i:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    goto :goto_0

    .line 113
    :cond_2
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->a:Lcom/kik/android/a;

    const-string v3, "Chat Screen Ignore Clicked"

    invoke-virtual {v0, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 115
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->s:Lkik/a/d/aa;

    if-nez v0, :cond_3

    .line 117
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->b:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/TalkToCoverView;->s:Lkik/a/d/aa;

    .line 119
    :cond_3
    iget-object v0, p0, Lkik/android/widget/TalkToCoverView;->h:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lkik/android/widget/TalkToCoverView;->s:Lkik/a/d/aa;

    iget-object v3, v3, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 120
    if-eqz v0, :cond_4

    new-array v0, v5, [Ljava/lang/CharSequence;

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v4

    .line 123
    :goto_2
    new-instance v1, Lkik/android/widget/dy;

    invoke-direct {v1, p0}, Lkik/android/widget/dy;-><init>(Lkik/android/widget/TalkToCoverView;)V

    invoke-virtual {v2, v0, v1}, Lkik/android/chat/fragment/KikDialogFragment;->a([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    goto :goto_1

    .line 120
    :cond_4
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/CharSequence;

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v4

    const v3, 0x7f090296

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v5

    const/4 v3, 0x2

    const v4, 0x7f0901fb

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v3

    goto :goto_2
.end method
