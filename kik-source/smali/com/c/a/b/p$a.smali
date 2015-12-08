.class final Lcom/c/a/b/p$a;
.super Lcom/c/a/b/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/a/b/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0, p1, p2}, Lcom/c/a/b/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    return-void
.end method


# virtual methods
.method final a()Lcom/c/a/b/p;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    .line 63
    const/4 v0, 0x0

    return-object v0
.end method
