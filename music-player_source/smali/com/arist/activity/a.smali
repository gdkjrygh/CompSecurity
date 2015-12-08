.class final Lcom/arist/activity/a;
.super Ljava/lang/Thread;


# instance fields
.field final synthetic a:Lcom/arist/activity/AddToListActivity;


# direct methods
.method constructor <init>(Lcom/arist/activity/AddToListActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/a;->a:Lcom/arist/activity/AddToListActivity;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/arist/activity/a;)Lcom/arist/activity/AddToListActivity;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/a;->a:Lcom/arist/activity/AddToListActivity;

    return-object v0
.end method


# virtual methods
.method public final run()V
    .locals 3

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/arist/activity/a;->a:Lcom/arist/activity/AddToListActivity;

    invoke-static {v0}, Lcom/arist/activity/AddToListActivity;->c(Lcom/arist/activity/AddToListActivity;)[Z

    move-result-object v0

    array-length v0, v0

    if-lt v1, v0, :cond_0

    iget-object v0, p0, Lcom/arist/activity/a;->a:Lcom/arist/activity/AddToListActivity;

    invoke-static {v0}, Lcom/arist/activity/AddToListActivity;->b(Lcom/arist/activity/AddToListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/arist/activity/a;->a:Lcom/arist/activity/AddToListActivity;

    invoke-static {v0}, Lcom/arist/activity/AddToListActivity;->e(Lcom/arist/activity/AddToListActivity;)Lcom/arist/model/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/activity/a;->a:Lcom/arist/activity/AddToListActivity;

    iget-object v1, v1, Lcom/arist/activity/AddToListActivity;->a:Lcom/arist/b/c;

    invoke-virtual {v0, v2, v1}, Lcom/arist/model/b/d;->a(Ljava/util/ArrayList;Lcom/arist/b/c;)V

    iget-object v0, p0, Lcom/arist/activity/a;->a:Lcom/arist/activity/AddToListActivity;

    invoke-static {v0}, Lcom/arist/activity/AddToListActivity;->f(Lcom/arist/activity/AddToListActivity;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/arist/activity/b;

    invoke-direct {v1, p0, v2}, Lcom/arist/activity/b;-><init>(Lcom/arist/activity/a;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/arist/activity/a;->a:Lcom/arist/activity/AddToListActivity;

    invoke-static {v0}, Lcom/arist/activity/AddToListActivity;->c(Lcom/arist/activity/AddToListActivity;)[Z

    move-result-object v0

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/activity/a;->a:Lcom/arist/activity/AddToListActivity;

    invoke-static {v0}, Lcom/arist/activity/AddToListActivity;->a(Lcom/arist/activity/AddToListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/b;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method
