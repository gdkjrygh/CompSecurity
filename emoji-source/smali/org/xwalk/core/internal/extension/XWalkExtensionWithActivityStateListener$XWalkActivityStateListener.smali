.class Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener$XWalkActivityStateListener;
.super Ljava/lang/Object;
.source "XWalkExtensionWithActivityStateListener.java"

# interfaces
.implements Lorg/chromium/base/ApplicationStatus$ActivityStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "XWalkActivityStateListener"
.end annotation


# instance fields
.field mExtensionRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;)V
    .locals 1
    .param p2, "extension"    # Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;

    .prologue
    .line 25
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener$XWalkActivityStateListener;->this$0:Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener$XWalkActivityStateListener;->mExtensionRef:Ljava/lang/ref/WeakReference;

    .line 27
    return-void
.end method


# virtual methods
.method public onActivityStateChange(Landroid/app/Activity;I)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "newState"    # I

    .prologue
    .line 31
    iget-object v1, p0, Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener$XWalkActivityStateListener;->mExtensionRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;

    .line 32
    .local v0, "extension":Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;
    if-nez v0, :cond_0

    .line 34
    :goto_0
    return-void

    .line 33
    :cond_0
    invoke-virtual {v0, p1, p2}, Lorg/xwalk/core/internal/extension/XWalkExtensionWithActivityStateListener;->onActivityStateChange(Landroid/app/Activity;I)V

    goto :goto_0
.end method
