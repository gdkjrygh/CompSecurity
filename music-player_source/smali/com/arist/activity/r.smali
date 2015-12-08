.class final Lcom/arist/activity/r;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/activity/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/activity/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/r;->a:Lcom/arist/activity/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    const/4 v3, 0x0

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/activity/r;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v1}, Lcom/arist/activity/MainActivity;->n(Lcom/arist/activity/MainActivity;)Lcom/arist/model/a/b;

    move-result-object v1

    iget-object v2, p0, Lcom/arist/activity/r;->a:Lcom/arist/activity/MainActivity;

    iget-object v2, v2, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v1, v2}, Lcom/arist/model/a/b;->a(Lcom/arist/b/b;)V

    iget-object v1, p0, Lcom/arist/activity/r;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v1}, Lcom/arist/activity/MainActivity;->e(Lcom/arist/activity/MainActivity;)Lcom/arist/a/a;

    move-result-object v1

    iget-object v2, p0, Lcom/arist/activity/r;->a:Lcom/arist/activity/MainActivity;

    iget-object v2, v2, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v1, v2}, Lcom/arist/a/a;->a(Lcom/arist/b/b;)V

    iget-object v1, p0, Lcom/arist/activity/r;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v1}, Lcom/arist/activity/MainActivity;->e(Lcom/arist/activity/MainActivity;)Lcom/arist/a/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/a/a;->getCount()I

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, p0, Lcom/arist/activity/r;->a:Lcom/arist/activity/MainActivity;

    iput v3, v0, Lcom/arist/activity/MainActivity;->b:I

    sput v3, Lcom/arist/activity/MyApplication;->f:I

    iget-object v0, p0, Lcom/arist/activity/r;->a:Lcom/arist/activity/MainActivity;

    iput v3, v0, Lcom/arist/activity/MainActivity;->c:I

    sput v3, Lcom/arist/activity/MyApplication;->g:I

    sput v3, Lcom/arist/activity/MyApplication;->h:I

    iget-object v0, p0, Lcom/arist/activity/r;->a:Lcom/arist/activity/MainActivity;

    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/arist/c/a;->h:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/arist/activity/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    iget-object v0, p0, Lcom/arist/activity/r;->a:Lcom/arist/activity/MainActivity;

    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/arist/c/a;->j:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/arist/activity/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    iget-object v0, p0, Lcom/arist/activity/r;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->d(Lcom/arist/activity/MainActivity;)V

    iget-object v0, p0, Lcom/arist/activity/r;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0, v3}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;Z)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/arist/activity/r;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->h(Lcom/arist/activity/MainActivity;)Lcom/arist/view/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/view/a;->c()V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/arist/activity/r;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v1}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;)Lcom/arist/a/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/a/e;->notifyDataSetChanged()V

    iget-object v1, p0, Lcom/arist/activity/r;->a:Lcom/arist/activity/MainActivity;

    iget-object v1, v1, Lcom/arist/activity/MainActivity;->e:Lcom/arist/b/b;

    invoke-virtual {v1, v0}, Lcom/arist/b/b;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/arist/service/MusicPlayService;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/arist/activity/r;->a:Lcom/arist/activity/MainActivity;

    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/arist/c/a;->b:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/arist/activity/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0
.end method
