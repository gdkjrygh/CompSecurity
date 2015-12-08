.class public abstract La/a/a/a/a/e/g;
.super La/a/a/a/a/e/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "La/a/a/a/a/e/k",
        "<TV;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/io/Closeable;

.field private final b:Z


# direct methods
.method protected constructor <init>(Ljava/io/Closeable;Z)V
    .locals 0

    .prologue
    .line 624
    invoke-direct {p0}, La/a/a/a/a/e/k;-><init>()V

    .line 625
    iput-object p1, p0, La/a/a/a/a/e/g;->a:Ljava/io/Closeable;

    .line 626
    iput-boolean p2, p0, La/a/a/a/a/e/g;->b:Z

    .line 627
    return-void
.end method


# virtual methods
.method protected final b()V
    .locals 1

    .prologue
    .line 631
    iget-object v0, p0, La/a/a/a/a/e/g;->a:Ljava/io/Closeable;

    instance-of v0, v0, Ljava/io/Flushable;

    if-eqz v0, :cond_0

    .line 632
    iget-object v0, p0, La/a/a/a/a/e/g;->a:Ljava/io/Closeable;

    check-cast v0, Ljava/io/Flushable;

    invoke-interface {v0}, Ljava/io/Flushable;->flush()V

    .line 633
    :cond_0
    iget-boolean v0, p0, La/a/a/a/a/e/g;->b:Z

    if-eqz v0, :cond_1

    .line 635
    :try_start_0
    iget-object v0, p0, La/a/a/a/a/e/g;->a:Ljava/io/Closeable;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 641
    :goto_0
    return-void

    .line 640
    :cond_1
    iget-object v0, p0, La/a/a/a/a/e/g;->a:Ljava/io/Closeable;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    goto :goto_0

    .line 638
    :catch_0
    move-exception v0

    goto :goto_0
.end method
