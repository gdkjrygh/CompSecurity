.class public Lcom/facebook/orca/threadview/aq;
.super Landroid/widget/BaseAdapter;
.source "ThreadMemberListAdapter.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/view/LayoutInflater;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/LayoutInflater;)V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 32
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/aq;->c:Ljava/util/List;

    .line 37
    iput-object p1, p0, Lcom/facebook/orca/threadview/aq;->a:Landroid/content/Context;

    .line 38
    iput-object p2, p0, Lcom/facebook/orca/threadview/aq;->b:Landroid/view/LayoutInflater;

    .line 39
    return-void
.end method

.method private a(Lcom/facebook/orca/threads/ThreadParticipant;Landroid/view/View;)Landroid/view/View;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 80
    .line 81
    if-nez p2, :cond_0

    .line 82
    iget-object v0, p0, Lcom/facebook/orca/threadview/aq;->b:Landroid/view/LayoutInflater;

    sget v2, Lcom/facebook/k;->orca_thread_member_item:I

    invoke-virtual {v0, v2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 85
    :cond_0
    sget v0, Lcom/facebook/i;->member_user:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 86
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v2

    .line 87
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    sget v0, Lcom/facebook/i;->member_email:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 92
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 93
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v1

    .line 100
    :cond_1
    :goto_0
    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 101
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 107
    :goto_1
    sget v0, Lcom/facebook/i;->member_user_img:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/tiles/UserTileView;

    .line 108
    invoke-static {p1}, Lcom/facebook/orca/photos/a/f;->a(Lcom/facebook/orca/threads/ThreadParticipant;)Lcom/facebook/user/tiles/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/user/tiles/UserTileView;->setParams(Lcom/facebook/user/tiles/e;)V

    .line 110
    return-object p2

    .line 94
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->b()Z

    move-result v2

    if-nez v2, :cond_1

    .line 95
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 97
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->e()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 103
    :cond_3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/orca/threadview/aq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/orca/threadview/aq;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 71
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/orca/threadview/aq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 53
    const/4 v0, 0x0

    .line 55
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/orca/threadview/aq;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    invoke-direct {p0, v0, p2}, Lcom/facebook/orca/threadview/aq;->a(Lcom/facebook/orca/threads/ThreadParticipant;Landroid/view/View;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getViewTypeCount()I
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x2

    return v0
.end method
