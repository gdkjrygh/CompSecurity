.class public Lcom/facebook/widget/titlebar/TitleBarViewStub;
.super Landroid/view/View;
.source "TitleBarViewStub.java"


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/Boolean;

.field private d:Ljava/lang/Boolean;

.field private e:Ljava/lang/Boolean;

.field private f:Lcom/facebook/config/a/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 36
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/widget/titlebar/TitleBarViewStub;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/widget/titlebar/TitleBarViewStub;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 44
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 46
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 47
    const-class v1, Lcom/facebook/config/a/d;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/d;

    iput-object v0, p0, Lcom/facebook/widget/titlebar/TitleBarViewStub;->f:Lcom/facebook/config/a/d;

    .line 51
    sget-object v0, Lcom/facebook/q;->TitleBarViewStub:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 52
    sget v1, Lcom/facebook/q;->TitleBarViewStub_title:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/widget/titlebar/TitleBarViewStub;->b:Ljava/lang/String;

    .line 53
    sget v1, Lcom/facebook/q;->TitleBarViewStub_hasProgressBar:I

    invoke-direct {p0, v0, v1}, Lcom/facebook/widget/titlebar/TitleBarViewStub;->a(Landroid/content/res/TypedArray;I)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/widget/titlebar/TitleBarViewStub;->c:Ljava/lang/Boolean;

    .line 54
    sget v1, Lcom/facebook/q;->TitleBarViewStub_hasBackButton:I

    invoke-direct {p0, v0, v1}, Lcom/facebook/widget/titlebar/TitleBarViewStub;->a(Landroid/content/res/TypedArray;I)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/widget/titlebar/TitleBarViewStub;->d:Ljava/lang/Boolean;

    .line 55
    sget v1, Lcom/facebook/q;->TitleBarViewStub_navless:I

    invoke-direct {p0, v0, v1}, Lcom/facebook/widget/titlebar/TitleBarViewStub;->a(Landroid/content/res/TypedArray;I)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/widget/titlebar/TitleBarViewStub;->e:Ljava/lang/Boolean;

    .line 57
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 59
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/widget/titlebar/TitleBarViewStub;->setWillNotDraw(Z)V

    .line 60
    return-void
.end method

.method private a()Landroid/view/View;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 106
    invoke-virtual {p0}, Lcom/facebook/widget/titlebar/TitleBarViewStub;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 108
    if-eqz v0, :cond_6

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_6

    .line 109
    check-cast v0, Landroid/view/ViewGroup;

    .line 110
    invoke-virtual {p0}, Lcom/facebook/widget/titlebar/TitleBarViewStub;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 113
    iget-object v2, p0, Lcom/facebook/widget/titlebar/TitleBarViewStub;->f:Lcom/facebook/config/a/d;

    sget-object v3, Lcom/facebook/config/a/d;->FB4A:Lcom/facebook/config/a/d;

    if-ne v2, v3, :cond_3

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v3, p0, Lcom/facebook/widget/titlebar/TitleBarViewStub;->e:Ljava/lang/Boolean;

    invoke-virtual {v2, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 114
    sget v2, Lcom/facebook/k;->titlebar_wrapper_navless:I

    invoke-virtual {v1, v2, v0, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 121
    :goto_0
    instance-of v1, v2, Lcom/facebook/widget/titlebar/a;

    if-eqz v1, :cond_4

    move-object v1, v2

    .line 122
    check-cast v1, Lcom/facebook/widget/titlebar/a;

    .line 127
    :goto_1
    iget-object v3, p0, Lcom/facebook/widget/titlebar/TitleBarViewStub;->b:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 128
    iget-object v3, p0, Lcom/facebook/widget/titlebar/TitleBarViewStub;->b:Ljava/lang/String;

    invoke-interface {v1, v3}, Lcom/facebook/widget/titlebar/a;->setTitle(Ljava/lang/String;)V

    .line 130
    :cond_0
    iget-object v3, p0, Lcom/facebook/widget/titlebar/TitleBarViewStub;->c:Ljava/lang/Boolean;

    if-eqz v3, :cond_1

    .line 131
    iget-object v3, p0, Lcom/facebook/widget/titlebar/TitleBarViewStub;->c:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-interface {v1, v3}, Lcom/facebook/widget/titlebar/a;->setHasProgressBar(Z)V

    .line 133
    :cond_1
    iget-object v3, p0, Lcom/facebook/widget/titlebar/TitleBarViewStub;->d:Ljava/lang/Boolean;

    if-eqz v3, :cond_2

    .line 134
    iget-object v3, p0, Lcom/facebook/widget/titlebar/TitleBarViewStub;->d:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-interface {v1, v3}, Lcom/facebook/widget/titlebar/a;->setHasBackButton(Z)V

    .line 137
    :cond_2
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    .line 138
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V

    .line 140
    invoke-virtual {p0}, Lcom/facebook/widget/titlebar/TitleBarViewStub;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 141
    if-eqz v3, :cond_5

    .line 142
    invoke-virtual {v0, v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 147
    :goto_2
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/facebook/widget/titlebar/TitleBarViewStub;->a:Ljava/lang/ref/WeakReference;

    .line 149
    return-object v2

    .line 116
    :cond_3
    sget v2, Lcom/facebook/k;->titlebar_wrapper:I

    invoke-virtual {v1, v2, v0, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    goto :goto_0

    .line 125
    :cond_4
    sget v1, Lcom/facebook/i;->titlebar:I

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/titlebar/a;

    goto :goto_1

    .line 144
    :cond_5
    invoke-virtual {v0, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    goto :goto_2

    .line 151
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ViewStub must have a non-null ViewGroup viewParent"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a(Landroid/content/res/TypedArray;I)Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 63
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 77
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 73
    return-void
.end method

.method protected onMeasure(II)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 68
    invoke-virtual {p0, v0, v0}, Lcom/facebook/widget/titlebar/TitleBarViewStub;->setMeasuredDimension(II)V

    .line 69
    return-void
.end method

.method public setVisibility(I)V
    .locals 2

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/widget/titlebar/TitleBarViewStub;->a:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    .line 91
    iget-object v0, p0, Lcom/facebook/widget/titlebar/TitleBarViewStub;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 92
    if-eqz v0, :cond_1

    .line 93
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 103
    :cond_0
    :goto_0
    return-void

    .line 95
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "setVisibility called on un-referenced view"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 98
    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 99
    if-eqz p1, :cond_3

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 100
    :cond_3
    invoke-direct {p0}, Lcom/facebook/widget/titlebar/TitleBarViewStub;->a()Landroid/view/View;

    goto :goto_0
.end method
