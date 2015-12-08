.class final Lcom/a/a/c/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/a/e/h;


# instance fields
.field private final a:Lcom/a/a/c/au;


# direct methods
.method public constructor <init>(Lcom/a/a/c/au;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/a/a/c/w;->a:Lcom/a/a/c/au;

    .line 18
    return-void
.end method


# virtual methods
.method public final a()Ljava/io/InputStream;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/a/a/c/w;->a:Lcom/a/a/c/au;

    invoke-interface {v0}, Lcom/a/a/c/au;->a()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/a/a/c/w;->a:Lcom/a/a/c/au;

    invoke-interface {v0}, Lcom/a/a/c/au;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/a/a/c/w;->a:Lcom/a/a/c/au;

    invoke-interface {v0}, Lcom/a/a/c/au;->c()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
