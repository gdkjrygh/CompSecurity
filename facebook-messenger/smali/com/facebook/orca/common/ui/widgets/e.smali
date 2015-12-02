.class public abstract Lcom/facebook/orca/common/ui/widgets/e;
.super Lcom/facebook/widget/f;
.source "FavoritesDragSortListView.java"


# instance fields
.field a:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 32
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/common/ui/widgets/e;->a:Z

    .line 36
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/widgets/e;Z)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/facebook/orca/common/ui/widgets/e;->setCanConvert(Z)V

    return-void
.end method

.method private setCanConvert(Z)V
    .locals 0

    .prologue
    .line 60
    iput-boolean p1, p0, Lcom/facebook/orca/common/ui/widgets/e;->a:Z

    .line 61
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 56
    iget-boolean v0, p0, Lcom/facebook/orca/common/ui/widgets/e;->a:Z

    return v0
.end method

.method public abstract getInnerRow()Landroid/view/View;
.end method
