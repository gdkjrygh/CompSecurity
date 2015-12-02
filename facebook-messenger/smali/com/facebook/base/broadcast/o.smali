.class public abstract Lcom/facebook/base/broadcast/o;
.super Ljava/lang/Object;
.source "SafeBroadcastReceiver.java"


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
.field private final b:Landroid/content/Context;

.field private final c:Landroid/content/IntentFilter;

.field private final d:Landroid/content/BroadcastReceiver;

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/facebook/base/broadcast/o;

    sput-object v0, Lcom/facebook/base/broadcast/o;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/facebook/base/broadcast/o;->b:Landroid/content/Context;

    .line 32
    iput-object p2, p0, Lcom/facebook/base/broadcast/o;->c:Landroid/content/IntentFilter;

    .line 33
    new-instance v0, Lcom/facebook/base/broadcast/p;

    invoke-direct {v0, p0}, Lcom/facebook/base/broadcast/p;-><init>(Lcom/facebook/base/broadcast/o;)V

    iput-object v0, p0, Lcom/facebook/base/broadcast/o;->d:Landroid/content/BroadcastReceiver;

    .line 43
    return-void
.end method

.method static synthetic a(Lcom/facebook/base/broadcast/o;)Z
    .locals 1

    .prologue
    .line 20
    iget-boolean v0, p0, Lcom/facebook/base/broadcast/o;->e:Z

    return v0
.end method

.method static synthetic b()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lcom/facebook/base/broadcast/o;->a:Ljava/lang/Class;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 46
    iget-boolean v0, p0, Lcom/facebook/base/broadcast/o;->e:Z

    if-eqz v0, :cond_0

    .line 47
    sget-object v0, Lcom/facebook/base/broadcast/o;->a:Ljava/lang/Class;

    const-string v1, "Called registerNotificationReceiver twice."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 52
    :goto_0
    return-void

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/facebook/base/broadcast/o;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/base/broadcast/o;->d:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/facebook/base/broadcast/o;->c:Landroid/content/IntentFilter;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 51
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/base/broadcast/o;->e:Z

    goto :goto_0
.end method

.method public abstract a(Landroid/content/Context;Landroid/content/Intent;)V
.end method
