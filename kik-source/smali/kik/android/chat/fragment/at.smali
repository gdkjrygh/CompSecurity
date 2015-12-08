.class public final Lkik/android/chat/fragment/at;
.super Lkik/android/chat/fragment/ad;
.source "SourceFile"


# instance fields
.field private d:Ljava/util/List;

.field private e:Lkik/a/e/w;

.field private f:Lkik/a/e/r;

.field private g:Lkik/android/util/ao;

.field private h:Lkik/a/d/k;

.field private i:Z

.field private j:Lcom/kik/android/a;

.field private k:Z


# direct methods
.method public constructor <init>(Lkik/a/d/k;Ljava/util/List;Lkik/a/e/w;Lcom/kik/cache/ad;Lkik/android/util/ao;IIZLkik/a/e/r;Lcom/kik/android/a;)V
    .locals 1

    .prologue
    .line 52
    invoke-direct {p0, p4, p6, p7}, Lkik/android/chat/fragment/ad;-><init>(Lcom/kik/cache/ad;II)V

    .line 53
    iput-object p1, p0, Lkik/android/chat/fragment/at;->h:Lkik/a/d/k;

    .line 54
    iput-object p2, p0, Lkik/android/chat/fragment/at;->d:Ljava/util/List;

    .line 55
    iput-object p3, p0, Lkik/android/chat/fragment/at;->e:Lkik/a/e/w;

    .line 56
    iput-object p5, p0, Lkik/android/chat/fragment/at;->g:Lkik/android/util/ao;

    .line 57
    iput-boolean p8, p0, Lkik/android/chat/fragment/at;->k:Z

    .line 58
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/at;->i:Z

    .line 59
    iput-object p10, p0, Lkik/android/chat/fragment/at;->j:Lcom/kik/android/a;

    .line 60
    iput-object p9, p0, Lkik/android/chat/fragment/at;->f:Lkik/a/e/r;

    .line 61
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/at;)Lkik/android/util/ao;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lkik/android/chat/fragment/at;->g:Lkik/android/util/ao;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/util/List;IIZ)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lkik/android/chat/fragment/at;->d:Ljava/util/List;

    .line 66
    iput-boolean p4, p0, Lkik/android/chat/fragment/at;->k:Z

    .line 67
    invoke-super {p0, p2, p3}, Lkik/android/chat/fragment/ad;->a(II)V

    .line 68
    return-void
.end method

.method public final areAllItemsEnabled()Z
    .locals 1

    .prologue
    .line 109
    const/4 v0, 0x0

    return v0
.end method

.method protected final b()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 183
    iget-object v2, p0, Lkik/android/chat/fragment/at;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/16 v3, 0x31

    if-lt v2, v3, :cond_0

    move v2, v0

    :goto_0
    if-nez v2, :cond_1

    :goto_1
    return v0

    :cond_0
    move v2, v1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method protected final c()Z
    .locals 1

    .prologue
    .line 188
    const/4 v0, 0x1

    return v0
.end method

.method public final getCount()I
    .locals 4

    .prologue
    .line 78
    iget-object v0, p0, Lkik/android/chat/fragment/at;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 79
    invoke-virtual {p0}, Lkik/android/chat/fragment/at;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 80
    add-int/lit8 v0, v0, 0x1

    .line 82
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 85
    int-to-double v0, v0

    iget v2, p0, Lkik/android/chat/fragment/at;->b:I

    int-to-double v2, v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lkik/android/chat/fragment/at;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 103
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11

    .prologue
    .line 122
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/chat/fragment/ad$b;

    iget-object v0, v0, Lkik/android/chat/fragment/ad$b;->a:[Lkik/android/chat/fragment/ad$a;

    array-length v0, v0

    iget v1, p0, Lkik/android/chat/fragment/at;->b:I

    if-eq v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 124
    :goto_0
    if-eqz v0, :cond_3

    .line 125
    new-instance p2, Landroid/widget/LinearLayout;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 126
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 127
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 128
    iget v0, p0, Lkik/android/chat/fragment/at;->c:I

    const/4 v1, 0x0

    iget v2, p0, Lkik/android/chat/fragment/at;->c:I

    const/4 v3, 0x0

    invoke-virtual {p2, v0, v1, v2, v3}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 130
    new-instance v2, Lkik/android/chat/fragment/ad$b;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/ad$b;-><init>(Lkik/android/chat/fragment/ad;)V

    .line 131
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget v0, p0, Lkik/android/chat/fragment/at;->b:I

    if-ge v1, v0, :cond_2

    .line 132
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 133
    const v3, 0x7f030024

    const/4 v4, 0x0

    invoke-virtual {v0, v3, p3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 134
    new-instance v4, Lkik/android/chat/fragment/ad$a;

    invoke-direct {v4, p0}, Lkik/android/chat/fragment/ad$a;-><init>(Lkik/android/chat/fragment/ad;)V

    .line 135
    const v0, 0x7f0e00c6

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ContactImageView;

    iput-object v0, v4, Lkik/android/chat/fragment/ad$a;->a:Lcom/kik/cache/ContactImageView;

    .line 136
    const v0, 0x7f0e00c8

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/RobotoTextView;

    iput-object v0, v4, Lkik/android/chat/fragment/ad$a;->b:Lkik/android/widget/RobotoTextView;

    .line 137
    const v0, 0x7f0e00c7

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lkik/android/chat/fragment/ad$a;->c:Landroid/widget/ImageView;

    .line 138
    const v0, 0x7f0e00c5

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, v4, Lkik/android/chat/fragment/ad$a;->e:Landroid/widget/FrameLayout;

    .line 139
    invoke-virtual {p2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 140
    iget v0, p0, Lkik/android/chat/fragment/at;->c:I

    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    iget v6, p0, Lkik/android/chat/fragment/at;->c:I

    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    move-result v7

    invoke-virtual {v3, v0, v5, v6, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 141
    iput-object v3, v4, Lkik/android/chat/fragment/ad$a;->d:Landroid/view/View;

    .line 142
    iget-object v0, v2, Lkik/android/chat/fragment/ad$b;->a:[Lkik/android/chat/fragment/ad$a;

    aput-object v4, v0, v1

    .line 131
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 122
    :cond_1
    const/4 v0, 0x0

    goto/16 :goto_0

    .line 145
    :cond_2
    invoke-virtual {p2, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 148
    :cond_3
    invoke-virtual {p0}, Lkik/android/chat/fragment/at;->b()Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    move v7, v0

    .line 149
    :goto_2
    add-int/lit8 v9, v7, 0x1

    .line 151
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lkik/android/chat/fragment/ad$b;

    .line 152
    const/4 v0, 0x0

    move v8, v0

    :goto_3
    iget v0, p0, Lkik/android/chat/fragment/at;->b:I

    if-ge v8, v0, :cond_13

    .line 153
    iget v0, p0, Lkik/android/chat/fragment/at;->b:I

    mul-int/2addr v0, p1

    add-int/2addr v0, v8

    .line 154
    iget-object v1, p0, Lkik/android/chat/fragment/at;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-boolean v1, p0, Lkik/android/chat/fragment/at;->k:Z

    if-eqz v1, :cond_12

    .line 155
    :cond_4
    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 156
    invoke-virtual {v6, v8}, Lkik/android/chat/fragment/ad$b;->a(I)Lkik/android/chat/fragment/ad$a;

    move-result-object v10

    .line 158
    invoke-virtual {p0}, Lkik/android/chat/fragment/at;->b()Z

    move-result v1

    if-eqz v1, :cond_8

    if-ne v0, v7, :cond_8

    .line 159
    if-eqz v10, :cond_5

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->d:Landroid/view/View;

    if-nez v0, :cond_7

    .line 152
    :cond_5
    :goto_4
    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_3

    .line 148
    :cond_6
    const/4 v0, -0x1

    move v7, v0

    goto :goto_2

    .line 159
    :cond_7
    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->d:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->a:Lcom/kik/cache/ContactImageView;

    const v1, 0x7f020035

    invoke-virtual {v0, v1}, Lcom/kik/cache/ContactImageView;->e(I)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->a:Lcom/kik/cache/ContactImageView;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/chat/fragment/at;->a:Lcom/kik/cache/ad;

    const/4 v3, 0x0

    iget-object v4, p0, Lkik/android/chat/fragment/at;->f:Lkik/a/e/r;

    iget-object v5, p0, Lkik/android/chat/fragment/at;->j:Lcom/kik/android/a;

    invoke-virtual/range {v0 .. v5}, Lcom/kik/cache/ContactImageView;->a(Lkik/a/d/k;Lcom/kik/cache/ad;ZLkik/a/e/r;Lcom/kik/android/a;)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->e:Landroid/widget/FrameLayout;

    iget-object v1, v10, Lkik/android/chat/fragment/ad$a;->d:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020134

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->b:Lkik/android/widget/RobotoTextView;

    const v1, 0x7f09028a

    invoke-virtual {v0, v1}, Lkik/android/widget/RobotoTextView;->setText(I)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->d:Landroid/view/View;

    new-instance v1, Lkik/android/chat/fragment/av;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/av;-><init>(Lkik/android/chat/fragment/at;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->d:Landroid/view/View;

    const-string v1, "AUTOMATION_CHAT_INFO_GROUP_MEMBER_ADD"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_4

    .line 161
    :cond_8
    if-ne v0, v9, :cond_c

    .line 162
    if-eqz v10, :cond_5

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->d:Landroid/view/View;

    if-eqz v0, :cond_5

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->d:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->e:Landroid/widget/FrameLayout;

    iget-object v1, v10, Lkik/android/chat/fragment/ad$a;->d:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020069

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->a:Lcom/kik/cache/ContactImageView;

    const v1, 0x7f020305

    invoke-virtual {v0, v1}, Lcom/kik/cache/ContactImageView;->e(I)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->a:Lcom/kik/cache/ContactImageView;

    iget-object v1, p0, Lkik/android/chat/fragment/at;->e:Lkik/a/e/w;

    invoke-interface {v1}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/at;->a:Lcom/kik/cache/ad;

    invoke-virtual {v0, v1, v2}, Lcom/kik/cache/ContactImageView;->a(Lkik/a/d/aa;Lcom/kik/cache/ad;)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->d:Landroid/view/View;

    new-instance v1, Lkik/android/chat/fragment/au;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/au;-><init>(Lkik/android/chat/fragment/at;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->b:Lkik/android/widget/RobotoTextView;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lkik/android/widget/RobotoTextView;->setTypeface(Landroid/graphics/Typeface;I)V

    iget-boolean v0, p0, Lkik/android/chat/fragment/at;->i:Z

    iget-boolean v1, p0, Lkik/android/chat/fragment/at;->i:Z

    if-nez v1, :cond_9

    iget-object v1, p0, Lkik/android/chat/fragment/at;->h:Lkik/a/d/k;

    if-eqz v1, :cond_9

    iget-object v0, p0, Lkik/android/chat/fragment/at;->h:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lkik/android/chat/fragment/at;->h:Lkik/a/d/k;

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->A()Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    :cond_9
    :goto_5
    if-eqz v0, :cond_b

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->c:Landroid/widget/ImageView;

    const v1, 0x7f020003

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->c:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_6
    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->b:Lkik/android/widget/RobotoTextView;

    const v1, 0x7f090327

    invoke-virtual {v0, v1}, Lkik/android/widget/RobotoTextView;->setText(I)V

    iget-object v0, p0, Lkik/android/chat/fragment/at;->e:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    iget-object v0, v0, Lkik/a/d/aa;->c:Ljava/lang/String;

    if-eqz v0, :cond_5

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->d:Landroid/view/View;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AUTOMATION_CHAT_INFO_GROUP_MEMBER_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lkik/android/chat/fragment/at;->e:Lkik/a/e/w;

    invoke-interface {v2}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v2

    iget-object v2, v2, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_a
    const/4 v0, 0x0

    goto :goto_5

    :cond_b
    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_6

    .line 165
    :cond_c
    invoke-virtual {p0}, Lkik/android/chat/fragment/at;->a()I

    move-result v1

    sub-int/2addr v0, v1

    .line 166
    iget-object v1, p0, Lkik/android/chat/fragment/at;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_11

    .line 167
    iget-object v1, p0, Lkik/android/chat/fragment/at;->d:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/k;

    if-eqz v10, :cond_5

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->d:Landroid/view/View;

    if-eqz v0, :cond_5

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->d:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->e:Landroid/widget/FrameLayout;

    iget-object v2, v10, Lkik/android/chat/fragment/ad$a;->d:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f020069

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->a:Lcom/kik/cache/ContactImageView;

    const v2, 0x7f020305

    invoke-virtual {v0, v2}, Lcom/kik/cache/ContactImageView;->e(I)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->a:Lcom/kik/cache/ContactImageView;

    iget-object v2, p0, Lkik/android/chat/fragment/at;->a:Lcom/kik/cache/ad;

    const/4 v3, 0x0

    iget-object v4, p0, Lkik/android/chat/fragment/at;->f:Lkik/a/e/r;

    iget-object v5, p0, Lkik/android/chat/fragment/at;->j:Lcom/kik/android/a;

    invoke-virtual/range {v0 .. v5}, Lcom/kik/cache/ContactImageView;->a(Lkik/a/d/k;Lcom/kik/cache/ad;ZLkik/a/e/r;Lcom/kik/android/a;)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->b:Lkik/android/widget/RobotoTextView;

    invoke-static {v1}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lkik/android/widget/RobotoTextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->d:Landroid/view/View;

    new-instance v2, Lkik/android/chat/fragment/aw;

    invoke-direct {v2, p0, v1}, Lkik/android/chat/fragment/aw;-><init>(Lkik/android/chat/fragment/at;Lkik/a/d/k;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v0, 0x0

    iget-object v2, p0, Lkik/android/chat/fragment/at;->h:Lkik/a/d/k;

    if-eqz v2, :cond_d

    iget-object v0, p0, Lkik/android/chat/fragment/at;->h:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->t()Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lkik/android/chat/fragment/at;->h:Lkik/a/d/k;

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0, v1}, Lkik/a/d/n;->d(Lkik/a/d/k;)Z

    move-result v0

    if-eqz v0, :cond_f

    const/4 v0, 0x1

    :goto_7
    iget-object v2, v10, Lkik/android/chat/fragment/ad$a;->c:Landroid/widget/ImageView;

    const v3, 0x7f020003

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_d
    if-nez v0, :cond_e

    invoke-virtual {v1}, Lkik/a/d/k;->i()Z

    move-result v2

    if-eqz v2, :cond_e

    const/4 v0, 0x1

    iget-object v2, v10, Lkik/android/chat/fragment/ad$a;->c:Landroid/widget/ImageView;

    const v3, 0x7f020094

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_e
    iget-object v2, v10, Lkik/android/chat/fragment/ad$a;->c:Landroid/widget/ImageView;

    if-eqz v0, :cond_10

    const/4 v0, 0x0

    :goto_8
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->d:Landroid/view/View;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "AUTOMATION_CHAT_INFO_GROUP_MEMBER_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_f
    const/4 v0, 0x0

    goto :goto_7

    :cond_10
    const/16 v0, 0x8

    goto :goto_8

    .line 170
    :cond_11
    iget-object v0, v10, Lkik/android/chat/fragment/ad$a;->d:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_4

    .line 175
    :cond_12
    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_4

    .line 178
    :cond_13
    return-object p2
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 282
    const/4 v0, 0x0

    return v0
.end method

.method public final isEnabled(I)Z
    .locals 1

    .prologue
    .line 115
    const/4 v0, 0x0

    return v0
.end method
