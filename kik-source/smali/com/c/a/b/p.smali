.class abstract Lcom/c/a/b/p;
.super Lcom/c/a/b/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/a/b/p$a;
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/c/a/b/p;)V
    .locals 2

    .prologue
    .line 41
    invoke-virtual {p1}, Lcom/c/a/b/p;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, Lcom/c/a/b/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/c/a/b/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    return-void
.end method

.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1, p2}, Lcom/c/a/b/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    invoke-static {p1, p2}, Lcom/c/a/b/d;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    return-void
.end method


# virtual methods
.method abstract a()Lcom/c/a/b/p;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method
