.class public Lcom/mixpanel/android/mpmetrics/Survey;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/mpmetrics/Survey$a;,
        Lcom/mixpanel/android/mpmetrics/Survey$b;
    }
.end annotation


# static fields
.field public static a:Landroid/os/Parcelable$Creator;


# instance fields
.field private final b:Lorg/json/JSONObject;

.field private final c:I

.field private final d:I

.field private final e:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    new-instance v0, Lcom/mixpanel/android/mpmetrics/ag;

    invoke-direct {v0}, Lcom/mixpanel/android/mpmetrics/ag;-><init>()V

    sput-object v0, Lcom/mixpanel/android/mpmetrics/Survey;->a:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    :try_start_0
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/Survey;->b:Lorg/json/JSONObject;

    .line 45
    const-string v1, "id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/mixpanel/android/mpmetrics/Survey;->c:I

    .line 46
    const-string v1, "collections"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 47
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    .line 48
    const-string v2, "id"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/mixpanel/android/mpmetrics/Survey;->d:I

    .line 50
    const-string v1, "questions"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 51
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-nez v2, :cond_0

    .line 52
    new-instance v0, Lcom/mixpanel/android/mpmetrics/e;

    const-string v1, "Survey has no questions."

    invoke-direct {v0, v1}, Lcom/mixpanel/android/mpmetrics/e;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    :catch_0
    move-exception v0

    .line 61
    new-instance v1, Lcom/mixpanel/android/mpmetrics/e;

    const-string v2, "Survey JSON was unexpected or bad"

    invoke-direct {v1, v2, v0}, Lcom/mixpanel/android/mpmetrics/e;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 54
    :cond_0
    :try_start_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v0, v3, :cond_1

    .line 56
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 57
    new-instance v4, Lcom/mixpanel/android/mpmetrics/Survey$a;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v3, v5}, Lcom/mixpanel/android/mpmetrics/Survey$a;-><init>(Lcom/mixpanel/android/mpmetrics/Survey;Lorg/json/JSONObject;B)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 59
    :cond_1
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/Survey;->e:Ljava/util/List;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 62
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 70
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/Survey;->c:I

    return v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 74
    iget v0, p0, Lcom/mixpanel/android/mpmetrics/Survey;->d:I

    return v0
.end method

.method public final c()Ljava/util/List;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/Survey;->e:Ljava/util/List;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 83
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/Survey;->b:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 89
    return-void
.end method
