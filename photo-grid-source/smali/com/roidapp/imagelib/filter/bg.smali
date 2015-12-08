.class public Lcom/roidapp/imagelib/filter/bg;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;
.implements Lcom/roidapp/baselib/hlistview/s;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/roidapp/baselib/hlistview/HListView;

.field private final c:Lcom/roidapp/imagelib/filter/ad;

.field private final d:Landroid/widget/SeekBar;

.field private final e:Landroid/view/View;

.field private f:I

.field private g:Z

.field private h:Lcom/roidapp/imagelib/filter/be;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/roidapp/imagelib/filter/ad;)V
    .locals 8

    .prologue
    const/4 v3, 0x0

    const/4 v7, -0x2

    const/4 v6, -0x1

    .line 75
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 21
    const-class v0, Lcom/roidapp/imagelib/filter/bg;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->a:Ljava/lang/String;

    .line 27
    const/16 v0, 0x64

    iput v0, p0, Lcom/roidapp/imagelib/filter/bg;->f:I

    .line 28
    iput-boolean v3, p0, Lcom/roidapp/imagelib/filter/bg;->g:Z

    .line 76
    iput-object p2, p0, Lcom/roidapp/imagelib/filter/bg;->c:Lcom/roidapp/imagelib/filter/ad;

    .line 77
    new-instance v1, Landroid/widget/RelativeLayout;

    invoke-direct {v1, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 78
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v6, v7}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 79
    invoke-virtual {p0, v1, v0}, Lcom/roidapp/imagelib/filter/bg;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 81
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v2, Lcom/roidapp/imagelib/h;->m:I

    invoke-virtual {v0, v2, p0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->e:Landroid/view/View;

    .line 82
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->e:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 83
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->e:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/g;->C:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->d:Landroid/widget/SeekBar;

    .line 84
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->d:Landroid/widget/SeekBar;

    iget v2, p0, Lcom/roidapp/imagelib/filter/bg;->f:I

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 85
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->d:Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 86
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->e:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 88
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 89
    const/16 v2, 0x1001

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setId(I)V

    .line 90
    sget v2, Lcom/roidapp/imagelib/f;->d:I

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 91
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bg;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/e;->h:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    .line 92
    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v3, v6, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 93
    const/4 v4, 0x3

    iget-object v5, p0, Lcom/roidapp/imagelib/filter/bg;->e:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 94
    invoke-virtual {v1, v0, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 96
    new-instance v1, Landroid/widget/ImageView;

    invoke-direct {v1, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 97
    sget v3, Lcom/roidapp/imagelib/f;->a:I

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 98
    sget v3, Lcom/roidapp/imagelib/f;->b:I

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 99
    sget v3, Lcom/roidapp/imagelib/g;->g:I

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setId(I)V

    .line 100
    new-instance v3, Lcom/roidapp/imagelib/filter/bh;

    invoke-direct {v3, p0}, Lcom/roidapp/imagelib/filter/bh;-><init>(Lcom/roidapp/imagelib/filter/bg;)V

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 109
    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v3, v7, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 110
    const/16 v4, 0x9

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 111
    invoke-virtual {v0, v1, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 113
    new-instance v1, Lcom/roidapp/baselib/hlistview/HListView;

    invoke-direct {v1, p1}, Lcom/roidapp/baselib/hlistview/HListView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/roidapp/imagelib/filter/bg;->b:Lcom/roidapp/baselib/hlistview/HListView;

    .line 114
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v6, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 115
    const/4 v2, 0x1

    sget v3, Lcom/roidapp/imagelib/g;->g:I

    invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 116
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/bg;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0, v2, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 118
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->b:Lcom/roidapp/baselib/hlistview/HListView;

    sget v1, Lcom/roidapp/imagelib/f;->bp:I

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/HListView;->a(I)V

    .line 119
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/HListView;->a(Lcom/roidapp/baselib/hlistview/s;)V

    .line 120
    return-void
.end method

.method static synthetic a(Lcom/roidapp/imagelib/filter/bg;)Lcom/roidapp/imagelib/filter/ad;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->c:Lcom/roidapp/imagelib/filter/ad;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 71
    iget v0, p0, Lcom/roidapp/imagelib/filter/bg;->f:I

    return v0
.end method

.method public final a(Lcom/roidapp/baselib/hlistview/AdapterView;Landroid/view/View;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/baselib/hlistview/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "I)V"
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    .line 129
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/HListView;->z()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/ax;

    .line 130
    iget v2, v0, Lcom/roidapp/imagelib/filter/ax;->b:I

    .line 131
    invoke-virtual {p1, p3}, Lcom/roidapp/baselib/hlistview/AdapterView;->j(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 132
    invoke-interface {v1}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v3

    if-ne v2, v3, :cond_0

    .line 164
    :goto_0
    return-void

    .line 135
    :cond_0
    invoke-interface {v1}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v3

    if-nez v3, :cond_5

    .line 136
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bg;->e:Landroid/view/View;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 143
    :goto_1
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bg;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/roidapp/baselib/hlistview/HListView;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v2

    .line 144
    if-eqz v2, :cond_1

    .line 145
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    .line 146
    sget v3, Lcom/roidapp/imagelib/g;->l:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 147
    invoke-virtual {v2, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 149
    :cond_1
    invoke-interface {v1}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v2

    iput v2, v0, Lcom/roidapp/imagelib/filter/ax;->b:I

    .line 150
    sget v2, Lcom/roidapp/imagelib/g;->l:I

    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bg;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/imagelib/d;->b:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 152
    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/ax;->a()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v0

    .line 153
    invoke-interface {v0, v1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 154
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bg;->h:Lcom/roidapp/imagelib/filter/be;

    if-eqz v1, :cond_2

    .line 155
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bg;->h:Lcom/roidapp/imagelib/filter/be;

    invoke-interface {v1, v0}, Lcom/roidapp/imagelib/filter/be;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 156
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->c:Lcom/roidapp/imagelib/filter/ad;

    if-eqz v0, :cond_3

    .line 157
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->c:Lcom/roidapp/imagelib/filter/ad;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/ad;->f()V

    .line 159
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/HListView;->t()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    if-eq v0, p3, :cond_4

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/HListView;->t()I

    move-result v0

    if-ne v0, p3, :cond_7

    .line 160
    :cond_4
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->b:Lcom/roidapp/baselib/hlistview/HListView;

    add-int/lit8 v1, p3, -0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/HListView;->c(I)V

    goto :goto_0

    .line 138
    :cond_5
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bg;->e:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->isShown()Z

    move-result v3

    if-nez v3, :cond_6

    .line 139
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bg;->e:Landroid/view/View;

    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 140
    :cond_6
    const/16 v3, 0x64

    iput v3, p0, Lcom/roidapp/imagelib/filter/bg;->f:I

    .line 141
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/bg;->d:Landroid/widget/SeekBar;

    iget v4, p0, Lcom/roidapp/imagelib/filter/bg;->f:I

    invoke-virtual {v3, v4}, Landroid/widget/SeekBar;->setProgress(I)V

    goto :goto_1

    .line 162
    :cond_7
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->b:Lcom/roidapp/baselib/hlistview/HListView;

    add-int/lit8 v1, p3, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/HListView;->c(I)V

    goto/16 :goto_0
.end method

.method public final a(Lcom/roidapp/imagelib/filter/be;)V
    .locals 0

    .prologue
    .line 168
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/bg;->h:Lcom/roidapp/imagelib/filter/be;

    .line 169
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;I)V
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 172
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->c:Lcom/roidapp/imagelib/filter/ad;

    if-nez v0, :cond_0

    .line 195
    :goto_0
    return-void

    .line 173
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->e:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 174
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/hlistview/HListView;->setVisibility(I)V

    .line 175
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->c:Lcom/roidapp/imagelib/filter/ad;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/bg;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/roidapp/imagelib/filter/ad;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Landroid/content/Context;)Lcom/roidapp/imagelib/filter/ax;

    move-result-object v3

    .line 176
    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v4

    .line 178
    if-eqz v4, :cond_3

    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->d()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 179
    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->d()Ljava/util/List;

    move-result-object v5

    .line 180
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    move v1, v2

    :goto_1
    if-ge v1, v6, :cond_3

    .line 181
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 182
    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v7

    invoke-interface {v4}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v8

    if-ne v7, v8, :cond_1

    .line 183
    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v0

    iput v0, v3, Lcom/roidapp/imagelib/filter/ax;->b:I

    .line 185
    invoke-interface {v4}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v0

    if-eqz v0, :cond_2

    .line 186
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->e:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 187
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->d:Landroid/widget/SeekBar;

    invoke-virtual {v0, p2}, Landroid/widget/SeekBar;->setProgress(I)V

    move v0, v1

    .line 193
    :goto_2
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bg;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v1, v3}, Lcom/roidapp/baselib/hlistview/HListView;->a(Landroid/widget/ListAdapter;)V

    .line 194
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/bg;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v1, v0}, Lcom/roidapp/baselib/hlistview/HListView;->i(I)V

    goto :goto_0

    .line 180
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_2

    :cond_3
    move v0, v2

    goto :goto_2
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 123
    iput-boolean p1, p0, Lcom/roidapp/imagelib/filter/bg;->g:Z

    .line 124
    return-void
.end method

.method public final b()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/HListView;->z()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/ax;

    .line 199
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 200
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/ax;->a()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v0

    goto :goto_0
.end method

.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 1

    .prologue
    .line 37
    iput p2, p0, Lcom/roidapp/imagelib/filter/bg;->f:I

    .line 38
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/bg;->g:Z

    if-nez v0, :cond_0

    .line 39
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->c:Lcom/roidapp/imagelib/filter/ad;

    if-eqz v0, :cond_0

    .line 40
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->c:Lcom/roidapp/imagelib/filter/ad;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/ad;->g()V

    .line 44
    :cond_0
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 49
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->c:Lcom/roidapp/imagelib/filter/ad;

    if-eqz v0, :cond_0

    .line 54
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/bg;->g:Z

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/bg;->c:Lcom/roidapp/imagelib/filter/ad;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/ad;->g()V

    .line 59
    :cond_0
    return-void
.end method
