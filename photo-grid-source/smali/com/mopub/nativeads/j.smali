.class final Lcom/mopub/nativeads/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation build Lcom/mopub/common/VisibleForTesting;
.end annotation


# instance fields
.field final synthetic a:Lcom/mopub/nativeads/h;

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/h;)V
    .locals 1

    .prologue
    .line 160
    iput-object p1, p0, Lcom/mopub/nativeads/j;->a:Lcom/mopub/nativeads/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 161
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mopub/nativeads/j;->b:Ljava/util/ArrayList;

    .line 162
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    .line 166
    iget-object v0, p0, Lcom/mopub/nativeads/j;->a:Lcom/mopub/nativeads/h;

    invoke-static {v0}, Lcom/mopub/nativeads/h;->b(Lcom/mopub/nativeads/h;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 167
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 168
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/nativeads/ax;

    .line 171
    iget-wide v4, v0, Lcom/mopub/nativeads/ax;->b:J

    iget-object v2, v0, Lcom/mopub/nativeads/ax;->a:Ljava/lang/Object;

    check-cast v2, Lcom/mopub/nativeads/NativeResponse;

    invoke-virtual {v2}, Lcom/mopub/nativeads/NativeResponse;->getImpressionMinTimeViewed()I

    move-result v2

    .line 1236
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    sub-long v4, v6, v4

    int-to-long v6, v2

    cmp-long v2, v4, v6

    if-ltz v2, :cond_1

    const/4 v2, 0x1

    .line 171
    :goto_1
    if-eqz v2, :cond_0

    .line 177
    iget-object v0, v0, Lcom/mopub/nativeads/ax;->a:Ljava/lang/Object;

    check-cast v0, Lcom/mopub/nativeads/NativeResponse;

    invoke-virtual {v0, v1}, Lcom/mopub/nativeads/NativeResponse;->recordImpression(Landroid/view/View;)V

    .line 180
    iget-object v0, p0, Lcom/mopub/nativeads/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1236
    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    .line 183
    :cond_2
    iget-object v0, p0, Lcom/mopub/nativeads/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 184
    iget-object v2, p0, Lcom/mopub/nativeads/j;->a:Lcom/mopub/nativeads/h;

    invoke-virtual {v2, v0}, Lcom/mopub/nativeads/h;->a(Landroid/view/View;)V

    goto :goto_2

    .line 186
    :cond_3
    iget-object v0, p0, Lcom/mopub/nativeads/j;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 188
    iget-object v0, p0, Lcom/mopub/nativeads/j;->a:Lcom/mopub/nativeads/h;

    invoke-static {v0}, Lcom/mopub/nativeads/h;->b(Lcom/mopub/nativeads/h;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 189
    iget-object v0, p0, Lcom/mopub/nativeads/j;->a:Lcom/mopub/nativeads/h;

    invoke-virtual {v0}, Lcom/mopub/nativeads/h;->b()V

    .line 191
    :cond_4
    return-void
.end method
