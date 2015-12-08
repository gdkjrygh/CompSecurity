.class final Lcom/roidapp/photogrid/common/ao;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/b/b/i;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/common/PhotoGridGlideModule;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/PhotoGridGlideModule;)V
    .locals 0

    .prologue
    .line 23
    iput-object p1, p0, Lcom/roidapp/photogrid/common/ao;->a:Lcom/roidapp/photogrid/common/PhotoGridGlideModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/io/File;
    .locals 3

    .prologue
    .line 26
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/roidapp/baselib/d/a;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "images"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
