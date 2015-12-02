.class public Lcom/facebook/orca/threadlist/ThreadListEmptyView;
.super Lcom/facebook/widget/f;
.source "ThreadListEmptyView.java"


# instance fields
.field private final a:Landroid/view/View;

.field private final b:Landroid/view/ViewStub;

.field private final c:Lcom/facebook/c/s;

.field private final d:Lcom/facebook/prefs/shared/d;

.field private final e:Landroid/widget/TextView;

.field private f:Lcom/facebook/orca/threadlist/a;

.field private g:Landroid/view/View;

.field private h:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 46
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 47
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 51
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    .line 54
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 43
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->h:Lcom/google/common/a/es;

    .line 56
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 58
    const-class v0, Landroid/view/LayoutInflater;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 59
    sget v2, Lcom/facebook/k;->orca_thread_list_empty_view:I

    invoke-virtual {v0, v2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 61
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->c:Lcom/facebook/c/s;

    .line 62
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->d:Lcom/facebook/prefs/shared/d;

    .line 64
    sget v0, Lcom/facebook/i;->orca_thread_list_empty_logo_and_message:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->a:Landroid/view/View;

    .line 66
    sget v0, Lcom/facebook/i;->user_grid_empty_thread_list_container_stub:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->b:Landroid/view/ViewStub;

    .line 69
    sget v0, Lcom/facebook/i;->start_conversation_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->e:Landroid/widget/TextView;

    .line 70
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/ThreadListEmptyView;)Lcom/google/common/a/es;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->h:Lcom/google/common/a/es;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/threadlist/ThreadListEmptyView;)Lcom/facebook/c/s;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->c:Lcom/facebook/c/s;

    return-object v0
.end method

.method private c()Z
    .locals 3

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->d:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->K:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    return v0
.end method

.method private d()V
    .locals 3

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->g:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 117
    :goto_0
    return-void

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->b:Landroid/view/ViewStub;

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->g:Landroid/view/View;

    .line 87
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->g:Landroid/view/View;

    sget v1, Lcom/facebook/i;->wildfire_empty_thread_close:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 89
    new-instance v1, Lcom/facebook/orca/threadlist/am;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/am;-><init>(Lcom/facebook/orca/threadlist/ThreadListEmptyView;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    new-instance v0, Lcom/facebook/orca/threadlist/a;

    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/threadlist/a;-><init>(Landroid/content/Context;Lcom/google/common/a/es;)V

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->f:Lcom/facebook/orca/threadlist/a;

    .line 98
    sget v0, Lcom/facebook/i;->grid_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    .line 99
    iget-object v1, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->f:Lcom/facebook/orca/threadlist/a;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 101
    new-instance v1, Lcom/facebook/orca/threadlist/an;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadlist/an;-><init>(Lcom/facebook/orca/threadlist/ThreadListEmptyView;)V

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 133
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->g:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 134
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 137
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/n;->K:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 140
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->a:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 141
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 144
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->h:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->d()V

    .line 148
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->g:Landroid/view/View;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->g:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 150
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->a:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 152
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->f:Lcom/facebook/orca/threadlist/a;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->h:Lcom/google/common/a/es;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/a;->a(Lcom/google/common/a/es;)V

    .line 153
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->f:Lcom/facebook/orca/threadlist/a;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/a;->notifyDataSetChanged()V

    .line 155
    :cond_0
    return-void
.end method

.method public setStartConversationTextVisibility(Z)V
    .locals 2

    .prologue
    .line 125
    if-eqz p1, :cond_0

    .line 126
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 130
    :goto_0
    return-void

    .line 128
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->e:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method public setSuggestedContacts(Lcom/google/common/a/es;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 120
    iput-object p1, p0, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->h:Lcom/google/common/a/es;

    .line 121
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/ThreadListEmptyView;->b()V

    .line 122
    return-void
.end method
