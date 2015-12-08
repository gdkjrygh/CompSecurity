.class final Lcom/roidapp/photogrid/bb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/ba;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/ba;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
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
    const/4 v1, 0x1

    .line 105
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->a(Lcom/roidapp/photogrid/ba;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 106
    packed-switch p3, :pswitch_data_0

    .line 181
    :cond_0
    :goto_0
    return-void

    .line 108
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/bh;->a()V

    goto :goto_0

    .line 111
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/bh;->b()V

    goto :goto_0

    .line 114
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/bh;->c()V

    goto :goto_0

    .line 117
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/bh;->d()V

    goto :goto_0

    .line 120
    :pswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/bh;->e()V

    goto :goto_0

    .line 123
    :pswitch_5
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->c(Lcom/roidapp/photogrid/ba;)Z

    .line 124
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/bh;->i()V

    goto :goto_0

    .line 127
    :pswitch_6
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/bh;->f()V

    goto :goto_0

    .line 130
    :pswitch_7
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->d(Lcom/roidapp/photogrid/ba;)I

    move-result v0

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->e(Lcom/roidapp/photogrid/ba;)I

    move-result v0

    if-eq v0, v1, :cond_1

    .line 131
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->c(Lcom/roidapp/photogrid/ba;)Z

    .line 132
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->f(Lcom/roidapp/photogrid/ba;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/roidapp/photogrid/bh;->a(I)V

    goto :goto_0

    .line 133
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->d(Lcom/roidapp/photogrid/ba;)I

    move-result v0

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->e(Lcom/roidapp/photogrid/ba;)I

    move-result v0

    if-eq v0, v1, :cond_5

    .line 135
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->d(Lcom/roidapp/photogrid/ba;)I

    move-result v0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->e(Lcom/roidapp/photogrid/ba;)I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 136
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v1}, Lcom/roidapp/photogrid/ba;->f(Lcom/roidapp/photogrid/ba;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/roidapp/photogrid/bh;->a(I)V

    goto/16 :goto_0

    .line 140
    :pswitch_8
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->d(Lcom/roidapp/photogrid/ba;)I

    move-result v0

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->e(Lcom/roidapp/photogrid/ba;)I

    move-result v0

    if-ne v0, v1, :cond_5

    .line 142
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->d(Lcom/roidapp/photogrid/ba;)I

    move-result v0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->e(Lcom/roidapp/photogrid/ba;)I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 143
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/bh;->h()V

    goto/16 :goto_0

    .line 147
    :pswitch_9
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/bh;->g()V

    goto/16 :goto_0

    .line 152
    :cond_4
    packed-switch p3, :pswitch_data_1

    goto/16 :goto_0

    .line 154
    :pswitch_a
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/bh;->a()V

    goto/16 :goto_0

    .line 157
    :pswitch_b
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/bh;->b()V

    goto/16 :goto_0

    .line 160
    :pswitch_c
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/bh;->c()V

    goto/16 :goto_0

    .line 163
    :pswitch_d
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/bh;->d()V

    goto/16 :goto_0

    .line 166
    :pswitch_e
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/bh;->e()V

    goto/16 :goto_0

    .line 169
    :pswitch_f
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/bh;->i()V

    goto/16 :goto_0

    .line 172
    :pswitch_10
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/bh;->f()V

    goto/16 :goto_0

    .line 175
    :cond_5
    :pswitch_11
    iget-object v0, p0, Lcom/roidapp/photogrid/bb;->a:Lcom/roidapp/photogrid/ba;

    invoke-static {v0}, Lcom/roidapp/photogrid/ba;->b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/bh;->g()V

    goto/16 :goto_0

    .line 106
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch

    .line 152
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
    .end packed-switch
.end method
