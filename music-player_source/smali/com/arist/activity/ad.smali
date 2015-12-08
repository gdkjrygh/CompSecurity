.class final Lcom/arist/activity/ad;
.super Landroid/content/BroadcastReceiver;


# instance fields
.field final synthetic a:Lcom/arist/activity/MainActivity;

.field private b:I


# direct methods
.method private constructor <init>(Lcom/arist/activity/MainActivity;)V
    .locals 2

    iput-object p1, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    sget-object v0, Lcom/arist/activity/MyApplication;->p:Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lcom/arist/activity/ad;->b:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/arist/activity/MainActivity;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/arist/activity/ad;-><init>(Lcom/arist/activity/MainActivity;)V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    const/4 v3, 0x3

    const/4 v2, 0x1

    sget-object v0, Lcom/arist/c/a;->r:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "musicProgress"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iget-object v1, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v1}, Lcom/arist/activity/MainActivity;->f(Lcom/arist/activity/MainActivity;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v1}, Lcom/arist/activity/MainActivity;->c(Lcom/arist/activity/MainActivity;)Lcom/arist/model/skin/ColorProgressBar;

    move-result-object v1

    int-to-float v0, v0

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v0, v2

    invoke-static {}, Lcom/arist/activity/MyApplication;->b()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v2

    invoke-virtual {v1, v0}, Lcom/arist/model/skin/ColorProgressBar;->a(F)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    sget-object v0, Lcom/arist/c/a;->j:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->g(Lcom/arist/activity/MainActivity;)V

    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-virtual {v0}, Lcom/arist/activity/MainActivity;->e()V

    sget-object v0, Lcom/arist/activity/MyApplication;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/b/c;

    invoke-virtual {v0}, Lcom/arist/b/c;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lcom/arist/activity/ad;->b:I

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->h(Lcom/arist/activity/MainActivity;)Lcom/arist/view/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/view/a;->a()V

    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;)Lcom/arist/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/a/e;->a()I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;)Lcom/arist/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/a/e;->notifyDataSetChanged()V

    :cond_2
    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->e(Lcom/arist/activity/MainActivity;)Lcom/arist/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/a/a;->a()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->e(Lcom/arist/activity/MainActivity;)Lcom/arist/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/a/a;->b()I

    move-result v0

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->e(Lcom/arist/activity/MainActivity;)Lcom/arist/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/a/a;->notifyDataSetChanged()V

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/arist/c/a;->l:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->i(Lcom/arist/activity/MainActivity;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {}, Lcom/arist/activity/MyApplication;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    goto/16 :goto_0

    :cond_4
    sget-object v0, Lcom/arist/c/a;->z:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->h(Lcom/arist/activity/MainActivity;)Lcom/arist/view/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/view/a;->c()V

    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->e(Lcom/arist/activity/MainActivity;)Lcom/arist/a/a;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->e(Lcom/arist/activity/MainActivity;)Lcom/arist/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/a/a;->notifyDataSetChanged()V

    :cond_5
    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;)Lcom/arist/a/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;)Lcom/arist/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/a/e;->notifyDataSetChanged()V

    goto/16 :goto_0

    :cond_6
    sget-object v0, Lcom/arist/c/a;->c:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->h(Lcom/arist/activity/MainActivity;)Lcom/arist/view/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/view/a;->b()V

    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;)Lcom/arist/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/a/e;->a()I

    move-result v0

    if-ne v0, v3, :cond_7

    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->a(Lcom/arist/activity/MainActivity;)Lcom/arist/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/a/e;->notifyDataSetChanged()V

    :cond_7
    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->e(Lcom/arist/activity/MainActivity;)Lcom/arist/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/a/a;->a()I

    move-result v0

    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->e(Lcom/arist/activity/MainActivity;)Lcom/arist/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/a/a;->b()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/arist/activity/ad;->a:Lcom/arist/activity/MainActivity;

    invoke-static {v0}, Lcom/arist/activity/MainActivity;->e(Lcom/arist/activity/MainActivity;)Lcom/arist/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/a/a;->notifyDataSetChanged()V

    goto/16 :goto_0
.end method
