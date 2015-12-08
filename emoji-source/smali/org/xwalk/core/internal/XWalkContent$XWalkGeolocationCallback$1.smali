.class Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback$1;
.super Ljava/lang/Object;
.source "XWalkContent.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback;->invoke(Ljava/lang/String;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback;

.field final synthetic val$allow:Z

.field final synthetic val$origin:Ljava/lang/String;

.field final synthetic val$retain:Z


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback;ZZLjava/lang/String;)V
    .locals 0

    .prologue
    .line 656
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback$1;->this$1:Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback;

    iput-boolean p2, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback$1;->val$retain:Z

    iput-boolean p3, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback$1;->val$allow:Z

    iput-object p4, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback$1;->val$origin:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 659
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback$1;->val$retain:Z

    if-eqz v0, :cond_0

    .line 660
    iget-boolean v0, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback$1;->val$allow:Z

    if-eqz v0, :cond_1

    .line 661
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback$1;->this$1:Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback;

    iget-object v0, v0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback;->this$0:Lorg/xwalk/core/internal/XWalkContent;

    # getter for: Lorg/xwalk/core/internal/XWalkContent;->mGeolocationPermissions:Lorg/xwalk/core/internal/XWalkGeolocationPermissions;
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkContent;->access$500(Lorg/xwalk/core/internal/XWalkContent;)Lorg/xwalk/core/internal/XWalkGeolocationPermissions;

    move-result-object v0

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback$1;->val$origin:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->allow(Ljava/lang/String;)V

    .line 666
    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback$1;->this$1:Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback;

    iget-object v0, v0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback;->this$0:Lorg/xwalk/core/internal/XWalkContent;

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback$1;->this$1:Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback;

    iget-object v1, v1, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback;->this$0:Lorg/xwalk/core/internal/XWalkContent;

    iget-wide v2, v1, Lorg/xwalk/core/internal/XWalkContent;->mNativeContent:J

    iget-boolean v1, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback$1;->val$allow:Z

    iget-object v4, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback$1;->val$origin:Ljava/lang/String;

    # invokes: Lorg/xwalk/core/internal/XWalkContent;->nativeInvokeGeolocationCallback(JZLjava/lang/String;)V
    invoke-static {v0, v2, v3, v1, v4}, Lorg/xwalk/core/internal/XWalkContent;->access$600(Lorg/xwalk/core/internal/XWalkContent;JZLjava/lang/String;)V

    .line 667
    return-void

    .line 663
    :cond_1
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback$1;->this$1:Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback;

    iget-object v0, v0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback;->this$0:Lorg/xwalk/core/internal/XWalkContent;

    # getter for: Lorg/xwalk/core/internal/XWalkContent;->mGeolocationPermissions:Lorg/xwalk/core/internal/XWalkGeolocationPermissions;
    invoke-static {v0}, Lorg/xwalk/core/internal/XWalkContent;->access$500(Lorg/xwalk/core/internal/XWalkContent;)Lorg/xwalk/core/internal/XWalkGeolocationPermissions;

    move-result-object v0

    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback$1;->val$origin:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->deny(Ljava/lang/String;)V

    goto :goto_0
.end method
