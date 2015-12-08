.class final Lcom/cleanmaster/ui/app/market/g;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field final synthetic a:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 0

    .prologue
    .line 477
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/g;->a:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 480
    :try_start_0
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/g;->a:Lorg/json/JSONObject;

    const-string v1, "url"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/util/p;->a(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 483
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
