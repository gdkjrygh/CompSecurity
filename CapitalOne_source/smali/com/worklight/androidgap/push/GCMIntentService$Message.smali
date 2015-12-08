.class public Lcom/worklight/androidgap/push/GCMIntentService$Message;
.super Ljava/lang/Object;
.source "GCMIntentService.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/worklight/androidgap/push/GCMIntentService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Message"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/worklight/androidgap/push/GCMIntentService$Message;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private alert:Ljava/lang/String;

.field private badge:I

.field private payload:Ljava/lang/String;

.field private sound:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 238
    new-instance v0, Lcom/worklight/androidgap/push/GCMIntentService$Message$1;

    invoke-direct {v0}, Lcom/worklight/androidgap/push/GCMIntentService$Message$1;-><init>()V

    sput-object v0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 185
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 192
    iput-object v1, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->alert:Ljava/lang/String;

    .line 193
    const/4 v0, 0x1

    iput v0, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->badge:I

    .line 194
    iput-object v1, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->sound:Ljava/lang/String;

    .line 195
    iput-object v1, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->payload:Ljava/lang/String;

    .line 196
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1
    .param p1, "source"    # Landroid/os/Parcel;

    .prologue
    .line 250
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 251
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->alert:Ljava/lang/String;

    .line 252
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->badge:I

    .line 253
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->sound:Ljava/lang/String;

    .line 254
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->payload:Ljava/lang/String;

    .line 255
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/worklight/androidgap/push/GCMIntentService$Message;)V
    .locals 0

    .prologue
    .line 250
    invoke-direct {p0, p1}, Lcom/worklight/androidgap/push/GCMIntentService$Message;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method static synthetic access$1(Lcom/worklight/androidgap/push/GCMIntentService$Message;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 186
    iput-object p1, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->alert:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$2(Lcom/worklight/androidgap/push/GCMIntentService$Message;I)V
    .locals 0

    .prologue
    .line 189
    iput p1, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->badge:I

    return-void
.end method

.method static synthetic access$3(Lcom/worklight/androidgap/push/GCMIntentService$Message;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 187
    iput-object p1, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->sound:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$4(Lcom/worklight/androidgap/push/GCMIntentService$Message;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 188
    iput-object p1, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->payload:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$5(Lcom/worklight/androidgap/push/GCMIntentService$Message;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->alert:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$6(Lcom/worklight/androidgap/push/GCMIntentService$Message;)I
    .locals 1

    .prologue
    .line 189
    iget v0, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->badge:I

    return v0
.end method

.method static synthetic access$7(Lcom/worklight/androidgap/push/GCMIntentService$Message;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->sound:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 227
    const/4 v0, 0x0

    return v0
.end method

.method public getPayload()Lorg/json/JSONObject;
    .locals 3

    .prologue
    .line 211
    const/4 v1, 0x0

    .line 213
    .local v1, "jsonObject":Lorg/json/JSONObject;
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .end local v1    # "jsonObject":Lorg/json/JSONObject;
    iget-object v2, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->payload:Ljava/lang/String;

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 217
    .restart local v1    # "jsonObject":Lorg/json/JSONObject;
    :goto_0
    return-object v1

    .line 214
    .end local v1    # "jsonObject":Lorg/json/JSONObject;
    :catch_0
    move-exception v0

    .line 215
    .local v0, "e":Lorg/json/JSONException;
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .restart local v1    # "jsonObject":Lorg/json/JSONObject;
    goto :goto_0
.end method

.method public getProps()Lorg/json/JSONObject;
    .locals 4

    .prologue
    .line 199
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 201
    .local v1, "jsonObject":Lorg/json/JSONObject;
    :try_start_0
    const-string v3, "alert"

    iget-object v2, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->alert:Ljava/lang/String;

    if-nez v2, :cond_0

    sget-object v2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    :goto_0
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 202
    const-string v2, "badge"

    iget v3, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->badge:I

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 203
    const-string v3, "sound"

    iget-object v2, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->sound:Ljava/lang/String;

    if-nez v2, :cond_1

    sget-object v2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    :goto_1
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 207
    return-object v1

    .line 201
    :cond_0
    iget-object v2, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->alert:Ljava/lang/String;

    goto :goto_0

    .line 203
    :cond_1
    iget-object v2, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->sound:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 204
    :catch_0
    move-exception v0

    .line 205
    .local v0, "e":Lorg/json/JSONException;
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 222
    const-string v0, "Message(alert=%s, badge=%d, sound=%s, payload=%s)"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->alert:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget v3, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->badge:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->sound:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->payload:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 232
    iget-object v0, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->alert:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 233
    iget v0, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->badge:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 234
    iget-object v0, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->sound:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 235
    iget-object v0, p0, Lcom/worklight/androidgap/push/GCMIntentService$Message;->payload:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 236
    return-void
.end method
