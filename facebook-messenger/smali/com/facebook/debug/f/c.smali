.class Lcom/facebook/debug/f/c;
.super Ljava/lang/Object;
.source "UiThreadWatchdog.java"

# interfaces
.implements Lcom/facebook/prefs/shared/f;


# instance fields
.field final synthetic a:Lcom/facebook/debug/f/a;


# direct methods
.method constructor <init>(Lcom/facebook/debug/f/a;)V
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lcom/facebook/debug/f/c;->a:Lcom/facebook/debug/f/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/prefs/shared/d;Lcom/facebook/prefs/shared/ae;)V
    .locals 4

    .prologue
    .line 89
    sget-object v0, Lcom/facebook/prefs/shared/aj;->s:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, p2}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p0, Lcom/facebook/debug/f/c;->a:Lcom/facebook/debug/f/a;

    iget-object v1, p0, Lcom/facebook/debug/f/c;->a:Lcom/facebook/debug/f/a;

    invoke-static {v1}, Lcom/facebook/debug/f/a;->b(Lcom/facebook/debug/f/a;)Lcom/facebook/prefs/shared/d;

    move-result-object v1

    sget-object v2, Lcom/facebook/prefs/shared/aj;->s:Lcom/facebook/prefs/shared/ae;

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/debug/f/a;->a(Lcom/facebook/debug/f/a;Z)V

    .line 92
    :cond_0
    return-void
.end method
