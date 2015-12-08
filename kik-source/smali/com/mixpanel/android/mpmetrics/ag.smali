.class final Lcom/mixpanel/android/mpmetrics/ag;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/os/Parcel;)Lcom/mixpanel/android/mpmetrics/Survey;
    .locals 3

    .prologue
    .line 25
    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 27
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 28
    new-instance v0, Lcom/mixpanel/android/mpmetrics/Survey;

    invoke-direct {v0, v1}, Lcom/mixpanel/android/mpmetrics/Survey;-><init>(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/mixpanel/android/mpmetrics/e; {:try_start_0 .. :try_end_0} :catch_1

    return-object v0

    .line 29
    :catch_0
    move-exception v0

    .line 30
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Corrupted JSON object written to survey parcel."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 31
    :catch_1
    move-exception v0

    .line 32
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unexpected or incomplete object written to survey parcel."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 22
    invoke-static {p1}, Lcom/mixpanel/android/mpmetrics/ag;->a(Landroid/os/Parcel;)Lcom/mixpanel/android/mpmetrics/Survey;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 22
    new-array v0, p1, [Lcom/mixpanel/android/mpmetrics/Survey;

    return-object v0
.end method
