.class Lcom/facebook/push/e;
.super Ljava/lang/Object;
.source "PushInitializer.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/push/d;


# direct methods
.method constructor <init>(Lcom/facebook/push/d;)V
    .locals 0

    .prologue
    .line 127
    iput-object p1, p0, Lcom/facebook/push/e;->a:Lcom/facebook/push/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/push/e;->a:Lcom/facebook/push/d;

    invoke-static {v0}, Lcom/facebook/push/d;->a(Lcom/facebook/push/d;)Lcom/facebook/push/PushInitializer;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/push/PushInitializer;->a(Lcom/facebook/push/PushInitializer;)V

    .line 131
    return-void
.end method
