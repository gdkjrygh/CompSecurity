.class public final Lcom/bumptech/glide/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/bumptech/glide/p;

.field private final b:Lcom/bumptech/glide/load/c/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/c/s",
            "<TA;TT;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/bumptech/glide/p;Lcom/bumptech/glide/load/c/s;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/c/s",
            "<TA;TT;>;",
            "Ljava/lang/Class",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 713
    iput-object p1, p0, Lcom/bumptech/glide/r;->a:Lcom/bumptech/glide/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 714
    iput-object p2, p0, Lcom/bumptech/glide/r;->b:Lcom/bumptech/glide/load/c/s;

    .line 715
    iput-object p3, p0, Lcom/bumptech/glide/r;->c:Ljava/lang/Class;

    .line 716
    return-void
.end method

.method static synthetic a(Lcom/bumptech/glide/r;)Lcom/bumptech/glide/load/c/s;
    .locals 1

    .prologue
    .line 709
    iget-object v0, p0, Lcom/bumptech/glide/r;->b:Lcom/bumptech/glide/load/c/s;

    return-object v0
.end method

.method static synthetic b(Lcom/bumptech/glide/r;)Ljava/lang/Class;
    .locals 1

    .prologue
    .line 709
    iget-object v0, p0, Lcom/bumptech/glide/r;->c:Ljava/lang/Class;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/bumptech/glide/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)",
            "Lcom/bumptech/glide/r",
            "<TA;TT;>.com/bumptech/glide/s;"
        }
    .end annotation

    .prologue
    .line 735
    new-instance v0, Lcom/bumptech/glide/s;

    invoke-direct {v0, p0, p1}, Lcom/bumptech/glide/s;-><init>(Lcom/bumptech/glide/r;Ljava/lang/Object;)V

    return-object v0
.end method
