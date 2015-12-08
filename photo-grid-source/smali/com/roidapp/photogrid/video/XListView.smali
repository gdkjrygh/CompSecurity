.class public Lcom/roidapp/photogrid/video/XListView;
.super Landroid/widget/ListView;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field private a:Landroid/view/animation/RotateAnimation;

.field private b:Landroid/view/animation/RotateAnimation;

.field private c:I

.field private d:I

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:I

.field private i:Lcom/roidapp/photogrid/video/ce;

.field private j:Landroid/widget/LinearLayout;

.field private k:Landroid/view/LayoutInflater;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/ProgressBar;

.field private o:Landroid/widget/ImageView;

.field private p:Z

.field private q:Landroid/widget/LinearLayout;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/widget/ProgressBar;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 88
    invoke-direct {p0, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 58
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/XListView;->f:Z

    .line 60
    const/16 v0, 0xa

    iput v0, p0, Lcom/roidapp/photogrid/video/XListView;->h:I

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/XListView;->p:Z

    .line 89
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/XListView;->a(Landroid/content/Context;)V

    .line 90
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 93
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 58
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/XListView;->f:Z

    .line 60
    const/16 v0, 0xa

    iput v0, p0, Lcom/roidapp/photogrid/video/XListView;->h:I

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/XListView;->p:Z

    .line 94
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/XListView;->a(Landroid/content/Context;)V

    .line 95
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 98
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 58
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/XListView;->f:Z

    .line 60
    const/16 v0, 0xa

    iput v0, p0, Lcom/roidapp/photogrid/video/XListView;->h:I

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/XListView;->p:Z

    .line 99
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/XListView;->a(Landroid/content/Context;)V

    .line 100
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/XListView;)Lcom/roidapp/photogrid/video/ce;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->i:Lcom/roidapp/photogrid/video/ce;

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 13

    .prologue
    const/4 v1, 0x0

    const/high16 v2, -0x3ccc0000    # -180.0f

    const/4 v12, 0x0

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v3, 0x1

    .line 105
    new-instance v0, Landroid/view/animation/RotateAnimation;

    move v5, v3

    move v6, v4

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->a:Landroid/view/animation/RotateAnimation;

    .line 108
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->a:Landroid/view/animation/RotateAnimation;

    new-instance v5, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v5}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v5}, Landroid/view/animation/RotateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 109
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->a:Landroid/view/animation/RotateAnimation;

    const-wide/16 v6, 0x64

    invoke-virtual {v0, v6, v7}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    .line 110
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->a:Landroid/view/animation/RotateAnimation;

    invoke-virtual {v0, v3}, Landroid/view/animation/RotateAnimation;->setFillAfter(Z)V

    .line 112
    new-instance v5, Landroid/view/animation/RotateAnimation;

    move v6, v2

    move v7, v1

    move v8, v3

    move v9, v4

    move v10, v3

    move v11, v4

    invoke-direct/range {v5 .. v11}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    iput-object v5, p0, Lcom/roidapp/photogrid/video/XListView;->b:Landroid/view/animation/RotateAnimation;

    .line 115
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->b:Landroid/view/animation/RotateAnimation;

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/RotateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 116
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->b:Landroid/view/animation/RotateAnimation;

    const-wide/16 v4, 0x64

    invoke-virtual {v0, v4, v5}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    .line 117
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->b:Landroid/view/animation/RotateAnimation;

    invoke-virtual {v0, v3}, Landroid/view/animation/RotateAnimation;->setFillAfter(Z)V

    .line 119
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->k:Landroid/view/LayoutInflater;

    .line 122
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->k:Landroid/view/LayoutInflater;

    const v1, 0x7f03013e

    invoke-virtual {v0, v1, v12}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->j:Landroid/widget/LinearLayout;

    .line 123
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->j:Landroid/widget/LinearLayout;

    const v1, 0x7f0d04ff

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->l:Landroid/widget/TextView;

    .line 124
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->j:Landroid/widget/LinearLayout;

    const v1, 0x7f0d0500

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->m:Landroid/widget/TextView;

    .line 125
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->j:Landroid/widget/LinearLayout;

    const v1, 0x7f0d0501

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->o:Landroid/widget/ImageView;

    .line 126
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->j:Landroid/widget/LinearLayout;

    const v1, 0x7f0d04fe

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->n:Landroid/widget/ProgressBar;

    .line 127
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->k:Landroid/view/LayoutInflater;

    const v1, 0x7f03013d

    invoke-virtual {v0, v1, v12}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->q:Landroid/widget/LinearLayout;

    .line 128
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->q:Landroid/widget/LinearLayout;

    const v1, 0x7f0d04f8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->s:Landroid/widget/TextView;

    .line 129
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->q:Landroid/widget/LinearLayout;

    const v1, 0x7f0d04fc

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->v:Landroid/widget/ProgressBar;

    .line 130
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->q:Landroid/widget/LinearLayout;

    const v1, 0x7f0d04fa

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->u:Landroid/widget/TextView;

    .line 131
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->q:Landroid/widget/LinearLayout;

    const v1, 0x7f0d04f9

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->r:Landroid/widget/TextView;

    .line 132
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->q:Landroid/widget/LinearLayout;

    const v1, 0x7f0d04fb

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->t:Landroid/widget/TextView;

    .line 133
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->t:Landroid/widget/TextView;

    new-instance v1, Lcom/roidapp/photogrid/video/cd;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/video/cd;-><init>(Lcom/roidapp/photogrid/video/XListView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 142
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->q:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v12, v1}, Lcom/roidapp/photogrid/video/XListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 143
    invoke-virtual {p0, p0}, Lcom/roidapp/photogrid/video/XListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 145
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 162
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/XListView;->g:Z

    .line 163
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->v:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 165
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->r:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 166
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->t:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 173
    return-void
.end method

.method public final a(Lcom/roidapp/photogrid/video/ce;)V
    .locals 0

    .prologue
    .line 252
    iput-object p1, p0, Lcom/roidapp/photogrid/video/XListView;->i:Lcom/roidapp/photogrid/video/ce;

    .line 253
    return-void
.end method

.method public final a(Z)V
    .locals 3

    .prologue
    .line 152
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/XListView;->getFooterViewsCount()I

    move-result v0

    .line 153
    if-eqz p1, :cond_1

    if-lez v0, :cond_1

    .line 154
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->q:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/XListView;->removeFooterView(Landroid/view/View;)Z

    .line 158
    :cond_0
    :goto_0
    return-void

    .line 155
    :cond_1
    if-nez v0, :cond_0

    if-nez p1, :cond_0

    .line 156
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->q:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/roidapp/photogrid/video/XListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 200
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/XListView;->g:Z

    .line 201
    return-void
.end method

.method public final b(Z)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/16 v3, 0x8

    .line 175
    const-string v0, "Xlist"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "setResultSize "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 176
    if-eqz p1, :cond_0

    .line 177
    iput-boolean v4, p0, Lcom/roidapp/photogrid/video/XListView;->g:Z

    .line 178
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->v:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 179
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 180
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->r:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 181
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->t:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 190
    :goto_0
    return-void

    .line 183
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/XListView;->g:Z

    .line 184
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->v:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 185
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 186
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->r:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 187
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->t:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 231
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/XListView;->e:Z

    .line 232
    return-void
.end method

.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .prologue
    .line 248
    iput p2, p0, Lcom/roidapp/photogrid/video/XListView;->c:I

    .line 249
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 2

    .prologue
    .line 239
    iput p2, p0, Lcom/roidapp/photogrid/video/XListView;->d:I

    .line 1205
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/XListView;->f:Z

    if-eqz v0, :cond_1

    .line 1211
    if-nez p2, :cond_1

    :try_start_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/XListView;->e:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/widget/AbsListView;->getLastVisiblePosition()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/XListView;->q:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/AbsListView;->getPositionForView(Landroid/view/View;)I

    move-result v1

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/XListView;->g:Z

    if-nez v0, :cond_1

    .line 1217
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->i:Lcom/roidapp/photogrid/video/ce;

    if-eqz v0, :cond_0

    .line 1219
    iget-object v0, p0, Lcom/roidapp/photogrid/video/XListView;->i:Lcom/roidapp/photogrid/video/ce;

    invoke-interface {v0}, Lcom/roidapp/photogrid/video/ce;->a()V

    .line 1222
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/XListView;->e:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1225
    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0

    .prologue
    .line 29
    check-cast p1, Landroid/widget/ListAdapter;

    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/video/XListView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 0

    .prologue
    .line 195
    invoke-super {p0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 197
    return-void
.end method
