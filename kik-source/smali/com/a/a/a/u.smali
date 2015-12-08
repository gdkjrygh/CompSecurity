.class final Lcom/a/a/a/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lb/a/a/a/a/g/b;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/a/a/a/t;


# direct methods
.method constructor <init>(Lcom/a/a/a/t;Lb/a/a/a/a/g/b;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lcom/a/a/a/u;->c:Lcom/a/a/a/t;

    iput-object p2, p0, Lcom/a/a/a/u;->a:Lb/a/a/a/a/g/b;

    iput-object p3, p0, Lcom/a/a/a/u;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 29
    :try_start_0
    iget-object v0, p0, Lcom/a/a/a/u;->c:Lcom/a/a/a/t;

    invoke-static {v0}, Lcom/a/a/a/t;->a(Lcom/a/a/a/t;)Lb/a/a/a/a/d/n;

    move-result-object v0

    check-cast v0, Lcom/a/a/a/p;

    iget-object v1, p0, Lcom/a/a/a/u;->a:Lb/a/a/a/a/g/b;

    iget-object v2, p0, Lcom/a/a/a/u;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/a/a/a/p;->a(Lb/a/a/a/a/g/b;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    :goto_0
    return-void

    .line 32
    :catch_0
    move-exception v0

    invoke-static {}, Lcom/a/a/a/a;->c()Lcom/a/a/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/a/a;->v()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Crashlytics failed to set analytics settings data."

    invoke-static {v0, v1}, Lb/a/a/a/a/b/j;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0
.end method
