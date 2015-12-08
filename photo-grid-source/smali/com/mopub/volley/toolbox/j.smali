.class final Lcom/mopub/volley/toolbox/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

.field final synthetic b:Lcom/mopub/volley/toolbox/i;


# direct methods
.method constructor <init>(Lcom/mopub/volley/toolbox/i;Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;)V
    .locals 0

    .prologue
    .line 165
    iput-object p1, p0, Lcom/mopub/volley/toolbox/j;->b:Lcom/mopub/volley/toolbox/i;

    iput-object p2, p0, Lcom/mopub/volley/toolbox/j;->a:Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 168
    iget-object v0, p0, Lcom/mopub/volley/toolbox/j;->b:Lcom/mopub/volley/toolbox/i;

    iget-object v1, p0, Lcom/mopub/volley/toolbox/j;->a:Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/mopub/volley/toolbox/i;->onResponse(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;Z)V

    .line 169
    return-void
.end method
