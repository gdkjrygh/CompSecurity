.class final Lcom/cmcm/adsdk/nativead/ab;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/nativead/aa;


# direct methods
.method constructor <init>(Lcom/cmcm/adsdk/nativead/aa;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/ab;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method private varargs a()Ljava/lang/Boolean;
    .locals 3

    .prologue
    .line 72
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/ab;->a:Lcom/cmcm/adsdk/nativead/aa;

    iget-object v0, v0, Lcom/cmcm/adsdk/nativead/aa;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/cmcm/adsdk/b/b/a;->a(Landroid/content/Context;)Lcom/cmcm/adsdk/b/b/a;

    move-result-object v0

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/ab;->a:Lcom/cmcm/adsdk/nativead/aa;

    iget-object v1, v1, Lcom/cmcm/adsdk/nativead/aa;->mPositionId:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/cmcm/adsdk/b/b/a;->a(I)Ljava/util/List;

    move-result-object v0

    .line 74
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/ab;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-static {v1}, Lcom/cmcm/adsdk/nativead/aa;->a(Lcom/cmcm/adsdk/nativead/aa;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 75
    :try_start_0
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/ab;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-static {v2, v0}, Lcom/cmcm/adsdk/nativead/aa;->a(Lcom/cmcm/adsdk/nativead/aa;Ljava/util/List;)Ljava/util/List;

    .line 76
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/ab;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/aa;->b(Lcom/cmcm/adsdk/nativead/aa;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    monitor-exit v1

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 77
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 69
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/ab;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 69
    check-cast p1, Ljava/lang/Boolean;

    .line 1082
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1083
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/ab;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/aa;->c(Lcom/cmcm/adsdk/nativead/aa;)V

    .line 1084
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/ab;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/aa;->d(Lcom/cmcm/adsdk/nativead/aa;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1085
    const-string v0, "CMCMADSDK"

    const-string v1, "the last request suspended by no config, to complete last request"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1086
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/ab;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/aa;->e(Lcom/cmcm/adsdk/nativead/aa;)V

    .line 1087
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/ab;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/aa;->f(Lcom/cmcm/adsdk/nativead/aa;)Z

    .line 69
    :cond_0
    return-void
.end method
