.class public Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewNull;
.super Lorg/xwalk/core/internal/extension/api/presentation/PresentationView;
.source "PresentationViewNull.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationView;-><init>()V

    .line 16
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 0

    .prologue
    .line 28
    return-void
.end method

.method public dismiss()V
    .locals 0

    .prologue
    .line 24
    return-void
.end method

.method public getDisplay()Landroid/view/Display;
    .locals 1

    .prologue
    .line 36
    const/4 v0, 0x0

    return-object v0
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0
    .param p1, "contentView"    # Landroid/view/View;

    .prologue
    .line 32
    return-void
.end method

.method public show()V
    .locals 0

    .prologue
    .line 20
    return-void
.end method
