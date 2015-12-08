.class Lorg/xwalk/core/internal/XWalkGeolocationPermissions$1;
.super Ljava/lang/Object;
.source "XWalkGeolocationPermissions.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkGeolocationPermissions;->getAllowed(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkGeolocationPermissions;

.field final synthetic val$callback:Landroid/webkit/ValueCallback;

.field final synthetic val$finalAllowed:Z


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkGeolocationPermissions;Landroid/webkit/ValueCallback;Z)V
    .locals 0

    .prologue
    .line 106
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkGeolocationPermissions$1;->this$0:Lorg/xwalk/core/internal/XWalkGeolocationPermissions;

    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkGeolocationPermissions$1;->val$callback:Landroid/webkit/ValueCallback;

    iput-boolean p3, p0, Lorg/xwalk/core/internal/XWalkGeolocationPermissions$1;->val$finalAllowed:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 109
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkGeolocationPermissions$1;->val$callback:Landroid/webkit/ValueCallback;

    iget-boolean v1, p0, Lorg/xwalk/core/internal/XWalkGeolocationPermissions$1;->val$finalAllowed:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 110
    return-void
.end method
