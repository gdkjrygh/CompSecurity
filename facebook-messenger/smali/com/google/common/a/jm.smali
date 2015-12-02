.class final Lcom/google/common/a/jm;
.super Lcom/google/common/a/ji;
.source "Multisets.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/ji",
        "<TE;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final b:I


# direct methods
.method constructor <init>(Ljava/lang/Object;I)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;I)V"
        }
    .end annotation

    .prologue
    .line 193
    invoke-direct {p0}, Lcom/google/common/a/ji;-><init>()V

    .line 194
    iput-object p1, p0, Lcom/google/common/a/jm;->a:Ljava/lang/Object;

    .line 195
    iput p2, p0, Lcom/google/common/a/jm;->b:I

    .line 196
    if-ltz p2, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 197
    return-void

    .line 196
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    .line 201
    iget-object v0, p0, Lcom/google/common/a/jm;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 206
    iget v0, p0, Lcom/google/common/a/jm;->b:I

    return v0
.end method
