.class Lorg/xwalk/core/internal/XWalkViewInternal$XWalkActivityStateListener;
.super Ljava/lang/Object;
.source "XWalkViewInternal.java"

# interfaces
.implements Lorg/chromium/base/ApplicationStatus$ActivityStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/XWalkViewInternal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "XWalkActivityStateListener"
.end annotation


# instance fields
.field mXWalkViewRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lorg/xwalk/core/internal/XWalkViewInternal;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkViewInternal;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkViewInternal;Lorg/xwalk/core/internal/XWalkViewInternal;)V
    .locals 1
    .param p2, "view"    # Lorg/xwalk/core/internal/XWalkViewInternal;

    .prologue
    .line 141
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkViewInternal$XWalkActivityStateListener;->this$0:Lorg/xwalk/core/internal/XWalkViewInternal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkViewInternal$XWalkActivityStateListener;->mXWalkViewRef:Ljava/lang/ref/WeakReference;

    .line 143
    return-void
.end method


# virtual methods
.method public onActivityStateChange(Landroid/app/Activity;I)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "newState"    # I

    .prologue
    .line 147
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkViewInternal$XWalkActivityStateListener;->mXWalkViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/internal/XWalkViewInternal;

    .line 148
    .local v0, "view":Lorg/xwalk/core/internal/XWalkViewInternal;
    if-nez v0, :cond_0

    .line 150
    :goto_0
    return-void

    .line 149
    :cond_0
    # invokes: Lorg/xwalk/core/internal/XWalkViewInternal;->onActivityStateChange(Landroid/app/Activity;I)V
    invoke-static {v0, p1, p2}, Lorg/xwalk/core/internal/XWalkViewInternal;->access$000(Lorg/xwalk/core/internal/XWalkViewInternal;Landroid/app/Activity;I)V

    goto :goto_0
.end method
