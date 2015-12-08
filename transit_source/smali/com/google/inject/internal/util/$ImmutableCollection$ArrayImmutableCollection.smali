.class Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;
.super Lcom/google/inject/internal/util/$ImmutableCollection;
.source "ImmutableCollection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$ImmutableCollection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ArrayImmutableCollection"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/util/$ImmutableCollection",
        "<TE;>;"
    }
.end annotation


# instance fields
.field private final elements:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TE;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>([Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)V"
        }
    .end annotation

    .prologue
    .line 211
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection<TE;>;"
    .local p1, "elements":[Ljava/lang/Object;, "[TE;"
    invoke-direct {p0}, Lcom/google/inject/internal/util/$ImmutableCollection;-><init>()V

    .line 212
    iput-object p1, p0, Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;->elements:[Ljava/lang/Object;

    .line 213
    return-void
.end method

.method static synthetic access$300(Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;)[Ljava/lang/Object;
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;

    .prologue
    .line 207
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;->elements:[Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public isEmpty()Z
    .locals 1

    .prologue
    .line 220
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection<TE;>;"
    const/4 v0, 0x0

    return v0
.end method

.method public iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/internal/util/$UnmodifiableIterator",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 224
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection<TE;>;"
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection$1;

    invoke-direct {v0, p0}, Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection$1;-><init>(Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;)V

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 207
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection<TE;>;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;->iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 216
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;, "Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection<TE;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;->elements:[Ljava/lang/Object;

    array-length v0, v0

    return v0
.end method
