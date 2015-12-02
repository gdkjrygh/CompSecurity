.class Lcom/facebook/orca/d/b;
.super Lcom/facebook/ui/media/cache/a;
.source "AudioCache.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/ui/media/cache/a",
        "<",
        "Lcom/facebook/orca/d/c;",
        "[B>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/d/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/d/a;Landroid/content/Context;Lcom/facebook/common/e/h;Lcom/facebook/ui/c/d;Lcom/facebook/analytics/cache/h;Lcom/facebook/common/time/a;Lcom/facebook/ui/media/cache/m;)V
    .locals 7

    .prologue
    .line 85
    iput-object p1, p0, Lcom/facebook/orca/d/b;->a:Lcom/facebook/orca/d/a;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object v6, p7

    invoke-direct/range {v0 .. v6}, Lcom/facebook/ui/media/cache/a;-><init>(Landroid/content/Context;Lcom/facebook/common/e/h;Lcom/facebook/ui/c/d;Lcom/facebook/analytics/cache/h;Lcom/facebook/common/time/a;Lcom/facebook/ui/media/cache/m;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/facebook/ui/media/cache/l;Ljava/io/File;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 85
    check-cast p1, Lcom/facebook/orca/d/c;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/d/b;->a(Lcom/facebook/orca/d/c;Ljava/io/File;)[B

    move-result-object v0

    return-object v0
.end method

.method protected a(Lcom/facebook/orca/d/c;[BLjava/io/File;)V
    .locals 2

    .prologue
    .line 104
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 107
    :try_start_0
    invoke-virtual {v0, p2}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    invoke-static {v0}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;)V

    .line 111
    return-void

    .line 109
    :catchall_0
    move-exception v1

    invoke-static {v0}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;)V

    throw v1
.end method

.method protected bridge synthetic a(Lcom/facebook/ui/media/cache/l;Ljava/lang/Object;Ljava/io/File;)V
    .locals 0

    .prologue
    .line 85
    check-cast p1, Lcom/facebook/orca/d/c;

    check-cast p2, [B

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/orca/d/b;->a(Lcom/facebook/orca/d/c;[BLjava/io/File;)V

    return-void
.end method

.method protected a(Lcom/facebook/orca/d/c;Ljava/io/File;)[B
    .locals 1

    .prologue
    .line 89
    invoke-static {p2}, Lcom/google/common/b/f;->c(Ljava/io/File;)[B

    move-result-object v0

    return-object v0
.end method
