.class final Lcom/miteksystems/misnap/aj;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/miteksystems/misnap/u;


# direct methods
.method constructor <init>(Lcom/miteksystems/misnap/u;)V
    .locals 0

    iput-object p1, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->k(Lcom/miteksystems/misnap/u;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0, v1}, Lcom/miteksystems/misnap/u;->a(Lcom/miteksystems/misnap/u;I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->l(Lcom/miteksystems/misnap/u;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->m(Lcom/miteksystems/misnap/u;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, 0x708

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v0

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->J()I

    move-result v4

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->o(Lcom/miteksystems/misnap/u;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->p(Lcom/miteksystems/misnap/u;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->isShown()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->q(Lcom/miteksystems/misnap/u;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->i(Lcom/miteksystems/misnap/u;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->isShown()Z

    move-result v0

    if-nez v0, :cond_6

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "restarting smart-bubble in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ms (bubbleMap.size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v1}, Lcom/miteksystems/misnap/u;->o(Lcom/miteksystems/misnap/u;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", ghostImage.isShown()="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->p(Lcom/miteksystems/misnap/u;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->isShown()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "1"

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", ghostAnimationRunning="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->q(Lcom/miteksystems/misnap/u;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "1"

    :goto_2
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", !mGaugeImage.isShown()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->i(Lcom/miteksystems/misnap/u;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->isShown()Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "1"

    :goto_3
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->m(Lcom/miteksystems/misnap/u;)Landroid/os/Handler;

    move-result-object v0

    int-to-long v2, v4

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_0

    :cond_3
    const-string v0, "0"

    goto :goto_1

    :cond_4
    const-string v0, "0"

    goto :goto_2

    :cond_5
    const-string v0, "0"

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "calculating smart-bubble in "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "ms (bubbleMap.size="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v2}, Lcom/miteksystems/misnap/u;->o(Lcom/miteksystems/misnap/u;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", ghostImage.isShown()="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->p(Lcom/miteksystems/misnap/u;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->isShown()Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "1"

    :goto_4
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", ghostAnimationRunning="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->q(Lcom/miteksystems/misnap/u;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "1"

    :goto_5
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", !mGaugeImage.isShown()"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->i(Lcom/miteksystems/misnap/u;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->isShown()Z

    move-result v0

    if-nez v0, :cond_a

    const-string v0, "1"

    :goto_6
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    const/4 v0, 0x0

    iget-object v2, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v2}, Lcom/miteksystems/misnap/u;->o(Lcom/miteksystems/misnap/u;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v2, v1

    move-object v3, v0

    :cond_7
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v0

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->a:Lcom/miteksystems/misnap/MiSnapAPI;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/MiSnapAPI;->K()I

    move-result v0

    if-ge v2, v0, :cond_f

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->m(Lcom/miteksystems/misnap/u;)Landroid/os/Handler;

    move-result-object v0

    add-int/lit8 v1, v2, 0x1

    div-int v1, v4, v1

    int-to-long v2, v1

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_0

    :cond_8
    const-string v0, "0"

    goto :goto_4

    :cond_9
    const-string v0, "0"

    goto :goto_5

    :cond_a
    const-string v0, "0"

    goto :goto_6

    :cond_b
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_c

    const/4 v6, 0x1

    if-eq v6, v0, :cond_c

    const/4 v6, 0x2

    if-eq v6, v0, :cond_c

    const/4 v6, 0x3

    if-ne v6, v0, :cond_7

    :cond_c
    if-nez v0, :cond_d

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v0

    iget-object v0, v0, Lcom/miteksystems/misnap/MiSnap;->b:Lcom/miteksystems/misnap/l;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v0

    iget-boolean v0, v0, Lcom/miteksystems/misnap/MiSnap;->w:Z

    if-nez v0, :cond_7

    :cond_d
    if-eqz v3, :cond_e

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->intValue()I

    move-result v0

    if-le v0, v2, :cond_7

    :cond_e
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->intValue()I

    move-result v0

    move v2, v0

    move-object v3, v1

    goto :goto_7

    :cond_f
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const-string v0, "MiSnap"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown help bubble event "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    :pswitch_0
    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    sget v1, Lcom/miteksystems/misnap/R$drawable;->error_more_light:I

    invoke-static {v0, v1}, Lcom/miteksystems/misnap/u;->a(Lcom/miteksystems/misnap/u;I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v0

    sget v1, Lcom/miteksystems/misnap/R$string;->uxp_brightness_help:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    :goto_8
    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-virtual {v0}, Lcom/miteksystems/misnap/u;->b()V

    goto/16 :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    sget v1, Lcom/miteksystems/misnap/R$drawable;->error_center:I

    invoke-static {v0, v1}, Lcom/miteksystems/misnap/u;->a(Lcom/miteksystems/misnap/u;I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v0

    sget v1, Lcom/miteksystems/misnap/R$string;->uxp_angle_help:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    goto :goto_8

    :pswitch_2
    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    sget v1, Lcom/miteksystems/misnap/R$drawable;->error_getcloser:I

    invoke-static {v0, v1}, Lcom/miteksystems/misnap/u;->a(Lcom/miteksystems/misnap/u;I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v0

    sget v1, Lcom/miteksystems/misnap/R$string;->uxp_closeness_help:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    goto :goto_8

    :pswitch_3
    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    sget v1, Lcom/miteksystems/misnap/R$drawable;->error_hold_steady:I

    invoke-static {v0, v1}, Lcom/miteksystems/misnap/u;->a(Lcom/miteksystems/misnap/u;I)V

    iget-object v0, p0, Lcom/miteksystems/misnap/aj;->a:Lcom/miteksystems/misnap/u;

    invoke-static {v0}, Lcom/miteksystems/misnap/u;->n(Lcom/miteksystems/misnap/u;)Lcom/miteksystems/misnap/MiSnap;

    move-result-object v0

    sget v1, Lcom/miteksystems/misnap/R$string;->uxp_sharpness_help:I

    invoke-virtual {v0, v1}, Lcom/miteksystems/misnap/MiSnap;->a(I)V

    goto :goto_8

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
