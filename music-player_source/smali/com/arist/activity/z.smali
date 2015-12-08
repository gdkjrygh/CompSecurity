.class final Lcom/arist/activity/z;
.super Ljava/lang/Thread;


# instance fields
.field final synthetic a:Lcom/arist/activity/MainActivity;

.field private final synthetic b:I

.field private final synthetic c:I


# direct methods
.method constructor <init>(Lcom/arist/activity/MainActivity;II)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/z;->a:Lcom/arist/activity/MainActivity;

    iput p2, p0, Lcom/arist/activity/z;->b:I

    iput p3, p0, Lcom/arist/activity/z;->c:I

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/arist/activity/z;)Lcom/arist/activity/MainActivity;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/z;->a:Lcom/arist/activity/MainActivity;

    return-object v0
.end method


# virtual methods
.method public final run()V
    .locals 6

    sget-object v0, Lcom/arist/activity/MyApplication;->l:Ljava/util/ArrayList;

    iget v1, p0, Lcom/arist/activity/z;->b:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v2

    iget-object v1, p0, Lcom/arist/activity/z;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v1}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;)Lcom/arist/a/e;

    move-result-object v1

    iget v3, p0, Lcom/arist/activity/z;->c:I

    invoke-virtual {v1, v3}, Lcom/arist/a/e;->b(I)Lcom/arist/b/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v1

    new-instance v3, Lcom/arist/model/b/d;

    invoke-direct {v3}, Lcom/arist/model/b/d;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, p0, Lcom/arist/activity/z;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->l(Lcom/arist/activity/MainActivity;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/arist/activity/aa;

    invoke-direct {v1, p0}, Lcom/arist/activity/aa;-><init>(Lcom/arist/activity/z;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/arist/b/b;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v1, v0}, Lcom/arist/model/b/d;->a(Lcom/arist/b/b;Lcom/arist/b/c;)V

    goto :goto_0
.end method
