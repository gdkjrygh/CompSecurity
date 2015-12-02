.class Lcom/facebook/push/d;
.super Ljava/lang/Object;
.source "PushInitializer.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field private a:Lcom/facebook/push/PushInitializer;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/push/d;)Lcom/facebook/push/PushInitializer;
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/facebook/push/d;->a:Lcom/facebook/push/PushInitializer;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 2

    .prologue
    .line 120
    invoke-static {p1}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 121
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 122
    const-class v1, Lcom/facebook/push/PushInitializer;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/PushInitializer;

    iput-object v0, p0, Lcom/facebook/push/d;->a:Lcom/facebook/push/PushInitializer;

    .line 124
    iget-object v0, p0, Lcom/facebook/push/d;->a:Lcom/facebook/push/PushInitializer;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/push/PushInitializer;->a(Lcom/facebook/push/PushInitializer;Z)Z

    .line 127
    iget-object v0, p0, Lcom/facebook/push/d;->a:Lcom/facebook/push/PushInitializer;

    invoke-static {v0}, Lcom/facebook/push/PushInitializer;->b(Lcom/facebook/push/PushInitializer;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/facebook/push/e;

    invoke-direct {v1, p0}, Lcom/facebook/push/e;-><init>(Lcom/facebook/push/d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 133
    return-void
.end method
