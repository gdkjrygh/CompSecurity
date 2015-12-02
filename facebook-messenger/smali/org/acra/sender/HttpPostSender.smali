.class public Lorg/acra/sender/HttpPostSender;
.super Ljava/lang/Object;
.source "HttpPostSender.java"

# interfaces
.implements Lorg/acra/sender/ReportSender;


# instance fields
.field private mFormUri:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/acra/sender/HttpPostSender;->mFormUri:Landroid/net/Uri;

    .line 86
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lorg/acra/sender/HttpPostSender;->mFormUri:Landroid/net/Uri;

    .line 87
    return-void
.end method

.method private remap(Ljava/util/Map;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lorg/acra/ReportField;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 105
    new-instance v1, Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 106
    sget-object v2, Lorg/acra/ACRA;->DEFAULT_REPORT_FIELDS:[Lorg/acra/ReportField;

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 107
    invoke-virtual {v4}, Lorg/acra/ReportField;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 109
    :cond_0
    return-object v1
.end method


# virtual methods
.method public send(Lorg/acra/CrashReportData;)V
    .locals 5

    .prologue
    .line 94
    :try_start_0
    invoke-direct {p0, p1}, Lorg/acra/sender/HttpPostSender;->remap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 95
    new-instance v1, Ljava/net/URL;

    iget-object v2, p0, Lorg/acra/sender/HttpPostSender;->mFormUri:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 96
    sget-object v2, Lorg/acra/ACRA;->LOG_TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Connect to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    invoke-static {}, Lorg/acra/ACRA;->getConfig()Lorg/acra/reporter/ReportsCrashes;

    move-result-object v2

    invoke-interface {v2}, Lorg/acra/reporter/ReportsCrashes;->formPostFormat()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lorg/acra/util/HttpUtils;->doPost(Ljava/util/Map;Ljava/net/URL;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    return-void

    .line 98
    :catch_0
    move-exception v0

    .line 99
    new-instance v1, Lorg/acra/sender/ReportSenderException;

    const-string v2, "Error while sending report to Http Post Form."

    invoke-direct {v1, v2, v0}, Lorg/acra/sender/ReportSenderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
