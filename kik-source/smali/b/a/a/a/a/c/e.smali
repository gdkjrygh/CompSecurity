.class final Lb/a/a/a/a/c/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lb/a/a/a/a/c/a$c;


# direct methods
.method constructor <init>(Lb/a/a/a/a/c/a$c;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 251
    iput-object p1, p0, Lb/a/a/a/a/c/e;->b:Lb/a/a/a/a/c/a$c;

    iput-object p2, p0, Lb/a/a/a/a/c/e;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 254
    :try_start_0
    iget-object v0, p0, Lb/a/a/a/a/c/e;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 256
    iget-object v0, p0, Lb/a/a/a/a/c/e;->b:Lb/a/a/a/a/c/a$c;

    invoke-virtual {v0}, Lb/a/a/a/a/c/a$c;->a()V

    .line 257
    return-void

    .line 256
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lb/a/a/a/a/c/e;->b:Lb/a/a/a/a/c/a$c;

    invoke-virtual {v1}, Lb/a/a/a/a/c/a$c;->a()V

    throw v0
.end method
