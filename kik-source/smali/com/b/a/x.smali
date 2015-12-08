.class public final Lcom/b/a/x;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lcom/b/a/u;


# direct methods
.method public constructor <init>(Lcom/b/a/n;)V
    .locals 1

    .prologue
    .line 65
    invoke-interface {p1}, Lcom/b/a/n;->a()Lcom/b/a/u;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/b/a/x;-><init>(Ljava/lang/Object;Lcom/b/a/u;)V

    .line 66
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lcom/b/a/u;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 69
    iput-object p1, p0, Lcom/b/a/x;->a:Ljava/lang/Object;

    .line 70
    iput-object p2, p0, Lcom/b/a/x;->b:Lcom/b/a/u;

    .line 71
    return-void
.end method
