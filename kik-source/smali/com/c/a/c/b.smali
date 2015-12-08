.class abstract Lcom/c/a/c/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/a/c/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/a/c/b$a;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/c/a/c/g;)Lcom/c/a/c/i;
    .locals 1

    .prologue
    .line 37
    invoke-virtual {p0}, Lcom/c/a/c/b;->a()Lcom/c/a/c/k;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/c/a/c/k;->a(Ljava/lang/Object;Lcom/c/a/c/g;)Lcom/c/a/c/k;

    move-result-object v0

    invoke-interface {v0}, Lcom/c/a/c/k;->a()Lcom/c/a/c/i;

    move-result-object v0

    return-object v0
.end method
