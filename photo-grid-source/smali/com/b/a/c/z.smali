.class final Lcom/b/a/c/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/a/a/a/a/e/n;


# instance fields
.field private final a:Lcom/b/a/c/bn;


# direct methods
.method public constructor <init>(Lcom/b/a/c/bn;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/b/a/c/z;->a:Lcom/b/a/c/bn;

    .line 18
    return-void
.end method


# virtual methods
.method public final a()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/b/a/c/z;->a:Lcom/b/a/c/bn;

    invoke-interface {v0}, Lcom/b/a/c/bn;->a()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/b/a/c/z;->a:Lcom/b/a/c/bn;

    invoke-interface {v0}, Lcom/b/a/c/bn;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/b/a/c/z;->a:Lcom/b/a/c/bn;

    invoke-interface {v0}, Lcom/b/a/c/bn;->c()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
