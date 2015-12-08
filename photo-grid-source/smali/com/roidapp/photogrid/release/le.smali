.class final Lcom/roidapp/photogrid/release/le;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ld;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ld;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/roidapp/photogrid/release/le;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x5

    const/4 v1, 0x0

    const/4 v4, 0x4

    const/4 v0, 0x3

    const/4 v3, 0x1

    .line 99
    iget-object v5, p0, Lcom/roidapp/photogrid/release/le;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-static {v5}, Lcom/roidapp/photogrid/release/ld;->a(Lcom/roidapp/photogrid/release/ld;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v5

    iget-boolean v5, v5, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v5, :cond_1

    .line 278
    :cond_0
    :goto_0
    return-void

    .line 102
    :cond_1
    if-eqz p3, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/release/ld;->a()I

    move-result v5

    if-eqz v5, :cond_0

    .line 113
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "From:"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v6, Lcom/roidapp/photogrid/common/az;->q:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 115
    sget v5, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v5, :pswitch_data_0

    .line 143
    :goto_1
    :pswitch_0
    iget-object v5, p0, Lcom/roidapp/photogrid/release/le;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-static {v5}, Lcom/roidapp/photogrid/release/ld;->b(Lcom/roidapp/photogrid/release/ld;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 144
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Single:"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v6

    invoke-virtual {v6}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 145
    iget-object v5, p0, Lcom/roidapp/photogrid/release/le;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-static {v5}, Lcom/roidapp/photogrid/release/ld;->c(Lcom/roidapp/photogrid/release/ld;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 146
    packed-switch p3, :pswitch_data_1

    :goto_2
    move v0, v1

    .line 268
    :goto_3
    :pswitch_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "To:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 269
    iget-object v1, p0, Lcom/roidapp/photogrid/release/le;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ld;->d(Lcom/roidapp/photogrid/release/ld;)Lcom/roidapp/photogrid/release/lj;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/roidapp/photogrid/release/lj;->a(I)V

    .line 273
    iget-object v0, p0, Lcom/roidapp/photogrid/release/le;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ld;->b(Lcom/roidapp/photogrid/release/ld;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Single:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 277
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/le;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ld;->b()V

    goto/16 :goto_0

    .line 123
    :pswitch_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v5

    invoke-virtual {v5}, Lcom/roidapp/photogrid/release/ih;->W()I

    goto :goto_1

    :pswitch_3
    move v0, v2

    .line 150
    goto :goto_3

    :pswitch_4
    move v0, v3

    .line 159
    goto :goto_3

    .line 161
    :pswitch_5
    const/4 v0, 0x6

    .line 162
    goto :goto_3

    :pswitch_6
    move v0, v4

    .line 173
    goto :goto_3

    .line 179
    :cond_3
    packed-switch p3, :pswitch_data_2

    goto :goto_2

    .line 181
    :pswitch_7
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    move v0, v2

    .line 183
    goto :goto_3

    :pswitch_8
    move v0, v3

    .line 192
    goto :goto_3

    :pswitch_9
    move v0, v4

    .line 203
    goto :goto_3

    .line 211
    :cond_4
    iget-object v2, p0, Lcom/roidapp/photogrid/release/le;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ld;->c(Lcom/roidapp/photogrid/release/ld;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 212
    packed-switch p3, :pswitch_data_3

    goto :goto_2

    :pswitch_a
    move v0, v1

    .line 215
    goto :goto_3

    :pswitch_b
    move v0, v3

    .line 218
    goto :goto_3

    .line 220
    :pswitch_c
    const/4 v0, 0x6

    .line 221
    goto :goto_3

    :pswitch_d
    move v0, v4

    .line 232
    goto :goto_3

    .line 239
    :cond_5
    packed-switch p3, :pswitch_data_4

    goto :goto_2

    :pswitch_e
    move v0, v1

    .line 242
    goto :goto_3

    :pswitch_f
    move v0, v3

    .line 245
    goto :goto_3

    :pswitch_10
    move v0, v4

    .line 256
    goto/16 :goto_3

    .line 115
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    .line 146
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_1
    .end packed-switch

    .line 179
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_1
    .end packed-switch

    .line 212
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_1
    .end packed-switch

    .line 239
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_1
    .end packed-switch
.end method
