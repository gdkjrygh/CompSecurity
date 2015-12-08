.class public Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;
.super Landroid/widget/ScrollView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView$SavedState;
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:Lcom/github/ksoichiro/android/observablescrollview/k;

.field private d:I

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Landroid/view/MotionEvent;

.field private i:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0, p1, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 52
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 56
    return-void
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->c:Lcom/github/ksoichiro/android/observablescrollview/k;

    if-eqz v0, :cond_0

    .line 104
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 113
    :cond_0
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 112
    :pswitch_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->f:Z

    iput-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->e:Z

    goto :goto_0

    .line 104
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .prologue
    .line 60
    check-cast p1, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView$SavedState;

    .line 61
    iget v0, p1, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView$SavedState;->a:I

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->a:I

    .line 62
    iget v0, p1, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView$SavedState;->b:I

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->b:I

    .line 63
    invoke-virtual {p1}, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/ScrollView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 64
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .prologue
    .line 68
    invoke-super {p0}, Landroid/widget/ScrollView;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 69
    new-instance v1, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView$SavedState;

    invoke-direct {v1, v0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 70
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->a:I

    iput v0, v1, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView$SavedState;->a:I

    .line 71
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->b:I

    iput v0, v1, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView$SavedState;->b:I

    .line 72
    return-object v1
.end method

.method protected onScrollChanged(IIII)V
    .locals 1

    .prologue
    .line 77
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;->onScrollChanged(IIII)V

    .line 78
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->c:Lcom/github/ksoichiro/android/observablescrollview/k;

    if-eqz v0, :cond_2

    .line 79
    iput p2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->b:I

    .line 81
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->c:Lcom/github/ksoichiro/android/observablescrollview/k;

    invoke-interface {v0}, Lcom/github/ksoichiro/android/observablescrollview/k;->j_()V

    .line 82
    iget-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->e:Z

    if-eqz v0, :cond_0

    .line 83
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->e:Z

    .line 86
    :cond_0
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->a:I

    if-ge v0, p2, :cond_3

    .line 87
    sget v0, Lcom/github/ksoichiro/android/observablescrollview/n;->b:I

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->d:I

    .line 97
    :cond_1
    :goto_0
    iput p2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->a:I

    .line 99
    :cond_2
    return-void

    .line 88
    :cond_3
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->a:I

    if-ge p2, v0, :cond_1

    .line 89
    sget v0, Lcom/github/ksoichiro/android/observablescrollview/n;->c:I

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->d:I

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 122
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->c:Lcom/github/ksoichiro/android/observablescrollview/k;

    if-eqz v0, :cond_0

    .line 123
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 189
    :cond_0
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :goto_1
    return v0

    .line 126
    :pswitch_0
    iput-boolean v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->g:Z

    .line 127
    iput-boolean v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->f:Z

    goto :goto_0

    .line 131
    :pswitch_1
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->h:Landroid/view/MotionEvent;

    if-nez v0, :cond_1

    .line 132
    iput-object p1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->h:Landroid/view/MotionEvent;

    .line 134
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->h:Landroid/view/MotionEvent;

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    sub-float/2addr v0, v1

    .line 135
    invoke-static {p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    iput-object v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->h:Landroid/view/MotionEvent;

    .line 136
    iget v1, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->b:I

    int-to-float v1, v1

    sub-float v0, v1, v0

    cmpg-float v0, v0, v3

    if-gtz v0, :cond_0

    .line 139
    iget-boolean v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->g:Z

    if-eqz v0, :cond_2

    move v0, v2

    .line 141
    goto :goto_1

    .line 146
    :cond_2
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->i:Landroid/view/ViewGroup;

    if-nez v0, :cond_3

    .line 147
    invoke-virtual {p0}, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    move-object v1, v0

    :goto_2
    move-object v0, p0

    move v4, v3

    .line 156
    :goto_3
    if-eqz v0, :cond_4

    if-eq v0, v1, :cond_4

    .line 157
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v6

    sub-int/2addr v5, v6

    int-to-float v5, v5

    add-float/2addr v4, v5

    .line 158
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v6

    sub-int/2addr v5, v6

    int-to-float v5, v5

    add-float/2addr v3, v5

    .line 156
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto :goto_3

    .line 149
    :cond_3
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->i:Landroid/view/ViewGroup;

    move-object v1, v0

    goto :goto_2

    .line 160
    :cond_4
    invoke-static {p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    .line 161
    invoke-virtual {v0, v4, v3}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 163
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 164
    const/4 v3, 0x1

    iput-boolean v3, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->g:Z

    .line 169
    invoke-virtual {v0, v2}, Landroid/view/MotionEvent;->setAction(I)V

    .line 173
    new-instance v3, Lcom/github/ksoichiro/android/observablescrollview/i;

    invoke-direct {v3, p0, v1, v0}, Lcom/github/ksoichiro/android/observablescrollview/i;-><init>(Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;Landroid/view/ViewGroup;Landroid/view/MotionEvent;)V

    invoke-virtual {p0, v3}, Lcom/github/ksoichiro/android/observablescrollview/ObservableScrollView;->post(Ljava/lang/Runnable;)Z

    move v0, v2

    .line 179
    goto :goto_1

    .line 184
    :cond_5
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_1

    .line 123
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
