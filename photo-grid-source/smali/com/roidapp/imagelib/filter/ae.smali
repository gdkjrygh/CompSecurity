.class final Lcom/roidapp/imagelib/filter/ae;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/filter/bn;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/ImageColorView;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/ImageColorView;)V
    .locals 0

    .prologue
    .line 147
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/ae;->a:Lcom/roidapp/imagelib/filter/ImageColorView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 182
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ae;->a:Lcom/roidapp/imagelib/filter/ImageColorView;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->b(Lcom/roidapp/imagelib/filter/ImageColorView;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 183
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/filter/bk;I)V
    .locals 2

    .prologue
    .line 152
    invoke-virtual {p1}, Lcom/roidapp/imagelib/filter/bk;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/ai;

    .line 153
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/ae;->a:Lcom/roidapp/imagelib/filter/ImageColorView;

    invoke-static {v1}, Lcom/roidapp/imagelib/filter/ImageColorView;->a(Lcom/roidapp/imagelib/filter/ImageColorView;)Lcom/roidapp/imagelib/filter/ag;

    move-result-object v1

    invoke-interface {v1}, Lcom/roidapp/imagelib/filter/ag;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 178
    :goto_0
    return-void

    .line 156
    :cond_0
    sget-object v1, Lcom/roidapp/imagelib/filter/af;->a:[I

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/ai;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 174
    :goto_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ae;->a:Lcom/roidapp/imagelib/filter/ImageColorView;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->b(Lcom/roidapp/imagelib/filter/ImageColorView;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 158
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ae;->a:Lcom/roidapp/imagelib/filter/ImageColorView;

    add-int/lit16 v1, p2, 0x96

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/filter/ImageColorView;->a(Lcom/roidapp/imagelib/filter/ImageColorView;I)I

    .line 159
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ae;->a:Lcom/roidapp/imagelib/filter/ImageColorView;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->a(Lcom/roidapp/imagelib/filter/ImageColorView;)Lcom/roidapp/imagelib/filter/ag;

    move-result-object v0

    add-int/lit16 v1, p2, 0x96

    invoke-interface {v0, v1}, Lcom/roidapp/imagelib/filter/ag;->b(I)V

    goto :goto_1

    .line 162
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ae;->a:Lcom/roidapp/imagelib/filter/ImageColorView;

    add-int/lit8 v1, p2, 0x64

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/filter/ImageColorView;->b(Lcom/roidapp/imagelib/filter/ImageColorView;I)I

    .line 163
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ae;->a:Lcom/roidapp/imagelib/filter/ImageColorView;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->a(Lcom/roidapp/imagelib/filter/ImageColorView;)Lcom/roidapp/imagelib/filter/ag;

    move-result-object v0

    add-int/lit8 v1, p2, 0x64

    invoke-interface {v0, v1}, Lcom/roidapp/imagelib/filter/ag;->c(I)V

    goto :goto_1

    .line 166
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ae;->a:Lcom/roidapp/imagelib/filter/ImageColorView;

    add-int/lit8 v1, p2, 0x64

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/filter/ImageColorView;->c(Lcom/roidapp/imagelib/filter/ImageColorView;I)I

    .line 167
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ae;->a:Lcom/roidapp/imagelib/filter/ImageColorView;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->a(Lcom/roidapp/imagelib/filter/ImageColorView;)Lcom/roidapp/imagelib/filter/ag;

    move-result-object v0

    add-int/lit8 v1, p2, 0x64

    invoke-interface {v0, v1}, Lcom/roidapp/imagelib/filter/ag;->d(I)V

    goto :goto_1

    .line 170
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ae;->a:Lcom/roidapp/imagelib/filter/ImageColorView;

    add-int/lit16 v1, p2, 0xb4

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/filter/ImageColorView;->d(Lcom/roidapp/imagelib/filter/ImageColorView;I)I

    .line 171
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ae;->a:Lcom/roidapp/imagelib/filter/ImageColorView;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->a(Lcom/roidapp/imagelib/filter/ImageColorView;)Lcom/roidapp/imagelib/filter/ag;

    move-result-object v0

    add-int/lit16 v1, p2, 0xb4

    invoke-interface {v0, v1}, Lcom/roidapp/imagelib/filter/ag;->e(I)V

    goto :goto_1

    .line 156
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 187
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ae;->a:Lcom/roidapp/imagelib/filter/ImageColorView;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->b(Lcom/roidapp/imagelib/filter/ImageColorView;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 188
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ae;->a:Lcom/roidapp/imagelib/filter/ImageColorView;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->c(Lcom/roidapp/imagelib/filter/ImageColorView;)Lcom/roidapp/imagelib/filter/ah;

    move-result-object v0

    if-nez v0, :cond_0

    .line 190
    :goto_0
    return-void

    .line 189
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ae;->a:Lcom/roidapp/imagelib/filter/ImageColorView;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->c(Lcom/roidapp/imagelib/filter/ImageColorView;)Lcom/roidapp/imagelib/filter/ah;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/ah;->a()V

    goto :goto_0
.end method
