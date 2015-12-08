.class public Lorg/xwalk/core/SharedXWalkView;
.super Lorg/xwalk/core/XWalkView;
.source "SharedXWalkView.java"


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static initialized:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 14
    const-class v0, Lorg/xwalk/core/SharedXWalkView;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/xwalk/core/SharedXWalkView;->$assertionsDisabled:Z

    .line 16
    sput-boolean v1, Lorg/xwalk/core/SharedXWalkView;->initialized:Z

    return-void

    :cond_0
    move v0, v1

    .line 14
    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;Lorg/xwalk/core/XWalkActivity;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "activity"    # Lorg/xwalk/core/XWalkActivity;

    .prologue
    .line 24
    invoke-static {p2}, Lorg/xwalk/core/SharedXWalkView;->verifyActivity(Lorg/xwalk/core/XWalkActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lorg/xwalk/core/XWalkView;-><init>(Landroid/content/Context;Landroid/app/Activity;)V

    .line 25
    return-void
.end method

.method public constructor <init>(Lorg/xwalk/core/XWalkActivity;Landroid/util/AttributeSet;Lorg/xwalk/core/SharedXWalkExceptionHandler;)V
    .locals 1
    .param p1, "context"    # Lorg/xwalk/core/XWalkActivity;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "handler"    # Lorg/xwalk/core/SharedXWalkExceptionHandler;

    .prologue
    .line 20
    invoke-static {p1}, Lorg/xwalk/core/SharedXWalkView;->verifyActivity(Lorg/xwalk/core/XWalkActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lorg/xwalk/core/XWalkView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 21
    return-void
.end method

.method public static containsLibrary()Z
    .locals 1

    .prologue
    .line 42
    invoke-static {}, Lorg/xwalk/core/ReflectionHelper;->shouldUseLibrary()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static initialize(Landroid/content/Context;Lorg/xwalk/core/SharedXWalkExceptionHandler;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "handler"    # Lorg/xwalk/core/SharedXWalkExceptionHandler;

    .prologue
    .line 33
    sget-boolean v0, Lorg/xwalk/core/SharedXWalkView;->initialized:Z

    if-eqz v0, :cond_0

    .line 39
    :goto_0
    return-void

    .line 35
    :cond_0
    sget-boolean v0, Lorg/xwalk/core/SharedXWalkView;->$assertionsDisabled:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lorg/xwalk/core/XWalkApplication;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 36
    :cond_1
    invoke-static {}, Lorg/xwalk/core/ReflectionHelper;->allowCrossPackage()V

    .line 37
    if-eqz p1, :cond_2

    invoke-static {p1}, Lorg/xwalk/core/ReflectionHelper;->setExceptionHandler(Lorg/xwalk/core/SharedXWalkExceptionHandler;)V

    .line 38
    :cond_2
    const/4 v0, 0x1

    sput-boolean v0, Lorg/xwalk/core/SharedXWalkView;->initialized:Z

    goto :goto_0
.end method

.method public static isUsingLibrary()Z
    .locals 1

    .prologue
    .line 46
    invoke-static {}, Lorg/xwalk/core/ReflectionHelper;->isUsingLibrary()Z

    move-result v0

    return v0
.end method

.method private static verifyActivity(Lorg/xwalk/core/XWalkActivity;)Landroid/app/Activity;
    .locals 1
    .param p0, "context"    # Lorg/xwalk/core/XWalkActivity;

    .prologue
    .line 28
    sget-boolean v0, Lorg/xwalk/core/SharedXWalkView;->initialized:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/xwalk/core/SharedXWalkView;->initialize(Landroid/content/Context;Lorg/xwalk/core/SharedXWalkExceptionHandler;)V

    .line 29
    :cond_0
    return-object p0
.end method
