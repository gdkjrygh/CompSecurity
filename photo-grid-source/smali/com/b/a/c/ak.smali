.class final Lcom/b/a/c/ak;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/b/a/c/aa;


# direct methods
.method constructor <init>(Lcom/b/a/c/aa;)V
    .locals 0

    .prologue
    .line 229
    iput-object p1, p0, Lcom/b/a/c/ak;->a:Lcom/b/a/c/aa;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 232
    iget-object v0, p0, Lcom/b/a/c/ak;->a:Lcom/b/a/c/aa;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/b/a/c/aa;->a(Lcom/b/a/c/aa;Z)Z

    .line 233
    return-void
.end method
