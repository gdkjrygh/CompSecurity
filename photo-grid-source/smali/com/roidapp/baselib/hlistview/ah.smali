.class public Lcom/roidapp/baselib/hlistview/ah;
.super Lcom/roidapp/baselib/hlistview/aj;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/hlistview/aj;-><init>(Landroid/view/View;)V

    .line 53
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    .line 58
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ah;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScrollX(I)V

    .line 59
    return-void
.end method

.method public final a()Z
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 64
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ah;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isHardwareAccelerated()Z

    move-result v0

    return v0
.end method
