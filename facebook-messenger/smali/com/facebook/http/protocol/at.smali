.class Lcom/facebook/http/protocol/at;
.super Ljava/lang/Object;
.source "SingleMethodRunnerImpl.java"

# interfaces
.implements Lcom/facebook/http/d/a/a;


# instance fields
.field final synthetic a:Lcom/facebook/http/protocol/h;

.field final synthetic b:J

.field final synthetic c:Lcom/facebook/http/protocol/ar;


# direct methods
.method constructor <init>(Lcom/facebook/http/protocol/ar;Lcom/facebook/http/protocol/h;J)V
    .locals 0

    .prologue
    .line 464
    iput-object p1, p0, Lcom/facebook/http/protocol/at;->c:Lcom/facebook/http/protocol/ar;

    iput-object p2, p0, Lcom/facebook/http/protocol/at;->a:Lcom/facebook/http/protocol/h;

    iput-wide p3, p0, Lcom/facebook/http/protocol/at;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 3

    .prologue
    .line 467
    iget-object v0, p0, Lcom/facebook/http/protocol/at;->a:Lcom/facebook/http/protocol/h;

    iget-wide v1, p0, Lcom/facebook/http/protocol/at;->b:J

    invoke-interface {v0, p1, p2, v1, v2}, Lcom/facebook/http/protocol/h;->a(JJ)V

    .line 468
    return-void
.end method
