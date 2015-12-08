.class final Lcom/c/a/b/ah$a;
.super Lcom/c/a/b/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/a/b/ah;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/c/a/b/ah;


# direct methods
.method private constructor <init>(Lcom/c/a/b/ah;)V
    .locals 0

    .prologue
    .line 189
    iput-object p1, p0, Lcom/c/a/b/ah$a;->a:Lcom/c/a/b/ah;

    invoke-direct {p0}, Lcom/c/a/b/q;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/c/a/b/ah;B)V
    .locals 0

    .prologue
    .line 189
    invoke-direct {p0, p1}, Lcom/c/a/b/ah$a;-><init>(Lcom/c/a/b/ah;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/c/a/b/ao;
    .locals 1

    .prologue
    .line 196
    invoke-virtual {p0}, Lcom/c/a/b/ah$a;->c()Lcom/c/a/b/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/a/b/m;->a()Lcom/c/a/b/ao;

    move-result-object v0

    return-object v0
.end method

.method final e()Lcom/c/a/b/m;
    .locals 2

    .prologue
    .line 201
    new-instance v0, Lcom/c/a/b/af;

    iget-object v1, p0, Lcom/c/a/b/ah$a;->a:Lcom/c/a/b/ah;

    invoke-static {v1}, Lcom/c/a/b/ah;->a(Lcom/c/a/b/ah;)[Lcom/c/a/b/p;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/c/a/b/af;-><init>(Lcom/c/a/b/k;[Ljava/lang/Object;)V

    return-object v0
.end method

.method final f()Lcom/c/a/b/o;
    .locals 1

    .prologue
    .line 191
    iget-object v0, p0, Lcom/c/a/b/ah$a;->a:Lcom/c/a/b/ah;

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 188
    invoke-virtual {p0}, Lcom/c/a/b/ah$a;->c()Lcom/c/a/b/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/a/b/m;->a()Lcom/c/a/b/ao;

    move-result-object v0

    return-object v0
.end method
