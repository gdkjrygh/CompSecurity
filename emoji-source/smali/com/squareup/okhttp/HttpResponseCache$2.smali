.class final Lcom/squareup/okhttp/HttpResponseCache$2;
.super Ljava/io/FilterInputStream;
.source "HttpResponseCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/okhttp/HttpResponseCache;->newBodyInputStream(Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;)Ljava/io/InputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$snapshot:Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;


# direct methods
.method constructor <init>(Ljava/io/InputStream;Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;)V
    .locals 0
    .param p1, "x0"    # Ljava/io/InputStream;

    .prologue
    .line 642
    iput-object p2, p0, Lcom/squareup/okhttp/HttpResponseCache$2;->val$snapshot:Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;

    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 644
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache$2;->val$snapshot:Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;->close()V

    .line 645
    invoke-super {p0}, Ljava/io/FilterInputStream;->close()V

    .line 646
    return-void
.end method
