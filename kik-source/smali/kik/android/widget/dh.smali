.class final Lkik/android/widget/dh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field final synthetic a:Landroid/view/ViewTreeObserver;

.field final synthetic b:Z

.field final synthetic c:Landroid/widget/ArrayAdapter;

.field final synthetic d:Ljava/util/HashMap;

.field final synthetic e:Lkik/android/widget/ResizeEventList;


# direct methods
.method constructor <init>(Lkik/android/widget/ResizeEventList;Landroid/view/ViewTreeObserver;ZLandroid/widget/ArrayAdapter;Ljava/util/HashMap;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lkik/android/widget/dh;->e:Lkik/android/widget/ResizeEventList;

    iput-object p2, p0, Lkik/android/widget/dh;->a:Landroid/view/ViewTreeObserver;

    iput-boolean p3, p0, Lkik/android/widget/dh;->b:Z

    iput-object p4, p0, Lkik/android/widget/dh;->c:Landroid/widget/ArrayAdapter;

    iput-object p5, p0, Lkik/android/widget/dh;->d:Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 12

    .prologue
    .line 112
    iget-object v0, p0, Lkik/android/widget/dh;->a:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    .line 113
    const/4 v0, 0x1

    .line 188
    :goto_0
    return v0

    .line 115
    :cond_0
    iget-object v0, p0, Lkik/android/widget/dh;->a:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 117
    iget-object v0, p0, Lkik/android/widget/dh;->e:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v0}, Lkik/android/widget/ResizeEventList;->getFirstVisiblePosition()I

    move-result v0

    .line 119
    iget-object v1, p0, Lkik/android/widget/dh;->e:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v1}, Lkik/android/widget/ResizeEventList;->getLastVisiblePosition()I

    move-result v1

    sub-int/2addr v1, v0

    add-int/lit8 v1, v1, -0x1

    .line 120
    iget-object v2, p0, Lkik/android/widget/dh;->e:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v2, v1}, Lkik/android/widget/ResizeEventList;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 122
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 124
    new-instance v5, Landroid/animation/AnimatorSet;

    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    .line 126
    iget-boolean v1, p0, Lkik/android/widget/dh;->b:Z

    if-eqz v1, :cond_5

    .line 129
    add-int/lit8 v0, v0, 0x1

    move v1, v0

    .line 132
    :goto_1
    const/4 v0, 0x0

    move v2, v0

    :goto_2
    iget-object v0, p0, Lkik/android/widget/dh;->e:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v0}, Lkik/android/widget/ResizeEventList;->getChildCount()I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 133
    iget-object v0, p0, Lkik/android/widget/dh;->e:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v0, v2}, Lkik/android/widget/ResizeEventList;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 134
    add-int v0, v1, v2

    .line 136
    iget-object v7, p0, Lkik/android/widget/dh;->c:Landroid/widget/ArrayAdapter;

    invoke-virtual {v7, v0}, Landroid/widget/ArrayAdapter;->getItemId(I)J

    move-result-wide v8

    .line 137
    iget-object v0, p0, Lkik/android/widget/dh;->d:Ljava/util/HashMap;

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    .line 138
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v7

    .line 139
    if-eq v6, v3, :cond_1

    if-nez v0, :cond_3

    .line 145
    :cond_1
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    move-result v0

    iget-object v10, p0, Lkik/android/widget/dh;->e:Lkik/android/widget/ResizeEventList;

    invoke-virtual {v10}, Lkik/android/widget/ResizeEventList;->getDividerHeight()I

    move-result v10

    add-int/2addr v0, v10

    .line 146
    if-lez v2, :cond_2

    :goto_3
    add-int/2addr v0, v7

    .line 147
    sub-int/2addr v0, v7

    .line 148
    sget-object v7, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    const/4 v10, 0x2

    new-array v10, v10, [F

    const/4 v11, 0x0

    int-to-float v0, v0

    aput v0, v10, v11

    const/4 v0, 0x1

    const/4 v11, 0x0

    aput v11, v10, v0

    invoke-static {v6, v7, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 151
    const-wide/16 v6, 0x64

    invoke-virtual {v0, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 153
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    :goto_4
    iget-object v0, p0, Lkik/android/widget/dh;->d:Ljava/util/HashMap;

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    .line 146
    :cond_2
    neg-int v0, v0

    goto :goto_3

    .line 161
    :cond_3
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 162
    sub-int/2addr v0, v7

    .line 163
    sget-object v7, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    const/4 v10, 0x2

    new-array v10, v10, [F

    const/4 v11, 0x0

    int-to-float v0, v0

    aput v0, v10, v11

    const/4 v0, 0x1

    const/4 v11, 0x0

    aput v11, v10, v0

    invoke-static {v6, v7, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 165
    const-wide/16 v6, 0x64

    invoke-virtual {v0, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 166
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 172
    :cond_4
    new-instance v0, Lkik/android/widget/di;

    invoke-direct {v0, p0}, Lkik/android/widget/di;-><init>(Lkik/android/widget/dh;)V

    invoke-virtual {v5, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 184
    invoke-virtual {v5, v4}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    .line 186
    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->start()V

    .line 188
    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_5
    move v1, v0

    goto/16 :goto_1
.end method
