.class final Lcom/google/common/b/g;
.super Ljava/lang/Object;
.source "Files.java"

# interfaces
.implements Lcom/google/common/b/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/b/i",
        "<",
        "Ljava/io/FileInputStream;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/io/File;


# direct methods
.method constructor <init>(Ljava/io/File;)V
    .locals 0

    .prologue
    .line 97
    iput-object p1, p0, Lcom/google/common/b/g;->a:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/io/FileInputStream;
    .locals 2

    .prologue
    .line 100
    new-instance v0, Ljava/io/FileInputStream;

    iget-object v1, p0, Lcom/google/common/b/g;->a:Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 97
    invoke-virtual {p0}, Lcom/google/common/b/g;->a()Ljava/io/FileInputStream;

    move-result-object v0

    return-object v0
.end method
