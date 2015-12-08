.class final Lcom/b/a/b/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/b/a/b/c;


# direct methods
.method constructor <init>(Lcom/b/a/b/c;)V
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/b/a/b/d;->a:Lcom/b/a/b/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/b/a/b/d;->a:Lcom/b/a/b/c;

    iget-object v0, v0, Lcom/b/a/b/c;->a:Lcom/b/a/b/b;

    invoke-virtual {v0}, Lcom/b/a/b/b;->b()V

    .line 28
    return-void
.end method
