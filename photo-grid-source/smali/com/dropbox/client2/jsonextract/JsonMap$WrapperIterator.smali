.class final Lcom/dropbox/client2/jsonextract/JsonMap$WrapperIterator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<",
        "Ljava/util/Map$Entry",
        "<",
        "Ljava/lang/String;",
        "Lcom/dropbox/client2/jsonextract/JsonThing;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final internal:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private final path:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/util/Iterator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Lcom/dropbox/client2/jsonextract/JsonMap$WrapperIterator;->path:Ljava/lang/String;

    .line 70
    iput-object p2, p0, Lcom/dropbox/client2/jsonextract/JsonMap$WrapperIterator;->internal:Ljava/util/Iterator;

    .line 71
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/util/Iterator;Lcom/dropbox/client2/jsonextract/JsonMap$1;)V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0, p1, p2}, Lcom/dropbox/client2/jsonextract/JsonMap$WrapperIterator;-><init>(Ljava/lang/String;Ljava/util/Iterator;)V

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/dropbox/client2/jsonextract/JsonMap$WrapperIterator;->internal:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 64
    invoke-virtual {p0}, Lcom/dropbox/client2/jsonextract/JsonMap$WrapperIterator;->next()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public final next()Ljava/util/Map$Entry;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry",
            "<",
            "Ljava/lang/String;",
            "Lcom/dropbox/client2/jsonextract/JsonThing;",
            ">;"
        }
    .end annotation

    .prologue
    .line 75
    new-instance v1, Lcom/dropbox/client2/jsonextract/JsonMap$WrappedEntry;

    iget-object v2, p0, Lcom/dropbox/client2/jsonextract/JsonMap$WrapperIterator;->path:Ljava/lang/String;

    iget-object v0, p0, Lcom/dropbox/client2/jsonextract/JsonMap$WrapperIterator;->internal:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, v3}, Lcom/dropbox/client2/jsonextract/JsonMap$WrappedEntry;-><init>(Ljava/lang/String;Ljava/util/Map$Entry;Lcom/dropbox/client2/jsonextract/JsonMap$1;)V

    return-object v1
.end method

.method public final remove()V
    .locals 2

    .prologue
    .line 77
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "can\'t remove"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
