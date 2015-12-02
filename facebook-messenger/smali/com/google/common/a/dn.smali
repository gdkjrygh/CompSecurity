.class Lcom/google/common/a/dn;
.super Lcom/google/common/a/eu;
.source "EmptyImmutableListMultimap.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/eu",
        "<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lcom/google/common/a/dn;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    new-instance v0, Lcom/google/common/a/dn;

    invoke-direct {v0}, Lcom/google/common/a/dn;-><init>()V

    sput-object v0, Lcom/google/common/a/dn;->a:Lcom/google/common/a/dn;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    .line 32
    invoke-static {}, Lcom/google/common/a/ev;->j()Lcom/google/common/a/ev;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/common/a/eu;-><init>(Lcom/google/common/a/ev;I)V

    .line 33
    return-void
.end method
