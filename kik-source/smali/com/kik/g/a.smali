.class public final Lcom/kik/g/a;
.super Lcom/kik/g/k;
.source "SourceFile"


# instance fields
.field a:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    .line 16
    iput-object p2, p0, Lcom/kik/g/a;->a:Ljava/util/concurrent/ExecutorService;

    .line 17
    return-void
.end method

.method static synthetic a(Lcom/kik/g/a;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 9
    invoke-super {p0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 27
    iget-object v0, p0, Lcom/kik/g/a;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/kik/g/b;

    invoke-direct {v1, p0, p1}, Lcom/kik/g/b;-><init>(Lcom/kik/g/a;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 34
    return-void
.end method
