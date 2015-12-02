.class Lcom/facebook/ui/media/attachments/b;
.super Ljava/lang/Object;
.source "MediaAttachment.java"

# interfaces
.implements Lcom/google/common/b/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/b/i",
        "<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/media/attachments/a;


# direct methods
.method constructor <init>(Lcom/facebook/ui/media/attachments/a;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/facebook/ui/media/attachments/b;->a:Lcom/facebook/ui/media/attachments/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/b;->a:Lcom/facebook/ui/media/attachments/a;

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/a;->b()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 72
    invoke-virtual {p0}, Lcom/facebook/ui/media/attachments/b;->a()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
