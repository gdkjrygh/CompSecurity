.class Lcom/facebook/debug/f/f;
.super Ljava/lang/Object;
.source "UiThreadWatchdog.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/debug/f/a;


# direct methods
.method constructor <init>(Lcom/facebook/debug/f/a;)V
    .locals 0

    .prologue
    .line 152
    iput-object p1, p0, Lcom/facebook/debug/f/f;->a:Lcom/facebook/debug/f/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 155
    iget-object v0, p0, Lcom/facebook/debug/f/f;->a:Lcom/facebook/debug/f/a;

    invoke-static {v0}, Lcom/facebook/debug/f/a;->f(Lcom/facebook/debug/f/a;)V

    .line 156
    iget-object v0, p0, Lcom/facebook/debug/f/f;->a:Lcom/facebook/debug/f/a;

    invoke-static {v0}, Lcom/facebook/debug/f/a;->g(Lcom/facebook/debug/f/a;)V

    .line 157
    return-void
.end method
