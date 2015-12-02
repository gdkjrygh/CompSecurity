.class public Lcom/facebook/widget/e;
.super Landroid/widget/LinearLayout;
.source "CustomLinearLayout.java"

# interfaces
.implements Lcom/facebook/widget/g;


# instance fields
.field private a:Lcom/facebook/c/a/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 35
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 44
    return-void
.end method


# virtual methods
.method protected a(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .prologue
    .line 59
    invoke-virtual {p0, p1}, Lcom/facebook/widget/e;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method protected b()V
    .locals 2

    .prologue
    .line 127
    iget-object v0, p0, Lcom/facebook/widget/e;->a:Lcom/facebook/c/a/d;

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/facebook/widget/e;->a:Lcom/facebook/c/a/d;

    invoke-virtual {p0}, Lcom/facebook/widget/e;->getEventBus()Lcom/facebook/c/a/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/c/a/d;->a(Lcom/facebook/c/a/b;)V

    .line 130
    :cond_0
    return-void
.end method

.method protected c()V
    .locals 2

    .prologue
    .line 133
    iget-object v0, p0, Lcom/facebook/widget/e;->a:Lcom/facebook/c/a/d;

    if-eqz v0, :cond_0

    .line 134
    iget-object v0, p0, Lcom/facebook/widget/e;->a:Lcom/facebook/c/a/d;

    invoke-virtual {p0}, Lcom/facebook/widget/e;->getEventBus()Lcom/facebook/c/a/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/c/a/d;->b(Lcom/facebook/c/a/b;)V

    .line 136
    :cond_0
    return-void
.end method

.method protected getEventBus()Lcom/facebook/c/a/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/facebook/c/a/b;",
            ">()TT;"
        }
    .end annotation

    .prologue
    .line 142
    const/4 v0, 0x0

    return-object v0
.end method

.method protected getInjector()Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 54
    invoke-virtual {p0}, Lcom/facebook/widget/e;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .prologue
    .line 104
    invoke-super {p0}, Landroid/widget/LinearLayout;->onAttachedToWindow()V

    .line 105
    invoke-virtual {p0}, Lcom/facebook/widget/e;->b()V

    .line 106
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .prologue
    .line 110
    invoke-super {p0}, Landroid/widget/LinearLayout;->onDetachedFromWindow()V

    .line 111
    invoke-virtual {p0}, Lcom/facebook/widget/e;->c()V

    .line 112
    return-void
.end method

.method public onFinishTemporaryDetach()V
    .locals 0

    .prologue
    .line 122
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishTemporaryDetach()V

    .line 123
    invoke-virtual {p0}, Lcom/facebook/widget/e;->b()V

    .line 124
    return-void
.end method

.method public onStartTemporaryDetach()V
    .locals 0

    .prologue
    .line 116
    invoke-super {p0}, Landroid/widget/LinearLayout;->onStartTemporaryDetach()V

    .line 117
    invoke-virtual {p0}, Lcom/facebook/widget/e;->c()V

    .line 118
    return-void
.end method

.method protected setContentView(I)V
    .locals 2

    .prologue
    .line 47
    const-string v0, "CustomLinearLayout.setContentView"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 48
    invoke-virtual {p0}, Lcom/facebook/widget/e;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 49
    invoke-virtual {v1, p1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 50
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 51
    return-void
.end method
