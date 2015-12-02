.class public Lcom/facebook/orca/reflex/k;
.super Lcom/facebook/reflex/view/h;
.source "ThreadListView.java"

# interfaces
.implements Lcom/facebook/orca/threadlist/bo;


# instance fields
.field private a:Lcom/facebook/orca/threadlist/i;

.field private final b:Lcom/facebook/reflex/ah;

.field private c:Landroid/widget/AbsListView$OnScrollListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .prologue
    .line 48
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/reflex/k;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 49
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 52
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/reflex/view/h;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    new-instance v0, Lcom/facebook/orca/reflex/l;

    invoke-direct {v0, p0}, Lcom/facebook/orca/reflex/l;-><init>(Lcom/facebook/orca/reflex/k;)V

    iput-object v0, p0, Lcom/facebook/orca/reflex/k;->b:Lcom/facebook/reflex/ah;

    .line 29
    new-instance v0, Lcom/facebook/orca/reflex/m;

    invoke-direct {v0, p0}, Lcom/facebook/orca/reflex/m;-><init>(Lcom/facebook/orca/reflex/k;)V

    iput-object v0, p0, Lcom/facebook/orca/reflex/k;->c:Landroid/widget/AbsListView$OnScrollListener;

    .line 53
    iget-object v0, p0, Lcom/facebook/orca/reflex/k;->b:Lcom/facebook/reflex/ah;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/reflex/k;->a(Lcom/facebook/reflex/ah;)V

    .line 54
    iget-object v0, p0, Lcom/facebook/orca/reflex/k;->c:Landroid/widget/AbsListView$OnScrollListener;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/reflex/k;->a(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 55
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/reflex/k;)Lcom/facebook/orca/threadlist/i;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/orca/reflex/k;->a:Lcom/facebook/orca/threadlist/i;

    return-object v0
.end method


# virtual methods
.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 63
    invoke-super {p0, p1}, Lcom/facebook/reflex/view/h;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 64
    iget-object v0, p0, Lcom/facebook/orca/reflex/k;->a:Lcom/facebook/orca/threadlist/i;

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    iget-object v0, p0, Lcom/facebook/orca/reflex/k;->a:Lcom/facebook/orca/threadlist/i;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/i;->a()V

    .line 66
    return-void
.end method

.method public setPublisherController(Lcom/facebook/orca/threadlist/i;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/facebook/orca/reflex/k;->a:Lcom/facebook/orca/threadlist/i;

    .line 59
    return-void
.end method
