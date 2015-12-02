.class Lcom/facebook/l/s;
.super Ljava/lang/Object;
.source "PresenceManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/l/k;


# direct methods
.method constructor <init>(Lcom/facebook/l/k;)V
    .locals 0

    .prologue
    .line 576
    iput-object p1, p0, Lcom/facebook/l/s;->a:Lcom/facebook/l/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 579
    iget-object v0, p0, Lcom/facebook/l/s;->a:Lcom/facebook/l/k;

    invoke-static {v0}, Lcom/facebook/l/k;->e(Lcom/facebook/l/k;)V

    .line 580
    return-void
.end method
