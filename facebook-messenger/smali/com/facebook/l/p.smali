.class Lcom/facebook/l/p;
.super Ljava/lang/Object;
.source "PresenceManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/user/UserKey;

.field final synthetic b:I

.field final synthetic c:Lcom/facebook/l/k;


# direct methods
.method constructor <init>(Lcom/facebook/l/k;Lcom/facebook/user/UserKey;I)V
    .locals 0

    .prologue
    .line 473
    iput-object p1, p0, Lcom/facebook/l/p;->c:Lcom/facebook/l/k;

    iput-object p2, p0, Lcom/facebook/l/p;->a:Lcom/facebook/user/UserKey;

    iput p3, p0, Lcom/facebook/l/p;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 476
    iget-object v0, p0, Lcom/facebook/l/p;->c:Lcom/facebook/l/k;

    iget-object v1, p0, Lcom/facebook/l/p;->a:Lcom/facebook/user/UserKey;

    iget v2, p0, Lcom/facebook/l/p;->b:I

    invoke-static {v0, v1, v2}, Lcom/facebook/l/k;->a(Lcom/facebook/l/k;Lcom/facebook/user/UserKey;I)V

    .line 477
    return-void
.end method
