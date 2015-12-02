.class Lcom/facebook/orca/notify/o;
.super Ljava/lang/Object;
.source "InAppMessagingNotificationHandler.java"

# interfaces
.implements Lcom/facebook/orca/activity/d;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/orca/notify/j;


# direct methods
.method constructor <init>(Lcom/facebook/orca/notify/j;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 294
    iput-object p1, p0, Lcom/facebook/orca/notify/o;->b:Lcom/facebook/orca/notify/j;

    iput-object p2, p0, Lcom/facebook/orca/notify/o;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    .prologue
    .line 298
    if-eqz p1, :cond_0

    .line 299
    iget-object v0, p0, Lcom/facebook/orca/notify/o;->b:Lcom/facebook/orca/notify/j;

    iget-object v1, p0, Lcom/facebook/orca/notify/o;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/facebook/orca/notify/j;->a(Lcom/facebook/orca/notify/j;Ljava/lang/String;)V

    .line 303
    :goto_0
    return-void

    .line 301
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/notify/o;->b:Lcom/facebook/orca/notify/j;

    invoke-static {v0}, Lcom/facebook/orca/notify/j;->c(Lcom/facebook/orca/notify/j;)V

    goto :goto_0
.end method
