.class Lcom/facebook/ui/media/cache/b;
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
    .line 140
    iput-object p1, p0, Lcom/facebook/ui/media/cache/b;->a:Lcom/facebook/ui/media/cache/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lcom/facebook/ui/media/cache/b;->a:Lcom/facebook/ui/media/cache/a;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/a;->a(Lcom/facebook/ui/media/cache/a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
