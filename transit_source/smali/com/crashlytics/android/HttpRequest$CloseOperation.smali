.class public abstract Lcom/crashlytics/android/HttpRequest$CloseOperation;
.super Lcom/crashlytics/android/HttpRequest$Operation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/crashlytics/android/HttpRequest$Operation",
        "<TV;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/io/Closeable;

.field private final b:Z


# direct methods
.method protected constructor <init>(Ljava/io/Closeable;Z)V
    .locals 0
    .param p1, "closeable"    # Ljava/io/Closeable;
    .param p2, "ignoreCloseExceptions"    # Z

    .prologue
    .line 636
    .local p0, "this":Lcom/crashlytics/android/HttpRequest$CloseOperation;, "Lcom/crashlytics/android/HttpRequest$CloseOperation<TV;>;"
    invoke-direct {p0}, Lcom/crashlytics/android/HttpRequest$Operation;-><init>()V

    .line 637
    iput-object p1, p0, Lcom/crashlytics/android/HttpRequest$CloseOperation;->a:Ljava/io/Closeable;

    .line 638
    iput-boolean p2, p0, Lcom/crashlytics/android/HttpRequest$CloseOperation;->b:Z

    .line 639
    return-void
.end method


# virtual methods
.method protected final b()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 643
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest$CloseOperation;->a:Ljava/io/Closeable;

    instance-of v0, v0, Ljava/io/Flushable;

    if-eqz v0, :cond_0

    .line 644
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest$CloseOperation;->a:Ljava/io/Closeable;

    check-cast v0, Ljava/io/Flushable;

    invoke-interface {v0}, Ljava/io/Flushable;->flush()V

    .line 645
    :cond_0
    iget-boolean v0, p0, Lcom/crashlytics/android/HttpRequest$CloseOperation;->b:Z

    if-eqz v0, :cond_1

    .line 647
    :try_start_0
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest$CloseOperation;->a:Ljava/io/Closeable;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 653
    :goto_0
    return-void

    .line 652
    :cond_1
    iget-object v0, p0, Lcom/crashlytics/android/HttpRequest$CloseOperation;->a:Ljava/io/Closeable;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    goto :goto_0

    .line 650
    :catch_0
    move-exception v0

    goto :goto_0
.end method
