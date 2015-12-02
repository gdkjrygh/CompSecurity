.class Lcom/facebook/ui/media/cache/c;
.super Ljava/lang/Object;
.source "DiskCache.java"

# interfaces
.implements Ljava/io/FilenameFilter;


# instance fields
.field final synthetic a:Lcom/facebook/ui/media/cache/a;


# direct methods
.method constructor <init>(Lcom/facebook/ui/media/cache/a;)V
    .locals 0

    .prologue
    .line 147
    iput-object p1, p0, Lcom/facebook/ui/media/cache/c;->a:Lcom/facebook/ui/media/cache/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Lcom/facebook/ui/media/cache/c;->a:Lcom/facebook/ui/media/cache/a;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/a;->a(Lcom/facebook/ui/media/cache/a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
