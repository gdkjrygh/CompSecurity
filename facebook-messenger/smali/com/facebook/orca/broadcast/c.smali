.class Lcom/facebook/orca/broadcast/c;
.super Ljava/lang/Object;
.source "BroadcastActivity.java"

# interfaces
.implements Lcom/facebook/orca/broadcast/q;


# instance fields
.field final synthetic a:Lcom/facebook/orca/broadcast/BroadcastActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/broadcast/BroadcastActivity;)V
    .locals 0

    .prologue
    .line 392
    iput-object p1, p0, Lcom/facebook/orca/broadcast/c;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 395
    iget-object v0, p0, Lcom/facebook/orca/broadcast/c;->a:Lcom/facebook/orca/broadcast/BroadcastActivity;

    sget-object v1, Lcom/facebook/orca/broadcast/i;->CONTACT_MULTIPICKER:Lcom/facebook/orca/broadcast/i;

    invoke-static {v0, v1}, Lcom/facebook/orca/broadcast/BroadcastActivity;->a(Lcom/facebook/orca/broadcast/BroadcastActivity;Lcom/facebook/orca/broadcast/i;)V

    .line 396
    return-void
.end method
