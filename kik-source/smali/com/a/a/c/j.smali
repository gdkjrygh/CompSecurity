.class final Lcom/a/a/c/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic a:Lcom/a/a/c/g;


# direct methods
.method constructor <init>(Lcom/a/a/c/g;)V
    .locals 0

    .prologue
    .line 810
    iput-object p1, p0, Lcom/a/a/c/j;->a:Lcom/a/a/c/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()Ljava/lang/Boolean;
    .locals 4

    .prologue
    .line 814
    :try_start_0
    iget-object v0, p0, Lcom/a/a/c/j;->a:Lcom/a/a/c/g;

    invoke-static {v0}, Lcom/a/a/c/g;->a(Lcom/a/a/c/g;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v0

    .line 815
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 817
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 821
    :goto_0
    return-object v0

    .line 818
    :catch_0
    move-exception v0

    .line 819
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Problem encountered deleting Crashlytics initialization marker."

    invoke-interface {v1, v2, v3, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 821
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 810
    invoke-direct {p0}, Lcom/a/a/c/j;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
