.class public Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;
.super Landroid/support/v7/widget/RecyclerView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView$SavedState;
    }
.end annotation


# static fields
.field private static h:I


# instance fields
.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:Landroid/util/SparseIntArray;

.field private o:Lcom/github/ksoichiro/android/observablescrollview/k;

.field private p:I

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Landroid/view/MotionEvent;

.field private u:Landroid/view/ViewGroup;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const/16 v0, 0x16

    sput v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->h:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 62
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    const/4 v0, -0x1

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->j:I

    .line 63
    invoke-direct {p0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->i()V

    .line 64
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 67
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 41
    const/4 v0, -0x1

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->j:I

    .line 68
    invoke-direct {p0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->i()V

    .line 69
    return-void
.end method

.method private i()V
    .locals 1

    .prologue
    .line 328
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->n:Landroid/util/SparseIntArray;

    .line 329
    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0, v0}, Landroid/support/v7/widget/RecyclerView;->c(Landroid/view/View;)I
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 330
    :goto_0
    return-void

    .line 329
    :catch_0
    move-exception v0

    const/16 v0, 0x15

    sput v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->h:I

    goto :goto_0
.end method


# virtual methods
.method public final c(Landroid/view/View;)I
    .locals 2

    .prologue
    .line 321
    const/16 v0, 0x16

    sget v1, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->h:I

    if-gt v0, v1, :cond_0

    .line 322
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->c(Landroid/view/View;)I

    move-result v0

    .line 324
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/RecyclerView;->c(Landroid/view/View;)I

    move-result v0

    goto :goto_0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->o:Lcom/github/ksoichiro/android/observablescrollview/k;

    if-eqz v0, :cond_0

    .line 183
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 192
    :cond_0
    :goto_0
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 191
    :pswitch_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->r:Z

    iput-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->q:Z

    goto :goto_0

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .prologue
    .line 73
    check-cast p1, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView$SavedState;

    .line 74
    iget v0, p1, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView$SavedState;->b:I

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->i:I

    .line 75
    iget v0, p1, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView$SavedState;->c:I

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->j:I

    .line 76
    iget v0, p1, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView$SavedState;->d:I

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->k:I

    .line 77
    iget v0, p1, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView$SavedState;->e:I

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->l:I

    .line 78
    iget v0, p1, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView$SavedState;->f:I

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->m:I

    .line 79
    iget-object v0, p1, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView$SavedState;->g:Landroid/util/SparseIntArray;

    iput-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->n:Landroid/util/SparseIntArray;

    .line 80
    iget-object v0, p1, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView$SavedState;->h:Landroid/os/Parcelable;

    invoke-super {p0, v0}, Landroid/support/v7/widget/RecyclerView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 81
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .prologue
    .line 85
    invoke-super {p0}, Landroid/support/v7/widget/RecyclerView;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 86
    new-instance v1, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView$SavedState;

    invoke-direct {v1, v0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 87
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->i:I

    iput v0, v1, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView$SavedState;->b:I

    .line 88
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->j:I

    iput v0, v1, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView$SavedState;->c:I

    .line 89
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->k:I

    iput v0, v1, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView$SavedState;->d:I

    .line 90
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->l:I

    iput v0, v1, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView$SavedState;->e:I

    .line 91
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->m:I

    iput v0, v1, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView$SavedState;->f:I

    .line 92
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->n:Landroid/util/SparseIntArray;

    iput-object v0, v1, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView$SavedState;->g:Landroid/util/SparseIntArray;

    .line 93
    return-object v1
.end method

.method protected onScrollChanged(IIII)V
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v1, 0x0

    .line 98
    invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v7/widget/RecyclerView;->onScrollChanged(IIII)V

    .line 99
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->o:Lcom/github/ksoichiro/android/observablescrollview/k;

    if-eqz v0, :cond_8

    .line 100
    invoke-virtual {p0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->getChildCount()I

    move-result v0

    if-lez v0, :cond_8

    .line 101
    invoke-virtual {p0, v1}, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->c(Landroid/view/View;)I

    move-result v4

    .line 102
    invoke-virtual {p0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->c(Landroid/view/View;)I

    move-result v5

    move v2, v1

    move v3, v4

    .line 103
    :goto_0
    if-gt v3, v5, :cond_1

    .line 105
    invoke-virtual {p0, v2}, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 106
    if-eqz v0, :cond_10

    .line 107
    iget-object v6, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->n:Landroid/util/SparseIntArray;

    invoke-virtual {v6, v3}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    move-result v6

    if-ltz v6, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v6

    iget-object v7, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->n:Landroid/util/SparseIntArray;

    invoke-virtual {v7, v3}, Landroid/util/SparseIntArray;->get(I)I

    move-result v7

    if-eq v6, v7, :cond_10

    .line 108
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 111
    :goto_1
    iget-object v6, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->n:Landroid/util/SparseIntArray;

    invoke-virtual {v6, v3, v0}, Landroid/util/SparseIntArray;->put(II)V

    .line 103
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 114
    :cond_1
    invoke-virtual {p0, v1}, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 115
    if-eqz v3, :cond_8

    .line 116
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->i:I

    if-ge v0, v4, :cond_9

    .line 119
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->i:I

    sub-int v0, v4, v0

    if-eq v0, v8, :cond_3

    .line 120
    add-int/lit8 v0, v4, -0x1

    move v2, v1

    :goto_2
    iget v5, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->i:I

    if-le v0, v5, :cond_4

    .line 121
    iget-object v5, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->n:Landroid/util/SparseIntArray;

    invoke-virtual {v5, v0}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    move-result v5

    if-lez v5, :cond_2

    .line 122
    iget-object v5, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->n:Landroid/util/SparseIntArray;

    invoke-virtual {v5, v0}, Landroid/util/SparseIntArray;->get(I)I

    move-result v5

    add-int/2addr v2, v5

    .line 120
    :goto_3
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 127
    :cond_2
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v5

    add-int/2addr v2, v5

    goto :goto_3

    :cond_3
    move v2, v1

    .line 131
    :cond_4
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->k:I

    iget v5, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->j:I

    add-int/2addr v2, v5

    add-int/2addr v0, v2

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->k:I

    .line 132
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->j:I

    .line 154
    :cond_5
    :goto_4
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->j:I

    if-gez v0, :cond_6

    .line 155
    iput v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->j:I

    .line 157
    :cond_6
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->k:I

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v2

    sub-int/2addr v0, v2

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->m:I

    .line 158
    iput v4, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->i:I

    .line 160
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->o:Lcom/github/ksoichiro/android/observablescrollview/k;

    invoke-interface {v0}, Lcom/github/ksoichiro/android/observablescrollview/k;->j_()V

    .line 161
    iget-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->q:Z

    if-eqz v0, :cond_7

    .line 162
    iput-boolean v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->q:Z

    .line 165
    :cond_7
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->l:I

    iget v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->m:I

    if-ge v0, v1, :cond_e

    .line 167
    sget v0, Lcom/github/ksoichiro/android/observablescrollview/n;->b:I

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->p:I

    .line 174
    :goto_5
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->m:I

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->l:I

    .line 178
    :cond_8
    return-void

    .line 133
    :cond_9
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->i:I

    if-ge v4, v0, :cond_d

    .line 136
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->i:I

    sub-int/2addr v0, v4

    if-eq v0, v8, :cond_b

    .line 137
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->i:I

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    move v0, v1

    :goto_6
    if-le v2, v4, :cond_c

    .line 138
    iget-object v5, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->n:Landroid/util/SparseIntArray;

    invoke-virtual {v5, v2}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    move-result v5

    if-lez v5, :cond_a

    .line 139
    iget-object v5, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->n:Landroid/util/SparseIntArray;

    invoke-virtual {v5, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v5

    add-int/2addr v0, v5

    .line 137
    :goto_7
    add-int/lit8 v2, v2, -0x1

    goto :goto_6

    .line 144
    :cond_a
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v5

    add-int/2addr v0, v5

    goto :goto_7

    :cond_b
    move v0, v1

    .line 148
    :cond_c
    iget v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->k:I

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v5

    add-int/2addr v0, v5

    sub-int v0, v2, v0

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->k:I

    .line 149
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->j:I

    goto :goto_4

    .line 150
    :cond_d
    if-nez v4, :cond_5

    .line 151
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->j:I

    .line 152
    iput v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->k:I

    goto :goto_4

    .line 168
    :cond_e
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->m:I

    iget v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->l:I

    if-ge v0, v1, :cond_f

    .line 170
    sget v0, Lcom/github/ksoichiro/android/observablescrollview/n;->c:I

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->p:I

    goto :goto_5

    .line 172
    :cond_f
    sget v0, Lcom/github/ksoichiro/android/observablescrollview/n;->a:I

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->p:I

    goto :goto_5

    :cond_10
    move v0, v1

    goto/16 :goto_1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 201
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->o:Lcom/github/ksoichiro/android/observablescrollview/k;

    if-eqz v0, :cond_0

    .line 202
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 268
    :cond_0
    :goto_0
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :goto_1
    return v0

    .line 205
    :pswitch_0
    iput-boolean v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->s:Z

    .line 206
    iput-boolean v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->r:Z

    goto :goto_0

    .line 210
    :pswitch_1
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->t:Landroid/view/MotionEvent;

    if-nez v0, :cond_1

    .line 211
    iput-object p1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->t:Landroid/view/MotionEvent;

    .line 213
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->t:Landroid/view/MotionEvent;

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    sub-float/2addr v0, v1

    .line 214
    invoke-static {p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    iput-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->t:Landroid/view/MotionEvent;

    .line 215
    iget v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->m:I

    int-to-float v1, v1

    sub-float v0, v1, v0

    cmpg-float v0, v0, v3

    if-gtz v0, :cond_0

    .line 218
    iget-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->s:Z

    if-eqz v0, :cond_2

    move v0, v2

    .line 220
    goto :goto_1

    .line 225
    :cond_2
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->u:Landroid/view/ViewGroup;

    if-nez v0, :cond_3

    .line 226
    invoke-virtual {p0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    move-object v1, v0

    :goto_2
    move-object v0, p0

    move v4, v3

    .line 235
    :goto_3
    if-eqz v0, :cond_4

    if-eq v0, v1, :cond_4

    .line 236
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v6

    sub-int/2addr v5, v6

    int-to-float v5, v5

    add-float/2addr v4, v5

    .line 237
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v6

    sub-int/2addr v5, v6

    int-to-float v5, v5

    add-float/2addr v3, v5

    .line 235
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto :goto_3

    .line 228
    :cond_3
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->u:Landroid/view/ViewGroup;

    move-object v1, v0

    goto :goto_2

    .line 239
    :cond_4
    invoke-static {p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    .line 240
    invoke-virtual {v0, v4, v3}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 242
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 243
    const/4 v3, 0x1

    iput-boolean v3, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->s:Z

    .line 248
    invoke-virtual {v0, v2}, Landroid/view/MotionEvent;->setAction(I)V

    .line 252
    new-instance v3, Lcom/github/ksoichiro/android/observablescrollview/g;

    invoke-direct {v3, p0, v1, v0}, Lcom/github/ksoichiro/android/observablescrollview/g;-><init>(Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;Landroid/view/ViewGroup;Landroid/view/MotionEvent;)V

    invoke-virtual {p0, v3}, Lcom/github/ksoichiro/android/observablescrollview/ObservableRecyclerView;->post(Ljava/lang/Runnable;)Z

    move v0, v2

    .line 258
    goto :goto_1

    .line 263
    :cond_5
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_1

    .line 202
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
