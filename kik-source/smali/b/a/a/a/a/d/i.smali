.class final Lb/a/a/a/a/d/i;
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
    .line 79
    iput-object p1, p0, Lb/a/a/a/a/d/i;->a:Lb/a/a/a/a/d/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 83
    :try_start_0
    iget-object v0, p0, Lb/a/a/a/a/d/i;->a:Lb/a/a/a/a/d/f;

    iget-object v0, v0, Lb/a/a/a/a/d/f;->c:Lb/a/a/a/a/d/n;

    invoke-interface {v0}, Lb/a/a/a/a/d/n;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    :goto_0
    return-void

    .line 85
    :catch_0
    move-exception v0

    iget-object v0, p0, Lb/a/a/a/a/d/i;->a:Lb/a/a/a/a/d/f;

    iget-object v0, v0, Lb/a/a/a/a/d/f;->a:Landroid/content/Context;

    const-string v1, "Failed to send events files."

    invoke-static {v0, v1}, Lb/a/a/a/a/b/j;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0
.end method
