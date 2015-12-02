.class final Lcom/google/common/a/dp;
.super Lcom/google/common/a/fe;
.source "EmptyImmutableMultiset.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/fe",
        "<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lcom/google/common/a/dp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    new-instance v0, Lcom/google/common/a/dp;

    invoke-direct {v0}, Lcom/google/common/a/dp;-><init>()V

    sput-object v0, Lcom/google/common/a/dp;->a:Lcom/google/common/a/dp;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/google/common/a/fe;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)I
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 35
    const/4 v0, 0x0

    return v0
.end method

.method a()Z
    .locals 1

    .prologue
    .line 60
    const/4 v0, 0x0

    return v0
.end method

.method public c()Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 40
    invoke-static {}, Lcom/google/common/a/fi;->d()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method d()Lcom/google/common/a/mh;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/mh",
            "<",
            "Lcom/google/common/a/jg",
            "<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 50
    invoke-static {}, Lcom/google/common/a/gg;->a()Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method e()I
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic f()Ljava/util/Set;
    .locals 1

    .prologue
    .line 29
    invoke-virtual {p0}, Lcom/google/common/a/dp;->c()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method g()Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/google/common/a/jg",
            "<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 65
    invoke-static {}, Lcom/google/common/a/fi;->d()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 45
    const/4 v0, 0x0

    return v0
.end method
