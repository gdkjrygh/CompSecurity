.class public abstract Lcom/facebook/base/broadcast/q;
.super Ljava/lang/Object;
.source "SafeLocalBroadcastReceiver.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/support/v4/a/e;

.field private final c:Landroid/content/IntentFilter;

.field private final d:Landroid/content/BroadcastReceiver;

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const-class v0, Lcom/facebook/base/broadcast/q;

    sput-object v0, Lcom/facebook/base/broadcast/q;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    invoke-static {p1}, Landroid/support/v4/a/e;->a(Landroid/content/Context;)Landroid/support/v4/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/broadcast/q;->b:Landroid/support/v4/a/e;

    .line 34
    iput-object p2, p0, Lcom/facebook/base/broadcast/q;->c:Landroid/content/IntentFilter;

    .line 35
    new-instance v0, Lcom/facebook/base/broadcast/r;

    invoke-direct {v0, p0}, Lcom/facebook/base/broadcast/r;-><init>(Lcom/facebook/base/broadcast/q;)V

    iput-object v0, p0, Lcom/facebook/base/broadcast/q;->d:Landroid/content/BroadcastReceiver;

    .line 45
    return-void
.end method

.method static synthetic a(Lcom/facebook/base/broadcast/q;)Z
    .locals 1

    .prologue
    .line 22
    iget-boolean v0, p0, Lcom/facebook/base/broadcast/q;->e:Z

    return v0
.end method

.method static synthetic c()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 22
    sget-object v0, Lcom/facebook/base/broadcast/q;->a:Ljava/lang/Class;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 48
    iget-boolean v0, p0, Lcom/facebook/base/broadcast/q;->e:Z

    if-eqz v0, :cond_0

    .line 49
    sget-object v0, Lcom/facebook/base/broadcast/q;->a:Ljava/lang/Class;

    const-string v1, "Called registerNotificationReceiver twice."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 54
    :goto_0
    return-void

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/facebook/base/broadcast/q;->b:Landroid/support/v4/a/e;

    iget-object v1, p0, Lcom/facebook/base/broadcast/q;->d:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/facebook/base/broadcast/q;->c:Landroid/content/IntentFilter;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 53
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/base/broadcast/q;->e:Z

    goto :goto_0
.end method

.method public abstract a(Landroid/content/Context;Landroid/content/Intent;)V
.end method

.method public b()V
    .locals 2

    .prologue
    .line 57
    iget-boolean v0, p0, Lcom/facebook/base/broadcast/q;->e:Z

    if-eqz v0, :cond_0

    .line 58
    iget-object v0, p0, Lcom/facebook/base/broadcast/q;->b:Landroid/support/v4/a/e;

    iget-object v1, p0, Lcom/facebook/base/broadcast/q;->d:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;)V

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/base/broadcast/q;->e:Z

    .line 61
    :cond_0
    return-void
.end method
