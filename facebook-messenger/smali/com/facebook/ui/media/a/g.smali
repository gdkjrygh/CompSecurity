.class Lcom/facebook/ui/media/a/g;
.super Lcom/facebook/ui/media/a/c;
.source "MediaDownloader.java"


# instance fields
.field private final a:Ljava/io/InputStream;


# direct methods
.method constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .prologue
    .line 108
    sget-object v0, Lcom/facebook/ui/media/a/d;->SUCCESS:Lcom/facebook/ui/media/a/d;

    invoke-direct {p0, v0}, Lcom/facebook/ui/media/a/c;-><init>(Lcom/facebook/ui/media/a/d;)V

    .line 109
    iput-object p1, p0, Lcom/facebook/ui/media/a/g;->a:Ljava/io/InputStream;

    .line 110
    return-void
.end method


# virtual methods
.method public b()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/facebook/ui/media/a/g;->a:Ljava/io/InputStream;

    return-object v0
.end method

.method public c()V
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/facebook/ui/media/a/g;->a:Ljava/io/InputStream;

    invoke-static {v0}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;)V

    .line 120
    return-void
.end method
