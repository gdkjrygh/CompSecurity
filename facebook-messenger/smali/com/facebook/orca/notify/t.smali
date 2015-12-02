.class Lcom/facebook/orca/notify/t;
.super Ljava/lang/Object;
.source "InAppMessagingNotificationHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/facebook/orca/notify/s;


# direct methods
.method constructor <init>(Lcom/facebook/orca/notify/s;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 391
    iput-object p1, p0, Lcom/facebook/orca/notify/t;->b:Lcom/facebook/orca/notify/s;

    iput-object p2, p0, Lcom/facebook/orca/notify/t;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 394
    iget-object v0, p0, Lcom/facebook/orca/notify/t;->b:Lcom/facebook/orca/notify/s;

    iget-object v0, v0, Lcom/facebook/orca/notify/s;->a:Lcom/facebook/orca/notify/j;

    iget-object v1, p0, Lcom/facebook/orca/notify/t;->a:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/facebook/orca/notify/j;->a(Lcom/facebook/orca/notify/j;Landroid/view/View;)V

    .line 395
    return-void
.end method
