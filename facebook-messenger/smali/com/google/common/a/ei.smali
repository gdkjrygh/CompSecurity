.class final Lcom/google/common/a/ei;
.super Lcom/google/common/a/ju;
.source "ImmutableAsList.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/ju",
        "<TE;>;"
    }
.end annotation


# instance fields
.field private final transient a:Lcom/google/common/a/em;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/em",
            "<TE;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>([Ljava/lang/Object;Lcom/google/common/a/em;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            "Lcom/google/common/a/em",
            "<TE;>;)V"
        }
    .end annotation

    .prologue
    .line 37
    const/4 v0, 0x0

    array-length v1, p1

    invoke-direct {p0, p1, v0, v1}, Lcom/google/common/a/ju;-><init>([Ljava/lang/Object;II)V

    .line 38
    iput-object p2, p0, Lcom/google/common/a/ei;->a:Lcom/google/common/a/em;

    .line 39
    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/google/common/a/ei;->a:Lcom/google/common/a/em;

    invoke-virtual {v0, p1}, Lcom/google/common/a/em;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
