.class Lcom/facebook/orca/photos/b/l;
.super Lcom/facebook/fbservice/ops/ac;
.source "PhotoUploadManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/ui/media/attachments/MediaResource;

.field final synthetic b:Lcom/facebook/orca/photos/b/k;


# direct methods
.method constructor <init>(Lcom/facebook/orca/photos/b/k;Lcom/facebook/ui/media/attachments/MediaResource;)V
    .locals 0

    .prologue
    .line 157
    iput-object p1, p0, Lcom/facebook/orca/photos/b/l;->b:Lcom/facebook/orca/photos/b/k;

    iput-object p2, p0, Lcom/facebook/orca/photos/b/l;->a:Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 6

    .prologue
    .line 161
    iget-object v0, p0, Lcom/facebook/orca/photos/b/l;->b:Lcom/facebook/orca/photos/b/k;

    invoke-static {v0}, Lcom/facebook/orca/photos/b/k;->a(Lcom/facebook/orca/photos/b/k;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/photos/b/l;->a:Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-virtual {v1}, Lcom/facebook/ui/media/attachments/MediaResource;->j()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/photos/b/m;

    iget-object v3, p0, Lcom/facebook/orca/photos/b/l;->b:Lcom/facebook/orca/photos/b/k;

    sget-object v4, Lcom/facebook/orca/photos/b/n;->SUCCESS:Lcom/facebook/orca/photos/b/n;

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->f()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lcom/facebook/orca/photos/b/m;-><init>(Lcom/facebook/orca/photos/b/k;Lcom/facebook/orca/photos/b/n;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    iget-object v0, p0, Lcom/facebook/orca/photos/b/l;->b:Lcom/facebook/orca/photos/b/k;

    invoke-static {v0}, Lcom/facebook/orca/photos/b/k;->b(Lcom/facebook/orca/photos/b/k;)Lcom/facebook/orca/f/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/f/r;->a()V

    .line 166
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 5

    .prologue
    .line 171
    iget-object v0, p0, Lcom/facebook/orca/photos/b/l;->b:Lcom/facebook/orca/photos/b/k;

    invoke-static {v0}, Lcom/facebook/orca/photos/b/k;->a(Lcom/facebook/orca/photos/b/k;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/photos/b/l;->a:Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-virtual {v1}, Lcom/facebook/ui/media/attachments/MediaResource;->j()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/photos/b/m;

    iget-object v3, p0, Lcom/facebook/orca/photos/b/l;->b:Lcom/facebook/orca/photos/b/k;

    sget-object v4, Lcom/facebook/orca/photos/b/n;->FAIL:Lcom/facebook/orca/photos/b/n;

    invoke-direct {v2, v3, v4}, Lcom/facebook/orca/photos/b/m;-><init>(Lcom/facebook/orca/photos/b/k;Lcom/facebook/orca/photos/b/n;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    iget-object v0, p0, Lcom/facebook/orca/photos/b/l;->b:Lcom/facebook/orca/photos/b/k;

    invoke-static {v0}, Lcom/facebook/orca/photos/b/k;->b(Lcom/facebook/orca/photos/b/k;)Lcom/facebook/orca/f/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/f/r;->a()V

    .line 176
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 157
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/photos/b/l;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
