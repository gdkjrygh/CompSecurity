.class public Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewJBMR1;
.super Lorg/xwalk/core/internal/extension/api/presentation/PresentationView;
.source "PresentationViewJBMR1.java"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field private mPresentation:Landroid/app/Presentation;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/Display;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "display"    # Landroid/view/Display;

    .prologue
    .line 22
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationView;-><init>()V

    .line 23
    new-instance v0, Landroid/app/Presentation;

    invoke-direct {v0, p1, p2}, Landroid/app/Presentation;-><init>(Landroid/content/Context;Landroid/view/Display;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewJBMR1;->mPresentation:Landroid/app/Presentation;

    .line 24
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewJBMR1;->mPresentation:Landroid/app/Presentation;

    invoke-virtual {v0}, Landroid/app/Presentation;->cancel()V

    .line 39
    return-void
.end method

.method public dismiss()V
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewJBMR1;->mPresentation:Landroid/app/Presentation;

    invoke-virtual {v0}, Landroid/app/Presentation;->dismiss()V

    .line 34
    return-void
.end method

.method public getDisplay()Landroid/view/Display;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewJBMR1;->mPresentation:Landroid/app/Presentation;

    invoke-virtual {v0}, Landroid/app/Presentation;->getDisplay()Landroid/view/Display;

    move-result-object v0

    return-object v0
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 71
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewJBMR1;->mListener:Lorg/xwalk/core/internal/extension/api/presentation/PresentationView$PresentationListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewJBMR1;->mListener:Lorg/xwalk/core/internal/extension/api/presentation/PresentationView$PresentationListener;

    invoke-interface {v0, p0}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationView$PresentationListener;->onDismiss(Lorg/xwalk/core/internal/extension/api/presentation/PresentationView;)V

    .line 72
    :cond_0
    return-void
.end method

.method public onShow(Landroid/content/DialogInterface;)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 66
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewJBMR1;->mListener:Lorg/xwalk/core/internal/extension/api/presentation/PresentationView$PresentationListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewJBMR1;->mListener:Lorg/xwalk/core/internal/extension/api/presentation/PresentationView$PresentationListener;

    invoke-interface {v0, p0}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationView$PresentationListener;->onShow(Lorg/xwalk/core/internal/extension/api/presentation/PresentationView;)V

    .line 67
    :cond_0
    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1
    .param p1, "contentView"    # Landroid/view/View;

    .prologue
    .line 43
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewJBMR1;->mPresentation:Landroid/app/Presentation;

    invoke-virtual {v0, p1}, Landroid/app/Presentation;->setContentView(Landroid/view/View;)V

    .line 44
    return-void
.end method

.method public setPresentationListener(Lorg/xwalk/core/internal/extension/api/presentation/PresentationView$PresentationListener;)V
    .locals 2
    .param p1, "listener"    # Lorg/xwalk/core/internal/extension/api/presentation/PresentationView$PresentationListener;

    .prologue
    const/4 v1, 0x0

    .line 53
    invoke-super {p0, p1}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationView;->setPresentationListener(Lorg/xwalk/core/internal/extension/api/presentation/PresentationView$PresentationListener;)V

    .line 55
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewJBMR1;->mListener:Lorg/xwalk/core/internal/extension/api/presentation/PresentationView$PresentationListener;

    if-eqz v0, :cond_0

    .line 56
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewJBMR1;->mPresentation:Landroid/app/Presentation;

    invoke-virtual {v0, p0}, Landroid/app/Presentation;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 57
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewJBMR1;->mPresentation:Landroid/app/Presentation;

    invoke-virtual {v0, p0}, Landroid/app/Presentation;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 62
    :goto_0
    return-void

    .line 59
    :cond_0
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewJBMR1;->mPresentation:Landroid/app/Presentation;

    invoke-virtual {v0, v1}, Landroid/app/Presentation;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 60
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewJBMR1;->mPresentation:Landroid/app/Presentation;

    invoke-virtual {v0, v1}, Landroid/app/Presentation;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    goto :goto_0
.end method

.method public show()V
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewJBMR1;->mPresentation:Landroid/app/Presentation;

    invoke-virtual {v0}, Landroid/app/Presentation;->show()V

    .line 29
    return-void
.end method
