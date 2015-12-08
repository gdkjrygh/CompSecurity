.class public Lkik/android/widget/TransparentListView;
.super Lcom/github/ksoichiro/android/observablescrollview/ObservableListView;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0, p1}, Lcom/github/ksoichiro/android/observablescrollview/ObservableListView;-><init>(Landroid/content/Context;)V

    .line 48
    invoke-direct {p0}, Lkik/android/widget/TransparentListView;->a()V

    .line 49
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0, p1, p2}, Lcom/github/ksoichiro/android/observablescrollview/ObservableListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 54
    invoke-direct {p0}, Lkik/android/widget/TransparentListView;->a()V

    .line 55
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0, p1, p2, p3}, Lcom/github/ksoichiro/android/observablescrollview/ObservableListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 60
    invoke-direct {p0}, Lkik/android/widget/TransparentListView;->a()V

    .line 61
    return-void
.end method

.method private a()V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 20
    const/16 v0, 0x9

    invoke-static {v0}, Lcom/kik/sdkutils/y;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 22
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Lkik/android/widget/TransparentListView;->setOverscrollFooter(Landroid/graphics/drawable/Drawable;)V

    .line 23
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/widget/TransparentListView;->setOverscrollHeader(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :cond_0
    :goto_0
    return-void

    .line 25
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/SecurityException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 38
    :try_start_0
    invoke-super {p0, p1}, Lcom/github/ksoichiro/android/observablescrollview/ObservableListView;->onTouchEvent(Landroid/view/MotionEvent;)Z
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 41
    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public setTranscriptMode(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 76
    invoke-super {p0, p1}, Lcom/github/ksoichiro/android/observablescrollview/ObservableListView;->setTranscriptMode(I)V

    .line 77
    return-void
.end method
