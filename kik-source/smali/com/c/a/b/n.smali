.class final Lcom/c/a/b/n;
.super Lcom/c/a/b/a;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/c/a/b/m;


# direct methods
.method constructor <init>(Lcom/c/a/b/m;II)V
    .locals 0

    .prologue
    .line 348
    iput-object p1, p0, Lcom/c/a/b/n;->a:Lcom/c/a/b/m;

    invoke-direct {p0, p2, p3}, Lcom/c/a/b/a;-><init>(II)V

    return-void
.end method


# virtual methods
.method protected final a(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 351
    iget-object v0, p0, Lcom/c/a/b/n;->a:Lcom/c/a/b/m;

    invoke-virtual {v0, p1}, Lcom/c/a/b/m;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
