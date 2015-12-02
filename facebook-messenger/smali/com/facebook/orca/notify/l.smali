.class Lcom/facebook/orca/notify/l;
.super Ljava/lang/Object;
.source "InAppMessagingNotificationHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/j;


# direct methods
.method constructor <init>(Lcom/facebook/orca/notify/j;)V
    .locals 0

    .prologue
    .line 228
    iput-object p1, p0, Lcom/facebook/orca/notify/l;->a:Lcom/facebook/orca/notify/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 231
    iget-object v0, p0, Lcom/facebook/orca/notify/l;->a:Lcom/facebook/orca/notify/j;

    sget-object v1, Lcom/facebook/orca/notify/r;->SLIDE_OUT:Lcom/facebook/orca/notify/r;

    invoke-static {v0, v1}, Lcom/facebook/orca/notify/j;->a(Lcom/facebook/orca/notify/j;Lcom/facebook/orca/notify/r;)V

    .line 232
    return-void
.end method
