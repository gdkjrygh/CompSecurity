.class public abstract Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;
.super Ljava/lang/Object;
.source "XWalkDisplayManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static mContext:Landroid/content/Context;

.field private static mInstance:Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;


# instance fields
.field protected final mListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    const-class v0, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->mListeners:Ljava/util/ArrayList;

    .line 90
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 29
    sget-object v0, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 31
    sget-boolean v0, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->mContext:Landroid/content/Context;

    if-eq v0, v1, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 33
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->mContext:Landroid/content/Context;

    .line 36
    :cond_1
    sget-object v0, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->mInstance:Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;

    if-nez v0, :cond_2

    .line 37
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_3

    .line 38
    new-instance v0, Lorg/xwalk/core/internal/extension/api/DisplayManagerJBMR1;

    sget-object v1, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lorg/xwalk/core/internal/extension/api/DisplayManagerJBMR1;-><init>(Landroid/content/Context;)V

    sput-object v0, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->mInstance:Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;

    .line 43
    :cond_2
    :goto_0
    sget-object v0, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->mInstance:Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;

    return-object v0

    .line 40
    :cond_3
    new-instance v0, Lorg/xwalk/core/internal/extension/api/DisplayManagerNull;

    invoke-direct {v0}, Lorg/xwalk/core/internal/extension/api/DisplayManagerNull;-><init>()V

    sput-object v0, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->mInstance:Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;

    goto :goto_0
.end method


# virtual methods
.method public abstract getDisplay(I)Landroid/view/Display;
.end method

.method public abstract getDisplays()[Landroid/view/Display;
.end method

.method public abstract getPresentationDisplays()[Landroid/view/Display;
.end method

.method protected notifyDisplayAdded(I)V
    .locals 3
    .param p1, "displayId"    # I

    .prologue
    .line 72
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;

    .line 73
    .local v1, "listener":Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;
    invoke-interface {v1, p1}, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;->onDisplayAdded(I)V

    goto :goto_0

    .line 74
    .end local v1    # "listener":Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;
    :cond_0
    return-void
.end method

.method protected notifyDisplayChanged(I)V
    .locals 3
    .param p1, "displayId"    # I

    .prologue
    .line 82
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;

    .line 83
    .local v1, "listener":Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;
    invoke-interface {v1, p1}, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;->onDisplayChanged(I)V

    goto :goto_0

    .line 84
    .end local v1    # "listener":Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;
    :cond_0
    return-void
.end method

.method protected notifyDisplayRemoved(I)V
    .locals 3
    .param p1, "displayId"    # I

    .prologue
    .line 77
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;

    .line 78
    .local v1, "listener":Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;
    invoke-interface {v1, p1}, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;->onDisplayRemoved(I)V

    goto :goto_0

    .line 79
    .end local v1    # "listener":Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;
    :cond_0
    return-void
.end method

.method public registerDisplayListener(Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;)V
    .locals 1
    .param p1, "listener"    # Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;

    .prologue
    .line 64
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    return-void
.end method

.method public unregisterDisplayListener(Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;)V
    .locals 1
    .param p1, "listener"    # Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;

    .prologue
    .line 68
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager;->mListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 69
    return-void
.end method
