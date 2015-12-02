.class Lcom/facebook/orca/broadcast/g;
.super Ljava/lang/Object;
.source "BroadcastActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/activity/d;

.field final synthetic b:Lcom/facebook/orca/broadcast/BroadcastActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/broadcast/BroadcastActivity;Lcom/facebook/orca/activity/d;)V
    .locals 0

    .prologue
    .line 554
    iput-object p1, p0, Lcom/facebook/orca/broadcast/g;->b:Lcom/facebook/orca/broadcast/BroadcastActivity;

    iput-object p2, p0, Lcom/facebook/orca/broadcast/g;->a:Lcom/facebook/orca/activity/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 557
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 558
    iget-object v0, p0, Lcom/facebook/orca/broadcast/g;->a:Lcom/facebook/orca/activity/d;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/facebook/orca/activity/d;->a(Z)V

    .line 559
    return-void
.end method
