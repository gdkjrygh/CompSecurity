.class final Lcom/kik/m/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/m/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field protected final a:Lcom/kik/g/p;

.field protected final b:Ljava/util/concurrent/Callable;


# direct methods
.method protected constructor <init>(Lcom/kik/g/p;Ljava/util/concurrent/Callable;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/kik/m/q$a;->a:Lcom/kik/g/p;

    .line 26
    iput-object p2, p0, Lcom/kik/m/q$a;->b:Ljava/util/concurrent/Callable;

    .line 27
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 33
    :try_start_0
    iget-object v0, p0, Lcom/kik/m/q$a;->b:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    .line 35
    iget-object v1, p0, Lcom/kik/m/q$a;->a:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    :goto_0
    return-void

    .line 37
    :catch_0
    move-exception v0

    .line 38
    iget-object v1, p0, Lcom/kik/m/q$a;->a:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
