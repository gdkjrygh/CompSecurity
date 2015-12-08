.class public Lcom/roidapp/cloudlib/template/c/f;
.super Lcom/roidapp/baselib/c/a;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field protected a:Lcom/roidapp/cloudlib/template/a/e;

.field protected b:Landroid/support/v7/widget/RecyclerView;

.field protected c:Lcom/roidapp/cloudlib/template/b/a;

.field protected d:Landroid/widget/TextView;

.field protected e:Landroid/os/Handler;

.field protected f:I

.field protected g:I

.field private h:Z

.field private i:I

.field private j:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/roidapp/baselib/c/a;-><init>()V

    return-void
.end method

.method public static a(I)Lcom/roidapp/cloudlib/template/c/f;
    .locals 1

    .prologue
    .line 64
    packed-switch p0, :pswitch_data_0

    .line 72
    new-instance v0, Lcom/roidapp/cloudlib/template/c/f;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/template/c/f;-><init>()V

    .line 75
    :goto_0
    iput p0, v0, Lcom/roidapp/cloudlib/template/c/f;->i:I

    .line 76
    return-object v0

    .line 66
    :pswitch_0
    new-instance v0, Lcom/roidapp/cloudlib/template/c/c;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/template/c/c;-><init>()V

    goto :goto_0

    .line 69
    :pswitch_1
    new-instance v0, Lcom/roidapp/cloudlib/template/c/a;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/template/c/a;-><init>()V

    goto :goto_0

    .line 64
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected static a(Landroid/os/Handler;ILjava/lang/Object;)V
    .locals 1

    .prologue
    .line 256
    if-eqz p0, :cond_0

    .line 257
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 258
    iput p1, v0, Landroid/os/Message;->what:I

    .line 259
    iput-object p2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 260
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 262
    :cond_0
    return-void
.end method


# virtual methods
.method protected a(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 148
    check-cast p1, Landroid/support/v7/widget/RecyclerView;

    iput-object p1, p0, Lcom/roidapp/cloudlib/template/c/f;->b:Landroid/support/v7/widget/RecyclerView;

    .line 149
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->b:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/roidapp/cloudlib/template/c/g;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/template/c/g;-><init>(Lcom/roidapp/cloudlib/template/c/f;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/as;)V

    .line 156
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->b:Landroid/support/v7/widget/RecyclerView;

    iget v1, p0, Lcom/roidapp/cloudlib/template/c/f;->g:I

    div-int/lit8 v1, v1, 0x2

    iget v2, p0, Lcom/roidapp/cloudlib/template/c/f;->g:I

    iget v3, p0, Lcom/roidapp/cloudlib/template/c/f;->g:I

    div-int/lit8 v3, v3, 0x2

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/support/v7/widget/RecyclerView;->setPadding(IIII)V

    .line 157
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/RecyclerView;->setClipToPadding(Z)V

    .line 159
    new-instance v0, Landroid/support/v7/widget/StaggeredGridLayoutManager;

    invoke-direct {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;-><init>()V

    .line 160
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/f;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/au;)V

    .line 161
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->b:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/f;->a:Lcom/roidapp/cloudlib/template/a/e;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/al;)V

    .line 162
    return-void
.end method

.method protected final a(Z)V
    .locals 1

    .prologue
    .line 132
    invoke-super {p0, p1}, Lcom/roidapp/baselib/c/a;->a(Z)V

    .line 133
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/template/c/f;->j:Z

    if-nez v0, :cond_1

    .line 134
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->a:Lcom/roidapp/cloudlib/template/a/e;

    instance-of v0, v0, Lcom/roidapp/cloudlib/template/a/b;

    if-eqz v0, :cond_2

    .line 135
    const-string v0, "TemplatePremiumPage"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;)V

    .line 143
    :cond_0
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/template/c/f;->j:Z

    .line 145
    :cond_1
    return-void

    .line 136
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->a:Lcom/roidapp/cloudlib/template/a/e;

    instance-of v0, v0, Lcom/roidapp/cloudlib/template/a/d;

    if-eqz v0, :cond_3

    .line 137
    const-string v0, "TemplateFreePage"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 138
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->a:Lcom/roidapp/cloudlib/template/a/e;

    instance-of v0, v0, Lcom/roidapp/cloudlib/template/a/c;

    if-eqz v0, :cond_4

    .line 139
    const-string v0, "TemplateLocalPage"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 140
    :cond_4
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->a:Lcom/roidapp/cloudlib/template/a/e;

    instance-of v0, v0, Lcom/roidapp/cloudlib/template/a/a;

    if-eqz v0, :cond_0

    .line 141
    const-string v0, "TemplateFavouritePage"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final b(I)V
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->d:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 168
    :cond_0
    return-void
.end method

.method public c()Lcom/roidapp/cloudlib/template/a/e;
    .locals 1

    .prologue
    .line 171
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->a:Lcom/roidapp/cloudlib/template/a/e;

    return-object v0
.end method

.method public final c(I)V
    .locals 2

    .prologue
    .line 265
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->b:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 266
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->b:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/roidapp/cloudlib/template/c/h;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/cloudlib/template/c/h;-><init>(Lcom/roidapp/cloudlib/template/c/f;I)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->post(Ljava/lang/Runnable;)Z

    .line 273
    :cond_0
    return-void
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 175
    iget v0, p0, Lcom/roidapp/cloudlib/template/c/f;->f:I

    return v0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 81
    invoke-super {p0, p1}, Lcom/roidapp/baselib/c/a;->onAttach(Landroid/app/Activity;)V

    .line 82
    instance-of v0, p1, Lcom/roidapp/cloudlib/template/b/a;

    if-eqz v0, :cond_0

    .line 83
    check-cast p1, Lcom/roidapp/cloudlib/template/b/a;

    iput-object p1, p0, Lcom/roidapp/cloudlib/template/c/f;->c:Lcom/roidapp/cloudlib/template/b/a;

    .line 85
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 180
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 181
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    sget v2, Lcom/roidapp/cloudlib/ar;->cA:I

    if-ne v1, v2, :cond_6

    .line 182
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/f;->a:Lcom/roidapp/cloudlib/template/a/e;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/a/e;->e(I)Lcom/roidapp/cloudlib/template/TemplateInfo;

    move-result-object v0

    .line 183
    if-nez v0, :cond_1

    .line 230
    :cond_0
    :goto_0
    return-void

    .line 185
    :cond_1
    const-string v1, "Click"

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->a()Lcom/roidapp/cloudlib/template/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b;->c(Lcom/roidapp/cloudlib/template/TemplateInfo;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 187
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/f;->e:Landroid/os/Handler;

    const/16 v2, 0x2324

    invoke-static {v1, v2, v0}, Lcom/roidapp/cloudlib/template/c/f;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    goto :goto_0

    .line 189
    :cond_2
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/template/c/f;->h:Z

    if-nez v1, :cond_5

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->q()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 191
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/roidapp/cloudlib/template/j;->b(J)Z

    move-result v1

    .line 192
    if-nez v1, :cond_5

    .line 195
    invoke-static {}, Lcom/roidapp/cloudlib/ads/s;->c()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 196
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/f;->c:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v1, v0}, Lcom/roidapp/cloudlib/template/b/a;->a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    goto :goto_0

    .line 200
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 201
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->e:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 202
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->e:Landroid/os/Handler;

    const/16 v1, 0x2400

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 206
    :cond_4
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/f;->e:Landroid/os/Handler;

    if-eqz v1, :cond_0

    .line 207
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/f;->c:Lcom/roidapp/cloudlib/template/b/a;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/roidapp/cloudlib/template/b/a;->b(Z)V

    .line 208
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 209
    const/16 v2, 0x2402

    iput v2, v1, Landroid/os/Message;->what:I

    .line 210
    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 211
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->e:Landroid/os/Handler;

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 216
    :cond_5
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/f;->e:Landroid/os/Handler;

    const/16 v2, 0x2319

    invoke-static {v1, v2, v0}, Lcom/roidapp/cloudlib/template/c/f;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    goto :goto_0

    .line 220
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    sget v2, Lcom/roidapp/cloudlib/ar;->cF:I

    if-ne v1, v2, :cond_0

    .line 221
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/c/f;->a:Lcom/roidapp/cloudlib/template/a/e;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/a/e;->e(I)Lcom/roidapp/cloudlib/template/TemplateInfo;

    move-result-object v0

    .line 222
    if-eqz v0, :cond_7

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->b()Lcom/roidapp/cloudlib/template/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/a;->d(Lcom/roidapp/cloudlib/template/TemplateInfo;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 223
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->b()Lcom/roidapp/cloudlib/template/a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->r()Lcom/roidapp/cloudlib/template/TemplateInfo;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/a;->b(Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    .line 224
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sget v1, Lcom/roidapp/cloudlib/at;->aR:I

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/template/c/f;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 228
    :goto_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->e:Landroid/os/Handler;

    const/16 v1, 0x2401

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/template/c/f;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 226
    :cond_7
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->b()Lcom/roidapp/cloudlib/template/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/a;->c(Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    goto :goto_1
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    .line 89
    invoke-super {p0, p1}, Lcom/roidapp/baselib/c/a;->onCreate(Landroid/os/Bundle;)V

    .line 92
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 93
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 94
    int-to-double v2, v0

    const-wide v4, 0x3fc47ae147ae147bL    # 0.16

    mul-double/2addr v2, v4

    double-to-int v2, v2

    .line 95
    int-to-float v2, v2

    const/high16 v3, 0x42280000    # 42.0f

    mul-float/2addr v1, v3

    sub-float v1, v2, v1

    float-to-int v1, v1

    iput v1, p0, Lcom/roidapp/cloudlib/template/c/f;->g:I

    .line 96
    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/roidapp/cloudlib/template/c/f;->g:I

    mul-int/lit8 v1, v1, 0x3

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/roidapp/cloudlib/template/c/f;->f:I

    .line 98
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->c:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/template/b/a;->b()Lcom/roidapp/cloudlib/ah;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->e:Landroid/os/Handler;

    .line 99
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/c/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/al;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/template/c/f;->h:Z

    .line 1104
    iget v0, p0, Lcom/roidapp/cloudlib/template/c/f;->i:I

    packed-switch v0, :pswitch_data_0

    .line 1114
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown fragment type!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1106
    :pswitch_0
    new-instance v0, Lcom/roidapp/cloudlib/template/a/b;

    invoke-direct {v0, p0, p0}, Lcom/roidapp/cloudlib/template/a/b;-><init>(Lcom/roidapp/cloudlib/template/c/f;Landroid/view/View$OnClickListener;)V

    .line 100
    :goto_0
    iput-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->a:Lcom/roidapp/cloudlib/template/a/e;

    .line 101
    return-void

    .line 1108
    :pswitch_1
    new-instance v0, Lcom/roidapp/cloudlib/template/a/d;

    invoke-direct {v0, p0, p0}, Lcom/roidapp/cloudlib/template/a/d;-><init>(Lcom/roidapp/cloudlib/template/c/f;Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 1110
    :pswitch_2
    new-instance v0, Lcom/roidapp/cloudlib/template/a/c;

    invoke-direct {v0, p0, p0}, Lcom/roidapp/cloudlib/template/a/c;-><init>(Lcom/roidapp/cloudlib/template/c/f;Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 1112
    :pswitch_3
    new-instance v0, Lcom/roidapp/cloudlib/template/a/a;

    invoke-direct {v0, p0, p0}, Lcom/roidapp/cloudlib/template/a/a;-><init>(Lcom/roidapp/cloudlib/template/c/f;Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 1104
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 121
    sget v0, Lcom/roidapp/cloudlib/as;->Y:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 123
    sget v0, Lcom/roidapp/cloudlib/ar;->cD:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->b:Landroid/support/v7/widget/RecyclerView;

    .line 124
    sget v0, Lcom/roidapp/cloudlib/ar;->cE:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->d:Landroid/widget/TextView;

    .line 126
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/template/c/f;->a(Landroid/view/View;)V

    .line 127
    return-object v1
.end method

.method public onDestroy()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 243
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->e:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 244
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->e:Landroid/os/Handler;

    check-cast v0, Lcom/roidapp/cloudlib/template/b/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/c;->a()V

    .line 245
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->e:Landroid/os/Handler;

    const/16 v1, 0x2327

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/template/c/f;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    .line 246
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->e:Landroid/os/Handler;

    const/16 v1, 0x2326

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/template/c/f;->a(Landroid/os/Handler;ILjava/lang/Object;)V

    .line 248
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->a:Lcom/roidapp/cloudlib/template/a/e;

    if-eqz v0, :cond_1

    .line 249
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->a:Lcom/roidapp/cloudlib/template/a/e;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/a/e;->e()V

    .line 250
    iput-object v2, p0, Lcom/roidapp/cloudlib/template/c/f;->a:Lcom/roidapp/cloudlib/template/a/e;

    .line 252
    :cond_1
    invoke-super {p0}, Lcom/roidapp/baselib/c/a;->onDestroy()V

    .line 253
    return-void
.end method

.method public onDestroyView()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 234
    invoke-super {p0}, Lcom/roidapp/baselib/c/a;->onDestroyView()V

    .line 235
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->b:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 236
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/c/f;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->a(Landroid/support/v7/widget/al;)V

    .line 237
    iput-object v1, p0, Lcom/roidapp/cloudlib/template/c/f;->b:Landroid/support/v7/widget/RecyclerView;

    .line 239
    :cond_0
    return-void
.end method
