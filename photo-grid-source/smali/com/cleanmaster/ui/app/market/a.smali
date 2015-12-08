.class public Lcom/cleanmaster/ui/app/market/a;
.super Lcom/cleanmaster/ui/app/market/Ad;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/Ad;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/a;
    .locals 2

    .prologue
    .line 30
    invoke-super {p0, p1}, Lcom/cleanmaster/ui/app/market/Ad;->fromJSONObject(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/Ad;

    .line 31
    const-string v0, "trigger_pkgs"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/a;->a(Ljava/lang/String;)V

    .line 32
    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/a;->a:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public synthetic fromJSONObject(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/Ad;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0, p1}, Lcom/cleanmaster/ui/app/market/a;->a(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic fromJSONObject(Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0, p1}, Lcom/cleanmaster/ui/app/market/a;->a(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/a;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Lcom/cleanmaster/ui/app/market/Ad;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  trigger_pkgs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
