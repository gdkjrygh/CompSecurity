.class Lcom/facebook/l/q;
.super Ljava/lang/Object;
.source "PresenceManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Z

.field final synthetic c:Lcom/facebook/l/k;


# direct methods
.method constructor <init>(Lcom/facebook/l/k;Ljava/util/Map;Z)V
    .locals 0

    .prologue
    .line 501
    iput-object p1, p0, Lcom/facebook/l/q;->c:Lcom/facebook/l/k;

    iput-object p2, p0, Lcom/facebook/l/q;->a:Ljava/util/Map;

    iput-boolean p3, p0, Lcom/facebook/l/q;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 504
    iget-object v0, p0, Lcom/facebook/l/q;->c:Lcom/facebook/l/k;

    iget-object v1, p0, Lcom/facebook/l/q;->a:Ljava/util/Map;

    iget-boolean v2, p0, Lcom/facebook/l/q;->b:Z

    invoke-static {v0, v1, v2}, Lcom/facebook/l/k;->a(Lcom/facebook/l/k;Ljava/util/Map;Z)V

    .line 505
    return-void
.end method
