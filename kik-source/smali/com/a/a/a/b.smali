.class final Lcom/a/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/a/d/p;


# instance fields
.field private final a:Lcom/a/a/a/n;

.field private final b:Lcom/a/a/a/j;


# direct methods
.method constructor <init>(Lcom/a/a/a/n;Lcom/a/a/a/j;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/a/a/a/b;->a:Lcom/a/a/a/n;

    .line 42
    iput-object p2, p0, Lcom/a/a/a/b;->b:Lcom/a/a/a/j;

    .line 43
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 47
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    .line 48
    iget-object v1, p0, Lcom/a/a/a/b;->b:Lcom/a/a/a/j;

    invoke-virtual {v1, v2, v3}, Lcom/a/a/a/j;->a(J)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 49
    iget-object v1, p0, Lcom/a/a/a/b;->a:Lcom/a/a/a/n;

    invoke-virtual {v1, p1}, Lcom/a/a/a/n;->a(Ljava/util/List;)Z

    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    iget-object v0, p0, Lcom/a/a/a/b;->b:Lcom/a/a/a/j;

    invoke-virtual {v0}, Lcom/a/a/a/j;->a()V

    .line 52
    const/4 v0, 0x1

    .line 58
    :cond_0
    :goto_0
    return v0

    .line 54
    :cond_1
    iget-object v1, p0, Lcom/a/a/a/b;->b:Lcom/a/a/a/j;

    invoke-virtual {v1, v2, v3}, Lcom/a/a/a/j;->b(J)V

    goto :goto_0
.end method
