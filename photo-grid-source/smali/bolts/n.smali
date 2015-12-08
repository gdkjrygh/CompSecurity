.class final Lbolts/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbolts/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbolts/i",
        "<TTResult;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lbolts/q;

.field final synthetic b:Lbolts/i;

.field final synthetic c:Ljava/util/concurrent/Executor;

.field final synthetic d:Lbolts/j;


# direct methods
.method constructor <init>(Lbolts/j;Lbolts/q;Lbolts/i;Ljava/util/concurrent/Executor;)V
    .locals 0

    .prologue
    .line 348
    iput-object p1, p0, Lbolts/n;->d:Lbolts/j;

    iput-object p2, p0, Lbolts/n;->a:Lbolts/q;

    iput-object p3, p0, Lbolts/n;->b:Lbolts/i;

    iput-object p4, p0, Lbolts/n;->c:Ljava/util/concurrent/Executor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic then(Lbolts/j;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 348
    .line 1351
    iget-object v0, p0, Lbolts/n;->a:Lbolts/q;

    iget-object v1, p0, Lbolts/n;->b:Lbolts/i;

    iget-object v2, p0, Lbolts/n;->c:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1, v2}, Lbolts/j;->b(Lbolts/q;Lbolts/i;Lbolts/j;Ljava/util/concurrent/Executor;)V

    .line 1352
    const/4 v0, 0x0

    .line 348
    return-object v0
.end method
