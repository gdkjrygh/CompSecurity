.class public final Lcom/roidapp/cloudlib/template/c/i;
.super Landroid/support/v4/app/DialogFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:I

.field private b:I

.field private c:Landroid/view/View;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/ProgressBar;

.field private g:Landroid/os/Handler;

.field private h:Lcom/roidapp/cloudlib/template/TemplateInfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 45
    const/16 v0, 0xa

    iput v0, p0, Lcom/roidapp/cloudlib/template/c/i;->a:I

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/template/c/i;->b:I

    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 159
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 160
    const/16 v1, 0x2324

    iput v1, v0, Landroid/os/Message;->what:I

    .line 161
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/i;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 162
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/i;->g:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 163
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 184
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/i;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 197
    :goto_0
    return-void

    .line 187
    :cond_0
    iget v0, p0, Lcom/roidapp/cloudlib/template/c/i;->a:I

    const/16 v1, 0x1e

    if-ne v0, v1, :cond_1

    .line 188
    invoke-direct {p0}, Lcom/roidapp/cloudlib/template/c/i;->c()V

    goto :goto_0

    .line 191
    :cond_1
    const/16 v0, 0x14

    iput v0, p0, Lcom/roidapp/cloudlib/template/c/i;->a:I

    .line 192
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->c:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 193
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->d:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/at;->an:I

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/template/c/i;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 194
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 195
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->f:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 169
    iput p1, p0, Lcom/roidapp/cloudlib/template/c/i;->b:I

    .line 170
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 0

    .prologue
    .line 180
    iput-object p1, p0, Lcom/roidapp/cloudlib/template/c/i;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 181
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 200
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/i;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 208
    :goto_0
    return-void

    .line 203
    :cond_0
    const/16 v0, 0xa

    iput v0, p0, Lcom/roidapp/cloudlib/template/c/i;->a:I

    .line 204
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->c:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 205
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->d:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/at;->an:I

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/template/c/i;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 206
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 207
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->f:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0
.end method

.method public final b(I)V
    .locals 0

    .prologue
    .line 176
    iput p1, p0, Lcom/roidapp/cloudlib/template/c/i;->a:I

    .line 177
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 56
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onAttach(Landroid/app/Activity;)V

    .line 57
    instance-of v0, p1, Lcom/roidapp/cloudlib/template/b/a;

    if-eqz v0, :cond_0

    .line 58
    check-cast p1, Lcom/roidapp/cloudlib/template/b/a;

    .line 59
    invoke-interface {p1}, Lcom/roidapp/cloudlib/template/b/a;->b()Lcom/roidapp/cloudlib/ah;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->g:Landroid/os/Handler;

    .line 61
    :cond_0
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    const/4 v5, 0x5

    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 108
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->dd:I

    if-ne v0, v1, :cond_1

    .line 109
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/i;->dismissAllowingStateLoss()V

    .line 156
    :cond_0
    :goto_0
    return-void

    .line 111
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->db:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->g:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 112
    iget v0, p0, Lcom/roidapp/cloudlib/template/c/i;->a:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 115
    :sswitch_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-eqz v0, :cond_0

    .line 118
    const-string v1, "Unlock/Click/GET_NOW"

    iget v0, p0, Lcom/roidapp/cloudlib/template/c/i;->b:I

    if-ne v0, v3, :cond_6

    const-string v0, "Share"

    :goto_1
    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/template/j;->b(J)Z

    move-result v0

    .line 121
    if-nez v0, :cond_4

    .line 123
    invoke-static {}, Lcom/roidapp/cloudlib/ads/s;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 124
    invoke-static {}, Lcom/roidapp/cloudlib/ads/s;->d()Z

    .line 125
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const-string v1, "TemplateSelect_template_card"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2, v5}, Lcom/roidapp/cloudlib/al;->a(Ljava/lang/String;II)V

    .line 127
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->e:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    .line 128
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->e:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/at;->V:I

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/template/c/i;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/template/j;->c(J)V

    .line 134
    :cond_4
    iget v0, p0, Lcom/roidapp/cloudlib/template/c/i;->b:I

    if-nez v0, :cond_7

    .line 135
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 136
    const/16 v1, 0x2319

    iput v1, v0, Landroid/os/Message;->what:I

    .line 137
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/i;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 138
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/i;->g:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 143
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->c:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 144
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 145
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->f:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 118
    :cond_6
    const-string v0, "Template"

    goto :goto_1

    .line 140
    :cond_7
    iget v0, p0, Lcom/roidapp/cloudlib/template/c/i;->b:I

    if-ne v0, v3, :cond_5

    .line 141
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->g:Landroid/os/Handler;

    const/16 v1, 0x2310

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_2

    .line 149
    :sswitch_1
    const-string v1, "Unlock/Click/PICK"

    iget v0, p0, Lcom/roidapp/cloudlib/template/c/i;->b:I

    if-ne v0, v3, :cond_8

    const-string v0, "Share"

    :goto_3
    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const-string v1, "TemplateSelect_template_card"

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2, v5}, Lcom/roidapp/cloudlib/al;->a(Ljava/lang/String;II)V

    .line 152
    invoke-direct {p0}, Lcom/roidapp/cloudlib/template/c/i;->c()V

    goto/16 :goto_0

    .line 149
    :cond_8
    const-string v0, "Template"

    goto :goto_3

    .line 112
    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
        0x14 -> :sswitch_1
        0x1e -> :sswitch_0
    .end sparse-switch
.end method

.method public final onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    .prologue
    .line 102
    const/4 v0, 0x0

    sget v1, Lcom/roidapp/cloudlib/au;->a:I

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/template/c/i;->setStyle(II)V

    .line 103
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object v0

    return-object v0
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .prologue
    .line 65
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/i;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 66
    sget v0, Lcom/roidapp/cloudlib/as;->ab:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 67
    sget v0, Lcom/roidapp/cloudlib/ar;->dd:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 68
    sget v0, Lcom/roidapp/cloudlib/ar;->de:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 69
    iget-object v2, p0, Lcom/roidapp/cloudlib/template/c/i;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-eqz v2, :cond_0

    .line 70
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 71
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/i;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    const/high16 v4, 0x3fc00000    # 1.5f

    div-float/2addr v3, v4

    .line 72
    iget-object v4, p0, Lcom/roidapp/cloudlib/template/c/i;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v4}, Lcom/roidapp/cloudlib/template/TemplateInfo;->k()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 73
    iget v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 74
    invoke-static {p0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/cloudlib/template/c/i;->h:Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/template/TemplateInfo;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/d;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v2

    sget-object v3, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 82
    :cond_0
    sget v0, Lcom/roidapp/cloudlib/ar;->db:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->c:Landroid/view/View;

    .line 83
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->c:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    sget v0, Lcom/roidapp/cloudlib/ar;->df:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->f:Landroid/widget/ProgressBar;

    .line 85
    sget v0, Lcom/roidapp/cloudlib/ar;->dc:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->d:Landroid/widget/TextView;

    .line 86
    sget v0, Lcom/roidapp/cloudlib/ar;->dg:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->e:Landroid/widget/TextView;

    .line 87
    iget v0, p0, Lcom/roidapp/cloudlib/template/c/i;->a:I

    const/16 v2, 0xa

    if-ne v0, v2, :cond_2

    .line 88
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->d:Landroid/widget/TextView;

    sget v2, Lcom/roidapp/cloudlib/at;->S:I

    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/template/c/i;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->e:Landroid/widget/TextView;

    sget v2, Lcom/roidapp/cloudlib/at;->bn:I

    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/template/c/i;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const-string v2, "TemplateSelect_template_card"

    const/4 v3, 0x1

    const/4 v4, 0x5

    invoke-virtual {v0, v2, v3, v4}, Lcom/roidapp/cloudlib/al;->a(Ljava/lang/String;II)V

    .line 96
    :cond_1
    :goto_0
    return-object v1

    .line 92
    :cond_2
    iget v0, p0, Lcom/roidapp/cloudlib/template/c/i;->a:I

    const/16 v2, 0x14

    if-eq v0, v2, :cond_3

    iget v0, p0, Lcom/roidapp/cloudlib/template/c/i;->a:I

    const/16 v2, 0x1e

    if-ne v0, v2, :cond_1

    .line 93
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->d:Landroid/widget/TextView;

    sget v2, Lcom/roidapp/cloudlib/at;->an:I

    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/template/c/i;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/i;->e:Landroid/widget/TextView;

    sget v2, Lcom/roidapp/cloudlib/at;->V:I

    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/template/c/i;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method
