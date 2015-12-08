.class public abstract Lkik/android/chat/fragment/KikSponsoredBaseFragment;
.super Lkik/android/chat/fragment/KikIqFragmentBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikSponsoredBaseFragment$a;
    }
.end annotation


# instance fields
.field _contactsList:Landroid/widget/ListView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0086
    .end annotation
.end field

.field _emptyView:Landroid/widget/LinearLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e003e
    .end annotation
.end field

.field _loadingLayout:Landroid/widget/LinearLayout;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0087
    .end annotation
.end field

.field private a:Ljava/util/HashSet;

.field private b:Ljava/util/HashSet;

.field c:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContactImageLoader"
    .end annotation
.end field

.field protected d:Lkik/android/util/ck;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected e:Lcom/kik/view/adapters/bb;

.field protected f:Ljava/util/concurrent/ScheduledExecutorService;

.field protected g:Ljava/util/concurrent/ScheduledFuture;

.field protected h:Z

.field protected i:Z

.field protected j:Ljava/lang/String;

.field protected k:I

.field protected l:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private m:Landroid/widget/AbsListView$OnScrollListener;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 37
    invoke-direct {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;-><init>()V

    .line 46
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->a:Ljava/util/HashSet;

    .line 47
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->b:Ljava/util/HashSet;

    .line 50
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->h:Z

    .line 51
    iput-boolean v1, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->i:Z

    .line 74
    new-instance v0, Lkik/android/chat/fragment/pn;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/pn;-><init>(Lkik/android/chat/fragment/KikSponsoredBaseFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->m:Landroid/widget/AbsListView$OnScrollListener;

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikSponsoredBaseFragment;)Ljava/util/HashSet;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->a:Ljava/util/HashSet;

    return-object v0
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikSponsoredBaseFragment;)Ljava/util/HashSet;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->b:Ljava/util/HashSet;

    return-object v0
.end method

.method private f()V
    .locals 5

    .prologue
    .line 68
    iget-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->e:Lcom/kik/view/adapters/bb;

    if-eqz v0, :cond_1

    .line 69
    iget-object v2, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->e:Lcom/kik/view/adapters/bb;

    iget-object v1, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->b:Ljava/util/HashSet;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v0

    new-array v3, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/kik/view/adapters/bb;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v3, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 70
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->b:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 72
    :cond_1
    return-void
.end method


# virtual methods
.method protected abstract a()V
.end method

.method protected final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 119
    new-instance v0, Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatFragment$a;-><init>()V

    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Z)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->j:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatFragment$a;->c(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 120
    return-void
.end method

.method protected final b(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 242
    new-instance v0, Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;-><init>()V

    .line 243
    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->d(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->j:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->c(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    .line 244
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 245
    return-void
.end method

.method protected abstract b()Z
.end method

.method protected abstract c()V
.end method

.method protected final d()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 170
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->e()V

    .line 171
    iget-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->_emptyView:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 172
    iget v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->k:I

    sget v1, Lkik/android/chat/fragment/KikSponsoredBaseFragment$a;->c:I

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 174
    iget-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->g:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 175
    iget-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->g:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 177
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->d:Lkik/android/util/ck;

    invoke-virtual {v0}, Lkik/android/util/ck;->b()I

    move-result v0

    if-nez v0, :cond_1

    .line 178
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->c()V

    .line 195
    :goto_0
    return-void

    .line 182
    :cond_1
    sget v0, Lkik/android/chat/fragment/KikSponsoredBaseFragment$a;->b:I

    iput v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->k:I

    .line 183
    iget-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->_contactsList:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setVisibility(I)V

    .line 185
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->a()V

    .line 186
    iget-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->_contactsList:Landroid/widget/ListView;

    iget-object v1, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->e:Lcom/kik/view/adapters/bb;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 187
    iget-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->_contactsList:Landroid/widget/ListView;

    invoke-static {v0}, Lcom/kik/m/n;->a(Landroid/widget/ListView;)V

    .line 188
    iget-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->_contactsList:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->invalidate()V

    goto :goto_0

    .line 191
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->_emptyView:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 192
    iget-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->l:Lcom/kik/android/a;

    const-string v1, "Suggested Chat Slow Response"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_0
.end method

.method protected final e()V
    .locals 2

    .prologue
    .line 218
    iget-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->_loadingLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 219
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 125
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikSponsoredBaseFragment;)V

    .line 126
    sget v0, Lkik/android/chat/fragment/KikSponsoredBaseFragment$a;->a:I

    iput v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->k:I

    .line 127
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->f:Ljava/util/concurrent/ScheduledExecutorService;

    .line 128
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->onCreate(Landroid/os/Bundle;)V

    .line 129
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    .line 157
    const v0, 0x7f030014

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 158
    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 159
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikIqFragmentBase;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 160
    sget v1, Lkik/android/chat/fragment/KikSponsoredBaseFragment$a;->a:I

    iput v1, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->k:I

    .line 161
    iget-object v1, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->_contactsList:Landroid/widget/ListView;

    const-string v2, "AUTOMATION_SPONSORED_LIST"

    invoke-static {v1, v2}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 162
    iget-object v1, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->_contactsList:Landroid/widget/ListView;

    iget-object v2, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->m:Landroid/widget/AbsListView$OnScrollListener;

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 163
    iget-object v1, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->_contactsList:Landroid/widget/ListView;

    invoke-virtual {v1}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 164
    new-instance v2, Lcom/kik/view/adapters/bb;

    invoke-direct {v2, v1}, Lcom/kik/view/adapters/bb;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->e:Lcom/kik/view/adapters/bb;

    .line 165
    return-object v0
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 113
    invoke-direct {p0}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->f()V

    .line 114
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onPause()V

    .line 115
    return-void
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 99
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->getUserVisibleHint()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->G()V

    .line 101
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->j:Ljava/lang/String;

    .line 106
    :goto_0
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onResume()V

    .line 107
    return-void

    .line 104
    :cond_0
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->F()V

    goto :goto_0
.end method

.method public setUserVisibleHint(Z)V
    .locals 1

    .prologue
    .line 134
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->setUserVisibleHint(Z)V

    .line 135
    iput-boolean p1, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->i:Z

    .line 136
    if-eqz p1, :cond_1

    .line 138
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->j:Ljava/lang/String;

    .line 152
    :cond_0
    :goto_0
    return-void

    .line 142
    :cond_1
    invoke-direct {p0}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->f()V

    .line 143
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->h:Z

    if-eqz v0, :cond_0

    .line 146
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->h:Z

    .line 147
    sget v0, Lkik/android/chat/fragment/KikSponsoredBaseFragment$a;->a:I

    iput v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->k:I

    .line 148
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->d()V

    goto :goto_0
.end method
