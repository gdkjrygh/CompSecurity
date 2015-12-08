.class public final Lcom/roidapp/baselib/hlistview/ai;
.super Lcom/roidapp/baselib/hlistview/ah;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/hlistview/ah;-><init>(Landroid/view/View;)V

    .line 72
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    .line 77
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/ai;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 78
    return-void
.end method
