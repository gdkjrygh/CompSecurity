.class final Lcom/b/a/c/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/b/a/c/h;


# direct methods
.method constructor <init>(Lcom/b/a/c/h;)V
    .locals 0

    .prologue
    .line 812
    iput-object p1, p0, Lcom/b/a/c/k;->a:Lcom/b/a/c/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()Ljava/lang/Boolean;
    .locals 4

    .prologue
    .line 816
    :try_start_0
    iget-object v0, p0, Lcom/b/a/c/k;->a:Lcom/b/a/c/h;

    invoke-static {v0}, Lcom/b/a/c/h;->a(Lcom/b/a/c/h;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v0

    .line 817
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 819
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 823
    :goto_0
    return-object v0

    .line 820
    :catch_0
    move-exception v0

    .line 821
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "CrashlyticsCore"

    const-string v3, "Problem encountered deleting Crashlytics initialization marker."

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 823
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 812
    invoke-direct {p0}, Lcom/b/a/c/k;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
