.class final Lcom/google/common/b/h;
.super Ljava/lang/Object;
.source "Files.java"

# interfaces
.implements Lcom/google/common/b/j;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/b/j",
        "<",
        "Ljava/io/FileOutputStream;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/io/File;

.field final synthetic b:Z


# direct methods
.method constructor <init>(Ljava/io/File;Z)V
    .locals 0

    .prologue
    .line 129
    iput-object p1, p0, Lcom/google/common/b/h;->a:Ljava/io/File;

    iput-boolean p2, p0, Lcom/google/common/b/h;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/io/FileOutputStream;
    .locals 3

    .prologue
    .line 132
    new-instance v0, Ljava/io/FileOutputStream;

    iget-object v1, p0, Lcom/google/common/b/h;->a:Ljava/io/File;

    iget-boolean v2, p0, Lcom/google/common/b/h;->b:Z

    invoke-direct {v0, v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 129
    invoke-virtual {p0}, Lcom/google/common/b/h;->a()Ljava/io/FileOutputStream;

    move-result-object v0

    return-object v0
.end method
