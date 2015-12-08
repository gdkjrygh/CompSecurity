.class public final Lcom/bumptech/glide/load/c/b/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/c/b/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/c/b/g",
        "<[B>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 21
    const-string v0, ""

    invoke-direct {p0, v0}, Lcom/bumptech/glide/load/c/b/c;-><init>(Ljava/lang/String;)V

    .line 22
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/bumptech/glide/load/c/b/c;->a:Ljava/lang/String;

    .line 31
    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/a/c;
    .locals 2

    .prologue
    .line 17
    check-cast p1, [B

    .line 1035
    new-instance v0, Lcom/bumptech/glide/load/a/b;

    iget-object v1, p0, Lcom/bumptech/glide/load/c/b/c;->a:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lcom/bumptech/glide/load/a/b;-><init>([BLjava/lang/String;)V

    .line 17
    return-object v0
.end method
