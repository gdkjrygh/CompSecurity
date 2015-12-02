.class public abstract Lcom/facebook/ui/media/a/c;
.super Ljava/lang/Object;
.source "MediaDownloader.java"


# instance fields
.field private final a:Lcom/facebook/ui/media/a/d;


# direct methods
.method protected constructor <init>(Lcom/facebook/ui/media/a/d;)V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lcom/facebook/ui/media/a/c;->a:Lcom/facebook/ui/media/a/d;

    .line 60
    return-void
.end method

.method public static a(Lcom/facebook/ui/media/a/d;)Lcom/facebook/ui/media/a/c;
    .locals 1

    .prologue
    .line 74
    new-instance v0, Lcom/facebook/ui/media/a/e;

    invoke-direct {v0, p0}, Lcom/facebook/ui/media/a/e;-><init>(Lcom/facebook/ui/media/a/d;)V

    return-object v0
.end method

.method public static a(Ljava/io/InputStream;)Lcom/facebook/ui/media/a/c;
    .locals 1

    .prologue
    .line 78
    new-instance v0, Lcom/facebook/ui/media/a/g;

    invoke-direct {v0, p0}, Lcom/facebook/ui/media/a/g;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method

.method public static a(Lorg/apache/http/HttpEntity;)Lcom/facebook/ui/media/a/c;
    .locals 1

    .prologue
    .line 82
    new-instance v0, Lcom/facebook/ui/media/a/f;

    invoke-direct {v0, p0}, Lcom/facebook/ui/media/a/f;-><init>(Lorg/apache/http/HttpEntity;)V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/ui/media/a/d;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/ui/media/a/c;->a:Lcom/facebook/ui/media/a/d;

    return-object v0
.end method

.method public b()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 67
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public c()V
    .locals 0

    .prologue
    .line 71
    return-void
.end method

.method public d()J
    .locals 2

    .prologue
    .line 91
    const-wide/16 v0, -0x1

    return-wide v0
.end method
