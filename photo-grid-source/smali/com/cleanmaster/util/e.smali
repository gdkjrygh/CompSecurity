.class final Lcom/cleanmaster/util/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cleanmaster/util/h;


# instance fields
.field final synthetic a:Lcom/cleanmaster/util/d;


# direct methods
.method constructor <init>(Lcom/cleanmaster/util/d;)V
    .locals 0

    .prologue
    .line 418
    iput-object p1, p0, Lcom/cleanmaster/util/e;->a:Lcom/cleanmaster/util/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/InputStream;)V
    .locals 3

    .prologue
    .line 422
    if-nez p1, :cond_1

    .line 423
    sget-boolean v0, Lcom/cleanmaster/util/j;->a:Z

    .line 450
    :cond_0
    :goto_0
    return-void

    .line 430
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 432
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-direct {v2, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 435
    :goto_1
    :try_start_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    .line 436
    if-eqz v2, :cond_2

    .line 440
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 444
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 447
    :cond_2
    sget-boolean v0, Lcom/cleanmaster/util/j;->a:Z

    if-eqz v0, :cond_0

    .line 448
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "onResult "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method
