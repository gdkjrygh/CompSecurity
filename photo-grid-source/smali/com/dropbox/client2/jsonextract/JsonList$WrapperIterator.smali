.class final Lcom/dropbox/client2/jsonextract/JsonList$WrapperIterator;
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
        "Lcom/dropbox/client2/jsonextract/JsonThing;",
        ">;"
    }
.end annotation


# instance fields
.field private final internal:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private numReturned:I

.field private final path:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/util/Iterator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Iterator",
            "<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lcom/dropbox/client2/jsonextract/JsonList$WrapperIterator;->numReturned:I

    .line 48
    iput-object p1, p0, Lcom/dropbox/client2/jsonextract/JsonList$WrapperIterator;->path:Ljava/lang/String;

    .line 49
    iput-object p2, p0, Lcom/dropbox/client2/jsonextract/JsonList$WrapperIterator;->internal:Ljava/util/Iterator;

    .line 50
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/util/Iterator;Lcom/dropbox/client2/jsonextract/JsonList$1;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0, p1, p2}, Lcom/dropbox/client2/jsonextract/JsonList$WrapperIterator;-><init>(Ljava/lang/String;Ljava/util/Iterator;)V

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/dropbox/client2/jsonextract/JsonList$WrapperIterator;->internal:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Lcom/dropbox/client2/jsonextract/JsonThing;
    .locals 4

    .prologue
    .line 56
    iget v0, p0, Lcom/dropbox/client2/jsonextract/JsonList$WrapperIterator;->numReturned:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/dropbox/client2/jsonextract/JsonList$WrapperIterator;->numReturned:I

    .line 57
    new-instance v1, Lcom/dropbox/client2/jsonextract/JsonThing;

    iget-object v2, p0, Lcom/dropbox/client2/jsonextract/JsonList$WrapperIterator;->internal:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lcom/dropbox/client2/jsonextract/JsonList$WrapperIterator;->path:Ljava/lang/String;

    # invokes: Lcom/dropbox/client2/jsonextract/JsonList;->pathConcatIndex(Ljava/lang/String;I)Ljava/lang/String;
    invoke-static {v3, v0}, Lcom/dropbox/client2/jsonextract/JsonList;->access$000(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 43
    invoke-virtual {p0}, Lcom/dropbox/client2/jsonextract/JsonList$WrapperIterator;->next()Lcom/dropbox/client2/jsonextract/JsonThing;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 2

    .prologue
    .line 53
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "can\'t remove"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
