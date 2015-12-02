.class public Lcom/facebook/orca/protocol/methods/ab;
.super Ljava/lang/Object;
.source "PhotosUploadMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/orca/protocol/methods/ac;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/ui/media/attachments/d;

.field private final b:Lcom/facebook/ui/media/b/a;


# direct methods
.method public constructor <init>(Lcom/facebook/ui/media/attachments/d;Lcom/facebook/ui/media/b/a;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/ab;->a:Lcom/facebook/ui/media/attachments/d;

    .line 47
    iput-object p2, p0, Lcom/facebook/orca/protocol/methods/ab;->b:Lcom/facebook/ui/media/b/a;

    .line 48
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/protocol/methods/ac;)Lcom/facebook/http/protocol/n;
    .locals 7

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/ab;->a:Lcom/facebook/ui/media/attachments/d;

    invoke-static {p1}, Lcom/facebook/orca/protocol/methods/ac;->a(Lcom/facebook/orca/protocol/methods/ac;)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/attachments/d;->a(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/a;

    move-result-object v0

    .line 53
    iget-object v1, p0, Lcom/facebook/orca/protocol/methods/ab;->b:Lcom/facebook/ui/media/b/a;

    invoke-virtual {v1, v0}, Lcom/facebook/ui/media/b/a;->a(Lcom/facebook/ui/media/attachments/a;)Lcom/facebook/http/protocol/ab;

    move-result-object v1

    .line 55
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 56
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/ui/media/attachments/MediaResource;->j()Ljava/lang/String;

    move-result-object v3

    .line 57
    const/4 v4, 0x0

    const/16 v5, 0x2e

    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 58
    new-instance v4, Lorg/apache/http/message/BasicNameValuePair;

    const-string v5, "published"

    const-string v6, "false"

    invoke-direct {v4, v5, v6}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 60
    invoke-static {}, Lcom/facebook/http/protocol/n;->newBuilder()Lcom/facebook/http/protocol/p;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "media-"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {p1}, Lcom/facebook/orca/protocol/methods/ac;->b(Lcom/facebook/orca/protocol/methods/ac;)I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/facebook/http/protocol/p;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/p;

    move-result-object v4

    const-string v5, "POST"

    invoke-virtual {v4, v5}, Lcom/facebook/http/protocol/p;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/p;

    move-result-object v4

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/a;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/http/protocol/p;->c(Ljava/lang/String;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/http/protocol/p;->a(Ljava/util/List;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    sget-object v2, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-virtual {v0, v2}, Lcom/facebook/http/protocol/p;->a(Lcom/facebook/http/protocol/t;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    new-instance v2, Lcom/facebook/http/a/a/a/a;

    invoke-direct {v2, v3, v1}, Lcom/facebook/http/a/a/a/a;-><init>(Ljava/lang/String;Lcom/facebook/http/a/a/a/a/b;)V

    invoke-static {v2}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/p;->b(Ljava/util/List;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/p;->k()Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 27
    check-cast p1, Lcom/facebook/orca/protocol/methods/ac;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/ab;->a(Lcom/facebook/orca/protocol/methods/ac;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    check-cast p1, Lcom/facebook/orca/protocol/methods/ac;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/protocol/methods/ab;->a(Lcom/facebook/orca/protocol/methods/ac;Lcom/facebook/http/protocol/r;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/orca/protocol/methods/ac;Lcom/facebook/http/protocol/r;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 72
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 73
    const-string v1, "id"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
