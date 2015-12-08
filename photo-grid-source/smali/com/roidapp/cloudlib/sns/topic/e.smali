.class public final Lcom/roidapp/cloudlib/sns/topic/e;
.super Lcom/roidapp/cloudlib/sns/topic/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/topic/b",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/w;",
        ">;"
    }
.end annotation


# instance fields
.field private final m:Lcom/roidapp/cloudlib/sns/aa;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/cloudlib/sns/aa",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/w;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Lcom/roidapp/cloudlib/sns/aa;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/cloudlib/sns/aa",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/w;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/topic/b;-><init>()V

    .line 26
    new-instance v0, Lcom/roidapp/cloudlib/sns/topic/f;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/topic/f;-><init>(Lcom/roidapp/cloudlib/sns/topic/e;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->m:Lcom/roidapp/cloudlib/sns/aa;

    .line 53
    new-instance v0, Lcom/roidapp/cloudlib/sns/topic/g;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/topic/g;-><init>(Lcom/roidapp/cloudlib/sns/topic/e;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->n:Lcom/roidapp/cloudlib/sns/aa;

    return-void
.end method

.method private a(ZI)Lcom/roidapp/cloudlib/sns/o;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/w;",
            ">;"
        }
    .end annotation

    .prologue
    .line 144
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->i:Z

    .line 145
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 146
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->g:Lcom/roidapp/cloudlib/sns/b/p;

    .line 147
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->g:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->f:Lcom/roidapp/cloudlib/sns/b/x;

    .line 149
    if-nez p1, :cond_0

    .line 150
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->g:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->f:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/topic/e;->a:Ljava/lang/String;

    iget-object v6, p0, Lcom/roidapp/cloudlib/sns/topic/e;->m:Lcom/roidapp/cloudlib/sns/aa;

    move v5, p2

    invoke-static/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;JLjava/lang/String;ILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 166
    :goto_0
    return-object v0

    .line 155
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->g:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->f:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/topic/e;->a:Ljava/lang/String;

    iget-object v6, p0, Lcom/roidapp/cloudlib/sns/topic/e;->n:Lcom/roidapp/cloudlib/sns/aa;

    move v5, p2

    invoke-static/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;JLjava/lang/String;ILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    goto :goto_0

    .line 161
    :cond_1
    if-nez p1, :cond_2

    .line 162
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/e;->m:Lcom/roidapp/cloudlib/sns/aa;

    invoke-static {v0, p2, v1}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;ILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    goto :goto_0

    .line 166
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/e;->n:Lcom/roidapp/cloudlib/sns/aa;

    invoke-static {v0, p2, v1}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;ILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroid/view/View;
    .locals 3

    .prologue
    .line 92
    new-instance v0, Lcom/roidapp/cloudlib/sns/ab;

    invoke-direct {v0, p1}, Lcom/roidapp/cloudlib/sns/ab;-><init>(Landroid/content/Context;)V

    .line 93
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "#"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/e;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Ljava/lang/CharSequence;)V

    .line 94
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/e;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Landroid/view/View$OnClickListener;)V

    .line 95
    return-object v0
.end method

.method protected final a(Lcom/roidapp/cloudlib/sns/b/n;)V
    .locals 5

    .prologue
    .line 223
    new-instance v1, Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/sns/b/a/e;-><init>()V

    .line 225
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->b:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->b:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->size()I

    move-result v0

    const/4 v2, 0x5

    if-ne v0, v2, :cond_0

    .line 226
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->b:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->addAll(Ljava/util/Collection;)Z

    .line 228
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-eqz v0, :cond_1

    .line 229
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->addAll(Ljava/util/Collection;)Z

    .line 232
    :cond_1
    invoke-virtual {v1, p1}, Lcom/roidapp/cloudlib/sns/b/a/e;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 233
    new-instance v2, Lcom/roidapp/cloudlib/sns/topic/i;

    invoke-direct {v2}, Lcom/roidapp/cloudlib/sns/topic/i;-><init>()V

    .line 234
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/topic/e;->a:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x1

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/topic/e;->b:Ljava/lang/String;

    invoke-virtual {v2, v3, v1, v0, v4}, Lcom/roidapp/cloudlib/sns/topic/i;->a(Ljava/lang/String;Lcom/roidapp/cloudlib/sns/b/a/e;ILjava/lang/String;)V

    .line 235
    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/sns/topic/e;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    .line 236
    return-void
.end method

.method protected final a(Z)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 100
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/topic/b;->a(Z)V

    .line 101
    invoke-static {}, Lcom/roidapp/cloudlib/sns/f/a;->a()Lcom/roidapp/cloudlib/sns/f/a;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/e;->b:Ljava/lang/String;

    new-array v2, v5, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/topic/e;->a:Ljava/lang/String;

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lcom/roidapp/cloudlib/sns/f/a;->a(Ljava/lang/String;I)V

    .line 102
    if-eqz p1, :cond_0

    .line 103
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v5}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 104
    invoke-direct {p0, v4, v4}, Lcom/roidapp/cloudlib/sns/topic/e;->a(ZI)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 105
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 117
    :goto_0
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "TopicPage/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/topic/e;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/al;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 118
    const-string v0, "TopicPage"

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/e;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    return-void

    .line 108
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->d:Lcom/roidapp/baselib/c/y;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    if-nez v0, :cond_2

    .line 109
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v5}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 110
    invoke-direct {p0, v4, v4}, Lcom/roidapp/cloudlib/sns/topic/e;->a(ZI)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 111
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 113
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    iget-boolean v1, p0, Lcom/roidapp/cloudlib/sns/topic/e;->i:Z

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 114
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/topic/e;->b(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method protected final synthetic a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 24
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/w;

    .line 1175
    if-eqz p1, :cond_2

    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/w;->a:Lcom/roidapp/cloudlib/sns/b/d;

    if-nez v0, :cond_1

    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/w;->b:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/w;->b:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-eqz v0, :cond_2

    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    .line 24
    goto :goto_0
.end method

.method protected final b()V
    .locals 3

    .prologue
    .line 123
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/topic/b;->b()V

    .line 124
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->h:Lcom/roidapp/cloudlib/sns/o;

    if-eqz v0, :cond_1

    .line 125
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->h:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->f()V

    .line 126
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->c:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 129
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->i:Z

    .line 131
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->d:Lcom/roidapp/baselib/c/y;

    if-eqz v0, :cond_3

    .line 132
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/e;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 133
    const-string v0, "TopicPage"

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/e;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/e;->k()I

    move-result v0

    .line 136
    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 137
    const-string v1, "TopicPage"

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/topic/e;->a:Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;Ljava/lang/String;I)V

    .line 140
    :cond_3
    const-string v0, "TopicPage"

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/topic/e;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/e;->a()I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 141
    return-void
.end method

.method protected final d()V
    .locals 1

    .prologue
    .line 240
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->l:Z

    .line 241
    return-void
.end method

.method protected final f()Landroid/support/v7/widget/au;
    .locals 2

    .prologue
    .line 184
    new-instance v0, Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/e;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroid/support/v7/widget/GridLayoutManager;-><init>(I)V

    .line 185
    new-instance v1, Lcom/roidapp/cloudlib/sns/topic/h;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/topic/h;-><init>(Lcom/roidapp/cloudlib/sns/topic/e;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/GridLayoutManager;->a(Landroid/support/v7/widget/t;)V

    .line 192
    return-object v0
.end method

.method protected final g()Lcom/roidapp/cloudlib/sns/topic/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/roidapp/cloudlib/sns/topic/a",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/w;",
            "Lcom/roidapp/cloudlib/sns/b/n;",
            ">;"
        }
    .end annotation

    .prologue
    .line 197
    new-instance v0, Lcom/roidapp/cloudlib/sns/topic/d;

    invoke-direct {v0, p0, p0}, Lcom/roidapp/cloudlib/sns/topic/d;-><init>(Landroid/support/v4/app/Fragment;Landroid/view/View$OnClickListener;)V

    return-object v0
.end method

.method protected final l()Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 208
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->j:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->i:Z

    if-eqz v0, :cond_1

    :cond_0
    move v0, v2

    .line 218
    :goto_0
    return v0

    .line 212
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 213
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->k:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/w;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2, v0}, Lcom/roidapp/cloudlib/sns/b/a/e;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v0, v0, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    invoke-direct {p0, v1, v0}, Lcom/roidapp/cloudlib/sns/topic/e;->a(ZI)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->h:Lcom/roidapp/cloudlib/sns/o;

    .line 214
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/e;->h:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    move v0, v1

    .line 215
    goto :goto_0

    :cond_2
    move v0, v2

    .line 218
    goto :goto_0
.end method

.method public final onRefresh()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 202
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/topic/e;->m()Z

    .line 203
    invoke-direct {p0, v0, v0}, Lcom/roidapp/cloudlib/sns/topic/e;->a(ZI)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 204
    return-void
.end method
