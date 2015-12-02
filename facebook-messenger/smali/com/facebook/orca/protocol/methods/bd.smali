.class public Lcom/facebook/orca/protocol/methods/bd;
.super Ljava/lang/Object;
.source "UploadShareMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/ui/media/attachments/MediaResource;",
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
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/bd;->a:Lcom/facebook/ui/media/attachments/d;

    .line 35
    iput-object p2, p0, Lcom/facebook/orca/protocol/methods/bd;->b:Lcom/facebook/ui/media/b/a;

    .line 36
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/bd;->a:Lcom/facebook/ui/media/attachments/d;

    invoke-virtual {v0, p1}, Lcom/facebook/ui/media/attachments/d;->a(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/a;

    move-result-object v0

    .line 41
    iget-object v1, p0, Lcom/facebook/orca/protocol/methods/bd;->b:Lcom/facebook/ui/media/b/a;

    invoke-virtual {v1, v0}, Lcom/facebook/ui/media/b/a;->a(Lcom/facebook/ui/media/attachments/a;)Lcom/facebook/http/protocol/ab;

    move-result-object v1

    .line 43
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 44
    new-instance v3, Lorg/apache/http/message/BasicNameValuePair;

    const-string v4, "attached_files"

    const-string v5, "attach"

    invoke-direct {v3, v4, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 45
    new-instance v3, Lorg/apache/http/message/BasicNameValuePair;

    const-string v4, "messaging_attachment"

    const-string v5, "true"

    invoke-direct {v3, v4, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 47
    invoke-static {}, Lcom/facebook/http/protocol/n;->newBuilder()Lcom/facebook/http/protocol/p;

    move-result-object v3

    const-string v4, "attachment-upload"

    invoke-virtual {v3, v4}, Lcom/facebook/http/protocol/p;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/p;

    move-result-object v3

    const-string v4, "POST"

    invoke-virtual {v3, v4}, Lcom/facebook/http/protocol/p;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/p;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/a;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/http/protocol/p;->c(Ljava/lang/String;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/http/protocol/p;->a(Ljava/util/List;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    sget-object v2, Lcom/facebook/http/protocol/t;->JSON:Lcom/facebook/http/protocol/t;

    invoke-virtual {v0, v2}, Lcom/facebook/http/protocol/p;->a(Lcom/facebook/http/protocol/t;)Lcom/facebook/http/protocol/p;

    move-result-object v0

    new-instance v2, Lcom/facebook/http/a/a/a/a;

    const-string v3, "attach"

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
    .line 26
    check-cast p1, Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/bd;->a(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 26
    check-cast p1, Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/protocol/methods/bd;->a(Lcom/facebook/ui/media/attachments/MediaResource;Lcom/facebook/http/protocol/r;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/ui/media/attachments/MediaResource;Lcom/facebook/http/protocol/r;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 59
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 60
    const-string v1, "id"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
