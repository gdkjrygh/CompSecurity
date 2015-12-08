.class final Lcom/roidapp/imagelib/filter/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/roidapp/imagelib/filter/e;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/e;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 132
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/f;->b:Lcom/roidapp/imagelib/filter/e;

    iput-object p2, p0, Lcom/roidapp/imagelib/filter/f;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    .line 135
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/f;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/f;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 152
    :cond_0
    return-void

    .line 136
    :cond_1
    const/4 v0, 0x0

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/f;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 137
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/f;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/b;

    .line 138
    iget v3, v0, Lcom/roidapp/imagelib/filter/b;->c:I

    .line 139
    iget-object v4, v0, Lcom/roidapp/imagelib/filter/b;->a:Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    .line 140
    iget v0, v0, Lcom/roidapp/imagelib/filter/b;->b:I

    .line 141
    iget-object v5, p0, Lcom/roidapp/imagelib/filter/f;->b:Lcom/roidapp/imagelib/filter/e;

    iget-object v5, v5, Lcom/roidapp/imagelib/filter/e;->a:Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-static {v5}, Lcom/roidapp/imagelib/filter/FilterListView;->a(Lcom/roidapp/imagelib/filter/FilterListView;)Lcom/roidapp/imagelib/filter/ab;

    move-result-object v5

    invoke-virtual {v4}, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/roidapp/imagelib/filter/ab;->a(J)Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v5

    .line 142
    if-eqz v5, :cond_2

    iget-object v6, p0, Lcom/roidapp/imagelib/filter/f;->b:Lcom/roidapp/imagelib/filter/e;

    iget-object v6, v6, Lcom/roidapp/imagelib/filter/e;->a:Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-static {v6}, Lcom/roidapp/imagelib/filter/FilterListView;->a(Lcom/roidapp/imagelib/filter/FilterListView;)Lcom/roidapp/imagelib/filter/ab;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/roidapp/imagelib/filter/ab;->b(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 143
    :cond_2
    iget-object v5, p0, Lcom/roidapp/imagelib/filter/f;->b:Lcom/roidapp/imagelib/filter/e;

    iget-object v5, v5, Lcom/roidapp/imagelib/filter/e;->a:Lcom/roidapp/imagelib/filter/FilterListView;

    invoke-static {v5}, Lcom/roidapp/imagelib/filter/FilterListView;->a(Lcom/roidapp/imagelib/filter/FilterListView;)Lcom/roidapp/imagelib/filter/ab;

    move-result-object v5

    add-int/2addr v0, v3

    invoke-virtual {v5, v0, v4}, Lcom/roidapp/imagelib/filter/ab;->b(ILcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 136
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method
