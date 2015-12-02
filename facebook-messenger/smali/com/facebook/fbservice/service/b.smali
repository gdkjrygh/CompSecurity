.class Lcom/facebook/fbservice/service/b;
.super Lcom/facebook/fbservice/service/x;
.source "BlueService.java"


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/service/a;


# direct methods
.method constructor <init>(Lcom/facebook/fbservice/service/a;)V
    .locals 0

    .prologue
    .line 312
    iput-object p1, p0, Lcom/facebook/fbservice/service/b;->a:Lcom/facebook/fbservice/service/a;

    invoke-direct {p0}, Lcom/facebook/fbservice/service/x;-><init>()V

    .line 313
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 317
    iget-object v0, p0, Lcom/facebook/fbservice/service/b;->a:Lcom/facebook/fbservice/service/a;

    invoke-static {v0, p1, p2}, Lcom/facebook/fbservice/service/a;->a(Lcom/facebook/fbservice/service/a;Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Lcom/facebook/fbservice/service/z;)Z
    .locals 1

    .prologue
    .line 322
    iget-object v0, p0, Lcom/facebook/fbservice/service/b;->a:Lcom/facebook/fbservice/service/a;

    invoke-static {v0, p1, p2}, Lcom/facebook/fbservice/service/a;->a(Lcom/facebook/fbservice/service/a;Ljava/lang/String;Lcom/facebook/fbservice/service/z;)Z

    move-result v0

    return v0
.end method
