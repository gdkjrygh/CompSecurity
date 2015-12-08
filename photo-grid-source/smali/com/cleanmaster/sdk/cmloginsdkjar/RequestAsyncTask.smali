.class public Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/util/List",
        "<",
        "Lcom/cleanmaster/sdk/cmloginsdkjar/Response;",
        ">;>;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String;

.field private static executeOnExecutorMethod:Ljava/lang/reflect/Method;


# instance fields
.field private final connection:Ljava/net/HttpURLConnection;

.field private exception:Ljava/lang/Exception;

.field private final requests:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 20
    const-class v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->TAG:Ljava/lang/String;

    .line 29
    const-class v0, Landroid/os/AsyncTask;

    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    array-length v3, v2

    move v0, v1

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 30
    const-string v5, "executeOnExecutor"

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 31
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    .line 32
    array-length v6, v5

    const/4 v7, 0x2

    if-ne v6, v7, :cond_1

    aget-object v6, v5, v1

    const-class v7, Ljava/util/concurrent/Executor;

    if-ne v6, v7, :cond_1

    const/4 v6, 0x1

    aget-object v5, v5, v6

    invoke-virtual {v5}, Ljava/lang/Class;->isArray()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 33
    sput-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->executeOnExecutorMethod:Ljava/lang/reflect/Method;

    .line 38
    :cond_0
    return-void

    .line 29
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)V
    .locals 1

    .prologue
    .line 67
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;-><init>(Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)V

    .line 68
    return-void
.end method

.method public constructor <init>(Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)V
    .locals 0

    .prologue
    .line 105
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 106
    iput-object p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->requests:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    .line 107
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->connection:Ljava/net/HttpURLConnection;

    .line 108
    return-void
.end method

.method public constructor <init>(Ljava/net/HttpURLConnection;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/HttpURLConnection;",
            "Ljava/util/Collection",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 93
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    invoke-direct {v0, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, p1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;-><init>(Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)V

    .line 94
    return-void
.end method

.method public varargs constructor <init>(Ljava/net/HttpURLConnection;[Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)V
    .locals 1

    .prologue
    .line 80
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    invoke-direct {v0, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;-><init>([Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)V

    invoke-direct {p0, p1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;-><init>(Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)V

    .line 81
    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 57
    const/4 v0, 0x0

    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    invoke-direct {v1, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;-><init>(Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)V

    .line 58
    return-void
.end method

.method public varargs constructor <init>([Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)V
    .locals 2

    .prologue
    .line 47
    const/4 v0, 0x0

    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    invoke-direct {v1, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;-><init>([Lcom/cleanmaster/sdk/cmloginsdkjar/Request;)V

    invoke-direct {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;-><init>(Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)V

    .line 48
    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 19
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->doInBackground([Ljava/lang/Void;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Void;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Response;",
            ">;"
        }
    .end annotation

    .prologue
    .line 146
    :try_start_0
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->connection:Ljava/net/HttpURLConnection;

    if-nez v0, :cond_0

    .line 147
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->requests:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->executeAndWait()Ljava/util/List;

    move-result-object v0

    .line 153
    :goto_0
    return-object v0

    .line 149
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->connection:Ljava/net/HttpURLConnection;

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->requests:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    invoke-static {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->executeConnectionAndWait(Ljava/net/HttpURLConnection;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 151
    :catch_0
    move-exception v0

    .line 152
    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->exception:Ljava/lang/Exception;

    .line 153
    const/4 v0, 0x0

    goto :goto_0
.end method

.method executeOnSettingsExecutor()Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 158
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->executeOnExecutorMethod:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    .line 160
    :try_start_0
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->executeOnExecutorMethod:Ljava/lang/reflect/Method;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    aput-object v3, v1, v2

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    :goto_0
    return-object p0

    .line 167
    :cond_0
    new-array v0, v1, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 165
    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method protected final getException()Ljava/lang/Exception;
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->exception:Ljava/lang/Exception;

    return-object v0
.end method

.method protected final getRequests()Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->requests:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 19
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->onPostExecute(Ljava/util/List;)V

    return-void
.end method

.method protected onPostExecute(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Response;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 136
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 138
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->exception:Ljava/lang/Exception;

    if-eqz v0, :cond_0

    .line 139
    const-string v0, "onPostExecute: exception encountered during request: %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->exception:Ljava/lang/Exception;

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 141
    :cond_0
    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    .prologue
    .line 126
    invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V

    .line 128
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->requests:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->getCallbackHandler()Landroid/os/Handler;

    move-result-object v0

    if-nez v0, :cond_0

    .line 130
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->requests:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    invoke-virtual {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->setCallbackHandler(Landroid/os/Handler;)V

    .line 132
    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{RequestAsyncTask:  connection: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->connection:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", requests: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestAsyncTask;->requests:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
