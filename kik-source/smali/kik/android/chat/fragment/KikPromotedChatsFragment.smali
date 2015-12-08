.class public Lkik/android/chat/fragment/KikPromotedChatsFragment;
.super Lkik/android/chat/fragment/KikSponsoredBaseFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikPromotedChatsFragment$a;
    }
.end annotation


# instance fields
.field protected a:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private b:Landroid/widget/AdapterView$OnItemClickListener;

.field private m:Lcom/kik/g/i;

.field private n:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;-><init>()V

    .line 33
    new-instance v0, Lkik/android/chat/fragment/oc;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/oc;-><init>(Lkik/android/chat/fragment/KikPromotedChatsFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->b:Landroid/widget/AdapterView$OnItemClickListener;

    .line 147
    new-instance v0, Lkik/android/chat/fragment/of;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/of;-><init>(Lkik/android/chat/fragment/KikPromotedChatsFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->m:Lcom/kik/g/i;

    .line 177
    new-instance v0, Lkik/android/chat/fragment/oh;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/oh;-><init>(Lkik/android/chat/fragment/KikPromotedChatsFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->n:Ljava/lang/Runnable;

    .line 197
    return-void
.end method


# virtual methods
.method protected final K()I
    .locals 1

    .prologue
    .line 121
    const v0, 0x7f0900f2

    return v0
.end method

.method protected final a()V
    .locals 9

    .prologue
    .line 127
    iget-object v0, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->_contactsList:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 128
    iget-object v0, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->_contactsList:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f090223

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 129
    iget-object v0, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->e:Lcom/kik/view/adapters/bb;

    invoke-virtual {v0, v7}, Lcom/kik/view/adapters/bb;->a(Ljava/lang/String;)Landroid/widget/Adapter;

    move-result-object v0

    if-nez v0, :cond_0

    .line 130
    iget-object v8, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->e:Lcom/kik/view/adapters/bb;

    new-instance v0, Lcom/kik/view/adapters/bd;

    iget-object v2, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->d:Lkik/android/util/ck;

    sget-object v3, Lkik/android/util/ck$b;->b:Lkik/android/util/ck$b;

    invoke-virtual {v2, v3}, Lkik/android/util/ck;->c(Lkik/android/util/ck$b;)Ljava/util/ArrayList;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->d:Lkik/android/util/ck;

    sget-object v4, Lkik/android/util/ck$b;->b:Lkik/android/util/ck$b;

    invoke-virtual {v3, v4}, Lkik/android/util/ck;->d(Lkik/android/util/ck$b;)Ljava/util/Map;

    move-result-object v3

    iget-object v4, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->c:Lcom/kik/cache/ad;

    iget-object v5, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->a:Lkik/a/e/r;

    iget-object v6, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->l:Lcom/kik/android/a;

    invoke-direct/range {v0 .. v6}, Lcom/kik/view/adapters/bd;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/Map;Lcom/kik/cache/ad;Lkik/a/e/r;Lcom/kik/android/a;)V

    const/4 v1, 0x0

    invoke-virtual {v8, v7, v0, v1}, Lcom/kik/view/adapters/bb;->c(Ljava/lang/String;Landroid/widget/Adapter;Z)V

    .line 135
    :goto_0
    return-void

    .line 133
    :cond_0
    iget-object v8, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->e:Lcom/kik/view/adapters/bb;

    new-instance v0, Lcom/kik/view/adapters/bd;

    iget-object v2, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->d:Lkik/android/util/ck;

    sget-object v3, Lkik/android/util/ck$b;->b:Lkik/android/util/ck$b;

    invoke-virtual {v2, v3}, Lkik/android/util/ck;->c(Lkik/android/util/ck$b;)Ljava/util/ArrayList;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->d:Lkik/android/util/ck;

    sget-object v4, Lkik/android/util/ck$b;->b:Lkik/android/util/ck$b;

    invoke-virtual {v3, v4}, Lkik/android/util/ck;->d(Lkik/android/util/ck$b;)Ljava/util/Map;

    move-result-object v3

    iget-object v4, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->c:Lcom/kik/cache/ad;

    iget-object v5, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->a:Lkik/a/e/r;

    iget-object v6, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->l:Lcom/kik/android/a;

    invoke-direct/range {v0 .. v6}, Lcom/kik/view/adapters/bd;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/Map;Lcom/kik/cache/ad;Lkik/a/e/r;Lcom/kik/android/a;)V

    invoke-virtual {v8, v7, v0}, Lcom/kik/view/adapters/bb;->e(Ljava/lang/String;Landroid/widget/Adapter;)V

    goto :goto_0
.end method

.method protected final a(Lcom/kik/g/f;)V
    .locals 5

    .prologue
    .line 64
    iget-object v0, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->d:Lkik/android/util/ck;

    invoke-virtual {v0}, Lkik/android/util/ck;->a()Lcom/kik/g/e;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/od;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/od;-><init>(Lkik/android/chat/fragment/KikPromotedChatsFragment;)V

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 82
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPromotedChatsFragment;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->d:Lkik/android/util/ck;

    invoke-virtual {v0}, Lkik/android/util/ck;->b()I

    move-result v0

    if-lez v0, :cond_1

    .line 83
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPromotedChatsFragment;->d()V

    .line 84
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 85
    iget-object v0, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->d:Lkik/android/util/ck;

    sget-object v2, Lkik/android/util/ck$b;->b:Lkik/android/util/ck$b;

    invoke-virtual {v0, v2}, Lkik/android/util/ck;->c(Lkik/android/util/ck$b;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 86
    invoke-virtual {v0}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 88
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->l:Lcom/kik/android/a;

    const-string v2, "Suggested Chat View"

    invoke-virtual {v0, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v2, "Bots"

    invoke-virtual {v1}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 91
    iget-object v0, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->d:Lkik/android/util/ck;

    invoke-virtual {v0}, Lkik/android/util/ck;->a()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->m:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 101
    :goto_1
    return-void

    .line 97
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->f:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v1, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->n:Ljava/lang/Runnable;

    const-wide/16 v2, 0x7530

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->g:Ljava/util/concurrent/ScheduledFuture;

    .line 98
    iget-object v0, p0, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->_loadingLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 99
    iget-object v0, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->d:Lkik/android/util/ck;

    invoke-virtual {v0}, Lkik/android/util/ck;->a()Lcom/kik/g/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->m:Lcom/kik/g/i;

    invoke-virtual {p1, v0, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    goto :goto_1
.end method

.method protected final b()Z
    .locals 2

    .prologue
    .line 144
    iget-object v0, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->d:Lkik/android/util/ck;

    sget-object v1, Lkik/android/util/ck$b;->b:Lkik/android/util/ck$b;

    invoke-virtual {v0, v1}, Lkik/android/util/ck;->b(Lkik/android/util/ck$b;)Z

    move-result v0

    return v0
.end method

.method protected final c()V
    .locals 2

    .prologue
    .line 139
    iget-object v0, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->_emptyView:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 140
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 106
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 107
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikPromotedChatsFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikPromotedChatsFragment;)V

    .line 108
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    .line 113
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    .line 114
    iget-object v1, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->_contactsList:Landroid/widget/ListView;

    iget-object v2, p0, Lkik/android/chat/fragment/KikPromotedChatsFragment;->b:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 115
    return-object v0
.end method
