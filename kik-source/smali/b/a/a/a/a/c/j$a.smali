.class final Lb/a/a/a/a/c/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/a/a/a/a/c/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lb/a/a/a/a/c/j;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lb/a/a/a/a/c/j;)V
    .locals 0

    .prologue
    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    iput-object p1, p0, Lb/a/a/a/a/c/j$a;->a:Ljava/util/concurrent/Executor;

    .line 109
    iput-object p2, p0, Lb/a/a/a/a/c/j$a;->b:Lb/a/a/a/a/c/j;

    .line 110
    return-void
.end method

.method static synthetic a(Lb/a/a/a/a/c/j$a;)Lb/a/a/a/a/c/j;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lb/a/a/a/a/c/j$a;->b:Lb/a/a/a/a/c/j;

    return-object v0
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 114
    iget-object v0, p0, Lb/a/a/a/a/c/j$a;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lb/a/a/a/a/c/k;

    invoke-direct {v1, p0, p1}, Lb/a/a/a/a/c/k;-><init>(Lb/a/a/a/a/c/j$a;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 122
    return-void
.end method
