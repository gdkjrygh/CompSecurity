.class final Lb/a/a/a/a/d/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lb/a/a/a/a/d/f;


# direct methods
.method constructor <init>(Lb/a/a/a/a/d/f;)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lb/a/a/a/a/d/j;->a:Lb/a/a/a/a/d/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 96
    :try_start_0
    iget-object v0, p0, Lb/a/a/a/a/d/j;->a:Lb/a/a/a/a/d/f;

    iget-object v0, v0, Lb/a/a/a/a/d/f;->c:Lb/a/a/a/a/d/n;

    .line 97
    iget-object v1, p0, Lb/a/a/a/a/d/j;->a:Lb/a/a/a/a/d/f;

    iget-object v2, p0, Lb/a/a/a/a/d/j;->a:Lb/a/a/a/a/d/f;

    invoke-virtual {v2}, Lb/a/a/a/a/d/f;->a()Lb/a/a/a/a/d/n;

    move-result-object v2

    iput-object v2, v1, Lb/a/a/a/a/d/f;->c:Lb/a/a/a/a/d/n;

    .line 98
    invoke-interface {v0}, Lb/a/a/a/a/d/n;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    :goto_0
    return-void

    .line 100
    :catch_0
    move-exception v0

    iget-object v0, p0, Lb/a/a/a/a/d/j;->a:Lb/a/a/a/a/d/f;

    iget-object v0, v0, Lb/a/a/a/a/d/f;->a:Landroid/content/Context;

    const-string v1, "Failed to disable events."

    invoke-static {v0, v1}, Lb/a/a/a/a/b/j;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0
.end method
