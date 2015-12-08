.class final Lcom/cmcm/adsdk/nativead/ac;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/nativead/aa;


# direct methods
.method constructor <init>(Lcom/cmcm/adsdk/nativead/aa;)V
    .locals 0

    .prologue
    .line 161
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/ac;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method private varargs a()Ljava/lang/Void;
    .locals 3

    .prologue
    .line 164
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/ac;->a:Lcom/cmcm/adsdk/nativead/aa;

    iget-object v0, v0, Lcom/cmcm/adsdk/nativead/aa;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/cmcm/adsdk/b/b/a;->a(Landroid/content/Context;)Lcom/cmcm/adsdk/b/b/a;

    move-result-object v0

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/ac;->a:Lcom/cmcm/adsdk/nativead/aa;

    iget-object v1, v1, Lcom/cmcm/adsdk/nativead/aa;->mPositionId:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/cmcm/adsdk/b/b/a;->a(I)Ljava/util/List;

    move-result-object v0

    .line 166
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/ac;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-static {v1}, Lcom/cmcm/adsdk/nativead/aa;->a(Lcom/cmcm/adsdk/nativead/aa;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 167
    :try_start_0
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/ac;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-static {v2, v0}, Lcom/cmcm/adsdk/nativead/aa;->a(Lcom/cmcm/adsdk/nativead/aa;Ljava/util/List;)Ljava/util/List;

    .line 168
    monitor-exit v1

    .line 169
    const/4 v0, 0x0

    return-object v0

    .line 168
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
    .line 161
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/ac;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 161
    .line 1174
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/ac;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/aa;->e(Lcom/cmcm/adsdk/nativead/aa;)V

    .line 161
    return-void
.end method
