.class final Lcom/bumptech/glide/load/c/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/c/s;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/a/c;
    .locals 2

    .prologue
    .line 25
    new-instance v0, Ljava/lang/NoSuchMethodError;

    const-string v1, "This should never be called!"

    invoke-direct {v0, v1}, Ljava/lang/NoSuchMethodError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    const-string v0, "NULL_MODEL_LOADER"

    return-object v0
.end method
