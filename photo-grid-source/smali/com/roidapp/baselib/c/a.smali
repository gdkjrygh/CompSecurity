.class public abstract Lcom/roidapp/baselib/c/a;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:J

.field private f:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 87
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/c/a;->d:Z

    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/baselib/c/a;->e:J

    .line 90
    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 92
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/baselib/c/a;->d:Z

    .line 93
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/baselib/c/a;->f:J

    .line 95
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 4

    .prologue
    .line 98
    iget-wide v0, p0, Lcom/roidapp/baselib/c/a;->f:J

    iget-wide v2, p0, Lcom/roidapp/baselib/c/a;->e:J

    sub-long/2addr v0, v2

    long-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method protected a(Z)V
    .locals 0

    .prologue
    .line 105
    return-void
.end method

.method protected b()V
    .locals 0

    .prologue
    .line 113
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 21
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 22
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/baselib/c/a;->b:Z

    .line 23
    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .prologue
    .line 45
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 46
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/baselib/c/a;->a:Z

    .line 49
    iget-boolean v0, p0, Lcom/roidapp/baselib/c/a;->d:Z

    if-eqz v0, :cond_0

    .line 50
    invoke-direct {p0}, Lcom/roidapp/baselib/c/a;->d()V

    .line 51
    invoke-virtual {p0}, Lcom/roidapp/baselib/c/a;->b()V

    .line 54
    :cond_0
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 28
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 29
    iput-boolean v2, p0, Lcom/roidapp/baselib/c/a;->a:Z

    .line 30
    iget-boolean v0, p0, Lcom/roidapp/baselib/c/a;->c:Z

    if-eqz v0, :cond_0

    .line 31
    iget-boolean v0, p0, Lcom/roidapp/baselib/c/a;->b:Z

    if-eqz v0, :cond_1

    .line 32
    iput-boolean v1, p0, Lcom/roidapp/baselib/c/a;->b:Z

    .line 33
    invoke-direct {p0}, Lcom/roidapp/baselib/c/a;->c()V

    .line 34
    invoke-virtual {p0, v2}, Lcom/roidapp/baselib/c/a;->a(Z)V

    .line 40
    :cond_0
    :goto_0
    return-void

    .line 36
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/baselib/c/a;->c()V

    .line 37
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/c/a;->a(Z)V

    goto :goto_0
.end method

.method public setUserVisibleHint(Z)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 60
    iput-boolean p1, p0, Lcom/roidapp/baselib/c/a;->c:Z

    .line 61
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->setUserVisibleHint(Z)V

    .line 63
    iget-boolean v0, p0, Lcom/roidapp/baselib/c/a;->a:Z

    if-eqz v0, :cond_0

    .line 64
    if-eqz p1, :cond_0

    .line 65
    iget-boolean v0, p0, Lcom/roidapp/baselib/c/a;->b:Z

    if-eqz v0, :cond_2

    .line 66
    iput-boolean v1, p0, Lcom/roidapp/baselib/c/a;->b:Z

    .line 67
    invoke-direct {p0}, Lcom/roidapp/baselib/c/a;->c()V

    .line 68
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/c/a;->a(Z)V

    .line 76
    :cond_0
    :goto_0
    if-nez p1, :cond_1

    .line 77
    iget-boolean v0, p0, Lcom/roidapp/baselib/c/a;->d:Z

    if-eqz v0, :cond_1

    .line 78
    invoke-direct {p0}, Lcom/roidapp/baselib/c/a;->d()V

    .line 79
    invoke-virtual {p0}, Lcom/roidapp/baselib/c/a;->b()V

    .line 83
    :cond_1
    return-void

    .line 70
    :cond_2
    invoke-direct {p0}, Lcom/roidapp/baselib/c/a;->c()V

    .line 71
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/c/a;->a(Z)V

    goto :goto_0
.end method
