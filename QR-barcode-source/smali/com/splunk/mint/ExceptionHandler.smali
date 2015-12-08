.class public Lcom/splunk/mint/ExceptionHandler;
.super Ljava/lang/Object;
.source "ExceptionHandler.java"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field private defaultExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;


# direct methods
.method public constructor <init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    .locals 0
    .param p1, "pDefaultExceptionHandler"    # Ljava/lang/Thread$UncaughtExceptionHandler;

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/splunk/mint/ExceptionHandler;->defaultExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 30
    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 12
    .param p1, "t"    # Ljava/lang/Thread;
    .param p2, "e"    # Ljava/lang/Throwable;

    .prologue
    .line 39
    new-instance v7, Ljava/io/StringWriter;

    invoke-direct {v7}, Ljava/io/StringWriter;-><init>()V

    .line 40
    .local v7, "stacktrace":Ljava/io/Writer;
    new-instance v6, Ljava/io/PrintWriter;

    invoke-direct {v6, v7}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 42
    .local v6, "printWriter":Ljava/io/PrintWriter;
    invoke-virtual {p2, v6}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 45
    new-instance v0, Lcom/splunk/mint/ActionError;

    sget-object v8, Lcom/splunk/mint/EnumActionType;->error:Lcom/splunk/mint/EnumActionType;

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    sget-object v10, Lcom/splunk/mint/EnumExceptionType;->UNHANDLED:Lcom/splunk/mint/EnumExceptionType;

    const/4 v11, 0x0

    invoke-direct {v0, v8, v9, v10, v11}, Lcom/splunk/mint/ActionError;-><init>(Lcom/splunk/mint/EnumActionType;Ljava/lang/String;Lcom/splunk/mint/EnumExceptionType;Lcom/splunk/mint/ExtraData;)V

    .line 48
    .local v0, "crashData":Lcom/splunk/mint/ActionError;
    sget-object v8, Lcom/splunk/mint/Properties;->transactionsDatabase:Lcom/splunk/mint/TransactionsDatabase;

    invoke-virtual {v8}, Lcom/splunk/mint/TransactionsDatabase;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 49
    .local v2, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Lcom/splunk/mint/TransactionsDatabase$Container;>;>;"
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    .line 50
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 51
    .local v5, "pair":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/splunk/mint/TransactionsDatabase$Container;>;"
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_0

    .line 53
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    const-string v9, "TStart:name:"

    const-string v10, ""

    invoke-virtual {v8, v9, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lcom/splunk/mint/ActionError;->getErrorHash()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/splunk/mint/ActionTransactionStop;->createTransactionFail(Ljava/lang/String;Ljava/lang/String;)Lcom/splunk/mint/ActionTransactionStop;

    move-result-object v4

    .line 54
    .local v4, "mTransactionStop":Lcom/splunk/mint/ActionTransactionStop;
    new-instance v8, Lcom/splunk/mint/DataSaver;

    invoke-direct {v8}, Lcom/splunk/mint/DataSaver;-><init>()V

    invoke-virtual {v4, v8}, Lcom/splunk/mint/ActionTransactionStop;->save(Lcom/splunk/mint/DataSaver;)V

    .line 56
    .end local v4    # "mTransactionStop":Lcom/splunk/mint/ActionTransactionStop;
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 60
    .end local v5    # "pair":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/splunk/mint/TransactionsDatabase$Container;>;"
    :cond_1
    new-instance v8, Lcom/splunk/mint/NetSender;

    invoke-direct {v8}, Lcom/splunk/mint/NetSender;-><init>()V

    const/4 v9, 0x1

    invoke-virtual {v0, v8, v9}, Lcom/splunk/mint/ActionError;->send(Lcom/splunk/mint/NetSender;Z)V

    .line 63
    new-instance v3, Lcom/splunk/mint/CrashInfo;

    invoke-direct {v3}, Lcom/splunk/mint/CrashInfo;-><init>()V

    .line 64
    .local v3, "mCrashInfo":Lcom/splunk/mint/CrashInfo;
    invoke-virtual {v0}, Lcom/splunk/mint/ActionError;->getErrorHash()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Lcom/splunk/mint/CrashInfo;->saveLastCrashID(Ljava/lang/String;)V

    .line 66
    invoke-static {}, Lcom/splunk/mint/Utils;->setForceSendPingOnNextStart()V

    .line 69
    sget-object v8, Lcom/splunk/mint/Mint;->mintCallback:Lcom/splunk/mint/MintCallback;

    if-eqz v8, :cond_2

    .line 70
    sget-object v8, Lcom/splunk/mint/Mint;->mintCallback:Lcom/splunk/mint/MintCallback;

    new-instance v9, Ljava/lang/Exception;

    invoke-direct {v9, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v8, v9}, Lcom/splunk/mint/MintCallback;->lastBreath(Ljava/lang/Exception;)V

    .line 75
    :cond_2
    const-wide/16 v8, 0xbb8

    :try_start_0
    invoke-static {v8, v9}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    :goto_1
    iget-object v8, p0, Lcom/splunk/mint/ExceptionHandler;->defaultExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v8, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 83
    return-void

    .line 76
    :catch_0
    move-exception v1

    .line 78
    .local v1, "e1":Ljava/lang/InterruptedException;
    invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_1
.end method
