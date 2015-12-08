.class public final Lcom/roidapp/cloudlib/dropbox/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/c/b/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/c/b/g",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/dropbox/client2/DropboxAPI;


# direct methods
.method public constructor <init>(Lcom/dropbox/client2/DropboxAPI;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/roidapp/cloudlib/dropbox/d;->a:Lcom/dropbox/client2/DropboxAPI;

    .line 18
    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/a/c;
    .locals 2

    .prologue
    .line 12
    check-cast p1, Ljava/lang/String;

    .line 1022
    new-instance v0, Lcom/roidapp/cloudlib/dropbox/b;

    iget-object v1, p0, Lcom/roidapp/cloudlib/dropbox/d;->a:Lcom/dropbox/client2/DropboxAPI;

    invoke-direct {v0, v1, p1}, Lcom/roidapp/cloudlib/dropbox/b;-><init>(Lcom/dropbox/client2/DropboxAPI;Ljava/lang/String;)V

    .line 12
    return-object v0
.end method
