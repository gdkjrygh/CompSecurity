.class final Lcom/arist/activity/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/arist/activity/a;

.field private final synthetic b:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lcom/arist/activity/a;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/b;->a:Lcom/arist/activity/a;

    iput-object p2, p0, Lcom/arist/activity/b;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/arist/activity/b;->a:Lcom/arist/activity/a;

    invoke-static {v0}, Lcom/arist/activity/a;->a(Lcom/arist/activity/a;)Lcom/arist/activity/AddToListActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/activity/AddToListActivity;->g(Lcom/arist/activity/AddToListActivity;)V

    iget-object v0, p0, Lcom/arist/activity/b;->a:Lcom/arist/activity/a;

    invoke-static {v0}, Lcom/arist/activity/a;->a(Lcom/arist/activity/a;)Lcom/arist/activity/AddToListActivity;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/arist/activity/AddToListActivity;->setResult(I)V

    iget-object v0, p0, Lcom/arist/activity/b;->a:Lcom/arist/activity/a;

    invoke-static {v0}, Lcom/arist/activity/a;->a(Lcom/arist/activity/a;)Lcom/arist/activity/AddToListActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/activity/AddToListActivity;->onBackPressed()V

    return-void

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v0}, Lcom/arist/b/c;->d()I

    move-result v2

    iget-object v3, p0, Lcom/arist/activity/b;->a:Lcom/arist/activity/a;

    invoke-static {v3}, Lcom/arist/activity/a;->a(Lcom/arist/activity/a;)Lcom/arist/activity/AddToListActivity;

    move-result-object v3

    iget-object v3, v3, Lcom/arist/activity/AddToListActivity;->a:Lcom/arist/b/c;

    invoke-virtual {v3}, Lcom/arist/b/c;->d()I

    move-result v3

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lcom/arist/activity/b;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Lcom/arist/b/c;->a(Ljava/util/ArrayList;)V

    goto :goto_0
.end method
