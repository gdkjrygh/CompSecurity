.class public Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;
.super Landroid/widget/FrameLayout;
.source "RefreshableListViewItem.java"


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/view/View;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field

.field private i:Landroid/view/animation/RotateAnimation;

.field private j:Landroid/view/animation/RotateAnimation;

.field private k:Lcom/facebook/widget/refreshablelistview/d;

.field private l:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 38
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->l:I

    .line 42
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->a()V

    .line 43
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 38
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->l:I

    .line 47
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->a()V

    .line 48
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->l:I

    .line 52
    invoke-direct {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->a()V

    .line 53
    return-void
.end method

.method private a()V
    .locals 14

    .prologue
    const-wide/16 v12, 0xfa

    const/4 v1, 0x0

    const/high16 v2, -0x3ccc0000    # -180.0f

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v3, 0x1

    .line 57
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 58
    sget v5, Lcom/facebook/k;->orca_pull_to_refresh_item:I

    invoke-virtual {v0, v5, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 60
    sget v0, Lcom/facebook/i;->pull_to_refresh_action_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->a:Landroid/view/View;

    .line 61
    sget v0, Lcom/facebook/i;->pull_to_refresh_refresh_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->b:Landroid/view/View;

    .line 63
    sget v0, Lcom/facebook/i;->pull_to_refresh_text_pull:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->d:Landroid/widget/TextView;

    .line 64
    sget v0, Lcom/facebook/i;->pull_to_refresh_text_release:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->e:Landroid/widget/TextView;

    .line 65
    sget v0, Lcom/facebook/i;->pull_to_refresh_text_push:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->f:Landroid/widget/TextView;

    .line 66
    const/4 v0, 0x3

    new-array v0, v0, [Landroid/widget/TextView;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->d:Landroid/widget/TextView;

    aput-object v6, v0, v5

    iget-object v5, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->e:Landroid/widget/TextView;

    aput-object v5, v0, v3

    const/4 v5, 0x2

    iget-object v6, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->f:Landroid/widget/TextView;

    aput-object v6, v0, v5

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->h:Ljava/util/List;

    .line 67
    sget v0, Lcom/facebook/i;->pull_to_refresh_last_loaded_time:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->g:Landroid/widget/TextView;

    .line 69
    sget v0, Lcom/facebook/i;->pull_to_refresh_image:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->c:Landroid/widget/ImageView;

    .line 70
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->c:Landroid/widget/ImageView;

    const/16 v5, 0x32

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setMinimumHeight(I)V

    .line 73
    new-instance v0, Landroid/view/animation/RotateAnimation;

    move v5, v3

    move v6, v4

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    iput-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->i:Landroid/view/animation/RotateAnimation;

    .line 76
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->i:Landroid/view/animation/RotateAnimation;

    new-instance v5, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v5}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v5}, Landroid/view/animation/RotateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 77
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->i:Landroid/view/animation/RotateAnimation;

    invoke-virtual {v0, v12, v13}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    .line 78
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->i:Landroid/view/animation/RotateAnimation;

    invoke-virtual {v0, v3}, Landroid/view/animation/RotateAnimation;->setFillAfter(Z)V

    .line 79
    new-instance v5, Landroid/view/animation/RotateAnimation;

    move v6, v2

    move v7, v1

    move v8, v3

    move v9, v4

    move v10, v3

    move v11, v4

    invoke-direct/range {v5 .. v11}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    iput-object v5, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->j:Landroid/view/animation/RotateAnimation;

    .line 82
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->j:Landroid/view/animation/RotateAnimation;

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/RotateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 83
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->j:Landroid/view/animation/RotateAnimation;

    invoke-virtual {v0, v12, v13}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    .line 84
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->j:Landroid/view/animation/RotateAnimation;

    invoke-virtual {v0, v3}, Landroid/view/animation/RotateAnimation;->setFillAfter(Z)V

    .line 85
    return-void
.end method

.method private a(Landroid/widget/TextView;)V
    .locals 3

    .prologue
    .line 159
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 160
    if-ne v0, p1, :cond_0

    .line 161
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 163
    :cond_0
    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 167
    :cond_1
    return-void
.end method


# virtual methods
.method public setDirection(I)V
    .locals 1

    .prologue
    .line 102
    iget v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->l:I

    if-ne p1, v0, :cond_0

    .line 106
    :goto_0
    return-void

    .line 105
    :cond_0
    iput p1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->l:I

    goto :goto_0
.end method

.method public setLastLoadedTime(J)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 88
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    .line 89
    invoke-virtual {p0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 90
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, p1, p2}, Ljava/util/Date;-><init>(J)V

    .line 91
    invoke-static {v0}, Landroid/text/format/DateFormat;->getDateFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    .line 92
    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 93
    sget v3, Lcom/facebook/o;->pull_to_refresh_last_updated_date:I

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v5

    const/4 v2, 0x1

    aput-object v1, v4, v2

    invoke-virtual {v0, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 94
    iget-object v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->g:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 99
    :goto_0
    return-void

    .line 97
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method public setState(Lcom/facebook/widget/refreshablelistview/d;)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 109
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->k:Lcom/facebook/widget/refreshablelistview/d;

    .line 111
    sget-object v1, Lcom/facebook/widget/refreshablelistview/d;->PULL_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    if-ne v0, v1, :cond_1

    sget-object v1, Lcom/facebook/widget/refreshablelistview/d;->RELEASE_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    if-ne p1, v1, :cond_1

    .line 112
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->e:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->a(Landroid/widget/TextView;)V

    .line 113
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->c:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_pull_to_refresh_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 114
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 115
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->i:Landroid/view/animation/RotateAnimation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 147
    :cond_0
    :goto_0
    sget-object v0, Lcom/facebook/widget/refreshablelistview/d;->LOADING:Lcom/facebook/widget/refreshablelistview/d;

    if-ne p1, v0, :cond_6

    .line 148
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->a:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 149
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->b:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 155
    :goto_1
    iput-object p1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->k:Lcom/facebook/widget/refreshablelistview/d;

    .line 156
    return-void

    .line 118
    :cond_1
    sget-object v1, Lcom/facebook/widget/refreshablelistview/d;->PUSH_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    if-ne v0, v1, :cond_2

    sget-object v1, Lcom/facebook/widget/refreshablelistview/d;->RELEASE_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    if-ne p1, v1, :cond_2

    .line 119
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->e:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->a(Landroid/widget/TextView;)V

    .line 120
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->c:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_pull_to_refresh_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 121
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 122
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->i:Landroid/view/animation/RotateAnimation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 124
    :cond_2
    sget-object v1, Lcom/facebook/widget/refreshablelistview/d;->RELEASE_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    if-ne v0, v1, :cond_3

    sget-object v1, Lcom/facebook/widget/refreshablelistview/d;->PULL_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    if-ne p1, v1, :cond_3

    .line 125
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->d:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->a(Landroid/widget/TextView;)V

    .line 126
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->c:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_pull_to_refresh_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 127
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 128
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->j:Landroid/view/animation/RotateAnimation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 130
    :cond_3
    sget-object v1, Lcom/facebook/widget/refreshablelistview/d;->RELEASE_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    if-ne v0, v1, :cond_4

    sget-object v0, Lcom/facebook/widget/refreshablelistview/d;->PUSH_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    if-ne p1, v0, :cond_4

    .line 131
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->f:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->a(Landroid/widget/TextView;)V

    .line 132
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->c:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_pull_to_refresh_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 133
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 134
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->j:Landroid/view/animation/RotateAnimation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 136
    :cond_4
    sget-object v0, Lcom/facebook/widget/refreshablelistview/d;->PULL_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    if-ne p1, v0, :cond_5

    .line 137
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->c:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_pull_to_refresh_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 138
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->d:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->a(Landroid/widget/TextView;)V

    .line 139
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    goto/16 :goto_0

    .line 141
    :cond_5
    sget-object v0, Lcom/facebook/widget/refreshablelistview/d;->PUSH_TO_REFRESH:Lcom/facebook/widget/refreshablelistview/d;

    if-ne p1, v0, :cond_0

    .line 142
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->c:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_pull_to_refresh_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 143
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->f:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->a(Landroid/widget/TextView;)V

    .line 144
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    goto/16 :goto_0

    .line 151
    :cond_6
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->a:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 152
    iget-object v0, p0, Lcom/facebook/widget/refreshablelistview/RefreshableListViewItem;->b:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_1
.end method
