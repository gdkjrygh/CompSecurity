.class final Lcom/miteksystems/misnap/d;
.super Landroid/os/Handler;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/MiSnap;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/MiSnap;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->c()V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->a(Lcom/miteksystems/misnap/MiSnap;)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->g()V

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/u;->b(I)V

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$string;->uxp_help_button:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->g()V

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/u;->b(I)V

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$string;->uxp_touch_screen:I

    iget-object v2, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v2}, Lcom/miteksystems/misnap/MiSnap;->c(Lcom/miteksystems/misnap/MiSnap;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v2, v3}, Lcom/miteksystems/misnap/MiSnap;->a(Lcom/miteksystems/misnap/MiSnap;I)V

    invoke-virtual {v0, v1, v3}, Lcom/miteksystems/misnap/MiSnap;->a(II)V

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->c(Lcom/miteksystems/misnap/MiSnap;)I

    move-result v0

    iget-object v1, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    iget-object v1, v1, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnapAPI;->O()I

    move-result v1

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->g()V

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->i()V

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/u;->b(I)V

    goto/16 :goto_0

    :pswitch_6
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$string;->uxp_timeout_help_end:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->onBackPressed()V

    goto/16 :goto_0

    :pswitch_7
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->h()V

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->g()V

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    sget v1, Lcom/miteksystems/misnap/R$string;->uxp_measured_failover:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->N()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/miteksystems/misnap/u;->b(I)V

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->i()V

    :cond_3
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->b()V

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->v:Landroid/os/Handler;

    iget-object v1, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v1}, Lcom/miteksystems/misnap/MiSnap;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->i()V

    :cond_5
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    const/4 v1, 0x0

    const-string v2, "VideoCaptureFailed"

    invoke-virtual {v0, v3, v1, v2}, Lcom/miteksystems/misnap/MiSnap;->a(ILandroid/content/Intent;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_8
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnap;->i()V

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->d()V

    goto/16 :goto_0

    :pswitch_9
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/l;->f()V

    goto/16 :goto_0

    :pswitch_a
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/l;->l()V

    goto/16 :goto_0

    :pswitch_b
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->k()V

    goto/16 :goto_0

    :pswitch_c
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/l;->g()V

    goto/16 :goto_0

    :pswitch_d
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->m()V

    goto/16 :goto_0

    :pswitch_e
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/l;->d()V

    goto/16 :goto_0

    :pswitch_f
    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/miteksystems/misnap/d;->a:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {v0}, Lcom/miteksystems/misnap/MiSnap;->b(Lcom/miteksystems/misnap/MiSnap;)Lcom/miteksystems/misnap/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->h()V

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_5
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
    .end packed-switch
.end method
