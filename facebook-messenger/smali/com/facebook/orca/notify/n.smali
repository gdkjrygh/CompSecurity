.class Lcom/facebook/orca/notify/n;
.super Ljava/lang/Object;
.source "InAppMessagingNotificationHandler.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/notify/j;


# direct methods
.method constructor <init>(Lcom/facebook/orca/notify/j;)V
    .locals 0

    .prologue
    .line 272
    iput-object p1, p0, Lcom/facebook/orca/notify/n;->a:Lcom/facebook/orca/notify/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 275
    iget-object v0, p0, Lcom/facebook/orca/notify/n;->a:Lcom/facebook/orca/notify/j;

    invoke-static {v0}, Lcom/facebook/orca/notify/j;->b(Lcom/facebook/orca/notify/j;)V

    .line 276
    return-void
.end method
