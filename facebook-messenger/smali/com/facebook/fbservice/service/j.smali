.class Lcom/facebook/fbservice/service/j;
.super Ljava/lang/Object;
.source "BlueServiceQueue.java"

# interfaces
.implements Lcom/facebook/fbservice/service/g;


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/service/m;

.field final synthetic b:Lcom/facebook/fbservice/service/h;


# direct methods
.method constructor <init>(Lcom/facebook/fbservice/service/h;Lcom/facebook/fbservice/service/m;)V
    .locals 0

    .prologue
    .line 172
    iput-object p1, p0, Lcom/facebook/fbservice/service/j;->b:Lcom/facebook/fbservice/service/h;

    iput-object p2, p0, Lcom/facebook/fbservice/service/j;->a:Lcom/facebook/fbservice/service/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 175
    iget-object v0, p0, Lcom/facebook/fbservice/service/j;->b:Lcom/facebook/fbservice/service/h;

    iget-object v1, p0, Lcom/facebook/fbservice/service/j;->a:Lcom/facebook/fbservice/service/m;

    invoke-static {v0, v1, p1}, Lcom/facebook/fbservice/service/h;->a(Lcom/facebook/fbservice/service/h;Lcom/facebook/fbservice/service/m;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 176
    return-void
.end method
