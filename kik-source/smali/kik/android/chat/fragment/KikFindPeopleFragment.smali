.class public Lkik/android/chat/fragment/KikFindPeopleFragment;
.super Lkik/android/chat/fragment/KikSponsoredBaseFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikFindPeopleFragment$a;
    }
.end annotation


# instance fields
.field protected a:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected b:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private final m:Lkik/android/chat/fragment/KikFindPeopleFragment$a;

.field private n:Landroid/widget/AdapterView$OnItemClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;-><init>()V

    .line 38
    new-instance v0, Lkik/android/chat/fragment/KikFindPeopleFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikFindPeopleFragment$a;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->m:Lkik/android/chat/fragment/KikFindPeopleFragment$a;

    .line 39
    new-instance v0, Lkik/android/chat/fragment/lf;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/lf;-><init>(Lkik/android/chat/fragment/KikFindPeopleFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->n:Landroid/widget/AdapterView$OnItemClickListener;

    .line 178
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikFindPeopleFragment;)V
    .locals 4

    .prologue
    .line 34
    invoke-static {}, Lkik/android/chat/KikApplication;->i()Lkik/android/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v0

    sget-object v1, Lcom/kik/d/b/a$k;->y:Lcom/kik/d/b/a$k;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;J)V

    new-instance v0, Lkik/android/chat/fragment/KikAddContactFragment$b;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikAddContactFragment$b;-><init>()V

    iget-object v1, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->m:Lkik/android/chat/fragment/KikFindPeopleFragment$a;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikFindPeopleFragment$a;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikAddContactFragment$b;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikFindPeopleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    return-void
.end method


# virtual methods
.method protected final K()I
    .locals 1

    .prologue
    .line 140
    const v0, 0x7f0900fb

    return v0
.end method

.method protected final a()V
    .locals 9

    .prologue
    .line 146
    iget-object v0, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->_contactsList:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 147
    iget-object v7, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->e:Lcom/kik/view/adapters/bb;

    iget-object v0, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->_contactsList:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0900ea

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    new-instance v0, Lcom/kik/view/adapters/bd;

    iget-object v2, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->d:Lkik/android/util/ck;

    sget-object v3, Lkik/android/util/ck$b;->a:Lkik/android/util/ck$b;

    invoke-virtual {v2, v3}, Lkik/android/util/ck;->c(Lkik/android/util/ck$b;)Ljava/util/ArrayList;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->d:Lkik/android/util/ck;

    sget-object v4, Lkik/android/util/ck$b;->a:Lkik/android/util/ck$b;

    invoke-virtual {v3, v4}, Lkik/android/util/ck;->d(Lkik/android/util/ck$b;)Ljava/util/Map;

    move-result-object v3

    iget-object v4, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->c:Lcom/kik/cache/ad;

    iget-object v5, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->a:Lkik/a/e/r;

    iget-object v6, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->l:Lcom/kik/android/a;

    invoke-direct/range {v0 .. v6}, Lcom/kik/view/adapters/bd;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/Map;Lcom/kik/cache/ad;Lkik/a/e/r;Lcom/kik/android/a;)V

    invoke-virtual {v7, v8, v0}, Lcom/kik/view/adapters/bb;->e(Ljava/lang/String;Landroid/widget/Adapter;)V

    .line 150
    return-void
.end method

.method protected final b()Z
    .locals 2

    .prologue
    .line 155
    iget-object v0, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->d:Lkik/android/util/ck;

    sget-object v1, Lkik/android/util/ck$b;->a:Lkik/android/util/ck$b;

    invoke-virtual {v0, v1}, Lkik/android/util/ck;->b(Lkik/android/util/ck$b;)Z

    move-result v0

    return v0
.end method

.method protected final c()V
    .locals 0

    .prologue
    .line 176
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 132
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 133
    iget-object v0, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->m:Lkik/android/chat/fragment/KikFindPeopleFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikFindPeopleFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikFindPeopleFragment$a;->a(Landroid/os/Bundle;)V

    .line 134
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikFindPeopleFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikFindPeopleFragment;)V

    .line 135
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .prologue
    .line 113
    const/16 v0, 0x1c

    .line 116
    invoke-static {}, Lkik/android/util/u;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 118
    const/16 v0, 0x3c

    .line 120
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v1

    .line 121
    iget-object v2, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->e:Lcom/kik/view/adapters/bb;

    iget-object v3, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->_contactsList:Landroid/widget/ListView;

    invoke-virtual {v3}, Landroid/widget/ListView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f090014

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/kik/view/adapters/a;

    iget-object v5, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->_contactsList:Landroid/widget/ListView;

    invoke-virtual {v5}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5, v0}, Lcom/kik/view/adapters/a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v2, v3, v4}, Lcom/kik/view/adapters/bb;->d(Ljava/lang/String;Landroid/widget/Adapter;)V

    .line 123
    iget-object v0, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->_contactsList:Landroid/widget/ListView;

    iget-object v2, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->e:Lcom/kik/view/adapters/bb;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 124
    iget-object v0, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->_contactsList:Landroid/widget/ListView;

    iget-object v2, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->n:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 125
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikFindPeopleFragment;->e()V

    .line 126
    return-object v1
.end method

.method public onResume()V
    .locals 3

    .prologue
    .line 86
    invoke-super {p0}, Lkik/android/chat/fragment/KikSponsoredBaseFragment;->onResume()V

    .line 88
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikFindPeopleFragment;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 89
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikFindPeopleFragment;->d()V

    .line 90
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 91
    iget-object v0, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->d:Lkik/android/util/ck;

    sget-object v2, Lkik/android/util/ck$b;->a:Lkik/android/util/ck$b;

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

    .line 92
    invoke-virtual {v0}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 94
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->l:Lcom/kik/android/a;

    const-string v2, "Promoted Chat View"

    invoke-virtual {v0, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v2, "Bots"

    invoke-virtual {v1}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 104
    :goto_1
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikFindPeopleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 105
    if-eqz v0, :cond_1

    .line 106
    iget-object v0, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->d:Lkik/android/util/ck;

    sget-object v1, Lkik/android/util/ck$b;->b:Lkik/android/util/ck$b;

    invoke-virtual {v0, v1}, Lkik/android/util/ck;->a(Lkik/android/util/ck$b;)V

    .line 108
    :cond_1
    return-void

    .line 99
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikFindPeopleFragment;->l:Lcom/kik/android/a;

    const-string v1, "Promoted Chat Slow Response"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_1
.end method

.method public final v()Z
    .locals 2

    .prologue
    .line 161
    new-instance v0, Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;-><init>()V

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikFindPeopleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->a()Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 162
    const/4 v0, 0x1

    return v0
.end method
