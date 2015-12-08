.class public Lcom/google/android/gms/internal/dk;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/dk$1;,
        Lcom/google/android/gms/internal/dk$a;
    }
.end annotation


# instance fields
.field private final rs:Z

.field private final rt:Z

.field private final ru:Z

.field private final rv:Z

.field private final rw:Z


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/dk$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/dk$a;->a(Lcom/google/android/gms/internal/dk$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rs:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/dk$a;->b(Lcom/google/android/gms/internal/dk$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rt:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/dk$a;->c(Lcom/google/android/gms/internal/dk$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dk;->ru:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/dk$a;->d(Lcom/google/android/gms/internal/dk$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rv:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/dk$a;->e(Lcom/google/android/gms/internal/dk$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dk;->rw:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/dk$a;Lcom/google/android/gms/internal/dk$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/dk;-><init>(Lcom/google/android/gms/internal/dk$a;)V

    return-void
.end method


# virtual methods
.method public toJson()Lorg/json/JSONObject;
    .locals 3

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "sms"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/dk;->rs:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "tel"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/dk;->rt:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "calendar"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/dk;->ru:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "storePicture"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/dk;->rv:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "inlineVideo"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/dk;->rw:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Error occured while obtaining the MRAID capabilities."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gr;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method
