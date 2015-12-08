.class final Lcom/mopub/volley/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:J

.field final synthetic c:Lcom/mopub/volley/Request;


# direct methods
.method constructor <init>(Lcom/mopub/volley/Request;Ljava/lang/String;J)V
    .locals 1

    .prologue
    .line 232
    iput-object p1, p0, Lcom/mopub/volley/d;->c:Lcom/mopub/volley/Request;

    iput-object p2, p0, Lcom/mopub/volley/d;->a:Ljava/lang/String;

    iput-wide p3, p0, Lcom/mopub/volley/d;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 235
    iget-object v0, p0, Lcom/mopub/volley/d;->c:Lcom/mopub/volley/Request;

    invoke-static {v0}, Lcom/mopub/volley/Request;->a(Lcom/mopub/volley/Request;)Lcom/mopub/volley/f;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/volley/d;->a:Ljava/lang/String;

    iget-wide v2, p0, Lcom/mopub/volley/d;->b:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/mopub/volley/f;->add(Ljava/lang/String;J)V

    .line 236
    iget-object v0, p0, Lcom/mopub/volley/d;->c:Lcom/mopub/volley/Request;

    invoke-static {v0}, Lcom/mopub/volley/Request;->a(Lcom/mopub/volley/Request;)Lcom/mopub/volley/f;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/volley/f;->finish(Ljava/lang/String;)V

    .line 237
    return-void
.end method
