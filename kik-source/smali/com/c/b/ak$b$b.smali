.class final Lcom/c/b/ak$b$b;
.super Lcom/c/b/ak$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/ak$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/c/b/ak$g;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/c/b/ak$g;)V
    .locals 0

    .prologue
    .line 2203
    invoke-direct {p0}, Lcom/c/b/ak$h;-><init>()V

    .line 2204
    iput-object p3, p0, Lcom/c/b/ak$b$b;->c:Lcom/c/b/ak$g;

    .line 2205
    iput-object p2, p0, Lcom/c/b/ak$b$b;->b:Ljava/lang/String;

    .line 2206
    iput-object p1, p0, Lcom/c/b/ak$b$b;->a:Ljava/lang/String;

    .line 2207
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2198
    iget-object v0, p0, Lcom/c/b/ak$b$b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2199
    iget-object v0, p0, Lcom/c/b/ak$b$b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lcom/c/b/ak$g;
    .locals 1

    .prologue
    .line 2200
    iget-object v0, p0, Lcom/c/b/ak$b$b;->c:Lcom/c/b/ak$g;

    return-object v0
.end method

.method public final i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 2197
    iget-object v0, p0, Lcom/c/b/ak$b$b;->c:Lcom/c/b/ak$g;

    invoke-virtual {v0}, Lcom/c/b/ak$g;->a()Lcom/c/b/i$o;

    move-result-object v0

    return-object v0
.end method
