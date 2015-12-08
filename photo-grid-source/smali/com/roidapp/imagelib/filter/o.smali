.class final Lcom/roidapp/imagelib/filter/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/c/f;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/n;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/n;)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/o;->a:Lcom/roidapp/imagelib/filter/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/io/FileInputStream;
    .locals 3

    .prologue
    .line 44
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/o;->a:Lcom/roidapp/imagelib/filter/n;

    iget-object v2, v2, Lcom/roidapp/imagelib/filter/n;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    :goto_0
    return-object v0

    .line 47
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    .line 49
    const/4 v0, 0x0

    goto :goto_0
.end method
