.class public abstract Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;
.super Lorg/xwalk/core/internal/XWalkExtensionInternal;
.source "XWalkExtensionWithActivityStateListener.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener$XWalkActivityStateListener;
    }
.end annotation


# instance fields
.field private mActivityStateListener:Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener$XWalkActivityStateListener;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "jsApi"    # Ljava/lang/String;
    .param p3, "activity"    # Landroid/app/Activity;

    .prologue
    .line 47
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkExtensionInternal;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    invoke-direct {p0, p3}, Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;->initActivityStateListener(Landroid/app/Activity;)V

    .line 49
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/app/Activity;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "jsApi"    # Ljava/lang/String;
    .param p3, "entryPoints"    # [Ljava/lang/String;
    .param p4, "activity"    # Landroid/app/Activity;

    .prologue
    .line 53
    invoke-direct {p0, p1, p2, p3}, Lorg/xwalk/core/internal/XWalkExtensionInternal;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 54
    invoke-direct {p0, p4}, Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;->initActivityStateListener(Landroid/app/Activity;)V

    .line 55
    return-void
.end method

.method private initActivityStateListener(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 40
    new-instance v0, Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener$XWalkActivityStateListener;

    invoke-direct {v0, p0, p0}, Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener$XWalkActivityStateListener;-><init>(Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;->mActivityStateListener:Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener$XWalkActivityStateListener;

    .line 41
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;->mActivityStateListener:Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener$XWalkActivityStateListener;

    invoke-static {v0, p1}, Lorg/chromium/base/ApplicationStatus;->registerStateListenerForActivity(Lorg/chromium/base/ApplicationStatus$ActivityStateListener;Landroid/app/Activity;)V

    .line 42
    return-void
.end method


# virtual methods
.method public abstract onActivityStateChange(Landroid/app/Activity;I)V
.end method
