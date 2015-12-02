.class public Lcom/facebook/orca/threadlist/ThreadListView;
.super Lcom/facebook/widget/listview/BetterListView;
.source "ThreadListView.java"

# interfaces
.implements Lcom/facebook/orca/threadlist/bo;


# instance fields
.field private a:Lcom/facebook/orca/threadlist/i;

.field private final b:Landroid/widget/AbsListView$OnScrollListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/facebook/widget/listview/BetterListView;-><init>(Landroid/content/Context;)V

    .line 19
    new-instance v0, Lcom/facebook/orca/threadlist/bn;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadlist/bn;-><init>(Lcom/facebook/orca/threadlist/ThreadListView;)V

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListView;->b:Landroid/widget/AbsListView$OnScrollListener;

    .line 37
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListView;->d()V

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/listview/BetterListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    new-instance v0, Lcom/facebook/orca/threadlist/bn;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadlist/bn;-><init>(Lcom/facebook/orca/threadlist/ThreadListView;)V

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListView;->b:Landroid/widget/AbsListView$OnScrollListener;

    .line 45
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListView;->d()V

    .line 46
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 49
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/listview/BetterListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    new-instance v0, Lcom/facebook/orca/threadlist/bn;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadlist/bn;-><init>(Lcom/facebook/orca/threadlist/ThreadListView;)V

    iput-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListView;->b:Landroid/widget/AbsListView$OnScrollListener;

    .line 50
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/ThreadListView;->d()V

    .line 51
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/ThreadListView;)Lcom/facebook/orca/threadlist/i;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListView;->a:Lcom/facebook/orca/threadlist/i;

    return-object v0
.end method

.method private d()V
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListView;->b:Landroid/widget/AbsListView$OnScrollListener;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/ThreadListView;->a(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 55
    return-void
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListView;->a:Lcom/facebook/orca/threadlist/i;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListView;->a:Lcom/facebook/orca/threadlist/i;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threadlist/i;->b(Landroid/view/MotionEvent;)V

    .line 65
    invoke-super {p0, p1}, Lcom/facebook/widget/listview/BetterListView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .prologue
    .line 84
    invoke-super {p0}, Lcom/facebook/widget/listview/BetterListView;->onAttachedToWindow()V

    .line 85
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListView;->a:Lcom/facebook/orca/threadlist/i;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListView;->a:Lcom/facebook/orca/threadlist/i;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/i;->b()V

    .line 87
    return-void
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 77
    invoke-super {p0, p1}, Lcom/facebook/widget/listview/BetterListView;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 78
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListView;->a:Lcom/facebook/orca/threadlist/i;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListView;->a:Lcom/facebook/orca/threadlist/i;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/i;->a()V

    .line 80
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 91
    invoke-super {p0}, Lcom/facebook/widget/listview/BetterListView;->onDetachedFromWindow()V

    .line 92
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListView;->a:Lcom/facebook/orca/threadlist/i;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListView;->a:Lcom/facebook/orca/threadlist/i;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/i;->c()V

    .line 94
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListView;->a:Lcom/facebook/orca/threadlist/i;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ThreadListView;->a:Lcom/facebook/orca/threadlist/i;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threadlist/i;->a(Landroid/view/MotionEvent;)Z

    .line 72
    invoke-super {p0, p1}, Lcom/facebook/widget/listview/BetterListView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public setPublisherController(Lcom/facebook/orca/threadlist/i;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/facebook/orca/threadlist/ThreadListView;->a:Lcom/facebook/orca/threadlist/i;

    .line 59
    return-void
.end method
