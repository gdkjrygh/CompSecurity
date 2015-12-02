.class final Lcom/google/common/a/kg;
.super Lcom/google/common/a/fj;
.source "RegularImmutableSet.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/fj",
        "<TE;>;"
    }
.end annotation


# instance fields
.field final transient b:[Ljava/lang/Object;
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation
.end field

.field private final transient d:I

.field private final transient e:I


# direct methods
.method constructor <init>([Ljava/lang/Object;I[Ljava/lang/Object;I)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0, p1}, Lcom/google/common/a/fj;-><init>([Ljava/lang/Object;)V

    .line 40
    iput-object p3, p0, Lcom/google/common/a/kg;->b:[Ljava/lang/Object;

    .line 41
    iput p4, p0, Lcom/google/common/a/kg;->d:I

    .line 42
    iput p2, p0, Lcom/google/common/a/kg;->e:I

    .line 43
    return-void
.end method


# virtual methods
.method c()Z
    .locals 1

    .prologue
    .line 65
    const/4 v0, 0x1

    return v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 46
    if-nez p1, :cond_0

    move v0, v1

    .line 55
    :goto_0
    return v0

    .line 49
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Lcom/google/common/a/eh;->a(I)I

    move-result v0

    .line 50
    :goto_1
    iget-object v2, p0, Lcom/google/common/a/kg;->b:[Ljava/lang/Object;

    iget v3, p0, Lcom/google/common/a/kg;->d:I

    and-int/2addr v3, v0

    aget-object v2, v2, v3

    .line 51
    if-nez v2, :cond_1

    move v0, v1

    .line 52
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 55
    const/4 v0, 0x1

    goto :goto_0

    .line 49
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 61
    iget v0, p0, Lcom/google/common/a/kg;->e:I

    return v0
.end method
