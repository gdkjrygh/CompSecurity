.class Lcom/facebook/fbservice/service/k;
.super Ljava/lang/Object;
.source "BlueServiceQueue.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/service/h;


# direct methods
.method constructor <init>(Lcom/facebook/fbservice/service/h;)V
    .locals 0

    .prologue
    .line 188
    iput-object p1, p0, Lcom/facebook/fbservice/service/k;->a:Lcom/facebook/fbservice/service/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 191
    iget-object v0, p0, Lcom/facebook/fbservice/service/k;->a:Lcom/facebook/fbservice/service/h;

    invoke-static {v0}, Lcom/facebook/fbservice/service/h;->d(Lcom/facebook/fbservice/service/h;)V

    .line 192
    return-void
.end method
