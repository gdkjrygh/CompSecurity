.class Lcom/facebook/ui/images/a/b;
.super Ljava/lang/Object;
.source "ImageAttachmentDecoder.java"

# interfaces
.implements Lcom/google/common/b/j;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/b/j",
        "<",
        "Ljava/io/OutputStream;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/io/File;

.field final synthetic b:Lcom/facebook/ui/images/a/a;


# direct methods
.method constructor <init>(Lcom/facebook/ui/images/a/a;Ljava/io/File;)V
    .locals 0

    .prologue
    .line 164
    iput-object p1, p0, Lcom/facebook/ui/images/a/b;->b:Lcom/facebook/ui/images/a/a;

    iput-object p2, p0, Lcom/facebook/ui/images/a/b;->a:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/io/OutputStream;
    .locals 3

    .prologue
    .line 167
    iget-object v0, p0, Lcom/facebook/ui/images/a/b;->b:Lcom/facebook/ui/images/a/a;

    invoke-static {v0}, Lcom/facebook/ui/images/a/a;->a(Lcom/facebook/ui/images/a/a;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/ui/images/a/b;->a:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 164
    invoke-virtual {p0}, Lcom/facebook/ui/images/a/b;->a()Ljava/io/OutputStream;

    move-result-object v0

    return-object v0
.end method
