.class public abstract Lb/a/a/a/a/e/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/a/a/a/a/e/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40c
    name = "d"
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    .prologue
    .line 623
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract a()Ljava/lang/Object;
.end method

.method protected abstract b()V
.end method

.method public call()Ljava/lang/Object;
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 642
    const/4 v2, 0x0

    .line 644
    :try_start_0
    invoke-virtual {p0}, Lb/a/a/a/a/e/d$d;->a()Ljava/lang/Object;
    :try_end_0
    .catch Lb/a/a/a/a/e/d$c; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v0

    .line 653
    :try_start_1
    invoke-virtual {p0}, Lb/a/a/a/a/e/d$d;->b()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 657
    return-object v0

    .line 654
    :catch_0
    move-exception v0

    .line 655
    new-instance v1, Lb/a/a/a/a/e/d$c;

    invoke-direct {v1, v0}, Lb/a/a/a/a/e/d$c;-><init>(Ljava/io/IOException;)V

    throw v1

    .line 645
    :catch_1
    move-exception v0

    .line 647
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 652
    :catchall_0
    move-exception v0

    .line 653
    :goto_0
    :try_start_3
    invoke-virtual {p0}, Lb/a/a/a/a/e/d$d;->b()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 657
    :cond_0
    throw v0

    .line 648
    :catch_2
    move-exception v0

    .line 650
    :try_start_4
    new-instance v2, Lb/a/a/a/a/e/d$c;

    invoke-direct {v2, v0}, Lb/a/a/a/a/e/d$c;-><init>(Ljava/io/IOException;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 654
    :catch_3
    move-exception v2

    .line 655
    if-nez v1, :cond_0

    .line 656
    new-instance v0, Lb/a/a/a/a/e/d$c;

    invoke-direct {v0, v2}, Lb/a/a/a/a/e/d$c;-><init>(Ljava/io/IOException;)V

    throw v0

    .line 652
    :catchall_1
    move-exception v0

    move v1, v2

    goto :goto_0
.end method
