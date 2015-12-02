.class public Lcom/facebook/widget/CustomRelativeLayout;
.super Landroid/widget/RelativeLayout;
.source "CustomRelativeLayout.java"

# interfaces
.implements Lcom/facebook/widget/g;


# instance fields
.field private a:Lcom/facebook/c/a/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
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
    .line 54
    invoke-virtual {p0, p1}, Lcom/facebook/widget/CustomRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method protected b()V
    .locals 2

    .prologue
    .line 122
    iget-object v0, p0, Lcom/facebook/widget/CustomRelativeLayout;->a:Lcom/facebook/c/a/d;

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/facebook/widget/CustomRelativeLayout;->a:Lcom/facebook/c/a/d;

    invoke-virtual {p0}, Lcom/facebook/widget/CustomRelativeLayout;->getEventBus()Lcom/facebook/c/a/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/c/a/d;->a(Lcom/facebook/c/a/b;)V

    .line 125
    :cond_0
    return-void
.end method

.method protected c()V
    .locals 2

    .prologue
    .line 128
    iget-object v0, p0, Lcom/facebook/widget/CustomRelativeLayout;->a:Lcom/facebook/c/a/d;

    if-eqz v0, :cond_0

    .line 129
    iget-object v0, p0, Lcom/facebook/widget/CustomRelativeLayout;->a:Lcom/facebook/c/a/d;

    invoke-virtual {p0}, Lcom/facebook/widget/CustomRelativeLayout;->getEventBus()Lcom/facebook/c/a/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/c/a/d;->b(Lcom/facebook/c/a/b;)V

    .line 131
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
    .line 137
    const/4 v0, 0x0

    return-object v0
.end method

.method protected getInjector()Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 49
    invoke-virtual {p0}, Lcom/facebook/widget/CustomRelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .prologue
    .line 99
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onAttachedToWindow()V

    .line 100
    invoke-virtual {p0}, Lcom/facebook/widget/CustomRelativeLayout;->b()V

    .line 101
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .prologue
    .line 105
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onDetachedFromWindow()V

    .line 106
    invoke-virtual {p0}, Lcom/facebook/widget/CustomRelativeLayout;->c()V

    .line 107
    return-void
.end method

.method public onFinishTemporaryDetach()V
    .locals 0

    .prologue
    .line 117
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onFinishTemporaryDetach()V

    .line 118
    invoke-virtual {p0}, Lcom/facebook/widget/CustomRelativeLayout;->b()V

    .line 119
    return-void
.end method

.method public onStartTemporaryDetach()V
    .locals 0

    .prologue
    .line 111
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onStartTemporaryDetach()V

    .line 112
    invoke-virtual {p0}, Lcom/facebook/widget/CustomRelativeLayout;->c()V

    .line 113
    return-void
.end method

.method protected setContentView(I)V
    .locals 2

    .prologue
    .line 42
    const-string v0, "CustomRelativeLayout.setContentView"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 43
    invoke-virtual {p0}, Lcom/facebook/widget/CustomRelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 44
    invoke-virtual {v1, p1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 45
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 46
    return-void
.end method
