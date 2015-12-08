.class Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;
.super Ljava/lang/Object;
.source "BindingManagerImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/BindingManagerImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ManagedConnection"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private mBoundForBackgroundPeriod:Z

.field private mConnection:Lorg/chromium/content/browser/ChildProcessConnection;

.field private mInForeground:Z

.field private mWasOomProtected:Z

.field final synthetic this$0:Lorg/chromium/content/browser/BindingManagerImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    const-class v0, Lorg/chromium/content/browser/BindingManagerImpl;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lorg/chromium/content/browser/BindingManagerImpl;Lorg/chromium/content/browser/ChildProcessConnection;)V
    .locals 0
    .param p2, "connection"    # Lorg/chromium/content/browser/ChildProcessConnection;

    .prologue
    .line 114
    iput-object p1, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->this$0:Lorg/chromium/content/browser/BindingManagerImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    iput-object p2, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->mConnection:Lorg/chromium/content/browser/ChildProcessConnection;

    .line 116
    return-void
.end method

.method static synthetic access$300(Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;

    .prologue
    .line 39
    invoke-direct {p0}, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->dropBindings()V

    return-void
.end method

.method private addStrongBinding()V
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->mConnection:Lorg/chromium/content/browser/ChildProcessConnection;

    .line 72
    .local v0, "connection":Lorg/chromium/content/browser/ChildProcessConnection;
    if-nez v0, :cond_0

    .line 75
    :goto_0
    return-void

    .line 74
    :cond_0
    invoke-interface {v0}, Lorg/chromium/content/browser/ChildProcessConnection;->addStrongBinding()V

    goto :goto_0
.end method

.method private dropBindings()V
    .locals 2

    .prologue
    .line 107
    sget-boolean v1, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->this$0:Lorg/chromium/content/browser/BindingManagerImpl;

    # getter for: Lorg/chromium/content/browser/BindingManagerImpl;->mIsLowMemoryDevice:Z
    invoke-static {v1}, Lorg/chromium/content/browser/BindingManagerImpl;->access$100(Lorg/chromium/content/browser/BindingManagerImpl;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 108
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->mConnection:Lorg/chromium/content/browser/ChildProcessConnection;

    .line 109
    .local v0, "connection":Lorg/chromium/content/browser/ChildProcessConnection;
    if-nez v0, :cond_1

    .line 112
    :goto_0
    return-void

    .line 111
    :cond_1
    invoke-interface {v0}, Lorg/chromium/content/browser/ChildProcessConnection;->dropOomBindings()V

    goto :goto_0
.end method

.method private removeInitialBinding()V
    .locals 4

    .prologue
    .line 56
    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->mConnection:Lorg/chromium/content/browser/ChildProcessConnection;

    .line 57
    .local v0, "connection":Lorg/chromium/content/browser/ChildProcessConnection;
    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/chromium/content/browser/ChildProcessConnection;->isInitialBindingBound()Z

    move-result v1

    if-nez v1, :cond_1

    .line 67
    :cond_0
    :goto_0
    return-void

    .line 59
    :cond_1
    new-instance v1, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection$1;

    invoke-direct {v1, p0, v0}, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection$1;-><init>(Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;Lorg/chromium/content/browser/ChildProcessConnection;)V

    iget-object v2, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->this$0:Lorg/chromium/content/browser/BindingManagerImpl;

    # getter for: Lorg/chromium/content/browser/BindingManagerImpl;->mRemoveInitialBindingDelay:J
    invoke-static {v2}, Lorg/chromium/content/browser/BindingManagerImpl;->access$000(Lorg/chromium/content/browser/BindingManagerImpl;)J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lorg/chromium/base/ThreadUtils;->postOnUiThreadDelayed(Ljava/lang/Runnable;J)V

    goto :goto_0
.end method

.method private removeStrongBinding()V
    .locals 4

    .prologue
    .line 79
    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->mConnection:Lorg/chromium/content/browser/ChildProcessConnection;

    .line 82
    .local v0, "connection":Lorg/chromium/content/browser/ChildProcessConnection;
    if-eqz v0, :cond_0

    invoke-interface {v0}, Lorg/chromium/content/browser/ChildProcessConnection;->isStrongBindingBound()Z

    move-result v2

    if-nez v2, :cond_1

    .line 100
    :cond_0
    :goto_0
    return-void

    .line 86
    :cond_1
    new-instance v1, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection$2;

    invoke-direct {v1, p0, v0}, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection$2;-><init>(Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;Lorg/chromium/content/browser/ChildProcessConnection;)V

    .line 95
    .local v1, "doUnbind":Ljava/lang/Runnable;
    iget-object v2, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->this$0:Lorg/chromium/content/browser/BindingManagerImpl;

    # getter for: Lorg/chromium/content/browser/BindingManagerImpl;->mIsLowMemoryDevice:Z
    invoke-static {v2}, Lorg/chromium/content/browser/BindingManagerImpl;->access$100(Lorg/chromium/content/browser/BindingManagerImpl;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 96
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 98
    :cond_2
    iget-object v2, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->this$0:Lorg/chromium/content/browser/BindingManagerImpl;

    # getter for: Lorg/chromium/content/browser/BindingManagerImpl;->mRemoveStrongBindingDelay:J
    invoke-static {v2}, Lorg/chromium/content/browser/BindingManagerImpl;->access$200(Lorg/chromium/content/browser/BindingManagerImpl;)J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lorg/chromium/base/ThreadUtils;->postOnUiThreadDelayed(Ljava/lang/Runnable;J)V

    goto :goto_0
.end method


# virtual methods
.method clearConnection()V
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->mConnection:Lorg/chromium/content/browser/ChildProcessConnection;

    invoke-interface {v0}, Lorg/chromium/content/browser/ChildProcessConnection;->isOomProtectedOrWasWhenDied()Z

    move-result v0

    iput-boolean v0, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->mWasOomProtected:Z

    .line 157
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->mConnection:Lorg/chromium/content/browser/ChildProcessConnection;

    .line 158
    return-void
.end method

.method isConnectionCleared()Z
    .locals 1
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation

    .prologue
    .line 163
    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->mConnection:Lorg/chromium/content/browser/ChildProcessConnection;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method isOomProtected()Z
    .locals 1

    .prologue
    .line 151
    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->mConnection:Lorg/chromium/content/browser/ChildProcessConnection;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->mConnection:Lorg/chromium/content/browser/ChildProcessConnection;

    invoke-interface {v0}, Lorg/chromium/content/browser/ChildProcessConnection;->isOomProtectedOrWasWhenDied()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget-boolean v0, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->mWasOomProtected:Z

    goto :goto_0
.end method

.method setBoundForBackgroundPeriod(Z)V
    .locals 1
    .param p1, "nextBound"    # Z

    .prologue
    .line 138
    iget-boolean v0, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->mBoundForBackgroundPeriod:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_1

    .line 139
    invoke-direct {p0}, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->addStrongBinding()V

    .line 144
    :cond_0
    :goto_0
    iput-boolean p1, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->mBoundForBackgroundPeriod:Z

    .line 145
    return-void

    .line 140
    :cond_1
    iget-boolean v0, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->mBoundForBackgroundPeriod:Z

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    .line 141
    invoke-direct {p0}, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->removeStrongBinding()V

    goto :goto_0
.end method

.method setInForeground(Z)V
    .locals 1
    .param p1, "nextInForeground"    # Z

    .prologue
    .line 123
    iget-boolean v0, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->mInForeground:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_1

    .line 124
    invoke-direct {p0}, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->addStrongBinding()V

    .line 129
    :cond_0
    :goto_0
    invoke-direct {p0}, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->removeInitialBinding()V

    .line 130
    iput-boolean p1, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->mInForeground:Z

    .line 131
    return-void

    .line 125
    :cond_1
    iget-boolean v0, p0, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->mInForeground:Z

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    .line 126
    invoke-direct {p0}, Lorg/chromium/content/browser/BindingManagerImpl$ManagedConnection;->removeStrongBinding()V

    goto :goto_0
.end method
