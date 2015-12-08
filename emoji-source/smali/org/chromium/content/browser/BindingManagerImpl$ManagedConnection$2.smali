.class Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection$2;
.super Ljava/lang/Object;
.source "BindingManagerImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->removeStrongBinding()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

.field final synthetic val$connection:Lorg/chromium/content/browser/ChildProcessConnection;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;Lorg/chromium/content/browser/ChildProcessConnection;)V
    .locals 0

    .prologue
    .line 86
    iput-object p1, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection$2;->this$1:Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

    iput-object p2, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection$2;->val$connection:Lorg/chromium/content/browser/ChildProcessConnection;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection$2;->val$connection:Lorg/chromium/content/browser/ChildProcessConnection;

    invoke-interface {v0}, Lorg/chromium/content/browser/ChildProcessConnection;->isStrongBindingBound()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection$2;->val$connection:Lorg/chromium/content/browser/ChildProcessConnection;

    invoke-interface {v0}, Lorg/chromium/content/browser/ChildProcessConnection;->removeStrongBinding()V

    .line 92
    :cond_0
    return-void
.end method
