.class final Lcom/a/a/c/ah;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/a/a/c/x;


# direct methods
.method constructor <init>(Lcom/a/a/c/x;)V
    .locals 0

    .prologue
    .line 228
    iput-object p1, p0, Lcom/a/a/c/ah;->a:Lcom/a/a/c/x;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 231
    iget-object v0, p0, Lcom/a/a/c/ah;->a:Lcom/a/a/c/x;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/a/a/c/x;->a(Lcom/a/a/c/x;Z)Z

    .line 232
    return-void
.end method
