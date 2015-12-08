.class public abstract Lorg/xwalk/core/internal/extension/api/presentation/PresentationView;
.super Ljava/lang/Object;
.source "PresentationView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/extension/api/presentation/PresentationView$PresentationListener;
    }
.end annotation


# instance fields
.field protected mListener:Lorg/xwalk/core/internal/extension/api/presentation/PresentationView$PresentationListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    return-void
.end method

.method public static createInstance(Landroid/content/Context;Landroid/view/Display;)Lorg/xwalk/core/internal/extension/api/presentation/PresentationView;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "display"    # Landroid/view/Display;

    .prologue
    .line 27
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    .line 28
    new-instance v0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewJBMR1;

    invoke-direct {v0, p0, p1}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewJBMR1;-><init>(Landroid/content/Context;Landroid/view/Display;)V

    .line 30
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewNull;

    invoke-direct {v0}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationViewNull;-><init>()V

    goto :goto_0
.end method


# virtual methods
.method public abstract cancel()V
.end method

.method public abstract dismiss()V
.end method

.method public abstract getDisplay()Landroid/view/Display;
.end method

.method public abstract setContentView(Landroid/view/View;)V
.end method

.method public setPresentationListener(Lorg/xwalk/core/internal/extension/api/presentation/PresentationView$PresentationListener;)V
    .locals 0
    .param p1, "listener"    # Lorg/xwalk/core/internal/extension/api/presentation/PresentationView$PresentationListener;

    .prologue
    .line 45
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationView;->mListener:Lorg/xwalk/core/internal/extension/api/presentation/PresentationView$PresentationListener;

    .line 46
    return-void
.end method

.method public abstract show()V
.end method
