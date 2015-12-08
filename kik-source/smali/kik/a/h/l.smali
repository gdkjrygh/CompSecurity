.class final Lkik/a/h/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/a/h/k;


# direct methods
.method constructor <init>(Lkik/a/h/k;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lkik/a/h/l;->a:Lkik/a/h/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 42
    iget-object v0, p0, Lkik/a/h/l;->a:Lkik/a/h/k;

    invoke-static {v0}, Lkik/a/h/k;->a(Lkik/a/h/k;)Ljava/util/concurrent/ScheduledFuture;

    .line 43
    iget-object v0, p0, Lkik/a/h/l;->a:Lkik/a/h/k;

    invoke-static {v0}, Lkik/a/h/k;->b(Lkik/a/h/k;)Lcom/kik/g/k;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 44
    return-void
.end method
