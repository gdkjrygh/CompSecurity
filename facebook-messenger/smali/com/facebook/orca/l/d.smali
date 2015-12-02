.class Lcom/facebook/orca/l/d;
.super Ljava/lang/Object;
.source "MergeServiceHandler.java"

# interfaces
.implements Lcom/facebook/orca/l/v;


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/service/ad;

.field final synthetic b:Lcom/facebook/fbservice/service/e;

.field final synthetic c:Lcom/facebook/orca/l/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/l/a;Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)V
    .locals 0

    .prologue
    .line 386
    iput-object p1, p0, Lcom/facebook/orca/l/d;->c:Lcom/facebook/orca/l/a;

    iput-object p2, p0, Lcom/facebook/orca/l/d;->a:Lcom/facebook/fbservice/service/ad;

    iput-object p3, p0, Lcom/facebook/orca/l/d;->b:Lcom/facebook/fbservice/service/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 389
    iget-object v0, p0, Lcom/facebook/orca/l/d;->c:Lcom/facebook/orca/l/a;

    iget-object v1, p0, Lcom/facebook/orca/l/d;->a:Lcom/facebook/fbservice/service/ad;

    iget-object v2, p0, Lcom/facebook/orca/l/d;->b:Lcom/facebook/fbservice/service/e;

    invoke-static {v0, v1, p1, v2}, Lcom/facebook/orca/l/a;->a(Lcom/facebook/orca/l/a;Lcom/facebook/fbservice/service/ad;Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method
