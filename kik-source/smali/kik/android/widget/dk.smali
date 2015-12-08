.class public final Lkik/android/widget/dk;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# static fields
.field private static final h:I


# instance fields
.field private a:Landroid/content/Context;

.field private final b:I

.field private final c:I

.field private final d:Landroid/view/LayoutInflater;

.field private final e:Lcom/kik/android/c/f;

.field private f:Lcom/kik/android/c/e;

.field private g:Ljava/util/List;

.field private i:I

.field private j:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const/16 v0, 0x8

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    sput v0, Lkik/android/widget/dk;->h:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/kik/android/c/f;)V
    .locals 2

    .prologue
    const v1, 0x7f02027f

    .line 39
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 40
    iput-object p1, p0, Lkik/android/widget/dk;->a:Landroid/content/Context;

    .line 41
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/dk;->d:Landroid/view/LayoutInflater;

    .line 42
    iget-object v0, p0, Lkik/android/widget/dk;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    iput v0, p0, Lkik/android/widget/dk;->b:I

    .line 43
    iget-object v0, p0, Lkik/android/widget/dk;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    iput v0, p0, Lkik/android/widget/dk;->c:I

    .line 44
    iput-object p2, p0, Lkik/android/widget/dk;->e:Lcom/kik/android/c/f;

    .line 45
    iget-object v0, p0, Lkik/android/widget/dk;->e:Lcom/kik/android/c/f;

    invoke-virtual {v0}, Lcom/kik/android/c/f;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/dk;->g:Ljava/util/List;

    .line 46
    invoke-virtual {p0}, Lkik/android/widget/dk;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lkik/android/widget/dk;->i:I

    .line 47
    iget-object v0, p0, Lkik/android/widget/dk;->e:Lcom/kik/android/c/f;

    invoke-virtual {v0}, Lcom/kik/android/c/f;->h()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/widget/dk;->j:J

    .line 48
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    .prologue
    .line 52
    iget v0, p0, Lkik/android/widget/dk;->b:I

    sget v1, Lkik/android/widget/dk;->h:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 103
    iput p1, p0, Lkik/android/widget/dk;->i:I

    .line 104
    invoke-virtual {p0}, Lkik/android/widget/dk;->notifyDataSetChanged()V

    .line 105
    return-void
.end method

.method public final a(Lcom/kik/android/c/e;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lkik/android/widget/dk;->f:Lcom/kik/android/c/e;

    .line 94
    if-eqz p1, :cond_0

    .line 97
    invoke-virtual {p0}, Lkik/android/widget/dk;->notifyDataSetChanged()V

    .line 99
    :cond_0
    return-void
.end method

.method public final b()I
    .locals 2

    .prologue
    .line 57
    iget v0, p0, Lkik/android/widget/dk;->c:I

    sget v1, Lkik/android/widget/dk;->h:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lkik/android/widget/dk;->e:Lcom/kik/android/c/f;

    invoke-virtual {v0}, Lcom/kik/android/c/f;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/dk;->g:Ljava/util/List;

    .line 70
    invoke-virtual {p0}, Lkik/android/widget/dk;->notifyDataSetChanged()V

    .line 71
    return-void
.end method

.method public final getCount()I
    .locals 2

    .prologue
    .line 64
    iget-object v0, p0, Lkik/android/widget/dk;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x14

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 76
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 82
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    .prologue
    const v8, 0x7f0e01e0

    const v9, 0x7f0202b0

    const v7, 0x7f0202a0

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 113
    if-nez p2, :cond_0

    .line 114
    iget-object v0, p0, Lkik/android/widget/dk;->d:Landroid/view/LayoutInflater;

    const v1, 0x7f030099

    invoke-virtual {v0, v1, p3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 115
    invoke-virtual {p2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/SmileyImageView;

    .line 116
    const v1, 0x7f0202a7

    invoke-virtual {v0, v1}, Lcom/kik/cache/SmileyImageView;->e(I)V

    .line 117
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Lcom/kik/cache/SmileyImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 118
    sget v1, Lkik/android/widget/dk;->h:I

    div-int/lit8 v1, v1, 0x2

    sget v2, Lkik/android/widget/dk;->h:I

    div-int/lit8 v2, v2, 0x2

    sget v5, Lkik/android/widget/dk;->h:I

    div-int/lit8 v5, v5, 0x2

    sget v6, Lkik/android/widget/dk;->h:I

    div-int/lit8 v6, v6, 0x2

    invoke-virtual {v0, v1, v2, v5, v6}, Lcom/kik/cache/SmileyImageView;->setPadding(IIII)V

    .line 120
    invoke-virtual {p2, v7}, Landroid/view/View;->setBackgroundResource(I)V

    .line 121
    new-instance v0, Landroid/widget/AbsListView$LayoutParams;

    invoke-virtual {p0}, Lkik/android/widget/dk;->a()I

    move-result v1

    invoke-virtual {p0}, Lkik/android/widget/dk;->b()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 123
    :cond_0
    invoke-virtual {p2, v7}, Landroid/view/View;->setBackgroundResource(I)V

    .line 124
    invoke-virtual {p2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/SmileyImageView;

    .line 125
    const v1, 0x7f0e01e1

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 126
    if-ltz p1, :cond_a

    iget-object v1, p0, Lkik/android/widget/dk;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_a

    iget v1, p0, Lkik/android/widget/dk;->i:I

    if-eq p1, v1, :cond_a

    .line 127
    iget v1, p0, Lkik/android/widget/dk;->i:I

    if-le p1, v1, :cond_1

    .line 129
    add-int/lit8 p1, p1, -0x1

    .line 131
    :cond_1
    iget-object v1, p0, Lkik/android/widget/dk;->g:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/android/c/f$b;

    .line 132
    invoke-virtual {v1}, Lcom/kik/android/c/f$b;->b()Lcom/kik/android/c/e;

    move-result-object v6

    .line 133
    invoke-static {}, Lcom/kik/android/c/f;->e()Lcom/kik/cache/ad;

    move-result-object v2

    invoke-virtual {v0, v6, v2}, Lcom/kik/cache/SmileyImageView;->a(Lcom/kik/android/c/e;Lcom/kik/cache/ad;)V

    .line 135
    iget-object v2, p0, Lkik/android/widget/dk;->f:Lcom/kik/android/c/e;

    if-eqz v2, :cond_3

    if-eqz v6, :cond_3

    .line 137
    iget-object v2, p0, Lkik/android/widget/dk;->f:Lcom/kik/android/c/e;

    invoke-virtual {v2}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lkik/android/widget/dk;->f:Lcom/kik/android/c/e;

    invoke-virtual {v2}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    move v2, v3

    .line 139
    :goto_0
    iget-object v7, p0, Lkik/android/widget/dk;->f:Lcom/kik/android/c/e;

    invoke-virtual {v7}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_6

    invoke-virtual {v6}, Lcom/kik/android/c/e;->e()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_6

    iget-object v7, p0, Lkik/android/widget/dk;->f:Lcom/kik/android/c/e;

    invoke-virtual {v7}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_6

    iget-object v7, p0, Lkik/android/widget/dk;->f:Lcom/kik/android/c/e;

    invoke-virtual {v7}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 140
    :goto_1
    if-nez v2, :cond_2

    if-eqz v3, :cond_3

    .line 141
    :cond_2
    const v2, 0x7f0200ad

    invoke-virtual {p2, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 145
    :cond_3
    invoke-virtual {p2, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 146
    if-eqz v6, :cond_4

    .line 147
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "AUTOMATION_SMILEY_TRAY_SMILEY_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/kik/android/c/e;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kik/cache/SmileyImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 149
    :cond_4
    invoke-virtual {v1}, Lcom/kik/android/c/f$b;->c()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 150
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 151
    invoke-virtual {v5, v9}, Landroid/view/View;->setBackgroundResource(I)V

    .line 172
    :goto_2
    return-object p2

    :cond_5
    move v2, v4

    .line 137
    goto :goto_0

    :cond_6
    move v3, v4

    .line 139
    goto :goto_1

    .line 153
    :cond_7
    invoke-virtual {v1}, Lcom/kik/android/c/f$b;->d()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 154
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 155
    iget-wide v2, p0, Lkik/android/widget/dk;->j:J

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/c/f$b;->a(J)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 158
    invoke-virtual {v5, v9}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_2

    .line 161
    :cond_8
    const v0, 0x7f0202b1

    invoke-virtual {v5, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_2

    .line 165
    :cond_9
    const/4 v0, 0x4

    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 169
    :cond_a
    invoke-virtual {v0}, Lcom/kik/cache/SmileyImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02020b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/cache/SmileyImageView;->b(Landroid/graphics/drawable/Drawable;)V

    .line 170
    const-string v1, "AUTOMATION_SMILEY_TRAY_STORE"

    invoke-virtual {v0, v1}, Lcom/kik/cache/SmileyImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_2
.end method

.method public final hasStableIds()Z
    .locals 1

    .prologue
    .line 88
    const/4 v0, 0x1

    return v0
.end method
