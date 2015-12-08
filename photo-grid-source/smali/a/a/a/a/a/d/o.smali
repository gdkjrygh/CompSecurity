.class public final La/a/a/a/a/d/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:La/a/a/a/a/d/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;La/a/a/a/a/d/k;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, La/a/a/a/a/d/o;->a:Landroid/content/Context;

    .line 34
    iput-object p2, p0, La/a/a/a/a/d/o;->b:La/a/a/a/a/d/k;

    .line 35
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 40
    :try_start_0
    iget-object v0, p0, La/a/a/a/a/d/o;->a:Landroid/content/Context;

    invoke-static {v0}, La/a/a/a/a/b/l;->e(Landroid/content/Context;)V

    .line 41
    iget-object v0, p0, La/a/a/a/a/d/o;->b:La/a/a/a/a/d/k;

    invoke-interface {v0}, La/a/a/a/a/d/k;->e()Z

    move-result v0

    .line 43
    if-nez v0, :cond_0

    .line 46
    iget-object v0, p0, La/a/a/a/a/d/o;->b:La/a/a/a/a/d/k;

    invoke-interface {v0}, La/a/a/a/a/d/k;->d()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    :cond_0
    :goto_0
    return-void

    .line 49
    :catch_0
    move-exception v0

    iget-object v0, p0, La/a/a/a/a/d/o;->a:Landroid/content/Context;

    const-string v1, "Failed to roll over file"

    invoke-static {v0, v1}, La/a/a/a/a/b/l;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0
.end method
