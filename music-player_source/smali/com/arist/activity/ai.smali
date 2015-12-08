.class final Lcom/arist/activity/ai;
.super Landroid/content/BroadcastReceiver;


# instance fields
.field final synthetic a:Lcom/arist/activity/MusicPlayActivity;


# direct methods
.method private constructor <init>(Lcom/arist/activity/MusicPlayActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/ai;->a:Lcom/arist/activity/MusicPlayActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/arist/activity/MusicPlayActivity;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/arist/activity/ai;-><init>(Lcom/arist/activity/MusicPlayActivity;)V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    sget-object v0, Lcom/arist/c/a;->q:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/activity/ai;->a:Lcom/arist/activity/MusicPlayActivity;

    invoke-virtual {v0}, Lcom/arist/activity/MusicPlayActivity;->finish()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    sget-object v0, Lcom/arist/c/a;->j:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/arist/activity/ai;->a:Lcom/arist/activity/MusicPlayActivity;

    invoke-static {v0}, Lcom/arist/activity/MusicPlayActivity;->a(Lcom/arist/activity/MusicPlayActivity;)V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/arist/c/a;->l:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/arist/activity/ai;->a:Lcom/arist/activity/MusicPlayActivity;

    invoke-static {v0}, Lcom/arist/activity/MusicPlayActivity;->b(Lcom/arist/activity/MusicPlayActivity;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {}, Lcom/arist/activity/MyApplication;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    iget-object v0, p0, Lcom/arist/activity/ai;->a:Lcom/arist/activity/MusicPlayActivity;

    invoke-static {v0}, Lcom/arist/activity/MusicPlayActivity;->c(Lcom/arist/activity/MusicPlayActivity;)Lcom/arist/model/equize/n;

    move-result-object v0

    invoke-static {}, Lcom/arist/activity/MyApplication;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/model/equize/n;->a(Z)V

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/arist/c/a;->r:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "musicProgress"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-static {}, Lcom/arist/activity/MyApplication;->b()I

    move-result v1

    iget-object v2, p0, Lcom/arist/activity/ai;->a:Lcom/arist/activity/MusicPlayActivity;

    invoke-static {v2}, Lcom/arist/activity/MusicPlayActivity;->d(Lcom/arist/activity/MusicPlayActivity;)Lcom/arist/model/skin/ColorProgressBar;

    move-result-object v2

    int-to-float v3, v0

    const/high16 v4, 0x3f800000    # 1.0f

    mul-float/2addr v3, v4

    int-to-float v4, v1

    div-float/2addr v3, v4

    invoke-virtual {v2, v3}, Lcom/arist/model/skin/ColorProgressBar;->a(F)V

    iget-object v2, p0, Lcom/arist/activity/ai;->a:Lcom/arist/activity/MusicPlayActivity;

    invoke-static {v2}, Lcom/arist/activity/MusicPlayActivity;->e(Lcom/arist/activity/MusicPlayActivity;)Landroid/widget/TextView;

    move-result-object v2

    invoke-static {v1}, Lcom/arist/c/h;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/arist/activity/ai;->a:Lcom/arist/activity/MusicPlayActivity;

    invoke-static {v1}, Lcom/arist/activity/MusicPlayActivity;->f(Lcom/arist/activity/MusicPlayActivity;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v0}, Lcom/arist/c/h;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/arist/activity/ai;->a:Lcom/arist/activity/MusicPlayActivity;

    invoke-static {v1}, Lcom/arist/activity/MusicPlayActivity;->g(Lcom/arist/activity/MusicPlayActivity;)Lcom/arist/model/lrc/LrcView;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/arist/activity/ai;->a:Lcom/arist/activity/MusicPlayActivity;

    invoke-static {v1}, Lcom/arist/activity/MusicPlayActivity;->g(Lcom/arist/activity/MusicPlayActivity;)Lcom/arist/model/lrc/LrcView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/model/lrc/LrcView;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/arist/activity/ai;->a:Lcom/arist/activity/MusicPlayActivity;

    invoke-static {v1}, Lcom/arist/activity/MusicPlayActivity;->g(Lcom/arist/activity/MusicPlayActivity;)Lcom/arist/model/lrc/LrcView;

    move-result-object v1

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Lcom/arist/model/lrc/LrcView;->a(J)V

    goto/16 :goto_0
.end method
