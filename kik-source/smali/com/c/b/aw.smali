.class public final Lcom/c/b/aw;
.super Lcom/c/b/ax;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/aw$b;,
        Lcom/c/b/aw$a;
    }
.end annotation


# instance fields
.field private final b:Lcom/c/b/be;


# direct methods
.method public constructor <init>(Lcom/c/b/be;Lcom/c/b/aq;Lcom/c/b/f;)V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0, p2, p3}, Lcom/c/b/ax;-><init>(Lcom/c/b/aq;Lcom/c/b/f;)V

    .line 58
    iput-object p1, p0, Lcom/c/b/aw;->b:Lcom/c/b/be;

    .line 59
    return-void
.end method


# virtual methods
.method public final a()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/c/b/aw;->b:Lcom/c/b/be;

    invoke-virtual {p0, v0}, Lcom/c/b/aw;->a(Lcom/c/b/be;)Lcom/c/b/be;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 77
    invoke-virtual {p0}, Lcom/c/b/aw;->a()Lcom/c/b/be;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 72
    invoke-virtual {p0}, Lcom/c/b/aw;->a()Lcom/c/b/be;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 82
    invoke-virtual {p0}, Lcom/c/b/aw;->a()Lcom/c/b/be;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
