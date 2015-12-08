.class public Lkik/android/chat/fragment/AbTestsFragment;
.super Lkik/android/chat/fragment/KikScopedDialogFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/AbTestsFragment$f;,
        Lkik/android/chat/fragment/AbTestsFragment$a;,
        Lkik/android/chat/fragment/AbTestsFragment$c;,
        Lkik/android/chat/fragment/AbTestsFragment$e;,
        Lkik/android/chat/fragment/AbTestsFragment$b;,
        Lkik/android/chat/fragment/AbTestsFragment$d;
    }
.end annotation


# instance fields
.field protected _testsList:Landroid/widget/ListView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e000d
    .end annotation
.end field

.field protected _title:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0078
    .end annotation
.end field

.field protected a:Lkik/a/a/c;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private b:Lkik/android/chat/fragment/AbTestsFragment$b;

.field private c:Lkik/android/chat/fragment/AbTestsFragment$e;

.field private d:Lkik/android/chat/fragment/AbTestsFragment$c;

.field private e:Lkik/android/chat/fragment/AbTestsFragment$a;

.field private f:Lcom/kik/view/adapters/bb;

.field private g:Ljava/util/ArrayList;

.field private h:Ljava/util/ArrayList;

.field private i:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Lkik/android/chat/fragment/KikScopedDialogFragment;-><init>()V

    .line 377
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/AbTestsFragment;)Lcom/kik/view/adapters/bb;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lkik/android/chat/fragment/AbTestsFragment;->f:Lcom/kik/view/adapters/bb;

    return-object v0
.end method

.method private a()V
    .locals 4

    .prologue
    .line 148
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lkik/android/chat/fragment/AbTestsFragment;->a:Lkik/a/a/c;

    invoke-virtual {v1}, Lkik/a/a/c;->c()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lkik/android/chat/fragment/AbTestsFragment;->g:Ljava/util/ArrayList;

    .line 149
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lkik/android/chat/fragment/AbTestsFragment;->a:Lkik/a/a/c;

    invoke-virtual {v1}, Lkik/a/a/c;->e()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lkik/android/chat/fragment/AbTestsFragment;->h:Ljava/util/ArrayList;

    .line 151
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lkik/android/chat/fragment/AbTestsFragment;->a:Lkik/a/a/c;

    invoke-virtual {v1}, Lkik/a/a/c;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lkik/android/chat/fragment/AbTestsFragment;->i:Ljava/util/ArrayList;

    .line 153
    iget-object v0, p0, Lkik/android/chat/fragment/AbTestsFragment;->a:Lkik/a/a/c;

    invoke-virtual {v0}, Lkik/a/a/c;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/a/b;

    .line 154
    iget-object v2, p0, Lkik/android/chat/fragment/AbTestsFragment;->a:Lkik/a/a/c;

    invoke-virtual {v0}, Lkik/a/a/b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkik/a/a/c;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 155
    iget-object v2, p0, Lkik/android/chat/fragment/AbTestsFragment;->i:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 158
    :cond_1
    return-void
.end method

.method static synthetic b(Lkik/android/chat/fragment/AbTestsFragment;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Lkik/android/chat/fragment/AbTestsFragment;->a()V

    return-void
.end method

.method static synthetic c(Lkik/android/chat/fragment/AbTestsFragment;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lkik/android/chat/fragment/AbTestsFragment;->g:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic d(Lkik/android/chat/fragment/AbTestsFragment;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lkik/android/chat/fragment/AbTestsFragment;->h:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic e(Lkik/android/chat/fragment/AbTestsFragment;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lkik/android/chat/fragment/AbTestsFragment;->i:Ljava/util/ArrayList;

    return-object v0
.end method


# virtual methods
.method protected final a(Lcom/kik/g/f;)V
    .locals 2

    .prologue
    .line 128
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lcom/kik/g/f;)V

    .line 130
    iget-object v0, p0, Lkik/android/chat/fragment/AbTestsFragment;->a:Lkik/a/a/c;

    invoke-virtual {v0}, Lkik/a/a/c;->f()Lcom/kik/g/e;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/c;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/c;-><init>(Lkik/android/chat/fragment/AbTestsFragment;)V

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 144
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 60
    invoke-virtual {p0}, Lkik/android/chat/fragment/AbTestsFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/AbTestsFragment;)V

    .line 62
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 63
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    .line 68
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikScopedDialogFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 69
    const/high16 v0, 0x7f030000

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 70
    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 72
    invoke-direct {p0}, Lkik/android/chat/fragment/AbTestsFragment;->a()V

    .line 74
    new-instance v1, Lcom/kik/view/adapters/bb;

    invoke-virtual {p0}, Lkik/android/chat/fragment/AbTestsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/kik/view/adapters/bb;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lkik/android/chat/fragment/AbTestsFragment;->f:Lcom/kik/view/adapters/bb;

    .line 75
    new-instance v1, Lkik/android/chat/fragment/AbTestsFragment$b;

    invoke-virtual {p0}, Lkik/android/chat/fragment/AbTestsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lkik/android/chat/fragment/AbTestsFragment$b;-><init>(Lkik/android/chat/fragment/AbTestsFragment;Landroid/content/Context;)V

    iput-object v1, p0, Lkik/android/chat/fragment/AbTestsFragment;->b:Lkik/android/chat/fragment/AbTestsFragment$b;

    .line 76
    new-instance v1, Lkik/android/chat/fragment/AbTestsFragment$e;

    invoke-virtual {p0}, Lkik/android/chat/fragment/AbTestsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lkik/android/chat/fragment/AbTestsFragment$e;-><init>(Lkik/android/chat/fragment/AbTestsFragment;Landroid/content/Context;)V

    iput-object v1, p0, Lkik/android/chat/fragment/AbTestsFragment;->c:Lkik/android/chat/fragment/AbTestsFragment$e;

    .line 77
    new-instance v1, Lkik/android/chat/fragment/AbTestsFragment$c;

    invoke-virtual {p0}, Lkik/android/chat/fragment/AbTestsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lkik/android/chat/fragment/AbTestsFragment$c;-><init>(Lkik/android/chat/fragment/AbTestsFragment;Landroid/content/Context;)V

    iput-object v1, p0, Lkik/android/chat/fragment/AbTestsFragment;->d:Lkik/android/chat/fragment/AbTestsFragment$c;

    .line 78
    new-instance v1, Lkik/android/chat/fragment/AbTestsFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/AbTestsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lkik/android/chat/fragment/AbTestsFragment$a;-><init>(Lkik/android/chat/fragment/AbTestsFragment;Landroid/content/Context;)V

    iput-object v1, p0, Lkik/android/chat/fragment/AbTestsFragment;->e:Lkik/android/chat/fragment/AbTestsFragment$a;

    .line 80
    iget-object v1, p0, Lkik/android/chat/fragment/AbTestsFragment;->f:Lcom/kik/view/adapters/bb;

    const-string v2, "Assigned Experiments"

    iget-object v3, p0, Lkik/android/chat/fragment/AbTestsFragment;->b:Lkik/android/chat/fragment/AbTestsFragment$b;

    invoke-virtual {v1, v2, v3}, Lcom/kik/view/adapters/bb;->c(Ljava/lang/String;Landroid/widget/Adapter;)V

    .line 81
    iget-object v1, p0, Lkik/android/chat/fragment/AbTestsFragment;->f:Lcom/kik/view/adapters/bb;

    const-string v2, "Overridden Experiments"

    iget-object v3, p0, Lkik/android/chat/fragment/AbTestsFragment;->c:Lkik/android/chat/fragment/AbTestsFragment$e;

    invoke-virtual {v1, v2, v3}, Lcom/kik/view/adapters/bb;->c(Ljava/lang/String;Landroid/widget/Adapter;)V

    .line 82
    iget-object v1, p0, Lkik/android/chat/fragment/AbTestsFragment;->f:Lcom/kik/view/adapters/bb;

    const-string v2, "Available Experiments"

    iget-object v3, p0, Lkik/android/chat/fragment/AbTestsFragment;->d:Lkik/android/chat/fragment/AbTestsFragment$c;

    invoke-virtual {v1, v2, v3}, Lcom/kik/view/adapters/bb;->c(Ljava/lang/String;Landroid/widget/Adapter;)V

    .line 83
    iget-object v1, p0, Lkik/android/chat/fragment/AbTestsFragment;->f:Lcom/kik/view/adapters/bb;

    const-string v2, "Misc"

    iget-object v3, p0, Lkik/android/chat/fragment/AbTestsFragment;->e:Lkik/android/chat/fragment/AbTestsFragment$a;

    invoke-virtual {v1, v2, v3}, Lcom/kik/view/adapters/bb;->c(Ljava/lang/String;Landroid/widget/Adapter;)V

    .line 85
    iget-object v1, p0, Lkik/android/chat/fragment/AbTestsFragment;->_testsList:Landroid/widget/ListView;

    iget-object v2, p0, Lkik/android/chat/fragment/AbTestsFragment;->f:Lcom/kik/view/adapters/bb;

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 87
    iget-object v1, p0, Lkik/android/chat/fragment/AbTestsFragment;->_testsList:Landroid/widget/ListView;

    new-instance v2, Lkik/android/chat/fragment/a;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/a;-><init>(Lkik/android/chat/fragment/AbTestsFragment;)V

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 120
    iget-object v1, p0, Lkik/android/chat/fragment/AbTestsFragment;->_title:Landroid/widget/TextView;

    const-string v2, "A/B Tests"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    return-object v0
.end method
