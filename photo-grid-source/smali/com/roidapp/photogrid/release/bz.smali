.class final Lcom/roidapp/photogrid/release/bz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/by;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/by;)V
    .locals 0

    .prologue
    .line 119
    iput-object p1, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    const v3, 0x7f0203c7

    const v5, 0x7f020361

    const/4 v2, 0x6

    const/4 v1, 0x1

    const/4 v4, 0x0

    .line 123
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->a(Lcom/roidapp/photogrid/release/by;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_1

    .line 171
    :cond_0
    :goto_0
    return-void

    .line 126
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->b(Lcom/roidapp/photogrid/release/by;)I

    move-result v0

    if-ne v0, v1, :cond_5

    .line 127
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->a(Lcom/roidapp/photogrid/release/by;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    .line 128
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 129
    if-eqz v0, :cond_0

    instance-of v2, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v2, :cond_0

    .line 130
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 131
    iget-object v2, v0, Lcom/roidapp/photogrid/release/ra;->T:Landroid/graphics/Bitmap;

    if-nez v2, :cond_2

    iget v2, v0, Lcom/roidapp/photogrid/release/ra;->P:I

    if-gez v2, :cond_4

    .line 132
    :cond_2
    iget-object v2, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    iget v3, v0, Lcom/roidapp/photogrid/release/ra;->P:I

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/release/by;->a(Lcom/roidapp/photogrid/release/by;I)I

    .line 133
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->x()V

    .line 134
    const/4 v2, 0x0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/ra;->T:Landroid/graphics/Bitmap;

    .line 135
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->c(Lcom/roidapp/photogrid/release/by;)Z

    .line 136
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->d(Lcom/roidapp/photogrid/release/by;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 137
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->d(Lcom/roidapp/photogrid/release/by;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v4, v5, v4, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 138
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->d(Lcom/roidapp/photogrid/release/by;)Landroid/widget/TextView;

    move-result-object v0

    const v2, 0x7f07026b

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 149
    :cond_3
    :goto_1
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto :goto_0

    .line 140
    :cond_4
    iget-object v2, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/by;->e(Lcom/roidapp/photogrid/release/by;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 141
    iget-object v2, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/by;->f(Lcom/roidapp/photogrid/release/by;)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ra;->a(I)V

    .line 142
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->j()V

    .line 143
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->d(Lcom/roidapp/photogrid/release/by;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 144
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->d(Lcom/roidapp/photogrid/release/by;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v4, v3, v4, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 145
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->d(Lcom/roidapp/photogrid/release/by;)Landroid/widget/TextView;

    move-result-object v0

    const v2, 0x7f0701fa

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 152
    :cond_5
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 153
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->a(Lcom/roidapp/photogrid/release/by;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/mm;->a(Z)V

    .line 154
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v0, v2, :cond_0

    .line 155
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->d(Lcom/roidapp/photogrid/release/by;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 156
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->d(Lcom/roidapp/photogrid/release/by;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v4, v3, v4, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 157
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->d(Lcom/roidapp/photogrid/release/by;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f0701fa

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 161
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->a(Lcom/roidapp/photogrid/release/by;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/mm;->a(Z)V

    .line 162
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v0, v2, :cond_0

    .line 163
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->d(Lcom/roidapp/photogrid/release/by;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->d(Lcom/roidapp/photogrid/release/by;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v4, v5, v4, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 165
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bz;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->d(Lcom/roidapp/photogrid/release/by;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f07026b

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0
.end method
